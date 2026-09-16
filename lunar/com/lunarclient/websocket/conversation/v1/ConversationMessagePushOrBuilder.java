package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;

public interface ConversationMessagePushOrBuilder extends MessageOrBuilder {
   boolean hasConversationReference();

   ConversationReference getConversationReference();

   ConversationReferenceOrBuilder getConversationReferenceOrBuilder();

   boolean hasMessage();

   ConversationMessage getMessage();

   ConversationMessageOrBuilder getMessageOrBuilder();

   boolean hasUpdated();

   boolean getUpdated();
}
