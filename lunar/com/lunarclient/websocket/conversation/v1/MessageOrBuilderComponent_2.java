package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface LoadPinnedMessagesResponseOrBuilder extends MessageOrBuilder {
   int getStatusValue();

   LoadPinnedMessagesResponse.Status getStatus();

   List<ConversationMessage> getMessagesList();

   ConversationMessage getMessages(int var1);

   int getMessagesCount();

   List<? extends ConversationMessageOrBuilder> getMessagesOrBuilderList();

   ConversationMessageOrBuilder getMessagesOrBuilder(int var1);
}
