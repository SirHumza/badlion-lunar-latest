package com.lunarclient.websocket.protocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface WebSocketRpcResponseOrBuilder extends MessageOrBuilder {
   ByteString getRequestId();

   ByteString getOutput();
}
