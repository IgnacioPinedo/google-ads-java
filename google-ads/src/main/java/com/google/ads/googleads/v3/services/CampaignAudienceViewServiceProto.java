// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/campaign_audience_view_service.proto

package com.google.ads.googleads.v3.services;

public final class CampaignAudienceViewServiceProto {
  private CampaignAudienceViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetCampaignAudienceViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetCampaignAudienceViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v3/services/campa" +
      "ign_audience_view_service.proto\022 google." +
      "ads.googleads.v3.services\032>google/ads/go" +
      "ogleads/v3/resources/campaign_audience_v" +
      "iew.proto\032\034google/api/annotations.proto\032" +
      "\027google/api/client.proto\032\037google/api/fie" +
      "ld_behavior.proto\032\031google/api/resource.p" +
      "roto\"n\n\036GetCampaignAudienceViewRequest\022L" +
      "\n\rresource_name\030\001 \001(\tB5\340A\002\372A/\n-googleads" +
      ".googleapis.com/CampaignAudienceView2\242\002\n" +
      "\033CampaignAudienceViewService\022\345\001\n\027GetCamp" +
      "aignAudienceView\022@.google.ads.googleads." +
      "v3.services.GetCampaignAudienceViewReque" +
      "st\0327.google.ads.googleads.v3.resources.C" +
      "ampaignAudienceView\"O\202\323\344\223\0029\0227/v3/{resour" +
      "ce_name=customers/*/campaignAudienceView" +
      "s/*}\332A\rresource_name\032\033\312A\030googleads.googl" +
      "eapis.comB\207\002\n$com.google.ads.googleads.v" +
      "3.servicesB CampaignAudienceViewServiceP" +
      "rotoP\001ZHgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v3/services;services" +
      "\242\002\003GAA\252\002 Google.Ads.GoogleAds.V3.Service" +
      "s\312\002 Google\\Ads\\GoogleAds\\V3\\Services\352\002$G" +
      "oogle::Ads::GoogleAds::V3::Servicesb\006pro" +
      "to3"
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
          com.google.ads.googleads.v3.resources.CampaignAudienceViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetCampaignAudienceViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetCampaignAudienceViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetCampaignAudienceViewRequest_descriptor,
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
    com.google.ads.googleads.v3.resources.CampaignAudienceViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
