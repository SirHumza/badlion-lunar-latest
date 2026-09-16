package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum LastSeenVisibility implements ProtocolMessageEnum {
   LAST_SEEN_VISIBILITY_UNSPECIFIED(0),
   LAST_SEEN_VISIBILITY_FRIENDS(1),
   LAST_SEEN_VISIBILITY_NOONE(2),
   LAST_SEEN_VISIBILITY_EVERYONE(3),
   UNRECOGNIZED(-1);

   public static final int LAST_SEEN_VISIBILITY_UNSPECIFIED_VALUE = 0;
   public static final int LAST_SEEN_VISIBILITY_FRIENDS_VALUE = 1;
   public static final int LAST_SEEN_VISIBILITY_NOONE_VALUE = 2;
   public static final int LAST_SEEN_VISIBILITY_EVERYONE_VALUE = 3;
   private static final Internal.EnumLiteMap<LastSeenVisibility> internalValueMap = new Internal.EnumLiteMap<LastSeenVisibility>() {
      public LastSeenVisibility findValueByNumber(int var1) {
         return LastSeenVisibility.forNumber(var1);
      }
   };
   private static final LastSeenVisibility[] VALUES = values();
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
   public static LastSeenVisibility valueOf(int var0) {
      return forNumber(var0);
   }

   public static LastSeenVisibility forNumber(int var0) {
      switch (var0) {
         case 0:
            return LAST_SEEN_VISIBILITY_UNSPECIFIED;
         case 1:
            return LAST_SEEN_VISIBILITY_FRIENDS;
         case 2:
            return LAST_SEEN_VISIBILITY_NOONE;
         case 3:
            return LAST_SEEN_VISIBILITY_EVERYONE;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<LastSeenVisibility> internalGetValueMap() {
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

   public static LastSeenVisibility valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   LastSeenVisibility(int var3) {
      this.value = var3;
   }
}
