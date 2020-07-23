// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/feed.proto

package com.google.ads.googleads.v3.resources;

public final class FeedProto {
  private FeedProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_Feed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_Feed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_OAuthInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_OAuthInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_Feed_AffiliateLocationFeedData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_Feed_AffiliateLocationFeedData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_FeedAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_FeedAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_FeedAttributeOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_FeedAttributeOperation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/ads/googleads/v3/resources/feed" +
      ".proto\022!google.ads.googleads.v3.resource" +
      "s\032Mgoogle/ads/googleads/v3/enums/affilia" +
      "te_location_feed_relationship_type.proto" +
      "\0327google/ads/googleads/v3/enums/feed_att" +
      "ribute_type.proto\032/google/ads/googleads/" +
      "v3/enums/feed_origin.proto\032/google/ads/g" +
      "oogleads/v3/enums/feed_status.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\032\036google/protobuf/wrapper" +
      "s.proto\032\034google/api/annotations.proto\"\301\014" +
      "\n\004Feed\022<\n\rresource_name\030\001 \001(\tB%\340A\005\372A\037\n\035g" +
      "oogleads.googleapis.com/Feed\022,\n\002id\030\002 \001(\013" +
      "2\033.google.protobuf.Int64ValueB\003\340A\003\022/\n\004na" +
      "me\030\003 \001(\0132\034.google.protobuf.StringValueB\003" +
      "\340A\005\022D\n\nattributes\030\004 \003(\01320.google.ads.goo" +
      "gleads.v3.resources.FeedAttribute\022W\n\024att" +
      "ribute_operations\030\t \003(\01329.google.ads.goo" +
      "gleads.v3.resources.FeedAttributeOperati" +
      "on\022M\n\006origin\030\005 \001(\01628.google.ads.googlead" +
      "s.v3.enums.FeedOriginEnum.FeedOriginB\003\340A" +
      "\005\022M\n\006status\030\010 \001(\01628.google.ads.googleads" +
      ".v3.enums.FeedStatusEnum.FeedStatusB\003\340A\003" +
      "\022c\n\031places_location_feed_data\030\006 \001(\0132>.go" +
      "ogle.ads.googleads.v3.resources.Feed.Pla" +
      "cesLocationFeedDataH\000\022i\n\034affiliate_locat" +
      "ion_feed_data\030\007 \001(\0132A.google.ads.googlea" +
      "ds.v3.resources.Feed.AffiliateLocationFe" +
      "edDataH\000\032\316\004\n\026PlacesLocationFeedData\022a\n\no" +
      "auth_info\030\001 \001(\0132H.google.ads.googleads.v" +
      "3.resources.Feed.PlacesLocationFeedData." +
      "OAuthInfoB\003\340A\005\0223\n\remail_address\030\002 \001(\0132\034." +
      "google.protobuf.StringValue\0229\n\023business_" +
      "account_id\030\n \001(\0132\034.google.protobuf.Strin" +
      "gValue\022:\n\024business_name_filter\030\004 \001(\0132\034.g" +
      "oogle.protobuf.StringValue\0226\n\020category_f" +
      "ilters\030\005 \003(\0132\034.google.protobuf.StringVal" +
      "ue\0223\n\rlabel_filters\030\006 \003(\0132\034.google.proto" +
      "buf.StringValue\032\267\001\n\tOAuthInfo\0221\n\013http_me" +
      "thod\030\001 \001(\0132\034.google.protobuf.StringValue" +
      "\0226\n\020http_request_url\030\002 \001(\0132\034.google.prot" +
      "obuf.StringValue\022?\n\031http_authorization_h" +
      "eader\030\003 \001(\0132\034.google.protobuf.StringValu" +
      "e\032\327\001\n\031AffiliateLocationFeedData\022.\n\tchain" +
      "_ids\030\001 \003(\0132\033.google.protobuf.Int64Value\022" +
      "\211\001\n\021relationship_type\030\002 \001(\0162n.google.ads" +
      ".googleads.v3.enums.AffiliateLocationFee" +
      "dRelationshipTypeEnum.AffiliateLocationF" +
      "eedRelationshipType:E\352AB\n\035googleads.goog" +
      "leapis.com/Feed\022!customers/{customer}/fe" +
      "eds/{feed}B\035\n\033system_feed_generation_dat" +
      "a\"\356\001\n\rFeedAttribute\022\'\n\002id\030\001 \001(\0132\033.google" +
      ".protobuf.Int64Value\022*\n\004name\030\002 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\022T\n\004type\030\003 \001(\0162F" +
      ".google.ads.googleads.v3.enums.FeedAttri" +
      "buteTypeEnum.FeedAttributeType\0222\n\016is_par" +
      "t_of_key\030\004 \001(\0132\032.google.protobuf.BoolVal" +
      "ue\"\354\001\n\026FeedAttributeOperation\022Y\n\010operato" +
      "r\030\001 \001(\0162B.google.ads.googleads.v3.resour" +
      "ces.FeedAttributeOperation.OperatorB\003\340A\003" +
      "\022D\n\005value\030\002 \001(\01320.google.ads.googleads.v" +
      "3.resources.FeedAttributeB\003\340A\003\"1\n\010Operat" +
      "or\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\007\n\003ADD\020" +
      "\002B\366\001\n%com.google.ads.googleads.v3.resour" +
      "cesB\tFeedProtoP\001ZJgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v3/resourc" +
      "es;resources\242\002\003GAA\252\002!Google.Ads.GoogleAd" +
      "s.V3.Resources\312\002!Google\\Ads\\GoogleAds\\V3" +
      "\\Resources\352\002%Google::Ads::GoogleAds::V3:" +
      ":Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v3.enums.AffiliateLocationFeedRelationshipTypeProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.FeedAttributeTypeProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.FeedOriginProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.FeedStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v3_resources_Feed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_Feed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_Feed_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Attributes", "AttributeOperations", "Origin", "Status", "PlacesLocationFeedData", "AffiliateLocationFeedData", "SystemFeedGenerationData", });
    internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_descriptor =
      internal_static_google_ads_googleads_v3_resources_Feed_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_descriptor,
        new java.lang.String[] { "OauthInfo", "EmailAddress", "BusinessAccountId", "BusinessNameFilter", "CategoryFilters", "LabelFilters", });
    internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_OAuthInfo_descriptor =
      internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_OAuthInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_OAuthInfo_descriptor,
        new java.lang.String[] { "HttpMethod", "HttpRequestUrl", "HttpAuthorizationHeader", });
    internal_static_google_ads_googleads_v3_resources_Feed_AffiliateLocationFeedData_descriptor =
      internal_static_google_ads_googleads_v3_resources_Feed_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v3_resources_Feed_AffiliateLocationFeedData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_Feed_AffiliateLocationFeedData_descriptor,
        new java.lang.String[] { "ChainIds", "RelationshipType", });
    internal_static_google_ads_googleads_v3_resources_FeedAttribute_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_resources_FeedAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_FeedAttribute_descriptor,
        new java.lang.String[] { "Id", "Name", "Type", "IsPartOfKey", });
    internal_static_google_ads_googleads_v3_resources_FeedAttributeOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v3_resources_FeedAttributeOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_FeedAttributeOperation_descriptor,
        new java.lang.String[] { "Operator", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.enums.AffiliateLocationFeedRelationshipTypeProto.getDescriptor();
    com.google.ads.googleads.v3.enums.FeedAttributeTypeProto.getDescriptor();
    com.google.ads.googleads.v3.enums.FeedOriginProto.getDescriptor();
    com.google.ads.googleads.v3.enums.FeedStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
