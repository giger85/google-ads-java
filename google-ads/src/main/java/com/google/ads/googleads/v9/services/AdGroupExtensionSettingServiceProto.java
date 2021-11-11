// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/ad_group_extension_setting_service.proto

package com.google.ads.googleads.v9.services;

public final class AdGroupExtensionSettingServiceProto {
  private AdGroupExtensionSettingServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_GetAdGroupExtensionSettingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_GetAdGroupExtensionSettingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateAdGroupExtensionSettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateAdGroupExtensionSettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_AdGroupExtensionSettingOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_AdGroupExtensionSettingOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateAdGroupExtensionSettingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateAdGroupExtensionSettingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateAdGroupExtensionSettingResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateAdGroupExtensionSettingResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIgoogle/ads/googleads/v9/services/ad_gr" +
      "oup_extension_setting_service.proto\022 goo" +
      "gle.ads.googleads.v9.services\0329google/ad" +
      "s/googleads/v9/enums/response_content_ty" +
      "pe.proto\032Bgoogle/ads/googleads/v9/resour" +
      "ces/ad_group_extension_setting.proto\032\034go" +
      "ogle/api/annotations.proto\032\027google/api/c" +
      "lient.proto\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\032 google/" +
      "protobuf/field_mask.proto\032\027google/rpc/st" +
      "atus.proto\"t\n!GetAdGroupExtensionSetting" +
      "Request\022O\n\rresource_name\030\001 \001(\tB8\340A\002\372A2\n0" +
      "googleads.googleapis.com/AdGroupExtensio" +
      "nSetting\"\316\001\n%MutateAdGroupExtensionSetti" +
      "ngsRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022[\n\n" +
      "operations\030\002 \003(\0132B.google.ads.googleads." +
      "v9.services.AdGroupExtensionSettingOpera" +
      "tionB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rva" +
      "lidate_only\030\004 \001(\010\"\371\002\n AdGroupExtensionSe" +
      "ttingOperation\022/\n\013update_mask\030\004 \001(\0132\032.go" +
      "ogle.protobuf.FieldMask\022i\n\025response_cont" +
      "ent_type\030\005 \001(\0162J.google.ads.googleads.v9" +
      ".enums.ResponseContentTypeEnum.ResponseC" +
      "ontentType\022L\n\006create\030\001 \001(\0132:.google.ads." +
      "googleads.v9.resources.AdGroupExtensionS" +
      "ettingH\000\022L\n\006update\030\002 \001(\0132:.google.ads.go" +
      "ogleads.v9.resources.AdGroupExtensionSet" +
      "tingH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\toperation\"\263\001" +
      "\n&MutateAdGroupExtensionSettingsResponse" +
      "\0221\n\025partial_failure_error\030\003 \001(\0132\022.google" +
      ".rpc.Status\022V\n\007results\030\002 \003(\0132E.google.ad" +
      "s.googleads.v9.services.MutateAdGroupExt" +
      "ensionSettingResult\"\234\001\n#MutateAdGroupExt" +
      "ensionSettingResult\022\025\n\rresource_name\030\001 \001" +
      "(\t\022^\n\032ad_group_extension_setting\030\002 \001(\0132:" +
      ".google.ads.googleads.v9.resources.AdGro" +
      "upExtensionSetting2\364\004\n\036AdGroupExtensionS" +
      "ettingService\022\361\001\n\032GetAdGroupExtensionSet" +
      "ting\022C.google.ads.googleads.v9.services." +
      "GetAdGroupExtensionSettingRequest\032:.goog" +
      "le.ads.googleads.v9.resources.AdGroupExt" +
      "ensionSetting\"R\202\323\344\223\002<\022:/v9/{resource_nam" +
      "e=customers/*/adGroupExtensionSettings/*" +
      "}\332A\rresource_name\022\226\002\n\036MutateAdGroupExten" +
      "sionSettings\022G.google.ads.googleads.v9.s" +
      "ervices.MutateAdGroupExtensionSettingsRe" +
      "quest\032H.google.ads.googleads.v9.services" +
      ".MutateAdGroupExtensionSettingsResponse\"" +
      "a\202\323\344\223\002B\"=/v9/customers/{customer_id=*}/a" +
      "dGroupExtensionSettings:mutate:\001*\332A\026cust" +
      "omer_id,operations\032E\312A\030googleads.googlea" +
      "pis.com\322A\'https://www.googleapis.com/aut" +
      "h/adwordsB\212\002\n$com.google.ads.googleads.v" +
      "9.servicesB#AdGroupExtensionSettingServi" +
      "ceProtoP\001ZHgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v9/services;servi" +
      "ces\242\002\003GAA\252\002 Google.Ads.GoogleAds.V9.Serv" +
      "ices\312\002 Google\\Ads\\GoogleAds\\V9\\Services\352" +
      "\002$Google::Ads::GoogleAds::V9::Servicesb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v9.resources.AdGroupExtensionSettingProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_GetAdGroupExtensionSettingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_GetAdGroupExtensionSettingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_GetAdGroupExtensionSettingRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v9_services_MutateAdGroupExtensionSettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v9_services_MutateAdGroupExtensionSettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateAdGroupExtensionSettingsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v9_services_AdGroupExtensionSettingOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v9_services_AdGroupExtensionSettingOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_AdGroupExtensionSettingOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "ResponseContentType", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v9_services_MutateAdGroupExtensionSettingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v9_services_MutateAdGroupExtensionSettingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateAdGroupExtensionSettingsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v9_services_MutateAdGroupExtensionSettingResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v9_services_MutateAdGroupExtensionSettingResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateAdGroupExtensionSettingResult_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupExtensionSetting", });
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
    com.google.ads.googleads.v9.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v9.resources.AdGroupExtensionSettingProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
