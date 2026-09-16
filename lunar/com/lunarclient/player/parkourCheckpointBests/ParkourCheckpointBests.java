package com.lunarclient.player.parkourCheckpointBests;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public record ParkourCheckpointBests() {
   @SerializedName("BlitzLobby")
   private final Map<String, Long> blitzLobby;
   @SerializedName("uhc")
   private final Map<String, Long> uhc;
   @SerializedName("Prototype")
   private final Map<String, Long> prototype;
   @SerializedName("Bedwars")
   private final Map<String, Long> bedWars;
   @SerializedName("MegaWalls")
   private final Map<String, Long> megaWalls;
   @SerializedName("SkywarsAug2017")
   private final Map<String, Long> skywarsAug2017;
   @SerializedName("TNT")
   private final Map<String, Long> TNT;
   @SerializedName("MurderMystery")
   private final Map<String, Long> murderMystery;
   @SerializedName("Duels")
   private final Map<String, Long> duels;
   @SerializedName("SpeedUHC")
   private final Map<String, Long> speedUHC;
   @SerializedName("ArcadeGames")
   private final Map<String, Long> arcadeGames;
   @SerializedName("SkyClash")
   private final Map<String, Long> skyClash;
   @SerializedName("Tourney")
   private final Map<String, Long> tourney;
   @SerializedName("Legacy")
   private final Map<String, Long> legacy;
   @SerializedName("BuildBattle")
   private final Map<String, Long> buildBattle;
   @SerializedName("SuperSmash")
   private final Map<String, Long> superSmash;
   @SerializedName("mainLobby2017")
   private final Map<String, Long> mainLobby2017;
   @SerializedName("CopsnCrims")
   private final Map<String, Long> copsNCrims;
   @SerializedName("Warlords")
   private final Map<String, Long> warlords;
   @SerializedName("Housing")
   private final Map<String, Long> housing;
   @SerializedName("mainLobby2022")
   private final Map<String, Long> mainLobby2022;
   @SerializedName("WoolGames")
   private final Map<String, Long> woolGames;
   @SerializedName("SkywarsStandard2022")
   private final Map<String, Long> skyWarsStandard2022;
   @SerializedName("BedwarsSpring2023")
   private final Map<String, Long> bedWarsSpring2023;
   @SerializedName("SkywarsChristmas2017")
   private final Map<String, Long> skyWarsChristmas2017;
   @SerializedName("TruePVPParkour")
   private final Map<String, Long> truePVPParkour;
   @SerializedName("ArcadeGames2")
   private final Map<String, Long> arcadeGames2;
   @SerializedName("tntLobby2024")
   private final Map<String, Long> tntLobby2024;
   @SerializedName("CopsnCrims2024")
   private final Map<String, Long> copsNCrims2024;

   public ParkourCheckpointBests(
      Map<String, Long> var1,
      Map<String, Long> var2,
      Map<String, Long> var3,
      Map<String, Long> var4,
      Map<String, Long> var5,
      Map<String, Long> var6,
      Map<String, Long> var7,
      Map<String, Long> var8,
      Map<String, Long> var9,
      Map<String, Long> var10,
      Map<String, Long> var11,
      Map<String, Long> var12,
      Map<String, Long> var13,
      Map<String, Long> var14,
      Map<String, Long> var15,
      Map<String, Long> var16,
      Map<String, Long> var17,
      Map<String, Long> var18,
      Map<String, Long> var19,
      Map<String, Long> var20,
      Map<String, Long> var21,
      Map<String, Long> var22,
      Map<String, Long> var23,
      Map<String, Long> var24,
      Map<String, Long> var25,
      Map<String, Long> var26,
      Map<String, Long> var27,
      Map<String, Long> var28,
      Map<String, Long> var29
   ) {
      this.blitzLobby = var1;
      this.uhc = var2;
      this.prototype = var3;
      this.bedWars = var4;
      this.megaWalls = var5;
      this.skywarsAug2017 = var6;
      this.TNT = var7;
      this.murderMystery = var8;
      this.duels = var9;
      this.speedUHC = var10;
      this.arcadeGames = var11;
      this.skyClash = var12;
      this.tourney = var13;
      this.legacy = var14;
      this.buildBattle = var15;
      this.superSmash = var16;
      this.mainLobby2017 = var17;
      this.copsNCrims = var18;
      this.warlords = var19;
      this.housing = var20;
      this.mainLobby2022 = var21;
      this.woolGames = var22;
      this.skyWarsStandard2022 = var23;
      this.bedWarsSpring2023 = var24;
      this.skyWarsChristmas2017 = var25;
      this.truePVPParkour = var26;
      this.arcadeGames2 = var27;
      this.tntLobby2024 = var28;
      this.copsNCrims2024 = var29;
   }
}
