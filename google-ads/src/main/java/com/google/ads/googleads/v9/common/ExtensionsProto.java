// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/common/extensions.proto

package com.google.ads.googleads.v9.common;

public final class ExtensionsProto {
  private ExtensionsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_AppFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_AppFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_CallFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_CallFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_CalloutFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_CalloutFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_LocationFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_LocationFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_AffiliateLocationFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_AffiliateLocationFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_TextMessageFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_TextMessageFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_PriceFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_PriceFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_PriceOffer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_PriceOffer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_PromotionFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_PromotionFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_StructuredSnippetFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_StructuredSnippetFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_SitelinkFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_SitelinkFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_HotelCalloutFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_HotelCalloutFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_ImageFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_ImageFeedItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/ads/googleads/v9/common/extensi" +
      "ons.proto\022\036google.ads.googleads.v9.commo" +
      "n\0325google/ads/googleads/v9/common/custom" +
      "_parameter.proto\0320google/ads/googleads/v" +
      "9/common/feed_common.proto\032-google/ads/g" +
      "oogleads/v9/enums/app_store.proto\032Cgoogl" +
      "e/ads/googleads/v9/enums/call_conversion" +
      "_reporting_state.proto\032Cgoogle/ads/googl" +
      "eads/v9/enums/price_extension_price_qual" +
      "ifier.proto\032>google/ads/googleads/v9/enu" +
      "ms/price_extension_price_unit.proto\0328goo" +
      "gle/ads/googleads/v9/enums/price_extensi" +
      "on_type.proto\032Igoogle/ads/googleads/v9/e" +
      "nums/promotion_extension_discount_modifi" +
      "er.proto\032@google/ads/googleads/v9/enums/" +
      "promotion_extension_occasion.proto\032\037goog" +
      "le/api/field_behavior.proto\032\031google/api/" +
      "resource.proto\032\034google/api/annotations.p" +
      "roto\"\215\003\n\013AppFeedItem\022\026\n\tlink_text\030\t \001(\tH" +
      "\000\210\001\001\022\023\n\006app_id\030\n \001(\tH\001\210\001\001\022G\n\tapp_store\030\003" +
      " \001(\01624.google.ads.googleads.v9.enums.App" +
      "StoreEnum.AppStore\022\022\n\nfinal_urls\030\013 \003(\t\022\031" +
      "\n\021final_mobile_urls\030\014 \003(\t\022\"\n\025tracking_ur" +
      "l_template\030\r \001(\tH\002\210\001\001\022N\n\025url_custom_para" +
      "meters\030\007 \003(\0132/.google.ads.googleads.v9.c" +
      "ommon.CustomParameter\022\035\n\020final_url_suffi" +
      "x\030\016 \001(\tH\003\210\001\001B\014\n\n_link_textB\t\n\007_app_idB\030\n" +
      "\026_tracking_url_templateB\023\n\021_final_url_su" +
      "ffix\"\302\003\n\014CallFeedItem\022\031\n\014phone_number\030\007 " +
      "\001(\tH\000\210\001\001\022\031\n\014country_code\030\010 \001(\tH\001\210\001\001\022\"\n\025c" +
      "all_tracking_enabled\030\t \001(\010H\002\210\001\001\022#\n\026call_" +
      "conversion_action\030\n \001(\tH\003\210\001\001\022.\n!call_con" +
      "version_tracking_disabled\030\013 \001(\010H\004\210\001\001\022\205\001\n" +
      "\037call_conversion_reporting_state\030\006 \001(\0162\\" +
      ".google.ads.googleads.v9.enums.CallConve" +
      "rsionReportingStateEnum.CallConversionRe" +
      "portingStateB\017\n\r_phone_numberB\017\n\r_countr" +
      "y_codeB\030\n\026_call_tracking_enabledB\031\n\027_cal" +
      "l_conversion_actionB$\n\"_call_conversion_" +
      "tracking_disabled\"=\n\017CalloutFeedItem\022\031\n\014" +
      "callout_text\030\002 \001(\tH\000\210\001\001B\017\n\r_callout_text" +
      "\"\342\002\n\020LocationFeedItem\022\032\n\rbusiness_name\030\t" +
      " \001(\tH\000\210\001\001\022\033\n\016address_line_1\030\n \001(\tH\001\210\001\001\022\033" +
      "\n\016address_line_2\030\013 \001(\tH\002\210\001\001\022\021\n\004city\030\014 \001(" +
      "\tH\003\210\001\001\022\025\n\010province\030\r \001(\tH\004\210\001\001\022\030\n\013postal_" +
      "code\030\016 \001(\tH\005\210\001\001\022\031\n\014country_code\030\017 \001(\tH\006\210" +
      "\001\001\022\031\n\014phone_number\030\020 \001(\tH\007\210\001\001B\020\n\016_busine" +
      "ss_nameB\021\n\017_address_line_1B\021\n\017_address_l" +
      "ine_2B\007\n\005_cityB\013\n\t_provinceB\016\n\014_postal_c" +
      "odeB\017\n\r_country_codeB\017\n\r_phone_number\"\267\003" +
      "\n\031AffiliateLocationFeedItem\022\032\n\rbusiness_" +
      "name\030\013 \001(\tH\000\210\001\001\022\033\n\016address_line_1\030\014 \001(\tH" +
      "\001\210\001\001\022\033\n\016address_line_2\030\r \001(\tH\002\210\001\001\022\021\n\004cit" +
      "y\030\016 \001(\tH\003\210\001\001\022\025\n\010province\030\017 \001(\tH\004\210\001\001\022\030\n\013p" +
      "ostal_code\030\020 \001(\tH\005\210\001\001\022\031\n\014country_code\030\021 " +
      "\001(\tH\006\210\001\001\022\031\n\014phone_number\030\022 \001(\tH\007\210\001\001\022\025\n\010c" +
      "hain_id\030\023 \001(\003H\010\210\001\001\022\027\n\nchain_name\030\024 \001(\tH\t" +
      "\210\001\001B\020\n\016_business_nameB\021\n\017_address_line_1" +
      "B\021\n\017_address_line_2B\007\n\005_cityB\013\n\t_provinc" +
      "eB\016\n\014_postal_codeB\017\n\r_country_codeB\017\n\r_p" +
      "hone_numberB\013\n\t_chain_idB\r\n\013_chain_name\"" +
      "\347\001\n\023TextMessageFeedItem\022\032\n\rbusiness_name" +
      "\030\006 \001(\tH\000\210\001\001\022\031\n\014country_code\030\007 \001(\tH\001\210\001\001\022\031" +
      "\n\014phone_number\030\010 \001(\tH\002\210\001\001\022\021\n\004text\030\t \001(\tH" +
      "\003\210\001\001\022\033\n\016extension_text\030\n \001(\tH\004\210\001\001B\020\n\016_bu" +
      "siness_nameB\017\n\r_country_codeB\017\n\r_phone_n" +
      "umberB\007\n\005_textB\021\n\017_extension_text\"\303\003\n\rPr" +
      "iceFeedItem\022V\n\004type\030\001 \001(\0162H.google.ads.g" +
      "oogleads.v9.enums.PriceExtensionTypeEnum" +
      ".PriceExtensionType\022u\n\017price_qualifier\030\002" +
      " \001(\0162\\.google.ads.googleads.v9.enums.Pri" +
      "ceExtensionPriceQualifierEnum.PriceExten" +
      "sionPriceQualifier\022\"\n\025tracking_url_templ" +
      "ate\030\007 \001(\tH\000\210\001\001\022\032\n\rlanguage_code\030\010 \001(\tH\001\210" +
      "\001\001\022C\n\017price_offerings\030\005 \003(\0132*.google.ads" +
      ".googleads.v9.common.PriceOffer\022\035\n\020final" +
      "_url_suffix\030\t \001(\tH\002\210\001\001B\030\n\026_tracking_url_" +
      "templateB\020\n\016_language_codeB\023\n\021_final_url" +
      "_suffix\"\235\002\n\nPriceOffer\022\023\n\006header\030\007 \001(\tH\000" +
      "\210\001\001\022\030\n\013description\030\010 \001(\tH\001\210\001\001\0224\n\005price\030\003" +
      " \001(\0132%.google.ads.googleads.v9.common.Mo" +
      "ney\022`\n\004unit\030\004 \001(\0162R.google.ads.googleads" +
      ".v9.enums.PriceExtensionPriceUnitEnum.Pr" +
      "iceExtensionPriceUnit\022\022\n\nfinal_urls\030\t \003(" +
      "\t\022\031\n\021final_mobile_urls\030\n \003(\tB\t\n\007_headerB" +
      "\016\n\014_description\"\253\007\n\021PromotionFeedItem\022\035\n" +
      "\020promotion_target\030\020 \001(\tH\002\210\001\001\022\203\001\n\021discoun" +
      "t_modifier\030\002 \001(\0162h.google.ads.googleads." +
      "v9.enums.PromotionExtensionDiscountModif" +
      "ierEnum.PromotionExtensionDiscountModifi" +
      "er\022!\n\024promotion_start_date\030\023 \001(\tH\003\210\001\001\022\037\n" +
      "\022promotion_end_date\030\024 \001(\tH\004\210\001\001\022j\n\010occasi" +
      "on\030\t \001(\0162X.google.ads.googleads.v9.enums" +
      ".PromotionExtensionOccasionEnum.Promotio" +
      "nExtensionOccasion\022\022\n\nfinal_urls\030\025 \003(\t\022\031" +
      "\n\021final_mobile_urls\030\026 \003(\t\022\"\n\025tracking_ur" +
      "l_template\030\027 \001(\tH\005\210\001\001\022N\n\025url_custom_para" +
      "meters\030\r \003(\0132/.google.ads.googleads.v9.c" +
      "ommon.CustomParameter\022\035\n\020final_url_suffi" +
      "x\030\030 \001(\tH\006\210\001\001\022\032\n\rlanguage_code\030\031 \001(\tH\007\210\001\001" +
      "\022\025\n\013percent_off\030\021 \001(\003H\000\022A\n\020money_amount_" +
      "off\030\004 \001(\0132%.google.ads.googleads.v9.comm" +
      "on.MoneyH\000\022\030\n\016promotion_code\030\022 \001(\tH\001\022C\n\022" +
      "orders_over_amount\030\006 \001(\0132%.google.ads.go" +
      "ogleads.v9.common.MoneyH\001B\017\n\rdiscount_ty" +
      "peB\023\n\021promotion_triggerB\023\n\021_promotion_ta" +
      "rgetB\027\n\025_promotion_start_dateB\025\n\023_promot" +
      "ion_end_dateB\030\n\026_tracking_url_templateB\023" +
      "\n\021_final_url_suffixB\020\n\016_language_code\"K\n" +
      "\031StructuredSnippetFeedItem\022\023\n\006header\030\003 \001" +
      "(\tH\000\210\001\001\022\016\n\006values\030\004 \003(\tB\t\n\007_header\"\345\002\n\020S" +
      "itelinkFeedItem\022\026\n\tlink_text\030\t \001(\tH\000\210\001\001\022" +
      "\022\n\005line1\030\n \001(\tH\001\210\001\001\022\022\n\005line2\030\013 \001(\tH\002\210\001\001\022" +
      "\022\n\nfinal_urls\030\014 \003(\t\022\031\n\021final_mobile_urls" +
      "\030\r \003(\t\022\"\n\025tracking_url_template\030\016 \001(\tH\003\210" +
      "\001\001\022N\n\025url_custom_parameters\030\007 \003(\0132/.goog" +
      "le.ads.googleads.v9.common.CustomParamet" +
      "er\022\035\n\020final_url_suffix\030\017 \001(\tH\004\210\001\001B\014\n\n_li" +
      "nk_textB\010\n\006_line1B\010\n\006_line2B\030\n\026_tracking" +
      "_url_templateB\023\n\021_final_url_suffix\"`\n\024Ho" +
      "telCalloutFeedItem\022\021\n\004text\030\003 \001(\tH\000\210\001\001\022\032\n" +
      "\rlanguage_code\030\004 \001(\tH\001\210\001\001B\007\n\005_textB\020\n\016_l" +
      "anguage_code\"L\n\rImageFeedItem\022;\n\013image_a" +
      "sset\030\001 \001(\tB&\340A\002\372A \n\036googleads.googleapis" +
      ".com/AssetB\352\001\n\"com.google.ads.googleads." +
      "v9.commonB\017ExtensionsProtoP\001ZDgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v9/common;common\242\002\003GAA\252\002\036Google.Ads.Go" +
      "ogleAds.V9.Common\312\002\036Google\\Ads\\GoogleAds" +
      "\\V9\\Common\352\002\"Google::Ads::GoogleAds::V9:" +
      ":Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v9.common.FeedCommonProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.AppStoreProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.CallConversionReportingStateProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.PriceExtensionPriceQualifierProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.PriceExtensionPriceUnitProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.PriceExtensionTypeProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.PromotionExtensionDiscountModifierProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.PromotionExtensionOccasionProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_common_AppFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_common_AppFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_AppFeedItem_descriptor,
        new java.lang.String[] { "LinkText", "AppId", "AppStore", "FinalUrls", "FinalMobileUrls", "TrackingUrlTemplate", "UrlCustomParameters", "FinalUrlSuffix", "LinkText", "AppId", "TrackingUrlTemplate", "FinalUrlSuffix", });
    internal_static_google_ads_googleads_v9_common_CallFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v9_common_CallFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_CallFeedItem_descriptor,
        new java.lang.String[] { "PhoneNumber", "CountryCode", "CallTrackingEnabled", "CallConversionAction", "CallConversionTrackingDisabled", "CallConversionReportingState", "PhoneNumber", "CountryCode", "CallTrackingEnabled", "CallConversionAction", "CallConversionTrackingDisabled", });
    internal_static_google_ads_googleads_v9_common_CalloutFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v9_common_CalloutFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_CalloutFeedItem_descriptor,
        new java.lang.String[] { "CalloutText", "CalloutText", });
    internal_static_google_ads_googleads_v9_common_LocationFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v9_common_LocationFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_LocationFeedItem_descriptor,
        new java.lang.String[] { "BusinessName", "AddressLine1", "AddressLine2", "City", "Province", "PostalCode", "CountryCode", "PhoneNumber", "BusinessName", "AddressLine1", "AddressLine2", "City", "Province", "PostalCode", "CountryCode", "PhoneNumber", });
    internal_static_google_ads_googleads_v9_common_AffiliateLocationFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v9_common_AffiliateLocationFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_AffiliateLocationFeedItem_descriptor,
        new java.lang.String[] { "BusinessName", "AddressLine1", "AddressLine2", "City", "Province", "PostalCode", "CountryCode", "PhoneNumber", "ChainId", "ChainName", "BusinessName", "AddressLine1", "AddressLine2", "City", "Province", "PostalCode", "CountryCode", "PhoneNumber", "ChainId", "ChainName", });
    internal_static_google_ads_googleads_v9_common_TextMessageFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v9_common_TextMessageFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_TextMessageFeedItem_descriptor,
        new java.lang.String[] { "BusinessName", "CountryCode", "PhoneNumber", "Text", "ExtensionText", "BusinessName", "CountryCode", "PhoneNumber", "Text", "ExtensionText", });
    internal_static_google_ads_googleads_v9_common_PriceFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v9_common_PriceFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_PriceFeedItem_descriptor,
        new java.lang.String[] { "Type", "PriceQualifier", "TrackingUrlTemplate", "LanguageCode", "PriceOfferings", "FinalUrlSuffix", "TrackingUrlTemplate", "LanguageCode", "FinalUrlSuffix", });
    internal_static_google_ads_googleads_v9_common_PriceOffer_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v9_common_PriceOffer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_PriceOffer_descriptor,
        new java.lang.String[] { "Header", "Description", "Price", "Unit", "FinalUrls", "FinalMobileUrls", "Header", "Description", });
    internal_static_google_ads_googleads_v9_common_PromotionFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v9_common_PromotionFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_PromotionFeedItem_descriptor,
        new java.lang.String[] { "PromotionTarget", "DiscountModifier", "PromotionStartDate", "PromotionEndDate", "Occasion", "FinalUrls", "FinalMobileUrls", "TrackingUrlTemplate", "UrlCustomParameters", "FinalUrlSuffix", "LanguageCode", "PercentOff", "MoneyAmountOff", "PromotionCode", "OrdersOverAmount", "DiscountType", "PromotionTrigger", "PromotionTarget", "PromotionStartDate", "PromotionEndDate", "TrackingUrlTemplate", "FinalUrlSuffix", "LanguageCode", });
    internal_static_google_ads_googleads_v9_common_StructuredSnippetFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v9_common_StructuredSnippetFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_StructuredSnippetFeedItem_descriptor,
        new java.lang.String[] { "Header", "Values", "Header", });
    internal_static_google_ads_googleads_v9_common_SitelinkFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_ads_googleads_v9_common_SitelinkFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_SitelinkFeedItem_descriptor,
        new java.lang.String[] { "LinkText", "Line1", "Line2", "FinalUrls", "FinalMobileUrls", "TrackingUrlTemplate", "UrlCustomParameters", "FinalUrlSuffix", "LinkText", "Line1", "Line2", "TrackingUrlTemplate", "FinalUrlSuffix", });
    internal_static_google_ads_googleads_v9_common_HotelCalloutFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_ads_googleads_v9_common_HotelCalloutFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_HotelCalloutFeedItem_descriptor,
        new java.lang.String[] { "Text", "LanguageCode", "Text", "LanguageCode", });
    internal_static_google_ads_googleads_v9_common_ImageFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_ads_googleads_v9_common_ImageFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_ImageFeedItem_descriptor,
        new java.lang.String[] { "ImageAsset", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v9.common.FeedCommonProto.getDescriptor();
    com.google.ads.googleads.v9.enums.AppStoreProto.getDescriptor();
    com.google.ads.googleads.v9.enums.CallConversionReportingStateProto.getDescriptor();
    com.google.ads.googleads.v9.enums.PriceExtensionPriceQualifierProto.getDescriptor();
    com.google.ads.googleads.v9.enums.PriceExtensionPriceUnitProto.getDescriptor();
    com.google.ads.googleads.v9.enums.PriceExtensionTypeProto.getDescriptor();
    com.google.ads.googleads.v9.enums.PromotionExtensionDiscountModifierProto.getDescriptor();
    com.google.ads.googleads.v9.enums.PromotionExtensionOccasionProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
