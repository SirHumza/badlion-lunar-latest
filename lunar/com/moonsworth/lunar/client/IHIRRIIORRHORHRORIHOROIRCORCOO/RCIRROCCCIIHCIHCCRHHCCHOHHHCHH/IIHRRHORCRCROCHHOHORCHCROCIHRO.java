package com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.concurrent.ThreadLocalRandom;

public class IIHRRHORCRCROCHHOHORCHCROCIHRO implements RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   @Override
   public boolean ICRCOOIHHHRCCROCCRIRCIOCIRIHIH(int var1) {
      return var1 == 2;
   }

   @Override
   public boolean HCCICIIIHORIIRRCIRRIHORHOHIHCH(int var1) {
      return true;
   }

   @com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR
   public static double call(double var0, double var2, double var4) {
      double var6 = 0.0;
      if (var0 > 0.0) {
         for (int var8 = 0; var8 < var0; var8++) {
            var6 += Math.round(ThreadLocalRandom.current().nextDouble() * (var4 - var2) + var2);
         }
      }

      return var6;
   }
}
