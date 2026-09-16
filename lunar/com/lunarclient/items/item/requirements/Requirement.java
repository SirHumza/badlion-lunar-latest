package com.lunarclient.items.item.requirements;

import com.google.gson.annotations.SerializedName;

public record Requirement() {
   @SerializedName("type")
   private final String type;
   @SerializedName("slayer_boss_type")
   private final String slayerBossType;
   @SerializedName("skill")
   private final String skill;
   @SerializedName("kuudra_tier")
   private final Object kuudraTier;
   @SerializedName("dungeon_type")
   private final String dungeonType;
   @SerializedName("level")
   private final int level;
   @SerializedName("tier")
   private final int tier;
   @SerializedName("minimum_age")
   private final long minimumAge;
   @SerializedName("minimum_age_unit")
   private final String minimumAgeUnit;
   @SerializedName("collection")
   private final String collection;
   @SerializedName("mode")
   private final String mode;
   @SerializedName("requirements")
   private final Requirement[] requirements;
   @SerializedName("profile_type")
   private final String profileType;
   @SerializedName("lore_index")
   private final int loreIndex;
   @SerializedName("reward")
   private final String reward;
   @SerializedName("rabbit")
   private final String rabbit;
   @SerializedName("faction")
   private final String faction;
   @SerializedName("reputation")
   private final long reputation;

   public Requirement(
      String var1,
      String var2,
      String var3,
      Object var4,
      String var5,
      int var6,
      int var7,
      long var8,
      String var10,
      String var11,
      String var12,
      Requirement[] var13,
      String var14,
      int var15,
      String var16,
      String var17,
      String var18,
      long var19
   ) {
      this.type = var1;
      this.slayerBossType = var2;
      this.skill = var3;
      this.kuudraTier = var4;
      this.dungeonType = var5;
      this.level = var6;
      this.tier = var7;
      this.minimumAge = var8;
      this.minimumAgeUnit = var10;
      this.collection = var11;
      this.mode = var12;
      this.requirements = var13;
      this.profileType = var14;
      this.loreIndex = var15;
      this.reward = var16;
      this.rabbit = var17;
      this.faction = var18;
      this.reputation = var19;
   }
}
