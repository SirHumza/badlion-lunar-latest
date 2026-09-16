package com.lunarclient.player.vanityMeta;

import com.google.gson.annotations.SerializedName;

public record VanityMeta() {
   @SerializedName("packages")
   private final String[] packages;
   @SerializedName("gadgetSledType")
   private final String gadgetSledType;

   public VanityMeta(String[] var1, String var2) {
      this.packages = var1;
      this.gadgetSledType = var2;
   }
}
