package org.spongepowered.asm.mixin.throwables;

public class MixinApplyError extends MixinError {
   public MixinApplyError(String var1) {
      super(var1);
   }

   public MixinApplyError(Throwable var1) {
      super(var1);
   }

   public MixinApplyError(String var1, Throwable var2) {
      super(var1, var2);
   }
}
