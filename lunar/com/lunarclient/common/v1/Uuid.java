package com.lunarclient.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class UuidProto {
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_Uuid_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_Uuid_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_Uuid_descriptor, new String[]{"High64", "Low64"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_UuidAndUsername_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_UuidAndUsername_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_UuidAndUsername_descriptor, new String[]{"Uuid", "Username"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private UuidProto() {
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
         "\n lunarclient/common/v1/uuid.proto\u0012\u0015lunarclient.common.v1\"4\n\u0004Uuid\u0012\u0016\n\u0006high64\u0018\u0001 \u0001(\u0006R\u0006high64\u0012\u0014\n\u0005low64\u0018\u0002 \u0001(\u0006R\u0005low64\"^\n\u000fUuidAndUsername\u0012/\n\u0004uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\u0004uuid\u0012\u001a\n\busername\u0018\u0002 \u0001(\tR\busernameB\u009c\u0001\n\u0019com.lunarclient.common.v1B\tUuidProtoP\u0001¢\u0002\u0003LCXª\u0002\u0015Lunarclient.Common.V1Ê\u0002\u0015Lunarclient\\Common\\V1â\u0002!Lunarclient\\Common\\V1\\GPBMetadataê\u0002\u0017Lunarclient::Common::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
