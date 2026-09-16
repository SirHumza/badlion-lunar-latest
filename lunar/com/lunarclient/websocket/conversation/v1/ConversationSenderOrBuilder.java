package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;

public interface ConversationSenderOrBuilder extends MessageOrBuilder {
   boolean hasPlayer();

   UuidAndUsername getPlayer();

   UuidAndUsernameOrBuilder getPlayerOrBuilder();

   ConversationSender.SenderCase getSenderCase();
}
