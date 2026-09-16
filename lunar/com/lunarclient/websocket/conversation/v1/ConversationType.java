package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum ConversationType implements ProtocolMessageEnum {
   CONVERSATION_TYPE_UNSPECIFIED(0),
   CONVERSATION_TYPE_FRIEND(1),
   CONVERSATION_TYPE_GROUP_CHAT(2),
   UNRECOGNIZED(-1);

   public static final int CONVERSATION_TYPE_UNSPECIFIED_VALUE = 0;
   public static final int CONVERSATION_TYPE_FRIEND_VALUE = 1;
   public static final int CONVERSATION_TYPE_GROUP_CHAT_VALUE = 2;
   private static final Internal.EnumLiteMap<ConversationType> internalValueMap = new Internal.EnumLiteMap<ConversationType>() {
      public ConversationType findValueByNumber(int var1) {
         return ConversationType.forNumber(var1);
      }
   };
   private static final ConversationType[] VALUES = values();
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
   public static ConversationType valueOf(int var0) {
      return forNumber(var0);
   }

   public static ConversationType forNumber(int var0) {
      switch (var0) {
         case 0:
            return CONVERSATION_TYPE_UNSPECIFIED;
         case 1:
            return CONVERSATION_TYPE_FRIEND;
         case 2:
            return CONVERSATION_TYPE_GROUP_CHAT;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<ConversationType> internalGetValueMap() {
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

   public static ConversationType valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   ConversationType(int var3) {
      this.value = var3;
   }
}
