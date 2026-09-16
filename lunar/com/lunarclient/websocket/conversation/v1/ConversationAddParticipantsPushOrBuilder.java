package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.util.List;

public interface ConversationAddParticipantsPushOrBuilder extends MessageOrBuilder {
   boolean hasConversationReference();

   ConversationReference getConversationReference();

   ConversationReferenceOrBuilder getConversationReferenceOrBuilder();

   boolean hasInvoker();

   UuidAndUsername getInvoker();

   UuidAndUsernameOrBuilder getInvokerOrBuilder();

   List<ConversationParticipant> getParticipantsList();

   ConversationParticipant getParticipants(int var1);

   int getParticipantsCount();

   List<? extends ConversationParticipantOrBuilder> getParticipantsOrBuilderList();

   ConversationParticipantOrBuilder getParticipantsOrBuilder(int var1);
}
