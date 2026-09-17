package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface GetConversationsResponseOrBuilder extends MessageOrBuilder {
   int getStatusValue();

   GetConversationsResponse.Status getStatus();

   List<Conversation> getConversationsList();

   Conversation getConversations(int var1);

   int getConversationsCount();

   List<? extends ConversationOrBuilder> getConversationsOrBuilderList();

   ConversationOrBuilder getConversationsOrBuilder(int var1);

   int getTotalConversations();
}
