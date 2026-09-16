package org.spongepowered.asm.mixin.transformer;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import org.objectweb.asm.Type;
import org.objectweb.asm.signature.SignatureReader;
import org.objectweb.asm.signature.SignatureVisitor;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.FabricUtil;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Intrinsic;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.extensibility.IActivityContext;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.struct.Constructor;
import org.spongepowered.asm.mixin.throwables.MixinError;
import org.spongepowered.asm.mixin.transformer.ext.extensions.ExtensionClassExporter;
import org.spongepowered.asm.mixin.transformer.meta.MixinMerged;
import org.spongepowered.asm.mixin.transformer.meta.MixinRenamed;
import org.spongepowered.asm.mixin.transformer.struct.Clinit;
import org.spongepowered.asm.mixin.transformer.struct.Initialiser;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.mixin.transformer.throwables.MixinApplicatorException;
import org.spongepowered.asm.service.IMixinAuditTrail;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.ConstraintParser;
import org.spongepowered.asm.util.asm.ASM;
import org.spongepowered.asm.util.perf.Profiler;
import org.spongepowered.asm.util.throwables.ConstraintViolationException;
import org.spongepowered.asm.util.throwables.InvalidConstraintException;
import org.spongepowered.include.com.google.common.base.Supplier;
import org.spongepowered.include.com.google.common.base.Suppliers;
import org.spongepowered.include.com.google.common.collect.ImmutableList;

class MixinApplicatorStandard {
   protected static final List<Class<? extends Annotation>> CONSTRAINED_ANNOTATIONS = ImmutableList.of(
      Overwrite.class, Inject.class, ModifyArg.class, ModifyArgs.class, Redirect.class, ModifyVariable.class, ModifyConstant.class
   );
   protected final ILogger logger = MixinService.getService().getLogger("mixin");
   protected final TargetClassContext context;
   protected final String targetName;
   protected final ClassNode targetClass;
   protected final ClassInfo targetClassInfo;
   protected final Profiler profiler = Profiler.getProfiler("mixin");
   protected final IMixinAuditTrail auditTrail;
   protected final ActivityStack activities = new ActivityStack();
   protected final boolean mergeSignatures;

   MixinApplicatorStandard(TargetClassContext var1) {
      this.context = var1;
      this.targetName = var1.getClassName();
      this.targetClass = var1.getClassNode();
      this.targetClassInfo = var1.getClassInfo();
      ExtensionClassExporter var2 = var1.getExtensions().getExtension(ExtensionClassExporter.class);
      this.mergeSignatures = var2.isDecompilerActive()
         && MixinEnvironment.getCurrentEnvironment().getOption(MixinEnvironment.Option.DEBUG_EXPORT_DECOMPILE_MERGESIGNATURES);
      this.auditTrail = MixinService.getService().getAuditTrail();
   }

   final void apply(SortedSet<MixinInfo> var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = var1.iterator();

      while (var3.hasNext()) {
         MixinInfo var4 = (MixinInfo)var3.next();

         try {
            this.logger.log(var4.getLoggingLevel(), "Mixing {} from {} into {}", var4.getName(), var4.getParent(), this.targetName);
            var2.add(var4.createContextFor(this.context));
            if (this.auditTrail != null) {
               this.auditTrail.onApply(this.targetName, var4.toString());
            }
         } catch (InvalidMixinException var14) {
            if (var4.isRequired()) {
               throw var14;
            }

            this.context.addSuppressed(var14);
            var3.remove();
         }
      }

      MixinTargetContext var15 = null;
      this.activities.clear();

      try {
         IActivityContext.IActivity var16 = this.activities.begin("PreApply Phase");
         IActivityContext.IActivity var5 = this.activities.begin("Mixin");
         this.preApply(var5, var2);
         var5.end();

         for (MixinApplicatorStandard.ApplicatorPass var9 : MixinApplicatorStandard.ApplicatorPass.values()) {
            var16.next("%s Applicator Phase", var9);
            Profiler.Section var10 = this.profiler.begin("pass", var9.name().toLowerCase(Locale.ROOT));
            this.runApplicatorPass(var9, var2);
            var10.end();
         }

         var16.next("PostApply Phase");
         IActivityContext.IActivity var17 = this.activities.begin("Mixin");
         Iterator var18 = var2.iterator();

         while (var18.hasNext()) {
            var15 = (MixinTargetContext)var18.next();
            var17.next(var15.toString());

            try {
               var15.postApply(this.targetName, this.targetClass);
            } catch (InvalidMixinException var11) {
               if (var15.isRequired()) {
                  throw var11;
               }

               this.context.addSuppressed(var11);
               var18.remove();
            }
         }

         var16.end();
      } catch (InvalidMixinException var12) {
         var12.prepend(this.activities);
         throw var12;
      } catch (Exception var13) {
         throw new MixinApplicatorException(
            var15, "Unexpecteded " + var13.getClass().getSimpleName() + " whilst applying the mixin class:", var13, this.activities
         );
      }

      this.applySourceMap(this.context);
      this.context.processDebugTasks();
   }

