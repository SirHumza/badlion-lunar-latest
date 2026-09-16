package com.lunarclient.apollo.button.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum ButtonClientAction implements ProtocolMessageEnum {
   BUTTON_CLIENT_ACTION_UNSPECIFIED(0),
   BUTTON_CLIENT_ACTION_OPEN_MINIMAP_VIEW(1),
   BUTTON_CLIENT_ACTION_OPEN_WAYPOINTS_MENU(2),
   UNRECOGNIZED(-1);

   public static final int BUTTON_CLIENT_ACTION_UNSPECIFIED_VALUE = 0;
   public static final int BUTTON_CLIENT_ACTION_OPEN_MINIMAP_VIEW_VALUE = 1;
   public static final int BUTTON_CLIENT_ACTION_OPEN_WAYPOINTS_MENU_VALUE = 2;
   private static final Internal.EnumLiteMap<ButtonClientAction> internalValueMap = new Internal.EnumLiteMap<ButtonClientAction>() {
      public ButtonClientAction findValueByNumber(int var1) {
         return ButtonClientAction.forNumber(var1);
      }
   };
   private static final ButtonClientAction[] VALUES = values();
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
   public static ButtonClientAction valueOf(int var0) {
      return forNumber(var0);
   }

   public static ButtonClientAction forNumber(int var0) {
      switch (var0) {
         case 0:
            return BUTTON_CLIENT_ACTION_UNSPECIFIED;
         case 1:
            return BUTTON_CLIENT_ACTION_OPEN_MINIMAP_VIEW;
         case 2:
            return BUTTON_CLIENT_ACTION_OPEN_WAYPOINTS_MENU;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<ButtonClientAction> internalGetValueMap() {
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
      return ButtonProto.getDescriptor().getEnumTypes().get(1);
   }

   public static ButtonClientAction valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   ButtonClientAction(int var3) {
      this.value = var3;
   }
}
