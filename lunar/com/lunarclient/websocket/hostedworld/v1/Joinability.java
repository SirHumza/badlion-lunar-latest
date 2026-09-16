package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum Joinability implements ProtocolMessageEnum {
   JOINABILITY_UNSPECIFIED(0),
   JOINABILITY_ALLOWED(1),
   JOINABILITY_WORLD_FULL(2),
   JOINABILITY_INCOMPATIBLE_MINECRAFT_VERSION(3),
   UNRECOGNIZED(-1);

   public static final int JOINABILITY_UNSPECIFIED_VALUE = 0;
   public static final int JOINABILITY_ALLOWED_VALUE = 1;
   public static final int JOINABILITY_WORLD_FULL_VALUE = 2;
   public static final int JOINABILITY_INCOMPATIBLE_MINECRAFT_VERSION_VALUE = 3;
   private static final Internal.EnumLiteMap<Joinability> internalValueMap = new Internal.EnumLiteMap<Joinability>() {
      public Joinability findValueByNumber(int var1) {
         return Joinability.forNumber(var1);
      }
   };
   private static final Joinability[] VALUES = values();
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
   public static Joinability valueOf(int var0) {
      return forNumber(var0);
   }

   public static Joinability forNumber(int var0) {
      switch (var0) {
         case 0:
            return JOINABILITY_UNSPECIFIED;
         case 1:
            return JOINABILITY_ALLOWED;
         case 2:
            return JOINABILITY_WORLD_FULL;
         case 3:
            return JOINABILITY_INCOMPATIBLE_MINECRAFT_VERSION;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<Joinability> internalGetValueMap() {
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
      return CommonProto.getDescriptor().getEnumTypes().get(1);
   }

   public static Joinability valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   Joinability(int var3) {
      this.value = var3;
   }
}
