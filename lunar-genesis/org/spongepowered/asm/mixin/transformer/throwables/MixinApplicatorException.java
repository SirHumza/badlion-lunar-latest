package org.spongepowered.asm.mixin.transformer.throwables;

import org.spongepowered.asm.mixin.extensibility.IActivityContext;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.mixin.transformer.ActivityStack;

public class MixinApplicatorException extends InvalidMixinException {
   public MixinApplicatorException(IMixinInfo var1, String var2) {
      super(var1, var2, (ActivityStack)null);
   }

   public MixinApplicatorException(IMixinInfo var1, String var2, IActivityContext var3) {
      super(var1, var2, var3);
   }

   public MixinApplicatorException(IMixinContext var1, String var2) {
      super(var1, var2, (ActivityStack)null);
   }

   public MixinApplicatorException(IMixinContext var1, String var2, IActivityContext var3) {
      super(var1, var2, var3);
   }

   public MixinApplicatorException(IMixinInfo var1, String var2, Throwable var3) {
      super(var1, var2, var3, (ActivityStack)null);
   }

   public MixinApplicatorException(IMixinInfo var1, String var2, Throwable var3, IActivityContext var4) {
      super(var1, var2, var3, var4);
   }

   public MixinApplicatorException(IMixinContext var1, String var2, Throwable var3) {
      super(var1, var2, var3, (ActivityStack)null);
   }

   public MixinApplicatorException(IMixinContext var1, String var2, Throwable var3, IActivityContext var4) {
      super(var1, var2, var3, var4);
   }

   public MixinApplicatorException(IMixinInfo var1, Throwable var2) {
      super(var1, var2, (ActivityStack)null);
   }

   public MixinApplicatorException(IMixinInfo var1, Throwable var2, IActivityContext var3) {
      super(var1, var2, var3);
   }

   public MixinApplicatorException(IMixinContext var1, Throwable var2) {
      super(var1, var2, (ActivityStack)null);
   }

   public MixinApplicatorException(IMixinContext var1, Throwable var2, IActivityContext var3) {
      super(var1, var2, var3);
   }
}
