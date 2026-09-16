package com.llamalad7.mixinextras.expression.impl.point;

import com.llamalad7.mixinextras.expression.Expression;
import com.llamalad7.mixinextras.transformer.MixinTransformer;
import com.llamalad7.mixinextras.utils.ASMUtils;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.util.Annotations;

public class ExpressionSliceMarkerTransformer implements MixinTransformer {
   @Override
   public void transform(IMixinInfo var1, ClassNode var2) {
      for (MethodNode var4 : var2.methods) {
         if (ASMUtils.getRepeatedMEAnnotation(var4, Expression.class) != null) {
            AnnotationNode var5 = InjectionInfo.getInjectorAnnotation(var1, var4);

            for (AnnotationNode var7 : Annotations.getValue(var5, "slice", true)) {
               this.markAt(Annotations.getValue(var7, "from"));
               this.markAt(Annotations.getValue(var7, "to"));
            }
         }
      }
   }

   private void markAt(AnnotationNode var1) {
      if (var1 != null && Annotations.getValue(var1).equals("MIXINEXTRAS:EXPRESSION")) {
         List var2 = Annotations.getValue(var1, "args");
         if (var2 == null) {
            var1.visit("args", var2 = new ArrayList());
         }

         var2.add("mixinextras_isInSlice=true");
      }
   }
}
