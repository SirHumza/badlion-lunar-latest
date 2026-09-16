package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.TimestampProto;
import com.lunarclient.common.v1.UuidProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_LoginRequest_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_LoginRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_LoginRequest_descriptor, new String[]{"UsingSatellite"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_LoginResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_LoginResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_LoginResponse_descriptor,
      new String[]{"Conversations", "ParticipantLimit", "StickerPacks", "EmojiCategories", "TotalConversations", "MaxMessageLength", "PinnedConversationLimit"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_SendConversationMessageRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_SendConversationMessageRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_SendConversationMessageRequest_descriptor, new String[]{"ConversationReference", "MessageContents"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_SendConversationMessageResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_SendConversationMessageResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_SendConversationMessageResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_PreSendActionRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_PreSendActionRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_PreSendActionRequest_descriptor, new String[]{"ConversationReference", "Action"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_PreSendActionResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_PreSendActionResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_PreSendActionResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_LoadConversationRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_LoadConversationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_LoadConversationRequest_descriptor,
      new String[]{"ConversationReference", "BeforeMessageId", "AfterMessageId", "AnchorMessageId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_LoadConversationResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_LoadConversationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_LoadConversationResponse_descriptor, new String[]{"Messages"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_CreateConversationRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(8);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_CreateConversationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_CreateConversationRequest_descriptor, new String[]{"Type", "ParticipantUuids"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_CreateConversationResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(9);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_CreateConversationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_CreateConversationResponse_descriptor, new String[]{"Status", "Conversation"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_DeleteConversationRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(10);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_DeleteConversationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_DeleteConversationRequest_descriptor, new String[]{"ConversationReference"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_DeleteConversationResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(11);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_DeleteConversationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_DeleteConversationResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(12);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageRequest_descriptor, new String[]{"MessageId", "ConversationReference"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(13);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageHistoryRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(14);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageHistoryRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageHistoryRequest_descriptor, new String[]{"ConversationReference"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageHistoryResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(15);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageHistoryResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageHistoryResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_UpdateConversationOwnerRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(16);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_UpdateConversationOwnerRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_UpdateConversationOwnerRequest_descriptor, new String[]{"ConversationReference", "TargetUuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_UpdateConversationOwnerResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(17);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_UpdateConversationOwnerResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_UpdateConversationOwnerResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_AddConversationParticipantsRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(18);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_AddConversationParticipantsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_AddConversationParticipantsRequest_descriptor, new String[]{"ConversationReference", "Targets"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_AddConversationParticipantsResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(19);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_AddConversationParticipantsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_AddConversationParticipantsResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_RemoveConversationParticipantRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(20);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_RemoveConversationParticipantRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_RemoveConversationParticipantRequest_descriptor, new String[]{"ConversationReference", "Target"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_RemoveConversationParticipantResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(21);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_RemoveConversationParticipantResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_RemoveConversationParticipantResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_UpdateConversationNameRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(22);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_UpdateConversationNameRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_UpdateConversationNameRequest_descriptor, new String[]{"ConversationReference", "Name"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_UpdateConversationNameResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(23);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_UpdateConversationNameResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_UpdateConversationNameResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_UpdateConversationIconRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(24);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_UpdateConversationIconRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_UpdateConversationIconRequest_descriptor, new String[]{"ConversationReference", "Image"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_UpdateConversationIconResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(25);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_UpdateConversationIconResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_UpdateConversationIconResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_LoadPinnedMessagesRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(26);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_LoadPinnedMessagesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_LoadPinnedMessagesRequest_descriptor, new String[]{"ConversationReference"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_LoadPinnedMessagesResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(27);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_LoadPinnedMessagesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_LoadPinnedMessagesResponse_descriptor, new String[]{"Status", "Messages"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_AddPinnedMessageRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(28);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_AddPinnedMessageRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_AddPinnedMessageRequest_descriptor, new String[]{"ConversationReference", "MessageId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_AddPinnedMessageResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(29);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_AddPinnedMessageResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_AddPinnedMessageResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_RemovePinnedMessageRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(30);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_RemovePinnedMessageRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_RemovePinnedMessageRequest_descriptor, new String[]{"ConversationReference", "MessageId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_RemovePinnedMessageResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(31);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_RemovePinnedMessageResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_RemovePinnedMessageResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_SetInvitePolicyRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(32);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_SetInvitePolicyRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_SetInvitePolicyRequest_descriptor, new String[]{"ConversationReference", "Policy"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_SetInvitePolicyResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(33);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_SetInvitePolicyResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_SetInvitePolicyResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_SetNamePolicyRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(34);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_SetNamePolicyRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_SetNamePolicyRequest_descriptor, new String[]{"ConversationReference", "Policy"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_SetNamePolicyResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(35);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_SetNamePolicyResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_SetNamePolicyResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_SetIconPolicyRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(36);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_SetIconPolicyRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_SetIconPolicyRequest_descriptor, new String[]{"ConversationReference", "Policy"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_SetIconPolicyResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(37);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_SetIconPolicyResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_SetIconPolicyResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_SetMessagePinningPolicyRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(38);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_SetMessagePinningPolicyRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_SetMessagePinningPolicyRequest_descriptor, new String[]{"ConversationReference", "Policy"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_SetMessagePinningPolicyResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(39);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_SetMessagePinningPolicyResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_SetMessagePinningPolicyResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_SetConversationPinnedRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(40);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_SetConversationPinnedRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_SetConversationPinnedRequest_descriptor, new String[]{"ConversationReference", "Pinned"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_SetConversationPinnedResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(41);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_SetConversationPinnedResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_SetConversationPinnedResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_GetUploadUrlsRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(42);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_GetUploadUrlsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_GetUploadUrlsRequest_descriptor, new String[]{"ConversationReference", "Usage", "Items"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_GetUploadUrlsResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(43);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_GetUploadUrlsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_GetUploadUrlsResponse_descriptor, new String[]{"Status", "Uploads"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_UnfocusConversationsRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(44);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_UnfocusConversationsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_UnfocusConversationsRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_UnfocusConversationsResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(45);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_UnfocusConversationsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_UnfocusConversationsResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_GetConversationsRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(46);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_GetConversationsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_GetConversationsRequest_descriptor, new String[]{"Limit", "Cursor", "ConversationReference"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_GetConversationsResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(47);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_GetConversationsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_GetConversationsResponse_descriptor, new String[]{"Status", "Conversations", "TotalConversations"}
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
         "\n3lunarclient/websocket/conversation/v1/service.proto\u0012%lunarclient.websocket.conversation.v1\u001a\u001fgoogle/protobuf/timestamp.proto\u001a2lunarclient/websocket/conversation/v1/common.proto\u001a.lunarclient/websocket/protocol/v1/common.proto\u001a lunarclient/common/v1/uuid.proto\"P\n\fLoginRequest\u0012,\n\u000fusing_satellite\u0018\u0001 \u0001(\bH\u0000R\u000eusingSatellite\u0088\u0001\u0001B\u0012\n\u0010_using_satellite\"ú\u0003\n\rLoginResponse\u0012]\n\rconversations\u0018\u0001 \u0003(\u000b27.lunarclient.websocket.conversation.v1.ConversationStubR\rconversations\u0012+\n\u0011participant_limit\u0018\u0002 \u0001(\u0005R\u0010participantLimit\u0012\\\n\rsticker_packs\u0018\u0003 \u0003(\u000b27.lunarclient.websocket.conversation.v1.LunarStickerPackR\fstickerPacks\u0012d\n\u0010emoji_categories\u0018\u0004 \u0003(\u000b29.lunarclient.websocket.conversation.v1.LunarEmojiCategoryR\u000femojiCategories\u0012/\n\u0013total_conversations\u0018\u0005 \u0001(\u0005R\u0012totalConversations\u0012,\n\u0012max_message_length\u0018\u0006 \u0001(\u0005R\u0010maxMessageLength\u0012:\n\u0019pinned_conversation_limit\u0018\u0007 \u0001(\u0005R\u0017pinnedConversationLimit\"\u0084\u0002\n\u001eSendConversationMessageRequest\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012m\n\u0010message_contents\u0018\u0002 \u0001(\u000b2B.lunarclient.websocket.conversation.v1.ConversationMessageContentsR\u000fmessageContents\"\u0090\u0002\n\u001fSendConversationMessageResponse\u0012e\n\u0006status\u0018\u0001 \u0001(\u000e2M.lunarclient.websocket.conversation.v1.SendConversationMessageResponse.StatusR\u0006status\"\u0085\u0001\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001f\n\u001bSTATUS_UNKNOWN_CONVERSATION\u0010\u0002\u0012\u0019\n\u0015STATUS_INNAPPROPRIATE\u0010\u0003\u0012\u0018\n\u0014STATUS_EXCEEDS_LIMIT\u0010\u0004\"Ù\u0001\n\u0014PreSendActionRequest\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012L\n\u0006action\u0018\u0002 \u0001(\u000e24.lunarclient.websocket.conversation.v1.PreSendActionR\u0006action\"Æ\u0001\n\u0015PreSendActionResponse\u0012[\n\u0006status\u0018\u0001 \u0001(\u000e2C.lunarclient.websocket.conversation.v1.PreSendActionResponse.StatusR\u0006status\"P\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001f\n\u001bSTATUS_UNKNOWN_CONVERSATION\u0010\u0002\"·\u0003\n\u0017LoadConversationRequest\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012L\n\u0011before_message_id\u0018\u0002 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidH\u0000R\u000fbeforeMessageId\u0088\u0001\u0001\u0012J\n\u0010after_message_id\u0018\u0003 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidH\u0001R\u000eafterMessageId\u0088\u0001\u0001\u0012L\n\u0011anchor_message_id\u0018\u0004 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidH\u0002R\u000fanchorMessageId\u0088\u0001\u0001B\u0014\n\u0012_before_message_idB\u0013\n\u0011_after_message_idB\u0014\n\u0012_anchor_message_id\"r\n\u0018LoadConversationResponse\u0012V\n\bmessages\u0018\u0001 \u0003(\u000b2:.lunarclient.websocket.conversation.v1.ConversationMessageR\bmessages\"²\u0001\n\u0019CreateConversationRequest\u0012K\n\u0004type\u0018\u0001 \u0001(\u000e27.lunarclient.websocket.conversation.v1.ConversationTypeR\u0004type\u0012H\n\u0011participant_uuids\u0018\u0002 \u0003(\u000b2\u001b.lunarclient.common.v1.UuidR\u0010participantUuids\"ì\u0002\n\u001aCreateConversationResponse\u0012`\n\u0006status\u0018\u0001 \u0001(\u000e2H.lunarclient.websocket.conversation.v1.CreateConversationResponse.StatusR\u0006status\u0012W\n\fconversation\u0018\u0002 \u0001(\u000b23.lunarclient.websocket.conversation.v1.ConversationR\fconversation\"\u0092\u0001\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u0018\n\u0014STATUS_LIMIT_REACHED\u0010\u0002\u0012\u001f\n\u001bSTATUS_INVALID_PARTICIPANTS\u0010\u0003\u0012&\n\"STATUS_CONVERSATION_ALREADY_EXISTS\u0010\u0004\"\u0090\u0001\n\u0019DeleteConversationRequest\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\"\u0082\u0002\n\u001aDeleteConversationResponse\u0012`\n\u0006status\u0018\u0001 \u0001(\u000e2H.lunarclient.websocket.conversation.v1.DeleteConversationResponse.StatusR\u0006status\"\u0081\u0001\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001e\n\u001aSTATUS_NOT_IN_CONVERSATION\u0010\u0002\u0012\u0014\n\u0010STATUS_NOT_OWNER\u0010\u0003\u0012\u001a\n\u0016STATUS_ALREADY_DELETED\u0010\u0004\"Ó\u0001\n DeleteConversationMessageRequest\u0012:\n\nmessage_id\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\tmessageId\u0012s\n\u0016conversation_reference\u0018\u0002 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\"÷\u0001\n!DeleteConversationMessageResponse\u0012g\n\u0006status\u0018\u0001 \u0001(\u000e2O.lunarclient.websocket.conversation.v1.DeleteConversationMessageResponse.StatusR\u0006status\"i\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001c\n\u0018STATUS_NOT_USERS_MESSAGE\u0010\u0002\u0012\u001a\n\u0016STATUS_ALREADY_DELETED\u0010\u0003\"\u009e\u0001\n'DeleteConversationMessageHistoryRequest\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\"\u008c\u0002\n(DeleteConversationMessageHistoryResponse\u0012n\n\u0006status\u0018\u0001 \u0001(\u000e2V.lunarclient.websocket.conversation.v1.DeleteConversationMessageHistoryResponse.StatusR\u0006status\"p\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001f\n\u001bSTATUS_UNKNOWN_CONVERSATION\u0010\u0002\u0012\u001e\n\u001aSTATUS_NOT_IN_CONVERSATION\u0010\u0003\"Ó\u0001\n\u001eUpdateConversationOwnerRequest\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012<\n\u000btarget_uuid\u0018\u0002 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\ntargetUuid\"®\u0002\n\u001fUpdateConversationOwnerResponse\u0012e\n\u0006status\u0018\u0001 \u0001(\u000e2M.lunarclient.websocket.conversation.v1.UpdateConversationOwnerResponse.StatusR\u0006status\"£\u0001\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001e\n\u001aSTATUS_NOT_IN_CONVERSATION\u0010\u0002\u0012\u0014\n\u0010STATUS_NOT_OWNER\u0010\u0003\u0012\u001f\n\u001bSTATUS_TARGET_ALREADY_OWNER\u0010\u0004\u0012\u001b\n\u0017STATUS_TARGET_NOT_FOUND\u0010\u0005\"Û\u0001\n\"AddConversationParticipantsRequest\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012@\n\u0007targets\u0018\u0002 \u0003(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0007targets\"\u0086\u0003\n#AddConversationParticipantsResponse\u0012i\n\u0006status\u0018\u0001 \u0001(\u000e2Q.lunarclient.websocket.conversation.v1.AddConversationParticipantsResponse.StatusR\u0006status\"ó\u0001\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001e\n\u001aSTATUS_NOT_IN_CONVERSATION\u0010\u0002\u0012)\n%STATUS_TARGET_ALREADY_IN_CONVERSATION\u0010\u0003\u0012\u001b\n\u0017STATUS_TARGET_NOT_FOUND\u0010\u0004\u0012\"\n\u001eSTATUS_TARGET_INVITES_DISABLED\u0010\u0005\u0012\u001c\n\u0018STATUS_TARGET_NOT_FRIEND\u0010\u0006\u0012\u0018\n\u0014STATUS_LIMIT_REACHED\u0010\u0007\"Û\u0001\n$RemoveConversationParticipantRequest\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012>\n\u0006target\u0018\u0002 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0006target\"Ü\u0002\n%RemoveConversationParticipantResponse\u0012k\n\u0006status\u0018\u0001 \u0001(\u000e2S.lunarclient.websocket.conversation.v1.RemoveConversationParticipantResponse.StatusR\u0006status\"Å\u0001\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001e\n\u001aSTATUS_NOT_IN_CONVERSATION\u0010\u0002\u0012%\n!STATUS_TARGET_NOT_IN_CONVERSATION\u0010\u0003\u0012\u001b\n\u0017STATUS_TARGET_NOT_FOUND\u0010\u0004\u0012\u001a\n\u0016STATUS_TARGET_IS_OWNER\u0010\u0005\u0012\u0014\n\u0010STATUS_NOT_OWNER\u0010\u0006\"¨\u0001\n\u001dUpdateConversationNameRequest\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012\u0012\n\u0004name\u0018\u0002 \u0001(\tR\u0004name\"®\u0002\n\u001eUpdateConversationNameResponse\u0012d\n\u0006status\u0018\u0001 \u0001(\u000e2L.lunarclient.websocket.conversation.v1.UpdateConversationNameResponse.StatusR\u0006status\"¥\u0001\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001e\n\u001aSTATUS_NOT_IN_CONVERSATION\u0010\u0002\u0012\u0018\n\u0014STATUS_INVALID_INPUT\u0010\u0003\u0012\u001f\n\u001bSTATUS_NAME_POLICY_DISABLED\u0010\u0004\u0012\u0019\n\u0015STATUS_INNAPPROPRIATE\u0010\u0005\"ä\u0001\n\u001dUpdateConversationIconRequest\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012N\n\u0005image\u0018\u0002 \u0001(\u000b28.lunarclient.websocket.conversation.v1.ConversationImageR\u0005image\"\u0094\u0002\n\u001eUpdateConversationIconResponse\u0012d\n\u0006status\u0018\u0001 \u0001(\u000e2L.lunarclient.websocket.conversation.v1.UpdateConversationIconResponse.StatusR\u0006status\"\u008b\u0001\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001e\n\u001aSTATUS_NOT_IN_CONVERSATION\u0010\u0002\u0012\u001f\n\u001bSTATUS_ICON_POLICY_DISABLED\u0010\u0003\u0012\u0019\n\u0015STATUS_INNAPPROPRIATE\u0010\u0004\"\u0090\u0001\n\u0019LoadPinnedMessagesRequest\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\"§\u0002\n\u001aLoadPinnedMessagesResponse\u0012`\n\u0006status\u0018\u0001 \u0001(\u000e2H.lunarclient.websocket.conversation.v1.LoadPinnedMessagesResponse.StatusR\u0006status\u0012V\n\bmessages\u0018\u0002 \u0003(\u000b2:.lunarclient.websocket.conversation.v1.ConversationMessageR\bmessages\"O\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001e\n\u001aSTATUS_NOT_IN_CONVERSATION\u0010\u0002\"Ê\u0001\n\u0017AddPinnedMessageRequest\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012:\n\nmessage_id\u0018\u0002 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\tmessageId\"\u0096\u0002\n\u0018AddPinnedMessageResponse\u0012^\n\u0006status\u0018\u0001 \u0001(\u000e2F.lunarclient.websocket.conversation.v1.AddPinnedMessageResponse.StatusR\u0006status\"\u0099\u0001\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001e\n\u001aSTATUS_NOT_IN_CONVERSATION\u0010\u0002\u0012*\n&STATUS_MESSAGE_PINNING_POLICY_DISABLED\u0010\u0003\u0012\u001c\n\u0018STATUS_MESSAGE_NOT_FOUND\u0010\u0004\"Í\u0001\n\u001aRemovePinnedMessageRequest\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012:\n\nmessage_id\u0018\u0002 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\tmessageId\"\u009c\u0002\n\u001bRemovePinnedMessageResponse\u0012a\n\u0006status\u0018\u0001 \u0001(\u000e2I.lunarclient.websocket.conversation.v1.RemovePinnedMessageResponse.StatusR\u0006status\"\u0099\u0001\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001e\n\u001aSTATUS_NOT_IN_CONVERSATION\u0010\u0002\u0012*\n&STATUS_MESSAGE_PINNING_POLICY_DISABLED\u0010\u0003\u0012\u001c\n\u0018STATUS_MESSAGE_NOT_FOUND\u0010\u0004\"Ú\u0001\n\u0016SetInvitePolicyRequest\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012K\n\u0006policy\u0018\u0002 \u0001(\u000e23.lunarclient.websocket.conversation.v1.InvitePolicyR\u0006policy\"ß\u0001\n\u0017SetInvitePolicyResponse\u0012]\n\u0006status\u0018\u0001 \u0001(\u000e2E.lunarclient.websocket.conversation.v1.SetInvitePolicyResponse.StatusR\u0006status\"e\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001e\n\u001aSTATUS_NOT_IN_CONVERSATION\u0010\u0002\u0012\u0014\n\u0010STATUS_NOT_OWNER\u0010\u0003\"Ö\u0001\n\u0014SetNamePolicyRequest\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012I\n\u0006policy\u0018\u0002 \u0001(\u000e21.lunarclient.websocket.conversation.v1.NamePolicyR\u0006policy\"Û\u0001\n\u0015SetNamePolicyResponse\u0012[\n\u0006status\u0018\u0001 \u0001(\u000e2C.lunarclient.websocket.conversation.v1.SetNamePolicyResponse.StatusR\u0006status\"e\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001e\n\u001aSTATUS_NOT_IN_CONVERSATION\u0010\u0002\u0012\u0014\n\u0010STATUS_NOT_OWNER\u0010\u0003\"Ö\u0001\n\u0014SetIconPolicyRequest\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012I\n\u0006policy\u0018\u0002 \u0001(\u000e21.lunarclient.websocket.conversation.v1.IconPolicyR\u0006policy\"Û\u0001\n\u0015SetIconPolicyResponse\u0012[\n\u0006status\u0018\u0001 \u0001(\u000e2C.lunarclient.websocket.conversation.v1.SetIconPolicyResponse.StatusR\u0006status\"e\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001e\n\u001aSTATUS_NOT_IN_CONVERSATION\u0010\u0002\u0012\u0014\n\u0010STATUS_NOT_OWNER\u0010\u0003\"ê\u0001\n\u001eSetMessagePinningPolicyRequest\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012S\n\u0006policy\u0018\u0002 \u0001(\u000e2;.lunarclient.websocket.conversation.v1.MessagePinningPolicyR\u0006policy\"ï\u0001\n\u001fSetMessagePinningPolicyResponse\u0012e\n\u0006status\u0018\u0001 \u0001(\u000e2M.lunarclient.websocket.conversation.v1.SetMessagePinningPolicyResponse.StatusR\u0006status\"e\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001e\n\u001aSTATUS_NOT_IN_CONVERSATION\u0010\u0002\u0012\u0014\n\u0010STATUS_NOT_OWNER\u0010\u0003\"«\u0001\n\u001cSetConversationPinnedRequest\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012\u0016\n\u0006pinned\u0018\u0002 \u0001(\bR\u0006pinned\"ï\u0001\n\u001dSetConversationPinnedResponse\u0012c\n\u0006status\u0018\u0001 \u0001(\u000e2K.lunarclient.websocket.conversation.v1.SetConversationPinnedResponse.StatusR\u0006status\"i\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001e\n\u001aSTATUS_NOT_IN_CONVERSATION\u0010\u0002\u0012\u0018\n\u0014STATUS_LIMIT_REACHED\u0010\u0003\"¥\u0002\n\u0014GetUploadUrlsRequest\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012H\n\u0005usage\u0018\u0002 \u0001(\u000e22.lunarclient.websocket.conversation.v1.UploadUsageR\u0005usage\u0012N\n\u0005items\u0018\u0003 \u0003(\u000b28.lunarclient.websocket.conversation.v1.UploadRequestItemR\u0005items\"¸\u0002\n\u0015GetUploadUrlsResponse\u0012[\n\u0006status\u0018\u0001 \u0001(\u000e2C.lunarclient.websocket.conversation.v1.GetUploadUrlsResponse.StatusR\u0006status\u0012P\n\u0007uploads\u0018\u0002 \u0003(\u000b26.lunarclient.websocket.conversation.v1.PresignedUploadR\u0007uploads\"p\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001e\n\u001aSTATUS_NOT_IN_CONVERSATION\u0010\u0002\u0012\u001f\n\u001bSTATUS_ICON_POLICY_DISABLED\u0010\u0003\"\u001d\n\u001bUnfocusConversationsRequest\"\u001e\n\u001cUnfocusConversationsResponse\"\u0097\u0002\n\u0017GetConversationsRequest\u0012\u0019\n\u0005limit\u0018\u0001 \u0001(\u0005H\u0000R\u0005limit\u0088\u0001\u0001\u00127\n\u0006cursor\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.TimestampH\u0001R\u0006cursor\u0088\u0001\u0001\u0012x\n\u0016conversation_reference\u0018\u0003 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceH\u0002R\u0015conversationReference\u0088\u0001\u0001B\b\n\u0006_limitB\t\n\u0007_cursorB\u0019\n\u0017_conversation_reference\"ú\u0002\n\u0018GetConversationsResponse\u0012^\n\u0006status\u0018\u0001 \u0001(\u000e2F.lunarclient.websocket.conversation.v1.GetConversationsResponse.StatusR\u0006status\u0012Y\n\rconversations\u0018\u0002 \u0003(\u000b23.lunarclient.websocket.conversation.v1.ConversationR\rconversations\u0012/\n\u0013total_conversations\u0018\u0003 \u0001(\u0005R\u0012totalConversations\"r\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012!\n\u001dSTATUS_CONVERSATION_NOT_FOUND\u0010\u0002\u0012\u001e\n\u001aSTATUS_NOT_IN_CONVERSATION\u0010\u00032\u0098\u001f\n\u0013ConversationService\u0012x\n\u0005Login\u00123.lunarclient.websocket.conversation.v1.LoginRequest\u001a4.lunarclient.websocket.conversation.v1.LoginResponse\"\u0004\u0088µ\u0018\u0003\u0012®\u0001\n\u0017SendConversationMessage\u0012E.lunarclient.websocket.conversation.v1.SendConversationMessageRequest\u001aF.lunarclient.websocket.conversation.v1.SendConversationMessageResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0090\u0001\n\rPreSendAction\u0012;.lunarclient.websocket.conversation.v1.PreSendActionRequest\u001a<.lunarclient.websocket.conversation.v1.PreSendActionResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0099\u0001\n\u0010LoadConversation\u0012>.lunarclient.websocket.conversation.v1.LoadConversationRequest\u001a?.lunarclient.websocket.conversation.v1.LoadConversationResponse\"\u0004\u0088µ\u0018\u0003\u0012\u009f\u0001\n\u0012CreateConversation\u0012@.lunarclient.websocket.conversation.v1.CreateConversationRequest\u001aA.lunarclient.websocket.conversation.v1.CreateConversationResponse\"\u0004\u0088µ\u0018\u0003\u0012\u009f\u0001\n\u0012DeleteConversation\u0012@.lunarclient.websocket.conversation.v1.DeleteConversationRequest\u001aA.lunarclient.websocket.conversation.v1.DeleteConversationResponse\"\u0004\u0088µ\u0018\u0003\u0012´\u0001\n\u0019DeleteConversationMessage\u0012G.lunarclient.websocket.conversation.v1.DeleteConversationMessageRequest\u001aH.lunarclient.websocket.conversation.v1.DeleteConversationMessageResponse\"\u0004\u0088µ\u0018\u0003\u0012É\u0001\n DeleteConversationMessageHistory\u0012N.lunarclient.websocket.conversation.v1.DeleteConversationMessageHistoryRequest\u001aO.lunarclient.websocket.conversation.v1.DeleteConversationMessageHistoryResponse\"\u0004\u0088µ\u0018\u0003\u0012®\u0001\n\u0017UpdateConversationOwner\u0012E.lunarclient.websocket.conversation.v1.UpdateConversationOwnerRequest\u001aF.lunarclient.websocket.conversation.v1.UpdateConversationOwnerResponse\"\u0004\u0088µ\u0018\u0003\u0012º\u0001\n\u001bAddConversationParticipants\u0012I.lunarclient.websocket.conversation.v1.AddConversationParticipantsRequest\u001aJ.lunarclient.websocket.conversation.v1.AddConversationParticipantsResponse\"\u0004\u0088µ\u0018\u0003\u0012À\u0001\n\u001dRemoveConversationParticipant\u0012K.lunarclient.websocket.conversation.v1.RemoveConversationParticipantRequest\u001aL.lunarclient.websocket.conversation.v1.RemoveConversationParticipantResponse\"\u0004\u0088µ\u0018\u0003\u0012«\u0001\n\u0016UpdateConversationName\u0012D.lunarclient.websocket.conversation.v1.UpdateConversationNameRequest\u001aE.lunarclient.websocket.conversation.v1.UpdateConversationNameResponse\"\u0004\u0088µ\u0018\u0003\u0012«\u0001\n\u0016UpdateConversationIcon\u0012D.lunarclient.websocket.conversation.v1.UpdateConversationIconRequest\u001aE.lunarclient.websocket.conversation.v1.UpdateConversationIconResponse\"\u0004\u0088µ\u0018\u0003\u0012\u009f\u0001\n\u0012LoadPinnedMessages\u0012@.lunarclient.websocket.conversation.v1.LoadPinnedMessagesRequest\u001aA.lunarclient.websocket.conversation.v1.LoadPinnedMessagesResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0099\u0001\n\u0010AddPinnedMessage\u0012>.lunarclient.websocket.conversation.v1.AddPinnedMessageRequest\u001a?.lunarclient.websocket.conversation.v1.AddPinnedMessageResponse\"\u0004\u0088µ\u0018\u0003\u0012¢\u0001\n\u0013RemovePinnedMessage\u0012A.lunarclient.websocket.conversation.v1.RemovePinnedMessageRequest\u001aB.lunarclient.websocket.conversation.v1.RemovePinnedMessageResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0096\u0001\n\u000fSetInvitePolicy\u0012=.lunarclient.websocket.conversation.v1.SetInvitePolicyRequest\u001a>.lunarclient.websocket.conversation.v1.SetInvitePolicyResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0090\u0001\n\rSetNamePolicy\u0012;.lunarclient.websocket.conversation.v1.SetNamePolicyRequest\u001a<.lunarclient.websocket.conversation.v1.SetNamePolicyResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0090\u0001\n\rSetIconPolicy\u0012;.lunarclient.websocket.conversation.v1.SetIconPolicyRequest\u001a<.lunarclient.websocket.conversation.v1.SetIconPolicyResponse\"\u0004\u0088µ\u0018\u0003\u0012®\u0001\n\u0017SetMessagePinningPolicy\u0012E.lunarclient.websocket.conversation.v1.SetMessagePinningPolicyRequest\u001aF.lunarclient.websocket.conversation.v1.SetMessagePinningPolicyResponse\"\u0004\u0088µ\u0018\u0003\u0012¨\u0001\n\u0015SetConversationPinned\u0012C.lunarclient.websocket.conversation.v1.SetConversationPinnedRequest\u001aD.lunarclient.websocket.conversation.v1.SetConversationPinnedResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0090\u0001\n\rGetUploadUrls\u0012;.lunarclient.websocket.conversation.v1.GetUploadUrlsRequest\u001a<.lunarclient.websocket.conversation.v1.GetUploadUrlsResponse\"\u0004\u0088µ\u0018\u0003\u0012¥\u0001\n\u0014UnfocusConversations\u0012B.lunarclient.websocket.conversation.v1.UnfocusConversationsRequest\u001aC.lunarclient.websocket.conversation.v1.UnfocusConversationsResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0099\u0001\n\u0010GetConversations\u0012>.lunarclient.websocket.conversation.v1.GetConversationsRequest\u001a?.lunarclient.websocket.conversation.v1.GetConversationsResponse\"\u0004\u0088µ\u0018\u0003Bó\u0001\n)com.lunarclient.websocket.conversation.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWCª\u0002%Lunarclient.Websocket.Conversation.V",
         "1Ê\u0002%Lunarclient\\Websocket\\Conversation\\V1â\u00021Lunarclient\\Websocket\\Conversation\\V1\\GPBMetadataê\u0002(Lunarclient::Websocket::Conversation::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{
            TimestampProto.getDescriptor(),
            CommonProto.getDescriptor(),
            com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor(),
            UuidProto.getDescriptor()
         }
      );
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(com.lunarclient.websocket.protocol.v1.CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      TimestampProto.getDescriptor();
      CommonProto.getDescriptor();
      com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor();
      UuidProto.getDescriptor();
   }
}
