package com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO;

import java.lang.reflect.Constructor;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public static Constructor<?> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, byte[] var1, Class<?>[] var2) {
      try {
         Class var3 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1);
         Constructor var4 = var3.getDeclaredConstructor(var2);
         var4.setAccessible(true);
         return var4;
      } catch (NoSuchMethodException var5) {
         throw new RuntimeException(var5);
      }
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends ClassLoader {
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         super(Thread.currentThread().getContextClassLoader());
      }

      public Class<?> IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, byte[] var2) {
         return this.defineClass(var1, var2, 0, var2.length);
      }
   }
}
