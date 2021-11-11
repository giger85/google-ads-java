// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/errors/media_upload_error.proto

package com.google.ads.googleads.v9.errors;

/**
 * <pre>
 * Container for enum describing possible media uploading errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v9.errors.MediaUploadErrorEnum}
 */
public final class MediaUploadErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v9.errors.MediaUploadErrorEnum)
    MediaUploadErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MediaUploadErrorEnum.newBuilder() to construct.
  private MediaUploadErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MediaUploadErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MediaUploadErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MediaUploadErrorEnum(
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
    return com.google.ads.googleads.v9.errors.MediaUploadErrorProto.internal_static_google_ads_googleads_v9_errors_MediaUploadErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v9.errors.MediaUploadErrorProto.internal_static_google_ads_googleads_v9_errors_MediaUploadErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v9.errors.MediaUploadErrorEnum.class, com.google.ads.googleads.v9.errors.MediaUploadErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible media uploading errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v9.errors.MediaUploadErrorEnum.MediaUploadError}
   */
  public enum MediaUploadError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The uploaded file is too big.
     * </pre>
     *
     * <code>FILE_TOO_BIG = 2;</code>
     */
    FILE_TOO_BIG(2),
    /**
     * <pre>
     * Image data is unparseable.
     * </pre>
     *
     * <code>UNPARSEABLE_IMAGE = 3;</code>
     */
    UNPARSEABLE_IMAGE(3),
    /**
     * <pre>
     * Animated images are not allowed.
     * </pre>
     *
     * <code>ANIMATED_IMAGE_NOT_ALLOWED = 4;</code>
     */
    ANIMATED_IMAGE_NOT_ALLOWED(4),
    /**
     * <pre>
     * The image or media bundle format is not allowed.
     * </pre>
     *
     * <code>FORMAT_NOT_ALLOWED = 5;</code>
     */
    FORMAT_NOT_ALLOWED(5),
    /**
     * <pre>
     * Cannot reference URL external to the media bundle.
     * </pre>
     *
     * <code>EXTERNAL_URL_NOT_ALLOWED = 6;</code>
     */
    EXTERNAL_URL_NOT_ALLOWED(6),
    /**
     * <pre>
     * HTML5 ad is trying to reference an asset not in .ZIP file.
     * </pre>
     *
     * <code>INVALID_URL_REFERENCE = 7;</code>
     */
    INVALID_URL_REFERENCE(7),
    /**
     * <pre>
     * The media bundle contains no primary entry.
     * </pre>
     *
     * <code>MISSING_PRIMARY_MEDIA_BUNDLE_ENTRY = 8;</code>
     */
    MISSING_PRIMARY_MEDIA_BUNDLE_ENTRY(8),
    /**
     * <pre>
     * Animation has disallowed visual effects.
     * </pre>
     *
     * <code>ANIMATED_VISUAL_EFFECT = 9;</code>
     */
    ANIMATED_VISUAL_EFFECT(9),
    /**
     * <pre>
     * Animation longer than the allowed 30 second limit.
     * </pre>
     *
     * <code>ANIMATION_TOO_LONG = 10;</code>
     */
    ANIMATION_TOO_LONG(10),
    /**
     * <pre>
     * The aspect ratio of the image does not match the expected aspect ratios
     * provided in the asset spec.
     * </pre>
     *
     * <code>ASPECT_RATIO_NOT_ALLOWED = 11;</code>
     */
    ASPECT_RATIO_NOT_ALLOWED(11),
    /**
     * <pre>
     * Audio files are not allowed in bundle.
     * </pre>
     *
     * <code>AUDIO_NOT_ALLOWED_IN_MEDIA_BUNDLE = 12;</code>
     */
    AUDIO_NOT_ALLOWED_IN_MEDIA_BUNDLE(12),
    /**
     * <pre>
     * CMYK jpegs are not supported.
     * </pre>
     *
     * <code>CMYK_JPEG_NOT_ALLOWED = 13;</code>
     */
    CMYK_JPEG_NOT_ALLOWED(13),
    /**
     * <pre>
     * Flash movies are not allowed.
     * </pre>
     *
     * <code>FLASH_NOT_ALLOWED = 14;</code>
     */
    FLASH_NOT_ALLOWED(14),
    /**
     * <pre>
     * The frame rate of the video is higher than the allowed 5fps.
     * </pre>
     *
     * <code>FRAME_RATE_TOO_HIGH = 15;</code>
     */
    FRAME_RATE_TOO_HIGH(15),
    /**
     * <pre>
     * ZIP file from Google Web Designer is not published.
     * </pre>
     *
     * <code>GOOGLE_WEB_DESIGNER_ZIP_FILE_NOT_PUBLISHED = 16;</code>
     */
    GOOGLE_WEB_DESIGNER_ZIP_FILE_NOT_PUBLISHED(16),
    /**
     * <pre>
     * Image constraints are violated, but more details (like
     * DIMENSIONS_NOT_ALLOWED or ASPECT_RATIO_NOT_ALLOWED) can not be provided.
     * This happens when asset spec contains more than one constraint and
     * criteria of different constraints are violated.
     * </pre>
     *
     * <code>IMAGE_CONSTRAINTS_VIOLATED = 17;</code>
     */
    IMAGE_CONSTRAINTS_VIOLATED(17),
    /**
     * <pre>
     * Media bundle data is unrecognizable.
     * </pre>
     *
     * <code>INVALID_MEDIA_BUNDLE = 18;</code>
     */
    INVALID_MEDIA_BUNDLE(18),
    /**
     * <pre>
     * There was a problem with one or more of the media bundle entries.
     * </pre>
     *
     * <code>INVALID_MEDIA_BUNDLE_ENTRY = 19;</code>
     */
    INVALID_MEDIA_BUNDLE_ENTRY(19),
    /**
     * <pre>
     * The asset has an invalid mime type.
     * </pre>
     *
     * <code>INVALID_MIME_TYPE = 20;</code>
     */
    INVALID_MIME_TYPE(20),
    /**
     * <pre>
     * The media bundle contains an invalid asset path.
     * </pre>
     *
     * <code>INVALID_PATH = 21;</code>
     */
    INVALID_PATH(21),
    /**
     * <pre>
     * Image has layout problem.
     * </pre>
     *
     * <code>LAYOUT_PROBLEM = 22;</code>
     */
    LAYOUT_PROBLEM(22),
    /**
     * <pre>
     * An asset had a URL reference that is malformed per RFC 1738 convention.
     * </pre>
     *
     * <code>MALFORMED_URL = 23;</code>
     */
    MALFORMED_URL(23),
    /**
     * <pre>
     * The uploaded media bundle format is not allowed.
     * </pre>
     *
     * <code>MEDIA_BUNDLE_NOT_ALLOWED = 24;</code>
     */
    MEDIA_BUNDLE_NOT_ALLOWED(24),
    /**
     * <pre>
     * The media bundle is not compatible with the asset spec product type.
     * (E.g. Gmail, dynamic remarketing, etc.)
     * </pre>
     *
     * <code>MEDIA_BUNDLE_NOT_COMPATIBLE_TO_PRODUCT_TYPE = 25;</code>
     */
    MEDIA_BUNDLE_NOT_COMPATIBLE_TO_PRODUCT_TYPE(25),
    /**
     * <pre>
     * A bundle being uploaded that is incompatible with multiple assets for
     * different reasons.
     * </pre>
     *
     * <code>MEDIA_BUNDLE_REJECTED_BY_MULTIPLE_ASSET_SPECS = 26;</code>
     */
    MEDIA_BUNDLE_REJECTED_BY_MULTIPLE_ASSET_SPECS(26),
    /**
     * <pre>
     * The media bundle contains too many files.
     * </pre>
     *
     * <code>TOO_MANY_FILES_IN_MEDIA_BUNDLE = 27;</code>
     */
    TOO_MANY_FILES_IN_MEDIA_BUNDLE(27),
    /**
     * <pre>
     * Google Web Designer not created for "Google Ads" environment.
     * </pre>
     *
     * <code>UNSUPPORTED_GOOGLE_WEB_DESIGNER_ENVIRONMENT = 28;</code>
     */
    UNSUPPORTED_GOOGLE_WEB_DESIGNER_ENVIRONMENT(28),
    /**
     * <pre>
     * Unsupported HTML5 feature in HTML5 asset.
     * </pre>
     *
     * <code>UNSUPPORTED_HTML5_FEATURE = 29;</code>
     */
    UNSUPPORTED_HTML5_FEATURE(29),
    /**
     * <pre>
     * URL in HTML5 entry is not SSL compliant.
     * </pre>
     *
     * <code>URL_IN_MEDIA_BUNDLE_NOT_SSL_COMPLIANT = 30;</code>
     */
    URL_IN_MEDIA_BUNDLE_NOT_SSL_COMPLIANT(30),
    /**
     * <pre>
     * Video file name is longer than the 50 allowed characters.
     * </pre>
     *
     * <code>VIDEO_FILE_NAME_TOO_LONG = 31;</code>
     */
    VIDEO_FILE_NAME_TOO_LONG(31),
    /**
     * <pre>
     * Multiple videos with same name in a bundle.
     * </pre>
     *
     * <code>VIDEO_MULTIPLE_FILES_WITH_SAME_NAME = 32;</code>
     */
    VIDEO_MULTIPLE_FILES_WITH_SAME_NAME(32),
    /**
     * <pre>
     * Videos are not allowed in media bundle.
     * </pre>
     *
     * <code>VIDEO_NOT_ALLOWED_IN_MEDIA_BUNDLE = 33;</code>
     */
    VIDEO_NOT_ALLOWED_IN_MEDIA_BUNDLE(33),
    /**
     * <pre>
     * This type of media cannot be uploaded through the Google Ads API.
     * </pre>
     *
     * <code>CANNOT_UPLOAD_MEDIA_TYPE_THROUGH_API = 34;</code>
     */
    CANNOT_UPLOAD_MEDIA_TYPE_THROUGH_API(34),
    /**
     * <pre>
     * The dimensions of the image are not allowed.
     * </pre>
     *
     * <code>DIMENSIONS_NOT_ALLOWED = 35;</code>
     */
    DIMENSIONS_NOT_ALLOWED(35),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The uploaded file is too big.
     * </pre>
     *
     * <code>FILE_TOO_BIG = 2;</code>
     */
    public static final int FILE_TOO_BIG_VALUE = 2;
    /**
     * <pre>
     * Image data is unparseable.
     * </pre>
     *
     * <code>UNPARSEABLE_IMAGE = 3;</code>
     */
    public static final int UNPARSEABLE_IMAGE_VALUE = 3;
    /**
     * <pre>
     * Animated images are not allowed.
     * </pre>
     *
     * <code>ANIMATED_IMAGE_NOT_ALLOWED = 4;</code>
     */
    public static final int ANIMATED_IMAGE_NOT_ALLOWED_VALUE = 4;
    /**
     * <pre>
     * The image or media bundle format is not allowed.
     * </pre>
     *
     * <code>FORMAT_NOT_ALLOWED = 5;</code>
     */
    public static final int FORMAT_NOT_ALLOWED_VALUE = 5;
    /**
     * <pre>
     * Cannot reference URL external to the media bundle.
     * </pre>
     *
     * <code>EXTERNAL_URL_NOT_ALLOWED = 6;</code>
     */
    public static final int EXTERNAL_URL_NOT_ALLOWED_VALUE = 6;
    /**
     * <pre>
     * HTML5 ad is trying to reference an asset not in .ZIP file.
     * </pre>
     *
     * <code>INVALID_URL_REFERENCE = 7;</code>
     */
    public static final int INVALID_URL_REFERENCE_VALUE = 7;
    /**
     * <pre>
     * The media bundle contains no primary entry.
     * </pre>
     *
     * <code>MISSING_PRIMARY_MEDIA_BUNDLE_ENTRY = 8;</code>
     */
    public static final int MISSING_PRIMARY_MEDIA_BUNDLE_ENTRY_VALUE = 8;
    /**
     * <pre>
     * Animation has disallowed visual effects.
     * </pre>
     *
     * <code>ANIMATED_VISUAL_EFFECT = 9;</code>
     */
    public static final int ANIMATED_VISUAL_EFFECT_VALUE = 9;
    /**
     * <pre>
     * Animation longer than the allowed 30 second limit.
     * </pre>
     *
     * <code>ANIMATION_TOO_LONG = 10;</code>
     */
    public static final int ANIMATION_TOO_LONG_VALUE = 10;
    /**
     * <pre>
     * The aspect ratio of the image does not match the expected aspect ratios
     * provided in the asset spec.
     * </pre>
     *
     * <code>ASPECT_RATIO_NOT_ALLOWED = 11;</code>
     */
    public static final int ASPECT_RATIO_NOT_ALLOWED_VALUE = 11;
    /**
     * <pre>
     * Audio files are not allowed in bundle.
     * </pre>
     *
     * <code>AUDIO_NOT_ALLOWED_IN_MEDIA_BUNDLE = 12;</code>
     */
    public static final int AUDIO_NOT_ALLOWED_IN_MEDIA_BUNDLE_VALUE = 12;
    /**
     * <pre>
     * CMYK jpegs are not supported.
     * </pre>
     *
     * <code>CMYK_JPEG_NOT_ALLOWED = 13;</code>
     */
    public static final int CMYK_JPEG_NOT_ALLOWED_VALUE = 13;
    /**
     * <pre>
     * Flash movies are not allowed.
     * </pre>
     *
     * <code>FLASH_NOT_ALLOWED = 14;</code>
     */
    public static final int FLASH_NOT_ALLOWED_VALUE = 14;
    /**
     * <pre>
     * The frame rate of the video is higher than the allowed 5fps.
     * </pre>
     *
     * <code>FRAME_RATE_TOO_HIGH = 15;</code>
     */
    public static final int FRAME_RATE_TOO_HIGH_VALUE = 15;
    /**
     * <pre>
     * ZIP file from Google Web Designer is not published.
     * </pre>
     *
     * <code>GOOGLE_WEB_DESIGNER_ZIP_FILE_NOT_PUBLISHED = 16;</code>
     */
    public static final int GOOGLE_WEB_DESIGNER_ZIP_FILE_NOT_PUBLISHED_VALUE = 16;
    /**
     * <pre>
     * Image constraints are violated, but more details (like
     * DIMENSIONS_NOT_ALLOWED or ASPECT_RATIO_NOT_ALLOWED) can not be provided.
     * This happens when asset spec contains more than one constraint and
     * criteria of different constraints are violated.
     * </pre>
     *
     * <code>IMAGE_CONSTRAINTS_VIOLATED = 17;</code>
     */
    public static final int IMAGE_CONSTRAINTS_VIOLATED_VALUE = 17;
    /**
     * <pre>
     * Media bundle data is unrecognizable.
     * </pre>
     *
     * <code>INVALID_MEDIA_BUNDLE = 18;</code>
     */
    public static final int INVALID_MEDIA_BUNDLE_VALUE = 18;
    /**
     * <pre>
     * There was a problem with one or more of the media bundle entries.
     * </pre>
     *
     * <code>INVALID_MEDIA_BUNDLE_ENTRY = 19;</code>
     */
    public static final int INVALID_MEDIA_BUNDLE_ENTRY_VALUE = 19;
    /**
     * <pre>
     * The asset has an invalid mime type.
     * </pre>
     *
     * <code>INVALID_MIME_TYPE = 20;</code>
     */
    public static final int INVALID_MIME_TYPE_VALUE = 20;
    /**
     * <pre>
     * The media bundle contains an invalid asset path.
     * </pre>
     *
     * <code>INVALID_PATH = 21;</code>
     */
    public static final int INVALID_PATH_VALUE = 21;
    /**
     * <pre>
     * Image has layout problem.
     * </pre>
     *
     * <code>LAYOUT_PROBLEM = 22;</code>
     */
    public static final int LAYOUT_PROBLEM_VALUE = 22;
    /**
     * <pre>
     * An asset had a URL reference that is malformed per RFC 1738 convention.
     * </pre>
     *
     * <code>MALFORMED_URL = 23;</code>
     */
    public static final int MALFORMED_URL_VALUE = 23;
    /**
     * <pre>
     * The uploaded media bundle format is not allowed.
     * </pre>
     *
     * <code>MEDIA_BUNDLE_NOT_ALLOWED = 24;</code>
     */
    public static final int MEDIA_BUNDLE_NOT_ALLOWED_VALUE = 24;
    /**
     * <pre>
     * The media bundle is not compatible with the asset spec product type.
     * (E.g. Gmail, dynamic remarketing, etc.)
     * </pre>
     *
     * <code>MEDIA_BUNDLE_NOT_COMPATIBLE_TO_PRODUCT_TYPE = 25;</code>
     */
    public static final int MEDIA_BUNDLE_NOT_COMPATIBLE_TO_PRODUCT_TYPE_VALUE = 25;
    /**
     * <pre>
     * A bundle being uploaded that is incompatible with multiple assets for
     * different reasons.
     * </pre>
     *
     * <code>MEDIA_BUNDLE_REJECTED_BY_MULTIPLE_ASSET_SPECS = 26;</code>
     */
    public static final int MEDIA_BUNDLE_REJECTED_BY_MULTIPLE_ASSET_SPECS_VALUE = 26;
    /**
     * <pre>
     * The media bundle contains too many files.
     * </pre>
     *
     * <code>TOO_MANY_FILES_IN_MEDIA_BUNDLE = 27;</code>
     */
    public static final int TOO_MANY_FILES_IN_MEDIA_BUNDLE_VALUE = 27;
    /**
     * <pre>
     * Google Web Designer not created for "Google Ads" environment.
     * </pre>
     *
     * <code>UNSUPPORTED_GOOGLE_WEB_DESIGNER_ENVIRONMENT = 28;</code>
     */
    public static final int UNSUPPORTED_GOOGLE_WEB_DESIGNER_ENVIRONMENT_VALUE = 28;
    /**
     * <pre>
     * Unsupported HTML5 feature in HTML5 asset.
     * </pre>
     *
     * <code>UNSUPPORTED_HTML5_FEATURE = 29;</code>
     */
    public static final int UNSUPPORTED_HTML5_FEATURE_VALUE = 29;
    /**
     * <pre>
     * URL in HTML5 entry is not SSL compliant.
     * </pre>
     *
     * <code>URL_IN_MEDIA_BUNDLE_NOT_SSL_COMPLIANT = 30;</code>
     */
    public static final int URL_IN_MEDIA_BUNDLE_NOT_SSL_COMPLIANT_VALUE = 30;
    /**
     * <pre>
     * Video file name is longer than the 50 allowed characters.
     * </pre>
     *
     * <code>VIDEO_FILE_NAME_TOO_LONG = 31;</code>
     */
    public static final int VIDEO_FILE_NAME_TOO_LONG_VALUE = 31;
    /**
     * <pre>
     * Multiple videos with same name in a bundle.
     * </pre>
     *
     * <code>VIDEO_MULTIPLE_FILES_WITH_SAME_NAME = 32;</code>
     */
    public static final int VIDEO_MULTIPLE_FILES_WITH_SAME_NAME_VALUE = 32;
    /**
     * <pre>
     * Videos are not allowed in media bundle.
     * </pre>
     *
     * <code>VIDEO_NOT_ALLOWED_IN_MEDIA_BUNDLE = 33;</code>
     */
    public static final int VIDEO_NOT_ALLOWED_IN_MEDIA_BUNDLE_VALUE = 33;
    /**
     * <pre>
     * This type of media cannot be uploaded through the Google Ads API.
     * </pre>
     *
     * <code>CANNOT_UPLOAD_MEDIA_TYPE_THROUGH_API = 34;</code>
     */
    public static final int CANNOT_UPLOAD_MEDIA_TYPE_THROUGH_API_VALUE = 34;
    /**
     * <pre>
     * The dimensions of the image are not allowed.
     * </pre>
     *
     * <code>DIMENSIONS_NOT_ALLOWED = 35;</code>
     */
    public static final int DIMENSIONS_NOT_ALLOWED_VALUE = 35;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MediaUploadError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MediaUploadError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return FILE_TOO_BIG;
        case 3: return UNPARSEABLE_IMAGE;
        case 4: return ANIMATED_IMAGE_NOT_ALLOWED;
        case 5: return FORMAT_NOT_ALLOWED;
        case 6: return EXTERNAL_URL_NOT_ALLOWED;
        case 7: return INVALID_URL_REFERENCE;
        case 8: return MISSING_PRIMARY_MEDIA_BUNDLE_ENTRY;
        case 9: return ANIMATED_VISUAL_EFFECT;
        case 10: return ANIMATION_TOO_LONG;
        case 11: return ASPECT_RATIO_NOT_ALLOWED;
        case 12: return AUDIO_NOT_ALLOWED_IN_MEDIA_BUNDLE;
        case 13: return CMYK_JPEG_NOT_ALLOWED;
        case 14: return FLASH_NOT_ALLOWED;
        case 15: return FRAME_RATE_TOO_HIGH;
        case 16: return GOOGLE_WEB_DESIGNER_ZIP_FILE_NOT_PUBLISHED;
        case 17: return IMAGE_CONSTRAINTS_VIOLATED;
        case 18: return INVALID_MEDIA_BUNDLE;
        case 19: return INVALID_MEDIA_BUNDLE_ENTRY;
        case 20: return INVALID_MIME_TYPE;
        case 21: return INVALID_PATH;
        case 22: return LAYOUT_PROBLEM;
        case 23: return MALFORMED_URL;
        case 24: return MEDIA_BUNDLE_NOT_ALLOWED;
        case 25: return MEDIA_BUNDLE_NOT_COMPATIBLE_TO_PRODUCT_TYPE;
        case 26: return MEDIA_BUNDLE_REJECTED_BY_MULTIPLE_ASSET_SPECS;
        case 27: return TOO_MANY_FILES_IN_MEDIA_BUNDLE;
        case 28: return UNSUPPORTED_GOOGLE_WEB_DESIGNER_ENVIRONMENT;
        case 29: return UNSUPPORTED_HTML5_FEATURE;
        case 30: return URL_IN_MEDIA_BUNDLE_NOT_SSL_COMPLIANT;
        case 31: return VIDEO_FILE_NAME_TOO_LONG;
        case 32: return VIDEO_MULTIPLE_FILES_WITH_SAME_NAME;
        case 33: return VIDEO_NOT_ALLOWED_IN_MEDIA_BUNDLE;
        case 34: return CANNOT_UPLOAD_MEDIA_TYPE_THROUGH_API;
        case 35: return DIMENSIONS_NOT_ALLOWED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MediaUploadError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MediaUploadError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MediaUploadError>() {
            public MediaUploadError findValueByNumber(int number) {
              return MediaUploadError.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v9.errors.MediaUploadErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final MediaUploadError[] VALUES = values();

    public static MediaUploadError valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MediaUploadError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v9.errors.MediaUploadErrorEnum.MediaUploadError)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v9.errors.MediaUploadErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v9.errors.MediaUploadErrorEnum other = (com.google.ads.googleads.v9.errors.MediaUploadErrorEnum) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v9.errors.MediaUploadErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.errors.MediaUploadErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.MediaUploadErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.errors.MediaUploadErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.MediaUploadErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.errors.MediaUploadErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.MediaUploadErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.errors.MediaUploadErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.MediaUploadErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.errors.MediaUploadErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.errors.MediaUploadErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.errors.MediaUploadErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v9.errors.MediaUploadErrorEnum prototype) {
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
   * Container for enum describing possible media uploading errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v9.errors.MediaUploadErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v9.errors.MediaUploadErrorEnum)
      com.google.ads.googleads.v9.errors.MediaUploadErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v9.errors.MediaUploadErrorProto.internal_static_google_ads_googleads_v9_errors_MediaUploadErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v9.errors.MediaUploadErrorProto.internal_static_google_ads_googleads_v9_errors_MediaUploadErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v9.errors.MediaUploadErrorEnum.class, com.google.ads.googleads.v9.errors.MediaUploadErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v9.errors.MediaUploadErrorEnum.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v9.errors.MediaUploadErrorProto.internal_static_google_ads_googleads_v9_errors_MediaUploadErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.errors.MediaUploadErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v9.errors.MediaUploadErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.errors.MediaUploadErrorEnum build() {
      com.google.ads.googleads.v9.errors.MediaUploadErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.errors.MediaUploadErrorEnum buildPartial() {
      com.google.ads.googleads.v9.errors.MediaUploadErrorEnum result = new com.google.ads.googleads.v9.errors.MediaUploadErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v9.errors.MediaUploadErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v9.errors.MediaUploadErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v9.errors.MediaUploadErrorEnum other) {
      if (other == com.google.ads.googleads.v9.errors.MediaUploadErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v9.errors.MediaUploadErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v9.errors.MediaUploadErrorEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v9.errors.MediaUploadErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v9.errors.MediaUploadErrorEnum)
  private static final com.google.ads.googleads.v9.errors.MediaUploadErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v9.errors.MediaUploadErrorEnum();
  }

  public static com.google.ads.googleads.v9.errors.MediaUploadErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MediaUploadErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<MediaUploadErrorEnum>() {
    @java.lang.Override
    public MediaUploadErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MediaUploadErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MediaUploadErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MediaUploadErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v9.errors.MediaUploadErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

