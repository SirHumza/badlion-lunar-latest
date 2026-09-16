package com.lunarclient.websocket.skyblock.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_skyblock_v1_BroadcastDungeonUpdateRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_skyblock_v1_BroadcastDungeonUpdateRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_skyblock_v1_BroadcastDungeonUpdateRequest_descriptor, new String[]{"Update"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_skyblock_v1_BroadcastDungeonUpdateResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_skyblock_v1_BroadcastDungeonUpdateResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_skyblock_v1_BroadcastDungeonUpdateResponse_descriptor, new String[0]
   );
   private static Descriptors.FileDescriptor descriptor;

   private ServiceProto() {
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
         "\n/lunarclient/websocket/skyblock/v1/service.proto\u0012!lunarclient.websocket.skyblock.v1\u001a.lunarclient/websocket/protocol/v1/common.proto\u001a.lunarclient/websocket/skyblock/v1/common.proto\"i\n\u001dBroadcastDungeonUpdateRequest\u0012H\n\u0006update\u0018\u0001 \u0001(\u000b20.lunarclient.websocket.skyblock.v1.DungeonUpdateR\u0006update\" \n\u001eBroadcastDungeonUpdateResponse2·\u0001\n\u000fSkyblockService\u0012£\u0001\n\u0016BroadcastDungeonUpdate\u0012@.lunarclient.websocket.skyblock.v1.BroadcastDungeonUpdateRequest\u001aA.lunarclient.websocket.skyblock.v1.BroadcastDungeonUpdateResponse\"\u0004\u0088µ\u0018\u0001Bß\u0001\n%com.lunarclient.websocket.skyblock.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWSª\u0002!Lunarclient.Websocket.Skyblock.V1Ê\u0002!Lunarclient\\Websocket\\Skyblock\\V1â\u0002-Lunarclient\\Websocket\\Skyblock\\V1\\GPBMetadataê\u0002$Lunarclient::Websocket::Skyblock::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor(), CommonProto.getDescriptor()}
      );
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(com.lunarclient.websocket.protocol.v1.CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor();
      CommonProto.getDescriptor();
   }
}
