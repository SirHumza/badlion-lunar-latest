package org.spongepowered.asm.mixin.injection.struct;

import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.invoke.RedirectInjector;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;

@InjectionInfo.AnnotationType(Redirect.class)
@InjectionInfo.HandlerPrefix("redirect")
@InjectionInfo.InjectorOrder(10000)
public class RedirectInjectionInfo extends InjectionInfo {
   public RedirectInjectionInfo(MixinTargetContext var1, MethodNode var2, AnnotationNode var3) {
      super(var1, var2, var3);
   }

   @Override
   protected Injector parseInjector(AnnotationNode var1) {
      return new RedirectInjector(this);
   }

   @Override
   protected String getDescription() {
      return "Redirector";
   }
}
