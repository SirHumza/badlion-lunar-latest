package com.lunarclient.websocket.protocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface ServerboundWebSocketMessageOrBuilder extends MessageOrBuilder {
   ByteString getRequestId();

   String getService();

   ByteString getServiceBytes();

   String getMethod();

   ByteString getMethodBytes();

   ByteString getInput();
}
