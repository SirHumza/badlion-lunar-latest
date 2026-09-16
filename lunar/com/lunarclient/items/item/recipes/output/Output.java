package com.lunarclient.items.item.recipes.output;

import com.google.gson.annotations.SerializedName;

public record Output() {
   @SerializedName("item_id")
   private final String itemId;

   public Output(String var1) {
      this.itemId = var1;
   }
}
