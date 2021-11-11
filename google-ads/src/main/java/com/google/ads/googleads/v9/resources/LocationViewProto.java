// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/location_view.proto

package com.google.ads.googleads.v9.resources;

public final class LocationViewProto {
  private LocationViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_LocationView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_LocationView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v9/resources/loca" +
      "tion_view.proto\022!google.ads.googleads.v9" +
      ".resources\032\037google/api/field_behavior.pr" +
      "oto\032\031google/api/resource.proto\032\034google/a" +
      "pi/annotations.proto\"\304\001\n\014LocationView\022D\n" +
      "\rresource_name\030\001 \001(\tB-\340A\003\372A\'\n%googleads." +
      "googleapis.com/LocationView:n\352Ak\n%google" +
      "ads.googleapis.com/LocationView\022Bcustome" +
      "rs/{customer_id}/locationViews/{campaign" +
      "_id}~{criterion_id}B\376\001\n%com.google.ads.g" +
      "oogleads.v9.resourcesB\021LocationViewProto" +
      "P\001ZJgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v9/resources;resources\242\002" +
      "\003GAA\252\002!Google.Ads.GoogleAds.V9.Resources" +
      "\312\002!Google\\Ads\\GoogleAds\\V9\\Resources\352\002%G" +
      "oogle::Ads::GoogleAds::V9::Resourcesb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_LocationView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_LocationView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_LocationView_descriptor,
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
