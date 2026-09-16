package com.llamalad7.mixinextras.lib.apache.commons;

import java.util.regex.Pattern;

public class StringUtils {
   private static final Pattern WHITESPACE_PATTERN = Pattern.compile("(?: |\\u00A0|\\s|[\\s&&[^ ]])\\s*");

   public static boolean isEmpty(CharSequence var0) {
      return var0 == null || var0.length() == 0;
   }

   public static String substringBefore(String var0, String var1) {
      if (isEmpty(var0) || var1 == null) {
         return var0;
      }

      if (var1.isEmpty()) {
         return "";
      }

      int var2 = var0.indexOf(var1);
      return var2 == -1 ? var0 : var0.substring(0, var2);
   }

   public static String substringAfter(String var0, String var1) {
      if (isEmpty(var0)) {
         return var0;
      }

      if (var1 == null) {
         return "";
      }

      int var2 = var0.indexOf(var1);
      return var2 == -1 ? "" : var0.substring(var2 + var1.length());
   }

   public static String substringBeforeLast(String var0, String var1) {
      if (!isEmpty(var0) && !isEmpty(var1)) {
         int var2 = var0.lastIndexOf(var1);
         return var2 == -1 ? var0 : var0.substring(0, var2);
      } else {
         return var0;
      }
   }

   public static String substringAfterLast(String var0, String var1) {
      if (isEmpty(var0)) {
         return var0;
      }

      if (isEmpty(var1)) {
         return "";
      }

      int var2 = var0.lastIndexOf(var1);
      return var2 != -1 && var2 != var0.length() - var1.length() ? var0.substring(var2 + var1.length()) : "";
   }

   public static String removeStart(String var0, String var1) {
      if (isEmpty(var0) || isEmpty(var1)) {
         return var0;
      } else {
         return var0.startsWith(var1) ? var0.substring(var1.length()) : var0;
      }
   }

   public static String removeEnd(String var0, String var1) {
      if (isEmpty(var0) || isEmpty(var1)) {
         return var0;
      } else {
         return var0.endsWith(var1) ? var0.substring(0, var0.length() - var1.length()) : var0;
      }
   }

   public static String replaceOnce(String var0, String var1, String var2) {
      return replace(var0, var1, var2, 1);
   }

   public static String replace(String var0, String var1, String var2, int var3) {
      if (!isEmpty(var0) && !isEmpty(var1) && var2 != null && var3 != 0) {
         int var4 = 0;
         int var5 = var0.indexOf(var1, var4);
         if (var5 == -1) {
            return var0;
         }

         int var6 = var1.length();
         int var7 = var2.length() - var6;
         var7 = var7 < 0 ? 0 : var7;
         var7 *= var3 < 0 ? 16 : (var3 > 64 ? 64 : var3);
         StringBuilder var8 = new StringBuilder(var0.length() + var7);

         while (var5 != -1) {
            var8.append(var0.substring(var4, var5)).append(var2);
            var4 = var5 + var6;
            if (--var3 == 0) {
               break;
            }

            var5 = var0.indexOf(var1, var4);
         }

         var8.append(var0.substring(var4));
         return var8.toString();
      } else {
         return var0;
      }
   }

   public static String repeat(char var0, int var1) {
      char[] var2 = new char[var1];

      for (int var3 = var1 - 1; var3 >= 0; var3--) {
         var2[var3] = var0;
      }

      return new String(var2);
   }
}
