package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.ColorProto;
import com.lunarclient.common.v1.UuidProto;
import com.lunarclient.common.v1.VersionProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_LoginRequest_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_LoginRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_LoginRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_LoginResponse_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_LoginResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_LoginResponse_descriptor,
      new String[]{"HostingEnabled", "JoiningEnabled", "MaxWorldPlayerCount", "PingRequests", "MultiplayerRefreshIntervalSeconds"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_StartHostingWorldRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_StartHostingWorldRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_StartHostingWorldRequest_descriptor, new String[]{"Heartbeat"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_StartHostingWorldResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_StartHostingWorldResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_StartHostingWorldResponse_descriptor, new String[]{"Status", "JoinIp"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_StopHostingWorldRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_StopHostingWorldRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_StopHostingWorldRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_StopHostingWorldResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_StopHostingWorldResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_StopHostingWorldResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldHeartbeatRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldHeartbeatRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldHeartbeatRequest_descriptor, new String[]{"Heartbeat"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldHeartbeatResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldHeartbeatResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldHeartbeatResponse_descriptor, new String[]{"Status", "RelaysToPing"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_ListHostedWorldsRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(8);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_ListHostedWorldsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_ListHostedWorldsRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_ListHostedWorldsResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(9);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_ListHostedWorldsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_ListHostedWorldsResponse_descriptor, new String[]{"HostedWorlds"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_ListHostedWorldsResponse_HostedWorld_descriptor = internal_static_lunarclient_websocket_hostedworld_v1_ListHostedWorldsResponse_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_ListHostedWorldsResponse_HostedWorld_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_ListHostedWorldsResponse_HostedWorld_descriptor,
      new String[]{"Host", "MinecraftVersion", "Joinability", "OnlinePlayers", "MaxPlayers", "SamplePlayers", "LunarPlusBoost", "LogoColor", "PlusColor"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(10);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldRequest_descriptor, new String[]{"WorldHostUuid", "PingResponses", "Source"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_PreJoinHostedWorldRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(11);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_PreJoinHostedWorldRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_PreJoinHostedWorldRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_PreJoinHostedWorldResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(12);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_PreJoinHostedWorldResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_PreJoinHostedWorldResponse_descriptor, new String[]{"RelaysToPing"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(13);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldResponse_descriptor, new String[]{"Status", "Relay", "Joinability"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_ConfirmHostedWorldJoinRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(14);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_ConfirmHostedWorldJoinRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_ConfirmHostedWorldJoinRequest_descriptor, new String[]{"WorldHostUuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_ConfirmHostedWorldJoinResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(15);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_ConfirmHostedWorldJoinResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_ConfirmHostedWorldJoinResponse_descriptor, new String[0]
   );
   private static Descriptors.FileDescriptor descriptor;

   private ServiceProto() {
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
         "\n2lunarclient/websocket/hostedworld/v1/service.proto\u0012$lunarclient.websocket.hostedworld.v1\u001a!lunarclient/common/v1/color.proto\u001a lunarclient/common/v1/uuid.proto\u001a#lunarclient/common/v1/version.proto\u001a1lunarclient/websocket/hostedworld/v1/common.proto\u001a.lunarclient/websocket/protocol/v1/common.proto\"\u000e\n\fLoginRequest\"Â\u0002\n\rLoginResponse\u0012'\n\u000fhosting_enabled\u0018\u0001 \u0001(\bR\u000ehostingEnabled\u0012'\n\u000fjoining_enabled\u0018\u0002 \u0001(\bR\u000ejoiningEnabled\u00123\n\u0016max_world_player_count\u0018\u0003 \u0001(\u0005R\u0013maxWorldPlayerCount\u0012Y\n\rping_requests\u0018\u0004 \u0003(\u000b24.lunarclient.websocket.hostedworld.v1.AddressAndPortR\fpingRequests\u0012O\n$multiplayer_refresh_interval_seconds\u0018\u0005 \u0001(\u0005R!multiplayerRefreshIntervalSeconds\"i\n\u0018StartHostingWorldRequest\u0012M\n\theartbeat\u0018\u0001 \u0001(\u000b2/.lunarclient.websocket.hostedworld.v1.HeartbeatR\theartbeat\"\u0084\u0002\n\u0019StartHostingWorldResponse\u0012^\n\u0006status\u0018\u0001 \u0001(\u000e2F.lunarclient.websocket.hostedworld.v1.StartHostingWorldResponse.StatusR\u0006status\u0012\u0017\n\u0007join_ip\u0018\u0002 \u0001(\tR\u0006joinIp\"n\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012 \n\u001cSTATUS_ALREADY_HOSTING_WORLD\u0010\u0002\u0012\u001b\n\u0017STATUS_HOSTING_DISABLED\u0010\u0003\"\u0019\n\u0017StopHostingWorldRequest\"È\u0001\n\u0018StopHostingWorldResponse\u0012]\n\u0006status\u0018\u0001 \u0001(\u000e2E.lunarclient.websocket.hostedworld.v1.StopHostingWorldResponse.StatusR\u0006status\"M\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001c\n\u0018STATUS_NOT_HOSTING_WORLD\u0010\u0002\"l\n\u001bHostedWorldHeartbeatRequest\u0012M\n\theartbeat\u0018\u0001 \u0001(\u000b2/.lunarclient.websocket.hostedworld.v1.HeartbeatR\theartbeat\"¬\u0002\n\u001cHostedWorldHeartbeatResponse\u0012a\n\u0006status\u0018\u0001 \u0001(\u000e2I.lunarclient.websocket.hostedworld.v1.HostedWorldHeartbeatResponse.StatusR\u0006status\u0012Z\n\u000erelays_to_ping\u0018\u0002 \u0003(\u000b24.lunarclient.websocket.hostedworld.v1.AddressAndPortR\frelaysToPing\"M\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001c\n\u0018STATUS_NOT_HOSTING_WORLD\u0010\u0002\"\u0019\n\u0017ListHostedWorldsRequest\"½\u0005\n\u0018ListHostedWorldsResponse\u0012o\n\rhosted_worlds\u0018\u0001 \u0003(\u000b2J.lunarclient.websocket.hostedworld.v1.ListHostedWorldsResponse.HostedWorldR\fhostedWorlds\u001a¯\u0004\n\u000bHostedWorld\u0012:\n\u0004host\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0004host\u0012T\n\u0011minecraft_version\u0018\u0002 \u0001(\u000b2'.lunarclient.common.v1.MinecraftVersionR\u0010minecraftVersion\u0012S\n\u000bjoinability\u0018\u0003 \u0001(\u000e21.lunarclient.websocket.hostedworld.v1.JoinabilityR\u000bjoinability\u0012%\n\u000eonline_players\u0018\u0004 \u0001(\u0005R\ronlinePlayers\u0012\u001f\n\u000bmax_players\u0018\u0005 \u0001(\u0005R\nmaxPlayers\u0012M\n\u000esample_players\u0018\u0006 \u0003(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\rsamplePlayers\u0012(\n\u0010lunar_plus_boost\u0018\u0007 \u0001(\bR\u000elunarPlusBoost\u0012;\n\nlogo_color\u0018\b \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tlogoColor\u0012;\n\nplus_color\u0018\t \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tplusColor\"¶\u0003\n\u0016JoinHostedWorldRequest\u0012C\n\u000fworld_host_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\rworldHostUuid\u0012Y\n\u000eping_responses\u0018\u0002 \u0003(\u000b22.lunarclient.websocket.hostedworld.v1.PingResponseR\rpingResponses\u0012[\n\u0006source\u0018\u0003 \u0001(\u000e2C.lunarclient.websocket.hostedworld.v1.JoinHostedWorldRequest.SourceR\u0006source\"\u009e\u0001\n\u0006Source\u0012\u0016\n\u0012SOURCE_UNSPECIFIED\u0010\u0000\u0012\u001a\n\u0016SOURCE_FRIEND_CHAT_BOX\u0010\u0001\u0012\u001d\n\u0019SOURCE_FRIEND_LIST_INLINE\u0010\u0002\u0012\"\n\u001eSOURCE_FRIEND_LIST_RIGHT_CLICK\u0010\u0003\u0012\u001d\n\u0019SOURCE_MULTIPLAYER_SERVER\u0010\u0004\"\u001b\n\u0019PreJoinHostedWorldRequest\"x\n\u001aPreJoinHostedWorldResponse\u0012Z\n\u000erelays_to_ping\u0018\u0001 \u0003(\u000b24.lunarclient.websocket.hostedworld.v1.AddressAndPortR\frelaysToPing\"«\u0003\n\u0017JoinHostedWorldResponse\u0012\\\n\u0006status\u0018\u0001 \u0001(\u000e2D.lunarclient.websocket.hostedworld.v1.JoinHostedWorldResponse.StatusR\u0006status\u0012J\n\u0005relay\u0018\u0002 \u0001(\u000b24.lunarclient.websocket.hostedworld.v1.AddressAndPortR\u0005relay\u0012S\n\u000bjoinability\u0018\u0003 \u0001(\u000e21.lunarclient.websocket.hostedworld.v1.JoinabilityR\u000bjoinability\"\u0090\u0001\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u0014\n\u0010STATUS_NO_ACCESS\u0010\u0002\u0012\u0017\n\u0013STATUS_NOT_JOINABLE\u0010\u0003\u0012\u001b\n\u0017STATUS_JOINING_DISABLED\u0010\u0004\u0012\u0013\n\u000fSTATUS_NO_RELAY\u0010\u0005\"d\n\u001dConfirmHostedWorldJoinRequest\u0012C\n\u000fworld_host_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\rworldHostUuid\" \n\u001eConfirmHostedWorldJoinResponse2æ\t\n\u0012HostedWorldService\u0012v\n\u0005Login\u00122.lunarclient.websocket.hostedworld.v1.LoginRequest\u001a3.lunarclient.websocket.hostedworld.v1.LoginResponse\"\u0004\u0088µ\u0018\u0003\u0012\u009a\u0001\n\u0011StartHostingWorld\u0012>.lunarclient.websocket.hostedworld.v1.StartHostingWorldRequest\u001a?.lunarclient.websocket.hostedworld.v1.StartHostingWorldResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0097\u0001\n\u0010StopHostingWorld\u0012=.lunarclient.websocket.hostedworld.v1.StopHostingWorldRequest\u001a>.lunarclient.websocket.hostedworld.v1.StopHostingWorldResponse\"\u0004\u0088µ\u0018\u0003\u0012£\u0001\n\u0014HostedWorldHeartbeat\u0012A.lunarclient.websocket.hostedworld.v1.HostedWorldHeartbeatRequest\u001aB.lunarclient.websocket.hostedworld.v1.HostedWorldHeartbeatResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0097\u0001\n\u0010ListHostedWorlds\u0012=.lunarclient.websocket.hostedworld.v1.ListHostedWorldsRequest\u001a>.lunarclient.websocket.hostedworld.v1.ListHostedWorldsResponse\"\u0004\u0088µ\u0018\u0001\u0012\u009d\u0001\n\u0012PreJoinHostedWorld\u0012?.lunarclient.websocket.hostedworld.v1.PreJoinHostedWorldRequest\u001a@.lunarclient.websocket.hostedworld.v1.PreJoinHostedWorldResponse\"\u0004\u0088µ\u0018\u0001\u0012\u0094\u0001\n\u000fJoinHostedWorld\u0012<.lunarclient.websocket.hostedworld.v1.JoinHostedWorldRequest\u001a=.lunarclient.websocket.hostedworld.v1.JoinHostedWorldResponse\"\u0004\u0088µ\u0018\u0001\u0012©\u0001\n\u0016ConfirmHostedWorldJoin\u0012C.lunarclient.websocket.hostedworld.v1.ConfirmHostedWorldJoinRequest\u001aD.lunarclient.websocket.hostedworld.v1.ConfirmHostedWorldJoinResponse\"\u0004\u0088µ\u0018\u0001Bî\u0001\n(com.lunarclient.websocket.hostedworld.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWHª\u0002$Lunarclient.Websocket.Hostedworld.V1Ê\u0002$Lunarclient\\Websocket\\Hostedworld\\V1â\u00020Lunarclient\\Websocket\\Hostedworld\\V1\\GPBMetadataê\u0002'Lunarclient::Websocket::Hostedworld::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{
            ColorProto.getDescriptor(),
            UuidProto.getDescriptor(),
            VersionProto.getDescriptor(),
            CommonProto.getDescriptor(),
            com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor()
         }
      );
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(com.lunarclient.websocket.protocol.v1.CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      ColorProto.getDescriptor();
      UuidProto.getDescriptor();
      VersionProto.getDescriptor();
      CommonProto.getDescriptor();
      com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor();
   }
}
