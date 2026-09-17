package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements InvocationHandler {
   private static final Object[] RCIORCORRROROOORHRRCHRIRRRRRHI = new Object[0];

   @Override
   public final Object invoke(Object var1, Method var2, Object @Nullable [] var3) {
      if (var3 == null) {
         var3 = RCIORCORRROROOORHRRCHRIRRRRRHI;
      }

      if (var3.length == 0 && var2.getName().equals("hashCode")) {
         return this.hashCode();
      }

      if (var3.length == 1 && var2.getName().equals("equals") && var2.getParameterTypes()[0] == Object.class) {
         Object var4 = var3[0];
         if (var4 == null) {
            return false;
         } else {
            return var1 == var4 ? true : isProxyOfSameInterfaces(var4, var1.getClass()) && this.equals(Proxy.getInvocationHandler(var4));
         }
      } else {
         return var3.length == 0 && var2.getName().equals("toString") ? this.toString() : this.handleInvocation(var1, var2, var3);
      }
   }

   protected abstract Object handleInvocation(Object var1, Method var2, Object[] var3);

   @Override
   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   @Override
   public String toString() {
      return super.toString();
   }

   private static boolean isProxyOfSameInterfaces(Object var0, Class<?> var1) {
      return var1.isInstance(var0) || Proxy.isProxyClass(var0.getClass()) && Arrays.equals(var0.getClass().getInterfaces(), var1.getInterfaces());
   }
}
