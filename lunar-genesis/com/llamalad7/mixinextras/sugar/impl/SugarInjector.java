package com.llamalad7.mixinextras.sugar.impl;

import com.llamalad7.mixinextras.injector.StackExtension;
import com.llamalad7.mixinextras.lib.apache.commons.tuple.Pair;
import com.llamalad7.mixinextras.service.MixinExtrasService;
import com.llamalad7.mixinextras.sugar.impl.handlers.HandlerInfo;
import com.llamalad7.mixinextras.sugar.impl.handlers.HandlerTransformer;
import com.llamalad7.mixinextras.utils.ASMUtils;
import com.llamalad7.mixinextras.utils.MixinInternals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.util.Bytecode;

class SugarInjector {
   private final InjectionInfo injectionInfo;
   private final IMixinInfo mixin;
   private final MethodNode handler;
   private final List<AnnotationNode> sugarAnnotations;
   private final List<Type> parameterGenerics;
   private Map<Target, List<InjectionNodes.InjectionNode>> targets;
   private final List<SugarParameter> strippedSugars = new ArrayList<>();
   private final List<SugarApplicator> applicators = new ArrayList<>();
   private final List<SugarApplicationException> exceptions = new ArrayList<>();

   SugarInjector(InjectionInfo var1, IMixinInfo var2, MethodNode var3, List<AnnotationNode> var4, List<Type> var5) {
      this.injectionInfo = var1;
      this.mixin = var2;
      this.handler = var3;
      this.sugarAnnotations = var4;
      this.parameterGenerics = var5;
   }

   void setTargets(Map<Target, List<InjectionNodes.InjectionNode>> var1) {
      this.targets = var1;
   }

   static void prepareMixin(IMixinInfo var0, ClassNode var1) {
      for (MethodNode var3 : var1.methods) {
         if (hasSugar(var3)) {
            wrapInjectorAnnotation(var0, var3);
         }
      }
   }

   static HandlerInfo getHandlerInfo(IMixinInfo var0, MethodNode var1, List<AnnotationNode> var2, List<Type> var3) {
      ArrayList var4 = new ArrayList();

      for (SugarParameter var6 : findSugars(var1, var2, var3)) {
         HandlerTransformer var7 = HandlerTransformer.create(var0, var6);
         if (var7 != null && var7.isRequired(var1)) {
            var4.add(var7);
         }
      }

      if (var4.isEmpty()) {
         return null;
      }

      HandlerInfo var8 = new HandlerInfo();

      for (HandlerTransformer var10 : var4) {
         var10.transform(var8);
      }

      return var8;
   }

   private static boolean hasSugar(MethodNode var0) {
      List[] var1 = var0.invisibleParameterAnnotations;
      if (var1 == null) {
         return false;
      }

      for (List var5 : var1) {
         if (isSugar(var5)) {
            return true;
         }
      }

      return false;
   }

   private static boolean isSugar(List<AnnotationNode> var0) {
      if (var0 == null) {
         return false;
      }

      for (AnnotationNode var2 : var0) {
         if (SugarApplicator.isSugar(var2.desc)) {
            return true;
         }
      }

      return false;
   }

   private static void wrapInjectorAnnotation(IMixinInfo var0, MethodNode var1) {
      AnnotationNode var2 = InjectionInfo.getInjectorAnnotation(var0, var1);
      if (var2 != null) {
         List var3 = stripSugarAnnotations(var1);
         Type var4 = Type.getType(var2.desc);
         if (MixinExtrasService.getInstance().isClassOwned(var4.getClassName()) && var4.getInternalName().endsWith("WrapMethod")) {
            var2.visit("sugars", var3);
         } else {
            AnnotationNode var5 = new AnnotationNode(Type.getDescriptor(SugarWrapper.class));
            var5.visit("original", var2);
            var5.visit("signature", var1.signature == null ? "" : var1.signature);
            var5.visit("sugars", var3);
            var1.visibleAnnotations.remove(var2);
            var1.visibleAnnotations.add(var5);
         }
      }
   }

   private static List<AnnotationNode> stripSugarAnnotations(MethodNode var0) {
      ArrayList var1 = new ArrayList();

      for (List var5 : var0.invisibleParameterAnnotations) {
         AnnotationNode var6 = findSugar(var5);
         if (var6 != null) {
            var1.add(var6);
            var5.remove(var6);
         } else {
            var1.add(new AnnotationNode(Type.getDescriptor(Deprecated.class)));
         }
      }

      return var1;
   }

   void stripSugar() {
      this.strippedSugars.addAll(findSugars(this.handler, this.sugarAnnotations, this.parameterGenerics));
      ArrayList var1 = new ArrayList();
      boolean var2 = false;
      int var3 = 0;

      for (Type var7 : Type.getArgumentTypes(this.handler.desc)) {
         if (!SugarApplicator.isSugar(this.sugarAnnotations.get(var3).desc)) {
            if (var2) {
               throw new IllegalStateException(String.format("Found non-trailing sugared parameters on %s", this.handler.name + this.handler.desc));
            }

            var1.add(var7);
         } else {
            var2 = true;
         }

         var3++;
      }

      this.handler.desc = Type.getMethodDescriptor(Type.getReturnType(this.handler.desc), var1.toArray(new Type[0]));
   }

