package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;

import java.util.Locale;
import lombok.Generated;

public enum RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   EMPTY,
   SKULL,
   ELYTRA,
   SHIELD,
   SWORD,
   PICKAXE,
   AXE,
   SHOVEL,
   HOE,
   BLOCK,
   ARMOR,
   POTION,
   SPLASH_POTION,
   LINGERING_POTION,
   TIPPED_ARROW,
   SPAWN_EGG,
   FIREWORK_STAR,
   UNKNOWN;

   public static RIOOCHICIHRHOHCCCCCHOCCCOHCRHI[] VALUES = values();
   private final String id = this.name().toLowerCase(Locale.ENGLISH);

   public boolean isAnyPotion() {
      return this == POTION || this == SPLASH_POTION || this == LINGERING_POTION;
   }

   public static RIOOCHICIHRHOHCCCCCHOCCCOHCRHI fromPath(String var0) {
      if (var0.contains("sword")) {
         return SWORD;
      } else if (var0.contains("boots") || var0.contains("leggings") || var0.contains("chestplate") || var0.contains("helmet")) {
         return ARMOR;
      } else {
         return var0.contains("firework_star") ? FIREWORK_STAR : UNKNOWN;
      }
   }

   @Override
   public String toString() {
      return this.id;
   }

   @Generated
   public String getId() {
      return this.id;
   }
}
