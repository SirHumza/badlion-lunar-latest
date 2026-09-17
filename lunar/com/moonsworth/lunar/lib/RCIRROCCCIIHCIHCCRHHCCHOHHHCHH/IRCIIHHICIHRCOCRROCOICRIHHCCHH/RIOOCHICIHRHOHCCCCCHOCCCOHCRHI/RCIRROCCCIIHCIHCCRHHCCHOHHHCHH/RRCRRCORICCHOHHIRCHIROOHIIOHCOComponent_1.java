package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.math.BigInteger;
import java.util.NavigableMap;

class OHHRIOHROOIHOROCIRHCHORIHRRRRI extends RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   public static final int HOIHROHOOIORCICIRHHRCRCORRRCHC = 1292782622;
   private static final int CRHCCOCRROHIRRIHCCIHCOHCHHIICO = 646456993;
   private static final int COOHHCIROCIOIRROCCROOICOCCHRRI = 536870912;

   public BigInteger parseBigIntegerLiteral(char[] var1, int var2, int var3, int var4) {
      try {
         int var5 = var2 + var3;
         if (var2 >= 0 && var5 >= var2 && var5 <= var1.length && var3 <= 1292782622) {
            int var10 = var2;
            char var7 = var1[var10];
            boolean var8 = var7 == '-';
            if (var8 || var7 == '+') {
               var7 = charAt(var1, ++var10, var5);
               if (var7 == 0) {
                  throw new NumberFormatException("illegal syntax");
               }
            }

            switch (var4) {
               case 10:
                  return this.parseDecDigits(var1, var10, var5, var8);
               case 16:
                  return this.parseHexDigits(var1, var10, var5, var8);
               default:
                  return new BigInteger(new String(var1, var2, var3), var4);
            }
         } else {
            throw new IllegalArgumentException("offset < 0 or length > str.length");
         }
      } catch (ArithmeticException var9) {
         NumberFormatException var6 = new NumberFormatException("value exceeds limits");
         var6.initCause(var9);
         throw var6;
      }
   }

   private BigInteger parseDecDigits(char[] var1, int var2, int var3, boolean var4) {
      int var5 = var3 - var2;
      if (var5 > 18) {
         return this.parseManyDecDigits(var1, var2, var3, var4);
      }

      int var6 = var2 + (var5 & 7);
      long var7 = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.tryToParseUpTo7Digits(var1, var2, var6);
      boolean var9 = var7 >= 0L;

      for (int var11 = var6; var11 < var3; var11 += 8) {
         int var10 = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.tryToParseEightDigits(var1, var11);
         var9 &= var10 >= 0;
         var7 = var7 * 100000000L + var10;
      }

      if (!var9) {
         throw new NumberFormatException("illegal syntax");
      } else {
         return BigInteger.valueOf(var4 ? -var7 : var7);
      }
   }

   private BigInteger parseHexDigits(char[] var1, int var2, int var3, boolean var4) {
      var2 = this.skipZeroes(var1, var2, var3);
      int var5 = var3 - var2;
      if (var5 <= 0) {
         return BigInteger.ZERO;
      }

      if (var5 > 536870912) {
         throw new NumberFormatException("value exceeds limits");
      }

      byte[] var6 = new byte[(var5 + 1 >> 1) + 1];
      int var7 = 1;
      boolean var8 = false;
      if ((var5 & 1) != 0) {
         char var9 = var1[var2++];
         byte var10 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HCOHICHIIHRHRRHHORRCHOHRHCROCI[var9];
         var6[var7++] = (byte)var10;
         var8 = var10 < 0;
      }

      for (int var15 = var2 + (var3 - var2 & 7); var2 < var15; var2 += 2) {
         char var16 = var1[var2];
         char var11 = var1[var2 + 1];
         byte var12 = var16 >= 128 ? -1 : RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HCOHICHIIHRHRRHHORRCHOHRHCROCI[var16];
         byte var13 = var11 >= 128 ? -1 : RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HCOHICHIIHRHRRHHORRCHOHRHCROCI[var11];
         var6[var7++] = (byte)(var12 << 4 | var13);
         var8 |= var12 < 0 || var13 < 0;
      }

      while (var2 < var3) {
         long var17 = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.tryToParseEightHexDigits(var1, var2);
         OOROOCCIRCCRHOIOIORIHCHHOOCCOR.writeIntBE(var6, var7, (int)var17);
         var8 |= var17 < 0L;
         var2 += 8;
         var7 += 4;
      }

      if (var8) {
         throw new NumberFormatException("illegal syntax");
      }

      BigInteger var18 = new BigInteger(var6);
      return var4 ? var18.negate() : var18;
   }

   private BigInteger parseManyDecDigits(char[] var1, int var2, int var3, boolean var4) {
      var2 = this.skipZeroes(var1, var2, var3);
      int var5 = var3 - var2;
      if (var5 > 646456993) {
         throw new NumberFormatException("value exceeds limits");
      }

      NavigableMap var6 = CRICCOOHHHCHOORCICOCOHIHOIRHOO.fillPowersOf10Floor16(var2, var3);
      BigInteger var7 = ICICIOCHHHIHOCHCOHORIHRCOHHOCR.parseDigitsRecursive(var1, var2, var3, var6);
      return var4 ? var7.negate() : var7;
   }

   private int skipZeroes(char[] var1, int var2, int var3) {
      while (var2 < var3 - 8 && OOROOCCIRCCRHOIOIORIHCHHOOCCOR.isEightZeroes(var1, var2)) {
         var2 += 8;
      }

      while (var2 < var3 && var1[var2] == '0') {
         var2++;
      }

      return var2;
   }
}
