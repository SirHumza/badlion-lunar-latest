package com.lunarclient.items.item.gemstone_slots.costs;

import com.google.gson.annotations.SerializedName;

public record GemstoneSlotCost() {
   @SerializedName("type")
   private final String type;
   @SerializedName("item_id")
   private final String itemId;
   @SerializedName("amount")
   private final long amount;
   @SerializedName("coins")
   private final double coins;

   public GemstoneSlotCost(String var1, String var2, long var3, double var5) {
      this.type = var1;
      this.itemId = var2;
      this.amount = var3;
      this.coins = var5;
   }
}
