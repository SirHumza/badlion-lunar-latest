package org.spongepowered.asm.service.mojang;

import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import net.minecraft.launchwrapper.IClassNameTransformer;
import net.minecraft.launchwrapper.IClassTransformer;
import net.minecraft.launchwrapper.Launch;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.launch.GlobalProperties;
import org.spongepowered.asm.launch.platform.MainAttributes;
import org.spongepowered.asm.launch.platform.container.ContainerHandleURI;
import org.spongepowered.asm.launch.platform.container.ContainerHandleVirtual;
import org.spongepowered.asm.launch.platform.container.IContainerHandle;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.throwables.MixinException;
import org.spongepowered.asm.service.IAdviceProvider;
import org.spongepowered.asm.service.IClassBytecodeProvider;
import org.spongepowered.asm.service.IClassProvider;
import org.spongepowered.asm.service.IClassTracker;
import org.spongepowered.asm.service.IFeatureValidator;
import org.spongepowered.asm.service.ILegacyClassTransformer;
import org.spongepowered.asm.service.IMixinAuditTrail;
import org.spongepowered.asm.service.ITransformer;
import org.spongepowered.asm.service.ITransformerProvider;
import org.spongepowered.asm.service.MixinServiceAbstract;
import org.spongepowered.asm.transformers.MixinClassReader;
import org.spongepowered.asm.util.Files;
import org.spongepowered.asm.util.perf.Profiler;
import org.spongepowered.include.com.google.common.collect.ImmutableList;
import org.spongepowered.include.com.google.common.collect.Sets;
import org.spongepowered.include.com.google.common.io.ByteStreams;
import org.spongepowered.include.com.google.common.io.Closeables;

public class MixinServiceLaunchWrapper extends MixinServiceAbstract implements IClassBytecodeProvider, IClassProvider, ITransformerProvider {
   public static final GlobalProperties.Keys BLACKBOARD_KEY_TWEAKCLASSES = GlobalProperties.Keys.of("TweakClasses");
   public static final GlobalProperties.Keys BLACKBOARD_KEY_TWEAKS = GlobalProperties.Keys.of("Tweaks");
   private static final Set<String> excludeTransformers = Sets.newHashSet(
      "net.minecraftforge.fml.common.asm.transformers.EventSubscriptionTransformer",
      "cpw.mods.fml.common.asm.transformers.EventSubscriptionTransformer",
      "net.minecraftforge.fml.common.asm.transformers.TerminalTransformer",
      "cpw.mods.fml.common.asm.transformers.TerminalTransformer"
   );
   private static final Logger logger = LogManager.getLogger();
   private final LaunchClassLoaderUtil classLoaderUtil = new LaunchClassLoaderUtil(Launch.classLoader);
   private List<ILegacyClassTransformer> delegatedTransformers;
   private IClassNameTransformer nameTransformer;

   @Override
   public String getName() {
      return "LaunchWrapper";
   }

   @Override
   public boolean isValid() {
      try {
         Launch.classLoader.hashCode();
         return true;
      } catch (Throwable var2) {
         return false;
      }
   }

   @Override
   public void prepare() {
      Launch.classLoader.addClassLoaderExclusion("org.spongepowered.asm.launch.");
   }

   @Override
   public MixinEnvironment.Phase getInitialPhase() {
      String var1 = System.getProperty("sun.java.command");
      if (var1 != null && var1.contains("GradleStart")) {
         System.setProperty("mixin.env.remapRefMap", "true");
      }

      return findInStackTrace("net.minecraft.launchwrapper.Launch", "launch") > 132 ? MixinEnvironment.Phase.DEFAULT : MixinEnvironment.Phase.PREINIT;
   }

   @Override
   public MixinEnvironment.CompatibilityLevel getMaxCompatibilityLevel() {
      return MixinEnvironment.CompatibilityLevel.JAVA_8;
   }

   @Override
   protected ILogger createLogger(String var1) {
      return new LoggerAdapterLog4j2(var1);
   }

   @Override
   public void init() {
      if (findInStackTrace("net.minecraft.launchwrapper.Launch", "launch") < 4) {
         logger.error("MixinBootstrap.doInit() called during a tweak constructor!");
      }

      List var1 = GlobalProperties.get(BLACKBOARD_KEY_TWEAKCLASSES);
      if (var1 != null) {
         var1.add("org.spongepowered.asm.mixin.EnvironmentStateTweaker");
      }

      super.init();
   }

   @Override
   public Collection<String> getPlatformAgents() {
      return ImmutableList.of(
         "org.spongepowered.asm.launch.platform.MixinPlatformAgentFMLLegacy", "org.spongepowered.asm.launch.platform.MixinPlatformAgentLiteLoaderLegacy"
      );
   }

