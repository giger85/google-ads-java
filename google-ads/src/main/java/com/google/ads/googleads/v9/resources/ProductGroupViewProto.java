// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/product_group_view.proto

package com.google.ads.googleads.v9.resources;

public final class ProductGroupViewProto {
  private ProductGroupViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_ProductGroupView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_ProductGroupView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v9/resources/prod" +
      "uct_group_view.proto\022!google.ads.googlea" +
      "ds.v9.resources\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\032\034goo" +
      "gle/api/annotations.proto\"\323\001\n\020ProductGro" +
      "upView\022H\n\rresource_name\030\001 \001(\tB1\340A\003\372A+\n)g" +
      "oogleads.googleapis.com/ProductGroupView" +
      ":u\352Ar\n)googleads.googleapis.com/ProductG" +
      "roupView\022Ecustomers/{customer_id}/produc" +
      "tGroupViews/{adgroup_id}~{criterion_id}B" +
      "\202\002\n%com.google.ads.googleads.v9.resource" +
      "sB\025ProductGroupViewProtoP\001ZJgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v9/resources;resources\242\002\003GAA\252\002!Google.Ad" +
      "s.GoogleAds.V9.Resources\312\002!Google\\Ads\\Go" +
      "ogleAds\\V9\\Resources\352\002%Google::Ads::Goog" +
      "leAds::V9::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_ProductGroupView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_ProductGroupView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_ProductGroupView_descriptor,
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
