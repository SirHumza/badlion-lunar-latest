package org.spongepowered.asm.mixin.transformer.throwables;

public class IllegalClassLoadError extends MixinTransformerError {
   public IllegalClassLoadError(String var1) {
      super(var1);
   }

   public IllegalClassLoadError(Throwable var1) {
      super(var1);
   }

   public IllegalClassLoadError(String var1, Throwable var2) {
      super(var1, var2);
   }
}
