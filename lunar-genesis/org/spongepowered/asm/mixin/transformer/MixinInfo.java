package org.spongepowered.asm.mixin.transformer;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.objectweb.asm.Handle;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InnerClassNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.logging.Level;
import org.spongepowered.asm.mixin.FabricUtil;
import org.spongepowered.asm.mixin.Implements;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.extensibility.IMixinConfig;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.injection.Surrogate;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.transformer.ext.Extensions;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.mixin.transformer.throwables.MixinReloadException;
import org.spongepowered.asm.mixin.transformer.throwables.MixinTargetAlreadyLoadedException;
import org.spongepowered.asm.service.IClassTracker;
import org.spongepowered.asm.service.IMixinService;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.LanguageFeatures;
import org.spongepowered.asm.util.asm.ASM;
import org.spongepowered.asm.util.asm.MethodNodeEx;
import org.spongepowered.asm.util.perf.Profiler;
import org.spongepowered.include.com.google.common.base.Functions;
import org.spongepowered.include.com.google.common.collect.Iterables;
import org.spongepowered.include.com.google.common.collect.Lists;

class MixinInfo implements Comparable<MixinInfo>, IMixinInfo {
   static int mixinOrder = 0;
   private final transient ILogger logger = MixinService.getService().getLogger("mixin");
   private final transient Profiler profiler = Profiler.getProfiler("mixin");
   private final transient MixinConfig parent;
   private final String name;
   private final String className;
   private final int priority;
   private final boolean virtual;
   private final transient List<MixinInfo.DeclaredTarget> declaredTargets;
   private final transient List<ClassInfo> targetClasses = new ArrayList<>();
   private final List<String> targetClassNames = new ArrayList<>();
   private final transient int order = mixinOrder++;
   private final transient IMixinService service;
   private final transient PluginHandle plugin;
   private final transient MixinEnvironment.Phase phase;
   private final transient ClassInfo info;
   private final transient MixinInfo.SubType type;
   private final transient boolean strict;
   private final transient Extensions extensions;
   private transient MixinInfo.State pendingState;
   private transient MixinInfo.State state;

   MixinInfo(IMixinService var1, MixinConfig var2, String var3, PluginHandle var4, boolean var5, Extensions var6) {
      this.service = var1;
      this.parent = var2;
      this.name = var3;
      this.className = var2.getMixinPackage() + var3;
      this.plugin = var4;
      this.phase = var2.getEnvironment().getPhase();
      this.strict = var2.getEnvironment().getOption(MixinEnvironment.Option.DEBUG_TARGETS);
      this.extensions = var6;

      try {
         ClassNode var7 = this.loadMixinClass(this.className);
         this.pendingState = new MixinInfo.State(var7);
         this.info = this.pendingState.getClassInfo();
         this.type = MixinInfo.SubType.getTypeFor(this);
      } catch (InvalidMixinException var10) {
         throw var10;
      } catch (Exception var11) {
         throw new InvalidMixinException(this, var11.getMessage(), var11);
      }

      if (!this.type.isLoadable()) {
         IClassTracker var12 = this.service.getClassTracker();
         if (var12 != null) {
            var12.registerInvalidClass(this.className);
         }
      }

      try {
         this.priority = this.readPriority(this.pendingState.getClassNode());
         this.virtual = this.readPseudo(this.pendingState.getValidationClassNode());
         this.declaredTargets = this.readDeclaredTargets(this.pendingState.getValidationClassNode(), var5);
      } catch (InvalidMixinException var8) {
         throw var8;
      } catch (Exception var9) {
         throw new InvalidMixinException(this, var9);
      }
   }

   void parseTargets() {
      try {
         this.targetClasses.addAll(this.readTargetClasses(this.declaredTargets));
         this.targetClassNames.addAll(Lists.transform(this.targetClasses, Functions.toStringFunction()));
      } catch (InvalidMixinException var2) {
         throw var2;
      } catch (Exception var3) {
         throw new InvalidMixinException(this, var3);
      }
   }

