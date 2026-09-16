package com.llamalad7.mixinextras.sugar.impl;

import com.llamalad7.mixinextras.wrapper.WrapperInjectionInfo;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;

@InjectionInfo.AnnotationType(SugarWrapper.class)
@InjectionInfo.HandlerPrefix("sugarWrapper")
public class SugarWrapperInjectionInfo extends WrapperInjectionInfo {
   public SugarWrapperInjectionInfo(MixinTargetContext var1, MethodNode var2, AnnotationNode var3) {
      super(SugarWrapperImpl::new, var1, var2, var3);
   }
}
