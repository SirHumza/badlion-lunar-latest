package org.spongepowered.asm.mixin.injection.selectors;

import org.spongepowered.asm.mixin.throwables.MixinException;

public class InvalidSelectorException extends MixinException {
   public InvalidSelectorException(String var1) {
      super(var1);
   }

   public InvalidSelectorException(Throwable var1) {
      super(var1);
   }

   public InvalidSelectorException(String var1, Throwable var2) {
      super(var1, var2);
   }
}
