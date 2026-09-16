package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import lombok.Generated;

public final class CRRRICCRROCOHHOHIICIHORCOORRRH {
   public static final String CHCHHOHHOIRHOIHIOCHRRHCHCCRCIC = "lunar-jit";

   public static boolean HOIHOROOIOOCOIHCRIRIRIRRICIIHC(RCIROOOOICRHCCRRCIORHHIRCOIIIC var0) {
      return var0 != null && var0.bridge$getDomain().equals("lunar-jit");
   }

   public static RCIROOOOICRHCCRRCIORHHIRCOIIIC OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(RCIROOOOICRHCCRRCIORHHIRCOIIIC var0) {
      return var0 != null && !HOIHOROOIOOCOIHCRIRIRIRRICIIHC(var0) && !var0.bridge$getPath().contains("dev_cosmetics")
         ? RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar-jit", var0.bridge$getPath())
         : var0;
   }

   public static String HHCCIRHCCCIIRHCROHIORHIRHHIORH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var0, boolean var1) {
      String var2 = var0.bridge$getPath();
      if (var1) {
         var2 = var2 + ".mcmeta";
      }

      return var2;
   }

   @Generated
   private CRRRICCRROCOHHOHIICIHORCOORRRH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
