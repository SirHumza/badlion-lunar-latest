package org.spongepowered.asm.mixin;

public class MixinEnvProxy {
   public static void gotoDefaultPhase() {
      MixinEnvironment.gotoPhase(MixinEnvironment.Phase.DEFAULT);
   }
}
