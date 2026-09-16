package com.lunarclient.player.giftingMeta;

import com.google.gson.annotations.SerializedName;

public record GiftingMeta() {
   @SerializedName("realBundlesReceived")
   private final int realBundlesReceived;
   @SerializedName("bundlesReceived")
   private final int bundlesReceived;
   @SerializedName("giftsGiven")
   private final int giftsGiven;
   @SerializedName("bundlesGiven")
   private final int bundlesGiven;
   @SerializedName("realBundlesGiven")
   private final int realBundlesGiven;
   @SerializedName("milestones")
   private final String[] milestones;
   @SerializedName("ranksGiven")
   private final int ranksGiven;
   @SerializedName("rankgiftingmilestones")
   private final String[] rankGiftingMilestones;

   public GiftingMeta(int var1, int var2, int var3, int var4, int var5, String[] var6, int var7, String[] var8) {
      this.realBundlesReceived = var1;
      this.bundlesReceived = var2;
      this.giftsGiven = var3;
      this.bundlesGiven = var4;
      this.realBundlesGiven = var5;
      this.milestones = var6;
      this.ranksGiven = var7;
      this.rankGiftingMilestones = var8;
   }
}
