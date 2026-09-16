package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum InvitePolicy implements ProtocolMessageEnum {
   INVITE_POLICY_UNSPECIFIED(0),
   INVITE_POLICY_EVERYONE(1),
   INVITE_POLICY_OWNER(2),
   UNRECOGNIZED(-1);

   public static final int INVITE_POLICY_UNSPECIFIED_VALUE = 0;
   public static final int INVITE_POLICY_EVERYONE_VALUE = 1;
   public static final int INVITE_POLICY_OWNER_VALUE = 2;
   private static final Internal.EnumLiteMap<InvitePolicy> internalValueMap = new Internal.EnumLiteMap<InvitePolicy>() {
      public InvitePolicy findValueByNumber(int var1) {
         return InvitePolicy.forNumber(var1);
      }
   };
   private static final InvitePolicy[] VALUES = values();
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
   public static InvitePolicy valueOf(int var0) {
      return forNumber(var0);
   }

   public static InvitePolicy forNumber(int var0) {
      switch (var0) {
         case 0:
            return INVITE_POLICY_UNSPECIFIED;
         case 1:
            return INVITE_POLICY_EVERYONE;
         case 2:
            return INVITE_POLICY_OWNER;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<InvitePolicy> internalGetValueMap() {
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
      return CommonProto.getDescriptor().getEnumTypes().get(3);
   }

   public static InvitePolicy valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   InvitePolicy(int var3) {
      this.value = var3;
   }
}
