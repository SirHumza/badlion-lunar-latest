package org.spongepowered.include.com.google.common.primitives;

import java.util.Arrays;
import javax.annotation.CheckForNull;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Preconditions;

public final class Longs {
   private static final byte[] asciiDigits = createAsciiDigits();

   private static byte[] createAsciiDigits() {
      byte[] var0 = new byte[128];
      Arrays.fill(var0, (byte)-1);

      for (int var1 = 0; var1 <= 9; var1++) {
         var0[48 + var1] = (byte)var1;
      }

      for (int var2 = 0; var2 <= 26; var2++) {
         var0[65 + var2] = (byte)(10 + var2);
         var0[97 + var2] = (byte)(10 + var2);
      }

      return var0;
   }

   private static int digit(char var0) {
      return var0 < 128 ? asciiDigits[var0] : -1;
   }

   @Nullable
   @CheckForNull
   public static Long tryParse(String var0) {
      return tryParse(var0, 10);
   }

   @Nullable
   @CheckForNull
   public static Long tryParse(String var0, int var1) {
      if (Preconditions.checkNotNull(var0).isEmpty()) {
         return null;
      }

      if (var1 >= 2 && var1 <= 36) {
         boolean var2 = var0.charAt(0) == '-';
         int var3 = var2 ? 1 : 0;
         if (var3 == var0.length()) {
            return null;
         }

         int var4 = digit(var0.charAt(var3++));
         if (var4 >= 0 && var4 < var1) {
            long var5 = -var4;
            long var7 = Long.MIN_VALUE / var1;

            while (var3 < var0.length()) {
               var4 = digit(var0.charAt(var3++));
               if (var4 < 0 || var4 >= var1 || var5 < var7) {
                  return null;
               }

               var5 *= var1;
               if (var5 < Long.MIN_VALUE + var4) {
                  return null;
               }

               var5 -= var4;
            }

            if (var2) {
               return var5;
            } else {
               return var5 == Long.MIN_VALUE ? null : -var5;
            }
         } else {
            return null;
         }
      } else {
         throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + var1);
      }
   }
}
