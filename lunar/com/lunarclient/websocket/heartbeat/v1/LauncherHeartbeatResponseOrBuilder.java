package com.lunarclient.websocket.heartbeat.v1;

import com.google.protobuf.MessageOrBuilder;

public interface LauncherHeartbeatResponseOrBuilder extends MessageOrBuilder {
   boolean hasOnlineCounts();

   OnlineCounts getOnlineCounts();

   OnlineCountsOrBuilder getOnlineCountsOrBuilder();
}
