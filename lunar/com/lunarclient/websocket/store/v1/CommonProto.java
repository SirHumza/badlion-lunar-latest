package com.lunarclient.websocket.store.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;

public final class CommonProto {
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
         "\n+lunarclient/websocket/store/v1/common.proto\u0012\u001elunarclient.websocket.store.v1*¤\u0001\n\u0013IncomingGiftPrivacy\u0012%\n!INCOMING_GIFT_PRIVACY_UNSPECIFIED\u0010\u0000\u0012\"\n\u001eINCOMING_GIFT_PRIVACY_EVERYONE\u0010\u0001\u0012!\n\u001dINCOMING_GIFT_PRIVACY_FRIENDS\u0010\u0002\u0012\u001f\n\u001bINCOMING_GIFT_PRIVACY_NOONE\u0010\u0003BÌ\u0001\n\"com.lunarclient.websocket.store.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWSª\u0002\u001eLunarclient.Websocket.Store.V1Ê\u0002\u001eLunarclient\\Websocket\\Store\\V1â\u0002*Lunarclient\\Websocket\\Store\\V1\\GPBMetadataê\u0002!Lunarclient::Websocket::Store::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
