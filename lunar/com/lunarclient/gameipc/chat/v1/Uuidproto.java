package com.lunarclient.gameipc.chat.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.UuidProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_chat_v1_ReceiveMessageRequest_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_chat_v1_ReceiveMessageRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_chat_v1_ReceiveMessageRequest_descriptor, new String[]{"Sender", "Content"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_chat_v1_ReceiveMessageResponse_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_chat_v1_ReceiveMessageResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_chat_v1_ReceiveMessageResponse_descriptor, new String[0]
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
         "\n)lunarclient/gameipc/chat/v1/service.proto\u0012\u001blunarclient.gameipc.chat.v1\u001a lunarclient/common/v1/uuid.proto\"q\n\u0015ReceiveMessageRequest\u0012>\n\u0006sender\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0006sender\u0012\u0018\n\u0007content\u0018\u0002 \u0001(\tR\u0007content\"\u0018\n\u0016ReceiveMessageResponse2\u0088\u0001\n\u000bChatService\u0012y\n\u000eReceiveMessage\u00122.lunarclient.gameipc.chat.v1.ReceiveMessageRequest\u001a3.lunarclient.gameipc.chat.v1.ReceiveMessageResponseBÁ\u0001\n\u001fcom.lunarclient.gameipc.chat.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LGCª\u0002\u001bLunarclient.Gameipc.Chat.V1Ê\u0002\u001bLunarclient\\Gameipc\\Chat\\V1â\u0002'Lunarclient\\Gameipc\\Chat\\V1\\GPBMetadataê\u0002\u001eLunarclient::Gameipc::Chat::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{UuidProto.getDescriptor()});
      UuidProto.getDescriptor();
   }
}
