package org.spongepowered.asm.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.spongepowered.asm.launch.platform.IMixinPlatformAgent;
import org.spongepowered.asm.launch.platform.IMixinPlatformServiceAgent;
import org.spongepowered.asm.launch.platform.container.IContainerHandle;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.logging.LoggerAdapterDefault;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.util.IConsumer;
import org.spongepowered.asm.util.ReEntranceLock;
import org.spongepowered.include.com.google.common.collect.ImmutableList;

public abstract class MixinServiceAbstract implements IMixinService {
   protected static final String LAUNCH_PACKAGE = "org.spongepowered.asm.launch.";
   protected static final String MIXIN_PACKAGE = "org.spongepowered.asm.mixin.";
   protected static final String SERVICE_PACKAGE = "org.spongepowered.asm.service.";
   private static final Map<String, ILogger> loggers = new HashMap<>();
   protected final ReEntranceLock lock = new ReEntranceLock(1);
   private final Map<Class<IMixinInternal>, IMixinInternal> internals = new HashMap<>();
   private List<IMixinPlatformServiceAgent> serviceAgents;
   private String sideName;

   @Override
   public void prepare() {
   }

   @Override
   public MixinEnvironment.Phase getInitialPhase() {
      return MixinEnvironment.Phase.PREINIT;
   }

   @Override
   public MixinEnvironment.CompatibilityLevel getMinCompatibilityLevel() {
      return null;
   }

   @Override
   public MixinEnvironment.CompatibilityLevel getMaxCompatibilityLevel() {
      return null;
   }

   @Override
   public void offer(IMixinInternal var1) {
      this.registerInternal(var1, var1.getClass());
   }

   private void registerInternal(IMixinInternal var1, Class<?> var2) {
      for (Class var6 : var2.getInterfaces()) {
         if (var6 == IMixinInternal.class) {
            this.internals.put(var2, var1);
         }

         this.registerInternal(var1, var6);
      }
   }

   protected final <T extends IMixinInternal> T getInternal(Class<T> var1) {
      for (Class var3 : this.internals.keySet()) {
         if (var1.isAssignableFrom(var3)) {
            return (T)this.internals.get(var3);
         }
      }

      return null;
   }

   @Override
   public void init() {
      for (IMixinPlatformServiceAgent var2 : this.getServiceAgents()) {
         var2.init();
      }
   }

   @Override
   public void beginPhase() {
   }

   @Override
   public void checkEnv(Object var1) {
   }

   @Override
   public ReEntranceLock getReEntranceLock() {
      return this.lock;
   }

   @Override
   public Collection<IContainerHandle> getMixinContainers() {
      ImmutableList.Builder var1 = ImmutableList.builder();
      this.getContainersFromAgents(var1);
      return var1.build();
   }

   protected final void getContainersFromAgents(ImmutableList.Builder<IContainerHandle> var1) {
      for (IMixinPlatformServiceAgent var3 : this.getServiceAgents()) {
         Collection var4 = var3.getMixinContainers();
         if (var4 != null) {
            var1.addAll(var4);
         }
      }
   }

   @Override
   public final String getSideName() {
      if (this.sideName != null) {
         return this.sideName;
      }

      for (IMixinPlatformServiceAgent var2 : this.getServiceAgents()) {
         try {
            String var3 = var2.getSideName();
            if (var3 != null) {
               return this.sideName = var3;
            }
         } catch (Exception var4) {
            this.getLogger("mixin").catching(var4);
         }
      }

      return "UNKNOWN";
   }

   private List<IMixinPlatformServiceAgent> getServiceAgents() {
      if (this.serviceAgents != null) {
         return this.serviceAgents;
      }

      this.serviceAgents = new ArrayList<>();

      for (String var2 : this.getPlatformAgents()) {
         try {
            Class var3 = this.getClassProvider().findClass(var2, false);
            IMixinPlatformAgent var4 = (IMixinPlatformAgent)var3.getDeclaredConstructor().newInstance();
            if (var4 instanceof IMixinPlatformServiceAgent) {
               this.serviceAgents.add((IMixinPlatformServiceAgent)var4);
            }
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      }

      return this.serviceAgents;
   }

   @Override
   public synchronized ILogger getLogger(String var1) {
      ILogger var2 = loggers.get(var1);
      if (var2 == null) {
         loggers.put(var1, var2 = this.createLogger(var1));
      }

      return var2;
   }

   protected ILogger createLogger(String var1) {
      return new LoggerAdapterDefault(var1);
   }

   @Deprecated
   public void wire(MixinEnvironment.Phase var1, IConsumer<MixinEnvironment.Phase> var2) {
      for (IMixinPlatformServiceAgent var4 : this.getServiceAgents()) {
         var4.wire(var1, var2);
      }
   }

   @Deprecated
   public void unwire() {
      for (IMixinPlatformServiceAgent var2 : this.getServiceAgents()) {
         var2.unwire();
      }
   }
}
