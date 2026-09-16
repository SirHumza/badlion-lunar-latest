package com.lunarclient.player.parkourCompletions;

import com.google.gson.annotations.SerializedName;

public record ParkourTime() {
   @SerializedName("timeStart")
   private final long timeStart;
   @SerializedName("timeTook")
   private final long timeTook;

   public ParkourTime(long var1, long var3) {
      this.timeStart = var1;
      this.timeTook = var3;
   }
}
