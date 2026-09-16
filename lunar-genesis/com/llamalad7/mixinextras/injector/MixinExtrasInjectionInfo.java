package com.llamalad7.mixinextras.injector;

import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;

public abstract class MixinExtrasInjectionInfo extends InjectionInfo {
   protected MixinExtrasInjectionInfo(MixinTargetContext var1, MethodNode var2, AnnotationNode var3) {
      super(var1, var2, var3);
   }

   protected MixinExtrasInjectionInfo(MixinTargetContext var1, MethodNode var2, AnnotationNode var3, String var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public String getSliceId(String var1) {
      return var1 == null ? "" : var1;
   }
}
