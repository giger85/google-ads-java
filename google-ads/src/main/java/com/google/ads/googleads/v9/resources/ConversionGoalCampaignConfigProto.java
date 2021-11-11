// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/conversion_goal_campaign_config.proto

package com.google.ads.googleads.v9.resources;

public final class ConversionGoalCampaignConfigProto {
  private ConversionGoalCampaignConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_ConversionGoalCampaignConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_ConversionGoalCampaignConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/ads/googleads/v9/resources/conv" +
      "ersion_goal_campaign_config.proto\022!googl" +
      "e.ads.googleads.v9.resources\0325google/ads" +
      "/googleads/v9/enums/goal_config_level.pr" +
      "oto\032\037google/api/field_behavior.proto\032\031go" +
      "ogle/api/resource.proto\032\034google/api/anno" +
      "tations.proto\"\350\003\n\034ConversionGoalCampaign" +
      "Config\022T\n\rresource_name\030\001 \001(\tB=\340A\005\372A7\n5g" +
      "oogleads.googleapis.com/ConversionGoalCa" +
      "mpaignConfig\022;\n\010campaign\030\002 \001(\tB)\340A\005\372A#\n!" +
      "googleads.googleapis.com/Campaign\022]\n\021goa" +
      "l_config_level\030\003 \001(\0162B.google.ads.google" +
      "ads.v9.enums.GoalConfigLevelEnum.GoalCon" +
      "figLevel\022U\n\026custom_conversion_goal\030\004 \001(\t" +
      "B5\340A\005\372A/\n-googleads.googleapis.com/Custo" +
      "mConversionGoal:\177\352A|\n5googleads.googleap" +
      "is.com/ConversionGoalCampaignConfig\022Ccus" +
      "tomers/{customer_id}/conversionGoalCampa" +
      "ignConfigs/{campaign_id}B\216\002\n%com.google." +
      "ads.googleads.v9.resourcesB!ConversionGo" +
      "alCampaignConfigProtoP\001ZJgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v9/" +
      "resources;resources\242\002\003GAA\252\002!Google.Ads.G" +
      "oogleAds.V9.Resources\312\002!Google\\Ads\\Googl" +
      "eAds\\V9\\Resources\352\002%Google::Ads::GoogleA" +
      "ds::V9::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.enums.GoalConfigLevelProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_ConversionGoalCampaignConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_ConversionGoalCampaignConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_ConversionGoalCampaignConfig_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "GoalConfigLevel", "CustomConversionGoal", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.enums.GoalConfigLevelProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