   @Override
   public IContainerHandle getPrimaryContainer() {
      URI var1 = null;

      try {
         var1 = this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI();
         if (var1 != null) {
            return new ContainerHandleURI(var1);
         }
      } catch (URISyntaxException var3) {
         var3.printStackTrace();
      }

      return new ContainerHandleVirtual(this.getName());
   }

   @Override
   public Collection<IContainerHandle> getMixinContainers() {
      ImmutableList.Builder var1 = ImmutableList.builder();
      this.getContainersFromClassPath(var1);
      this.getContainersFromAgents(var1);
      return var1.build();
   }

   private void getContainersFromClassPath(ImmutableList.Builder<IContainerHandle> var1) {
      URL[] var2 = this.getClassPath();
      if (var2 != null) {
         for (URL var6 : var2) {
            try {
               URI var7 = var6.toURI();
               logger.debug("Scanning {} for mixin tweaker", new Object[]{var7});
               if ("file".equals(var7.getScheme()) && Files.toFile(var7).exists()) {
                  MainAttributes var8 = MainAttributes.of(var7);
                  String var9 = var8.get("TweakClass");
                  if ("org.spongepowered.asm.launch.MixinTweaker".equals(var9)) {
                     var1.add(new ContainerHandleURI(var7));
                  }
               }
            } catch (Exception var10) {
               var10.printStackTrace();
            }
         }
      }
   }

   @Override
   public IClassProvider getClassProvider() {
      return this;
   }

   @Override
   public IClassBytecodeProvider getBytecodeProvider() {
      return this;
   }

   @Override
   public ITransformerProvider getTransformerProvider() {
      return this;
   }

   @Override
   public IClassTracker getClassTracker() {
      return this.classLoaderUtil;
   }

   @Override
   public IMixinAuditTrail getAuditTrail() {
      return null;
   }

   @Override
   public IFeatureValidator getFeatureValidator() {
      return IFeatureValidator.ALLOW_ALL;
   }

   @Override
   public IAdviceProvider getAdviceProvider() {
      return IAdviceProvider.GENERIC;
   }

   @Override
   public Class<?> findClass(String var1) {
      return Launch.classLoader.findClass(var1);
   }

   @Override
   public Class<?> findClass(String var1, boolean var2) {
      return Class.forName(var1, var2, Launch.classLoader);
   }

   @Override
   public Class<?> findAgentClass(String var1, boolean var2) {
      return Class.forName(var1, var2, Launch.class.getClassLoader());
   }

   @Override
   public void beginPhase() {
      Launch.classLoader.registerTransformer("org.spongepowered.asm.mixin.transformer.Proxy");
      this.delegatedTransformers = null;
   }

   @Override
   public void checkEnv(Object var1) {
      if (var1.getClass().getClassLoader() != Launch.class.getClassLoader()) {
         throw new MixinException("Attempted to init the mixin environment in the wrong classloader");
      }
   }

   @Override
   public InputStream getResourceAsStream(String var1) {
      return Launch.classLoader.getResourceAsStream(var1);
   }

   @Deprecated
   @Override
   public URL[] getClassPath() {
      return Launch.classLoader.getSources().toArray(new URL[0]);
   }

   @Override
   public Collection<ITransformer> getTransformers() {
      List var1 = Launch.classLoader.getTransformers();
      ArrayList var2 = new ArrayList(var1.size());

      for (IClassTransformer var4 : var1) {
         if (var4 instanceof ITransformer) {
            var2.add((ITransformer)var4);
         } else {
            var2.add(new LegacyTransformerHandle(var4));
         }

         if (var4 instanceof IClassNameTransformer) {
            logger.debug("Found name transformer: {}", new Object[]{var4.getClass().getName()});
            this.nameTransformer = (IClassNameTransformer)var4;
         }
      }

      return var2;
   }

   public List<ITransformer> getDelegatedTransformers() {
      return Collections.unmodifiableList(this.getDelegatedLegacyTransformers());
   }

   private List<ILegacyClassTransformer> getDelegatedLegacyTransformers() {
      if (this.delegatedTransformers == null) {
         this.buildTransformerDelegationList();
      }

      return this.delegatedTransformers;
   }

   private void buildTransformerDelegationList() {
      logger.debug("Rebuilding transformer delegation list:");
      this.delegatedTransformers = new ArrayList<>();

      for (ITransformer var2 : this.getTransformers()) {
         if (var2 instanceof ILegacyClassTransformer) {
            ILegacyClassTransformer var3 = (ILegacyClassTransformer)var2;
            String var4 = var3.getName();
            boolean var5 = true;

            for (String var7 : excludeTransformers) {
               if (var4.contains(var7)) {
                  var5 = false;
                  break;
               }
            }

            if (var5 && !var3.isDelegationExcluded()) {
               logger.debug("  Adding:    {}", new Object[]{var4});
               this.delegatedTransformers.add(var3);
            } else {
               logger.debug("  Excluding: {}", new Object[]{var4});
            }
         }
      }

      logger.debug("Transformer delegation list created with {} entries", new Object[]{this.delegatedTransformers.size()});
   }

