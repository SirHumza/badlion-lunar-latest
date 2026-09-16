package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum JoinSource implements ProtocolMessageEnum {
   JOIN_SOURCE_UNSPECIFIED(0),
   JOIN_SOURCE_LOCAL_AREA_NETWORK(1),
   JOIN_SOURCE_HOSTED_WORLD_WHITELIST(2),
   JOIN_SOURCE_LUNAR_CLIENT_FRIENDS(3),
   JOIN_SOURCE_EVERYONE(4),
   UNRECOGNIZED(-1);

   public static final int JOIN_SOURCE_UNSPECIFIED_VALUE = 0;
   public static final int JOIN_SOURCE_LOCAL_AREA_NETWORK_VALUE = 1;
   public static final int JOIN_SOURCE_HOSTED_WORLD_WHITELIST_VALUE = 2;
   public static final int JOIN_SOURCE_LUNAR_CLIENT_FRIENDS_VALUE = 3;
   public static final int JOIN_SOURCE_EVERYONE_VALUE = 4;
   private static final Internal.EnumLiteMap<JoinSource> internalValueMap = new Internal.EnumLiteMap<JoinSource>() {
      public JoinSource findValueByNumber(int var1) {
         return JoinSource.forNumber(var1);
      }
   };
   private static final JoinSource[] VALUES = values();
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
   public static JoinSource valueOf(int var0) {
      return forNumber(var0);
   }

   public static JoinSource forNumber(int var0) {
      switch (var0) {
         case 0:
            return JOIN_SOURCE_UNSPECIFIED;
         case 1:
            return JOIN_SOURCE_LOCAL_AREA_NETWORK;
         case 2:
            return JOIN_SOURCE_HOSTED_WORLD_WHITELIST;
         case 3:
            return JOIN_SOURCE_LUNAR_CLIENT_FRIENDS;
         case 4:
            return JOIN_SOURCE_EVERYONE;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<JoinSource> internalGetValueMap() {
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

   public static JoinSource valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   JoinSource(int var3) {
      this.value = var3;
   }
}
