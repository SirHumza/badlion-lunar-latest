package org.spongepowered.asm.mixin.transformer;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.logging.Level;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.SoftOverride;
import org.spongepowered.asm.mixin.extensibility.IActivityContext;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.gen.AccessorInfo;
import org.spongepowered.asm.mixin.injection.struct.Constructor;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectorGroupInfo;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.injection.throwables.InjectionValidationException;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.mixin.refmap.IReferenceMapper;
import org.spongepowered.asm.mixin.struct.MemberRef;
import org.spongepowered.asm.mixin.struct.SourceMap;
import org.spongepowered.asm.mixin.transformer.ext.Extensions;
import org.spongepowered.asm.mixin.transformer.meta.MixinMerged;
import org.spongepowered.asm.mixin.transformer.struct.Initialiser;
import org.spongepowered.asm.mixin.transformer.struct.InsnRange;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.mixin.transformer.throwables.MixinTransformerError;
import org.spongepowered.asm.obfuscation.RemapperChain;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.ClassSignature;
import org.spongepowered.asm.util.asm.ASM;
import org.spongepowered.include.com.google.common.collect.BiMap;

public class MixinTargetContext extends ClassContext implements IMixinContext {
   private static final ILogger logger = MixinService.getService().getLogger("mixin");
   protected final ActivityStack activities = new ActivityStack(null);
   private final MixinInfo mixin;
   private final ClassNode classNode;
   private final TargetClassContext targetClass;
   private final String sessionId;
   private final ClassInfo targetClassInfo;
   private final BiMap<String, String> innerClasses;
   private final List<MethodNode> shadowMethods = new ArrayList<>();
   private final Map<FieldNode, ClassInfo.Field> shadowFields = new LinkedHashMap<>();
   private final List<MethodNode> mergedMethods = new ArrayList<>();
   private final InjectorGroupInfo.Map injectorGroups = new InjectorGroupInfo.Map();
   private final List<InjectionInfo> injectors = new ArrayList<>();
   private final List<AccessorInfo> accessors = new ArrayList<>();
   private final boolean inheritsFromMixin;
   private final boolean detachedSuper;
   private final SourceMap.File stratum;
   private int minRequiredClassVersion = MixinEnvironment.CompatibilityLevel.JAVA_6.getClassVersion();
   private Initialiser initialiser;

   MixinTargetContext(MixinInfo var1, ClassNode var2, TargetClassContext var3) {
      this.mixin = var1;
      this.classNode = var2;
      this.targetClass = var3;
      this.targetClassInfo = var3.getClassInfo();
      this.stratum = var3.getSourceMap().addFile(this.classNode);
      this.inheritsFromMixin = var1.getClassInfo().hasMixinInHierarchy() || this.targetClassInfo.hasMixinTargetInHierarchy();
      this.detachedSuper = !this.classNode.superName.equals(this.getTarget().getClassNode().superName);
      this.sessionId = var3.getSessionId();
      this.requireVersion(var2.version);
      InnerClassGenerator var4 = var3.getExtensions().getGenerator(InnerClassGenerator.class);
      this.innerClasses = var4.getInnerClasses(this.mixin, this.getTargetClassRef());
      this.initialiser = this.findInitialiser();
   }

   void addShadowMethod(MethodNode var1) {
      this.shadowMethods.add(var1);
   }

   void addShadowField(FieldNode var1, ClassInfo.Field var2) {
      this.shadowFields.put(var1, var2);
   }

   void addAccessorMethod(MethodNode var1, Class<? extends Annotation> var2) {
      this.accessors.add(AccessorInfo.of(this, var1, var2));
   }

   void addMixinMethod(MethodNode var1) {
      Annotations.setVisible(var1, MixinMerged.class, "mixin", this.getClassName());
      this.getTarget().addMixinMethod(var1);
   }

   void methodMerged(MethodNode var1) {
      this.mergedMethods.add(var1);
      this.targetClassInfo.addMethod(var1);
      this.getTarget().methodMerged(var1);
      Annotations.setVisible(var1, MixinMerged.class, "mixin", this.getClassName(), "priority", this.getPriority(), "sessionId", this.sessionId);
   }

   void addMixinField(FieldNode var1) {
      Annotations.setVisible(var1, MixinMerged.class, "mixin", this.getClassName());
      this.getTarget().addMixinField(var1);
   }

