package org.spongepowered.include.com.google.common.primitives;

public final class Chars {
   public static boolean contains(char[] var0, char var1) {
      for (char var5 : var0) {
         if (var5 == var1) {
            return true;
         }
      }

      return false;
   }
}
