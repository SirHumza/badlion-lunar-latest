package com.lunarclient.apollo.button.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum ButtonShape implements ProtocolMessageEnum {
   BUTTON_SHAPE_UNSPECIFIED(0),
   BUTTON_SHAPE_ROUNDED_SQUARE(1),
   BUTTON_SHAPE_CIRCLE(2),
   UNRECOGNIZED(-1);

   public static final int BUTTON_SHAPE_UNSPECIFIED_VALUE = 0;
   public static final int BUTTON_SHAPE_ROUNDED_SQUARE_VALUE = 1;
   public static final int BUTTON_SHAPE_CIRCLE_VALUE = 2;
   private static final Internal.EnumLiteMap<ButtonShape> internalValueMap = new Internal.EnumLiteMap<ButtonShape>() {
      public ButtonShape findValueByNumber(int var1) {
         return ButtonShape.forNumber(var1);
      }
   };
   private static final ButtonShape[] VALUES = values();
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
   public static ButtonShape valueOf(int var0) {
      return forNumber(var0);
   }

   public static ButtonShape forNumber(int var0) {
      switch (var0) {
         case 0:
            return BUTTON_SHAPE_UNSPECIFIED;
         case 1:
            return BUTTON_SHAPE_ROUNDED_SQUARE;
         case 2:
            return BUTTON_SHAPE_CIRCLE;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<ButtonShape> internalGetValueMap() {
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
      return ButtonProto.getDescriptor().getEnumTypes().get(0);
   }

   public static ButtonShape valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   ButtonShape(int var3) {
      this.value = var3;
   }
}
