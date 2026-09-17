package com.lunarclient.websocket.promotion.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum PendingRewardType implements ProtocolMessageEnum {
   PENDING_REWARD_TYPE_UNSPECIFIED(0),
   PENDING_REWARD_TYPE_MEDAL(1),
   UNRECOGNIZED(-1);

   public static final int PENDING_REWARD_TYPE_UNSPECIFIED_VALUE = 0;
   public static final int PENDING_REWARD_TYPE_MEDAL_VALUE = 1;
   private static final Internal.EnumLiteMap<PendingRewardType> internalValueMap = new Internal.EnumLiteMap<PendingRewardType>() {
      public PendingRewardType findValueByNumber(int var1) {
         return PendingRewardType.forNumber(var1);
      }
   };
   private static final PendingRewardType[] VALUES = values();
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
   public static PendingRewardType valueOf(int var0) {
      return forNumber(var0);
   }

   public static PendingRewardType forNumber(int var0) {
      switch (var0) {
         case 0:
            return PENDING_REWARD_TYPE_UNSPECIFIED;
         case 1:
            return PENDING_REWARD_TYPE_MEDAL;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<PendingRewardType> internalGetValueMap() {
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

   public static PendingRewardType valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   PendingRewardType(int var3) {
      this.value = var3;
   }
}
