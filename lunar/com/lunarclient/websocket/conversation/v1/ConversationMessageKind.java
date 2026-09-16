package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum ConversationMessageKind implements ProtocolMessageEnum {
   CONVERSATION_MESSAGE_KIND_UNSPECIFIED(0),
   CONVERSATION_MESSAGE_KIND_USER(1),
   CONVERSATION_MESSAGE_KIND_SYSTEM(2),
   UNRECOGNIZED(-1);

   public static final int CONVERSATION_MESSAGE_KIND_UNSPECIFIED_VALUE = 0;
   public static final int CONVERSATION_MESSAGE_KIND_USER_VALUE = 1;
   public static final int CONVERSATION_MESSAGE_KIND_SYSTEM_VALUE = 2;
   private static final Internal.EnumLiteMap<ConversationMessageKind> internalValueMap = new Internal.EnumLiteMap<ConversationMessageKind>() {
      public ConversationMessageKind findValueByNumber(int var1) {
         return ConversationMessageKind.forNumber(var1);
      }
   };
   private static final ConversationMessageKind[] VALUES = values();
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
   public static ConversationMessageKind valueOf(int var0) {
      return forNumber(var0);
   }

   public static ConversationMessageKind forNumber(int var0) {
      switch (var0) {
         case 0:
            return CONVERSATION_MESSAGE_KIND_UNSPECIFIED;
         case 1:
            return CONVERSATION_MESSAGE_KIND_USER;
         case 2:
            return CONVERSATION_MESSAGE_KIND_SYSTEM;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<ConversationMessageKind> internalGetValueMap() {
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

   public static ConversationMessageKind valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   ConversationMessageKind(int var3) {
      this.value = var3;
   }
}
