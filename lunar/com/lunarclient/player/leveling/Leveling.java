package com.lunarclient.player.leveling;

import com.google.gson.annotations.SerializedName;

public record Leveling() {
   @SerializedName("claimedRewards")
   private final int[] claimedRewards;

   public Leveling(int[] var1) {
      this.claimedRewards = var1;
   }
}
