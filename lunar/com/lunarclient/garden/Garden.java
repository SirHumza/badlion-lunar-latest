package com.lunarclient.garden;

import com.google.gson.annotations.SerializedName;
import com.lunarclient.garden.commission.Commission;
import com.lunarclient.garden.commission_data.CommissionData;
import com.lunarclient.garden.composter_data.ComposterData;
import com.lunarclient.garden.greenhouse_slot.GreenhouseSlot;
import java.util.Map;

public record Garden() {
   @SerializedName("active_commissions")
   private final Map<String, Commission> activeCommissions;
   @SerializedName("commission_data")
   private final CommissionData commissionData;
   @SerializedName("composter_data")
   private final ComposterData composterData;
   @SerializedName("uuid")
   private final String uuid;
   @SerializedName("unlocked_plots_ids")
   private final String[] unlockedPlotsIds;
   @SerializedName("garden_experience")
   private final float gardenExperience;
   @SerializedName("unlocked_barn_skins")
   private final String[] unlockedBarnSkins;
   @SerializedName("selected_barn_skin")
   private final String selectedBarnSkin;
   @SerializedName("resources_collected")
   private final Map<String, Long> resourcesCollected;
   @SerializedName("crop_upgrade_levels")
   private final Map<String, Integer> cropUpgradeLevels;
   @SerializedName("garden_upgrades")
   private final Map<String, Integer> gardenUpgrades;
   @SerializedName("greenhouse_slots")
   private final GreenhouseSlot[] greenhouseSlots;
   @SerializedName("last_growth_stage_time")
   private final long lastGrowthStageTime;

   public Garden(
      Map<String, Commission> var1,
      CommissionData var2,
      ComposterData var3,
      String var4,
      String[] var5,
      float var6,
      String[] var7,
      String var8,
      Map<String, Long> var9,
      Map<String, Integer> var10,
      Map<String, Integer> var11,
      GreenhouseSlot[] var12,
      long var13
   ) {
      this.activeCommissions = var1;
      this.commissionData = var2;
      this.composterData = var3;
      this.uuid = var4;
      this.unlockedPlotsIds = var5;
      this.gardenExperience = var6;
      this.unlockedBarnSkins = var7;
      this.selectedBarnSkin = var8;
      this.resourcesCollected = var9;
      this.cropUpgradeLevels = var10;
      this.gardenUpgrades = var11;
      this.greenhouseSlots = var12;
      this.lastGrowthStageTime = var13;
   }
}
