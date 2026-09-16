package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHIIIOHIRIRCCRRIOIICCHHIORRHOH;
import java.util.HashMap;
import java.util.Map;

public enum CRRRICCRROCOHHOHIICIHORCOORRRH {
   STRING,
   NUMBER,
   INTEGER,
   BOOLEAN,
   OBJECT,
   ARRAY,
   NULL,
   ANY;

   private static final Map<String, CRRRICCRROCOHHOHIICIHORCOORRRH> _byLCName = new HashMap<>();

   @OHIIIOHIRIRCCRRIOIICCHHIORRHOH
   public String value() {
      return this.name().toLowerCase();
   }

   @com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI
   public static CRRRICCRROCOHHOHIICIHORCOORRRH forValue(String var0) {
      return _byLCName.get(var0);
   }

   static {
      for (CRRRICCRROCOHHOHIICIHORCOORRRH var3 : values()) {
         _byLCName.put(var3.name().toLowerCase(), var3);
      }
   }
}
