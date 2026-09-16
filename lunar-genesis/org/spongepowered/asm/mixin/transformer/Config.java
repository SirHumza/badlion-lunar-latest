package org.spongepowered.asm.mixin.transformer;

import java.util.HashMap;
import java.util.Map;
import org.spongepowered.asm.launch.MixinInitialisationError;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.extensibility.IMixinConfig;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigSource;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.include.com.google.common.base.Strings;

public class Config {
   private static final ILogger logger = MixinService.getService().getLogger("mixin");
   private static final Map<String, Config> allConfigs = new HashMap<>();
   private final String name;
   private final MixinConfig config;

   public Config(MixinConfig var1) {
      this.name = var1.getName();
      this.config = var1;
   }

   public String getName() {
      return this.name;
   }

   MixinConfig get() {
      return this.config;
   }

   public boolean isVisited() {
      return this.config.isVisited();
   }

   public IMixinConfig getConfig() {
      return this.config;
   }

   public MixinEnvironment getEnvironment() {
      return this.config.getEnvironment();
   }

   public Config getParent() {
      MixinConfig var1 = this.config.getParent();
      return var1 != null ? var1.getHandle() : null;
   }

   @Override
   public String toString() {
      return this.config.toString();
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof Config && this.name.equals(((Config)var1).name);
   }

   @Override
   public int hashCode() {
      return this.name.hashCode();
   }

   @Deprecated
   public static Config create(String var0, MixinEnvironment var1) {
      return create(var0, var1, null);
   }

   @Deprecated
   public static Config create(String var0, MixinEnvironment var1, IMixinConfigSource var2) {
      Config var3 = allConfigs.get(var0);
      if (var3 != null) {
         return var3;
      }

      try {
         var3 = MixinConfig.create(var0, var1, var2);
         if (var3 != null) {
            allConfigs.put(var3.getName(), var3);
         }
      } catch (Exception var8) {
         throw new MixinInitialisationError("Error initialising mixin config " + var0, var8);
      }

      if (var3 == null) {
         return null;
      }

      String var4 = var3.get().getParentName();
      if (!Strings.isNullOrEmpty(var4)) {
         Config var5;
         try {
            var5 = create(var4, var1, var2);
            if (var5 != null && !var3.get().assignParent(var5)) {
               var3 = null;
            }
         } catch (Throwable var7) {
            throw new MixinInitialisationError("Error initialising parent mixin config " + var4 + " of " + var0, var7);
         }

         if (var5 == null) {
            logger.error("Error encountered initialising mixin config {0}: The parent {1} could not be read.", var0, var4);
         }
      }

      return var3;
   }

   public static Config create(String var0, IMixinConfigSource var1) {
      return MixinConfig.create(var0, MixinEnvironment.getDefaultEnvironment(), var1);
   }
}
