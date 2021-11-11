// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/common/user_lists.proto

package com.google.ads.googleads.v9.common;

/**
 * <pre>
 * UserList of CRM users provided by the advertiser.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v9.common.CrmBasedUserListInfo}
 */
public final class CrmBasedUserListInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v9.common.CrmBasedUserListInfo)
    CrmBasedUserListInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CrmBasedUserListInfo.newBuilder() to construct.
  private CrmBasedUserListInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CrmBasedUserListInfo() {
    appId_ = "";
    uploadKeyType_ = 0;
    dataSourceType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CrmBasedUserListInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CrmBasedUserListInfo(
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
          case 16: {
            int rawValue = input.readEnum();

            uploadKeyType_ = rawValue;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            dataSourceType_ = rawValue;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            appId_ = s;
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
    return com.google.ads.googleads.v9.common.UserListsProto.internal_static_google_ads_googleads_v9_common_CrmBasedUserListInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v9.common.UserListsProto.internal_static_google_ads_googleads_v9_common_CrmBasedUserListInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v9.common.CrmBasedUserListInfo.class, com.google.ads.googleads.v9.common.CrmBasedUserListInfo.Builder.class);
  }

  private int bitField0_;
  public static final int APP_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object appId_;
  /**
   * <pre>
   * A string that uniquely identifies a mobile application from which the data
   * was collected.
   * For iOS, the ID string is the 9 digit string that appears at the end of an
   * App Store URL (e.g., "476943146" for "Flood-It! 2" whose App Store link is
   * http://itunes.apple.com/us/app/flood-it!-2/id476943146).
   * For Android, the ID string is the application's package name
   * (e.g., "com.labpixies.colordrips" for "Color Drips" given Google Play link
   * https://play.google.com/store/apps/details?id=com.labpixies.colordrips).
   * Required when creating CrmBasedUserList for uploading mobile advertising
   * IDs.
   * </pre>
   *
   * <code>optional string app_id = 4;</code>
   * @return Whether the appId field is set.
   */
  @java.lang.Override
  public boolean hasAppId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * A string that uniquely identifies a mobile application from which the data
   * was collected.
   * For iOS, the ID string is the 9 digit string that appears at the end of an
   * App Store URL (e.g., "476943146" for "Flood-It! 2" whose App Store link is
   * http://itunes.apple.com/us/app/flood-it!-2/id476943146).
   * For Android, the ID string is the application's package name
   * (e.g., "com.labpixies.colordrips" for "Color Drips" given Google Play link
   * https://play.google.com/store/apps/details?id=com.labpixies.colordrips).
   * Required when creating CrmBasedUserList for uploading mobile advertising
   * IDs.
   * </pre>
   *
   * <code>optional string app_id = 4;</code>
   * @return The appId.
   */
  @java.lang.Override
  public java.lang.String getAppId() {
    java.lang.Object ref = appId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      appId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A string that uniquely identifies a mobile application from which the data
   * was collected.
   * For iOS, the ID string is the 9 digit string that appears at the end of an
   * App Store URL (e.g., "476943146" for "Flood-It! 2" whose App Store link is
   * http://itunes.apple.com/us/app/flood-it!-2/id476943146).
   * For Android, the ID string is the application's package name
   * (e.g., "com.labpixies.colordrips" for "Color Drips" given Google Play link
   * https://play.google.com/store/apps/details?id=com.labpixies.colordrips).
   * Required when creating CrmBasedUserList for uploading mobile advertising
   * IDs.
   * </pre>
   *
   * <code>optional string app_id = 4;</code>
   * @return The bytes for appId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAppIdBytes() {
    java.lang.Object ref = appId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      appId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UPLOAD_KEY_TYPE_FIELD_NUMBER = 2;
  private int uploadKeyType_;
  /**
   * <pre>
   * Matching key type of the list.
   * Mixed data types are not allowed on the same list.
   * This field is required for an ADD operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType upload_key_type = 2;</code>
   * @return The enum numeric value on the wire for uploadKeyType.
   */
  @java.lang.Override public int getUploadKeyTypeValue() {
    return uploadKeyType_;
  }
  /**
   * <pre>
   * Matching key type of the list.
   * Mixed data types are not allowed on the same list.
   * This field is required for an ADD operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType upload_key_type = 2;</code>
   * @return The uploadKeyType.
   */
  @java.lang.Override public com.google.ads.googleads.v9.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType getUploadKeyType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v9.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType result = com.google.ads.googleads.v9.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType.valueOf(uploadKeyType_);
    return result == null ? com.google.ads.googleads.v9.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType.UNRECOGNIZED : result;
  }

  public static final int DATA_SOURCE_TYPE_FIELD_NUMBER = 3;
  private int dataSourceType_;
  /**
   * <pre>
   * Data source of the list. Default value is FIRST_PARTY.
   * Only customers on the allow-list can create third-party sourced CRM lists.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType data_source_type = 3;</code>
   * @return The enum numeric value on the wire for dataSourceType.
   */
  @java.lang.Override public int getDataSourceTypeValue() {
    return dataSourceType_;
  }
  /**
   * <pre>
   * Data source of the list. Default value is FIRST_PARTY.
   * Only customers on the allow-list can create third-party sourced CRM lists.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType data_source_type = 3;</code>
   * @return The dataSourceType.
   */
  @java.lang.Override public com.google.ads.googleads.v9.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType getDataSourceType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v9.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType result = com.google.ads.googleads.v9.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType.valueOf(dataSourceType_);
    return result == null ? com.google.ads.googleads.v9.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType.UNRECOGNIZED : result;
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
    if (uploadKeyType_ != com.google.ads.googleads.v9.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, uploadKeyType_);
    }
    if (dataSourceType_ != com.google.ads.googleads.v9.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType.UNSPECIFIED.getNumber()) {
      output.writeEnum(3, dataSourceType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, appId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (uploadKeyType_ != com.google.ads.googleads.v9.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, uploadKeyType_);
    }
    if (dataSourceType_ != com.google.ads.googleads.v9.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, dataSourceType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, appId_);
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
    if (!(obj instanceof com.google.ads.googleads.v9.common.CrmBasedUserListInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v9.common.CrmBasedUserListInfo other = (com.google.ads.googleads.v9.common.CrmBasedUserListInfo) obj;

    if (hasAppId() != other.hasAppId()) return false;
    if (hasAppId()) {
      if (!getAppId()
          .equals(other.getAppId())) return false;
    }
    if (uploadKeyType_ != other.uploadKeyType_) return false;
    if (dataSourceType_ != other.dataSourceType_) return false;
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
    if (hasAppId()) {
      hash = (37 * hash) + APP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAppId().hashCode();
    }
    hash = (37 * hash) + UPLOAD_KEY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + uploadKeyType_;
    hash = (37 * hash) + DATA_SOURCE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + dataSourceType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v9.common.CrmBasedUserListInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.common.CrmBasedUserListInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.common.CrmBasedUserListInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.common.CrmBasedUserListInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.common.CrmBasedUserListInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.common.CrmBasedUserListInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.common.CrmBasedUserListInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.common.CrmBasedUserListInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.common.CrmBasedUserListInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.common.CrmBasedUserListInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.common.CrmBasedUserListInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.common.CrmBasedUserListInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v9.common.CrmBasedUserListInfo prototype) {
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
   * UserList of CRM users provided by the advertiser.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v9.common.CrmBasedUserListInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v9.common.CrmBasedUserListInfo)
      com.google.ads.googleads.v9.common.CrmBasedUserListInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v9.common.UserListsProto.internal_static_google_ads_googleads_v9_common_CrmBasedUserListInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v9.common.UserListsProto.internal_static_google_ads_googleads_v9_common_CrmBasedUserListInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v9.common.CrmBasedUserListInfo.class, com.google.ads.googleads.v9.common.CrmBasedUserListInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v9.common.CrmBasedUserListInfo.newBuilder()
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
      appId_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      uploadKeyType_ = 0;

      dataSourceType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v9.common.UserListsProto.internal_static_google_ads_googleads_v9_common_CrmBasedUserListInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.common.CrmBasedUserListInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v9.common.CrmBasedUserListInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.common.CrmBasedUserListInfo build() {
      com.google.ads.googleads.v9.common.CrmBasedUserListInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.common.CrmBasedUserListInfo buildPartial() {
      com.google.ads.googleads.v9.common.CrmBasedUserListInfo result = new com.google.ads.googleads.v9.common.CrmBasedUserListInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.appId_ = appId_;
      result.uploadKeyType_ = uploadKeyType_;
      result.dataSourceType_ = dataSourceType_;
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
      if (other instanceof com.google.ads.googleads.v9.common.CrmBasedUserListInfo) {
        return mergeFrom((com.google.ads.googleads.v9.common.CrmBasedUserListInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v9.common.CrmBasedUserListInfo other) {
      if (other == com.google.ads.googleads.v9.common.CrmBasedUserListInfo.getDefaultInstance()) return this;
      if (other.hasAppId()) {
        bitField0_ |= 0x00000001;
        appId_ = other.appId_;
        onChanged();
      }
      if (other.uploadKeyType_ != 0) {
        setUploadKeyTypeValue(other.getUploadKeyTypeValue());
      }
      if (other.dataSourceType_ != 0) {
        setDataSourceTypeValue(other.getDataSourceTypeValue());
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
      com.google.ads.googleads.v9.common.CrmBasedUserListInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v9.common.CrmBasedUserListInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object appId_ = "";
    /**
     * <pre>
     * A string that uniquely identifies a mobile application from which the data
     * was collected.
     * For iOS, the ID string is the 9 digit string that appears at the end of an
     * App Store URL (e.g., "476943146" for "Flood-It! 2" whose App Store link is
     * http://itunes.apple.com/us/app/flood-it!-2/id476943146).
     * For Android, the ID string is the application's package name
     * (e.g., "com.labpixies.colordrips" for "Color Drips" given Google Play link
     * https://play.google.com/store/apps/details?id=com.labpixies.colordrips).
     * Required when creating CrmBasedUserList for uploading mobile advertising
     * IDs.
     * </pre>
     *
     * <code>optional string app_id = 4;</code>
     * @return Whether the appId field is set.
     */
    public boolean hasAppId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * A string that uniquely identifies a mobile application from which the data
     * was collected.
     * For iOS, the ID string is the 9 digit string that appears at the end of an
     * App Store URL (e.g., "476943146" for "Flood-It! 2" whose App Store link is
     * http://itunes.apple.com/us/app/flood-it!-2/id476943146).
     * For Android, the ID string is the application's package name
     * (e.g., "com.labpixies.colordrips" for "Color Drips" given Google Play link
     * https://play.google.com/store/apps/details?id=com.labpixies.colordrips).
     * Required when creating CrmBasedUserList for uploading mobile advertising
     * IDs.
     * </pre>
     *
     * <code>optional string app_id = 4;</code>
     * @return The appId.
     */
    public java.lang.String getAppId() {
      java.lang.Object ref = appId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        appId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A string that uniquely identifies a mobile application from which the data
     * was collected.
     * For iOS, the ID string is the 9 digit string that appears at the end of an
     * App Store URL (e.g., "476943146" for "Flood-It! 2" whose App Store link is
     * http://itunes.apple.com/us/app/flood-it!-2/id476943146).
     * For Android, the ID string is the application's package name
     * (e.g., "com.labpixies.colordrips" for "Color Drips" given Google Play link
     * https://play.google.com/store/apps/details?id=com.labpixies.colordrips).
     * Required when creating CrmBasedUserList for uploading mobile advertising
     * IDs.
     * </pre>
     *
     * <code>optional string app_id = 4;</code>
     * @return The bytes for appId.
     */
    public com.google.protobuf.ByteString
        getAppIdBytes() {
      java.lang.Object ref = appId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A string that uniquely identifies a mobile application from which the data
     * was collected.
     * For iOS, the ID string is the 9 digit string that appears at the end of an
     * App Store URL (e.g., "476943146" for "Flood-It! 2" whose App Store link is
     * http://itunes.apple.com/us/app/flood-it!-2/id476943146).
     * For Android, the ID string is the application's package name
     * (e.g., "com.labpixies.colordrips" for "Color Drips" given Google Play link
     * https://play.google.com/store/apps/details?id=com.labpixies.colordrips).
     * Required when creating CrmBasedUserList for uploading mobile advertising
     * IDs.
     * </pre>
     *
     * <code>optional string app_id = 4;</code>
     * @param value The appId to set.
     * @return This builder for chaining.
     */
    public Builder setAppId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      appId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A string that uniquely identifies a mobile application from which the data
     * was collected.
     * For iOS, the ID string is the 9 digit string that appears at the end of an
     * App Store URL (e.g., "476943146" for "Flood-It! 2" whose App Store link is
     * http://itunes.apple.com/us/app/flood-it!-2/id476943146).
     * For Android, the ID string is the application's package name
     * (e.g., "com.labpixies.colordrips" for "Color Drips" given Google Play link
     * https://play.google.com/store/apps/details?id=com.labpixies.colordrips).
     * Required when creating CrmBasedUserList for uploading mobile advertising
     * IDs.
     * </pre>
     *
     * <code>optional string app_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAppId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      appId_ = getDefaultInstance().getAppId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A string that uniquely identifies a mobile application from which the data
     * was collected.
     * For iOS, the ID string is the 9 digit string that appears at the end of an
     * App Store URL (e.g., "476943146" for "Flood-It! 2" whose App Store link is
     * http://itunes.apple.com/us/app/flood-it!-2/id476943146).
     * For Android, the ID string is the application's package name
     * (e.g., "com.labpixies.colordrips" for "Color Drips" given Google Play link
     * https://play.google.com/store/apps/details?id=com.labpixies.colordrips).
     * Required when creating CrmBasedUserList for uploading mobile advertising
     * IDs.
     * </pre>
     *
     * <code>optional string app_id = 4;</code>
     * @param value The bytes for appId to set.
     * @return This builder for chaining.
     */
    public Builder setAppIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      appId_ = value;
      onChanged();
      return this;
    }

    private int uploadKeyType_ = 0;
    /**
     * <pre>
     * Matching key type of the list.
     * Mixed data types are not allowed on the same list.
     * This field is required for an ADD operation.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType upload_key_type = 2;</code>
     * @return The enum numeric value on the wire for uploadKeyType.
     */
    @java.lang.Override public int getUploadKeyTypeValue() {
      return uploadKeyType_;
    }
    /**
     * <pre>
     * Matching key type of the list.
     * Mixed data types are not allowed on the same list.
     * This field is required for an ADD operation.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType upload_key_type = 2;</code>
     * @param value The enum numeric value on the wire for uploadKeyType to set.
     * @return This builder for chaining.
     */
    public Builder setUploadKeyTypeValue(int value) {
      
      uploadKeyType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Matching key type of the list.
     * Mixed data types are not allowed on the same list.
     * This field is required for an ADD operation.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType upload_key_type = 2;</code>
     * @return The uploadKeyType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v9.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType getUploadKeyType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v9.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType result = com.google.ads.googleads.v9.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType.valueOf(uploadKeyType_);
      return result == null ? com.google.ads.googleads.v9.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Matching key type of the list.
     * Mixed data types are not allowed on the same list.
     * This field is required for an ADD operation.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType upload_key_type = 2;</code>
     * @param value The uploadKeyType to set.
     * @return This builder for chaining.
     */
    public Builder setUploadKeyType(com.google.ads.googleads.v9.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      uploadKeyType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Matching key type of the list.
     * Mixed data types are not allowed on the same list.
     * This field is required for an ADD operation.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType upload_key_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUploadKeyType() {
      
      uploadKeyType_ = 0;
      onChanged();
      return this;
    }

    private int dataSourceType_ = 0;
    /**
     * <pre>
     * Data source of the list. Default value is FIRST_PARTY.
     * Only customers on the allow-list can create third-party sourced CRM lists.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType data_source_type = 3;</code>
     * @return The enum numeric value on the wire for dataSourceType.
     */
    @java.lang.Override public int getDataSourceTypeValue() {
      return dataSourceType_;
    }
    /**
     * <pre>
     * Data source of the list. Default value is FIRST_PARTY.
     * Only customers on the allow-list can create third-party sourced CRM lists.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType data_source_type = 3;</code>
     * @param value The enum numeric value on the wire for dataSourceType to set.
     * @return This builder for chaining.
     */
    public Builder setDataSourceTypeValue(int value) {
      
      dataSourceType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Data source of the list. Default value is FIRST_PARTY.
     * Only customers on the allow-list can create third-party sourced CRM lists.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType data_source_type = 3;</code>
     * @return The dataSourceType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v9.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType getDataSourceType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v9.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType result = com.google.ads.googleads.v9.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType.valueOf(dataSourceType_);
      return result == null ? com.google.ads.googleads.v9.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Data source of the list. Default value is FIRST_PARTY.
     * Only customers on the allow-list can create third-party sourced CRM lists.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType data_source_type = 3;</code>
     * @param value The dataSourceType to set.
     * @return This builder for chaining.
     */
    public Builder setDataSourceType(com.google.ads.googleads.v9.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dataSourceType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Data source of the list. Default value is FIRST_PARTY.
     * Only customers on the allow-list can create third-party sourced CRM lists.
     * </pre>
     *
     * <code>.google.ads.googleads.v9.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType data_source_type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataSourceType() {
      
      dataSourceType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v9.common.CrmBasedUserListInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v9.common.CrmBasedUserListInfo)
  private static final com.google.ads.googleads.v9.common.CrmBasedUserListInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v9.common.CrmBasedUserListInfo();
  }

  public static com.google.ads.googleads.v9.common.CrmBasedUserListInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CrmBasedUserListInfo>
      PARSER = new com.google.protobuf.AbstractParser<CrmBasedUserListInfo>() {
    @java.lang.Override
    public CrmBasedUserListInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CrmBasedUserListInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CrmBasedUserListInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CrmBasedUserListInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v9.common.CrmBasedUserListInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

