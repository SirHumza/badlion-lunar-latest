package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.TimestampProto;
import com.lunarclient.common.v1.ColorProto;
import com.lunarclient.common.v1.ModpackProto;
import com.lunarclient.common.v1.SocialProto;
import com.lunarclient.common.v1.UuidProto;
import com.lunarclient.common.v1.VersionProto;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_FriendSocials_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_FriendSocials_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_FriendSocials_descriptor, new String[]{"Hidden", "Linked"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_OnlineFriend_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_OnlineFriend_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_OnlineFriend_descriptor,
      new String[]{
         "Player",
         "Status",
         "Location",
         "MinecraftVersion",
         "JustCameOnline",
         "HostedWorldJoinability",
         "LogoColor",
         "Modpack",
         "PlusColor",
         "IsRadioPremium",
         "FriendsSince",
         "Socials",
         "RankName",
         "CountryCode",
         "BadgeId"
      }
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_OfflineFriend_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_OfflineFriend_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_OfflineFriend_descriptor,
      new String[]{"Player", "LastVisibleOnline", "LogoColor", "PlusColor", "IsRadioPremium", "FriendsSince", "Socials", "RankName", "CountryCode", "BadgeId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_FriendRequest_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_FriendRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_FriendRequest_descriptor,
      new String[]{"Player", "SentAt", "PlayerLogoColor", "PlayerPlusColor", "PlayerRankName", "PlayerBadgeId"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private CommonProto() {
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
         "\n,lunarclient/websocket/friend/v1/common.proto\u0012\u001flunarclient.websocket.friend.v1\u001a\u001fgoogle/protobuf/timestamp.proto\u001a!lunarclient/common/v1/color.proto\u001a$lunarclient/common/v1/location.proto\u001a#lunarclient/common/v1/modpack.proto\u001a\"lunarclient/common/v1/social.proto\u001a lunarclient/common/v1/uuid.proto\u001a#lunarclient/common/v1/version.proto\u001a1lunarclient/websocket/hostedworld/v1/common.proto\"b\n\rFriendSocials\u0012\u0016\n\u0006hidden\u0018\u0001 \u0001(\bR\u0006hidden\u00129\n\u0006linked\u0018\u0002 \u0003(\u000b2!.lunarclient.common.v1.UserSocialR\u0006linked\"\u008f\u0007\n\fOnlineFriend\u0012>\n\u0006player\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0006player\u0012K\n\u0006status\u0018\u0002 \u0001(\u000e23.lunarclient.websocket.friend.v1.OnlineFriendStatusR\u0006status\u0012;\n\blocation\u0018\u0003 \u0001(\u000b2\u001f.lunarclient.common.v1.LocationR\blocation\u0012T\n\u0011minecraft_version\u0018\u0004 \u0001(\u000b2'.lunarclient.common.v1.MinecraftVersionR\u0010minecraftVersion\u0012(\n\u0010just_came_online\u0018\u0005 \u0001(\bR\u000ejustCameOnline\u0012k\n\u0018hosted_world_joinability\u0018\u0006 \u0001(\u000e21.lunarclient.websocket.hostedworld.v1.JoinabilityR\u0016hostedWorldJoinability\u0012;\n\nlogo_color\u0018\u0007 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tlogoColor\u0012>\n\u0007modpack\u0018\b \u0001(\u000b2$.lunarclient.common.v1.PlayerModpackR\u0007modpack\u0012;\n\nplus_color\u0018\t \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tplusColor\u0012(\n\u0010is_radio_premium\u0018\n \u0001(\bR\u000eisRadioPremium\u0012?\n\rfriends_since\u0018\u000b \u0001(\u000b2\u001a.google.protobuf.TimestampR\ffriendsSince\u0012H\n\u0007socials\u0018\f \u0001(\u000b2..lunarclient.websocket.friend.v1.FriendSocialsR\u0007socials\u0012\u001b\n\trank_name\u0018\r \u0001(\tR\brankName\u0012!\n\fcountry_code\u0018\u000e \u0001(\tR\u000bcountryCode\u0012\u0019\n\bbadge_id\u0018\u000f \u0001(\u0005R\u0007badgeId\"¥\u0004\n\rOfflineFriend\u0012>\n\u0006player\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0006player\u0012J\n\u0013last_visible_online\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.TimestampR\u0011lastVisibleOnline\u0012;\n\nlogo_color\u0018\u0003 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tlogoColor\u0012;\n\nplus_color\u0018\u0004 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tplusColor\u0012(\n\u0010is_radio_premium\u0018\u0005 \u0001(\bR\u000eisRadioPremium\u0012?\n\rfriends_since\u0018\u0006 \u0001(\u000b2\u001a.google.protobuf.TimestampR\ffriendsSince\u0012H\n\u0007socials\u0018\u0007 \u0001(\u000b2..lunarclient.websocket.friend.v1.FriendSocialsR\u0007socials\u0012\u001b\n\trank_name\u0018\b \u0001(\tR\brankName\u0012!\n\fcountry_code\u0018\t \u0001(\tR\u000bcountryCode\u0012\u0019\n\bbadge_id\u0018\n \u0001(\u0005R\u0007badgeId\"ê\u0002\n\rFriendRequest\u0012>\n\u0006player\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0006player\u00123\n\u0007sent_at\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.TimestampR\u0006sentAt\u0012H\n\u0011player_logo_color\u0018\u0003 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\u000fplayerLogoColor\u0012H\n\u0011player_plus_color\u0018\u0004 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\u000fplayerPlusColor\u0012(\n\u0010player_rank_name\u0018\u0005 \u0001(\tR\u000eplayerRankName\u0012&\n\u000fplayer_badge_id\u0018\u0006 \u0001(\u0005R\rplayerBadgeId*½\u0001\n\u0012OnlineFriendStatus\u0012$\n ONLINE_FRIEND_STATUS_UNSPECIFIED\u0010\u0000\u0012\u001f\n\u001bONLINE_FRIEND_STATUS_ONLINE\u0010\u0001\u0012\u001d\n\u0019ONLINE_FRIEND_STATUS_AWAY\u0010\u0002\u0012\u001d\n\u0019ONLINE_FRIEND_STATUS_BUSY\u0010\u0003\u0012\"\n\u001eONLINE_FRIEND_STATUS_INVISIBLE\u0010\u0004*\u009f\u0001\n\u0012LastSeenVisibility\u0012$\n LAST_SEEN_VISIBILITY_UNSPECIFIED\u0010\u0000\u0012 \n\u001cLAST_SEEN_VISIBILITY_FRIENDS\u0010\u0001\u0012\u001e\n\u001aLAST_SEEN_VISIBILITY_NOONE\u0010\u0002\u0012!\n\u001dLAST_SEEN_VISIBILITY_EVERYONE\u0010\u0003*®\u0001\n\u0015CountryFlagVisibility\u0012'\n#COUNTRY_FLAG_VISIBILITY_UNSPECIFIED\u0010\u0000\u0012$\n COUNTRY_FLAG_VISIBILITY_EVERYONE\u0010\u0001\u0012#\n\u001fCOUNTRY_FLAG_VISIBILITY_FRIENDS\u0010\u0002\u0012!\n\u001dCOUNTRY_FLAG_VISIBILITY_NOONE\u0010\u0003*\u008f\u0001\n\u0016GroupChatInvitePrivacy\u0012)\n%GROUP_CHAT_INVITE_PRIVACY_UNSPECIFIED\u0010\u0000\u0012%\n!GROUP_CHAT_INVITE_PRIVACY_FRIENDS\u0010\u0001\u0012#\n\u001fGROUP_CHAT_INVITE_PRIVACY_NOONE\u0010\u0002BÑ\u0001\n#com.lunarclient.websocket.friend.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWFª\u0002\u001fLunarclient.Websocket.Friend.V1Ê\u0002\u001fLunarclient\\Websocket\\Friend\\V1â\u0002+Lunarclient\\Websocket\\Friend\\V1\\GPBMetadataê\u0002\"Lunarclient::Websocket::Friend::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{
            TimestampProto.getDescriptor(),
            ColorProto.getDescriptor(),
            com.lunarclient.common.v1.LocationProto.getDescriptor(),
            ModpackProto.getDescriptor(),
            SocialProto.getDescriptor(),
            UuidProto.getDescriptor(),
            VersionProto.getDescriptor(),
            com.lunarclient.websocket.hostedworld.v1.CommonProto.getDescriptor()
         }
      );
      TimestampProto.getDescriptor();
      ColorProto.getDescriptor();
      com.lunarclient.common.v1.LocationProto.getDescriptor();
      ModpackProto.getDescriptor();
      SocialProto.getDescriptor();
      UuidProto.getDescriptor();
      VersionProto.getDescriptor();
      com.lunarclient.websocket.hostedworld.v1.CommonProto.getDescriptor();
   }
}
