package com.lunarclient.gameipc.promotion.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum PromotionType implements ProtocolMessageEnum {
   PROMOTION_TYPE_UNSPECIFIED(0),
   PROMOTION_TYPE_VIDEO(1),
   PROMOTION_TYPE_OUTPLAYED(2),
   PROMOTION_TYPE_MEDAL(3),
   UNRECOGNIZED(-1);

   public static final int PROMOTION_TYPE_UNSPECIFIED_VALUE = 0;
   public static final int PROMOTION_TYPE_VIDEO_VALUE = 1;
   public static final int PROMOTION_TYPE_OUTPLAYED_VALUE = 2;
   public static final int PROMOTION_TYPE_MEDAL_VALUE = 3;
   private static final Internal.EnumLiteMap<PromotionType> internalValueMap = new Internal.EnumLiteMap<PromotionType>() {
      public PromotionType findValueByNumber(int var1) {
         return PromotionType.forNumber(var1);
      }
   };
   private static final PromotionType[] VALUES = values();
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
   public static PromotionType valueOf(int var0) {
      return forNumber(var0);
   }

   public static PromotionType forNumber(int var0) {
      switch (var0) {
         case 0:
            return PROMOTION_TYPE_UNSPECIFIED;
         case 1:
            return PROMOTION_TYPE_VIDEO;
         case 2:
            return PROMOTION_TYPE_OUTPLAYED;
         case 3:
            return PROMOTION_TYPE_MEDAL;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<PromotionType> internalGetValueMap() {
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

   public static PromotionType valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   PromotionType(int var3) {
      this.value = var3;
   }
}
