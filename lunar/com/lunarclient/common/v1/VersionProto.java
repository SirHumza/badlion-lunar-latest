package com.lunarclient.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class VersionProto {
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_MinecraftVersion_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_MinecraftVersion_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_MinecraftVersion_descriptor, new String[]{"Enum", "Type", "Id"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_LauncherVersion_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_LauncherVersion_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_LauncherVersion_descriptor, new String[]{"Semver"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_LunarClientVersion_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_LunarClientVersion_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_LunarClientVersion_descriptor, new String[]{"GitBranch", "GitCommit", "Semver"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_LunarClientUiVersion_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_LunarClientUiVersion_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_LunarClientUiVersion_descriptor, new String[]{"GitBranch", "GitCommit"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private VersionProto() {
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
         "\n#lunarclient/common/v1/version.proto\u0012\u0015lunarclient.common.v1\"Ý\u0002\n\u0010MinecraftVersion\u0012\u0012\n\u0004enum\u0018\u0001 \u0001(\tR\u0004enum\u0012P\n\u0004type\u0018\u0002 \u0001(\u000e2<.lunarclient.common.v1.MinecraftVersion.MinecraftVersionTypeR\u0004type\u0012\u000e\n\u0002id\u0018\u0003 \u0001(\tR\u0002id\"Ò\u0001\n\u0014MinecraftVersionType\u0012&\n\"MINECRAFT_VERSION_TYPE_UNSPECIFIED\u0010\u0000\u0012\"\n\u001eMINECRAFT_VERSION_TYPE_RELEASE\u0010\u0001\u0012#\n\u001fMINECRAFT_VERSION_TYPE_SNAPSHOT\u0010\u0002\u0012#\n\u001fMINECRAFT_VERSION_TYPE_OLD_BETA\u0010\u0003\u0012$\n MINECRAFT_VERSION_TYPE_OLD_ALPHA\u0010\u0004\")\n\u000fLauncherVersion\u0012\u0016\n\u0006semver\u0018\u0001 \u0001(\tR\u0006semver\"j\n\u0012LunarClientVersion\u0012\u001d\n\ngit_branch\u0018\u0001 \u0001(\tR\tgitBranch\u0012\u001d\n\ngit_commit\u0018\u0002 \u0001(\tR\tgitCommit\u0012\u0016\n\u0006semver\u0018\u0003 \u0001(\tR\u0006semver\"T\n\u0014LunarClientUiVersion\u0012\u001d\n\ngit_branch\u0018\u0001 \u0001(\tR\tgitBranch\u0012\u001d\n\ngit_commit\u0018\u0002 \u0001(\tR\tgitCommitB\u009f\u0001\n\u0019com.lunarclient.common.v1B\fVersionProtoP\u0001¢\u0002\u0003LCXª\u0002\u0015Lunarclient.Common.V1Ê\u0002\u0015Lunarclient\\Common\\V1â\u0002!Lunarclient\\Common\\V1\\GPBMetadataê\u0002\u0017Lunarclient::Common::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
