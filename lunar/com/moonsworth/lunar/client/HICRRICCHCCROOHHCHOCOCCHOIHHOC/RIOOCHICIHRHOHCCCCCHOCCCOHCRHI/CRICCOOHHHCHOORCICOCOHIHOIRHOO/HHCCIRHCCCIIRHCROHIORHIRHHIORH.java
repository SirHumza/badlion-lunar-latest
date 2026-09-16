package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import java.util.function.BiFunction;
import java.util.function.Function;

public enum HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   CUSTOM(
      (var0, var1) -> var1 && var0.contains("dev_cosmetics")
         ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIRCIICRRHROHHIHCRCHHHIRHIHHIC(var0)
         : RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRHIRIROOIHHCCCIHHRHIORHOIORCI(var0)
   ),
   STATIC(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::IIIHOOCOOHROCHOOCICHHCHROHIRIR);

   private final BiFunction<String, Boolean, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> keyFunction;

   HHCCIRHCCCIIRHCROHIORHIRHHIORH(Function<String, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var3) {
      this((var1x, var2x) -> (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var3.apply(var1x));
   }

   HHCCIRHCCCIIRHCROHIORHIRHHIORH(BiFunction<String, Boolean, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var3) {
      this.keyFunction = var3;
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH createKey(String var1) {
      return this.createKey(var1, false);
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH createKey(String var1, boolean var2) {
      return this.keyFunction.apply(var1, var2);
   }

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH fromId(String var0) {
      try {
         return valueOf(var0.toUpperCase());
      } catch (Exception var2) {
         return null;
      }
   }
}
