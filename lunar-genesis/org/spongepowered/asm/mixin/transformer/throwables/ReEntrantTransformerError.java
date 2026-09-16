package org.spongepowered.asm.mixin.transformer.throwables;

public class ReEntrantTransformerError extends MixinTransformerError {
   public ReEntrantTransformerError(String var1) {
      super(var1);
   }

   public ReEntrantTransformerError(Throwable var1) {
      super(var1);
   }

   public ReEntrantTransformerError(String var1, Throwable var2) {
      super(var1, var2);
   }
}
