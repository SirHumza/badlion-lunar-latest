package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.TimestampProto;
import com.lunarclient.common.v1.ColorProto;
import com.lunarclient.common.v1.ModpackProto;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_ServerSection_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_ServerSection_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_ServerSection_descriptor,
      new String[]{"Id", "Name", "Emoji", "ShowNotInterested", "CardSize", "Cards", "Description"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_ServerCard_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_ServerCard_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_ServerCard_descriptor,
      new String[]{
         "RecommendationId",
         "ServerMappingsId",
         "Name",
         "LogoUrl",
         "BackgroundUrl",
         "PrimaryColor",
         "PrimaryAddress",
         "Badge",
         "LastJoined",
         "GameModes",
         "Announcement",
         "RegionCodes",
         "GameTypes"
      }
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_Announcement_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_Announcement_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_Announcement_descriptor, new String[]{"Text", "CountDownTo", "CountUpFrom", "Timer"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_GlobalAnnouncement_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_GlobalAnnouncement_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_GlobalAnnouncement_descriptor, new String[]{"Announcement", "Server"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_ServerModalDetails_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_ServerModalDetails_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_ServerModalDetails_descriptor,
      new String[]{"Description", "Twitter", "Discord", "Youtube", "Instagram", "Twitch", "Telegram", "Reddit", "Tiktok", "Facebook", "Modpack"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_ServerGameType_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_ServerGameType_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_ServerGameType_descriptor, new String[]{"Name", "Emoji"}
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
         "\n5lunarclient/websocket/serverdiscovery/v1/common.proto\u0012(lunarclient.websocket.serverdiscovery.v1\u001a\u001fgoogle/protobuf/timestamp.proto\u001a!lunarclient/common/v1/color.proto\u001a#lunarclient/common/v1/modpack.proto\"\u00ad\u0003\n\rServerSection\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012\u0012\n\u0004name\u0018\u0002 \u0001(\tR\u0004name\u0012\u0014\n\u0005emoji\u0018\u0003 \u0001(\tR\u0005emoji\u0012.\n\u0013show_not_interested\u0018\u0004 \u0001(\bR\u0011showNotInterested\u0012]\n\tcard_size\u0018\u0005 \u0001(\u000e2@.lunarclient.websocket.serverdiscovery.v1.ServerSection.CardSizeR\bcardSize\u0012J\n\u0005cards\u0018\u0006 \u0003(\u000b24.lunarclient.websocket.serverdiscovery.v1.ServerCardR\u0005cards\u0012 \n\u000bdescription\u0018\u0007 \u0001(\tR\u000bdescription\"e\n\bCardSize\u0012\u0019\n\u0015CARD_SIZE_UNSPECIFIED\u0010\u0000\u0012\u0013\n\u000fCARD_SIZE_SMALL\u0010\u0001\u0012\u0014\n\u0010CARD_SIZE_MEDIUM\u0010\u0002\u0012\u0013\n\u000fCARD_SIZE_LARGE\u0010\u0003\"\u009b\u0006\n\nServerCard\u0012+\n\u0011recommendation_id\u0018\u0001 \u0001(\tR\u0010recommendationId\u0012,\n\u0012server_mappings_id\u0018\u000b \u0001(\tR\u0010serverMappingsId\u0012\u0012\n\u0004name\u0018\u0002 \u0001(\tR\u0004name\u0012\u0019\n\blogo_url\u0018\u0004 \u0001(\tR\u0007logoUrl\u0012%\n\u000ebackground_url\u0018\u0005 \u0001(\tR\rbackgroundUrl\u0012A\n\rprimary_color\u0018\u0006 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\fprimaryColor\u0012'\n\u000fprimary_address\u0018\u0007 \u0001(\tR\u000eprimaryAddress\u0012P\n\u0005badge\u0018\b \u0001(\u000e2:.lunarclient.websocket.serverdiscovery.v1.ServerCard.BadgeR\u0005badge\u0012;\n\u000blast_joined\u0018\t \u0001(\u000b2\u001a.google.protobuf.TimestampR\nlastJoined\u0012!\n\ngame_modes\u0018\n \u0003(\tB\u0002\u0018\u0001R\tgameModes\u0012Z\n\fannouncement\u0018\f \u0001(\u000b26.lunarclient.websocket.serverdiscovery.v1.AnnouncementR\fannouncement\u0012!\n\fregion_codes\u0018\r \u0003(\tR\u000bregionCodes\u0012W\n\ngame_types\u0018\u000e \u0003(\u000b28.lunarclient.websocket.serverdiscovery.v1.ServerGameTypeR\tgameTypes\"f\n\u0005Badge\u0012\u0015\n\u0011BADGE_UNSPECIFIED\u0010\u0000\u0012\u001e\n\u001aBADGE_LUNAR_CLIENT_PARTNER\u0010\u0001\u0012\u0012\n\u000eBADGE_FEATURED\u0010\u0002\u0012\u0012\n\u000eBADGE_OFFICIAL\u0010\u0003\"¯\u0001\n\fAnnouncement\u0012\u0012\n\u0004text\u0018\u0001 \u0001(\tR\u0004text\u0012@\n\rcount_down_to\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.TimestampH\u0000R\u000bcountDownTo\u0012@\n\rcount_up_from\u0018\u0003 \u0001(\u000b2\u001a.google.protobuf.TimestampH\u0000R\u000bcountUpFromB\u0007\n\u0005timer\"¾\u0001\n\u0012GlobalAnnouncement\u0012Z\n\fannouncement\u0018\u0001 \u0001(\u000b26.lunarclient.websocket.serverdiscovery.v1.AnnouncementR\fannouncement\u0012L\n\u0006server\u0018\u0002 \u0001(\u000b24.lunarclient.websocket.serverdiscovery.v1.ServerCardR\u0006server\"â\u0002\n\u0012ServerModalDetails\u0012 \n\u000bdescription\u0018\u0001 \u0001(\tR\u000bdescription\u0012\u0018\n\u0007twitter\u0018\u0002 \u0001(\tR\u0007twitter\u0012\u0018\n\u0007discord\u0018\u0003 \u0001(\tR\u0007discord\u0012\u0018\n\u0007youtube\u0018\u0004 \u0001(\tR\u0007youtube\u0012\u001c\n\tinstagram\u0018\u0005 \u0001(\tR\tinstagram\u0012\u0016\n\u0006twitch\u0018\u0006 \u0001(\tR\u0006twitch\u0012\u001a\n\btelegram\u0018\u0007 \u0001(\tR\btelegram\u0012\u0016\n\u0006reddit\u0018\b \u0001(\tR\u0006reddit\u0012\u0016\n\u0006tiktok\u0018\t \u0001(\tR\u0006tiktok\u0012\u001a\n\bfacebook\u0018\n \u0001(\tR\bfacebook\u0012>\n\u0007modpack\u0018\u000b \u0001(\u000b2$.lunarclient.common.v1.PlayerModpackR\u0007modpack\":\n\u000eServerGameType\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012\u0014\n\u0005emoji\u0018\u0002 \u0001(\tR\u0005emojiBþ\u0001\n,com.lunarclient.websocket.serverdiscovery.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWSª\u0002(Lunarclient.Websocket.Serverdiscovery.V1Ê\u0002(Lunarclient\\Websocket\\Serverdiscovery\\V1â\u00024Lunarclient\\Websocket\\Serverdiscovery\\V1\\GPBMetadataê\u0002+Lunarclient::Websocket::Serverdiscovery::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{TimestampProto.getDescriptor(), ColorProto.getDescriptor(), ModpackProto.getDescriptor()}
      );
      TimestampProto.getDescriptor();
      ColorProto.getDescriptor();
      ModpackProto.getDescriptor();
   }
}
