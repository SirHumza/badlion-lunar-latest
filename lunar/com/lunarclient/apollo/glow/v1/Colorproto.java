package com.lunarclient.apollo.glow.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.ColorProto;
import com.lunarclient.apollo.common.v1.UuidProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_glow_v1_OverrideGlowEffectMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_glow_v1_OverrideGlowEffectMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_glow_v1_OverrideGlowEffectMessage_descriptor, new String[]{"PlayerUuid", "Color"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_glow_v1_ResetGlowEffectMessage_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_glow_v1_ResetGlowEffectMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_glow_v1_ResetGlowEffectMessage_descriptor, new String[]{"PlayerUuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_glow_v1_ResetGlowEffectsMessage_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_glow_v1_ResetGlowEffectsMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_glow_v1_ResetGlowEffectsMessage_descriptor, new String[0]
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
         "\n'lunarclient/apollo/glow/v1/schema.proto\u0012\u001alunarclient.apollo.glow.v1\u001a(lunarclient/apollo/common/v1/color.proto\u001a'lunarclient/apollo/common/v1/uuid.proto\"\u009b\u0001\n\u0019OverrideGlowEffectMessage\u0012C\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\nplayerUuid\u00129\n\u0005color\u0018\u0002 \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\u0005color\"]\n\u0016ResetGlowEffectMessage\u0012C\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\nplayerUuid\"\u0019\n\u0017ResetGlowEffectsMessageB¸\u0001\n\u001ecom.lunarclient.apollo.glow.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LAGª\u0002\u001aLunarclient.Apollo.Glow.V1Ê\u0002\u001aLunarclient\\Apollo\\Glow\\V1â\u0002&Lunarclient\\Apollo\\Glow\\V1\\GPBMetadataê\u0002\u001dLunarclient::Apollo::Glow::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{ColorProto.getDescriptor(), UuidProto.getDescriptor()}
      );
      ColorProto.getDescriptor();
      UuidProto.getDescriptor();
   }
}
