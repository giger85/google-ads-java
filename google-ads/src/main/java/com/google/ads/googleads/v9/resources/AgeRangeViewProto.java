// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/age_range_view.proto

package com.google.ads.googleads.v9.resources;

public final class AgeRangeViewProto {
  private AgeRangeViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_AgeRangeView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_AgeRangeView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v9/resources/age_" +
      "range_view.proto\022!google.ads.googleads.v" +
      "9.resources\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\032\034google/" +
      "api/annotations.proto\"\304\001\n\014AgeRangeView\022D" +
      "\n\rresource_name\030\001 \001(\tB-\340A\003\372A\'\n%googleads" +
      ".googleapis.com/AgeRangeView:n\352Ak\n%googl" +
      "eads.googleapis.com/AgeRangeView\022Bcustom" +
      "ers/{customer_id}/ageRangeViews/{ad_grou" +
      "p_id}~{criterion_id}B\376\001\n%com.google.ads." +
      "googleads.v9.resourcesB\021AgeRangeViewProt" +
      "oP\001ZJgoogle.golang.org/genproto/googleap" +
      "is/ads/googleads/v9/resources;resources\242" +
      "\002\003GAA\252\002!Google.Ads.GoogleAds.V9.Resource" +
      "s\312\002!Google\\Ads\\GoogleAds\\V9\\Resources\352\002%" +
      "Google::Ads::GoogleAds::V9::Resourcesb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_AgeRangeView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_AgeRangeView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_AgeRangeView_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
