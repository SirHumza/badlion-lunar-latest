package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface LoadConversationResponseOrBuilder extends MessageOrBuilder {
   List<ConversationMessage> getMessagesList();

   ConversationMessage getMessages(int var1);

   int getMessagesCount();

   List<? extends ConversationMessageOrBuilder> getMessagesOrBuilderList();

   ConversationMessageOrBuilder getMessagesOrBuilder(int var1);
}
