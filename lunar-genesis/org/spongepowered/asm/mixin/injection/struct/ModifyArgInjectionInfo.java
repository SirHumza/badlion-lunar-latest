package org.spongepowered.asm.mixin.injection.struct;

import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.invoke.ModifyArgInjector;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;
import org.spongepowered.asm.util.Annotations;

@InjectionInfo.AnnotationType(ModifyArg.class)
@InjectionInfo.HandlerPrefix("modify")
@InjectionInfo.InjectorOrder(1000)
public class ModifyArgInjectionInfo extends InjectionInfo {
   public ModifyArgInjectionInfo(MixinTargetContext var1, MethodNode var2, AnnotationNode var3) {
      super(var1, var2, var3);
   }

   @Override
   protected Injector parseInjector(AnnotationNode var1) {
      int var2 = Annotations.getValue(var1, "index", -1);
      return new ModifyArgInjector(this, var2);
   }

   @Override
   protected String getDescription() {
      return "Argument modifier method";
   }
}
