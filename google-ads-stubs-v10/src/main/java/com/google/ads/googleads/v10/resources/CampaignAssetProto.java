// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/campaign_asset.proto

package com.google.ads.googleads.v10.resources;

public final class CampaignAssetProto {
  private CampaignAssetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_CampaignAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_CampaignAsset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v10/resources/cam" +
      "paign_asset.proto\022\"google.ads.googleads." +
      "v10.resources\0325google/ads/googleads/v10/" +
      "enums/asset_field_type.proto\0326google/ads" +
      "/googleads/v10/enums/asset_link_status.p" +
      "roto\032\037google/api/field_behavior.proto\032\031g" +
      "oogle/api/resource.proto\"\227\004\n\rCampaignAss" +
      "et\022E\n\rresource_name\030\001 \001(\tB.\340A\005\372A(\n&googl" +
      "eads.googleapis.com/CampaignAsset\022@\n\010cam" +
      "paign\030\006 \001(\tB)\340A\005\372A#\n!googleads.googleapi" +
      "s.com/CampaignH\000\210\001\001\022:\n\005asset\030\007 \001(\tB&\340A\005\372" +
      "A \n\036googleads.googleapis.com/AssetH\001\210\001\001\022" +
      "Z\n\nfield_type\030\004 \001(\0162A.google.ads.googlea" +
      "ds.v10.enums.AssetFieldTypeEnum.AssetFie" +
      "ldTypeB\003\340A\005\022S\n\006status\030\005 \001(\0162C.google.ads" +
      ".googleads.v10.enums.AssetLinkStatusEnum" +
      ".AssetLinkStatus:y\352Av\n&googleads.googlea" +
      "pis.com/CampaignAsset\022Lcustomers/{custom" +
      "er_id}/campaignAssets/{campaign_id}~{ass" +
      "et_id}~{field_type}B\013\n\t_campaignB\010\n\006_ass" +
      "etB\204\002\n&com.google.ads.googleads.v10.reso" +
      "urcesB\022CampaignAssetProtoP\001ZKgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v10/resources;resources\242\002\003GAA\252\002\"Google." +
      "Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads" +
      "\\GoogleAds\\V10\\Resources\352\002&Google::Ads::" +
      "GoogleAds::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.AssetFieldTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.AssetLinkStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_CampaignAsset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_CampaignAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_CampaignAsset_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "Asset", "FieldType", "Status", "Campaign", "Asset", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.AssetFieldTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.AssetLinkStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
