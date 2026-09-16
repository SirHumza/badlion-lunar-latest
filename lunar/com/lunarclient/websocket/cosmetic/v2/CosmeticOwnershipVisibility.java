package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum CosmeticOwnershipVisibility implements ProtocolMessageEnum {
   COSMETIC_OWNERSHIP_VISIBILITY_UNSPECIFIED(0),
   COSMETIC_OWNERSHIP_VISIBILITY_FRIENDS(1),
   COSMETIC_OWNERSHIP_VISIBILITY_NOONE(2),
   COSMETIC_OWNERSHIP_VISIBILITY_EVERYONE(3),
   UNRECOGNIZED(-1);

   public static final int COSMETIC_OWNERSHIP_VISIBILITY_UNSPECIFIED_VALUE = 0;
   public static final int COSMETIC_OWNERSHIP_VISIBILITY_FRIENDS_VALUE = 1;
   public static final int COSMETIC_OWNERSHIP_VISIBILITY_NOONE_VALUE = 2;
   public static final int COSMETIC_OWNERSHIP_VISIBILITY_EVERYONE_VALUE = 3;
   private static final Internal.EnumLiteMap<CosmeticOwnershipVisibility> internalValueMap = new Internal.EnumLiteMap<CosmeticOwnershipVisibility>() {
      public CosmeticOwnershipVisibility findValueByNumber(int var1) {
         return CosmeticOwnershipVisibility.forNumber(var1);
      }
   };
   private static final CosmeticOwnershipVisibility[] VALUES = values();
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
   public static CosmeticOwnershipVisibility valueOf(int var0) {
      return forNumber(var0);
   }

   public static CosmeticOwnershipVisibility forNumber(int var0) {
      switch (var0) {
         case 0:
            return COSMETIC_OWNERSHIP_VISIBILITY_UNSPECIFIED;
         case 1:
            return COSMETIC_OWNERSHIP_VISIBILITY_FRIENDS;
         case 2:
            return COSMETIC_OWNERSHIP_VISIBILITY_NOONE;
         case 3:
            return COSMETIC_OWNERSHIP_VISIBILITY_EVERYONE;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<CosmeticOwnershipVisibility> internalGetValueMap() {
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

   public static CosmeticOwnershipVisibility valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   CosmeticOwnershipVisibility(int var3) {
      this.value = var3;
   }
}
