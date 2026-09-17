package com.llamalad7.mixinextras.transformer;

import com.llamalad7.mixinextras.expression.impl.point.ExpressionSliceMarkerTransformer;
import com.llamalad7.mixinextras.expression.impl.wrapper.ExpressionInjectorWrapperTransformer;
import com.llamalad7.mixinextras.lib.apache.commons.tuple.Pair;
import com.llamalad7.mixinextras.sugar.impl.SugarMixinTransformer;
import com.llamalad7.mixinextras.utils.MixinInternals;
import com.llamalad7.mixinextras.wrapper.factory.FactoryRedirectWrapperMixinTransformer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.transformer.ext.IExtension;
import org.spongepowered.asm.mixin.transformer.ext.ITargetClassContext;

public class MixinTransformerExtension implements IExtension {
   private final Set<ClassNode> preparedMixins = Collections.newSetFromMap(new WeakHashMap<>());
   private final List<MixinTransformer> transformers = Arrays.asList(
      new ExpressionSliceMarkerTransformer(),
      new FactoryRedirectWrapperMixinTransformer(),
      new SugarMixinTransformer(),
      new ExpressionInjectorWrapperTransformer()
   );

   @Override
   public boolean checkActive(MixinEnvironment var1) {
      return true;
   }

   @Override
   public void preApply(ITargetClassContext var1) {
      for (Pair var3 : MixinInternals.getMixinsFor(var1)) {
         IMixinInfo var4 = (IMixinInfo)var3.getLeft();
         ClassNode var5 = (ClassNode)var3.getRight();
         if (!this.preparedMixins.contains(var5)) {
            for (MixinTransformer var7 : this.transformers) {
               var7.transform(var4, var5);
            }

            this.preparedMixins.add(var5);
         }
      }
   }

   @Override
   public void postApply(ITargetClassContext var1) {
   }

   @Override
   public void export(MixinEnvironment var1, String var2, boolean var3, ClassNode var4) {
   }
}
