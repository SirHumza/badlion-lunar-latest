package com.lunarclient.websocket.skyblock.v1;

import com.google.protobuf.MessageOrBuilder;

public interface BroadcastDungeonUpdateRequestOrBuilder extends MessageOrBuilder {
   boolean hasUpdate();

   DungeonUpdate getUpdate();

   DungeonUpdateOrBuilder getUpdateOrBuilder();
}
