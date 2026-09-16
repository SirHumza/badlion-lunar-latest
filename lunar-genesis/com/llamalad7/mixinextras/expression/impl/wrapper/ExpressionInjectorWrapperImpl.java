package com.llamalad7.mixinextras.expression.impl.wrapper;

import com.llamalad7.mixinextras.expression.impl.point.ExpressionInjectionPoint;
import com.llamalad7.mixinextras.wrapper.InjectorWrapperImpl;
import com.llamalad7.mixinextras.wrapper.WrapperInjectionInfo;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;
import org.spongepowered.asm.util.Annotations;

public class ExpressionInjectorWrapperImpl extends InjectorWrapperImpl {
   private final MixinTargetContext targetContext;
   private final InjectionInfo delegate;
   private final MethodNode handler;

   protected ExpressionInjectorWrapperImpl(InjectionInfo var1, MixinTargetContext var2, MethodNode var3, AnnotationNode var4) {
      super(var1, var2, var3, var4, false);
      this.targetContext = var2;
      var3.visibleAnnotations.remove(var4);
      var3.visibleAnnotations.add(Annotations.getValue(var4, "original"));
      this.handler = var3;
      this.delegate = InjectionInfo.parse(var2, var3);
   }

   @Override
   protected InjectionInfo getDelegate() {
      return this.delegate;
   }

   @Override
   protected MethodNode getHandler() {
      return this.handler;
   }

   @Override
   protected void prepare() {
      InjectionInfo var1 = this.delegate;

      while (var1 instanceof WrapperInjectionInfo) {
         var1 = ((WrapperInjectionInfo)var1).getDelegate();
      }

      ExpressionInjectionPoint.withContext(var1, () -> super.prepare());
   }
}
