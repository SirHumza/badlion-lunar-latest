package com.lunarclient.websocket.protocol.v1;

import com.google.protobuf.AnyProto;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;

public final class CommonProto {
   public static final int ALLOWED_SENDER_FIELD_NUMBER = 50001;
   public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.MethodOptions, AllowedSender> allowedSender = GeneratedMessage.newFileScopedGeneratedExtension(
      AllowedSender.class, null
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_protocol_v1_ServerboundWebSocketMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_protocol_v1_ServerboundWebSocketMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_protocol_v1_ServerboundWebSocketMessage_descriptor, new String[]{"RequestId", "Service", "Method", "Input"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_protocol_v1_ClientboundWebSocketMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_protocol_v1_ClientboundWebSocketMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_protocol_v1_ClientboundWebSocketMessage_descriptor, new String[]{"RpcResponse", "PushNotification", "Contents"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_protocol_v1_WebSocketRpcResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_protocol_v1_WebSocketRpcResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_protocol_v1_WebSocketRpcResponse_descriptor, new String[]{"RequestId", "Output"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private CommonProto() {
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
      var0.add(allowedSender);
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static Descriptors.FileDescriptor getDescriptor() {
      return descriptor;
   }

   static {
      String[] var0 = new String[]{
         "\n.lunarclient/websocket/protocol/v1/common.proto\u0012!lunarclient.websocket.protocol.v1\u001a\u0019google/protobuf/any.proto\u001a google/protobuf/descriptor.proto\"\u0084\u0001\n\u001bServerboundWebSocketMessage\u0012\u001d\n\nrequest_id\u0018\u0001 \u0001(\fR\trequestId\u0012\u0018\n\u0007service\u0018\u0002 \u0001(\tR\u0007service\u0012\u0016\n\u0006method\u0018\u0003 \u0001(\tR\u0006method\u0012\u0014\n\u0005input\u0018\u0004 \u0001(\fR\u0005input\"Ì\u0001\n\u001bClientboundWebSocketMessage\u0012\\\n\frpc_response\u0018\u0001 \u0001(\u000b27.lunarclient.websocket.protocol.v1.WebSocketRpcResponseH\u0000R\u000brpcResponse\u0012C\n\u0011push_notification\u0018\u0002 \u0001(\u000b2\u0014.google.protobuf.AnyH\u0000R\u0010pushNotificationB\n\n\bcontents\"M\n\u0014WebSocketRpcResponse\u0012\u001d\n\nrequest_id\u0018\u0001 \u0001(\fR\trequestId\u0012\u0016\n\u0006output\u0018\u0002 \u0001(\fR\u0006output*´\u0001\n\rAllowedSender\u0012\u001e\n\u001aALLOWED_SENDER_UNSPECIFIED\u0010\u0000\u0012%\n!ALLOWED_SENDER_AUTHENTICATED_GAME\u0010\u0001\u0012)\n%ALLOWED_SENDER_AUTHENTICATED_LAUNCHER\u0010\u0002\u00121\n-ALLOWED_SENDER_AUTHENTICATED_GAME_OR_LAUNCHER\u0010\u0003:y\n\u000eallowed_sender\u0012\u001e.google.protobuf.MethodOptions\u0018Ñ\u0086\u0003 \u0001(\u000e20.lunarclient.websocket.protocol.v1.AllowedSenderR\rallowedSenderBÛ\u0001\n%com.lunarclient.websocket.protocol.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWPª\u0002!Lunarclient.Websocket.Protocol.V1Ê\u0002!Lunarclient\\Websocket\\Protocol\\V1â\u0002-Lunarclient\\Websocket\\Protocol\\V1\\GPBMetadataê\u0002$Lunarclient::Websocket::Protocol::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor(), DescriptorProtos.getDescriptor()}
      );
      allowedSender.internalInit(descriptor.getExtensions().get(0));
      AnyProto.getDescriptor();
      DescriptorProtos.getDescriptor();
   }
}
