package com.lunarclient.apollo.player.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum EmbeddedCheckoutSupport implements ProtocolMessageEnum {
   EMBEDDED_CHECKOUT_SUPPORT_UNSPECIFIED(0),
   EMBEDDED_CHECKOUT_SUPPORT_OVERLAY(1),
   EMBEDDED_CHECKOUT_SUPPORT_WINDOW(2),
   UNRECOGNIZED(-1);

   public static final int EMBEDDED_CHECKOUT_SUPPORT_UNSPECIFIED_VALUE = 0;
   public static final int EMBEDDED_CHECKOUT_SUPPORT_OVERLAY_VALUE = 1;
   public static final int EMBEDDED_CHECKOUT_SUPPORT_WINDOW_VALUE = 2;
   private static final Internal.EnumLiteMap<EmbeddedCheckoutSupport> internalValueMap = new Internal.EnumLiteMap<EmbeddedCheckoutSupport>() {
      public EmbeddedCheckoutSupport findValueByNumber(int var1) {
         return EmbeddedCheckoutSupport.forNumber(var1);
      }
   };
   private static final EmbeddedCheckoutSupport[] VALUES = values();
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
   public static EmbeddedCheckoutSupport valueOf(int var0) {
      return forNumber(var0);
   }

   public static EmbeddedCheckoutSupport forNumber(int var0) {
      switch (var0) {
         case 0:
            return EMBEDDED_CHECKOUT_SUPPORT_UNSPECIFIED;
         case 1:
            return EMBEDDED_CHECKOUT_SUPPORT_OVERLAY;
         case 2:
            return EMBEDDED_CHECKOUT_SUPPORT_WINDOW;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<EmbeddedCheckoutSupport> internalGetValueMap() {
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
      return HandshakeProto.getDescriptor().getEnumTypes().get(0);
   }

   public static EmbeddedCheckoutSupport valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   EmbeddedCheckoutSupport(int var3) {
      this.value = var3;
   }
}
