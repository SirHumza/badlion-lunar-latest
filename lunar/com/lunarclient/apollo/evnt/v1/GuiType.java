package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum GuiType implements ProtocolMessageEnum {
   GUI_TYPE_UNSPECIFIED(0),
   GUI_TYPE_SUIT(1),
   GUI_TYPE_CHARACTER_SELECTION(2),
   GUI_TYPE_OBSERVER_UI(3),
   GUI_TYPE_WELCOME_UI(4),
   GUI_TYPE_ESC(5),
   GUI_TYPE_PLAYER_INVENTORY(6),
   UNRECOGNIZED(-1);

   public static final int GUI_TYPE_UNSPECIFIED_VALUE = 0;
   public static final int GUI_TYPE_SUIT_VALUE = 1;
   public static final int GUI_TYPE_CHARACTER_SELECTION_VALUE = 2;
   public static final int GUI_TYPE_OBSERVER_UI_VALUE = 3;
   public static final int GUI_TYPE_WELCOME_UI_VALUE = 4;
   public static final int GUI_TYPE_ESC_VALUE = 5;
   public static final int GUI_TYPE_PLAYER_INVENTORY_VALUE = 6;
   private static final Internal.EnumLiteMap<GuiType> internalValueMap = new Internal.EnumLiteMap<GuiType>() {
      public GuiType findValueByNumber(int var1) {
         return GuiType.forNumber(var1);
      }
   };
   private static final GuiType[] VALUES = values();
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
   public static GuiType valueOf(int var0) {
      return forNumber(var0);
   }

   public static GuiType forNumber(int var0) {
      switch (var0) {
         case 0:
            return GUI_TYPE_UNSPECIFIED;
         case 1:
            return GUI_TYPE_SUIT;
         case 2:
            return GUI_TYPE_CHARACTER_SELECTION;
         case 3:
            return GUI_TYPE_OBSERVER_UI;
         case 4:
            return GUI_TYPE_WELCOME_UI;
         case 5:
            return GUI_TYPE_ESC;
         case 6:
            return GUI_TYPE_PLAYER_INVENTORY;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<GuiType> internalGetValueMap() {
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
      return GuiProto.getDescriptor().getEnumTypes().get(0);
   }

   public static GuiType valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   GuiType(int var3) {
      this.value = var3;
   }
}
