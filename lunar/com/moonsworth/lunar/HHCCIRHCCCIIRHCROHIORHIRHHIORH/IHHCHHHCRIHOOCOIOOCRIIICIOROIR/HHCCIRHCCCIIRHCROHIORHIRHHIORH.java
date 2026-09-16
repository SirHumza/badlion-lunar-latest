package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;

import lombok.Generated;

public interface HHCCIRHCCCIIRHCROHIORHIRHHIORH extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 6)
   int bridge$getArmorIndex();

   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR bridge$getSlot();

   boolean bridge$hasColor(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1);

   int bridge$getColor(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1);

   HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getArmorMaterial();

   String bridge$getResourcePath();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 6)
   float bridge$getArmorToughness(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1);

   int bridge$getArmorValue(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1);

   enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      LEATHER("leather"),
      CHAIN("chainmail"),
      IRON("iron"),
      GOLD("gold"),
      DIAMOND("diamond"),
      TURTLE("turtle"),
      NETHERITE("netherite"),
      ARMADILLO("armadillo"),
      TURTLE_SCUTE("turtle_scute"),
      COPPER("copper"),
      UNKNOWN("unknown");

      private final String material;

      public static HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH fromMaterial(String var0) {
         for (HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : values()) {
            if (var4.getMaterial().equals(var0)) {
               return var4;
            }
         }

         return UNKNOWN;
      }

      @Generated
      public String getMaterial() {
         return this.material;
      }

      @Generated
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3) {
         this.material = var3;
      }
   }
}
