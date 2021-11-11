// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/conversion_custom_variable_service.proto

package com.google.ads.googleads.v9.services;

/**
 * <pre>
 * The result for the conversion custom variable mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v9.services.MutateConversionCustomVariableResult}
 */
public final class MutateConversionCustomVariableResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v9.services.MutateConversionCustomVariableResult)
    MutateConversionCustomVariableResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateConversionCustomVariableResult.newBuilder() to construct.
  private MutateConversionCustomVariableResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateConversionCustomVariableResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateConversionCustomVariableResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateConversionCustomVariableResult(
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
            java.lang.String s = input.readStringRequireUtf8();

            resourceName_ = s;
            break;
          }
          case 18: {
            com.google.ads.googleads.v9.resources.ConversionCustomVariable.Builder subBuilder = null;
            if (conversionCustomVariable_ != null) {
              subBuilder = conversionCustomVariable_.toBuilder();
            }
            conversionCustomVariable_ = input.readMessage(com.google.ads.googleads.v9.resources.ConversionCustomVariable.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(conversionCustomVariable_);
              conversionCustomVariable_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v9.services.ConversionCustomVariableServiceProto.internal_static_google_ads_googleads_v9_services_MutateConversionCustomVariableResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v9.services.ConversionCustomVariableServiceProto.internal_static_google_ads_googleads_v9_services_MutateConversionCustomVariableResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult.class, com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONVERSION_CUSTOM_VARIABLE_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v9.resources.ConversionCustomVariable conversionCustomVariable_;
  /**
   * <pre>
   * The mutated conversion custom variable with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.ConversionCustomVariable conversion_custom_variable = 2;</code>
   * @return Whether the conversionCustomVariable field is set.
   */
  @java.lang.Override
  public boolean hasConversionCustomVariable() {
    return conversionCustomVariable_ != null;
  }
  /**
   * <pre>
   * The mutated conversion custom variable with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.ConversionCustomVariable conversion_custom_variable = 2;</code>
   * @return The conversionCustomVariable.
   */
  @java.lang.Override
  public com.google.ads.googleads.v9.resources.ConversionCustomVariable getConversionCustomVariable() {
    return conversionCustomVariable_ == null ? com.google.ads.googleads.v9.resources.ConversionCustomVariable.getDefaultInstance() : conversionCustomVariable_;
  }
  /**
   * <pre>
   * The mutated conversion custom variable with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.ConversionCustomVariable conversion_custom_variable = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v9.resources.ConversionCustomVariableOrBuilder getConversionCustomVariableOrBuilder() {
    return getConversionCustomVariable();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (conversionCustomVariable_ != null) {
      output.writeMessage(2, getConversionCustomVariable());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (conversionCustomVariable_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConversionCustomVariable());
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
    if (!(obj instanceof com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult other = (com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasConversionCustomVariable() != other.hasConversionCustomVariable()) return false;
    if (hasConversionCustomVariable()) {
      if (!getConversionCustomVariable()
          .equals(other.getConversionCustomVariable())) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    if (hasConversionCustomVariable()) {
      hash = (37 * hash) + CONVERSION_CUSTOM_VARIABLE_FIELD_NUMBER;
      hash = (53 * hash) + getConversionCustomVariable().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult prototype) {
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
   * The result for the conversion custom variable mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v9.services.MutateConversionCustomVariableResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v9.services.MutateConversionCustomVariableResult)
      com.google.ads.googleads.v9.services.MutateConversionCustomVariableResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v9.services.ConversionCustomVariableServiceProto.internal_static_google_ads_googleads_v9_services_MutateConversionCustomVariableResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v9.services.ConversionCustomVariableServiceProto.internal_static_google_ads_googleads_v9_services_MutateConversionCustomVariableResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult.class, com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult.newBuilder()
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
      resourceName_ = "";

      if (conversionCustomVariableBuilder_ == null) {
        conversionCustomVariable_ = null;
      } else {
        conversionCustomVariable_ = null;
        conversionCustomVariableBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v9.services.ConversionCustomVariableServiceProto.internal_static_google_ads_googleads_v9_services_MutateConversionCustomVariableResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult build() {
      com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult buildPartial() {
      com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult result = new com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult(this);
      result.resourceName_ = resourceName_;
      if (conversionCustomVariableBuilder_ == null) {
        result.conversionCustomVariable_ = conversionCustomVariable_;
      } else {
        result.conversionCustomVariable_ = conversionCustomVariableBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult) {
        return mergeFrom((com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult other) {
      if (other == com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasConversionCustomVariable()) {
        mergeConversionCustomVariable(other.getConversionCustomVariable());
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
      com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v9.resources.ConversionCustomVariable conversionCustomVariable_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v9.resources.ConversionCustomVariable, com.google.ads.googleads.v9.resources.ConversionCustomVariable.Builder, com.google.ads.googleads.v9.resources.ConversionCustomVariableOrBuilder> conversionCustomVariableBuilder_;
    /**
     * <pre>
     * The mutated conversion custom variable with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v9.resources.ConversionCustomVariable conversion_custom_variable = 2;</code>
     * @return Whether the conversionCustomVariable field is set.
     */
    public boolean hasConversionCustomVariable() {
      return conversionCustomVariableBuilder_ != null || conversionCustomVariable_ != null;
    }
    /**
     * <pre>
     * The mutated conversion custom variable with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v9.resources.ConversionCustomVariable conversion_custom_variable = 2;</code>
     * @return The conversionCustomVariable.
     */
    public com.google.ads.googleads.v9.resources.ConversionCustomVariable getConversionCustomVariable() {
      if (conversionCustomVariableBuilder_ == null) {
        return conversionCustomVariable_ == null ? com.google.ads.googleads.v9.resources.ConversionCustomVariable.getDefaultInstance() : conversionCustomVariable_;
      } else {
        return conversionCustomVariableBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated conversion custom variable with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v9.resources.ConversionCustomVariable conversion_custom_variable = 2;</code>
     */
    public Builder setConversionCustomVariable(com.google.ads.googleads.v9.resources.ConversionCustomVariable value) {
      if (conversionCustomVariableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        conversionCustomVariable_ = value;
        onChanged();
      } else {
        conversionCustomVariableBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated conversion custom variable with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v9.resources.ConversionCustomVariable conversion_custom_variable = 2;</code>
     */
    public Builder setConversionCustomVariable(
        com.google.ads.googleads.v9.resources.ConversionCustomVariable.Builder builderForValue) {
      if (conversionCustomVariableBuilder_ == null) {
        conversionCustomVariable_ = builderForValue.build();
        onChanged();
      } else {
        conversionCustomVariableBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The mutated conversion custom variable with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v9.resources.ConversionCustomVariable conversion_custom_variable = 2;</code>
     */
    public Builder mergeConversionCustomVariable(com.google.ads.googleads.v9.resources.ConversionCustomVariable value) {
      if (conversionCustomVariableBuilder_ == null) {
        if (conversionCustomVariable_ != null) {
          conversionCustomVariable_ =
            com.google.ads.googleads.v9.resources.ConversionCustomVariable.newBuilder(conversionCustomVariable_).mergeFrom(value).buildPartial();
        } else {
          conversionCustomVariable_ = value;
        }
        onChanged();
      } else {
        conversionCustomVariableBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated conversion custom variable with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v9.resources.ConversionCustomVariable conversion_custom_variable = 2;</code>
     */
    public Builder clearConversionCustomVariable() {
      if (conversionCustomVariableBuilder_ == null) {
        conversionCustomVariable_ = null;
        onChanged();
      } else {
        conversionCustomVariable_ = null;
        conversionCustomVariableBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The mutated conversion custom variable with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v9.resources.ConversionCustomVariable conversion_custom_variable = 2;</code>
     */
    public com.google.ads.googleads.v9.resources.ConversionCustomVariable.Builder getConversionCustomVariableBuilder() {
      
      onChanged();
      return getConversionCustomVariableFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated conversion custom variable with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v9.resources.ConversionCustomVariable conversion_custom_variable = 2;</code>
     */
    public com.google.ads.googleads.v9.resources.ConversionCustomVariableOrBuilder getConversionCustomVariableOrBuilder() {
      if (conversionCustomVariableBuilder_ != null) {
        return conversionCustomVariableBuilder_.getMessageOrBuilder();
      } else {
        return conversionCustomVariable_ == null ?
            com.google.ads.googleads.v9.resources.ConversionCustomVariable.getDefaultInstance() : conversionCustomVariable_;
      }
    }
    /**
     * <pre>
     * The mutated conversion custom variable with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v9.resources.ConversionCustomVariable conversion_custom_variable = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v9.resources.ConversionCustomVariable, com.google.ads.googleads.v9.resources.ConversionCustomVariable.Builder, com.google.ads.googleads.v9.resources.ConversionCustomVariableOrBuilder> 
        getConversionCustomVariableFieldBuilder() {
      if (conversionCustomVariableBuilder_ == null) {
        conversionCustomVariableBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v9.resources.ConversionCustomVariable, com.google.ads.googleads.v9.resources.ConversionCustomVariable.Builder, com.google.ads.googleads.v9.resources.ConversionCustomVariableOrBuilder>(
                getConversionCustomVariable(),
                getParentForChildren(),
                isClean());
        conversionCustomVariable_ = null;
      }
      return conversionCustomVariableBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v9.services.MutateConversionCustomVariableResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v9.services.MutateConversionCustomVariableResult)
  private static final com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult();
  }

  public static com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateConversionCustomVariableResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateConversionCustomVariableResult>() {
    @java.lang.Override
    public MutateConversionCustomVariableResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateConversionCustomVariableResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateConversionCustomVariableResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateConversionCustomVariableResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v9.services.MutateConversionCustomVariableResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

