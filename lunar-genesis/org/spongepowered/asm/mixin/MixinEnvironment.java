package org.spongepowered.asm.mixin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.spongepowered.asm.launch.GlobalProperties;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.logging.Level;
import org.spongepowered.asm.mixin.extensibility.IEnvironmentTokenProvider;
import org.spongepowered.asm.mixin.throwables.MixinException;
import org.spongepowered.asm.mixin.transformer.IMixinTransformer;
import org.spongepowered.asm.obfuscation.RemapperChain;
import org.spongepowered.asm.service.IMixinService;
import org.spongepowered.asm.service.ITransformer;
import org.spongepowered.asm.service.ITransformerProvider;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.service.MixinServiceAbstract;
import org.spongepowered.asm.util.IConsumer;
import org.spongepowered.asm.util.ITokenProvider;
import org.spongepowered.asm.util.JavaVersion;
import org.spongepowered.asm.util.PrettyPrinter;
import org.spongepowered.asm.util.asm.ASM;
import org.spongepowered.asm.util.perf.Profiler;
import org.spongepowered.include.com.google.common.collect.ImmutableList;

public final class MixinEnvironment implements ITokenProvider {
   private static MixinEnvironment currentEnvironment;
   private static MixinEnvironment.Phase currentPhase = MixinEnvironment.Phase.NOT_INITIALISED;
   private static MixinEnvironment.CompatibilityLevel compatibility;
   private static boolean showHeader = true;
   private static final ILogger logger = MixinService.getService().getLogger("mixin");
   private static IMixinTransformer transformer;
   private final IMixinService service;
   private final MixinEnvironment.Phase phase;
   private final GlobalProperties.Keys configsKey;
   private final boolean[] options;
   private final Set<String> tokenProviderClasses = new HashSet<>();
   private final List<MixinEnvironment.TokenProviderWrapper> tokenProviders = new ArrayList<>();
   private final Map<String, Integer> internalTokens = new HashMap<>();
   private final RemapperChain remappers = new RemapperChain();
   private MixinEnvironment.Side side;
   private String obfuscationContext = null;

   MixinEnvironment(MixinEnvironment.Phase var1) {
      this.service = MixinService.getService();
      this.phase = var1;
      this.configsKey = GlobalProperties.Keys.of(GlobalProperties.Keys.CONFIGS + "." + this.phase.name.toLowerCase(Locale.ROOT));
      String var2 = this.getVersion();
      if (var2 != null && "0.8.7".equals(var2)) {
         this.service.checkEnv(this);
         this.options = new boolean[MixinEnvironment.Option.values().length];

         for (MixinEnvironment.Option var6 : MixinEnvironment.Option.values()) {
            this.options[var6.ordinal()] = var6.getBooleanValue();
         }

         if (showHeader) {
            showHeader = false;
            this.printHeader(var2);
         }
      } else {
         throw new MixinException("Environment conflict, mismatched versions or you didn't call MixinBootstrap.init()");
      }
   }

   private void printHeader(Object var1) {
      String var2 = this.getCodeSource();
      String var3 = this.service.getName();
      MixinEnvironment.Side var4 = this.getSide();
      logger.info("SpongePowered MIXIN Subsystem Version={} Source={} Service={} Env={}", var1, var2, var3, var4);
      boolean var5 = this.getOption(MixinEnvironment.Option.DEBUG_VERBOSE);
      if (var5 || this.getOption(MixinEnvironment.Option.DEBUG_EXPORT) || this.getOption(MixinEnvironment.Option.DEBUG_PROFILER)) {
         PrettyPrinter var6 = new PrettyPrinter(32);
         var6.add("SpongePowered MIXIN%s", var5 ? " (Verbose debugging enabled)" : "").centre().hr();
         var6.kv("Code source", var2);
         var6.kv("Internal Version", var1);
         var6.kv("Java Version", "%s (supports compatibility %s)", JavaVersion.current(), MixinEnvironment.CompatibilityLevel.getSupportedVersions());
         var6.kv("Default Compatibility Level", getCompatibilityLevel());
         var6.kv("Max Effective Compatibility Level", MixinEnvironment.CompatibilityLevel.getMaxEffective());
         var6.kv("Detected ASM Version", ASM.getVersionString());
         var6.kv("Detected ASM Supports Java", ASM.getClassVersionString()).hr();
         var6.kv("Service Name", var3);
         var6.kv("Mixin Service Class", this.service.getClass().getName());
         var6.kv("Global Property Service Class", MixinService.getGlobalPropertyService().getClass().getName());
         var6.kv("Logger Adapter Type", MixinService.getService().getLogger("mixin").getType()).hr();

         for (MixinEnvironment.Option var10 : MixinEnvironment.Option.values()) {
            if (!var10.isHidden) {
               StringBuilder var11 = new StringBuilder();

               for (int var12 = 0; var12 < var10.depth; var12++) {
                  var11.append("- ");
               }

               var6.kv(var10.property, "%s<%s>", var11, var10);
            }
         }

         var6.hr();

         for (MixinEnvironment.Feature var16 : MixinEnvironment.Feature.values()) {
            var6.kv(var16.name(), "available=<%s> enabled=<%s>", var16.isAvailable(), var16.isEnabled());
         }

         var6.hr().kv("Detected Side", var4);
         var6.print(System.err);
      }
   }

