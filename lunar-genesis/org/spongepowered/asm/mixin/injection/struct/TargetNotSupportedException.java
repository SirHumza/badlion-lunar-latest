package org.spongepowered.asm.mixin.injection.struct;

import org.spongepowered.asm.mixin.injection.selectors.InvalidSelectorException;

public class TargetNotSupportedException extends InvalidSelectorException {
   public TargetNotSupportedException(String var1) {
      super(var1);
   }

   public TargetNotSupportedException(Throwable var1) {
      super(var1);
   }

   public TargetNotSupportedException(String var1, Throwable var2) {
      super(var1, var2);
   }
}
