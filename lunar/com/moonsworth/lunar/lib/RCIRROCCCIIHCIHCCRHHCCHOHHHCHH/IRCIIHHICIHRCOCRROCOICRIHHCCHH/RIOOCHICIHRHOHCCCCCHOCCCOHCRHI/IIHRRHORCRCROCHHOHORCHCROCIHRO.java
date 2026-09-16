package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class IIHRRHORCRCROCHHOHORCHCROCIHRO {
   @Deprecated
   public static final String HCCIRRCIOHRHORRCRRIHCRCCOHCCHI = "2.2250738585072012e-308";
   static final long RCOIRCIOIOORCICIHIHIIRCCORIICC = 1000000000L;
   static final String ICHOCIOOCIICIOOHCHIIHICIHHOOCI = String.valueOf(Long.MIN_VALUE).substring(1);
   static final String COOCIOHCRCCIICIHHIRCCRCIRIROHC = String.valueOf(Long.MAX_VALUE);

   public static int CORCOCICIRIOHROHROIIOOHICCHCRR(char[] var0, int var1, int var2) {
      if (var2 > 0 && var0[var1] == '+') {
         var1++;
         var2--;
      }

      int var3 = var0[var1 + var2 - 1] - '0';
      switch (var2) {
         case 9:
            var3 += (var0[var1++] - '0') * 100000000;
         case 8:
            var3 += (var0[var1++] - '0') * 10000000;
         case 7:
            var3 += (var0[var1++] - '0') * 1000000;
         case 6:
            var3 += (var0[var1++] - '0') * 100000;
         case 5:
            var3 += (var0[var1++] - '0') * 10000;
         case 4:
            var3 += (var0[var1++] - '0') * 1000;
         case 3:
            var3 += (var0[var1++] - '0') * 100;
         case 2:
            var3 += (var0[var1] - '0') * 10;
         default:
            return var3;
      }
   }

   public static int parseInt(String var0) {
      char var1 = var0.charAt(0);
      int var2 = var0.length();
      boolean var3 = var1 == '-';
      int var4 = 1;
      if (var3) {
         if (var2 == 1 || var2 > 10) {
            return Integer.parseInt(var0);
         }

         var1 = var0.charAt(var4++);
      } else if (var2 > 9) {
         return Integer.parseInt(var0);
      }

      if (var1 <= '9' && var1 >= '0') {
         int var5 = var1 - '0';
         if (var4 < var2) {
            var1 = var0.charAt(var4++);
            if (var1 > '9' || var1 < '0') {
               return Integer.parseInt(var0);
            }

            var5 = var5 * 10 + (var1 - '0');
            if (var4 < var2) {
               var1 = var0.charAt(var4++);
               if (var1 > '9' || var1 < '0') {
                  return Integer.parseInt(var0);
               }

               var5 = var5 * 10 + (var1 - '0');
               if (var4 < var2) {
                  do {
                     var1 = var0.charAt(var4++);
                     if (var1 > '9' || var1 < '0') {
                        return Integer.parseInt(var0);
                     }

                     var5 = var5 * 10 + (var1 - '0');
                  } while (var4 < var2);
               }
            }
         }

         return var3 ? -var5 : var5;
      } else {
         return Integer.parseInt(var0);
      }
   }

   public static long CRICCOOHHHCHOORCICOCOHIHOIRHOO(char[] var0, int var1, int var2) {
      int var3 = var2 - 9;
      long var4 = CORCOCICIRIOHROHROIIOOHICCHCRR(var0, var1, var3) * 1000000000L;
      return var4 + CORCOCICIRIOHROHROIIOOHICCHCRR(var0, var1 + var3, 9);
   }

   public static long RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(char[] var0, int var1, boolean var2) {
      long var3 = 0L;

      for (int var5 = 0; var5 < 19; var5++) {
         char var6 = var0[var1 + var5];
         var3 = var3 * 10L + (var6 - '0');
      }

      return var2 ? -var3 : var3;
   }

   public static long OOCIIHHOHROOROHHCCRCIIHOICCIHC(String var0) {
      int var1 = var0.length();
      return var1 <= 9 ? parseInt(var0) : Long.parseLong(var0);
   }

   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(char[] var0, int var1, int var2, boolean var3) {
      String var4 = var3 ? ICHOCIOOCIICIOOHCHIIHICIHHOOCI : COOCIOHCRCCIICIHHIRCCRCIRIROHC;
      int var5 = var4.length();
      if (var2 < var5) {
         return true;
      }

      if (var2 > var5) {
         return false;
      }

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = var0[var1 + var6] - var4.charAt(var6);
         if (var7 != 0) {
            return var7 < 0;
         }
      }

      return true;
   }

   public static boolean IOHHOIIOCRHCHHCRORICCOHOHROOIH(String var0, boolean var1) {
      String var2 = var1 ? ICHOCIOOCIICIOOHCHIIHICIHHOOCI : COOCIOHCRCCIICIHHIRCCRCIRIROHC;
      int var3 = var2.length();
      int var4 = var0.length();
      if (var4 < var3) {
         return true;
      }

      if (var4 > var3) {
         return false;
      }

      for (int var5 = 0; var5 < var3; var5++) {
         int var6 = var0.charAt(var5) - var2.charAt(var5);
         if (var6 != 0) {
            return var6 < 0;
         }
      }

      return true;
   }

   public static int OOCCRCRCOHIIORCCORCRCIRRROIOOR(String var0, int var1) {
      if (var0 == null) {
         return var1;
      }

      var0 = var0.trim();
      int var2 = var0.length();
      if (var2 == 0) {
         return var1;
      }

      int var3 = 0;
      char var4 = var0.charAt(0);
      if (var4 == '+') {
         var0 = var0.substring(1);
         var2 = var0.length();
      } else if (var4 == '-') {
         var3 = 1;
      }

      while (var3 < var2) {
         char var5 = var0.charAt(var3);
         if (var5 > '9' || var5 < '0') {
            try {
               return (int)IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(var0, true);
            } catch (NumberFormatException var7) {
               return var1;
            }
         }

         var3++;
      }

      try {
         return Integer.parseInt(var0);
      } catch (NumberFormatException var8) {
         return var1;
      }
   }

   public static long CRRRICCRROCOHHOHIICIHORCOORRRH(String var0, long var1) {
      if (var0 == null) {
         return var1;
      }

      var0 = var0.trim();
      int var3 = var0.length();
      if (var3 == 0) {
         return var1;
      }

      int var4 = 0;
      char var5 = var0.charAt(0);
      if (var5 == '+') {
         var0 = var0.substring(1);
         var3 = var0.length();
      } else if (var5 == '-') {
         var4 = 1;
      }

      while (var4 < var3) {
         char var6 = var0.charAt(var4);
         if (var6 > '9' || var6 < '0') {
            try {
               return (long)IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(var0, true);
            } catch (NumberFormatException var8) {
               return var1;
            }
         }

         var4++;
      }

      try {
         return Long.parseLong(var0);
      } catch (NumberFormatException var9) {
         return var1;
      }
   }

   public static double CRICCOOHHHCHOORCICOCOHIHOIRHOO(String var0, double var1) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1, false);
   }

   public static double IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var0, double var1, boolean var3) {
      if (var0 == null) {
         return var1;
      }

      var0 = var0.trim();
      int var4 = var0.length();
      if (var4 == 0) {
         return var1;
      }

      try {
         return IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(var0, var3);
      } catch (NumberFormatException var6) {
         return var1;
      }
   }

   public static double CROCOHCOIHHHCHOOHOOIHHHICHOHOI(String var0) {
      return IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(var0, false);
   }

   public static double IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(String var0, boolean var1) {
      return var1 ? IHIRRIIORRHORHRORIHOROIRCORCOO.parseDouble(var0) : Double.parseDouble(var0);
   }

   public static float IHOROCHCICHIIOOHHRRIRIIICIRRRR(String var0) {
      return RHCHRCOCCOIIIHCHRHIRCORHRHRICR(var0, false);
   }

   public static float RHCHRCOCCOIIIHCHRHIRCORHRHRICR(String var0, boolean var1) {
      return var1 ? RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.parseFloat(var0) : Float.parseFloat(var0);
   }

   public static BigDecimal parseBigDecimal(String var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HCHOOIOHICCRIOIICHCHOIIRRRIHCI(var0);
   }

   public static BigDecimal RCCCROCHCICCROHCOCCRRROCIIHCCH(String var0, boolean var1) {
      return var1 ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OIRCHHRRCCROHIOROCRCCIIIHHOCHC(var0) : RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HCHOOIOHICCRIOIICHCHOIIRRRIHCI(var0);
   }

   public static BigDecimal parseBigDecimal(char[] var0, int var1, int var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var0, var1, var2);
   }

   public static BigDecimal IRCIIHHICIHRCOCRROCOICRIHHCCHH(char[] var0, int var1, int var2, boolean var3) {
      return var3
         ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0, var1, var2)
         : RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var0, var1, var2);
   }

   public static BigDecimal parseBigDecimal(char[] var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(var0);
   }

   public static BigDecimal RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(char[] var0, boolean var1) {
      return var1
         ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0, 0, var0.length)
         : RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(var0);
   }

   public static BigInteger parseBigInteger(String var0) {
      return new BigInteger(var0);
   }

   public static BigInteger OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(String var0, boolean var1) {
      return var1 ? IRCIIHHICIHRCOCRROCOICRIHHCCHH.CHHHRIIIIIRRHHICIRHCOCHIOHCRHR(var0) : parseBigInteger(var0);
   }

   public static BigInteger IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var0, int var1, boolean var2) {
      return var2 ? IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIROOOOICRHCCRRCIORHHIRCOIIIC(var0, var1) : new BigInteger(var0, var1);
   }
}
