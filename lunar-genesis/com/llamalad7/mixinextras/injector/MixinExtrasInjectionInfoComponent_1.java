package com.llamalad7.mixinextras.injector;

import java.util.List;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;

public abstract class MixinExtrasLateInjectionInfo extends MixinExtrasInjectionInfo implements LateApplyingInjectorInfo {
   private LateApplyingInjectorInfo injectionInfoToQueue = this;
   private boolean hasInjectStarted = false;

   public MixinExtrasLateInjectionInfo(MixinTargetContext var1, MethodNode var2, AnnotationNode var3) {
      super(var1, var2, var3);
   }

   public MixinExtrasLateInjectionInfo(MixinTargetContext var1, MethodNode var2, AnnotationNode var3, String var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public void inject() {
      this.hasInjectStarted = true;
      int var1 = 0;

      for (List var3 : this.targetNodes.values()) {
         var1 += var3.size();
      }

      for (int var4 = 0; var4 < var1; var4++) {
         super.addCallbackInvocation(this.method);
      }

      LateInjectionApplicatorExtension.offerInjection(this.mixin.getTarget(), this.injectionInfoToQueue);
   }

   @Override
   public void postInject() {
   }

   @Override
   public void addCallbackInvocation(MethodNode var1) {
      if (!this.hasInjectStarted) {
         super.addCallbackInvocation(var1);
      }
   }

   @Override
   public void lateInject() {
      super.inject();
   }

   @Override
   public void latePostInject() {
      super.postInject();
   }

   @Override
   public void wrap(LateApplyingInjectorInfo var1) {
      this.injectionInfoToQueue = var1;
   }
}
