package org.spongepowered.asm.mixin.transformer.throwables;

import org.spongepowered.asm.mixin.extensibility.IActivityContext;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.mixin.throwables.MixinException;

public class InvalidMixinException extends MixinException {
   private final IMixinInfo mixin;

   public InvalidMixinException(IMixinInfo var1, String var2) {
      super(var2);
      this.mixin = var1;
   }

   public InvalidMixinException(IMixinInfo var1, String var2, IActivityContext var3) {
      super(var2, var3);
      this.mixin = var1;
   }

   public InvalidMixinException(IMixinContext var1, String var2) {
      this(var1.getMixin(), var2);
   }

   public InvalidMixinException(IMixinContext var1, String var2, IActivityContext var3) {
      this(var1.getMixin(), var2, var3);
   }

   public InvalidMixinException(IMixinInfo var1, Throwable var2) {
      super(var2);
      this.mixin = var1;
   }

   public InvalidMixinException(IMixinInfo var1, Throwable var2, IActivityContext var3) {
      super(var2, var3);
      this.mixin = var1;
   }

   public InvalidMixinException(IMixinContext var1, Throwable var2) {
      this(var1.getMixin(), var2);
   }

   public InvalidMixinException(IMixinContext var1, Throwable var2, IActivityContext var3) {
      this(var1.getMixin(), var2, var3);
   }

   public InvalidMixinException(IMixinInfo var1, String var2, Throwable var3) {
      super(var2, var3);
      this.mixin = var1;
   }

   public InvalidMixinException(IMixinInfo var1, String var2, Throwable var3, IActivityContext var4) {
      super(var2, var3, var4);
      this.mixin = var1;
   }

   public InvalidMixinException(IMixinContext var1, String var2, Throwable var3) {
      super(var2, var3);
      this.mixin = var1.getMixin();
   }

   public InvalidMixinException(IMixinContext var1, String var2, Throwable var3, IActivityContext var4) {
      super(var2, var3, var4);
      this.mixin = var1.getMixin();
   }

   public IMixinInfo getMixin() {
      return this.mixin;
   }
}
