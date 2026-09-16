package org.spongepowered.asm.mixin.transformer;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.spongepowered.asm.launch.MixinInitialisationError;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.logging.Level;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.extensibility.IMixinConfig;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigSource;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorDynamic;
import org.spongepowered.asm.mixin.injection.selectors.TargetSelector;
import org.spongepowered.asm.mixin.refmap.IClassReferenceMapper;
import org.spongepowered.asm.mixin.refmap.IReferenceMapper;
import org.spongepowered.asm.mixin.refmap.ReferenceMapper;
import org.spongepowered.asm.mixin.refmap.RemappingReferenceMapper;
import org.spongepowered.asm.mixin.transformer.ext.Extensions;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.service.IMixinService;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.VersionNumber;
import org.spongepowered.include.com.google.common.base.Joiner;
import org.spongepowered.include.com.google.common.base.Strings;
import org.spongepowered.include.com.google.common.collect.ImmutableList;
import org.spongepowered.include.com.google.gson.Gson;
import org.spongepowered.include.com.google.gson.annotations.SerializedName;

final class MixinConfig implements Comparable<MixinConfig>, IMixinConfig {
   private static int configOrder = 0;
   private static final Set<String> globalMixinList = new HashSet<>();
   private final ILogger logger = MixinService.getService().getLogger("mixin");
   private final transient Map<String, List<MixinInfo>> mixinMapping = new HashMap<>();
   private final transient Set<String> unhandledTargets = new HashSet<>();
   private final transient List<MixinInfo> pendingMixins = new ArrayList<>();
   private final transient List<MixinInfo> mixins = new ArrayList<>();
   private transient Config handle;
   private transient MixinConfig parent;
   @SerializedName("parent")
   private String parentName;
   @SerializedName("target")
   private String selector;
   @SerializedName("minVersion")
   private String version;
   @SerializedName("requiredFeatures")
   private List<String> requiredFeatures;
   @SerializedName("compatibilityLevel")
   private String compatibility;
   @SerializedName("required")
   private Boolean requiredValue;
   private transient boolean required;
   @SerializedName("priority")
   private int priority = -1;
   @SerializedName("mixinPriority")
   private int mixinPriority = -1;
   @SerializedName("package")
   private String mixinPackage;
   @SerializedName("mixins")
   private List<String> mixinClasses;
   @SerializedName("client")
   private List<String> mixinClassesClient;
   @SerializedName("server")
   private List<String> mixinClassesServer;
   @SerializedName("setSourceFile")
   private boolean setSourceFile = false;
   @SerializedName("refmap")
   private String refMapperConfig;
   @SerializedName("refmapWrapper")
   private String refMapperWrapper;
   @SerializedName("verbose")
   private boolean verboseLogging;
   private final transient int order = configOrder++;
   private final transient List<MixinConfig.IListener> listeners = new ArrayList<>();
   private transient IMixinService service;
   private transient MixinEnvironment env;
   private transient String name;
   private transient IMixinConfigSource source;
   @SerializedName("plugin")
   private String pluginClassName;
   @SerializedName("injectors")
   private MixinConfig.InjectorOptions injectorOptions;
   @SerializedName("overwrites")
   private MixinConfig.OverwriteOptions overwriteOptions;
   private transient PluginHandle plugin;
   private transient IReferenceMapper refMapper;
   private transient boolean initialised = false;
   private transient boolean prepared = false;
   private transient boolean visited = false;
   private transient MixinEnvironment.CompatibilityLevel compatibilityLevel = MixinEnvironment.CompatibilityLevel.DEFAULT;
   private transient int warnedClassVersion = 0;
   private transient Map<String, Object> decorations;

   private MixinConfig() {
   }

   private boolean onLoad(IMixinService var1, String var2, MixinEnvironment var3, IMixinConfigSource var4) {
      this.service = var1;
      this.name = var2;
      this.source = var4;
      if (!Strings.isNullOrEmpty(this.parentName)) {
         return true;
      }

      this.env = this.parseSelector(this.selector, var3);
      this.verboseLogging = this.verboseLogging | this.env.getOption(MixinEnvironment.Option.DEBUG_VERBOSE);
      this.required = this.requiredValue != null && this.requiredValue && !this.env.getOption(MixinEnvironment.Option.IGNORE_REQUIRED);
      this.initPriority(1000, 1000);
      if (this.injectorOptions == null) {
         this.injectorOptions = new MixinConfig.InjectorOptions();
      }

      if (this.overwriteOptions == null) {
         this.overwriteOptions = new MixinConfig.OverwriteOptions();
      }

      return this.postInit();
   }

