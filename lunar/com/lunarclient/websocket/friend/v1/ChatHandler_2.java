package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum GroupChatInvitePrivacy implements ProtocolMessageEnum {
   GROUP_CHAT_INVITE_PRIVACY_UNSPECIFIED(0),
   GROUP_CHAT_INVITE_PRIVACY_FRIENDS(1),
   GROUP_CHAT_INVITE_PRIVACY_NOONE(2),
   UNRECOGNIZED(-1);

   public static final int GROUP_CHAT_INVITE_PRIVACY_UNSPECIFIED_VALUE = 0;
   public static final int GROUP_CHAT_INVITE_PRIVACY_FRIENDS_VALUE = 1;
   public static final int GROUP_CHAT_INVITE_PRIVACY_NOONE_VALUE = 2;
   private static final Internal.EnumLiteMap<GroupChatInvitePrivacy> internalValueMap = new Internal.EnumLiteMap<GroupChatInvitePrivacy>() {
      public GroupChatInvitePrivacy findValueByNumber(int var1) {
         return GroupChatInvitePrivacy.forNumber(var1);
      }
   };
   private static final GroupChatInvitePrivacy[] VALUES = values();
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
   public static GroupChatInvitePrivacy valueOf(int var0) {
      return forNumber(var0);
   }

   public static GroupChatInvitePrivacy forNumber(int var0) {
      switch (var0) {
         case 0:
            return GROUP_CHAT_INVITE_PRIVACY_UNSPECIFIED;
         case 1:
            return GROUP_CHAT_INVITE_PRIVACY_FRIENDS;
         case 2:
            return GROUP_CHAT_INVITE_PRIVACY_NOONE;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<GroupChatInvitePrivacy> internalGetValueMap() {
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

   public static GroupChatInvitePrivacy valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   GroupChatInvitePrivacy(int var3) {
      this.value = var3;
   }
}
