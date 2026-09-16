package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface SystemNameChangeEventOrBuilder extends MessageOrBuilder {
   String getNewName();

   ByteString getNewNameBytes();
}
