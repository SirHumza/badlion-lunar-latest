package com.github.trilarion.sound.util;

import java.util.logging.Logger;

public final class Util {
   private static final Logger LOG = Logger.getLogger(Util.class.getName());

   public static int ilog(int var0) {
      int var1 = 0;

      while (var0 != 0) {
         var1++;
         var0 >>>= 1;
      }

      return var1;
   }

   public static int ilog2(int var0) {
      int var1 = 0;

      while (var0 > 1) {
         var1++;
         var0 >>>= 1;
      }

      return var1;
   }

   public static int icount(int var0) {
      int var1 = 0;

      while (var0 != 0) {
         var1 += var0 & 1;
         var0 >>>= 1;
      }

      return var1;
   }
}
