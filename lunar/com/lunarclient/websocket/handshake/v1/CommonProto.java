package com.lunarclient.websocket.handshake.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.TimestampProto;
import com.lunarclient.common.v1.InboundLocationProto;
import com.lunarclient.common.v1.ModpackProto;
import com.lunarclient.common.v1.SkinProto;
import com.lunarclient.common.v1.UuidProto;
import com.lunarclient.common.v1.VersionProto;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_handshake_v1_Handshake_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_handshake_v1_Handshake_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_handshake_v1_Handshake_descriptor,
      new String[]{
         "Identity",
         "LauncherVersion",
         "InstallationId",
         "Hwid",
         "OperatingSystem",
         "OperatingSystemRelease",
         "CpuArchitecture",
         "Language",
         "CanaryToken",
         "OverwolfMuid",
         "GameHandshake",
         "LauncherHandshake",
         "Client"
      }
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_handshake_v1_InstalledMod_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_handshake_v1_InstalledMod_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_handshake_v1_InstalledMod_descriptor, new String[]{"Id", "Name", "Version", "Type"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_descriptor,
      new String[]{"Player", "Type", "AuthenticatorJwt", "Skins", "Capes", "Attributes", "CreatedAt", "NameChange", "OwnsBedrockEdition"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_NameChange_descriptor = internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_NameChange_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_NameChange_descriptor, new String[]{"LastChangedAt", "Allowed"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Skin_descriptor = internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_descriptor.getNestedTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Skin_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Skin_descriptor, new String[]{"Id", "State", "Skin"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Cape_descriptor = internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_descriptor.getNestedTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Cape_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Cape_descriptor, new String[]{"Id", "State", "TextureId", "Alias"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Attributes_descriptor = internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_descriptor.getNestedTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Attributes_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Attributes_descriptor,
      new String[]{
         "PriviledgeOnlineChat",
         "PriviledgeMultiplayerServer",
         "PriviledgeMultiplayerRealms",
         "PriviledgeTelemetry",
         "PriviledgeOptionalTelemetry",
         "ProfanityFilterRealms",
         "BannedScopes"
      }
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Attributes_BannedScope_descriptor = internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Attributes_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Attributes_BannedScope_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Attributes_BannedScope_descriptor,
      new String[]{"Type", "BanId", "Expires", "Reason", "ReasonMessage"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_handshake_v1_NvidiaGpuMemory_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_handshake_v1_NvidiaGpuMemory_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_handshake_v1_NvidiaGpuMemory_descriptor, new String[]{"DedicatedVramKb", "TotalAvailableMemoryKb"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_handshake_v1_MesaGpuMemory_descriptor = getDescriptor().getMessageTypes().get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_handshake_v1_MesaGpuMemory_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_handshake_v1_MesaGpuMemory_descriptor, new String[]{"TotalVramMb", "UnifiedMemory"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_handshake_v1_GameHandshake_descriptor = getDescriptor().getMessageTypes().get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_handshake_v1_GameHandshake_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_handshake_v1_GameHandshake_descriptor,
      new String[]{
         "MinecraftVersion",
         "LunarClientVersion",
         "Location",
         "IchorModules",
         "InstalledMods",
         "Modpack",
         "GlExtensions",
         "LaunchId",
         "NvidiaMemory",
         "MesaMemory",
         "Settings",
         "LunarClientUiVersion",
         "GpuMemory"
      }
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_handshake_v1_LauncherHandshake_descriptor = getDescriptor()
      .getMessageTypes()
      .get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_handshake_v1_LauncherHandshake_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_handshake_v1_LauncherHandshake_descriptor,
      new String[]{
         "Environment",
         "SessionId",
         "UpdaterStream",
         "ElectronBinariesType",
         "Elevated",
         "SilentStart",
         "UptimeSinceStart",
         "StartedAt",
         "BuildNumber",
         "GitCommitHash",
         "GitShortCommitHash",
         "RadioInfo",
         "OptimizedAds",
         "Analytics",
         "Owahe",
         "Settings",
         "SafeStorage"
      }
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
         "\n/lunarclient/websocket/handshake/v1/common.proto\u0012\"lunarclient.websocket.handshake.v1\u001a\u001fgoogle/protobuf/timestamp.proto\u001a#lunarclient/common/v1/modpack.proto\u001a lunarclient/common/v1/skin.proto\u001a lunarclient/common/v1/uuid.proto\u001a#lunarclient/common/v1/version.proto\u001a.lunarclient/websocket/language/v1/common.proto\u001a,lunarclient/common/v1/inbound_location.proto\u001a+lunarclient/websocket/radio/v1/common.proto\u001a-lunarclient/websocket/setting/v1/common.proto\"á\u0005\n\tHandshake\u0012Q\n\bidentity\u0018\u0001 \u0001(\u000b25.lunarclient.websocket.handshake.v1.MinecraftIdentityR\bidentity\u0012Q\n\u0010launcher_version\u0018\u0002 \u0001(\u000b2&.lunarclient.common.v1.LauncherVersionR\u000flauncherVersion\u0012'\n\u000finstallation_id\u0018\u0003 \u0001(\tR\u000einstallationId\u0012\u0016\n\u0004hwid\u0018\u0004 \u0001(\tB\u0002\u0018\u0001R\u0004hwid\u0012)\n\u0010operating_system\u0018\u0005 \u0001(\tR\u000foperatingSystem\u00128\n\u0018operating_system_release\u0018\u000b \u0001(\tR\u0016operatingSystemRelease\u0012)\n\u0010cpu_architecture\u0018\u0006 \u0001(\tR\u000fcpuArchitecture\u0012G\n\blanguage\u0018\u0007 \u0001(\u000b2+.lunarclient.websocket.language.v1.LanguageR\blanguage\u0012!\n\fcanary_token\u0018\n \u0001(\tR\u000bcanaryToken\u0012#\n\roverwolf_muid\u0018\f \u0001(\tR\foverwolfMuid\u0012Z\n\u000egame_handshake\u0018\b \u0001(\u000b21.lunarclient.websocket.handshake.v1.GameHandshakeH\u0000R\rgameHandshake\u0012f\n\u0012launcher_handshake\u0018\t \u0001(\u000b25.lunarclient.websocket.handshake.v1.LauncherHandshakeH\u0000R\u0011launcherHandshakeB\b\n\u0006client\"\u009c\u0002\n\fInstalledMod\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012\u0012\n\u0004name\u0018\u0002 \u0001(\tR\u0004name\u0012\u0018\n\u0007version\u0018\u0003 \u0001(\tR\u0007version\u0012I\n\u0004type\u0018\u0004 \u0001(\u000e25.lunarclient.websocket.handshake.v1.InstalledMod.TypeR\u0004type\"\u0082\u0001\n\u0004Type\u0012\u0014\n\u0010TYPE_UNSPECIFIED\u0010\u0000\u0012\u0018\n\u0014TYPE_FABRIC_INTERNAL\u0010\u0001\u0012\u0018\n\u0014TYPE_FABRIC_EXTERNAL\u0010\u0002\u0012\u0017\n\u0013TYPE_FORGE_INTERNAL\u0010\u0003\u0012\u0017\n\u0013TYPE_FORGE_EXTERNAL\u0010\u0004\"µ\u0010\n\u0011MinecraftIdentity\u0012>\n\u0006player\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0006player\u0012N\n\u0004type\u0018\u0002 \u0001(\u000e2:.lunarclient.websocket.handshake.v1.MinecraftIdentity.TypeR\u0004type\u0012+\n\u0011authenticator_jwt\u0018\u0003 \u0001(\tR\u0010authenticatorJwt\u0012P\n\u0005skins\u0018\u0004 \u0003(\u000b2:.lunarclient.websocket.handshake.v1.MinecraftIdentity.SkinR\u0005skins\u0012P\n\u0005capes\u0018\u0005 \u0003(\u000b2:.lunarclient.websocket.handshake.v1.MinecraftIdentity.CapeR\u0005capes\u0012`\n\nattributes\u0018\u0006 \u0001(\u000b2@.lunarclient.websocket.handshake.v1.MinecraftIdentity.AttributesR\nattributes\u00129\n\ncreated_at\u0018\b \u0001(\u000b2\u001a.google.protobuf.TimestampR\tcreatedAt\u0012a\n\u000bname_change\u0018\t \u0001(\u000b2@.lunarclient.websocket.handshake.v1.MinecraftIdentity.NameChangeR\nnameChange\u00120\n\u0014owns_bedrock_edition\u0018\n \u0001(\bR\u0012ownsBedrockEdition\u001aj\n\nNameChange\u0012B\n\u000flast_changed_at\u0018\u0001 \u0001(\u000b2\u001a.google.protobuf.TimestampR\rlastChangedAt\u0012\u0018\n\u0007allowed\u0018\u0002 \u0001(\bR\u0007allowed\u001aª\u0001\n\u0004Skin\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012X\n\u0005state\u0018\u0002 \u0001(\u000e2B.lunarclient.websocket.handshake.v1.MinecraftIdentity.TextureStateR\u0005state\u00128\n\u0004skin\u0018\u0003 \u0001(\u000b2$.lunarclient.common.v1.MinecraftSkinR\u0004skin\u001a¥\u0001\n\u0004Cape\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012X\n\u0005state\u0018\u0002 \u0001(\u000e2B.lunarclient.websocket.handshake.v1.MinecraftIdentity.TextureStateR\u0005state\u0012\u001d\n\ntexture_id\u0018\u0003 \u0001(\tR\ttextureId\u0012\u0014\n\u0005alias\u0018\u0004 \u0001(\tR\u0005alias\u001a£\u0006\n\nAttributes\u00124\n\u0016priviledge_online_chat\u0018\u0001 \u0001(\bR\u0014priviledgeOnlineChat\u0012B\n\u001dpriviledge_multiplayer_server\u0018\u0002 \u0001(\bR\u001bpriviledgeMultiplayerServer\u0012B\n\u001dpriviledge_multiplayer_realms\u0018\u0003 \u0001(\bR\u001bpriviledgeMultiplayerRealms\u00121\n\u0014priviledge_telemetry\u0018\u0004 \u0001(\bR\u0013priviledgeTelemetry\u0012B\n\u001dpriviledge_optional_telemetry\u0018\u0005 \u0001(\bR\u001bpriviledgeOptionalTelemetry\u00126\n\u0017profanity_filter_realms\u0018\u0006 \u0001(\bR\u0015profanityFilterRealms\u0012q\n\rbanned_scopes\u0018\u0007 \u0003(\u000b2L.lunarclient.websocket.handshake.v1.MinecraftIdentity.Attributes.BannedScopeR\fbannedScopes\u001a´\u0002\n\u000bBannedScope\u0012e\n\u0004type\u0018\u0001 \u0001(\u000e2Q.lunarclient.websocket.handshake.v1.MinecraftIdentity.Attributes.BannedScope.TypeR\u0004type\u0012\u0015\n\u0006ban_id\u0018\u0002 \u0001(\tR\u0005banId\u00124\n\u0007expires\u0018\u0003 \u0001(\u000b2\u001a.google.protobuf.TimestampR\u0007expires\u0012\u0016\n\u0006reason\u0018\u0004 \u0001(\tR\u0006reason\u0012%\n\u000ereason_message\u0018\u0005 \u0001(\tR\rreasonMessage\"2\n\u0004Type\u0012\u0014\n\u0010TYPE_UNSPECIFIED\u0010\u0000\u0012\u0014\n\u0010TYPE_MULTIPLAYER\u0010\u0001\"A\n\u0004Type\u0012\u0014\n\u0010TYPE_UNSPECIFIED\u0010\u0000\u0012\u000f\n\u000bTYPE_MOJANG\u0010\u0001\u0012\u0012\n\u000eTYPE_MICROSOFT\u0010\u0002\"c\n\fTextureState\u0012\u001d\n\u0019TEXTURE_STATE_UNSPECIFIED\u0010\u0000\u0012\u0018\n\u0014TEXTURE_STATE_ACTIVE\u0010\u0001\u0012\u001a\n\u0016TEXTURE_STATE_INACTIVE\u0010\u0002\"x\n\u000fNvidiaGpuMemory\u0012*\n\u0011dedicated_vram_kb\u0018\u0001 \u0001(\u0005R\u000fdedicatedVramKb\u00129\n\u0019total_available_memory_kb\u0018\u0002 \u0001(\u0005R\u0016totalAvailableMemoryKb\"Z\n\rMesaGpuMemory\u0012\"\n\rtotal_vram_mb\u0018\u0001 \u0001(\u0005R\u000btotalVramMb\u0012%\n\u000eunified_memory\u0018\u0002 \u0001(\bR\runifiedMemory\"÷\u0006\n\rGameHandshake\u0012T\n\u0011minecraft_version\u0018\u0001 \u0001(\u000b2'.lunarclient.common.v1.MinecraftVersionR\u0010minecraftVersion\u0012[\n\u0014lunar_client_version\u0018\u0002 \u0001(\u000b2).lunarclient.common.v1.LunarClientVersionR\u0012lunarClientVersion\u0012B\n\blocation\u0018\u0003 \u0001(\u000b2&.lunarclient.common.v1.InboundLocationR\blocation\u0012#\n\richor_modules\u0018\u0004 \u0003(\tR\fichorModules\u0012W\n\u000einstalled_mods\u0018\u0005 \u0003(\u000b20.lunarclient.websocket.handshake.v1.InstalledModR\rinstalledMods\u0012>\n\u0007modpack\u0018\u0006 \u0001(\u000b2$.lunarclient.common.v1.PlayerModpackR\u0007modpack\u0012#\n\rgl_extensions\u0018\u0007 \u0003(\tR\fglExtensions\u0012\u001b\n\tlaunch_id\u0018\b \u0001(\tR\blaunchId\u0012Z\n\rnvidia_memory\u0018\t \u0001(\u000b23.lunarclient.websocket.handshake.v1.NvidiaGpuMemoryH\u0000R\fnvidiaMemory\u0012T\n\u000bmesa_memory\u0018\n \u0001(\u000b21.lunarclient.websocket.handshake.v1.MesaGpuMemoryH\u0000R\nmesaMemory\u0012K\n\bsettings\u0018\u000b \u0003(\u000b2/.lunarclient.websocket.setting.v1.ClientSettingR\bsettings\u0012b\n\u0017lunar_client_ui_version\u0018\f \u0001(\u000b2+.lunarclient.common.v1.LunarClientUiVersionR\u0014lunarClientUiVersionB\f\n\ngpu_memory\"×\u0007\n\u0011LauncherHandshake\u0012 \n\u000benvironment\u0018\u0001 \u0001(\tR\u000benvironment\u0012\u001d\n\nsession_id\u0018\u0002 \u0001(\tR\tsessionId\u0012%\n\u000eupdater_stream\u0018\u0003 \u0001(\tR\rupdaterStream\u0012\u0080\u0001\n\u0016electron_binaries_type\u0018\u0004 \u0001(\u000e2J.lunarclient.websocket.handshake.v1.LauncherHandshake.ElectronBinariesTypeR\u0014electronBinariesType\u0012\u001a\n\belevated\u0018\u0005 \u0001(\bR\belevated\u0012!\n\fsilent_start\u0018\u0006 \u0001(\bR\u000bsilentStart\u0012,\n\u0012uptime_since_start\u0018\u0007 \u0001(\u0005R\u0010uptimeSinceStart\u00129\n\nstarted_at\u0018\b \u0001(\u000b2\u001a.google.protobuf.TimestampR\tstartedAt\u0012!\n\fbuild_number\u0018\t \u0001(\u0005R\u000bbuildNumber\u0012&\n\u000fgit_commit_hash\u0018\n \u0001(\tR\rgitCommitHash\u00121\n\u0015git_short_commit_hash\u0018\u000b \u0001(\tR\u0012gitShortCommitHash\u0012O\n\nradio_info\u0018\f \u0001(\u000b20.lunarclient.websocket.radio.v1.InboundRadioInfoR\tradioInfo\u0012#\n\roptimized_ads\u0018\r \u0001(\bR\foptimizedAds\u0012\u001c\n\tanalytics\u0018\u000e \u0001(\bR\tanalytics\u0012\u0014\n\u0005owahe\u0018\u000f \u0001(\bR\u0005owahe\u0012M\n\bsettings\u0018\u0010 \u0003(\u000b21.lunarclient.websocket.setting.v1.LauncherSettingR\bsettings\u0012!\n\fsafe_storage\u0018\u0011 \u0001(\bR\u000bsafeStorage\"\u0094\u0001\n\u0014ElectronBinariesType\u0012&\n\"ELECTRON_BINARIES_TYPE_UNSPECIFIED\u0010\u0000\u0012/\n+ELECTRON_BINARIES_TYPE_OVERWOLF_OW_ELECTRON\u0010\u0001\u0012#\n\u001fELECTRON_BINARIES_TYPE_ELECTRON\u0010\u0002Bà\u0001\n&com.lunarclient.websocket.handshake.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWHª\u0002\"Lunarclient.Websocket.Handshake.V1Ê\u0002\"Lunarclient\\Websocket\\Handshake\\V1â\u0002.Lunarclient\\Websocket\\Handshake\\V1\\GPBMetadataê\u0002%Lunarclient::Websocket::Handshake::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{
            TimestampProto.getDescriptor(),
            ModpackProto.getDescriptor(),
            SkinProto.getDescriptor(),
            UuidProto.getDescriptor(),
            VersionProto.getDescriptor(),
            com.lunarclient.websocket.language.v1.CommonProto.getDescriptor(),
            InboundLocationProto.getDescriptor(),
            com.lunarclient.websocket.radio.v1.CommonProto.getDescriptor(),
            com.lunarclient.websocket.setting.v1.CommonProto.getDescriptor()
         }
      );
      TimestampProto.getDescriptor();
      ModpackProto.getDescriptor();
      SkinProto.getDescriptor();
      UuidProto.getDescriptor();
      VersionProto.getDescriptor();
      com.lunarclient.websocket.language.v1.CommonProto.getDescriptor();
      InboundLocationProto.getDescriptor();
      com.lunarclient.websocket.radio.v1.CommonProto.getDescriptor();
      com.lunarclient.websocket.setting.v1.CommonProto.getDescriptor();
   }
}
