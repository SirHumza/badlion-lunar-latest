package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import lombok.Generated;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   SPEED(1, "speed"),
   SLOWNESS(2, "slowness"),
   HASTE(3, "haste"),
   MINING_FATIGUE(4, "mining_fatigue"),
   STRENGTH(5, "strength"),
   INSTANT_HEALTH(6, "instant_health"),
   INSTANT_DAMAGE(7, "instant_damage"),
   JUMP_BOOST(8, "jump_boost"),
   NAUSEA(9, "nausea"),
   REGENERATION(10, "regeneration"),
   RESISTANCE(11, "resistance"),
   FIRE_RESISTANCE(12, "fire_resistance"),
   WATER_BREATHING(13, "water_breathing"),
   INVISIBILITY(14, "invisibility"),
   BLINDNESS(15, "blindness"),
   NIGHT_VISION(16, "night_vision"),
   HUNGER(17, "hunger"),
   WEAKNESS(18, "weakness"),
   POISON(19, "poison"),
   WITHER(20, "wither"),
   HEALTH_BOOST(21, "health_boost"),
   ABSORPTION(22, "absorption"),
   SATURATION(23, "saturation");

   private final int legacyId;
   private final String id;
   private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH potion;

   IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var3, String var4) {
      this.legacyId = var3;
      this.id = var4;
      this.potion = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCICHHOCCHOROIORCOHOHIRRHCIIOR()
         .RRCROCCRIOIROHCCRCCIORICOCIOHC(var4);
   }

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH getById(int var0) {
      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : values()) {
         if (var4.legacyId == var0) {
            return var4;
         }
      }

      return null;
   }

   @Generated
   public int getLegacyId() {
      return this.legacyId;
   }

   @Generated
   public String getId() {
      return this.id;
   }

   @Generated
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH getPotion() {
      return this.potion;
   }
}
