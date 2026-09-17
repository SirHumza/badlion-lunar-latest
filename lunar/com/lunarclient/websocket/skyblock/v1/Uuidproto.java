package com.lunarclient.websocket.skyblock.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.UuidProto;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_skyblock_v1_DungeonUpdatePush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_skyblock_v1_DungeonUpdatePush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_skyblock_v1_DungeonUpdatePush_descriptor, new String[]{"SenderUuid", "Update"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private PushProto() {
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
         "\n,lunarclient/websocket/skyblock/v1/push.proto\u0012!lunarclient.websocket.skyblock.v1\u001a lunarclient/common/v1/uuid.proto\u001a.lunarclient/websocket/skyblock/v1/common.proto\"\u009b\u0001\n\u0011DungeonUpdatePush\u0012<\n\u000bsender_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\nsenderUuid\u0012H\n\u0006update\u0018\u0002 \u0001(\u000b20.lunarclient.websocket.skyblock.v1.DungeonUpdateR\u0006updateBÙ\u0001\n%com.lunarclient.websocket.skyblock.v1B\tPushProtoP\u0001¢\u0002\u0003LWSª\u0002!Lunarclient.Websocket.Skyblock.V1Ê\u0002!Lunarclient\\Websocket\\Skyblock\\V1â\u0002-Lunarclient\\Websocket\\Skyblock\\V1\\GPBMetadataê\u0002$Lunarclient::Websocket::Skyblock::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{UuidProto.getDescriptor(), CommonProto.getDescriptor()}
      );
      UuidProto.getDescriptor();
      CommonProto.getDescriptor();
   }
}
