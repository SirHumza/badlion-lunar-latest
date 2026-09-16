package ch.randelshofer.fastdoubleparser;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.NavigableMap;

final class JavaBigDecimalFromCharArray extends AbstractNumberParser {
   public static final int MAX_INPUT_LENGTH = 1292782635;
   private static final int MANY_DIGITS_THRESHOLD = 32;
   private static final int MAX_DIGIT_COUNT = 1292782621;
   private static final long MAX_EXPONENT_NUMBER = 2147483647L;

   public JavaBigDecimalFromCharArray() {
   }

   public BigDecimal parseBigDecimalString(char[] var1, int var2, int var3) {
      try {
         if (var3 >= 32) {
            return this.parseBigDecimalStringWithManyDigits(var1, var2, var3);
         }

         long var4 = 0L;
         int var7 = -1;
         int var9 = var2 + var3;
         int var10 = var2;
         char var11 = charAt(var1, var10, var9);
         boolean var12 = false;
         boolean var13 = var11 == '-';
         if (var13 || var11 == '+') {
            var11 = charAt(var1, ++var10, var9);
            if (var11 == 0) {
               throw new NumberFormatException("illegal syntax");
            }
         }

         int var6 = var10;

         while (var10 < var9) {
            var11 = var1[var10];
            if (FastDoubleSwar.isDigit(var11)) {
               var4 = 10L * var4 + var11 - 48L;
            } else {
               if (var11 != '.') {
                  break;
               }

               var12 |= var7 >= 0;
               var7 = var10;

               while (var10 < var9 - 4) {
                  int var14 = FastDoubleSwar.tryToParseFourDigits(var1, var10 + 1);
                  if (var14 < 0) {
                     break;
                  }

                  var4 = 10000L * var4 + var14;
                  var10 += 4;
               }
            }

            var10++;
         }

         int var15 = var10;
         long var16;
         int var23;
         if (var7 < 0) {
            var23 = var15 - var6;
            var7 = var15;
            var16 = 0L;
         } else {
            var23 = var15 - var6 - 1;
            var16 = var7 - var15 + 1;
         }

         long var18 = 0L;
         int var8;
         if ((var11 | ' ') == 101) {
            var8 = var10++;
            var11 = charAt(var1, var10, var9);
            boolean var20 = var11 == '-';
            if (var20 || var11 == '+') {
               var11 = charAt(var1, ++var10, var9);
            }

            var12 |= !FastDoubleSwar.isDigit(var11);

            do {
               if (var18 < 2147483647L) {
                  var18 = 10L * var18 + var11 - 48L;
               }

               var11 = charAt(var1, ++var10, var9);
            } while (FastDoubleSwar.isDigit(var11));

            if (var20) {
               var18 = -var18;
            }

            var16 += var18;
         } else {
            var8 = var9;
         }

         if (var12 || var10 < var9 || var23 == 0 || var23 > 1292782621) {
            throw new NumberFormatException("illegal syntax");
         } else if (var16 <= -2147483648L || var16 > 2147483647L) {
            throw new NumberFormatException("value exceeds limits");
         } else {
            return var23 <= 18
               ? new BigDecimal(var13 ? -var4 : var4).scaleByPowerOfTen((int)var16)
               : this.valueOfBigDecimalString(var1, var6, var7, var7 + 1, var8, var13, (int)var16);
         }
      } catch (ArithmeticException var21) {
         NumberFormatException var5 = new NumberFormatException("value exceeds limits");
         var5.initCause(var21);
         throw var5;
      }
   }