   String getParentName() {
      return this.parentName;
   }

   boolean assignParent(Config var1) {
      if (this.parent != null) {
         throw new MixinInitialisationError("Mixin config " + this.name + " was already initialised");
      }

      if (var1.get() == this) {
         throw new MixinInitialisationError("Mixin config " + this.name + " cannot be its own parent");
      }

      this.parent = var1.get();
      if (!this.parent.initialised) {
         throw new MixinInitialisationError(
            "Mixin config "
               + this.name
               + " attempted to assign uninitialised parent config. This probably means that there is an indirect loop in the mixin configs: child -> parent -> child"
         );
      }

      this.env = this.parseSelector(this.selector, this.parent.env);
      this.verboseLogging = this.verboseLogging | this.env.getOption(MixinEnvironment.Option.DEBUG_VERBOSE);
      this.required = this.requiredValue == null ? this.parent.required : this.requiredValue && !this.env.getOption(MixinEnvironment.Option.IGNORE_REQUIRED);
      this.initPriority(this.parent.priority, this.parent.mixinPriority);
      if (this.injectorOptions == null) {
         this.injectorOptions = this.parent.injectorOptions;
      } else {
         this.injectorOptions.mergeFrom(this.parent.injectorOptions);
      }

      if (this.overwriteOptions == null) {
         this.overwriteOptions = this.parent.overwriteOptions;
      } else {
         this.overwriteOptions.mergeFrom(this.parent.overwriteOptions);
      }

      this.setSourceFile = this.setSourceFile | this.parent.setSourceFile;
      this.verboseLogging = this.verboseLogging | this.parent.verboseLogging;
      return this.postInit();
   }

   private void initPriority(int var1, int var2) {
      if (this.priority < 0) {
         this.priority = var1;
      }

      if (this.mixinPriority < 0) {
         this.mixinPriority = var2;
      }
   }

   private boolean postInit() {
      if (this.initialised) {
         throw new MixinInitialisationError("Mixin config " + this.name + " was already initialised.");
      }

      this.initialised = true;
      this.initCompatibilityLevel();
      this.initExtensions();
      return this.checkVersion() && this.checkFeatures();
   }

   private void initCompatibilityLevel() {
      this.compatibilityLevel = MixinEnvironment.getCompatibilityLevel();
      if (this.compatibility != null) {
         String var1 = this.compatibility.trim().toUpperCase(Locale.ROOT);

         try {
            this.compatibilityLevel = MixinEnvironment.CompatibilityLevel.valueOf(var1);
         } catch (IllegalArgumentException var4) {
            throw new MixinInitialisationError(String.format("Mixin config %s specifies compatibility level %s which is not recognised", this.name, var1));
         }

         MixinEnvironment.CompatibilityLevel var2 = MixinEnvironment.getCompatibilityLevel();
         if (this.compatibilityLevel != var2) {
            if (var2.isAtLeast(this.compatibilityLevel) && !var2.canSupport(this.compatibilityLevel)) {
               throw new MixinInitialisationError(
                  String.format("Mixin config %s requires compatibility level %s which is too old", this.name, this.compatibilityLevel)
               );
            }

            if (!var2.canElevateTo(this.compatibilityLevel)) {
               throw new MixinInitialisationError(
                  String.format("Mixin config %s requires compatibility level %s which is prohibited by %s", this.name, this.compatibilityLevel, var2)
               );
            }

            MixinEnvironment.CompatibilityLevel var3 = MixinEnvironment.getMinCompatibilityLevel();
            if (this.compatibilityLevel.isLessThan(var3)) {
               this.logger
                  .log(
                     this.verboseLogging ? Level.INFO : Level.DEBUG,
                     "Compatibility level {} specified by {} is lower than the default level supported by the current mixin service ({}).",
                     this.compatibilityLevel,
                     this,
                     var3
                  );
            }

            if (MixinEnvironment.CompatibilityLevel.MAX_SUPPORTED.isLessThan(this.compatibilityLevel)) {
               this.logger
                  .log(
                     this.verboseLogging ? Level.WARN : Level.DEBUG,
                     "Compatibility level {} specified by {} is higher than the maximum level supported by this version of mixin ({}).",
                     this.compatibilityLevel,
                     this,
                     MixinEnvironment.CompatibilityLevel.MAX_SUPPORTED
                  );
            }

            MixinEnvironment.setCompatibilityLevel(this.compatibilityLevel);
         }
      }
   }

