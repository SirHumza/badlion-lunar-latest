package com.llamalad7.mixinextras.expression.impl.point;

import com.llamalad7.mixinextras.expression.impl.ExpressionService;
import com.llamalad7.mixinextras.expression.impl.flow.FlowContext;
import com.llamalad7.mixinextras.utils.CompatibilityHelper;
import com.llamalad7.mixinextras.utils.InjectorUtils;
import org.objectweb.asm.Type;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.transformer.ClassInfo;

class RuntimeExpressionService extends ExpressionService {
   @Override
   public RuntimeException makeInvalidInjectionException(InjectionInfo var1, String var2) {
      return CompatibilityHelper.makeInvalidInjectionException(var1, var2);
   }

   @Override
   public void decorateInjectorSpecific(InjectionNodes.InjectionNode var1, InjectionInfo var2, String var3, Object var4) {
      InjectorUtils.decorateInjectorSpecific(var1, var2, var3, var4);
   }

   @Override
   public Type getCommonSuperClass(FlowContext var1, Type var2, Type var3) {
      return ClassInfo.getCommonSuperClassOrInterface(var2, var3).getType();
   }
}