   void fieldMerged(FieldNode var1) {
      this.getTarget().fieldMerged(var1);
      Annotations.setVisible(var1, MixinMerged.class, "mixin", this.getClassName(), "priority", this.getPriority(), "sessionId", this.sessionId);
   }

   @Override
   public String toString() {
      return this.mixin.toString();
   }

   public MixinEnvironment getEnvironment() {
      return this.mixin.getParent().getEnvironment();
   }

   @Override
   public boolean getOption(MixinEnvironment.Option var1) {
      return this.getEnvironment().getOption(var1);
   }

   @Override
   public ClassNode getClassNode() {
      return this.classNode;
   }

   @Override
   public String getClassName() {
      return this.mixin.getClassName();
   }

   @Override
   public String getClassRef() {
      return this.mixin.getClassRef();
   }

   public TargetClassContext getTarget() {
      return this.targetClass;
   }

   @Override
   public String getTargetClassName() {
      return this.getTarget().getClassName();
   }

   @Override
   public String getTargetClassRef() {
      return this.getTarget().getClassRef();
   }

   public ClassNode getTargetClassNode() {
      return this.getTarget().getClassNode();
   }

   public ClassInfo getTargetClassInfo() {
      return this.targetClassInfo;
   }

   @Override
   public ClassInfo getClassInfo() {
      return this.mixin.getClassInfo();
   }

   public ClassSignature getSignature() {
      return this.getClassInfo().getSignature();
   }

   public SourceMap.File getStratum() {
      return this.stratum;
   }

   public int getMinRequiredClassVersion() {
      return this.minRequiredClassVersion;
   }

   public int getDefaultRequiredInjections() {
      return this.mixin.getParent().getDefaultRequiredInjections();
   }

   public String getDefaultInjectorGroup() {
      return this.mixin.getParent().getDefaultInjectorGroup();
   }

   public int getMaxShiftByValue() {
      return this.mixin.getParent().getMaxShiftByValue();
   }

   public InjectorGroupInfo.Map getInjectorGroups() {
      return this.injectorGroups;
   }

   public boolean requireOverwriteAnnotations() {
      return this.mixin.getParent().requireOverwriteAnnotations();
   }

   void transformMethod(MethodNode var1) {
      this.activities.clear();

      try {
         IActivityContext.IActivity var2 = this.activities.begin("Validate");
         this.validateMethod(var1);
         var2.next("Transform Descriptor");
         this.transformDescriptor(var1);
         var2.next("Transform LVT");
         this.transformLVT(var1);
         var2.next("Transform Line Numbers");
         this.stratum.applyOffset(var1);
         var2.next("Transform Instructions");
         AbstractInsnNode var3 = null;
         ListIterator var4 = var1.instructions.iterator();

         while (var4.hasNext()) {
            AbstractInsnNode var5 = (AbstractInsnNode)var4.next();
            IActivityContext.IActivity var6 = this.activities.begin(Bytecode.getOpcodeName(var5) + " ");
            if (var5 instanceof MethodInsnNode) {
               MethodInsnNode var7 = (MethodInsnNode)var5;
               var6.append("%s::%s%s", var7.owner, var7.name, var7.desc);
               this.transformMethodRef(var1, var4, new MemberRef.Method(var7));
            } else if (var5 instanceof FieldInsnNode) {
               FieldInsnNode var10 = (FieldInsnNode)var5;
               var6.append("%s::%s:%s", var10.owner, var10.name, var10.desc);
               this.transformFieldRef(var1, var4, new MemberRef.Field(var10));
               this.checkFinal(var1, var4, var10);
            } else if (var5 instanceof TypeInsnNode) {
               TypeInsnNode var11 = (TypeInsnNode)var5;
               var6.append(var11.desc);
               this.transformTypeNode(var1, var4, var11, var3);
            } else if (var5 instanceof LdcInsnNode) {
               this.transformConstantNode(var1, var4, (LdcInsnNode)var5);
            } else if (var5 instanceof InvokeDynamicInsnNode) {
               InvokeDynamicInsnNode var12 = (InvokeDynamicInsnNode)var5;
               var6.append("%s %s", var12.name, var12.desc);
               this.transformInvokeDynamicNode(var1, var4, var12);
            }

            var3 = var5;
            var6.end();
         }

         var2.end();
      } catch (InvalidMixinException var8) {
         var8.prepend(this.activities);
         throw var8;
      } catch (Exception var9) {
         throw new InvalidMixinException(
            this, "Unexpecteded " + var9.getClass().getSimpleName() + " whilst transforming the mixin class:", var9, this.activities
         );
      }
   }

