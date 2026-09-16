package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.ColorProto;
import com.lunarclient.common.v1.UuidProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_LoginRequest_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_LoginRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_LoginRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_LoginResponse_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_LoginResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_LoginResponse_descriptor,
      new String[]{
         "LogoColor",
         "LogoAlwaysShow",
         "PlusColor",
         "AvailableLunarPlusColors",
         "LunarPlusFreeCosmeticIds",
         "OwnedCosmetics",
         "HasAllCosmeticsFlag",
         "RankName",
         "FavoriteCosmeticIds",
         "Outfits",
         "OutfitTree",
         "ArtistTools",
         "CosmeticOwnershipVisibility",
         "TesterTools",
         "DiscordRewards",
         "DiscordTagRewards"
      }
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_CreateOutfitRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_CreateOutfitRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_CreateOutfitRequest_descriptor, new String[]{"Name"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_CreateOutfitResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_CreateOutfitResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_CreateOutfitResponse_descriptor, new String[]{"Status", "Outfit"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_UpdateOutfitRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_UpdateOutfitRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_UpdateOutfitRequest_descriptor, new String[]{"Outfit"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_UpdateOutfitResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_UpdateOutfitResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_UpdateOutfitResponse_descriptor, new String[]{"Status", "Outfit"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_SelectOutfitRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_SelectOutfitRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_SelectOutfitRequest_descriptor, new String[]{"OutfitTree"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_SelectOutfitResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_SelectOutfitResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_SelectOutfitResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_DeleteOutfitRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(8);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_DeleteOutfitRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_DeleteOutfitRequest_descriptor, new String[]{"OutfitId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_DeleteOutfitResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(9);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_DeleteOutfitResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_DeleteOutfitResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_FavoriteCosmeticRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(10);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_FavoriteCosmeticRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_FavoriteCosmeticRequest_descriptor, new String[]{"CosmeticId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_FavoriteCosmeticResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(11);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_FavoriteCosmeticResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_FavoriteCosmeticResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_UnfavoriteCosmeticRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(12);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_UnfavoriteCosmeticRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_UnfavoriteCosmeticRequest_descriptor, new String[]{"CosmeticId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_UnfavoriteCosmeticResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(13);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_UnfavoriteCosmeticResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_UnfavoriteCosmeticResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_LoadTabLogosRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(14);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_LoadTabLogosRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_LoadTabLogosRequest_descriptor, new String[]{"PlayerUuids"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_LoadTabLogosResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(15);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_LoadTabLogosResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_LoadTabLogosResponse_descriptor, new String[]{"TabLogos"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_LoadTabLogosResponse_TabLogo_descriptor = internal_static_lunarclient_websocket_cosmetic_v2_LoadTabLogosResponse_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_LoadTabLogosResponse_TabLogo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_LoadTabLogosResponse_TabLogo_descriptor,
      new String[]{"PlayerUuid", "LogoColor", "PlusColor", "BadgeId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_SetCosmeticOwnershipVisibilityRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(16);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_SetCosmeticOwnershipVisibilityRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_SetCosmeticOwnershipVisibilityRequest_descriptor, new String[]{"Visibility"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_SetCosmeticOwnershipVisibilityResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(17);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_SetCosmeticOwnershipVisibilityResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_SetCosmeticOwnershipVisibilityResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_UpdateLunarPlusColorRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(18);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_UpdateLunarPlusColorRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_UpdateLunarPlusColorRequest_descriptor, new String[]{"PlusColor"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_UpdateLunarPlusColorResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(19);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_UpdateLunarPlusColorResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_UpdateLunarPlusColorResponse_descriptor, new String[0]
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
         "\n/lunarclient/websocket/cosmetic/v2/service.proto\u0012!lunarclient.websocket.cosmetic.v2\u001a!lunarclient/common/v1/color.proto\u001a lunarclient/common/v1/uuid.proto\u001a.lunarclient/websocket/cosmetic/v2/common.proto\u001a.lunarclient/websocket/protocol/v1/common.proto\"\u000e\n\fLoginRequest\"ê\u0007\n\rLoginResponse\u0012;\n\nlogo_color\u0018\u0001 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tlogoColor\u0012(\n\u0010logo_always_show\u0018\u0002 \u0001(\bR\u000elogoAlwaysShow\u0012;\n\nplus_color\u0018\u0003 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tplusColor\u0012[\n\u001bavailable_lunar_plus_colors\u0018\u0004 \u0003(\u000b2\u001c.lunarclient.common.v1.ColorR\u0018availableLunarPlusColors\u0012>\n\u001clunar_plus_free_cosmetic_ids\u0018\u0005 \u0003(\u0005R\u0018lunarPlusFreeCosmeticIds\u0012Y\n\u000fowned_cosmetics\u0018\u0006 \u0003(\u000b20.lunarclient.websocket.cosmetic.v2.OwnedCosmeticR\u000eownedCosmetics\u00123\n\u0016has_all_cosmetics_flag\u0018\u0007 \u0001(\bR\u0013hasAllCosmeticsFlag\u0012\u001b\n\trank_name\u0018\b \u0001(\tR\brankName\u00122\n\u0015favorite_cosmetic_ids\u0018\t \u0003(\u0005R\u0013favoriteCosmeticIds\u0012C\n\u0007outfits\u0018\n \u0003(\u000b2).lunarclient.websocket.cosmetic.v2.OutfitR\u0007outfits\u0012N\n\u000boutfit_tree\u0018\u000b \u0001(\u000b2-.lunarclient.websocket.cosmetic.v2.OutfitTreeR\noutfitTree\u0012!\n\fartist_tools\u0018\f \u0001(\bR\u000bartistTools\u0012\u0082\u0001\n\u001dcosmetic_ownership_visibility\u0018\r \u0001(\u000e2>.lunarclient.websocket.cosmetic.v2.CosmeticOwnershipVisibilityR\u001bcosmeticOwnershipVisibility\u0012!\n\ftester_tools\u0018\u000e \u0001(\bR\u000btesterTools\u0012'\n\u000fdiscord_rewards\u0018\u000f \u0003(\u0005R\u000ediscordRewards\u0012.\n\u0013discord_tag_rewards\u0018\u0010 \u0003(\u0005R\u0011discordTagRewards\")\n\u0013CreateOutfitRequest\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\"\u0083\u0002\n\u0014CreateOutfitResponse\u0012V\n\u0006status\u0018\u0001 \u0001(\u000e2>.lunarclient.websocket.cosmetic.v2.CreateOutfitResponse.StatusR\u0006status\u0012A\n\u0006outfit\u0018\u0002 \u0001(\u000b2).lunarclient.websocket.cosmetic.v2.OutfitR\u0006outfit\"P\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001f\n\u001bSTATUS_OUTFIT_LIMIT_REACHED\u0010\u0002\"X\n\u0013UpdateOutfitRequest\u0012A\n\u0006outfit\u0018\u0001 \u0001(\u000b2).lunarclient.websocket.cosmetic.v2.OutfitR\u0006outfit\"â\u0001\n\u0014UpdateOutfitResponse\u0012V\n\u0006status\u0018\u0001 \u0001(\u000e2>.lunarclient.websocket.cosmetic.v2.UpdateOutfitResponse.StatusR\u0006status\u0012A\n\u0006outfit\u0018\u0002 \u0001(\u000b2).lunarclient.websocket.cosmetic.v2.OutfitR\u0006outfit\"/\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\"e\n\u0013SelectOutfitRequest\u0012N\n\u000boutfit_tree\u0018\u0001 \u0001(\u000b2-.lunarclient.websocket.cosmetic.v2.OutfitTreeR\noutfitTree\"\u009f\u0001\n\u0014SelectOutfitResponse\u0012V\n\u0006status\u0018\u0001 \u0001(\u000e2>.lunarclient.websocket.cosmetic.v2.SelectOutfitResponse.StatusR\u0006status\"/\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\"O\n\u0013DeleteOutfitRequest\u00128\n\toutfit_id\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\boutfitId\"\u009f\u0001\n\u0014DeleteOutfitResponse\u0012V\n\u0006status\u0018\u0001 \u0001(\u000e2>.lunarclient.websocket.cosmetic.v2.DeleteOutfitResponse.StatusR\u0006status\"/\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\":\n\u0017FavoriteCosmeticRequest\u0012\u001f\n\u000bcosmetic_id\u0018\u0001 \u0001(\u0005R\ncosmeticId\"\u001a\n\u0018FavoriteCosmeticResponse\"<\n\u0019UnfavoriteCosmeticRequest\u0012\u001f\n\u000bcosmetic_id\u0018\u0001 \u0001(\u0005R\ncosmeticId\"\u001c\n\u001aUnfavoriteCosmeticResponse\"U\n\u0013LoadTabLogosRequest\u0012>\n\fplayer_uuids\u0018\u0001 \u0003(\u000b2\u001b.lunarclient.common.v1.UuidR\u000bplayerUuids\"Ó\u0002\n\u0014LoadTabLogosResponse\u0012\\\n\ttab_logos\u0018\u0001 \u0003(\u000b2?.lunarclient.websocket.cosmetic.v2.LoadTabLogosResponse.TabLogoR\btabLogos\u001aÜ\u0001\n\u0007TabLogo\u0012<\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\nplayerUuid\u0012;\n\nlogo_color\u0018\u0002 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tlogoColor\u0012;\n\nplus_color\u0018\u0003 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tplusColor\u0012\u0019\n\bbadge_id\u0018\u0004 \u0001(\u0005R\u0007badgeId\"\u0087\u0001\n%SetCosmeticOwnershipVisibilityRequest\u0012^\n\nvisibility\u0018\u0001 \u0001(\u000e2>.lunarclient.websocket.cosmetic.v2.CosmeticOwnershipVisibilityR\nvisibility\"(\n&SetCosmeticOwnershipVisibilityResponse\"Z\n\u001bUpdateLunarPlusColorRequest\u0012;\n\nplus_color\u0018\u0003 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tplusColor\"\u001e\n\u001cUpdateLunarPlusColorResponse2·\u000b\n\u000fCosmeticService\u0012p\n\u0005Login\u0012/.lunarclient.websocket.cosmetic.v2.LoginRequest\u001a0.lunarclient.websocket.cosmetic.v2.LoginResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0085\u0001\n\fCreateOutfit\u00126.lunarclient.websocket.cosmetic.v2.CreateOutfitRequest\u001a7.lunarclient.websocket.cosmetic.v2.CreateOutfitResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0085\u0001\n\fUpdateOutfit\u00126.lunarclient.websocket.cosmetic.v2.UpdateOutfitRequest\u001a7.lunarclient.websocket.cosmetic.v2.UpdateOutfitResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0085\u0001\n\fDeleteOutfit\u00126.lunarclient.websocket.cosmetic.v2.DeleteOutfitRequest\u001a7.lunarclient.websocket.cosmetic.v2.DeleteOutfitResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0085\u0001\n\fSelectOutfit\u00126.lunarclient.websocket.cosmetic.v2.SelectOutfitRequest\u001a7.lunarclient.websocket.cosmetic.v2.SelectOutfitResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0091\u0001\n\u0010FavoriteCosmetic\u0012:.lunarclient.websocket.cosmetic.v2.FavoriteCosmeticRequest\u001a;.lunarclient.websocket.cosmetic.v2.FavoriteCosmeticResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0097\u0001\n\u0012UnfavoriteCosmetic\u0012<.lunarclient.websocket.cosmetic.v2.UnfavoriteCosmeticRequest\u001a=.lunarclient.websocket.cosmetic.v2.UnfavoriteCosmeticResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0085\u0001\n\fLoadTabLogos\u00126.lunarclient.websocket.cosmetic.v2.LoadTabLogosRequest\u001a7.lunarclient.websocket.cosmetic.v2.LoadTabLogosResponse\"\u0004\u0088µ\u0018\u0001\u0012»\u0001\n\u001eSetCosmeticOwnershipVisibility\u0012H.lunarclient.websocket.cosmetic.v2.SetCosmeticOwnershipVisibilityRequest\u001aI.lunarclient.websocket.cosmetic.v2.SetCosmeticOwnershipVisibilityResponse\"\u0004\u0088µ\u0018\u0003\u0012\u009d\u0001\n\u0014UpdateLunarPlusColor\u0012>.lunarclient.websocket.cosmetic.v2.UpdateLunarPlusColorRequest\u001a?.lunarclient.websocket.cosmetic.v2.UpdateLunarPlusColorResponse\"\u0004\u0088µ\u0018\u0003Bß\u0001\n%com.lunarclient.websocket.cosmetic.v2B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWCª\u0002!Lunarclient.Websocket.Cosmetic.V2Ê\u0002!Lunarclient\\Websocket\\Cosmetic\\V2â\u0002-Lunarclient\\Websocket\\Cosmetic\\V2\\GPBMetadataê\u0002$Lunarclient::Websocket::Cosmetic::V2b\u0006proto3"
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
