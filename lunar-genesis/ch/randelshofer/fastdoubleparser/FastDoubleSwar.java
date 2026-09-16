package ch.randelshofer.fastdoubleparser;

class FastDoubleSwar {
   protected static boolean isDigit(char var0) {
      return (char)(var0 - '0') < '\n';
   }

   protected static boolean isDigit(byte var0) {
      return (char)(var0 - 48) < '\n';
   }

   public static boolean isEightDigits(byte[] var0, int var1) {
      return isEightDigitsUtf8(readLongLE(var0, var1));
   }

   public static boolean isEightDigits(char[] var0, int var1) {
      long var2 = var0[var1] | (long)var0[var1 + 1] << 16 | (long)var0[var1 + 2] << 32 | (long)var0[var1 + 3] << 48;
      long var4 = var0[var1 + 4] | (long)var0[var1 + 5] << 16 | (long)var0[var1 + 6] << 32 | (long)var0[var1 + 7] << 48;
      return isEightDigitsUtf16(var2, var4);
   }

   public static boolean isEightDigits(CharSequence var0, int var1) {
      boolean var2 = true;

      for (int var3 = 0; var3 < 8; var3++) {
         char var4 = var0.charAt(var3 + var1);
         var2 &= isDigit(var4);
      }

      return var2;
   }

   public static boolean isEightDigitsUtf16(long var0, long var2) {
      long var4 = var0 - 13511005043687472L;
      long var6 = var2 - 13511005043687472L;
      long var8 = var0 + 19703549022044230L | var4;
      long var10 = var2 + 19703549022044230L | var6;
      return ((var8 | var10) & -35747867511423104L) == 0L;
   }

   public static boolean isEightDigitsUtf8(long var0) {
      long var2 = var0 - 3472328296227680304L;
      long var4 = (var0 + 5063812098665367110L | var2) & -9187201950435737472L;
      return var4 == 0L;
   }

   public static boolean isEightZeroes(byte[] var0, int var1) {
      return isEightZeroesUtf8(readLongLE(var0, var1));
   }

   public static boolean isEightZeroes(CharSequence var0, int var1) {
      boolean var2 = true;

      for (int var3 = 0; var3 < 8; var3++) {
         var2 &= '0' == var0.charAt(var3 + var1);
      }

      return var2;
   }

   public static boolean isEightZeroes(char[] var0, int var1) {
      long var2 = var0[var1] | (long)var0[var1 + 1] << 16 | (long)var0[var1 + 2] << 32 | (long)var0[var1 + 3] << 48;
      long var4 = var0[var1 + 4] | (long)var0[var1 + 5] << 16 | (long)var0[var1 + 6] << 32 | (long)var0[var1 + 7] << 48;
      return isEightZeroesUtf16(var2, var4);
   }

   public static boolean isEightZeroesUtf16(long var0, long var2) {
      return var0 == 13511005043687472L && var2 == 13511005043687472L;
   }

   public static boolean isEightZeroesUtf8(long var0) {
      return var0 == 3472328296227680304L;
   }

   public static int parseEightDigitsUtf16(long var0, long var2) {
      long var4 = var0 - 13511005043687472L;
      long var6 = var2 - 13511005043687472L;
      return (int)(var6 * 281475406208040961L >>> 48) + (int)(var4 * 281475406208040961L >>> 48) * 10000;
   }

   public static int readIntBE(byte[] var0, int var1) {
      return (var0[var1] & 0xFF) << 24 | (var0[var1 + 1] & 0xFF) << 16 | (var0[var1 + 2] & 0xFF) << 8 | var0[var1 + 3] & 0xFF;
   }

   public static int readIntLE(byte[] var0, int var1) {
      return (var0[var1 + 3] & 0xFF) << 24 | (var0[var1 + 2] & 0xFF) << 16 | (var0[var1 + 1] & 0xFF) << 8 | var0[var1] & 0xFF;
   }

   public static long readLongBE(byte[] var0, int var1) {
      return (var0[var1] & 255L) << 56
         | (var0[var1 + 1] & 255L) << 48
         | (var0[var1 + 2] & 255L) << 40
         | (var0[var1 + 3] & 255L) << 32
         | (var0[var1 + 4] & 255L) << 24
         | (var0[var1 + 5] & 255L) << 16
         | (var0[var1 + 6] & 255L) << 8
         | var0[var1 + 7] & 255L;
   }

   public static long readLongLE(byte[] var0, int var1) {
      return (var0[var1 + 7] & 255L) << 56
         | (var0[var1 + 6] & 255L) << 48
         | (var0[var1 + 5] & 255L) << 40
         | (var0[var1 + 4] & 255L) << 32
         | (var0[var1 + 3] & 255L) << 24
         | (var0[var1 + 2] & 255L) << 16
         | (var0[var1 + 1] & 255L) << 8
         | var0[var1] & 255L;
   }

