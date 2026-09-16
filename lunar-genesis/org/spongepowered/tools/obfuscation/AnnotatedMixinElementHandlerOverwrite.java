package org.spongepowered.tools.obfuscation;

import java.lang.reflect.Method;
import java.util.Locale;
import javax.lang.model.element.ExecutableElement;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.tools.obfuscation.interfaces.IMessagerEx;
import org.spongepowered.tools.obfuscation.interfaces.IMixinAnnotationProcessor;
import org.spongepowered.tools.obfuscation.mirror.AnnotationHandle;
import org.spongepowered.tools.obfuscation.mirror.MethodHandle;
import org.spongepowered.tools.obfuscation.mirror.TypeHandle;

class AnnotatedMixinElementHandlerOverwrite extends AnnotatedMixinElementHandler {
   AnnotatedMixinElementHandlerOverwrite(IMixinAnnotationProcessor var1, AnnotatedMixin var2) {
      super(var1, var2);
   }

   public void registerMerge(MethodHandle var1) {
      if (!var1.isImaginary()) {
         this.validateTargetMethod(
            var1.getElement(), null, new AnnotatedMixinElementHandler.AliasedElementName(var1, AnnotationHandle.MISSING), "overwrite", true, true
         );
      }
   }

   public void registerOverwrite(AnnotatedMixinElementHandlerOverwrite.AnnotatedElementOverwrite var1) {
      AnnotatedMixinElementHandler.AliasedElementName var2 = new AnnotatedMixinElementHandler.AliasedElementName(var1.getElement(), var1.getAnnotation());
      this.validateTargetMethod(var1.getElement(), var1.getAnnotation(), var2, "@Overwrite", true, false);
      this.checkConstraints(var1.getElement(), var1.getAnnotation());
      if (var1.shouldRemap()) {
         for (TypeHandle var4 : this.mixin.getTargets()) {
            if (!this.registerOverwriteForTarget(var1, var4)) {
               return;
            }
         }
      }

      if (!"true".equalsIgnoreCase(this.ap.getOption("disableOverwriteChecker"))) {
         String var5 = this.ap.getJavadocProvider().getJavadoc(var1.getElement());
         if (var5 == null) {
            this.ap.printMessage(IMessagerEx.MessageType.OVERWRITE_DOCS, "@Overwrite is missing javadoc comment", var1.getElement(), SuppressedBy.OVERWRITE);
            return;
         }

         if (!var5.toLowerCase(Locale.ROOT).contains("@author")) {
            this.ap.printMessage(IMessagerEx.MessageType.OVERWRITE_DOCS, "@Overwrite is missing an @author tag", var1.getElement(), SuppressedBy.OVERWRITE);
         }

         if (!var5.toLowerCase(Locale.ROOT).contains("@reason")) {
            this.ap.printMessage(IMessagerEx.MessageType.OVERWRITE_DOCS, "@Overwrite is missing an @reason tag", var1.getElement(), SuppressedBy.OVERWRITE);
         }
      }
   }

   private boolean registerOverwriteForTarget(AnnotatedMixinElementHandlerOverwrite.AnnotatedElementOverwrite var1, TypeHandle var2) {
      MappingMethod var3 = var2.getMappingMethod(var1.getSimpleName(), var1.getDesc());
      ObfuscationData var4 = this.obf.getDataProvider().getObfMethod(var3);
      if (var4.isEmpty()) {
         IMessagerEx.MessageType var5 = IMessagerEx.MessageType.NO_OBFDATA_FOR_OVERWRITE;

         try {
            Method var6 = var1.getElement().getClass().getMethod("isStatic");
            if ((Boolean)var6.invoke(var1.getElement())) {
               var5 = IMessagerEx.MessageType.NO_OBFDATA_FOR_STATIC_OVERWRITE;
            }
         } catch (Exception var7) {
         }

         this.ap.printMessage(var5, "Unable to locate obfuscation mapping for @Overwrite method", var1.getElement());
         return false;
      } else {
         try {
            this.addMethodMappings(var1.getSimpleName(), var1.getDesc(), var4);
            return true;
         } catch (Mappings.MappingConflictException var8) {
            var1.printMessage(
               this.ap,
               IMessagerEx.MessageType.OVERWRITE_MAPPING_CONFLICT,
               "Mapping conflict for @Overwrite method: "
                  + var8.getNew().getSimpleName()
                  + " for target "
                  + var2
                  + " conflicts with existing mapping "
                  + var8.getOld().getSimpleName()
            );
            return false;
         }
      }
   }

   static class AnnotatedElementOverwrite extends AnnotatedMixinElementHandler.AnnotatedElement<ExecutableElement> {
      private final boolean shouldRemap;

      public AnnotatedElementOverwrite(ExecutableElement var1, AnnotationHandle var2, boolean var3) {
         super(var1, var2);
         this.shouldRemap = var3;
      }

      public boolean shouldRemap() {
         return this.shouldRemap;
      }
   }
}