   private String getCodeSource() {
      try {
         return this.getClass().getProtectionDomain().getCodeSource().getLocation().toString();
      } catch (Throwable var2) {
         return "Unknown";
      }
   }

   private Level getVerboseLoggingLevel() {
      return this.getOption(MixinEnvironment.Option.DEBUG_VERBOSE) ? Level.INFO : Level.DEBUG;
   }

   public MixinEnvironment.Phase getPhase() {
      return this.phase;
   }

   @Deprecated
   public List<String> getMixinConfigs() {
      List var1 = GlobalProperties.get(this.configsKey);
      if (var1 == null) {
         var1 = new ArrayList();
         GlobalProperties.put(this.configsKey, var1);
      }

      return var1;
   }

   @Deprecated
   public MixinEnvironment addConfiguration(String var1) {
      logger.warn("MixinEnvironment::addConfiguration is deprecated and will be removed. Use Mixins::addConfiguration instead!");
      Mixins.addConfiguration(var1, this);
      return this;
   }

   void registerConfig(String var1) {
      List var2 = this.getMixinConfigs();
      if (!var2.contains(var1)) {
         var2.add(var1);
      }
   }

   public MixinEnvironment registerTokenProviderClass(String var1) {
      if (!this.tokenProviderClasses.contains(var1)) {
         try {
            Class var2 = this.service.getClassProvider().findClass(var1, true);
            IEnvironmentTokenProvider var3 = (IEnvironmentTokenProvider)var2.getDeclaredConstructor().newInstance();
            this.registerTokenProvider(var3);
         } catch (Throwable var4) {
            logger.error("Error instantiating " + var1, var4);
         }
      }

      return this;
   }

   public MixinEnvironment registerTokenProvider(IEnvironmentTokenProvider var1) {
      if (var1 != null && !this.tokenProviderClasses.contains(var1.getClass().getName())) {
         String var2 = var1.getClass().getName();
         MixinEnvironment.TokenProviderWrapper var3 = new MixinEnvironment.TokenProviderWrapper(var1, this);
         logger.log(this.getVerboseLoggingLevel(), "Adding new token provider {} to {}", var2, this);
         this.tokenProviders.add(var3);
         this.tokenProviderClasses.add(var2);
         Collections.sort(this.tokenProviders);
      }

      return this;
   }

   @Override
   public Integer getToken(String var1) {
      var1 = var1.toUpperCase(Locale.ROOT);

      for (MixinEnvironment.TokenProviderWrapper var3 : this.tokenProviders) {
         Integer var4 = var3.getToken(var1);
         if (var4 != null) {
            return var4;
         }
      }

      return this.internalTokens.get(var1);
   }

   @Deprecated
   public Set<String> getErrorHandlerClasses() {
      return Mixins.getErrorHandlerClasses();
   }

   public Object getActiveTransformer() {
      return transformer;
   }

   public void setActiveTransformer(IMixinTransformer var1) {
      if (var1 != null) {
         transformer = var1;
      }
   }

   public MixinEnvironment setSide(MixinEnvironment.Side var1) {
      if (var1 != null && this.getSide() == MixinEnvironment.Side.UNKNOWN && var1 != MixinEnvironment.Side.UNKNOWN) {
         this.side = var1;
      }

      return this;
   }

