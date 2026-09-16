package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;

public interface ConversationUpdateNamePushOrBuilder extends MessageOrBuilder {
   boolean hasConversationReference();

   ConversationReference getConversationReference();

   ConversationReferenceOrBuilder getConversationReferenceOrBuilder();

   boolean hasInvoker();

   UuidAndUsername getInvoker();

   UuidAndUsernameOrBuilder getInvokerOrBuilder();

   String getName();

   ByteString getNameBytes();
}
