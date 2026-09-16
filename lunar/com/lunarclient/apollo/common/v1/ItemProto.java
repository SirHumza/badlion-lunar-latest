package com.lunarclient.apollo.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ItemProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_common_v1_CustomModelData_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_common_v1_CustomModelData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_common_v1_CustomModelData_descriptor, new String[]{"Floats", "Flags", "Strings", "Colors"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private ItemProto() {
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
         "\n'lunarclient/apollo/common/v1/item.proto\u0012\u001clunarclient.apollo.common.v1\"q\n\u000fCustomModelData\u0012\u0016\n\u0006floats\u0018\u0001 \u0003(\u0002R\u0006floats\u0012\u0014\n\u0005flags\u0018\u0002 \u0003(\bR\u0005flags\u0012\u0018\n\u0007strings\u0018\u0003 \u0003(\tR\u0007strings\u0012\u0016\n\u0006colors\u0018\u0004 \u0003(\u0005R\u0006colorsBÀ\u0001\n com.lunarclient.apollo.common.v1B\tItemProtoP\u0001¢\u0002\u0003LACª\u0002\u001cLunarclient.Apollo.Common.V1Ê\u0002\u001cLunarclient\\Apollo\\Common\\V1â\u0002(Lunarclient\\Apollo\\Common\\V1\\GPBMetadataê\u0002\u001fLunarclient::Apollo::Common::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