   void checkCompatibilityLevel(MixinInfo var1, int var2, int var3) {
      if (var2 > this.compatibilityLevel.getClassMajorVersion()) {
         Level var4 = this.verboseLogging && var2 > this.warnedClassVersion ? Level.WARN : Level.DEBUG;
         String var5 = var2 > MixinEnvironment.CompatibilityLevel.MAX_SUPPORTED.getClassMajorVersion()
            ? "the current version of Mixin"
            : "the declared compatibility level";
         this.warnedClassVersion = var2;
         this.logger
            .log(
               var4,
               "{}: Class version {} required is higher than the class version supported by {} ({} supports class version {})",
               var1,
               var2,
               var5,
               this.compatibilityLevel,
               this.compatibilityLevel.getClassMajorVersion()
            );
      }
   }

   private MixinEnvironment parseSelector(String var1, MixinEnvironment var2) {
      if (var1 != null) {
         String[] var3 = var1.split("[&\\| ]");

         for (String var7 : var3) {
            var7 = var7.trim();
            Pattern var8 = Pattern.compile("^@env(?:ironment)?\\(([A-Z]+)\\)$");
            Matcher var9 = var8.matcher(var7);
            if (var9.matches()) {
               return MixinEnvironment.getEnvironment(MixinEnvironment.Phase.forName(var9.group(1)));
            }
         }

         MixinEnvironment.Phase var10 = MixinEnvironment.Phase.forName(var1);
         if (var10 != null) {
            return MixinEnvironment.getEnvironment(var10);
         }
      }

      return var2;
   }

   private void initExtensions() {
      if (this.injectorOptions.injectionPoints != null) {
         for (String var2 : this.injectorOptions.injectionPoints) {
            this.initInjectionPoint(var2, this.injectorOptions.namespace);
         }
      }

      if (this.injectorOptions.dynamicSelectors != null) {
         for (String var4 : this.injectorOptions.dynamicSelectors) {
            this.initDynamicSelector(var4, this.injectorOptions.namespace);
         }
      }
   }

   private void initInjectionPoint(String var1, String var2) {
      try {
         Class var3 = this.findExtensionClass(var1, InjectionPoint.class, "injection point");
         if (var3 != null) {
            try {
               var3.getMethod("find", String.class, InsnList.class, Collection.class);
            } catch (NoSuchMethodException var5) {
               this.logger.error("Unable to register injection point {} for {}, the class is not compatible with this version of Mixin", var1, this, var5);
               return;
            }

            InjectionPoint.register(var3, var2);
         }
      } catch (Throwable var6) {
         this.logger.catching(var6);
      }
   }

   private void initDynamicSelector(String var1, String var2) {
      try {
         Class var3 = this.findExtensionClass(var1, ITargetSelectorDynamic.class, "dynamic selector");
         if (var3 != null) {
            TargetSelector.register(var3, var2);
         }
      } catch (Throwable var4) {
         this.logger.catching(var4);
      }
   }

   private Class<?> findExtensionClass(String var1, Class<?> var2, String var3) {
      Class var4 = null;

      try {
         var4 = this.service.getClassProvider().findClass(var1, true);
      } catch (ClassNotFoundException var6) {
         this.logger.error("Unable to register {} {} for {}, the specified class was not found", var3, var1, this, var6);
         return null;
      }

      if (!var2.isAssignableFrom(var4)) {
         this.logger.error("Unable to register {} {} for {}, class is not assignable to {}", var3, var1, this, var2);
         return null;
      } else {
         return var4;
      }
   }