   @Override
   public void addTransformerExclusion(String var1) {
      excludeTransformers.add(var1);
      this.delegatedTransformers = null;
   }

   @Deprecated
   public byte[] getClassBytes(String var1, String var2) {
      byte[] var3 = Launch.classLoader.getClassBytes(var1);
      if (var3 != null) {
         return var3;
      }

      URLClassLoader var4;
      if (Launch.class.getClassLoader() instanceof URLClassLoader) {
         var4 = (URLClassLoader)Launch.class.getClassLoader();
      } else {
         var4 = new URLClassLoader(new URL[0], Launch.class.getClassLoader());
      }

      InputStream var5 = null;

      try {
         String var6 = var2.replace('.', '/').concat(".class");
         var5 = var4.getResourceAsStream(var6);
         return ByteStreams.toByteArray(var5);
      } catch (Exception var11) {
         return null;
      } finally {
         Closeables.closeQuietly(var5);
      }
   }

   @Deprecated
   public byte[] getClassBytes(String var1, boolean var2) {
      String var3 = var1.replace('/', '.');
      String var4 = this.unmapClassName(var3);
      Profiler var5 = Profiler.getProfiler("mixin");
      Profiler.Section var6 = var5.begin(1, "class.load");
      byte[] var7 = this.getClassBytes(var4, var3);
      var6.end();
      if (var2) {
         Profiler.Section var8 = var5.begin(1, "class.transform");
         var7 = this.applyTransformers(var4, var3, var7, var5);
         var8.end();
      }

      if (var7 == null) {
         throw new ClassNotFoundException(String.format("The specified class '%s' was not found", var3));
      } else {
         return var7;
      }
   }

   private byte[] applyTransformers(String var1, String var2, byte[] var3, Profiler var4) {
      if (this.classLoaderUtil.isClassExcluded(var1, var2)) {
         return var3;
      }

      for (ILegacyClassTransformer var6 : this.getDelegatedLegacyTransformers()) {
         this.lock.clear();
         int var7 = var6.getName().lastIndexOf(46);
         String var8 = var6.getName().substring(var7 + 1);
         Profiler.Section var9 = var4.begin(2, var8.toLowerCase(Locale.ROOT));
         var9.setInfo(var6.getName());
         var3 = var6.transformClassBytes(var1, var2, var3);
         var9.end();
         if (this.lock.isSet()) {
            this.addTransformerExclusion(var6.getName());
            this.lock.clear();
            logger.info("A re-entrant transformer '{}' was detected and will no longer process meta class data", new Object[]{var6.getName()});
         }
      }

      return var3;
   }

   private String unmapClassName(String var1) {
      if (this.nameTransformer == null) {
         this.findNameTransformer();
      }

      return this.nameTransformer != null ? this.nameTransformer.unmapClassName(var1) : var1;
   }

   private void findNameTransformer() {
      for (IClassTransformer var3 : Launch.classLoader.getTransformers()) {
         if (var3 instanceof IClassNameTransformer) {
            logger.debug("Found name transformer: {}", new Object[]{var3.getClass().getName()});
            this.nameTransformer = (IClassNameTransformer)var3;
         }
      }
   }

   @Override
   public ClassNode getClassNode(String var1) {
      return this.getClassNode(var1, this.getClassBytes(var1, true), 8);
   }

   @Override
   public ClassNode getClassNode(String var1, boolean var2) {
      return this.getClassNode(var1, this.getClassBytes(var1, var2), 8);
   }

   @Override
   public ClassNode getClassNode(String var1, boolean var2, int var3) {
      return this.getClassNode(var1, this.getClassBytes(var1, var2), var3);
   }

   private ClassNode getClassNode(String var1, byte[] var2, int var3) {
      ClassNode var4 = new ClassNode();
      MixinClassReader var5 = new MixinClassReader(var2, var1);
      var5.accept(var4, var3);
      return var4;
   }

   private static int findInStackTrace(String var0, String var1) {
      Thread var2 = Thread.currentThread();
      if (!"main".equals(var2.getName())) {
         return 0;
      }

      StackTraceElement[] var3 = var2.getStackTrace();

      for (StackTraceElement var7 : var3) {
         if (var0.equals(var7.getClassName()) && var1.equals(var7.getMethodName())) {
            return var7.getLineNumber();
         }
      }

      return 0;
   }
}
