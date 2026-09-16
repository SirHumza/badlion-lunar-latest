package com.lunarclient.items.item.dungeon_item_conversion_cost;

import com.google.gson.annotations.SerializedName;

public record DungeonItemConversionCost() {
   @SerializedName("essence_type")
   private final String essenceType;
   @SerializedName("amount")
   private final long amount;

   public DungeonItemConversionCost(String var1, long var2) {
      this.essenceType = var1;
      this.amount = var2;
   }
}
