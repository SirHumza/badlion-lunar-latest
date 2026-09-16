package com.lunarclient.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum UserSocialPlatform implements ProtocolMessageEnum {
   USER_SOCIAL_PLATFORM_UNSPECIFIED(0),
   USER_SOCIAL_PLATFORM_TWITTER(1),
   USER_SOCIAL_PLATFORM_DISCORD(2),
   USER_SOCIAL_PLATFORM_TWITCH(3),
   USER_SOCIAL_PLATFORM_YOUTUBE(4),
   USER_SOCIAL_PLATFORM_TIKTOK(5),
   UNRECOGNIZED(-1);

   public static final int USER_SOCIAL_PLATFORM_UNSPECIFIED_VALUE = 0;
   public static final int USER_SOCIAL_PLATFORM_TWITTER_VALUE = 1;
   public static final int USER_SOCIAL_PLATFORM_DISCORD_VALUE = 2;
   public static final int USER_SOCIAL_PLATFORM_TWITCH_VALUE = 3;
   public static final int USER_SOCIAL_PLATFORM_YOUTUBE_VALUE = 4;
   public static final int USER_SOCIAL_PLATFORM_TIKTOK_VALUE = 5;
   private static final Internal.EnumLiteMap<UserSocialPlatform> internalValueMap = new Internal.EnumLiteMap<UserSocialPlatform>() {
      public UserSocialPlatform findValueByNumber(int var1) {
         return UserSocialPlatform.forNumber(var1);
      }
   };
   private static final UserSocialPlatform[] VALUES = values();
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
   public static UserSocialPlatform valueOf(int var0) {
      return forNumber(var0);
   }

   public static UserSocialPlatform forNumber(int var0) {
      switch (var0) {
         case 0:
            return USER_SOCIAL_PLATFORM_UNSPECIFIED;
         case 1:
            return USER_SOCIAL_PLATFORM_TWITTER;
         case 2:
            return USER_SOCIAL_PLATFORM_DISCORD;
         case 3:
            return USER_SOCIAL_PLATFORM_TWITCH;
         case 4:
            return USER_SOCIAL_PLATFORM_YOUTUBE;
         case 5:
            return USER_SOCIAL_PLATFORM_TIKTOK;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<UserSocialPlatform> internalGetValueMap() {
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
      return SocialProto.getDescriptor().getEnumTypes().get(0);
   }

   public static UserSocialPlatform valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   UserSocialPlatform(int var3) {
      this.value = var3;
   }
}
