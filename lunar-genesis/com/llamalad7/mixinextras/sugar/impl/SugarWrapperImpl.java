package com.llamalad7.mixinextras.sugar.impl;

import com.llamalad7.mixinextras.lib.apache.commons.tuple.Pair;
import com.llamalad7.mixinextras.sugar.SugarBridge;
import com.llamalad7.mixinextras.sugar.impl.handlers.HandlerInfo;
import com.llamalad7.mixinextras.utils.CompatibilityHelper;
import com.llamalad7.mixinextras.utils.GenericParamParser;
import com.llamalad7.mixinextras.utils.MixinInternals;
import com.llamalad7.mixinextras.wrapper.InjectorWrapperImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.throwables.InjectionError;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.asm.MethodNodeEx;

public class SugarWrapperImpl extends InjectorWrapperImpl {
   private final InjectionInfo wrapperInfo;
   private final AnnotationNode originalAnnotation;
   private final List<AnnotationNode> sugarAnnotations;
   private final ArrayList<Type> generics;
   private final MethodNode handler;
   private final InjectionInfo delegate;
   private final SugarInjector sugarInjector;

   protected SugarWrapperImpl(InjectionInfo var1, MixinTargetContext var2, MethodNode var3, AnnotationNode var4) {
      super(var1, var2, var3, var4, true);
      this.wrapperInfo = var1;
      var3.visibleAnnotations.remove(var4);
      var3.visibleAnnotations.add(this.originalAnnotation = Annotations.getValue(var4, "original"));
      this.sugarAnnotations = Annotations.getValue(var4, "sugars");
      this.generics = new ArrayList<>(GenericParamParser.getParameterGenerics(var3.desc, Annotations.getValue(var4, "signature")));
      this.handler = this.prepareHandler(var3);
      this.sugarInjector = new SugarInjector(this.wrapperInfo, var2.getMixin(), this.handler, this.sugarAnnotations, this.generics);
      this.sugarInjector.stripSugar();
      this.delegate = InjectionInfo.parse(var2, this.handler);
      this.sugarInjector.setTargets(MixinInternals.getTargets(this.delegate));
      if (!this.isValid()) {
         this.sugarInjector.reSugarHandler();
      }
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
      super.prepare();
      this.sugarInjector.prepareSugar();
   }

   @Override
   protected void granularInject(InjectorWrapperImpl.HandlerCallCallback var1) {
      HashMap var2 = new HashMap();
      super.granularInject((var2x, var3, var4) -> {
         var1.onFound(var2x, var3, var4);
         var2.computeIfAbsent(var2x, var0x -> new ArrayList<>()).add(Pair.of(var3, var4));
      });
      this.sugarInjector.reSugarHandler();
      this.sugarInjector.transformHandlerCalls(var2);
   }

   @Override
   protected void doPostInject(Runnable var1) {
      try {
         super.doPostInject(var1);
      } catch (InvalidInjectionException | InjectionError var5) {
         InvalidInjectionException var2 = var5;

         for (SugarApplicationException var4 : this.sugarInjector.getExceptions()) {
            var2.addSuppressed(var4);
         }

         throw var2;
      }
   }

   private MethodNode prepareHandler(MethodNode var1) {
      IMixinInfo var2 = CompatibilityHelper.getMixin(this.wrapperInfo).getMixin();
      HandlerInfo var3 = SugarInjector.getHandlerInfo(var2, var1, this.sugarAnnotations, this.generics);
      if (var3 == null) {
         return var1;
      }

      MethodNodeEx var4 = new MethodNodeEx(var1.access, MethodNodeEx.getName(var1), var1.desc, var1.signature, var1.exceptions.toArray(new String[0]), var2);
      var1.accept(var4);
      var1.visibleAnnotations.remove(this.originalAnnotation);
      var4.name = var1.name;
      var4.tryCatchBlocks = null;
      var4.visitAnnotation(Type.getDescriptor(SugarBridge.class), false);
      var3.transformHandler(this.classNode, var4);
      var3.transformGenerics(this.generics);
      this.classNode.methods.add(var4);
      return var4;
   }
}
