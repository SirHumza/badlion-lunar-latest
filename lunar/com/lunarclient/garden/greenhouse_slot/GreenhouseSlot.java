package com.lunarclient.garden.greenhouse_slot;

import com.google.gson.annotations.SerializedName;

public record GreenhouseSlot() {
   @SerializedName("x")
   private final int x;
   @SerializedName("z")
   private final int z;

   public GreenhouseSlot(int var1, int var2) {
      this.x = var1;
      this.z = var2;
   }
}
