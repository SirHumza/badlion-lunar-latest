package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.StructProto;
import com.google.protobuf.TimestampProto;
import com.lunarclient.common.v1.GiftProto;
import com.lunarclient.common.v1.UuidProto;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_EquippedCosmetic_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_EquippedCosmetic_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_EquippedCosmetic_descriptor,
      new String[]{
         "CosmeticId",
         "GeckolibMetadata",
         "ClothCloak",
         "ShowOverSkinLayer",
         "ShowOverHelmet",
         "ShowOverChestplate",
         "ShowOverLeggings",
         "ShowOverBoots",
         "HatHeightOffset",
         "FlipArm"
      }
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_OwnedCosmetic_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_OwnedCosmetic_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_OwnedCosmetic_descriptor,
      new String[]{"CosmeticId", "GrantedAt", "ExpiresAt", "ExpirationReason", "GiftInfo"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_Outfit_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_Outfit_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_Outfit_descriptor,
      new String[]{"Id", "Name", "Cosmetics", "Favorite", "CreatedAt", "UpdatedAt", "SkinHash", "BadgeId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_ServerCondition_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_ServerCondition_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_ServerCondition_descriptor, new String[]{"ServerIp"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_DimensionCondition_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_DimensionCondition_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_DimensionCondition_descriptor, new String[]{"DimensionId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_TimeCondition_descriptor = getDescriptor().getMessageTypes().get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_TimeCondition_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_TimeCondition_descriptor, new String[]{"Time"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_WeatherCondition_descriptor = getDescriptor().getMessageTypes().get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_WeatherCondition_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_WeatherCondition_descriptor, new String[]{"Weather"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_BiomeTemperatureCondition_descriptor = getDescriptor()
      .getMessageTypes()
      .get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_BiomeTemperatureCondition_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_BiomeTemperatureCondition_descriptor, new String[]{"Temperature"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_PassengerOfEntityCondition_descriptor = getDescriptor()
      .getMessageTypes()
      .get(8);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_PassengerOfEntityCondition_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_PassengerOfEntityCondition_descriptor, new String[]{"EntityId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_MovementStateCondition_descriptor = getDescriptor()
      .getMessageTypes()
      .get(9);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_MovementStateCondition_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_MovementStateCondition_descriptor, new String[]{"State"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_InLiquidCondition_descriptor = getDescriptor()
      .getMessageTypes()
      .get(10);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_InLiquidCondition_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_InLiquidCondition_descriptor, new String[]{"Liquid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_RadioPlayingCondition_descriptor = getDescriptor()
      .getMessageTypes()
      .get(11);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_RadioPlayingCondition_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_RadioPlayingCondition_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_OnFireCondition_descriptor = getDescriptor().getMessageTypes().get(12);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_OnFireCondition_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_OnFireCondition_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_EquipCondition_descriptor = getDescriptor().getMessageTypes().get(13);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_EquipCondition_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_EquipCondition_descriptor,
      new String[]{
         "Dimension", "Weather", "BiomeTemperature", "PassengerOfEntity", "MovementState", "InLiquid", "RadioPlaying", "OnFire", "Server", "Time", "Condition"
      }
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_OutfitTree_descriptor = getDescriptor().getMessageTypes().get(14);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_OutfitTree_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_OutfitTree_descriptor, new String[]{"ConditionalOutfits", "DefaultOutfitId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_OutfitTree_ConditionalOutfit_descriptor = internal_static_lunarclient_websocket_cosmetic_v2_OutfitTree_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_OutfitTree_ConditionalOutfit_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_OutfitTree_ConditionalOutfit_descriptor, new String[]{"EquipCondition", "OutfitId"}
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
         "\n.lunarclient/websocket/cosmetic/v2/common.proto\u0012!lunarclient.websocket.cosmetic.v2\u001a\u001cgoogle/protobuf/struct.proto\u001a\u001fgoogle/protobuf/timestamp.proto\u001a lunarclient/common/v1/gift.proto\u001a lunarclient/common/v1/uuid.proto\"Ä\u0003\n\u0010EquippedCosmetic\u0012\u001f\n\u000bcosmetic_id\u0018\u0001 \u0001(\u0005R\ncosmeticId\u0012D\n\u0011geckolib_metadata\u0018\u0002 \u0001(\u000b2\u0017.google.protobuf.StructR\u0010geckolibMetadata\u0012\u001f\n\u000bcloth_cloak\u0018\u0003 \u0001(\bR\nclothCloak\u0012/\n\u0014show_over_skin_layer\u0018\u0004 \u0001(\bR\u0011showOverSkinLayer\u0012(\n\u0010show_over_helmet\u0018\u0005 \u0001(\bR\u000eshowOverHelmet\u00120\n\u0014show_over_chestplate\u0018\u0006 \u0001(\bR\u0012showOverChestplate\u0012,\n\u0012show_over_leggings\u0018\u0007 \u0001(\bR\u0010showOverLeggings\u0012&\n\u000fshow_over_boots\u0018\b \u0001(\bR\rshowOverBoots\u0012*\n\u0011hat_height_offset\u0018\t \u0001(\u0002R\u000fhatHeightOffset\u0012\u0019\n\bflip_arm\u0018\n \u0001(\bR\u0007flipArm\"Õ\u0003\n\rOwnedCosmetic\u0012\u001f\n\u000bcosmetic_id\u0018\u0001 \u0001(\u0005R\ncosmeticId\u00129\n\ngranted_at\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.TimestampR\tgrantedAt\u00129\n\nexpires_at\u0018\u0003 \u0001(\u000b2\u001a.google.protobuf.TimestampR\texpiresAt\u0012n\n\u0011expiration_reason\u0018\u0004 \u0001(\u000e2A.lunarclient.websocket.cosmetic.v2.OwnedCosmetic.ExpirationReasonR\u0010expirationReason\u0012<\n\tgift_info\u0018\u0005 \u0001(\u000b2\u001f.lunarclient.common.v1.GiftInfoR\bgiftInfo\"\u007f\n\u0010ExpirationReason\u0012!\n\u001dEXPIRATION_REASON_UNSPECIFIED\u0010\u0000\u0012!\n\u001dEXPIRATION_REASON_TIME_LAPSED\u0010\u0001\u0012%\n!EXPIRATION_REASON_LEFT_LC_DISCORD\u0010\u0002\"\u008b\u0003\n\u0006Outfit\u0012+\n\u0002id\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\u0002id\u0012\u0012\n\u0004name\u0018\u0002 \u0001(\tR\u0004name\u0012Q\n\tcosmetics\u0018\u0003 \u0003(\u000b23.lunarclient.websocket.cosmetic.v2.EquippedCosmeticR\tcosmetics\u0012\u001a\n\bfavorite\u0018\u0004 \u0001(\bR\bfavorite\u00129\n\ncreated_at\u0018\u0005 \u0001(\u000b2\u001a.google.protobuf.TimestampR\tcreatedAt\u00129\n\nupdated_at\u0018\u0006 \u0001(\u000b2\u001a.google.protobuf.TimestampR\tupdatedAt\u0012 \n\tskin_hash\u0018\u0007 \u0001(\tH\u0000R\bskinHash\u0088\u0001\u0001\u0012\u001e\n\bbadge_id\u0018\b \u0001(\u0005H\u0001R\u0007badgeId\u0088\u0001\u0001B\f\n\n_skin_hashB\u000b\n\t_badge_id\".\n\u000fServerCondition\u0012\u001b\n\tserver_ip\u0018\u0001 \u0001(\tR\bserverIp\"7\n\u0012DimensionCondition\u0012!\n\fdimension_id\u0018\u0001 \u0001(\tR\u000bdimensionId\"\u0096\u0001\n\rTimeCondition\u0012I\n\u0004time\u0018\u0001 \u0001(\u000e25.lunarclient.websocket.cosmetic.v2.TimeCondition.TimeR\u0004time\":\n\u0004Time\u0012\u0014\n\u0010TIME_UNSPECIFIED\u0010\u0000\u0012\f\n\bTIME_DAY\u0010\u0001\u0012\u000e\n\nTIME_NIGHT\u0010\u0002\"Þ\u0001\n\u0010WeatherCondition\u0012U\n\u0007weather\u0018\u0001 \u0001(\u000e2;.lunarclient.websocket.cosmetic.v2.WeatherCondition.WeatherR\u0007weather\"s\n\u0007Weather\u0012\u0017\n\u0013WEATHER_UNSPECIFIED\u0010\u0000\u0012\u0010\n\fWEATHER_RAIN\u0010\u0001\u0012\u0010\n\fWEATHER_SNOW\u0010\u0002\u0012\u0018\n\u0014WEATHER_THUNDERSTORM\u0010\u0003\u0012\u0011\n\rWEATHER_CLEAR\u0010\u0004\"Þ\u0001\n\u0019BiomeTemperatureCondition\u0012j\n\u000btemperature\u0018\u0001 \u0001(\u000e2H.lunarclient.websocket.cosmetic.v2.BiomeTemperatureCondition.TemperatureR\u000btemperature\"U\n\u000bTemperature\u0012\u001b\n\u0017TEMPERATURE_UNSPECIFIED\u0010\u0000\u0012\u0013\n\u000fTEMPERATURE_HOT\u0010\u0001\u0012\u0014\n\u0010TEMPERATURE_COLD\u0010\u0002\"9\n\u001aPassengerOfEntityCondition\u0012\u001b\n\tentity_id\u0018\u0001 \u0001(\tR\bentityId\"×\u0001\n\u0016MovementStateCondition\u0012U\n\u0005state\u0018\u0001 \u0001(\u000e2?.lunarclient.websocket.cosmetic.v2.MovementStateCondition.StateR\u0005state\"f\n\u0005State\u0012\u0015\n\u0011STATE_UNSPECIFIED\u0010\u0000\u0012\u0012\n\u000eSTATE_SWIMMING\u0010\u0001\u0012\u0019\n\u0015STATE_CREATIVE_FLYING\u0010\u0002\u0012\u0017\n\u0013STATE_ELYTRA_FLYING\u0010\u0003\"\u00ad\u0001\n\u0011InLiquidCondition\u0012S\n\u0006liquid\u0018\u0001 \u0001(\u000e2;.lunarclient.websocket.cosmetic.v2.InLiquidCondition.LiquidR\u0006liquid\"C\n\u0006Liquid\u0012\u0016\n\u0012LIQUID_UNSPECIFIED\u0010\u0000\u0012\u0010\n\fLIQUID_WATER\u0010\u0001\u0012\u000f\n\u000bLIQUID_LAVA\u0010\u0002\"\u0017\n\u0015RadioPlayingCondition\"\u0011\n\u000fOnFireCondition\"¢\u0007\n\u000eEquipCondition\u0012U\n\tdimension\u0018\u0001 \u0001(\u000b25.lunarclient.websocket.cosmetic.v2.DimensionConditionH\u0000R\tdimension\u0012O\n\u0007weather\u0018\u0002 \u0001(\u000b23.lunarclient.websocket.cosmetic.v2.WeatherConditionH\u0000R\u0007weather\u0012k\n\u0011biome_temperature\u0018\u0003 \u0001(\u000b2<.lunarclient.websocket.cosmetic.v2.BiomeTemperatureConditionH\u0000R\u0010biomeTemperature\u0012o\n\u0013passenger_of_entity\u0018\u0004 \u0001(\u000b2=.lunarclient.websocket.cosmetic.v2.PassengerOfEntityConditionH\u0000R\u0011passengerOfEntity\u0012b\n\u000emovement_state\u0018\u0005 \u0001(\u000b29.lunarclient.websocket.cosmetic.v2.MovementStateConditionH\u0000R\rmovementState\u0012S\n\tin_liquid\u0018\u0006 \u0001(\u000b24.lunarclient.websocket.cosmetic.v2.InLiquidConditionH\u0000R\binLiquid\u0012_\n\rradio_playing\u0018\u0007 \u0001(\u000b28.lunarclient.websocket.cosmetic.v2.RadioPlayingConditionH\u0000R\fradioPlaying\u0012M\n\u0007on_fire\u0018\b \u0001(\u000b22.lunarclient.websocket.cosmetic.v2.OnFireConditionH\u0000R\u0006onFire\u0012L\n\u0006server\u0018\t \u0001(\u000b22.lunarclient.websocket.cosmetic.v2.ServerConditionH\u0000R\u0006server\u0012F\n\u0004time\u0018\n \u0001(\u000b20.lunarclient.websocket.cosmetic.v2.TimeConditionH\u0000R\u0004timeB\u000b\n\tcondition\"ó\u0002\n\nOutfitTree\u0012p\n\u0013conditional_outfits\u0018\u0001 \u0003(\u000b2?.lunarclient.websocket.cosmetic.v2.OutfitTree.ConditionalOutfitR\u0012conditionalOutfits\u0012G\n\u0011default_outfit_id\u0018\u0002 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\u000fdefaultOutfitId\u001a©\u0001\n\u0011ConditionalOutfit\u0012Z\n\u000fequip_condition\u0018\u0001 \u0001(\u000b21.lunarclient.websocket.cosmetic.v2.EquipConditionR\u000eequipCondition\u00128\n\toutfit_id\u0018\u0002 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\boutfitId*Ì\u0001\n\u001bCosmeticOwnershipVisibility\u0012-\n)COSMETIC_OWNERSHIP_VISIBILITY_UNSPECIFIED\u0010\u0000\u0012)\n%COSMETIC_OWNERSHIP_VISIBILITY_FRIENDS\u0010\u0001\u0012'\n#COSMETIC_OWNERSHIP_VISIBILITY_NOONE\u0010\u0002\u0012*\n&COSMETIC_OWNERSHIP_VISIBILITY_EVERYONE\u0010\u0003BÛ\u0001\n%com.lunarclient.websocket.cosmetic.v2B\u000bCommonProtoP\u0001¢\u0002\u0003LWCª\u0002!Lunarclient.Websocket.Cosmetic.V2Ê\u0002!Lunarclient\\Websocket\\Cosmetic\\V2â\u0002-Lunarclient\\Websocket\\Cosmetic\\V2\\GPBMetadataê\u0002$Lunarclient::Websocket::Cosmetic::V2b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{StructProto.getDescriptor(), TimestampProto.getDescriptor(), GiftProto.getDescriptor(), UuidProto.getDescriptor()}
      );
      StructProto.getDescriptor();
      TimestampProto.getDescriptor();
      GiftProto.getDescriptor();
      UuidProto.getDescriptor();
   }
}
