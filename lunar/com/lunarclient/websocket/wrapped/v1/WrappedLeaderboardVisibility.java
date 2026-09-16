package com.lunarclient.websocket.wrapped.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum WrappedLeaderboardVisibility implements ProtocolMessageEnum {
   WRAPPED_LEADERBOARD_VISIBILITY_UNSPECIFIED(0),
   WRAPPED_LEADERBOARD_VISIBILITY_EVERYONE(1),
   WRAPPED_LEADERBOARD_VISIBILITY_NOONE(2),
   UNRECOGNIZED(-1);

   public static final int WRAPPED_LEADERBOARD_VISIBILITY_UNSPECIFIED_VALUE = 0;
   public static final int WRAPPED_LEADERBOARD_VISIBILITY_EVERYONE_VALUE = 1;
   public static final int WRAPPED_LEADERBOARD_VISIBILITY_NOONE_VALUE = 2;
   private static final Internal.EnumLiteMap<WrappedLeaderboardVisibility> internalValueMap = new Internal.EnumLiteMap<WrappedLeaderboardVisibility>() {
      public WrappedLeaderboardVisibility findValueByNumber(int var1) {
         return WrappedLeaderboardVisibility.forNumber(var1);
      }
   };
   private static final WrappedLeaderboardVisibility[] VALUES = values();
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
   public static WrappedLeaderboardVisibility valueOf(int var0) {
      return forNumber(var0);
   }

   public static WrappedLeaderboardVisibility forNumber(int var0) {
      switch (var0) {
         case 0:
            return WRAPPED_LEADERBOARD_VISIBILITY_UNSPECIFIED;
         case 1:
            return WRAPPED_LEADERBOARD_VISIBILITY_EVERYONE;
         case 2:
            return WRAPPED_LEADERBOARD_VISIBILITY_NOONE;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<WrappedLeaderboardVisibility> internalGetValueMap() {
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

   public static WrappedLeaderboardVisibility valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   WrappedLeaderboardVisibility(int var3) {
      this.value = var3;
   }
}