   public MixinEnvironment.Side getSide() {
      if (this.side == null) {
         for (MixinEnvironment.Side var4 : MixinEnvironment.Side.values()) {
            if (var4.detect()) {
               this.side = var4;
               break;
            }
         }
      }

      return this.side != null ? this.side : MixinEnvironment.Side.UNKNOWN;
   }

   public String getVersion() {
      return GlobalProperties.get(GlobalProperties.Keys.INIT);
   }

   public boolean getOption(MixinEnvironment.Option var1) {
      return this.options[var1.ordinal()];
   }

   public void setOption(MixinEnvironment.Option var1, boolean var2) {
      this.options[var1.ordinal()] = var2;
   }

   public String getOptionValue(MixinEnvironment.Option var1) {
      return var1.getStringValue();
   }

   public <E extends Enum<E>> E getOption(MixinEnvironment.Option var1, E var2) {
      return var1.getEnumValue((E)var2);
   }

   public void setObfuscationContext(String var1) {
      this.obfuscationContext = var1;
   }

   public String getObfuscationContext() {
      return this.obfuscationContext;
   }

   public String getRefmapObfuscationContext() {
      String var1 = MixinEnvironment.Option.OBFUSCATION_TYPE.getStringValue();
      return var1 != null ? var1 : this.obfuscationContext;
   }

   public RemapperChain getRemappers() {
      return this.remappers;
   }

   public void audit() {
      Object var1 = this.getActiveTransformer();
      if (var1 instanceof IMixinTransformer) {
         ((IMixinTransformer)var1).audit(this);
      }
   }

   @Deprecated
   public List<ITransformer> getTransformers() {
      logger.warn("MixinEnvironment::getTransformers is deprecated!");
      ITransformerProvider var1 = this.service.getTransformerProvider();
      return var1 != null ? (List)var1.getTransformers() : Collections.emptyList();
   }

   @Deprecated
   public void addTransformerExclusion(String var1) {
      logger.warn("MixinEnvironment::addTransformerExclusion is deprecated!");
      ITransformerProvider var2 = this.service.getTransformerProvider();
      if (var2 != null) {
         var2.addTransformerExclusion(var1);
      }
   }

   @Override
   public String toString() {
      return String.format("%s[%s]", this.getClass().getSimpleName(), this.phase);
   }

   private static MixinEnvironment.Phase getCurrentPhase() {
      if (currentPhase == MixinEnvironment.Phase.NOT_INITIALISED) {
         init(MixinEnvironment.Phase.PREINIT);
      }

      return currentPhase;
   }

   public static void init(MixinEnvironment.Phase var0) {
      if (currentPhase == MixinEnvironment.Phase.NOT_INITIALISED) {
         currentPhase = var0;
         MixinEnvironment var1 = getEnvironment(var0);
         Profiler.setActive(var1.getOption(MixinEnvironment.Option.DEBUG_PROFILER));
         IMixinService var2 = MixinService.getService();
         if (var2 instanceof MixinServiceAbstract) {
            ((MixinServiceAbstract)var2).wire(var0, new MixinEnvironment.PhaseConsumer());
         }
      }
   }

   public static MixinEnvironment getEnvironment(MixinEnvironment.Phase var0) {
      return var0 == null ? MixinEnvironment.Phase.DEFAULT.getEnvironment() : var0.getEnvironment();
   }

   public static MixinEnvironment getDefaultEnvironment() {
      return getEnvironment(MixinEnvironment.Phase.DEFAULT);
   }

   public static MixinEnvironment getCurrentEnvironment() {
      if (currentEnvironment == null) {
         currentEnvironment = getEnvironment(getCurrentPhase());
      }

      return currentEnvironment;
   }

   public static MixinEnvironment.CompatibilityLevel getCompatibilityLevel() {
      if (compatibility == null) {
         MixinEnvironment.CompatibilityLevel var0 = getMinCompatibilityLevel();
         MixinEnvironment.CompatibilityLevel var1 = MixinEnvironment.Option.DEFAULT_COMPATIBILITY_LEVEL.getEnumValue(var0);
         compatibility = var1.isAtLeast(var0) ? var1 : var0;
      }

      return compatibility;
   }

   public static MixinEnvironment.CompatibilityLevel getMinCompatibilityLevel() {
      MixinEnvironment.CompatibilityLevel var0 = MixinService.getService().getMinCompatibilityLevel();
      return var0 == null ? MixinEnvironment.CompatibilityLevel.DEFAULT : var0;
   }

