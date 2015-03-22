// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tictactoe.proto

package protogalaxy.tictactoe.proto;

public interface EventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tictactoe.Event)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .tictactoe.Event.Type type = 1;</code>
   */
  int getTypeValue();
  /**
   * <code>optional .tictactoe.Event.Type type = 1;</code>
   */
  protogalaxy.tictactoe.proto.Event.Type getType();

  /**
   * <code>optional int64 timestamp = 2;</code>
   */
  long getTimestamp();

  /**
   * <code>optional string game_id = 3;</code>
   */
  java.lang.String getGameId();
  /**
   * <code>optional string game_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getGameIdBytes();

  /**
   * <code>optional string user_id = 4;</code>
   */
  java.lang.String getUserId();
  /**
   * <code>optional string user_id = 4;</code>
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>repeated string user_list = 5;</code>
   */
  com.google.protobuf.ProtocolStringList
      getUserListList();
  /**
   * <code>repeated string user_list = 5;</code>
   */
  int getUserListCount();
  /**
   * <code>repeated string user_list = 5;</code>
   */
  java.lang.String getUserList(int index);
  /**
   * <code>repeated string user_list = 5;</code>
   */
  com.google.protobuf.ByteString
      getUserListBytes(int index);

  /**
   * <code>optional .tictactoe.TurnRequest.Square move = 6;</code>
   */
  boolean hasMove();
  /**
   * <code>optional .tictactoe.TurnRequest.Square move = 6;</code>
   */
  protogalaxy.tictactoe.proto.TurnRequest.Square getMove();
  /**
   * <code>optional .tictactoe.TurnRequest.Square move = 6;</code>
   */
  protogalaxy.tictactoe.proto.TurnRequest.SquareOrBuilder getMoveOrBuilder();

  /**
   * <code>optional .tictactoe.TurnReply.ResponseStatus turn_status = 7;</code>
   */
  int getTurnStatusValue();
  /**
   * <code>optional .tictactoe.TurnReply.ResponseStatus turn_status = 7;</code>
   */
  protogalaxy.tictactoe.proto.TurnReply.ResponseStatus getTurnStatus();

  /**
   * <code>optional .tictactoe.JsonWinner winner = 8;</code>
   */
  boolean hasWinner();
  /**
   * <code>optional .tictactoe.JsonWinner winner = 8;</code>
   */
  protogalaxy.tictactoe.proto.Winner getWinner();
  /**
   * <code>optional .tictactoe.JsonWinner winner = 8;</code>
   */
  protogalaxy.tictactoe.proto.WinnerOrBuilder getWinnerOrBuilder();

  /**
   * <code>optional int64 move_id = 9;</code>
   */
  long getMoveId();

  /**
   * <code>optional string next_player = 10;</code>
   */
  java.lang.String getNextPlayer();
  /**
   * <code>optional string next_player = 10;</code>
   */
  com.google.protobuf.ByteString
      getNextPlayerBytes();

  /**
   * <code>repeated .tictactoe.JsonMoveRange valid_moves = 11;</code>
   */
  java.util.List<protogalaxy.tictactoe.proto.MoveRange>
      getValidMovesList();
  /**
   * <code>repeated .tictactoe.JsonMoveRange valid_moves = 11;</code>
   */
  protogalaxy.tictactoe.proto.MoveRange getValidMoves(int index);
  /**
   * <code>repeated .tictactoe.JsonMoveRange valid_moves = 11;</code>
   */
  int getValidMovesCount();
  /**
   * <code>repeated .tictactoe.JsonMoveRange valid_moves = 11;</code>
   */
  java.util.List<? extends protogalaxy.tictactoe.proto.MoveRangeOrBuilder>
      getValidMovesOrBuilderList();
  /**
   * <code>repeated .tictactoe.JsonMoveRange valid_moves = 11;</code>
   */
  protogalaxy.tictactoe.proto.MoveRangeOrBuilder getValidMovesOrBuilder(
      int index);
}