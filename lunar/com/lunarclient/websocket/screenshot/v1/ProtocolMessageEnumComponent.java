package com.lunarclient.websocket.screenshot.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum Perspective implements ProtocolMessageEnum {
   PERSPECTIVE_UNSPECIFIED(0),
   PERSPECTIVE_FIRST(1),
   PERSPECTIVE_BACK(2),
   PERSPECTIVE_FRONT(3),
   UNRECOGNIZED(-1);

   public static final int PERSPECTIVE_UNSPECIFIED_VALUE = 0;
   public static final int PERSPECTIVE_FIRST_VALUE = 1;
   public static final int PERSPECTIVE_BACK_VALUE = 2;
   public static final int PERSPECTIVE_FRONT_VALUE = 3;
   private static final Internal.EnumLiteMap<Perspective> internalValueMap = new Internal.EnumLiteMap<Perspective>() {
      public Perspective findValueByNumber(int var1) {
         return Perspective.forNumber(var1);
      }
   };
   private static final Perspective[] VALUES = values();
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
   public static Perspective valueOf(int var0) {
      return forNumber(var0);
   }

   public static Perspective forNumber(int var0) {
      switch (var0) {
         case 0:
            return PERSPECTIVE_UNSPECIFIED;
         case 1:
            return PERSPECTIVE_FIRST;
         case 2:
            return PERSPECTIVE_BACK;
         case 3:
            return PERSPECTIVE_FRONT;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<Perspective> internalGetValueMap() {
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

   public static Perspective valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   Perspective(int var3) {
      this.value = var3;
   }
}
