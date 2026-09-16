package org.spongepowered.asm.mixin.injection.throwables;

import org.spongepowered.asm.mixin.extensibility.IActivityContext;
import org.spongepowered.asm.mixin.injection.selectors.ISelectorContext;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;

public class InvalidInjectionException extends InvalidMixinException {
   private final ISelectorContext selectorContext;

   public InvalidInjectionException(IMixinContext var1, String var2) {
      super(var1, var2);
      this.selectorContext = null;
   }

   public InvalidInjectionException(IMixinContext var1, String var2, IActivityContext var3) {
      super(var1, var2, var3);
      this.selectorContext = null;
   }

   public InvalidInjectionException(ISelectorContext var1, String var2) {
      super(var1.getMixin(), var2);
      this.selectorContext = var1;
   }

   public InvalidInjectionException(ISelectorContext var1, String var2, IActivityContext var3) {
      super(var1.getMixin(), var2, var3);
      this.selectorContext = var1;
   }

   public InvalidInjectionException(IMixinContext var1, Throwable var2) {
      super(var1, var2);
      this.selectorContext = null;
   }

   public InvalidInjectionException(IMixinContext var1, Throwable var2, IActivityContext var3) {
      super(var1, var2, var3);
      this.selectorContext = null;
   }

   public InvalidInjectionException(ISelectorContext var1, Throwable var2) {
      super(var1.getMixin(), var2);
      this.selectorContext = var1;
   }

   public InvalidInjectionException(ISelectorContext var1, Throwable var2, IActivityContext var3) {
      super(var1.getMixin(), var2, var3);
      this.selectorContext = var1;
   }

   public InvalidInjectionException(IMixinContext var1, String var2, Throwable var3) {
      super(var1, var2, var3);
      this.selectorContext = null;
   }

   public InvalidInjectionException(IMixinContext var1, String var2, Throwable var3, IActivityContext var4) {
      super(var1, var2, var3, var4);
      this.selectorContext = null;
   }

   public InvalidInjectionException(ISelectorContext var1, String var2, Throwable var3) {
      super(var1.getMixin(), var2, var3);
      this.selectorContext = var1;
   }

   public InvalidInjectionException(ISelectorContext var1, String var2, Throwable var3, IActivityContext var4) {
      super(var1.getMixin(), var2, var3, var4);
      this.selectorContext = var1;
   }

   public ISelectorContext getContext() {
      return this.selectorContext;
   }
}
