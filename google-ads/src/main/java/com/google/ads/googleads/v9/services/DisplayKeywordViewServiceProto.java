// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/display_keyword_view_service.proto

package com.google.ads.googleads.v9.services;

public final class DisplayKeywordViewServiceProto {
  private DisplayKeywordViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_GetDisplayKeywordViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_GetDisplayKeywordViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v9/services/displ" +
      "ay_keyword_view_service.proto\022 google.ad" +
      "s.googleads.v9.services\032<google/ads/goog" +
      "leads/v9/resources/display_keyword_view." +
      "proto\032\034google/api/annotations.proto\032\027goo" +
      "gle/api/client.proto\032\037google/api/field_b" +
      "ehavior.proto\032\031google/api/resource.proto" +
      "\"j\n\034GetDisplayKeywordViewRequest\022J\n\rreso" +
      "urce_name\030\001 \001(\tB3\340A\002\372A-\n+googleads.googl" +
      "eapis.com/DisplayKeywordView2\302\002\n\031Display" +
      "KeywordViewService\022\335\001\n\025GetDisplayKeyword" +
      "View\022>.google.ads.googleads.v9.services." +
      "GetDisplayKeywordViewRequest\0325.google.ad" +
      "s.googleads.v9.resources.DisplayKeywordV" +
      "iew\"M\202\323\344\223\0027\0225/v9/{resource_name=customer" +
      "s/*/displayKeywordViews/*}\332A\rresource_na" +
      "me\032E\312A\030googleads.googleapis.com\322A\'https:" +
      "//www.googleapis.com/auth/adwordsB\205\002\n$co" +
      "m.google.ads.googleads.v9.servicesB\036Disp" +
      "layKeywordViewServiceProtoP\001ZHgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v9/services;services\242\002\003GAA\252\002 Google.Ad" +
      "s.GoogleAds.V9.Services\312\002 Google\\Ads\\Goo" +
      "gleAds\\V9\\Services\352\002$Google::Ads::Google" +
      "Ads::V9::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.resources.DisplayKeywordViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_GetDisplayKeywordViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_GetDisplayKeywordViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_GetDisplayKeywordViewRequest_descriptor,
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
    com.google.ads.googleads.v9.resources.DisplayKeywordViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
