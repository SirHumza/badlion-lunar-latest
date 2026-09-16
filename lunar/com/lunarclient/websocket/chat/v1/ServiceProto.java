package com.lunarclient.websocket.chat.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.UuidProto;
import com.lunarclient.websocket.protocol.v1.CommonProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_chat_v1_SendChatRequest_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_chat_v1_SendChatRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_chat_v1_SendChatRequest_descriptor, new String[]{"TargetUuid", "ChatMessage"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_chat_v1_SendChatResponse_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_chat_v1_SendChatResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_chat_v1_SendChatResponse_descriptor, new String[0]
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
         "\n+lunarclient/websocket/chat/v1/service.proto\u0012\u001dlunarclient.websocket.chat.v1\u001a lunarclient/common/v1/uuid.proto\u001a.lunarclient/websocket/protocol/v1/common.proto\"r\n\u000fSendChatRequest\u0012<\n\u000btarget_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\ntargetUuid\u0012!\n\fchat_message\u0018\u0002 \u0001(\tR\u000bchatMessage\"\u0012\n\u0010SendChatResponse2\u0080\u0001\n\u000bChatService\u0012q\n\bSendChat\u0012..lunarclient.websocket.chat.v1.SendChatRequest\u001a/.lunarclient.websocket.chat.v1.SendChatResponse\"\u0004\u0088µ\u0018\u0003BË\u0001\n!com.lunarclient.websocket.chat.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWCª\u0002\u001dLunarclient.Websocket.Chat.V1Ê\u0002\u001dLunarclient\\Websocket\\Chat\\V1â\u0002)Lunarclient\\Websocket\\Chat\\V1\\GPBMetadataê\u0002 Lunarclient::Websocket::Chat::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{UuidProto.getDescriptor(), CommonProto.getDescriptor()}
      );
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      UuidProto.getDescriptor();
      CommonProto.getDescriptor();
   }
}
