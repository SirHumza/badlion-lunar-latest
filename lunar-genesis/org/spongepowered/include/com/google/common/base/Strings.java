package org.spongepowered.include.com.google.common.base;

import javax.annotation.Nullable;

public final class Strings {
   public static String nullToEmpty(@Nullable String var0) {
      return var0 == null ? "" : var0;
   }

   @Nullable
   public static String emptyToNull(@Nullable String var0) {
      return isNullOrEmpty(var0) ? null : var0;
   }

   public static boolean isNullOrEmpty(@Nullable String var0) {
      return Platform.stringIsNullOrEmpty(var0);
   }

   public static String padStart(String var0, int var1, char var2) {
      Preconditions.checkNotNull(var0);
      if (var0.length() >= var1) {
         return var0;
      }

      StringBuilder var3 = new StringBuilder(var1);

      for (int var4 = var0.length(); var4 < var1; var4++) {
         var3.append(var2);
      }

      var3.append(var0);
      return var3.toString();
   }

   public static String repeat(String var0, int var1) {
      Preconditions.checkNotNull(var0);
      if (var1 <= 1) {
         Preconditions.checkArgument(var1 >= 0, "invalid count: %s", var1);
         return var1 == 0 ? "" : var0;
      }

      int var2 = var0.length();
      long var3 = (long)var2 * var1;
      int var5 = (int)var3;
      if (var5 != var3) {
         throw new ArrayIndexOutOfBoundsException("Required array size too large: " + var3);
      }

      char[] var6 = new char[var5];
      var0.getChars(0, var2, var6, 0);

      int var7;
      for (var7 = var2; var7 < var5 - var7; var7 <<= 1) {
         System.arraycopy(var6, 0, var6, var7, var7);
      }

      System.arraycopy(var6, 0, var6, var7, var5 - var7);
      return new String(var6);
   }
}
