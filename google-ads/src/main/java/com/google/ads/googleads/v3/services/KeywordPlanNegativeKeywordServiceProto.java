// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/keyword_plan_negative_keyword_service.proto

package com.google.ads.googleads.v3.services;

public final class KeywordPlanNegativeKeywordServiceProto {
  private KeywordPlanNegativeKeywordServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetKeywordPlanNegativeKeywordRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetKeywordPlanNegativeKeywordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlanNegativeKeywordsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateKeywordPlanNegativeKeywordsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_KeywordPlanNegativeKeywordOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_KeywordPlanNegativeKeywordOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlanNegativeKeywordsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateKeywordPlanNegativeKeywordsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlanNegativeKeywordResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateKeywordPlanNegativeKeywordResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nLgoogle/ads/googleads/v3/services/keywo" +
      "rd_plan_negative_keyword_service.proto\022 " +
      "google.ads.googleads.v3.services\032Egoogle" +
      "/ads/googleads/v3/resources/keyword_plan" +
      "_negative_keyword.proto\032\034google/api/anno" +
      "tations.proto\032\027google/api/client.proto\032\037" +
      "google/api/field_behavior.proto\032\031google/" +
      "api/resource.proto\032 google/protobuf/fiel" +
      "d_mask.proto\032\027google/rpc/status.proto\"z\n" +
      "$GetKeywordPlanNegativeKeywordRequest\022R\n" +
      "\rresource_name\030\001 \001(\tB;\340A\002\372A5\n3googleads." +
      "googleapis.com/KeywordPlanNegativeKeywor" +
      "d\"\324\001\n(MutateKeywordPlanNegativeKeywordsR" +
      "equest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022^\n\noper" +
      "ations\030\002 \003(\0132E.google.ads.googleads.v3.s" +
      "ervices.KeywordPlanNegativeKeywordOperat" +
      "ionB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rval" +
      "idate_only\030\004 \001(\010\"\227\002\n#KeywordPlanNegative" +
      "KeywordOperation\022/\n\013update_mask\030\004 \001(\0132\032." +
      "google.protobuf.FieldMask\022O\n\006create\030\001 \001(" +
      "\0132=.google.ads.googleads.v3.resources.Ke" +
      "ywordPlanNegativeKeywordH\000\022O\n\006update\030\002 \001" +
      "(\0132=.google.ads.googleads.v3.resources.K" +
      "eywordPlanNegativeKeywordH\000\022\020\n\006remove\030\003 " +
      "\001(\tH\000B\013\n\toperation\"\271\001\n)MutateKeywordPlan" +
      "NegativeKeywordsResponse\0221\n\025partial_fail" +
      "ure_error\030\003 \001(\0132\022.google.rpc.Status\022Y\n\007r" +
      "esults\030\002 \003(\0132H.google.ads.googleads.v3.s" +
      "ervices.MutateKeywordPlanNegativeKeyword" +
      "Result\"?\n&MutateKeywordPlanNegativeKeywo" +
      "rdResult\022\025\n\rresource_name\030\001 \001(\t2\345\004\n!Keyw" +
      "ordPlanNegativeKeywordService\022\375\001\n\035GetKey" +
      "wordPlanNegativeKeyword\022F.google.ads.goo" +
      "gleads.v3.services.GetKeywordPlanNegativ" +
      "eKeywordRequest\032=.google.ads.googleads.v" +
      "3.resources.KeywordPlanNegativeKeyword\"U" +
      "\202\323\344\223\002?\022=/v3/{resource_name=customers/*/k" +
      "eywordPlanNegativeKeywords/*}\332A\rresource" +
      "_name\022\242\002\n!MutateKeywordPlanNegativeKeywo" +
      "rds\022J.google.ads.googleads.v3.services.M" +
      "utateKeywordPlanNegativeKeywordsRequest\032" +
      "K.google.ads.googleads.v3.services.Mutat" +
      "eKeywordPlanNegativeKeywordsResponse\"d\202\323" +
      "\344\223\002E\"@/v3/customers/{customer_id=*}/keyw" +
      "ordPlanNegativeKeywords:mutate:\001*\332A\026cust" +
      "omer_id,operations\032\033\312A\030googleads.googlea" +
      "pis.comB\215\002\n$com.google.ads.googleads.v3." +
      "servicesB&KeywordPlanNegativeKeywordServ" +
      "iceProtoP\001ZHgoogle.golang.org/genproto/g" +
      "oogleapis/ads/googleads/v3/services;serv" +
      "ices\242\002\003GAA\252\002 Google.Ads.GoogleAds.V3.Ser" +
      "vices\312\002 Google\\Ads\\GoogleAds\\V3\\Services" +
      "\352\002$Google::Ads::GoogleAds::V3::Servicesb" +
      "\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v3.resources.KeywordPlanNegativeKeywordProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetKeywordPlanNegativeKeywordRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetKeywordPlanNegativeKeywordRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetKeywordPlanNegativeKeywordRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlanNegativeKeywordsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlanNegativeKeywordsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateKeywordPlanNegativeKeywordsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v3_services_KeywordPlanNegativeKeywordOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v3_services_KeywordPlanNegativeKeywordOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_KeywordPlanNegativeKeywordOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlanNegativeKeywordsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlanNegativeKeywordsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateKeywordPlanNegativeKeywordsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlanNegativeKeywordResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlanNegativeKeywordResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateKeywordPlanNegativeKeywordResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.resources.KeywordPlanNegativeKeywordProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
