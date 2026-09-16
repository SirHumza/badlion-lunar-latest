package org.spongepowered.asm.mixin.injection.struct;

import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.modify.LocalVariableDiscriminator;
import org.spongepowered.asm.mixin.injection.modify.ModifyVariableInjector;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;

@InjectionInfo.AnnotationType(ModifyVariable.class)
@InjectionInfo.HandlerPrefix("localvar")
@InjectionInfo.InjectorOrder(1000)
public class ModifyVariableInjectionInfo extends InjectionInfo {
   public ModifyVariableInjectionInfo(MixinTargetContext var1, MethodNode var2, AnnotationNode var3) {
      super(var1, var2, var3);
   }

   @Override
   protected Injector parseInjector(AnnotationNode var1) {
      return new ModifyVariableInjector(this, LocalVariableDiscriminator.parse(var1));
   }

   @Override
   protected String getDescription() {
      return "Variable modifier method";
   }
}
