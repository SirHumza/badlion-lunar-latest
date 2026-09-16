package org.spongepowered.asm.launch;

import org.spongepowered.asm.mixin.throwables.MixinError;

public class MixinInitialisationError extends MixinError {
   public MixinInitialisationError() {
   }

   public MixinInitialisationError(String var1) {
      super(var1);
   }

   public MixinInitialisationError(Throwable var1) {
      super(var1);
   }

   public MixinInitialisationError(String var1, Throwable var2) {
      super(var1, var2);
   }
}
