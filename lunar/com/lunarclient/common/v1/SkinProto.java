package com.lunarclient.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class SkinProto {
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_MinecraftSkin_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_MinecraftSkin_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_MinecraftSkin_descriptor, new String[]{"TextureId", "Model"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private SkinProto() {
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
         "\n lunarclient/common/v1/skin.proto\u0012\u0015lunarclient.common.v1\"o\n\rMinecraftSkin\u0012\u001d\n\ntexture_id\u0018\u0001 \u0001(\tR\ttextureId\u0012?\n\u0005model\u0018\u0002 \u0001(\u000e2).lunarclient.common.v1.MinecraftSkinModelR\u0005model*{\n\u0012MinecraftSkinModel\u0012$\n MINECRAFT_SKIN_MODEL_UNSPECIFIED\u0010\u0000\u0012 \n\u001cMINECRAFT_SKIN_MODEL_CLASSIC\u0010\u0001\u0012\u001d\n\u0019MINECRAFT_SKIN_MODEL_SLIM\u0010\u0002B\u009c\u0001\n\u0019com.lunarclient.common.v1B\tSkinProtoP\u0001¢\u0002\u0003LCXª\u0002\u0015Lunarclient.Common.V1Ê\u0002\u0015Lunarclient\\Common\\V1â\u0002!Lunarclient\\Common\\V1\\GPBMetadataê\u0002\u0017Lunarclient::Common::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
