package com.lunarclient.websocket.screenshot.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum PlayerState implements ProtocolMessageEnum {
   PLAYER_STATE_UNSPECIFIED(0),
   PLAYER_STATE_SLEEPING(1),
   PLAYER_STATE_ELYTRA_FLYING(2),
   PLAYER_STATE_FLYING(3),
   PLAYER_STATE_SPRINTING(4),
   PLAYER_STATE_SNEAKING(5),
   PLAYER_STATE_SWIMMING(6),
   PLAYER_STATE_RIDING(7),
   PLAYER_STATE_JUMPING(8),
   PLAYER_STATE_FALLING(9),
   PLAYER_STATE_WALKING(10),
   PLAYER_STATE_STANDING(11),
   UNRECOGNIZED(-1);

   public static final int PLAYER_STATE_UNSPECIFIED_VALUE = 0;
   public static final int PLAYER_STATE_SLEEPING_VALUE = 1;
   public static final int PLAYER_STATE_ELYTRA_FLYING_VALUE = 2;
   public static final int PLAYER_STATE_FLYING_VALUE = 3;
   public static final int PLAYER_STATE_SPRINTING_VALUE = 4;
   public static final int PLAYER_STATE_SNEAKING_VALUE = 5;
   public static final int PLAYER_STATE_SWIMMING_VALUE = 6;
   public static final int PLAYER_STATE_RIDING_VALUE = 7;
   public static final int PLAYER_STATE_JUMPING_VALUE = 8;
   public static final int PLAYER_STATE_FALLING_VALUE = 9;
   public static final int PLAYER_STATE_WALKING_VALUE = 10;
   public static final int PLAYER_STATE_STANDING_VALUE = 11;
   private static final Internal.EnumLiteMap<PlayerState> internalValueMap = new Internal.EnumLiteMap<PlayerState>() {
      public PlayerState findValueByNumber(int var1) {
         return PlayerState.forNumber(var1);
      }
   };
   private static final PlayerState[] VALUES = values();
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
   public static PlayerState valueOf(int var0) {
      return forNumber(var0);
   }

   public static PlayerState forNumber(int var0) {
      switch (var0) {
         case 0:
            return PLAYER_STATE_UNSPECIFIED;
         case 1:
            return PLAYER_STATE_SLEEPING;
         case 2:
            return PLAYER_STATE_ELYTRA_FLYING;
         case 3:
            return PLAYER_STATE_FLYING;
         case 4:
            return PLAYER_STATE_SPRINTING;
         case 5:
            return PLAYER_STATE_SNEAKING;
         case 6:
            return PLAYER_STATE_SWIMMING;
         case 7:
            return PLAYER_STATE_RIDING;
         case 8:
            return PLAYER_STATE_JUMPING;
         case 9:
            return PLAYER_STATE_FALLING;
         case 10:
            return PLAYER_STATE_WALKING;
         case 11:
            return PLAYER_STATE_STANDING;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<PlayerState> internalGetValueMap() {
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

   public static PlayerState valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   PlayerState(int var3) {
      this.value = var3;
   }
}
