package com.lunarclient.player.cooldowns.fun;

import com.google.gson.annotations.SerializedName;

public record Fun() {
   @SerializedName("whatsmyface")
   private final long whatsMyFace;

   public Fun(long var1) {
      this.whatsMyFace = var1;
   }
}
