package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;

public interface SendConversationMessageResponseOrBuilder extends MessageOrBuilder {
   int getStatusValue();

   SendConversationMessageResponse.Status getStatus();
}
