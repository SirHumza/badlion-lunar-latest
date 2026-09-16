package com.llamalad7.mixinextras.expression.impl;

import com.llamalad7.mixinextras.expression.impl.flow.FlowContext;
import org.objectweb.asm.Type;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;

public abstract class ExpressionService {
   private static ExpressionService instance;

   public static ExpressionService getInstance() {
      if (instance == null) {
         throw new UnsupportedOperationException("No service has been registered!");
      } else {
         return instance;
      }
   }

   public static void offerInstance(ExpressionService var0) {
      if (instance != null) {
         throw new UnsupportedOperationException(String.format("Cannot set service instance to %s because it is already set to %s!", var0, instance));
      }

      instance = var0;
   }

   public RuntimeException makeInvalidInjectionException(InjectionInfo var1, String var2) {
      throw runtimeOnly();
   }

   public void decorateInjectorSpecific(InjectionNodes.InjectionNode var1, InjectionInfo var2, String var3, Object var4) {
      throw runtimeOnly();
   }

   public abstract Type getCommonSuperClass(FlowContext var1, Type var2, Type var3);

   private static RuntimeException runtimeOnly() {
      return new UnsupportedOperationException("This operation is only supported at runtime!");
   }
}
