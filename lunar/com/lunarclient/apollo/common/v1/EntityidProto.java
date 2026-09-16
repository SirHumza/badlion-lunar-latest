package com.lunarclient.apollo.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class EntityidProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_common_v1_EntityId_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_common_v1_EntityId_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_common_v1_EntityId_descriptor, new String[]{"EntityId", "EntityUuid"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private EntityidProto() {
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
         "\n+lunarclient/apollo/common/v1/entityid.proto\u0012\u001clunarclient.apollo.common.v1\u001a'lunarclient/apollo/common/v1/uuid.proto\"l\n\bEntityId\u0012\u001b\n\tentity_id\u0018\u0001 \u0001(\u0005R\bentityId\u0012C\n\u000bentity_uuid\u0018\u0002 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\nentityUuidBÄ\u0001\n com.lunarclient.apollo.common.v1B\rEntityidProtoP\u0001¢\u0002\u0003LACª\u0002\u001cLunarclient.Apollo.Common.V1Ê\u0002\u001cLunarclient\\Apollo\\Common\\V1â\u0002(Lunarclient\\Apollo\\Common\\V1\\GPBMetadataê\u0002\u001fLunarclient::Apollo::Common::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{UuidProto.getDescriptor()});
      UuidProto.getDescriptor();
   }
}
