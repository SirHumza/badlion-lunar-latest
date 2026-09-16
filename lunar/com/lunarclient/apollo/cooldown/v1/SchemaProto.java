package com.lunarclient.apollo.cooldown.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.DurationProto;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.ColorProto;
import com.lunarclient.apollo.common.v1.IconProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_cooldown_v1_DisplayCooldownMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_cooldown_v1_DisplayCooldownMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_cooldown_v1_DisplayCooldownMessage_descriptor, new String[]{"Name", "Duration", "Icon", "Style"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_cooldown_v1_RemoveCooldownMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_cooldown_v1_RemoveCooldownMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_cooldown_v1_RemoveCooldownMessage_descriptor, new String[]{"Name"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_cooldown_v1_ResetCooldownsMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_cooldown_v1_ResetCooldownsMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_cooldown_v1_ResetCooldownsMessage_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_cooldown_v1_CooldownStyle_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_cooldown_v1_CooldownStyle_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_cooldown_v1_CooldownStyle_descriptor,
      new String[]{"CircleStartColor", "CircleEndColor", "CircleEdgeColor", "TextColor"}
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
         "\n+lunarclient/apollo/cooldown/v1/schema.proto\u0012\u001elunarclient.apollo.cooldown.v1\u001a\u001egoogle/protobuf/duration.proto\u001a(lunarclient/apollo/common/v1/color.proto\u001a'lunarclient/apollo/common/v1/icon.proto\"à\u0001\n\u0016DisplayCooldownMessage\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u00125\n\bduration\u0018\u0002 \u0001(\u000b2\u0019.google.protobuf.DurationR\bduration\u00126\n\u0004icon\u0018\u0003 \u0001(\u000b2\".lunarclient.apollo.common.v1.IconR\u0004icon\u0012C\n\u0005style\u0018\u0004 \u0001(\u000b2-.lunarclient.apollo.cooldown.v1.CooldownStyleR\u0005style\"+\n\u0015RemoveCooldownMessage\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\"\u0017\n\u0015ResetCooldownsMessage\"Æ\u0002\n\rCooldownStyle\u0012Q\n\u0012circle_start_color\u0018\u0001 \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\u0010circleStartColor\u0012M\n\u0010circle_end_color\u0018\u0002 \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\u000ecircleEndColor\u0012O\n\u0011circle_edge_color\u0018\u0003 \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\u000fcircleEdgeColor\u0012B\n\ntext_color\u0018\u0004 \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\ttextColorBÌ\u0001\n\"com.lunarclient.apollo.cooldown.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LACª\u0002\u001eLunarclient.Apollo.Cooldown.V1Ê\u0002\u001eLunarclient\\Apollo\\Cooldown\\V1â\u0002*Lunarclient\\Apollo\\Cooldown\\V1\\GPBMetadataê\u0002!Lunarclient::Apollo::Cooldown::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{DurationProto.getDescriptor(), ColorProto.getDescriptor(), IconProto.getDescriptor()}
      );
      DurationProto.getDescriptor();
      ColorProto.getDescriptor();
      IconProto.getDescriptor();
   }
}
