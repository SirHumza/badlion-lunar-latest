package com.lunarclient.player.eugene;

import com.google.gson.annotations.SerializedName;

public record Eugene() {
   @SerializedName("dailyTwoKExp")
   private final long dailyTwoKExp;
   @SerializedName("weekly_booster")
   private final long weeklyBooster;

   public Eugene(long var1, long var3) {
      this.dailyTwoKExp = var1;
      this.weeklyBooster = var3;
   }
}
