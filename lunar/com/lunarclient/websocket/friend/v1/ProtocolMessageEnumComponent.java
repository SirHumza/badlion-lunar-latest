package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum CountryFlagVisibility implements ProtocolMessageEnum {
   COUNTRY_FLAG_VISIBILITY_UNSPECIFIED(0),
   COUNTRY_FLAG_VISIBILITY_EVERYONE(1),
   COUNTRY_FLAG_VISIBILITY_FRIENDS(2),
   COUNTRY_FLAG_VISIBILITY_NOONE(3),
   UNRECOGNIZED(-1);

   public static final int COUNTRY_FLAG_VISIBILITY_UNSPECIFIED_VALUE = 0;
   public static final int COUNTRY_FLAG_VISIBILITY_EVERYONE_VALUE = 1;
   public static final int COUNTRY_FLAG_VISIBILITY_FRIENDS_VALUE = 2;
   public static final int COUNTRY_FLAG_VISIBILITY_NOONE_VALUE = 3;
   private static final Internal.EnumLiteMap<CountryFlagVisibility> internalValueMap = new Internal.EnumLiteMap<CountryFlagVisibility>() {
      public CountryFlagVisibility findValueByNumber(int var1) {
         return CountryFlagVisibility.forNumber(var1);
      }
   };
   private static final CountryFlagVisibility[] VALUES = values();
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
   public static CountryFlagVisibility valueOf(int var0) {
      return forNumber(var0);
   }

   public static CountryFlagVisibility forNumber(int var0) {
      switch (var0) {
         case 0:
            return COUNTRY_FLAG_VISIBILITY_UNSPECIFIED;
         case 1:
            return COUNTRY_FLAG_VISIBILITY_EVERYONE;
         case 2:
            return COUNTRY_FLAG_VISIBILITY_FRIENDS;
         case 3:
            return COUNTRY_FLAG_VISIBILITY_NOONE;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<CountryFlagVisibility> internalGetValueMap() {
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

   public static CountryFlagVisibility valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   CountryFlagVisibility(int var3) {
      this.value = var3;
   }
}
