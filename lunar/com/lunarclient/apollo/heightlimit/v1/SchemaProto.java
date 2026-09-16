package com.lunarclient.apollo.heightlimit.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_heightlimit_v1_OverrideHeightLimitMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_heightlimit_v1_OverrideHeightLimitMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_heightlimit_v1_OverrideHeightLimitMessage_descriptor, new String[]{"World", "Limit", "DisplayNameAdventureJsonLines"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_heightlimit_v1_RemoveHeightLimitMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_heightlimit_v1_RemoveHeightLimitMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_heightlimit_v1_RemoveHeightLimitMessage_descriptor, new String[]{"World"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_heightlimit_v1_ResetHeightLimitsMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_heightlimit_v1_ResetHeightLimitsMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_heightlimit_v1_ResetHeightLimitsMessage_descriptor, new String[0]
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
         "\n.lunarclient/apollo/heightlimit/v1/schema.proto\u0012!lunarclient.apollo.heightlimit.v1\"\u0092\u0001\n\u001aOverrideHeightLimitMessage\u0012\u0014\n\u0005world\u0018\u0001 \u0001(\tR\u0005world\u0012\u0014\n\u0005limit\u0018\u0002 \u0001(\u0005R\u0005limit\u0012H\n!display_name_adventure_json_lines\u0018\u0003 \u0001(\tR\u001ddisplayNameAdventureJsonLines\"0\n\u0018RemoveHeightLimitMessage\u0012\u0014\n\u0005world\u0018\u0001 \u0001(\tR\u0005world\"\u001a\n\u0018ResetHeightLimitsMessageBÛ\u0001\n%com.lunarclient.apollo.heightlimit.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LAHª\u0002!Lunarclient.Apollo.Heightlimit.V1Ê\u0002!Lunarclient\\Apollo\\Heightlimit\\V1â\u0002-Lunarclient\\Apollo\\Heightlimit\\V1\\GPBMetadataê\u0002$Lunarclient::Apollo::Heightlimit::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
