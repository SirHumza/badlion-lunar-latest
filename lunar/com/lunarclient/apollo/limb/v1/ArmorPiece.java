package com.lunarclient.apollo.limb.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum ArmorPiece implements ProtocolMessageEnum {
   ARMOR_PIECE_UNSPECIFIED(0),
   ARMOR_PIECE_HELMET(1),
   ARMOR_PIECE_CHESTPLATE(2),
   ARMOR_PIECE_LEGGINGS(3),
   ARMOR_PIECE_BOOTS(4),
   UNRECOGNIZED(-1);

   public static final int ARMOR_PIECE_UNSPECIFIED_VALUE = 0;
   public static final int ARMOR_PIECE_HELMET_VALUE = 1;
   public static final int ARMOR_PIECE_CHESTPLATE_VALUE = 2;
   public static final int ARMOR_PIECE_LEGGINGS_VALUE = 3;
   public static final int ARMOR_PIECE_BOOTS_VALUE = 4;
   private static final Internal.EnumLiteMap<ArmorPiece> internalValueMap = new Internal.EnumLiteMap<ArmorPiece>() {
      public ArmorPiece findValueByNumber(int var1) {
         return ArmorPiece.forNumber(var1);
      }
   };
   private static final ArmorPiece[] VALUES = values();
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
   public static ArmorPiece valueOf(int var0) {
      return forNumber(var0);
   }

   public static ArmorPiece forNumber(int var0) {
      switch (var0) {
         case 0:
            return ARMOR_PIECE_UNSPECIFIED;
         case 1:
            return ARMOR_PIECE_HELMET;
         case 2:
            return ARMOR_PIECE_CHESTPLATE;
         case 3:
            return ARMOR_PIECE_LEGGINGS;
         case 4:
            return ARMOR_PIECE_BOOTS;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<ArmorPiece> internalGetValueMap() {
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
      return SchemaProto.getDescriptor().getEnumTypes().get(0);
   }

   public static ArmorPiece valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   ArmorPiece(int var3) {
      this.value = var3;
   }
}
