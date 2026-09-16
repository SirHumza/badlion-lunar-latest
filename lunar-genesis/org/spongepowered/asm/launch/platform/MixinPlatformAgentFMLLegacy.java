package org.spongepowered.asm.launch.platform;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.launchwrapper.ITweaker;
import net.minecraft.launchwrapper.Launch;
import net.minecraft.launchwrapper.LaunchClassLoader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.spongepowered.asm.launch.GlobalProperties;
import org.spongepowered.asm.launch.platform.container.ContainerHandleURI;
import org.spongepowered.asm.launch.platform.container.IContainerHandle;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.extensibility.IRemapper;
import org.spongepowered.asm.service.mojang.MixinServiceLaunchWrapper;
import org.spongepowered.asm.util.IConsumer;

public class MixinPlatformAgentFMLLegacy extends MixinPlatformAgentAbstract implements IMixinPlatformServiceAgent {
   private static final Set<String> loadedCoreMods = new HashSet<>();
   private File file;
   private String fileName;
   private ITweaker coreModWrapper;
   private Class<?> clCoreModManager;
   private boolean initInjectionState;
   static MixinPlatformAgentFMLLegacy.MixinAppender appender;
   static Logger log;
   static Level oldLevel;

   @Override
   public IMixinPlatformAgent.AcceptResult accept(MixinPlatformManager var1, IContainerHandle var2) {
      if (this.getCoreModManagerClass() == null) {
         return IMixinPlatformAgent.AcceptResult.INVALID;
      } else if (var2 instanceof ContainerHandleURI && super.accept(var1, var2) == IMixinPlatformAgent.AcceptResult.ACCEPTED) {
         this.file = ((ContainerHandleURI)var2).getFile();
         this.fileName = this.file.getName();
         this.coreModWrapper = this.initFMLCoreMod();
         return this.coreModWrapper != null ? IMixinPlatformAgent.AcceptResult.ACCEPTED : IMixinPlatformAgent.AcceptResult.REJECTED;
      } else {
         return IMixinPlatformAgent.AcceptResult.REJECTED;
      }
   }

   private ITweaker initFMLCoreMod() {
      try {
         if ("true".equalsIgnoreCase(this.handle.getAttribute("ForceLoadAsMod"))) {
            MixinPlatformAgentAbstract.logger.debug("ForceLoadAsMod was specified for {}, attempting force-load", this.fileName);
            this.loadAsMod();
         }

         return this.injectCorePlugin();
      } catch (Exception var2) {
         MixinPlatformAgentAbstract.logger.catching(var2);
         return null;
      }
   }

   private void loadAsMod() {
      try {
         getIgnoredMods(this.clCoreModManager).remove(this.fileName);
      } catch (Exception var2) {
         MixinPlatformAgentAbstract.logger.catching(var2);
      }

      if (this.handle.getAttribute("FMLCorePluginContainsFMLMod") != null) {
         if (this.isIgnoredReparseable()) {
            MixinPlatformAgentAbstract.logger
               .debug("Ignoring request to add {} to reparseable coremod collection - it is a deobfuscated dependency", this.fileName);
            return;
         }

         this.addReparseableJar();
      }
   }

   private boolean isIgnoredReparseable() {
      return this.handle.toString().contains("deobfedDeps");
   }

   private void addReparseableJar() {
      try {
         Method var1 = this.clCoreModManager
            .getDeclaredMethod(GlobalProperties.getString(GlobalProperties.Keys.FML_GET_REPARSEABLE_COREMODS, "getReparseableCoremods"));
         List var2 = (List)var1.invoke(null);
         if (!var2.contains(this.fileName)) {
            MixinPlatformAgentAbstract.logger.debug("Adding {} to reparseable coremod collection", this.fileName);
            var2.add(this.fileName);
         }
      } catch (Exception var3) {
         MixinPlatformAgentAbstract.logger.catching(var3);
      }
   }

