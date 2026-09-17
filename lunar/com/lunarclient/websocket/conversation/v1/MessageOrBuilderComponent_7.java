package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;

public interface SystemPinnedMessageEventOrBuilder extends MessageOrBuilder {
   boolean hasPinnedMessageId();

   Uuid getPinnedMessageId();

   UuidOrBuilder getPinnedMessageIdOrBuilder();
}
