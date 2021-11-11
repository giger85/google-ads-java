// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/common/asset_types.proto

package com.google.ads.googleads.v9.common;

/**
 * <pre>
 * Metadata for an image at a certain size, either original or resized.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v9.common.ImageDimension}
 */
public final class ImageDimension extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v9.common.ImageDimension)
    ImageDimensionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImageDimension.newBuilder() to construct.
  private ImageDimension(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImageDimension() {
    url_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImageDimension();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImageDimension(
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
          case 32: {
            bitField0_ |= 0x00000001;
            heightPixels_ = input.readInt64();
            break;
          }
          case 40: {
            bitField0_ |= 0x00000002;
            widthPixels_ = input.readInt64();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000004;
            url_ = s;
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
    return com.google.ads.googleads.v9.common.AssetTypesProto.internal_static_google_ads_googleads_v9_common_ImageDimension_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v9.common.AssetTypesProto.internal_static_google_ads_googleads_v9_common_ImageDimension_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v9.common.ImageDimension.class, com.google.ads.googleads.v9.common.ImageDimension.Builder.class);
  }

  private int bitField0_;
  public static final int HEIGHT_PIXELS_FIELD_NUMBER = 4;
  private long heightPixels_;
  /**
   * <pre>
   * Height of the image.
   * </pre>
   *
   * <code>optional int64 height_pixels = 4;</code>
   * @return Whether the heightPixels field is set.
   */
  @java.lang.Override
  public boolean hasHeightPixels() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Height of the image.
   * </pre>
   *
   * <code>optional int64 height_pixels = 4;</code>
   * @return The heightPixels.
   */
  @java.lang.Override
  public long getHeightPixels() {
    return heightPixels_;
  }

  public static final int WIDTH_PIXELS_FIELD_NUMBER = 5;
  private long widthPixels_;
  /**
   * <pre>
   * Width of the image.
   * </pre>
   *
   * <code>optional int64 width_pixels = 5;</code>
   * @return Whether the widthPixels field is set.
   */
  @java.lang.Override
  public boolean hasWidthPixels() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Width of the image.
   * </pre>
   *
   * <code>optional int64 width_pixels = 5;</code>
   * @return The widthPixels.
   */
  @java.lang.Override
  public long getWidthPixels() {
    return widthPixels_;
  }

  public static final int URL_FIELD_NUMBER = 6;
  private volatile java.lang.Object url_;
  /**
   * <pre>
   * A URL that returns the image with this height and width.
   * </pre>
   *
   * <code>optional string url = 6;</code>
   * @return Whether the url field is set.
   */
  @java.lang.Override
  public boolean hasUrl() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * A URL that returns the image with this height and width.
   * </pre>
   *
   * <code>optional string url = 6;</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A URL that returns the image with this height and width.
   * </pre>
   *
   * <code>optional string url = 6;</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(4, heightPixels_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(5, widthPixels_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, url_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, heightPixels_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, widthPixels_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, url_);
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
    if (!(obj instanceof com.google.ads.googleads.v9.common.ImageDimension)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v9.common.ImageDimension other = (com.google.ads.googleads.v9.common.ImageDimension) obj;

    if (hasHeightPixels() != other.hasHeightPixels()) return false;
    if (hasHeightPixels()) {
      if (getHeightPixels()
          != other.getHeightPixels()) return false;
    }
    if (hasWidthPixels() != other.hasWidthPixels()) return false;
    if (hasWidthPixels()) {
      if (getWidthPixels()
          != other.getWidthPixels()) return false;
    }
    if (hasUrl() != other.hasUrl()) return false;
    if (hasUrl()) {
      if (!getUrl()
          .equals(other.getUrl())) return false;
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
    if (hasHeightPixels()) {
      hash = (37 * hash) + HEIGHT_PIXELS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getHeightPixels());
    }
    if (hasWidthPixels()) {
      hash = (37 * hash) + WIDTH_PIXELS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getWidthPixels());
    }
    if (hasUrl()) {
      hash = (37 * hash) + URL_FIELD_NUMBER;
      hash = (53 * hash) + getUrl().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v9.common.ImageDimension parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.common.ImageDimension parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.common.ImageDimension parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.common.ImageDimension parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.common.ImageDimension parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.common.ImageDimension parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.common.ImageDimension parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.common.ImageDimension parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.common.ImageDimension parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.common.ImageDimension parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.common.ImageDimension parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.common.ImageDimension parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v9.common.ImageDimension prototype) {
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
   * Metadata for an image at a certain size, either original or resized.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v9.common.ImageDimension}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v9.common.ImageDimension)
      com.google.ads.googleads.v9.common.ImageDimensionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v9.common.AssetTypesProto.internal_static_google_ads_googleads_v9_common_ImageDimension_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v9.common.AssetTypesProto.internal_static_google_ads_googleads_v9_common_ImageDimension_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v9.common.ImageDimension.class, com.google.ads.googleads.v9.common.ImageDimension.Builder.class);
    }

    // Construct using com.google.ads.googleads.v9.common.ImageDimension.newBuilder()
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
      heightPixels_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      widthPixels_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      url_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v9.common.AssetTypesProto.internal_static_google_ads_googleads_v9_common_ImageDimension_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.common.ImageDimension getDefaultInstanceForType() {
      return com.google.ads.googleads.v9.common.ImageDimension.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.common.ImageDimension build() {
      com.google.ads.googleads.v9.common.ImageDimension result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.common.ImageDimension buildPartial() {
      com.google.ads.googleads.v9.common.ImageDimension result = new com.google.ads.googleads.v9.common.ImageDimension(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.heightPixels_ = heightPixels_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.widthPixels_ = widthPixels_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.url_ = url_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v9.common.ImageDimension) {
        return mergeFrom((com.google.ads.googleads.v9.common.ImageDimension)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v9.common.ImageDimension other) {
      if (other == com.google.ads.googleads.v9.common.ImageDimension.getDefaultInstance()) return this;
      if (other.hasHeightPixels()) {
        setHeightPixels(other.getHeightPixels());
      }
      if (other.hasWidthPixels()) {
        setWidthPixels(other.getWidthPixels());
      }
      if (other.hasUrl()) {
        bitField0_ |= 0x00000004;
        url_ = other.url_;
        onChanged();
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
      com.google.ads.googleads.v9.common.ImageDimension parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v9.common.ImageDimension) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long heightPixels_ ;
    /**
     * <pre>
     * Height of the image.
     * </pre>
     *
     * <code>optional int64 height_pixels = 4;</code>
     * @return Whether the heightPixels field is set.
     */
    @java.lang.Override
    public boolean hasHeightPixels() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Height of the image.
     * </pre>
     *
     * <code>optional int64 height_pixels = 4;</code>
     * @return The heightPixels.
     */
    @java.lang.Override
    public long getHeightPixels() {
      return heightPixels_;
    }
    /**
     * <pre>
     * Height of the image.
     * </pre>
     *
     * <code>optional int64 height_pixels = 4;</code>
     * @param value The heightPixels to set.
     * @return This builder for chaining.
     */
    public Builder setHeightPixels(long value) {
      bitField0_ |= 0x00000001;
      heightPixels_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Height of the image.
     * </pre>
     *
     * <code>optional int64 height_pixels = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeightPixels() {
      bitField0_ = (bitField0_ & ~0x00000001);
      heightPixels_ = 0L;
      onChanged();
      return this;
    }

    private long widthPixels_ ;
    /**
     * <pre>
     * Width of the image.
     * </pre>
     *
     * <code>optional int64 width_pixels = 5;</code>
     * @return Whether the widthPixels field is set.
     */
    @java.lang.Override
    public boolean hasWidthPixels() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Width of the image.
     * </pre>
     *
     * <code>optional int64 width_pixels = 5;</code>
     * @return The widthPixels.
     */
    @java.lang.Override
    public long getWidthPixels() {
      return widthPixels_;
    }
    /**
     * <pre>
     * Width of the image.
     * </pre>
     *
     * <code>optional int64 width_pixels = 5;</code>
     * @param value The widthPixels to set.
     * @return This builder for chaining.
     */
    public Builder setWidthPixels(long value) {
      bitField0_ |= 0x00000002;
      widthPixels_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Width of the image.
     * </pre>
     *
     * <code>optional int64 width_pixels = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearWidthPixels() {
      bitField0_ = (bitField0_ & ~0x00000002);
      widthPixels_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <pre>
     * A URL that returns the image with this height and width.
     * </pre>
     *
     * <code>optional string url = 6;</code>
     * @return Whether the url field is set.
     */
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * A URL that returns the image with this height and width.
     * </pre>
     *
     * <code>optional string url = 6;</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A URL that returns the image with this height and width.
     * </pre>
     *
     * <code>optional string url = 6;</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A URL that returns the image with this height and width.
     * </pre>
     *
     * <code>optional string url = 6;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A URL that returns the image with this height and width.
     * </pre>
     *
     * <code>optional string url = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      bitField0_ = (bitField0_ & ~0x00000004);
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A URL that returns the image with this height and width.
     * </pre>
     *
     * <code>optional string url = 6;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000004;
      url_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v9.common.ImageDimension)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v9.common.ImageDimension)
  private static final com.google.ads.googleads.v9.common.ImageDimension DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v9.common.ImageDimension();
  }

  public static com.google.ads.googleads.v9.common.ImageDimension getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageDimension>
      PARSER = new com.google.protobuf.AbstractParser<ImageDimension>() {
    @java.lang.Override
    public ImageDimension parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImageDimension(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImageDimension> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageDimension> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v9.common.ImageDimension getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

