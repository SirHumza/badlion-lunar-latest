package com.llamalad7.mixinextras.ap;

import com.llamalad7.mixinextras.ap.expressions.DefinitionInfo;
import com.llamalad7.mixinextras.expression.Definition;
import com.llamalad7.mixinextras.expression.Definitions;
import com.llamalad7.mixinextras.expression.Expression;
import com.llamalad7.mixinextras.expression.Expressions;
import com.llamalad7.mixinextras.injector.ModifyExpressionValueInjectionInfo;
import com.llamalad7.mixinextras.injector.ModifyReceiverInjectionInfo;
import com.llamalad7.mixinextras.injector.ModifyReturnValueInjectionInfo;
import com.llamalad7.mixinextras.injector.WrapWithConditionV1InjectionInfo;
import com.llamalad7.mixinextras.injector.v2.WrapWithConditionInjectionInfo;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethodInjectionInfo;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationInjectionInfo;
import com.llamalad7.mixinextras.utils.MixinAPInternals;
import com.llamalad7.mixinextras.utils.MixinAPVersion;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.util.logging.MessageRouter;
import org.spongepowered.tools.obfuscation.mirror.AnnotationHandle;

public class MixinExtrasAP extends AbstractProcessor {
   private static final boolean MIXIN = setupMixin();
   private final List<DefinitionInfo> definitions = new ArrayList<>();

   private static boolean setupMixin() {
      try {
         MessageRouter.setMessager(new StdoutMessager());
         return true;
      } catch (NoClassDefFoundError var1) {
         return false;
      }
   }

   private static void registerInjectors() {
      InjectionInfo.register(ModifyExpressionValueInjectionInfo.class);
      InjectionInfo.register(ModifyReceiverInjectionInfo.class);
      InjectionInfo.register(ModifyReturnValueInjectionInfo.class);
      InjectionInfo.register(WrapMethodInjectionInfo.class);
      InjectionInfo.register(WrapOperationInjectionInfo.class);
      InjectionInfo.register(WrapWithConditionV1InjectionInfo.class);
      InjectionInfo.register(WrapWithConditionInjectionInfo.class);
   }

   @Override
   public boolean process(Set<? extends TypeElement> var1, RoundEnvironment var2) {
      if (!MIXIN) {
         return false;
      } else {
         MixinAPVersion.check(this.processingEnv);
         if (var2.processingOver()) {
            this.remapDefinitions();
            return true;
         } else {
            this.gatherDefinitions(var2);
            return true;
         }
      }
   }

   private void gatherDefinitions(RoundEnvironment var1) {
      for (Element var3 : var1.getElementsAnnotatedWith(Definition.class)) {
         AnnotationHandle var4 = AnnotationHandle.of(var3, Definition.class);
         this.registerDefinition(var3, var4);
      }

      for (Element var8 : var1.getElementsAnnotatedWith(Definitions.class)) {
         AnnotationHandle var9 = AnnotationHandle.of(var8, Definitions.class);

         for (AnnotationHandle var6 : var9.getAnnotationList("value")) {
            this.registerDefinition(var8, var6);
         }
      }
   }

   private void registerDefinition(Element var1, AnnotationHandle var2) {
      TypeElement var3 = (TypeElement)var1.getEnclosingElement();
      AnnotationHandle var4 = this.getInjectorAnnotation(var1);
      Boolean var5 = var2.getValue("remap");

      for (String var7 : var2.getList("method")) {
         this.definitions.add(new DefinitionInfo.Method(this.processingEnv, var3, (ExecutableElement)var1, var4, var7, var5));
      }

      for (String var9 : var2.getList("field")) {
         this.definitions.add(new DefinitionInfo.Field(this.processingEnv, var3, (ExecutableElement)var1, var4, var9, var5));
      }
   }

   private void remapDefinitions() {
      for (DefinitionInfo var2 : this.definitions) {
         var2.remap();
      }

      MixinAPInternals.writeReferences(this.processingEnv);
   }

   private AnnotationHandle getInjectorAnnotation(Element var1) {
      return InjectionInfo.getRegisteredAnnotations()
         .stream()
         .map(var1x -> AnnotationHandle.of(var1, (Class<? extends Annotation>)var1x))
         .filter(AnnotationHandle::exists)
         .findFirst()
         .orElseThrow(() -> new IllegalStateException("Could not find injector annotation on " + var1));
   }

   @Override
   public SourceVersion getSupportedSourceVersion() {
      return SourceVersion.latestSupported();
   }

   @Override
   public Set<String> getSupportedAnnotationTypes() {
      List var1 = Arrays.asList(Expression.class, Expressions.class, Definition.class, Definitions.class);
      return var1.stream().map(Class::getName).collect(Collectors.toSet());
   }

   static {
      if (MIXIN) {
         registerInjectors();
      }
   }
}
