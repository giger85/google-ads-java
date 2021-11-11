// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/conversion_upload_service.proto

package com.google.ads.googleads.v9.services;

public final class ConversionUploadServiceProto {
  private ConversionUploadServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_UploadClickConversionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_UploadClickConversionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_UploadClickConversionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_UploadClickConversionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_UploadCallConversionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_UploadCallConversionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_UploadCallConversionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_UploadCallConversionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_ClickConversion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_ClickConversion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_CallConversion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_CallConversion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_ExternalAttributionData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_ExternalAttributionData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_ClickConversionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_ClickConversionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_CallConversionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_CallConversionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_CustomVariable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_CustomVariable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_CartData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_CartData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_CartData_Item_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_CartData_Item_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v9/services/conve" +
      "rsion_upload_service.proto\022 google.ads.g" +
      "oogleads.v9.services\0326google/ads/googlea" +
      "ds/v9/common/offline_user_data.proto\032\034go" +
      "ogle/api/annotations.proto\032\027google/api/c" +
      "lient.proto\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\032\027google/" +
      "rpc/status.proto\"\273\001\n\035UploadClickConversi" +
      "onsRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022K\n\013" +
      "conversions\030\002 \003(\01321.google.ads.googleads" +
      ".v9.services.ClickConversionB\003\340A\002\022\034\n\017par" +
      "tial_failure\030\003 \001(\010B\003\340A\002\022\025\n\rvalidate_only" +
      "\030\004 \001(\010\"\235\001\n\036UploadClickConversionsRespons" +
      "e\0221\n\025partial_failure_error\030\001 \001(\0132\022.googl" +
      "e.rpc.Status\022H\n\007results\030\002 \003(\01327.google.a" +
      "ds.googleads.v9.services.ClickConversion" +
      "Result\"\271\001\n\034UploadCallConversionsRequest\022" +
      "\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022J\n\013conversions" +
      "\030\002 \003(\01320.google.ads.googleads.v9.service" +
      "s.CallConversionB\003\340A\002\022\034\n\017partial_failure" +
      "\030\003 \001(\010B\003\340A\002\022\025\n\rvalidate_only\030\004 \001(\010\"\233\001\n\035U" +
      "ploadCallConversionsResponse\0221\n\025partial_" +
      "failure_error\030\001 \001(\0132\022.google.rpc.Status\022" +
      "G\n\007results\030\002 \003(\01326.google.ads.googleads." +
      "v9.services.CallConversionResult\"\372\004\n\017Cli" +
      "ckConversion\022\022\n\005gclid\030\t \001(\tH\000\210\001\001\022\016\n\006gbra" +
      "id\030\022 \001(\t\022\016\n\006wbraid\030\023 \001(\t\022\036\n\021conversion_a" +
      "ction\030\n \001(\tH\001\210\001\001\022!\n\024conversion_date_time" +
      "\030\013 \001(\tH\002\210\001\001\022\035\n\020conversion_value\030\014 \001(\001H\003\210" +
      "\001\001\022\032\n\rcurrency_code\030\r \001(\tH\004\210\001\001\022\025\n\010order_" +
      "id\030\016 \001(\tH\005\210\001\001\022\\\n\031external_attribution_da" +
      "ta\030\007 \001(\01329.google.ads.googleads.v9.servi" +
      "ces.ExternalAttributionData\022J\n\020custom_va" +
      "riables\030\017 \003(\01320.google.ads.googleads.v9." +
      "services.CustomVariable\022=\n\tcart_data\030\020 \001" +
      "(\0132*.google.ads.googleads.v9.services.Ca" +
      "rtData\022H\n\020user_identifiers\030\021 \003(\0132..googl" +
      "e.ads.googleads.v9.common.UserIdentifier" +
      "B\010\n\006_gclidB\024\n\022_conversion_actionB\027\n\025_con" +
      "version_date_timeB\023\n\021_conversion_valueB\020" +
      "\n\016_currency_codeB\013\n\t_order_id\"\222\003\n\016CallCo" +
      "nversion\022\026\n\tcaller_id\030\007 \001(\tH\000\210\001\001\022!\n\024call" +
      "_start_date_time\030\010 \001(\tH\001\210\001\001\022\036\n\021conversio" +
      "n_action\030\t \001(\tH\002\210\001\001\022!\n\024conversion_date_t" +
      "ime\030\n \001(\tH\003\210\001\001\022\035\n\020conversion_value\030\013 \001(\001" +
      "H\004\210\001\001\022\032\n\rcurrency_code\030\014 \001(\tH\005\210\001\001\022J\n\020cus" +
      "tom_variables\030\r \003(\01320.google.ads.googlea" +
      "ds.v9.services.CustomVariableB\014\n\n_caller" +
      "_idB\027\n\025_call_start_date_timeB\024\n\022_convers" +
      "ion_actionB\027\n\025_conversion_date_timeB\023\n\021_" +
      "conversion_valueB\020\n\016_currency_code\"\253\001\n\027E" +
      "xternalAttributionData\022(\n\033external_attri" +
      "bution_credit\030\003 \001(\001H\000\210\001\001\022\'\n\032external_att" +
      "ribution_model\030\004 \001(\tH\001\210\001\001B\036\n\034_external_a" +
      "ttribution_creditB\035\n\033_external_attributi" +
      "on_model\"\221\002\n\025ClickConversionResult\022\022\n\005gc" +
      "lid\030\004 \001(\tH\000\210\001\001\022\016\n\006gbraid\030\010 \001(\t\022\016\n\006wbraid" +
      "\030\t \001(\t\022\036\n\021conversion_action\030\005 \001(\tH\001\210\001\001\022!" +
      "\n\024conversion_date_time\030\006 \001(\tH\002\210\001\001\022H\n\020use" +
      "r_identifiers\030\007 \003(\0132..google.ads.googlea" +
      "ds.v9.common.UserIdentifierB\010\n\006_gclidB\024\n" +
      "\022_conversion_actionB\027\n\025_conversion_date_" +
      "time\"\352\001\n\024CallConversionResult\022\026\n\tcaller_" +
      "id\030\005 \001(\tH\000\210\001\001\022!\n\024call_start_date_time\030\006 " +
      "\001(\tH\001\210\001\001\022\036\n\021conversion_action\030\007 \001(\tH\002\210\001\001" +
      "\022!\n\024conversion_date_time\030\010 \001(\tH\003\210\001\001B\014\n\n_" +
      "caller_idB\027\n\025_call_start_date_timeB\024\n\022_c" +
      "onversion_actionB\027\n\025_conversion_date_tim" +
      "e\"{\n\016CustomVariable\022Z\n\032conversion_custom" +
      "_variable\030\001 \001(\tB6\372A3\n1googleads.googleap" +
      "is.com/ConversionCustomVariable\022\r\n\005value" +
      "\030\002 \001(\t\"\370\001\n\010CartData\022\023\n\013merchant_id\030\006 \001(\003" +
      "\022\031\n\021feed_country_code\030\002 \001(\t\022\032\n\022feed_lang" +
      "uage_code\030\003 \001(\t\022\036\n\026local_transaction_cos" +
      "t\030\004 \001(\001\022>\n\005items\030\005 \003(\0132/.google.ads.goog" +
      "leads.v9.services.CartData.Item\032@\n\004Item\022" +
      "\022\n\nproduct_id\030\001 \001(\t\022\020\n\010quantity\030\002 \001(\005\022\022\n" +
      "\nunit_price\030\003 \001(\0012\356\004\n\027ConversionUploadSe" +
      "rvice\022\206\002\n\026UploadClickConversions\022?.googl" +
      "e.ads.googleads.v9.services.UploadClickC" +
      "onversionsRequest\032@.google.ads.googleads" +
      ".v9.services.UploadClickConversionsRespo" +
      "nse\"i\202\323\344\223\0029\"4/v9/customers/{customer_id=" +
      "*}:uploadClickConversions:\001*\332A\'customer_" +
      "id,conversions,partial_failure\022\202\002\n\025Uploa" +
      "dCallConversions\022>.google.ads.googleads." +
      "v9.services.UploadCallConversionsRequest" +
      "\032?.google.ads.googleads.v9.services.Uplo" +
      "adCallConversionsResponse\"h\202\323\344\223\0028\"3/v9/c" +
      "ustomers/{customer_id=*}:uploadCallConve" +
      "rsions:\001*\332A\'customer_id,conversions,part" +
      "ial_failure\032E\312A\030googleads.googleapis.com" +
      "\322A\'https://www.googleapis.com/auth/adwor" +
      "dsB\203\002\n$com.google.ads.googleads.v9.servi" +
      "cesB\034ConversionUploadServiceProtoP\001ZHgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v9/services;services\242\002\003GAA\252\002 Go" +
      "ogle.Ads.GoogleAds.V9.Services\312\002 Google\\" +
      "Ads\\GoogleAds\\V9\\Services\352\002$Google::Ads:" +
      ":GoogleAds::V9::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.common.OfflineUserDataProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_UploadClickConversionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_UploadClickConversionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_UploadClickConversionsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Conversions", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v9_services_UploadClickConversionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v9_services_UploadClickConversionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_UploadClickConversionsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v9_services_UploadCallConversionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v9_services_UploadCallConversionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_UploadCallConversionsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Conversions", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v9_services_UploadCallConversionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v9_services_UploadCallConversionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_UploadCallConversionsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v9_services_ClickConversion_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v9_services_ClickConversion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_ClickConversion_descriptor,
        new java.lang.String[] { "Gclid", "Gbraid", "Wbraid", "ConversionAction", "ConversionDateTime", "ConversionValue", "CurrencyCode", "OrderId", "ExternalAttributionData", "CustomVariables", "CartData", "UserIdentifiers", "Gclid", "ConversionAction", "ConversionDateTime", "ConversionValue", "CurrencyCode", "OrderId", });
    internal_static_google_ads_googleads_v9_services_CallConversion_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v9_services_CallConversion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_CallConversion_descriptor,
        new java.lang.String[] { "CallerId", "CallStartDateTime", "ConversionAction", "ConversionDateTime", "ConversionValue", "CurrencyCode", "CustomVariables", "CallerId", "CallStartDateTime", "ConversionAction", "ConversionDateTime", "ConversionValue", "CurrencyCode", });
    internal_static_google_ads_googleads_v9_services_ExternalAttributionData_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v9_services_ExternalAttributionData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_ExternalAttributionData_descriptor,
        new java.lang.String[] { "ExternalAttributionCredit", "ExternalAttributionModel", "ExternalAttributionCredit", "ExternalAttributionModel", });
    internal_static_google_ads_googleads_v9_services_ClickConversionResult_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v9_services_ClickConversionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_ClickConversionResult_descriptor,
        new java.lang.String[] { "Gclid", "Gbraid", "Wbraid", "ConversionAction", "ConversionDateTime", "UserIdentifiers", "Gclid", "ConversionAction", "ConversionDateTime", });
    internal_static_google_ads_googleads_v9_services_CallConversionResult_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v9_services_CallConversionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_CallConversionResult_descriptor,
        new java.lang.String[] { "CallerId", "CallStartDateTime", "ConversionAction", "ConversionDateTime", "CallerId", "CallStartDateTime", "ConversionAction", "ConversionDateTime", });
    internal_static_google_ads_googleads_v9_services_CustomVariable_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v9_services_CustomVariable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_CustomVariable_descriptor,
        new java.lang.String[] { "ConversionCustomVariable", "Value", });
    internal_static_google_ads_googleads_v9_services_CartData_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_ads_googleads_v9_services_CartData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_CartData_descriptor,
        new java.lang.String[] { "MerchantId", "FeedCountryCode", "FeedLanguageCode", "LocalTransactionCost", "Items", });
    internal_static_google_ads_googleads_v9_services_CartData_Item_descriptor =
      internal_static_google_ads_googleads_v9_services_CartData_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v9_services_CartData_Item_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_CartData_Item_descriptor,
        new java.lang.String[] { "ProductId", "Quantity", "UnitPrice", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.common.OfflineUserDataProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
