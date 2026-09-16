package com.lunarclient.websocket.skyblock.v1;

import com.google.protobuf.MessageOrBuilder;

public interface DungeonUpdateOrBuilder extends MessageOrBuilder {
   boolean hasEarlyInDoor();

   EarlyInDoor getEarlyInDoor();

   EarlyInDoorOrBuilder getEarlyInDoorOrBuilder();

   boolean hasEarlyInRoom();

   EarlyInRoom getEarlyInRoom();

   EarlyInRoomOrBuilder getEarlyInRoomOrBuilder();

   boolean hasEarlyInUnknown();

   EarlyInUnknown getEarlyInUnknown();

   EarlyInUnknownOrBuilder getEarlyInUnknownOrBuilder();

   boolean hasRoomDetection();

   RoomDetection getRoomDetection();

   RoomDetectionOrBuilder getRoomDetectionOrBuilder();

   boolean hasRoomSecrets();

   RoomSecrets getRoomSecrets();

   RoomSecretsOrBuilder getRoomSecretsOrBuilder();

   DungeonUpdate.ContentsCase getContentsCase();
}
