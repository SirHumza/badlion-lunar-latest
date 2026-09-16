package org.apache.commons.cli;

class Util {
   static String stripLeadingHyphens(String var0) {
      if (var0 == null) {
         return null;
      } else if (var0.startsWith("--")) {
         return var0.substring(2, var0.length());
      } else {
         return var0.startsWith("-") ? var0.substring(1, var0.length()) : var0;
      }
   }

   static String stripLeadingAndTrailingQuotes(String var0) {
      if (var0.startsWith("\"")) {
         var0 = var0.substring(1, var0.length());
      }

      if (var0.endsWith("\"")) {
         var0 = var0.substring(0, var0.length() - 1);
      }

      return var0;
   }
}
