package com.lunarclient.apollo.inventory.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum InventoryType implements ProtocolMessageEnum {
   INVENTORY_TYPE_UNSPECIFIED(0),
   INVENTORY_TYPE_PLAYER(1),
   UNRECOGNIZED(-1);

   public static final int INVENTORY_TYPE_UNSPECIFIED_VALUE = 0;
   public static final int INVENTORY_TYPE_PLAYER_VALUE = 1;
   private static final Internal.EnumLiteMap<InventoryType> internalValueMap = new Internal.EnumLiteMap<InventoryType>() {
      public InventoryType findValueByNumber(int var1) {
         return InventoryType.forNumber(var1);
      }
   };
   private static final InventoryType[] VALUES = values();
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
   public static InventoryType valueOf(int var0) {
      return forNumber(var0);
   }

   public static InventoryType forNumber(int var0) {
      switch (var0) {
         case 0:
            return INVENTORY_TYPE_UNSPECIFIED;
         case 1:
            return INVENTORY_TYPE_PLAYER;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<InventoryType> internalGetValueMap() {
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
      return SchemaProto.getDescriptor().getEnumTypes().get(1);
   }

   public static InventoryType valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   InventoryType(int var3) {
      this.value = var3;
   }
}
