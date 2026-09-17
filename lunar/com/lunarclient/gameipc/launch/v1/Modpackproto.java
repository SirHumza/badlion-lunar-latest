package com.lunarclient.gameipc.launch.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.ModpackProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_launch_v1_LaunchGameRequest_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_launch_v1_LaunchGameRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_launch_v1_LaunchGameRequest_descriptor,
      new String[]{"Version", "Module", "AutoJoinServerIp", "LaunchSource", "Modpack"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_launch_v1_LaunchGameResponse_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_launch_v1_LaunchGameResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_launch_v1_LaunchGameResponse_descriptor, new String[0]
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
         "\n+lunarclient/gameipc/launch/v1/service.proto\u0012\u001dlunarclient.gameipc.launch.v1\u001a#lunarclient/common/v1/modpack.proto\"Å\u0003\n\u0011LaunchGameRequest\u0012\u0018\n\u0007version\u0018\u0001 \u0001(\tR\u0007version\u0012\u0016\n\u0006module\u0018\u0002 \u0001(\tR\u0006module\u0012-\n\u0013auto_join_server_ip\u0018\u0003 \u0001(\tR\u0010autoJoinServerIp\u0012b\n\rlaunch_source\u0018\u0004 \u0001(\u000e2=.lunarclient.gameipc.launch.v1.LaunchGameRequest.LaunchSourceR\flaunchSource\u0012>\n\u0007modpack\u0018\u0005 \u0001(\u000b2$.lunarclient.common.v1.PlayerModpackR\u0007modpack\"ª\u0001\n\fLaunchSource\u0012\u001d\n\u0019LAUNCH_SOURCE_UNSPECIFIED\u0010\u0000\u0012$\n LAUNCH_SOURCE_MAIN_MENU_SWITCHER\u0010\u0001\u0012$\n LAUNCH_SOURCE_SERVER_KICK_PROMPT\u0010\u0002\u0012/\n+LAUNCH_SOURCE_SERVER_MODPACK_RECOMMENDATION\u0010\u0003\"\u0014\n\u0012LaunchGameResponse2\u0082\u0001\n\rLaunchService\u0012q\n\nLaunchGame\u00120.lunarclient.gameipc.launch.v1.LaunchGameRequest\u001a1.lunarclient.gameipc.launch.v1.LaunchGameResponseBË\u0001\n!com.lunarclient.gameipc.launch.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LGLª\u0002\u001dLunarclient.Gameipc.Launch.V1Ê\u0002\u001dLunarclient\\Gameipc\\Launch\\V1â\u0002)Lunarclient\\Gameipc\\Launch\\V1\\GPBMetadataê\u0002 Lunarclient::Gameipc::Launch::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{ModpackProto.getDescriptor()});
      ModpackProto.getDescriptor();
   }
}
