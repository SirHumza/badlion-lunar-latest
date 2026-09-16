package org.spongepowered.asm.mixin.injection.struct;

import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.invoke.ModifyArgsInjector;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;

@InjectionInfo.AnnotationType(ModifyArgs.class)
@InjectionInfo.HandlerPrefix("args")
@InjectionInfo.InjectorOrder(1000)
public class ModifyArgsInjectionInfo extends InjectionInfo {
   public ModifyArgsInjectionInfo(MixinTargetContext var1, MethodNode var2, AnnotationNode var3) {
      super(var1, var2, var3);
   }

   @Override
   protected Injector parseInjector(AnnotationNode var1) {
      return new ModifyArgsInjector(this);
   }

   @Override
   protected String getDescription() {
      return "Multi-argument modifier method";
   }
}
