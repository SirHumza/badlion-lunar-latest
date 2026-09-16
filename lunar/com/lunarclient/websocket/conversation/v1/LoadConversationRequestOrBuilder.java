package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;

public interface LoadConversationRequestOrBuilder extends MessageOrBuilder {
   boolean hasConversationReference();

   ConversationReference getConversationReference();

   ConversationReferenceOrBuilder getConversationReferenceOrBuilder();

   boolean hasBeforeMessageId();

   Uuid getBeforeMessageId();

   UuidOrBuilder getBeforeMessageIdOrBuilder();

   boolean hasAfterMessageId();

   Uuid getAfterMessageId();

   UuidOrBuilder getAfterMessageIdOrBuilder();

   boolean hasAnchorMessageId();

   Uuid getAnchorMessageId();

   UuidOrBuilder getAnchorMessageIdOrBuilder();
}
