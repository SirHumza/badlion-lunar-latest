package com.moonsworth.lunar.client.util;

public class RIRHOCHIORCCIIOIIRHOCCCRHHCHHH {
   public static String getTextWithoutFormattingCodes(String var0) {
      if (var0 == null) {
         return null;
      }

      int var1 = 0;
      int var2 = 0;

      for (int var3 = var0.length() - 1; var2 < var3; var2++) {
         int var4 = var0.codePointAt(var2);
         if (var4 == 167) {
            int var5 = var0.codePointAt(var2 + 1);
            if (var5 >= 48 && var5 <= 57 || var5 >= 65 && var5 <= 70 || var5 >= 97 && var5 <= 102 || var5 == 79 || var5 == 111 || var5 == 82 || var5 == 114) {
               var1++;
               var2++;
            }
         }
      }

      if (var1 == 0) {
         return var0;
      }

      int[] var8 = new int[var0.length() - var1 * 2];
      int var9 = 0;
      int var10 = var0.length();
      int var11 = 0;

      while (var9 < var10) {
         label65: {
            int var6 = var0.codePointAt(var9);
            if (var6 == 167) {
               int var7 = var0.codePointAt(var9 + 1);
               if (var7 >= 48 && var7 <= 57 || var7 >= 65 && var7 <= 70 || var7 >= 97 && var7 <= 102 || var7 == 79 || var7 == 111 || var7 == 82 || var7 == 114) {
                  var9++;
                  break label65;
               }
            }

            var8[var11++] = var6;
         }

         var9++;
      }

      return new String(var8, 0, var8.length);
   }
}
