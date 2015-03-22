// Copyright (C) 2015 The Protogalaxy Project
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.

package protogalaxy.tictactoe.tasks;

import org.apache.samza.system.IncomingMessageEnvelope;
import org.apache.samza.system.OutgoingMessageEnvelope;
import org.apache.samza.system.SystemStream;
import org.apache.samza.task.MessageCollector;
import org.apache.samza.task.StreamTask;
import org.apache.samza.task.TaskCoordinator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import protogalaxy.tictactoe.json.JsonGame;
import protogalaxy.tictactoe.json.JsonTurn;
import protogalaxy.tictactoe.json.JsonWinner;
import protogalaxy.tictactoe.json.JsonValidMove;
import protogalaxy.tictactoe.proto.Event;
import protogalaxy.tictactoe.proto.TurnReply;
import protogalaxy.tictactoe.proto.Winner;

import java.util.List;

public class ProtocolEncoder implements StreamTask {
    final Logger logger = LoggerFactory.getLogger(ProtocolEncoder.class);

    private static final SystemStream OUTPUT_STREAM = new SystemStream("kafka", "tictactoe-game-encoded");

    @Override
    public void process(IncomingMessageEnvelope envelope, MessageCollector collector, TaskCoordinator coordinator) throws Exception {
        Event event = Event.parseFrom((byte[]) envelope.getMessage());
        switch (event.getType()) {
            case TURN_PLAYED:
                processTurnPlayed(collector, event);
                break;
            case GAME_CREATED:
                processGameCreated(collector, event);
                break;
            default:
                logger.error("Unknown event");
                break;
        }
    }

    private void processGameCreated(MessageCollector collector, Event event) {
        logger.debug("Processing game created event");
        JsonGame game = new JsonGame();
        game.numPlayers = event.getUserListCount();

        for (String userId : event.getUserListList()) {
            if (userId.equals(event.getNextPlayer())) {
                game.active = true;
                game.validMoves = JsonValidMove.fromProto(event.getValidMovesList());
            }
            game.player = playerNumber(userId, event.getUserListList());

            collector.send(new OutgoingMessageEnvelope(OUTPUT_STREAM, userId, game));
            game.active = false;
            game.validMoves = null;
        }
    }

    private void processTurnPlayed(MessageCollector collector, Event event) {
        logger.debug("Processing turn played event received");
        JsonTurn turn = new JsonTurn();
        turn.playedBy = playerNumber(event.getUserId(), event.getUserListList());
        turn.move = new JsonTurn.Square(event.getMove().getX(), event.getMove().getY());
        turn.moveId = event.getMoveId();

        if (event.hasWinner()) {
            final Winner winner = event.getWinner();
            if (winner.getDraw()) {
                turn.winner = JsonWinner.draw();
            } else {
                int player = playerNumber(winner.getUserId(), event.getUserListList());
                turn.winner = JsonWinner.player(player, JsonWinner.JsonLocation.fromProto(winner.getLocationsList()));
            }
        }

        switch (event.getTurnStatus()) {
            case SUCCESS:
            case FINISHED:
                processTurnPlayedSuccess(collector, event, turn);
                break;
            default:
                processTurnPlayedError(collector, event, turn);
                break;
        }
    }

    private void processTurnPlayedError(MessageCollector collector, Event event, JsonTurn turn) {
        if (event.getTurnStatus() == TurnReply.ResponseStatus.INVALID_MOVE && !event.hasWinner()) {
            turn.validMoves = JsonValidMove.fromProto(event.getValidMovesList());
        }
        turn.error = event.getTurnStatus().toString().toLowerCase();
        collector.send(new OutgoingMessageEnvelope(OUTPUT_STREAM, event.getUserId(), turn));
    }

    private void processTurnPlayedSuccess(MessageCollector collector, Event event, JsonTurn turn) {
        for (String userId : event.getUserListList()) {
            if (userId.equals(event.getNextPlayer())) {
                turn.active = true;
                turn.validMoves = JsonValidMove.fromProto(event.getValidMovesList());
            }
            collector.send(new OutgoingMessageEnvelope(OUTPUT_STREAM, userId, turn));
            turn.active = false;
            turn.validMoves = null;
        }
    }

    static private int playerNumber(String playerId, List<String> players) {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).equals(playerId)) {
                return i;
            }
        }
        throw new IllegalStateException("Player not found in user list");
    }
}
