package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.util.List;

public interface PlayerCosmeticsPushV2OrBuilder extends MessageOrBuilder {
   boolean hasPlayerUuid();

   Uuid getPlayerUuid();

   UuidOrBuilder getPlayerUuidOrBuilder();

   boolean hasLogoColor();

   Color getLogoColor();

   ColorOrBuilder getLogoColorOrBuilder();

   boolean getLogoAlwaysShow();

   boolean hasPlusColor();

   Color getPlusColor();

   ColorOrBuilder getPlusColorOrBuilder();

   List<PlayerCosmeticsPushV2.ConditionalCosmetics> getConditionalCosmeticsList();

   PlayerCosmeticsPushV2.ConditionalCosmetics getConditionalCosmetics(int var1);

   int getConditionalCosmeticsCount();

   List<? extends PlayerCosmeticsPushV2.ConditionalCosmeticsOrBuilder> getConditionalCosmeticsOrBuilderList();

   PlayerCosmeticsPushV2.ConditionalCosmeticsOrBuilder getConditionalCosmeticsOrBuilder(int var1);

   List<EquippedCosmetic> getDefaultCosmeticsList();

   EquippedCosmetic getDefaultCosmetics(int var1);

   int getDefaultCosmeticsCount();

   List<? extends EquippedCosmeticOrBuilder> getDefaultCosmeticsOrBuilderList();

   EquippedCosmeticOrBuilder getDefaultCosmeticsOrBuilder(int var1);

   int getBadgeId();

   boolean hasOutfitUuid();

   Uuid getOutfitUuid();

   UuidOrBuilder getOutfitUuidOrBuilder();
}
