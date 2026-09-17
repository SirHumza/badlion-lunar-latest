package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.util.List;

public interface ConversationOrBuilder extends MessageOrBuilder {
   boolean hasConversationReference();

   ConversationReference getConversationReference();

   ConversationReferenceOrBuilder getConversationReferenceOrBuilder();

   List<ConversationParticipant> getParticipantsList();

   ConversationParticipant getParticipants(int var1);

   int getParticipantsCount();

   List<? extends ConversationParticipantOrBuilder> getParticipantsOrBuilderList();

   ConversationParticipantOrBuilder getParticipantsOrBuilder(int var1);

   int getTypeValue();

   ConversationType getType();

   boolean hasLastActivityTime();

   Timestamp getLastActivityTime();

   TimestampOrBuilder getLastActivityTimeOrBuilder();

   boolean hasName();

   String getName();

   ByteString getNameBytes();

   boolean hasConversationImageUrl();

   String getConversationImageUrl();

   ByteString getConversationImageUrlBytes();

   boolean hasOwnerUuid();

   Uuid getOwnerUuid();

   UuidOrBuilder getOwnerUuidOrBuilder();

   boolean hasUserState();

   UserConversationState getUserState();

   UserConversationStateOrBuilder getUserStateOrBuilder();

   boolean hasParticipantLimit();

   int getParticipantLimit();

   boolean hasInvitePolicy();

   int getInvitePolicyValue();

   InvitePolicy getInvitePolicy();

   boolean hasNamePolicy();

   int getNamePolicyValue();

   NamePolicy getNamePolicy();

   boolean hasIconPolicy();

   int getIconPolicyValue();

   IconPolicy getIconPolicy();

   boolean hasMessagePinningPolicy();

   int getMessagePinningPolicyValue();

   MessagePinningPolicy getMessagePinningPolicy();

   boolean hasLatestMessage();

   ConversationMessage getLatestMessage();

   ConversationMessageOrBuilder getLatestMessageOrBuilder();
}