   void prepareSugar() {
      this.makeApplicators();
      this.validateApplicators();
      this.prepareApplicators();
   }

   private void makeApplicators() {
      for (SugarParameter var2 : this.strippedSugars) {
         SugarApplicator var3 = SugarApplicator.create(this.injectionInfo, var2);
         this.applicators.add(var3);
      }
   }

   private void validateApplicators() {
      for (SugarApplicator var2 : this.applicators) {
         for (Entry var4 : this.targets.entrySet()) {
            Target var5 = (Target)var4.getKey();
            ListIterator var6 = ((List)var4.getValue()).listIterator();

            while (var6.hasNext()) {
               InjectionNodes.InjectionNode var7 = (InjectionNodes.InjectionNode)var6.next();

               try {
                  var2.validate(var5, var7);
               } catch (SugarApplicationException var9) {
                  this.exceptions
                     .add(
                        new SugarApplicationException(
                           String.format(
                              "Failed to validate sugar %s %s on method %s from mixin %s in target method %s at instruction %s",
                              ASMUtils.annotationToString(var2.sugar),
                              ASMUtils.typeToString(var2.paramType),
                              this.handler,
                              this.mixin,
                              var5,
                              var7
                           ),
                           var9
                        )
                     );
                  var6.remove();
               }
            }
         }
      }
   }

   private void prepareApplicators() {
      for (Entry var2 : this.targets.entrySet()) {
         Target var3 = (Target)var2.getKey();

         for (InjectionNodes.InjectionNode var5 : (List)var2.getValue()) {
            try {
               for (SugarApplicator var7 : this.applicators) {
                  var7.prepare(var3, var5);
               }
            } catch (Exception var8) {
               throw new SugarApplicationException(
                  String.format(
                     "Failed to prepare sugar for method %s from mixin %s in target method %s at instruction %s", this.handler, this.mixin, var3, var5
                  ),
                  var8
               );
            }
         }
      }
   }

   List<SugarApplicationException> getExceptions() {
      return this.exceptions;
   }

   void reSugarHandler() {
      ArrayList var1 = new ArrayList<>(Arrays.asList(Type.getArgumentTypes(this.handler.desc)));

      for (SugarParameter var3 : this.strippedSugars) {
         var1.add(var3.type);
      }

      this.handler.desc = Type.getMethodDescriptor(Type.getReturnType(this.handler.desc), var1.toArray(new Type[0]));
   }

   void transformHandlerCalls(Map<Target, List<Pair<InjectionNodes.InjectionNode, MethodInsnNode>>> var1) {
      for (Entry var3 : var1.entrySet()) {
         Target var4 = (Target)var3.getKey();
         StackExtension var5 = new StackExtension(var4);

         for (Pair var7 : (List)var3.getValue()) {
            InjectionNodes.InjectionNode var8 = (InjectionNodes.InjectionNode)var7.getLeft();
            MethodInsnNode var9 = (MethodInsnNode)var7.getRight();
            InjectionNodes.InjectionNode var10 = var4.addInjectionNode(var9);
            Map var11 = MixinInternals.getDecorations(var8);

            for (Entry var13 : var11.entrySet()) {
               if (((String)var13.getKey()).startsWith("mixinextras_persistent_")) {
                  var10.decorate((String)var13.getKey(), var13.getValue());
               }
            }

            try {
               for (SugarApplicator var16 : this.applicators) {
                  var16.inject(var4, var10, var5);
               }
            } catch (Exception var14) {
               throw new SugarApplicationException(
                  String.format("Failed to apply sugar to method %s from mixin %s in target method %s at instruction %s", this.handler, this.mixin, var4, var10),
                  var14
               );
            }

            var9.desc = this.handler.desc;
         }
      }
   }

   private static List<SugarParameter> findSugars(MethodNode var0, List<AnnotationNode> var1, List<Type> var2) {
      ArrayList var3 = new ArrayList();
      Type[] var4 = Type.getArgumentTypes(var0.desc);
      int var5 = 0;
      int var6 = Bytecode.isStatic(var0) ? 0 : 1;

      for (Type var10 : var4) {
         AnnotationNode var11 = (AnnotationNode)var1.get(var5);
         if (SugarApplicator.isSugar(var11.desc)) {
            var3.add(new SugarParameter(var11, var10, (Type)var2.get(var5), var6, var5));
         }

         var5++;
         var6 += var10.getSize();
      }

      return var3;
   }

   private static AnnotationNode findSugar(List<AnnotationNode> var0) {
      if (var0 == null) {
         return null;
      }

      AnnotationNode var1 = null;

      for (AnnotationNode var3 : var0) {
         if (SugarApplicator.isSugar(var3.desc)) {
            if (var1 != null) {
               throw new IllegalStateException(
                  "Found multiple sugars on the same parameter! Got " + var0.stream().map(ASMUtils::annotationToString).collect(Collectors.joining(" "))
               );
            }

            var1 = var3;
         }
      }

      return var1;
   }

   private static List<AnnotationNode> getParamAnnotations(MethodNode var0, int var1) {
      List[] var2 = var0.invisibleParameterAnnotations;
      return var2 != null && var2.length >= var1 ? var2[var1] : null;
   }
}
