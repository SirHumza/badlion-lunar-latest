package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

public final class OCOHORHCROHICRRIHCIHHRRCIHICRI {
   private static int IIRCOROIROHCOCROHOOROCIIRROIRH = 1000000;
   private static int RICROROIOOORRRRHROHROICICHCCHC = 1000000000;
   private static long OHHRCOCRHCOOOHHCOOOORICRRHIICI = 1000000000L;
   private static long CRRHCROHCHOICROIIIOOCROROHRIHI = -2147483648L;
   private static long CORCICOICOOOOHCRCHHCCIOOHCOHII = 2147483647L;
   static final String CIROCCOOIRCRCCCRIOOIIHRIOOCRHC = String.valueOf(Integer.MIN_VALUE);
   static final String RROOICIHRORIHRIHRICHHORIHCOHII = String.valueOf(Long.MIN_VALUE);
   private static final int[] HRCIRIOCCIOOROHOHRICICOCHIIRRR = new int[1000];
   private static final String[] IRRHHHOIRROOCCOCCHOOCOHCRORROR;
   private static final String[] HIHOOHRRHOHCRCICIRCHIOIRRCCCIH;

   public static int IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var0, char[] var1, int var2) {
      if (var0 < 0) {
         if (var0 == Integer.MIN_VALUE) {
            return CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var2);
         }

         var1[var2++] = '-';
         var0 = -var0;
      }

      if (var0 < IIRCOROIROHCOCROHOOROCIIRROIRH) {
         if (var0 < 1000) {
            if (var0 < 10) {
               var1[var2] = (char)(48 + var0);
               return var2 + 1;
            } else {
               return RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0, var1, var2);
            }
         } else {
            int var14 = var0 / 1000;
            var0 -= var14 * 1000;
            var2 = RRCRRCORICCHOHHIRCHIROOHIIOHCO(var14, var1, var2);
            return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var0, var1, var2);
         }
      } else if (var0 >= RICROROIOOORRRRHROHROICICHCCHC) {
         var0 -= RICROROIOOORRRRHROHROICICHCCHC;
         if (var0 >= RICROROIOOORRRRHROHROICICHCCHC) {
            var0 -= RICROROIOOORRRRHROHROICICHCCHC;
            var1[var2++] = '2';
         } else {
            var1[var2++] = '1';
         }

         return CRRRICCRROCOHHOHIICIHORCOORRRH(var0, var1, var2);
      } else {
         int var3 = var0 / 1000;
         int var4 = var0 - var3 * 1000;
         var0 = var3;
         var3 /= 1000;
         int var5 = var0 - var3 * 1000;
         var2 = RRCRRCORICCHOHHIRCHIROOHIIOHCO(var3, var1, var2);
         var2 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var5, var1, var2);
         return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var4, var1, var2);
      }
   }

   public static int HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var0, byte[] var1, int var2) {
      if (var0 < 0) {
         if (var0 == Integer.MIN_VALUE) {
            return RIROICHCRROROHCCROOCCCCOCHCCRI(var1, var2);
         }

         var1[var2++] = 45;
         var0 = -var0;
      }

      if (var0 < IIRCOROIROHCOCROHOOROCIIRROIRH) {
         if (var0 < 1000) {
            if (var0 < 10) {
               var1[var2++] = (byte)(48 + var0);
            } else {
               var2 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var0, var1, var2);
            }
         } else {
            int var15 = var0 / 1000;
            var0 -= var15 * 1000;
            var2 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var15, var1, var2);
            var2 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var0, var1, var2);
         }

         return var2;
      } else if (var0 >= RICROROIOOORRRRHROHROICICHCCHC) {
         var0 -= RICROROIOOORRRRHROHROICICHCCHC;
         if (var0 >= RICROROIOOORRRRHROHROICICHCCHC) {
            var0 -= RICROROIOOORRRRHROHROICICHCCHC;
            var1[var2++] = 50;
         } else {
            var1[var2++] = 49;
         }

         return RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0, var1, var2);
      } else {
         int var3 = var0 / 1000;
         int var4 = var0 - var3 * 1000;
         var0 = var3;
         var3 /= 1000;
         int var5 = var0 - var3 * 1000;
         var2 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var3, var1, var2);
         var2 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var5, var1, var2);
         return HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var4, var1, var2);
      }
   }

   public static int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long var0, char[] var2, int var3) {
      if (var0 < 0L) {
         if (var0 > CRRHCROHCHOICROIIIOOCROROHRIHI) {
            return IRCIIHHICIHRCOCRROCOICRIHHCCHH((int)var0, var2, var3);
         }

         if (var0 == Long.MIN_VALUE) {
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, var3);
         }

         var2[var3++] = '-';
         var0 = -var0;
      } else if (var0 <= CORCICOICOOOOHCRCHHCCIOOHCOHII) {
         return IRCIIHHICIHRCOCRROCOICRIHHCCHH((int)var0, var2, var3);
      }

      long var4 = var0 / OHHRCOCRHCOOOHHCOOOORICRRHIICI;
      var0 -= var4 * OHHRCOCRHCOOOHHCOOOORICRRHIICI;
      if (var4 < OHHRCOCRHCOOOHHCOOOORICRRHIICI) {
         var3 = HHCCIRHCCCIIRHCROHIORHIRHHIORH((int)var4, var2, var3);
      } else {
         long var6 = var4 / OHHRCOCRHCOOOHHCOOOORICRRHIICI;
         var4 -= var6 * OHHRCOCRHCOOOHHCOOOORICRRHIICI;
         var3 = RRCRRCORICCHOHHIRCHIROOHIIOHCO((int)var6, var2, var3);
         var3 = CRRRICCRROCOHHOHIICIHORCOORRRH((int)var4, var2, var3);
      }

      return CRRRICCRROCOHHOHIICIHORCOORRRH((int)var0, var2, var3);
   }

   public static int HHCCIRHCCCIIRHCROHIORHIRHHIORH(long var0, byte[] var2, int var3) {
      if (var0 < 0L) {
         if (var0 > CRRHCROHCHOICROIIIOOCROROHRIHI) {
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH((int)var0, var2, var3);
         }

         if (var0 == Long.MIN_VALUE) {
            return HICRRICCHCCROOHHCHOCOCCHOIHHOC(var2, var3);
         }

         var2[var3++] = 45;
         var0 = -var0;
      } else if (var0 <= CORCICOICOOOOHCRCHHCCIOOHCOHII) {
         return HHCCIRHCCCIIRHCROHIORHIRHHIORH((int)var0, var2, var3);
      }

      long var4 = var0 / OHHRCOCRHCOOOHHCOOOORICRRHIICI;
      var0 -= var4 * OHHRCOCRHCOOOHHCOOOORICRRHIICI;
      if (var4 < OHHRCOCRHCOOOHHCOOOORICRRHIICI) {
         var3 = CRRRICCRROCOHHOHIICIHORCOORRRH((int)var4, var2, var3);
      } else {
         long var6 = var4 / OHHRCOCRHCOOOHHCOOOORICRRHIICI;
         var4 -= var6 * OHHRCOCRHCOOOHHCOOOORICRRHIICI;
         var3 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI((int)var6, var2, var3);
         var3 = RRCRRCORICCHOHHIRCHIROOHIIOHCO((int)var4, var2, var3);
      }

      return RRCRRCORICCHOHHIRCHIROOHIIOHCO((int)var0, var2, var3);
   }

   public static String toString(int var0) {
      if (var0 < IRRHHHOIRROOCCOCCHOOCOHCRORROR.length) {
         if (var0 >= 0) {
            return IRRHHHOIRROOCCOCCHOOCOHCRORROR[var0];
         }

         int var1 = -var0 - 1;
         if (var1 < HIHOOHRRHOHCRCICIRCHIOIRRCCCIH.length) {
            return HIHOOHRRHOHCRCICIRCHIOIRRCCCIH[var1];
         }
      }

      return Integer.toString(var0);
   }

   public static String toString(long var0) {
      return var0 <= 2147483647L && var0 >= -2147483648L ? toString((int)var0) : Long.toString(var0);
   }

   public static String CIHCOICOOICHOCCHICIHRCOCIHRIOC(double var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, false);
   }

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double var0, boolean var2) {
      return var2
         ? com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIHCOICOOICHOCCHICIHRCOCIHRIOC(
            var0
         )
         : Double.toString(var0);
   }

   public static String IICRCOCCHCORCRHHHOIHROCHIROIHH(float var0) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, false);
   }

   public static String IRCIIHHICIHRCOCRROCOICRIHHCCHH(float var0, boolean var1) {
      return var1
         ? com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IICRCOCCHCORCRHHHOIHROCHIROIHH(
            var0
         )
         : Float.toString(var0);
   }

   public static boolean HOCCCIICRCIIIIRHHICOCOOIICHIOR(double var0) {
      return !Double.isFinite(var0);
   }

   public static boolean IIHROHOIOHICCRRHRICHCIHRCROOIO(float var0) {
      return !Float.isFinite(var0);
   }

   private static int HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var0, char[] var1, int var2) {
      if (var0 < IIRCOROIROHCOCROHOOROCIIRROIRH) {
         if (var0 < 1000) {
            return RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0, var1, var2);
         }

         int var15 = var0 / 1000;
         int var16 = var0 - var15 * 1000;
         return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var15, var16);
      } else {
         int var3 = var0 / 1000;
         int var4 = var0 - var3 * 1000;
         int var5 = var3 / 1000;
         var3 -= var5 * 1000;
         var2 = RRCRRCORICCHOHHIRCHIROOHIIOHCO(var5, var1, var2);
         int var6 = HRCIRIOCCIOOROHOHRICICOCHIIRRR[var3];
         var1[var2++] = (char)(var6 >> 16);
         var1[var2++] = (char)(var6 >> 8 & 127);
         var1[var2++] = (char)(var6 & 127);
         var6 = HRCIRIOCCIOOROHOHRICICOCHIIRRR[var4];
         var1[var2++] = (char)(var6 >> 16);
         var1[var2++] = (char)(var6 >> 8 & 127);
         var1[var2++] = (char)(var6 & 127);
         return var2;
      }
   }

   private static int CRRRICCRROCOHHOHIICIHORCOORRRH(int var0, char[] var1, int var2) {
      int var3 = var0 / 1000;
      int var4 = var0 - var3 * 1000;
      int var5 = var3 / 1000;
      int var6 = HRCIRIOCCIOOROHOHRICICOCHIIRRR[var5];
      var1[var2++] = (char)(var6 >> 16);
      var1[var2++] = (char)(var6 >> 8 & 127);
      var1[var2++] = (char)(var6 & 127);
      var3 -= var5 * 1000;
      var6 = HRCIRIOCCIOOROHOHRICICOCHIIRRR[var3];
      var1[var2++] = (char)(var6 >> 16);
      var1[var2++] = (char)(var6 >> 8 & 127);
      var1[var2++] = (char)(var6 & 127);
      var6 = HRCIRIOCCIOOROHOHRICICOCHIIRRR[var4];
      var1[var2++] = (char)(var6 >> 16);
      var1[var2++] = (char)(var6 >> 8 & 127);
      var1[var2++] = (char)(var6 & 127);
      return var2;
   }

   private static int CRRRICCRROCOHHOHIICIHORCOORRRH(int var0, byte[] var1, int var2) {
      if (var0 < IIRCOROIROHCOCROHOOROCIIRROIRH) {
         if (var0 < 1000) {
            return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var0, var1, var2);
         }

         int var15 = var0 / 1000;
         int var16 = var0 - var15 * 1000;
         return CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var2, var15, var16);
      } else {
         int var3 = var0 / 1000;
         int var4 = var0 - var3 * 1000;
         int var5 = var3 / 1000;
         var3 -= var5 * 1000;
         var2 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var5, var1, var2);
         int var6 = HRCIRIOCCIOOROHOHRICICOCHIIRRR[var3];
         var1[var2++] = (byte)(var6 >> 16);
         var1[var2++] = (byte)(var6 >> 8);
         var1[var2++] = (byte)var6;
         var6 = HRCIRIOCCIOOROHOHRICICOCHIIRRR[var4];
         var1[var2++] = (byte)(var6 >> 16);
         var1[var2++] = (byte)(var6 >> 8);
         var1[var2++] = (byte)var6;
         return var2;
      }
   }

   private static int RRCRRCORICCHOHHIRCHIROOHIIOHCO(int var0, byte[] var1, int var2) {
      int var3 = var0 / 1000;
      int var4 = var0 - var3 * 1000;
      int var5 = var3 / 1000;
      var3 -= var5 * 1000;
      int var6 = HRCIRIOCCIOOROHOHRICICOCHIIRRR[var5];
      var1[var2++] = (byte)(var6 >> 16);
      var1[var2++] = (byte)(var6 >> 8);
      var1[var2++] = (byte)var6;
      var6 = HRCIRIOCCIOOROHOHRICICOCHIIRRR[var3];
      var1[var2++] = (byte)(var6 >> 16);
      var1[var2++] = (byte)(var6 >> 8);
      var1[var2++] = (byte)var6;
      var6 = HRCIRIOCCIOOROHOHRICICOCHIIRRR[var4];
      var1[var2++] = (byte)(var6 >> 16);
      var1[var2++] = (byte)(var6 >> 8);
      var1[var2++] = (byte)var6;
      return var2;
   }

   private static int IRCIIHHICIHRCOCRROCOICRIHHCCHH(char[] var0, int var1, int var2, int var3) {
      int var4 = HRCIRIOCCIOOROHOHRICICOCHIIRRR[var2];
      if (var2 > 9) {
         if (var2 > 99) {
            var0[var1++] = (char)(var4 >> 16);
         }

         var0[var1++] = (char)(var4 >> 8 & 127);
      }

      var0[var1++] = (char)(var4 & 127);
      var4 = HRCIRIOCCIOOROHOHRICICOCHIIRRR[var3];
      var0[var1++] = (char)(var4 >> 16);
      var0[var1++] = (char)(var4 >> 8 & 127);
      var0[var1++] = (char)(var4 & 127);
      return var1;
   }

   private static int CRRRICCRROCOHHOHIICIHORCOORRRH(byte[] var0, int var1, int var2, int var3) {
      int var4 = HRCIRIOCCIOOROHOHRICICOCHIIRRR[var2];
      if (var2 > 9) {
         if (var2 > 99) {
            var0[var1++] = (byte)(var4 >> 16);
         }

         var0[var1++] = (byte)(var4 >> 8);
      }

      var0[var1++] = (byte)var4;
      var4 = HRCIRIOCCIOOROHOHRICICOCHIIRRR[var3];
      var0[var1++] = (byte)(var4 >> 16);
      var0[var1++] = (byte)(var4 >> 8);
      var0[var1++] = (byte)var4;
      return var1;
   }

   private static int RRCRRCORICCHOHHIRCHIROOHIIOHCO(int var0, char[] var1, int var2) {
      int var3 = HRCIRIOCCIOOROHOHRICICOCHIIRRR[var0];
      if (var0 > 9) {
         if (var0 > 99) {
            var1[var2++] = (char)(var3 >> 16);
         }

         var1[var2++] = (char)(var3 >> 8 & 127);
      }

      var1[var2++] = (char)(var3 & 127);
      return var2;
   }

   private static int RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(int var0, byte[] var1, int var2) {
      int var3 = HRCIRIOCCIOOROHOHRICICOCHIIRRR[var0];
      if (var0 > 9) {
         if (var0 > 99) {
            var1[var2++] = (byte)(var3 >> 16);
         }

         var1[var2++] = (byte)(var3 >> 8);
      }

      var1[var2++] = (byte)var3;
      return var2;
   }

   private static int RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(int var0, char[] var1, int var2) {
      int var3 = HRCIRIOCCIOOROHOHRICICOCHIIRRR[var0];
      var1[var2++] = (char)(var3 >> 16);
      var1[var2++] = (char)(var3 >> 8 & 127);
      var1[var2++] = (char)(var3 & 127);
      return var2;
   }

   private static int HRCHROOHRIHCRCRHRIIROCIRHOIRHH(int var0, byte[] var1, int var2) {
      int var3 = HRCIRIOCCIOOROHOHRICICOCHIIRRR[var0];
      var1[var2++] = (byte)(var3 >> 16);
      var1[var2++] = (byte)(var3 >> 8);
      var1[var2++] = (byte)var3;
      return var2;
   }

   private static int HHCCIRHCCCIIRHCROHIORHIRHHIORH(char[] var0, int var1) {
      int var2 = RROOICIHRORIHRIHRICHHORIHCOHII.length();
      RROOICIHRORIHRIHRICHHORIHCOHII.getChars(0, var2, var0, var1);
      return var1 + var2;
   }

   private static int HICRRICCHCCROOHHCHOCOCCHOIHHOC(byte[] var0, int var1) {
      int var2 = RROOICIHRORIHRIHRICHHORIHCOHII.length();

      for (int var3 = 0; var3 < var2; var3++) {
         var0[var1++] = (byte)RROOICIHRORIHRIHRICHHORIHCOHII.charAt(var3);
      }

      return var1;
   }

   private static int CRRRICCRROCOHHOHIICIHORCOORRRH(char[] var0, int var1) {
      int var2 = CIROCCOOIRCRCCCRIOOIIHRIOOCRHC.length();
      CIROCCOOIRCRCCCRIOOIIHRIOOCRHC.getChars(0, var2, var0, var1);
      return var1 + var2;
   }

   private static int RIROICHCRROROHCCROOCCCCOCHCCRI(byte[] var0, int var1) {
      int var2 = CIROCCOOIRCRCCCRIOOIIHRIOOCRHC.length();

      for (int var3 = 0; var3 < var2; var3++) {
         var0[var1++] = (byte)CIROCCOOIRCRCCCRIOOIIHRIOOCRHC.charAt(var3);
      }

      return var1;
   }

   static {
      int var0 = 0;

      for (int var1 = 0; var1 < 10; var1++) {
         for (int var2 = 0; var2 < 10; var2++) {
            for (int var3 = 0; var3 < 10; var3++) {
               int var4 = var1 + 48 << 16 | var2 + 48 << 8 | var3 + 48;
               HRCIRIOCCIOOROHOHRICICOCHIIRRR[var0++] = var4;
            }
         }
      }

      IRRHHHOIRROOCCOCCHOOCOHCRORROR = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
      HIHOOHRRHOHCRCICIRCHIOIRRCCCIH = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
   }
}
