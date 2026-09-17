package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.util.List;

public interface AddConversationParticipantsRequestOrBuilder extends MessageOrBuilder {
   boolean hasConversationReference();

   ConversationReference getConversationReference();

   ConversationReferenceOrBuilder getConversationReferenceOrBuilder();

   List<UuidAndUsername> getTargetsList();

   UuidAndUsername getTargets(int var1);

   int getTargetsCount();

   List<? extends UuidAndUsernameOrBuilder> getTargetsOrBuilderList();

   UuidAndUsernameOrBuilder getTargetsOrBuilder(int var1);
}
