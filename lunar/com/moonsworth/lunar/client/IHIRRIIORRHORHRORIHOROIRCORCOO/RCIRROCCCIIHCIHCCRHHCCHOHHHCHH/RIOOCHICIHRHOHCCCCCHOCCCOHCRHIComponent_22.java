package com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.Random;

public class IOIICIRIICICIIOORHCIIIIRRIHRHI implements RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   public Random random = new Random();

   @Override
   public boolean ICRCOOIHHHRCCROCCRIRCIOCIRIHIH(int var1) {
      return var1 >= 0 && var1 <= 3;
   }

   @Override
   public boolean HCCICIIIHORIIRRCIRRIHORHOHIHCH(int var1) {
      return var1 < 3;
   }

   @Override
   public boolean IIRIIICCOORHIRHCIIROIHOROCICCC(int var1) {
      return true;
   }

   @com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR
   public static double call() {
      return Math.random();
   }

   @com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR
   public static double call(double var0) {
      return Math.random() * var0;
   }

   @com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR
   public static double call(double var0, double var2) {
      double var4 = Math.random();
      double var6 = Math.min(var0, var2);
      double var8 = Math.max(var0, var2);
      return var4 * (var8 - var6) + var6;
   }

   @com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR
   public double call(double var1, double var3, double var5) {
      this.random.setSeed((long)var5);
      double var7 = this.random.nextDouble();
      double var9 = Math.min(var1, var3);
      double var11 = Math.max(var1, var3);
      return var7 * (var11 - var9) + var9;
   }
}
