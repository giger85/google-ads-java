// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/ad_group_ad_asset_view.proto

package com.google.ads.googleads.v9.resources;

public final class AdGroupAdAssetViewProto {
  private AdGroupAdAssetViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_AdGroupAdAssetView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_AdGroupAdAssetView_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_AdGroupAdAssetPolicySummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_AdGroupAdAssetPolicySummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v9/resources/ad_g" +
      "roup_ad_asset_view.proto\022!google.ads.goo" +
      "gleads.v9.resources\032+google/ads/googlead" +
      "s/v9/common/policy.proto\0324google/ads/goo" +
      "gleads/v9/enums/asset_field_type.proto\032;" +
      "google/ads/googleads/v9/enums/asset_perf" +
      "ormance_label.proto\032:google/ads/googlead" +
      "s/v9/enums/policy_approval_status.proto\032" +
      "8google/ads/googleads/v9/enums/policy_re" +
      "view_status.proto\032\037google/api/field_beha" +
      "vior.proto\032\031google/api/resource.proto\032\034g" +
      "oogle/api/annotations.proto\"\332\005\n\022AdGroupA" +
      "dAssetView\022J\n\rresource_name\030\001 \001(\tB3\340A\003\372A" +
      "-\n+googleads.googleapis.com/AdGroupAdAss" +
      "etView\022D\n\013ad_group_ad\030\t \001(\tB*\340A\003\372A$\n\"goo" +
      "gleads.googleapis.com/AdGroupAdH\000\210\001\001\022:\n\005" +
      "asset\030\n \001(\tB&\340A\003\372A \n\036googleads.googleapi" +
      "s.com/AssetH\001\210\001\001\022Y\n\nfield_type\030\002 \001(\0162@.g" +
      "oogle.ads.googleads.v9.enums.AssetFieldT" +
      "ypeEnum.AssetFieldTypeB\003\340A\003\022\031\n\007enabled\030\010" +
      " \001(\010B\003\340A\003H\002\210\001\001\022[\n\016policy_summary\030\003 \001(\0132>" +
      ".google.ads.googleads.v9.resources.AdGro" +
      "upAdAssetPolicySummaryB\003\340A\003\022n\n\021performan" +
      "ce_label\030\004 \001(\0162N.google.ads.googleads.v9" +
      ".enums.AssetPerformanceLabelEnum.AssetPe" +
      "rformanceLabelB\003\340A\003:\214\001\352A\210\001\n+googleads.go" +
      "ogleapis.com/AdGroupAdAssetView\022Ycustome" +
      "rs/{customer_id}/adGroupAdAssetViews/{ad" +
      "_group_id}~{ad_id}~{asset_id}~{field_typ" +
      "e}B\016\n\014_ad_group_adB\010\n\006_assetB\n\n\010_enabled" +
      "\"\304\002\n\033AdGroupAdAssetPolicySummary\022S\n\024poli" +
      "cy_topic_entries\030\001 \003(\01320.google.ads.goog" +
      "leads.v9.common.PolicyTopicEntryB\003\340A\003\022d\n" +
      "\rreview_status\030\002 \001(\0162H.google.ads.google" +
      "ads.v9.enums.PolicyReviewStatusEnum.Poli" +
      "cyReviewStatusB\003\340A\003\022j\n\017approval_status\030\003" +
      " \001(\0162L.google.ads.googleads.v9.enums.Pol" +
      "icyApprovalStatusEnum.PolicyApprovalStat" +
      "usB\003\340A\003B\204\002\n%com.google.ads.googleads.v9." +
      "resourcesB\027AdGroupAdAssetViewProtoP\001ZJgo" +
      "ogle.golang.org/genproto/googleapis/ads/" +
      "googleads/v9/resources;resources\242\002\003GAA\252\002" +
      "!Google.Ads.GoogleAds.V9.Resources\312\002!Goo" +
      "gle\\Ads\\GoogleAds\\V9\\Resources\352\002%Google:" +
      ":Ads::GoogleAds::V9::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.AssetFieldTypeProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.AssetPerformanceLabelProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.PolicyApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.PolicyReviewStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_AdGroupAdAssetView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_AdGroupAdAssetView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_AdGroupAdAssetView_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupAd", "Asset", "FieldType", "Enabled", "PolicySummary", "PerformanceLabel", "AdGroupAd", "Asset", "Enabled", });
    internal_static_google_ads_googleads_v9_resources_AdGroupAdAssetPolicySummary_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v9_resources_AdGroupAdAssetPolicySummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_AdGroupAdAssetPolicySummary_descriptor,
        new java.lang.String[] { "PolicyTopicEntries", "ReviewStatus", "ApprovalStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v9.enums.AssetFieldTypeProto.getDescriptor();
    com.google.ads.googleads.v9.enums.AssetPerformanceLabelProto.getDescriptor();
    com.google.ads.googleads.v9.enums.PolicyApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v9.enums.PolicyReviewStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
