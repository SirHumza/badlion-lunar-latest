package com.llamalad7.mixinextras.sugar.impl;

import com.llamalad7.mixinextras.injector.StackExtension;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;

class ShareSugarApplicator extends SugarApplicator {
   ShareSugarApplicator(InjectionInfo var1, SugarParameter var2) {
      super(var1, var2);
   }

   @Override
   void validate(Target var1, InjectionNodes.InjectionNode var2) {
   }

   @Override
   void prepare(Target var1, InjectionNodes.InjectionNode var2) {
   }

   @Override
   void inject(Target var1, InjectionNodes.InjectionNode var2, StackExtension var3) {
      ShareInfo var4 = ShareInfo.getOrCreate(var1, this.sugar, this.paramType, this.mixin, var3);
      var3.extra(1);
      var1.insns.insertBefore(var2.getCurrentTarget(), var4.load());
   }
}
