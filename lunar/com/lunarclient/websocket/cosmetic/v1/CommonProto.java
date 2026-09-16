package com.lunarclient.websocket.cosmetic.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.StructProto;
import com.google.protobuf.TimestampProto;
import com.lunarclient.common.v1.ColorProto;
import com.lunarclient.common.v1.GiftProto;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v1_CustomizableCosmeticSettings_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v1_CustomizableCosmeticSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v1_CustomizableCosmeticSettings_descriptor,
      new String[]{
         "ActiveCosmeticIds",
         "ClothCloak",
         "PlusColor",
         "ShowHatsOverHelmet",
         "ShowHatsOverSkinLayer",
         "ShowOverChestplate",
         "ShowOverLeggings",
         "ShowOverBoots",
         "HatHeightOffset",
         "FlipShoulderPet",
         "EquippedCosmetics"
      }
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v1_CustomizableCosmeticSettings_HatHeightOffsetEntry_descriptor = internal_static_lunarclient_websocket_cosmetic_v1_CustomizableCosmeticSettings_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v1_CustomizableCosmeticSettings_HatHeightOffsetEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v1_CustomizableCosmeticSettings_HatHeightOffsetEntry_descriptor, new String[]{"Key", "Value"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v1_EquippedCosmetic_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v1_EquippedCosmetic_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v1_EquippedCosmetic_descriptor, new String[]{"CosmeticId", "Metadata"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v1_OwnedCosmetic_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v1_OwnedCosmetic_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v1_OwnedCosmetic_descriptor,
      new String[]{"CosmeticId", "GrantedAt", "ExpiresAt", "ExpirationReason", "GiftInfo"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private CommonProto() {
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
         "\n.lunarclient/websocket/cosmetic/v1/common.proto\u0012!lunarclient.websocket.cosmetic.v1\u001a\u001cgoogle/protobuf/struct.proto\u001a\u001fgoogle/protobuf/timestamp.proto\u001a!lunarclient/common/v1/color.proto\u001a lunarclient/common/v1/gift.proto\"ü\u0005\n\u001cCustomizableCosmeticSettings\u00122\n\u0013active_cosmetic_ids\u0018\u0001 \u0003(\u0005B\u0002\u0018\u0001R\u0011activeCosmeticIds\u0012\u001f\n\u000bcloth_cloak\u0018\u0002 \u0001(\bR\nclothCloak\u0012;\n\nplus_color\u0018\u0003 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tplusColor\u00121\n\u0015show_hats_over_helmet\u0018\u0004 \u0001(\bR\u0012showHatsOverHelmet\u00128\n\u0019show_hats_over_skin_layer\u0018\u0005 \u0001(\bR\u0015showHatsOverSkinLayer\u00120\n\u0014show_over_chestplate\u0018\u0006 \u0001(\bR\u0012showOverChestplate\u0012,\n\u0012show_over_leggings\u0018\u0007 \u0001(\bR\u0010showOverLeggings\u0012&\n\u000fshow_over_boots\u0018\b \u0001(\bR\rshowOverBoots\u0012\u0080\u0001\n\u0011hat_height_offset\u0018\t \u0003(\u000b2T.lunarclient.websocket.cosmetic.v1.CustomizableCosmeticSettings.HatHeightOffsetEntryR\u000fhatHeightOffset\u0012*\n\u0011flip_shoulder_pet\u0018\n \u0001(\bR\u000fflipShoulderPet\u0012b\n\u0012equipped_cosmetics\u0018\u000b \u0003(\u000b23.lunarclient.websocket.cosmetic.v1.EquippedCosmeticR\u0011equippedCosmetics\u001aB\n\u0014HatHeightOffsetEntry\u0012\u0010\n\u0003key\u0018\u0001 \u0001(\u0005R\u0003key\u0012\u0014\n\u0005value\u0018\u0002 \u0001(\u0002R\u0005value:\u00028\u0001\"h\n\u0010EquippedCosmetic\u0012\u001f\n\u000bcosmetic_id\u0018\u0001 \u0001(\u0005R\ncosmeticId\u00123\n\bmetadata\u0018\u0002 \u0001(\u000b2\u0017.google.protobuf.StructR\bmetadata\"Õ\u0003\n\rOwnedCosmetic\u0012\u001f\n\u000bcosmetic_id\u0018\u0001 \u0001(\u0005R\ncosmeticId\u00129\n\ngranted_at\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.TimestampR\tgrantedAt\u00129\n\nexpires_at\u0018\u0003 \u0001(\u000b2\u001a.google.protobuf.TimestampR\texpiresAt\u0012n\n\u0011expiration_reason\u0018\u0004 \u0001(\u000e2A.lunarclient.websocket.cosmetic.v1.OwnedCosmetic.ExpirationReasonR\u0010expirationReason\u0012<\n\tgift_info\u0018\u0005 \u0001(\u000b2\u001f.lunarclient.common.v1.GiftInfoR\bgiftInfo\"\u007f\n\u0010ExpirationReason\u0012!\n\u001dEXPIRATION_REASON_UNSPECIFIED\u0010\u0000\u0012!\n\u001dEXPIRATION_REASON_TIME_LAPSED\u0010\u0001\u0012%\n!EXPIRATION_REASON_LEFT_LC_DISCORD\u0010\u0002*Ì\u0001\n\u001bCosmeticOwnershipVisibility\u0012-\n)COSMETIC_OWNERSHIP_VISIBILITY_UNSPECIFIED\u0010\u0000\u0012)\n%COSMETIC_OWNERSHIP_VISIBILITY_FRIENDS\u0010\u0001\u0012'\n#COSMETIC_OWNERSHIP_VISIBILITY_NOONE\u0010\u0002\u0012*\n&COSMETIC_OWNERSHIP_VISIBILITY_EVERYONE\u0010\u0003BÛ\u0001\n%com.lunarclient.websocket.cosmetic.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWCª\u0002!Lunarclient.Websocket.Cosmetic.V1Ê\u0002!Lunarclient\\Websocket\\Cosmetic\\V1â\u0002-Lunarclient\\Websocket\\Cosmetic\\V1\\GPBMetadataê\u0002$Lunarclient::Websocket::Cosmetic::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{StructProto.getDescriptor(), TimestampProto.getDescriptor(), ColorProto.getDescriptor(), GiftProto.getDescriptor()}
      );
      StructProto.getDescriptor();
      TimestampProto.getDescriptor();
      ColorProto.getDescriptor();
      GiftProto.getDescriptor();
   }
}
