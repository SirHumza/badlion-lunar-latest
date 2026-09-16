package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum Role implements ProtocolMessageEnum {
   ROLE_UNSPECIFIED(0),
   ROLE_NONE(1),
   ROLE_HOST(2),
   UNRECOGNIZED(-1);

   public static final int ROLE_UNSPECIFIED_VALUE = 0;
   public static final int ROLE_NONE_VALUE = 1;
   public static final int ROLE_HOST_VALUE = 2;
   private static final Internal.EnumLiteMap<Role> internalValueMap = new Internal.EnumLiteMap<Role>() {
      public Role findValueByNumber(int var1) {
         return Role.forNumber(var1);
      }
   };
   private static final Role[] VALUES = values();
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
   public static Role valueOf(int var0) {
      return forNumber(var0);
   }

   public static Role forNumber(int var0) {
      switch (var0) {
         case 0:
            return ROLE_UNSPECIFIED;
         case 1:
            return ROLE_NONE;
         case 2:
            return ROLE_HOST;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<Role> internalGetValueMap() {
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
      return CommonProto.getDescriptor().getEnumTypes().get(2);
   }

   public static Role valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   Role(int var3) {
      this.value = var3;
   }
}
