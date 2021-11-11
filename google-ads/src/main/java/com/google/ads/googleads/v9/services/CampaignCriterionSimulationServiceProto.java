// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/campaign_criterion_simulation_service.proto

package com.google.ads.googleads.v9.services;

public final class CampaignCriterionSimulationServiceProto {
  private CampaignCriterionSimulationServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_GetCampaignCriterionSimulationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_GetCampaignCriterionSimulationRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nLgoogle/ads/googleads/v9/services/campa" +
      "ign_criterion_simulation_service.proto\022 " +
      "google.ads.googleads.v9.services\032Egoogle" +
      "/ads/googleads/v9/resources/campaign_cri" +
      "terion_simulation.proto\032\034google/api/anno" +
      "tations.proto\032\027google/api/client.proto\032\037" +
      "google/api/field_behavior.proto\032\031google/" +
      "api/resource.proto\"|\n%GetCampaignCriteri" +
      "onSimulationRequest\022S\n\rresource_name\030\001 \001" +
      "(\tB<\340A\002\372A6\n4googleads.googleapis.com/Cam" +
      "paignCriterionSimulation2\357\002\n\"CampaignCri" +
      "terionSimulationService\022\201\002\n\036GetCampaignC" +
      "riterionSimulation\022G.google.ads.googlead" +
      "s.v9.services.GetCampaignCriterionSimula" +
      "tionRequest\032>.google.ads.googleads.v9.re" +
      "sources.CampaignCriterionSimulation\"V\202\323\344" +
      "\223\002@\022>/v9/{resource_name=customers/*/camp" +
      "aignCriterionSimulations/*}\332A\rresource_n" +
      "ame\032E\312A\030googleads.googleapis.com\322A\'https" +
      "://www.googleapis.com/auth/adwordsB\216\002\n$c" +
      "om.google.ads.googleads.v9.servicesB\'Cam" +
      "paignCriterionSimulationServiceProtoP\001ZH" +
      "google.golang.org/genproto/googleapis/ad" +
      "s/googleads/v9/services;services\242\002\003GAA\252\002" +
      " Google.Ads.GoogleAds.V9.Services\312\002 Goog" +
      "le\\Ads\\GoogleAds\\V9\\Services\352\002$Google::A" +
      "ds::GoogleAds::V9::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.resources.CampaignCriterionSimulationProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_GetCampaignCriterionSimulationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_GetCampaignCriterionSimulationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_GetCampaignCriterionSimulationRequest_descriptor,
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
    com.google.ads.googleads.v9.resources.CampaignCriterionSimulationProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
