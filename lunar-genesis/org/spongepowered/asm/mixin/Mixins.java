package org.spongepowered.asm.mixin;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import org.spongepowered.asm.launch.GlobalProperties;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigSource;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.transformer.ClassInfo;
import org.spongepowered.asm.mixin.transformer.Config;
import org.spongepowered.asm.service.MixinService;

public final class Mixins {
   private static final ILogger logger = MixinService.getService().getLogger("mixin");
   private static final GlobalProperties.Keys CONFIGS_KEY = GlobalProperties.Keys.of(GlobalProperties.Keys.CONFIGS + ".queue");
   private static final Set<String> errorHandlers = new LinkedHashSet<>();
   private static final Set<String> registeredConfigs = new HashSet<>();

   private Mixins() {
   }

   public static void addConfigurations(String... var0) {
      addConfigurations(var0, null);
   }

   public static void addConfigurations(String[] var0, IMixinConfigSource var1) {
      MixinEnvironment var2 = MixinEnvironment.getDefaultEnvironment();

      for (String var6 : var0) {
         createConfiguration(var6, var2, var1);
      }
   }

   public static void addConfiguration(String var0) {
      addConfiguration(var0, (IMixinConfigSource)null);
   }

   public static void addConfiguration(String var0, IMixinConfigSource var1) {
      createConfiguration(var0, MixinEnvironment.getDefaultEnvironment(), var1);
   }

   @Deprecated
   static void addConfiguration(String var0, MixinEnvironment var1) {
      createConfiguration(var0, var1, null);
   }

   private static void createConfiguration(String var0, MixinEnvironment var1, IMixinConfigSource var2) {
      Config var3 = null;

      try {
         var3 = Config.create(var0, var1, var2);
      } catch (Exception var5) {
         logger.error("Error encountered reading mixin config " + var0 + ": " + var5.getClass().getName() + " " + var5.getMessage(), var5);
      }

      registerConfiguration(var3);
   }

   private static void registerConfiguration(Config var0) {
      if (var0 != null && !registeredConfigs.contains(var0.getName())) {
         MixinEnvironment var1 = var0.getEnvironment();
         if (var1 != null) {
            var1.registerConfig(var0.getName());
         }

         getConfigs().add(var0);
         registeredConfigs.add(var0.getName());
         Config var2 = var0.getParent();
         if (var2 != null) {
            registerConfiguration(var2);
         }
      }
   }

   public static int getUnvisitedCount() {
      int var0 = 0;

      for (Config var2 : getConfigs()) {
         if (!var2.isVisited()) {
            var0++;
         }
      }

      return var0;
   }

   public static Set<Config> getConfigs() {
      Set var0 = GlobalProperties.get(CONFIGS_KEY);
      if (var0 == null) {
         var0 = new LinkedHashSet();
         GlobalProperties.put(CONFIGS_KEY, var0);
      }

      return var0;
   }

   public static Set<IMixinInfo> getMixinsForClass(String var0) {
      ClassInfo var1 = ClassInfo.fromCache(var0);
      return var1 != null ? var1.getAppliedMixins() : Collections.emptySet();
   }

   public static void registerErrorHandlerClass(String var0) {
      if (var0 != null) {
         errorHandlers.add(var0);
      }
   }

   public static Set<String> getErrorHandlerClasses() {
      return Collections.unmodifiableSet(errorHandlers);
   }
}
