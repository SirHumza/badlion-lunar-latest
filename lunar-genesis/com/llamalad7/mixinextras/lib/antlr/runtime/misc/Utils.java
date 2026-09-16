package com.llamalad7.mixinextras.lib.antlr.runtime.misc;

import java.util.Iterator;

public class Utils {
   public static <T> String join(Iterator<T> var0, String var1) {
      StringBuilder var2 = new StringBuilder();

      while (var0.hasNext()) {
         var2.append(var0.next());
         if (var0.hasNext()) {
            var2.append(var1);
         }
      }

      return var2.toString();
   }

   public static String escapeWhitespace(String var0, boolean var1) {
      StringBuilder var2 = new StringBuilder();

      for (char var6 : var0.toCharArray()) {
         if (var6 == ' ' && var1) {
            var2.append('·');
         } else if (var6 == '\t') {
            var2.append("\\t");
         } else if (var6 == '\n') {
            var2.append("\\n");
         } else if (var6 == '\r') {
            var2.append("\\r");
         } else {
            var2.append(var6);
         }
      }

      return var2.toString();
   }
}
