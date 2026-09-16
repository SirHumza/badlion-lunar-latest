package com.llamalad7.mixinextras.sugar.impl.handlers;

import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.service.MixinExtrasService;
import com.llamalad7.mixinextras.sugar.impl.SugarParameter;
import com.llamalad7.mixinextras.sugar.impl.ref.LocalRefUtils;
import com.llamalad7.mixinextras.utils.ASMUtils;
import com.llamalad7.mixinextras.wrapper.factory.FactoryRedirectWrapper;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;

class LocalHandlerTransformer extends HandlerTransformer {
   private static final Set<String> TARGET_INJECTORS = new HashSet<>(
      Arrays.asList(Type.getDescriptor(ModifyConstant.class), Type.getDescriptor(Redirect.class), Type.getDescriptor(FactoryRedirectWrapper.class))
   );

   LocalHandlerTransformer(IMixinInfo var1, SugarParameter var2) {
      super(var1, var2);
   }

   @Override
   public boolean isRequired(MethodNode var1) {
      AnnotationNode var2 = InjectionInfo.getInjectorAnnotation(this.mixin, var1);
      return var2 != null
         && TARGET_INJECTORS.contains(var2.desc)
         && LocalRefUtils.getTargetType(this.parameter.type, this.parameter.genericType) == this.parameter.type;
   }

   @Override
   public void transform(HandlerInfo var1) {
      Type var2 = Type.getType(LocalRefUtils.getInterfaceFor(this.parameter.type));
      var1.wrapParameter(
         this.parameter,
         var2,
         ASMUtils.isPrimitive(this.parameter.type) ? null : this.parameter.type,
         (var1x, var2x) -> LocalRefUtils.generateUnwrapping(var1x, this.parameter.type, var2x)
      );
   }

   static {
      for (String var1 : MixinExtrasService.getInstance().getAllClassNames(WrapOperation.class.getName())) {
         TARGET_INJECTORS.add('L' + var1.replace('.', '/') + ';');
      }
   }
}
