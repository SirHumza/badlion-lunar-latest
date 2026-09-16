package com.lunarclient.gameipc.launch.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_launch_v1_PlayServerPush_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_launch_v1_PlayServerPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_launch_v1_PlayServerPush_descriptor, new String[]{"AutoJoinServerIp"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_launch_v1_ExitGamePush_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_launch_v1_ExitGamePush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_launch_v1_ExitGamePush_descriptor, new String[0]
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
         "\n(lunarclient/gameipc/launch/v1/push.proto\u0012\u001dlunarclient.gameipc.launch.v1\"?\n\u000ePlayServerPush\u0012-\n\u0013auto_join_server_ip\u0018\u0001 \u0001(\tR\u0010autoJoinServerIp\"\u000e\n\fExitGamePushBÅ\u0001\n!com.lunarclient.gameipc.launch.v1B\tPushProtoP\u0001¢\u0002\u0003LGLª\u0002\u001dLunarclient.Gameipc.Launch.V1Ê\u0002\u001dLunarclient\\Gameipc\\Launch\\V1â\u0002)Lunarclient\\Gameipc\\Launch\\V1\\GPBMetadataê\u0002 Lunarclient::Gameipc::Launch::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
