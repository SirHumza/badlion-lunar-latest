package org.spongepowered.asm.launch.platform;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.spongepowered.asm.launch.GlobalProperties;
import org.spongepowered.asm.launch.platform.container.IContainerHandle;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.service.MixinService;

public class MixinContainer {
   private static final List<String> agentClasses = new ArrayList<>();
   private static final ILogger logger;
   private final IContainerHandle handle;
   private final List<IMixinPlatformAgent> agents = new ArrayList<>();

   public MixinContainer(MixinPlatformManager var1, IContainerHandle var2) {
      this.handle = var2;
      Iterator var3 = agentClasses.iterator();

      while (var3.hasNext()) {
         String var4 = (String)var3.next();

         try {
            Class var5 = Class.forName(var4);
            String var11 = var5.getSimpleName();
            logger.debug("Instancing new {} for {}", var11, this.handle);
            IMixinPlatformAgent var7 = (IMixinPlatformAgent)var5.getDeclaredConstructor().newInstance();
            IMixinPlatformAgent.AcceptResult var8 = var7.accept(var1, this.handle);
            if (var8 == IMixinPlatformAgent.AcceptResult.ACCEPTED) {
               this.agents.add(var7);
            } else if (var8 == IMixinPlatformAgent.AcceptResult.INVALID) {
               var3.remove();
               continue;
            }

            logger.debug("{} {} container {}", var11, var8.name().toLowerCase(Locale.ROOT), this.handle);
         } catch (InstantiationException var9) {
            Throwable var6 = var9.getCause();
            if (var6 instanceof RuntimeException) {
               throw (RuntimeException)var6;
            }

            throw new RuntimeException(var6);
         } catch (ReflectiveOperationException var10) {
            logger.catching(var10);
         }
      }
   }

   public IContainerHandle getDescriptor() {
      return this.handle;
   }

   public Collection<String> getPhaseProviders() {
      ArrayList var1 = new ArrayList();

      for (IMixinPlatformAgent var3 : this.agents) {
         String var4 = var3.getPhaseProvider();
         if (var4 != null) {
            var1.add(var4);
         }
      }

      return var1;
   }

   public void prepare() {
      for (IMixinPlatformAgent var2 : this.agents) {
         logger.debug("Processing prepare() for {}", var2);
         var2.prepare();
      }
   }

   public void initPrimaryContainer() {
      for (IMixinPlatformAgent var2 : this.agents) {
         logger.debug("Processing launch tasks for {}", var2);
         var2.initPrimaryContainer();
      }
   }

   public void inject() {
      for (IMixinPlatformAgent var2 : this.agents) {
         logger.debug("Processing inject() for {}", var2);
         var2.inject();
      }
   }

   static {
      GlobalProperties.put(GlobalProperties.Keys.AGENTS, agentClasses);

      for (String var1 : MixinService.getService().getPlatformAgents()) {
         agentClasses.add(var1);
      }

      agentClasses.add("org.spongepowered.asm.launch.platform.MixinPlatformAgentDefault");
      logger = MixinService.getService().getLogger("mixin");
   }
}
