package com.lunarclient.websocket.wrapped.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface CounterUpdateOrBuilder extends MessageOrBuilder {
   String getCounter();

   ByteString getCounterBytes();

   int getDelta();
}
