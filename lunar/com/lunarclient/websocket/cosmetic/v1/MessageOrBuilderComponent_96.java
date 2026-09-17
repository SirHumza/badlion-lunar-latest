package com.lunarclient.websocket.cosmetic.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import java.util.List;

public interface LoginResponseOrBuilder extends MessageOrBuilder {
   boolean hasSettings();

   CustomizableCosmeticSettings getSettings();

   CustomizableCosmeticSettingsOrBuilder getSettingsOrBuilder();

   @Deprecated
   List<Integer> getOwnedCosmeticIdsList();

   @Deprecated
   int getOwnedCosmeticIdsCount();

   @Deprecated
   int getOwnedCosmeticIds(int var1);

   List<Color> getAvailableLunarPlusColorsList();

   Color getAvailableLunarPlusColors(int var1);

   int getAvailableLunarPlusColorsCount();

   List<? extends ColorOrBuilder> getAvailableLunarPlusColorsOrBuilderList();

   ColorOrBuilder getAvailableLunarPlusColorsOrBuilder(int var1);

   boolean hasLogoColor();

   Color getLogoColor();

   ColorOrBuilder getLogoColorOrBuilder();

   boolean getLogoAlwaysShow();

   List<Integer> getLunarPlusFreeCosmeticIdsList();

   int getLunarPlusFreeCosmeticIdsCount();

   int getLunarPlusFreeCosmeticIds(int var1);

   List<OwnedCosmetic> getOwnedCosmeticsList();

   OwnedCosmetic getOwnedCosmetics(int var1);

   int getOwnedCosmeticsCount();

   List<? extends OwnedCosmeticOrBuilder> getOwnedCosmeticsOrBuilderList();

   OwnedCosmeticOrBuilder getOwnedCosmeticsOrBuilder(int var1);

   boolean getHasAllCosmeticsFlag();

   String getRankName();

   ByteString getRankNameBytes();

   boolean getArtistTools();

   int getCosmeticOwnershipVisibilityValue();

   CosmeticOwnershipVisibility getCosmeticOwnershipVisibility();

   boolean getTesterTools();
}
