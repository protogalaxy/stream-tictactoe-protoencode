// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tictactoe.proto

package protogalaxy.tictactoe.proto;

/**
 * Protobuf type {@code tictactoe.JsonMoveRange}
 */
public  final class MoveRange extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:tictactoe.JsonMoveRange)
    MoveRangeOrBuilder {
  // Use JsonMoveRange.newBuilder() to construct.
  private MoveRange(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private MoveRange() {
    fromX_ = 0;
    fromY_ = 0;
    toX_ = 0;
    toY_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MoveRange(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            fromX_ = input.readInt32();
            break;
          }
          case 16: {

            fromY_ = input.readInt32();
            break;
          }
          case 24: {

            toX_ = input.readInt32();
            break;
          }
          case 32: {

            toY_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protogalaxy.tictactoe.proto.Tictactoe.internal_static_tictactoe_MoveRange_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protogalaxy.tictactoe.proto.Tictactoe.internal_static_tictactoe_MoveRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protogalaxy.tictactoe.proto.MoveRange.class, protogalaxy.tictactoe.proto.MoveRange.Builder.class);
  }

  public static final com.google.protobuf.Parser<MoveRange> PARSER =
      new com.google.protobuf.AbstractParser<MoveRange>() {
    public MoveRange parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MoveRange(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<MoveRange> getParserForType() {
    return PARSER;
  }

  public static final int FROM_X_FIELD_NUMBER = 1;
  private int fromX_;
  /**
   * <code>optional int32 from_x = 1;</code>
   */
  public int getFromX() {
    return fromX_;
  }

  public static final int FROM_Y_FIELD_NUMBER = 2;
  private int fromY_;
  /**
   * <code>optional int32 from_y = 2;</code>
   */
  public int getFromY() {
    return fromY_;
  }

  public static final int TO_X_FIELD_NUMBER = 3;
  private int toX_;
  /**
   * <code>optional int32 to_x = 3;</code>
   */
  public int getToX() {
    return toX_;
  }

  public static final int TO_Y_FIELD_NUMBER = 4;
  private int toY_;
  /**
   * <code>optional int32 to_y = 4;</code>
   */
  public int getToY() {
    return toY_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (fromX_ != 0) {
      output.writeInt32(1, fromX_);
    }
    if (fromY_ != 0) {
      output.writeInt32(2, fromY_);
    }
    if (toX_ != 0) {
      output.writeInt32(3, toX_);
    }
    if (toY_ != 0) {
      output.writeInt32(4, toY_);
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (fromX_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, fromX_);
    }
    if (fromY_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, fromY_);
    }
    if (toX_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, toX_);
    }
    if (toY_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, toY_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static protogalaxy.tictactoe.proto.MoveRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protogalaxy.tictactoe.proto.MoveRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protogalaxy.tictactoe.proto.MoveRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protogalaxy.tictactoe.proto.MoveRange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protogalaxy.tictactoe.proto.MoveRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static protogalaxy.tictactoe.proto.MoveRange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static protogalaxy.tictactoe.proto.MoveRange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static protogalaxy.tictactoe.proto.MoveRange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static protogalaxy.tictactoe.proto.MoveRange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static protogalaxy.tictactoe.proto.MoveRange parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(protogalaxy.tictactoe.proto.MoveRange prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tictactoe.JsonMoveRange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tictactoe.JsonMoveRange)
      protogalaxy.tictactoe.proto.MoveRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protogalaxy.tictactoe.proto.Tictactoe.internal_static_tictactoe_MoveRange_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protogalaxy.tictactoe.proto.Tictactoe.internal_static_tictactoe_MoveRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protogalaxy.tictactoe.proto.MoveRange.class, protogalaxy.tictactoe.proto.MoveRange.Builder.class);
    }

    // Construct using protogalaxy.tictactoe.proto.JsonMoveRange.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      fromX_ = 0;

      fromY_ = 0;

      toX_ = 0;

      toY_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protogalaxy.tictactoe.proto.Tictactoe.internal_static_tictactoe_MoveRange_descriptor;
    }

    public protogalaxy.tictactoe.proto.MoveRange getDefaultInstanceForType() {
      return protogalaxy.tictactoe.proto.MoveRange.getDefaultInstance();
    }

    public protogalaxy.tictactoe.proto.MoveRange build() {
      protogalaxy.tictactoe.proto.MoveRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protogalaxy.tictactoe.proto.MoveRange buildPartial() {
      protogalaxy.tictactoe.proto.MoveRange result = new protogalaxy.tictactoe.proto.MoveRange(this);
      result.fromX_ = fromX_;
      result.fromY_ = fromY_;
      result.toX_ = toX_;
      result.toY_ = toY_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof protogalaxy.tictactoe.proto.MoveRange) {
        return mergeFrom((protogalaxy.tictactoe.proto.MoveRange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protogalaxy.tictactoe.proto.MoveRange other) {
      if (other == protogalaxy.tictactoe.proto.MoveRange.getDefaultInstance()) return this;
      if (other.getFromX() != 0) {
        setFromX(other.getFromX());
      }
      if (other.getFromY() != 0) {
        setFromY(other.getFromY());
      }
      if (other.getToX() != 0) {
        setToX(other.getToX());
      }
      if (other.getToY() != 0) {
        setToY(other.getToY());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      protogalaxy.tictactoe.proto.MoveRange parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protogalaxy.tictactoe.proto.MoveRange) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int fromX_ ;
    /**
     * <code>optional int32 from_x = 1;</code>
     */
    public int getFromX() {
      return fromX_;
    }
    /**
     * <code>optional int32 from_x = 1;</code>
     */
    public Builder setFromX(int value) {

      fromX_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 from_x = 1;</code>
     */
    public Builder clearFromX() {

      fromX_ = 0;
      onChanged();
      return this;
    }

    private int fromY_ ;
    /**
     * <code>optional int32 from_y = 2;</code>
     */
    public int getFromY() {
      return fromY_;
    }
    /**
     * <code>optional int32 from_y = 2;</code>
     */
    public Builder setFromY(int value) {

      fromY_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 from_y = 2;</code>
     */
    public Builder clearFromY() {

      fromY_ = 0;
      onChanged();
      return this;
    }

    private int toX_ ;
    /**
     * <code>optional int32 to_x = 3;</code>
     */
    public int getToX() {
      return toX_;
    }
    /**
     * <code>optional int32 to_x = 3;</code>
     */
    public Builder setToX(int value) {

      toX_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 to_x = 3;</code>
     */
    public Builder clearToX() {

      toX_ = 0;
      onChanged();
      return this;
    }

    private int toY_ ;
    /**
     * <code>optional int32 to_y = 4;</code>
     */
    public int getToY() {
      return toY_;
    }
    /**
     * <code>optional int32 to_y = 4;</code>
     */
    public Builder setToY(int value) {

      toY_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 to_y = 4;</code>
     */
    public Builder clearToY() {

      toY_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:tictactoe.JsonMoveRange)
  }

  // @@protoc_insertion_point(class_scope:tictactoe.JsonMoveRange)
  private static final protogalaxy.tictactoe.proto.MoveRange defaultInstance;static {
    defaultInstance = new protogalaxy.tictactoe.proto.MoveRange();
  }

  public static protogalaxy.tictactoe.proto.MoveRange getDefaultInstance() {
    return defaultInstance;
  }

  public protogalaxy.tictactoe.proto.MoveRange getDefaultInstanceForType() {
    return defaultInstance;
  }

}

