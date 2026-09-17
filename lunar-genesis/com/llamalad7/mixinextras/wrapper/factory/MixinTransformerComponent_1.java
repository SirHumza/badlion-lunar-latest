package com.llamalad7.mixinextras.wrapper.factory;

import com.llamalad7.mixinextras.transformer.MixinTransformer;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.util.Annotations;

public class FactoryRedirectWrapperMixinTransformer implements MixinTransformer {
   @Override
   public void transform(IMixinInfo var1, ClassNode var2) {
      for (MethodNode var4 : var2.methods) {
         AnnotationNode var5 = Annotations.getVisible(var4, Redirect.class);
         if (var5 != null) {
            for (AnnotationNode var8 : Annotations.getValue(var5, "at", true)) {
               String var9 = Annotations.getValue(var8);
               if ("NEW".equals(var9)) {
                  this.wrapInjectorAnnotation(var4, var5);
                  break;
               }
            }
         }
      }
   }

   private void wrapInjectorAnnotation(MethodNode var1, AnnotationNode var2) {
      AnnotationNode var3 = new AnnotationNode(Type.getDescriptor(FactoryRedirectWrapper.class));
      var3.visit("original", var2);
      var1.visibleAnnotations.remove(var2);
      var1.visibleAnnotations.add(var3);
   }
}
