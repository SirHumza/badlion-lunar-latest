package org.spongepowered.tools.obfuscation;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.tools.obfuscation.interfaces.IMessagerEx;
import org.spongepowered.tools.obfuscation.mirror.AnnotationHandle;
import org.spongepowered.tools.obfuscation.mirror.TypeUtils;

public class MixinObfuscationProcessorInjection extends MixinObfuscationProcessor {
   @Override
   public Set<String> getSupportedAnnotationTypes() {
      HashSet var1 = new HashSet();
      var1.add(At.class.getName());

      for (Class var3 : InjectionInfo.getRegisteredAnnotations()) {
         var1.add(var3.getName());
      }

      return var1;
   }

   @Override
   public boolean process(Set<? extends TypeElement> var1, RoundEnvironment var2) {
      if (var2.processingOver()) {
         this.postProcess(var2);
         return true;
      }

      this.processMixins(var2);

      for (Class var4 : InjectionInfo.getRegisteredAnnotations()) {
         this.processInjectors(var2, var4);
      }

      this.postProcess(var2);
      return true;
   }

   @Override
   protected void postProcess(RoundEnvironment var1) {
      super.postProcess(var1);

      try {
         this.mixins.writeReferences();
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   private void processInjectors(RoundEnvironment var1, Class<? extends Annotation> var2) {
      for (Element var4 : var1.getElementsAnnotatedWith(var2)) {
         Element var5 = var4.getEnclosingElement();
         if (!(var5 instanceof TypeElement)) {
            throw new IllegalStateException("@" + var2.getSimpleName() + " element has unexpected parent with type " + TypeUtils.getElementType(var5));
         }

         AnnotationHandle var6 = AnnotationHandle.of(var4, var2);
         if (var4.getKind() == ElementKind.METHOD) {
            this.mixins.registerInjector((TypeElement)var5, (ExecutableElement)var4, var6);
         } else {
            this.mixins
               .printMessage(
                  IMessagerEx.MessageType.INJECTOR_ON_NON_METHOD_ELEMENT,
                  "Found an @" + var2.getSimpleName() + " annotation on an element which is not a method: " + var4.toString()
               );
         }
      }
   }
}