   void validate() {
      if (this.pendingState == null) {
         throw new IllegalStateException("No pending validation state for " + this);
      }

      try {
         this.pendingState.validate(this.type, this.targetClasses);
         this.state = this.pendingState;
      } finally {
         this.pendingState = null;
      }
   }

   void validateInnerClass(ClassNode var1) {
      this.type.validateInnerClass(var1);
   }

   protected List<MixinInfo.DeclaredTarget> readDeclaredTargets(MixinInfo.MixinClassNode var1, boolean var2) {
      if (var1 == null) {
         return Collections.emptyList();
      }

      AnnotationNode var3 = Annotations.getInvisible(var1, Mixin.class);
      if (var3 == null) {
         throw new InvalidMixinException(this, String.format("The mixin '%s' is missing an @Mixin annotation", this.className));
      }

      IClassTracker var4 = this.service.getClassTracker();
      ArrayList var5 = new ArrayList();

      for (Object var7 : this.readTargets(var3)) {
         MixinInfo.DeclaredTarget var8 = MixinInfo.DeclaredTarget.of(var7, this);
         if (var8 != null) {
            if (var4 != null && var4.isClassLoaded(var8.name) && !this.isReloading()) {
               String var9 = String.format("Critical problem: %s target %s was loaded too early.", this, var8.name);
               if (this.parent.isRequired()) {
                  throw new MixinTargetAlreadyLoadedException(this, var9, var8.name);
               }

               this.logger.error(var9);
            }

            if (this.shouldApplyMixin(var2, var8.name)) {
               var5.add(var8);
            }
         }
      }

      return var5;
   }

   private Iterable<Object> readTargets(AnnotationNode var1) {
      Iterable var2 = Annotations.getValue(var1, "value");
      Iterable var3 = Annotations.getValue(var1, "targets");
      if (var2 == null && var3 == null) {
         return Collections.emptyList();
      } else if (var2 == null) {
         return var3;
      } else {
         return var3 == null ? var2 : Iterables.concat(var2, var3);
      }
   }

   private boolean shouldApplyMixin(boolean var1, String var2) {
      Profiler.Section var3 = this.profiler.begin("plugin");
      boolean var4 = var1 || this.plugin.shouldApplyMixin(var2, this.className);
      var3.end();
      return var4;
   }

   List<ClassInfo> readTargetClasses(MixinInfo.MixinClassNode var1, boolean var2) {
      return this.readTargetClasses(this.readDeclaredTargets(var1, var2));
   }

   private List<ClassInfo> readTargetClasses(List<MixinInfo.DeclaredTarget> var1) {
      ArrayList var2 = new ArrayList();

      for (MixinInfo.DeclaredTarget var4 : var1) {
         ClassInfo var5 = this.getTargetClass(var4);
         if (var5 != null) {
            var2.add(var5);
            var5.addMixin(this);
         }
      }

      return var2;
   }

   private ClassInfo getTargetClass(MixinInfo.DeclaredTarget var1) {
      ClassInfo var2 = ClassInfo.forName(var1.name);
      if (var2 == null) {
         if (this.isVirtual()) {
            this.logger.debug("Skipping virtual target {} for {}", var1.name, this);
         } else {
            this.handleTargetError(String.format("@Mixin target %s was not found %s", var1.name, this), false);
         }

         return null;
      } else {
         this.type.validateTarget(var1.name, var2);
         return var2;
      }
   }

   private void handleTargetError(String var1, boolean var2) {
      if (!this.strict && (FabricUtil.getCompatibility(this.parent) < 17004 || !this.parent.isRequired())) {
         this.logger.log(var2 && !this.parent.isVerboseLogging() ? Level.DEBUG : Level.WARN, var1);
      } else {
         this.logger.error(var1);
         throw new InvalidMixinException(this, var1);
      }
   }