   @Deprecated
   public static void setCompatibilityLevel(MixinEnvironment.CompatibilityLevel var0) {
      StackTraceElement[] var1 = Thread.currentThread().getStackTrace();
      if (!"org.spongepowered.asm.mixin.transformer.MixinConfig".equals(var1[2].getClassName())) {
         logger.warn("MixinEnvironment::setCompatibilityLevel is deprecated and will be removed. Set level via config instead!");
      }

      MixinEnvironment.CompatibilityLevel var2 = getCompatibilityLevel();
      if (var0 != var2 && var0.isAtLeast(var2)) {
         if (!var0.isSupported()) {
            throw new IllegalArgumentException(
               String.format(
                  "The requested compatibility level %s could not be set. Level is not supported by the active JRE or ASM version (Java %s, %s)",
                  var0,
                  JavaVersion.current(),
                  ASM.getVersionString()
               )
            );
         }

         IMixinService var3 = MixinService.getService();
         MixinEnvironment.CompatibilityLevel var4 = var3.getMaxCompatibilityLevel();
         if (var4 != null && var4.isLessThan(var0)) {
            logger.warn(
               "The requested compatibility level {} is higher than the level supported by the active subsystem '{}' which supports {}. This is not a supported configuration and instability may occur.",
               var0,
               var3.getName(),
               var4
            );
         }

         compatibility = var0;
         logger.debug("Compatibility level set to {}", var0);
      }
   }

   @Deprecated
   public static Profiler getProfiler() {
      return Profiler.getProfiler("mixin");
   }

   static void gotoPhase(MixinEnvironment.Phase var0) {
      if (var0 != null && var0.ordinal >= 0) {
         IMixinService var1 = MixinService.getService();
         if (var0.ordinal > getCurrentPhase().ordinal) {
            var1.beginPhase();
         }

         currentPhase = var0;
         currentEnvironment = getEnvironment(getCurrentPhase());
         if (var1 instanceof MixinServiceAbstract && var0 == MixinEnvironment.Phase.DEFAULT) {
            ((MixinServiceAbstract)var1).unwire();
         }
      } else {
         throw new IllegalArgumentException("Cannot go to the specified phase, phase is null or invalid");
      }
   }

   public enum CompatibilityLevel {
      JAVA_6(6, 50, 0),
      JAVA_7(7, 51, 0) {
         @Override
         boolean isSupported() {
            return JavaVersion.current() >= 1.7;
         }
      },
      JAVA_8(8, 52, 3) {
         @Override
         boolean isSupported() {
            return JavaVersion.current() >= 1.8;
         }
      },
      JAVA_9(9, 53, 7) {
         @Override
         boolean isSupported() {
            return JavaVersion.current() >= 9.0 && ASM.isAtLeastVersion(6);
         }
      },
      JAVA_10(10, 54, 7) {
         @Override
         boolean isSupported() {
            return JavaVersion.current() >= 10.0 && ASM.isAtLeastVersion(6, 1);
         }
      },
      JAVA_11(11, 55, 31) {
         @Override
         boolean isSupported() {
            return JavaVersion.current() >= 11.0 && ASM.isAtLeastVersion(7);
         }
      },
      JAVA_12(12, 56, 31) {
         @Override
         boolean isSupported() {
            return JavaVersion.current() >= 12.0 && ASM.isAtLeastVersion(7);
         }
      },
      JAVA_13(13, 57, 31) {
         @Override
         boolean isSupported() {
            return JavaVersion.current() >= 13.0 && ASM.isAtLeastVersion(7);
         }
      },
      JAVA_14(14, 58, 63) {
         @Override
         boolean isSupported() {
            return JavaVersion.current() >= 14.0 && ASM.isAtLeastVersion(8);
         }
      },
      JAVA_15(15, 59, 127) {
         @Override
         boolean isSupported() {
            return JavaVersion.current() >= 15.0 && ASM.isAtLeastVersion(9);
         }
      },
      JAVA_16(16, 60, 127) {
         @Override
         boolean isSupported() {
            return JavaVersion.current() >= 16.0 && ASM.isAtLeastVersion(9);
         }
      },
      JAVA_17(17, 61, 127) {
         @Override
         boolean isSupported() {
            return JavaVersion.current() >= 17.0 && ASM.isAtLeastVersion(9, 1);
         }
      },
      JAVA_18(18, 62, 127) {
         @Override
         boolean isSupported() {
            return JavaVersion.current() >= 18.0 && ASM.isAtLeastVersion(9, 2);
         }
      },
      JAVA_19(19, 63, 127) {
         @Override
         boolean isSupported() {
            return JavaVersion.current() >= 19.0 && ASM.isAtLeastVersion(9, 3);
         }
      },
      JAVA_20(20, 64, 127) {
         @Override
         boolean isSupported() {
            return JavaVersion.current() >= 20.0 && ASM.isAtLeastVersion(9, 4);
         }
      },
      JAVA_21(21, 65, 127) {
         @Override
         boolean isSupported() {
            return JavaVersion.current() >= 21.0 && ASM.isAtLeastVersion(9, 5);
         }
      },
      JAVA_22(22, 66, 127) {
         @Override
         boolean isSupported() {
            return JavaVersion.current() >= 22.0 && ASM.isAtLeastVersion(9, 6);
         }
      },
      JAVA_23(23, 67, 127) {
         @Override
         boolean isSupported() {
            return JavaVersion.current() >= 23.0 && ASM.isAtLeastVersion(9, 7);
         }
      },
      JAVA_24(24, 68, 127) {
         @Override
         boolean isSupported() {
            return JavaVersion.current() >= 24.0 && ASM.isAtLeastVersion(9, 7, 1);
         }
      },
      JAVA_25(25, 69, 127) {
         @Override
         boolean isSupported() {
            return JavaVersion.current() >= 25.0 && ASM.isAtLeastVersion(9, 8);
         }
      };

