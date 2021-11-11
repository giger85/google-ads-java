// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/campaign_experiment.proto

package com.google.ads.googleads.v9.resources;

public final class CampaignExperimentProto {
  private CampaignExperimentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_CampaignExperiment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_CampaignExperiment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v9/resources/camp" +
      "aign_experiment.proto\022!google.ads.google" +
      "ads.v9.resources\032>google/ads/googleads/v" +
      "9/enums/campaign_experiment_status.proto" +
      "\032Jgoogle/ads/googleads/v9/enums/campaign" +
      "_experiment_traffic_split_type.proto\032\037go" +
      "ogle/api/field_behavior.proto\032\031google/ap" +
      "i/resource.proto\032\034google/api/annotations" +
      ".proto\"\313\007\n\022CampaignExperiment\022J\n\rresourc" +
      "e_name\030\001 \001(\tB3\340A\005\372A-\n+googleads.googleap" +
      "is.com/CampaignExperiment\022\024\n\002id\030\r \001(\003B\003\340" +
      "A\003H\000\210\001\001\022K\n\016campaign_draft\030\016 \001(\tB.\340A\005\372A(\n" +
      "&googleads.googleapis.com/CampaignDraftH" +
      "\001\210\001\001\022\021\n\004name\030\017 \001(\tH\002\210\001\001\022\030\n\013description\030\020" +
      " \001(\tH\003\210\001\001\022\'\n\025traffic_split_percent\030\021 \001(\003" +
      "B\003\340A\005H\004\210\001\001\022\211\001\n\022traffic_split_type\030\007 \001(\0162" +
      "h.google.ads.googleads.v9.enums.Campaign" +
      "ExperimentTrafficSplitTypeEnum.CampaignE" +
      "xperimentTrafficSplitTypeB\003\340A\005\022K\n\023experi" +
      "ment_campaign\030\022 \001(\tB)\340A\003\372A#\n!googleads.g" +
      "oogleapis.com/CampaignH\005\210\001\001\022i\n\006status\030\t " +
      "\001(\0162T.google.ads.googleads.v9.enums.Camp" +
      "aignExperimentStatusEnum.CampaignExperim" +
      "entStatusB\003\340A\003\022(\n\026long_running_operation" +
      "\030\023 \001(\tB\003\340A\003H\006\210\001\001\022\027\n\nstart_date\030\024 \001(\tH\007\210\001" +
      "\001\022\025\n\010end_date\030\025 \001(\tH\010\210\001\001:v\352As\n+googleads" +
      ".googleapis.com/CampaignExperiment\022Dcust" +
      "omers/{customer_id}/campaignExperiments/" +
      "{campaign_experiment_id}B\005\n\003_idB\021\n\017_camp" +
      "aign_draftB\007\n\005_nameB\016\n\014_descriptionB\030\n\026_" +
      "traffic_split_percentB\026\n\024_experiment_cam" +
      "paignB\031\n\027_long_running_operationB\r\n\013_sta" +
      "rt_dateB\013\n\t_end_dateB\204\002\n%com.google.ads." +
      "googleads.v9.resourcesB\027CampaignExperime" +
      "ntProtoP\001ZJgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v9/resources;reso" +
      "urces\242\002\003GAA\252\002!Google.Ads.GoogleAds.V9.Re" +
      "sources\312\002!Google\\Ads\\GoogleAds\\V9\\Resour" +
      "ces\352\002%Google::Ads::GoogleAds::V9::Resour" +
      "cesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.enums.CampaignExperimentStatusProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.CampaignExperimentTrafficSplitTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_CampaignExperiment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_CampaignExperiment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_CampaignExperiment_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "CampaignDraft", "Name", "Description", "TrafficSplitPercent", "TrafficSplitType", "ExperimentCampaign", "Status", "LongRunningOperation", "StartDate", "EndDate", "Id", "CampaignDraft", "Name", "Description", "TrafficSplitPercent", "ExperimentCampaign", "LongRunningOperation", "StartDate", "EndDate", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.enums.CampaignExperimentStatusProto.getDescriptor();
    com.google.ads.googleads.v9.enums.CampaignExperimentTrafficSplitTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
