package org.jgrapht.util;

public class MathUtil {
   public static long factorial(int var0) {
      long var1 = 1L;

      for (int var3 = 1; var3 <= var0; var3++) {
         var1 *= var3;
      }

      return var1;
   }

   public static int log2(int var0) {
      byte var1 = 0;
      if ((var0 & -65536) != 0) {
         var0 >>>= 16;
         var1 = 16;
      }

      if (var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      return var1 + (var0 >>> 1);
   }
}
