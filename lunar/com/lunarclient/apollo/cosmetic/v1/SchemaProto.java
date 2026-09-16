package com.lunarclient.apollo.cosmetic.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.DurationProto;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.LocationProto;
import com.lunarclient.apollo.common.v1.UuidProto;
import com.lunarclient.apollo.packetenrichment.v1.RaytraceProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_cosmetic_v1_EquipNpcCosmeticsMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_cosmetic_v1_EquipNpcCosmeticsMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_cosmetic_v1_EquipNpcCosmeticsMessage_descriptor, new String[]{"NpcUuid", "Cosmetics", "CopyLocalCosmetics"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_cosmetic_v1_UnequipNpcCosmeticsMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_cosmetic_v1_UnequipNpcCosmeticsMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_cosmetic_v1_UnequipNpcCosmeticsMessage_descriptor, new String[]{"NpcUuid", "CosmeticIds"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_cosmetic_v1_ResetNpcCosmeticsMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_cosmetic_v1_ResetNpcCosmeticsMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_cosmetic_v1_ResetNpcCosmeticsMessage_descriptor, new String[]{"NpcUuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_cosmetic_v1_Cosmetic_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_cosmetic_v1_Cosmetic_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_cosmetic_v1_Cosmetic_descriptor,
      new String[]{"Id", "HatOptions", "CloakOptions", "PetOptions", "BodyOptions", "Options"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_cosmetic_v1_HatOptions_descriptor = getDescriptor().getMessageTypes().get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_cosmetic_v1_HatOptions_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_cosmetic_v1_HatOptions_descriptor, new String[]{"ShowOverHelmet", "ShowOverSkinLayer", "HeightOffset"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_cosmetic_v1_CloakOptions_descriptor = getDescriptor().getMessageTypes().get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_cosmetic_v1_CloakOptions_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_cosmetic_v1_CloakOptions_descriptor, new String[]{"UseClothPhysics"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_cosmetic_v1_PetOptions_descriptor = getDescriptor().getMessageTypes().get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_cosmetic_v1_PetOptions_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_cosmetic_v1_PetOptions_descriptor, new String[]{"FlipShoulder"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_cosmetic_v1_BodyOptions_descriptor = getDescriptor().getMessageTypes().get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_cosmetic_v1_BodyOptions_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_cosmetic_v1_BodyOptions_descriptor, new String[]{"ShowOverChestplate", "ShowOverLeggings", "ShowOverBoots"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_cosmetic_v1_StartNpcEmoteMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(8);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_cosmetic_v1_StartNpcEmoteMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_cosmetic_v1_StartNpcEmoteMessage_descriptor, new String[]{"NpcUuid", "Emote"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_cosmetic_v1_StopNpcEmoteMessage_descriptor = getDescriptor().getMessageTypes().get(9);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_cosmetic_v1_StopNpcEmoteMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_cosmetic_v1_StopNpcEmoteMessage_descriptor, new String[]{"NpcUuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_cosmetic_v1_ResetNpcEmotesMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(10);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_cosmetic_v1_ResetNpcEmotesMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_cosmetic_v1_ResetNpcEmotesMessage_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_cosmetic_v1_Emote_descriptor = getDescriptor().getMessageTypes().get(11);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_cosmetic_v1_Emote_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_cosmetic_v1_Emote_descriptor, new String[]{"Id", "Metadata"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_cosmetic_v1_DisplaySprayMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(12);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_cosmetic_v1_DisplaySprayMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_cosmetic_v1_DisplaySprayMessage_descriptor, new String[]{"SprayId", "Location", "Facing", "Rotation", "Duration"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_cosmetic_v1_RemoveSprayMessage_descriptor = getDescriptor().getMessageTypes().get(13);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_cosmetic_v1_RemoveSprayMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_cosmetic_v1_RemoveSprayMessage_descriptor, new String[]{"SprayId", "Location"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_cosmetic_v1_ResetSpraysMessage_descriptor = getDescriptor().getMessageTypes().get(14);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_cosmetic_v1_ResetSpraysMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_cosmetic_v1_ResetSpraysMessage_descriptor, new String[0]
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
         "\n+lunarclient/apollo/cosmetic/v1/schema.proto\u0012\u001elunarclient.apollo.cosmetic.v1\u001a+lunarclient/apollo/common/v1/location.proto\u001a'lunarclient/apollo/common/v1/uuid.proto\u001a5lunarclient/apollo/packetenrichment/v1/raytrace.proto\u001a\u001egoogle/protobuf/duration.proto\"Ó\u0001\n\u0018EquipNpcCosmeticsMessage\u0012=\n\bnpc_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\u0007npcUuid\u0012F\n\tcosmetics\u0018\u0002 \u0003(\u000b2(.lunarclient.apollo.cosmetic.v1.CosmeticR\tcosmetics\u00120\n\u0014copy_local_cosmetics\u0018\u0003 \u0001(\bR\u0012copyLocalCosmetics\"~\n\u001aUnequipNpcCosmeticsMessage\u0012=\n\bnpc_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\u0007npcUuid\u0012!\n\fcosmetic_ids\u0018\u0002 \u0003(\u0005R\u000bcosmeticIds\"Y\n\u0018ResetNpcCosmeticsMessage\u0012=\n\bnpc_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\u0007npcUuid\"ê\u0002\n\bCosmetic\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\u0005R\u0002id\u0012M\n\u000bhat_options\u0018\u0002 \u0001(\u000b2*.lunarclient.apollo.cosmetic.v1.HatOptionsH\u0000R\nhatOptions\u0012S\n\rcloak_options\u0018\u0003 \u0001(\u000b2,.lunarclient.apollo.cosmetic.v1.CloakOptionsH\u0000R\fcloakOptions\u0012M\n\u000bpet_options\u0018\u0004 \u0001(\u000b2*.lunarclient.apollo.cosmetic.v1.PetOptionsH\u0000R\npetOptions\u0012P\n\fbody_options\u0018\u0005 \u0001(\u000b2+.lunarclient.apollo.cosmetic.v1.BodyOptionsH\u0000R\u000bbodyOptionsB\t\n\u0007options\"\u008c\u0001\n\nHatOptions\u0012(\n\u0010show_over_helmet\u0018\u0001 \u0001(\bR\u000eshowOverHelmet\u0012/\n\u0014show_over_skin_layer\u0018\u0002 \u0001(\bR\u0011showOverSkinLayer\u0012#\n\rheight_offset\u0018\u0003 \u0001(\u0002R\fheightOffset\":\n\fCloakOptions\u0012*\n\u0011use_cloth_physics\u0018\u0001 \u0001(\bR\u000fuseClothPhysics\"1\n\nPetOptions\u0012#\n\rflip_shoulder\u0018\u0001 \u0001(\bR\fflipShoulder\"\u0095\u0001\n\u000bBodyOptions\u00120\n\u0014show_over_chestplate\u0018\u0001 \u0001(\bR\u0012showOverChestplate\u0012,\n\u0012show_over_leggings\u0018\u0002 \u0001(\bR\u0010showOverLeggings\u0012&\n\u000fshow_over_boots\u0018\u0003 \u0001(\bR\rshowOverBoots\"\u0092\u0001\n\u0014StartNpcEmoteMessage\u0012=\n\bnpc_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\u0007npcUuid\u0012;\n\u0005emote\u0018\u0002 \u0001(\u000b2%.lunarclient.apollo.cosmetic.v1.EmoteR\u0005emote\"T\n\u0013StopNpcEmoteMessage\u0012=\n\bnpc_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\u0007npcUuid\"\u0017\n\u0015ResetNpcEmotesMessage\"3\n\u0005Emote\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\u0005R\u0002id\u0012\u001a\n\bmetadata\u0018\u0002 \u0001(\u0005R\bmetadata\"\u0097\u0002\n\u0013DisplaySprayMessage\u0012\u0019\n\bspray_id\u0018\u0001 \u0001(\u0005R\u0007sprayId\u0012G\n\blocation\u0018\u0002 \u0001(\u000b2+.lunarclient.apollo.common.v1.BlockLocationR\blocation\u0012I\n\u0006facing\u0018\u0003 \u0001(\u000e21.lunarclient.apollo.packetenrichment.v1.DirectionR\u0006facing\u0012\u001a\n\brotation\u0018\u0004 \u0001(\u0002R\brotation\u00125\n\bduration\u0018\u0005 \u0001(\u000b2\u0019.google.protobuf.DurationR\bduration\"x\n\u0012RemoveSprayMessage\u0012\u0019\n\bspray_id\u0018\u0001 \u0001(\u0005R\u0007sprayId\u0012G\n\blocation\u0018\u0002 \u0001(\u000b2+.lunarclient.apollo.common.v1.BlockLocationR\blocation\"\u0014\n\u0012ResetSpraysMessageBÌ\u0001\n\"com.lunarclient.apollo.cosmetic.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LACª\u0002\u001eLunarclient.Apollo.Cosmetic.V1Ê\u0002\u001eLunarclient\\Apollo\\Cosmetic\\V1â\u0002*Lunarclient\\Apollo\\Cosmetic\\V1\\GPBMetadataê\u0002!Lunarclient::Apollo::Cosmetic::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{
            LocationProto.getDescriptor(), UuidProto.getDescriptor(), RaytraceProto.getDescriptor(), DurationProto.getDescriptor()
         }
      );
      LocationProto.getDescriptor();
      UuidProto.getDescriptor();
      RaytraceProto.getDescriptor();
      DurationProto.getDescriptor();
   }
}