   private void validateMethod(MethodNode var1) {
      if (Annotations.getInvisible(var1, SoftOverride.class) != null) {
         if (Bytecode.getVisibility(var1) == Bytecode.Visibility.PRIVATE) {
            throw new InvalidMixinException(this, "Mixin method " + var1.name + var1.desc + " is tagged with @SoftOverride but the method is PRIVATE");
         }

         ClassInfo.Method var2 = this.targetClassInfo
            .findMethodInHierarchy(var1.name, var1.desc, ClassInfo.SearchType.SUPER_CLASSES_ONLY, ClassInfo.Traversal.SUPER);
         if (var2 == null || !var2.isInjected()) {
            throw new InvalidMixinException(
               this,
               "Mixin method "
                  + var1.name
                  + var1.desc
                  + " is tagged with @SoftOverride but no valid method was found in superclasses of "
                  + this.getTarget().getClassName()
            );
         }
      }

      if (this.getEnvironment().getOption(MixinEnvironment.Option.DEBUG_VERIFY) && Bytecode.isVirtual(var1)) {
         ClassInfo.Method var3 = this.targetClassInfo.findMethodInHierarchy(var1, ClassInfo.SearchType.SUPER_CLASSES_ONLY, ClassInfo.Traversal.ALL, 0);
         if (var3 != null && var3.isFinal()) {
            throw new InvalidMixinException(
               this.mixin, String.format("%s%s in %s overrides a final method from %s", var1.name, var1.desc, this.mixin, var3.getOwner().getClassName())
            );
         }
      }
   }

   private void transformLVT(MethodNode var1) {
      if (var1.localVariables != null) {
         IActivityContext.IActivity var2 = this.activities.begin("?");

         for (LocalVariableNode var4 : var1.localVariables) {
            if (var4 != null && var4.desc != null) {
               var2.next("var=%s", var4.name);
               var4.desc = this.transformSingleDescriptor(Type.getType(var4.desc));
               var4.signature = null;
            }
         }

         var2.end();
      }
   }

   private void transformMethodRef(MethodNode var1, Iterator<AbstractInsnNode> var2, MemberRef var3) {
      this.transformDescriptor(var3);
      if (var3.getOwner().equals(this.getClassRef())) {
         var3.setOwner(this.getTarget().getClassRef());
         ClassInfo.Method var4 = this.getClassInfo().findMethod(var3.getName(), var3.getDesc(), 10);
         if (var4 != null && var4.isRenamed() && var4.getOriginalName().equals(var3.getName()) && (var4.isSynthetic() || var4.isConformed())) {
            var3.setName(var4.getName());
         }

         this.upgradeMethodRef(var1, var3, var4);
      } else if (this.innerClasses.containsKey(var3.getOwner())) {
         var3.setOwner(this.innerClasses.get(var3.getOwner()));
         var3.setDesc(this.transformMethodDescriptor(var3.getDesc()));
      } else if (this.detachedSuper || this.inheritsFromMixin) {
         if (var3.getOpcode() == 183) {
            this.updateStaticBinding(var1, var3);
         } else if (var3.getOpcode() == 182 && var3.ownerIsMixin()) {
            this.updateDynamicBinding(var1, var3);
         }
      }
   }

   private void transformFieldRef(MethodNode var1, Iterator<AbstractInsnNode> var2, MemberRef var3) {
      if ("super$".equals(var3.getName())) {
         if (!(var3 instanceof MemberRef.Field)) {
            throw new InvalidMixinException(this.mixin, "Cannot call imaginary super from method handle.");
         }

         this.processImaginarySuper(var1, ((MemberRef.Field)var3).insn);
         var2.remove();
      }

      this.transformDescriptor(var3);
      if (var3.getOwner().equals(this.getClassRef())) {
         var3.setOwner(this.getTarget().getClassRef());
         ClassInfo.Field var4 = this.getClassInfo().findField(var3.getName(), var3.getDesc(), 10);
         if (var4 != null && var4.isRenamed() && var4.getOriginalName().equals(var3.getName()) && var4.isStatic()) {
            var3.setName(var4.getName());
         }
      } else if (this.innerClasses.containsKey(var3.getOwner())) {
         var3.setOwner(this.innerClasses.get(var3.getOwner()));
      } else if (ClassInfo.isMixin(var3.getOwner())) {
         ClassInfo var6 = ClassInfo.forName(var3.getOwner());
         ClassInfo var5 = this.targetClassInfo.findCorrespondingType(var6);
         var3.setOwner(var5 != null ? var5.getName() : this.getTarget().getClassRef());
      }
   }

