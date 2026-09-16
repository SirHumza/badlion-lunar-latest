package org.spongepowered.tools.obfuscation;

import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.tools.obfuscation.interfaces.IMessagerEx;

abstract class MixinObfuscationProcessor extends AbstractProcessor {
   protected AnnotatedMixins mixins;

   @Override
   public synchronized void init(ProcessingEnvironment var1) {
      super.init(var1);
      this.mixins = AnnotatedMixins.getMixinsForEnvironment(var1);
   }

   protected void processMixins(RoundEnvironment var1) {
      this.mixins.onPassStarted();

      for (Element var3 : var1.getElementsAnnotatedWith(Mixin.class)) {
         if (var3.getKind() != ElementKind.CLASS && var3.getKind() != ElementKind.INTERFACE && var3.getKind() != ElementKind.ENUM) {
            this.mixins
               .printMessage(IMessagerEx.MessageType.MIXIN_ON_INVALID_TYPE, "Found an @Mixin annotation on an element which is not a class or interface", var3);
         } else {
            this.mixins.registerMixin((TypeElement)var3);
         }
      }
   }

   protected void postProcess(RoundEnvironment var1) {
      this.mixins.onPassCompleted(var1);
   }

   @Override
   public SourceVersion getSupportedSourceVersion() {
      return SourceVersion.latestSupported();
   }

   @Override
   public Set<String> getSupportedOptions() {
      return SupportedOptions.getAllOptions();
   }
}
