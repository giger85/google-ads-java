// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/asset_field_type_view_service.proto

package com.google.ads.googleads.v9.services;

public final class AssetFieldTypeViewServiceProto {
  private AssetFieldTypeViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_GetAssetFieldTypeViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_GetAssetFieldTypeViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v9/services/asset" +
      "_field_type_view_service.proto\022 google.a" +
      "ds.googleads.v9.services\032=google/ads/goo" +
      "gleads/v9/resources/asset_field_type_vie" +
      "w.proto\032\034google/api/annotations.proto\032\027g" +
      "oogle/api/client.proto\032\037google/api/field" +
      "_behavior.proto\032\031google/api/resource.pro" +
      "to\"j\n\034GetAssetFieldTypeViewRequest\022J\n\rre" +
      "source_name\030\001 \001(\tB3\340A\002\372A-\n+googleads.goo" +
      "gleapis.com/AssetFieldTypeView2\302\002\n\031Asset" +
      "FieldTypeViewService\022\335\001\n\025GetAssetFieldTy" +
      "peView\022>.google.ads.googleads.v9.service" +
      "s.GetAssetFieldTypeViewRequest\0325.google." +
      "ads.googleads.v9.resources.AssetFieldTyp" +
      "eView\"M\202\323\344\223\0027\0225/v9/{resource_name=custom" +
      "ers/*/assetFieldTypeViews/*}\332A\rresource_" +
      "name\032E\312A\030googleads.googleapis.com\322A\'http" +
      "s://www.googleapis.com/auth/adwordsB\205\002\n$" +
      "com.google.ads.googleads.v9.servicesB\036As" +
      "setFieldTypeViewServiceProtoP\001ZHgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v9/services;services\242\002\003GAA\252\002 Google." +
      "Ads.GoogleAds.V9.Services\312\002 Google\\Ads\\G" +
      "oogleAds\\V9\\Services\352\002$Google::Ads::Goog" +
      "leAds::V9::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.resources.AssetFieldTypeViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_GetAssetFieldTypeViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_GetAssetFieldTypeViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_GetAssetFieldTypeViewRequest_descriptor,
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
    com.google.ads.googleads.v9.resources.AssetFieldTypeViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
