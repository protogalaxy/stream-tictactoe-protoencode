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
import protogalaxy.tictactoe.proto.MoveRange;

import java.util.ArrayList;
import java.util.List;

public abstract class JsonValidMove {
    public static List<JsonValidMove> fromProto(List<MoveRange> moves) {
        List<JsonValidMove> validMoves = new ArrayList<JsonValidMove>();
        for(MoveRange m : moves) {
            if(m.getToX() == 0 && m.getToY() == 0) {
                validMoves.add(new JsonSingleMove(m.getFromX(), m.getFromY()));
            } else {
                validMoves.add(new JsonMoveRange(m.getFromX(), m.getFromY(), m.getToX(), m.getToY()));
            }
        }
        return validMoves;
    }

    public static class JsonSingleMove extends JsonValidMove {
        public int x;
        public int y;

        public JsonSingleMove(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static class JsonMoveRange extends JsonValidMove {
        @JsonProperty("from_x") public int fromX;
        @JsonProperty("from_y") public int fromY;

        @JsonProperty("to_x") public int toX;
        @JsonProperty("to_y") public int toY;

        public JsonMoveRange(int fromX, int fromY, int toX, int toY) {
            this.fromX = fromX;
            this.fromY = fromY;
            this.toX = toX;
            this.toY = toY;
        }
    }
}
