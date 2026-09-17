package com.lunarclient.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class LocationProto {
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_ServerRichStatus_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_ServerRichStatus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_ServerRichStatus_descriptor,
      new String[]{"Source", "GameName", "GameVariantName", "GameState", "PlayerState", "MapName", "SubServer", "TeamCurrentSize", "TeamMaxSize"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_PublicServerColors_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_PublicServerColors_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_PublicServerColors_descriptor, new String[]{"Primary", "Secondary"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_PublicServerVersions_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_PublicServerVersions_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_PublicServerVersions_descriptor, new String[]{"Supported", "Recommended"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_PublicServer_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_PublicServer_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_PublicServer_descriptor,
      new String[]{"ServerMappingsId", "Name", "LogoUrl", "PrimaryAddress", "Colors", "Versions", "SupportsDiscordRichPresence", "RichStatus"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_PrivateServer_descriptor = getDescriptor().getMessageTypes().get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_PrivateServer_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_PrivateServer_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_LocalServer_descriptor = getDescriptor().getMessageTypes().get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_LocalServer_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_LocalServer_descriptor, new String[]{"RichStatus"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_SinglePlayer_descriptor = getDescriptor().getMessageTypes().get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_SinglePlayer_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_SinglePlayer_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_MinecraftRealms_descriptor = getDescriptor().getMessageTypes().get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_MinecraftRealms_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_MinecraftRealms_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_InMenus_descriptor = getDescriptor().getMessageTypes().get(8);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_InMenus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_InMenus_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_InLauncher_descriptor = getDescriptor().getMessageTypes().get(9);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_InLauncher_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_InLauncher_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_HostedWorld_descriptor = getDescriptor().getMessageTypes().get(10);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_HostedWorld_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_HostedWorld_descriptor, new String[]{"WorldHost"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_ReplayWorld_descriptor = getDescriptor().getMessageTypes().get(11);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_ReplayWorld_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_ReplayWorld_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_RewindWorld_descriptor = getDescriptor().getMessageTypes().get(12);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_RewindWorld_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_RewindWorld_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_InGame_descriptor = getDescriptor().getMessageTypes().get(13);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_InGame_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_InGame_descriptor, new String[]{"MinecraftVersion", "Modpack", "IsBadlion"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_Location_descriptor = getDescriptor().getMessageTypes().get(14);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_Location_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_Location_descriptor,
      new String[]{
         "PublicServer",
         "PrivateServer",
         "LocalServer",
         "SinglePlayer",
         "MinecraftRealms",
         "InMenus",
         "InLauncher",
         "HostedWorld",
         "ReplayWorld",
         "InGame",
         "RewindWorld",
         "Location"
      }
   );
   private static Descriptors.FileDescriptor descriptor;

   private LocationProto() {
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
         "\n$lunarclient/common/v1/location.proto\u0012\u0015lunarclient.common.v1\u001a!lunarclient/common/v1/color.proto\u001a#lunarclient/common/v1/modpack.proto\u001a lunarclient/common/v1/uuid.proto\u001a#lunarclient/common/v1/version.proto\"Ä\u0003\n\u0010ServerRichStatus\u0012F\n\u0006source\u0018\b \u0001(\u000e2..lunarclient.common.v1.ServerRichStatus.SourceR\u0006source\u0012\u001b\n\tgame_name\u0018\u0001 \u0001(\tR\bgameName\u0012*\n\u0011game_variant_name\u0018\t \u0001(\tR\u000fgameVariantName\u0012\u001d\n\ngame_state\u0018\u0002 \u0001(\tR\tgameState\u0012!\n\fplayer_state\u0018\u0003 \u0001(\tR\u000bplayerState\u0012\u0019\n\bmap_name\u0018\u0004 \u0001(\tR\u0007mapName\u0012\u001d\n\nsub_server\u0018\u0005 \u0001(\tR\tsubServer\u0012*\n\u0011team_current_size\u0018\u0006 \u0001(\u0005R\u000fteamCurrentSize\u0012\"\n\rteam_max_size\u0018\u0007 \u0001(\u0005R\u000bteamMaxSize\"S\n\u0006Source\u0012\u0016\n\u0012SOURCE_UNSPECIFIED\u0010\u0000\u0012\u0011\n\rSOURCE_APOLLO\u0010\u0001\u0012\u001e\n\u001aSOURCE_LUNAR_CLIENT_PARSED\u0010\u0002\"\u0088\u0001\n\u0012PublicServerColors\u00126\n\u0007primary\u0018\u0001 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\u0007primary\u0012:\n\tsecondary\u0018\u0002 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tsecondary\"¨\u0001\n\u0014PublicServerVersions\u0012E\n\tsupported\u0018\u0001 \u0003(\u000b2'.lunarclient.common.v1.MinecraftVersionR\tsupported\u0012I\n\u000brecommended\u0018\u0002 \u0001(\u000b2'.lunarclient.common.v1.MinecraftVersionR\u000brecommended\"³\u0003\n\fPublicServer\u0012,\n\u0012server_mappings_id\u0018\u0001 \u0001(\tR\u0010serverMappingsId\u0012\u0012\n\u0004name\u0018\u0002 \u0001(\tR\u0004name\u0012\u0019\n\blogo_url\u0018\b \u0001(\tR\u0007logoUrl\u0012'\n\u000fprimary_address\u0018\u0003 \u0001(\tR\u000eprimaryAddress\u0012A\n\u0006colors\u0018\u0004 \u0001(\u000b2).lunarclient.common.v1.PublicServerColorsR\u0006colors\u0012G\n\bversions\u0018\u0005 \u0001(\u000b2+.lunarclient.common.v1.PublicServerVersionsR\bversions\u0012G\n\u001esupports_discord_rich_presence\u0018\u0006 \u0001(\bB\u0002\u0018\u0001R\u001bsupportsDiscordRichPresence\u0012H\n\u000brich_status\u0018\u0007 \u0001(\u000b2'.lunarclient.common.v1.ServerRichStatusR\nrichStatus\"\u000f\n\rPrivateServer\"W\n\u000bLocalServer\u0012H\n\u000brich_status\u0018\u0001 \u0001(\u000b2'.lunarclient.common.v1.ServerRichStatusR\nrichStatus\"\u000e\n\fSinglePlayer\"\u0011\n\u000fMinecraftRealms\"\t\n\u0007InMenus\"\f\n\nInLauncher\"T\n\u000bHostedWorld\u0012E\n\nworld_host\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\tworldHost\"\r\n\u000bReplayWorld\"\r\n\u000bRewindWorld\"½\u0001\n\u0006InGame\u0012T\n\u0011minecraft_version\u0018\u0001 \u0001(\u000b2'.lunarclient.common.v1.MinecraftVersionR\u0010minecraftVersion\u0012>\n\u0007modpack\u0018\u0002 \u0001(\u000b2$.lunarclient.common.v1.PlayerModpackR\u0007modpack\u0012\u001d\n\nis_badlion\u0018\u0003 \u0001(\bR\tisBadlion\"³\u0006\n\bLocation\u0012J\n\rpublic_server\u0018\u0001 \u0001(\u000b2#.lunarclient.common.v1.PublicServerH\u0000R\fpublicServer\u0012M\n\u000eprivate_server\u0018\u0002 \u0001(\u000b2$.lunarclient.common.v1.PrivateServerH\u0000R\rprivateServer\u0012G\n\flocal_server\u0018\u0003 \u0001(\u000b2\".lunarclient.common.v1.LocalServerH\u0000R\u000blocalServer\u0012J\n\rsingle_player\u0018\u0004 \u0001(\u000b2#.lunarclient.common.v1.SinglePlayerH\u0000R\fsinglePlayer\u0012S\n\u0010minecraft_realms\u0018\u0005 \u0001(\u000b2&.lunarclient.common.v1.MinecraftRealmsH\u0000R\u000fminecraftRealms\u0012;\n\bin_menus\u0018\u0006 \u0001(\u000b2\u001e.lunarclient.common.v1.InMenusH\u0000R\u0007inMenus\u0012D\n\u000bin_launcher\u0018\u0007 \u0001(\u000b2!.lunarclient.common.v1.InLauncherH\u0000R\ninLauncher\u0012G\n\fhosted_world\u0018\b \u0001(\u000b2\".lunarclient.common.v1.HostedWorldH\u0000R\u000bhostedWorld\u0012G\n\freplay_world\u0018\t \u0001(\u000b2\".lunarclient.common.v1.ReplayWorldH\u0000R\u000breplayWorld\u00128\n\u0007in_game\u0018\n \u0001(\u000b2\u001d.lunarclient.common.v1.InGameH\u0000R\u0006inGame\u0012G\n\frewind_world\u0018\u000b \u0001(\u000b2\".lunarclient.common.v1.RewindWorldH\u0000R\u000brewindWorldB\n\n\blocationB \u0001\n\u0019com.lunarclient.common.v1B\rLocationProtoP\u0001¢\u0002\u0003LCXª\u0002\u0015Lunarclient.Common.V1Ê\u0002\u0015Lunarclient\\Common\\V1â\u0002!Lunarclient\\Common\\V1\\GPBMetadataê\u0002\u0017Lunarclient::Common::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{ColorProto.getDescriptor(), ModpackProto.getDescriptor(), UuidProto.getDescriptor(), VersionProto.getDescriptor()}
      );
      ColorProto.getDescriptor();
      ModpackProto.getDescriptor();
      UuidProto.getDescriptor();
      VersionProto.getDescriptor();
   }
}
