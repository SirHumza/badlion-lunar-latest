package com.lunarclient.apollo.pingmarker.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.DurationProto;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.ColorProto;
import com.lunarclient.apollo.common.v1.IconProto;
import com.lunarclient.apollo.common.v1.LocationProto;
import com.lunarclient.apollo.common.v1.SoundProto;
import com.lunarclient.apollo.common.v1.UuidProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_pingmarker_v1_SetPingMarkerTypeMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_pingmarker_v1_SetPingMarkerTypeMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_pingmarker_v1_SetPingMarkerTypeMessage_descriptor, new String[]{"Id", "Icon"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_pingmarker_v1_SetPingMarkerTypesMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_pingmarker_v1_SetPingMarkerTypesMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_pingmarker_v1_SetPingMarkerTypesMessage_descriptor, new String[]{"Types"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_pingmarker_v1_RemovePingMarkerTypeMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_pingmarker_v1_RemovePingMarkerTypeMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_pingmarker_v1_RemovePingMarkerTypeMessage_descriptor, new String[]{"Id"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_pingmarker_v1_ResetPingMarkerTypesMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_pingmarker_v1_ResetPingMarkerTypesMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_pingmarker_v1_ResetPingMarkerTypesMessage_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_pingmarker_v1_RequestPlayerPingMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_pingmarker_v1_RequestPlayerPingMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_pingmarker_v1_RequestPlayerPingMessage_descriptor, new String[]{"Id", "Type", "SourceLocation", "TargetLocation"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_pingmarker_v1_DisplayPlayerPingMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_pingmarker_v1_DisplayPlayerPingMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_pingmarker_v1_DisplayPlayerPingMessage_descriptor,
      new String[]{"Id", "Type", "Location", "Color", "Icon", "Sound", "Duration", "Focus"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_pingmarker_v1_RemovePlayerPingMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_pingmarker_v1_RemovePlayerPingMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_pingmarker_v1_RemovePlayerPingMessage_descriptor, new String[]{"Id"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_pingmarker_v1_ResetPlayerPingMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_pingmarker_v1_ResetPlayerPingMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_pingmarker_v1_ResetPlayerPingMessage_descriptor, new String[0]
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
         "\n-lunarclient/apollo/pingmarker/v1/schema.proto\u0012 lunarclient.apollo.pingmarker.v1\u001a\u001egoogle/protobuf/duration.proto\u001a(lunarclient/apollo/common/v1/color.proto\u001a'lunarclient/apollo/common/v1/icon.proto\u001a+lunarclient/apollo/common/v1/location.proto\u001a(lunarclient/apollo/common/v1/sound.proto\u001a'lunarclient/apollo/common/v1/uuid.proto\"b\n\u0018SetPingMarkerTypeMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u00126\n\u0004icon\u0018\u0002 \u0001(\u000b2\".lunarclient.apollo.common.v1.IconR\u0004icon\"m\n\u0019SetPingMarkerTypesMessage\u0012P\n\u0005types\u0018\u0001 \u0003(\u000b2:.lunarclient.apollo.pingmarker.v1.SetPingMarkerTypeMessageR\u0005types\"-\n\u001bRemovePingMarkerTypeMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\"\u001d\n\u001bResetPingMarkerTypesMessage\"\u0084\u0002\n\u0018RequestPlayerPingMessage\u00122\n\u0002id\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\u0002id\u0012\u0012\n\u0004type\u0018\u0002 \u0001(\tR\u0004type\u0012O\n\u000fsource_location\u0018\u0003 \u0001(\u000b2&.lunarclient.apollo.common.v1.LocationR\u000esourceLocation\u0012O\n\u000ftarget_location\u0018\u0004 \u0001(\u000b2&.lunarclient.apollo.common.v1.LocationR\u000etargetLocation\"¡\u0003\n\u0018DisplayPlayerPingMessage\u00122\n\u0002id\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\u0002id\u0012\u0012\n\u0004type\u0018\u0002 \u0001(\tR\u0004type\u0012B\n\blocation\u0018\u0003 \u0001(\u000b2&.lunarclient.apollo.common.v1.LocationR\blocation\u00129\n\u0005color\u0018\u0004 \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\u0005color\u00126\n\u0004icon\u0018\u0005 \u0001(\u000b2\".lunarclient.apollo.common.v1.IconR\u0004icon\u00129\n\u0005sound\u0018\u0006 \u0001(\u000b2#.lunarclient.apollo.common.v1.SoundR\u0005sound\u00125\n\bduration\u0018\u0007 \u0001(\u000b2\u0019.google.protobuf.DurationR\bduration\u0012\u0014\n\u0005focus\u0018\b \u0001(\bR\u0005focus\"M\n\u0017RemovePlayerPingMessage\u00122\n\u0002id\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\u0002id\"\u0018\n\u0016ResetPlayerPingMessageBÖ\u0001\n$com.lunarclient.apollo.pingmarker.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LAPª\u0002 Lunarclient.Apollo.Pingmarker.V1Ê\u0002 Lunarclient\\Apollo\\Pingmarker\\V1â\u0002,Lunarclient\\Apollo\\Pingmarker\\V1\\GPBMetadataê\u0002#Lunarclient::Apollo::Pingmarker::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{
            DurationProto.getDescriptor(),
            ColorProto.getDescriptor(),
            IconProto.getDescriptor(),
            LocationProto.getDescriptor(),
            SoundProto.getDescriptor(),
            UuidProto.getDescriptor()
         }
      );
      DurationProto.getDescriptor();
      ColorProto.getDescriptor();
      IconProto.getDescriptor();
      LocationProto.getDescriptor();
      SoundProto.getDescriptor();
      UuidProto.getDescriptor();
   }
}
