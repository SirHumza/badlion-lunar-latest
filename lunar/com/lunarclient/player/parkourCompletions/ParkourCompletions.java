package com.lunarclient.player.parkourCompletions;

import com.google.gson.annotations.SerializedName;

public record ParkourCompletions() {
   @SerializedName("Skywars")
   private final ParkourTime[] skyWars;
   @SerializedName("BlitzLobby")
   private final ParkourTime[] blitzLobby;
   @SerializedName("SpeedUHC")
   private final ParkourTime[] speedUHC;
   @SerializedName("NewMainLobby")
   private final ParkourTime[] newMainLobby;
   @SerializedName("vampirez")
   private final ParkourTime[] vampireZ;
   @SerializedName("TNT")
   private final ParkourTime[] TNT;
   @SerializedName("Prototype")
   private final ParkourTime[] prototype;
   @SerializedName("Bedwars")
   private final ParkourTime[] bedWars;
   @SerializedName("SkyClash")
   private final ParkourTime[] skyClash;
   @SerializedName("BuildBattle")
   private final ParkourTime[] buildBattle;
   @SerializedName("SkywarsAug2017")
   private final ParkourTime[] skyWarsAug2017;
   @SerializedName("Duels")
   private final ParkourTime[] duels;
   @SerializedName("Legacy")
   private final ParkourTime[] legacy;
   @SerializedName("uhc")
   private final ParkourTime[] uhc;
   @SerializedName("MegaWalls")
   private final ParkourTime[] megaWalls;
   @SerializedName("mainLobby2017")
   private final ParkourTime[] mainLobby2017;
   @SerializedName("MurderMystery")
   private final ParkourTime[] murderMystery;
   @SerializedName("ArcadeGames")
   private final ParkourTime[] arcadeGames;
   @SerializedName("CopsnCrims")
   private final ParkourTime[] copsNCrims;
   @SerializedName("SuperSmash")
   private final ParkourTime[] superSmash;
   @SerializedName("Warlords")
   private final ParkourTime[] warLords;
   @SerializedName("Housing")
   private final ParkourTime[] housing;
   @SerializedName("Tourney")
   private final ParkourTime[] tourney;
   @SerializedName("mainLobby2022")
   private final ParkourTime[] mainLobby2022;
   @SerializedName("WoolGames")
   private final ParkourTime[] woolGames;
   @SerializedName("SkywarsStandard2022")
   private final ParkourTime[] skyWarsStandard2022;
   @SerializedName("SkywarsChristmas2017")
   private final ParkourTime[] skyWarsChristmas2017;
   @SerializedName("Turbo")
   private final ParkourTime[] turbo;
   @SerializedName("QuakeCraft")
   private final ParkourTime[] quakeCraft;
   @SerializedName("TruePVPParkour")
   private final ParkourTime[] truePVPParkour;
   @SerializedName("Paintball")
   private final ParkourTime[] paintball;
   @SerializedName("Arena")
   private final ParkourTime[] arena;
   @SerializedName("TheWallsLobby")
   private final ParkourTime[] theWallsLobby;
   @SerializedName("BedwarsSpring2023")
   private final ParkourTime[] bedWarsSpring2023;
   @SerializedName("ArcadeGames2")
   private final ParkourTime[] arcadeGames2;
   @SerializedName("tntLobby2024")
   private final ParkourTime[] TNTLobby2024;
   @SerializedName("CopsnCrims2024")
   private final ParkourTime[] copsNCrims2024;

   public ParkourCompletions(
      ParkourTime[] var1,
      ParkourTime[] var2,
      ParkourTime[] var3,
      ParkourTime[] var4,
      ParkourTime[] var5,
      ParkourTime[] var6,
      ParkourTime[] var7,
      ParkourTime[] var8,
      ParkourTime[] var9,
      ParkourTime[] var10,
      ParkourTime[] var11,
      ParkourTime[] var12,
      ParkourTime[] var13,
      ParkourTime[] var14,
      ParkourTime[] var15,
      ParkourTime[] var16,
      ParkourTime[] var17,
      ParkourTime[] var18,
      ParkourTime[] var19,
      ParkourTime[] var20,
      ParkourTime[] var21,
      ParkourTime[] var22,
      ParkourTime[] var23,
      ParkourTime[] var24,
      ParkourTime[] var25,
      ParkourTime[] var26,
      ParkourTime[] var27,
      ParkourTime[] var28,
      ParkourTime[] var29,
      ParkourTime[] var30,
      ParkourTime[] var31,
      ParkourTime[] var32,
      ParkourTime[] var33,
      ParkourTime[] var34,
      ParkourTime[] var35,
      ParkourTime[] var36,
      ParkourTime[] var37
   ) {
      this.skyWars = var1;
      this.blitzLobby = var2;
      this.speedUHC = var3;
      this.newMainLobby = var4;
      this.vampireZ = var5;
      this.TNT = var6;
      this.prototype = var7;
      this.bedWars = var8;
      this.skyClash = var9;
      this.buildBattle = var10;
      this.skyWarsAug2017 = var11;
      this.duels = var12;
      this.legacy = var13;
      this.uhc = var14;
      this.megaWalls = var15;
      this.mainLobby2017 = var16;
      this.murderMystery = var17;
      this.arcadeGames = var18;
      this.copsNCrims = var19;
      this.superSmash = var20;
      this.warLords = var21;
      this.housing = var22;
      this.tourney = var23;
      this.mainLobby2022 = var24;
      this.woolGames = var25;
      this.skyWarsStandard2022 = var26;
      this.skyWarsChristmas2017 = var27;
      this.turbo = var28;
      this.quakeCraft = var29;
      this.truePVPParkour = var30;
      this.paintball = var31;
      this.arena = var32;
      this.theWallsLobby = var33;
      this.bedWarsSpring2023 = var34;
      this.arcadeGames2 = var35;
      this.TNTLobby2024 = var36;
      this.copsNCrims2024 = var37;
   }
}