   public static int tryToParseEightDigits(char[] var0, int var1) {
      long var2 = var0[var1] | (long)var0[var1 + 1] << 16 | (long)var0[var1 + 2] << 32 | (long)var0[var1 + 3] << 48;
      long var4 = var0[var1 + 4] | (long)var0[var1 + 5] << 16 | (long)var0[var1 + 6] << 32 | (long)var0[var1 + 7] << 48;
      return tryToParseEightDigitsUtf16(var2, var4);
   }

   public static int tryToParseEightDigits(byte[] var0, int var1) {
      return tryToParseEightDigitsUtf8(readLongLE(var0, var1));
   }

   public static int tryToParseEightDigits(CharSequence var0, int var1) {
      long var2 = var0.charAt(var1) | (long)var0.charAt(var1 + 1) << 16 | (long)var0.charAt(var1 + 2) << 32 | (long)var0.charAt(var1 + 3) << 48;
      long var4 = var0.charAt(var1 + 4) | (long)var0.charAt(var1 + 5) << 16 | (long)var0.charAt(var1 + 6) << 32 | (long)var0.charAt(var1 + 7) << 48;
      return tryToParseEightDigitsUtf16(var2, var4);
   }

   public static int tryToParseEightDigitsUtf16(long var0, long var2) {
      long var4 = var0 - 13511005043687472L;
      long var6 = var2 - 13511005043687472L;
      long var8 = var0 + 19703549022044230L | var4;
      long var10 = var2 + 19703549022044230L | var6;
      return ((var8 | var10) & -35747867511423104L) != 0L ? -1 : (int)(var6 * 281475406208040961L >>> 48) + (int)(var4 * 281475406208040961L >>> 48) * 10000;
   }

   public static int tryToParseEightDigitsUtf8(byte[] var0, int var1) {
      return tryToParseEightDigitsUtf8(readLongLE(var0, var1));
   }

   public static int tryToParseEightDigitsUtf8(long var0) {
      long var2 = var0 - 3472328296227680304L;
      long var4 = (var0 + 5063812098665367110L | var2) & -9187201950435737472L;
      if (var4 != 0L) {
         return -1;
      }

      long var6 = 1095216660735L;
      long var8 = 4294967296000100L;
      long var10 = 42949672960001L;
      var2 = var2 * 10L + (var2 >>> 8);
      var2 = (var2 & var6) * var8 + (var2 >>> 16 & var6) * var10 >>> 32;
      return (int)var2;
   }

   public static long tryToParseEightHexDigits(CharSequence var0, int var1) {
      long var2 = (long)var0.charAt(var1) << 48 | (long)var0.charAt(var1 + 1) << 32 | (long)var0.charAt(var1 + 2) << 16 | var0.charAt(var1 + 3);
      long var4 = (long)var0.charAt(var1 + 4) << 48 | (long)var0.charAt(var1 + 5) << 32 | (long)var0.charAt(var1 + 6) << 16 | var0.charAt(var1 + 7);
      return tryToParseEightHexDigitsUtf16(var2, var4);
   }

   public static long tryToParseEightHexDigits(char[] var0, int var1) {
      long var2 = (long)var0[var1] << 48 | (long)var0[var1 + 1] << 32 | (long)var0[var1 + 2] << 16 | var0[var1 + 3];
      long var4 = (long)var0[var1 + 4] << 48 | (long)var0[var1 + 5] << 32 | (long)var0[var1 + 6] << 16 | var0[var1 + 7];
      return tryToParseEightHexDigitsUtf16(var2, var4);
   }

   public static long tryToParseEightHexDigits(byte[] var0, int var1) {
      return tryToParseEightHexDigitsUtf8(readLongBE(var0, var1));
   }

   public static long tryToParseEightHexDigitsUtf16(long var0, long var2) {
      long var4 = tryToParseFourHexDigitsUtf16(var0);
      long var6 = tryToParseFourHexDigitsUtf16(var2);
      return var4 << 16 | var6;
   }

   public static long tryToParseEightHexDigitsUtf8(long var0) {
      long var2 = (var0 | 2314885530818453536L) - 3472328296227680304L;
      long var4 = var2 + 8536140394893047414L;
      var4 &= -9187201950435737472L;
      long var6 = var2 + 5714873654208057167L;
      var6 &= -9187201950435737472L;
      long var8 = 3978709506094217015L + (var2 ^ 9187201950435737471L);
      if (var4 != (var6 & var8)) {
         return -1L;
      }

      long var10 = (var4 >>> 7) * 255L;
      long var12 = var2 & ~var10 | var2 - (2821266740684990247L & var10);
      long var14 = var12 | var12 >>> 4;
      long var16 = var14 & 71777214294589695L;
      long var18 = var16 | var16 >>> 8;
      return var18 >>> 16 & 4294901760L | var18 & 65535L;
   }

