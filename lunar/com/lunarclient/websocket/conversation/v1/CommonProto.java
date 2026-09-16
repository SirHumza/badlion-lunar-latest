package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.TimestampProto;
import com.lunarclient.common.v1.ColorProto;
import com.lunarclient.common.v1.UuidProto;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_Conversation_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_Conversation_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_Conversation_descriptor,
      new String[]{
         "ConversationReference",
         "Participants",
         "Type",
         "LastActivityTime",
         "Name",
         "ConversationImageUrl",
         "OwnerUuid",
         "UserState",
         "ParticipantLimit",
         "InvitePolicy",
         "NamePolicy",
         "IconPolicy",
         "MessagePinningPolicy",
         "LatestMessage"
      }
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_UserConversationState_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_UserConversationState_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_UserConversationState_descriptor, new String[]{"LastSeenTime", "UnreadCount", "Pinned"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationParticipant_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationParticipant_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationParticipant_descriptor,
      new String[]{"Player", "LogoColor", "PlusColor", "RankName", "IsRadioPremium", "BadgeId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationReference_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationReference_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationReference_descriptor, new String[]{"FriendUuid", "ConversationReference", "Target"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationSender_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationSender_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationSender_descriptor, new String[]{"Player", "Sender"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationMessageContents_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationMessageContents_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationMessageContents_descriptor,
      new String[]{"PlainText", "Sticker", "System", "Images", "Embed", "Contents"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationMessage_descriptor,
      new String[]{"Id", "SentAt", "Sender", "Contents", "Kind", "Pinned"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_SystemMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_SystemMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_SystemMessage_descriptor,
      new String[]{"Actor", "Pinned", "Invite", "Leave", "NameChange", "IconChange", "Event"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_SystemPinnedMessageEvent_descriptor = getDescriptor()
      .getMessageTypes()
      .get(8);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_SystemPinnedMessageEvent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_SystemPinnedMessageEvent_descriptor, new String[]{"PinnedMessageId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_SystemInviteEvent_descriptor = getDescriptor()
      .getMessageTypes()
      .get(9);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_SystemInviteEvent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_SystemInviteEvent_descriptor, new String[]{"Invitees"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_SystemLeaveEvent_descriptor = getDescriptor()
      .getMessageTypes()
      .get(10);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_SystemLeaveEvent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_SystemLeaveEvent_descriptor, new String[]{"Player"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_SystemNameChangeEvent_descriptor = getDescriptor()
      .getMessageTypes()
      .get(11);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_SystemNameChangeEvent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_SystemNameChangeEvent_descriptor, new String[]{"NewName"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_SystemIconChangeEvent_descriptor = getDescriptor()
      .getMessageTypes()
      .get(12);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_SystemIconChangeEvent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_SystemIconChangeEvent_descriptor, new String[]{"NewIconUrl"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationMessageEmbed_descriptor = getDescriptor()
      .getMessageTypes()
      .get(13);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationMessageEmbed_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationMessageEmbed_descriptor, new String[]{"Image", "LinkPreview", "CapturedAt", "Embed"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ImageEmbed_descriptor = getDescriptor().getMessageTypes().get(14);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ImageEmbed_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ImageEmbed_descriptor,
      new String[]{"RawUrl", "NormalizedUrl", "ProxiedUrl", "MimeType", "Width", "Height", "ContentLength"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_LinkPreviewEmbed_descriptor = getDescriptor()
      .getMessageTypes()
      .get(15);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_LinkPreviewEmbed_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_LinkPreviewEmbed_descriptor,
      new String[]{"RawUrl", "NormalizedUrl", "ProxiedUrl", "SiteName", "Title", "Description", "Image", "OgType", "ContentType"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_OgImage_descriptor = getDescriptor().getMessageTypes().get(16);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_OgImage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_OgImage_descriptor, new String[]{"Url", "Width", "Height", "MimeType"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationImage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(17);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationImage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationImage_descriptor, new String[]{"Url"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_LunarSticker_descriptor = getDescriptor()
      .getMessageTypes()
      .get(18);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_LunarSticker_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_LunarSticker_descriptor, new String[]{"Id", "Url", "Name"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_LunarStickerPack_descriptor = getDescriptor()
      .getMessageTypes()
      .get(19);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_LunarStickerPack_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_LunarStickerPack_descriptor, new String[]{"Id", "Name", "IconUrl", "Stickers"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_LunarEmoji_descriptor = getDescriptor().getMessageTypes().get(20);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_LunarEmoji_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_LunarEmoji_descriptor, new String[]{"Id", "Url", "Name"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_LunarEmojiCategory_descriptor = getDescriptor()
      .getMessageTypes()
      .get(21);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_LunarEmojiCategory_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_LunarEmojiCategory_descriptor, new String[]{"Id", "Name", "IconUrl", "Emojis"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_UploadRequestItem_descriptor = getDescriptor()
      .getMessageTypes()
      .get(22);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_UploadRequestItem_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_UploadRequestItem_descriptor, new String[]{"ContentType", "ExpectedSizeBytes"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_PresignedUpload_descriptor = getDescriptor()
      .getMessageTypes()
      .get(23);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_PresignedUpload_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_PresignedUpload_descriptor,
      new String[]{"UploadUrl", "RequiredHeaders", "MaxBytes", "AcceptedContentType", "ExpiresAt", "FinishedUrl"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_PresignedUpload_RequiredHeadersEntry_descriptor = internal_static_lunarclient_websocket_conversation_v1_PresignedUpload_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_PresignedUpload_RequiredHeadersEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_PresignedUpload_RequiredHeadersEntry_descriptor, new String[]{"Key", "Value"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_conversation_v1_ConversationStub_descriptor = getDescriptor()
      .getMessageTypes()
      .get(24);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_conversation_v1_ConversationStub_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_conversation_v1_ConversationStub_descriptor, new String[]{"ConversationReference", "UserState"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private CommonProto() {
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
         "\n2lunarclient/websocket/conversation/v1/common.proto\u0012%lunarclient.websocket.conversation.v1\u001a\u001fgoogle/protobuf/timestamp.proto\u001a lunarclient/common/v1/uuid.proto\u001a!lunarclient/common/v1/color.proto\"Ð\n\n\fConversation\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012b\n\fparticipants\u0018\u0002 \u0003(\u000b2>.lunarclient.websocket.conversation.v1.ConversationParticipantR\fparticipants\u0012K\n\u0004type\u0018\u0003 \u0001(\u000e27.lunarclient.websocket.conversation.v1.ConversationTypeR\u0004type\u0012H\n\u0012last_activity_time\u0018\u0004 \u0001(\u000b2\u001a.google.protobuf.TimestampR\u0010lastActivityTime\u0012\u0017\n\u0004name\u0018\u0005 \u0001(\tH\u0000R\u0004name\u0088\u0001\u0001\u00129\n\u0016conversation_image_url\u0018\u0006 \u0001(\tH\u0001R\u0014conversationImageUrl\u0088\u0001\u0001\u0012?\n\nowner_uuid\u0018\u0007 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidH\u0002R\townerUuid\u0088\u0001\u0001\u0012`\n\nuser_state\u0018\b \u0001(\u000b2<.lunarclient.websocket.conversation.v1.UserConversationStateH\u0003R\tuserState\u0088\u0001\u0001\u00120\n\u0011participant_limit\u0018\t \u0001(\u0005H\u0004R\u0010participantLimit\u0088\u0001\u0001\u0012]\n\rinvite_policy\u0018\n \u0001(\u000e23.lunarclient.websocket.conversation.v1.InvitePolicyH\u0005R\finvitePolicy\u0088\u0001\u0001\u0012W\n\u000bname_policy\u0018\u000b \u0001(\u000e21.lunarclient.websocket.conversation.v1.NamePolicyH\u0006R\nnamePolicy\u0088\u0001\u0001\u0012W\n\u000bicon_policy\u0018\f \u0001(\u000e21.lunarclient.websocket.conversation.v1.IconPolicyH\u0007R\niconPolicy\u0088\u0001\u0001\u0012v\n\u0016message_pinning_policy\u0018\r \u0001(\u000e2;.lunarclient.websocket.conversation.v1.MessagePinningPolicyH\bR\u0014messagePinningPolicy\u0088\u0001\u0001\u0012f\n\u000elatest_message\u0018\u000e \u0001(\u000b2:.lunarclient.websocket.conversation.v1.ConversationMessageH\tR\rlatestMessage\u0088\u0001\u0001B\u0007\n\u0005_nameB\u0019\n\u0017_conversation_image_urlB\r\n\u000b_owner_uuidB\r\n\u000b_user_stateB\u0014\n\u0012_participant_limitB\u0010\n\u000e_invite_policyB\u000e\n\f_name_policyB\u000e\n\f_icon_policyB\u0019\n\u0017_message_pinning_policyB\u0011\n\u000f_latest_message\"\u0094\u0001\n\u0015UserConversationState\u0012@\n\u000elast_seen_time\u0018\u0001 \u0001(\u000b2\u001a.google.protobuf.TimestampR\flastSeenTime\u0012!\n\funread_count\u0018\u0002 \u0001(\u0005R\u000bunreadCount\u0012\u0016\n\u0006pinned\u0018\u0003 \u0001(\bR\u0006pinned\"µ\u0002\n\u0017ConversationParticipant\u0012>\n\u0006player\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0006player\u0012;\n\nlogo_color\u0018\u0002 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tlogoColor\u0012;\n\nplus_color\u0018\u0003 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tplusColor\u0012\u001b\n\trank_name\u0018\u0004 \u0001(\tR\brankName\u0012(\n\u0010is_radio_premium\u0018\u0005 \u0001(\bR\u000eisRadioPremium\u0012\u0019\n\bbadge_id\u0018\u0006 \u0001(\u0005R\u0007badgeId\"·\u0001\n\u0015ConversationReference\u0012>\n\u000bfriend_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidH\u0000R\nfriendUuid\u0012T\n\u0016conversation_reference\u0018\u0002 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidH\u0000R\u0015conversationReferenceB\b\n\u0006target\"`\n\u0012ConversationSender\u0012@\n\u0006player\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameH\u0000R\u0006playerB\b\n\u0006sender\"£\u0003\n\u001bConversationMessageContents\u0012\u001f\n\nplain_text\u0018\u0001 \u0001(\tH\u0000R\tplainText\u0012O\n\u0007sticker\u0018\u0002 \u0001(\u000b23.lunarclient.websocket.conversation.v1.LunarStickerH\u0000R\u0007sticker\u0012N\n\u0006system\u0018\u0005 \u0001(\u000b24.lunarclient.websocket.conversation.v1.SystemMessageH\u0000R\u0006system\u0012P\n\u0006images\u0018\u0003 \u0003(\u000b28.lunarclient.websocket.conversation.v1.ConversationImageR\u0006images\u0012Z\n\u0005embed\u0018\u0004 \u0001(\u000b2?.lunarclient.websocket.conversation.v1.ConversationMessageEmbedH\u0001R\u0005embed\u0088\u0001\u0001B\n\n\bcontentsB\b\n\u0006_embed\"¦\u0003\n\u0013ConversationMessage\u0012+\n\u0002id\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\u0002id\u00123\n\u0007sent_at\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.TimestampR\u0006sentAt\u0012V\n\u0006sender\u0018\u0003 \u0001(\u000b29.lunarclient.websocket.conversation.v1.ConversationSenderH\u0000R\u0006sender\u0088\u0001\u0001\u0012^\n\bcontents\u0018\u0004 \u0001(\u000b2B.lunarclient.websocket.conversation.v1.ConversationMessageContentsR\bcontents\u0012R\n\u0004kind\u0018\u0005 \u0001(\u000e2>.lunarclient.websocket.conversation.v1.ConversationMessageKindR\u0004kind\u0012\u0016\n\u0006pinned\u0018\u0006 \u0001(\bR\u0006pinnedB\t\n\u0007_sender\"º\u0004\n\rSystemMessage\u0012T\n\u0005actor\u0018\u0001 \u0001(\u000b29.lunarclient.websocket.conversation.v1.ConversationSenderH\u0001R\u0005actor\u0088\u0001\u0001\u0012Y\n\u0006pinned\u0018\u0002 \u0001(\u000b2?.lunarclient.websocket.conversation.v1.SystemPinnedMessageEventH\u0000R\u0006pinned\u0012R\n\u0006invite\u0018\u0003 \u0001(\u000b28.lunarclient.websocket.conversation.v1.SystemInviteEventH\u0000R\u0006invite\u0012O\n\u0005leave\u0018\u0004 \u0001(\u000b27.lunarclient.websocket.conversation.v1.SystemLeaveEventH\u0000R\u0005leave\u0012_\n\u000bname_change\u0018\u0005 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.SystemNameChangeEventH\u0000R\nnameChange\u0012_\n\u000bicon_change\u0018\u0006 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.SystemIconChangeEventH\u0000R\niconChangeB\u0007\n\u0005eventB\b\n\u0006_actor\"c\n\u0018SystemPinnedMessageEvent\u0012G\n\u0011pinned_message_id\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\u000fpinnedMessageId\"W\n\u0011SystemInviteEvent\u0012B\n\binvitees\u0018\u0001 \u0003(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\binvitees\"R\n\u0010SystemLeaveEvent\u0012>\n\u0006player\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0006player\"2\n\u0015SystemNameChangeEvent\u0012\u0019\n\bnew_name\u0018\u0001 \u0001(\tR\u0007newName\"9\n\u0015SystemIconChangeEvent\u0012 \n\fnew_icon_url\u0018\u0001 \u0001(\tR\nnewIconUrl\"\u0089\u0002\n\u0018ConversationMessageEmbed\u0012I\n\u0005image\u0018\u0001 \u0001(\u000b21.lunarclient.websocket.conversation.v1.ImageEmbedH\u0000R\u0005image\u0012\\\n\flink_preview\u0018\u0002 \u0001(\u000b27.lunarclient.websocket.conversation.v1.LinkPreviewEmbedH\u0000R\u000blinkPreview\u0012;\n\u000bcaptured_at\u0018\u0003 \u0001(\u000b2\u001a.google.protobuf.TimestampR\ncapturedAtB\u0007\n\u0005embed\"\u0096\u0002\n\nImageEmbed\u0012\u0017\n\u0007raw_url\u0018\u0001 \u0001(\tR\u0006rawUrl\u0012%\n\u000enormalized_url\u0018\u0002 \u0001(\tR\rnormalizedUrl\u0012\u001f\n\u000bproxied_url\u0018\u0003 \u0001(\tR\nproxiedUrl\u0012\u001b\n\tmime_type\u0018\u0004 \u0001(\tR\bmimeType\u0012\u0019\n\u0005width\u0018\u0005 \u0001(\rH\u0000R\u0005width\u0088\u0001\u0001\u0012\u001b\n\u0006height\u0018\u0006 \u0001(\rH\u0001R\u0006height\u0088\u0001\u0001\u0012*\n\u000econtent_length\u0018\u0007 \u0001(\u0004H\u0002R\rcontentLength\u0088\u0001\u0001B\b\n\u0006_widthB\t\n\u0007_heightB\u0011\n\u000f_content_length\"Ê\u0002\n\u0010LinkPreviewEmbed\u0012\u0017\n\u0007raw_url\u0018\u0001 \u0001(\tR\u0006rawUrl\u0012%\n\u000enormalized_url\u0018\u0002 \u0001(\tR\rnormalizedUrl\u0012\u001f\n\u000bproxied_url\u0018\u0003 \u0001(\tR\nproxiedUrl\u0012\u001b\n\tsite_name\u0018\u0004 \u0001(\tR\bsiteName\u0012\u0014\n\u0005title\u0018\u0005 \u0001(\tR\u0005title\u0012 \n\u000bdescription\u0018\u0006 \u0001(\tR\u000bdescription\u0012D\n\u0005image\u0018\u0007 \u0001(\u000b2..lunarclient.websocket.conversation.v1.OgImageR\u0005image\u0012\u0017\n\u0007og_type\u0018\b \u0001(\tR\u0006ogType\u0012!\n\fcontent_type\u0018\t \u0001(\tR\u000bcontentType\"\u0085\u0001\n\u0007OgImage\u0012\u0010\n\u0003url\u0018\u0001 \u0001(\tR\u0003url\u0012\u0019\n\u0005width\u0018\u0002 \u0001(\rH\u0000R\u0005width\u0088\u0001\u0001\u0012\u001b\n\u0006height\u0018\u0003 \u0001(\rH\u0001R\u0006height\u0088\u0001\u0001\u0012\u001b\n\tmime_type\u0018\u0004 \u0001(\tR\bmimeTypeB\b\n\u0006_widthB\t\n\u0007_height\"%\n\u0011ConversationImage\u0012\u0010\n\u0003url\u0018\u0001 \u0001(\tR\u0003url\"D\n\fLunarSticker\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012\u0010\n\u0003url\u0018\u0002 \u0001(\tR\u0003url\u0012\u0012\n\u0004name\u0018\u0003 \u0001(\tR\u0004name\"¢\u0001\n\u0010LunarStickerPack\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012\u0012\n\u0004name\u0018\u0002 \u0001(\tR\u0004name\u0012\u0019\n\bicon_url\u0018\u0003 \u0001(\tR\u0007iconUrl\u0012O\n\bstickers\u0018\u0004 \u0003(\u000b23.lunarclient.websocket.conversation.v1.LunarStickerR\bstickers\"B\n\nLunarEmoji\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012\u0010\n\u0003url\u0018\u0002 \u0001(\tR\u0003url\u0012\u0012\n\u0004name\u0018\u0003 \u0001(\tR\u0004name\"\u009e\u0001\n\u0012LunarEmojiCategory\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012\u0012\n\u0004name\u0018\u0002 \u0001(\tR\u0004name\u0012\u0019\n\bicon_url\u0018\u0003 \u0001(\tR\u0007iconUrl\u0012I\n\u0006emojis\u0018\u0004 \u0003(\u000b21.lunarclient.websocket.conversation.v1.LunarEmojiR\u0006emojis\"f\n\u0011UploadRequestItem\u0012!\n\fcontent_type\u0018\u0001 \u0001(\tR\u000bcontentType\u0012.\n\u0013expected_size_bytes\u0018\u0002 \u0001(\u0004R\u0011expectedSizeBytes\"\u009b\u0003\n\u000fPresignedUpload\u0012\u001d\n\nupload_url\u0018\u0001 \u0001(\tR\tuploadUrl\u0012v\n\u0010required_headers\u0018\u0002 \u0003(\u000b2K.lunarclient.websocket.conversation.v1.PresignedUpload.RequiredHeadersEntryR\u000frequiredHeaders\u0012\u001b\n\tmax_bytes\u0018\u0003 \u0001(\u0004R\bmaxBytes\u00122\n\u0015accepted_content_type\u0018\u0004 \u0001(\tR\u0013acceptedContentType\u00129\n\nexpires_at\u0018\u0005 \u0001(\u000b2\u001a.google.protobuf.TimestampR\texpiresAt\u0012!\n\ffinished_url\u0018\u0006 \u0001(\tR\u000bfinishedUrl\u001aB\n\u0014RequiredHeadersEntry\u0012\u0010\n\u0003key\u0018\u0001 \u0001(\tR\u0003key\u0012\u0014\n\u0005value\u0018\u0002 \u0001(\tR\u0005value:\u00028\u0001\"ø\u0001\n\u0010ConversationStub\u0012s\n\u0016conversation_reference\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.ConversationReferenceR\u0015conversationReference\u0012`\n\nuser_state\u0018\u0002 \u0001(\u000b2<.lunarclient.websocket.conversation.v1.UserConversationStateH\u0000R\tuserState\u0088\u0001\u0001B\r\n\u000b_user_state*u\n\u0010ConversationType\u0012!\n\u001dCONVERSATION_TYPE_UNSPECIFIED\u0010\u0000\u0012\u001c\n\u0018CONVERSATION_TYPE_FRIEND\u0010\u0001\u0012 \n\u001cCONVERSATION_TYPE_GROUP_CHAT\u0010\u0002*\u008e\u0001\n\u0017ConversationMessageKind\u0012)\n%CONVERSATION_MESSAGE_KIND_UNSPECIFIED\u0010\u0000\u0012\"\n\u001eCONVERSATION_MESSAGE_KIND_USER\u0010\u0001\u0012$\n CONVERSATION_MESSAGE_KIND_SYSTEM\u0010\u0002*f\n\rPreSendAction\u0012\u001f\n\u001bPRE_SEND_ACTION_UNSPECIFIED\u0010\u0000\u0012\u0018\n\u0014PRE_SEND_ACTION_NONE\u0010\u0001\u0012\u001a\n\u0016PRE_SEND_ACTION_TYPING\u0010\u0002*b\n\fInvitePolicy\u0012\u001d\n\u0019INVITE_POLICY_UNSPECIFIED\u0010\u0000\u0012\u001a\n\u0016INVITE_POLICY_EVERYONE\u0010\u0001\u0012\u0017\n\u0013INVITE_POLICY_OWNER\u0010\u0002*Z\n\nNamePolicy\u0012\u001b\n\u0017NAME_POLICY_UNSPECIFIED\u0010\u0000\u0012\u0018\n\u0014NAME_POLICY_EVERYONE\u0010\u0001\u0012\u0015\n\u0011NAME_POLICY_OWNER\u0010\u0002*Z\n\nIconPolicy\u0012\u001b\n\u0017ICON_POLICY_UNSPECIFIED\u0010\u0000\u0012\u0018\n\u0014ICON_POLICY_EVERYONE\u0010\u0001\u0012\u0015\n\u0011ICON_POLICY_OWNER\u0010\u0002*\u0085\u0001\n\u0014MessagePinningPolicy\u0012&\n\"MESSAGE_PINNING_POLICY_UNSPECIFIED\u0010\u0000\u0012#\n\u001fMESSAGE_PINNING_POLICY_EVERYONE\u0010\u0001\u0012 \n\u001cMESSAGE_PINNING_POLICY_OWNER\u0010\u0002*f\n\u000bUploadUsage\u0012\u001c\n\u0018UPLOAD_USAGE_UNSPECIFIED\u0010\u0000\u0012\"\n\u001eUPLOAD_USAGE_CONVERSATION_ICON\u0010\u0001\u0012\u0015\n\u0011UPLOAD_USAGE_CHAT\u0010\u0002Bï\u0001\n)com.lunarclient.websocket.conversation.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWCª\u0002%Lunarclient.Websocket.Conversation.V1Ê\u0002%Lunarclient\\Websocket\\Conversation\\V1â\u00021Lunarclient\\Websocket\\Conversation\\V1\\GPBMetadataê\u0002(Lunarclient::Websocket::Conversation::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{TimestampProto.getDescriptor(), UuidProto.getDescriptor(), ColorProto.getDescriptor()}
      );
      TimestampProto.getDescriptor();
      UuidProto.getDescriptor();
      ColorProto.getDescriptor();
   }
}
