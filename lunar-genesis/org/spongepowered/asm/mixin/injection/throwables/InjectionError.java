package org.spongepowered.asm.mixin.injection.throwables;

import org.spongepowered.asm.mixin.throwables.MixinError;

public class InjectionError extends MixinError {
   public InjectionError() {
   }

   public InjectionError(String var1) {
      super(var1);
   }

   public InjectionError(Throwable var1) {
      super(var1);
   }

   public InjectionError(String var1, Throwable var2) {
      super(var1, var2);
   }
}