   private ITweaker injectCorePlugin() {
      String var1 = this.handle.getAttribute("FMLCorePlugin");
      if (var1 == null) {
         return null;
      } else if (this.isAlreadyInjected(var1)) {
         MixinPlatformAgentAbstract.logger.debug("{} has core plugin {}. Skipping because it was already injected.", this.fileName, var1);
         return null;
      } else {
         MixinPlatformAgentAbstract.logger.debug("{} has core plugin {}. Injecting it into FML for co-initialisation:", this.fileName, var1);
         Method var2 = this.clCoreModManager
            .getDeclaredMethod(
               GlobalProperties.getString(GlobalProperties.Keys.FML_LOAD_CORE_MOD, "loadCoreMod"), LaunchClassLoader.class, String.class, File.class
            );
         var2.setAccessible(true);
         ITweaker var3 = (ITweaker)var2.invoke(null, Launch.classLoader, var1, this.file);
         if (var3 == null) {
            MixinPlatformAgentAbstract.logger.debug("Core plugin {} could not be loaded.", var1);
            return null;
         } else {
            this.initInjectionState = isTweakerQueued("FMLInjectionAndSortingTweaker");
            loadedCoreMods.add(var1);
            return var3;
         }
      }
   }

   private boolean isAlreadyInjected(String var1) {
      if (loadedCoreMods.contains(var1)) {
         return true;
      }

      try {
         List var2 = GlobalProperties.get(MixinServiceLaunchWrapper.BLACKBOARD_KEY_TWEAKS);
         if (var2 == null) {
            return false;
         }

         for (ITweaker var4 : var2) {
            Class var5 = var4.getClass();
            if ("FMLPluginWrapper".equals(var5.getSimpleName())) {
               Field var6 = var5.getField("coreModInstance");
               var6.setAccessible(true);
               Object var7 = var6.get(var4);
               if (var1.equals(var7.getClass().getName())) {
                  return true;
               }
            }
         }
      } catch (Exception var8) {
      }

      return false;
   }

   @Override
   public String getPhaseProvider() {
      return MixinPlatformAgentFMLLegacy.class.getName() + "$PhaseProvider";
   }

   @Override
   public void prepare() {
      this.initInjectionState = this.initInjectionState | isTweakerQueued("FMLInjectionAndSortingTweaker");
   }

   @Override
   public void inject() {
      if (this.coreModWrapper != null && this.checkForCoInitialisation()) {
         MixinPlatformAgentAbstract.logger.debug("FML agent is co-initiralising coremod instance {} for {}", this.coreModWrapper, this.handle);
         this.coreModWrapper.injectIntoClassLoader(Launch.classLoader);
      }
   }

   protected final boolean checkForCoInitialisation() {
      boolean var1 = isTweakerQueued("FMLInjectionAndSortingTweaker");
      boolean var2 = isTweakerQueued("TerminalTweaker");
      if ((!this.initInjectionState || !var2) && !var1) {
         return !isTweakerQueued("FMLDeobfTweaker");
      }

      MixinPlatformAgentAbstract.logger.debug("FML agent is skipping co-init for {} because FML will inject it normally", this.coreModWrapper);
      return false;
   }

   private Class<?> getCoreModManagerClass() {
      if (this.clCoreModManager != null) {
         return this.clCoreModManager;
      }

      try {
         try {
            this.clCoreModManager = Class.forName(
               GlobalProperties.getString(GlobalProperties.Keys.FML_CORE_MOD_MANAGER, "net.minecraftforge.fml.relauncher.CoreModManager")
            );
         } catch (ClassNotFoundException var2) {
            this.clCoreModManager = Class.forName("cpw.mods.fml.relauncher.CoreModManager");
         }
      } catch (ClassNotFoundException var3) {
         MixinPlatformAgentAbstract.logger.info("FML platform manager could not load class {}. Proceeding without FML support.", var3.getMessage());
      }

      return this.clCoreModManager;
   }

   private static boolean isTweakerQueued(String var0) {
      for (String var2 : (List)GlobalProperties.get(MixinServiceLaunchWrapper.BLACKBOARD_KEY_TWEAKCLASSES)) {
         if (var2.endsWith(var0)) {
            return true;
         }
      }

      return false;
   }

