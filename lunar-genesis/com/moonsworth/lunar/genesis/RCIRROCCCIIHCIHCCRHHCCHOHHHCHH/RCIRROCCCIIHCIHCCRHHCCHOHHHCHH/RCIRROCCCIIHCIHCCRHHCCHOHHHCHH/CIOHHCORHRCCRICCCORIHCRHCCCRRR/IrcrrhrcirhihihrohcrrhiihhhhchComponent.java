package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public final class OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   public static String getPackageName(Class<?> var0) {
      return getPackageName(var0.getName());
   }

   public static String getPackageName(String var0) {
      int var1 = var0.lastIndexOf(46);
      return var1 < 0 ? "" : var0.substring(0, var1);
   }

   public static void initialize(Class<?>... var0) {
      for (Class var4 : var0) {
         try {
            Class.forName(var4.getName(), true, var4.getClassLoader());
         } catch (ClassNotFoundException var6) {
            throw new AssertionError(var6);
         }
      }
   }

   public static <T> T newProxy(Class<T> var0, InvocationHandler var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.isInterface(), "%s is not an interface", var0);
      Object var2 = Proxy.newProxyInstance(var0.getClassLoader(), new Class[]{var0}, var1);
      return (T)var0.cast(var2);
   }

   private OOROOCCIRCCRHOIOIORIHCHHOOCCOR() {
   }
}