   protected int readPriority(ClassNode var1) {
      if (var1 == null) {
         return this.parent.getDefaultMixinPriority();
      }

      AnnotationNode var2 = Annotations.getInvisible(var1, Mixin.class);
      if (var2 == null) {
         throw new InvalidMixinException(this, String.format("The mixin '%s' is missing an @Mixin annotation", this.className));
      }

      Integer var3 = Annotations.getValue(var2, "priority");
      return var3 == null ? this.parent.getDefaultMixinPriority() : var3;
   }

   protected boolean readPseudo(ClassNode var1) {
      return Annotations.getInvisible(var1, Pseudo.class) != null;
   }

   private boolean isReloading() {
      return this.pendingState instanceof MixinInfo.Reloaded;
   }

   String remapClassName(String var1) {
      return this.parent.remapClassName(this.getClassRef(), var1);
   }

   public boolean hasDeclaredTarget(String var1) {
      for (MixinInfo.DeclaredTarget var3 : this.declaredTargets) {
         if (var1.equals(var3.name)) {
            return true;
         }
      }

      return false;
   }

   private MixinInfo.State getState() {
      return this.state != null ? this.state : this.pendingState;
   }

   ClassInfo getClassInfo() {
      return this.info;
   }

   @Override
   public IMixinConfig getConfig() {
      return this.parent;
   }

   MixinConfig getParent() {
      return this.parent;
   }

   @Override
   public int getPriority() {
      return this.priority;
   }

   @Override
   public String getName() {
      return this.name;
   }

   @Override
   public String getClassName() {
      return this.className;
   }

   @Override
   public String getClassRef() {
      return this.getClassInfo().getName();
   }

   @Override
   public byte[] getClassBytes() {
      throw new RuntimeException("NO");
   }

   @Override
   public boolean isDetachedSuper() {
      return this.getState().isDetachedSuper();
   }

   public boolean isUnique() {
      return this.getState().isUnique();
   }

   public boolean isVirtual() {
      return this.virtual;
   }

   public boolean isAccessor() {
      return this.type instanceof MixinInfo.SubType.Accessor;
   }

   public boolean isLoadable() {
      return this.type.isLoadable();
   }

   public boolean isRequired() {
      return this.parent.isRequired();
   }

   public Level getLoggingLevel() {
      return this.parent.getLoggingLevel();
   }

   @Override
   public MixinEnvironment.Phase getPhase() {
      return this.phase;
   }

   public MixinInfo.MixinClassNode getClassNode(int var1) {
      return this.getState().createClassNode(var1);
   }

   List<String> getDeclaredTargetClasses() {
      return Collections.unmodifiableList(Lists.transform(this.declaredTargets, Functions.toStringFunction()));
   }

   @Override
   public List<String> getTargetClasses() {
      return Collections.unmodifiableList(this.targetClassNames);
   }

   List<InterfaceInfo> getSoftImplements() {
      return Collections.unmodifiableList(this.getState().getSoftImplements());
   }

   Set<String> getInnerClasses() {
      return Collections.unmodifiableSet(this.getState().getInnerClasses());
   }

   List<ClassInfo> getTargets() {
      return Collections.unmodifiableList(this.targetClasses);
   }

   Set<String> getInterfaces() {
      return this.getState().getInterfaces();
   }

   int getClassVersion() {
      return this.getState().getClassNode().version;
   }

   Extensions getExtensions() {
      return this.extensions;
   }

   MixinTargetContext createContextFor(TargetClassContext var1) {
      MixinInfo.MixinClassNode var2 = this.getClassNode(8);
      Profiler.Section var3 = this.profiler.begin("pre");
      MixinTargetContext var4 = this.type.createPreProcessor(var2).prepare(this.extensions).createContextFor(var1);
      var3.end();
      return var4;
   }

