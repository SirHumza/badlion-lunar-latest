package com.lunarclient.garden.commission.requirement;

import com.google.gson.annotations.SerializedName;

public record Requirement() {
   @SerializedName("original_item")
   private final String originalItem;
   @SerializedName("original_amount")
   private final int originalAmount;
   @SerializedName("item")
   private final String item;
   @SerializedName("amount")
   private final int amount;

   public Requirement(String var1, int var2, String var3, int var4) {
      this.originalItem = var1;
      this.originalAmount = var2;
      this.item = var3;
      this.amount = var4;
   }
}
