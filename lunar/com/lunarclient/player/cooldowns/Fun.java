package com.lunarclient.player.cooldowns;

import com.google.gson.annotations.SerializedName;
import com.lunarclient.player.cooldowns.fun.Fun;

public record Cooldowns() {
   @SerializedName("fun")
   private final Fun fun;

   public Cooldowns(Fun var1) {
      this.fun = var1;
   }
}
