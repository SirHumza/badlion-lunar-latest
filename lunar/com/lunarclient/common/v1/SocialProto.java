package com.lunarclient.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class SocialProto {
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_UserSocial_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_UserSocial_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_UserSocial_descriptor, new String[]{"Platform", "Username", "Avatar"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private SocialProto() {
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static Descriptors.FileDescriptor getDescriptor() {
      return descriptor;
   }

   static {
      String[] var0 = new String[]{
         "\n\"lunarclient/common/v1/social.proto\u0012\u0015lunarclient.common.v1\"\u0087\u0001\n\nUserSocial\u0012E\n\bplatform\u0018\u0001 \u0001(\u000e2).lunarclient.common.v1.UserSocialPlatformR\bplatform\u0012\u001a\n\busername\u0018\u0002 \u0001(\tR\busername\u0012\u0016\n\u0006avatar\u0018\u0003 \u0001(\tR\u0006avatar*â\u0001\n\u0012UserSocialPlatform\u0012$\n USER_SOCIAL_PLATFORM_UNSPECIFIED\u0010\u0000\u0012 \n\u001cUSER_SOCIAL_PLATFORM_TWITTER\u0010\u0001\u0012 \n\u001cUSER_SOCIAL_PLATFORM_DISCORD\u0010\u0002\u0012\u001f\n\u001bUSER_SOCIAL_PLATFORM_TWITCH\u0010\u0003\u0012 \n\u001cUSER_SOCIAL_PLATFORM_YOUTUBE\u0010\u0004\u0012\u001f\n\u001bUSER_SOCIAL_PLATFORM_TIKTOK\u0010\u0005B\u009e\u0001\n\u0019com.lunarclient.common.v1B\u000bSocialProtoP\u0001¢\u0002\u0003LCXª\u0002\u0015Lunarclient.Common.V1Ê\u0002\u0015Lunarclient\\Common\\V1â\u0002!Lunarclient\\Common\\V1\\GPBMetadataê\u0002\u0017Lunarclient::Common::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
