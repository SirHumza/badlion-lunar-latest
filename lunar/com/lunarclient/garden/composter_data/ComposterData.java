package com.lunarclient.garden.composter_data;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public record ComposterData() {
   @SerializedName("organic_matter")
   private final double organicMatter;
   @SerializedName("fuel_units")
   private final float fuelUnits;
   @SerializedName("compost_units")
   private final int compostUnits;
   @SerializedName("compost_items")
   private final int compostItems;
   @SerializedName("conversion_ticks")
   private final int conversionTicks;
   @SerializedName("last_save")
   private final long lastSave;
   @SerializedName("upgrades")
   private final Map<String, Integer> upgrades;

   public ComposterData(double var1, float var3, int var4, int var5, int var6, long var7, Map<String, Integer> var9) {
      this.organicMatter = var1;
      this.fuelUnits = var3;
      this.compostUnits = var4;
      this.compostItems = var5;
      this.conversionTicks = var6;
      this.lastSave = var7;
      this.upgrades = var9;
   }
}
