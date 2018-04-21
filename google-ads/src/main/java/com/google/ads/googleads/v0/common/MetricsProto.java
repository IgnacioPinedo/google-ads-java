// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/metrics.proto

package com.google.ads.googleads.v0.common;

public final class MetricsProto {
  private MetricsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_Metrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_Metrics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/ads/googleads/v0/common/metrics" +
      ".proto\022\036google.ads.googleads.v0.common\032\036" +
      "google/protobuf/wrappers.proto\"\367\023\n\007Metri" +
      "cs\0229\n\023all_conversion_rate\030\005 \001(\0132\034.google" +
      ".protobuf.DoubleValue\022:\n\024all_conversion_" +
      "value\030\006 \001(\0132\034.google.protobuf.DoubleValu" +
      "e\0225\n\017all_conversions\030\007 \001(\0132\034.google.prot" +
      "obuf.DoubleValue\022D\n\036all_conversions_valu" +
      "e_per_cost\030> \001(\0132\034.google.protobuf.Doubl" +
      "eValue\022K\n%all_conversions_value_per_inte" +
      "raction\030= \001(\0132\034.google.protobuf.DoubleVa" +
      "lue\0222\n\014average_cost\030\010 \001(\0132\034.google.proto" +
      "buf.DoubleValue\0221\n\013average_cpc\030\t \001(\0132\034.g" +
      "oogle.protobuf.DoubleValue\0221\n\013average_cp" +
      "m\030\n \001(\0132\034.google.protobuf.DoubleValue\0226\n" +
      "\020average_position\030\r \001(\0132\034.google.protobu" +
      "f.DoubleValue\0221\n\013bounce_rate\030\017 \001(\0132\034.goo" +
      "gle.protobuf.DoubleValue\022+\n\006clicks\030\023 \001(\013" +
      "2\033.google.protobuf.Int64Value\022J\n$content" +
      "_budget_lost_impression_share\030\024 \001(\0132\034.go" +
      "ogle.protobuf.DoubleValue\022>\n\030content_imp" +
      "ression_share\030\025 \001(\0132\034.google.protobuf.Do" +
      "ubleValue\022H\n\"content_rank_lost_impressio" +
      "n_share\030\026 \001(\0132\034.google.protobuf.DoubleVa" +
      "lue\0225\n\017conversion_rate\030\027 \001(\0132\034.google.pr" +
      "otobuf.DoubleValue\0226\n\020conversion_value\030\030" +
      " \001(\0132\034.google.protobuf.DoubleValue\022?\n\031co" +
      "nversion_value_per_cost\030@ \001(\0132\034.google.p" +
      "rotobuf.DoubleValue\022F\n conversion_value_" +
      "per_interaction\030? \001(\0132\034.google.protobuf." +
      "DoubleValue\0221\n\013conversions\030\031 \001(\0132\034.googl" +
      "e.protobuf.DoubleValue\0220\n\013cost_micros\030\032 " +
      "\001(\0132\033.google.protobuf.Int64Value\022=\n\027cost" +
      "_per_all_conversion\030\033 \001(\0132\034.google.proto" +
      "buf.DoubleValue\0229\n\023cost_per_conversion\030\034" +
      " \001(\0132\034.google.protobuf.DoubleValue\022>\n\030cr" +
      "oss_device_conversions\030\035 \001(\0132\034.google.pr" +
      "otobuf.DoubleValue\022)\n\003ctr\030\036 \001(\0132\034.google" +
      ".protobuf.DoubleValue\0225\n\017engagement_rate" +
      "\030\037 \001(\0132\034.google.protobuf.DoubleValue\0220\n\013" +
      "engagements\030  \001(\0132\033.google.protobuf.Int6" +
      "4Value\0220\n\013impressions\030% \001(\0132\033.google.pro" +
      "tobuf.Int64Value\0226\n\020interaction_rate\030& \001" +
      "(\0132\034.google.protobuf.DoubleValue\0221\n\014inte" +
      "ractions\030\' \001(\0132\033.google.protobuf.Int64Va" +
      "lue\0228\n\022invalid_click_rate\030( \001(\0132\034.google" +
      ".protobuf.DoubleValue\0223\n\016invalid_clicks\030" +
      ") \001(\0132\033.google.protobuf.Int64Value\022:\n\024pe" +
      "rcent_new_visitors\030* \001(\0132\034.google.protob" +
      "uf.DoubleValue\0220\n\013phone_calls\030+ \001(\0132\033.go" +
      "ogle.protobuf.Int64Value\0226\n\021phone_impres" +
      "sions\030, \001(\0132\033.google.protobuf.Int64Value" +
      "\0228\n\022phone_through_rate\030- \001(\0132\034.google.pr" +
      "otobuf.DoubleValue\0222\n\014relative_ctr\030. \001(\013" +
      "2\034.google.protobuf.DoubleValue\022I\n#search" +
      "_budget_lost_impression_share\030/ \001(\0132\034.go" +
      "ogle.protobuf.DoubleValue\022I\n#search_exac" +
      "t_match_impression_share\0301 \001(\0132\034.google." +
      "protobuf.DoubleValue\022=\n\027search_impressio" +
      "n_share\0302 \001(\0132\034.google.protobuf.DoubleVa" +
      "lue\022G\n!search_rank_lost_impression_share" +
      "\0303 \001(\0132\034.google.protobuf.DoubleValue\022?\n\031" +
      "value_per_all_conversions\0304 \001(\0132\034.google" +
      ".protobuf.DoubleValue\022:\n\024value_per_conve" +
      "rsion\0305 \001(\0132\034.google.protobuf.DoubleValu" +
      "e\022=\n\030view_through_conversions\030< \001(\0132\033.go" +
      "ogle.protobuf.Int64ValueB\302\001\n\"com.google." +
      "ads.googleads.v0.commonB\014MetricsProtoP\001Z" +
      "Dgoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v0/common;common\242\002\003GAA\252\002\036Go" +
      "ogle.Ads.GoogleAds.V0.Common\312\002\036Google\\Ad" +
      "s\\GoogleAds\\V0\\Commonb\006proto3"
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
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_common_Metrics_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_common_Metrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_Metrics_descriptor,
        new java.lang.String[] { "AllConversionRate", "AllConversionValue", "AllConversions", "AllConversionsValuePerCost", "AllConversionsValuePerInteraction", "AverageCost", "AverageCpc", "AverageCpm", "AveragePosition", "BounceRate", "Clicks", "ContentBudgetLostImpressionShare", "ContentImpressionShare", "ContentRankLostImpressionShare", "ConversionRate", "ConversionValue", "ConversionValuePerCost", "ConversionValuePerInteraction", "Conversions", "CostMicros", "CostPerAllConversion", "CostPerConversion", "CrossDeviceConversions", "Ctr", "EngagementRate", "Engagements", "Impressions", "InteractionRate", "Interactions", "InvalidClickRate", "InvalidClicks", "PercentNewVisitors", "PhoneCalls", "PhoneImpressions", "PhoneThroughRate", "RelativeCtr", "SearchBudgetLostImpressionShare", "SearchExactMatchImpressionShare", "SearchImpressionShare", "SearchRankLostImpressionShare", "ValuePerAllConversions", "ValuePerConversion", "ViewThroughConversions", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}