      public static final MixinEnvironment.CompatibilityLevel DEFAULT = JAVA_6;
      public static final MixinEnvironment.CompatibilityLevel MAX_SUPPORTED = JAVA_13;
      private final int ver;
      private final int classVersion;
      private final int languageFeatures;
      private MixinEnvironment.CompatibilityLevel maxCompatibleLevel;

      CompatibilityLevel(int var3, int var4, int var5) {
         this.ver = var3;
         this.classVersion = var4;
         this.languageFeatures = var5;
      }

      boolean isSupported() {
         return true;
      }

      @Deprecated
      public int classVersion() {
         return this.classVersion;
      }

      public int getClassVersion() {
         return this.classVersion;
      }

      public int getClassMajorVersion() {
         return this.classVersion & 65535;
      }

      public int getLanguageFeatures() {
         return this.languageFeatures;
      }

      @Deprecated
      public boolean supportsMethodsInInterfaces() {
         return (this.languageFeatures & 1) != 0;
      }

      public boolean supports(int var1) {
         return (this.languageFeatures & var1) == var1;
      }

      public boolean isAtLeast(MixinEnvironment.CompatibilityLevel var1) {
         return var1 == null || this.ver >= var1.ver;
      }

      public boolean isLessThan(MixinEnvironment.CompatibilityLevel var1) {
         return var1 == null || this.ver < var1.ver;
      }

      public boolean canElevateTo(MixinEnvironment.CompatibilityLevel var1) {
         return var1 != null && this.maxCompatibleLevel != null ? var1.ver <= this.maxCompatibleLevel.ver : true;
      }

      public boolean canSupport(MixinEnvironment.CompatibilityLevel var1) {
         return var1 == null ? true : var1.canElevateTo(this);
      }

      public static MixinEnvironment.CompatibilityLevel requiredFor(int var0) {
         for (MixinEnvironment.CompatibilityLevel var4 : values()) {
            if (var4.supports(var0)) {
               return var4;
            }
         }

         return null;
      }

      public static MixinEnvironment.CompatibilityLevel getMaxEffective() {
         MixinEnvironment.CompatibilityLevel var0 = JAVA_6;

         for (MixinEnvironment.CompatibilityLevel var4 : values()) {
            if (var4.isSupported()) {
               var0 = var4;
            }

            if (var4 == MAX_SUPPORTED) {
               break;
            }
         }

         return var0;
      }

