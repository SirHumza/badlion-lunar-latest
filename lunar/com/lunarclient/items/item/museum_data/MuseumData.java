package com.lunarclient.items.item.museum_data;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public record MuseumData() {
   @SerializedName("donation_xp")
   private final int donationXp;
   @SerializedName("type")
   private final String type;
   @SerializedName("parent")
   private final Map<String, String> parent;
   @SerializedName("mapped_item_ids")
   private final String[] mappedItemIds;
   @SerializedName("game_stage")
   private final String gameStage;
   @SerializedName("armor_set_donation_xp")
   private final Map<String, Integer> armorSetDonationXp;

   public MuseumData(int var1, String var2, Map<String, String> var3, String[] var4, String var5, Map<String, Integer> var6) {
      this.donationXp = var1;
      this.type = var2;
      this.parent = var3;
      this.mappedItemIds = var4;
      this.gameStage = var5;
      this.armorSetDonationXp = var6;
   }
}