   private void checkFinal(MethodNode var1, Iterator<AbstractInsnNode> var2, FieldInsnNode var3) {
      if (var3.owner.equals(this.getTarget().getClassRef())) {
         int var4 = var3.getOpcode();
         if (var4 != 180 && var4 != 178) {
            for (Entry var6 : this.shadowFields.entrySet()) {
               FieldNode var7 = (FieldNode)var6.getKey();
               if (var7.desc.equals(var3.desc) && var7.name.equals(var3.name)) {
                  ClassInfo.Field var8 = (ClassInfo.Field)var6.getValue();
                  if (var8.isDecoratedFinal()) {
                     if (var8.isDecoratedMutable()) {
                        if (this.mixin.getParent().getEnvironment().getOption(MixinEnvironment.Option.DEBUG_VERBOSE)) {
                           logger.warn("Write access to @Mutable @Final field {} in {}::{}", var8, this.mixin, var1.name);
                        }
                     } else if (!"<init>".equals(var1.name) && !"<clinit>".equals(var1.name)) {
                        logger.error("Write access detected to @Final field {} in {}::{}", var8, this.mixin, var1.name);
                        if (this.mixin.getParent().getEnvironment().getOption(MixinEnvironment.Option.DEBUG_VERIFY)) {
                           throw new InvalidMixinException(this.mixin, "Write access detected to @Final field " + var8 + " in " + this.mixin + "::" + var1.name);
                        }
                     } else {
                        logger.warn("@Final field {} in {} should be final", var8, this.mixin);
                     }
                  }

                  return;
               }
            }
         }
      }
   }

   private void transformTypeNode(MethodNode var1, Iterator<AbstractInsnNode> var2, TypeInsnNode var3, AbstractInsnNode var4) {
      if (var3.getOpcode() == 192
         && var3.desc.equals(this.getTarget().getClassRef())
         && var4.getOpcode() == 25
         && ((VarInsnNode)var4).var == 0
         && !Bytecode.isStatic(var1)) {
         var2.remove();
      } else {
         if (var3.desc.equals(this.getClassRef())) {
            var3.desc = this.getTarget().getClassRef();
         } else {
            String var5 = this.innerClasses.get(var3.desc);
            if (var5 != null) {
               var3.desc = var5;
            }
         }

         this.transformDescriptor(var3);
      }
   }

   private void transformConstantNode(MethodNode var1, Iterator<AbstractInsnNode> var2, LdcInsnNode var3) {
      var3.cst = this.transformConstant(var1, var2, var3.cst);
   }

   private void transformInvokeDynamicNode(MethodNode var1, Iterator<AbstractInsnNode> var2, InvokeDynamicInsnNode var3) {
      this.requireVersion(51);
      var3.desc = this.transformMethodDescriptor(var3.desc);
      var3.bsm = this.transformHandle(var1, var2, var3.bsm);

      for (int var4 = 0; var4 < var3.bsmArgs.length; var4++) {
         var3.bsmArgs[var4] = this.transformConstant(var1, var2, var3.bsmArgs[var4]);
      }
   }

   private Object transformConstant(MethodNode var1, Iterator<AbstractInsnNode> var2, Object var3) {
      if (var3 instanceof Type) {
         Type var4 = (Type)var3;
         String var5 = this.transformDescriptor(var4);
         return !var4.toString().equals(var5) ? Type.getType(var5) : var3;
      } else if (var3 instanceof Handle) {
         return this.transformHandle(var1, var2, (Handle)var3);
      } else {
         return ASM.isAtLeastVersion(6) && var3 instanceof ConstantDynamic ? this.transformDynamicConstant(var1, var2, (ConstantDynamic)var3) : var3;
      }
   }

   private Handle transformHandle(MethodNode var1, Iterator<AbstractInsnNode> var2, Handle var3) {
      MemberRef.Handle var4 = new MemberRef.Handle(var3);
      if (var4.isField()) {
         this.transformFieldRef(var1, var2, var4);
      } else {
         this.transformMethodRef(var1, var2, var4);
      }

      return var4.getMethodHandle();
   }