   public static int tryToParseFourDigits(char[] var0, int var1) {
      long var2 = var0[var1] | (long)var0[var1 + 1] << 16 | (long)var0[var1 + 2] << 32 | (long)var0[var1 + 3] << 48;
      return tryToParseFourDigitsUtf16(var2);
   }

   public static int tryToParseFourDigits(CharSequence var0, int var1) {
      long var2 = var0.charAt(var1) | (long)var0.charAt(var1 + 1) << 16 | (long)var0.charAt(var1 + 2) << 32 | (long)var0.charAt(var1 + 3) << 48;
      return tryToParseFourDigitsUtf16(var2);
   }

   public static int tryToParseFourDigits(byte[] var0, int var1) {
      return tryToParseFourDigitsUtf8(readIntLE(var0, var1));
   }

   public static int tryToParseFourDigitsUtf16(long var0) {
      long var2 = var0 - 13511005043687472L;
      long var4 = var0 + 19703549022044230L | var2;
      return (var4 & -35747867511423104L) != 0L ? -1 : (int)(var2 * 281475406208040961L >>> 48);
   }

   public static int tryToParseFourDigitsUtf8(int var0) {
      int var1 = var0 - 808464432;
      int var2 = (var0 + 1179010630 | var1) & -2139062144;
      if (var2 != 0L) {
         return -1;
      }

      var1 = var1 * 2561 >>> 8;
      return (var1 & 0xFF) * 100 + ((var1 & 0xFF0000) >> 16);
   }

   public static long tryToParseFourHexDigitsUtf16(long var0) {
      long var2 = var0 - 13511005043687472L;
      long var4 = var2 + 9220697983773212662L;
      var4 &= -9223231297218904064L;
      long var6 = var2 + 9209720292175216591L;
      var6 &= -9223231297218904064L;
      long var8 = 15481359945891895L + (var2 ^ 9223231297218904063L);
      if (var4 != (var6 & var8)) {
         return -1L;
      }

      long var10 = (var4 >>> 15) * 65535L;
      long var12 = var2 & ~var10 | var2 - (10977691597996071L & var10);
      long var14 = var12 | var12 >>> 12;
      return (var14 | var14 >>> 24) & 65535L;
   }

   public static int tryToParseUpTo7Digits(byte[] var0, int var1, int var2) {
      int var3 = 0;
      boolean var4 = true;

      while (var1 < var2) {
         byte var5 = var0[var1];
         var4 &= isDigit(var5);
         var3 = 10 * var3 + var5 - 48;
         var1++;
      }

      return var4 ? var3 : -1;
   }

   public static int tryToParseUpTo7Digits(char[] var0, int var1, int var2) {
      int var3 = 0;
      boolean var4 = true;

      while (var1 < var2) {
         char var5 = var0[var1];
         var4 &= isDigit(var5);
         var3 = 10 * var3 + var5 - 48;
         var1++;
      }

      return var4 ? var3 : -1;
   }

   public static int tryToParseUpTo7Digits(CharSequence var0, int var1, int var2) {
      int var3 = 0;
      boolean var4 = true;

      while (var1 < var2) {
         char var5 = var0.charAt(var1);
         var4 &= isDigit(var5);
         var3 = 10 * var3 + var5 - 48;
         var1++;
      }

      return var4 ? var3 : -1;
   }

   public static void writeIntBE(byte[] var0, int var1, int var2) {
      var0[var1] = (byte)(var2 >>> 24);
      var0[var1 + 1] = (byte)(var2 >>> 16);
      var0[var1 + 2] = (byte)(var2 >>> 8);
      var0[var1 + 3] = (byte)var2;
   }

   public static void writeLongBE(byte[] var0, int var1, long var2) {
      var0[var1] = (byte)(var2 >>> 56);
      var0[var1 + 1] = (byte)(var2 >>> 48);
      var0[var1 + 2] = (byte)(var2 >>> 40);
      var0[var1 + 3] = (byte)(var2 >>> 32);
      var0[var1 + 4] = (byte)(var2 >>> 24);
      var0[var1 + 5] = (byte)(var2 >>> 16);
      var0[var1 + 6] = (byte)(var2 >>> 8);
      var0[var1 + 7] = (byte)var2;
   }

   public static double fma(double var0, double var2, double var4) {
      return var0 * var2 + var4;
   }
}
