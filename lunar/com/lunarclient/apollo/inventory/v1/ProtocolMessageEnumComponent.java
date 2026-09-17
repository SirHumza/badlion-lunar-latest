package com.lunarclient.apollo.inventory.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum InventoryButtonBox implements ProtocolMessageEnum {
   INVENTORY_BUTTON_BOX_UNSPECIFIED(0),
   INVENTORY_BUTTON_BOX_LEFT(1),
   INVENTORY_BUTTON_BOX_RIGHT(2),
   UNRECOGNIZED(-1);

   public static final int INVENTORY_BUTTON_BOX_UNSPECIFIED_VALUE = 0;
   public static final int INVENTORY_BUTTON_BOX_LEFT_VALUE = 1;
   public static final int INVENTORY_BUTTON_BOX_RIGHT_VALUE = 2;
   private static final Internal.EnumLiteMap<InventoryButtonBox> internalValueMap = new Internal.EnumLiteMap<InventoryButtonBox>() {
      public InventoryButtonBox findValueByNumber(int var1) {
         return InventoryButtonBox.forNumber(var1);
      }
   };
   private static final InventoryButtonBox[] VALUES = values();
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
   public static InventoryButtonBox valueOf(int var0) {
      return forNumber(var0);
   }

   public static InventoryButtonBox forNumber(int var0) {
      switch (var0) {
         case 0:
            return INVENTORY_BUTTON_BOX_UNSPECIFIED;
         case 1:
            return INVENTORY_BUTTON_BOX_LEFT;
         case 2:
            return INVENTORY_BUTTON_BOX_RIGHT;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<InventoryButtonBox> internalGetValueMap() {
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

   public static InventoryButtonBox valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   InventoryButtonBox(int var3) {
      this.value = var3;
   }
}
