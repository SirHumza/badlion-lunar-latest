package com.llamalad7.mixinextras.sugar.impl;

import com.llamalad7.mixinextras.injector.StackExtension;
import com.llamalad7.mixinextras.lib.apache.commons.tuple.Pair;
import com.llamalad7.mixinextras.service.MixinExtrasService;
import com.llamalad7.mixinextras.sugar.Cancellable;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.utils.ASMUtils;
import com.llamalad7.mixinextras.utils.CompatibilityHelper;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;

abstract class SugarApplicator {
   private static final Map<String, Class<? extends SugarApplicator>> MAP = new HashMap<>();
   protected final IMixinInfo mixin;
   protected final InjectionInfo info;
   protected final AnnotationNode sugar;
   protected final Type paramType;
   protected final Type paramGeneric;
   protected final int paramLvtIndex;
   protected final int paramIndex;

   SugarApplicator(InjectionInfo var1, SugarParameter var2) {
      this.mixin = CompatibilityHelper.getMixin(var1).getMixin();
      this.info = var1;
      this.sugar = var2.sugar;
      this.paramType = var2.type;
      this.paramGeneric = var2.genericType;
      this.paramLvtIndex = var2.lvtIndex;
      this.paramIndex = var2.paramIndex;
   }

   abstract void validate(Target var1, InjectionNodes.InjectionNode var2);

   abstract void prepare(Target var1, InjectionNodes.InjectionNode var2);

   abstract void inject(Target var1, InjectionNodes.InjectionNode var2, StackExtension var3);

   int postProcessingPriority() {
      throw new UnsupportedOperationException(
         String.format("Sugar type %s does not support post-processing! Please inform LlamaLad7!", ASMUtils.annotationToString(this.sugar))
      );
   }

   static SugarApplicator create(InjectionInfo var0, SugarParameter var1) {
      try {
         Class var2 = MAP.get(var1.sugar.desc);
         Constructor var3 = var2.getDeclaredConstructor(InjectionInfo.class, SugarParameter.class);
         return (SugarApplicator)var3.newInstance(var0, var1);
      } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException var4) {
         throw new RuntimeException(var4);
      }
   }

   static boolean isSugar(String var0) {
      return MAP.containsKey(var0);
   }

   static {
      for (Pair var2 : Arrays.asList(
         Pair.of(Cancellable.class, CancellableSugarApplicator.class),
         Pair.of(Local.class, LocalSugarApplicator.class),
         Pair.of(Share.class, ShareSugarApplicator.class)
      )) {
         for (String var4 : MixinExtrasService.getInstance().getAllClassNames(((Class)var2.getLeft()).getName())) {
            MAP.put('L' + var4.replace('.', '/') + ';', (Class<? extends SugarApplicator>)var2.getRight());
         }
      }
   }
}
