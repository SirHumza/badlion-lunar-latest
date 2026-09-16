package com.lunarclient.websocket.skyblock.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum DungeonRoomRotation implements ProtocolMessageEnum {
   DUNGEON_ROOM_ROTATION_UNSPECIFIED(0),
   DUNGEON_ROOM_ROTATION_EAST(1),
   DUNGEON_ROOM_ROTATION_SOUTH(2),
   DUNGEON_ROOM_ROTATION_WEST(3),
   DUNGEON_ROOM_ROTATION_NORTH(4),
   UNRECOGNIZED(-1);

   public static final int DUNGEON_ROOM_ROTATION_UNSPECIFIED_VALUE = 0;
   public static final int DUNGEON_ROOM_ROTATION_EAST_VALUE = 1;
   public static final int DUNGEON_ROOM_ROTATION_SOUTH_VALUE = 2;
   public static final int DUNGEON_ROOM_ROTATION_WEST_VALUE = 3;
   public static final int DUNGEON_ROOM_ROTATION_NORTH_VALUE = 4;
   private static final Internal.EnumLiteMap<DungeonRoomRotation> internalValueMap = new Internal.EnumLiteMap<DungeonRoomRotation>() {
      public DungeonRoomRotation findValueByNumber(int var1) {
         return DungeonRoomRotation.forNumber(var1);
      }
   };
   private static final DungeonRoomRotation[] VALUES = values();
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
   public static DungeonRoomRotation valueOf(int var0) {
      return forNumber(var0);
   }

   public static DungeonRoomRotation forNumber(int var0) {
      switch (var0) {
         case 0:
            return DUNGEON_ROOM_ROTATION_UNSPECIFIED;
         case 1:
            return DUNGEON_ROOM_ROTATION_EAST;
         case 2:
            return DUNGEON_ROOM_ROTATION_SOUTH;
         case 3:
            return DUNGEON_ROOM_ROTATION_WEST;
         case 4:
            return DUNGEON_ROOM_ROTATION_NORTH;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<DungeonRoomRotation> internalGetValueMap() {
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
      return CommonProto.getDescriptor().getEnumTypes().get(1);
   }

   public static DungeonRoomRotation valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   DungeonRoomRotation(int var3) {
      this.value = var3;
   }
}
