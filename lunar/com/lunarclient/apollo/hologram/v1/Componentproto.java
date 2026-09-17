package com.lunarclient.apollo.hologram.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.ComponentProto;
import com.lunarclient.apollo.common.v1.LocationProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_hologram_v1_DisplayHologramMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_hologram_v1_DisplayHologramMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_hologram_v1_DisplayHologramMessage_descriptor,
      new String[]{"Id", "Location", "Lines", "ShowThroughWalls", "ShowShadow", "ShowBackground", "AdventureJsonLines"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_hologram_v1_RemoveHologramMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_hologram_v1_RemoveHologramMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_hologram_v1_RemoveHologramMessage_descriptor, new String[]{"Id"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_hologram_v1_ResetHologramsMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_hologram_v1_ResetHologramsMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_hologram_v1_ResetHologramsMessage_descriptor, new String[0]
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
         "\n+lunarclient/apollo/hologram/v1/schema.proto\u0012\u001elunarclient.apollo.hologram.v1\u001a,lunarclient/apollo/common/v1/component.proto\u001a+lunarclient/apollo/common/v1/location.proto\"Ù\u0002\n\u0016DisplayHologramMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012B\n\blocation\u0018\u0002 \u0001(\u000b2&.lunarclient.apollo.common.v1.LocationR\blocation\u0012A\n\u0005lines\u0018\u0003 \u0003(\u000b2'.lunarclient.apollo.common.v1.ComponentB\u0002\u0018\u0001R\u0005lines\u0012,\n\u0012show_through_walls\u0018\u0004 \u0001(\bR\u0010showThroughWalls\u0012\u001f\n\u000bshow_shadow\u0018\u0005 \u0001(\bR\nshowShadow\u0012'\n\u000fshow_background\u0018\u0006 \u0001(\bR\u000eshowBackground\u00120\n\u0014adventure_json_lines\u0018\u0007 \u0003(\tR\u0012adventureJsonLines\"'\n\u0015RemoveHologramMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\"\u0017\n\u0015ResetHologramsMessageBÌ\u0001\n\"com.lunarclient.apollo.hologram.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LAHª\u0002\u001eLunarclient.Apollo.Hologram.V1Ê\u0002\u001eLunarclient\\Apollo\\Hologram\\V1â\u0002*Lunarclient\\Apollo\\Hologram\\V1\\GPBMetadataê\u0002!Lunarclient::Apollo::Hologram::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{ComponentProto.getDescriptor(), LocationProto.getDescriptor()}
      );
      ComponentProto.getDescriptor();
      LocationProto.getDescriptor();
   }
}