      static String getSupportedVersions() {
         StringBuilder var0 = new StringBuilder();
         boolean var1 = false;
         int var2 = 0;
         int var3 = 0;

         for (MixinEnvironment.CompatibilityLevel var7 : values()) {
            if (var7.isSupported()) {
               if (var7.ver == var3 + 1) {
                  var3 = var7.ver;
               } else {
                  if (var2 > 0) {
                     var0.append(var1 ? "," : "").append(var2);
                     if (var3 > var2) {
                        var0.append((char)(var3 > var2 + 1 ? '-' : ',')).append(var3);
                     }

                     var1 = true;
                     var3 = var7.ver;
                     var2 = var7.ver;
                  }

                  var3 = var7.ver;
                  var2 = var7.ver;
               }
            }
         }

         if (var2 > 0) {
            var0.append(var1 ? "," : "").append(var2);
            if (var3 > var2) {
               var0.append((char)(var3 > var2 + 1 ? '-' : ',')).append(var3);
            }
         }

         return var0.toString();
      }

      public static MixinEnvironment.CompatibilityLevel forClassVersion(int var0) {
         MixinEnvironment.CompatibilityLevel var1 = null;

         for (MixinEnvironment.CompatibilityLevel var5 : values()) {
            if (var5.getClassVersion() >= var0) {
               return var5;
            }

            var1 = var5;
         }

         return var1;
      }
   }

   public enum Feature {
      UNSAFE_INJECTION(true),
      INJECTORS_IN_INTERFACE_MIXINS {
         @Override
         public boolean isAvailable() {
            return MixinEnvironment.CompatibilityLevel.getMaxEffective().supports(1);
         }

         @Override
         public boolean isEnabled() {
            return MixinEnvironment.getCompatibilityLevel().supports(1);
         }
      };

      private boolean enabled;

      Feature() {
         this(false);
      }

      Feature(boolean var3) {
         this.enabled = var3;
      }

      public boolean isAvailable() {
         return true;
      }

      public boolean isEnabled() {
         return this.isAvailable() && this.enabled;
      }

      public static MixinEnvironment.Feature get(String var0) {
         if (var0 == null) {
            return null;
         }

         try {
            return valueOf(var0);
         } catch (IllegalArgumentException var2) {
            return null;
         }
      }

      public static boolean exists(String var0) {
         return get(var0) != null;
      }

      public static boolean isActive(String var0) {
         MixinEnvironment.Feature var1 = get(var0);
         return var1 != null && var1.isEnabled();
      }
   }

   public enum Option {
      DEBUG_ALL("debug"),
      DEBUG_EXPORT(DEBUG_ALL, "export"),
      DEBUG_EXPORT_FILTER(DEBUG_EXPORT, "filter", false),
      DEBUG_EXPORT_DECOMPILE(DEBUG_EXPORT, MixinEnvironment.Option.Inherit.ALLOW_OVERRIDE, "decompile"),
      DEBUG_EXPORT_DECOMPILE_THREADED(DEBUG_EXPORT_DECOMPILE, MixinEnvironment.Option.Inherit.ALLOW_OVERRIDE, "async"),
      DEBUG_EXPORT_DECOMPILE_MERGESIGNATURES(DEBUG_EXPORT_DECOMPILE, MixinEnvironment.Option.Inherit.ALLOW_OVERRIDE, "mergeGenericSignatures"),
      DEBUG_VERIFY(DEBUG_ALL, "verify"),
      DEBUG_VERBOSE(DEBUG_ALL, "verbose"),
      DEBUG_INJECTORS(DEBUG_ALL, "countInjections"),
      DEBUG_STRICT(DEBUG_ALL, MixinEnvironment.Option.Inherit.INDEPENDENT, "strict"),
      DEBUG_UNIQUE(DEBUG_STRICT, "unique"),
      DEBUG_TARGETS(DEBUG_STRICT, "targets"),
      DEBUG_PROFILER(DEBUG_ALL, MixinEnvironment.Option.Inherit.ALLOW_OVERRIDE, "profiler"),
      DUMP_TARGET_ON_FAILURE("dumpTargetOnFailure"),
      CHECK_ALL("checks"),
      CHECK_IMPLEMENTS(CHECK_ALL, "interfaces"),
      CHECK_IMPLEMENTS_STRICT(CHECK_IMPLEMENTS, MixinEnvironment.Option.Inherit.ALLOW_OVERRIDE, "strict"),
      IGNORE_CONSTRAINTS("ignoreConstraints"),
      HOT_SWAP("hotSwap"),
      ENVIRONMENT(MixinEnvironment.Option.Inherit.ALWAYS_FALSE, true, "env"),
      OBFUSCATION_TYPE(ENVIRONMENT, MixinEnvironment.Option.Inherit.ALWAYS_FALSE, "obf"),
      DISABLE_REFMAP(ENVIRONMENT, MixinEnvironment.Option.Inherit.INDEPENDENT, "disableRefMap"),
      REFMAP_REMAP(ENVIRONMENT, MixinEnvironment.Option.Inherit.INDEPENDENT, "remapRefMap"),
      REFMAP_REMAP_RESOURCE(ENVIRONMENT, MixinEnvironment.Option.Inherit.INDEPENDENT, "refMapRemappingFile", ""),
      REFMAP_REMAP_SOURCE_ENV(ENVIRONMENT, MixinEnvironment.Option.Inherit.INDEPENDENT, "refMapRemappingEnv", "searge"),
      @Deprecated
      REFMAP_REMAP_ALLOW_PERMISSIVE(ENVIRONMENT, MixinEnvironment.Option.Inherit.INDEPENDENT, "allowPermissiveMatch", true, "true"),
      IGNORE_REQUIRED(ENVIRONMENT, MixinEnvironment.Option.Inherit.INDEPENDENT, "ignoreRequired"),
      DEFAULT_COMPATIBILITY_LEVEL(ENVIRONMENT, MixinEnvironment.Option.Inherit.INDEPENDENT, "compatLevel"),
      SHIFT_BY_VIOLATION_BEHAVIOUR(ENVIRONMENT, MixinEnvironment.Option.Inherit.INDEPENDENT, "shiftByViolation", "warn"),
      INITIALISER_INJECTION_MODE("initialiserInjectionMode", "default"),
      TUNABLE(MixinEnvironment.Option.Inherit.ALWAYS_FALSE, true, "tunable"),
      CLASSREADER_EXPAND_FRAMES(TUNABLE, MixinEnvironment.Option.Inherit.INDEPENDENT, "classReaderExpandFrames", true, "false");

