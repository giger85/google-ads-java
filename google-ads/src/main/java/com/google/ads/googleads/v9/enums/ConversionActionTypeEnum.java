// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/enums/conversion_action_type.proto

package com.google.ads.googleads.v9.enums;

/**
 * <pre>
 * Container for enum describing possible types of a conversion action.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v9.enums.ConversionActionTypeEnum}
 */
public final class ConversionActionTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v9.enums.ConversionActionTypeEnum)
    ConversionActionTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConversionActionTypeEnum.newBuilder() to construct.
  private ConversionActionTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConversionActionTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConversionActionTypeEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConversionActionTypeEnum(
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
    return com.google.ads.googleads.v9.enums.ConversionActionTypeProto.internal_static_google_ads_googleads_v9_enums_ConversionActionTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v9.enums.ConversionActionTypeProto.internal_static_google_ads_googleads_v9_enums_ConversionActionTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v9.enums.ConversionActionTypeEnum.class, com.google.ads.googleads.v9.enums.ConversionActionTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Possible types of a conversion action.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v9.enums.ConversionActionTypeEnum.ConversionActionType}
   */
  public enum ConversionActionType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Conversions that occur when a user clicks on an ad's call extension.
     * </pre>
     *
     * <code>AD_CALL = 2;</code>
     */
    AD_CALL(2),
    /**
     * <pre>
     * Conversions that occur when a user on a mobile device clicks a phone
     * number.
     * </pre>
     *
     * <code>CLICK_TO_CALL = 3;</code>
     */
    CLICK_TO_CALL(3),
    /**
     * <pre>
     * Conversions that occur when a user downloads a mobile app from the Google
     * Play Store.
     * </pre>
     *
     * <code>GOOGLE_PLAY_DOWNLOAD = 4;</code>
     */
    GOOGLE_PLAY_DOWNLOAD(4),
    /**
     * <pre>
     * Conversions that occur when a user makes a purchase in an app through
     * Android billing.
     * </pre>
     *
     * <code>GOOGLE_PLAY_IN_APP_PURCHASE = 5;</code>
     */
    GOOGLE_PLAY_IN_APP_PURCHASE(5),
    /**
     * <pre>
     * Call conversions that are tracked by the advertiser and uploaded.
     * </pre>
     *
     * <code>UPLOAD_CALLS = 6;</code>
     */
    UPLOAD_CALLS(6),
    /**
     * <pre>
     * Conversions that are tracked by the advertiser and uploaded with
     * attributed clicks.
     * </pre>
     *
     * <code>UPLOAD_CLICKS = 7;</code>
     */
    UPLOAD_CLICKS(7),
    /**
     * <pre>
     * Conversions that occur on a webpage.
     * </pre>
     *
     * <code>WEBPAGE = 8;</code>
     */
    WEBPAGE(8),
    /**
     * <pre>
     * Conversions that occur when a user calls a dynamically-generated phone
     * number from an advertiser's website.
     * </pre>
     *
     * <code>WEBSITE_CALL = 9;</code>
     */
    WEBSITE_CALL(9),
    /**
     * <pre>
     * Store Sales conversion based on first-party or third-party merchant
     * data uploads.
     * Only customers on the allowlist can use store sales direct upload types.
     * </pre>
     *
     * <code>STORE_SALES_DIRECT_UPLOAD = 10;</code>
     */
    STORE_SALES_DIRECT_UPLOAD(10),
    /**
     * <pre>
     * Store Sales conversion based on first-party or third-party merchant
     * data uploads and/or from in-store purchases using cards from payment
     * networks.
     * Only customers on the allowlist can use store sales types.
     * Read only.
     * </pre>
     *
     * <code>STORE_SALES = 11;</code>
     */
    STORE_SALES(11),
    /**
     * <pre>
     * Android app first open conversions tracked via Firebase.
     * </pre>
     *
     * <code>FIREBASE_ANDROID_FIRST_OPEN = 12;</code>
     */
    FIREBASE_ANDROID_FIRST_OPEN(12),
    /**
     * <pre>
     * Android app in app purchase conversions tracked via Firebase.
     * </pre>
     *
     * <code>FIREBASE_ANDROID_IN_APP_PURCHASE = 13;</code>
     */
    FIREBASE_ANDROID_IN_APP_PURCHASE(13),
    /**
     * <pre>
     * Android app custom conversions tracked via Firebase.
     * </pre>
     *
     * <code>FIREBASE_ANDROID_CUSTOM = 14;</code>
     */
    FIREBASE_ANDROID_CUSTOM(14),
    /**
     * <pre>
     * iOS app first open conversions tracked via Firebase.
     * </pre>
     *
     * <code>FIREBASE_IOS_FIRST_OPEN = 15;</code>
     */
    FIREBASE_IOS_FIRST_OPEN(15),
    /**
     * <pre>
     * iOS app in app purchase conversions tracked via Firebase.
     * </pre>
     *
     * <code>FIREBASE_IOS_IN_APP_PURCHASE = 16;</code>
     */
    FIREBASE_IOS_IN_APP_PURCHASE(16),
    /**
     * <pre>
     * iOS app custom conversions tracked via Firebase.
     * </pre>
     *
     * <code>FIREBASE_IOS_CUSTOM = 17;</code>
     */
    FIREBASE_IOS_CUSTOM(17),
    /**
     * <pre>
     * Android app first open conversions tracked via Third Party App Analytics.
     * </pre>
     *
     * <code>THIRD_PARTY_APP_ANALYTICS_ANDROID_FIRST_OPEN = 18;</code>
     */
    THIRD_PARTY_APP_ANALYTICS_ANDROID_FIRST_OPEN(18),
    /**
     * <pre>
     * Android app in app purchase conversions tracked via Third Party App
     * Analytics.
     * </pre>
     *
     * <code>THIRD_PARTY_APP_ANALYTICS_ANDROID_IN_APP_PURCHASE = 19;</code>
     */
    THIRD_PARTY_APP_ANALYTICS_ANDROID_IN_APP_PURCHASE(19),
    /**
     * <pre>
     * Android app custom conversions tracked via Third Party App Analytics.
     * </pre>
     *
     * <code>THIRD_PARTY_APP_ANALYTICS_ANDROID_CUSTOM = 20;</code>
     */
    THIRD_PARTY_APP_ANALYTICS_ANDROID_CUSTOM(20),
    /**
     * <pre>
     * iOS app first open conversions tracked via Third Party App Analytics.
     * </pre>
     *
     * <code>THIRD_PARTY_APP_ANALYTICS_IOS_FIRST_OPEN = 21;</code>
     */
    THIRD_PARTY_APP_ANALYTICS_IOS_FIRST_OPEN(21),
    /**
     * <pre>
     * iOS app in app purchase conversions tracked via Third Party App
     * Analytics.
     * </pre>
     *
     * <code>THIRD_PARTY_APP_ANALYTICS_IOS_IN_APP_PURCHASE = 22;</code>
     */
    THIRD_PARTY_APP_ANALYTICS_IOS_IN_APP_PURCHASE(22),
    /**
     * <pre>
     * iOS app custom conversions tracked via Third Party App Analytics.
     * </pre>
     *
     * <code>THIRD_PARTY_APP_ANALYTICS_IOS_CUSTOM = 23;</code>
     */
    THIRD_PARTY_APP_ANALYTICS_IOS_CUSTOM(23),
    /**
     * <pre>
     * Conversions that occur when a user pre-registers a mobile app from the
     * Google Play Store. Read only.
     * </pre>
     *
     * <code>ANDROID_APP_PRE_REGISTRATION = 24;</code>
     */
    ANDROID_APP_PRE_REGISTRATION(24),
    /**
     * <pre>
     * Conversions that track all Google Play downloads which aren't tracked
     * by an app-specific type. Read only.
     * </pre>
     *
     * <code>ANDROID_INSTALLS_ALL_OTHER_APPS = 25;</code>
     */
    ANDROID_INSTALLS_ALL_OTHER_APPS(25),
    /**
     * <pre>
     * Floodlight activity that counts the number of times that users have
     * visited a particular webpage after seeing or clicking on one of
     * an advertiser's ads. Read only.
     * </pre>
     *
     * <code>FLOODLIGHT_ACTION = 26;</code>
     */
    FLOODLIGHT_ACTION(26),
    /**
     * <pre>
     * Floodlight activity that tracks the number of sales made or the number
     * of items purchased. Can also capture the total value of each sale.
     * Read only.
     * </pre>
     *
     * <code>FLOODLIGHT_TRANSACTION = 27;</code>
     */
    FLOODLIGHT_TRANSACTION(27),
    /**
     * <pre>
     * Conversions that track local actions from Google's products and
     * services after interacting with an ad. Read only.
     * </pre>
     *
     * <code>GOOGLE_HOSTED = 28;</code>
     */
    GOOGLE_HOSTED(28),
    /**
     * <pre>
     * Conversions reported when a user submits a lead form. Read only.
     * </pre>
     *
     * <code>LEAD_FORM_SUBMIT = 29;</code>
     */
    LEAD_FORM_SUBMIT(29),
    /**
     * <pre>
     * Conversions that come from Salesforce. Read only.
     * </pre>
     *
     * <code>SALESFORCE = 30;</code>
     */
    SALESFORCE(30),
    /**
     * <pre>
     * Conversions imported from Search Ads 360 Floodlight data. Read only.
     * </pre>
     *
     * <code>SEARCH_ADS_360 = 31;</code>
     */
    SEARCH_ADS_360(31),
    /**
     * <pre>
     * Call conversions that occur on Smart campaign Ads without call tracking
     * setup, using Smart campaign custom criteria. Read only.
     * </pre>
     *
     * <code>SMART_CAMPAIGN_AD_CLICKS_TO_CALL = 32;</code>
     */
    SMART_CAMPAIGN_AD_CLICKS_TO_CALL(32),
    /**
     * <pre>
     * The user clicks on a call element within Google Maps. Smart campaign
     * only. Read only.
     * </pre>
     *
     * <code>SMART_CAMPAIGN_MAP_CLICKS_TO_CALL = 33;</code>
     */
    SMART_CAMPAIGN_MAP_CLICKS_TO_CALL(33),
    /**
     * <pre>
     * The user requests directions to a business location within Google Maps.
     * Smart campaign only. Read only.
     * </pre>
     *
     * <code>SMART_CAMPAIGN_MAP_DIRECTIONS = 34;</code>
     */
    SMART_CAMPAIGN_MAP_DIRECTIONS(34),
    /**
     * <pre>
     * Call conversions that occur on Smart campaign Ads with call tracking
     * setup, using Smart campaign custom criteria. Read only.
     * </pre>
     *
     * <code>SMART_CAMPAIGN_TRACKED_CALLS = 35;</code>
     */
    SMART_CAMPAIGN_TRACKED_CALLS(35),
    /**
     * <pre>
     * Conversions that occur when a user visits an advertiser's retail store.
     * Read only.
     * </pre>
     *
     * <code>STORE_VISITS = 36;</code>
     */
    STORE_VISITS(36),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Conversions that occur when a user clicks on an ad's call extension.
     * </pre>
     *
     * <code>AD_CALL = 2;</code>
     */
    public static final int AD_CALL_VALUE = 2;
    /**
     * <pre>
     * Conversions that occur when a user on a mobile device clicks a phone
     * number.
     * </pre>
     *
     * <code>CLICK_TO_CALL = 3;</code>
     */
    public static final int CLICK_TO_CALL_VALUE = 3;
    /**
     * <pre>
     * Conversions that occur when a user downloads a mobile app from the Google
     * Play Store.
     * </pre>
     *
     * <code>GOOGLE_PLAY_DOWNLOAD = 4;</code>
     */
    public static final int GOOGLE_PLAY_DOWNLOAD_VALUE = 4;
    /**
     * <pre>
     * Conversions that occur when a user makes a purchase in an app through
     * Android billing.
     * </pre>
     *
     * <code>GOOGLE_PLAY_IN_APP_PURCHASE = 5;</code>
     */
    public static final int GOOGLE_PLAY_IN_APP_PURCHASE_VALUE = 5;
    /**
     * <pre>
     * Call conversions that are tracked by the advertiser and uploaded.
     * </pre>
     *
     * <code>UPLOAD_CALLS = 6;</code>
     */
    public static final int UPLOAD_CALLS_VALUE = 6;
    /**
     * <pre>
     * Conversions that are tracked by the advertiser and uploaded with
     * attributed clicks.
     * </pre>
     *
     * <code>UPLOAD_CLICKS = 7;</code>
     */
    public static final int UPLOAD_CLICKS_VALUE = 7;
    /**
     * <pre>
     * Conversions that occur on a webpage.
     * </pre>
     *
     * <code>WEBPAGE = 8;</code>
     */
    public static final int WEBPAGE_VALUE = 8;
    /**
     * <pre>
     * Conversions that occur when a user calls a dynamically-generated phone
     * number from an advertiser's website.
     * </pre>
     *
     * <code>WEBSITE_CALL = 9;</code>
     */
    public static final int WEBSITE_CALL_VALUE = 9;
    /**
     * <pre>
     * Store Sales conversion based on first-party or third-party merchant
     * data uploads.
     * Only customers on the allowlist can use store sales direct upload types.
     * </pre>
     *
     * <code>STORE_SALES_DIRECT_UPLOAD = 10;</code>
     */
    public static final int STORE_SALES_DIRECT_UPLOAD_VALUE = 10;
    /**
     * <pre>
     * Store Sales conversion based on first-party or third-party merchant
     * data uploads and/or from in-store purchases using cards from payment
     * networks.
     * Only customers on the allowlist can use store sales types.
     * Read only.
     * </pre>
     *
     * <code>STORE_SALES = 11;</code>
     */
    public static final int STORE_SALES_VALUE = 11;
    /**
     * <pre>
     * Android app first open conversions tracked via Firebase.
     * </pre>
     *
     * <code>FIREBASE_ANDROID_FIRST_OPEN = 12;</code>
     */
    public static final int FIREBASE_ANDROID_FIRST_OPEN_VALUE = 12;
    /**
     * <pre>
     * Android app in app purchase conversions tracked via Firebase.
     * </pre>
     *
     * <code>FIREBASE_ANDROID_IN_APP_PURCHASE = 13;</code>
     */
    public static final int FIREBASE_ANDROID_IN_APP_PURCHASE_VALUE = 13;
    /**
     * <pre>
     * Android app custom conversions tracked via Firebase.
     * </pre>
     *
     * <code>FIREBASE_ANDROID_CUSTOM = 14;</code>
     */
    public static final int FIREBASE_ANDROID_CUSTOM_VALUE = 14;
    /**
     * <pre>
     * iOS app first open conversions tracked via Firebase.
     * </pre>
     *
     * <code>FIREBASE_IOS_FIRST_OPEN = 15;</code>
     */
    public static final int FIREBASE_IOS_FIRST_OPEN_VALUE = 15;
    /**
     * <pre>
     * iOS app in app purchase conversions tracked via Firebase.
     * </pre>
     *
     * <code>FIREBASE_IOS_IN_APP_PURCHASE = 16;</code>
     */
    public static final int FIREBASE_IOS_IN_APP_PURCHASE_VALUE = 16;
    /**
     * <pre>
     * iOS app custom conversions tracked via Firebase.
     * </pre>
     *
     * <code>FIREBASE_IOS_CUSTOM = 17;</code>
     */
    public static final int FIREBASE_IOS_CUSTOM_VALUE = 17;
    /**
     * <pre>
     * Android app first open conversions tracked via Third Party App Analytics.
     * </pre>
     *
     * <code>THIRD_PARTY_APP_ANALYTICS_ANDROID_FIRST_OPEN = 18;</code>
     */
    public static final int THIRD_PARTY_APP_ANALYTICS_ANDROID_FIRST_OPEN_VALUE = 18;
    /**
     * <pre>
     * Android app in app purchase conversions tracked via Third Party App
     * Analytics.
     * </pre>
     *
     * <code>THIRD_PARTY_APP_ANALYTICS_ANDROID_IN_APP_PURCHASE = 19;</code>
     */
    public static final int THIRD_PARTY_APP_ANALYTICS_ANDROID_IN_APP_PURCHASE_VALUE = 19;
    /**
     * <pre>
     * Android app custom conversions tracked via Third Party App Analytics.
     * </pre>
     *
     * <code>THIRD_PARTY_APP_ANALYTICS_ANDROID_CUSTOM = 20;</code>
     */
    public static final int THIRD_PARTY_APP_ANALYTICS_ANDROID_CUSTOM_VALUE = 20;
    /**
     * <pre>
     * iOS app first open conversions tracked via Third Party App Analytics.
     * </pre>
     *
     * <code>THIRD_PARTY_APP_ANALYTICS_IOS_FIRST_OPEN = 21;</code>
     */
    public static final int THIRD_PARTY_APP_ANALYTICS_IOS_FIRST_OPEN_VALUE = 21;
    /**
     * <pre>
     * iOS app in app purchase conversions tracked via Third Party App
     * Analytics.
     * </pre>
     *
     * <code>THIRD_PARTY_APP_ANALYTICS_IOS_IN_APP_PURCHASE = 22;</code>
     */
    public static final int THIRD_PARTY_APP_ANALYTICS_IOS_IN_APP_PURCHASE_VALUE = 22;
    /**
     * <pre>
     * iOS app custom conversions tracked via Third Party App Analytics.
     * </pre>
     *
     * <code>THIRD_PARTY_APP_ANALYTICS_IOS_CUSTOM = 23;</code>
     */
    public static final int THIRD_PARTY_APP_ANALYTICS_IOS_CUSTOM_VALUE = 23;
    /**
     * <pre>
     * Conversions that occur when a user pre-registers a mobile app from the
     * Google Play Store. Read only.
     * </pre>
     *
     * <code>ANDROID_APP_PRE_REGISTRATION = 24;</code>
     */
    public static final int ANDROID_APP_PRE_REGISTRATION_VALUE = 24;
    /**
     * <pre>
     * Conversions that track all Google Play downloads which aren't tracked
     * by an app-specific type. Read only.
     * </pre>
     *
     * <code>ANDROID_INSTALLS_ALL_OTHER_APPS = 25;</code>
     */
    public static final int ANDROID_INSTALLS_ALL_OTHER_APPS_VALUE = 25;
    /**
     * <pre>
     * Floodlight activity that counts the number of times that users have
     * visited a particular webpage after seeing or clicking on one of
     * an advertiser's ads. Read only.
     * </pre>
     *
     * <code>FLOODLIGHT_ACTION = 26;</code>
     */
    public static final int FLOODLIGHT_ACTION_VALUE = 26;
    /**
     * <pre>
     * Floodlight activity that tracks the number of sales made or the number
     * of items purchased. Can also capture the total value of each sale.
     * Read only.
     * </pre>
     *
     * <code>FLOODLIGHT_TRANSACTION = 27;</code>
     */
    public static final int FLOODLIGHT_TRANSACTION_VALUE = 27;
    /**
     * <pre>
     * Conversions that track local actions from Google's products and
     * services after interacting with an ad. Read only.
     * </pre>
     *
     * <code>GOOGLE_HOSTED = 28;</code>
     */
    public static final int GOOGLE_HOSTED_VALUE = 28;
    /**
     * <pre>
     * Conversions reported when a user submits a lead form. Read only.
     * </pre>
     *
     * <code>LEAD_FORM_SUBMIT = 29;</code>
     */
    public static final int LEAD_FORM_SUBMIT_VALUE = 29;
    /**
     * <pre>
     * Conversions that come from Salesforce. Read only.
     * </pre>
     *
     * <code>SALESFORCE = 30;</code>
     */
    public static final int SALESFORCE_VALUE = 30;
    /**
     * <pre>
     * Conversions imported from Search Ads 360 Floodlight data. Read only.
     * </pre>
     *
     * <code>SEARCH_ADS_360 = 31;</code>
     */
    public static final int SEARCH_ADS_360_VALUE = 31;
    /**
     * <pre>
     * Call conversions that occur on Smart campaign Ads without call tracking
     * setup, using Smart campaign custom criteria. Read only.
     * </pre>
     *
     * <code>SMART_CAMPAIGN_AD_CLICKS_TO_CALL = 32;</code>
     */
    public static final int SMART_CAMPAIGN_AD_CLICKS_TO_CALL_VALUE = 32;
    /**
     * <pre>
     * The user clicks on a call element within Google Maps. Smart campaign
     * only. Read only.
     * </pre>
     *
     * <code>SMART_CAMPAIGN_MAP_CLICKS_TO_CALL = 33;</code>
     */
    public static final int SMART_CAMPAIGN_MAP_CLICKS_TO_CALL_VALUE = 33;
    /**
     * <pre>
     * The user requests directions to a business location within Google Maps.
     * Smart campaign only. Read only.
     * </pre>
     *
     * <code>SMART_CAMPAIGN_MAP_DIRECTIONS = 34;</code>
     */
    public static final int SMART_CAMPAIGN_MAP_DIRECTIONS_VALUE = 34;
    /**
     * <pre>
     * Call conversions that occur on Smart campaign Ads with call tracking
     * setup, using Smart campaign custom criteria. Read only.
     * </pre>
     *
     * <code>SMART_CAMPAIGN_TRACKED_CALLS = 35;</code>
     */
    public static final int SMART_CAMPAIGN_TRACKED_CALLS_VALUE = 35;
    /**
     * <pre>
     * Conversions that occur when a user visits an advertiser's retail store.
     * Read only.
     * </pre>
     *
     * <code>STORE_VISITS = 36;</code>
     */
    public static final int STORE_VISITS_VALUE = 36;


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
    public static ConversionActionType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ConversionActionType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return AD_CALL;
        case 3: return CLICK_TO_CALL;
        case 4: return GOOGLE_PLAY_DOWNLOAD;
        case 5: return GOOGLE_PLAY_IN_APP_PURCHASE;
        case 6: return UPLOAD_CALLS;
        case 7: return UPLOAD_CLICKS;
        case 8: return WEBPAGE;
        case 9: return WEBSITE_CALL;
        case 10: return STORE_SALES_DIRECT_UPLOAD;
        case 11: return STORE_SALES;
        case 12: return FIREBASE_ANDROID_FIRST_OPEN;
        case 13: return FIREBASE_ANDROID_IN_APP_PURCHASE;
        case 14: return FIREBASE_ANDROID_CUSTOM;
        case 15: return FIREBASE_IOS_FIRST_OPEN;
        case 16: return FIREBASE_IOS_IN_APP_PURCHASE;
        case 17: return FIREBASE_IOS_CUSTOM;
        case 18: return THIRD_PARTY_APP_ANALYTICS_ANDROID_FIRST_OPEN;
        case 19: return THIRD_PARTY_APP_ANALYTICS_ANDROID_IN_APP_PURCHASE;
        case 20: return THIRD_PARTY_APP_ANALYTICS_ANDROID_CUSTOM;
        case 21: return THIRD_PARTY_APP_ANALYTICS_IOS_FIRST_OPEN;
        case 22: return THIRD_PARTY_APP_ANALYTICS_IOS_IN_APP_PURCHASE;
        case 23: return THIRD_PARTY_APP_ANALYTICS_IOS_CUSTOM;
        case 24: return ANDROID_APP_PRE_REGISTRATION;
        case 25: return ANDROID_INSTALLS_ALL_OTHER_APPS;
        case 26: return FLOODLIGHT_ACTION;
        case 27: return FLOODLIGHT_TRANSACTION;
        case 28: return GOOGLE_HOSTED;
        case 29: return LEAD_FORM_SUBMIT;
        case 30: return SALESFORCE;
        case 31: return SEARCH_ADS_360;
        case 32: return SMART_CAMPAIGN_AD_CLICKS_TO_CALL;
        case 33: return SMART_CAMPAIGN_MAP_CLICKS_TO_CALL;
        case 34: return SMART_CAMPAIGN_MAP_DIRECTIONS;
        case 35: return SMART_CAMPAIGN_TRACKED_CALLS;
        case 36: return STORE_VISITS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ConversionActionType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ConversionActionType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ConversionActionType>() {
            public ConversionActionType findValueByNumber(int number) {
              return ConversionActionType.forNumber(number);
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
      return com.google.ads.googleads.v9.enums.ConversionActionTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ConversionActionType[] VALUES = values();

    public static ConversionActionType valueOf(
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

    private ConversionActionType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v9.enums.ConversionActionTypeEnum.ConversionActionType)
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
    if (!(obj instanceof com.google.ads.googleads.v9.enums.ConversionActionTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v9.enums.ConversionActionTypeEnum other = (com.google.ads.googleads.v9.enums.ConversionActionTypeEnum) obj;

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

  public static com.google.ads.googleads.v9.enums.ConversionActionTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.enums.ConversionActionTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.enums.ConversionActionTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.enums.ConversionActionTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.enums.ConversionActionTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.enums.ConversionActionTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.enums.ConversionActionTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.enums.ConversionActionTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.enums.ConversionActionTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.enums.ConversionActionTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.enums.ConversionActionTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.enums.ConversionActionTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v9.enums.ConversionActionTypeEnum prototype) {
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
   * Container for enum describing possible types of a conversion action.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v9.enums.ConversionActionTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v9.enums.ConversionActionTypeEnum)
      com.google.ads.googleads.v9.enums.ConversionActionTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v9.enums.ConversionActionTypeProto.internal_static_google_ads_googleads_v9_enums_ConversionActionTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v9.enums.ConversionActionTypeProto.internal_static_google_ads_googleads_v9_enums_ConversionActionTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v9.enums.ConversionActionTypeEnum.class, com.google.ads.googleads.v9.enums.ConversionActionTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v9.enums.ConversionActionTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v9.enums.ConversionActionTypeProto.internal_static_google_ads_googleads_v9_enums_ConversionActionTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.enums.ConversionActionTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v9.enums.ConversionActionTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.enums.ConversionActionTypeEnum build() {
      com.google.ads.googleads.v9.enums.ConversionActionTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.enums.ConversionActionTypeEnum buildPartial() {
      com.google.ads.googleads.v9.enums.ConversionActionTypeEnum result = new com.google.ads.googleads.v9.enums.ConversionActionTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v9.enums.ConversionActionTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v9.enums.ConversionActionTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v9.enums.ConversionActionTypeEnum other) {
      if (other == com.google.ads.googleads.v9.enums.ConversionActionTypeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v9.enums.ConversionActionTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v9.enums.ConversionActionTypeEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v9.enums.ConversionActionTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v9.enums.ConversionActionTypeEnum)
  private static final com.google.ads.googleads.v9.enums.ConversionActionTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v9.enums.ConversionActionTypeEnum();
  }

  public static com.google.ads.googleads.v9.enums.ConversionActionTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConversionActionTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<ConversionActionTypeEnum>() {
    @java.lang.Override
    public ConversionActionTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConversionActionTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConversionActionTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConversionActionTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v9.enums.ConversionActionTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

