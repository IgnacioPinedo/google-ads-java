// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/campaign_criterion.proto

package com.google.ads.googleads.v2.resources;

public final class CampaignCriterionProto {
  private CampaignCriterionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_CampaignCriterion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_CampaignCriterion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v2/resources/camp" +
      "aign_criterion.proto\022!google.ads.googlea" +
      "ds.v2.resources\032-google/ads/googleads/v2" +
      "/common/criteria.proto\032=google/ads/googl" +
      "eads/v2/enums/campaign_criterion_status." +
      "proto\0322google/ads/googleads/v2/enums/cri" +
      "terion_type.proto\032\037google/api/field_beha" +
      "vior.proto\032\031google/api/resource.proto\032\036g" +
      "oogle/protobuf/wrappers.proto\032\034google/ap" +
      "i/annotations.proto\"\246\025\n\021CampaignCriterio" +
      "n\022I\n\rresource_name\030\001 \001(\tB2\340A\005\372A,\n*google" +
      "ads.googleapis.com/CampaignCriterion\022Y\n\010" +
      "campaign\030\004 \001(\0132\034.google.protobuf.StringV" +
      "alueB)\340A\005\372A#\n!googleads.googleapis.com/C" +
      "ampaign\0226\n\014criterion_id\030\005 \001(\0132\033.google.p" +
      "rotobuf.Int64ValueB\003\340A\003\0221\n\014bid_modifier\030" +
      "\016 \001(\0132\033.google.protobuf.FloatValue\0221\n\010ne" +
      "gative\030\007 \001(\0132\032.google.protobuf.BoolValue" +
      "B\003\340A\005\022Q\n\004type\030\006 \001(\0162>.google.ads.googlea" +
      "ds.v2.enums.CriterionTypeEnum.CriterionT" +
      "ypeB\003\340A\003\022b\n\006status\030# \001(\0162R.google.ads.go" +
      "ogleads.v2.enums.CampaignCriterionStatus" +
      "Enum.CampaignCriterionStatus\022C\n\007keyword\030" +
      "\010 \001(\0132+.google.ads.googleads.v2.common.K" +
      "eywordInfoB\003\340A\005H\000\022G\n\tplacement\030\t \001(\0132-.g" +
      "oogle.ads.googleads.v2.common.PlacementI" +
      "nfoB\003\340A\005H\000\022Y\n\023mobile_app_category\030\n \001(\0132" +
      "5.google.ads.googleads.v2.common.MobileA" +
      "ppCategoryInfoB\003\340A\005H\000\022X\n\022mobile_applicat" +
      "ion\030\013 \001(\01325.google.ads.googleads.v2.comm" +
      "on.MobileApplicationInfoB\003\340A\005H\000\022E\n\010locat" +
      "ion\030\014 \001(\0132,.google.ads.googleads.v2.comm" +
      "on.LocationInfoB\003\340A\005H\000\022A\n\006device\030\r \001(\0132*" +
      ".google.ads.googleads.v2.common.DeviceIn" +
      "foB\003\340A\005H\000\022J\n\013ad_schedule\030\017 \001(\0132..google." +
      "ads.googleads.v2.common.AdScheduleInfoB\003" +
      "\340A\005H\000\022F\n\tage_range\030\020 \001(\0132,.google.ads.go" +
      "ogleads.v2.common.AgeRangeInfoB\003\340A\005H\000\022A\n" +
      "\006gender\030\021 \001(\0132*.google.ads.googleads.v2." +
      "common.GenderInfoB\003\340A\005H\000\022L\n\014income_range" +
      "\030\022 \001(\0132/.google.ads.googleads.v2.common." +
      "IncomeRangeInfoB\003\340A\005H\000\022R\n\017parental_statu" +
      "s\030\023 \001(\01322.google.ads.googleads.v2.common" +
      ".ParentalStatusInfoB\003\340A\005H\000\022F\n\tuser_list\030" +
      "\026 \001(\0132,.google.ads.googleads.v2.common.U" +
      "serListInfoB\003\340A\005H\000\022N\n\ryoutube_video\030\024 \001(" +
      "\01320.google.ads.googleads.v2.common.YouTu" +
      "beVideoInfoB\003\340A\005H\000\022R\n\017youtube_channel\030\025 " +
      "\001(\01322.google.ads.googleads.v2.common.You" +
      "TubeChannelInfoB\003\340A\005H\000\022G\n\tproximity\030\027 \001(" +
      "\0132-.google.ads.googleads.v2.common.Proxi" +
      "mityInfoB\003\340A\005H\000\022?\n\005topic\030\030 \001(\0132).google." +
      "ads.googleads.v2.common.TopicInfoB\003\340A\005H\000" +
      "\022N\n\rlisting_scope\030\031 \001(\01320.google.ads.goo" +
      "gleads.v2.common.ListingScopeInfoB\003\340A\005H\000" +
      "\022E\n\010language\030\032 \001(\0132,.google.ads.googlead" +
      "s.v2.common.LanguageInfoB\003\340A\005H\000\022D\n\010ip_bl" +
      "ock\030\033 \001(\0132+.google.ads.googleads.v2.comm" +
      "on.IpBlockInfoB\003\340A\005H\000\022N\n\rcontent_label\030\034" +
      " \001(\01320.google.ads.googleads.v2.common.Co" +
      "ntentLabelInfoB\003\340A\005H\000\022C\n\007carrier\030\035 \001(\0132+" +
      ".google.ads.googleads.v2.common.CarrierI" +
      "nfoB\003\340A\005H\000\022N\n\ruser_interest\030\036 \001(\01320.goog" +
      "le.ads.googleads.v2.common.UserInterestI" +
      "nfoB\003\340A\005H\000\022C\n\007webpage\030\037 \001(\0132+.google.ads" +
      ".googleads.v2.common.WebpageInfoB\003\340A\005H\000\022" +
      "c\n\030operating_system_version\030  \001(\0132:.goog" +
      "le.ads.googleads.v2.common.OperatingSyst" +
      "emVersionInfoB\003\340A\005H\000\022N\n\rmobile_device\030! " +
      "\001(\01320.google.ads.googleads.v2.common.Mob" +
      "ileDeviceInfoB\003\340A\005H\000\022P\n\016location_group\030\"" +
      " \001(\01321.google.ads.googleads.v2.common.Lo" +
      "cationGroupInfoB\003\340A\005H\000\022R\n\017custom_affinit" +
      "y\030$ \001(\01322.google.ads.googleads.v2.common" +
      ".CustomAffinityInfoB\003\340A\005H\000:k\352Ah\n*googlea" +
      "ds.googleapis.com/CampaignCriterion\022:cus" +
      "tomers/{customer}/campaignCriteria/{camp" +
      "aign_criterion}B\013\n\tcriterionB\203\002\n%com.goo" +
      "gle.ads.googleads.v2.resourcesB\026Campaign" +
      "CriterionProtoP\001ZJgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v2/resourc" +
      "es;resources\242\002\003GAA\252\002!Google.Ads.GoogleAd" +
      "s.V2.Resources\312\002!Google\\Ads\\GoogleAds\\V2" +
      "\\Resources\352\002%Google::Ads::GoogleAds::V2:" +
      ":Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v2.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.CampaignCriterionStatusProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.CriterionTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v2_resources_CampaignCriterion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_CampaignCriterion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_CampaignCriterion_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "CriterionId", "BidModifier", "Negative", "Type", "Status", "Keyword", "Placement", "MobileAppCategory", "MobileApplication", "Location", "Device", "AdSchedule", "AgeRange", "Gender", "IncomeRange", "ParentalStatus", "UserList", "YoutubeVideo", "YoutubeChannel", "Proximity", "Topic", "ListingScope", "Language", "IpBlock", "ContentLabel", "Carrier", "UserInterest", "Webpage", "OperatingSystemVersion", "MobileDevice", "LocationGroup", "CustomAffinity", "Criterion", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v2.enums.CampaignCriterionStatusProto.getDescriptor();
    com.google.ads.googleads.v2.enums.CriterionTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
