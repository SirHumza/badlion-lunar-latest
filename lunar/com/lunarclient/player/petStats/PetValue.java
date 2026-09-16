package com.lunarclient.player.petStats;

import com.google.gson.annotations.SerializedName;

public record PetValue() {
   @SerializedName("timestamp")
   private final long timestamp;
   @SerializedName("value")
   private final int value;

   public PetValue(long var1, int var3) {
      this.timestamp = var1;
      this.value = var3;
   }
}
