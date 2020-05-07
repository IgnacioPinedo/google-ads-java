// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/ad_group_feed_service.proto

package com.google.ads.googleads.v3.services;

public final class AdGroupFeedServiceProto {
  private AdGroupFeedServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetAdGroupFeedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetAdGroupFeedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateAdGroupFeedsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateAdGroupFeedsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_AdGroupFeedOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_AdGroupFeedOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateAdGroupFeedsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateAdGroupFeedsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateAdGroupFeedResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateAdGroupFeedResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v3/services/ad_gr" +
      "oup_feed_service.proto\022 google.ads.googl" +
      "eads.v3.services\0325google/ads/googleads/v" +
      "3/resources/ad_group_feed.proto\032\034google/" +
      "api/annotations.proto\032\027google/api/client" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\032 google/proto" +
      "buf/field_mask.proto\032\027google/rpc/status." +
      "proto\"\\\n\025GetAdGroupFeedRequest\022C\n\rresour" +
      "ce_name\030\001 \001(\tB,\340A\002\372A&\n$googleads.googlea" +
      "pis.com/AdGroupFeed\"\266\001\n\031MutateAdGroupFee" +
      "dsRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022O\n\no" +
      "perations\030\002 \003(\01326.google.ads.googleads.v" +
      "3.services.AdGroupFeedOperationB\003\340A\002\022\027\n\017" +
      "partial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004" +
      " \001(\010\"\352\001\n\024AdGroupFeedOperation\022/\n\013update_" +
      "mask\030\004 \001(\0132\032.google.protobuf.FieldMask\022@" +
      "\n\006create\030\001 \001(\0132..google.ads.googleads.v3" +
      ".resources.AdGroupFeedH\000\022@\n\006update\030\002 \001(\013" +
      "2..google.ads.googleads.v3.resources.AdG" +
      "roupFeedH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\toperatio" +
      "n\"\233\001\n\032MutateAdGroupFeedsResponse\0221\n\025part" +
      "ial_failure_error\030\003 \001(\0132\022.google.rpc.Sta" +
      "tus\022J\n\007results\030\002 \003(\01329.google.ads.google" +
      "ads.v3.services.MutateAdGroupFeedResult\"" +
      "0\n\027MutateAdGroupFeedResult\022\025\n\rresource_n" +
      "ame\030\001 \001(\t2\336\003\n\022AdGroupFeedService\022\301\001\n\016Get" +
      "AdGroupFeed\0227.google.ads.googleads.v3.se" +
      "rvices.GetAdGroupFeedRequest\032..google.ad" +
      "s.googleads.v3.resources.AdGroupFeed\"F\202\323" +
      "\344\223\0020\022./v3/{resource_name=customers/*/adG" +
      "roupFeeds/*}\332A\rresource_name\022\346\001\n\022MutateA" +
      "dGroupFeeds\022;.google.ads.googleads.v3.se" +
      "rvices.MutateAdGroupFeedsRequest\032<.googl" +
      "e.ads.googleads.v3.services.MutateAdGrou" +
      "pFeedsResponse\"U\202\323\344\223\0026\"1/v3/customers/{c" +
      "ustomer_id=*}/adGroupFeeds:mutate:\001*\332A\026c" +
      "ustomer_id,operations\032\033\312A\030googleads.goog" +
      "leapis.comB\376\001\n$com.google.ads.googleads." +
      "v3.servicesB\027AdGroupFeedServiceProtoP\001ZH" +
      "google.golang.org/genproto/googleapis/ad" +
      "s/googleads/v3/services;services\242\002\003GAA\252\002" +
      " Google.Ads.GoogleAds.V3.Services\312\002 Goog" +
      "le\\Ads\\GoogleAds\\V3\\Services\352\002$Google::A" +
      "ds::GoogleAds::V3::Servicesb\006proto3"
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
          com.google.ads.googleads.v3.resources.AdGroupFeedProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetAdGroupFeedRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetAdGroupFeedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetAdGroupFeedRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v3_services_MutateAdGroupFeedsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_services_MutateAdGroupFeedsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateAdGroupFeedsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v3_services_AdGroupFeedOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v3_services_AdGroupFeedOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_AdGroupFeedOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v3_services_MutateAdGroupFeedsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v3_services_MutateAdGroupFeedsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateAdGroupFeedsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v3_services_MutateAdGroupFeedResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v3_services_MutateAdGroupFeedResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateAdGroupFeedResult_descriptor,
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
    com.google.ads.googleads.v3.resources.AdGroupFeedProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
