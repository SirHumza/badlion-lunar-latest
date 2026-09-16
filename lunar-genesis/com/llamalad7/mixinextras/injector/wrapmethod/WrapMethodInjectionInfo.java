package com.llamalad7.mixinextras.injector.wrapmethod;

import com.llamalad7.mixinextras.injector.MixinExtrasInjectionInfo;
import java.util.List;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;

@InjectionInfo.AnnotationType(WrapMethod.class)
@InjectionInfo.HandlerPrefix("wrapMethod")
public class WrapMethodInjectionInfo extends MixinExtrasInjectionInfo {
   public WrapMethodInjectionInfo(MixinTargetContext var1, MethodNode var2, AnnotationNode var3) {
      super(var1, var2, var3);
   }

   @Override
   protected Injector parseInjector(AnnotationNode var1) {
      return new WrapMethodInjector(this);
   }

   @Override
   protected void parseInjectionPoints(List<AnnotationNode> var1) {
      this.injectionPoints.add(new WrapMethodInjectionPoint());
   }
}
