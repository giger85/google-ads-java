// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/custom_conversion_goal_service.proto

package com.google.ads.googleads.v9.services;

public final class CustomConversionGoalServiceProto {
  private CustomConversionGoalServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateCustomConversionGoalsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateCustomConversionGoalsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_CustomConversionGoalOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_CustomConversionGoalOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateCustomConversionGoalsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateCustomConversionGoalsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateCustomConversionGoalResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateCustomConversionGoalResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v9/services/custo" +
      "m_conversion_goal_service.proto\022 google." +
      "ads.googleads.v9.services\0329google/ads/go" +
      "ogleads/v9/enums/response_content_type.p" +
      "roto\032>google/ads/googleads/v9/resources/" +
      "custom_conversion_goal.proto\032\034google/api" +
      "/annotations.proto\032\027google/api/client.pr" +
      "oto\032\037google/api/field_behavior.proto\032 go" +
      "ogle/protobuf/field_mask.proto\"\232\002\n\"Mutat" +
      "eCustomConversionGoalsRequest\022\030\n\013custome" +
      "r_id\030\001 \001(\tB\003\340A\002\022X\n\noperations\030\002 \003(\0132?.go" +
      "ogle.ads.googleads.v9.services.CustomCon" +
      "versionGoalOperationB\003\340A\002\022\025\n\rvalidate_on" +
      "ly\030\003 \001(\010\022i\n\025response_content_type\030\004 \001(\0162" +
      "J.google.ads.googleads.v9.enums.Response" +
      "ContentTypeEnum.ResponseContentType\"\205\002\n\035" +
      "CustomConversionGoalOperation\022/\n\013update_" +
      "mask\030\004 \001(\0132\032.google.protobuf.FieldMask\022I" +
      "\n\006create\030\001 \001(\01327.google.ads.googleads.v9" +
      ".resources.CustomConversionGoalH\000\022I\n\006upd" +
      "ate\030\002 \001(\01327.google.ads.googleads.v9.reso" +
      "urces.CustomConversionGoalH\000\022\020\n\006remove\030\003" +
      " \001(\tH\000B\013\n\toperation\"z\n#MutateCustomConve" +
      "rsionGoalsResponse\022S\n\007results\030\001 \003(\0132B.go" +
      "ogle.ads.googleads.v9.services.MutateCus" +
      "tomConversionGoalResult\"\222\001\n MutateCustom" +
      "ConversionGoalResult\022\025\n\rresource_name\030\001 " +
      "\001(\t\022W\n\026custom_conversion_goal\030\002 \001(\01327.go" +
      "ogle.ads.googleads.v9.resources.CustomCo" +
      "nversionGoal2\361\002\n\033CustomConversionGoalSer" +
      "vice\022\212\002\n\033MutateCustomConversionGoals\022D.g" +
      "oogle.ads.googleads.v9.services.MutateCu" +
      "stomConversionGoalsRequest\032E.google.ads." +
      "googleads.v9.services.MutateCustomConver" +
      "sionGoalsResponse\"^\202\323\344\223\002?\":/v9/customers" +
      "/{customer_id=*}/customConversionGoals:m" +
      "utate:\001*\332A\026customer_id,operations\032E\312A\030go" +
      "ogleads.googleapis.com\322A\'https://www.goo" +
      "gleapis.com/auth/adwordsB\207\002\n$com.google." +
      "ads.googleads.v9.servicesB CustomConvers" +
      "ionGoalServiceProtoP\001ZHgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v9/se" +
      "rvices;services\242\002\003GAA\252\002 Google.Ads.Googl" +
      "eAds.V9.Services\312\002 Google\\Ads\\GoogleAds\\" +
      "V9\\Services\352\002$Google::Ads::GoogleAds::V9" +
      "::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v9.resources.CustomConversionGoalProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_MutateCustomConversionGoalsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_MutateCustomConversionGoalsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateCustomConversionGoalsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v9_services_CustomConversionGoalOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v9_services_CustomConversionGoalOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_CustomConversionGoalOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v9_services_MutateCustomConversionGoalsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v9_services_MutateCustomConversionGoalsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateCustomConversionGoalsResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v9_services_MutateCustomConversionGoalResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v9_services_MutateCustomConversionGoalResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateCustomConversionGoalResult_descriptor,
        new java.lang.String[] { "ResourceName", "CustomConversionGoal", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v9.resources.CustomConversionGoalProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
