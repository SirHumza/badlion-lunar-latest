package com.lunarclient.apollo.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class VersionProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_common_v1_MinecraftVersion_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_common_v1_MinecraftVersion_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_common_v1_MinecraftVersion_descriptor, new String[]{"Enum"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_common_v1_LunarClientVersion_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_common_v1_LunarClientVersion_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_common_v1_LunarClientVersion_descriptor, new String[]{"GitBranch", "GitCommit", "Semver"}
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
         "\n*lunarclient/apollo/common/v1/version.proto\u0012\u001clunarclient.apollo.common.v1\"&\n\u0010MinecraftVersion\u0012\u0012\n\u0004enum\u0018\u0001 \u0001(\tR\u0004enum\"j\n\u0012LunarClientVersion\u0012\u001d\n\ngit_branch\u0018\u0001 \u0001(\tR\tgitBranch\u0012\u001d\n\ngit_commit\u0018\u0002 \u0001(\tR\tgitCommit\u0012\u0016\n\u0006semver\u0018\u0003 \u0001(\tR\u0006semverBÃ\u0001\n com.lunarclient.apollo.common.v1B\fVersionProtoP\u0001¢\u0002\u0003LACª\u0002\u001cLunarclient.Apollo.Common.V1Ê\u0002\u001cLunarclient\\Apollo\\Common\\V1â\u0002(Lunarclient\\Apollo\\Common\\V1\\GPBMetadataê\u0002\u001fLunarclient::Apollo::Common::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
