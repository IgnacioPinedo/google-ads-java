// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/campaign_audience_view.proto

package com.google.ads.googleads.v1.resources;

public final class CampaignAudienceViewProto {
  private CampaignAudienceViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_CampaignAudienceView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_CampaignAudienceView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v1/resources/camp" +
      "aign_audience_view.proto\022!google.ads.goo" +
      "gleads.v1.resources\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\032" +
      "\034google/api/annotations.proto\"\335\001\n\024Campai" +
      "gnAudienceView\022L\n\rresource_name\030\001 \001(\tB5\340" +
      "A\003\372A/\n-googleads.googleapis.com/Campaign" +
      "AudienceView:w\352At\n-googleads.googleapis." +
      "com/CampaignAudienceView\022Ccustomers/{cus" +
      "tomer}/campaignAudienceViews/{campaign_a" +
      "udience_view}B\206\002\n%com.google.ads.googlea" +
      "ds.v1.resourcesB\031CampaignAudienceViewPro" +
      "toP\001ZJgoogle.golang.org/genproto/googlea" +
      "pis/ads/googleads/v1/resources;resources" +
      "\242\002\003GAA\252\002!Google.Ads.GoogleAds.V1.Resourc" +
      "es\312\002!Google\\Ads\\GoogleAds\\V1\\Resources\352\002" +
      "%Google::Ads::GoogleAds::V1::Resourcesb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v1_resources_CampaignAudienceView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_CampaignAudienceView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_CampaignAudienceView_descriptor,
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
