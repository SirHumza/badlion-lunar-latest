package com.lunarclient.player.petConsumables;

import com.google.gson.annotations.SerializedName;

public record PetConsumables() {
   @SerializedName("MUSHROOM_SOUP")
   private final int mushroomSoup;
   @SerializedName("CARROT_ITEM")
   private final int carrotItem;
   @SerializedName("FEATHER")
   private final int feather;
   @SerializedName("ROTTEN_FLESH")
   private final int rottenFlesh;
   @SerializedName("SLIME_BALL")
   private final int slimeBall;
   @SerializedName("RED_ROSE")
   private final int redRose;
   @SerializedName("CAKE")
   private final int cake;
   @SerializedName("WATER_BUCKET")
   private final int waterBucket;
   @SerializedName("WOOD_SWORD")
   private final int woodSword;
   @SerializedName("MELON")
   private final int melon;
   @SerializedName("MILK_BUCKET")
   private final int milkBucket;
   @SerializedName("GOLD_RECORD")
   private final int goldRecord;
   @SerializedName("LEASH")
   private final int leash;
   @SerializedName("LAVA_BUCKET")
   private final int lavaBucket;
   @SerializedName("BAKED_POTATO")
   private final int bakedPotato;
   @SerializedName("COOKIE")
   private final int cookie;
   @SerializedName("BREAD")
   private final int bread;
   @SerializedName("STICK")
   private final int stick;
   @SerializedName("PORK")
   private final int pork;
   @SerializedName("MAGMA_CREAM")
   private final int magmaCream;
   @SerializedName("HAY_BLOCK")
   private final int hayBlock;
   @SerializedName("RAW_FISH")
   private final int rawFish;
   @SerializedName("APPLE")
   private final int apple;
   @SerializedName("COOKED_BEEF")
   private final int cookedBeef;
   @SerializedName("WHEAT")
   private final int wheat;
   @SerializedName("PUMPKIN_PIE")
   private final int pumpkinPie;
   @SerializedName("BONE")
   private final int bone;

   public PetConsumables(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20,
      int var21,
      int var22,
      int var23,
      int var24,
      int var25,
      int var26,
      int var27
   ) {
      this.mushroomSoup = var1;
      this.carrotItem = var2;
      this.feather = var3;
      this.rottenFlesh = var4;
      this.slimeBall = var5;
      this.redRose = var6;
      this.cake = var7;
      this.waterBucket = var8;
      this.woodSword = var9;
      this.melon = var10;
      this.milkBucket = var11;
      this.goldRecord = var12;
      this.leash = var13;
      this.lavaBucket = var14;
      this.bakedPotato = var15;
      this.cookie = var16;
      this.bread = var17;
      this.stick = var18;
      this.pork = var19;
      this.magmaCream = var20;
      this.hayBlock = var21;
      this.rawFish = var22;
      this.apple = var23;
      this.cookedBeef = var24;
      this.wheat = var25;
      this.pumpkinPie = var26;
      this.bone = var27;
   }
}
