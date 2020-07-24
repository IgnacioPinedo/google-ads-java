// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/reach_plan_service.proto

package com.google.ads.googleads.v4.services;

public interface OnTargetAudienceMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v4.services.OnTargetAudienceMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Reference audience size matching the considered targeting for YouTube.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value youtube_audience_size = 1;</code>
   * @return Whether the youtubeAudienceSize field is set.
   */
  boolean hasYoutubeAudienceSize();
  /**
   * <pre>
   * Reference audience size matching the considered targeting for YouTube.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value youtube_audience_size = 1;</code>
   * @return The youtubeAudienceSize.
   */
  com.google.protobuf.Int64Value getYoutubeAudienceSize();
  /**
   * <pre>
   * Reference audience size matching the considered targeting for YouTube.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value youtube_audience_size = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getYoutubeAudienceSizeOrBuilder();

  /**
   * <pre>
   * Reference audience size matching the considered targeting for Census.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value census_audience_size = 2;</code>
   * @return Whether the censusAudienceSize field is set.
   */
  boolean hasCensusAudienceSize();
  /**
   * <pre>
   * Reference audience size matching the considered targeting for Census.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value census_audience_size = 2;</code>
   * @return The censusAudienceSize.
   */
  com.google.protobuf.Int64Value getCensusAudienceSize();
  /**
   * <pre>
   * Reference audience size matching the considered targeting for Census.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value census_audience_size = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCensusAudienceSizeOrBuilder();
}