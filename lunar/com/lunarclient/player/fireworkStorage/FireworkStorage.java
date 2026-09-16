package com.lunarclient.player.fireworkStorage;

import com.google.gson.annotations.SerializedName;

public record FireworkStorage() {
   @SerializedName("flight_duration")
   private final double flightDuration;
   @SerializedName("shape")
   private final String shape;
   @SerializedName("trail")
   private final boolean trail;
   @SerializedName("twinkle")
   private final boolean twinkle;
   @SerializedName("colors")
   private final String colors;
   @SerializedName("fade_colors")
   private final String fade_colors;
   @SerializedName("selected")
   private final boolean selected;

   public FireworkStorage(double var1, String var3, boolean var4, boolean var5, String var6, String var7, boolean var8) {
      this.flightDuration = var1;
      this.shape = var3;
      this.trail = var4;
      this.twinkle = var5;
      this.colors = var6;
      this.fade_colors = var7;
      this.selected = var8;
   }
}
