package com.lunarclient.items.item.prestige;

import com.google.gson.annotations.SerializedName;
import com.lunarclient.items.item.upgrade_costs.UpgradeCost;

public record Prestige() {
   @SerializedName("item_id")
   private final String itemId;
   @SerializedName("costs")
   private final UpgradeCost[] costs;

   public Prestige(String var1, UpgradeCost[] var2) {
      this.itemId = var1;
      this.costs = var2;
   }
}
