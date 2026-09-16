package org.spongepowered.asm.mixin.transformer.ext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.service.ISyntheticClassRegistry;
import org.spongepowered.include.com.google.common.collect.ImmutableList;

public final class Extensions implements IExtensionRegistry {
   private final List<IExtension> extensions = new ArrayList<>();
   private final Map<Class<? extends IExtension>, IExtension> extensionMap = new HashMap<>();
   private final List<IClassGenerator> generators = new ArrayList<>();
   private final List<IClassGenerator> generatorsView = Collections.unmodifiableList(this.generators);
   private final Map<Class<? extends IClassGenerator>, IClassGenerator> generatorMap = new HashMap<>();
   private final ISyntheticClassRegistry syntheticClassRegistry;
   private List<IExtension> activeExtensions = Collections.emptyList();

   public Extensions(ISyntheticClassRegistry var1) {
      this.syntheticClassRegistry = var1;
   }

   public void add(IExtension var1) {
      this.extensions.add(var1);
      this.extensionMap.put((Class<? extends IExtension>)var1.getClass(), var1);
   }

   @Override
   public List<IExtension> getExtensions() {
      return Collections.unmodifiableList(this.extensions);
   }

   @Override
   public List<IExtension> getActiveExtensions() {
      return this.activeExtensions;
   }

   @Override
   public <T extends IExtension> T getExtension(Class<? extends IExtension> var1) {
      return lookup(var1, (Map<Class<? extends T>, T>)this.extensionMap, (List<T>)this.extensions);
   }

   @Override
   public ISyntheticClassRegistry getSyntheticClassRegistry() {
      return this.syntheticClassRegistry;
   }

   public void select(MixinEnvironment var1) {
      ImmutableList.Builder var2 = ImmutableList.builder();

      for (IExtension var4 : this.extensions) {
         if (var4.checkActive(var1)) {
            var2.add(var4);
         }
      }

      this.activeExtensions = var2.build();
   }

   public void preApply(ITargetClassContext var1) {
      for (IExtension var3 : this.activeExtensions) {
         var3.preApply(var1);
      }
   }

   public void postApply(ITargetClassContext var1) {
      for (IExtension var3 : this.activeExtensions) {
         var3.postApply(var1);
      }
   }

   public void export(MixinEnvironment var1, String var2, boolean var3, ClassNode var4) {
      for (IExtension var6 : this.activeExtensions) {
         var6.export(var1, var2, var3, var4);
      }
   }

   public void add(IClassGenerator var1) {
      this.generators.add(var1);
      this.generatorMap.put((Class<? extends IClassGenerator>)var1.getClass(), var1);
   }

   public List<IClassGenerator> getGenerators() {
      return this.generatorsView;
   }

   public <T extends IClassGenerator> T getGenerator(Class<? extends IClassGenerator> var1) {
      return lookup(var1, (Map<Class<? extends T>, T>)this.generatorMap, (List<T>)this.generators);
   }

   private static <T> T lookup(Class<? extends T> var0, Map<Class<? extends T>, T> var1, List<T> var2) {
      Object var3 = var1.get(var0);
      if (var3 == null) {
         for (Object var5 : var2) {
            if (var0.isAssignableFrom(var5.getClass())) {
               var3 = var5;
               break;
            }
         }

         if (var3 == null) {
            throw new IllegalArgumentException("Extension for <" + var0.getName() + "> could not be found");
         }

         var1.put(var0, var3);
      }

      return (T)var3;
   }
}
