package com.lunarclient.player.questSettings;

import com.google.gson.annotations.SerializedName;

public record QuestSettings() {
   @SerializedName("autoActivate")
   private final boolean autoActivate;

   public QuestSettings(boolean var1) {
      this.autoActivate = var1;
   }
}
