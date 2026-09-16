package com.lunarclient.player.stats;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

public record Stats() {
   @SerializedName("SkyWars")
   private final JsonObject skyWars;
   @SerializedName("Arcade")
   private final JsonObject arcade;
   @SerializedName("TrueCombat")
   private final JsonObject crazyWalls;
   @SerializedName("Battleground")
   private final JsonObject warlords;
   @SerializedName("HungerGames")
   private final JsonObject blitzSurvivalGames;
   @SerializedName("TNTGames")
   private final JsonObject TNTGames;
   @SerializedName("GingerBread")
   private final JsonObject turboKartRacers;
   @SerializedName("SuperSmash")
   private final JsonObject smashHeroes;
   @SerializedName("UHC")
   private final JsonObject UHCChampions;
   @SerializedName("Walls")
   private final JsonObject walls;
   @SerializedName("Paintball")
   private final JsonObject paintball;
   @SerializedName("VampireZ")
   private final JsonObject vampireZ;
   @SerializedName("MCGO")
   private final JsonObject copsAndCrims;
   @SerializedName("Arena")
   private final JsonObject arena;
   @SerializedName("Quake")
   private final JsonObject quake;
   @SerializedName("Walls3")
   private final JsonObject megaWalls;
   @SerializedName("SpeedUHC")
   private final JsonObject speedUHC;
   @SerializedName("SkyClash")
   private final JsonObject skyClash;
   @SerializedName("Legacy")
   private final JsonObject classicGames;
   @SerializedName("Bedwars")
   private final JsonObject bedWars;
   @SerializedName("MurderMystery")
   private final JsonObject murderMystery;
   @SerializedName("Duels")
   private final JsonObject duels;
   @SerializedName("BuildBattle")
   private final JsonObject buildBattle;
   @SerializedName("Pit")
   private final JsonObject pit;
   @SerializedName("Housing")
   private final JsonObject housing;
   @SerializedName("SkyBlock")
   private final JsonObject skyBlock;
   @SerializedName("MainLobby")
   private final JsonObject mainLobby;
   @SerializedName("WoolGames")
   private final JsonObject woolWars;

   public Stats(
      JsonObject var1,
      JsonObject var2,
      JsonObject var3,
      JsonObject var4,
      JsonObject var5,
      JsonObject var6,
      JsonObject var7,
      JsonObject var8,
      JsonObject var9,
      JsonObject var10,
      JsonObject var11,
      JsonObject var12,
      JsonObject var13,
      JsonObject var14,
      JsonObject var15,
      JsonObject var16,
      JsonObject var17,
      JsonObject var18,
      JsonObject var19,
      JsonObject var20,
      JsonObject var21,
      JsonObject var22,
      JsonObject var23,
      JsonObject var24,
      JsonObject var25,
      JsonObject var26,
      JsonObject var27,
      JsonObject var28
   ) {
      this.skyWars = var1;
      this.arcade = var2;
      this.crazyWalls = var3;
      this.warlords = var4;
      this.blitzSurvivalGames = var5;
      this.TNTGames = var6;
      this.turboKartRacers = var7;
      this.smashHeroes = var8;
      this.UHCChampions = var9;
      this.walls = var10;
      this.paintball = var11;
      this.vampireZ = var12;
      this.copsAndCrims = var13;
      this.arena = var14;
      this.quake = var15;
      this.megaWalls = var16;
      this.speedUHC = var17;
      this.skyClash = var18;
      this.classicGames = var19;
      this.bedWars = var20;
      this.murderMystery = var21;
      this.duels = var22;
      this.buildBattle = var23;
      this.pit = var24;
      this.housing = var25;
      this.skyBlock = var26;
      this.mainLobby = var27;
      this.woolWars = var28;
   }
}
