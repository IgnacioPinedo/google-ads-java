// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/errors/ad_group_criterion_error.proto

package com.google.ads.googleads.v3.errors;

public final class AdGroupCriterionErrorProto {
  private AdGroupCriterionErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_errors_AdGroupCriterionErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_errors_AdGroupCriterionErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v3/errors/ad_grou" +
      "p_criterion_error.proto\022\036google.ads.goog" +
      "leads.v3.errors\032\034google/api/annotations." +
      "proto\"\327\014\n\031AdGroupCriterionErrorEnum\"\271\014\n\025" +
      "AdGroupCriterionError\022\017\n\013UNSPECIFIED\020\000\022\013" +
      "\n\007UNKNOWN\020\001\022+\n\'AD_GROUP_CRITERION_LABEL_" +
      "DOES_NOT_EXIST\020\002\022+\n\'AD_GROUP_CRITERION_L" +
      "ABEL_ALREADY_EXISTS\020\003\022*\n&CANNOT_ADD_LABE" +
      "L_TO_NEGATIVE_CRITERION\020\004\022\027\n\023TOO_MANY_OP" +
      "ERATIONS\020\005\022\030\n\024CANT_UPDATE_NEGATIVE\020\006\022\032\n\026" +
      "CONCRETE_TYPE_REQUIRED\020\007\022!\n\035BID_INCOMPAT" +
      "IBLE_WITH_ADGROUP\020\010\022\035\n\031CANNOT_TARGET_AND" +
      "_EXCLUDE\020\t\022\017\n\013ILLEGAL_URL\020\n\022\030\n\024INVALID_K" +
      "EYWORD_TEXT\020\013\022\033\n\027INVALID_DESTINATION_URL" +
      "\020\014\022\037\n\033MISSING_DESTINATION_URL_TAG\020\r\0221\n-K" +
      "EYWORD_LEVEL_BID_NOT_SUPPORTED_FOR_MANUA" +
      "LCPM\020\016\022\027\n\023INVALID_USER_STATUS\020\017\022\034\n\030CANNO" +
      "T_ADD_CRITERIA_TYPE\020\020\022 \n\034CANNOT_EXCLUDE_" +
      "CRITERIA_TYPE\020\021\0225\n1CAMPAIGN_TYPE_NOT_COM" +
      "PATIBLE_WITH_PARTIAL_FAILURE\020\033\022-\n)OPERAT" +
      "IONS_FOR_TOO_MANY_SHOPPING_ADGROUPS\020\034\0224\n" +
      "0CANNOT_MODIFY_URL_FIELDS_WITH_DUPLICATE" +
      "_ELEMENTS\020\035\022!\n\035CANNOT_SET_WITHOUT_FINAL_" +
      "URLS\020\036\0226\n2CANNOT_CLEAR_FINAL_URLS_IF_FIN" +
      "AL_MOBILE_URLS_EXIST\020\037\0223\n/CANNOT_CLEAR_F" +
      "INAL_URLS_IF_FINAL_APP_URLS_EXIST\020 \022;\n7C" +
      "ANNOT_CLEAR_FINAL_URLS_IF_TRACKING_URL_T" +
      "EMPLATE_EXISTS\020!\022:\n6CANNOT_CLEAR_FINAL_U" +
      "RLS_IF_URL_CUSTOM_PARAMETERS_EXIST\020\"\0222\n." +
      "CANNOT_SET_BOTH_DESTINATION_URL_AND_FINA" +
      "L_URLS\020#\022=\n9CANNOT_SET_BOTH_DESTINATION_" +
      "URL_AND_TRACKING_URL_TEMPLATE\020$\022/\n+FINAL" +
      "_URLS_NOT_SUPPORTED_FOR_CRITERION_TYPE\020%" +
      "\0226\n2FINAL_MOBILE_URLS_NOT_SUPPORTED_FOR_" +
      "CRITERION_TYPE\020&\022#\n\037INVALID_LISTING_GROU" +
      "P_HIERARCHY\020\'\022+\n\'LISTING_GROUP_UNIT_CANN" +
      "OT_HAVE_CHILDREN\020(\0222\n.LISTING_GROUP_SUBD" +
      "IVISION_REQUIRES_OTHERS_CASE\020)\022:\n6LISTIN" +
      "G_GROUP_REQUIRES_SAME_DIMENSION_TYPE_AS_" +
      "SIBLINGS\020*\022 \n\034LISTING_GROUP_ALREADY_EXIS" +
      "TS\020+\022 \n\034LISTING_GROUP_DOES_NOT_EXIST\020,\022#" +
      "\n\037LISTING_GROUP_CANNOT_BE_REMOVED\020-\022\036\n\032I" +
      "NVALID_LISTING_GROUP_TYPE\020.\022*\n&LISTING_G" +
      "ROUP_ADD_MAY_ONLY_USE_TEMP_ID\020/B\365\001\n\"com." +
      "google.ads.googleads.v3.errorsB\032AdGroupC" +
      "riterionErrorProtoP\001ZDgoogle.golang.org/" +
      "genproto/googleapis/ads/googleads/v3/err" +
      "ors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds." +
      "V3.Errors\312\002\036Google\\Ads\\GoogleAds\\V3\\Erro" +
      "rs\352\002\"Google::Ads::GoogleAds::V3::Errorsb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v3_errors_AdGroupCriterionErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_errors_AdGroupCriterionErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_errors_AdGroupCriterionErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
