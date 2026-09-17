package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.MessageOrBuilder;

public interface PingResponseOrBuilder extends MessageOrBuilder {
   boolean hasTarget();

   AddressAndPort getTarget();

   AddressAndPortOrBuilder getTargetOrBuilder();

   boolean getSuccess();

   boolean hasLatency();

   Duration getLatency();

   DurationOrBuilder getLatencyOrBuilder();
}
