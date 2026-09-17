package com.lunarclient.gameipc.chat.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_chat_v1_SendChatPush_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_chat_v1_SendChatPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_chat_v1_SendChatPush_descriptor, new String[]{"Message"}
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
         "\n&lunarclient/gameipc/chat/v1/push.proto\u0012\u001blunarclient.gameipc.chat.v1\"(\n\fSendChatPush\u0012\u0018\n\u0007message\u0018\u0001 \u0001(\tR\u0007messageB»\u0001\n\u001fcom.lunarclient.gameipc.chat.v1B\tPushProtoP\u0001¢\u0002\u0003LGCª\u0002\u001bLunarclient.Gameipc.Chat.V1Ê\u0002\u001bLunarclient\\Gameipc\\Chat\\V1â\u0002'Lunarclient\\Gameipc\\Chat\\V1\\GPBMetadataê\u0002\u001eLunarclient::Gameipc::Chat::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
