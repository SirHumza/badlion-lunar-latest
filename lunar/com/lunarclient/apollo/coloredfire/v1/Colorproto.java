package com.lunarclient.apollo.coloredfire.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.ColorProto;
import com.lunarclient.apollo.common.v1.UuidProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_coloredfire_v1_OverrideColoredFireMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_coloredfire_v1_OverrideColoredFireMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_coloredfire_v1_OverrideColoredFireMessage_descriptor, new String[]{"PlayerUuid", "Color"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_coloredfire_v1_ResetColoredFireMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_coloredfire_v1_ResetColoredFireMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_coloredfire_v1_ResetColoredFireMessage_descriptor, new String[]{"PlayerUuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_coloredfire_v1_ResetColoredFiresMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_coloredfire_v1_ResetColoredFiresMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_coloredfire_v1_ResetColoredFiresMessage_descriptor, new String[0]
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
         "\n.lunarclient/apollo/coloredfire/v1/schema.proto\u0012!lunarclient.apollo.coloredfire.v1\u001a(lunarclient/apollo/common/v1/color.proto\u001a'lunarclient/apollo/common/v1/uuid.proto\"\u009c\u0001\n\u001aOverrideColoredFireMessage\u0012C\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\nplayerUuid\u00129\n\u0005color\u0018\u0002 \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\u0005color\"^\n\u0017ResetColoredFireMessage\u0012C\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\nplayerUuid\"\u001a\n\u0018ResetColoredFiresMessageBÛ\u0001\n%com.lunarclient.apollo.coloredfire.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LACª\u0002!Lunarclient.Apollo.Coloredfire.V1Ê\u0002!Lunarclient\\Apollo\\Coloredfire\\V1â\u0002-Lunarclient\\Apollo\\Coloredfire\\V1\\GPBMetadataê\u0002$Lunarclient::Apollo::Coloredfire::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{ColorProto.getDescriptor(), UuidProto.getDescriptor()}
      );
      ColorProto.getDescriptor();
      UuidProto.getDescriptor();
   }
}