   private ConstantDynamic transformDynamicConstant(MethodNode var1, Iterator<AbstractInsnNode> var2, ConstantDynamic var3) {
      this.requireVersion(55);
      if (!MixinEnvironment.getCompatibilityLevel().supports(16)) {
         throw new InvalidMixinException(
            this,
            String.format("%s%s in %s contains a dynamic constant, which is not supported by the current compatibility level", var1.name, var1.desc, this)
         );
      }

      String var4 = this.transformSingleDescriptor(var3.getDescriptor(), false);
      Handle var5 = this.transformHandle(var1, var2, var3.getBootstrapMethod());
      Object[] var6 = new Object[var3.getBootstrapMethodArgumentCount()];

      for (int var7 = 0; var7 < var6.length; var7++) {
         var6[var7] = this.transformConstant(var1, var2, var3.getBootstrapMethodArgument(var7));
      }

      return new ConstantDynamic(var3.getName(), var4, var5, var6);
   }

   private void processImaginarySuper(MethodNode var1, FieldInsnNode var2) {
      if (var2.getOpcode() != 180) {
         if ("<init>".equals(var1.name)) {
            throw new InvalidMixinException(this, "Illegal imaginary super declaration: field " + var2.name + " must not specify an initialiser");
         } else {
            throw new InvalidMixinException(
               this, "Illegal imaginary super access: found " + Bytecode.getOpcodeName(var2.getOpcode()) + " opcode in " + var1.name + var1.desc
            );
         }
      } else if ((var1.access & 2) == 0 && (var1.access & 8) == 0) {
         if (Annotations.getInvisible(var1, SoftOverride.class) == null) {
            throw new InvalidMixinException(this, "Illegal imaginary super access: method " + var1.name + var1.desc + " is not decorated with @SoftOverride");
         }

         for (AbstractInsnNode var4 : var1.instructions) {
            if (var4 instanceof MethodInsnNode) {
               MethodInsnNode var5 = (MethodInsnNode)var4;
               if (var5.owner.equals(this.getClassRef()) && var5.name.equals(var1.name) && var5.desc.equals(var1.desc)) {
                  var5.setOpcode(183);
                  this.updateStaticBinding(var1, new MemberRef.Method(var5));
                  return;
               }
            }
         }

         throw new InvalidMixinException(this, "Illegal imaginary super access: could not find INVOKE for " + var1.name + var1.desc);
      } else {
         throw new InvalidMixinException(this, "Illegal imaginary super access: method " + var1.name + var1.desc + " is private or static");
      }
   }

   private void updateStaticBinding(MethodNode var1, MemberRef var2) {
      if (var2.getOwner().equals(this.classNode.superName)) {
         this.updateBinding(var1, var2, ClassInfo.Traversal.SUPER);
      }
   }

   private void updateDynamicBinding(MethodNode var1, MemberRef var2) {
      this.updateBinding(var1, var2, ClassInfo.Traversal.ALL);
   }

   private void updateBinding(MethodNode var1, MemberRef var2, ClassInfo.Traversal var3) {
      if (!"<init>".equals(var2.getName()) && !var2.getOwner().equals(this.getTarget().getClassRef())) {
         ClassInfo.Method var4 = this.targetClassInfo.findMethodInHierarchy(var2.getName(), var2.getDesc(), var3.getSearchType(), var3);
         if (var4 != null) {
            if (var4.getOwner().isMixin()) {
               throw new InvalidMixinException(this, "Invalid " + var2 + " in " + this + " resolved " + var4.getOwner() + " but is mixin.");
            }

            var2.setOwner(var4.getImplementor().getName());
         } else if (var2.ownerIsMixin()) {
            throw new MixinTransformerError("Error resolving " + var2 + " in " + this);
         }
      }
   }

   void transformDescriptor(FieldNode var1) {
      var1.desc = this.transformSingleDescriptor(var1.desc, false);
   }

   void transformDescriptor(MethodNode var1) {
      var1.desc = this.transformMethodDescriptor(var1.desc);
   }

   void transformDescriptor(MemberRef var1) {
      if (var1.isField()) {
         var1.setDesc(this.transformSingleDescriptor(var1.getDesc(), false));
      } else {
         var1.setDesc(this.transformMethodDescriptor(var1.getDesc()));
      }
   }

