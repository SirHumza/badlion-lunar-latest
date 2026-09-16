package com.lunarclient.websocket.cosmetic.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.ColorProto;
import com.lunarclient.common.v1.UuidProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v1_LoginRequest_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v1_LoginRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v1_LoginRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v1_LoginResponse_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v1_LoginResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v1_LoginResponse_descriptor,
      new String[]{
         "Settings",
         "OwnedCosmeticIds",
         "AvailableLunarPlusColors",
         "LogoColor",
         "LogoAlwaysShow",
         "LunarPlusFreeCosmeticIds",
         "OwnedCosmetics",
         "HasAllCosmeticsFlag",
         "RankName",
         "ArtistTools",
         "CosmeticOwnershipVisibility",
         "TesterTools"
      }
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v1_UpdateCosmeticSettingsRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v1_UpdateCosmeticSettingsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v1_UpdateCosmeticSettingsRequest_descriptor, new String[]{"Settings"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v1_UpdateCosmeticSettingsResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v1_UpdateCosmeticSettingsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v1_UpdateCosmeticSettingsResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosRequest_descriptor, new String[]{"PlayerUuids"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosResponse_descriptor, new String[]{"TabLogos"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosResponse_TabLogo_descriptor = internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosResponse_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosResponse_TabLogo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosResponse_TabLogo_descriptor,
      new String[]{"PlayerUuid", "LogoColor", "PlusColor", "BadgeId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v1_SetCosmeticOwnershipVisibilityRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v1_SetCosmeticOwnershipVisibilityRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v1_SetCosmeticOwnershipVisibilityRequest_descriptor, new String[]{"Visibility"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v1_SetCosmeticOwnershipVisibilityResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v1_SetCosmeticOwnershipVisibilityResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v1_SetCosmeticOwnershipVisibilityResponse_descriptor, new String[0]
   );
   private static Descriptors.FileDescriptor descriptor;

   private ServiceProto() {
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
         "\n/lunarclient/websocket/cosmetic/v1/service.proto\u0012!lunarclient.websocket.cosmetic.v1\u001a!lunarclient/common/v1/color.proto\u001a lunarclient/common/v1/uuid.proto\u001a.lunarclient/websocket/cosmetic/v1/common.proto\u001a.lunarclient/websocket/protocol/v1/common.proto\"\u000e\n\fLoginRequest\"\u009a\u0006\n\rLoginResponse\u0012[\n\bsettings\u0018\u0001 \u0001(\u000b2?.lunarclient.websocket.cosmetic.v1.CustomizableCosmeticSettingsR\bsettings\u00120\n\u0012owned_cosmetic_ids\u0018\u0002 \u0003(\u0005B\u0002\u0018\u0001R\u0010ownedCosmeticIds\u0012[\n\u001bavailable_lunar_plus_colors\u0018\u0003 \u0003(\u000b2\u001c.lunarclient.common.v1.ColorR\u0018availableLunarPlusColors\u0012;\n\nlogo_color\u0018\u0004 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tlogoColor\u0012(\n\u0010logo_always_show\u0018\u0005 \u0001(\bR\u000elogoAlwaysShow\u0012>\n\u001clunar_plus_free_cosmetic_ids\u0018\u0006 \u0003(\u0005R\u0018lunarPlusFreeCosmeticIds\u0012Y\n\u000fowned_cosmetics\u0018\u0007 \u0003(\u000b20.lunarclient.websocket.cosmetic.v1.OwnedCosmeticR\u000eownedCosmetics\u00123\n\u0016has_all_cosmetics_flag\u0018\b \u0001(\bR\u0013hasAllCosmeticsFlag\u0012\u001b\n\trank_name\u0018\t \u0001(\tR\brankName\u0012!\n\fartist_tools\u0018\n \u0001(\bR\u000bartistTools\u0012\u0082\u0001\n\u001dcosmetic_ownership_visibility\u0018\u000b \u0001(\u000e2>.lunarclient.websocket.cosmetic.v1.CosmeticOwnershipVisibilityR\u001bcosmeticOwnershipVisibility\u0012!\n\ftester_tools\u0018\f \u0001(\bR\u000btesterTools\"|\n\u001dUpdateCosmeticSettingsRequest\u0012[\n\bsettings\u0018\u0001 \u0001(\u000b2?.lunarclient.websocket.cosmetic.v1.CustomizableCosmeticSettingsR\bsettings\" \n\u001eUpdateCosmeticSettingsResponse\"U\n\u0013LoadTabLogosRequest\u0012>\n\fplayer_uuids\u0018\u0001 \u0003(\u000b2\u001b.lunarclient.common.v1.UuidR\u000bplayerUuids\"Ó\u0002\n\u0014LoadTabLogosResponse\u0012\\\n\ttab_logos\u0018\u0001 \u0003(\u000b2?.lunarclient.websocket.cosmetic.v1.LoadTabLogosResponse.TabLogoR\btabLogos\u001aÜ\u0001\n\u0007TabLogo\u0012<\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\nplayerUuid\u0012;\n\nlogo_color\u0018\u0002 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tlogoColor\u0012;\n\nplus_color\u0018\u0003 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tplusColor\u0012\u0019\n\bbadge_id\u0018\u0004 \u0001(\u0005R\u0007badgeId\"\u0087\u0001\n%SetCosmeticOwnershipVisibilityRequest\u0012^\n\nvisibility\u0018\u0001 \u0001(\u000e2>.lunarclient.websocket.cosmetic.v1.CosmeticOwnershipVisibilityR\nvisibility\"(\n&SetCosmeticOwnershipVisibilityResponse2ï\u0004\n\u000fCosmeticService\u0012p\n\u0005Login\u0012/.lunarclient.websocket.cosmetic.v1.LoginRequest\u001a0.lunarclient.websocket.cosmetic.v1.LoginResponse\"\u0004\u0088µ\u0018\u0003\u0012£\u0001\n\u0016UpdateCosmeticSettings\u0012@.lunarclient.websocket.cosmetic.v1.UpdateCosmeticSettingsRequest\u001aA.lunarclient.websocket.cosmetic.v1.UpdateCosmeticSettingsResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0085\u0001\n\fLoadTabLogos\u00126.lunarclient.websocket.cosmetic.v1.LoadTabLogosRequest\u001a7.lunarclient.websocket.cosmetic.v1.LoadTabLogosResponse\"\u0004\u0088µ\u0018\u0001\u0012»\u0001\n\u001eSetCosmeticOwnershipVisibility\u0012H.lunarclient.websocket.cosmetic.v1.SetCosmeticOwnershipVisibilityRequest\u001aI.lunarclient.websocket.cosmetic.v1.SetCosmeticOwnershipVisibilityResponse\"\u0004\u0088µ\u0018\u0003Bß\u0001\n%com.lunarclient.websocket.cosmetic.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWCª\u0002!Lunarclient.Websocket.Cosmetic.V1Ê\u0002!Lunarclient\\Websocket\\Cosmetic\\V1â\u0002-Lunarclient\\Websocket\\Cosmetic\\V1\\GPBMetadataê\u0002$Lunarclient::Websocket::Cosmetic::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{
            ColorProto.getDescriptor(),
            UuidProto.getDescriptor(),
            CommonProto.getDescriptor(),
            com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor()
         }
      );
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(com.lunarclient.websocket.protocol.v1.CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      ColorProto.getDescriptor();
      UuidProto.getDescriptor();
      CommonProto.getDescriptor();
      com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor();
   }
}
