package org.spongepowered.asm.mixin.transformer.throwables;

import org.spongepowered.asm.mixin.extensibility.IActivityContext;
import org.spongepowered.asm.mixin.throwables.MixinException;

public class MixinPreProcessorException extends MixinException {
   public MixinPreProcessorException(String var1, IActivityContext var2) {
      super(var1, var2);
   }

   public MixinPreProcessorException(String var1, Throwable var2, IActivityContext var3) {
      super(var1, var2, var3);
   }
}
