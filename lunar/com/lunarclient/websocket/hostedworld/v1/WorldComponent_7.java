package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.MessageOrBuilder;

public interface StartHostingWorldRequestOrBuilder extends MessageOrBuilder {
   boolean hasHeartbeat();

   Heartbeat getHeartbeat();

   HeartbeatOrBuilder getHeartbeatOrBuilder();
}
