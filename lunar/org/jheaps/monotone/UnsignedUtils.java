package org.jheaps.monotone;

import java.math.BigInteger;

class UnsignedUtils {
   private static final long UNSIGNED_MASK = Long.MAX_VALUE;

   static double unsignedLongToDouble(long var0) {
      double var2 = var0 & Long.MAX_VALUE;
      if (var0 < 0L) {
         var2 += 9.223372E18F;
      }

      return var2;
   }

   static BigInteger unsignedLongToBigInt(long var0) {
      BigInteger var2 = BigInteger.valueOf(var0 & Long.MAX_VALUE);
      if (var0 < 0L) {
         var2 = var2.setBit(63);
      }

      return var2;
   }
}
