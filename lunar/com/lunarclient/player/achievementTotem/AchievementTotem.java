package com.lunarclient.player.achievementTotem;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public record AchievementTotem() {
   @SerializedName("canCustomize")
   private final boolean canCustomize;
   @SerializedName("allowed_max_height")
   private final int allowedMaxHeight;
   @SerializedName("unlockedParts")
   private final String[] unlockedParts;
   @SerializedName("selectedParts")
   private final Map<String, String> selectedParts;
   @SerializedName("unlockedColors")
   private final String[] unlockedColors;
   @SerializedName("selectedColors")
   private final Map<String, String> selectedColors;

   public AchievementTotem(boolean var1, int var2, String[] var3, Map<String, String> var4, String[] var5, Map<String, String> var6) {
      this.canCustomize = var1;
      this.allowedMaxHeight = var2;
      this.unlockedParts = var3;
      this.selectedParts = var4;
      this.unlockedColors = var5;
      this.selectedColors = var6;
   }
}
