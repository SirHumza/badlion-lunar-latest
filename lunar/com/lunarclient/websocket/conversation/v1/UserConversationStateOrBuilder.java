package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;

public interface UserConversationStateOrBuilder extends MessageOrBuilder {
   boolean hasLastSeenTime();

   Timestamp getLastSeenTime();

   TimestampOrBuilder getLastSeenTimeOrBuilder();

   int getUnreadCount();

   boolean getPinned();
}
