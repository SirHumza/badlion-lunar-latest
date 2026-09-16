package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.util.Arrays;

public final class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   protected static final char[] RRIOCRHHCORHHRRRHHHHHORRCRRCCR = "0123456789ABCDEF".toCharArray();
   protected static final char[] CCOHHORROOHHHICOHORRIIIRROCHOO = "0123456789abcdef".toCharArray();
   protected static final byte[] RHIROHCIOCICHRCHICRRORICHRCROO;
   protected static final byte[] CICCHIIIHICOHOICHCCCHOCRICHIOR;
   protected static final int[] COORHHROCRRORHIOHHOHOOICHCIICR;
   protected static final int[] ORHRCRIICRHCRIOHIRICHOCRIOIOOR;
   protected static final int[] CCCICRHIIHCOICHIROOHCHIOOOHICI;
   protected static final int[] CRCIOCCIHHOOCOIIRICCCORHOHRHCO;
   protected static final int[] RHRHROHHROOCOOOHHCIOOIIORRCCOR;
   protected static final int[] OHRHOHIOHOIOIRHHHCCOHCHRHORCOR;
   protected static final int[] IRIIOIRHOIOCCHIHIIIHHCHHRCIIHR;
   protected static final int[] CHRHHOIHRCICRCCCHIHCORRRCOOHIO;

   public static int[] COCHRRIRHRIIORIOOICHCHRHIOCICH() {
      return COORHHROCRRORHIOHHOHOOICHCIICR;
   }

   public static int[] RRRCIHROIOORHCHHHIHCOCRCHROICC() {
      return ORHRCRIICRHCRIOHIRICHOCRIOIOOR;
   }

   public static int[] HHROHHIHCIHOIRHHHOOOCRHOHCCOCI() {
      return CCCICRHIIHCOICHIROOHCHIOOOHICI;
   }

   public static int[] RCIIRHHIOICCCIRIRCRRHIRIOCCRIO() {
      return CRCIOCCIHHOOCOIIRICCCORHOHRHCO;
   }

   public static int[] ICHHRHRICIOCHIRIIRCCHHROOIOOHH() {
      return RHRHROHHROOCOOOHHCIOOIIORRCCOR;
   }

   public static int[] CCORIICHCOCIIOHCOIROOOHIIIOICR() {
      return OHRHOHIOHOIOIRHHHCCOHCHRHORCOR;
   }

   public static int[] HHIHCOHOIRHRRIHHHCCIROICIRIHHR() {
      return IRIIOIRHOIOCCHIHIIIHHCHHRCIIHR;
   }

   public static int[] ORRRHORHHCRHHOHOCRRHRIRHIRIOOO(int var0) {
      return var0 == 34
         ? IRIIOIRHOIOCCHIHIIIHHCHHRCIIHR
         : HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIIIRCHIRCIRCHICHIHIRHCRRIOCHC.ICOIRHOIORIIOIOHIOCRIIORHRRRRR(var0);
   }

   public static int COIRIHRCCIIHCCICRHHOHRIOICRRII(int var0) {
      return CHRHHOIHRCICRCCCHIHCORRRCOOHIO[var0 & 0xFF];
   }

   public static char HOIIRRRCCHRIOOHCIIROOOHOIOOHOI(int var0) {
      return RRIOCRHHCORHHRRRHHHHHORRCRRCCR[var0];
   }

   public static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(StringBuilder var0, String var1) {
      int[] var2 = IRIIOIRHOIOCCHIHIIIHHCHHRCIIHR;
      int var3 = var2.length;
      int var4 = 0;

      for (int var5 = var1.length(); var4 < var5; var4++) {
         char var6 = var1.charAt(var4);
         if (var6 < var3 && var2[var6] != 0) {
            var0.append('\\');
            int var7 = var2[var6];
            if (var7 < 0) {
               var0.append('u');
               var0.append('0');
               var0.append('0');
               char var8 = var6;
               var0.append(RRIOCRHHCORHHRRRHHHHHORRCRRCCR[var8 >> 4]);
               var0.append(RRIOCRHHCORHHRRRHHHHHORRCRRCCR[var8 & 15]);
            } else {
               var0.append((char)var7);
            }
         } else {
            var0.append(var6);
         }
      }
   }

   @Deprecated
   public static char[] HIORCCCOOOCOOIIRCIHCCOHIIHIROH() {
      return CCOICRIIHHOCCHCHCCIIHCORIRCOCO(true);
   }

   public static char[] CCOICRIIHHOCCHCHCCIIHCORIRCOCO(boolean var0) {
      return var0 ? (char[])RRIOCRHHCORHHRRRHHHHHORRCRRCCR.clone() : (char[])CCOHHORROOHHHICOHORRIIIRROCHOO.clone();
   }

   @Deprecated
   public static byte[] OHOCOROIOHRRCICCRCROROROHOHOOO() {
      return RRRHOORORIIIORRICHHHRCIOIIOROO(true);
   }

   public static byte[] RRRHOORORIIIORRICHHHRCIOIIOROO(boolean var0) {
      return var0 ? (byte[])RHIROHCIOCICHRCHICRRORICHRCROO.clone() : (byte[])CICCHIIIHICOHOICHCCCHOCRICHIOR.clone();
   }

   static {
      int var0 = RRIOCRHHCORHHRRRHHHHHORRCRRCCR.length;
      RHIROHCIOCICHRCHICRRORICHRCROO = new byte[var0];
      CICCHIIIHICOHOICHCCCHOCRICHIOR = new byte[var0];

      for (int var1 = 0; var1 < var0; var1++) {
         RHIROHCIOCICHRCHICRRORICHRCROO[var1] = (byte)RRIOCRHHCORHHRRRHHHHHORRCRRCCR[var1];
         CICCHIIIHICOHOICHCCCHOCRICHIOR[var1] = (byte)CCOHHORROOHHHICOHORRIIIRROCHOO[var1];
      }

      int[] var3 = new int[256];

      for (int var12 = 0; var12 < 32; var12++) {
         var3[var12] = -1;
      }

      var3[34] = 1;
      var3[92] = 1;
      COORHHROCRRORHIOHHOHOOICHCIICR = var3;
      int[] var4 = new int[COORHHROCRRORHIOHHOHOOICHCIICR.length];
      System.arraycopy(COORHHROCRRORHIOHHOHOOICHCIICR, 0, var4, 0, var4.length);

      for (int var13 = 128; var13 < 256; var13++) {
         byte var2;
         if ((var13 & 224) == 192) {
            var2 = 2;
         } else if ((var13 & 240) == 224) {
            var2 = 3;
         } else if ((var13 & 248) == 240) {
            var2 = 4;
         } else {
            var2 = -1;
         }

         var4[var13] = var2;
      }

      ORHRCRIICRHCRIOHIRICHOCRIOIOOR = var4;
      int[] var5 = new int[256];
      Arrays.fill(var5, -1);

      for (int var14 = 33; var14 < 256; var14++) {
         if (Character.isJavaIdentifierPart((char)var14)) {
            var5[var14] = 0;
         }
      }

      var5[64] = 0;
      var5[35] = 0;
      var5[42] = 0;
      var5[45] = 0;
      var5[43] = 0;
      CCCICRHIIHCOICHIROOHCHIOOOHICI = var5;
      int[] var6 = new int[256];
      System.arraycopy(CCCICRHIIHCOICHIROOHCHIOOOHICI, 0, var6, 0, var6.length);
      Arrays.fill(var6, 128, 128, 0);
      CRCIOCCIHHOOCOIIRICCCORHOHRHCO = var6;
      int[] var7 = new int[256];
      System.arraycopy(ORHRCRIICRHCRIOHIRICHOCRIOIOOR, 128, var7, 128, 128);
      Arrays.fill(var7, 0, 32, -1);
      var7[9] = 0;
      var7[10] = 10;
      var7[13] = 13;
      var7[42] = 42;
      RHRHROHHROOCOOOHHCIOOIIORRCCOR = var7;
      int[] var8 = new int[256];
      System.arraycopy(ORHRCRIICRHCRIOHIRICHOCRIOIOOR, 128, var8, 128, 128);
      Arrays.fill(var8, 0, 32, -1);
      var8[32] = 1;
      var8[9] = 1;
      var8[10] = 10;
      var8[13] = 13;
      var8[47] = 47;
      var8[35] = 35;
      OHRHOHIOHOIOIRHHHCCOHCHRHORCOR = var8;
      int[] var9 = new int[128];

      for (int var15 = 0; var15 < 32; var15++) {
         var9[var15] = -1;
      }

      var9[34] = 34;
      var9[92] = 92;
      var9[8] = 98;
      var9[9] = 116;
      var9[12] = 102;
      var9[10] = 110;
      var9[13] = 114;
      IRIIOIRHOIOCCHIHIIIHHCHHRCIIHR = var9;
      CHRHHOIHRCICRCCCHIHCORRRCOOHIO = new int[256];
      Arrays.fill(CHRHHOIHRCICRCCCHIHCORRRCOOHIO, -1);
      var0 = 0;

      while (var0 < 10) {
         CHRHHOIHRCICRCCCHIHCORRRCOOHIO[48 + var0] = var0++;
      }

      for (int var11 = 0; var11 < 6; var11++) {
         CHRHHOIHRCICRCCCHIHCORRRCOOHIO[97 + var11] = 10 + var11;
         CHRHHOIHRCICRCCCHIHCORRRCOOHIO[65 + var11] = 10 + var11;
      }
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      public static final HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RIIIRCHIRCIRCHICHIHIRHCRRIOCHC = new HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      private int[][] HCHOHRHRHHHHHHHOCCCHROHIIOCRIC = new int[128][];

      public int[] ICOIRHOIORIIOIOHIOCRIIORHRRRRR(int var1) {
         int[] var2 = this.HCHOHRHRHHHHHHHOCCCHROHIIOCRIC[var1];
         if (var2 == null) {
            var2 = Arrays.copyOf(HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRIIOIRHOIOCCHIHIIIHHCHHRCIIHR, 128);
            if (var2[var1] == 0) {
               var2[var1] = -1;
            }

            this.HCHOHRHRHHHHHHHOCCCHROHIIOCRIC[var1] = var2;
         }

         return var2;
      }
   }
}
