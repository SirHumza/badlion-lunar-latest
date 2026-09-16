package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Random;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final double RICRHOOCRRCCRCCHOOHRHHRCOOHCIC = 1.0;
   private static final double HIHIHHRROCIIIOCHHIHHOHICHOIICC = 0.02;
   private static final Random IIICCOIICHRHCOHRCCORCCICHIRICH = new Random();

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int[] var0, int[] var1, double[] var2, HHCCIRHCCCIIRHCROHIORHIRHHIORH var3) {
      double var4 = Math.sqrt(Math.pow(var0[0] - var1[0], 2.0) + Math.pow(var0[1] - var1[1], 2.0) + Math.pow(var0[2] - var1[2], 2.0));
      int var6 = (int)Math.ceil(var4 * 1.0);
      double var7 = (var1[0] - var0[0]) / var4 * 0.02;
      double var9 = (var1[1] - var0[1]) / var4 * 0.02;
      double var11 = (var1[2] - var0[2]) / var4 * 0.02;

      for (int var13 = 0; var13 < var6; var13++) {
         double var14 = var13 + IIICCOIICHRHCOHRCCORCCICHIRICH.nextDouble();
         double var16 = var14 / var6;
         double var18 = var0[0] * (1.0 - var16) + var1[0] * var16 + var2[0];
         double var20 = var0[1] * (1.0 - var16) + var1[1] * var16 + var2[1];
         double var22 = var0[2] * (1.0 - var16) + var1[2] * var16 + var2[2];
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var18, var20, var22, var7, var9, var11, var3);
      }
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      double var0, double var2, double var4, double var6, double var8, double var10, HHCCIRHCCCIIRHCROHIORHIRHHIORH var12
   ) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH().bridge$spawnParticle(var12, true, var0, var2, var4, var6, var8, var10);
   }
}
