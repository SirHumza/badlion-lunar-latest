package org.spongepowered.asm.mixin.throwables;

public class MixinError extends Error {
   public MixinError() {
   }

   public MixinError(String var1) {
      super(var1);
   }

   public MixinError(Throwable var1) {
      super(var1);
   }

   public MixinError(String var1, Throwable var2) {
      super(var1, var2);
   }
}
