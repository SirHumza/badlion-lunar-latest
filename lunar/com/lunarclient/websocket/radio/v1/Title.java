package com.lunarclient.websocket.radio.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_radio_v1_InboundRadioTrack_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_radio_v1_InboundRadioTrack_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_radio_v1_InboundRadioTrack_descriptor,
      new String[]{
         "Title",
         "TrackId",
         "AssetId",
         "Liked",
         "ArtistNames",
         "Duration",
         "Progress",
         "Position",
         "Paused",
         "ImageUrl",
         "CustomMetadata",
         "AlbumName",
         "RoyaltyFreeUsageReportId"
      }
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_radio_v1_InboundRadioTrack_CustomMetadataEntry_descriptor = internal_static_lunarclient_websocket_radio_v1_InboundRadioTrack_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_radio_v1_InboundRadioTrack_CustomMetadataEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_radio_v1_InboundRadioTrack_CustomMetadataEntry_descriptor, new String[]{"Key", "Value"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_radio_v1_InboundRadioStation_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_radio_v1_InboundRadioStation_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_radio_v1_InboundRadioStation_descriptor,
      new String[]{"Name", "Description", "StationId", "TrackCount", "StationType", "MonetizationType", "Duration", "LicensedSessionId", "ImageUrl"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_radio_v1_InboundRadioInfo_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_radio_v1_InboundRadioInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_radio_v1_InboundRadioInfo_descriptor, new String[]{"Track", "Station"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private CommonProto() {
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static Descriptors.FileDescriptor getDescriptor() {
      return descriptor;
   }

   static {
      String[] var0 = new String[]{
         "\n+lunarclient/websocket/radio/v1/common.proto\u0012\u001elunarclient.websocket.radio.v1\"³\u0004\n\u0011InboundRadioTrack\u0012\u0014\n\u0005title\u0018\u0001 \u0001(\tR\u0005title\u0012\u0019\n\btrack_id\u0018\u0002 \u0001(\u0005R\u0007trackId\u0012\u0019\n\basset_id\u0018\u0003 \u0001(\u0005R\u0007assetId\u0012\u0014\n\u0005liked\u0018\u0004 \u0001(\bR\u0005liked\u0012!\n\fartist_names\u0018\u0005 \u0003(\tR\u000bartistNames\u0012\u001a\n\bduration\u0018\u0007 \u0001(\u0005R\bduration\u0012\u001a\n\bprogress\u0018\b \u0001(\u0005R\bprogress\u0012\u001a\n\bposition\u0018\t \u0001(\u0005R\bposition\u0012\u0016\n\u0006paused\u0018\n \u0001(\bR\u0006paused\u0012\u001b\n\timage_url\u0018\u000b \u0001(\tR\bimageUrl\u0012n\n\u000fcustom_metadata\u0018\f \u0003(\u000b2E.lunarclient.websocket.radio.v1.InboundRadioTrack.CustomMetadataEntryR\u000ecustomMetadata\u0012\u001d\n\nalbum_name\u0018\r \u0001(\tR\talbumName\u0012>\n\u001croyalty_free_usage_report_id\u0018\u000e \u0001(\tR\u0018royaltyFreeUsageReportId\u001aA\n\u0013CustomMetadataEntry\u0012\u0010\n\u0003key\u0018\u0001 \u0001(\tR\u0003key\u0012\u0014\n\u0005value\u0018\u0002 \u0001(\tR\u0005value:\u00028\u0001\"Ý\u0005\n\u0013InboundRadioStation\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012 \n\u000bdescription\u0018\u0002 \u0001(\tR\u000bdescription\u0012\u001d\n\nstation_id\u0018\u0003 \u0001(\tR\tstationId\u0012\u001f\n\u000btrack_count\u0018\u0004 \u0001(\u0005R\ntrackCount\u0012b\n\fstation_type\u0018\u0005 \u0001(\u000e2?.lunarclient.websocket.radio.v1.InboundRadioStation.StationTypeR\u000bstationType\u0012q\n\u0011monetization_type\u0018\u0006 \u0001(\u000e2D.lunarclient.websocket.radio.v1.InboundRadioStation.MonetizationTypeR\u0010monetizationType\u0012\u001a\n\bduration\u0018\u0007 \u0001(\u0005R\bduration\u0012.\n\u0013licensed_session_id\u0018\b \u0001(\tR\u0011licensedSessionId\u0012\u001b\n\timage_url\u0018\t \u0001(\tR\bimageUrl\"e\n\u000bStationType\u0012\u001c\n\u0018STATION_TYPE_UNSPECIFIED\u0010\u0000\u0012\u0019\n\u0015STATION_TYPE_LICENSED\u0010\u0001\u0012\u001d\n\u0019STATION_TYPE_ROYALTY_FREE\u0010\u0002\"¨\u0001\n\u0010MonetizationType\u0012!\n\u001dMONETIZATION_TYPE_UNSPECIFIED\u0010\u0000\u0012(\n$MONETIZATION_TYPE_INTERNAL_AD_FUNDED\u0010\u0001\u0012(\n$MONETIZATION_TYPE_EXTERNAL_AD_FUNDED\u0010\u0002\u0012\u001d\n\u0019MONETIZATION_TYPE_PREMIUM\u0010\u0003\"ª\u0001\n\u0010InboundRadioInfo\u0012G\n\u0005track\u0018\u0001 \u0001(\u000b21.lunarclient.websocket.radio.v1.InboundRadioTrackR\u0005track\u0012M\n\u0007station\u0018\u0002 \u0001(\u000b23.lunarclient.websocket.radio.v1.InboundRadioStationR\u0007station*³\u0001\n\u0016RadioPlayingVisibility\u0012(\n$RADIO_PLAYING_VISIBILITY_UNSPECIFIED\u0010\u0000\u0012$\n RADIO_PLAYING_VISIBILITY_FRIENDS\u0010\u0001\u0012\"\n\u001eRADIO_PLAYING_VISIBILITY_NOONE\u0010\u0002\u0012%\n!RADIO_PLAYING_VISIBILITY_EVERYONE\u0010\u0003BÌ\u0001\n\"com.lunarclient.websocket.radio.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWRª\u0002\u001eLunarclient.Websocket.Radio.V1Ê\u0002\u001eLunarclient\\Websocket\\Radio\\V1â\u0002*Lunarclient\\Websocket\\Radio\\V1\\GPBMetadataê\u0002!Lunarclient::Websocket::Radio::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
