package com.lunarclient.websocket.store.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum IncomingGiftPrivacy implements ProtocolMessageEnum {
   INCOMING_GIFT_PRIVACY_UNSPECIFIED(0),
   INCOMING_GIFT_PRIVACY_EVERYONE(1),
   INCOMING_GIFT_PRIVACY_FRIENDS(2),
   INCOMING_GIFT_PRIVACY_NOONE(3),
   UNRECOGNIZED(-1);

   public static final int INCOMING_GIFT_PRIVACY_UNSPECIFIED_VALUE = 0;
   public static final int INCOMING_GIFT_PRIVACY_EVERYONE_VALUE = 1;
   public static final int INCOMING_GIFT_PRIVACY_FRIENDS_VALUE = 2;
   public static final int INCOMING_GIFT_PRIVACY_NOONE_VALUE = 3;
   private static final Internal.EnumLiteMap<IncomingGiftPrivacy> internalValueMap = new Internal.EnumLiteMap<IncomingGiftPrivacy>() {
      public IncomingGiftPrivacy findValueByNumber(int var1) {
         return IncomingGiftPrivacy.forNumber(var1);
      }
   };
   private static final IncomingGiftPrivacy[] VALUES = values();
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
   public static IncomingGiftPrivacy valueOf(int var0) {
      return forNumber(var0);
   }

   public static IncomingGiftPrivacy forNumber(int var0) {
      switch (var0) {
         case 0:
            return INCOMING_GIFT_PRIVACY_UNSPECIFIED;
         case 1:
            return INCOMING_GIFT_PRIVACY_EVERYONE;
         case 2:
            return INCOMING_GIFT_PRIVACY_FRIENDS;
         case 3:
            return INCOMING_GIFT_PRIVACY_NOONE;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<IncomingGiftPrivacy> internalGetValueMap() {
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

   public static IncomingGiftPrivacy valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   IncomingGiftPrivacy(int var3) {
      this.value = var3;
   }
}
