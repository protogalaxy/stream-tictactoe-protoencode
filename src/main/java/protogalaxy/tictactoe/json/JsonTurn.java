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

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.List;

public class JsonTurn {
    public static class Square {
        public int x;
        public int y;

        public Square(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    @JsonProperty("played_by")
    public int playedBy;

    public Square move;

    @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
    public boolean active;

    @JsonProperty("move_id")
    public long moveId;

    @JsonProperty("valid_moves")
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
    public List<JsonValidMove> validMoves;

    @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
    public String error;

    @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
    public JsonWinner winner;
}
