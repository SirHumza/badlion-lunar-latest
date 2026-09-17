package com.lunarclient.websocket.server.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.ModpackProto;
import com.lunarclient.common.v1.VersionProto;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_server_v1_ServerRecommendations_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_server_v1_ServerRecommendations_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_server_v1_ServerRecommendations_descriptor, new String[]{"Modpack", "IpAddresses", "Versions"}
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
         "\n,lunarclient/websocket/server/v1/common.proto\u0012\u001flunarclient.websocket.server.v1\u001a#lunarclient/common/v1/modpack.proto\u001a#lunarclient/common/v1/version.proto\"¿\u0001\n\u0015ServerRecommendations\u0012>\n\u0007modpack\u0018\u0001 \u0001(\u000b2$.lunarclient.common.v1.PlayerModpackR\u0007modpack\u0012!\n\fip_addresses\u0018\u0002 \u0003(\tR\u000bipAddresses\u0012C\n\bversions\u0018\u0003 \u0003(\u000b2'.lunarclient.common.v1.MinecraftVersionR\bversionsBÑ\u0001\n#com.lunarclient.websocket.server.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWSª\u0002\u001fLunarclient.Websocket.Server.V1Ê\u0002\u001fLunarclient\\Websocket\\Server\\V1â\u0002+Lunarclient\\Websocket\\Server\\V1\\GPBMetadataê\u0002\"Lunarclient::Websocket::Server::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{ModpackProto.getDescriptor(), VersionProto.getDescriptor()}
      );
      ModpackProto.getDescriptor();
      VersionProto.getDescriptor();
   }
}
