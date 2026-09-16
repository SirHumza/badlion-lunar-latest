package org.spongepowered.asm.mixin;

import org.spongepowered.asm.mixin.extensibility.IMixinConfig;
import org.spongepowered.asm.mixin.injection.selectors.ISelectorContext;
import org.spongepowered.asm.mixin.refmap.IMixinContext;

public final class FabricUtil {
   public static final String KEY_MOD_ID = "fabric-modId";
   public static final String KEY_COMPATIBILITY = "fabric-compat";
   public static final int COMPATIBILITY_0_9_2 = 9002;
   public static final int COMPATIBILITY_0_10_0 = 10000;
   public static final int COMPATIBILITY_0_14_0 = 14000;
   public static final int COMPATIBILITY_0_16_5 = 16005;
   public static final int COMPATIBILITY_0_17_0 = 17000;
   public static final int COMPATIBILITY_0_17_1 = 17001;
   public static final int COMPATIBILITY_0_17_4 = 17004;
   public static final int COMPATIBILITY_LATEST = 17004;

   public static String getModId(IMixinConfig var0) {
      return getModId(var0, "(unknown)");
   }

   public static String getModId(IMixinConfig var0, String var1) {
      return getDecoration(var0, "fabric-modId", var1);
   }

   public static String getModId(ISelectorContext var0) {
      return getDecoration(getConfig(var0), "fabric-modId", "(unknown)");
   }

   public static int getCompatibility(ISelectorContext var0) {
      return getCompatibility(getConfig(var0));
   }

   public static int getCompatibility(IMixinContext var0) {
      return getCompatibility(var0.getMixin().getConfig());
   }

   public static int getCompatibility(IMixinConfig var0) {
      return getDecoration(var0, "fabric-compat", 17004);
   }

   private static IMixinConfig getConfig(ISelectorContext var0) {
      return var0.getMixin().getMixin().getConfig();
   }

   private static <T> T getDecoration(IMixinConfig var0, String var1, T var2) {
      return (T)(var0.hasDecoration(var1) ? var0.getDecoration(var1) : var2);
   }

   private FabricUtil() {
   }
}
