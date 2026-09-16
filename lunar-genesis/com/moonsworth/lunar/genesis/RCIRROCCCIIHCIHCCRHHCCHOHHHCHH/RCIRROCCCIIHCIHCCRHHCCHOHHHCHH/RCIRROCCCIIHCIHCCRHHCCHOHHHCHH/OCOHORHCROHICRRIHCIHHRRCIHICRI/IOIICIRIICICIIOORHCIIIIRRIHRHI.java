package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class IOIICIRIICICIIOORHCIIIIRRIHRHI {
   public static final long ROCCHOIIRORCIHCHOIOOHCHICCROIH = -1L;

   private IOIICIRIICICIIOORHCIIIIRRIHRHI() {
   }

   private static long flip(long var0) {
      return var0 ^ Long.MIN_VALUE;
   }

   public static int compare(long var0, long var2) {
      return OCOHORHCROHICRRIHCIHHRRCIHICRI.compare(flip(var0), flip(var2));
   }

   public static long min(long... var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length > 0);
      long var1 = flip(var0[0]);

      for (int var3 = 1; var3 < var0.length; var3++) {
         long var4 = flip(var0[var3]);
         if (var4 < var1) {
            var1 = var4;
         }
      }

      return flip(var1);
   }

   public static long max(long... var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length > 0);
      long var1 = flip(var0[0]);

      for (int var3 = 1; var3 < var0.length; var3++) {
         long var4 = flip(var0[var3]);
         if (var4 > var1) {
            var1 = var4;
         }
      }

      return flip(var1);
   }

   public static String join(String var0, long... var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      if (var1.length == 0) {
         return "";
      }

      StringBuilder var2 = new StringBuilder(var1.length * 5);
      var2.append(toString(var1[0]));

      for (int var3 = 1; var3 < var1.length; var3++) {
         var2.append(var0).append(toString(var1[var3]));
      }

      return var2.toString();
   }

   public static Comparator<long[]> lexicographicalComparator() {
      return IOIICIRIICICIIOORHCIIIIRRIHRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INSTANCE;
   }

   public static void sort(long[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      sort(var0, 0, var0.length);
   }

   public static void sort(long[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var0.length);

      for (int var3 = var1; var3 < var2; var3++) {
         var0[var3] = flip(var0[var3]);
      }

      Arrays.sort(var0, var1, var2);

      for (int var4 = var1; var4 < var2; var4++) {
         var0[var4] = flip(var0[var4]);
      }
   }

   public static void sortDescending(long[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      sortDescending(var0, 0, var0.length);
   }

   public static void sortDescending(long[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var0.length);

      for (int var3 = var1; var3 < var2; var3++) {
         var0[var3] ^= Long.MAX_VALUE;
      }

      Arrays.sort(var0, var1, var2);

      for (int var4 = var1; var4 < var2; var4++) {
         var0[var4] ^= Long.MAX_VALUE;
      }
   }

   public static long divide(long var0, long var2) {
      if (var2 < 0L) {
         return compare(var0, var2) < 0 ? 0L : 1L;
      }

      if (var0 >= 0L) {
         return var0 / var2;
      }

      long var4 = (var0 >>> 1) / var2 << 1;
      long var6 = var0 - var4 * var2;
      return var4 + (compare(var6, var2) >= 0 ? 1 : 0);
   }

   public static long remainder(long var0, long var2) {
      if (var2 < 0L) {
         return compare(var0, var2) < 0 ? var0 : var0 - var2;
      }

      if (var0 >= 0L) {
         return var0 % var2;
      }

      long var4 = (var0 >>> 1) / var2 << 1;
      long var6 = var0 - var4 * var2;
      return var6 - (compare(var6, var2) >= 0 ? var2 : 0L);
   }

   @CanIgnoreReturnValue
   public static long parseUnsignedLong(String var0) {
      return parseUnsignedLong(var0, 10);
   }

   @CanIgnoreReturnValue
   public static long parseUnsignedLong(String var0, int var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      if (var0.length() == 0) {
         throw new NumberFormatException("empty string");
      }

      if (var1 >= 2 && var1 <= 36) {
         int var2 = IOIICIRIICICIIOORHCIIIIRRIHRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIRRRORCICOCROIHOHCCHOIRRHHOCC[var1] - 1;
         long var3 = 0L;

         for (int var5 = 0; var5 < var0.length(); var5++) {
            int var6 = Character.digit(var0.charAt(var5), var1);
            if (var6 == -1) {
               throw new NumberFormatException(var0);
            }

            if (var5 > var2 && IOIICIRIICICIIOORHCIIIIRRIHRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.overflowInParse(var3, var6, var1)) {
               throw new NumberFormatException("Too large for unsigned long: " + var0);
            }

            var3 = var3 * var1 + var6;
         }

         return var3;
      } else {
         throw new NumberFormatException("illegal radix: " + var1);
      }
   }

   @CanIgnoreReturnValue
   public static long decode(String var0) {
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var1 = CIOHHCORHRCCRICCCORIHCRHCCCRRR.ORRIOOIROHHROIRCIIHIOOCIOOIIOO(var0);

      try {
         return parseUnsignedLong(var1.CCICCICIRCRRICCIIORORCOROOIIOH, var1.IOOCIRRRROCCICHCHIOORRHHROIIRI);
      } catch (NumberFormatException var4) {
         NumberFormatException var3 = new NumberFormatException("Error parsing value: " + var0);
         var3.initCause(var4);
         throw var3;
      }
   }

   public static String toString(long var0) {
      return toString(var0, 10);
   }

   public static String toString(long var0, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2 >= 2 && var2 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", var2);
      if (var0 == 0L) {
         return "0";
      }

      if (var0 > 0L) {
         return Long.toString(var0, var2);
      }

      char[] var3 = new char[64];
      int var4 = var3.length;
      if ((var2 & var2 - 1) == 0) {
         long var5 = (long)Integer.numberOfTrailingZeros(var2);
         int var6 = var2 - 1;

         do {
            var3[--var4] = Character.forDigit((int)var0 & var6, var2);
            var0 >>>= var5;
         } while (var0 != 0L);
      } else {
         long var10;
         if ((var2 & 1) == 0) {
            var10 = (var0 >>> 1) / (var2 >>> 1);
         } else {
            var10 = divide(var0, var2);
         }

         long var7 = var0 - var10 * var2;
         var3[--var4] = Character.forDigit((int)var7, var2);

         for (long var9 = var10; var9 > 0L; var9 /= var2) {
            var3[--var4] = Character.forDigit((int)(var9 % var2), var2);
         }
      }

      return new String(var3, var4, var3.length - var4);
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      static final long[] CCROCRHCRCCIIRRCCCIOHRIIRRCIRO = new long[37];
      static final int[] HCOOHRHRICIOHICRCCOIOOICCCCOOO = new int[37];
      static final int[] OIRRRORCICOCROIHOHCCHOIRRHHOCC = new int[37];

      static boolean overflowInParse(long var0, int var2, int var3) {
         if (var0 >= 0L) {
            if (var0 < CCROCRHCRCCIIRRCCCIOHRIIRRCIRO[var3]) {
               return false;
            } else {
               return var0 > CCROCRHCRCCIIRRCCCIOHRIIRRCIRO[var3] ? true : var2 > HCOOHRHRICIOHICRCCOIOOICCCCOOO[var3];
            }
         } else {
            return true;
         }
      }

      static {
         BigInteger var0 = new BigInteger("10000000000000000", 16);

         for (int var1 = 2; var1 <= 36; var1++) {
            CCROCRHCRCCIIRRCCCIOHRIIRRCIRO[var1] = IOIICIRIICICIIOORHCIIIIRRIHRHI.divide(-1L, var1);
            HCOOHRHRICIOHICRCCOIOOICCCCOOO[var1] = (int)IOIICIRIICICIIOORHCIIIIRRIHRHI.remainder(-1L, var1);
            OIRRRORCICOCROIHOHCCHOIRRHHOCC[var1] = var0.toString(var1).length() - 1;
         }
      }
   }

   enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Comparator<long[]> {
      INSTANCE;

      public int compare(long[] var1, long[] var2) {
         int var3 = Math.min(var1.length, var2.length);

         for (int var4 = 0; var4 < var3; var4++) {
            if (var1[var4] != var2[var4]) {
               return IOIICIRIICICIIOORHCIIIIRRIHRHI.compare(var1[var4], var2[var4]);
            }
         }

         return var1.length - var2.length;
      }

      @Override
      public String toString() {
         return "UnsignedLongs.lexicographicalComparator()";
      }
   }
}
