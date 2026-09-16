package com.lunarclient.apollo.beam.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.ColorProto;
import com.lunarclient.apollo.common.v1.LocationProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_beam_v1_DisplayBeaconBeamMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_beam_v1_DisplayBeaconBeamMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_beam_v1_DisplayBeaconBeamMessage_descriptor, new String[]{"Id", "Color", "Location"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_beam_v1_RemoveBeaconBeamMessage_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_beam_v1_RemoveBeaconBeamMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_beam_v1_RemoveBeaconBeamMessage_descriptor, new String[]{"Id"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_beam_v1_ResetBeaconBeamsMessage_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_beam_v1_ResetBeaconBeamsMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_beam_v1_ResetBeaconBeamsMessage_descriptor, new String[0]
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
         "\n'lunarclient/apollo/beam/v1/schema.proto\u0012\u001alunarclient.apollo.beam.v1\u001a(lunarclient/apollo/common/v1/color.proto\u001a+lunarclient/apollo/common/v1/location.proto\"®\u0001\n\u0018DisplayBeaconBeamMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u00129\n\u0005color\u0018\u0002 \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\u0005color\u0012G\n\blocation\u0018\u0003 \u0001(\u000b2+.lunarclient.apollo.common.v1.BlockLocationR\blocation\")\n\u0017RemoveBeaconBeamMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\"\u0019\n\u0017ResetBeaconBeamsMessageB¸\u0001\n\u001ecom.lunarclient.apollo.beam.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LABª\u0002\u001aLunarclient.Apollo.Beam.V1Ê\u0002\u001aLunarclient\\Apollo\\Beam\\V1â\u0002&Lunarclient\\Apollo\\Beam\\V1\\GPBMetadataê\u0002\u001dLunarclient::Apollo::Beam::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{ColorProto.getDescriptor(), LocationProto.getDescriptor()}
      );
      ColorProto.getDescriptor();
      LocationProto.getDescriptor();
   }
}
