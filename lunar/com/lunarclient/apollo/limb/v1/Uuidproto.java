package com.lunarclient.apollo.limb.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.UuidProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_limb_v1_HideArmorPiecesMessage_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_limb_v1_HideArmorPiecesMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_limb_v1_HideArmorPiecesMessage_descriptor, new String[]{"PlayerUuid", "ArmorPieces"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_limb_v1_ResetArmorPiecesMessage_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_limb_v1_ResetArmorPiecesMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_limb_v1_ResetArmorPiecesMessage_descriptor, new String[]{"PlayerUuid", "ArmorPieces"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_limb_v1_HideBodyPartMessage_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_limb_v1_HideBodyPartMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_limb_v1_HideBodyPartMessage_descriptor, new String[]{"PlayerUuid", "BodyParts"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_limb_v1_ResetBodyPartMessage_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_limb_v1_ResetBodyPartMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_limb_v1_ResetBodyPartMessage_descriptor, new String[]{"PlayerUuid", "BodyParts"}
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
         "\n'lunarclient/apollo/limb/v1/schema.proto\u0012\u001alunarclient.apollo.limb.v1\u001a'lunarclient/apollo/common/v1/uuid.proto\"¨\u0001\n\u0016HideArmorPiecesMessage\u0012C\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\nplayerUuid\u0012I\n\farmor_pieces\u0018\u0002 \u0003(\u000e2&.lunarclient.apollo.limb.v1.ArmorPieceR\u000barmorPieces\"©\u0001\n\u0017ResetArmorPiecesMessage\u0012C\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\nplayerUuid\u0012I\n\farmor_pieces\u0018\u0002 \u0003(\u000e2&.lunarclient.apollo.limb.v1.ArmorPieceR\u000barmorPieces\"\u009f\u0001\n\u0013HideBodyPartMessage\u0012C\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\nplayerUuid\u0012C\n\nbody_parts\u0018\u0002 \u0003(\u000e2$.lunarclient.apollo.limb.v1.BodyPartR\tbodyParts\" \u0001\n\u0014ResetBodyPartMessage\u0012C\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\nplayerUuid\u0012C\n\nbody_parts\u0018\u0002 \u0003(\u000e2$.lunarclient.apollo.limb.v1.BodyPartR\tbodyParts*\u008e\u0001\n\nArmorPiece\u0012\u001b\n\u0017ARMOR_PIECE_UNSPECIFIED\u0010\u0000\u0012\u0016\n\u0012ARMOR_PIECE_HELMET\u0010\u0001\u0012\u001a\n\u0016ARMOR_PIECE_CHESTPLATE\u0010\u0002\u0012\u0018\n\u0014ARMOR_PIECE_LEGGINGS\u0010\u0003\u0012\u0015\n\u0011ARMOR_PIECE_BOOTS\u0010\u0004*°\u0001\n\bBodyPart\u0012\u0019\n\u0015BODY_PART_UNSPECIFIED\u0010\u0000\u0012\u0012\n\u000eBODY_PART_HEAD\u0010\u0001\u0012\u0013\n\u000fBODY_PART_TORSO\u0010\u0002\u0012\u0016\n\u0012BODY_PART_LEFT_ARM\u0010\u0003\u0012\u0017\n\u0013BODY_PART_RIGHT_ARM\u0010\u0004\u0012\u0016\n\u0012BODY_PART_LEFT_LEG\u0010\u0005\u0012\u0017\n\u0013BODY_PART_RIGHT_LEG\u0010\u0006B¸\u0001\n\u001ecom.lunarclient.apollo.limb.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LALª\u0002\u001aLunarclient.Apollo.Limb.V1Ê\u0002\u001aLunarclient\\Apollo\\Limb\\V1â\u0002&Lunarclient\\Apollo\\Limb\\V1\\GPBMetadataê\u0002\u001dLunarclient::Apollo::Limb::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{UuidProto.getDescriptor()});
      UuidProto.getDescriptor();
   }
}