   protected void preApply(IActivityContext.IActivity var1, List<MixinTargetContext> var2) {
      for (MixinTargetContext var4 : var2) {
         var1.next(var4.toString());
         var4.preApply(this.targetName, this.targetClass);
      }
   }

   private void runApplicatorPass(MixinApplicatorStandard.ApplicatorPass var1, List<MixinTargetContext> var2) {
      switch (var1) {
         case MAIN:
            this.processMixins(var2, (var1x, var2x) -> {
               var1x.next("Apply Signature");
               this.applySignature(var2x);
               var1x.next("Apply Interfaces");
               this.applyInterfaces(var2x);
               var1x.next("Apply Attributess");
               this.applyAttributes(var2x);
               var1x.next("Apply Annotations");
               this.applyAnnotations(var2x);
               var1x.next("Apply Fields");
               this.applyFields(var2x);
               var1x.next("Apply Methods");
               this.applyMethods(var2x);
            });
            break;
         case INJECT_PREPARE:
            this.processMixins(var2, (var1x, var2x) -> {
               if (FabricUtil.getCompatibility(var2x) >= 17001) {
                  var1x.next("Prepare Injections");
                  this.prepareInjections(var2x);
               }
            });
            break;
         case INITIALISER_APPLY_LEGACY:
            this.processMixins(var2, (var1x, var2x) -> {
               if (FabricUtil.getCompatibility(var2x) < 17001) {
                  var1x.next("Apply Legacy Initialisers");
                  this.applyInitialisers(var2x);
                  var1x.next("Apply Legacy CLINIT");
                  this.applyClinitLegacy(var2x);
               }
            });
            break;
         case INJECT_PREPARE_LEGACY:
            this.processMixins(var2, (var1x, var2x) -> {
               if (FabricUtil.getCompatibility(var2x) < 17001) {
                  var1x.next("Prepare Legacy Injections");
                  this.prepareInjections(var2x);
               }
            });
            break;
         case INITIALISER_APPLY:
            Supplier var3 = Suppliers.memoize(this::prepareOrCreateClinit);
            this.processMixins(var2, (var2x, var3x) -> {
               if (FabricUtil.getCompatibility(var3x) >= 17001) {
                  var2x.next("Apply Initialisers");
                  this.applyInitialisers(var3x);
                  var2x.next("Apply CLINIT");
                  this.applyClinit(var3x, var3);
               }
            });
            break;
         case ACCESSOR:
            this.processMixins(var2, (var1x, var2x) -> {
               var1x.next("Apply Accessors");
               this.applyAccessors(var2x);
            });
            break;
         case INJECT_PREINJECT:
            this.processMixins(var2, (var1x, var2x) -> {
               var1x.next("Pre-Apply Injections");
               this.applyPreInjections(var2x);
            });
            break;
         case INJECT_APPLY:
            TreeSet var4 = new TreeSet();

            for (MixinTargetContext var6 : var2) {
               var6.getInjectorOrders(var4);
            }

            for (int var8 : var4) {
               this.processMixins(var2, (var2x, var3x) -> {
                  var2x.next("Apply Injections");
                  this.applyInjections(var3x, var8);
               });
            }
            break;
         default:
            throw new IllegalStateException("Invalid pass specified " + var1);
      }
   }

