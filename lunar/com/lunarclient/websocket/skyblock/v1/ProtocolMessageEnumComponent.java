package com.lunarclient.websocket.skyblock.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum DungeonRoomType implements ProtocolMessageEnum {
   DUNGEON_ROOM_TYPE_UNSPECIFIED(0),
   DUNGEON_ROOM_TYPE_SPAWN(1),
   DUNGEON_ROOM_TYPE_CLEAR(2),
   DUNGEON_ROOM_TYPE_MINIBOSS(3),
   DUNGEON_ROOM_TYPE_PUZZLE(4),
   DUNGEON_ROOM_TYPE_TRAP(5),
   DUNGEON_ROOM_TYPE_FAIRY(6),
   DUNGEON_ROOM_TYPE_BLOOD(7),
   DUNGEON_ROOM_TYPE_BOSS(8),
   DUNGEON_ROOM_TYPE_UNKNOWN(9),
   DUNGEON_ROOM_TYPE_WITHER_DOOR(10),
   UNRECOGNIZED(-1);

   public static final int DUNGEON_ROOM_TYPE_UNSPECIFIED_VALUE = 0;
   public static final int DUNGEON_ROOM_TYPE_SPAWN_VALUE = 1;
   public static final int DUNGEON_ROOM_TYPE_CLEAR_VALUE = 2;
   public static final int DUNGEON_ROOM_TYPE_MINIBOSS_VALUE = 3;
   public static final int DUNGEON_ROOM_TYPE_PUZZLE_VALUE = 4;
   public static final int DUNGEON_ROOM_TYPE_TRAP_VALUE = 5;
   public static final int DUNGEON_ROOM_TYPE_FAIRY_VALUE = 6;
   public static final int DUNGEON_ROOM_TYPE_BLOOD_VALUE = 7;
   public static final int DUNGEON_ROOM_TYPE_BOSS_VALUE = 8;
   public static final int DUNGEON_ROOM_TYPE_UNKNOWN_VALUE = 9;
   public static final int DUNGEON_ROOM_TYPE_WITHER_DOOR_VALUE = 10;
   private static final Internal.EnumLiteMap<DungeonRoomType> internalValueMap = new Internal.EnumLiteMap<DungeonRoomType>() {
      public DungeonRoomType findValueByNumber(int var1) {
         return DungeonRoomType.forNumber(var1);
      }
   };
   private static final DungeonRoomType[] VALUES = values();
   private final int value;

   @Override
   public final int getNumber() {
      if (this == UNRECOGNIZED) {
         throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
      } else {
         return this.value;
      }
   }

   @Deprecated
   public static DungeonRoomType valueOf(int var0) {
      return forNumber(var0);
   }

   public static DungeonRoomType forNumber(int var0) {
      switch (var0) {
         case 0:
            return DUNGEON_ROOM_TYPE_UNSPECIFIED;
         case 1:
            return DUNGEON_ROOM_TYPE_SPAWN;
         case 2:
            return DUNGEON_ROOM_TYPE_CLEAR;
         case 3:
            return DUNGEON_ROOM_TYPE_MINIBOSS;
         case 4:
            return DUNGEON_ROOM_TYPE_PUZZLE;
         case 5:
            return DUNGEON_ROOM_TYPE_TRAP;
         case 6:
            return DUNGEON_ROOM_TYPE_FAIRY;
         case 7:
            return DUNGEON_ROOM_TYPE_BLOOD;
         case 8:
            return DUNGEON_ROOM_TYPE_BOSS;
         case 9:
            return DUNGEON_ROOM_TYPE_UNKNOWN;
         case 10:
            return DUNGEON_ROOM_TYPE_WITHER_DOOR;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<DungeonRoomType> internalGetValueMap() {
      return internalValueMap;
   }

   @Override
   public final Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
         throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
      } else {
         return getDescriptor().getValues().get(this.ordinal());
      }
   }

   @Override
   public final Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
   }

   public static final Descriptors.EnumDescriptor getDescriptor() {
      return CommonProto.getDescriptor().getEnumTypes().get(0);
   }

   public static DungeonRoomType valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   DungeonRoomType(int var3) {
      this.value = var3;
   }
}
