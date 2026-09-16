package com.lunarclient.apollo.nametag.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.ComponentProto;
import com.lunarclient.apollo.common.v1.UuidProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_nametag_v1_OverrideNametagMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_nametag_v1_OverrideNametagMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_nametag_v1_OverrideNametagMessage_descriptor,
      new String[]{"PlayerUuid", "Lines", "AdventureJsonLines", "VisibilityOverride"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_nametag_v1_ResetNametagMessage_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_nametag_v1_ResetNametagMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_nametag_v1_ResetNametagMessage_descriptor, new String[]{"PlayerUuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_nametag_v1_ResetNametagsMessage_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_nametag_v1_ResetNametagsMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_nametag_v1_ResetNametagsMessage_descriptor, new String[0]
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
         "\n*lunarclient/apollo/nametag/v1/schema.proto\u0012\u001dlunarclient.apollo.nametag.v1\u001a,lunarclient/apollo/common/v1/component.proto\u001a'lunarclient/apollo/common/v1/uuid.proto\"½\u0002\n\u0016OverrideNametagMessage\u0012C\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\nplayerUuid\u0012A\n\u0005lines\u0018\u0002 \u0003(\u000b2'.lunarclient.apollo.common.v1.ComponentB\u0002\u0018\u0001R\u0005lines\u00120\n\u0014adventure_json_lines\u0018\u0003 \u0003(\tR\u0012adventureJsonLines\u0012i\n\u0013visibility_override\u0018\u0004 \u0001(\u000e28.lunarclient.apollo.nametag.v1.NametagVisibilityOverrideR\u0012visibilityOverride\"Z\n\u0013ResetNametagMessage\u0012C\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\nplayerUuid\"\u0016\n\u0014ResetNametagsMessage*½\u0001\n\u0019NametagVisibilityOverride\u0012+\n'NAMETAG_VISIBILITY_OVERRIDE_UNSPECIFIED\u0010\u0000\u0012$\n NAMETAG_VISIBILITY_OVERRIDE_NONE\u0010\u0001\u0012%\n!NAMETAG_VISIBILITY_OVERRIDE_SHOWN\u0010\u0002\u0012&\n\"NAMETAG_VISIBILITY_OVERRIDE_HIDDEN\u0010\u0003BÇ\u0001\n!com.lunarclient.apollo.nametag.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LANª\u0002\u001dLunarclient.Apollo.Nametag.V1Ê\u0002\u001dLunarclient\\Apollo\\Nametag\\V1â\u0002)Lunarclient\\Apollo\\Nametag\\V1\\GPBMetadataê\u0002 Lunarclient::Apollo::Nametag::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{ComponentProto.getDescriptor(), UuidProto.getDescriptor()}
      );
      ComponentProto.getDescriptor();
      UuidProto.getDescriptor();
   }
}
