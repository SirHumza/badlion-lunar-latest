package com.lunarclient.websocket.chat.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.UuidProto;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_chat_v1_ReceiveChatPush_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_chat_v1_ReceiveChatPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_chat_v1_ReceiveChatPush_descriptor, new String[]{"SenderUuid", "ChatMessage"}
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
         "\n(lunarclient/websocket/chat/v1/push.proto\u0012\u001dlunarclient.websocket.chat.v1\u001a lunarclient/common/v1/uuid.proto\"r\n\u000fReceiveChatPush\u0012<\n\u000bsender_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\nsenderUuid\u0012!\n\fchat_message\u0018\u0002 \u0001(\tR\u000bchatMessageBÅ\u0001\n!com.lunarclient.websocket.chat.v1B\tPushProtoP\u0001¢\u0002\u0003LWCª\u0002\u001dLunarclient.Websocket.Chat.V1Ê\u0002\u001dLunarclient\\Websocket\\Chat\\V1â\u0002)Lunarclient\\Websocket\\Chat\\V1\\GPBMetadataê\u0002 Lunarclient::Websocket::Chat::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{UuidProto.getDescriptor()});
      UuidProto.getDescriptor();
   }
}