      final MixinEnvironment.Option parent;
      final MixinEnvironment.Option.Inherit inheritance;
      final boolean isHidden;
      final String property;
      final String defaultValue;
      final boolean isFlag;
      final int depth;

      Option(String var3) {
         this(null, var3, true);
      }

      Option(MixinEnvironment.Option.Inherit var3, boolean var4, String var5) {
         this(null, var3, var4, var5, true);
      }

      Option(String var3, String var4) {
         this(null, MixinEnvironment.Option.Inherit.INDEPENDENT, var3, false, var4);
      }

      Option(MixinEnvironment.Option var3, String var4) {
         this(var3, MixinEnvironment.Option.Inherit.INHERIT, var4, true);
      }

      Option(MixinEnvironment.Option var3, MixinEnvironment.Option.Inherit var4, String var5) {
         this(var3, var4, var5, true);
      }

      Option(MixinEnvironment.Option var3, String var4, boolean var5) {
         this(var3, MixinEnvironment.Option.Inherit.INHERIT, var4, var5, null);
      }

      Option(MixinEnvironment.Option var3, MixinEnvironment.Option.Inherit var4, String var5, boolean var6) {
         this(var3, var4, var5, var6, null);
      }

      Option(MixinEnvironment.Option var3, MixinEnvironment.Option.Inherit var4, boolean var5, String var6, boolean var7) {
         this(var3, var4, var5, var6, var7, null);
      }

      Option(MixinEnvironment.Option var3, MixinEnvironment.Option.Inherit var4, String var5, String var6) {
         this(var3, var4, var5, false, var6);
      }

      Option(MixinEnvironment.Option var3, MixinEnvironment.Option.Inherit var4, String var5, boolean var6, String var7) {
         this(var3, var4, false, var5, var6, var7);
      }

      Option(MixinEnvironment.Option var3, MixinEnvironment.Option.Inherit var4, boolean var5, String var6, boolean var7, String var8) {
         this.parent = var3;
         this.inheritance = var4;
         this.isHidden = var5;
         this.property = (var3 != null ? var3.property : "mixin") + "." + var6;
         this.defaultValue = var8;
         this.isFlag = var7;

         int var9;
         for (var9 = 0; var3 != null; var9++) {
            var3 = var3.parent;
         }

         this.depth = var9;
      }

      @Override
      public String toString() {
         return this.isFlag ? String.valueOf(this.getBooleanValue()) : this.getStringValue();
      }

      private boolean getLocalBooleanValue(boolean var1) {
         return Boolean.parseBoolean(System.getProperty(this.property, Boolean.toString(var1)));
      }

