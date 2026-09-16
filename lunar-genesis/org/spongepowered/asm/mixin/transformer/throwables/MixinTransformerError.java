package org.spongepowered.asm.mixin.transformer.throwables;

import org.spongepowered.asm.mixin.throwables.MixinError;

public class MixinTransformerError extends MixinError {
   public MixinTransformerError(String var1) {
      super(var1);
   }

   public MixinTransformerError(Throwable var1) {
      super(var1);
   }

   public MixinTransformerError(String var1, Throwable var2) {
      super(var1, var2);
   }
}
