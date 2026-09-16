package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

public final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   static final int CHCOIIHHROCCHOHCRROROCCROCCHRI = 53;
   private static final int RHIHOIIICICRRROHORHOIHHOOOIHRR = 11;
   static final int OCHHOCHOOHOIHHHRROHRICIIHIIHOC = -1074;
   static final int OHOHHIOICHRCHHHHOIRIOCRRHHOIRH = 971;
   static final int CHICIRIIRICCCCORIIIOHRIHIIHOCH = -323;
   static final int CROROOHCHCCIICRRCHCIHRIOHCIORH = 309;
   static final long CCRORCIOCOIORHOHCRCCOIRHHHCHHI = 3L;
   static final int ICIORHOICHIRICHRRIHIIIRCCCIOII = -324;
   static final int HORHOCOIOROHRHICCOCRRICIHRRCRH = 292;
   static final int CCOROIRORRHHHIRRORHOOCOOOOHIIC = 17;
   private static final long CIOIIRIRHIHCHOHCIHHHCHRHRCICHO = 4503599627370496L;
   private static final int RCRIRHHCCCICIRRHIHORRHIRRROCOR = 2047;
   private static final long IHOROHORCHRRRRHCOHIHHICHOIHCIR = 4503599627370495L;
   private static final long HOOIRRHRRROCOHIIOHRHOHRRROHCHI = Long.MAX_VALUE;
   private static final int CHOHCOIRHOIOHHIOIRCICIIORICICO = 268435455;
   private static final int OOCCIOCRICCIIRIRHIRROIOORCIIRR = 0;
   private static final int RCORIRICORCIRORRIOHCCCOOOHICRC = 1;
   private static final int OCRRROICCCORORORORHOOOCRHCIIHO = 2;
   private static final int HIICCCOHHRIOIRIOCICRCHCRIICRCH = 3;
   private static final int IIIRIHHHORHHIOCHHIICIOICHOIOOR = 4;
   private static final int OROOOOHOCHIRCRHCOIRIICRCCCRCIO = 5;
   public final int ORIRHIHIIHCOHRHICHIROCOIHOOCHO = 24;
   private final byte[] IIOORCHRIHHCCOIHROCOHHRHROIORI = new byte[24];
   private int index;

   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
   }

   public static String CIHCOICOOICHOCCHICIHRCOCIHRIOC(double var0) {
      return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH().HOIIRIHOHCRIHOOHRCRCRCRRHIHRCO(var0);
   }

   private String HOIIRIHOHCRIHOOHRCRCRCRRHIHRCO(double var1) {
      switch (this.CCHHRHRHCRHIHIHRIOICROHCHIIIHI(var1)) {
         case 0:
            return this.RRIIHROCRRRCIRCIOCHICRRRCHCHOO();
         case 1:
            return "0.0";
         case 2:
            return "-0.0";
         case 3:
            return "Infinity";
         case 4:
            return "-Infinity";
         default:
            return "NaN";
      }
   }

   private int CCHHRHRHCRHIHIHRIOICROHCHIIIHI(double var1) {
      long var3 = Double.doubleToRawLongBits(var1);
      long var5 = var3 & 4503599627370495L;
      int var7 = (int)(var3 >>> 52) & 2047;
      if (var7 < 2047) {
         this.index = -1;
         if (var3 < 0L) {
            this.RIRRCRCICIHOHCOCRICHIROHRRHIRO(45);
         }

         if (var7 != 0) {
            int var8 = 1075 - var7;
            long var9 = 4503599627370496L | var5;
            if (0 < var8 & var8 < 53) {
               long var11 = var9 >> var8;
               if (var11 << var8 == var9) {
                  return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var11, 0);
               }
            }

            return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(-var8, var9, 0);
         } else if (var5 != 0L) {
            return var5 < 3L ? this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(-1074, 10L * var5, -1) : this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(-1074, var5, 0);
         } else {
            return var3 == 0L ? 1 : 2;
         }
      } else if (var5 != 0L) {
         return 5;
      } else {
         return var3 > 0L ? 3 : 4;
      }
   }

   private int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, long var2, int var4) {
      int var5 = (int)var2 & 1;
      long var6 = var2 << 2;
      long var8 = var6 + 2L;
      long var10;
      int var12;
      if (var2 != 4503599627370496L | var1 == -1074) {
         var10 = var6 - 2L;
         var12 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICRRIHOIRCIOIRRRCHCRORCIHHICRI(var1);
      } else {
         var10 = var6 - 1L;
         var12 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(var1);
      }

      int var13 = var1 + HHCCIRHCCCIIRHCROHIORHIRHHIORH.CHOCHCOCIIICCORORHHOCRIIIHOHHR(-var12) + 2;
      long var14 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCCCICRRHRHRCCCOIIOOHRRCHOORIC(var12);
      long var16 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHIOHICOCHRCICHHRRRIORCOOHIROR(var12);
      long var18 = CRRRICCRROCOHHOHIICIHORCOORRRH(var14, var16, var6 << var13);
      long var20 = CRRRICCRROCOHHOHIICIHORCOORRRH(var14, var16, var10 << var13);
      long var22 = CRRRICCRROCOHHOHIICIHORCOORRRH(var14, var16, var8 << var13);
      long var24 = var18 >> 2;
      if (var24 >= 100L) {
         long var26 = 10L * HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIROICHCRROROHCCROOCCCCOCHCCRI(var24, 1844674407370955168L);
         long var28 = var26 + 10L;
         boolean var30 = var20 + var5 <= var26 << 2;
         boolean var31 = (var28 << 2) + var5 <= var22;
         if (var30 != var31) {
            return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var30 ? var26 : var28, var12);
         }
      }

      long var32 = var24 + 1L;
      boolean var33 = var20 + var5 <= var24 << 2;
      boolean var29 = (var32 << 2) + var5 <= var22;
      if (var33 != var29) {
         return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var33 ? var24 : var32, var12 + var4);
      }

      long var34 = var18 - (var24 + var32 << 1);
      return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var34 >= 0L && (var34 != 0L || (var24 & 1L) != 0L) ? var32 : var24, var12 + var4);
   }

   private static long CRRRICCRROCOHHOHIICIHORCOORRRH(long var0, long var2, long var4) {
      long var6 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIROICHCRROROHCCROOCCCCOCHCCRI(var2, var4);
      long var8 = var0 * var4;
      long var10 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIROICHCRROROHCCROOCCCCOCHCCRI(var0, var4);
      long var12 = (var8 >>> 1) + var6;
      long var14 = var10 + (var12 >>> 63);
      return var14 | (var12 & Long.MAX_VALUE) + Long.MAX_VALUE >>> 63;
   }

   private int RRCRRCORICCHOHHIRCHIROOHIIOHCO(long var1, int var3) {
      int var4 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICRRIHOIRCIOIRRRCHCRORCIHHICRI(64 - Long.numberOfLeadingZeros(var1));
      if (var1 >= HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOIROOOCOCCCCCRIRIHHCIROOIRHI(var4)) {
         var4++;
      }

      var1 *= HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOIROOOCOCCCCCRIRIHHCIROOIRHI(17 - var4);
      var3 += var4;
      long var5 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIROICHCRROROHCCROOCCCCOCHCCRI(var1, 193428131138340668L) >>> 20;
      int var7 = (int)(var1 - 100000000L * var5);
      int var8 = (int)(var5 * 1441151881L >>> 57);
      int var9 = (int)(var5 - 100000000 * var8);
      if (0 < var3 && var3 <= 7) {
         return this.RCIROOOOICRHCCRRCIORHHIRCOIIIC(var8, var9, var7, var3);
      } else {
         return -3 < var3 && var3 <= 0
            ? this.OOCCRCRCOHIIORCCORCRCIRRROIOOR(var8, var9, var7, var3)
            : this.OHIIIOHIRIRCCRRIOIICCHHIORRHOH(var8, var9, var7, var3);
      }
   }

   private int RCIROOOOICRHCCRRCIORHHIRCOIIIC(int var1, int var2, int var3, int var4) {
      this.ICHOCHHROIHCROICCIRIHHCHRHROCO(var1);
      int var5 = this.RRHCOCRHRORRORRCRICOOCCCCHCOIR(var2);

      int var7;
      for (var7 = 1; var7 < var4; var7++) {
         int var6 = 10 * var5;
         this.ICHOCHHROIHCROICCIRIHHCHRHROCO(var6 >>> 28);
         var5 = var6 & 268435455;
      }

      this.RIRRCRCICIHOHCOCRICHIROHRRHIRO(46);

      while (var7 <= 8) {
         int var8 = 10 * var5;
         this.ICHOCHHROIHCROICCIRIHHCHRHROCO(var8 >>> 28);
         var5 = var8 & 268435455;
         var7++;
      }

      this.OHOCOOCOORHRROCRIRIHIHRHOCIORH(var3);
      return 0;
   }

   private int OOCCRCRCOHIIORCCORCRCIRRROIOOR(int var1, int var2, int var3, int var4) {
      this.ICHOCHHROIHCROICCIRIHHCHRHROCO(0);
      this.RIRRCRCICIHOHCOCRICHIROHRRHIRO(46);

      while (var4 < 0) {
         this.ICHOCHHROIHCROICCIRIHHCHRHROCO(0);
         var4++;
      }

      this.ICHOCHHROIHCROICCIRIHHCHRHROCO(var1);
      this.CIROICOIHHHHOHOIHOCIHRORHRCORH(var2);
      this.OHOCOOCOORHRROCRIRIHIHRHOCIORH(var3);
      return 0;
   }

   private int OHIIIOHIRIRCCRRIOIICCHHIORRHOH(int var1, int var2, int var3, int var4) {
      this.ICHOCHHROIHCROICCIRIHHCHRHROCO(var1);
      this.RIRRCRCICIHOHCOCRICHIROHRRHIRO(46);
      this.CIROICOIHHHHOHOIHOCIHRORHRCORH(var2);
      this.OHOCOOCOORHRROCRIRIHIHRHOCIORH(var3);
      this.HOOIORHIHOIHOIIOORHROICRCOHCOH(var4 - 1);
      return 0;
   }

   private void OHOCOOCOORHRROCRIRIHIHRHOCIORH(int var1) {
      if (var1 != 0) {
         this.CIROICOIHHHHOHOIHOCIHRORHRCORH(var1);
      }

      this.HRHICHOHCIRHRIIRRRRRHOHCORHRRR();
   }

   private void CIROICOIHHHHOHOIHOCIHRORHRCORH(int var1) {
      int var2 = this.RRHCOCRHRORRORRCRICOOCCCCHCOIR(var1);

      for (int var3 = 0; var3 < 8; var3++) {
         int var4 = 10 * var2;
         this.ICHOCHHROIHCROICCIRIHHCHRHROCO(var4 >>> 28);
         var2 = var4 & 268435455;
      }
   }

   private void HRHICHOHCIRHRIIRRRRRHOHCORHRRR() {
      while (this.IIOORCHRIHHCCOIHROCOHHRHROIORI[this.index] == 48) {
         this.index--;
      }

      if (this.IIOORCHRIHHCCOIHROCOHHRHROIORI[this.index] == 46) {
         this.index++;
      }
   }

   private int RRHCOCRHRORRORRCRICOOCCCCHCOIR(int var1) {
      return (int)(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIROICHCRROROHCCROOCCCCOCHCCRI((long)(var1 + 1) << 28, 193428131138340668L) >>> 20) - 1;
   }

   private void HOOIORHIHOIHOIIOORHROICRCOHCOH(int var1) {
      this.RIRRCRCICIHOHCOCRICHIROHRRHIRO(69);
      if (var1 < 0) {
         this.RIRRCRCICIHOHCOCRICHIROHRRHIRO(45);
         var1 = -var1;
      }

      if (var1 < 10) {
         this.ICHOCHHROIHCROICCIRIHHCHRHROCO(var1);
      } else {
         if (var1 >= 100) {
            int var2 = var1 * 1311 >>> 17;
            this.ICHOCHHROIHCROICCIRIHHCHRHROCO(var2);
            var1 -= 100 * var2;
         }

         int var3 = var1 * 103 >>> 10;
         this.ICHOCHHROIHCROICCIRIHHCHRHROCO(var3);
         this.ICHOCHHROIHCROICCIRIHHCHRHROCO(var1 - 10 * var3);
      }
   }

   private void RIRRCRCICIHOHCOCRICHIROHRRHIRO(int var1) {
      this.IIOORCHRIHHCCOIHROCOHHRHROIORI[++this.index] = (byte)var1;
   }

   private void ICHOCHHROIHCROICCIRIHHCHRHROCO(int var1) {
      this.IIOORCHRIHHCCOIHROCOHHRHROIORI[++this.index] = (byte)(48 + var1);
   }

   private String RRIIHROCRRRCIRCIOCHICRRRCHCHOO() {
      return new String(this.IIOORCHRIHHCCOIHROCOHHRHROIORI, 0, 0, this.index + 1);
   }
}