   private void processMixins(List<MixinTargetContext> var1, BiConsumer<IActivityContext.IActivity, MixinTargetContext> var2) {
      IActivityContext.IActivity var3 = this.activities.begin("Mixin");
      Iterator var4 = var1.iterator();

      while (var4.hasNext()) {
         MixinTargetContext var5 = (MixinTargetContext)var4.next();
         var3.next(var5.toString());

         try {
            IActivityContext.IActivity var6 = this.activities.begin("Apply");
            var2.accept(var6, var5);
            var6.end();
         } catch (InvalidMixinException var7) {
            if (var5.isRequired()) {
               throw var7;
            }

            this.context.addSuppressed(var7);
            var4.remove();
         }
      }

      var3.end();
   }

   protected void applySignature(MixinTargetContext var1) {
      if (this.mergeSignatures) {
         this.context.mergeSignature(var1.getSignature());
      }
   }

   protected void applyInterfaces(MixinTargetContext var1) {
      for (String var3 : var1.getInterfaces()) {
         if (!this.targetClass.interfaces.contains(var3)) {
            this.targetClass.interfaces.add(var3);
            this.targetClassInfo.addInterface(var3);
         }
      }
   }

   protected void applyAttributes(MixinTargetContext var1) {
      if (var1.shouldSetSourceFile()) {
         this.targetClass.sourceFile = var1.getSourceFile();
      }

      int var2 = var1.getMinRequiredClassVersion();
      if ((var2 & 65535) > (this.targetClass.version & 65535)) {
         this.targetClass.version = var2;
      }
   }

   protected void applyAnnotations(MixinTargetContext var1) {
      ClassNode var2 = var1.getClassNode();
      Annotations.merge(var2, this.targetClass);
   }

   protected void applyFields(MixinTargetContext var1) {
      this.mergeShadowFields(var1);
      this.mergeNewFields(var1);
   }

   protected void mergeShadowFields(MixinTargetContext var1) {
      for (Entry var3 : var1.getShadowFields()) {
         FieldNode var4 = (FieldNode)var3.getKey();
         FieldNode var5 = this.findTargetField(var4);
         if (var5 != null) {
            Annotations.merge(var4, var5);
            if (((ClassInfo.Field)var3.getValue()).isDecoratedMutable()) {
               var5.access &= -17;
            }
         }
      }
   }

   protected void mergeNewFields(MixinTargetContext var1) {
      for (FieldNode var3 : var1.getFields()) {
         this.mergeNormalField(var1, var3, this.targetClass.fields.size());
      }
   }

   protected void mergeNormalField(MixinTargetContext var1, FieldNode var2, int var3) {
      FieldNode var4 = this.findTargetField(var2);
      if (var4 == null) {
         this.targetClass.fields.add(var3, var2);
         var1.fieldMerged(var2);
         if (var2.signature != null) {
            if (this.mergeSignatures) {
               SignatureVisitor var5 = var1.getSignature().getRemapper();
               new SignatureReader(var2.signature).accept(var5);
               var2.signature = var5.toString();
            } else {
               var2.signature = null;
            }
         }
      }
   }

   protected void applyMethods(MixinTargetContext var1) {
      IActivityContext.IActivity var2 = this.activities.begin("?");

      for (MethodNode var4 : var1.getShadowMethods()) {
         var2.next("@Shadow %s:%s", var4.desc, var4.name);
         this.applyShadowMethod(var1, var4);
      }

      for (MethodNode var6 : var1.getMethods()) {
         var2.next("%s:%s", var6.desc, var6.name);
         this.applyNormalMethod(var1, var6);
      }

      var2.end();
   }

   protected void applyShadowMethod(MixinTargetContext var1, MethodNode var2) {
      MethodNode var3 = this.findTargetMethod(var2);
      if (var3 != null) {
         Annotations.merge(var2, var3);
      }
   }

