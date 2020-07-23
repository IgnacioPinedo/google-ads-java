// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/keyword_plan_campaign.proto

package com.google.ads.googleads.v1.resources;

public final class KeywordPlanCampaignProto {
  private KeywordPlanCampaignProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_KeywordPlanCampaign_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_KeywordPlanCampaign_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_KeywordPlanGeoTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_KeywordPlanGeoTarget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v1/resources/keyw" +
      "ord_plan_campaign.proto\022!google.ads.goog" +
      "leads.v1.resources\0328google/ads/googleads" +
      "/v1/enums/keyword_plan_network.proto\032\037go" +
      "ogle/api/field_behavior.proto\032\031google/ap" +
      "i/resource.proto\032\036google/protobuf/wrappe" +
      "rs.proto\032\034google/api/annotations.proto\"\346" +
      "\005\n\023KeywordPlanCampaign\022K\n\rresource_name\030" +
      "\001 \001(\tB4\340A\005\372A.\n,googleads.googleapis.com/" +
      "KeywordPlanCampaign\022]\n\014keyword_plan\030\002 \001(" +
      "\0132\034.google.protobuf.StringValueB)\372A&\n$go" +
      "ogleads.googleapis.com/KeywordPlan\022,\n\002id" +
      "\030\003 \001(\0132\033.google.protobuf.Int64ValueB\003\340A\003" +
      "\022*\n\004name\030\004 \001(\0132\034.google.protobuf.StringV" +
      "alue\022h\n\022language_constants\030\005 \003(\0132\034.googl" +
      "e.protobuf.StringValueB.\372A+\n)googleads.g" +
      "oogleapis.com/LanguageConstant\022f\n\024keywor" +
      "d_plan_network\030\006 \001(\0162H.google.ads.google" +
      "ads.v1.enums.KeywordPlanNetworkEnum.Keyw" +
      "ordPlanNetwork\0223\n\016cpc_bid_micros\030\007 \001(\0132\033" +
      ".google.protobuf.Int64Value\022L\n\013geo_targe" +
      "ts\030\010 \003(\01327.google.ads.googleads.v1.resou" +
      "rces.KeywordPlanGeoTarget:t\352Aq\n,googlead" +
      "s.googleapis.com/KeywordPlanCampaign\022Acu" +
      "stomers/{customer}/keywordPlanCampaigns/" +
      "{keyword_plan_campaign}\"\202\001\n\024KeywordPlanG" +
      "eoTarget\022j\n\023geo_target_constant\030\001 \001(\0132\034." +
      "google.protobuf.StringValueB/\372A,\n*google" +
      "ads.googleapis.com/GeoTargetConstantB\205\002\n" +
      "%com.google.ads.googleads.v1.resourcesB\030" +
      "KeywordPlanCampaignProtoP\001ZJgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v1/resources;resources\242\002\003GAA\252\002!Google.Ad" +
      "s.GoogleAds.V1.Resources\312\002!Google\\Ads\\Go" +
      "ogleAds\\V1\\Resources\352\002%Google::Ads::Goog" +
      "leAds::V1::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.enums.KeywordPlanNetworkProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v1_resources_KeywordPlanCampaign_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_KeywordPlanCampaign_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_KeywordPlanCampaign_descriptor,
        new java.lang.String[] { "ResourceName", "KeywordPlan", "Id", "Name", "LanguageConstants", "KeywordPlanNetwork", "CpcBidMicros", "GeoTargets", });
    internal_static_google_ads_googleads_v1_resources_KeywordPlanGeoTarget_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_resources_KeywordPlanGeoTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_KeywordPlanGeoTarget_descriptor,
        new java.lang.String[] { "GeoTargetConstant", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.enums.KeywordPlanNetworkProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
