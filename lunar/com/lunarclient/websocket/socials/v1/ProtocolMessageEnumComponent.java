package com.lunarclient.websocket.socials.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum SocialsVisibility implements ProtocolMessageEnum {
   SOCIALS_VISIBILITY_UNSPECIFIED(0),
   SOCIALS_VISIBILITY_FRIENDS(1),
   SOCIALS_VISIBILITY_NOONE(2),
   SOCIALS_VISIBILITY_EVERYONE(3),
   UNRECOGNIZED(-1);

   public static final int SOCIALS_VISIBILITY_UNSPECIFIED_VALUE = 0;
   public static final int SOCIALS_VISIBILITY_FRIENDS_VALUE = 1;
   public static final int SOCIALS_VISIBILITY_NOONE_VALUE = 2;
   public static final int SOCIALS_VISIBILITY_EVERYONE_VALUE = 3;
   private static final Internal.EnumLiteMap<SocialsVisibility> internalValueMap = new Internal.EnumLiteMap<SocialsVisibility>() {
      public SocialsVisibility findValueByNumber(int var1) {
         return SocialsVisibility.forNumber(var1);
      }
   };
   private static final SocialsVisibility[] VALUES = values();
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
   public static SocialsVisibility valueOf(int var0) {
      return forNumber(var0);
   }

   public static SocialsVisibility forNumber(int var0) {
      switch (var0) {
         case 0:
            return SOCIALS_VISIBILITY_UNSPECIFIED;
         case 1:
            return SOCIALS_VISIBILITY_FRIENDS;
         case 2:
            return SOCIALS_VISIBILITY_NOONE;
         case 3:
            return SOCIALS_VISIBILITY_EVERYONE;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<SocialsVisibility> internalGetValueMap() {
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

   public static SocialsVisibility valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   SocialsVisibility(int var3) {
      this.value = var3;
   }
}
