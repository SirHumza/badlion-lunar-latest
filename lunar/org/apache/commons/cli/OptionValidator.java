package org.apache.commons.cli;

class OptionValidator {
   static void validateOption(String var0) {
      if (var0 != null) {
         if (var0.length() == 1) {
            char var1 = var0.charAt(0);
            if (!isValidOpt(var1)) {
               throw new IllegalArgumentException("illegal option value '" + var1 + "'");
            }
         } else {
            char[] var3 = var0.toCharArray();

            for (int var2 = 0; var2 < var3.length; var2++) {
               if (!isValidChar(var3[var2])) {
                  throw new IllegalArgumentException("opt contains illegal character value '" + var3[var2] + "'");
               }
            }
         }
      }
   }

   private static boolean isValidOpt(char var0) {
      return isValidChar(var0) || var0 == ' ' || var0 == '?' || var0 == '@';
   }

   private static boolean isValidChar(char var0) {
      return Character.isJavaIdentifierPart(var0);
   }
}