   private ClassNode loadMixinClass(String var1) {
      Object var2 = null;

      try {
         IClassTracker var3 = this.service.getClassTracker();
         if (var3 != null) {
            String var4 = var3.getClassRestrictions(var1);
            if (var4.length() > 0) {
               this.logger.error("Classloader restrictions [{}] encountered loading {}, name: {}", var4, this, var1);
            }
         }

         int var7 = this.parent.getEnvironment().getOption(MixinEnvironment.Option.CLASSREADER_EXPAND_FRAMES) ? 8 : 0;
         return this.service.getBytecodeProvider().getClassNode(var1, true, var7);
      } catch (ClassNotFoundException var5) {
         throw new ClassNotFoundException(String.format("The specified mixin '%s' was not found", var1));
      } catch (IOException var6) {
         this.logger.warn("Failed to load mixin {}, the specified mixin will not be applied", var1);
         throw new InvalidMixinException(this, "An error was encountered whilst loading the mixin class", var6);
      }
   }

   void reloadMixin(ClassNode var1) {
      if (this.pendingState != null) {
         throw new IllegalStateException("Cannot reload mixin while it is initialising");
      }

      this.pendingState = new MixinInfo.Reloaded(this.state, var1);
      this.validate();
   }

   public int compareTo(MixinInfo var1) {
      if (var1 == null) {
         return 0;
      } else if (var1.priority == this.priority) {
         return Integer.compare(this.order, var1.order);
      } else {
         return this.priority < var1.priority ? -1 : 1;
      }
   }

   public void preApply(String var1, ClassNode var2) {
      if (this.plugin.isAvailable()) {
         Profiler.Section var3 = this.profiler.begin("plugin");

         try {
            this.plugin.preApply(var1, var2, this.className, this);
         } finally {
            var3.end();
         }
      }
   }

   public void postApply(String var1, ClassNode var2) {
      if (this.plugin.isAvailable()) {
         Profiler.Section var3 = this.profiler.begin("plugin");

         try {
            this.plugin.postApply(var1, var2, this.className, this);
         } finally {
            var3.end();
         }
      }

      this.parent.postApply(var1, var2);
      this.info.addAppliedMixin(this);
   }

   @Override
   public String toString() {
      return String.format("%s:%s from mod %s", this.parent.getName(), this.name, FabricUtil.getModId(this.getConfig()));
   }

   static MixinInfo.Variant getVariant(ClassNode var0) {
      return getVariant(ClassInfo.fromClassNode(var0));
   }

   static MixinInfo.Variant getVariant(ClassInfo var0) {
      if (var0.isEnum()) {
         return MixinInfo.Variant.ENUM_EXTENSION;
      }

      if (!var0.isInterface()) {
         return MixinInfo.Variant.STANDARD;
      }

      boolean var1 = false;

      for (ClassInfo.Method var3 : var0.getMethods()) {
         var1 |= !var3.isAccessor() && !var3.isSynthetic();
      }

      return var1 ? MixinInfo.Variant.INTERFACE : MixinInfo.Variant.ACCESSOR;
   }

   static final class DeclaredTarget {
      final String name;
      final boolean isPrivate;

      private DeclaredTarget(String var1, boolean var2) {
         this.name = var1;
         this.isPrivate = var2;
      }

      @Override
      public String toString() {
         return this.name;
      }

      static MixinInfo.DeclaredTarget of(Object var0, MixinInfo var1) {
         if (var0 instanceof String) {
            String var2 = var1.remapClassName((String)var0);
            return var2 != null ? new MixinInfo.DeclaredTarget(var2, true) : null;
         } else {
            return var0 instanceof Type ? new MixinInfo.DeclaredTarget(((Type)var0).getClassName(), false) : null;
         }
      }
   }

   class MixinClassNode extends ClassNode {
      public final List<MixinInfo.MixinMethodNode> mixinMethods = this.methods;

      MixinClassNode(MixinInfo var2) {
         this(ASM.API_VERSION);
      }

      protected MixinClassNode(int var2) {
         super(var2);
      }

      public MixinInfo getMixin() {
         return MixinInfo.this;
      }

      @Override
      public MethodVisitor visitMethod(int var1, String var2, String var3, String var4, String[] var5) {
         MixinInfo.MixinMethodNode var6 = MixinInfo.this.new MixinMethodNode(var1, var2, var3, var4, var5);
         this.methods.add(var6);
         return var6;
      }
   }

