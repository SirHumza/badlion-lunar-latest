package com.lunarclient.websocket.tebex.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_tebex_v1_OpenTebexJsCheckoutPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_tebex_v1_OpenTebexJsCheckoutPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_tebex_v1_OpenTebexJsCheckoutPush_descriptor, new String[]{"BasketIdent", "Locale"}
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
         "\n)lunarclient/websocket/tebex/v1/push.proto\u0012\u001elunarclient.websocket.tebex.v1\"T\n\u0017OpenTebexJsCheckoutPush\u0012!\n\fbasket_ident\u0018\u0001 \u0001(\tR\u000bbasketIdent\u0012\u0016\n\u0006locale\u0018\u0002 \u0001(\tR\u0006localeBÊ\u0001\n\"com.lunarclient.websocket.tebex.v1B\tPushProtoP\u0001¢\u0002\u0003LWTª\u0002\u001eLunarclient.Websocket.Tebex.V1Ê\u0002\u001eLunarclient\\Websocket\\Tebex\\V1â\u0002*Lunarclient\\Websocket\\Tebex\\V1\\GPBMetadataê\u0002!Lunarclient::Websocket::Tebex::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
