package com.lunarclient.websocket.store.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_store_v1_RefreshStorePush_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_store_v1_RefreshStorePush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_store_v1_RefreshStorePush_descriptor, new String[0]
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
         "\n)lunarclient/websocket/store/v1/push.proto\u0012\u001elunarclient.websocket.store.v1\"\u0012\n\u0010RefreshStorePushBÊ\u0001\n\"com.lunarclient.websocket.store.v1B\tPushProtoP\u0001¢\u0002\u0003LWSª\u0002\u001eLunarclient.Websocket.Store.V1Ê\u0002\u001eLunarclient\\Websocket\\Store\\V1â\u0002*Lunarclient\\Websocket\\Store\\V1\\GPBMetadataê\u0002!Lunarclient::Websocket::Store::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
