package com.lunarclient.websocket.skyblock.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;

public interface DungeonUpdatePushOrBuilder extends MessageOrBuilder {
   boolean hasSenderUuid();

   Uuid getSenderUuid();

   UuidOrBuilder getSenderUuidOrBuilder();

   boolean hasUpdate();

   DungeonUpdate getUpdate();

   DungeonUpdateOrBuilder getUpdateOrBuilder();
}
