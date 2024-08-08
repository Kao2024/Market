// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service1.proto

package generated.ds.service1;

/**
 * Protobuf type {@code service1.LightResponse}
 */
public  final class LightResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:service1.LightResponse)
    LightResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LightResponse.newBuilder() to construct.
  private LightResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LightResponse() {
    lightStatuses_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LightResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              lightStatuses_ = new java.util.ArrayList<generated.ds.service1.LightStatus>();
              mutable_bitField0_ |= 0x00000001;
            }
            lightStatuses_.add(
                input.readMessage(generated.ds.service1.LightStatus.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        lightStatuses_ = java.util.Collections.unmodifiableList(lightStatuses_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return generated.ds.service1.Service1Impl.internal_static_service1_LightResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.ds.service1.Service1Impl.internal_static_service1_LightResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.ds.service1.LightResponse.class, generated.ds.service1.LightResponse.Builder.class);
  }

  public static final int LIGHTSTATUSES_FIELD_NUMBER = 1;
  private java.util.List<generated.ds.service1.LightStatus> lightStatuses_;
  /**
   * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
   */
  public java.util.List<generated.ds.service1.LightStatus> getLightStatusesList() {
    return lightStatuses_;
  }
  /**
   * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
   */
  public java.util.List<? extends generated.ds.service1.LightStatusOrBuilder> 
      getLightStatusesOrBuilderList() {
    return lightStatuses_;
  }
  /**
   * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
   */
  public int getLightStatusesCount() {
    return lightStatuses_.size();
  }
  /**
   * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
   */
  public generated.ds.service1.LightStatus getLightStatuses(int index) {
    return lightStatuses_.get(index);
  }
  /**
   * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
   */
  public generated.ds.service1.LightStatusOrBuilder getLightStatusesOrBuilder(
      int index) {
    return lightStatuses_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < lightStatuses_.size(); i++) {
      output.writeMessage(1, lightStatuses_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < lightStatuses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, lightStatuses_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof generated.ds.service1.LightResponse)) {
      return super.equals(obj);
    }
    generated.ds.service1.LightResponse other = (generated.ds.service1.LightResponse) obj;

    boolean result = true;
    result = result && getLightStatusesList()
        .equals(other.getLightStatusesList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getLightStatusesCount() > 0) {
      hash = (37 * hash) + LIGHTSTATUSES_FIELD_NUMBER;
      hash = (53 * hash) + getLightStatusesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.ds.service1.LightResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.ds.service1.LightResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.ds.service1.LightResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.ds.service1.LightResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.ds.service1.LightResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.ds.service1.LightResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.ds.service1.LightResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.ds.service1.LightResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.ds.service1.LightResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.ds.service1.LightResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.ds.service1.LightResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.ds.service1.LightResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(generated.ds.service1.LightResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code service1.LightResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:service1.LightResponse)
      generated.ds.service1.LightResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.ds.service1.Service1Impl.internal_static_service1_LightResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.ds.service1.Service1Impl.internal_static_service1_LightResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.ds.service1.LightResponse.class, generated.ds.service1.LightResponse.Builder.class);
    }

    // Construct using generated.ds.service1.LightResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getLightStatusesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (lightStatusesBuilder_ == null) {
        lightStatuses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        lightStatusesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.ds.service1.Service1Impl.internal_static_service1_LightResponse_descriptor;
    }

    @java.lang.Override
    public generated.ds.service1.LightResponse getDefaultInstanceForType() {
      return generated.ds.service1.LightResponse.getDefaultInstance();
    }

    @java.lang.Override
    public generated.ds.service1.LightResponse build() {
      generated.ds.service1.LightResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.ds.service1.LightResponse buildPartial() {
      generated.ds.service1.LightResponse result = new generated.ds.service1.LightResponse(this);
      int from_bitField0_ = bitField0_;
      if (lightStatusesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          lightStatuses_ = java.util.Collections.unmodifiableList(lightStatuses_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lightStatuses_ = lightStatuses_;
      } else {
        result.lightStatuses_ = lightStatusesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof generated.ds.service1.LightResponse) {
        return mergeFrom((generated.ds.service1.LightResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.ds.service1.LightResponse other) {
      if (other == generated.ds.service1.LightResponse.getDefaultInstance()) return this;
      if (lightStatusesBuilder_ == null) {
        if (!other.lightStatuses_.isEmpty()) {
          if (lightStatuses_.isEmpty()) {
            lightStatuses_ = other.lightStatuses_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLightStatusesIsMutable();
            lightStatuses_.addAll(other.lightStatuses_);
          }
          onChanged();
        }
      } else {
        if (!other.lightStatuses_.isEmpty()) {
          if (lightStatusesBuilder_.isEmpty()) {
            lightStatusesBuilder_.dispose();
            lightStatusesBuilder_ = null;
            lightStatuses_ = other.lightStatuses_;
            bitField0_ = (bitField0_ & ~0x00000001);
            lightStatusesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLightStatusesFieldBuilder() : null;
          } else {
            lightStatusesBuilder_.addAllMessages(other.lightStatuses_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      generated.ds.service1.LightResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.ds.service1.LightResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<generated.ds.service1.LightStatus> lightStatuses_ =
      java.util.Collections.emptyList();
    private void ensureLightStatusesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        lightStatuses_ = new java.util.ArrayList<generated.ds.service1.LightStatus>(lightStatuses_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        generated.ds.service1.LightStatus, generated.ds.service1.LightStatus.Builder, generated.ds.service1.LightStatusOrBuilder> lightStatusesBuilder_;

    /**
     * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
     */
    public java.util.List<generated.ds.service1.LightStatus> getLightStatusesList() {
      if (lightStatusesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(lightStatuses_);
      } else {
        return lightStatusesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
     */
    public int getLightStatusesCount() {
      if (lightStatusesBuilder_ == null) {
        return lightStatuses_.size();
      } else {
        return lightStatusesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
     */
    public generated.ds.service1.LightStatus getLightStatuses(int index) {
      if (lightStatusesBuilder_ == null) {
        return lightStatuses_.get(index);
      } else {
        return lightStatusesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
     */
    public Builder setLightStatuses(
        int index, generated.ds.service1.LightStatus value) {
      if (lightStatusesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLightStatusesIsMutable();
        lightStatuses_.set(index, value);
        onChanged();
      } else {
        lightStatusesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
     */
    public Builder setLightStatuses(
        int index, generated.ds.service1.LightStatus.Builder builderForValue) {
      if (lightStatusesBuilder_ == null) {
        ensureLightStatusesIsMutable();
        lightStatuses_.set(index, builderForValue.build());
        onChanged();
      } else {
        lightStatusesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
     */
    public Builder addLightStatuses(generated.ds.service1.LightStatus value) {
      if (lightStatusesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLightStatusesIsMutable();
        lightStatuses_.add(value);
        onChanged();
      } else {
        lightStatusesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
     */
    public Builder addLightStatuses(
        int index, generated.ds.service1.LightStatus value) {
      if (lightStatusesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLightStatusesIsMutable();
        lightStatuses_.add(index, value);
        onChanged();
      } else {
        lightStatusesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
     */
    public Builder addLightStatuses(
        generated.ds.service1.LightStatus.Builder builderForValue) {
      if (lightStatusesBuilder_ == null) {
        ensureLightStatusesIsMutable();
        lightStatuses_.add(builderForValue.build());
        onChanged();
      } else {
        lightStatusesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
     */
    public Builder addLightStatuses(
        int index, generated.ds.service1.LightStatus.Builder builderForValue) {
      if (lightStatusesBuilder_ == null) {
        ensureLightStatusesIsMutable();
        lightStatuses_.add(index, builderForValue.build());
        onChanged();
      } else {
        lightStatusesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
     */
    public Builder addAllLightStatuses(
        java.lang.Iterable<? extends generated.ds.service1.LightStatus> values) {
      if (lightStatusesBuilder_ == null) {
        ensureLightStatusesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lightStatuses_);
        onChanged();
      } else {
        lightStatusesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
     */
    public Builder clearLightStatuses() {
      if (lightStatusesBuilder_ == null) {
        lightStatuses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        lightStatusesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
     */
    public Builder removeLightStatuses(int index) {
      if (lightStatusesBuilder_ == null) {
        ensureLightStatusesIsMutable();
        lightStatuses_.remove(index);
        onChanged();
      } else {
        lightStatusesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
     */
    public generated.ds.service1.LightStatus.Builder getLightStatusesBuilder(
        int index) {
      return getLightStatusesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
     */
    public generated.ds.service1.LightStatusOrBuilder getLightStatusesOrBuilder(
        int index) {
      if (lightStatusesBuilder_ == null) {
        return lightStatuses_.get(index);  } else {
        return lightStatusesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
     */
    public java.util.List<? extends generated.ds.service1.LightStatusOrBuilder> 
         getLightStatusesOrBuilderList() {
      if (lightStatusesBuilder_ != null) {
        return lightStatusesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(lightStatuses_);
      }
    }
    /**
     * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
     */
    public generated.ds.service1.LightStatus.Builder addLightStatusesBuilder() {
      return getLightStatusesFieldBuilder().addBuilder(
          generated.ds.service1.LightStatus.getDefaultInstance());
    }
    /**
     * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
     */
    public generated.ds.service1.LightStatus.Builder addLightStatusesBuilder(
        int index) {
      return getLightStatusesFieldBuilder().addBuilder(
          index, generated.ds.service1.LightStatus.getDefaultInstance());
    }
    /**
     * <code>repeated .service1.LightStatus lightStatuses = 1;</code>
     */
    public java.util.List<generated.ds.service1.LightStatus.Builder> 
         getLightStatusesBuilderList() {
      return getLightStatusesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        generated.ds.service1.LightStatus, generated.ds.service1.LightStatus.Builder, generated.ds.service1.LightStatusOrBuilder> 
        getLightStatusesFieldBuilder() {
      if (lightStatusesBuilder_ == null) {
        lightStatusesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            generated.ds.service1.LightStatus, generated.ds.service1.LightStatus.Builder, generated.ds.service1.LightStatusOrBuilder>(
                lightStatuses_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        lightStatuses_ = null;
      }
      return lightStatusesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:service1.LightResponse)
  }

  // @@protoc_insertion_point(class_scope:service1.LightResponse)
  private static final generated.ds.service1.LightResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.ds.service1.LightResponse();
  }

  public static generated.ds.service1.LightResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LightResponse>
      PARSER = new com.google.protobuf.AbstractParser<LightResponse>() {
    @java.lang.Override
    public LightResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LightResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LightResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LightResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.ds.service1.LightResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

