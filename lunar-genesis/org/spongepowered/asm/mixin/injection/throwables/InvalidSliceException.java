package org.spongepowered.asm.mixin.injection.throwables;

import org.spongepowered.asm.mixin.injection.code.ISliceContext;
import org.spongepowered.asm.mixin.refmap.IMixinContext;

public class InvalidSliceException extends InvalidInjectionException {
   public InvalidSliceException(IMixinContext var1, String var2) {
      super(var1, var2);
   }

   public InvalidSliceException(ISliceContext var1, String var2) {
      super(var1.getMixin(), var2);
   }

   public InvalidSliceException(IMixinContext var1, Throwable var2) {
      super(var1, var2);
   }

   public InvalidSliceException(ISliceContext var1, Throwable var2) {
      super(var1.getMixin(), var2);
   }

   public InvalidSliceException(IMixinContext var1, String var2, Throwable var3) {
      super(var1, var2, var3);
   }

   public InvalidSliceException(ISliceContext var1, String var2, Throwable var3) {
      super(var1.getMixin(), var2, var3);
   }
}
