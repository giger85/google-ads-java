// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/keyword_plan_campaign_service.proto

package com.google.ads.googleads.v9.services;

public final class KeywordPlanCampaignServiceProto {
  private KeywordPlanCampaignServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_GetKeywordPlanCampaignRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_GetKeywordPlanCampaignRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateKeywordPlanCampaignsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateKeywordPlanCampaignsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_KeywordPlanCampaignOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_KeywordPlanCampaignOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateKeywordPlanCampaignsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateKeywordPlanCampaignsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateKeywordPlanCampaignResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateKeywordPlanCampaignResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v9/services/keywo" +
      "rd_plan_campaign_service.proto\022 google.a" +
      "ds.googleads.v9.services\032=google/ads/goo" +
      "gleads/v9/resources/keyword_plan_campaig" +
      "n.proto\032\034google/api/annotations.proto\032\027g" +
      "oogle/api/client.proto\032\037google/api/field" +
      "_behavior.proto\032\031google/api/resource.pro" +
      "to\032 google/protobuf/field_mask.proto\032\027go" +
      "ogle/rpc/status.proto\"l\n\035GetKeywordPlanC" +
      "ampaignRequest\022K\n\rresource_name\030\001 \001(\tB4\340" +
      "A\002\372A.\n,googleads.googleapis.com/KeywordP" +
      "lanCampaign\"\306\001\n!MutateKeywordPlanCampaig" +
      "nsRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022W\n\no" +
      "perations\030\002 \003(\0132>.google.ads.googleads.v" +
      "9.services.KeywordPlanCampaignOperationB" +
      "\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidat" +
      "e_only\030\004 \001(\010\"\265\002\n\034KeywordPlanCampaignOper" +
      "ation\022/\n\013update_mask\030\004 \001(\0132\032.google.prot" +
      "obuf.FieldMask\022H\n\006create\030\001 \001(\01326.google." +
      "ads.googleads.v9.resources.KeywordPlanCa" +
      "mpaignH\000\022H\n\006update\030\002 \001(\01326.google.ads.go" +
      "ogleads.v9.resources.KeywordPlanCampaign" +
      "H\000\022C\n\006remove\030\003 \001(\tB1\372A.\n,googleads.googl" +
      "eapis.com/KeywordPlanCampaignH\000B\013\n\topera" +
      "tion\"\253\001\n\"MutateKeywordPlanCampaignsRespo" +
      "nse\0221\n\025partial_failure_error\030\003 \001(\0132\022.goo" +
      "gle.rpc.Status\022R\n\007results\030\002 \003(\0132A.google" +
      ".ads.googleads.v9.services.MutateKeyword" +
      "PlanCampaignResult\"8\n\037MutateKeywordPlanC" +
      "ampaignResult\022\025\n\rresource_name\030\001 \001(\t2\320\004\n" +
      "\032KeywordPlanCampaignService\022\341\001\n\026GetKeywo" +
      "rdPlanCampaign\022?.google.ads.googleads.v9" +
      ".services.GetKeywordPlanCampaignRequest\032" +
      "6.google.ads.googleads.v9.resources.Keyw" +
      "ordPlanCampaign\"N\202\323\344\223\0028\0226/v9/{resource_n" +
      "ame=customers/*/keywordPlanCampaigns/*}\332" +
      "A\rresource_name\022\206\002\n\032MutateKeywordPlanCam" +
      "paigns\022C.google.ads.googleads.v9.service" +
      "s.MutateKeywordPlanCampaignsRequest\032D.go" +
      "ogle.ads.googleads.v9.services.MutateKey" +
      "wordPlanCampaignsResponse\"]\202\323\344\223\002>\"9/v9/c" +
      "ustomers/{customer_id=*}/keywordPlanCamp" +
      "aigns:mutate:\001*\332A\026customer_id,operations" +
      "\032E\312A\030googleads.googleapis.com\322A\'https://" +
      "www.googleapis.com/auth/adwordsB\206\002\n$com." +
      "google.ads.googleads.v9.servicesB\037Keywor" +
      "dPlanCampaignServiceProtoP\001ZHgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v9/services;services\242\002\003GAA\252\002 Google.Ads" +
      ".GoogleAds.V9.Services\312\002 Google\\Ads\\Goog" +
      "leAds\\V9\\Services\352\002$Google::Ads::GoogleA" +
      "ds::V9::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.resources.KeywordPlanCampaignProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_GetKeywordPlanCampaignRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_GetKeywordPlanCampaignRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_GetKeywordPlanCampaignRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v9_services_MutateKeywordPlanCampaignsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v9_services_MutateKeywordPlanCampaignsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateKeywordPlanCampaignsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v9_services_KeywordPlanCampaignOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v9_services_KeywordPlanCampaignOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_KeywordPlanCampaignOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v9_services_MutateKeywordPlanCampaignsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v9_services_MutateKeywordPlanCampaignsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateKeywordPlanCampaignsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v9_services_MutateKeywordPlanCampaignResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v9_services_MutateKeywordPlanCampaignResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateKeywordPlanCampaignResult_descriptor,
        new java.lang.String[] { "ResourceName", });
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
    com.google.ads.googleads.v9.resources.KeywordPlanCampaignProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
