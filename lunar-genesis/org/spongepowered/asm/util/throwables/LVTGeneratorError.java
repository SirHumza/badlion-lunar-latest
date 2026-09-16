package org.spongepowered.asm.util.throwables;

import org.spongepowered.asm.mixin.throwables.MixinError;

public class LVTGeneratorError extends MixinError {
   public LVTGeneratorError(String var1) {
      super(var1);
   }

   public LVTGeneratorError(String var1, Throwable var2) {
      super(var1, var2);
   }
}
