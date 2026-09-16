package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.math.BigInteger;

class HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
   public static final double IIICROCCORIHRIOOCHIORORHHIOCOO = Math.cos(Math.PI / 4);
   public static final double HHOCCHROOCHOCOICIHRCCRIOCCCCCH = Math.sin(Math.PI / 4);
   private static final int HCHIHROOHOHRIICIHHRCRHOCCIHIHI = 33220;
   private static final int COCCIHOIRIHIORRHROIOHCCHCCCOHC = 67108864;
   private static final int IRHCORHRORIRHIIRCIHIOCIICCIRCH = 20;
   private static final int ICOROHOOOOORCCHICCOHOHCRCHIHCI = 20;
   private static final int HIROIOOHHRIHHHRCIIOCRIRIIIOOHR = 1920;
   private static volatile HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] RIOICCICCHOIIHIROHIROIHHHROOCR = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[20];
   private static volatile HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] RCIOORCCHOOIORCHRHCHORRCOCROIR = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[20];

   static int bitsPerFftPoint(int var0) {
      if (var0 <= 9728) {
         return 19;
      } else if (var0 <= 18432) {
         return 18;
      } else if (var0 <= 69632) {
         return 17;
      } else if (var0 <= 262144) {
         return 16;
      } else if (var0 <= 983040) {
         return 15;
      } else if (var0 <= 3670016) {
         return 14;
      } else if (var0 <= 13631488) {
         return 13;
      } else if (var0 <= 25165824) {
         return 12;
      } else if (var0 <= 92274688) {
         return 11;
      } else if (var0 <= 335544320) {
         return 10;
      } else {
         return var0 <= 1207959552 ? 9 : 8;
      }
   }

   private static HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HRHOIICRCICCICRHHOCIOOHIHIORRO(int var0) {
      if (var0 == 1) {
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(1);
         var11.real(0, 1.0);
         var11.imag(0, 0.0);
         return var11;
      }

      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
      var1.set(0, 1.0, 0.0);
      double var2 = IIICROCCORIHRIOOCHIORORHHIOCOO;
      double var4 = HHOCCHROOCHOCOICIHRCCRIOCCCCCH;
      var1.set(var0 / 2, var2, var4);
      double var6 = (Math.PI / 2) / var0;

      for (int var8 = 1; var8 < var0 / 2; var8++) {
         double var9 = var6 * var8;
         var2 = Math.cos(var9);
         var4 = Math.sin(var9);
         var1.set(var8, var2, var4);
         var1.set(var0 - var8, var4, var2);
      }

      return var1;
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var1
   ) {
      int var2 = var0.RIRORHHIHRCIHOIIOIOHHOOOIOIHCI;
      int var3 = 31 - Integer.numberOfLeadingZeros(var2);
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();

      int var10;
      for (var10 = var3; var10 >= 2; var10 -= 2) {
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = var1[var10 - 2];
         int var12 = 1 << var10;

         for (int var13 = 0; var13 < var2; var13 += var12) {
            for (int var14 = 0; var14 < var12 / 4; var14++) {
               var8.CRRRICCRROCOHHOHIICIHORCOORRRH(var11, var14);
               var8.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var9);
               int var15 = var13 + var14;
               int var16 = var13 + var14 + var12 / 4;
               int var17 = var13 + var14 + var12 / 2;
               int var18 = var13 + var14 + var12 * 3 / 4;
               var0.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var15, var0, var16, var4);
               var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var17);
               var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var18);
               var0.CRRRICCRROCOHHOHIICIHORCOORRRH(var15, var0, var16, var5);
               var5.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0, var17);
               var5.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var18);
               var5.CRRRICCRROCOHHOHIICIHORCOORRRH(var8);
               var0.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var15, var0, var16, var6);
               var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var17);
               var6.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0, var18);
               var6.CRRRICCRROCOHHOHIICIHORCOORRRH(var9);
               var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var15, var0, var16, var7);
               var7.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0, var17);
               var7.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var0, var18);
               var7.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var8);
               var4.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var15);
               var5.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var16);
               var6.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var17);
               var7.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var18);
            }
         }
      }

      if (var10 > 0) {
         for (byte var19 = 0; var19 < var2; var19 += 2) {
            var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var19, var4);
            var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var19 + 1, var5);
            var0.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var19, var5);
            var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var0, var19 + 1);
         }
      }
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0,
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      int var3,
      double var4
   ) {
      double var6 = var3 * -0.5 * Math.sqrt(3.0);

      for (int var8 = 0; var8 < var0.RIRORHHIHRCIHOIIOIOHHOOOIOIHCI; var8++) {
         double var9 = var0.real(var8) + var1.real(var8) + var2.real(var8);
         double var11 = var0.imag(var8) + var1.imag(var8) + var2.imag(var8);
         double var13 = var6 * (var2.imag(var8) - var1.imag(var8));
         double var15 = var6 * (var1.real(var8) - var2.real(var8));
         double var17 = 0.5 * (var1.real(var8) + var2.real(var8));
         double var19 = 0.5 * (var1.imag(var8) + var2.imag(var8));
         double var21 = var0.real(var8) - var17 + var13;
         double var23 = var0.imag(var8) + var15 - var19;
         double var25 = var0.real(var8) - var17 - var13;
         double var27 = var0.imag(var8) - var15 - var19;
         var0.real(var8, var9 * var4);
         var0.imag(var8, var11 * var4);
         var1.real(var8, var21 * var4);
         var1.imag(var8, var23 * var4);
         var2.real(var8, var25 * var4);
         var2.imag(var8, var27 * var4);
      }
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0,
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var1,
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
   ) {
      int var3 = var0.RIRORHHIHRCIHOIIOIOHHOOOIOIHCI / 3;
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, 0, var3);
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0, var3, var3 * 2
      );
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0, var3 * 2, var0.RIRORHHIHRCIHOIIOIOHHOOOIOIHCI
      );
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var5, var6, 1, 1.0);
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();

      for (int var8 = 0; var8 < var0.RIRORHHIHRCIHOIIOIOHHOOOIOIHCI / 4; var8++) {
         var7.CRRRICCRROCOHHOHIICIHORCOORRRH(var2, var8);
         var5.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var8, var7);
         var6.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var8, var7);
         var6.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var8, var7);
      }

      for (int var9 = var0.RIRORHHIHRCIHOIIOIOHHOOOIOIHCI / 4; var9 < var3; var9++) {
         var7.CRRRICCRROCOHHOHIICIHORCOORRRH(var2, var9 - var0.RIRORHHIHRCIHOIIOIOHHOOOIOIHCI / 4);
         var5.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var9, var7);
         var6.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var9, var7);
         var6.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var9, var7);
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var1);
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var1);
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var1);
   }

   static BigInteger RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0, int var1, int var2) {
      assert var2 <= 25 : var2 + " does not fit into an int with slack";
      int var3 = (int)Math.min(var0.RIRORHHIHRCIHOIIOIOHHOOOIOIHCI, 2147483648L / var2 + 1L);
      int var4 = (int)(8L * ((long)var3 * var2 + 31L) / 32L);
      byte[] var5 = new byte[var4];
      int var6 = 1 << var2;
      int var7 = var6 - 1;
      int var8 = 32 - var2;
      long var9 = 0L;
      int var11 = var5.length * 8;
      int var12 = var11 - var2;
      int var13 = 0;
      int var14 = Math.min(Math.max(0, var12 >> 3), var5.length - 4);

      for (int var15 = 0; var15 <= 1; var15++) {
         for (int var16 = 0; var16 < var3; var16++) {
            long var17 = Math.round(var0.part(var16, var15)) + var9;
            var9 = var17 >> var2;
            int var19 = Math.min(Math.max(0, var12 >> 3), var5.length - 4);
            int var21 = var13 >>> (var14 - var19 << 3);
            int var20 = var8 - var12 + (var19 << 3);
            var13 = (int)(var21 | (var17 & var7) << var20);
            OOROOCCIRCCRHOIOIORIHCHHOOCCOR.writeIntBE(var5, var19, var13);
            var14 = var19;
            var12 -= var2;
         }
      }

      return new BigInteger(var1, var5);
   }

   private static HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] HRCCICRHCOIHOHHOCCORCHRORCCCRR(int var0) {
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var1 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[var0 + 1];

      for (int var2 = var0; var2 >= 0; var2 -= 2) {
         if (var2 < 20) {
            if (RIOICCICCHOIIHIROHIROIHHHROOCR[var2] == null) {
               RIOICCICCHOIIHIROHIROIHHHROOCR[var2] = HRHOIICRCICCICRHHOCIOOHIHIORRO(1 << var2);
            }

            var1[var2] = RIOICCICCHOIIHIROHIROIHHHROOCR[var2];
         } else {
            var1[var2] = HRHOIICRCICCICRHHOCIOOHIHIORRO(1 << var2);
         }
      }

      return var1;
   }

   private static HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RHRHCCIHCOCHHOCOIOHRCHOIICRIOR(int var0) {
      if (var0 < 20) {
         if (RCIOORCCHOOIORCHRHCHORRCOCROIR[var0] == null) {
            RCIOORCCHOOIORCHRHCHORRCOCROIR[var0] = HRHOIICRCICCICRHHOCIOOHIHIORRO(3 << var0);
         }

         return RCIOORCCHOOIORCHRHCHORRCOCROIR[var0];
      } else {
         return HRHOIICRCICCICRHHOCIOOHIHIORRO(3 << var0);
      }
   }

   private static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var1
   ) {
      int var2 = var0.RIRORHHIHRCIHOIIOIOHHOOOIOIHCI;
      int var3 = 31 - Integer.numberOfLeadingZeros(var2);
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var10 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var11 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      int var12 = 1;
      if (var3 % 2 != 0) {
         for (byte var13 = 0; var13 < var2; var13 += 2) {
            var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var13 + 1, var6);
            var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var13, var4);
            var0.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var13, var6);
            var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var0, var13 + 1);
         }

         var12++;
      }

      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var23 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var14 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();

      while (var12 <= var3) {
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var15 = var1[var12 - 1];
         int var16 = 1 << var12 + 1;

         for (int var17 = 0; var17 < var2; var17 += var16) {
            for (int var18 = 0; var18 < var16 / 4; var18++) {
               var23.CRRRICCRROCOHHOHIICIHORCOORRRH(var15, var18);
               var23.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var14);
               int var19 = var17 + var18;
               int var20 = var17 + var18 + var16 / 4;
               int var21 = var17 + var18 + var16 / 2;
               int var22 = var17 + var18 + var16 * 3 / 4;
               var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var19, var4);
               var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var20, var23, var5);
               var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var21, var14, var6);
               var0.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var22, var23, var7);
               var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var8);
               var8.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6);
               var8.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7);
               var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5, var9);
               var9.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var6);
               var9.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var7);
               var4.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5, var10);
               var10.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6);
               var10.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var7);
               var4.CRRRICCRROCOHHOHIICIHORCOORRRH(var5, var11);
               var11.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var6);
               var11.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var7);
               var8.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var19);
               var9.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var20);
               var10.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var21);
               var11.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var22);
            }
         }

         var12 += 2;
      }

      for (int var24 = 0; var24 < var2; var24++) {
         var0.timesTwoToThe(var24, -var3);
      }
   }

   private static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0,
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var1,
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
   ) {
      int var3 = var0.RIRORHHIHRCIHOIIOIOHHOOOIOIHCI / 3;
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, 0, var3);
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0, var3, var3 * 2
      );
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0, var3 * 2, var0.RIRORHHIHRCIHOIIOIOHHOOOIOIHCI
      );
      IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4, var1);
      IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5, var1);
      IRCIIHHICIHRCOCRROCOICRIHHCCHH(var6, var1);
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();

      for (int var8 = 0; var8 < var0.RIRORHHIHRCIHOIIOIOHHOOOIOIHCI / 4; var8++) {
         var7.CRRRICCRROCOHHOHIICIHORCOORRRH(var2, var8);
         var5.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var8, var7);
         var6.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var8, var7);
         var6.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var8, var7);
      }

      for (int var9 = var0.RIRORHHIHRCIHOIIOIOHHOOOIOIHCI / 4; var9 < var3; var9++) {
         var7.CRRRICCRROCOHHOHIICIHORCOORRRH(var2, var9 - var0.RIRORHHIHRCIHOIIOIOHHOOOIOIHCI / 4);
         var5.CRRRICCRROCOHHOHIICIHORCOORRRH(var9, var7);
         var6.CRRRICCRROCOHHOHIICIHORCOORRRH(var9, var7);
         var6.CRRRICCRROCOHHOHIICIHORCOORRRH(var9, var7);
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var5, var6, -1, 0.3333333333333333);
   }

   static BigInteger multiply(BigInteger var0, BigInteger var1) {
      if (var1.signum() == 0 || var0.signum() == 0) {
         return BigInteger.ZERO;
      } else if (var1 == var0) {
         return square(var1);
      } else {
         int var2 = var0.bitLength();
         int var3 = var1.bitLength();
         if ((long)var2 + var3 > 2147483648L) {
            throw new ArithmeticException("BigInteger would overflow supported range");
         } else {
            return var2 <= 1920 || var3 <= 1920 || var2 <= 33220 && var3 <= 33220 ? var0.multiply(var1) : multiplyFft(var0, var1);
         }
      }
   }

   static BigInteger multiplyFft(BigInteger var0, BigInteger var1) {
      int var2 = var0.signum() * var1.signum();
      byte[] var3 = (var0.signum() < 0 ? var0.negate() : var0).toByteArray();
      byte[] var4 = (var1.signum() < 0 ? var1.negate() : var1).toByteArray();
      int var5 = Math.max(var3.length, var4.length) * 8;
      int var6 = bitsPerFftPoint(var5);
      int var7 = (var5 + var6 - 1) / var6 + 1;
      int var8 = 32 - Integer.numberOfLeadingZeros(var7 - 1);
      int var9 = 1 << var8;
      int var10 = var9 * 3 / 4;
      if (var7 < var10 && var8 > 3) {
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var16 = HRCCICRHCOIHOHHOCCORCHRORCCCRR(var8 - 2);
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var17 = RHRHCCIHCOCHHOCOIOHRCHOIICRIOR(var8 - 2);
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var18 = RHRHCCIHCOCHHOCOIOHRCHOIICRIOR(var8 - 4);
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var14 = CCIHHRIOOOOCOHRCIHOHROOICIORCC(var3, var10, var6);
         var14.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var17);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var14, var16, var18);
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var15 = CCIHHRIOOOOCOHRCIHOHROOICIORCC(var4, var10, var6);
         var15.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var17);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var15, var16, var18);
         var14.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var15);
         IRCIIHHICIHRCOCRROCOICRIHHCCHH(var14, var16, var18);
         var14.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var17);
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var14, var2, var6);
      } else {
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var11 = HRCCICRHCOIHOHHOCCORCHRORCCCRR(var8);
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var12 = CCIHHRIOOOOCOHRCIHOHROOICIORCC(var3, var9, var6);
         var12.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var11[var8]);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12, var11);
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var13 = CCIHHRIOOOOCOHRCIHOHROOICIORCC(var4, var9, var6);
         var13.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var11[var8]);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var13, var11);
         var12.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var13);
         IRCIIHHICIHRCOCRROCOICRIHHCCHH(var12, var11);
         var12.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var11[var8]);
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12, var2, var6);
      }
   }

   static BigInteger square(BigInteger var0) {
      if (var0.signum() == 0) {
         return BigInteger.ZERO;
      } else {
         return var0.bitLength() < 33220 ? var0.multiply(var0) : squareFft(var0);
      }
   }

   static BigInteger squareFft(BigInteger var0) {
      byte[] var1 = var0.toByteArray();
      int var2 = var1.length * 8;
      int var3 = bitsPerFftPoint(var2);
      int var4 = (var2 + var3 - 1) / var3 + 1;
      int var5 = 32 - Integer.numberOfLeadingZeros(var4 - 1);
      int var6 = 1 << var5;
      int var7 = var6 * 3 / 4;
      if (var4 < var7) {
         var4 = var7;
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var14 = CCIHHRIOOOOCOHRCIHOHROOICIORCC(var1, var4, var3);
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var15 = HRCCICRHCOIHOHHOCCORCHRORCCCRR(var5 - 2);
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var10 = RHRHCCIHCOCHHOCOIOHRCHOIICRIOR(var5 - 2);
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = RHRHCCIHCOCHHOCOIOHRCHOIICRIOR(var5 - 4);
         var14.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var10);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var14, var15, var11);
         var14.squarePointwise();
         IRCIIHHICIHRCOCRROCOICRIHHCCHH(var14, var15, var11);
         var14.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10);
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var14, 1, var3);
      } else {
         var4 = var6;
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = CCIHHRIOOOOCOHRCIHOHROOICIORCC(var1, var4, var3);
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var9 = HRCCICRHCOIHOHHOCCORCHRORCCCRR(var5);
         var8.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var9[var5]);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var9);
         var8.squarePointwise();
         IRCIIHHICIHRCOCRROCOICRIHHCCHH(var8, var9);
         var8.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9[var5]);
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, 1, var3);
      }
   }

   static HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CCIHHRIOOOOCOHRCIHOHROOICIORCC(byte[] var0, int var1, int var2) {
      assert var2 <= 25 : var2 + " does not fit into an int with slack";
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      if (var0.length < 4) {
         byte[] var4 = new byte[4];
         System.arraycopy(var0, 0, var4, 4 - var0.length, var0.length);
         var0 = var4;
      }

      int var15 = 1 << var2;
      int var5 = var15 / 2;
      int var6 = var15 - 1;
      int var7 = 32 - var2;
      int var8 = var0.length * 8;
      int var9 = 0;
      int var10 = 0;

      for (int var11 = var8 - var2; var11 > -var2; var11 -= var2) {
         int var12 = Math.min(Math.max(0, var11 >> 3), var0.length - 4);
         int var13 = var7 - var11 + (var12 << 3);
         int var14 = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.readIntBE(var0, var12) >>> var13 & var6;
         var14 += var9;
         var9 = var5 - var14 >>> 31;
         var14 -= var15 & -var9;
         var3.real(var10, var14);
         var10++;
      }

      if (var9 > 0) {
         var3.real(var10, var9);
      }

      return var3;
   }

   static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      double real;
      double imag;

      void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
         this.real = this.real + var1.real;
         this.imag = this.imag + var1.imag;
      }

      void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, int var2) {
         this.real = this.real + var1.real(var2);
         this.imag = this.imag + var1.imag(var2);
      }

      void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
      ) {
         var2.real = this.real + var1.real;
         var2.imag = this.imag + var1.imag;
      }

      void IRCIIHHICIHRCOCRROCOICRIHHCCHH(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
         this.real = this.real - var1.imag;
         this.imag = this.imag + var1.real;
      }

      void IRCIIHHICIHRCOCRROCOICRIHHCCHH(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, int var2) {
         this.real = this.real - var1.imag(var2);
         this.imag = this.imag + var1.real(var2);
      }

      void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
      ) {
         var2.real = this.real - var1.imag;
         var2.imag = this.imag + var1.real;
      }

      void HHCCIRHCCCIIRHCROHIORHIRHHIORH(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, int var2) {
         var1.real(var2, this.real);
         var1.imag(var2, this.imag);
      }

      void HHCCIRHCCCIIRHCROHIORHIRHHIORH(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
         double var2 = this.real;
         this.real = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(var2, var1.real, -this.imag * var1.imag);
         this.imag = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(var2, var1.imag, this.imag * var1.real);
      }

      void CRRRICCRROCOHHOHIICIHORCOORRRH(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
         double var2 = this.real;
         this.real = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(var2, var1.real, this.imag * var1.imag);
         this.imag = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(-var2, var1.imag, this.imag * var1.real);
      }

      void CRRRICCRROCOHHOHIICIHORCOORRRH(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, int var2) {
         this.real = var1.real(var2);
         this.imag = var1.imag(var2);
      }

      void RRCRRCORICCHOHHIRCHIROOHIIOHCO(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
         var1.real = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(this.real, this.real, -this.imag * this.imag);
         var1.imag = 2.0 * this.real * this.imag;
      }

      void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
         this.real = this.real - var1.real;
         this.imag = this.imag - var1.imag;
      }

      void RRCRRCORICCHOHHIRCHIROOHIIOHCO(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, int var2) {
         this.real = this.real - var1.real(var2);
         this.imag = this.imag - var1.imag(var2);
      }

      void HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
      ) {
         var2.real = this.real - var1.real;
         var2.imag = this.imag - var1.imag;
      }

      void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2, int var3
      ) {
         var2.real(var3, this.real - var1.real);
         var2.imag(var3, this.imag - var1.imag);
      }

      void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
         this.real = this.real + var1.imag;
         this.imag = this.imag - var1.real;
      }

      void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, int var2) {
         this.real = this.real + var1.imag(var2);
         this.imag = this.imag - var1.real(var2);
      }

      void CRRRICCRROCOHHOHIICIHORCOORRRH(
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
      ) {
         var2.real = this.real + var1.imag;
         var2.imag = this.imag - var1.real;
      }
   }

   static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private static final int OHCCIOHOHCIRIRCOHOIROHRRICOICO = 1;
      private static final int CRCOCIRICOROIIHOOOHCROHRIIHRRO = 1;
      private static final int CIHHRIHOHOORIROCOCCRROCIOCHIOR = 0;
      private final double[] CHOOOOHIRCHCHCCOCCRICRROHICORC;
      private final int RIRORHHIHRCIHOIIOIOHHOOOIOIHCI;
      private final int HOIRCICORCHIRIORCRCRHRCRRCIROH;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1) {
         this.CHOOOOHIRCHCHCCOCCRICRROHICORC = new double[var1 << 1];
         this.RIRORHHIHRCIHOIIOIOHHOOOIOIHCI = var1;
         this.HOIRCICORCHIRIORCRCRHRCRRCIROH = 0;
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, int var2, int var3) {
         this.RIRORHHIHRCIHOIIOIOHHOOOIOIHCI = var3 - var2;
         this.CHOOOOHIRCHCHCCOCCRICRROHICORC = var1.CHOOOOHIRCHCHCCOCCRICRROHICORC;
         this.HOIRCICORCHIRIORCRCRHRCRRCIROH = var2 << 1;
      }

      void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
         this.CHOOOOHIRCHCHCCOCCRICRROHICORC[this.realIdx(var1)] += var2.real;
         this.CHOOOOHIRCHCHCCOCCRICRROHICORC[this.imagIdx(var1)] += var2.imag;
      }

      void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         int var1,
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
         int var3,
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4
      ) {
         var4.real = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[this.realIdx(var1)] + var2.real(var3);
         var4.imag = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[this.imagIdx(var1)] + var2.imag(var3);
      }

      void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         int var1,
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
         int var3,
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4
      ) {
         var4.real = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[this.realIdx(var1)] - var2.imag(var3);
         var4.imag = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[this.imagIdx(var1)] + var2.real(var3);
      }

      void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
         int var2 = this.HOIRCICORCHIRIORCRCRHRCRRCIROH;
         int var3 = var1.HOIRCICORCHIRIORCRCRHRCRRCIROH;
         double[] var4 = var1.CHOOOOHIRCHCHCCOCCRICRROHICORC;

         for (int var5 = 0; var5 < this.RIRORHHIHRCIHOIIOIOHHOOOIOIHCI; var5++) {
            double var6 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var2 + 0];
            double var8 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var2 + 1];
            this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var2] = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(var6, var4[var3 + 0], var8 * var4[var3 + 1]);
            this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var2 + 1] = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(-var6, var4[var3 + 1], var8 * var4[var3 + 0]);
            var2 += 2;
            var3 += 2;
         }
      }

      void IRCIIHHICIHRCOCRROCOICRIHHCCHH(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
         int var2 = var1.HOIRCICORCHIRIORCRCRHRCRRCIROH;
         double[] var3 = var1.CHOOOOHIRCHCHCCOCCRICRROHICORC;
         int var4 = this.HOIRCICORCHIRIORCRCRHRCRRCIROH + this.RIRORHHIHRCIHOIIOIOHHOOOIOIHCI << 1;

         for (int var5 = this.HOIRCICORCHIRIORCRCRHRCRRCIROH; var5 < var4; var5 += 2) {
            double var6 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var5 + 0];
            this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var5 + 0] = var6 * var3[var2 + 0];
            this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var5 + 1] = var6 * var3[var2 + 1];
            var2 += 2;
         }
      }

      void IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
         var2.real = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[this.realIdx(var1)];
         var2.imag = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[this.imagIdx(var1)];
      }

      double imag(int var1) {
         return this.CHOOOOHIRCHCHCCOCCRICRROHICORC[(var1 << 1) + this.HOIRCICORCHIRIORCRCRHRCRRCIROH + 1];
      }

      void imag(int var1, double var2) {
         this.CHOOOOHIRCHCHCCOCCRICRROHICORC[(var1 << 1) + this.HOIRCICORCHIRIORCRCRHRCRRCIROH + 1] = var2;
      }

      private int imagIdx(int var1) {
         return (var1 << 1) + this.HOIRCICORCHIRIORCRCRHRCRRCIROH + 1;
      }

      void HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
         int var3 = this.realIdx(var1);
         int var4 = this.imagIdx(var1);
         double var5 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var3];
         double var7 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var4];
         this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var3] = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(var5, var2.real, -var7 * var2.imag);
         this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var4] = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(var5, var2.imag, var7 * var2.real);
      }

      void CRRRICCRROCOHHOHIICIHORCOORRRH(int var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
         int var3 = this.realIdx(var1);
         int var4 = this.imagIdx(var1);
         double var5 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var3];
         double var7 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var4];
         this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var3] = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(-var5, var2.imag, -var7 * var2.real);
         this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var4] = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(var5, var2.real, -var7 * var2.imag);
      }

      void RRCRRCORICCHOHHIRCHIROOHIIOHCO(int var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
         int var3 = this.realIdx(var1);
         int var4 = this.imagIdx(var1);
         double var5 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var3];
         double var7 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var4];
         this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var3] = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(var5, var2.real, var7 * var2.imag);
         this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var4] = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(-var5, var2.imag, var7 * var2.real);
      }

      void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         int var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3
      ) {
         double var4 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[this.realIdx(var1)];
         double var6 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[this.imagIdx(var1)];
         var3.real = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(var4, var2.real, var6 * var2.imag);
         var3.imag = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(-var4, var2.imag, var6 * var2.real);
      }

      void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(int var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
         int var3 = this.realIdx(var1);
         int var4 = this.imagIdx(var1);
         double var5 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var3];
         double var7 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var4];
         this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var3] = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(-var5, var2.imag, var7 * var2.real);
         this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var4] = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(-var5, var2.real, -var7 * var2.imag);
      }

      void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         int var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3
      ) {
         double var4 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[this.realIdx(var1)];
         double var6 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[this.imagIdx(var1)];
         var3.real = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(var4, var2.real, -var6 * var2.imag);
         var3.imag = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(var4, var2.imag, var6 * var2.real);
      }

      void HHCCIRHCCCIIRHCROHIORHIRHHIORH(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
         int var2 = var1.HOIRCICORCHIRIORCRCRHRCRRCIROH;
         double[] var3 = var1.CHOOOOHIRCHCHCCOCCRICRROHICORC;
         int var4 = this.HOIRCICORCHIRIORCRCRHRCRRCIROH + this.RIRORHHIHRCIHOIIOIOHHOOOIOIHCI << 1;

         for (int var5 = this.HOIRCICORCHIRIORCRCRHRCRRCIROH; var5 < var4; var5 += 2) {
            double var6 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var5 + 0];
            double var8 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var5 + 1];
            double var10 = var3[var2 + 0];
            double var12 = var3[var2 + 1];
            this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var5 + 0] = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(var6, var10, -var8 * var12);
            this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var5 + 1] = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(var6, var12, var8 * var10);
            var2 += 2;
         }
      }

      double part(int var1, int var2) {
         return this.CHOOOOHIRCHCHCCOCCRICRROHICORC[(var1 << 1) + var2];
      }

      double real(int var1) {
         return this.CHOOOOHIRCHCHCCOCCRICRROHICORC[(var1 << 1) + this.HOIRCICORCHIRIORCRCRHRCRRCIROH];
      }

      void real(int var1, double var2) {
         this.CHOOOOHIRCHCHCCOCCRICRROHICORC[(var1 << 1) + this.HOIRCICORCHIRIORCRCRHRCRRCIROH] = var2;
      }

      private int realIdx(int var1) {
         return (var1 << 1) + this.HOIRCICORCHIRIORCRCRHRCRRCIROH;
      }

      void set(int var1, double var2, double var4) {
         int var6 = this.realIdx(var1);
         this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var6] = var2;
         this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var6 + 1] = var4;
      }

      void squarePointwise() {
         int var1 = this.HOIRCICORCHIRIORCRCRHRCRRCIROH + this.RIRORHHIHRCIHOIIOIOHHOOOIOIHCI << 1;

         for (int var2 = this.HOIRCICORCHIRIORCRCRHRCRRCIROH; var2 < var1; var2 += 2) {
            double var3 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var2 + 0];
            double var5 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var2 + 1];
            this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var2 + 0] = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.fma(var3, var3, -var5 * var5);
            this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var2 + 1] = 2.0 * var3 * var5;
         }
      }

      void HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         int var1,
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
         int var3,
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4
      ) {
         var4.real = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[this.realIdx(var1)] - var2.real(var3);
         var4.imag = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[this.imagIdx(var1)] - var2.imag(var3);
      }

      void CRRRICCRROCOHHOHIICIHORCOORRRH(
         int var1,
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
         int var3,
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4
      ) {
         var4.real = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[this.realIdx(var1)] + var2.imag(var3);
         var4.imag = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[this.imagIdx(var1)] - var2.real(var3);
      }

      void timesTwoToThe(int var1, int var2) {
         int var3 = this.realIdx(var1);
         int var4 = this.imagIdx(var1);
         double var5 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var3];
         double var7 = this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var4];
         this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var3] = Math.scalb(var5, var2);
         this.CHOOOOHIRCHCHCCOCCRICRROHICORC[var4] = Math.scalb(var7, var2);
      }
   }
}
