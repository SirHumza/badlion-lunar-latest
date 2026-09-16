package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.TimestampProto;
import com.lunarclient.common.v1.UuidProto;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationMessagePush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationMessagePush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationMessagePush_descriptor, new String[]{"ConversationReference", "Message", "Updated"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationPreSendActionPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationPreSendActionPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationPreSendActionPush_descriptor, new String[]{"ConversationReference", "Action", "Sender"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationOwnerUpdatePush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationOwnerUpdatePush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationOwnerUpdatePush_descriptor,
      new String[]{"ConversationReference", "Invoker", "PreviousOwnerUuid", "OwnerUuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationAddParticipantsPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationAddParticipantsPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationAddParticipantsPush_descriptor,
      new String[]{"ConversationReference", "Invoker", "Participants"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationRemoveParticipantPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationRemoveParticipantPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationRemoveParticipantPush_descriptor,
      new String[]{"ConversationReference", "Invoker", "Participant"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateNamePush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateNamePush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateNamePush_descriptor, new String[]{"ConversationReference", "Invoker", "Name"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateIconPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateIconPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateIconPush_descriptor, new String[]{"ConversationReference", "Invoker", "ImageUrl"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationAddPinnedMessagePush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationAddPinnedMessagePush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationAddPinnedMessagePush_descriptor,
      new String[]{"ConversationReference", "Invoker", "MessageId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationRemovePinnedMessagePush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(8);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationRemovePinnedMessagePush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationRemovePinnedMessagePush_descriptor,
      new String[]{"ConversationReference", "Invoker", "MessageId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateInvitePolicyPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(9);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateInvitePolicyPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateInvitePolicyPush_descriptor, new String[]{"ConversationReference", "Policy"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateNamePolicyPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(10);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateNamePolicyPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateNamePolicyPush_descriptor, new String[]{"ConversationReference", "Policy"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateIconPolicyPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(11);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateIconPolicyPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateIconPolicyPush_descriptor, new String[]{"ConversationReference", "Policy"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateMessagePinningPolicyPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(12);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateMessagePinningPolicyPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateMessagePinningPolicyPush_descriptor,
      new String[]{"ConversationReference", "Policy"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationAddedPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(13);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationAddedPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationAddedPush_descriptor, new String[]{"Conversation", "Sender", "AddedAt"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationRemovedPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(14);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationRemovedPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationRemovedPush_descriptor, new String[]{"ConversationReference"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationRemoveMessagePush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(15);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationRemoveMessagePush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationRemoveMessagePush_descriptor, new String[]{"ConversationReference", "Id"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationMessageHistoryDeletedPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(16);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationMessageHistoryDeletedPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationMessageHistoryDeletedPush_descriptor,
      new String[]{"ConversationReference", "SenderUuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_RefreshConversationsPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(17);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_RefreshConversationsPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_RefreshConversationsPush_descriptor, new String[0]
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
         "\n0lunarclient/websocket/conversation/v1/push.proto\u0012%lunarclient.websocket.conversation.v1\u001a\u001fgoogle/protobuf/timestamp.proto\u001a lunarclient/common/v1/uuid.proto\u001a2lunarclient/websocket/conversation/v1/common.proto\"\u008f\u0002\n\u0017ConversationMessagePush\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012T\n\u0007message\u0018\u0002 \u0001(\u000b2:.lunarclient.websocket.conversation.v1.ConversationMessageR\u0007message\u0012\u001d\n\u0007updated\u0018\u0003 \u0001(\bH\u0000R\u0007updated\u0088\u0001\u0001B\n\n\b_updated\"µ\u0002\n\u001dConversationPreSendActionPush\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012L\n\u0006action\u0018\u0002 \u0001(\u000e24.lunarclient.websocket.conversation.v1.PreSendActionR\u0006action\u0012Q\n\u0006sender\u0018\u0003 \u0001(\u000b29.lunarclient.websocket.conversation.v1.ConversationSenderR\u0006sender\"Ý\u0002\n\u001bConversationOwnerUpdatePush\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012@\n\u0007invoker\u0018\u0002 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0007invoker\u0012K\n\u0013previous_owner_uuid\u0018\u0003 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\u0011previousOwnerUuid\u0012:\n\nowner_uuid\u0018\u0004 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\townerUuid\"¼\u0002\n\u001fConversationAddParticipantsPush\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012@\n\u0007invoker\u0018\u0002 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0007invoker\u0012b\n\fparticipants\u0018\u0003 \u0003(\u000b2>.lunarclient.websocket.conversation.v1.ConversationParticipantR\fparticipants\"¤\u0002\n!ConversationRemoveParticipantPush\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012@\n\u0007invoker\u0018\u0002 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0007invoker\u0012H\n\u000bparticipant\u0018\u0003 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u000bparticipant\"ç\u0001\n\u001aConversationUpdateNamePush\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012@\n\u0007invoker\u0018\u0002 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0007invoker\u0012\u0012\n\u0004name\u0018\u0003 \u0001(\tR\u0004name\"ð\u0001\n\u001aConversationUpdateIconPush\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012@\n\u0007invoker\u0018\u0002 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0007invoker\u0012\u001b\n\timage_url\u0018\u0003 \u0001(\tR\bimageUrl\"\u0095\u0002\n ConversationAddPinnedMessagePush\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012@\n\u0007invoker\u0018\u0002 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0007invoker\u0012:\n\nmessage_id\u0018\u0003 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\tmessageId\"\u0098\u0002\n#ConversationRemovePinnedMessagePush\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012@\n\u0007invoker\u0018\u0002 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0007invoker\u0012:\n\nmessage_id\u0018\u0003 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\tmessageId\"æ\u0001\n\"ConversationUpdateInvitePolicyPush\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012K\n\u0006policy\u0018\u0002 \u0001(\u000e23.lunarclient.websocket.conversation.v1.InvitePolicyR\u0006policy\"â\u0001\n ConversationUpdateNamePolicyPush\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012I\n\u0006policy\u0018\u0002 \u0001(\u000e21.lunarclient.websocket.conversation.v1.NamePolicyR\u0006policy\"â\u0001\n ConversationUpdateIconPolicyPush\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012I\n\u0006policy\u0018\u0002 \u0001(\u000e21.lunarclient.websocket.conversation.v1.IconPolicyR\u0006policy\"ö\u0001\n*ConversationUpdateMessagePinningPolicyPush\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012S\n\u0006policy\u0018\u0002 \u0001(\u000e2;.lunarclient.websocket.conversation.v1.MessagePinningPolicyR\u0006policy\"ç\u0001\n\u0015ConversationAddedPush\u0012W\n\fconversation\u0018\u0001 \u0001(\u000b23.lunarclient.websocket.conversation.v1.ConversationR\fconversation\u0012>\n\u0006sender\u0018\u0002 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0006sender\u00125\n\badded_at\u0018\u0003 \u0001(\u000b2\u001a.google.protobuf.TimestampR\u0007addedAt\"\u008e\u0001\n\u0017ConversationRemovedPush\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\"Á\u0001\n\u001dConversationRemoveMessagePush\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012+\n\u0002id\u0018\u0002 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\u0002id\"ï\u0001\n%ConversationMessageHistoryDeletedPush\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012A\n\u000bsender_uuid\u0018\u0002 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidH\u0000R\nsenderUuid\u0088\u0001\u0001B\u000e\n\f_sender_uuid\"\u001a\n\u0018RefreshConversationsPushBí\u0001\n)com.lunarclient.websocket.conversation.v1B\tPushProtoP\u0001¢\u0002\u0003LWCª\u0002%Lunarclient.Websocket.Conversation.V1Ê\u0002%Lunarclient\\Websocket\\Conversation\\V1â\u00021Lunarclient\\Websocket\\Conversation\\V1\\GPBMetadataê\u0002(Lunarclient::Websocket::Conversation::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{TimestampProto.getDescriptor(), UuidProto.getDescriptor(), CommonProto.getDescriptor()}
      );
      TimestampProto.getDescriptor();
      UuidProto.getDescriptor();
      CommonProto.getDescriptor();
   }
}