   void transformDescriptor(TypeInsnNode var1) {
      var1.desc = this.transformSingleDescriptor(var1.desc, true);
   }

   private String transformDescriptor(Type var1) {
      return var1.getSort() == 11 ? this.transformMethodDescriptor(var1.getDescriptor()) : this.transformSingleDescriptor(var1);
   }

   private String transformSingleDescriptor(Type var1) {
      return var1.getSort() < 9 ? var1.toString() : this.transformSingleDescriptor(var1.toString(), false);
   }

   private String transformSingleDescriptor(String var1, boolean var2) {
      IActivityContext.IActivity var3 = this.activities.begin("desc=%s", var1);
      boolean var4 = false;
      String var5 = var1;

      while (var5.startsWith("[") || var5.startsWith("L")) {
         if (var5.startsWith("[")) {
            var5 = var5.substring(1);
            var4 = true;
         } else {
            var5 = var5.substring(1, var5.indexOf(";"));
            var2 = true;
         }
      }

      if (!var2) {
         var3.end();
         return var1;
      }

      if (var4 && var5.length() == 1) {
         Type var6 = Type.getType(var5);
         if (var6.getSort() <= 8) {
            var3.end();
            return var1;
         }
      }

      String var9 = this.innerClasses.get(var5);
      if (var9 != null) {
         var3.end();
         return var1.replace(var5, var9);
      } else if (this.innerClasses.inverse().containsKey(var5)) {
         var3.end();
         return var1;
      } else {
         ClassInfo var7;
         if (ClassInfo.isMixin(var5) && !(var7 = ClassInfo.forName(var5)).isLoadable()) {
            String var8 = var1.replace(var5, this.findRealType(var7).toString());
            var3.end();
            return var8;
         } else {
            var3.end();
            return var1;
         }
      }
   }

   private String transformMethodDescriptor(String var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append('(');

      for (Type var6 : Type.getArgumentTypes(var1)) {
         var2.append(this.transformSingleDescriptor(var6));
      }

      return var2.append(')').append(this.transformSingleDescriptor(Type.getReturnType(var1))).toString();
   }

   final Initialiser getInitialiser() {
      return this.initialiser;
   }

   private Initialiser findInitialiser() {
      MethodNode var1 = this.getConstructor();
      if (var1 == null) {
         return null;
      }

      InsnRange var2 = Constructor.getRange(var1);
      if (!var2.isValid()) {
         return null;
      }

      Initialiser var3 = new Initialiser(this, var1, var2);

      for (Constructor var5 : this.getTarget().getConstructors()) {
         if (var5.isInjectable()) {
            var5.inspect(var3);
         }
      }

      return var3;
   }

   private MethodNode getConstructor() {
      MethodNode var1 = null;

      for (MethodNode var3 : this.getMethods()) {
         if ("<init>".equals(var3.name) && Bytecode.methodHasLineNumbers(var3)) {
            if (var1 == null) {
               var1 = var3;
            } else {
               logger.warn("Mixin {} has multiple constructors, <init>{} was selected\n", this, var1.desc);
            }
         }
      }

      return var1;
   }

   public Target getTargetMethod(MethodNode var1) {
      return this.getTarget().getTargetMethod(var1);
   }

   MethodNode findMethod(MethodNode var1, AnnotationNode var2) {
      LinkedList var3 = new LinkedList();
      var3.add(var1.name);
      if (var2 != null) {
         List var4 = Annotations.getValue(var2, "aliases");
         if (var4 != null) {
            var3.addAll(var4);
         }
      }

      return this.getTarget().findMethod(var3, var1.desc);
   }

   MethodNode findRemappedMethod(MethodNode var1) {
      RemapperChain var2 = this.getEnvironment().getRemappers();
      String var3 = var2.mapMethodName(this.getTarget().getClassRef(), var1.name, var1.desc);
      if (var3.equals(var1.name)) {
         return null;
      }

      LinkedList var4 = new LinkedList();
      var4.add(var3);
      return this.getTarget().findAliasedMethod(var4, var1.desc);
   }

   FieldNode findField(FieldNode var1, AnnotationNode var2) {
      LinkedList var3 = new LinkedList();
      var3.add(var1.name);
      if (var2 != null) {
         List var4 = Annotations.getValue(var2, "aliases");
         if (var4 != null) {
            var3.addAll(var4);
         }
      }

      return this.getTarget().findField(var3, var1.desc);
   }

