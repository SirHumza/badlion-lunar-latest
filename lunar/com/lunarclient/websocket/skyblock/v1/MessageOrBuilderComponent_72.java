package com.lunarclient.websocket.skyblock.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Vector2i;
import com.lunarclient.common.v1.Vector2iOrBuilder;
import com.lunarclient.common.v1.Vector3i;
import com.lunarclient.common.v1.Vector3iOrBuilder;

public interface RoomDetectionOrBuilder extends MessageOrBuilder {
   boolean hasPosition();

   Vector2i getPosition();

   Vector2iOrBuilder getPositionOrBuilder();

   String getHash();

   ByteString getHashBytes();

   boolean hasOrigin();

   Vector3i getOrigin();

   Vector3iOrBuilder getOriginOrBuilder();

   int getRotationValue();

   DungeonRoomRotation getRotation();
}
