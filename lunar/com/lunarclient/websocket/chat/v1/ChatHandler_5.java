package com.lunarclient.websocket.chat.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;

public interface SendChatRequestOrBuilder extends MessageOrBuilder {
   boolean hasTargetUuid();

   Uuid getTargetUuid();

   UuidOrBuilder getTargetUuidOrBuilder();

   String getChatMessage();

   ByteString getChatMessageBytes();
}