   private static List<String> getIgnoredMods(Class<?> var0) {
      Method var1 = null;

      try {
         var1 = var0.getDeclaredMethod(GlobalProperties.getString(GlobalProperties.Keys.FML_GET_IGNORED_MODS, "getIgnoredMods"));
      } catch (NoSuchMethodException var5) {
         try {
            var1 = var0.getDeclaredMethod("getLoadedCoremods");
         } catch (NoSuchMethodException var4) {
            MixinPlatformAgentAbstract.logger.catching(org.spongepowered.asm.logging.Level.DEBUG, var4);
            return Collections.emptyList();
         }
      }

      return (List<String>)var1.invoke(null);
   }

   @Override
   public void init() {
      if (this.getCoreModManagerClass() != null) {
         this.injectRemapper();
      }
   }

   private void injectRemapper() {
      try {
         MixinPlatformAgentAbstract.logger.debug("Creating FML remapper adapter: {}", "org.spongepowered.asm.bridge.RemapperAdapterFML");
         Class var1 = Class.forName("org.spongepowered.asm.bridge.RemapperAdapterFML", true, Launch.classLoader);
         Method var2 = var1.getDeclaredMethod("create");
         IRemapper var3 = (IRemapper)var2.invoke(null);
         MixinEnvironment.getDefaultEnvironment().getRemappers().add(var3);
      } catch (Exception var4) {
         MixinPlatformAgentAbstract.logger.debug("Failed instancing FML remapper adapter, things will probably go horribly for notch-obf'd mods!");
      }
   }

   @Override
   public String getSideName() {
      List var1 = GlobalProperties.get(MixinServiceLaunchWrapper.BLACKBOARD_KEY_TWEAKS);
      if (var1 == null) {
         return null;
      }

      for (ITweaker var3 : var1) {
         if (var3.getClass().getName().endsWith(".common.launcher.FMLServerTweaker")) {
            return "SERVER";
         }

         if (var3.getClass().getName().endsWith(".common.launcher.FMLTweaker")) {
            return "CLIENT";
         }
      }

      String var4 = MixinPlatformAgentAbstract.invokeStringMethod(Launch.classLoader, "net.minecraftforge.fml.relauncher.FMLLaunchHandler", "side");
      return var4 != null ? var4 : MixinPlatformAgentAbstract.invokeStringMethod(Launch.classLoader, "cpw.mods.fml.relauncher.FMLLaunchHandler", "side");
   }

   @Override
   public Collection<IContainerHandle> getMixinContainers() {
      return null;
   }

   @Deprecated
   @Override
   public void wire(MixinEnvironment.Phase var1, IConsumer<MixinEnvironment.Phase> var2) {
      super.wire(var1, var2);
      if (var1 == MixinEnvironment.Phase.PREINIT) {
         begin(var2);
      }
   }

   @Deprecated
   @Override
   public void unwire() {
      end();
   }

   static void begin(IConsumer<MixinEnvironment.Phase> var0) {
      org.apache.logging.log4j.Logger var1 = LogManager.getLogger("FML");
      if (var1 instanceof Logger) {
         log = (Logger)var1;
         oldLevel = log.getLevel();
         appender = new MixinPlatformAgentFMLLegacy.MixinAppender(var0);
         appender.start();
         log.addAppender(appender);
         log.setLevel(Level.ALL);
      }
   }

   static void end() {
      if (log != null) {
         log.removeAppender(appender);
      }
   }

   static {
      for (String var3 : System.getProperty("fml.coreMods.load", "").split(",")) {
         if (!var3.isEmpty()) {
            MixinPlatformAgentAbstract.logger.debug("FML platform agent will ignore coremod {} specified on the command line", var3);
            loadedCoreMods.add(var3);
         }
      }

      oldLevel = null;
   }

   static class MixinAppender extends AbstractAppender {
      private final IConsumer<MixinEnvironment.Phase> delegate;

      MixinAppender(IConsumer<MixinEnvironment.Phase> var1) {
         super("MixinLogWatcherAppender", null, null);
         this.delegate = var1;
      }

      public void append(LogEvent var1) {
         if (var1.getLevel() == Level.DEBUG && "Validating minecraft".equals(var1.getMessage().getFormattedMessage())) {
            this.delegate.accept(MixinEnvironment.Phase.INIT);
            if (MixinPlatformAgentFMLLegacy.log.getLevel() == Level.ALL) {
               MixinPlatformAgentFMLLegacy.log.setLevel(MixinPlatformAgentFMLLegacy.oldLevel);
            }
         }
      }
   }
}
