package com.lunarclient.apollo.chat.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface DisplayChatButtonsMessageOrBuilder extends MessageOrBuilder {
   List<ChatButton> getChatButtonsList();

   ChatButton getChatButtons(int var1);

   int getChatButtonsCount();

   List<? extends ChatButtonOrBuilder> getChatButtonsOrBuilderList();

   ChatButtonOrBuilder getChatButtonsOrBuilder(int var1);
}
