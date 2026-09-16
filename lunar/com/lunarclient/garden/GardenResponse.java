package com.lunarclient.garden;

import com.google.gson.annotations.SerializedName;

public record GardenResponse() {
   @SerializedName("success")
   private final boolean success;
   @SerializedName("garden")
   private final Garden garden;

   public GardenResponse(boolean var1, Garden var2) {
      this.success = var1;
      this.garden = var2;
   }
}
