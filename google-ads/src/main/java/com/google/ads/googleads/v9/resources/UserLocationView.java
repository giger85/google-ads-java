// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/user_location_view.proto

package com.google.ads.googleads.v9.resources;

/**
 * <pre>
 * A user location view.
 * User Location View includes all metrics aggregated at the country level,
 * one row per country. It reports metrics at the actual physical location of
 * the user by targeted or not targeted location. If other segment fields are
 * used, you may get more than one row per country.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v9.resources.UserLocationView}
 */
public final class UserLocationView extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v9.resources.UserLocationView)
    UserLocationViewOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserLocationView.newBuilder() to construct.
  private UserLocationView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserLocationView() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserLocationView();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserLocationView(
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
            java.lang.String s = input.readStringRequireUtf8();

            resourceName_ = s;
            break;
          }
          case 32: {
            bitField0_ |= 0x00000001;
            countryCriterionId_ = input.readInt64();
            break;
          }
          case 40: {
            bitField0_ |= 0x00000002;
            targetingLocation_ = input.readBool();
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
    return com.google.ads.googleads.v9.resources.UserLocationViewProto.internal_static_google_ads_googleads_v9_resources_UserLocationView_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v9.resources.UserLocationViewProto.internal_static_google_ads_googleads_v9_resources_UserLocationView_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v9.resources.UserLocationView.class, com.google.ads.googleads.v9.resources.UserLocationView.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Output only. The resource name of the user location view.
   * UserLocation view resource names have the form:
   * `customers/{customer_id}/userLocationViews/{country_criterion_id}~{targeting_location}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
   * Output only. The resource name of the user location view.
   * UserLocation view resource names have the form:
   * `customers/{customer_id}/userLocationViews/{country_criterion_id}~{targeting_location}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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

  public static final int COUNTRY_CRITERION_ID_FIELD_NUMBER = 4;
  private long countryCriterionId_;
  /**
   * <pre>
   * Output only. Criterion Id for the country.
   * </pre>
   *
   * <code>optional int64 country_criterion_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the countryCriterionId field is set.
   */
  @java.lang.Override
  public boolean hasCountryCriterionId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Output only. Criterion Id for the country.
   * </pre>
   *
   * <code>optional int64 country_criterion_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The countryCriterionId.
   */
  @java.lang.Override
  public long getCountryCriterionId() {
    return countryCriterionId_;
  }

  public static final int TARGETING_LOCATION_FIELD_NUMBER = 5;
  private boolean targetingLocation_;
  /**
   * <pre>
   * Output only. Indicates whether location was targeted or not.
   * </pre>
   *
   * <code>optional bool targeting_location = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the targetingLocation field is set.
   */
  @java.lang.Override
  public boolean hasTargetingLocation() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Output only. Indicates whether location was targeted or not.
   * </pre>
   *
   * <code>optional bool targeting_location = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The targetingLocation.
   */
  @java.lang.Override
  public boolean getTargetingLocation() {
    return targetingLocation_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(4, countryCriterionId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(5, targetingLocation_);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, countryCriterionId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, targetingLocation_);
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
    if (!(obj instanceof com.google.ads.googleads.v9.resources.UserLocationView)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v9.resources.UserLocationView other = (com.google.ads.googleads.v9.resources.UserLocationView) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasCountryCriterionId() != other.hasCountryCriterionId()) return false;
    if (hasCountryCriterionId()) {
      if (getCountryCriterionId()
          != other.getCountryCriterionId()) return false;
    }
    if (hasTargetingLocation() != other.hasTargetingLocation()) return false;
    if (hasTargetingLocation()) {
      if (getTargetingLocation()
          != other.getTargetingLocation()) return false;
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
    if (hasCountryCriterionId()) {
      hash = (37 * hash) + COUNTRY_CRITERION_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCountryCriterionId());
    }
    if (hasTargetingLocation()) {
      hash = (37 * hash) + TARGETING_LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getTargetingLocation());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v9.resources.UserLocationView parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.resources.UserLocationView parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.resources.UserLocationView parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.resources.UserLocationView parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.resources.UserLocationView parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.resources.UserLocationView parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.resources.UserLocationView parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.resources.UserLocationView parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.resources.UserLocationView parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.resources.UserLocationView parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.resources.UserLocationView parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.resources.UserLocationView parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v9.resources.UserLocationView prototype) {
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
   * A user location view.
   * User Location View includes all metrics aggregated at the country level,
   * one row per country. It reports metrics at the actual physical location of
   * the user by targeted or not targeted location. If other segment fields are
   * used, you may get more than one row per country.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v9.resources.UserLocationView}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v9.resources.UserLocationView)
      com.google.ads.googleads.v9.resources.UserLocationViewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v9.resources.UserLocationViewProto.internal_static_google_ads_googleads_v9_resources_UserLocationView_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v9.resources.UserLocationViewProto.internal_static_google_ads_googleads_v9_resources_UserLocationView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v9.resources.UserLocationView.class, com.google.ads.googleads.v9.resources.UserLocationView.Builder.class);
    }

    // Construct using com.google.ads.googleads.v9.resources.UserLocationView.newBuilder()
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

      countryCriterionId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      targetingLocation_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v9.resources.UserLocationViewProto.internal_static_google_ads_googleads_v9_resources_UserLocationView_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.resources.UserLocationView getDefaultInstanceForType() {
      return com.google.ads.googleads.v9.resources.UserLocationView.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.resources.UserLocationView build() {
      com.google.ads.googleads.v9.resources.UserLocationView result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.resources.UserLocationView buildPartial() {
      com.google.ads.googleads.v9.resources.UserLocationView result = new com.google.ads.googleads.v9.resources.UserLocationView(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.resourceName_ = resourceName_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.countryCriterionId_ = countryCriterionId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.targetingLocation_ = targetingLocation_;
        to_bitField0_ |= 0x00000002;
      }
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
      if (other instanceof com.google.ads.googleads.v9.resources.UserLocationView) {
        return mergeFrom((com.google.ads.googleads.v9.resources.UserLocationView)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v9.resources.UserLocationView other) {
      if (other == com.google.ads.googleads.v9.resources.UserLocationView.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasCountryCriterionId()) {
        setCountryCriterionId(other.getCountryCriterionId());
      }
      if (other.hasTargetingLocation()) {
        setTargetingLocation(other.getTargetingLocation());
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
      com.google.ads.googleads.v9.resources.UserLocationView parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v9.resources.UserLocationView) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Output only. The resource name of the user location view.
     * UserLocation view resource names have the form:
     * `customers/{customer_id}/userLocationViews/{country_criterion_id}~{targeting_location}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the user location view.
     * UserLocation view resource names have the form:
     * `customers/{customer_id}/userLocationViews/{country_criterion_id}~{targeting_location}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the user location view.
     * UserLocation view resource names have the form:
     * `customers/{customer_id}/userLocationViews/{country_criterion_id}~{targeting_location}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the user location view.
     * UserLocation view resource names have the form:
     * `customers/{customer_id}/userLocationViews/{country_criterion_id}~{targeting_location}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the user location view.
     * UserLocation view resource names have the form:
     * `customers/{customer_id}/userLocationViews/{country_criterion_id}~{targeting_location}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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

    private long countryCriterionId_ ;
    /**
     * <pre>
     * Output only. Criterion Id for the country.
     * </pre>
     *
     * <code>optional int64 country_criterion_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the countryCriterionId field is set.
     */
    @java.lang.Override
    public boolean hasCountryCriterionId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Output only. Criterion Id for the country.
     * </pre>
     *
     * <code>optional int64 country_criterion_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The countryCriterionId.
     */
    @java.lang.Override
    public long getCountryCriterionId() {
      return countryCriterionId_;
    }
    /**
     * <pre>
     * Output only. Criterion Id for the country.
     * </pre>
     *
     * <code>optional int64 country_criterion_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The countryCriterionId to set.
     * @return This builder for chaining.
     */
    public Builder setCountryCriterionId(long value) {
      bitField0_ |= 0x00000001;
      countryCriterionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Criterion Id for the country.
     * </pre>
     *
     * <code>optional int64 country_criterion_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearCountryCriterionId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      countryCriterionId_ = 0L;
      onChanged();
      return this;
    }

    private boolean targetingLocation_ ;
    /**
     * <pre>
     * Output only. Indicates whether location was targeted or not.
     * </pre>
     *
     * <code>optional bool targeting_location = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the targetingLocation field is set.
     */
    @java.lang.Override
    public boolean hasTargetingLocation() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Output only. Indicates whether location was targeted or not.
     * </pre>
     *
     * <code>optional bool targeting_location = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The targetingLocation.
     */
    @java.lang.Override
    public boolean getTargetingLocation() {
      return targetingLocation_;
    }
    /**
     * <pre>
     * Output only. Indicates whether location was targeted or not.
     * </pre>
     *
     * <code>optional bool targeting_location = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The targetingLocation to set.
     * @return This builder for chaining.
     */
    public Builder setTargetingLocation(boolean value) {
      bitField0_ |= 0x00000002;
      targetingLocation_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Indicates whether location was targeted or not.
     * </pre>
     *
     * <code>optional bool targeting_location = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetingLocation() {
      bitField0_ = (bitField0_ & ~0x00000002);
      targetingLocation_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v9.resources.UserLocationView)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v9.resources.UserLocationView)
  private static final com.google.ads.googleads.v9.resources.UserLocationView DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v9.resources.UserLocationView();
  }

  public static com.google.ads.googleads.v9.resources.UserLocationView getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserLocationView>
      PARSER = new com.google.protobuf.AbstractParser<UserLocationView>() {
    @java.lang.Override
    public UserLocationView parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserLocationView(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserLocationView> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserLocationView> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v9.resources.UserLocationView getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

