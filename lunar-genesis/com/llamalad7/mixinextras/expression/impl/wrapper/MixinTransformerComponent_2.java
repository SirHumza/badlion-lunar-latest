package com.llamalad7.mixinextras.expression.impl.wrapper;

import com.llamalad7.mixinextras.expression.Expression;
import com.llamalad7.mixinextras.transformer.MixinTransformer;
import com.llamalad7.mixinextras.utils.ASMUtils;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;

public class ExpressionInjectorWrapperTransformer implements MixinTransformer {
   @Override
   public void transform(IMixinInfo var1, ClassNode var2) {
      for (MethodNode var4 : var2.methods) {
         if (ASMUtils.getRepeatedMEAnnotation(var4, Expression.class) != null) {
            AnnotationNode var5 = InjectionInfo.getInjectorAnnotation(var1, var4);
            this.wrapInjectorAnnotation(var4, var5);
         }
      }
   }

   private void wrapInjectorAnnotation(MethodNode var1, AnnotationNode var2) {
      AnnotationNode var3 = new AnnotationNode(Type.getDescriptor(ExpressionInjectorWrapper.class));
      var3.visit("original", var2);
      var1.visibleAnnotations.remove(var2);
      var1.visibleAnnotations.add(var3);
   }
}
