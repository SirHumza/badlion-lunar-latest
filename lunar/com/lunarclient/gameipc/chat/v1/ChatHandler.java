package com.lunarclient.gameipc.chat.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface SendChatPushOrBuilder extends MessageOrBuilder {
   String getMessage();

   ByteString getMessageBytes();
}
