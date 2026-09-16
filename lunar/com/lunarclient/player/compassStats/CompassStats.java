package com.lunarclient.player.compassStats;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public record CompassStats() {
   @SerializedName("compass")
   private final Map<String, Integer> compass;

   public CompassStats(Map<String, Integer> var1) {
      this.compass = var1;
   }
}
