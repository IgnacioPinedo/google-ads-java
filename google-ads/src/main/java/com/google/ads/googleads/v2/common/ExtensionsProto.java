// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/extensions.proto

package com.google.ads.googleads.v2.common;

public final class ExtensionsProto {
  private ExtensionsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_AppFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_AppFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_CallFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_CallFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_CalloutFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_CalloutFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_LocationFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_LocationFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_AffiliateLocationFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_AffiliateLocationFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_TextMessageFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_TextMessageFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_PriceFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_PriceFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_PriceOffer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_PriceOffer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_PromotionFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_PromotionFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_StructuredSnippetFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_StructuredSnippetFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_SitelinkFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_SitelinkFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_HotelCalloutFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_HotelCalloutFeedItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/ads/googleads/v2/common/extensi" +
      "ons.proto\022\036google.ads.googleads.v2.commo" +
      "n\0325google/ads/googleads/v2/common/custom" +
      "_parameter.proto\0320google/ads/googleads/v" +
      "2/common/feed_common.proto\032-google/ads/g" +
      "oogleads/v2/enums/app_store.proto\032Cgoogl" +
      "e/ads/googleads/v2/enums/call_conversion" +
      "_reporting_state.proto\032Cgoogle/ads/googl" +
      "eads/v2/enums/price_extension_price_qual" +
      "ifier.proto\032>google/ads/googleads/v2/enu" +
      "ms/price_extension_price_unit.proto\0328goo" +
      "gle/ads/googleads/v2/enums/price_extensi" +
      "on_type.proto\032Igoogle/ads/googleads/v2/e" +
      "nums/promotion_extension_discount_modifi" +
      "er.proto\032@google/ads/googleads/v2/enums/" +
      "promotion_extension_occasion.proto\032\036goog" +
      "le/protobuf/wrappers.proto\032\034google/api/a" +
      "nnotations.proto\"\345\003\n\013AppFeedItem\022/\n\tlink" +
      "_text\030\001 \001(\0132\034.google.protobuf.StringValu" +
      "e\022,\n\006app_id\030\002 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\022G\n\tapp_store\030\003 \001(\01624.google.ads." +
      "googleads.v2.enums.AppStoreEnum.AppStore" +
      "\0220\n\nfinal_urls\030\004 \003(\0132\034.google.protobuf.S" +
      "tringValue\0227\n\021final_mobile_urls\030\005 \003(\0132\034." +
      "google.protobuf.StringValue\022;\n\025tracking_" +
      "url_template\030\006 \001(\0132\034.google.protobuf.Str" +
      "ingValue\022N\n\025url_custom_parameters\030\007 \003(\0132" +
      "/.google.ads.googleads.v2.common.CustomP" +
      "arameter\0226\n\020final_url_suffix\030\010 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\"\276\003\n\014CallFeedIte" +
      "m\0222\n\014phone_number\030\001 \001(\0132\034.google.protobu" +
      "f.StringValue\0222\n\014country_code\030\002 \001(\0132\034.go" +
      "ogle.protobuf.StringValue\0229\n\025call_tracki" +
      "ng_enabled\030\003 \001(\0132\032.google.protobuf.BoolV" +
      "alue\022<\n\026call_conversion_action\030\004 \001(\0132\034.g" +
      "oogle.protobuf.StringValue\022E\n!call_conve" +
      "rsion_tracking_disabled\030\005 \001(\0132\032.google.p" +
      "rotobuf.BoolValue\022\205\001\n\037call_conversion_re" +
      "porting_state\030\006 \001(\0162\\.google.ads.googlea" +
      "ds.v2.enums.CallConversionReportingState" +
      "Enum.CallConversionReportingState\"E\n\017Cal" +
      "loutFeedItem\0222\n\014callout_text\030\001 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\"\252\003\n\020LocationFee" +
      "dItem\0223\n\rbusiness_name\030\001 \001(\0132\034.google.pr" +
      "otobuf.StringValue\0224\n\016address_line_1\030\002 \001" +
      "(\0132\034.google.protobuf.StringValue\0224\n\016addr" +
      "ess_line_2\030\003 \001(\0132\034.google.protobuf.Strin" +
      "gValue\022*\n\004city\030\004 \001(\0132\034.google.protobuf.S" +
      "tringValue\022.\n\010province\030\005 \001(\0132\034.google.pr" +
      "otobuf.StringValue\0221\n\013postal_code\030\006 \001(\0132" +
      "\034.google.protobuf.StringValue\0222\n\014country" +
      "_code\030\007 \001(\0132\034.google.protobuf.StringValu" +
      "e\0222\n\014phone_number\030\010 \001(\0132\034.google.protobu" +
      "f.StringValue\"\224\004\n\031AffiliateLocationFeedI" +
      "tem\0223\n\rbusiness_name\030\001 \001(\0132\034.google.prot" +
      "obuf.StringValue\0224\n\016address_line_1\030\002 \001(\013" +
      "2\034.google.protobuf.StringValue\0224\n\016addres" +
      "s_line_2\030\003 \001(\0132\034.google.protobuf.StringV" +
      "alue\022*\n\004city\030\004 \001(\0132\034.google.protobuf.Str" +
      "ingValue\022.\n\010province\030\005 \001(\0132\034.google.prot" +
      "obuf.StringValue\0221\n\013postal_code\030\006 \001(\0132\034." +
      "google.protobuf.StringValue\0222\n\014country_c" +
      "ode\030\007 \001(\0132\034.google.protobuf.StringValue\022" +
      "2\n\014phone_number\030\010 \001(\0132\034.google.protobuf." +
      "StringValue\022-\n\010chain_id\030\t \001(\0132\033.google.p" +
      "rotobuf.Int64Value\0220\n\nchain_name\030\n \001(\0132\034" +
      ".google.protobuf.StringValue\"\224\002\n\023TextMes" +
      "sageFeedItem\0223\n\rbusiness_name\030\001 \001(\0132\034.go" +
      "ogle.protobuf.StringValue\0222\n\014country_cod" +
      "e\030\002 \001(\0132\034.google.protobuf.StringValue\0222\n" +
      "\014phone_number\030\003 \001(\0132\034.google.protobuf.St" +
      "ringValue\022*\n\004text\030\004 \001(\0132\034.google.protobu" +
      "f.StringValue\0224\n\016extension_text\030\005 \001(\0132\034." +
      "google.protobuf.StringValue\"\315\003\n\rPriceFee" +
      "dItem\022V\n\004type\030\001 \001(\0162H.google.ads.googlea" +
      "ds.v2.enums.PriceExtensionTypeEnum.Price" +
      "ExtensionType\022u\n\017price_qualifier\030\002 \001(\0162\\" +
      ".google.ads.googleads.v2.enums.PriceExte" +
      "nsionPriceQualifierEnum.PriceExtensionPr" +
      "iceQualifier\022;\n\025tracking_url_template\030\003 " +
      "\001(\0132\034.google.protobuf.StringValue\0223\n\rlan" +
      "guage_code\030\004 \001(\0132\034.google.protobuf.Strin" +
      "gValue\022C\n\017price_offerings\030\005 \003(\0132*.google" +
      ".ads.googleads.v2.common.PriceOffer\0226\n\020f" +
      "inal_url_suffix\030\006 \001(\0132\034.google.protobuf." +
      "StringValue\"\360\002\n\nPriceOffer\022,\n\006header\030\001 \001" +
      "(\0132\034.google.protobuf.StringValue\0221\n\013desc" +
      "ription\030\002 \001(\0132\034.google.protobuf.StringVa" +
      "lue\0224\n\005price\030\003 \001(\0132%.google.ads.googlead" +
      "s.v2.common.Money\022`\n\004unit\030\004 \001(\0162R.google" +
      ".ads.googleads.v2.enums.PriceExtensionPr" +
      "iceUnitEnum.PriceExtensionPriceUnit\0220\n\nf" +
      "inal_urls\030\005 \003(\0132\034.google.protobuf.String" +
      "Value\0227\n\021final_mobile_urls\030\006 \003(\0132\034.googl" +
      "e.protobuf.StringValue\"\262\010\n\021PromotionFeed" +
      "Item\0226\n\020promotion_target\030\001 \001(\0132\034.google." +
      "protobuf.StringValue\022\203\001\n\021discount_modifi" +
      "er\030\002 \001(\0162h.google.ads.googleads.v2.enums" +
      ".PromotionExtensionDiscountModifierEnum." +
      "PromotionExtensionDiscountModifier\022:\n\024pr" +
      "omotion_start_date\030\007 \001(\0132\034.google.protob" +
      "uf.StringValue\0228\n\022promotion_end_date\030\010 \001" +
      "(\0132\034.google.protobuf.StringValue\022j\n\010occa" +
      "sion\030\t \001(\0162X.google.ads.googleads.v2.enu" +
      "ms.PromotionExtensionOccasionEnum.Promot" +
      "ionExtensionOccasion\0220\n\nfinal_urls\030\n \003(\013" +
      "2\034.google.protobuf.StringValue\0227\n\021final_" +
      "mobile_urls\030\013 \003(\0132\034.google.protobuf.Stri" +
      "ngValue\022;\n\025tracking_url_template\030\014 \001(\0132\034" +
      ".google.protobuf.StringValue\022N\n\025url_cust" +
      "om_parameters\030\r \003(\0132/.google.ads.googlea" +
      "ds.v2.common.CustomParameter\0226\n\020final_ur" +
      "l_suffix\030\016 \001(\0132\034.google.protobuf.StringV" +
      "alue\0223\n\rlanguage_code\030\017 \001(\0132\034.google.pro" +
      "tobuf.StringValue\0222\n\013percent_off\030\003 \001(\0132\033" +
      ".google.protobuf.Int64ValueH\000\022A\n\020money_a" +
      "mount_off\030\004 \001(\0132%.google.ads.googleads.v" +
      "2.common.MoneyH\000\0226\n\016promotion_code\030\005 \001(\013" +
      "2\034.google.protobuf.StringValueH\001\022C\n\022orde" +
      "rs_over_amount\030\006 \001(\0132%.google.ads.google" +
      "ads.v2.common.MoneyH\001B\017\n\rdiscount_typeB\023" +
      "\n\021promotion_trigger\"w\n\031StructuredSnippet" +
      "FeedItem\022,\n\006header\030\001 \001(\0132\034.google.protob" +
      "uf.StringValue\022,\n\006values\030\002 \003(\0132\034.google." +
      "protobuf.StringValue\"\315\003\n\020SitelinkFeedIte" +
      "m\022/\n\tlink_text\030\001 \001(\0132\034.google.protobuf.S" +
      "tringValue\022+\n\005line1\030\002 \001(\0132\034.google.proto" +
      "buf.StringValue\022+\n\005line2\030\003 \001(\0132\034.google." +
      "protobuf.StringValue\0220\n\nfinal_urls\030\004 \003(\013" +
      "2\034.google.protobuf.StringValue\0227\n\021final_" +
      "mobile_urls\030\005 \003(\0132\034.google.protobuf.Stri" +
      "ngValue\022;\n\025tracking_url_template\030\006 \001(\0132\034" +
      ".google.protobuf.StringValue\022N\n\025url_cust" +
      "om_parameters\030\007 \003(\0132/.google.ads.googlea" +
      "ds.v2.common.CustomParameter\0226\n\020final_ur" +
      "l_suffix\030\010 \001(\0132\034.google.protobuf.StringV" +
      "alue\"w\n\024HotelCalloutFeedItem\022*\n\004text\030\001 \001" +
      "(\0132\034.google.protobuf.StringValue\0223\n\rlang" +
      "uage_code\030\002 \001(\0132\034.google.protobuf.String" +
      "ValueB\352\001\n\"com.google.ads.googleads.v2.co" +
      "mmonB\017ExtensionsProtoP\001ZDgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v2/" +
      "common;common\242\002\003GAA\252\002\036Google.Ads.GoogleA" +
      "ds.V2.Common\312\002\036Google\\Ads\\GoogleAds\\V2\\C" +
      "ommon\352\002\"Google::Ads::GoogleAds::V2::Comm" +
      "onb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v2.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v2.common.FeedCommonProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.AppStoreProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.CallConversionReportingStateProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.PriceExtensionPriceQualifierProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.PriceExtensionPriceUnitProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.PriceExtensionTypeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.PromotionExtensionDiscountModifierProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.PromotionExtensionOccasionProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v2_common_AppFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_common_AppFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_AppFeedItem_descriptor,
        new java.lang.String[] { "LinkText", "AppId", "AppStore", "FinalUrls", "FinalMobileUrls", "TrackingUrlTemplate", "UrlCustomParameters", "FinalUrlSuffix", });
    internal_static_google_ads_googleads_v2_common_CallFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v2_common_CallFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_CallFeedItem_descriptor,
        new java.lang.String[] { "PhoneNumber", "CountryCode", "CallTrackingEnabled", "CallConversionAction", "CallConversionTrackingDisabled", "CallConversionReportingState", });
    internal_static_google_ads_googleads_v2_common_CalloutFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v2_common_CalloutFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_CalloutFeedItem_descriptor,
        new java.lang.String[] { "CalloutText", });
    internal_static_google_ads_googleads_v2_common_LocationFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v2_common_LocationFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_LocationFeedItem_descriptor,
        new java.lang.String[] { "BusinessName", "AddressLine1", "AddressLine2", "City", "Province", "PostalCode", "CountryCode", "PhoneNumber", });
    internal_static_google_ads_googleads_v2_common_AffiliateLocationFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v2_common_AffiliateLocationFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_AffiliateLocationFeedItem_descriptor,
        new java.lang.String[] { "BusinessName", "AddressLine1", "AddressLine2", "City", "Province", "PostalCode", "CountryCode", "PhoneNumber", "ChainId", "ChainName", });
    internal_static_google_ads_googleads_v2_common_TextMessageFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v2_common_TextMessageFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_TextMessageFeedItem_descriptor,
        new java.lang.String[] { "BusinessName", "CountryCode", "PhoneNumber", "Text", "ExtensionText", });
    internal_static_google_ads_googleads_v2_common_PriceFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v2_common_PriceFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_PriceFeedItem_descriptor,
        new java.lang.String[] { "Type", "PriceQualifier", "TrackingUrlTemplate", "LanguageCode", "PriceOfferings", "FinalUrlSuffix", });
    internal_static_google_ads_googleads_v2_common_PriceOffer_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v2_common_PriceOffer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_PriceOffer_descriptor,
        new java.lang.String[] { "Header", "Description", "Price", "Unit", "FinalUrls", "FinalMobileUrls", });
    internal_static_google_ads_googleads_v2_common_PromotionFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v2_common_PromotionFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_PromotionFeedItem_descriptor,
        new java.lang.String[] { "PromotionTarget", "DiscountModifier", "PromotionStartDate", "PromotionEndDate", "Occasion", "FinalUrls", "FinalMobileUrls", "TrackingUrlTemplate", "UrlCustomParameters", "FinalUrlSuffix", "LanguageCode", "PercentOff", "MoneyAmountOff", "PromotionCode", "OrdersOverAmount", "DiscountType", "PromotionTrigger", });
    internal_static_google_ads_googleads_v2_common_StructuredSnippetFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v2_common_StructuredSnippetFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_StructuredSnippetFeedItem_descriptor,
        new java.lang.String[] { "Header", "Values", });
    internal_static_google_ads_googleads_v2_common_SitelinkFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_ads_googleads_v2_common_SitelinkFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_SitelinkFeedItem_descriptor,
        new java.lang.String[] { "LinkText", "Line1", "Line2", "FinalUrls", "FinalMobileUrls", "TrackingUrlTemplate", "UrlCustomParameters", "FinalUrlSuffix", });
    internal_static_google_ads_googleads_v2_common_HotelCalloutFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_ads_googleads_v2_common_HotelCalloutFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_HotelCalloutFeedItem_descriptor,
        new java.lang.String[] { "Text", "LanguageCode", });
    com.google.ads.googleads.v2.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v2.common.FeedCommonProto.getDescriptor();
    com.google.ads.googleads.v2.enums.AppStoreProto.getDescriptor();
    com.google.ads.googleads.v2.enums.CallConversionReportingStateProto.getDescriptor();
    com.google.ads.googleads.v2.enums.PriceExtensionPriceQualifierProto.getDescriptor();
    com.google.ads.googleads.v2.enums.PriceExtensionPriceUnitProto.getDescriptor();
    com.google.ads.googleads.v2.enums.PriceExtensionTypeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.PromotionExtensionDiscountModifierProto.getDescriptor();
    com.google.ads.googleads.v2.enums.PromotionExtensionOccasionProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
