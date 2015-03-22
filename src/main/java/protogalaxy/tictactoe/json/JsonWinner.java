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

package protogalaxy.tictactoe.json;

import protogalaxy.tictactoe.proto.Winner;

import java.util.ArrayList;
import java.util.List;

public abstract class JsonWinner {
    public static class Draw extends JsonWinner {
        public boolean draw;
    }

    public static JsonWinner draw() {
        Draw winner = new Draw();
        winner.draw = true;
        return winner;
    }

    public static class Player extends JsonWinner {
        public int player;
        public List<JsonLocation> locations;
    }

    public static JsonWinner player(int player, List<JsonLocation> locations) {
        Player winner = new Player();
        winner.player = player;
        winner.locations = locations;
        return winner;
    }

    public static class JsonLocation {
        public String direction;
        public int position;

        public JsonLocation(String direction, int position) {
            this.direction = direction;
            this.position = position;
        }

        public static List<JsonLocation> fromProto(List<Winner.Location> locations) {
            List<JsonLocation> result = new ArrayList<JsonLocation>();
            for (Winner.Location l : locations) {
                result.add(new JsonLocation(l.getDirection().toString().toLowerCase(), l.getPosition()));
            }
            return result;
        }
    }
}
