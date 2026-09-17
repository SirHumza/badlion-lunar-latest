package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;

public interface ConversationReferenceOrBuilder extends MessageOrBuilder {
   boolean hasFriendUuid();

   Uuid getFriendUuid();

   UuidOrBuilder getFriendUuidOrBuilder();

   boolean hasConversationReference();

   Uuid getConversationReference();

   UuidOrBuilder getConversationReferenceOrBuilder();

   ConversationReference.TargetCase getTargetCase();
}