   class MixinMethodNode extends MethodNodeEx {
      public MixinMethodNode(int var2, String var3, String var4, String var5, String[] var6) {
         super(var2, var3, var4, var5, var6, MixinInfo.this);
      }

      @Override
      public void visitInvokeDynamicInsn(String var1, String var2, Handle var3, Object... var4) {
         Object[] var5 = new Object[var4.length];
         System.arraycopy(var4, 0, var5, 0, var4.length);
         this.instructions.add(new InvokeDynamicInsnNode(var1, var2, var3, var5));
      }

      public boolean isInjector() {
         return this.getInjectorAnnotation() != null || this.isSurrogate();
      }

      public boolean isSurrogate() {
         return this.getVisibleAnnotation(Surrogate.class) != null;
      }

      public boolean isSynthetic() {
         return Bytecode.hasFlag(this, 4096);
      }

      public AnnotationNode getVisibleAnnotation(Class<? extends Annotation> var1) {
         return Annotations.getVisible(this, var1);
      }

      public AnnotationNode getInjectorAnnotation() {
         return InjectionInfo.getInjectorAnnotation(MixinInfo.this, this);
      }
   }

   class Reloaded extends MixinInfo.State {
      private final MixinInfo.State previous;

      Reloaded(MixinInfo.State var2, ClassNode var3) {
         super(var3, var2.getClassInfo());
         this.previous = var2;
      }

      @Override
      protected void validateChanges(MixinInfo.SubType var1, List<ClassInfo> var2) {
         if (!this.innerClasses.equals(this.previous.innerClasses)) {
            throw new MixinReloadException(MixinInfo.this, "Cannot change inner classes");
         }

         if (!this.interfaces.equals(this.previous.interfaces)) {
            throw new MixinReloadException(MixinInfo.this, "Cannot change interfaces");
         }

         if (!new HashSet<>(this.softImplements).equals(new HashSet<>(this.previous.softImplements))) {
            throw new MixinReloadException(MixinInfo.this, "Cannot change soft interfaces");
         }

         List var3 = MixinInfo.this.readTargetClasses(this.validationClassNode, true);
         if (!new HashSet(var3).equals(new HashSet(var2))) {
            throw new MixinReloadException(MixinInfo.this, "Cannot change target classes");
         }

         int var4 = MixinInfo.this.readPriority(this.validationClassNode);
         if (var4 != MixinInfo.this.getPriority()) {
            throw new MixinReloadException(MixinInfo.this, "Cannot change mixin priority");
         }
      }
   }

   class State {
      private final ClassNode classNode;
      private final ClassInfo classInfo;
      private boolean detachedSuper;
      private boolean unique;
      protected final Set<String> interfaces = new HashSet<>();
      protected final List<InterfaceInfo> softImplements = new ArrayList<>();
      protected final Set<String> innerClasses = new HashSet<>();
      protected MixinInfo.MixinClassNode validationClassNode;

      State(ClassNode var2) {
         this(var2, null);
      }

      State(ClassNode var2, ClassInfo var3) {
         this.classNode = var2;
         this.connect();
         this.classInfo = var3 != null ? var3 : ClassInfo.fromClassNode(this.getValidationClassNode());
      }

      protected void connect() {
         this.validationClassNode = this.createClassNode(0);
      }

      protected void complete() {
         this.validationClassNode = null;
      }

      ClassInfo getClassInfo() {
         return this.classInfo;
      }

      ClassNode getClassNode() {
         return this.classNode;
      }

      MixinInfo.MixinClassNode getValidationClassNode() {
         if (this.validationClassNode == null) {
            throw new IllegalStateException("Attempted a validation task after validation is complete on " + this + " in " + MixinInfo.this);
         } else {
            return this.validationClassNode;
         }
      }

      boolean isDetachedSuper() {
         return this.detachedSuper;
      }

      boolean isUnique() {
         return this.unique;
      }

