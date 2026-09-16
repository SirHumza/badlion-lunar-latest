package com.lunarclient.player;

import com.google.gson.annotations.SerializedName;

public record PlayerResponse() {
   @SerializedName("success")
   private final boolean success;
   @SerializedName("player")
   private final Player player;

   public PlayerResponse(boolean var1, Player var2) {
      this.success = var1;
      this.player = var2;
   }
}
