package org.spongepowered.asm.mixin.injection.struct;

import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInjector;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.include.com.google.common.base.Strings;

@InjectionInfo.AnnotationType(Inject.class)
@InjectionInfo.InjectorOrder(1000)
public class CallbackInjectionInfo extends InjectionInfo {
   protected CallbackInjectionInfo(MixinTargetContext var1, MethodNode var2, AnnotationNode var3) {
      super(var1, var2, var3);
   }

   @Override
   protected Injector parseInjector(AnnotationNode var1) {
      boolean var2 = Annotations.getValue(var1, "cancellable", Boolean.FALSE);
      LocalCapture var3 = Annotations.getValue(var1, "locals", LocalCapture.class, LocalCapture.NO_CAPTURE);
      String var4 = Annotations.getValue(var1, "id", "");
      return new CallbackInjector(this, var2, var3, var4);
   }

   @Override
   public String getSliceId(String var1) {
      return Strings.nullToEmpty(var1);
   }
}