      List<? extends InterfaceInfo> getSoftImplements() {
         return this.softImplements;
      }

      Set<String> getInnerClasses() {
         return this.innerClasses;
      }

      Set<String> getInterfaces() {
         return this.interfaces;
      }

      MixinInfo.MixinClassNode createClassNode(int var1) {
         MixinInfo.MixinClassNode var2 = MixinInfo.this.new MixinClassNode(MixinInfo.this);
         this.classNode.accept(var2);
         return var2;
      }

      void validate(MixinInfo.SubType var1, List<ClassInfo> var2) {
         MixinInfo.MixinClassNode var3 = this.getValidationClassNode();
         MixinPreProcessorStandard var4 = var1.createPreProcessor(var3).prepare(MixinInfo.this.getExtensions());

         for (ClassInfo var6 : var2) {
            var4.conform(var6);
         }

         var1.validate(this, var2);
         this.detachedSuper = var1.isDetachedSuper();
         this.unique = Annotations.getVisible(var3, Unique.class) != null;
         this.validateInner();
         this.validateClassFeatures();
         this.validateRemappables(var2);
         this.readImplementations(var1);
         this.readInnerClasses();
         this.validateChanges(var1, var2);
         this.complete();
      }

      private void validateInner() {
         if (!this.classInfo.isProbablyStatic()) {
            throw new InvalidMixinException(MixinInfo.this, "Inner class mixin must be declared static");
         }
      }

      private void validateClassFeatures() {
         MixinEnvironment.CompatibilityLevel var1 = MixinEnvironment.getCompatibilityLevel();
         int var2 = LanguageFeatures.scan(this.validationClassNode);
         if (var2 != 0 && !var1.supports(var2)) {
            int var3 = var2 & ~var1.getLanguageFeatures();
            MixinEnvironment.CompatibilityLevel var4 = MixinEnvironment.CompatibilityLevel.requiredFor(var2);
            throw new InvalidMixinException(
               MixinInfo.this,
               String.format(
                  "Unsupported mixin, %s requires the following unsupported language features: %s, these features require compatibility level %s",
                  MixinInfo.this,
                  LanguageFeatures.format(var3),
                  var4 != null ? var4.toString() : "UNKNOWN"
               )
            );
         }
      }

      private void validateRemappables(List<ClassInfo> var1) {
         if (var1.size() > 1) {
            for (FieldNode var3 : this.validationClassNode.fields) {
               this.validateRemappable(Shadow.class, var3.name, Annotations.getVisible(var3, Shadow.class));
            }

            for (MethodNode var6 : this.validationClassNode.methods) {
               this.validateRemappable(Shadow.class, var6.name, Annotations.getVisible(var6, Shadow.class));
               AnnotationNode var4 = Annotations.getVisible(var6, Overwrite.class);
               if (var4 != null && ((var6.access & 8) == 0 || (var6.access & 1) == 0)) {
                  throw new InvalidMixinException(MixinInfo.this, "Found @Overwrite annotation on " + var6.name + " in " + MixinInfo.this);
               }
            }
         }
      }

      private void validateRemappable(Class<Shadow> var1, String var2, AnnotationNode var3) {
         if (var3 != null && Annotations.getValue(var3, "remap", Boolean.TRUE)) {
            throw new InvalidMixinException(MixinInfo.this, "Found a remappable @" + var1.getSimpleName() + " annotation on " + var2 + " in " + this);
         }
      }

      void readImplementations(MixinInfo.SubType var1) {
         this.interfaces.addAll(this.validationClassNode.interfaces);
         this.interfaces.addAll(var1.getInterfaces());
         AnnotationNode var2 = Annotations.getInvisible(this.validationClassNode, Implements.class);
         if (var2 != null) {
            List var3 = Annotations.getValue(var2);
            if (var3 != null) {
               for (AnnotationNode var5 : var3) {
                  InterfaceInfo var6 = InterfaceInfo.fromAnnotation(MixinInfo.this, var5);
                  this.softImplements.add(var6);
                  this.interfaces.add(var6.getInternalName());
                  if (!(this instanceof MixinInfo.Reloaded)) {
                     this.classInfo.addInterface(var6.getInternalName());
                  }
               }
            }
         }
      }

