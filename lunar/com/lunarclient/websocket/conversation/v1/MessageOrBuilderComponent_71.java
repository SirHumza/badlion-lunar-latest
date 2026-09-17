package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface ConversationImageOrBuilder extends MessageOrBuilder {
   String getUrl();

   ByteString getUrlBytes();
}
