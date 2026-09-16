package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.math.BigDecimal;
import java.util.Arrays;

public final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   static final int OIIHRCOCOHIIROCIHRIOOOOHIHIRHH = 1000;

   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
   }

   public static BigDecimal HCHOOIOHICCRIOIICHCHOIIRRRIHCI(String var0) {
      return CRRRICCRROCOHHOHIICIHORCOORRRH(var0.toCharArray());
   }

   public static BigDecimal HRCHROOHRIHCRCRHRIIROCIRHOIRHH(char[] var0, int var1, int var2) {
      try {
         return var2 < 500 ? new BigDecimal(var0, var1, var2) : RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2, var2 / 10);
      } catch (ArithmeticException | NumberFormatException var6) {
         String var4 = var6.getMessage();
         if (var4 == null) {
            var4 = "Not a valid number representation";
         }

         String var5;
         if (var2 <= 1000) {
            var5 = new String(var0, var1, var2);
         } else {
            var5 = new String(Arrays.copyOfRange(var0, var1, 1000)) + "(truncated, full length is " + var0.length + " chars)";
         }

         throw new NumberFormatException("Value \"" + var5 + "\" can not be represented as `java.math.BigDecimal`, reason: " + var4);
      }
   }

   public static BigDecimal CRRRICCRROCOHHOHIICIHORCOORRRH(char[] var0) {
      return HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var0, 0, var0.length);
   }

   public static BigDecimal OIRCHHRRCCROHIOROCRCCIIIHHOCHC(String var0) {
      try {
         return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.parseBigDecimal(
            var0
         );
      } catch (NumberFormatException var3) {
         String var2 = var0.length() <= 1000 ? var0 : var0.substring(0, 1000) + " [truncated]";
         throw new NumberFormatException("Value \"" + var2 + "\" can not be represented as `java.math.BigDecimal`, reason: " + var3.getMessage());
      }
   }

   public static BigDecimal OOROOCCIRCCRHOIOIORIHCHHOOCCOR(char[] var0, int var1, int var2) {
      try {
         return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.parseBigDecimal(
            var0, var1, var2
         );
      } catch (NumberFormatException var5) {
         String var4 = var2 <= 1000 ? new String(var0, var1, var2) : new String(var0, var1, 1000) + " [truncated]";
         throw new NumberFormatException("Value \"" + var4 + "\" can not be represented as `java.math.BigDecimal`, reason: " + var5.getMessage());
      }
   }

   private static BigDecimal RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(char[] var0, int var1, int var2, int var3) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      int var7 = var1;
      int var8 = -1;
      int var9 = -1;
      int var10 = 0;
      int var11 = var1 + var2;

      for (int var12 = var1; var12 < var11; var12++) {
         char var13 = var0[var12];
         switch (var13) {
            case '+':
               if (var8 >= 0) {
                  if (var5) {
                     throw new NumberFormatException("Multiple signs in exponent");
                  }

                  var5 = true;
               } else {
                  if (var4) {
                     throw new NumberFormatException("Multiple signs in number");
                  }

                  var4 = true;
                  var7 = var12 + 1;
               }
               break;
            case '-':
               if (var8 >= 0) {
                  if (var5) {
                     throw new NumberFormatException("Multiple signs in exponent");
                  }

                  var5 = true;
               } else {
                  if (var4) {
                     throw new NumberFormatException("Multiple signs in number");
                  }

                  var4 = true;
                  var6 = true;
                  var7 = var12 + 1;
               }
               break;
            case '.':
               if (var9 >= 0) {
                  throw new NumberFormatException("Multiple decimal points");
               }

               var9 = var12;
               break;
            case 'E':
            case 'e':
               if (var8 >= 0) {
                  throw new NumberFormatException("Multiple exponent markers");
               }

               var8 = var12;
               break;
            default:
               if (var9 >= 0 && var8 == -1) {
                  var10++;
               }
         }
      }

      int var20 = 0;
      int var19;
      if (var8 >= 0) {
         var19 = var8;
         String var14 = new String(var0, var8 + 1, var11 - var8 - 1);
         var20 = Integer.parseInt(var14);
         var10 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var10, var20);
      } else {
         var19 = var11;
      }

      BigDecimal var21;
      if (var9 >= 0) {
         int var15 = var9 - var7;
         BigDecimal var16 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var7, var15, var20, var3);
         int var17 = var19 - var9 - 1;
         BigDecimal var18 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var9 + 1, var17, var20 - var17, var3);
         var21 = var16.add(var18);
      } else {
         var21 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var7, var19 - var7, var20, var3);
      }

      if (var10 != 0) {
         var21 = var21.setScale(var10);
      }

      if (var6) {
         var21 = var21.negate();
      }

      return var21;
   }

   private static int HRCHROOHRIHCRCRHRIIROCIRHOIRHH(int var0, long var1) {
      long var3 = var0 - var1;
      if (var3 <= 2147483647L && var3 >= -2147483648L) {
         return (int)var3;
      } else {
         throw new NumberFormatException("Scale out of range: " + var3 + " while adjusting scale " + var0 + " to exponent " + var1);
      }
   }

   private static BigDecimal RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(char[] var0, int var1, int var2, int var3, int var4) {
      if (var2 > var4) {
         int var5 = var2 / 2;
         BigDecimal var6 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var5, var3 + var2 - var5, var4);
         BigDecimal var7 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1 + var5, var2 - var5, var3, var4);
         return var6.add(var7);
      } else {
         return var2 == 0 ? BigDecimal.ZERO : new BigDecimal(var0, var1, var2).scaleByPowerOfTen(var3);
      }
   }
}