      void readInnerClasses() {
         for (InnerClassNode var2 : this.validationClassNode.innerClasses) {
            if ((var2.outerName != null && var2.outerName.equals(this.classInfo.getName()) || var2.name.startsWith(this.validationClassNode.name + "$"))
               && !ClassInfo.isMixin(var2.name)) {
               this.innerClasses.add(var2.name);
            }
         }
      }

      protected void validateChanges(MixinInfo.SubType var1, List<ClassInfo> var2) {
         var1.createPreProcessor(this.validationClassNode).prepare(MixinInfo.this.getExtensions());
      }
   }

   abstract static class SubType {
      protected final MixinInfo mixin;
      protected final String annotationType;
      protected final boolean targetMustBeInterface;
      protected boolean detached;

      SubType(MixinInfo var1, String var2, boolean var3) {
         this.mixin = var1;
         this.annotationType = var2;
         this.targetMustBeInterface = var3;
      }

      Collection<String> getInterfaces() {
         return Collections.emptyList();
      }

      boolean isDetachedSuper() {
         return this.detached;
      }

      boolean isLoadable() {
         return false;
      }

      void validateTarget(String var1, ClassInfo var2) {
         boolean var3 = var2.isInterface();
         if (var3 != this.targetMustBeInterface) {
            String var4 = var3 ? "" : "not ";
            throw new InvalidMixinException(this.mixin, this.annotationType + " target type mismatch: " + var1 + " is " + var4 + "an interface in " + this);
         }
      }

      abstract void validate(MixinInfo.State var1, List<ClassInfo> var2);

      abstract MixinPreProcessorStandard createPreProcessor(MixinInfo.MixinClassNode var1);

      void validateInnerClass(ClassNode var1) {
      }

      static MixinInfo.SubType getTypeFor(MixinInfo var0) {
         MixinInfo.Variant var1 = MixinInfo.getVariant(var0.getClassInfo());
         switch (var1) {
            case STANDARD:
               return new MixinInfo.SubType.Standard(var0);
            case INTERFACE:
               return new MixinInfo.SubType.Interface(var0);
            case ACCESSOR:
               return new MixinInfo.SubType.Accessor(var0);
            case PROXY:
            default:
               throw new IllegalStateException("Unsupported Mixin variant " + var1 + " for " + var0);
            case ENUM_EXTENSION:
               return new MixinInfo.SubType.EnumExtension(var0);
         }
      }

      static class Accessor extends MixinInfo.SubType {
         private final Collection<String> interfaces = new ArrayList<>();

         Accessor(MixinInfo var1) {
            super(var1, "@Mixin", false);
            this.interfaces.add(var1.getClassRef());
         }

         @Override
         boolean isLoadable() {
            return true;
         }

         @Override
         Collection<String> getInterfaces() {
            return this.interfaces;
         }

         @Override
         void validateTarget(String var1, ClassInfo var2) {
            boolean var3 = var2.isInterface();
            if (var3 && !MixinEnvironment.getCompatibilityLevel().supports(1)) {
               throw new InvalidMixinException(this.mixin, "Accessor mixin targetting an interface is not supported in current enviromnment");
            }
         }

         @Override
         void validate(MixinInfo.State var1, List<ClassInfo> var2) {
            MixinInfo.MixinClassNode var3 = var1.getValidationClassNode();
            if (!"java/lang/Object".equals(var3.superName)) {
               throw new InvalidMixinException(this.mixin, "Super class of " + this + " is invalid, found " + var3.superName.replace('/', '.'));
            }
         }

         @Override
         MixinPreProcessorStandard createPreProcessor(MixinInfo.MixinClassNode var1) {
            return new MixinPreProcessorAccessor(this.mixin, var1);
         }
      }

