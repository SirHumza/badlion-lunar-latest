package com.lunarclient.player.skyblock_extra;

import com.google.gson.annotations.SerializedName;

public record SkyBlockExtra() {
   @SerializedName("ozanne_coins")
   private final int ozanneCoins;

   public SkyBlockExtra(int var1) {
      this.ozanneCoins = var1;
   }
}
