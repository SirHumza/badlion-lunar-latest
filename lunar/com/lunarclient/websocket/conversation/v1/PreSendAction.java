package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum PreSendAction implements ProtocolMessageEnum {
   PRE_SEND_ACTION_UNSPECIFIED(0),
   PRE_SEND_ACTION_NONE(1),
   PRE_SEND_ACTION_TYPING(2),
   UNRECOGNIZED(-1);

   public static final int PRE_SEND_ACTION_UNSPECIFIED_VALUE = 0;
   public static final int PRE_SEND_ACTION_NONE_VALUE = 1;
   public static final int PRE_SEND_ACTION_TYPING_VALUE = 2;
   private static final Internal.EnumLiteMap<PreSendAction> internalValueMap = new Internal.EnumLiteMap<PreSendAction>() {
      public PreSendAction findValueByNumber(int var1) {
         return PreSendAction.forNumber(var1);
      }
   };
   private static final PreSendAction[] VALUES = values();
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
   public static PreSendAction valueOf(int var0) {
      return forNumber(var0);
   }

   public static PreSendAction forNumber(int var0) {
      switch (var0) {
         case 0:
            return PRE_SEND_ACTION_UNSPECIFIED;
         case 1:
            return PRE_SEND_ACTION_NONE;
         case 2:
            return PRE_SEND_ACTION_TYPING;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<PreSendAction> internalGetValueMap() {
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

   public static PreSendAction valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   PreSendAction(int var3) {
      this.value = var3;
   }
}
