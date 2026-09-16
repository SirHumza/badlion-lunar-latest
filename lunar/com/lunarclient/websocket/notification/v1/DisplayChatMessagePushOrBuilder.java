package com.lunarclient.websocket.notification.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface DisplayChatMessagePushOrBuilder extends MessageOrBuilder {
   String getChatMessage();

   ByteString getChatMessageBytes();
}
