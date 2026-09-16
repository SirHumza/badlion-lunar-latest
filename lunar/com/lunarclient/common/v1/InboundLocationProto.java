package com.lunarclient.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class InboundLocationProto {
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_InboundServer_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_InboundServer_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_InboundServer_descriptor, new String[]{"ServerIp", "RichStatus"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_InboundSinglePlayer_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_InboundSinglePlayer_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_InboundSinglePlayer_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_InboundMinecraftRealms_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_InboundMinecraftRealms_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_InboundMinecraftRealms_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_InboundInMenus_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_InboundInMenus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_InboundInMenus_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_InboundInLauncher_descriptor = getDescriptor().getMessageTypes().get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_InboundInLauncher_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_InboundInLauncher_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_InboundHostedWorld_descriptor = getDescriptor().getMessageTypes().get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_InboundHostedWorld_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_InboundHostedWorld_descriptor, new String[]{"WorldHost"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_InboundReplayWorld_descriptor = getDescriptor().getMessageTypes().get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_InboundReplayWorld_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_InboundReplayWorld_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_InboundRewindWorld_descriptor = getDescriptor().getMessageTypes().get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_InboundRewindWorld_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_InboundRewindWorld_descriptor, new String[]{"Type"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_InboundInGame_descriptor = getDescriptor().getMessageTypes().get(8);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_InboundInGame_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_InboundInGame_descriptor, new String[]{"MinecraftVersion", "IsLaunch", "Modpack", "IsBadlion"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_InboundLocation_descriptor = getDescriptor().getMessageTypes().get(9);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_InboundLocation_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_InboundLocation_descriptor,
      new String[]{"Server", "SinglePlayer", "MinecraftRealms", "InMenus", "InLauncher", "HostedWorld", "ReplayWorld", "InGame", "RewindWorld", "Location"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private InboundLocationProto() {
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
         "\n,lunarclient/common/v1/inbound_location.proto\u0012\u0015lunarclient.common.v1\u001a$lunarclient/common/v1/location.proto\u001a#lunarclient/common/v1/modpack.proto\u001a lunarclient/common/v1/uuid.proto\u001a#lunarclient/common/v1/version.proto\"v\n\rInboundServer\u0012\u001b\n\tserver_ip\u0018\u0001 \u0001(\tR\bserverIp\u0012H\n\u000brich_status\u0018\u0002 \u0001(\u000b2'.lunarclient.common.v1.ServerRichStatusR\nrichStatus\"\u0015\n\u0013InboundSinglePlayer\"\u0018\n\u0016InboundMinecraftRealms\"\u0010\n\u000eInboundInMenus\"\u0013\n\u0011InboundInLauncher\"P\n\u0012InboundHostedWorld\u0012:\n\nworld_host\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\tworldHost\"\u0014\n\u0012InboundReplayWorld\"×\u0001\n\u0012InboundRewindWorld\u0012M\n\u0004type\u0018\u0001 \u0001(\u000e29.lunarclient.common.v1.InboundRewindWorld.RewindWorldTypeR\u0004type\"r\n\u000fRewindWorldType\u0012!\n\u001dREWIND_WORLD_TYPE_UNSPECIFIED\u0010\u0000\u0012\u001d\n\u0019REWIND_WORLD_TYPE_PROJECT\u0010\u0001\u0012\u001d\n\u0019REWIND_WORLD_TYPE_PREVIEW\u0010\u0002\"á\u0001\n\rInboundInGame\u0012T\n\u0011minecraft_version\u0018\u0001 \u0001(\u000b2'.lunarclient.common.v1.MinecraftVersionR\u0010minecraftVersion\u0012\u001b\n\tis_launch\u0018\u0002 \u0001(\bR\bisLaunch\u0012>\n\u0007modpack\u0018\u0003 \u0001(\u000b2$.lunarclient.common.v1.PlayerModpackR\u0007modpack\u0012\u001d\n\nis_badlion\u0018\u0004 \u0001(\bR\tisBadlion\"Î\u0005\n\u000fInboundLocation\u0012>\n\u0006server\u0018\u0001 \u0001(\u000b2$.lunarclient.common.v1.InboundServerH\u0000R\u0006server\u0012Q\n\rsingle_player\u0018\u0002 \u0001(\u000b2*.lunarclient.common.v1.InboundSinglePlayerH\u0000R\fsinglePlayer\u0012Z\n\u0010minecraft_realms\u0018\u0003 \u0001(\u000b2-.lunarclient.common.v1.InboundMinecraftRealmsH\u0000R\u000fminecraftRealms\u0012B\n\bin_menus\u0018\u0004 \u0001(\u000b2%.lunarclient.common.v1.InboundInMenusH\u0000R\u0007inMenus\u0012K\n\u000bin_launcher\u0018\u0005 \u0001(\u000b2(.lunarclient.common.v1.InboundInLauncherH\u0000R\ninLauncher\u0012N\n\fhosted_world\u0018\u0006 \u0001(\u000b2).lunarclient.common.v1.InboundHostedWorldH\u0000R\u000bhostedWorld\u0012N\n\freplay_world\u0018\u0007 \u0001(\u000b2).lunarclient.common.v1.InboundReplayWorldH\u0000R\u000breplayWorld\u0012?\n\u0007in_game\u0018\b \u0001(\u000b2$.lunarclient.common.v1.InboundInGameH\u0000R\u0006inGame\u0012N\n\frewind_world\u0018\t \u0001(\u000b2).lunarclient.common.v1.InboundRewindWorldH\u0000R\u000brewindWorldB\n\n\blocationB§\u0001\n\u0019com.lunarclient.common.v1B\u0014InboundLocationProtoP\u0001¢\u0002\u0003LCXª\u0002\u0015Lunarclient.Common.V1Ê\u0002\u0015Lunarclient\\Common\\V1â\u0002!Lunarclient\\Common\\V1\\GPBMetadataê\u0002\u0017Lunarclient::Common::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{LocationProto.getDescriptor(), ModpackProto.getDescriptor(), UuidProto.getDescriptor(), VersionProto.getDescriptor()}
      );
      LocationProto.getDescriptor();
      ModpackProto.getDescriptor();
      UuidProto.getDescriptor();
      VersionProto.getDescriptor();
   }
}
