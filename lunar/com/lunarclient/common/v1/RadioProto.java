package com.lunarclient.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class RadioProto {
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_RadioTrack_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_RadioTrack_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_RadioTrack_descriptor, new String[]{"Title", "ArtistNames", "Duration", "Progress", "Paused", "ImageUrl"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_RadioStation_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_RadioStation_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_RadioStation_descriptor, new String[]{"Name", "Description", "StationId", "ImageUrl"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_RadioInfo_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_RadioInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_RadioInfo_descriptor, new String[]{"Track", "Station"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private RadioProto() {
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
         "\n!lunarclient/common/v1/radio.proto\u0012\u0015lunarclient.common.v1\"²\u0001\n\nRadioTrack\u0012\u0014\n\u0005title\u0018\u0001 \u0001(\tR\u0005title\u0012!\n\fartist_names\u0018\u0002 \u0003(\tR\u000bartistNames\u0012\u001a\n\bduration\u0018\u0003 \u0001(\u0005R\bduration\u0012\u001a\n\bprogress\u0018\u0004 \u0001(\u0005R\bprogress\u0012\u0016\n\u0006paused\u0018\u0005 \u0001(\bR\u0006paused\u0012\u001b\n\timage_url\u0018\u0006 \u0001(\tR\bimageUrl\"\u0080\u0001\n\fRadioStation\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012 \n\u000bdescription\u0018\u0002 \u0001(\tR\u000bdescription\u0012\u001d\n\nstation_id\u0018\u0003 \u0001(\tR\tstationId\u0012\u001b\n\timage_url\u0018\u0004 \u0001(\tR\bimageUrl\"\u0083\u0001\n\tRadioInfo\u00127\n\u0005track\u0018\u0001 \u0001(\u000b2!.lunarclient.common.v1.RadioTrackR\u0005track\u0012=\n\u0007station\u0018\u0002 \u0001(\u000b2#.lunarclient.common.v1.RadioStationR\u0007stationB\u009d\u0001\n\u0019com.lunarclient.common.v1B\nRadioProtoP\u0001¢\u0002\u0003LCXª\u0002\u0015Lunarclient.Common.V1Ê\u0002\u0015Lunarclient\\Common\\V1â\u0002!Lunarclient\\Common\\V1\\GPBMetadataê\u0002\u0017Lunarclient::Common::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
