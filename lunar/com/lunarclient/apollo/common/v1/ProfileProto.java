package com.lunarclient.apollo.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ProfileProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_common_v1_Profile_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_common_v1_Profile_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_common_v1_Profile_descriptor, new String[]{"Id", "Texture", "Signature"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private ProfileProto() {
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
         "\n*lunarclient/apollo/common/v1/profile.proto\u0012\u001clunarclient.apollo.common.v1\u001a'lunarclient/apollo/common/v1/uuid.proto\"u\n\u0007Profile\u00122\n\u0002id\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\u0002id\u0012\u0018\n\u0007texture\u0018\u0002 \u0001(\tR\u0007texture\u0012\u001c\n\tsignature\u0018\u0003 \u0001(\tR\tsignatureBÃ\u0001\n com.lunarclient.apollo.common.v1B\fProfileProtoP\u0001¢\u0002\u0003LACª\u0002\u001cLunarclient.Apollo.Common.V1Ê\u0002\u001cLunarclient\\Apollo\\Common\\V1â\u0002(Lunarclient\\Apollo\\Common\\V1\\GPBMetadataê\u0002\u001fLunarclient::Apollo::Common::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{UuidProto.getDescriptor()});
      UuidProto.getDescriptor();
   }
}
