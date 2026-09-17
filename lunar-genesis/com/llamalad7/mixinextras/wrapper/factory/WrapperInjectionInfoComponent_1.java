package com.llamalad7.mixinextras.wrapper.factory;

import com.llamalad7.mixinextras.wrapper.WrapperInjectionInfo;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;

@InjectionInfo.AnnotationType(FactoryRedirectWrapper.class)
@InjectionInfo.HandlerPrefix("factoryWrapper")
public class FactoryRedirectWrapperInjectionInfo extends WrapperInjectionInfo {
   public FactoryRedirectWrapperInjectionInfo(MixinTargetContext var1, MethodNode var2, AnnotationNode var3) {
      super(FactoryRedirectWrapperImpl::new, var1, var2, var3);
   }
}