   FieldNode findRemappedField(FieldNode var1) {
      RemapperChain var2 = this.getEnvironment().getRemappers();
      String var3 = var2.mapFieldName(this.getTarget().getClassRef(), var1.name, var1.desc);
      if (var3.equals(var1.name)) {
         return null;
      }

      LinkedList var4 = new LinkedList();
      var4.add(var3);
      return this.getTarget().findAliasedField(var4, var1.desc);
   }

   protected void requireVersion(int var1) {
      int var2 = var1 & 65535;
      int var3 = var1 >> 16 & 65535;
      if (var2 > (this.minRequiredClassVersion & 65535)) {
         this.minRequiredClassVersion = var1;
         if (var2 > ASM.getMaxSupportedClassVersionMajor()) {
            throw new InvalidMixinException(
               this, String.format("Unsupported mixin class version %d.%d. ASM supports %s", var2, var3, ASM.getClassVersionString())
            );
         }

         this.mixin.getParent().checkCompatibilityLevel(this.mixin, var2, var3);
      }
   }

   @Override
   public Extensions getExtensions() {
      return this.targetClass.getExtensions();
   }

   @Override
   public IMixinInfo getMixin() {
      return this.mixin;
   }

   MixinInfo getInfo() {
      return this.mixin;
   }

   boolean isRequired() {
      return this.mixin.isRequired();
   }

   @Override
   public int getPriority() {
      return this.mixin.getPriority();
   }

   Set<String> getInterfaces() {
      return this.mixin.getInterfaces();
   }

   Collection<MethodNode> getShadowMethods() {
      return this.shadowMethods;
   }

   List<MethodNode> getMethods() {
      return this.classNode.methods;
   }

   Set<Entry<FieldNode, ClassInfo.Field>> getShadowFields() {
      return this.shadowFields.entrySet();
   }

   List<FieldNode> getFields() {
      return this.classNode.fields;
   }

   Level getLoggingLevel() {
      return this.mixin.getLoggingLevel();
   }

   boolean shouldSetSourceFile() {
      return this.mixin.getParent().shouldSetSourceFile();
   }

   String getSourceFile() {
      return this.classNode.sourceFile;
   }

   BiMap<String, String> getInnerClasses() {
      return this.innerClasses;
   }

   @Override
   public IReferenceMapper getReferenceMapper() {
      return this.mixin.getParent().getReferenceMapper();
   }

   void preApply(String var1, ClassNode var2) {
      this.mixin.preApply(var1, var2);
   }

   void postApply(String var1, ClassNode var2) {
      this.activities.clear();

      try {
         IActivityContext.IActivity var3 = this.activities.begin("Validating Injector Groups");
         this.injectorGroups.validateAll();
         var3.next("Plugin Post-Application");
         this.mixin.postApply(var1, var2);
         var3.end();
      } catch (InjectionValidationException var5) {
         InjectorGroupInfo var4 = var5.getGroup();
         throw new InvalidInjectionException(
            var4.getMembers().iterator().next().getMixin(),
            String.format("Critical injection failure: Callback group %s in %s failed injection check: %s", var4, this.mixin, var5.getMessage()),
            var5
         );
      } catch (InvalidMixinException var6) {
         var6.prepend(this.activities);
         throw var6;
      } catch (Exception var7) {
         throw new InvalidMixinException(
            this, "Unexpecteded " + var7.getClass().getSimpleName() + " whilst transforming the mixin class:", var7, this.activities
         );
      }
   }

   String getUniqueName(MethodNode var1, boolean var2) {
      return this.targetClassInfo.getMethodMapper().getUniqueName(this.mixin, var1, this.sessionId, var2);
   }

   String getUniqueName(FieldNode var1) {
      return this.targetClassInfo.getMethodMapper().getUniqueName(this.mixin, var1, this.sessionId);
   }

