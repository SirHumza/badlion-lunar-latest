package org.spongepowered.asm.mixin.throwables;

import org.spongepowered.asm.mixin.extensibility.IActivityContext;

public class MixinException extends RuntimeException {
   private String activityDescriptor;

   public MixinException(String var1) {
      super(var1);
   }

   public MixinException(String var1, IActivityContext var2) {
      super(var1);
      this.activityDescriptor = var2 != null ? var2.toString() : null;
   }

   public MixinException(Throwable var1) {
      super(var1);
   }

   public MixinException(Throwable var1, IActivityContext var2) {
      super(var1);
      this.activityDescriptor = var2 != null ? var2.toString() : null;
   }

   public MixinException(String var1, Throwable var2) {
      super(var1, var2);
   }

   public MixinException(String var1, Throwable var2, IActivityContext var3) {
      super(var1, var2);
      this.activityDescriptor = var3 != null ? var3.toString() : null;
   }

   public void prepend(IActivityContext var1) {
      String var2 = var1.toString();
      this.activityDescriptor = this.activityDescriptor != null ? var2 + " -> " + this.activityDescriptor : " -> " + var2;
   }

   @Override
   public String getMessage() {
      String var1 = super.getMessage();
      return this.activityDescriptor != null ? var1 + " [" + this.activityDescriptor + "]" : var1;
   }
}