   BigDecimal parseBigDecimalStringWithManyDigits(char[] var1, int var2, int var3) {
      if (var3 > 1292782635) {
         throw new NumberFormatException("illegal syntax");
      }

      int var6 = -1;
      int var7 = -1;
      int var9 = var2 + var3;
      int var10 = var2;
      char var11 = charAt(var1, var10, var9);
      boolean var12 = false;
      boolean var13 = var11 == '-';
      if (var13 || var11 == '+') {
         var11 = charAt(var1, ++var10, var9);
         if (var11 == 0) {
            throw new NumberFormatException("illegal syntax");
         }
      }

      int var5 = var10;
      int var14 = Math.min(var9 - 8, 1073741824);

      while (var10 < var14 && FastDoubleSwar.isEightZeroes(var1, var10)) {
         var10 += 8;
      }

      while (var10 < var9 && var1[var10] == '0') {
         var10++;
      }

      int var4 = var10;

      while (var10 < var14 && FastDoubleSwar.isEightDigits(var1, var10)) {
         var10 += 8;
      }

      while (var10 < var9 && FastDoubleSwar.isDigit(var11 = var1[var10])) {
         var10++;
      }

      if (var11 == '.') {
         var7 = var10++;

         while (var10 < var14 && FastDoubleSwar.isEightZeroes(var1, var10)) {
            var10 += 8;
         }

         while (var10 < var9 && var1[var10] == '0') {
            var10++;
         }

         var6 = var10;

         while (var10 < var14 && FastDoubleSwar.isEightDigits(var1, var10)) {
            var10 += 8;
         }

         while (var10 < var9 && FastDoubleSwar.isDigit(var11 = var1[var10])) {
            var10++;
         }
      }

      int var16 = var10;
      int var15;
      long var17;
      if (var7 < 0) {
         var15 = var16 - var4;
         var7 = var16;
         var6 = var16;
         var17 = 0L;
      } else {
         var15 = var4 == var7 ? var16 - var6 : var16 - var4 - 1;
         var17 = var7 - var16 + 1;
      }

      long var19 = 0L;
      int var8;
      if ((var11 | ' ') == 101) {
         var8 = var10++;
         var11 = charAt(var1, var10, var9);
         boolean var21 = var11 == '-';
         if (var21 || var11 == '+') {
            var11 = charAt(var1, ++var10, var9);
         }

         var12 = !FastDoubleSwar.isDigit(var11);

         do {
            if (var19 < 2147483647L) {
               var19 = 10L * var19 + var11 - 48L;
            }

            var11 = charAt(var1, ++var10, var9);
         } while (FastDoubleSwar.isDigit(var11));

         if (var21) {
            var19 = -var19;
         }

         var17 += var19;
      } else {
         var8 = var9;
      }

      if (var12 || var10 < var9) {
         throw new NumberFormatException("illegal syntax");
      } else if (var8 - var5 == 0) {
         throw new NumberFormatException("illegal syntax");
      } else if (var17 >= -2147483648L && var17 <= 2147483647L && var15 <= 1292782621) {
         return this.valueOfBigDecimalString(var1, var4, var7, var6, var8, var13, (int)var17);
      } else {
         throw new NumberFormatException("value exceeds limits");
      }
   }

   private BigDecimal valueOfBigDecimalString(char[] var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      int var8 = var5 - var3 - 1;
      int var9 = var5 - var4;
      int var10 = var3 - var2;
      NavigableMap var11 = null;
      BigInteger var13;
      if (var10 > 0) {
         if (var10 > 400) {
            var11 = FastIntegerMath.createPowersOfTenFloor16Map();
            FastIntegerMath.fillPowersOfNFloor16Recursive(var11, var2, var3);
            var13 = ParseDigitsTaskCharArray.parseDigitsRecursive(var1, var2, var3, var11);
         } else {
            var13 = ParseDigitsTaskCharArray.parseDigitsRecursive(var1, var2, var3, null);
         }
      } else {
         var13 = BigInteger.ZERO;
      }

      BigInteger var12;
      if (var9 > 0) {
         BigInteger var14;
         if (var9 > 400) {
            if (var11 == null) {
               var11 = FastIntegerMath.createPowersOfTenFloor16Map();
            }

            FastIntegerMath.fillPowersOfNFloor16Recursive(var11, var3 + 1, var5);
            var14 = ParseDigitsTaskCharArray.parseDigitsRecursive(var1, var3 + 1, var5, var11);
         } else {
            var14 = ParseDigitsTaskCharArray.parseDigitsRecursive(var1, var3 + 1, var5, null);
         }

         if (var13.signum() == 0) {
            var12 = var14;
         } else {
            BigInteger var15 = FastIntegerMath.computePowerOfTen(var11, var8);
            var12 = FftMultiplier.multiply(var13, var15).add(var14);
         }
      } else {
         var12 = var13;
      }

      return new BigDecimal(var6 ? var12.negate() : var12, -var7);
   }
}
