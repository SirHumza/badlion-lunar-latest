package com.lunarclient.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum Direction implements ProtocolMessageEnum {
   DIRECTION_UNSPECIFIED(0),
   DIRECTION_DOWN(1),
   DIRECTION_UP(2),
   DIRECTION_NORTH(3),
   DIRECTION_SOUTH(4),
   DIRECTION_WEST(5),
   DIRECTION_EAST(6),
   UNRECOGNIZED(-1);

   public static final int DIRECTION_UNSPECIFIED_VALUE = 0;
   public static final int DIRECTION_DOWN_VALUE = 1;
   public static final int DIRECTION_UP_VALUE = 2;
   public static final int DIRECTION_NORTH_VALUE = 3;
   public static final int DIRECTION_SOUTH_VALUE = 4;
   public static final int DIRECTION_WEST_VALUE = 5;
   public static final int DIRECTION_EAST_VALUE = 6;
   private static final Internal.EnumLiteMap<Direction> internalValueMap = new Internal.EnumLiteMap<Direction>() {
      public Direction findValueByNumber(int var1) {
         return Direction.forNumber(var1);
      }
   };
   private static final Direction[] VALUES = values();
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
   public static Direction valueOf(int var0) {
      return forNumber(var0);
   }

   public static Direction forNumber(int var0) {
      switch (var0) {
         case 0:
            return DIRECTION_UNSPECIFIED;
         case 1:
            return DIRECTION_DOWN;
         case 2:
            return DIRECTION_UP;
         case 3:
            return DIRECTION_NORTH;
         case 4:
            return DIRECTION_SOUTH;
         case 5:
            return DIRECTION_WEST;
         case 6:
            return DIRECTION_EAST;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<Direction> internalGetValueMap() {
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
      return PositionProto.getDescriptor().getEnumTypes().get(0);
   }

   public static Direction valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   Direction(int var3) {
      this.value = var3;
   }
}