   protected void applyNormalMethod(MixinTargetContext var1, MethodNode var2) {
      var1.transformMethod(var2);
      if (!var2.name.startsWith("<")) {
         this.checkMethodVisibility(var1, var2);
         this.checkMethodConstraints(var1, var2);
         this.mergeMethod(var1, var2);
      }
   }

   protected void mergeMethod(MixinTargetContext var1, MethodNode var2) {
      boolean var3 = Annotations.getVisible(var2, Overwrite.class) != null;
      MethodNode var4 = this.findTargetMethod(var2);
      if (var4 != null) {
         if (this.isAlreadyMerged(var1, var2, var3, var4)) {
            return;
         }

         AnnotationNode var5 = Annotations.getInvisible(var2, Intrinsic.class);
         if (var5 != null) {
            if (this.mergeIntrinsic(var1, var2, var3, var4, var5)) {
               var1.getTarget().methodMerged(var2);
               return;
            }
         } else {
            if (var1.requireOverwriteAnnotations() && !var3) {
               throw new InvalidMixinException(
                  var1,
                  String.format(
                     "%s%s in %s cannot overwrite method in %s because @Overwrite is required by the parent configuration",
                     var2.name,
                     var2.desc,
                     var1,
                     var1.getTarget().getClassName()
                  )
               );
            }

            this.targetClass.methods.remove(var4);
         }
      } else if (var3) {
         throw new InvalidMixinException(var1, String.format("Overwrite target \"%s\" was not located in target class %s", var2.name, var1.getTargetClassRef()));
      }

      this.targetClass.methods.add(var2);
      var1.methodMerged(var2);
      if (var2.signature != null) {
         if (this.mergeSignatures) {
            SignatureVisitor var6 = var1.getSignature().getRemapper();
            new SignatureReader(var2.signature).accept(var6);
            var2.signature = var6.toString();
         } else {
            var2.signature = null;
         }
      }
   }

   protected boolean isAlreadyMerged(MixinTargetContext var1, MethodNode var2, boolean var3, MethodNode var4) {
      AnnotationNode var5 = Annotations.getVisible(var4, MixinMerged.class);
      if (var5 == null) {
         if (Annotations.getVisible(var4, Final.class) != null) {
            this.logger.warn("Overwrite prohibited for @Final method {} in {}. Skipping method.", var2.name, var1);
            return true;
         } else {
            return false;
         }
      } else {
         String var6 = Annotations.getValue(var5, "sessionId");
         if (!this.context.getSessionId().equals(var6)) {
            throw new ClassFormatError("Invalid @MixinMerged annotation found in" + var1 + " at " + var2.name + " in " + this.targetClass.name);
         }

         if (Bytecode.hasFlag(var4, 4160) && Bytecode.hasFlag(var2, 4160)) {
            if (var1.getEnvironment().getOption(MixinEnvironment.Option.DEBUG_VERBOSE)) {
               this.logger.warn("Synthetic bridge method clash for {} in {}", var2.name, var1);
            }

            return true;
         } else {
            String var7 = Annotations.getValue(var5, "mixin");
            int var8 = Annotations.<Integer>getValue(var5, "priority");
            AnnotationNode var9 = Annotations.getSingleVisible(var2, Accessor.class, Invoker.class);
            if (var9 != null) {
               AnnotationNode var10 = Annotations.getSingleVisible(var4, Accessor.class, Invoker.class);
               if (var10 != null) {
                  String var11 = Annotations.getValue(var9, "target");
                  String var12 = Annotations.getValue(var10, "target");
                  if (var11 == null) {
                     throw new MixinError("Encountered undecorated Accessor method in " + var1 + " applying to " + this.targetName);
                  }

                  if (var11.equals(var12)) {
                     return true;
                  }

                  throw new InvalidMixinException(
                     var1,
                     String.format(
                        "Incompatible @%s %s (for %s) in %s previously written by %s (for %s)",
                        Annotations.getSimpleName(var9),
                        var2.name,
                        var11,
                        var1,
                        var7,
                        var12
                     )
                  );
               }
            }

            if (var8 >= var1.getPriority() && !var7.equals(var1.getClassName())) {
               this.logger.warn("Method overwrite conflict for {} in {}, previously written by {}. Skipping method.", var2.name, var1, var7);
               return true;
            } else if (Annotations.getVisible(var4, Final.class) != null) {
               this.logger.warn("Method overwrite conflict for @Final method {} in {} declared by {}. Skipping method.", var2.name, var1, var7);
               return true;
            } else {
               return false;
            }
         }
      }
   }

