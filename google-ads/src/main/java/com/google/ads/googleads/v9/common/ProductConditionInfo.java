// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/common/criteria.proto

package com.google.ads.googleads.v9.common;

/**
 * <pre>
 * Condition of a product offer.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v9.common.ProductConditionInfo}
 */
public final class ProductConditionInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v9.common.ProductConditionInfo)
    ProductConditionInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductConditionInfo.newBuilder() to construct.
  private ProductConditionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductConditionInfo() {
    condition_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProductConditionInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductConditionInfo(
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
          case 8: {
            int rawValue = input.readEnum();

            condition_ = rawValue;
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
    return com.google.ads.googleads.v9.common.CriteriaProto.internal_static_google_ads_googleads_v9_common_ProductConditionInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v9.common.CriteriaProto.internal_static_google_ads_googleads_v9_common_ProductConditionInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v9.common.ProductConditionInfo.class, com.google.ads.googleads.v9.common.ProductConditionInfo.Builder.class);
  }

  public static final int CONDITION_FIELD_NUMBER = 1;
  private int condition_;
  /**
   * <pre>
   * Value of the condition.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.ProductConditionEnum.ProductCondition condition = 1;</code>
   * @return The enum numeric value on the wire for condition.
   */
  @java.lang.Override public int getConditionValue() {
    return condition_;
  }
  /**
   * <pre>
   * Value of the condition.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.ProductConditionEnum.ProductCondition condition = 1;</code>
   * @return The condition.
   */
  @java.lang.Override public com.google.ads.googleads.v9.enums.ProductConditionEnum.ProductCondition getCondition() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v9.enums.ProductConditionEnum.ProductCondition result = com.google.ads.googleads.v9.enums.ProductConditionEnum.ProductCondition.valueOf(condition_);
    return result == null ? com.google.ads.googleads.v9.enums.ProductConditionEnum.ProductCondition.UNRECOGNIZED : result;
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
    if (condition_ != com.google.ads.googleads.v9.enums.ProductConditionEnum.ProductCondition.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, condition_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (condition_ != com.google.ads.googleads.v9.enums.ProductConditionEnum.ProductCondition.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, condition_);
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
    if (!(obj instanceof com.google.ads.googleads.v9.common.ProductConditionInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v9.common.ProductConditionInfo other = (com.google.ads.googleads.v9.common.ProductConditionInfo) obj;

    if (condition_ != other.condition_) return false;
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
    hash = (37 * hash) + CONDITION_FIELD_NUMBER;
    hash = (53 * hash) + condition_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v9.common.ProductConditionInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.common.ProductConditionInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.common.ProductConditionInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.common.ProductConditionInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.common.ProductConditionInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.common.ProductConditionInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.common.ProductConditionInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.common.ProductConditionInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.common.ProductConditionInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.common.ProductConditionInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.common.ProductConditionInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.common.ProductConditionInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v9.common.ProductConditionInfo prototype) {
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
   * Condition of a product offer.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v9.common.ProductConditionInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v9.common.ProductConditionInfo)
      com.google.ads.googleads.v9.common.ProductConditionInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v9.common.CriteriaProto.internal_static_google_ads_googleads_v9_common_ProductConditionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v9.common.CriteriaProto.internal_static_google_ads_googleads_v9_common_ProductConditionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v9.common.ProductConditionInfo.class, com.google.ads.googleads.v9.common.ProductConditionInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v9.common.ProductConditionInfo.newBuilder()
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
      condition_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v9.common.CriteriaProto.internal_static_google_ads_googleads_v9_common_ProductConditionInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.common.ProductConditionInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v9.common.ProductConditionInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.common.ProductConditionInfo build() {
      com.google.ads.googleads.v9.common.ProductConditionInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.common.ProductConditionInfo buildPartial() {
      com.google.ads.googleads.v9.common.ProductConditionInfo result = new com.google.ads.googleads.v9.common.ProductConditionInfo(this);
      result.condition_ = condition_;
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
      if (other instanceof com.google.ads.googleads.v9.common.ProductConditionInfo) {
        return mergeFrom((com.google.ads.googleads.v9.common.ProductConditionInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v9.common.ProductConditionInfo other) {
      if (other == com.google.ads.googleads.v9.common.ProductConditionInfo.getDefaultInstance()) return this;
      if (other.condition_ != 0) {
        setConditionValue(other.getConditionValue());
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
      com.google.ads.googleads.v9.common.ProductConditionInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v9.common.ProductConditionInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int condition_ = 0;
    /**
     * <pre>
     * Value of the condition.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.enums.ProductConditionEnum.ProductCondition condition = 1;</code>
     * @return The enum numeric value on the wire for condition.
     */
    @java.lang.Override public int getConditionValue() {
      return condition_;
    }
    /**
     * <pre>
     * Value of the condition.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.enums.ProductConditionEnum.ProductCondition condition = 1;</code>
     * @param value The enum numeric value on the wire for condition to set.
     * @return This builder for chaining.
     */
    public Builder setConditionValue(int value) {
      
      condition_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value of the condition.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.enums.ProductConditionEnum.ProductCondition condition = 1;</code>
     * @return The condition.
     */
    @java.lang.Override
    public com.google.ads.googleads.v9.enums.ProductConditionEnum.ProductCondition getCondition() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v9.enums.ProductConditionEnum.ProductCondition result = com.google.ads.googleads.v9.enums.ProductConditionEnum.ProductCondition.valueOf(condition_);
      return result == null ? com.google.ads.googleads.v9.enums.ProductConditionEnum.ProductCondition.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Value of the condition.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.enums.ProductConditionEnum.ProductCondition condition = 1;</code>
     * @param value The condition to set.
     * @return This builder for chaining.
     */
    public Builder setCondition(com.google.ads.googleads.v9.enums.ProductConditionEnum.ProductCondition value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      condition_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value of the condition.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.enums.ProductConditionEnum.ProductCondition condition = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCondition() {
      
      condition_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v9.common.ProductConditionInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v9.common.ProductConditionInfo)
  private static final com.google.ads.googleads.v9.common.ProductConditionInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v9.common.ProductConditionInfo();
  }

  public static com.google.ads.googleads.v9.common.ProductConditionInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductConditionInfo>
      PARSER = new com.google.protobuf.AbstractParser<ProductConditionInfo>() {
    @java.lang.Override
    public ProductConditionInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductConditionInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductConditionInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductConditionInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v9.common.ProductConditionInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

