package com.lunarclient.gameipc.handshake.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_handshake_v1_Handshake_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_handshake_v1_Handshake_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_handshake_v1_Handshake_descriptor, new String[]{"LaunchId", "ProcessId", "InstallationId"}
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
         "\n-lunarclient/gameipc/handshake/v1/common.proto\u0012 lunarclient.gameipc.handshake.v1\"p\n\tHandshake\u0012\u001b\n\tlaunch_id\u0018\u0001 \u0001(\tR\blaunchId\u0012\u001d\n\nprocess_id\u0018\u0002 \u0001(\tR\tprocessId\u0012'\n\u000finstallation_id\u0018\u0003 \u0001(\tR\u000einstallationIdBÖ\u0001\n$com.lunarclient.gameipc.handshake.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LGHª\u0002 Lunarclient.Gameipc.Handshake.V1Ê\u0002 Lunarclient\\Gameipc\\Handshake\\V1â\u0002,Lunarclient\\Gameipc\\Handshake\\V1\\GPBMetadataê\u0002#Lunarclient::Gameipc::Handshake::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
