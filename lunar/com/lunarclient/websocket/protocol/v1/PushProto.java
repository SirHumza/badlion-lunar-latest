package com.lunarclient.websocket.protocol.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_protocol_v1_WebSocketRichClosePush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_protocol_v1_WebSocketRichClosePush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_protocol_v1_WebSocketRichClosePush_descriptor,
      new String[]{"ReconnectDelay", "Reason", "ReconnectAuthenticatorJwt"}
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
         "\n,lunarclient/websocket/protocol/v1/push.proto\u0012!lunarclient.websocket.protocol.v1\"Ñ\u0002\n\u0016WebSocketRichClosePush\u0012q\n\u000freconnect_delay\u0018\u0001 \u0001(\u000e2H.lunarclient.websocket.protocol.v1.WebSocketRichClosePush.ReconnectDelayR\u000ereconnectDelay\u0012\u0016\n\u0006reason\u0018\u0002 \u0001(\tR\u0006reason\u0012>\n\u001breconnect_authenticator_jwt\u0018\u0003 \u0001(\tR\u0019reconnectAuthenticatorJwt\"l\n\u000eReconnectDelay\u0012\u001f\n\u001bRECONNECT_DELAY_UNSPECIFIED\u0010\u0000\u0012\u001d\n\u0019RECONNECT_DELAY_IMMEDIATE\u0010\u0001\u0012\u001a\n\u0016RECONNECT_DELAY_NORMAL\u0010\u0002BÙ\u0001\n%com.lunarclient.websocket.protocol.v1B\tPushProtoP\u0001¢\u0002\u0003LWPª\u0002!Lunarclient.Websocket.Protocol.V1Ê\u0002!Lunarclient\\Websocket\\Protocol\\V1â\u0002-Lunarclient\\Websocket\\Protocol\\V1\\GPBMetadataê\u0002$Lunarclient::Websocket::Protocol::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
