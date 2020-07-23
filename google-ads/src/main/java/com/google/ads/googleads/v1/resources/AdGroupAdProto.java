// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/ad_group_ad.proto

package com.google.ads.googleads.v1.resources;

public final class AdGroupAdProto {
  private AdGroupAdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_AdGroupAd_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_AdGroupAd_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_AdGroupAdPolicySummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_AdGroupAdPolicySummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/ads/googleads/v1/resources/ad_g" +
      "roup_ad.proto\022!google.ads.googleads.v1.r" +
      "esources\032+google/ads/googleads/v1/common" +
      "/policy.proto\0326google/ads/googleads/v1/e" +
      "nums/ad_group_ad_status.proto\032/google/ad" +
      "s/googleads/v1/enums/ad_strength.proto\032:" +
      "google/ads/googleads/v1/enums/policy_app" +
      "roval_status.proto\0328google/ads/googleads" +
      "/v1/enums/policy_review_status.proto\032*go" +
      "ogle/ads/googleads/v1/resources/ad.proto" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\032\036google/protobuf/wr" +
      "appers.proto\032\034google/api/annotations.pro" +
      "to\"\270\004\n\tAdGroupAd\022A\n\rresource_name\030\001 \001(\tB" +
      "*\340A\005\372A$\n\"googleads.googleapis.com/AdGrou" +
      "pAd\022R\n\006status\030\003 \001(\0162B.google.ads.googlea" +
      "ds.v1.enums.AdGroupAdStatusEnum.AdGroupA" +
      "dStatus\022X\n\010ad_group\030\004 \001(\0132\034.google.proto" +
      "buf.StringValueB(\340A\005\372A\"\n googleads.googl" +
      "eapis.com/AdGroup\0226\n\002ad\030\005 \001(\0132%.google.a" +
      "ds.googleads.v1.resources.AdB\003\340A\005\022V\n\016pol" +
      "icy_summary\030\006 \001(\01329.google.ads.googleads" +
      ".v1.resources.AdGroupAdPolicySummaryB\003\340A" +
      "\003\022R\n\013ad_strength\030\007 \001(\01628.google.ads.goog" +
      "leads.v1.enums.AdStrengthEnum.AdStrength" +
      "B\003\340A\003:V\352AS\n\"googleads.googleapis.com/AdG" +
      "roupAd\022-customers/{customer}/adGroupAds/" +
      "{ad_group_ad}\"\277\002\n\026AdGroupAdPolicySummary" +
      "\022S\n\024policy_topic_entries\030\001 \003(\01320.google." +
      "ads.googleads.v1.common.PolicyTopicEntry" +
      "B\003\340A\003\022d\n\rreview_status\030\002 \001(\0162H.google.ad" +
      "s.googleads.v1.enums.PolicyReviewStatusE" +
      "num.PolicyReviewStatusB\003\340A\003\022j\n\017approval_" +
      "status\030\003 \001(\0162L.google.ads.googleads.v1.e" +
      "nums.PolicyApprovalStatusEnum.PolicyAppr" +
      "ovalStatusB\003\340A\003B\373\001\n%com.google.ads.googl" +
      "eads.v1.resourcesB\016AdGroupAdProtoP\001ZJgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v1/resources;resources\242\002\003GAA\252\002!" +
      "Google.Ads.GoogleAds.V1.Resources\312\002!Goog" +
      "le\\Ads\\GoogleAds\\V1\\Resources\352\002%Google::" +
      "Ads::GoogleAds::V1::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.AdGroupAdStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.AdStrengthProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.PolicyApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.PolicyReviewStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.resources.AdProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v1_resources_AdGroupAd_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_AdGroupAd_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_AdGroupAd_descriptor,
        new java.lang.String[] { "ResourceName", "Status", "AdGroup", "Ad", "PolicySummary", "AdStrength", });
    internal_static_google_ads_googleads_v1_resources_AdGroupAdPolicySummary_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_resources_AdGroupAdPolicySummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_AdGroupAdPolicySummary_descriptor,
        new java.lang.String[] { "PolicyTopicEntries", "ReviewStatus", "ApprovalStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v1.enums.AdGroupAdStatusProto.getDescriptor();
    com.google.ads.googleads.v1.enums.AdStrengthProto.getDescriptor();
    com.google.ads.googleads.v1.enums.PolicyApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v1.enums.PolicyReviewStatusProto.getDescriptor();
    com.google.ads.googleads.v1.resources.AdProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
