// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/customer_negative_criterion_service.proto

package com.google.ads.googleads.v9.services;

public final class CustomerNegativeCriterionServiceProto {
  private CustomerNegativeCriterionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_GetCustomerNegativeCriterionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_GetCustomerNegativeCriterionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateCustomerNegativeCriteriaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateCustomerNegativeCriteriaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_CustomerNegativeCriterionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_CustomerNegativeCriterionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateCustomerNegativeCriteriaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateCustomerNegativeCriteriaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_services_MutateCustomerNegativeCriteriaResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_services_MutateCustomerNegativeCriteriaResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nJgoogle/ads/googleads/v9/services/custo" +
      "mer_negative_criterion_service.proto\022 go" +
      "ogle.ads.googleads.v9.services\0329google/a" +
      "ds/googleads/v9/enums/response_content_t" +
      "ype.proto\032Cgoogle/ads/googleads/v9/resou" +
      "rces/customer_negative_criterion.proto\032\034" +
      "google/api/annotations.proto\032\027google/api" +
      "/client.proto\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\032\027googl" +
      "e/rpc/status.proto\"x\n#GetCustomerNegativ" +
      "eCriterionRequest\022Q\n\rresource_name\030\001 \001(\t" +
      "B:\340A\002\372A4\n2googleads.googleapis.com/Custo" +
      "merNegativeCriterion\"\273\002\n%MutateCustomerN" +
      "egativeCriteriaRequest\022\030\n\013customer_id\030\001 " +
      "\001(\tB\003\340A\002\022]\n\noperations\030\002 \003(\0132D.google.ad" +
      "s.googleads.v9.services.CustomerNegative" +
      "CriterionOperationB\003\340A\002\022\027\n\017partial_failu" +
      "re\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022i\n\025respo" +
      "nse_content_type\030\005 \001(\0162J.google.ads.goog" +
      "leads.v9.enums.ResponseContentTypeEnum.R" +
      "esponseContentType\"\223\001\n\"CustomerNegativeC" +
      "riterionOperation\022N\n\006create\030\001 \001(\0132<.goog" +
      "le.ads.googleads.v9.resources.CustomerNe" +
      "gativeCriterionH\000\022\020\n\006remove\030\002 \001(\tH\000B\013\n\to" +
      "peration\"\264\001\n&MutateCustomerNegativeCrite" +
      "riaResponse\0221\n\025partial_failure_error\030\003 \001" +
      "(\0132\022.google.rpc.Status\022W\n\007results\030\002 \003(\0132" +
      "F.google.ads.googleads.v9.services.Mutat" +
      "eCustomerNegativeCriteriaResult\"\240\001\n$Muta" +
      "teCustomerNegativeCriteriaResult\022\025\n\rreso" +
      "urce_name\030\001 \001(\t\022a\n\033customer_negative_cri" +
      "terion\030\002 \001(\0132<.google.ads.googleads.v9.r" +
      "esources.CustomerNegativeCriterion2\374\004\n C" +
      "ustomerNegativeCriterionService\022\367\001\n\034GetC" +
      "ustomerNegativeCriterion\022E.google.ads.go" +
      "ogleads.v9.services.GetCustomerNegativeC" +
      "riterionRequest\032<.google.ads.googleads.v" +
      "9.resources.CustomerNegativeCriterion\"R\202" +
      "\323\344\223\002<\022:/v9/{resource_name=customers/*/cu" +
      "stomerNegativeCriteria/*}\332A\rresource_nam" +
      "e\022\226\002\n\036MutateCustomerNegativeCriteria\022G.g" +
      "oogle.ads.googleads.v9.services.MutateCu" +
      "stomerNegativeCriteriaRequest\032H.google.a" +
      "ds.googleads.v9.services.MutateCustomerN" +
      "egativeCriteriaResponse\"a\202\323\344\223\002B\"=/v9/cus" +
      "tomers/{customer_id=*}/customerNegativeC" +
      "riteria:mutate:\001*\332A\026customer_id,operatio" +
      "ns\032E\312A\030googleads.googleapis.com\322A\'https:" +
      "//www.googleapis.com/auth/adwordsB\214\002\n$co" +
      "m.google.ads.googleads.v9.servicesB%Cust" +
      "omerNegativeCriterionServiceProtoP\001ZHgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v9/services;services\242\002\003GAA\252\002 Go" +
      "ogle.Ads.GoogleAds.V9.Services\312\002 Google\\" +
      "Ads\\GoogleAds\\V9\\Services\352\002$Google::Ads:" +
      ":GoogleAds::V9::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v9.resources.CustomerNegativeCriterionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_services_GetCustomerNegativeCriterionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_services_GetCustomerNegativeCriterionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_GetCustomerNegativeCriterionRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v9_services_MutateCustomerNegativeCriteriaRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v9_services_MutateCustomerNegativeCriteriaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateCustomerNegativeCriteriaRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v9_services_CustomerNegativeCriterionOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v9_services_CustomerNegativeCriterionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_CustomerNegativeCriterionOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v9_services_MutateCustomerNegativeCriteriaResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v9_services_MutateCustomerNegativeCriteriaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateCustomerNegativeCriteriaResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v9_services_MutateCustomerNegativeCriteriaResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v9_services_MutateCustomerNegativeCriteriaResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_services_MutateCustomerNegativeCriteriaResult_descriptor,
        new java.lang.String[] { "ResourceName", "CustomerNegativeCriterion", });
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
    com.google.ads.googleads.v9.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v9.resources.CustomerNegativeCriterionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
