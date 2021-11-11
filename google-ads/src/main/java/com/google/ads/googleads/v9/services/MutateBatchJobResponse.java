// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/batch_job_service.proto

package com.google.ads.googleads.v9.services;

/**
 * <pre>
 * Response message for [BatchJobService.MutateBatchJob][google.ads.googleads.v9.services.BatchJobService.MutateBatchJob].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v9.services.MutateBatchJobResponse}
 */
public final class MutateBatchJobResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v9.services.MutateBatchJobResponse)
    MutateBatchJobResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateBatchJobResponse.newBuilder() to construct.
  private MutateBatchJobResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateBatchJobResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateBatchJobResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateBatchJobResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            com.google.ads.googleads.v9.services.MutateBatchJobResult.Builder subBuilder = null;
            if (result_ != null) {
              subBuilder = result_.toBuilder();
            }
            result_ = input.readMessage(com.google.ads.googleads.v9.services.MutateBatchJobResult.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(result_);
              result_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v9.services.BatchJobServiceProto.internal_static_google_ads_googleads_v9_services_MutateBatchJobResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v9.services.BatchJobServiceProto.internal_static_google_ads_googleads_v9_services_MutateBatchJobResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v9.services.MutateBatchJobResponse.class, com.google.ads.googleads.v9.services.MutateBatchJobResponse.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private com.google.ads.googleads.v9.services.MutateBatchJobResult result_;
  /**
   * <pre>
   * The result for the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.services.MutateBatchJobResult result = 1;</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return result_ != null;
  }
  /**
   * <pre>
   * The result for the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.services.MutateBatchJobResult result = 1;</code>
   * @return The result.
   */
  @java.lang.Override
  public com.google.ads.googleads.v9.services.MutateBatchJobResult getResult() {
    return result_ == null ? com.google.ads.googleads.v9.services.MutateBatchJobResult.getDefaultInstance() : result_;
  }
  /**
   * <pre>
   * The result for the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.services.MutateBatchJobResult result = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v9.services.MutateBatchJobResultOrBuilder getResultOrBuilder() {
    return getResult();
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
    if (result_ != null) {
      output.writeMessage(1, getResult());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResult());
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
    if (!(obj instanceof com.google.ads.googleads.v9.services.MutateBatchJobResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v9.services.MutateBatchJobResponse other = (com.google.ads.googleads.v9.services.MutateBatchJobResponse) obj;

    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v9.services.MutateBatchJobResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.services.MutateBatchJobResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.services.MutateBatchJobResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.services.MutateBatchJobResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.services.MutateBatchJobResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.services.MutateBatchJobResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.services.MutateBatchJobResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.services.MutateBatchJobResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.services.MutateBatchJobResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.services.MutateBatchJobResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.services.MutateBatchJobResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.services.MutateBatchJobResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v9.services.MutateBatchJobResponse prototype) {
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
   * <pre>
   * Response message for [BatchJobService.MutateBatchJob][google.ads.googleads.v9.services.BatchJobService.MutateBatchJob].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v9.services.MutateBatchJobResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v9.services.MutateBatchJobResponse)
      com.google.ads.googleads.v9.services.MutateBatchJobResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v9.services.BatchJobServiceProto.internal_static_google_ads_googleads_v9_services_MutateBatchJobResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v9.services.BatchJobServiceProto.internal_static_google_ads_googleads_v9_services_MutateBatchJobResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v9.services.MutateBatchJobResponse.class, com.google.ads.googleads.v9.services.MutateBatchJobResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v9.services.MutateBatchJobResponse.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (resultBuilder_ == null) {
        result_ = null;
      } else {
        result_ = null;
        resultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v9.services.BatchJobServiceProto.internal_static_google_ads_googleads_v9_services_MutateBatchJobResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.services.MutateBatchJobResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v9.services.MutateBatchJobResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.services.MutateBatchJobResponse build() {
      com.google.ads.googleads.v9.services.MutateBatchJobResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.services.MutateBatchJobResponse buildPartial() {
      com.google.ads.googleads.v9.services.MutateBatchJobResponse result = new com.google.ads.googleads.v9.services.MutateBatchJobResponse(this);
      if (resultBuilder_ == null) {
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v9.services.MutateBatchJobResponse) {
        return mergeFrom((com.google.ads.googleads.v9.services.MutateBatchJobResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v9.services.MutateBatchJobResponse other) {
      if (other == com.google.ads.googleads.v9.services.MutateBatchJobResponse.getDefaultInstance()) return this;
      if (other.hasResult()) {
        mergeResult(other.getResult());
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
      com.google.ads.googleads.v9.services.MutateBatchJobResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v9.services.MutateBatchJobResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.ads.googleads.v9.services.MutateBatchJobResult result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v9.services.MutateBatchJobResult, com.google.ads.googleads.v9.services.MutateBatchJobResult.Builder, com.google.ads.googleads.v9.services.MutateBatchJobResultOrBuilder> resultBuilder_;
    /**
     * <pre>
     * The result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.services.MutateBatchJobResult result = 1;</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return resultBuilder_ != null || result_ != null;
    }
    /**
     * <pre>
     * The result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.services.MutateBatchJobResult result = 1;</code>
     * @return The result.
     */
    public com.google.ads.googleads.v9.services.MutateBatchJobResult getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? com.google.ads.googleads.v9.services.MutateBatchJobResult.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.services.MutateBatchJobResult result = 1;</code>
     */
    public Builder setResult(com.google.ads.googleads.v9.services.MutateBatchJobResult value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        resultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.services.MutateBatchJobResult result = 1;</code>
     */
    public Builder setResult(
        com.google.ads.googleads.v9.services.MutateBatchJobResult.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.services.MutateBatchJobResult result = 1;</code>
     */
    public Builder mergeResult(com.google.ads.googleads.v9.services.MutateBatchJobResult value) {
      if (resultBuilder_ == null) {
        if (result_ != null) {
          result_ =
            com.google.ads.googleads.v9.services.MutateBatchJobResult.newBuilder(result_).mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        resultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.services.MutateBatchJobResult result = 1;</code>
     */
    public Builder clearResult() {
      if (resultBuilder_ == null) {
        result_ = null;
        onChanged();
      } else {
        result_ = null;
        resultBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.services.MutateBatchJobResult result = 1;</code>
     */
    public com.google.ads.googleads.v9.services.MutateBatchJobResult.Builder getResultBuilder() {
      
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.services.MutateBatchJobResult result = 1;</code>
     */
    public com.google.ads.googleads.v9.services.MutateBatchJobResultOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            com.google.ads.googleads.v9.services.MutateBatchJobResult.getDefaultInstance() : result_;
      }
    }
    /**
     * <pre>
     * The result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.services.MutateBatchJobResult result = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v9.services.MutateBatchJobResult, com.google.ads.googleads.v9.services.MutateBatchJobResult.Builder, com.google.ads.googleads.v9.services.MutateBatchJobResultOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v9.services.MutateBatchJobResult, com.google.ads.googleads.v9.services.MutateBatchJobResult.Builder, com.google.ads.googleads.v9.services.MutateBatchJobResultOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v9.services.MutateBatchJobResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v9.services.MutateBatchJobResponse)
  private static final com.google.ads.googleads.v9.services.MutateBatchJobResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v9.services.MutateBatchJobResponse();
  }

  public static com.google.ads.googleads.v9.services.MutateBatchJobResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateBatchJobResponse>
      PARSER = new com.google.protobuf.AbstractParser<MutateBatchJobResponse>() {
    @java.lang.Override
    public MutateBatchJobResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateBatchJobResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateBatchJobResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateBatchJobResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v9.services.MutateBatchJobResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

