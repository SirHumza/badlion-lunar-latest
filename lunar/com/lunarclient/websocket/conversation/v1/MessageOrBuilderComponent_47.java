package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;

public interface ConversationPreSendActionPushOrBuilder extends MessageOrBuilder {
   boolean hasConversationReference();

   ConversationReference getConversationReference();

   ConversationReferenceOrBuilder getConversationReferenceOrBuilder();

   int getActionValue();

   PreSendAction getAction();

   boolean hasSender();

   ConversationSender getSender();

   ConversationSenderOrBuilder getSenderOrBuilder();
}
