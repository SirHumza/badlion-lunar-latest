package org.spongepowered.asm.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.logging.LoggerAdapterConsole;
import org.spongepowered.include.com.google.common.base.Joiner;
import org.spongepowered.include.com.google.common.collect.ObjectArrays;

public final class MixinService {
   private static MixinService.LogBuffer logBuffer = new MixinService.LogBuffer();
   private static MixinService instance;
   private ServiceLoader<IMixinServiceBootstrap> bootstrapServiceLoader;
   private final Set<String> bootedServices = new HashSet<>();
   private ServiceLoader<IMixinService> serviceLoader;
   private IMixinService service = null;
   private IGlobalPropertyService propertyService;

   private MixinService() {
      this.runBootServices();
   }

   private void runBootServices() {
      String var1 = System.getProperty("mixin.bootstrapService");
      if (var1 != null) {
         try {
            IMixinServiceBootstrap var7 = (IMixinServiceBootstrap)Class.forName(var1).getConstructor().newInstance();
            var7.bootstrap();
            this.bootedServices.add(var7.getServiceClassName());
         } catch (ReflectiveOperationException var4) {
            throw new RuntimeException(var4);
         }
      } else {
         this.bootstrapServiceLoader = ServiceLoader.load(IMixinServiceBootstrap.class, this.getClass().getClassLoader());

         for (IMixinServiceBootstrap var3 : this.bootstrapServiceLoader) {
            try {
               var3.bootstrap();
               this.bootedServices.add(var3.getServiceClassName());
            } catch (ServiceInitialisationException var5) {
               logBuffer.debug("Mixin bootstrap service {} is not available: {}", var5.getStackTrace()[0].getClassName(), var5.getMessage());
            } catch (Throwable var6) {
               logBuffer.debug("Catching {}:{} initialising service", var6.getClass().getName(), var6.getMessage(), var6);
            }
         }
      }
   }

   private static MixinService getInstance() {
      if (instance == null) {
         instance = new MixinService();
      }

      return instance;
   }

   public static void boot() {
      getInstance();
   }

   public static IMixinService getService() {
      return getInstance().getServiceInstance();
   }

   private synchronized IMixinService getServiceInstance() {
      if (this.service == null) {
         try {
            this.service = this.initService();
            ILogger var1 = this.service.getLogger("mixin");
            logBuffer.flush(var1);
         } catch (Error var3) {
            ILogger var2 = getDefaultLogger();
            logBuffer.flush(var2);
            var2.error(var3.getMessage(), var3);
            throw var3;
         }
      }

      return this.service;
   }

   private IMixinService initService() {
      String var1 = System.getProperty("mixin.service");
      if (var1 != null) {
         try {
            IMixinService var11 = (IMixinService)Class.forName(var1).getConstructor().newInstance();
            if (!var11.isValid()) {
               throw new RuntimeException("invalid service " + var1 + " configured via system property");
            } else {
               return var11;
            }
         } catch (ReflectiveOperationException var8) {
            throw new RuntimeException(var8);
         }
      } else {
         this.serviceLoader = ServiceLoader.load(IMixinService.class, this.getClass().getClassLoader());
         Iterator var2 = this.serviceLoader.iterator();
         ArrayList var3 = new ArrayList();
         int var4 = 0;

         while (var2.hasNext()) {
            try {
               IMixinService var5 = (IMixinService)var2.next();
               if (this.bootedServices.contains(var5.getClass().getName())) {
                  logBuffer.debug("MixinService [{}] was successfully booted in {}", var5.getName(), this.getClass().getClassLoader());
               }

               if (var5.isValid()) {
                  return var5;
               }

               logBuffer.debug("MixinService [{}] is not valid", var5.getName());
               var3.add(String.format("INVALID[%s]", var5.getName()));
            } catch (ServiceConfigurationError var9) {
               var4++;
            } catch (Throwable var10) {
               String var6 = var10.getStackTrace()[0].getClassName();
               logBuffer.debug("MixinService [{}] failed initialisation: {}", var6, var10.getMessage());
               int var7 = var6.lastIndexOf(46);
               var3.add(String.format("ERROR[%s]", var7 < 0 ? var6 : var6.substring(var7 + 1)));
            }
         }

         String var12 = var4 == 0 ? "" : " and " + var4 + " other invalid services.";
         throw new ServiceNotAvailableError("No mixin host service is available. Services: " + Joiner.on(", ").join(var3) + var12);
      }
   }

   public static IGlobalPropertyService getGlobalPropertyService() {
      return getInstance().getGlobalPropertyServiceInstance();
   }

   private IGlobalPropertyService getGlobalPropertyServiceInstance() {
      if (this.propertyService == null) {
         this.propertyService = this.initPropertyService();
      }

      return this.propertyService;
   }

   private IGlobalPropertyService initPropertyService() {
      ServiceLoader var1 = ServiceLoader.load(IGlobalPropertyService.class, this.getClass().getClassLoader());
      Iterator var2 = var1.iterator();

      while (var2.hasNext()) {
         try {
            return (IGlobalPropertyService)var2.next();
         } catch (ServiceConfigurationError var4) {
         } catch (Throwable var5) {
         }
      }

      throw new ServiceNotAvailableError("No mixin global property service is available");
   }

   private static <T> T getDefaultLogger() {
      return (T)new LoggerAdapterConsole("mixin").setDebugStream(System.err);
   }

   static class LogBuffer {
      private final List<MixinService.LogBuffer.LogEntry> buffer = new ArrayList<>();
      private ILogger logger;

      synchronized void debug(String var1, Object... var2) {
         if (this.logger != null) {
            this.logger.debug(var1, var2);
         } else {
            this.buffer.add(new MixinService.LogBuffer.LogEntry(var1, var2, null));
         }
      }

      synchronized void flush(ILogger var1) {
         for (MixinService.LogBuffer.LogEntry var3 : this.buffer) {
            if (var3.t != null) {
               var1.debug(var3.message, ObjectArrays.concat(var3.params, var3.t));
            } else {
               var1.debug(var3.message, var3.params);
            }
         }

         this.buffer.clear();
         this.logger = var1;
      }

      public static class LogEntry {
         public String message;
         public Object[] params;
         public Throwable t;

         public LogEntry(String var1, Object[] var2, Throwable var3) {
            this.message = var1;
            this.params = var2;
            this.t = var3;
         }
      }
   }
}
