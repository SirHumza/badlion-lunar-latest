package com.lunarclient.websocket.heartbeat.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_heartbeat_v1_RefreshMetadataPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_heartbeat_v1_RefreshMetadataPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_heartbeat_v1_RefreshMetadataPush_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_heartbeat_v1_CheckForUpdatesPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_heartbeat_v1_CheckForUpdatesPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_heartbeat_v1_CheckForUpdatesPush_descriptor, new String[]{"ForceInstall"}
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
         "\n-lunarclient/websocket/heartbeat/v1/push.proto\u0012\"lunarclient.websocket.heartbeat.v1\"\u0015\n\u0013RefreshMetadataPush\":\n\u0013CheckForUpdatesPush\u0012#\n\rforce_install\u0018\u0001 \u0001(\bR\fforceInstallBÞ\u0001\n&com.lunarclient.websocket.heartbeat.v1B\tPushProtoP\u0001¢\u0002\u0003LWHª\u0002\"Lunarclient.Websocket.Heartbeat.V1Ê\u0002\"Lunarclient\\Websocket\\Heartbeat\\V1â\u0002.Lunarclient\\Websocket\\Heartbeat\\V1\\GPBMetadataê\u0002%Lunarclient::Websocket::Heartbeat::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