   protected boolean mergeIntrinsic(MixinTargetContext var1, MethodNode var2, boolean var3, MethodNode var4, AnnotationNode var5) {
      if (var3) {
         throw new InvalidMixinException(var1, "@Intrinsic is not compatible with @Overwrite, remove one of these annotations on " + var2.name + " in " + var1);
      }

      String var6 = var2.name + var2.desc;
      if (Bytecode.hasFlag(var2, 8)) {
         throw new InvalidMixinException(var1, "@Intrinsic method cannot be static, found " + var6 + " in " + var1);
      }

      if (!Bytecode.hasFlag(var2, 4096)) {
         AnnotationNode var7 = Annotations.getVisible(var2, MixinRenamed.class);
         if (var7 == null || !Annotations.getValue(var7, "isInterfaceMember", Boolean.FALSE)) {
            throw new InvalidMixinException(var1, "@Intrinsic method must be prefixed interface method, no rename encountered on " + var6 + " in " + var1);
         }
      }

      if (!Annotations.getValue(var5, "displace", Boolean.FALSE)) {
         this.logger.log(var1.getLoggingLevel(), "Skipping Intrinsic mixin method {} for {}", var6, var1.getTargetClassRef());
         return true;
      } else {
         this.displaceIntrinsic(var1, var2, var4);
         return false;
      }
   }

   protected void displaceIntrinsic(MixinTargetContext var1, MethodNode var2, MethodNode var3) {
      String var4 = "proxy+" + var3.name;

      for (AbstractInsnNode var6 : var2.instructions) {
         if (var6 instanceof MethodInsnNode && var6.getOpcode() != 184) {
            MethodInsnNode var7 = (MethodInsnNode)var6;
            if (var7.owner.equals(this.targetClass.name) && var7.name.equals(var3.name) && var7.desc.equals(var3.desc)) {
               var7.name = var4;
            }
         }
      }

      var3.name = var4;
   }

   protected final void appendInsns(MixinTargetContext var1, MethodNode var2) {
      if (Type.getReturnType(var2.desc) != Type.VOID_TYPE) {
         throw new IllegalArgumentException("Attempted to merge insns from a method which does not return void");
      }

      MethodNode var3 = this.findTargetMethod(var2);
      if (var3 == null) {
         this.targetClass.methods.add(var2);
      } else {
         AbstractInsnNode var4 = Bytecode.findInsn(var3, 177);
         if (var4 != null) {
            for (AbstractInsnNode var6 : var2.instructions) {
               if (!(var6 instanceof LineNumberNode) && var6.getOpcode() != 177) {
                  var3.instructions.insertBefore(var4, var6);
               }
            }

            var3.maxLocals = Math.max(var3.maxLocals, var2.maxLocals);
            var3.maxStack = Math.max(var3.maxStack, var2.maxStack);
         }
      }
   }

   protected void applyInitialisers(MixinTargetContext var1) {
      Initialiser var2 = var1.getInitialiser();
      if (var2 != null && var2.size() != 0) {
         for (Constructor var4 : this.context.getConstructors()) {
            if (var4.isInjectable()) {
               int var5 = var2.getMaxStack() - var4.getMaxStack();
               if (var5 > 0) {
                  var4.extendStack().add(var5);
               }

               var2.injectInto(var4);
            }
         }
      }
   }

   protected void applyClinitLegacy(MixinTargetContext var1) {
      MethodNode var2 = Bytecode.findMethod(var1.getClassNode(), "<clinit>", "()V");
      if (var2 != null) {
         this.appendInsns(var1, var2);
      }
   }

