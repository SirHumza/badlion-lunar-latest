package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.lunarclient.common.v1.InboundLocationProto;

public final class LocationProto {
   private static Descriptors.FileDescriptor descriptor;

   private LocationProto() {
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
         "\n.lunarclient/websocket/friend/v1/location.proto\u0012\u001flunarclient.websocket.friend.v1\u001a,lunarclient/common/v1/inbound_location.protoBÓ\u0001\n#com.lunarclient.websocket.friend.v1B\rLocationProtoP\u0001¢\u0002\u0003LWFª\u0002\u001fLunarclient.Websocket.Friend.V1Ê\u0002\u001fLunarclient\\Websocket\\Friend\\V1â\u0002+Lunarclient\\Websocket\\Friend\\V1\\GPBMetadataê\u0002\"Lunarclient::Websocket::Friend::V1P\u0000b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{InboundLocationProto.getDescriptor()});
      InboundLocationProto.getDescriptor();
   }
}
