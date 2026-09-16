package com.lunarclient.apollo.vignette.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_vignette_v1_DisplayVignetteMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_vignette_v1_DisplayVignetteMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_vignette_v1_DisplayVignetteMessage_descriptor, new String[]{"ResourceLocation", "Opacity"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_vignette_v1_ResetVignetteMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_vignette_v1_ResetVignetteMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_vignette_v1_ResetVignetteMessage_descriptor, new String[0]
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
         "\n+lunarclient/apollo/vignette/v1/schema.proto\u0012\u001elunarclient.apollo.vignette.v1\"_\n\u0016DisplayVignetteMessage\u0012+\n\u0011resource_location\u0018\u0001 \u0001(\tR\u0010resourceLocation\u0012\u0018\n\u0007opacity\u0018\u0002 \u0001(\u0002R\u0007opacity\"\u0016\n\u0014ResetVignetteMessageBÌ\u0001\n\"com.lunarclient.apollo.vignette.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LAVª\u0002\u001eLunarclient.Apollo.Vignette.V1Ê\u0002\u001eLunarclient\\Apollo\\Vignette\\V1â\u0002*Lunarclient\\Apollo\\Vignette\\V1\\GPBMetadataê\u0002!Lunarclient::Apollo::Vignette::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
