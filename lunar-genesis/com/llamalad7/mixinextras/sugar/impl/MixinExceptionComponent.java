package com.llamalad7.mixinextras.sugar.impl;

import org.spongepowered.asm.mixin.throwables.MixinException;

public class SugarApplicationException extends MixinException {
   public SugarApplicationException(String var1) {
      super(var1);
   }

   public SugarApplicationException(String var1, Throwable var2) {
      super(var1, var2);
   }
}
