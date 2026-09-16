package com.lunarclient.apollo.entity.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.EntityidProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_entity_v1_OverrideRainbowSheepMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_entity_v1_OverrideRainbowSheepMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_entity_v1_OverrideRainbowSheepMessage_descriptor, new String[]{"EntityIds"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_entity_v1_ResetRainbowSheepMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_entity_v1_ResetRainbowSheepMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_entity_v1_ResetRainbowSheepMessage_descriptor, new String[]{"EntityIds"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_entity_v1_FlipEntityMessage_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_entity_v1_FlipEntityMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_entity_v1_FlipEntityMessage_descriptor, new String[]{"EntityIds"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_entity_v1_ResetFlipedEntityMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_entity_v1_ResetFlipedEntityMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_entity_v1_ResetFlipedEntityMessage_descriptor, new String[]{"EntityIds"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private SchemaProto() {
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
         "\n)lunarclient/apollo/entity/v1/schema.proto\u0012\u001clunarclient.apollo.entity.v1\u001a+lunarclient/apollo/common/v1/entityid.proto\"d\n\u001bOverrideRainbowSheepMessage\u0012E\n\nentity_ids\u0018\u0001 \u0003(\u000b2&.lunarclient.apollo.common.v1.EntityIdR\tentityIds\"a\n\u0018ResetRainbowSheepMessage\u0012E\n\nentity_ids\u0018\u0001 \u0003(\u000b2&.lunarclient.apollo.common.v1.EntityIdR\tentityIds\"Z\n\u0011FlipEntityMessage\u0012E\n\nentity_ids\u0018\u0001 \u0003(\u000b2&.lunarclient.apollo.common.v1.EntityIdR\tentityIds\"a\n\u0018ResetFlipedEntityMessage\u0012E\n\nentity_ids\u0018\u0001 \u0003(\u000b2&.lunarclient.apollo.common.v1.EntityIdR\tentityIdsBÂ\u0001\n com.lunarclient.apollo.entity.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LAEª\u0002\u001cLunarclient.Apollo.Entity.V1Ê\u0002\u001cLunarclient\\Apollo\\Entity\\V1â\u0002(Lunarclient\\Apollo\\Entity\\V1\\GPBMetadataê\u0002\u001fLunarclient::Apollo::Entity::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{EntityidProto.getDescriptor()});
      EntityidProto.getDescriptor();
   }
}
