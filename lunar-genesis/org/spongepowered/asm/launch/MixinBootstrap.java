package org.spongepowered.asm.launch;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import org.spongepowered.asm.launch.platform.CommandLineOptions;
import org.spongepowered.asm.launch.platform.MixinPlatformManager;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.throwables.MixinError;
import org.spongepowered.asm.service.IMixinInternal;
import org.spongepowered.asm.service.IMixinService;
import org.spongepowered.asm.service.MixinService;

public abstract class MixinBootstrap {
   public static final String VERSION = "0.8.7";
   private static boolean initialised = false;
   private static boolean initState = true;
   private static ILogger logger = MixinService.getService().getLogger("mixin");
   private static MixinPlatformManager platform;

   private MixinBootstrap() {
   }

   @Deprecated
   public static void addProxy() {
      MixinService.getService().beginPhase();
   }

   public static MixinPlatformManager getPlatform() {
      if (platform == null) {
         Object var0 = GlobalProperties.get(GlobalProperties.Keys.PLATFORM_MANAGER);
         if (var0 instanceof MixinPlatformManager) {
            platform = (MixinPlatformManager)var0;
         } else {
            platform = new MixinPlatformManager();
            GlobalProperties.put(GlobalProperties.Keys.PLATFORM_MANAGER, platform);
            platform.init();
         }
      }

      return platform;
   }

   public static void init() {
      if (start()) {
         doInit(CommandLineOptions.defaultArgs());
      }
   }

   static boolean start() {
      if (isSubsystemRegistered()) {
         if (!checkSubsystemVersion()) {
            throw new MixinInitialisationError(
               "Mixin subsystem version " + getActiveSubsystemVersion() + " was already initialised. Cannot bootstrap version " + "0.8.7"
            );
         } else {
            return false;
         }
      } else {
         registerSubsystem("0.8.7");
         offerInternals();
         if (!initialised) {
            initialised = true;
            MixinEnvironment.Phase var0 = MixinService.getService().getInitialPhase();
            if (var0 == MixinEnvironment.Phase.DEFAULT) {
               logger.error("Initialising mixin subsystem after game pre-init phase! Some mixins may be skipped.");
               MixinEnvironment.init(var0);
               getPlatform().prepare(CommandLineOptions.defaultArgs());
               initState = false;
            } else {
               MixinEnvironment.init(var0);
            }

            MixinService.getService().beginPhase();
         }

         getPlatform();
         return true;
      }
   }

   static void doInit(CommandLineOptions var0) {
      if (!initialised) {
         if (isSubsystemRegistered()) {
            logger.warn("Multiple Mixin containers present, init suppressed for {}", "0.8.7");
         } else {
            throw new IllegalStateException("MixinBootstrap.doInit() called before MixinBootstrap.start()");
         }
      } else {
         getPlatform().getPhaseProviderClasses();
         if (initState) {
            getPlatform().prepare(var0);
            MixinService.getService().init();
         }
      }
   }

   static void inject() {
      getPlatform().inject();
   }

   private static boolean isSubsystemRegistered() {
      return GlobalProperties.get(GlobalProperties.Keys.INIT) != null;
   }

   private static boolean checkSubsystemVersion() {
      return "0.8.7".equals(getActiveSubsystemVersion());
   }

   private static Object getActiveSubsystemVersion() {
      Object var0 = GlobalProperties.get(GlobalProperties.Keys.INIT);
      return var0 != null ? var0 : "";
   }

   private static void registerSubsystem(String var0) {
      GlobalProperties.put(GlobalProperties.Keys.INIT, var0);
   }

   private static void offerInternals() {
      IMixinService var0 = MixinService.getService();

      try {
         for (IMixinInternal var2 : getInternals()) {
            var0.offer(var2);
         }
      } catch (AbstractMethodError var3) {
         var3.printStackTrace();
      }
   }

   private static List<IMixinInternal> getInternals() {
      ArrayList var0 = new ArrayList();

      try {
         Class var1 = Class.forName("org.spongepowered.asm.mixin.transformer.MixinTransformer$Factory");
         Constructor var2 = var1.getDeclaredConstructor();
         var2.setAccessible(true);
         var0.add((IMixinInternal)var2.newInstance());
         return var0;
      } catch (ReflectiveOperationException var3) {
         throw new MixinError(var3);
      }
   }

   static {
      MixinService.boot();
      MixinService.getService().prepare();
   }
}
