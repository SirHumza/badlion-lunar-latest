package com.moonsworth.lunar.client.util;

public class HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
   public static final char[] CCIIOOHIHRIOCOOCORIRIRIOICRROO = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':'};

   public static boolean HICHRCOHCCRHOHCICOOCHOIHCCHIRI(char var0) {
      return var0 != 167 && var0 >= ' ' && var0 != 127;
   }

   public static String ORIRHOCICIIRCRHCHHRHOHIIHRHOCI(String var0) {
      StringBuilder var1 = new StringBuilder();

      for (char var5 : var0.toCharArray()) {
         if (HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var5)) {
            var1.append(var5);
         }
      }

      return var1.toString();
   }
}