      static class EnumExtension extends MixinInfo.SubType {
         EnumExtension(MixinInfo var1) {
            super(var1, "@Mixin", false);
         }

         @Override
         void validateTarget(String var1, ClassInfo var2) {
            if (!var2.isEnum()) {
               throw new InvalidMixinException(this.mixin, this.annotationType + " target type mismatch: " + var1 + " is not an enum in " + this);
            }

            MixinService.getService().getFeatureValidator().validateEnumExtension(this.mixin, var2);
         }

         @Override
         void validate(MixinInfo.State var1, List<ClassInfo> var2) {
            if (FabricUtil.getCompatibility(this.mixin.getConfig()) < 17001) {
               String var3 = MixinService.getService().getAdviceProvider().higherCompatibilityNeeded(17001, "0.17.1");
               throw new InvalidMixinException(this.mixin, "Enum extensions are not supported at the current compatibility version. " + var3);
            }

            EnumExtensionUtils.checkForGotchas(this.mixin, var1.getValidationClassNode());
         }

         @Override
         MixinPreProcessorStandard createPreProcessor(MixinInfo.MixinClassNode var1) {
            return new MixinPreProcessorEnumExtension(this.mixin, var1);
         }

         @Override
         void validateInnerClass(ClassNode var1) {
            EnumExtensionUtils.checkForGotchas(this.mixin, var1);
         }
      }

      static class Interface extends MixinInfo.SubType {
         Interface(MixinInfo var1) {
            super(var1, "@Mixin", true);
         }

         @Override
         void validate(MixinInfo.State var1, List<ClassInfo> var2) {
            if (!MixinEnvironment.getCompatibilityLevel().supports(1)) {
               throw new InvalidMixinException(this.mixin, "Interface mixin not supported in current enviromnment");
            }

            MixinInfo.MixinClassNode var3 = var1.getValidationClassNode();
            if (!"java/lang/Object".equals(var3.superName)) {
               throw new InvalidMixinException(this.mixin, "Super class of " + this + " is invalid, found " + var3.superName.replace('/', '.'));
            }
         }

         @Override
         MixinPreProcessorStandard createPreProcessor(MixinInfo.MixinClassNode var1) {
            return new MixinPreProcessorInterface(this.mixin, var1);
         }
      }

      static class Standard extends MixinInfo.SubType {
         Standard(MixinInfo var1) {
            super(var1, "@Mixin", false);
         }

         @Override
         void validate(MixinInfo.State var1, List<ClassInfo> var2) {
            MixinInfo.MixinClassNode var3 = var1.getValidationClassNode();

            for (ClassInfo var5 : var2) {
               if (!var3.superName.equals(var5.getSuperName())) {
                  if (!var5.hasSuperClass(var3.superName, ClassInfo.Traversal.SUPER)) {
                     ClassInfo var6 = ClassInfo.forName(var3.superName);
                     if (var6 != null && var6.isMixin()) {
                        for (ClassInfo var8 : var6.getTargets()) {
                           if (var2.contains(var8)) {
                              throw new InvalidMixinException(
                                 this.mixin,
                                 "Illegal hierarchy detected. Derived mixin "
                                    + this
                                    + " targets the same class "
                                    + var8.getClassName()
                                    + " as its superclass "
                                    + var6.getClassName()
                              );
                           }
                        }
                     }

                     throw new InvalidMixinException(
                        this.mixin,
                        "Super class '"
                           + var3.superName.replace('/', '.')
                           + "' of "
                           + this.mixin.getName()
                           + " was not found in the hierarchy of target class '"
                           + var5
                           + "'"
                     );
                  }

                  this.detached = true;
               }
            }
         }

         @Override
         MixinPreProcessorStandard createPreProcessor(MixinInfo.MixinClassNode var1) {
            return new MixinPreProcessorStandard(this.mixin, var1);
         }
      }
   }

   enum Variant {
      STANDARD,
      INTERFACE,
      ACCESSOR,
      PROXY,
      ENUM_EXTENSION;
   }
}
