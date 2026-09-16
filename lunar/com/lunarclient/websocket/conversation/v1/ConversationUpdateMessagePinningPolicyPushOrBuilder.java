package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;

public interface ConversationUpdateMessagePinningPolicyPushOrBuilder extends MessageOrBuilder {
   boolean hasConversationReference();

   ConversationReference getConversationReference();

   ConversationReferenceOrBuilder getConversationReferenceOrBuilder();

   int getPolicyValue();

   MessagePinningPolicy getPolicy();
}
