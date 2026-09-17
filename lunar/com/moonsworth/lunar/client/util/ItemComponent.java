package com.moonsworth.lunar.client.util;

import javax.annotation.Nullable;

public final class IHIIIRHOOCHRCCCCIORIROCOIRRHCC {
   private static final String[] CHORHCHIRICIRIROROOIIIRCCCCCCC = new String[]{
      "minecraft:water",
      "minecraft:regeneration",
      "minecraft:swiftness",
      "minecraft:fire_resistance",
      "minecraft:poison",
      "minecraft:healing",
      "minecraft:night_vision",
      null,
      "minecraft:weakness",
      "minecraft:strength",
      "minecraft:slowness",
      "minecraft:leaping",
      "minecraft:harming",
      "minecraft:water_breathing",
      "minecraft:invisibility",
      null,
      "minecraft:awkward",
      "minecraft:regeneration",
      "minecraft:swiftness",
      "minecraft:fire_resistance",
      "minecraft:poison",
      "minecraft:healing",
      "minecraft:night_vision",
      null,
      "minecraft:weakness",
      "minecraft:strength",
      "minecraft:slowness",
      "minecraft:leaping",
      "minecraft:harming",
      "minecraft:water_breathing",
      "minecraft:invisibility",
      null,
      "minecraft:thick",
      "minecraft:strong_regeneration",
      "minecraft:strong_swiftness",
      "minecraft:fire_resistance",
      "minecraft:strong_poison",
      "minecraft:strong_healing",
      "minecraft:night_vision",
      null,
      "minecraft:weakness",
      "minecraft:strong_strength",
      "minecraft:slowness",
      "minecraft:strong_leaping",
      "minecraft:strong_harming",
      "minecraft:water_breathing",
      "minecraft:invisibility",
      null,
      null,
      "minecraft:strong_regeneration",
      "minecraft:strong_swiftness",
      "minecraft:fire_resistance",
      "minecraft:strong_poison",
      "minecraft:strong_healing",
      "minecraft:night_vision",
      null,
      "minecraft:weakness",
      "minecraft:strong_strength",
      "minecraft:slowness",
      "minecraft:strong_leaping",
      "minecraft:strong_harming",
      "minecraft:water_breathing",
      "minecraft:invisibility",
      null,
      "minecraft:mundane",
      "minecraft:long_regeneration",
      "minecraft:long_swiftness",
      "minecraft:long_fire_resistance",
      "minecraft:long_poison",
      "minecraft:healing",
      "minecraft:long_night_vision",
      null,
      "minecraft:long_weakness",
      "minecraft:long_strength",
      "minecraft:long_slowness",
      "minecraft:long_leaping",
      "minecraft:harming",
      "minecraft:long_water_breathing",
      "minecraft:long_invisibility",
      null,
      "minecraft:awkward",
      "minecraft:long_regeneration",
      "minecraft:long_swiftness",
      "minecraft:long_fire_resistance",
      "minecraft:long_poison",
      "minecraft:healing",
      "minecraft:long_night_vision",
      null,
      "minecraft:long_weakness",
      "minecraft:long_strength",
      "minecraft:long_slowness",
      "minecraft:long_leaping",
      "minecraft:harming",
      "minecraft:long_water_breathing",
      "minecraft:long_invisibility",
      null,
      "minecraft:thick",
      "minecraft:regeneration",
      "minecraft:swiftness",
      "minecraft:long_fire_resistance",
      "minecraft:poison",
      "minecraft:strong_healing",
      "minecraft:long_night_vision",
      null,
      "minecraft:long_weakness",
      "minecraft:strength",
      "minecraft:long_slowness",
      "minecraft:leaping",
      "minecraft:strong_harming",
      "minecraft:long_water_breathing",
      "minecraft:long_invisibility",
      null,
      null,
      "minecraft:regeneration",
      "minecraft:swiftness",
      "minecraft:long_fire_resistance",
      "minecraft:poison",
      "minecraft:strong_healing",
      "minecraft:long_night_vision",
      null,
      "minecraft:long_weakness",
      "minecraft:strength",
      "minecraft:long_slowness",
      "minecraft:leaping",
      "minecraft:strong_harming",
      "minecraft:long_water_breathing",
      "minecraft:long_invisibility",
      null
   };
   public static final int[] IICOHCCIRCRCOIRIOICCIIICOOIICI = new int[]{
      0,
      16,
      32,
      64,
      8193,
      8194,
      8195,
      8196,
      8197,
      8198,
      8200,
      8201,
      8202,
      8204,
      8205,
      8206,
      8225,
      8226,
      8228,
      8229,
      8233,
      8235,
      8236,
      8257,
      8258,
      8259,
      8260,
      8262,
      8264,
      8265,
      8266,
      8267,
      8269,
      8270
   };

   private IHIIIRHOOCHRCCCCIORIROCOIRRHCC() {
   }

   @Nullable
   public static String IHORRHOROHHHIORCCHRCRIRRHHCCCO(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var0
   ) {
      if (!(var0.bridge$getItem() instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.OCOHORHCROHICRRIHCIHHRRCIHICRI)
         )
       {
         return null;
      }

      int var1 = var0.bridge$getItemDamage();
      return CHORHCHIRICIRIROROOIIIRCCCCCCC[var1 & 127];
   }

   public static String CRHHOOCRCOHHRHOOOCHCROOHIOOCOH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var0
   ) {
      return CHORHCHIRICIRIROROOIIIRCCCCCCC[var0.bridge$getItemDamage() & 15];
   }

   public static boolean RIHHRRORHHCCICCCRCOROCIHOHIOHC(int var0) {
      return (var0 & 32) == 32;
   }

   public static boolean CCRRRHHIRICORHROOHHHROIRHHOHRC(int var0) {
      return (var0 & 64) == 64;
   }

   public static boolean RRHHORICORICIRHICOHHROHIIHICCH(int var0, int var1) {
      var0 = RIOHROIOCHOICOOIOCHHOCCCCICCOI(var0);
      var1 = RIOHROIOCHOICOOIOCHHOCCCCICCOI(var1);
      return (var0 & 16384) == (var1 & 16384) && (var0 & 64) == (var1 & 64) && (var0 & 32) == (var1 & 32);
   }

   private static int RIOHROIOCHOICOOIOCHHOCCCCICCOI(int var0) {
      return switch (var0) {
         case 8261, 8268, 16453, 16460 -> var0 & -65;
         default -> var0;
      };
   }

   public static int CCCHICOCHIOOIRCCHOCHHIHIIHHCHO(int var0) {
      return var0 & -8193 | 16384;
   }
}
