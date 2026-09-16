package org.spongepowered.asm.service.modlauncher;

import cpw.mods.modlauncher.Launcher;
import cpw.mods.modlauncher.api.ITransformationService;
import cpw.mods.modlauncher.api.IEnvironment.Keys;
import cpw.mods.modlauncher.api.TypesafeMap.Key;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Optional;
import org.spongepowered.asm.launch.IClassProcessor;
import org.spongepowered.asm.launch.platform.container.ContainerHandleModLauncher;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.transformer.IMixinTransformerFactory;
import org.spongepowered.asm.service.IAdviceProvider;
import org.spongepowered.asm.service.IClassBytecodeProvider;
import org.spongepowered.asm.service.IClassProvider;
import org.spongepowered.asm.service.IClassTracker;
import org.spongepowered.asm.service.IFeatureValidator;
import org.spongepowered.asm.service.IMixinAuditTrail;
import org.spongepowered.asm.service.IMixinInternal;
import org.spongepowered.asm.service.ITransformerProvider;
import org.spongepowered.asm.service.MixinServiceAbstract;
import org.spongepowered.asm.util.IConsumer;
import org.spongepowered.asm.util.VersionNumber;
import org.spongepowered.include.com.google.common.collect.ImmutableList;

public class MixinServiceModLauncher extends MixinServiceAbstract {
   private static final VersionNumber MODLAUNCHER_4_SPECIFICATION_VERSION = VersionNumber.parse("4.0");
   private static final VersionNumber MODLAUNCHER_9_SPECIFICATION_VERSION = VersionNumber.parse("8.0");
   private IClassProvider classProvider;
   private IClassBytecodeProvider bytecodeProvider;
   private MixinTransformationHandler transformationHandler;
   private ModLauncherClassTracker classTracker;
   private ModLauncherAuditTrail auditTrail;
   private IConsumer<MixinEnvironment.Phase> phaseConsumer;
   private volatile boolean initialised;
   private ContainerHandleModLauncher rootContainer;
   private MixinEnvironment.CompatibilityLevel minCompatibilityLevel = MixinEnvironment.CompatibilityLevel.JAVA_8;

   public MixinServiceModLauncher() {
      VersionNumber var1 = getModLauncherApiVersion();
      if (var1.compareTo(MODLAUNCHER_9_SPECIFICATION_VERSION) >= 0) {
         this.createRootContainer("org.spongepowered.asm.launch.platform.container.ContainerHandleModLauncherEx");
         this.minCompatibilityLevel = MixinEnvironment.CompatibilityLevel.JAVA_16;
      } else {
         this.createRootContainer("org.spongepowered.asm.launch.platform.container.ContainerHandleModLauncher");
      }
   }

   public void onInit(IClassBytecodeProvider var1) {
      if (this.initialised) {
         throw new IllegalStateException("Already initialised");
      }

      this.initialised = true;
      this.bytecodeProvider = var1;
   }

   private void createRootContainer(String var1) {
      try {
         Class var2 = this.getClassProvider().findClass(var1);
         Constructor var3 = var2.getDeclaredConstructor(String.class);
         this.rootContainer = (ContainerHandleModLauncher)var3.newInstance(this.getName());
      } catch (ReflectiveOperationException var4) {
         var4.printStackTrace();
      }
   }

   public void onStartup() {
      this.phaseConsumer.accept(MixinEnvironment.Phase.DEFAULT);
   }

   @Override
   public void offer(IMixinInternal var1) {
      if (var1 instanceof IMixinTransformerFactory) {
         this.getTransformationHandler().offer((IMixinTransformerFactory)var1);
      }

      super.offer(var1);
   }

   @Override
   public void wire(MixinEnvironment.Phase var1, IConsumer<MixinEnvironment.Phase> var2) {
      super.wire(var1, var2);
      this.phaseConsumer = var2;
   }

   @Override
   public String getName() {
      return "ModLauncher";
   }

   @Override
   public MixinEnvironment.CompatibilityLevel getMinCompatibilityLevel() {
      return this.minCompatibilityLevel;
   }

   @Override
   protected ILogger createLogger(String var1) {
      return new LoggerAdapterLog4j2(var1);
   }

   @Override
   public boolean isValid() {
      try {
         VersionNumber var1 = getModLauncherApiVersion();
         return var1.compareTo(MODLAUNCHER_4_SPECIFICATION_VERSION) >= 0;
      } catch (Throwable var2) {
         return false;
      }
   }

   @Override
   public IClassProvider getClassProvider() {
      if (this.classProvider == null) {
         this.classProvider = new ModLauncherClassProvider();
      }

      return this.classProvider;
   }

   @Override
   public IClassBytecodeProvider getBytecodeProvider() {
      if (this.bytecodeProvider == null) {
         throw new IllegalStateException("Service initialisation incomplete");
      } else {
         return this.bytecodeProvider;
      }
   }

   @Override
   public ITransformerProvider getTransformerProvider() {
      return null;
   }

   @Override
   public IClassTracker getClassTracker() {
      if (this.classTracker == null) {
         this.classTracker = new ModLauncherClassTracker();
      }

      return this.classTracker;
   }

   @Override
   public IMixinAuditTrail getAuditTrail() {
      if (this.auditTrail == null) {
         this.auditTrail = new ModLauncherAuditTrail();
      }

      return this.auditTrail;
   }

   @Override
   public IFeatureValidator getFeatureValidator() {
      return IFeatureValidator.ALLOW_ALL;
   }

   @Override
   public IAdviceProvider getAdviceProvider() {
      return IAdviceProvider.GENERIC;
   }

   private MixinTransformationHandler getTransformationHandler() {
      if (this.transformationHandler == null) {
         this.transformationHandler = new MixinTransformationHandler();
      }

      return this.transformationHandler;
   }

   @Override
   public Collection<String> getPlatformAgents() {
      return ImmutableList.of("org.spongepowered.asm.launch.platform.MixinPlatformAgentMinecraftForge");
   }

   public ContainerHandleModLauncher getPrimaryContainer() {
      return this.rootContainer;
   }

   @Override
   public InputStream getResourceAsStream(String var1) {
      return Thread.currentThread().getContextClassLoader().getResourceAsStream(var1);
   }

   public Collection<IClassProcessor> getProcessors() {
      return ImmutableList.of(this.getTransformationHandler(), (IClassProcessor)this.getClassTracker());
   }

   private static VersionNumber getModLauncherApiVersion() {
      Key var0 = (Key)Keys.MLSPEC_VERSION.get();
      Optional var1 = Launcher.INSTANCE.environment().getProperty(var0);
      if (!var1.isPresent()) {
         var1 = Optional.ofNullable(ITransformationService.class.getPackage().getSpecificationVersion());
      }

      return var1.<VersionNumber>map(VersionNumber::parse).orElse(VersionNumber.NONE);
   }
}
