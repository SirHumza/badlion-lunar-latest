package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

public final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   static final int HICIHCHCHICIHHOCIORHRCHCRCOCRI = 24;
   private static final int RRIOHHOCCCCCIORHICCOHRCCCICHRC = 8;
   static final int OICRRCHOCHHOHOOICOHHOCHIHRRHHI = -149;
   static final int HROCCCICIIIICCCRICOOHRIHHRRICC = 104;
   static final int HHRCHIOOIRHOOOCCIORROOCICHOCIO = -44;
   static final int OROCIOOHICIOOIHOOROHRIIHRRCOIC = 39;
   static final int CRCOHCIOHRHRHCRHICCCRHOOIOCCRH = 8;
   static final int IICCOCIIRICCOIOCRCHICHHCHHRRIC = -45;
   static final int IRHCCOOHIHRICRIHCHCRRROCCIOOCI = 31;
   static final int RHICRRRCHHHRICIOHIOCOCIHRROCCR = 9;
   private static final int CHCCHRCIRCIRIHORCCCCCOHOHOIIOO = 8388608;
   private static final int ICIRHCRRCIIOHOIHCOOIIHROROOOOI = 255;
   private static final int COICICCOCIOICOIIHCIHRORCOROOHR = 8388607;
   private static final long ROOOCIOOIRCIHICHRHICCOOORHCOCR = 4294967295L;
   private static final int RRCICHORICRIHCHHOOCRIIHOOROHOO = 268435455;
   private static final int ICRIHIRIOCRRIRIOOHCHOOCHHOHHCR = 0;
   private static final int ORHOOORHIORRCHORHICHHCCIHRCCOO = 1;
   private static final int OHCRRCOHCICCHRRCOOHRIOCCHIRHIC = 2;
   private static final int IORHRORRCICCOHCOOCIRHHIHCHIHIR = 3;
   private static final int CRHHOHHCIROCIRHORIORHOCICRIOHH = 4;
   private static final int HIHRCRCCORIORIRHCCHROHIHICOHCC = 5;
   public final int HIIIRHRCHHRHORIHORCRCIHOROCOCI = 15;
   private final byte[] IIRIHOICCHROOIIRRRCRCOIIIIICHC = new byte[15];
   private int index;

   private IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
   }

   public static String IICRCOCCHCORCRHHHOIHROCHIROIHH(float var0) {
      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH().CRICCIRRRCIICCHOOIORCHIHIIROHO(var0);
   }

   private String CRICCIRRRCIICCHOOIORCHIHIIROHO(float var1) {
      switch (this.COCOHIHCICRHOOCHIHCCORHHIRHIOH(var1)) {
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

   private int COCOHIHCICRHOOCHIHCCORHHIRHIOH(float var1) {
      int var2 = Float.floatToRawIntBits(var1);
      int var3 = var2 & 8388607;
      int var4 = var2 >>> 23 & 0xFF;
      if (var4 < 255) {
         this.index = -1;
         if (var2 < 0) {
            this.RIRRCRCICIHOHCOCRICHIROHRRHIRO(45);
         }

         if (var4 != 0) {
            int var5 = 150 - var4;
            int var6 = 8388608 | var3;
            if (0 < var5 & var5 < 24) {
               int var7 = var6 >> var5;
               if (var7 << var5 == var6) {
                  return this.RRCRRIIRHHRCCICHOCOIHROROCICHC(var7, 0);
               }
            }

            return this.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(-var5, var6, 0);
         } else if (var3 != 0) {
            return var3 < 8 ? this.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(-149, 10 * var3, -1) : this.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(-149, var3, 0);
         } else {
            return var2 == 0 ? 1 : 2;
         }
      } else if (var3 != 0) {
         return 5;
      } else {
         return var2 > 0 ? 3 : 4;
      }
   }

   private int COIHORRCHRRCHOCIRHHRRIOIHRIHCC(int var1, int var2, int var3) {
      int var4 = var2 & 1;
      long var5 = var2 << 2;
      long var7 = var5 + 2L;
      long var9;
      int var11;
      if (var2 != 8388608 | var1 == -149) {
         var9 = var5 - 2L;
         var11 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICRRIHOIRCIOIRRRCHCRORCIHHICRI(var1);
      } else {
         var9 = var5 - 1L;
         var11 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(var1);
      }

      int var12 = var1 + HHCCIRHCCCIIRHCROHIORHIRHHIORH.CHOCHCOCIIICCORORHHOCRIIIHOHHR(-var11) + 33;
      long var13 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCCCICRRHRHRCCCOIIOOHRRCHOORIC(var11) + 1L;
      int var15 = HICRRICCHCCROOHHCHOCOCCHOIHHOC(var13, var5 << var12);
      int var16 = HICRRICCHCCROOHHCHOCOCCHOIHHOC(var13, var9 << var12);
      int var17 = HICRRICCHCCROOHHCHOCOCCHOIHHOC(var13, var7 << var12);
      int var18 = var15 >> 2;
      if (var18 >= 100) {
         int var19 = 10 * (int)(var18 * 1717986919L >>> 34);
         int var20 = var19 + 10;
         boolean var21 = var16 + var4 <= var19 << 2;
         boolean var22 = (var20 << 2) + var4 <= var17;
         if (var21 != var22) {
            return this.RRCRRIIRHHRCCICHOCOIHROROCICHC(var21 ? var19 : var20, var11);
         }
      }

      int var23 = var18 + 1;
      boolean var24 = var16 + var4 <= var18 << 2;
      boolean var25 = (var23 << 2) + var4 <= var17;
      if (var24 != var25) {
         return this.RRCRRIIRHHRCCICHOCOIHROROCICHC(var24 ? var18 : var23, var11 + var3);
      }

      int var26 = var15 - (var18 + var23 << 1);
      return this.RRCRRIIRHHRCCICHOCOIHROROCICHC(var26 >= 0 && (var26 != 0 || (var18 & 1) != 0) ? var23 : var18, var11 + var3);
   }

   private static int HICRRICCHCCROOHHCHOCOCCHOIHHOC(long var0, long var2) {
      long var4 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIROICHCRROROHCCROOCCCCOCHCCRI(var0, var2);
      long var6 = var4 >>> 31;
      return (int)(var6 | (var4 & 4294967295L) + 4294967295L >>> 32);
   }

   private int RRCRRIIRHHRCCICHOCOIHROROCICHC(int var1, int var2) {
      int var3 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICRRIHOIRCIOIRRRCHCRORCIHHICRI(32 - Integer.numberOfLeadingZeros(var1));
      if (var1 >= HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOIROOOCOCCCCCRIRIHHCIROOIRHI(var3)) {
         var3++;
      }

      var1 = (int)(var1 * HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOIROOOCOCCCCCRIRIHHCIROOIRHI(9 - var3));
      var2 += var3;
      int var4 = (int)(var1 * 1441151881L >>> 57);
      int var5 = var1 - 100000000 * var4;
      if (0 < var2 && var2 <= 7) {
         return this.OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(var4, var5, var2);
      } else {
         return -3 < var2 && var2 <= 0 ? this.IOIOHIORIROHRRCOOOHCROHORCOIIH(var4, var5, var2) : this.IIOCHOIICCIORCOROIROHICCHIOHIC(var4, var5, var2);
      }
   }

   private int OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(int var1, int var2, int var3) {
      this.ICHOCHHROIHCROICCIRIHHCHRHROCO(var1);
      int var4 = this.RRHCOCRHRORRORRCRICOOCCCCHCOIR(var2);

      int var6;
      for (var6 = 1; var6 < var3; var6++) {
         int var5 = 10 * var4;
         this.ICHOCHHROIHCROICCIRIHHCHRHROCO(var5 >>> 28);
         var4 = var5 & 268435455;
      }

      this.RIRRCRCICIHOHCOCRICHIROHRRHIRO(46);

      while (var6 <= 8) {
         int var7 = 10 * var4;
         this.ICHOCHHROIHCROICCIRIHHCHRHROCO(var7 >>> 28);
         var4 = var7 & 268435455;
         var6++;
      }

      this.HRHICHOHCIRHRIIRRRRRHOHCORHRRR();
      return 0;
   }

   private int IOIOHIORIROHRRCOOOHCROHORCOIIH(int var1, int var2, int var3) {
      this.ICHOCHHROIHCROICCIRIHHCHRHROCO(0);
      this.RIRRCRCICIHOHCOCRICHIROHRRHIRO(46);

      while (var3 < 0) {
         this.ICHOCHHROIHCROICCIRIHHCHRHROCO(0);
         var3++;
      }

      this.ICHOCHHROIHCROICCIRIHHCHRHROCO(var1);
      this.CIROICOIHHHHOHOIHOCIHRORHRCORH(var2);
      this.HRHICHOHCIRHRIIRRRRRHOHCORHRRR();
      return 0;
   }

   private int IIOCHOIICCIORCOROIROHICCHIOHIC(int var1, int var2, int var3) {
      this.ICHOCHHROIHCROICCIRIHHCHRHROCO(var1);
      this.RIRRCRCICIHOHCOCRICHIROHRRHIRO(46);
      this.CIROICOIHHHHOHOIHOCIHRORHRCORH(var2);
      this.HRHICHOHCIRHRIIRRRRRHOHCORHRRR();
      this.HOOIORHIHOIHOIIOORHROICRCOHCOH(var3 - 1);
      return 0;
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
      while (this.IIRIHOICCHROOIIRRRCRCOIIIIICHC[this.index] == 48) {
         this.index--;
      }

      if (this.IIRIHOICCHROOIIRRRCRCOIIIIICHC[this.index] == 46) {
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
         int var2 = var1 * 103 >>> 10;
         this.ICHOCHHROIHCROICCIRIHHCHRHROCO(var2);
         this.ICHOCHHROIHCROICCIRIHHCHRHROCO(var1 - 10 * var2);
      }
   }

   private void RIRRCRCICIHOHCOCRICHIROHRRHIRO(int var1) {
      this.IIRIHOICCHROOIIRRRCRCOIIIIICHC[++this.index] = (byte)var1;
   }

   private void ICHOCHHROIHCROICCIRIHHCHRHROCO(int var1) {
      this.IIRIHOICCHROOIIRRRCRCOIIIIICHC[++this.index] = (byte)(48 + var1);
   }

   private String RRIIHROCRRRCIRCIOCHICRRRCHCHOO() {
      return new String(this.IIRIHOICCHROOIIRRRCRCOIIIIICHC, 0, 0, this.index + 1);
   }
}
