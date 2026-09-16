package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum OnlineFriendStatus implements ProtocolMessageEnum {
   ONLINE_FRIEND_STATUS_UNSPECIFIED(0),
   ONLINE_FRIEND_STATUS_ONLINE(1),
   ONLINE_FRIEND_STATUS_AWAY(2),
   ONLINE_FRIEND_STATUS_BUSY(3),
   ONLINE_FRIEND_STATUS_INVISIBLE(4),
   UNRECOGNIZED(-1);

   public static final int ONLINE_FRIEND_STATUS_UNSPECIFIED_VALUE = 0;
   public static final int ONLINE_FRIEND_STATUS_ONLINE_VALUE = 1;
   public static final int ONLINE_FRIEND_STATUS_AWAY_VALUE = 2;
   public static final int ONLINE_FRIEND_STATUS_BUSY_VALUE = 3;
   public static final int ONLINE_FRIEND_STATUS_INVISIBLE_VALUE = 4;
   private static final Internal.EnumLiteMap<OnlineFriendStatus> internalValueMap = new Internal.EnumLiteMap<OnlineFriendStatus>() {
      public OnlineFriendStatus findValueByNumber(int var1) {
         return OnlineFriendStatus.forNumber(var1);
      }
   };
   private static final OnlineFriendStatus[] VALUES = values();
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
   public static OnlineFriendStatus valueOf(int var0) {
      return forNumber(var0);
   }

   public static OnlineFriendStatus forNumber(int var0) {
      switch (var0) {
         case 0:
            return ONLINE_FRIEND_STATUS_UNSPECIFIED;
         case 1:
            return ONLINE_FRIEND_STATUS_ONLINE;
         case 2:
            return ONLINE_FRIEND_STATUS_AWAY;
         case 3:
            return ONLINE_FRIEND_STATUS_BUSY;
         case 4:
            return ONLINE_FRIEND_STATUS_INVISIBLE;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<OnlineFriendStatus> internalGetValueMap() {
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

   public static OnlineFriendStatus valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   OnlineFriendStatus(int var3) {
      this.value = var3;
   }
}
