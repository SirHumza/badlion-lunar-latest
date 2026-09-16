package com.llamalad7.mixinextras.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.spongepowered.asm.service.IMixinService;
import org.spongepowered.asm.service.MixinService;

public interface MixinExtrasLogger {
   void warn(String var1, Object... var2);

   void info(String var1, Object... var2);

   void debug(String var1, Object... var2);

   void error(String var1, Throwable var2);

   static MixinExtrasLogger get(String var0) {
      Object var1;
      try {
         IMixinService var2 = MixinService.getService();
         Method var3 = var2.getClass().getMethod("getLogger", String.class);
         var1 = var3.invoke(var2, "MixinExtras|" + var0);
      } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException var6) {
         try {
            var1 = Class.forName("org.apache.logging.log4j.LogManager").getMethod("getLogger", String.class).invoke(null, var0);
         } catch (ClassNotFoundException | InvocationTargetException | IllegalAccessException | NoSuchMethodException var5) {
            IllegalStateException var4 = new IllegalStateException("Could not get logger! Please inform LlamaLad7!");
            var4.addSuppressed(var6);
            var4.addSuppressed(var5);
            throw var4;
         }
      }

      Object var7 = var1;
      return (MixinExtrasLogger)Proxy.newProxyInstance(
         MixinExtrasLogger.class.getClassLoader(),
         new Class[]{MixinExtrasLogger.class},
         (var1x, var2x, var3x) -> var7.getClass().getMethod(var2x.getName(), var2x.getParameterTypes()).invoke(var7, var3x)
      );
   }
}