   protected Clinit prepareOrCreateClinit() {
      MethodNode var1 = Bytecode.findMethod(this.targetClass, "<clinit>", "()V");
      if (var1 != null) {
         return Clinit.prepare(this.context.getTargetMethod(var1));
      }

      var1 = new MethodNode(ASM.API_VERSION, 8, "<clinit>", "()V", null, null);
      InsnNode var2 = new InsnNode(177);
      var1.instructions.add(var2);
      this.targetClass.methods.add(var1);
      return new Clinit(var1, var2);
   }

   protected void applyClinit(MixinTargetContext var1, java.util.function.Supplier<Clinit> var2) {
      MethodNode var3 = Bytecode.findMethod(var1.getClassNode(), "<clinit>", "()V");
      if (var3 != null) {
         ((Clinit)var2.get()).append(var1.getMixin(), var3);
      }
   }

   protected void prepareInjections(MixinTargetContext var1) {
      var1.prepareInjections();
   }

   protected void applyPreInjections(MixinTargetContext var1) {
      var1.applyPreInjections();
   }

   protected void applyInjections(MixinTargetContext var1, int var2) {
      var1.applyInjections(var2);
   }

   protected void applyAccessors(MixinTargetContext var1) {
      for (MethodNode var4 : var1.generateAccessors()) {
         if (!var4.name.startsWith("<")) {
            this.mergeMethod(var1, var4);
         }
      }
   }

   protected void checkMethodVisibility(MixinTargetContext var1, MethodNode var2) {
      if (Bytecode.hasFlag(var2, 8) && !Bytecode.hasFlag(var2, 2) && !Bytecode.hasFlag(var2, 4096) && Annotations.getVisible(var2, Overwrite.class) == null) {
         throw new InvalidMixinException(var1, String.format("Mixin %s contains non-private static method %s", var1, var2));
      }
   }

   protected void applySourceMap(TargetClassContext var1) {
      this.targetClass.sourceDebug = var1.getSourceMap().toString();
   }

   protected void checkMethodConstraints(MixinTargetContext var1, MethodNode var2) {
      for (Class var4 : CONSTRAINED_ANNOTATIONS) {
         AnnotationNode var5 = Annotations.getVisible(var2, var4);
         if (var5 != null) {
            this.checkConstraints(var1, var2, var5);
         }
      }
   }

   protected final void checkConstraints(MixinTargetContext var1, MethodNode var2, AnnotationNode var3) {
      try {
         ConstraintParser.Constraint var4 = ConstraintParser.parse(var3);

         try {
            var4.check(var1.getEnvironment());
         } catch (ConstraintViolationException var7) {
            String var6 = String.format("Constraint violation: %s on %s in %s", var7.getMessage(), var2, var1);
            this.logger.warn(var6);
            if (!var1.getEnvironment().getOption(MixinEnvironment.Option.IGNORE_CONSTRAINTS)) {
               throw new InvalidMixinException(var1, var6, var7);
            }
         }
      } catch (InvalidConstraintException var8) {
         throw new InvalidMixinException(var1, var8.getMessage());
      }
   }

   protected final MethodNode findTargetMethod(MethodNode var1) {
      for (MethodNode var3 : this.targetClass.methods) {
         if (var3.name.equals(var1.name) && var3.desc.equals(var1.desc)) {
            return var3;
         }
      }

      return null;
   }

   protected final FieldNode findTargetField(FieldNode var1) {
      for (FieldNode var3 : this.targetClass.fields) {
         if (var3.name.equals(var1.name) && var3.desc.equals(var1.desc)) {
            return var3;
         }
      }

      return null;
   }

   enum ApplicatorPass {
      MAIN,
      INJECT_PREPARE,
      INITIALISER_APPLY_LEGACY,
      INJECT_PREPARE_LEGACY,
      INITIALISER_APPLY,
      ACCESSOR,
      INJECT_PREINJECT,
      INJECT_APPLY;
   }
}
