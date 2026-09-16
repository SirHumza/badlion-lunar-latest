package com.llamalad7.mixinextras.sugar.impl.handlers;

import com.llamalad7.mixinextras.lib.apache.commons.tuple.Pair;
import com.llamalad7.mixinextras.service.MixinExtrasService;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.impl.SugarParameter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

public abstract class HandlerTransformer {
   private static final Map<String, Class<? extends HandlerTransformer>> MAP = new HashMap<>();
   protected final IMixinInfo mixin;
   protected final SugarParameter parameter;

   HandlerTransformer(IMixinInfo var1, SugarParameter var2) {
      this.mixin = var1;
      this.parameter = var2;
   }

   public abstract boolean isRequired(MethodNode var1);

   public abstract void transform(HandlerInfo var1);

   public static HandlerTransformer create(IMixinInfo var0, SugarParameter var1) {
      try {
         Class var2 = MAP.get(var1.sugar.desc);
         if (var2 == null) {
            return null;
         }

         Constructor var3 = var2.getDeclaredConstructor(IMixinInfo.class, SugarParameter.class);
         return (HandlerTransformer)var3.newInstance(var0, var1);
      } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException var4) {
         throw new RuntimeException(var4);
      }
   }

   static {
      for (Pair var2 : Arrays.asList(Pair.of(Local.class, LocalHandlerTransformer.class))) {
         for (String var4 : MixinExtrasService.getInstance().getAllClassNames(((Class)var2.getLeft()).getName())) {
            MAP.put('L' + var4.replace('.', '/') + ';', (Class<? extends HandlerTransformer>)var2.getRight());
         }
      }
   }
}
