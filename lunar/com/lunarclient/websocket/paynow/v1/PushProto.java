package com.lunarclient.websocket.paynow.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_paynow_v1_OpenPayNowCheckoutPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_paynow_v1_OpenPayNowCheckoutPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_paynow_v1_OpenPayNowCheckoutPush_descriptor, new String[]{"CheckoutToken"}
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
         "\n*lunarclient/websocket/paynow/v1/push.proto\u0012\u001flunarclient.websocket.paynow.v1\"?\n\u0016OpenPayNowCheckoutPush\u0012%\n\u000echeckout_token\u0018\u0001 \u0001(\tR\rcheckoutTokenBÏ\u0001\n#com.lunarclient.websocket.paynow.v1B\tPushProtoP\u0001¢\u0002\u0003LWPª\u0002\u001fLunarclient.Websocket.Paynow.V1Ê\u0002\u001fLunarclient\\Websocket\\Paynow\\V1â\u0002+Lunarclient\\Websocket\\Paynow\\V1\\GPBMetadataê\u0002\"Lunarclient::Websocket::Paynow::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
