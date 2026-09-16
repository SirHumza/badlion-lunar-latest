package com.lunarclient.items.item.salvages;

import com.google.gson.annotations.SerializedName;

public record Salvage() {
   @SerializedName("type")
   private final String type;
   @SerializedName("essence_type")
   private final String essenceType;
   @SerializedName("amount")
   private final long amount;
   @SerializedName("item_id")
   private final String itemId;

   public Salvage(String var1, String var2, long var3, String var5) {
      this.type = var1;
      this.essenceType = var2;
      this.amount = var3;
      this.itemId = var5;
   }
}
