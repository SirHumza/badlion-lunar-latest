package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class IHICORCROOROHCIHIHCOIHRRHICICO {
   private IHICORCROOROHCIHIHCOIHRRHICICO() {
   }

   public static String nullToEmpty(@Nullable String var0) {
      return ICICIOCHHHIHOCHCOHORIHRCOHHOCR.nullToEmpty(var0);
   }

   public static @Nullable String emptyToNull(@Nullable String var0) {
      return ICICIOCHHHIHOCHCOHORIHRCOHHOCR.emptyToNull(var0);
   }

   public static boolean isNullOrEmpty(@Nullable String var0) {
      return ICICIOCHHHIHOCHCOHORIHRCOHHOCR.stringIsNullOrEmpty(var0);
   }

   public static String padStart(String var0, int var1, char var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
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

   public static String padEnd(String var0, int var1, char var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      if (var0.length() >= var1) {
         return var0;
      }

      StringBuilder var3 = new StringBuilder(var1);
      var3.append(var0);

      for (int var4 = var0.length(); var4 < var1; var4++) {
         var3.append(var2);
      }

      return var3.toString();
   }

   public static String repeat(String var0, int var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      if (var1 <= 1) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var1 >= 0, "invalid count: %s", var1);
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

   public static String commonPrefix(CharSequence var0, CharSequence var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      int var2 = Math.min(var0.length(), var1.length());
      int var3 = 0;

      while (var3 < var2 && var0.charAt(var3) == var1.charAt(var3)) {
         var3++;
      }

      if (validSurrogatePairAt(var0, var3 - 1) || validSurrogatePairAt(var1, var3 - 1)) {
         var3--;
      }

      return var0.subSequence(0, var3).toString();
   }

   public static String commonSuffix(CharSequence var0, CharSequence var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      int var2 = Math.min(var0.length(), var1.length());
      int var3 = 0;

      while (var3 < var2 && var0.charAt(var0.length() - var3 - 1) == var1.charAt(var1.length() - var3 - 1)) {
         var3++;
      }

      if (validSurrogatePairAt(var0, var0.length() - var3 - 1) || validSurrogatePairAt(var1, var1.length() - var3 - 1)) {
         var3--;
      }

      return var0.subSequence(var0.length() - var3, var0.length()).toString();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static boolean validSurrogatePairAt(CharSequence var0, int var1) {
      return var1 >= 0 && var1 <= var0.length() - 2 && Character.isHighSurrogate(var0.charAt(var1)) && Character.isLowSurrogate(var0.charAt(var1 + 1));
   }

   public static String lenientFormat(@Nullable String var0, @Nullable Object @Nullable ... var1) {
      var0 = String.valueOf(var0);
      if (var1 == null) {
         var1 = new Object[]{"(Object[])null"};
      } else {
         for (int var2 = 0; var2 < var1.length; var2++) {
            var1[var2] = lenientToString(var1[var2]);
         }
      }

      StringBuilder var7 = new StringBuilder(var0.length() + 16 * var1.length);
      int var3 = 0;
      int var4 = 0;

      while (var4 < var1.length) {
         int var5 = var0.indexOf("%s", var3);
         if (var5 == -1) {
            break;
         }

         var7.append(var0, var3, var5);
         var7.append(var1[var4++]);
         var3 = var5 + 2;
      }

      var7.append(var0, var3, var0.length());
      if (var4 < var1.length) {
         var7.append(" [");
         var7.append(var1[var4++]);

         while (var4 < var1.length) {
            var7.append(", ");
            var7.append(var1[var4++]);
         }

         var7.append(']');
      }

      return var7.toString();
   }

   private static String lenientToString(@Nullable Object var0) {
      if (var0 == null) {
         return "null";
      }

      try {
         return var0.toString();
      } catch (Exception var3) {
         String var2 = var0.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(var0));
         Logger.getLogger("com.moonsworth.lunar.genesis.lib.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + var2, var3);
         return "<" + var2 + " threw " + var3.getClass().getName() + ">";
      }
   }
}
