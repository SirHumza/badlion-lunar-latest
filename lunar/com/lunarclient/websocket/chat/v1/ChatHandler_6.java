package com.lunarclient.websocket.chat.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;

public interface ReceiveChatPushOrBuilder extends MessageOrBuilder {
   boolean hasSenderUuid();

   Uuid getSenderUuid();

   UuidOrBuilder getSenderUuidOrBuilder();

   String getChatMessage();

   ByteString getChatMessageBytes();
}
