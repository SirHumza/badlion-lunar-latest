package org.spongepowered.asm.mixin.injection.selectors.throwables;

import org.spongepowered.asm.mixin.injection.selectors.ITargetSelector;
import org.spongepowered.asm.mixin.throwables.MixinException;

public class SelectorException extends MixinException {
   private final ITargetSelector selector;

   public SelectorException(ITargetSelector var1, String var2) {
      super(var2);
      this.selector = var1;
   }

   public SelectorException(ITargetSelector var1, Throwable var2) {
      super(var2);
      this.selector = var1;
   }

   public SelectorException(ITargetSelector var1, String var2, Throwable var3) {
      super(var2, var3);
      this.selector = var1;
   }

   public ITargetSelector getSelector() {
      return this.selector;
   }
}
