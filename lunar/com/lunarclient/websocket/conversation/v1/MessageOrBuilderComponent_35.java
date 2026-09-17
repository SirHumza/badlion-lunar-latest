package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;

public interface CreateConversationResponseOrBuilder extends MessageOrBuilder {
   int getStatusValue();

   CreateConversationResponse.Status getStatus();

   boolean hasConversation();

   Conversation getConversation();

   ConversationOrBuilder getConversationOrBuilder();
}
