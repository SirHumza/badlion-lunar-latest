package com.lunarclient.websocket.skyblock.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.PositionProto;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_skyblock_v1_EarlyInDoor_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_skyblock_v1_EarlyInDoor_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_skyblock_v1_EarlyInDoor_descriptor, new String[]{"Type", "Position1", "Position2"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_skyblock_v1_EarlyInRoom_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_skyblock_v1_EarlyInRoom_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_skyblock_v1_EarlyInRoom_descriptor, new String[]{"Components", "Type"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_skyblock_v1_EarlyInUnknown_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_skyblock_v1_EarlyInUnknown_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_skyblock_v1_EarlyInUnknown_descriptor, new String[]{"Position"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_skyblock_v1_RoomDetection_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_skyblock_v1_RoomDetection_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_skyblock_v1_RoomDetection_descriptor, new String[]{"Position", "Hash", "Origin", "Rotation"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_skyblock_v1_RoomSecrets_descriptor = getDescriptor().getMessageTypes().get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_skyblock_v1_RoomSecrets_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_skyblock_v1_RoomSecrets_descriptor, new String[]{"Position", "Current", "Max"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_skyblock_v1_DungeonUpdate_descriptor = getDescriptor().getMessageTypes().get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_skyblock_v1_DungeonUpdate_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_skyblock_v1_DungeonUpdate_descriptor,
      new String[]{"EarlyInDoor", "EarlyInRoom", "EarlyInUnknown", "RoomDetection", "RoomSecrets", "Contents"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private CommonProto() {
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static Descriptors.FileDescriptor getDescriptor() {
      return descriptor;
   }

   static {
      String[] var0 = new String[]{
         "\n.lunarclient/websocket/skyblock/v1/common.proto\u0012!lunarclient.websocket.skyblock.v1\u001a$lunarclient/common/v1/position.proto\"Õ\u0001\n\u000bEarlyInDoor\u0012F\n\u0004type\u0018\u0001 \u0001(\u000e22.lunarclient.websocket.skyblock.v1.DungeonRoomTypeR\u0004type\u0012>\n\nposition_1\u0018\u0002 \u0001(\u000b2\u001f.lunarclient.common.v1.Vector2iR\tposition1\u0012>\n\nposition_2\u0018\u0003 \u0001(\u000b2\u001f.lunarclient.common.v1.Vector2iR\tposition2\"\u0096\u0001\n\u000bEarlyInRoom\u0012?\n\ncomponents\u0018\u0001 \u0003(\u000b2\u001f.lunarclient.common.v1.Vector2iR\ncomponents\u0012F\n\u0004type\u0018\u0002 \u0001(\u000e22.lunarclient.websocket.skyblock.v1.DungeonRoomTypeR\u0004type\"M\n\u000eEarlyInUnknown\u0012;\n\bposition\u0018\u0001 \u0001(\u000b2\u001f.lunarclient.common.v1.Vector2iR\bposition\"í\u0001\n\rRoomDetection\u0012;\n\bposition\u0018\u0001 \u0001(\u000b2\u001f.lunarclient.common.v1.Vector2iR\bposition\u0012\u0012\n\u0004hash\u0018\u0002 \u0001(\tR\u0004hash\u00127\n\u0006origin\u0018\u0003 \u0001(\u000b2\u001f.lunarclient.common.v1.Vector3iR\u0006origin\u0012R\n\brotation\u0018\u0004 \u0001(\u000e26.lunarclient.websocket.skyblock.v1.DungeonRoomRotationR\brotation\"v\n\u000bRoomSecrets\u0012;\n\bposition\u0018\u0001 \u0001(\u000b2\u001f.lunarclient.common.v1.Vector2iR\bposition\u0012\u0018\n\u0007current\u0018\u0002 \u0001(\u0005R\u0007current\u0012\u0010\n\u0003max\u0018\u0003 \u0001(\u0005R\u0003max\"Ö\u0003\n\rDungeonUpdate\u0012T\n\rearly_in_door\u0018\u0001 \u0001(\u000b2..lunarclient.websocket.skyblock.v1.EarlyInDoorH\u0000R\u000bearlyInDoor\u0012T\n\rearly_in_room\u0018\u0002 \u0001(\u000b2..lunarclient.websocket.skyblock.v1.EarlyInRoomH\u0000R\u000bearlyInRoom\u0012]\n\u0010early_in_unknown\u0018\u0003 \u0001(\u000b21.lunarclient.websocket.skyblock.v1.EarlyInUnknownH\u0000R\u000eearlyInUnknown\u0012Y\n\u000eroom_detection\u0018\u0004 \u0001(\u000b20.lunarclient.websocket.skyblock.v1.RoomDetectionH\u0000R\rroomDetection\u0012S\n\froom_secrets\u0018\u0005 \u0001(\u000b2..lunarclient.websocket.skyblock.v1.RoomSecretsH\u0000R\u000broomSecretsB\n\n\bcontents*à\u0002\n\u000fDungeonRoomType\u0012!\n\u001dDUNGEON_ROOM_TYPE_UNSPECIFIED\u0010\u0000\u0012\u001b\n\u0017DUNGEON_ROOM_TYPE_SPAWN\u0010\u0001\u0012\u001b\n\u0017DUNGEON_ROOM_TYPE_CLEAR\u0010\u0002\u0012\u001e\n\u001aDUNGEON_ROOM_TYPE_MINIBOSS\u0010\u0003\u0012\u001c\n\u0018DUNGEON_ROOM_TYPE_PUZZLE\u0010\u0004\u0012\u001a\n\u0016DUNGEON_ROOM_TYPE_TRAP\u0010\u0005\u0012\u001b\n\u0017DUNGEON_ROOM_TYPE_FAIRY\u0010\u0006\u0012\u001b\n\u0017DUNGEON_ROOM_TYPE_BLOOD\u0010\u0007\u0012\u001a\n\u0016DUNGEON_ROOM_TYPE_BOSS\u0010\b\u0012\u001d\n\u0019DUNGEON_ROOM_TYPE_UNKNOWN\u0010\t\u0012!\n\u001dDUNGEON_ROOM_TYPE_WITHER_DOOR\u0010\n*¾\u0001\n\u0013DungeonRoomRotation\u0012%\n!DUNGEON_ROOM_ROTATION_UNSPECIFIED\u0010\u0000\u0012\u001e\n\u001aDUNGEON_ROOM_ROTATION_EAST\u0010\u0001\u0012\u001f\n\u001bDUNGEON_ROOM_ROTATION_SOUTH\u0010\u0002\u0012\u001e\n\u001aDUNGEON_ROOM_ROTATION_WEST\u0010\u0003\u0012\u001f\n\u001bDUNGEON_ROOM_ROTATION_NORTH\u0010\u0004BÛ\u0001\n%com.lunarclient.websocket.skyblock.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWSª\u0002!Lunarclient.Websocket.Skyblock.V1Ê\u0002!Lunarclient\\Websocket\\Skyblock\\V1â\u0002-Lunarclient\\Websocket\\Skyblock\\V1\\GPBMetadataê\u0002$Lunarclient::Websocket::Skyblock::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{PositionProto.getDescriptor()});
      PositionProto.getDescriptor();
   }
}
