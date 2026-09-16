package org.spongepowered.asm.mixin.injection.selectors.throwables;

import org.spongepowered.asm.mixin.injection.selectors.ITargetSelector;

public class SelectorConstraintException extends SelectorException {
   public SelectorConstraintException(ITargetSelector var1, String var2) {
      super(var1, var2);
   }

   public SelectorConstraintException(ITargetSelector var1, Throwable var2) {
      super(var1, var2);
   }

   public SelectorConstraintException(ITargetSelector var1, String var2, Throwable var3) {
      super(var1, var2, var3);
   }
}
