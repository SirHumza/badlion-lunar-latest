package com.lunarclient.websocket.protocol.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum AllowedSender implements ProtocolMessageEnum {
   ALLOWED_SENDER_UNSPECIFIED(0),
   ALLOWED_SENDER_AUTHENTICATED_GAME(1),
   ALLOWED_SENDER_AUTHENTICATED_LAUNCHER(2),
   ALLOWED_SENDER_AUTHENTICATED_GAME_OR_LAUNCHER(3),
   UNRECOGNIZED(-1);

   public static final int ALLOWED_SENDER_UNSPECIFIED_VALUE = 0;
   public static final int ALLOWED_SENDER_AUTHENTICATED_GAME_VALUE = 1;
   public static final int ALLOWED_SENDER_AUTHENTICATED_LAUNCHER_VALUE = 2;
   public static final int ALLOWED_SENDER_AUTHENTICATED_GAME_OR_LAUNCHER_VALUE = 3;
   private static final Internal.EnumLiteMap<AllowedSender> internalValueMap = new Internal.EnumLiteMap<AllowedSender>() {
      public AllowedSender findValueByNumber(int var1) {
         return AllowedSender.forNumber(var1);
      }
   };
   private static final AllowedSender[] VALUES = values();
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
   public static AllowedSender valueOf(int var0) {
      return forNumber(var0);
   }

   public static AllowedSender forNumber(int var0) {
      switch (var0) {
         case 0:
            return ALLOWED_SENDER_UNSPECIFIED;
         case 1:
            return ALLOWED_SENDER_AUTHENTICATED_GAME;
         case 2:
            return ALLOWED_SENDER_AUTHENTICATED_LAUNCHER;
         case 3:
            return ALLOWED_SENDER_AUTHENTICATED_GAME_OR_LAUNCHER;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<AllowedSender> internalGetValueMap() {
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

   public static AllowedSender valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   AllowedSender(int var3) {
      this.value = var3;
   }
}
