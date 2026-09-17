package com.lunarclient.websocket.heartbeat.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_heartbeat_v1_LauncherHeartbeatRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_heartbeat_v1_LauncherHeartbeatRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_heartbeat_v1_LauncherHeartbeatRequest_descriptor,
      new String[]{"Focused", "GameCurrentlyLaunched", "RunningInstances", "OpenRenderers", "BadlionConnected"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_heartbeat_v1_LauncherHeartbeatResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_heartbeat_v1_LauncherHeartbeatResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_heartbeat_v1_LauncherHeartbeatResponse_descriptor, new String[]{"OnlineCounts"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_heartbeat_v1_GameHeartbeatRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_heartbeat_v1_GameHeartbeatRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_heartbeat_v1_GameHeartbeatRequest_descriptor, new String[]{"Mods", "ServerGameMode"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_heartbeat_v1_GameHeartbeatRequest_ModsEntry_descriptor = internal_static_lunarclient_websocket_heartbeat_v1_GameHeartbeatRequest_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_heartbeat_v1_GameHeartbeatRequest_ModsEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_heartbeat_v1_GameHeartbeatRequest_ModsEntry_descriptor, new String[]{"Key", "Value"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_heartbeat_v1_GameHeartbeatResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_heartbeat_v1_GameHeartbeatResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_heartbeat_v1_GameHeartbeatResponse_descriptor, new String[0]
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
         "\n0lunarclient/websocket/heartbeat/v1/service.proto\u0012\"lunarclient.websocket.heartbeat.v1\u001a/lunarclient/websocket/heartbeat/v1/common.proto\u001a.lunarclient/websocket/protocol/v1/common.proto\"Ü\u0002\n\u0018LauncherHeartbeatRequest\u0012\u001c\n\u0007focused\u0018\u0001 \u0001(\bB\u0002\u0018\u0001R\u0007focused\u0012:\n\u0017game_currently_launched\u0018\u0002 \u0001(\bB\u0002\u0018\u0001R\u0015gameCurrentlyLaunched\u0012`\n\u0011running_instances\u0018\u0003 \u0003(\u000b23.lunarclient.websocket.heartbeat.v1.RunningInstanceR\u0010runningInstances\u0012W\n\u000eopen_renderers\u0018\u0004 \u0003(\u000b20.lunarclient.websocket.heartbeat.v1.OpenRendererR\ropenRenderers\u0012+\n\u0011badlion_connected\u0018\u0005 \u0001(\bR\u0010badlionConnected\"r\n\u0019LauncherHeartbeatResponse\u0012U\n\ronline_counts\u0018\u0001 \u0001(\u000b20.lunarclient.websocket.heartbeat.v1.OnlineCountsR\fonlineCounts\"Ù\u0001\n\u0014GameHeartbeatRequest\u0012Z\n\u0004mods\u0018\u0001 \u0003(\u000b2B.lunarclient.websocket.heartbeat.v1.GameHeartbeatRequest.ModsEntryB\u0002\u0018\u0001R\u0004mods\u0012,\n\u0010server_game_mode\u0018\u0002 \u0001(\tB\u0002\u0018\u0001R\u000eserverGameMode\u001a7\n\tModsEntry\u0012\u0010\n\u0003key\u0018\u0001 \u0001(\tR\u0003key\u0012\u0014\n\u0005value\u0018\u0002 \u0001(\bR\u0005value:\u00028\u0001\"\u0017\n\u0015GameHeartbeatResponse2¸\u0002\n\u0010HeartbeatService\u0012\u0096\u0001\n\u0011LauncherHeartbeat\u0012<.lunarclient.websocket.heartbeat.v1.LauncherHeartbeatRequest\u001a=.lunarclient.websocket.heartbeat.v1.LauncherHeartbeatResponse\"\u0004\u0088µ\u0018\u0002\u0012\u008a\u0001\n\rGameHeartbeat\u00128.lunarclient.websocket.heartbeat.v1.GameHeartbeatRequest\u001a9.lunarclient.websocket.heartbeat.v1.GameHeartbeatResponse\"\u0004\u0088µ\u0018\u0001Bä\u0001\n&com.lunarclient.websocket.heartbeat.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWHª\u0002\"Lunarclient.Websocket.Heartbeat.V1Ê\u0002\"Lunarclient\\Websocket\\Heartbeat\\V1â\u0002.Lunarclient\\Websocket\\Heartbeat\\V1\\GPBMetadataê\u0002%Lunarclient::Websocket::Heartbeat::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{CommonProto.getDescriptor(), com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor()}
      );
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(com.lunarclient.websocket.protocol.v1.CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      CommonProto.getDescriptor();
      com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor();
   }
}
