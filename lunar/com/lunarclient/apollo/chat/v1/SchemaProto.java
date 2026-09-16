package com.lunarclient.apollo.chat.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.button.v1.ButtonProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_chat_v1_DisplayLiveChatMessageMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_chat_v1_DisplayLiveChatMessageMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_chat_v1_DisplayLiveChatMessageMessage_descriptor, new String[]{"MessageId", "AdventureJsonLines"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_chat_v1_RemoveLiveChatMessageMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_chat_v1_RemoveLiveChatMessageMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_chat_v1_RemoveLiveChatMessageMessage_descriptor, new String[]{"MessageId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_chat_v1_ChatButton_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_chat_v1_ChatButton_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_chat_v1_ChatButton_descriptor, new String[]{"Button"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_chat_v1_DisplayChatButtonsMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_chat_v1_DisplayChatButtonsMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_chat_v1_DisplayChatButtonsMessage_descriptor, new String[]{"ChatButtons"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_chat_v1_RemoveChatButtonMessage_descriptor = getDescriptor().getMessageTypes().get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_chat_v1_RemoveChatButtonMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_chat_v1_RemoveChatButtonMessage_descriptor, new String[]{"Id"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_chat_v1_ResetChatButtonsMessage_descriptor = getDescriptor().getMessageTypes().get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_chat_v1_ResetChatButtonsMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_chat_v1_ResetChatButtonsMessage_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_chat_v1_UpdateChatButtonMessage_descriptor = getDescriptor().getMessageTypes().get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_chat_v1_UpdateChatButtonMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_chat_v1_UpdateChatButtonMessage_descriptor, new String[]{"Id", "Update"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private SchemaProto() {
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
         "\n'lunarclient/apollo/chat/v1/schema.proto\u0012\u001alunarclient.apollo.chat.v1\u001a)lunarclient/apollo/button/v1/button.proto\"p\n\u001dDisplayLiveChatMessageMessage\u0012\u001d\n\nmessage_id\u0018\u0001 \u0001(\u0005R\tmessageId\u00120\n\u0014adventure_json_lines\u0018\u0002 \u0001(\tR\u0012adventureJsonLines\"=\n\u001cRemoveLiveChatMessageMessage\u0012\u001d\n\nmessage_id\u0018\u0001 \u0001(\u0005R\tmessageId\"J\n\nChatButton\u0012<\n\u0006button\u0018\u0001 \u0001(\u000b2$.lunarclient.apollo.button.v1.ButtonR\u0006button\"f\n\u0019DisplayChatButtonsMessage\u0012I\n\fchat_buttons\u0018\u0001 \u0003(\u000b2&.lunarclient.apollo.chat.v1.ChatButtonR\u000bchatButtons\")\n\u0017RemoveChatButtonMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\"\u0019\n\u0017ResetChatButtonsMessage\"m\n\u0017UpdateChatButtonMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012B\n\u0006update\u0018\u0002 \u0001(\u000b2*.lunarclient.apollo.button.v1.ButtonUpdateR\u0006updateB¸\u0001\n\u001ecom.lunarclient.apollo.chat.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LACª\u0002\u001aLunarclient.Apollo.Chat.V1Ê\u0002\u001aLunarclient\\Apollo\\Chat\\V1â\u0002&Lunarclient\\Apollo\\Chat\\V1\\GPBMetadataê\u0002\u001dLunarclient::Apollo::Chat::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{ButtonProto.getDescriptor()});
      ButtonProto.getDescriptor();
   }
}
