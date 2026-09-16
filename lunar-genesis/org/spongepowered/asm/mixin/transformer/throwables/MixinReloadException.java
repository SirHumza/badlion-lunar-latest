package org.spongepowered.asm.mixin.transformer.throwables;

import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.throwables.MixinException;

public class MixinReloadException extends MixinException {
   private final IMixinInfo mixinInfo;

   public MixinReloadException(IMixinInfo var1, String var2) {
      super(var2);
      this.mixinInfo = var1;
   }

   public IMixinInfo getMixinInfo() {
      return this.mixinInfo;
   }
}
