package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.DurationProto;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.TimestampProto;
import com.lunarclient.common.v1.UuidProto;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_AddressAndPort_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_AddressAndPort_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_AddressAndPort_descriptor, new String[]{"Address", "Port"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_PingResponse_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_PingResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_PingResponse_descriptor, new String[]{"Target", "Success", "Latency"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_descriptor,
      new String[]{"AllowedJoinSources", "MaxPlayers", "WhitelistedUuids", "OnlinePlayers", "OfflinePlayers", "PingResponses"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_OnlinePlayer_descriptor = internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_OnlinePlayer_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_OnlinePlayer_descriptor, new String[]{"Player"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_OfflinePlayer_descriptor = internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_descriptor.getNestedTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_OfflinePlayer_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_OfflinePlayer_descriptor, new String[]{"Player", "LastOnline"}
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
         "\n1lunarclient/websocket/hostedworld/v1/common.proto\u0012$lunarclient.websocket.hostedworld.v1\u001a\u001egoogle/protobuf/duration.proto\u001a\u001fgoogle/protobuf/timestamp.proto\u001a lunarclient/common/v1/uuid.proto\">\n\u000eAddressAndPort\u0012\u0018\n\u0007address\u0018\u0001 \u0001(\tR\u0007address\u0012\u0012\n\u0004port\u0018\u0002 \u0001(\u0005R\u0004port\"«\u0001\n\fPingResponse\u0012L\n\u0006target\u0018\u0001 \u0001(\u000b24.lunarclient.websocket.hostedworld.v1.AddressAndPortR\u0006target\u0012\u0018\n\u0007success\u0018\u0002 \u0001(\bR\u0007success\u00123\n\u0007latency\u0018\u0003 \u0001(\u000b2\u0019.google.protobuf.DurationR\u0007latency\"á\u0005\n\tHeartbeat\u0012b\n\u0014allowed_join_sources\u0018\u0001 \u0003(\u000e20.lunarclient.websocket.hostedworld.v1.JoinSourceR\u0012allowedJoinSources\u0012\u001f\n\u000bmax_players\u0018\u0002 \u0001(\u0005R\nmaxPlayers\u0012H\n\u0011whitelisted_uuids\u0018\u0003 \u0003(\u000b2\u001b.lunarclient.common.v1.UuidR\u0010whitelistedUuids\u0012c\n\u000eonline_players\u0018\u0004 \u0003(\u000b2<.lunarclient.websocket.hostedworld.v1.Heartbeat.OnlinePlayerR\ronlinePlayers\u0012f\n\u000foffline_players\u0018\u0005 \u0003(\u000b2=.lunarclient.websocket.hostedworld.v1.Heartbeat.OfflinePlayerR\u000eofflinePlayers\u0012Y\n\u000eping_responses\u0018\u0006 \u0003(\u000b22.lunarclient.websocket.hostedworld.v1.PingResponseR\rpingResponses\u001aN\n\fOnlinePlayer\u0012>\n\u0006player\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0006player\u001a\u008c\u0001\n\rOfflinePlayer\u0012>\n\u0006player\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0006player\u0012;\n\u000blast_online\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.TimestampR\nlastOnline*µ\u0001\n\nJoinSource\u0012\u001b\n\u0017JOIN_SOURCE_UNSPECIFIED\u0010\u0000\u0012\"\n\u001eJOIN_SOURCE_LOCAL_AREA_NETWORK\u0010\u0001\u0012&\n\"JOIN_SOURCE_HOSTED_WORLD_WHITELIST\u0010\u0002\u0012$\n JOIN_SOURCE_LUNAR_CLIENT_FRIENDS\u0010\u0003\u0012\u0018\n\u0014JOIN_SOURCE_EVERYONE\u0010\u0004*\u008f\u0001\n\u000bJoinability\u0012\u001b\n\u0017JOINABILITY_UNSPECIFIED\u0010\u0000\u0012\u0017\n\u0013JOINABILITY_ALLOWED\u0010\u0001\u0012\u001a\n\u0016JOINABILITY_WORLD_FULL\u0010\u0002\u0012.\n*JOINABILITY_INCOMPATIBLE_MINECRAFT_VERSION\u0010\u0003*:\n\u0004Role\u0012\u0014\n\u0010ROLE_UNSPECIFIED\u0010\u0000\u0012\r\n\tROLE_NONE\u0010\u0001\u0012\r\n\tROLE_HOST\u0010\u0002Bê\u0001\n(com.lunarclient.websocket.hostedworld.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWHª\u0002$Lunarclient.Websocket.Hostedworld.V1Ê\u0002$Lunarclient\\Websocket\\Hostedworld\\V1â\u00020Lunarclient\\Websocket\\Hostedworld\\V1\\GPBMetadataê\u0002'Lunarclient::Websocket::Hostedworld::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{DurationProto.getDescriptor(), TimestampProto.getDescriptor(), UuidProto.getDescriptor()}
      );
      DurationProto.getDescriptor();
      TimestampProto.getDescriptor();
      UuidProto.getDescriptor();
   }
}
