package com.lunarclient.items;

import com.google.gson.annotations.SerializedName;
import com.lunarclient.items.item.Item;

public record ItemsResponse() {
   @SerializedName("success")
   private final boolean success;
   @SerializedName("lastUpdated")
   private final long lastUpdated;
   @SerializedName("items")
   private final Item[] items;

   public ItemsResponse(boolean var1, long var2, Item[] var4) {
      this.success = var1;
      this.lastUpdated = var2;
      this.items = var4;
   }
}
