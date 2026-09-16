package com.llamalad7.mixinextras.utils;

import org.spongepowered.asm.service.IGlobalPropertyService;
import org.spongepowered.asm.service.MixinService;

public class Blackboard {
   private static final IGlobalPropertyService SERVICE = MixinService.getGlobalPropertyService();

   public static <T> T get(String var0) {
      Object[] var1 = SERVICE.getProperty(SERVICE.resolveKey(var0));
      return (T)(var1 == null ? null : var1[0]);
   }

   public static void put(String var0, Object var1) {
      SERVICE.setProperty(SERVICE.resolveKey(var0), new Object[1]);
      ((Object[])SERVICE.getProperty(SERVICE.resolveKey(var0)))[0] = var1;
   }
}
