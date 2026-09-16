package com.lunarclient.items.item.skin;

import com.google.gson.annotations.SerializedName;

public record Skin() {
   @SerializedName("value")
   private final String value;
   @SerializedName("signature")
   private final String signature;

   public Skin(String var1, String var2) {
      this.value = var1;
      this.signature = var2;
   }
}
