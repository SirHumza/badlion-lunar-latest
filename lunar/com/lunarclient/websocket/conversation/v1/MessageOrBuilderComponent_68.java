package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;

public interface DeleteConversationMessageRequestOrBuilder extends MessageOrBuilder {
   boolean hasMessageId();

   Uuid getMessageId();

   UuidOrBuilder getMessageIdOrBuilder();

   boolean hasConversationReference();

   ConversationReference getConversationReference();

   ConversationReferenceOrBuilder getConversationReferenceOrBuilder();
}