   void prepareInjections() {
      this.activities.clear();

      try {
         this.injectors.clear();
         IActivityContext.IActivity var1 = this.activities.begin("?");

         for (MethodNode var3 : this.mergedMethods) {
            var1.next("%s%s", var3.name, var3.desc);
            IActivityContext.IActivity var4 = this.activities.begin("Parse");
            InjectionInfo var5 = InjectionInfo.parse(this, var3);
            if (var5 != null) {
               var4.next("Validate");
               if (var5.isValid()) {
                  var4.next("Prepare");
                  var5.prepare();
                  this.injectors.add(var5);
               }

               var4.next("Undecorate");
               var3.visibleAnnotations.remove(var5.getAnnotationNode());
               var4.end();
            }
         }

         var1.end();
      } catch (InvalidMixinException var6) {
         var6.prepend(this.activities);
         throw var6;
      } catch (Exception var7) {
         throw new InvalidMixinException(
            this, "Unexpecteded " + var7.getClass().getSimpleName() + " whilst transforming the mixin class:", var7, this.activities
         );
      }
   }

   InjectionInfo getFirstInjectionInfo() {
      return this.injectors.isEmpty() ? null : this.injectors.get(0);
   }

   void getInjectorOrders(Set<Integer> var1) {
      for (InjectionInfo var3 : this.injectors) {
         var1.add(var3.getOrder());
      }
   }

   void applyPreInjections() {
      this.activities.clear();

      try {
         IActivityContext.IActivity var1 = this.activities.begin("PreInject");
         IActivityContext.IActivity var2 = this.activities.begin("?");

         for (InjectionInfo var4 : this.injectors) {
            var2.next(var4.toString());
            var4.preInject();
         }

         var1.end();
      } catch (InvalidMixinException var5) {
         var5.prepend(this.activities);
         throw var5;
      } catch (Exception var6) {
         throw new InvalidMixinException(
            this, "Unexpecteded " + var6.getClass().getSimpleName() + " whilst transforming the mixin class:", var6, this.activities
         );
      }
   }

   void applyInjections(int var1) {
      this.activities.clear();
      ArrayList var2 = new ArrayList();

      for (InjectionInfo var4 : this.injectors) {
         if (var4.getOrder() == var1) {
            var2.add(var4);
         }
      }

      try {
         IActivityContext.IActivity var10 = this.activities.begin("Inject");
         IActivityContext.IActivity var11 = this.activities.begin("?");

         for (InjectionInfo var6 : var2) {
            var11.next(var6.toString());
            var6.inject();
         }

         var10.next("PostInject");
         IActivityContext.IActivity var12 = this.activities.begin("?");

         for (InjectionInfo var7 : var2) {
            var12.next(var7.toString());
            var7.postInject();
         }

         var10.end();
         this.injectors.removeAll(var2);
      } catch (InvalidMixinException var8) {
         var8.prepend(this.activities);
         throw var8;
      } catch (Exception var9) {
         throw new InvalidMixinException(
            this, "Unexpecteded " + var9.getClass().getSimpleName() + " whilst transforming the mixin class:", var9, this.activities
         );
      }
   }

   List<MethodNode> generateAccessors() {
      this.activities.clear();
      ArrayList var1 = new ArrayList();

      try {
         IActivityContext.IActivity var2 = this.activities.begin("Locate");
         IActivityContext.IActivity var3 = this.activities.begin("?");

         for (AccessorInfo var5 : this.accessors) {
            var3.next(var5.toString());
            var5.locate();
         }

         var2.next("Validate");
         IActivityContext.IActivity var11 = this.activities.begin("?");

         for (AccessorInfo var6 : this.accessors) {
            var11.next(var6.toString());
            var6.validate();
         }

         var2.next("Generate");
         IActivityContext.IActivity var13 = this.activities.begin("?");

         for (AccessorInfo var7 : this.accessors) {
            var13.next(var7.toString());
            MethodNode var8 = var7.generate();
            this.getTarget().addMixinMethod(var8);
            var1.add(var8);
         }

         var2.end();
         return var1;
      } catch (InvalidMixinException var9) {
         var9.prepend(this.activities);
         throw var9;
      } catch (Exception var10) {
         throw new InvalidMixinException(
            this, "Unexpecteded " + var10.getClass().getSimpleName() + " whilst transforming the mixin class:", var10, this.activities
         );
      }
   }

   private ClassInfo findRealType(ClassInfo var1) {
      if (var1 == this.getClassInfo()) {
         return this.targetClassInfo;
      } else {
         ClassInfo var2 = this.targetClassInfo.findCorrespondingType(var1);
         if (var2 == null) {
            throw new InvalidMixinException(
               this, "Resolution error: unable to find corresponding type for " + var1 + " in hierarchy of " + this.targetClassInfo
            );
         } else {
            return var2;
         }
      }
   }
}
