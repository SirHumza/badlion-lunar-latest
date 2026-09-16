package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;

public interface SetConversationPinnedRequestOrBuilder extends MessageOrBuilder {
   boolean hasConversationReference();

   ConversationReference getConversationReference();

   ConversationReferenceOrBuilder getConversationReferenceOrBuilder();

   boolean getPinned();
}
