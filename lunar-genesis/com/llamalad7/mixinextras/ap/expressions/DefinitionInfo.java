package com.llamalad7.mixinextras.ap.expressions;

import com.llamalad7.mixinextras.utils.MixinAPInternals;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.AnnotationValueVisitor;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.tools.obfuscation.mirror.AnnotationHandle;

public abstract class DefinitionInfo {
   private final ProcessingEnvironment processingEnv;
   private final TypeElement mixin;
   private final ExecutableElement handler;
   private final AnnotationHandle injector;
   private final AnnotationHandle at;

   public DefinitionInfo(String var1, ProcessingEnvironment var2, TypeElement var3, ExecutableElement var4, AnnotationHandle var5, String var6, Boolean var7) {
      this.processingEnv = var2;
      this.mixin = var3;
      this.handler = var4;
      this.injector = var5;
      this.at = AnnotationHandle.of(new DefinitionInfo.SyntheticAt(var1, var6, var7));
   }

   public void remap() {
      MixinAPInternals.registerInjectionPoint(this.processingEnv, this.mixin, this.handler, this.injector, this.at);
   }

   public static class Field extends DefinitionInfo {
      public Field(ProcessingEnvironment var1, TypeElement var2, ExecutableElement var3, AnnotationHandle var4, String var5, Boolean var6) {
         super("FIELD", var1, var2, var3, var4, var5, var6);
      }
   }

   public static class Method extends DefinitionInfo {
      public Method(ProcessingEnvironment var1, TypeElement var2, ExecutableElement var3, AnnotationHandle var4, String var5, Boolean var6) {
         super("INVOKE", var1, var2, var3, var4, var5, var6);
      }
   }

   private class SyntheticAt implements AnnotationMirror {
      private final String type;
      private final String target;
      private final Boolean remap;
      private final DeclaredType atType;
      private final Map<? extends ExecutableElement, ? extends AnnotationValue> elementValues;

      public SyntheticAt(String var2, String var3, Boolean var4) {
         this.type = var2;
         this.target = var3;
         this.remap = var4;
         this.atType = DefinitionInfo.this.processingEnv
            .getTypeUtils()
            .getDeclaredType(DefinitionInfo.this.processingEnv.getElementUtils().getTypeElement(At.class.getName()));
         this.elementValues = this.makeElementValues();
      }

      @Override
      public DeclaredType getAnnotationType() {
         return this.atType;
      }

      @Override
      public Map<? extends ExecutableElement, ? extends AnnotationValue> getElementValues() {
         return this.elementValues;
      }

      private Map<? extends ExecutableElement, ? extends AnnotationValue> makeElementValues() {
         HashMap var1 = new HashMap();
         var1.put(this.getAtMethod("value"), this.makeStringConstant(this.type));
         var1.put(this.getAtMethod("target"), this.makeStringConstant(this.target));
         if (this.remap != null) {
            var1.put(this.getAtMethod("remap"), this.makeBooleanConstant(this.remap));
         }

         return var1;
      }

      private ExecutableElement getAtMethod(String var1) {
         for (Element var3 : this.atType.asElement().getEnclosedElements()) {
            if (var3 instanceof ExecutableElement && var3.getSimpleName().contentEquals(var1)) {
               return (ExecutableElement)var3;
            }
         }

         throw new IllegalStateException(String.format("Could not find method %s in At! Please inform LlamaLad7!", var1));
      }

      private AnnotationValue makeStringConstant(final String var1) {
         return new AnnotationValue() {
            @Override
            public Object getValue() {
               return var1;
            }

            @Override
            public String toString() {
               return '"' + var1 + '"';
            }

            @Override
            public <R, P> R accept(AnnotationValueVisitor<R, P> var1x, P var2) {
               return (R)var1x.visitString(var1, var2);
            }
         };
      }

      private AnnotationValue makeBooleanConstant(final boolean var1) {
         return new AnnotationValue() {
            @Override
            public Object getValue() {
               return var1;
            }

            @Override
            public String toString() {
               return Boolean.toString(var1);
            }

            @Override
            public <R, P> R accept(AnnotationValueVisitor<R, P> var1x, P var2) {
               return (R)var1x.visitBoolean(var1, var2);
            }
         };
      }
   }
}
