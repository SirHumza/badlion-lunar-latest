package com.lunarclient.websocket.cosmetic.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import java.util.List;
import java.util.Map;

public interface CustomizableCosmeticSettingsOrBuilder extends MessageOrBuilder {
   @Deprecated
   List<Integer> getActiveCosmeticIdsList();

   @Deprecated
   int getActiveCosmeticIdsCount();

   @Deprecated
   int getActiveCosmeticIds(int var1);

   boolean getClothCloak();

   boolean hasPlusColor();

   Color getPlusColor();

   ColorOrBuilder getPlusColorOrBuilder();

   boolean getShowHatsOverHelmet();

   boolean getShowHatsOverSkinLayer();

   boolean getShowOverChestplate();

   boolean getShowOverLeggings();

   boolean getShowOverBoots();

   int getHatHeightOffsetCount();

   boolean containsHatHeightOffset(int var1);

   @Deprecated
   Map<Integer, Float> getHatHeightOffset();

   Map<Integer, Float> getHatHeightOffsetMap();

   float getHatHeightOffsetOrDefault(int var1, float var2);

   float getHatHeightOffsetOrThrow(int var1);

   boolean getFlipShoulderPet();

   List<EquippedCosmetic> getEquippedCosmeticsList();

   EquippedCosmetic getEquippedCosmetics(int var1);

   int getEquippedCosmeticsCount();

   List<? extends EquippedCosmeticOrBuilder> getEquippedCosmeticsOrBuilderList();

   EquippedCosmeticOrBuilder getEquippedCosmeticsOrBuilder(int var1);
}