   private boolean checkVersion() {
      if (this.version == null) {
         if (this.parent != null && this.parent.version != null) {
            return true;
         }

         if (this.requiredFeatures == null || this.requiredFeatures.isEmpty()) {
            this.logger.debug("Mixin config {} does not specify \"minVersion\" or \"requiredFeatures\" property", this.name);
         }
      }

      VersionNumber var1 = VersionNumber.parse(this.version);
      VersionNumber var2 = VersionNumber.parse(this.env.getVersion());
      if (var1.compareTo(var2) > 0) {
         this.logger.warn("Mixin config {} requires mixin subsystem version {} but {} was found. The mixin config will not be applied.", this.name, var1, var2);
         if (this.required) {
            throw new MixinInitialisationError("Required mixin config " + this.name + " requires mixin subsystem version " + var1);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   private boolean checkFeatures() {
      if (this.requiredFeatures != null && !this.requiredFeatures.isEmpty()) {
         LinkedHashSet var1 = new LinkedHashSet();

         for (String var3 : this.requiredFeatures) {
            var3 = var3.trim().toUpperCase(Locale.ROOT);
            if (!MixinEnvironment.Feature.isActive(var3)) {
               var1.add(var3);
            }
         }

         if (var1.isEmpty()) {
            return true;
         } else {
            String var4 = Joiner.on(", ").join(var1);
            this.logger.warn("Mixin config {} requires features [{}] which are not available. The mixin config will not be applied.", this.name, var4);
            if (this.required) {
               throw new MixinInitialisationError("Required mixin config " + this.name + " requires features [" + var4 + " which are not available");
            } else {
               return false;
            }
         }
      } else {
         return true;
      }
   }

   void addListener(MixinConfig.IListener var1) {
      this.listeners.add(var1);
   }

   void onSelect() {
      this.plugin = new PluginHandle(this, this.service, this.pluginClassName);
      this.plugin.onLoad(Strings.nullToEmpty(this.mixinPackage));
      if (!Strings.isNullOrEmpty(this.mixinPackage)) {
         if (!this.mixinPackage.endsWith(".")) {
            this.mixinPackage = this.mixinPackage + ".";
         }

         boolean var1 = false;
         if (this.refMapperConfig == null) {
            this.refMapperConfig = this.plugin.getRefMapperConfig();
            if (this.refMapperConfig == null) {
               var1 = true;
               this.refMapperConfig = "mixin.refmap.json";
            }
         }

         this.refMapper = ReferenceMapper.read(this.refMapperConfig);
         if (!var1 && this.refMapper.isDefault() && !this.env.getOption(MixinEnvironment.Option.DISABLE_REFMAP)) {
            this.logger
               .warn(
                  "Reference map '{}' for {} could not be read. If this is a development environment you can ignore this message", this.refMapperConfig, this
               );
         }

         if (this.env.getOption(MixinEnvironment.Option.REFMAP_REMAP)) {
            this.refMapper = RemappingReferenceMapper.of(this.env, this.refMapper);
         }

         if (this.refMapperWrapper != null) {
            String var2 = this.mixinPackage + this.refMapperWrapper;

            try {
               Class var3 = this.service.getClassProvider().findClass(var2, true);
               Constructor var4 = var3.getConstructor(MixinEnvironment.class, IReferenceMapper.class);
               this.refMapper = (IReferenceMapper)var4.newInstance(this.env, this.refMapper);
            } catch (ClassNotFoundException var5) {
               this.logger.error("Reference map wrapper '{}' could not be found: ", var2, var5);
            } catch (ReflectiveOperationException var6) {
               this.logger.error("Reference map wrapper '{}' could not be created: ", var2, var6);
            } catch (SecurityException var7) {
               this.logger.error("Reference map wrapper '{}' could not be created: ", var2, var7);
            }
         }
      }
   }

   void prepare(Extensions var1) {
      if (!this.prepared) {
         this.prepared = true;
         this.prepareMixins("mixins", this.mixinClasses, false, var1);
         switch (this.env.getSide()) {
            case CLIENT:
               this.prepareMixins("client", this.mixinClassesClient, false, var1);
               break;
            case SERVER:
               this.prepareMixins("server", this.mixinClassesServer, false, var1);
               break;
            case UNKNOWN:
            default:
               this.logger.warn("Mixin environment was unable to detect the current side, sided mixins will not be applied");
         }
      }
   }

   void postInitialise(Extensions var1) {
      if (this.plugin != null) {
         List var2 = this.plugin.getMixins();
         this.prepareMixins("companion plugin", var2, true, var1);
      }

      Iterator var8 = this.mixins.iterator();

      while (var8.hasNext()) {
         MixinInfo var3 = (MixinInfo)var8.next();

         try {
            var3.validate();

            for (MixinConfig.IListener var5 : this.listeners) {
               var5.onInit(var3);
            }
         } catch (InvalidMixinException var6) {
            this.logger.error(var6.getMixin() + ": " + var6.getMessage(), var6);
            this.removeMixin(var3);
            var8.remove();
         } catch (Exception var7) {
            this.logger.error(var7.getMessage(), var7);
            this.removeMixin(var3);
            var8.remove();
         }
      }
   }

   private void removeMixin(MixinInfo var1) {
      for (List var3 : this.mixinMapping.values()) {
         Iterator var4 = var3.iterator();

         while (var4.hasNext()) {
            if (var1 == var4.next()) {
               var4.remove();
            }
         }
      }
   }

   private void prepareMixins(String var1, List<String> var2, boolean var3, Extensions var4) {
      if (var2 != null) {
         if (Strings.isNullOrEmpty(this.mixinPackage)) {
            if (var2.size() > 0) {
               this.logger
                  .error(
                     "{} declares mixin classes in {} but does not specify a package, {} orphaned mixins will not be loaded: {}", this, var1, var2.size(), var2
                  );
            }
         } else {
            for (String var6 : var2) {
               String var7 = this.mixinPackage + var6;
               if (var6 != null && !globalMixinList.contains(var7)) {
                  MixinInfo var8 = null;

                  try {
                     this.pendingMixins.add(var8 = new MixinInfo(this.service, this, var6, this.plugin, var3, var4));
                     globalMixinList.add(var7);
                  } catch (InvalidMixinException var12) {
                     if (this.required) {
                        throw var12;
                     }

                     this.logger.error(var12.getMessage(), var12);
                  } catch (Exception var13) {
                     if (this.required) {
                        throw new InvalidMixinException(var8, "Error initialising mixin " + var8 + " - " + var13.getClass() + ": " + var13.getMessage(), var13);
                     }

                     this.logger.error(var13.getMessage(), var13);
                  }
               }
            }

            for (MixinInfo var15 : this.pendingMixins) {
               try {
                  var15.parseTargets();
                  if (var15.getTargetClasses().size() > 0) {
                     for (String var18 : var15.getTargetClasses()) {
                        String var9 = var18.replace('/', '.');
                        this.mixinsFor(var9).add(var15);
                        this.unhandledTargets.add(var9);
                     }

                     for (MixinConfig.IListener var19 : this.listeners) {
                        var19.onPrepare(var15);
                     }

                     this.mixins.add(var15);
                  }
               } catch (InvalidMixinException var10) {
                  if (this.required) {
                     throw var10;
                  }

                  this.logger.error(var10.getMessage(), var10);
               } catch (Exception var11) {
                  if (this.required) {
                     throw new InvalidMixinException(var15, "Error initialising mixin " + var15 + " - " + var11.getClass() + ": " + var11.getMessage(), var11);
                  }

                  this.logger.error(var11.getMessage(), var11);
               }
            }

            this.pendingMixins.clear();
         }
      }
   }

   void postApply(String var1, ClassNode var2) {
      this.unhandledTargets.remove(var1);
   }

   public Config getHandle() {
      if (this.handle == null) {
         this.handle = new Config(this);
      }

      return this.handle;
   }

   @Override
   public boolean isRequired() {
      return this.required;
   }

   @Override
   public MixinEnvironment getEnvironment() {
      return this.env;
   }

   MixinConfig getParent() {
      return this.parent;
   }

   @Override
   public String getName() {
      return this.name;
   }

   @Override
   public IMixinConfigSource getSource() {
      return this.source;
   }

   @Override
   public String getCleanSourceId() {
      if (this.source == null) {
         return null;
      }

      String var1 = this.source.getId();
      return var1 == null ? null : var1.replaceAll("[^A-Za-z]", "");
   }

   @Override
   public String getMixinPackage() {
      return Strings.nullToEmpty(this.mixinPackage);
   }

   @Override
   public int getPriority() {
      return this.priority;
   }

   public int getDefaultMixinPriority() {
      return this.mixinPriority;
   }

   public int getDefaultRequiredInjections() {
      return this.injectorOptions.defaultRequireValue;
   }

   public String getDefaultInjectorGroup() {
      String var1 = this.injectorOptions.defaultGroup;
      return var1 != null && !var1.isEmpty() ? var1 : "default";
   }

   public boolean conformOverwriteVisibility() {
      return this.overwriteOptions.conformAccessModifiers;
   }

   public boolean requireOverwriteAnnotations() {
      return this.overwriteOptions.requireOverwriteAnnotations;
   }

   public int getMaxShiftByValue() {
      return Math.min(Math.max(this.injectorOptions.maxShiftBy, 0), 5);
   }

   public boolean select(MixinEnvironment var1) {
      this.visited = true;
      return this.env == var1;
   }

   boolean isVisited() {
      return this.visited;
   }

   int getDeclaredMixinCount() {
      return getCollectionSize(this.mixinClasses, this.mixinClassesClient, this.mixinClassesServer);
   }

   int getMixinCount() {
      return this.mixins.size();
   }

   public List<String> getClasses() {
      if (Strings.isNullOrEmpty(this.mixinPackage)) {
         return Collections.emptyList();
      }

      ImmutableList.Builder var1 = ImmutableList.builder();

      for (List var5 : new List[]{this.mixinClasses, this.mixinClassesClient, this.mixinClassesServer}) {
         if (var5 != null) {
            for (String var7 : var5) {
               var1.add(this.mixinPackage + var7);
            }
         }
      }

      return var1.build();
   }

   public boolean shouldSetSourceFile() {
      return this.setSourceFile;
   }

   public IReferenceMapper getReferenceMapper() {
      if (this.env.getOption(MixinEnvironment.Option.DISABLE_REFMAP)) {
         return ReferenceMapper.DEFAULT_MAPPER;
      }

      this.refMapper.setContext(this.env.getRefmapObfuscationContext());
      return this.refMapper;
   }

   String remapClassName(String var1, String var2) {
      IReferenceMapper var3 = this.getReferenceMapper();
      return var3 instanceof IClassReferenceMapper ? ((IClassReferenceMapper)var3).remapClassName(var1, var2) : var3.remap(var1, var2);
   }

   @Override
   public IMixinConfigPlugin getPlugin() {
      return this.plugin.get();
   }

   public Set<String> getTargetsSet() {
      return this.mixinMapping.keySet();
   }

   @Override
   public Set<String> getTargets() {
      return Collections.unmodifiableSet(this.mixinMapping.keySet());
   }

   public Set<String> getUnhandledTargets() {
      return Collections.unmodifiableSet(this.unhandledTargets);
   }

   @Override
   public <V> void decorate(String var1, V var2) {
      if (this.decorations == null) {
         this.decorations = new HashMap<>();
      }

      if (this.decorations.containsKey(var1)) {
         throw new IllegalArgumentException(String.format("Decoration with key '%s' already exists on config %s", var1, this));
      }

      this.decorations.put(var1, var2);
   }

   @Override
   public boolean hasDecoration(String var1) {
      return this.decorations != null && this.decorations.get(var1) != null;
   }

   @Override
   public <V> V getDecoration(String var1) {
      return (V)(this.decorations == null ? null : this.decorations.get(var1));
   }

   public Level getLoggingLevel() {
      return this.verboseLogging ? Level.INFO : Level.DEBUG;
   }

   public boolean isVerboseLogging() {
      return this.verboseLogging;
   }

   public boolean packageMatch(String var1) {
      return !Strings.isNullOrEmpty(this.mixinPackage) && var1.startsWith(this.mixinPackage);
   }

   public boolean hasMixinsFor(String var1) {
      return this.mixinMapping.containsKey(var1);
   }

   boolean hasPendingMixinsFor(String var1) {
      if (this.packageMatch(var1)) {
         return false;
      }

      for (MixinInfo var3 : this.pendingMixins) {
         if (var3.hasDeclaredTarget(var1)) {
            return true;
         }
      }

      return false;
   }

   public List<MixinInfo> getMixinsFor(String var1) {
      return this.mixinsFor(var1);
   }

   private List<MixinInfo> mixinsFor(String var1) {
      List var2 = this.mixinMapping.get(var1);
      if (var2 == null) {
         var2 = new ArrayList();
         this.mixinMapping.put(var1, var2);
      }

      return var2;
   }

   public List<String> reloadMixin(String var1, ClassNode var2) {
      for (MixinInfo var4 : this.mixins) {
         if (var4.getClassName().equals(var1)) {
            var4.reloadMixin(var2);
            return var4.getTargetClasses();
         }
      }

      return Collections.emptyList();
   }

   @Override
   public String toString() {
      return this.name;
   }

   public int compareTo(MixinConfig var1) {
      if (var1 == null) {
         return 0;
      } else if (var1.priority == this.priority) {
         return Integer.compare(this.order, var1.order);
      } else {
         return this.priority < var1.priority ? -1 : 1;
      }
   }

   static Config create(String var0, MixinEnvironment var1, IMixinConfigSource var2) {
      try {
         IMixinService var3 = MixinService.getService();
         InputStream var4 = var3.getResourceAsStream(var0);
         if (var4 == null) {
            throw new IllegalArgumentException(String.format("The specified resource '%s' was invalid or could not be read", var0));
         }

         InputStreamReader var5 = new InputStreamReader(var4);

         Config var7;
         label37: {
            try {
               MixinConfig var6 = new Gson().fromJson(var5, MixinConfig.class);
               if (var6.onLoad(var3, var0, var1, var2)) {
                  var7 = var6.getHandle();
                  break label37;
               }
            } catch (Throwable var9) {
               try {
                  var5.close();
               } catch (Throwable var8) {
                  var9.addSuppressed(var8);
               }

               throw var9;
            }

            var5.close();
            return null;
         }

         var5.close();
         return var7;
      } catch (IllegalArgumentException var10) {
         throw var10;
      } catch (Exception var11) {
         throw new IllegalArgumentException(String.format("The specified resource '%s' was invalid or could not be read", var0), var11);
      }
   }

   private static int getCollectionSize(Collection<?>... var0) {
      int var1 = 0;

      for (Collection var5 : var0) {
         if (var5 != null) {
            var1 += var5.size();
         }
      }

      return var1;
   }

   interface IListener {
      void onPrepare(MixinInfo var1);

      void onInit(MixinInfo var1);
   }

   static class InjectorOptions {
      @SerializedName("defaultRequire")
      int defaultRequireValue = 0;
      @SerializedName("defaultGroup")
      String defaultGroup = "default";
      @SerializedName("namespace")
      String namespace;
      @SerializedName("injectionPoints")
      List<String> injectionPoints;
      @SerializedName("dynamicSelectors")
      List<String> dynamicSelectors;
      @SerializedName("maxShiftBy")
      int maxShiftBy = 0;

      void mergeFrom(MixinConfig.InjectorOptions var1) {
         if (this.defaultRequireValue == 0) {
            this.defaultRequireValue = var1.defaultRequireValue;
         }

         if ("default".equals(this.defaultGroup)) {
            this.defaultGroup = var1.defaultGroup;
         }

         if (this.maxShiftBy == 0) {
            this.maxShiftBy = var1.maxShiftBy;
         }
      }
   }

   static class OverwriteOptions {
      @SerializedName("conformVisibility")
      boolean conformAccessModifiers;
      @SerializedName("requireAnnotations")
      boolean requireOverwriteAnnotations;

      void mergeFrom(MixinConfig.OverwriteOptions var1) {
         this.conformAccessModifiers = this.conformAccessModifiers | var1.conformAccessModifiers;
         this.requireOverwriteAnnotations = this.requireOverwriteAnnotations | var1.requireOverwriteAnnotations;
      }
   }
}
