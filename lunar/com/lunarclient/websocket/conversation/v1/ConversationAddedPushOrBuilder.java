package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;

public interface ConversationAddedPushOrBuilder extends MessageOrBuilder {
   boolean hasConversation();

   Conversation getConversation();

   ConversationOrBuilder getConversationOrBuilder();

   boolean hasSender();

   UuidAndUsername getSender();

   UuidAndUsernameOrBuilder getSenderOrBuilder();

   boolean hasAddedAt();

   Timestamp getAddedAt();

   TimestampOrBuilder getAddedAtOrBuilder();
}
