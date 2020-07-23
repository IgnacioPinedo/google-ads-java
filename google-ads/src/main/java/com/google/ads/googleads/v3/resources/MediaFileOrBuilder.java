// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/media_file.proto

package com.google.ads.googleads.v3.resources;

public interface MediaFileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.MediaFile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the media file.
   * Media file resource names have the form:
   * `customers/{customer_id}/mediaFiles/{media_file_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the media file.
   * Media file resource names have the form:
   * `customers/{customer_id}/mediaFiles/{media_file_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the media file.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the media file.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * Output only. The ID of the media file.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Immutable. Type of the media file.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.MediaTypeEnum.MediaType type = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Immutable. Type of the media file.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.MediaTypeEnum.MediaType type = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The type.
   */
  com.google.ads.googleads.v3.enums.MediaTypeEnum.MediaType getType();

  /**
   * <pre>
   * Output only. The mime type of the media file.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.MimeTypeEnum.MimeType mime_type = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for mimeType.
   */
  int getMimeTypeValue();
  /**
   * <pre>
   * Output only. The mime type of the media file.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.MimeTypeEnum.MimeType mime_type = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The mimeType.
   */
  com.google.ads.googleads.v3.enums.MimeTypeEnum.MimeType getMimeType();

  /**
   * <pre>
   * Immutable. The URL of where the original media file was downloaded from (or a file
   * name). Only used for media of type AUDIO and IMAGE.
   * </pre>
   *
   * <code>.google.protobuf.StringValue source_url = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the sourceUrl field is set.
   */
  boolean hasSourceUrl();
  /**
   * <pre>
   * Immutable. The URL of where the original media file was downloaded from (or a file
   * name). Only used for media of type AUDIO and IMAGE.
   * </pre>
   *
   * <code>.google.protobuf.StringValue source_url = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The sourceUrl.
   */
  com.google.protobuf.StringValue getSourceUrl();
  /**
   * <pre>
   * Immutable. The URL of where the original media file was downloaded from (or a file
   * name). Only used for media of type AUDIO and IMAGE.
   * </pre>
   *
   * <code>.google.protobuf.StringValue source_url = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.StringValueOrBuilder getSourceUrlOrBuilder();

  /**
   * <pre>
   * Immutable. The name of the media file. The name can be used by clients to help
   * identify previously uploaded media.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Immutable. The name of the media file. The name can be used by clients to help
   * identify previously uploaded media.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The name.
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * Immutable. The name of the media file. The name can be used by clients to help
   * identify previously uploaded media.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Output only. The size of the media file in bytes.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value file_size = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the fileSize field is set.
   */
  boolean hasFileSize();
  /**
   * <pre>
   * Output only. The size of the media file in bytes.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value file_size = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The fileSize.
   */
  com.google.protobuf.Int64Value getFileSize();
  /**
   * <pre>
   * Output only. The size of the media file in bytes.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value file_size = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getFileSizeOrBuilder();

  /**
   * <pre>
   * Immutable. Encapsulates an Image.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.MediaImage image = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the image field is set.
   */
  boolean hasImage();
  /**
   * <pre>
   * Immutable. Encapsulates an Image.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.MediaImage image = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The image.
   */
  com.google.ads.googleads.v3.resources.MediaImage getImage();
  /**
   * <pre>
   * Immutable. Encapsulates an Image.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.MediaImage image = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.resources.MediaImageOrBuilder getImageOrBuilder();

  /**
   * <pre>
   * Immutable. A ZIP archive media the content of which contains HTML5 assets.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.MediaBundle media_bundle = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the mediaBundle field is set.
   */
  boolean hasMediaBundle();
  /**
   * <pre>
   * Immutable. A ZIP archive media the content of which contains HTML5 assets.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.MediaBundle media_bundle = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The mediaBundle.
   */
  com.google.ads.googleads.v3.resources.MediaBundle getMediaBundle();
  /**
   * <pre>
   * Immutable. A ZIP archive media the content of which contains HTML5 assets.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.MediaBundle media_bundle = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.resources.MediaBundleOrBuilder getMediaBundleOrBuilder();

  /**
   * <pre>
   * Output only. Encapsulates an Audio.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.MediaAudio audio = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the audio field is set.
   */
  boolean hasAudio();
  /**
   * <pre>
   * Output only. Encapsulates an Audio.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.MediaAudio audio = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The audio.
   */
  com.google.ads.googleads.v3.resources.MediaAudio getAudio();
  /**
   * <pre>
   * Output only. Encapsulates an Audio.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.MediaAudio audio = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.resources.MediaAudioOrBuilder getAudioOrBuilder();

  /**
   * <pre>
   * Immutable. Encapsulates a Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.MediaVideo video = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the video field is set.
   */
  boolean hasVideo();
  /**
   * <pre>
   * Immutable. Encapsulates a Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.MediaVideo video = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The video.
   */
  com.google.ads.googleads.v3.resources.MediaVideo getVideo();
  /**
   * <pre>
   * Immutable. Encapsulates a Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.MediaVideo video = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.resources.MediaVideoOrBuilder getVideoOrBuilder();

  public com.google.ads.googleads.v3.resources.MediaFile.MediatypeCase getMediatypeCase();
}
