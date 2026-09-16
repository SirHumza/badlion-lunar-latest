package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

public class CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   private CRICCOOHHHCHOORCICOCOHIHOIRHOO() {
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
      public static final CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ICRRRRCIORRCOCRRCRHRICCOHRRRRI = new CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();

      @Override
      public String OICIIIIHOCRRHCOOHOOCOCCRIIOCHH(String var1) {
         if (var1 == null) {
            return null;
         }

         String var2 = "_";
         StringBuilder var3 = null;
         int var4 = 0;
         int var5 = -1;

         do {
            var5 = indexIn(var1, var5 + 1);
            if (var5 != -1) {
               if (var4 == 0) {
                  var3 = new StringBuilder(var1.length() + 4 * "_".length());
                  var3.append(toLowerCase(var1.substring(var4, var5)));
               } else {
                  var3.append(normalizeWord(var1.substring(var4, var5)));
               }

               var4 = var5 + "_".length();
            }
         } while (var5 != -1);

         if (var4 == 0) {
            return toLowerCase(var1);
         }

         var3.append(normalizeWord(var1.substring(var4)));
         return var3.toString();
      }

      private static int indexIn(CharSequence var0, int var1) {
         int var2 = var0.length();

         for (int var3 = var1; var3 < var2; var3++) {
            if ('_' == var0.charAt(var3)) {
               return var3;
            }
         }

         return -1;
      }

      private static String normalizeWord(String var0) {
         int var1 = var0.length();
         return var1 == 0
            ? var0
            : new StringBuilder(var1).append(RCIROOOOICRHCCRRCIORHHIRCOIIIC(var0.charAt(0))).append(toLowerCase(var0.substring(1))).toString();
      }

      private static String toLowerCase(String var0) {
         int var1 = var0.length();
         StringBuilder var2 = new StringBuilder(var1);

         for (int var3 = 0; var3 < var1; var3++) {
            var2.append(OOCCRCRCOHIIORCCORCRCIRRROIOOR(var0.charAt(var3)));
         }

         return var2.toString();
      }

      private static char RCIROOOOICRHCCRRCIORHHIRCOIIIC(char var0) {
         return Character.isLowerCase(var0) ? Character.toUpperCase(var0) : var0;
      }

      private static char OOCCRCRCOHIIORCCORCRCIRRROIOOR(char var0) {
         return Character.isUpperCase(var0) ? Character.toLowerCase(var0) : var0;
      }
   }
}
