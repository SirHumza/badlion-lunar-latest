package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.math.BigInteger;
import java.util.Map;

class ICICIOCHHHIHOCHCOHORIHRCOHHOCR {
   static final int CCCICRRCRCCIIRHIIIRRCIRIOIOCCR = 400;

   private ICICIOCHHHIHOCHCOHORIHRCOHHOCR() {
   }

   static BigInteger parseDigitsIterative(char[] var0, int var1, int var2) {
      int var3 = var2 - var1;
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var4 = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(CRICCOOHHHCHOORCICOCOHIHOIRHOO.estimateNumBits(var3));
      int var5 = var1 + (var3 & 7);
      int var6 = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.tryToParseUpTo7Digits(var0, var1, var5);
      boolean var7 = var6 >= 0;
      var4.add(var6);

      for (int var9 = var5; var9 < var2; var9 += 8) {
         int var8 = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.tryToParseEightDigits(var0, var9);
         var7 &= var8 >= 0;
         var4.fma(100000000, var8);
      }

      if (!var7) {
         throw new NumberFormatException("illegal syntax");
      } else {
         return var4.toBigInteger();
      }
   }

   static BigInteger parseDigitsRecursive(char[] var0, int var1, int var2, Map<Integer, BigInteger> var3) {
      int var4 = var2 - var1;
      if (var4 <= 400) {
         return parseDigitsIterative(var0, var1, var2);
      }

      int var5 = CRICCOOHHHCHOORCICOCOHIHOIRHOO.splitFloor16(var1, var2);
      BigInteger var6 = parseDigitsRecursive(var0, var1, var5, var3);
      BigInteger var7 = parseDigitsRecursive(var0, var5, var2, var3);
      var6 = HICHRCOHCCRHOHCICOOCHOIHCCHIRI.multiply(var6, (BigInteger)var3.get(var2 - var5));
      return var7.add(var6);
   }
}
