package com.lunarclient.websocket.heartbeat.v1;

import com.google.protobuf.MessageOrBuilder;

public interface OnlineCountsOrBuilder extends MessageOrBuilder {
   int getLauncher();

   int getGame();
}
