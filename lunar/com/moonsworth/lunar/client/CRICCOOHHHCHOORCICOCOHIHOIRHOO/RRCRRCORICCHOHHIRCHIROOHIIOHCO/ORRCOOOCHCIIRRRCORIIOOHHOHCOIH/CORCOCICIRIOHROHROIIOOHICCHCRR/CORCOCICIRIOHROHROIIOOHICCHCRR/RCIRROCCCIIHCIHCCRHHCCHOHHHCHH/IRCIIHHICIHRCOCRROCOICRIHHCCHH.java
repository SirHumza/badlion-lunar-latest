package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import lombok.Generated;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   GLACITE("Glacite", -8013569),
   TUNGSTEN("Tungsten", -8357518),
   UMBER("Umber", -2397184),
   CITRINE("Citrine", -5223168),
   AQUAMARINE("Aquamarine", -13324112),
   PERIDOT("Peridot", -16751078),
   ONYX("Onyx", -16777216);

   private final String id;
   private final int color;

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH fromId(String var0) {
      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : values()) {
         if (var4.getId().equals(var0)) {
            return var4;
         }
      }

      return null;
   }

   @Generated
   public String getId() {
      return this.id;
   }

   @Generated
   public int getColor() {
      return this.color;
   }

   @Generated
   IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var3, int var4) {
      this.id = var3;
      this.color = var4;
   }
}
