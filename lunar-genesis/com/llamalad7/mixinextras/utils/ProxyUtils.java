package com.llamalad7.mixinextras.utils;

import com.llamalad7.mixinextras.lib.apache.commons.ClassUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtils {
   public static <T> T getProxy(Object var0, Class<T> var1) {
      if (var1.isInstance(var0)) {
         return (T)var1.cast(var0);
      } else {
         String var2 = var1.getSimpleName();
         if (ClassUtils.getAllInterfaces(var0.getClass()).stream().anyMatch(var1x -> var1x.getName().endsWith('.' + var2))) {
            return (T)Proxy.newProxyInstance(var1.getClassLoader(), new Class[]{var1}, (var1x, var2x, var3) -> {
               Method var4 = var0.getClass().getMethod(var2x.getName(), var2x.getParameterTypes());
               var4.setAccessible(true);
               return var4.invoke(var0, var3);
            });
         } else {
            throw new UnsupportedOperationException(String.format("Cannot get a %s instance from %s", var2, var0));
         }
      }
   }
}
