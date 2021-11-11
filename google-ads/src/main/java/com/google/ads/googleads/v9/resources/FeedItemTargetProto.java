// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/feed_item_target.proto

package com.google.ads.googleads.v9.resources;

public final class FeedItemTargetProto {
  private FeedItemTargetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_FeedItemTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_FeedItemTarget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v9/resources/feed" +
      "_item_target.proto\022!google.ads.googleads" +
      ".v9.resources\032-google/ads/googleads/v9/c" +
      "ommon/criteria.proto\032;google/ads/googlea" +
      "ds/v9/enums/feed_item_target_device.prot" +
      "o\032;google/ads/googleads/v9/enums/feed_it" +
      "em_target_status.proto\0329google/ads/googl" +
      "eads/v9/enums/feed_item_target_type.prot" +
      "o\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\032\034google/api/annota" +
      "tions.proto\"\251\010\n\016FeedItemTarget\022F\n\rresour" +
      "ce_name\030\001 \001(\tB/\340A\005\372A)\n\'googleads.googlea" +
      "pis.com/FeedItemTarget\022A\n\tfeed_item\030\014 \001(" +
      "\tB)\340A\005\372A#\n!googleads.googleapis.com/Feed" +
      "ItemH\001\210\001\001\022l\n\025feed_item_target_type\030\003 \001(\016" +
      "2H.google.ads.googleads.v9.enums.FeedIte" +
      "mTargetTypeEnum.FeedItemTargetTypeB\003\340A\003\022" +
      "%\n\023feed_item_target_id\030\r \001(\003B\003\340A\003H\002\210\001\001\022a" +
      "\n\006status\030\013 \001(\0162L.google.ads.googleads.v9" +
      ".enums.FeedItemTargetStatusEnum.FeedItem" +
      "TargetStatusB\003\340A\003\022=\n\010campaign\030\016 \001(\tB)\340A\005" +
      "\372A#\n!googleads.googleapis.com/CampaignH\000" +
      "\022<\n\010ad_group\030\017 \001(\tB(\340A\005\372A\"\n googleads.go" +
      "ogleapis.com/AdGroupH\000\022C\n\007keyword\030\007 \001(\0132" +
      "+.google.ads.googleads.v9.common.Keyword" +
      "InfoB\003\340A\005H\000\022Q\n\023geo_target_constant\030\020 \001(\t" +
      "B2\340A\005\372A,\n*googleads.googleapis.com/GeoTa" +
      "rgetConstantH\000\022c\n\006device\030\t \001(\0162L.google." +
      "ads.googleads.v9.enums.FeedItemTargetDev" +
      "iceEnum.FeedItemTargetDeviceB\003\340A\005H\000\022J\n\013a" +
      "d_schedule\030\n \001(\0132..google.ads.googleads." +
      "v9.common.AdScheduleInfoB\003\340A\005H\000:\235\001\352A\231\001\n\'" +
      "googleads.googleapis.com/FeedItemTarget\022" +
      "ncustomers/{customer_id}/feedItemTargets" +
      "/{feed_id}~{feed_item_id}~{feed_item_tar" +
      "get_type}~{feed_item_target_id}B\010\n\006targe" +
      "tB\014\n\n_feed_itemB\026\n\024_feed_item_target_idB" +
      "\200\002\n%com.google.ads.googleads.v9.resource" +
      "sB\023FeedItemTargetProtoP\001ZJgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v9" +
      "/resources;resources\242\002\003GAA\252\002!Google.Ads." +
      "GoogleAds.V9.Resources\312\002!Google\\Ads\\Goog" +
      "leAds\\V9\\Resources\352\002%Google::Ads::Google" +
      "Ads::V9::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.FeedItemTargetDeviceProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.FeedItemTargetStatusProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.FeedItemTargetTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_FeedItemTarget_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_FeedItemTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_FeedItemTarget_descriptor,
        new java.lang.String[] { "ResourceName", "FeedItem", "FeedItemTargetType", "FeedItemTargetId", "Status", "Campaign", "AdGroup", "Keyword", "GeoTargetConstant", "Device", "AdSchedule", "Target", "FeedItem", "FeedItemTargetId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v9.enums.FeedItemTargetDeviceProto.getDescriptor();
    com.google.ads.googleads.v9.enums.FeedItemTargetStatusProto.getDescriptor();
    com.google.ads.googleads.v9.enums.FeedItemTargetTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