      private boolean getInheritedBooleanValue() {
         return this.parent != null && this.parent.getBooleanValue();
      }

      final boolean getBooleanValue() {
         if (this.inheritance == MixinEnvironment.Option.Inherit.ALWAYS_FALSE) {
            return false;
         }

         boolean var1 = this.getLocalBooleanValue(false);
         if (this.inheritance == MixinEnvironment.Option.Inherit.INDEPENDENT) {
            return var1;
         }

         boolean var2 = var1 || this.getInheritedBooleanValue();
         return this.inheritance == MixinEnvironment.Option.Inherit.INHERIT ? var2 : this.getLocalBooleanValue(var2);
      }

      final String getStringValue() {
         return this.inheritance != MixinEnvironment.Option.Inherit.INDEPENDENT && this.parent != null && !this.parent.getBooleanValue()
            ? this.defaultValue
            : System.getProperty(this.property, this.defaultValue);
      }

      <E extends Enum<E>> E getEnumValue(E var1) {
         String var2 = System.getProperty(this.property, var1.name());

         try {
            return Enum.valueOf(var1.getDeclaringClass(), var2.toUpperCase(Locale.ROOT));
         } catch (IllegalArgumentException var4) {
            return (E)var1;
         }
      }

      private enum Inherit {
         INHERIT,
         ALLOW_OVERRIDE,
         INDEPENDENT,
         ALWAYS_FALSE;
      }
   }

   public static final class Phase {
      static final MixinEnvironment.Phase NOT_INITIALISED = new MixinEnvironment.Phase(-1, "NOT_INITIALISED");
      public static final MixinEnvironment.Phase PREINIT = new MixinEnvironment.Phase(0, "PREINIT");
      public static final MixinEnvironment.Phase INIT = new MixinEnvironment.Phase(1, "INIT");
      public static final MixinEnvironment.Phase DEFAULT = new MixinEnvironment.Phase(2, "DEFAULT");
      static final List<MixinEnvironment.Phase> phases = ImmutableList.of(PREINIT, INIT, DEFAULT);
      final int ordinal;
      final String name;
      private MixinEnvironment environment;

      private Phase(int var1, String var2) {
         this.ordinal = var1;
         this.name = var2;
      }

      @Override
      public String toString() {
         return this.name;
      }

      public static MixinEnvironment.Phase forName(String var0) {
         for (MixinEnvironment.Phase var2 : phases) {
            if (var2.name.equals(var0)) {
               return var2;
            }
         }

         return null;
      }

      MixinEnvironment getEnvironment() {
         if (this.ordinal < 0) {
            throw new IllegalArgumentException("Cannot access the NOT_INITIALISED environment");
         }

         if (this.environment == null) {
            this.environment = new MixinEnvironment(this);
         }

         return this.environment;
      }
   }

   static class PhaseConsumer implements IConsumer<MixinEnvironment.Phase> {
      public void accept(MixinEnvironment.Phase var1) {
         MixinEnvironment.gotoPhase(var1);
      }
   }

   public enum Side {
      UNKNOWN {
         @Override
         protected boolean detect() {
            return false;
         }
      },
      CLIENT {
         @Override
         protected boolean detect() {
            String var1 = MixinService.getService().getSideName();
            return "CLIENT".equals(var1);
         }
      },
      SERVER {
         @Override
         protected boolean detect() {
            String var1 = MixinService.getService().getSideName();
            return "SERVER".equals(var1) || "DEDICATEDSERVER".equals(var1);
         }
      };

      Side() {
      }

      protected abstract boolean detect();
   }

   static class TokenProviderWrapper implements Comparable<MixinEnvironment.TokenProviderWrapper> {
      private static int nextOrder = 0;
      private final int priority;
      private final int order;
      private final IEnvironmentTokenProvider provider;
      private final MixinEnvironment environment;

      public TokenProviderWrapper(IEnvironmentTokenProvider var1, MixinEnvironment var2) {
         this.provider = var1;
         this.environment = var2;
         this.order = nextOrder++;
         this.priority = var1.getPriority();
      }

      public int compareTo(MixinEnvironment.TokenProviderWrapper var1) {
         if (var1 == null) {
            return 0;
         } else {
            return var1.priority == this.priority ? var1.order - this.order : var1.priority - this.priority;
         }
      }

      Integer getToken(String var1) {
         return this.provider.getToken(var1, this.environment);
      }
   }
}
