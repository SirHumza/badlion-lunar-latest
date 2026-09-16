package com.llamalad7.mixinextras.utils;

import org.spongepowered.asm.mixin.extensibility.IMixinConfig;

public class FabricMixinUtils {
   private static final String KEY_COMPATIBILITY = "fabric-compat";

   public static int getCompatibility(IMixinConfig var0) {
      return CompatibilityHelper.getDecoration(var0, "fabric-compat", 0);
   }
}
