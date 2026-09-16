package com.llamalad7.mixinextras.injector;

import com.llamalad7.mixinextras.lib.apache.commons.ClassUtils;
import com.llamalad7.mixinextras.service.MixinExtrasService;
import com.llamalad7.mixinextras.utils.MixinExtrasLogger;
import com.llamalad7.mixinextras.utils.ProxyUtils;
import java.lang.reflect.InvocationTargetException;

public interface LateApplyingInjectorInfo {
   void lateInject();

   void latePostInject();

   void wrap(LateApplyingInjectorInfo var1);

   String getLateInjectionType();

   @Deprecated
   default void lateApply() {
      this.lateInject();
      MixinExtrasLogger var1 = MixinExtrasLogger.get("Sugar");
      var1.warn("Skipping post injection checks for {} since it is from 0.2.0-beta.1 and cannot be saved", this);
   }

   static boolean wrap(Object var0, LateApplyingInjectorInfo var1) {
      Class var2 = ClassUtils.getAllInterfaces(var0.getClass())
         .stream()
         .filter(var0x -> var0x.getName().endsWith(".LateApplyingInjectorInfo"))
         .findFirst()
         .orElse(null);
      if (var2 != null && MixinExtrasService.getInstance().isClassOwned(var2.getName())) {
         try {
            var0.getClass().getMethod("wrap", var2).invoke(var0, ProxyUtils.getProxy(var1, var2));
            return true;
         } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException var4) {
            throw new RuntimeException("Failed to wrap InjectionInfo: ", var4);
         }
      } else {
         return false;
      }
   }
}
