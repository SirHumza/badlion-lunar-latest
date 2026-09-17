package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;

public interface SendConversationMessageRequestOrBuilder extends MessageOrBuilder {
   boolean hasConversationReference();

   ConversationReference getConversationReference();

   ConversationReferenceOrBuilder getConversationReferenceOrBuilder();

   boolean hasMessageContents();

   ConversationMessageContents getMessageContents();

   ConversationMessageContentsOrBuilder getMessageContentsOrBuilder();
}
