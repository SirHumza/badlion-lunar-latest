package com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.Random;

public class HHRIICOIOORCHCOIICOOIHIRHHICRI implements RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   public Random random = new Random();

   @Override
   public boolean ICRCOOIHHHRCCROCCRIRCIOCIRIHIH(int var1) {
      return var1 >= 1 && var1 <= 2;
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
   public static double call(double var0) {
      double var2 = Math.random() * var0;
      return Math.floor(var2);
   }

   @com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR
   public static double call(double var0, double var2) {
      double var4 = Math.random();
      double var6 = Math.min(var0, var2);
      double var8 = Math.max(var0, var2);
      var4 = var4 * (var8 - var6) + var6;
      return Math.floor(var4);
   }

   @com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR
   public double call(double var1, double var3, double var5) {
      this.random.setSeed((long)var5);
      double var7 = this.random.nextDouble();
      double var9 = Math.min(var1, var3);
      double var11 = Math.max(var1, var3);
      var7 = var7 * (var11 - var9) + var9;
      return Math.floor(var7);
   }
}
