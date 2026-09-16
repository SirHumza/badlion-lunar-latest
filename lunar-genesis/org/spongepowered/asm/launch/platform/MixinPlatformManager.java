package org.spongepowered.asm.launch.platform;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.spongepowered.asm.launch.platform.container.IContainerHandle;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigSource;
import org.spongepowered.asm.mixin.throwables.MixinError;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.service.ServiceVersionError;

public class MixinPlatformManager {
   private static final ILogger logger = MixinService.getService().getLogger("mixin");
   private final Map<IContainerHandle, MixinContainer> containers = new LinkedHashMap<>();
   private final MixinConnectorManager connectors = new MixinConnectorManager();
   private MixinContainer primaryContainer;
   private boolean prepared = false;
   private boolean injected;

   public void init() {
      logger.debug("Initialising Mixin Platform Manager");
      IContainerHandle var1 = MixinService.getService().getPrimaryContainer();
      this.primaryContainer = this.addContainer(var1);
      this.scanForContainers();
   }

   public Collection<String> getPhaseProviderClasses() {
      Collection var1 = this.primaryContainer.getPhaseProviders();
      return var1 != null ? Collections.unmodifiableCollection(var1) : Collections.emptyList();
   }

   public final MixinContainer addContainer(IContainerHandle var1) {
      MixinContainer var2 = this.containers.get(var1);
      if (var2 != null) {
         return var2;
      }

      MixinContainer var3 = this.createContainerFor(var1);
      this.containers.put(var1, var3);
      this.addNestedContainers(var1);
      return var3;
   }

   private MixinContainer createContainerFor(IContainerHandle var1) {
      logger.debug("Adding mixin platform agents for container {}", var1);
      MixinContainer var2 = new MixinContainer(this, var1);
      if (this.prepared) {
         var2.prepare();
      }

      return var2;
   }

   private void addNestedContainers(IContainerHandle var1) {
      for (IContainerHandle var3 : var1.getNestedContainers()) {
         if (!this.containers.containsKey(var3)) {
            this.addContainer(var3);
         }
      }
   }

   public final void prepare(CommandLineOptions var1) {
      this.prepared = true;

      for (MixinContainer var3 : this.containers.values()) {
         var3.prepare();
      }

      for (String var5 : var1.getConfigs()) {
         this.addConfig(var5, null);
      }
   }

   public final void inject() {
      if (!this.injected) {
         this.injected = true;
         if (this.primaryContainer != null) {
            this.primaryContainer.initPrimaryContainer();
         }

         this.scanForContainers();
         logger.debug("inject() running with {} agents", this.containers.size());

         for (MixinContainer var2 : this.containers.values()) {
            try {
               var2.inject();
            } catch (Exception var4) {
               var4.printStackTrace();
            }
         }

         this.connectors.inject();
      }
   }

   private void scanForContainers() {
      Object var1 = null;

      try {
         var1 = MixinService.getService().getMixinContainers();
      } catch (AbstractMethodError var7) {
         throw new ServiceVersionError("Mixin service is out of date");
      }

      for (IContainerHandle var4 : new ArrayList<>(this.containers.keySet())) {
         this.addNestedContainers(var4);
      }

      for (IContainerHandle var10 : var1) {
         try {
            logger.debug("Adding agents for Mixin Container {}", var10);
            this.addContainer(var10);
         } catch (Exception var6) {
            var6.printStackTrace();
         }
      }
   }

   public String getLaunchTarget() {
      return "net.minecraft.client.main.Main";
   }

   final void setCompatibilityLevel(String var1) {
      try {
         MixinEnvironment.CompatibilityLevel var2 = MixinEnvironment.CompatibilityLevel.valueOf(var1.toUpperCase(Locale.ROOT));
         logger.debug("Setting mixin compatibility level: {}", var2);
         MixinEnvironment.setCompatibilityLevel(var2);
      } catch (IllegalArgumentException var3) {
         logger.warn("Invalid compatibility level specified: {}", var1);
      }
   }

   final void addConfig(String var1, IMixinConfigSource var2) {
      if (var1.endsWith(".json")) {
         logger.debug("Registering mixin config: {} source={}", var1, var2);
         Mixins.addConfiguration(var1, var2);
      } else if (var1.contains(".json@")) {
         throw new MixinError("Setting config phase via manifest is no longer supported: " + var1 + ". Specify target in config instead");
      }
   }

   final void addTokenProvider(String var1) {
      if (var1.contains("@")) {
         String[] var2 = var1.split("@", 2);
         MixinEnvironment.Phase var3 = MixinEnvironment.Phase.forName(var2[1]);
         if (var3 != null) {
            logger.debug("Registering token provider class: {}", var2[0]);
            MixinEnvironment.getEnvironment(var3).registerTokenProviderClass(var2[0]);
         }
      } else {
         MixinEnvironment.getDefaultEnvironment().registerTokenProviderClass(var1);
      }
   }

   final void addConnector(String var1) {
      this.connectors.addConnector(var1);
   }
}
