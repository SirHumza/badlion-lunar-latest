package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;

public interface ConversationMessageOrBuilder extends MessageOrBuilder {
   boolean hasId();

   Uuid getId();

   UuidOrBuilder getIdOrBuilder();

   boolean hasSentAt();

   Timestamp getSentAt();

   TimestampOrBuilder getSentAtOrBuilder();

   boolean hasSender();

   ConversationSender getSender();

   ConversationSenderOrBuilder getSenderOrBuilder();

   boolean hasContents();

   ConversationMessageContents getContents();

   ConversationMessageContentsOrBuilder getContentsOrBuilder();

   int getKindValue();

   ConversationMessageKind getKind();

   boolean getPinned();
}
