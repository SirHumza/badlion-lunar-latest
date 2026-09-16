package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.TimestampProto;
import com.lunarclient.common.v1.ColorProto;
import com.lunarclient.common.v1.UuidProto;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldPush_descriptor,
      new String[]{"Relay", "RelaySessionId", "JoinerUuid", "SimpleVoiceChatEndpoint"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldAvailablePush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldAvailablePush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldAvailablePush_descriptor, new String[]{"WorldHost"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldWhitelistedPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldWhitelistedPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldWhitelistedPush_descriptor, new String[]{"WorldHost"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_descriptor,
      new String[]{"OnlinePlayers", "OfflinePlayers", "AllowedJoinSources", "MaxPlayers"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_OnlinePlayer_descriptor = internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_OnlinePlayer_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_OnlinePlayer_descriptor,
      new String[]{"Player", "Role", "LogoColor", "PlusColor"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_OfflinePlayer_descriptor = internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_descriptor.getNestedTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_OfflinePlayer_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_OfflinePlayer_descriptor, new String[]{"Player", "LastOnline"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private PushProto() {
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
         "\n/lunarclient/websocket/hostedworld/v1/push.proto\u0012$lunarclient.websocket.hostedworld.v1\u001a\u001fgoogle/protobuf/timestamp.proto\u001a!lunarclient/common/v1/color.proto\u001a lunarclient/common/v1/uuid.proto\u001a1lunarclient/websocket/hostedworld/v1/common.proto\"¼\u0002\n\u0013JoinHostedWorldPush\u0012J\n\u0005relay\u0018\u0001 \u0001(\u000b24.lunarclient.websocket.hostedworld.v1.AddressAndPortR\u0005relay\u0012(\n\u0010relay_session_id\u0018\u0002 \u0001(\tR\u000erelaySessionId\u0012<\n\u000bjoiner_uuid\u0018\u0003 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\njoinerUuid\u0012q\n\u001asimple_voice_chat_endpoint\u0018\u0004 \u0001(\u000b24.lunarclient.websocket.hostedworld.v1.AddressAndPortR\u0017simpleVoiceChatEndpoint\"a\n\u0018HostedWorldAvailablePush\u0012E\n\nworld_host\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\tworldHost\"c\n\u001aHostedWorldWhitelistedPush\u0012E\n\nworld_host\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\tworldHost\"\u009b\u0006\n\u0015HostedWorldStatusPush\u0012o\n\u000eonline_players\u0018\u0001 \u0003(\u000b2H.lunarclient.websocket.hostedworld.v1.HostedWorldStatusPush.OnlinePlayerR\ronlinePlayers\u0012r\n\u000foffline_players\u0018\u0002 \u0003(\u000b2I.lunarclient.websocket.hostedworld.v1.HostedWorldStatusPush.OfflinePlayerR\u000eofflinePlayers\u0012b\n\u0014allowed_join_sources\u0018\u0003 \u0003(\u000e20.lunarclient.websocket.hostedworld.v1.JoinSourceR\u0012allowedJoinSources\u0012\u001f\n\u000bmax_players\u0018\u0004 \u0001(\u0005R\nmaxPlayers\u001a\u0088\u0002\n\fOnlinePlayer\u0012>\n\u0006player\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0006player\u0012>\n\u0004role\u0018\u0002 \u0001(\u000e2*.lunarclient.websocket.hostedworld.v1.RoleR\u0004role\u0012;\n\nlogo_color\u0018\u0003 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tlogoColor\u0012;\n\nplus_color\u0018\u0004 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tplusColor\u001a\u008c\u0001\n\rOfflinePlayer\u0012>\n\u0006player\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0006player\u0012;\n\u000blast_online\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.TimestampR\nlastOnlineBè\u0001\n(com.lunarclient.websocket.hostedworld.v1B\tPushProtoP\u0001¢\u0002\u0003LWHª\u0002$Lunarclient.Websocket.Hostedworld.V1Ê\u0002$Lunarclient\\Websocket\\Hostedworld\\V1â\u00020Lunarclient\\Websocket\\Hostedworld\\V1\\GPBMetadataê\u0002'Lunarclient::Websocket::Hostedworld::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{TimestampProto.getDescriptor(), ColorProto.getDescriptor(), UuidProto.getDescriptor(), CommonProto.getDescriptor()}
      );
      TimestampProto.getDescriptor();
      ColorProto.getDescriptor();
      UuidProto.getDescriptor();
      CommonProto.getDescriptor();
   }
}
