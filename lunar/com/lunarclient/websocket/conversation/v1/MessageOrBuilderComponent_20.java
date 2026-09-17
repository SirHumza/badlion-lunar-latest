package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;

public interface GetConversationsRequestOrBuilder extends MessageOrBuilder {
   boolean hasLimit();

   int getLimit();

   boolean hasCursor();

   Timestamp getCursor();

   TimestampOrBuilder getCursorOrBuilder();

   boolean hasConversationReference();

   ConversationReference getConversationReference();

   ConversationReferenceOrBuilder getConversationReferenceOrBuilder();
}
