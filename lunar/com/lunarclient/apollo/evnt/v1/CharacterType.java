package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum CharacterType implements ProtocolMessageEnum {
   CHARACTER_TYPE_UNSPECIFIED(0),
   CHARACTER_TYPE_ANGEL(1),
   CHARACTER_TYPE_AXEL(2),
   CHARACTER_TYPE_BANJAX(3),
   CHARACTER_TYPE_DAEDRA(4),
   CHARACTER_TYPE_FROSKA(5),
   CHARACTER_TYPE_GRANNY(6),
   CHARACTER_TYPE_GREAT_MAGE(7),
   CHARACTER_TYPE_IGNUS(8),
   CHARACTER_TYPE_TULABOT(9),
   CHARACTER_TYPE_SIR_BLOCK(10),
   CHARACTER_TYPE_HARMONY(11),
   UNRECOGNIZED(-1);

   public static final int CHARACTER_TYPE_UNSPECIFIED_VALUE = 0;
   public static final int CHARACTER_TYPE_ANGEL_VALUE = 1;
   public static final int CHARACTER_TYPE_AXEL_VALUE = 2;
   public static final int CHARACTER_TYPE_BANJAX_VALUE = 3;
   public static final int CHARACTER_TYPE_DAEDRA_VALUE = 4;
   public static final int CHARACTER_TYPE_FROSKA_VALUE = 5;
   public static final int CHARACTER_TYPE_GRANNY_VALUE = 6;
   public static final int CHARACTER_TYPE_GREAT_MAGE_VALUE = 7;
   public static final int CHARACTER_TYPE_IGNUS_VALUE = 8;
   public static final int CHARACTER_TYPE_TULABOT_VALUE = 9;
   public static final int CHARACTER_TYPE_SIR_BLOCK_VALUE = 10;
   public static final int CHARACTER_TYPE_HARMONY_VALUE = 11;
   private static final Internal.EnumLiteMap<CharacterType> internalValueMap = new Internal.EnumLiteMap<CharacterType>() {
      public CharacterType findValueByNumber(int var1) {
         return CharacterType.forNumber(var1);
      }
   };
   private static final CharacterType[] VALUES = values();
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
   public static CharacterType valueOf(int var0) {
      return forNumber(var0);
   }

   public static CharacterType forNumber(int var0) {
      switch (var0) {
         case 0:
            return CHARACTER_TYPE_UNSPECIFIED;
         case 1:
            return CHARACTER_TYPE_ANGEL;
         case 2:
            return CHARACTER_TYPE_AXEL;
         case 3:
            return CHARACTER_TYPE_BANJAX;
         case 4:
            return CHARACTER_TYPE_DAEDRA;
         case 5:
            return CHARACTER_TYPE_FROSKA;
         case 6:
            return CHARACTER_TYPE_GRANNY;
         case 7:
            return CHARACTER_TYPE_GREAT_MAGE;
         case 8:
            return CHARACTER_TYPE_IGNUS;
         case 9:
            return CHARACTER_TYPE_TULABOT;
         case 10:
            return CHARACTER_TYPE_SIR_BLOCK;
         case 11:
            return CHARACTER_TYPE_HARMONY;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<CharacterType> internalGetValueMap() {
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
      return CharacterProto.getDescriptor().getEnumTypes().get(0);
   }

   public static CharacterType valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   CharacterType(int var3) {
      this.value = var3;
   }
}
