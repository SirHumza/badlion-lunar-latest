package com.lunarclient.apollo.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class CuboidProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_common_v1_Cuboid2D_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_common_v1_Cuboid2D_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_common_v1_Cuboid2D_descriptor, new String[]{"MinX", "MinZ", "MaxX", "MaxZ"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_common_v1_Cuboid3D_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_common_v1_Cuboid3D_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_common_v1_Cuboid3D_descriptor, new String[]{"MinX", "MinY", "MinZ", "MaxX", "MaxY", "MaxZ"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private CuboidProto() {
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
         "\n)lunarclient/apollo/common/v1/cuboid.proto\u0012\u001clunarclient.apollo.common.v1\"^\n\bCuboid2D\u0012\u0013\n\u0005min_x\u0018\u0001 \u0001(\u0001R\u0004minX\u0012\u0013\n\u0005min_z\u0018\u0002 \u0001(\u0001R\u0004minZ\u0012\u0013\n\u0005max_x\u0018\u0003 \u0001(\u0001R\u0004maxX\u0012\u0013\n\u0005max_z\u0018\u0004 \u0001(\u0001R\u0004maxZ\"\u0088\u0001\n\bCuboid3D\u0012\u0013\n\u0005min_x\u0018\u0001 \u0001(\u0001R\u0004minX\u0012\u0013\n\u0005min_y\u0018\u0002 \u0001(\u0001R\u0004minY\u0012\u0013\n\u0005min_z\u0018\u0003 \u0001(\u0001R\u0004minZ\u0012\u0013\n\u0005max_x\u0018\u0004 \u0001(\u0001R\u0004maxX\u0012\u0013\n\u0005max_y\u0018\u0005 \u0001(\u0001R\u0004maxY\u0012\u0013\n\u0005max_z\u0018\u0006 \u0001(\u0001R\u0004maxZBÂ\u0001\n com.lunarclient.apollo.common.v1B\u000bCuboidProtoP\u0001¢\u0002\u0003LACª\u0002\u001cLunarclient.Apollo.Common.V1Ê\u0002\u001cLunarclient\\Apollo\\Common\\V1â\u0002(Lunarclient\\Apollo\\Common\\V1\\GPBMetadataê\u0002\u001fLunarclient::Apollo::Common::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
