package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import java.util.List;

public interface LoginResponseOrBuilder extends MessageOrBuilder {
   boolean hasLogoColor();

   Color getLogoColor();

   ColorOrBuilder getLogoColorOrBuilder();

   boolean getLogoAlwaysShow();

   boolean hasPlusColor();

   Color getPlusColor();

   ColorOrBuilder getPlusColorOrBuilder();

   List<Color> getAvailableLunarPlusColorsList();

   Color getAvailableLunarPlusColors(int var1);

   int getAvailableLunarPlusColorsCount();

   List<? extends ColorOrBuilder> getAvailableLunarPlusColorsOrBuilderList();

   ColorOrBuilder getAvailableLunarPlusColorsOrBuilder(int var1);

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

   List<Integer> getFavoriteCosmeticIdsList();

   int getFavoriteCosmeticIdsCount();

   int getFavoriteCosmeticIds(int var1);

   List<Outfit> getOutfitsList();

   Outfit getOutfits(int var1);

   int getOutfitsCount();

   List<? extends OutfitOrBuilder> getOutfitsOrBuilderList();

   OutfitOrBuilder getOutfitsOrBuilder(int var1);

   boolean hasOutfitTree();

   OutfitTree getOutfitTree();

   OutfitTreeOrBuilder getOutfitTreeOrBuilder();

   boolean getArtistTools();

   int getCosmeticOwnershipVisibilityValue();

   CosmeticOwnershipVisibility getCosmeticOwnershipVisibility();

   boolean getTesterTools();

   List<Integer> getDiscordRewardsList();

   int getDiscordRewardsCount();

   int getDiscordRewards(int var1);

   List<Integer> getDiscordTagRewardsList();

   int getDiscordTagRewardsCount();

   int getDiscordTagRewards(int var1);
}
