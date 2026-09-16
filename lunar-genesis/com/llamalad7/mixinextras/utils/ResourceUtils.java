package com.llamalad7.mixinextras.utils;

import java.io.InputStream;
import org.spongepowered.asm.service.MixinService;

class ResourceUtils {
   public static InputStream getResourceAsStream(String var0) {
      InputStream var1 = MixinService.getService().getResourceAsStream(var0);
      if (var1 != null) {
         return var1;
      }

      ClassLoader var2 = Thread.currentThread().getContextClassLoader();
      Thread.currentThread().setContextClassLoader(ResourceUtils.class.getClassLoader());

      try {
         return MixinService.getService().getResourceAsStream(var0);
      } finally {
         Thread.currentThread().setContextClassLoader(var2);
      }
   }
}
