package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends RuntimeException {
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(Object var1, String var2) {
      super(CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1.getClass()) + " - " + var2);
   }

   private static String CRICCOOHHHCHOORCICOCOHIHOIRHOO(Class<?> var0) {
      String var1 = var0.getSimpleName();
      int var2 = var1.length();
      if (var2 <= 8) {
         String var3 = var0.getName();
         int var4 = var3.lastIndexOf(46);
         return var4 != -1 && var3.length() - var4 >= 8 ? var3.substring(var4 + 1) : var3;
      } else {
         return var1;
      }
   }
}
