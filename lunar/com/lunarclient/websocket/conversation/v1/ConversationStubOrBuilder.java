package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;

public interface ConversationStubOrBuilder extends MessageOrBuilder {
   boolean hasConversationReference();

   ConversationReference getConversationReference();

   ConversationReferenceOrBuilder getConversationReferenceOrBuilder();

   boolean hasUserState();

   UserConversationState getUserState();

   UserConversationStateOrBuilder getUserStateOrBuilder();
}
