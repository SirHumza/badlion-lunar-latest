package com.lunarclient.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ModpackProto {
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_PlayerModpack_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_PlayerModpack_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_PlayerModpack_descriptor,
      new String[]{"ModrinthId", "Name", "IconUrl", "ModrinthVersionId", "CurseforgeId", "CurseforgeFileId"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private ModpackProto() {
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
         "\n#lunarclient/common/v1/modpack.proto\u0012\u0015lunarclient.common.v1\"â\u0001\n\rPlayerModpack\u0012\u001f\n\u000bmodrinth_id\u0018\u0001 \u0001(\tR\nmodrinthId\u0012\u0012\n\u0004name\u0018\u0002 \u0001(\tR\u0004name\u0012\u0019\n\bicon_url\u0018\u0003 \u0001(\tR\u0007iconUrl\u0012.\n\u0013modrinth_version_id\u0018\u0004 \u0001(\tR\u0011modrinthVersionId\u0012#\n\rcurseforge_id\u0018\u0005 \u0001(\tR\fcurseforgeId\u0012,\n\u0012curseforge_file_id\u0018\u0006 \u0001(\tR\u0010curseforgeFileIdB\u009f\u0001\n\u0019com.lunarclient.common.v1B\fModpackProtoP\u0001¢\u0002\u0003LCXª\u0002\u0015Lunarclient.Common.V1Ê\u0002\u0015Lunarclient\\Common\\V1â\u0002!Lunarclient\\Common\\V1\\GPBMetadataê\u0002\u0017Lunarclient::Common::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
