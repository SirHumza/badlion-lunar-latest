package com.lunarclient.websocket.skyblock.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Vector2i;
import com.lunarclient.common.v1.Vector2iOrBuilder;

public interface EarlyInDoorOrBuilder extends MessageOrBuilder {
   int getTypeValue();

   DungeonRoomType getType();

   boolean hasPosition1();

   Vector2i getPosition1();

   Vector2iOrBuilder getPosition1OrBuilder();

   boolean hasPosition2();

   Vector2i getPosition2();

   Vector2iOrBuilder getPosition2OrBuilder();
}
