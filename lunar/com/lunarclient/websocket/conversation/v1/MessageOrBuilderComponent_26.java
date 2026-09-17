package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import com.lunarclient.common.v1.UuidOrBuilder;

public interface ConversationOwnerUpdatePushOrBuilder extends MessageOrBuilder {
   boolean hasConversationReference();

   ConversationReference getConversationReference();

   ConversationReferenceOrBuilder getConversationReferenceOrBuilder();

   boolean hasInvoker();

   UuidAndUsername getInvoker();

   UuidAndUsernameOrBuilder getInvokerOrBuilder();

   boolean hasPreviousOwnerUuid();

   Uuid getPreviousOwnerUuid();

   UuidOrBuilder getPreviousOwnerUuidOrBuilder();

   boolean hasOwnerUuid();

   Uuid getOwnerUuid();

   UuidOrBuilder getOwnerUuidOrBuilder();
}
