package com.llamalad7.mixinextras.injector;

import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;

@InjectionInfo.AnnotationType(ModifyReceiver.class)
@InjectionInfo.HandlerPrefix("modifyReceiver")
public class ModifyReceiverInjectionInfo extends MixinExtrasInjectionInfo {
   public ModifyReceiverInjectionInfo(MixinTargetContext var1, MethodNode var2, AnnotationNode var3) {
      super(var1, var2, var3);
   }

   @Override
   protected Injector parseInjector(AnnotationNode var1) {
      return new ModifyReceiverInjector(this);
   }
}
