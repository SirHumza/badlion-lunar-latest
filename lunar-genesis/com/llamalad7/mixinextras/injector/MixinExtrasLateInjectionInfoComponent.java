package com.llamalad7.mixinextras.injector;

import com.llamalad7.mixinextras.utils.InjectorUtils;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;

@InjectionInfo.AnnotationType(ModifyExpressionValue.class)
@InjectionInfo.HandlerPrefix("modifyExpressionValue")
public class ModifyExpressionValueInjectionInfo extends MixinExtrasLateInjectionInfo {
   public ModifyExpressionValueInjectionInfo(MixinTargetContext var1, MethodNode var2, AnnotationNode var3) {
      super(var1, var2, var3);
   }

   @Override
   protected Injector parseInjector(AnnotationNode var1) {
      return new ModifyExpressionValueInjector(this);
   }

   @Override
   public void prepare() {
      super.prepare();
      InjectorUtils.checkForDupedNews(this.targetNodes);
   }

   @Override
   public String getLateInjectionType() {
      return "ModifyExpressionValue";
   }
}
