package org.spongepowered.asm.mixin.transformer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.struct.Constructor;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.struct.SourceMap;
import org.spongepowered.asm.mixin.transformer.ext.Extensions;
import org.spongepowered.asm.mixin.transformer.ext.ITargetClassContext;
import org.spongepowered.asm.mixin.transformer.ext.extensions.ExtensionCheckClass;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.ClassSignature;
import org.spongepowered.asm.util.perf.Profiler;

final class TargetClassContext extends ClassContext implements ITargetClassContext {
   private static final ILogger logger = MixinService.getService().getLogger("mixin");
   private final MixinEnvironment env;
   private final Extensions extensions;
   private final Profiler profiler;
   private final String sessionId;
   private final String className;
   private final ClassNode classNode;
   private final ClassInfo classInfo;
   private final SourceMap sourceMap;
   private final ClassSignature signature;
   private final SortedSet<MixinInfo> mixins;
   private final Map<String, Target> targetMethods = new HashMap<>();
   private final Set<MethodNode> mixinMethods = new HashSet<>();
   private final Set<FieldNode> mixinFields = new HashSet<>();
   private final List<InvalidMixinException> suppressedExceptions = new ArrayList<>();
   private boolean applied;
   private boolean export;
   private boolean forceExport;

   TargetClassContext(MixinEnvironment var1, Extensions var2, String var3, String var4, ClassNode var5, SortedSet<MixinInfo> var6) {
      this.env = var1;
      this.extensions = var2;
      this.profiler = Profiler.getProfiler("mixin");
      this.sessionId = var3;
      this.className = var4;
      this.classNode = var5;
      this.classInfo = ClassInfo.fromClassNode(var5);
      this.signature = this.classInfo.getSignature();
      this.mixins = var6;
      this.sourceMap = new SourceMap(var5.sourceFile);
      this.sourceMap.addFile(this.classNode);
   }

   @Override
   public String toString() {
      return this.className;
   }

   boolean isExported() {
      return this.export;
   }

   boolean isExportForced() {
      return this.forceExport;
   }

   Extensions getExtensions() {
      return this.extensions;
   }

   String getSessionId() {
      return this.sessionId;
   }

   @Override
   String getClassRef() {
      return this.classNode.name;
   }

   String getClassName() {
      return this.className;
   }

   @Override
   public ClassNode getClassNode() {
      return this.classNode;
   }

   List<Constructor> getConstructors() {
      ArrayList var1 = new ArrayList();

      for (MethodNode var3 : this.classNode.methods) {
         if ("<init>".equals(var3.name)) {
            var1.add((Constructor)this.getTargetMethod(var3));
         }
      }

      return var1;
   }

   @Override
   public ClassInfo getClassInfo() {
      return this.classInfo;
   }

   SourceMap getSourceMap() {
      return this.sourceMap;
   }

   void mergeSignature(ClassSignature var1) {
      this.signature.merge(var1);
   }

   void addMixinMethod(MethodNode var1) {
      this.mixinMethods.add(var1);
   }

   void methodMerged(MethodNode var1) {
      if (!this.mixinMethods.remove(var1)) {
         logger.debug("Unexpected: Merged unregistered method {}{} in {}", var1.name, var1.desc, this);
      }
   }

   void addMixinField(FieldNode var1) {
      this.mixinFields.add(var1);
   }

   void fieldMerged(FieldNode var1) {
      if (!this.mixinFields.remove(var1)) {
         logger.debug("Unexpected: Merged unregistered field {} {} in {}", var1.desc, var1.name, this);
      }
   }

   MethodNode findMethod(Deque<String> var1, String var2) {
      return this.findAliasedMethod(var1, var2, true);
   }

   MethodNode findAliasedMethod(Deque<String> var1, String var2) {
      return this.findAliasedMethod(var1, var2, false);
   }

   private MethodNode findAliasedMethod(Deque<String> var1, String var2, boolean var3) {
      String var4 = (String)var1.poll();
      if (var4 == null) {
         return null;
      }

      for (MethodNode var6 : this.classNode.methods) {
         if (var6.name.equals(var4) && var6.desc.equals(var2)) {
            return var6;
         }
      }

      if (var3) {
         for (MethodNode var8 : this.mixinMethods) {
            if (var8.name.equals(var4) && var8.desc.equals(var2)) {
               return var8;
            }
         }
      }

      return this.findAliasedMethod(var1, var2);
   }

   FieldNode findField(Deque<String> var1, String var2) {
      return this.findAliasedField(var1, var2, true);
   }

   FieldNode findAliasedField(Deque<String> var1, String var2) {
      return this.findAliasedField(var1, var2, false);
   }

   private FieldNode findAliasedField(Deque<String> var1, String var2, boolean var3) {
      String var4 = (String)var1.poll();
      if (var4 == null) {
         return null;
      }

      for (FieldNode var6 : this.classNode.fields) {
         if (var6.name.equals(var4) && var6.desc.equals(var2)) {
            return var6;
         }
      }

      if (var3) {
         for (FieldNode var8 : this.mixinFields) {
            if (var8.name.equals(var4) && var8.desc.equals(var2)) {
               return var8;
            }
         }
      }

      return this.findAliasedField(var1, var2, var3);
   }

   Target getTargetMethod(MethodNode var1) {
      if (!this.classNode.methods.contains(var1)) {
         throw new IllegalArgumentException("Invalid target method supplied to getTargetMethod()");
      }

      String var2 = var1.name + var1.desc;
      Target var3 = this.targetMethods.get(var2);
      if (var3 == null) {
         var3 = Target.of(this.classInfo, this.classNode, var1);
         this.targetMethods.put(var2, var3);
      }

      return var3;
   }

   void applyMixins() {
      if (this.applied) {
         throw new IllegalStateException("Mixins already applied to target class " + this.className);
      }

      this.applied = true;
      Profiler.Section var1 = this.profiler.begin("preapply");
      this.preApply();
      var1 = var1.next("apply");
      this.apply();
      var1 = var1.next("postapply");
      this.postApply();
      var1.end();
   }

   private void preApply() {
      this.getClassInfo().getMethodMapper().reset();
      this.extensions.preApply(this);
   }

   private void apply() {
      MixinApplicatorStandard var1 = this.createApplicator();
      var1.apply(this.mixins);
      this.applySignature();
      this.upgradeMethods();
      this.checkMerges();
   }

   private void postApply() {
      try {
         this.extensions.postApply(this);
         this.export = true;
      } catch (ExtensionCheckClass.ValidationFailedException var2) {
         MixinProcessor.logger.info(var2.getMessage());
         this.export = this.export | (this.forceExport || this.env.getOption(MixinEnvironment.Option.DEBUG_EXPORT));
      }
   }

   private MixinApplicatorStandard createApplicator() {
      if (this.classInfo.isEnum()) {
         return new MixinApplicatorEnum(this);
      } else {
         return this.classInfo.isInterface() ? new MixinApplicatorInterface(this) : new MixinApplicatorStandard(this);
      }
   }

   private void applySignature() {
      this.classNode.signature = this.signature.toString();
   }

   private void checkMerges() {
      for (MethodNode var2 : this.mixinMethods) {
         if (!var2.name.startsWith("<")) {
            logger.debug("Unexpected: Registered method {}{} in {} was not merged", var2.name, var2.desc, this);
         }
      }

      for (FieldNode var4 : this.mixinFields) {
         logger.debug("Unexpected: Registered field {} {} in {} was not merged", var4.desc, var4.name, this);
      }
   }

   void processDebugTasks() {
      AnnotationNode var1 = Annotations.getVisible(this.classNode, Debug.class);
      this.forceExport = var1 != null && Boolean.TRUE.equals(Annotations.getValue(var1, "export"));
      if (this.env.getOption(MixinEnvironment.Option.DEBUG_VERBOSE)) {
         if (var1 != null && Boolean.TRUE.equals(Annotations.getValue(var1, "print"))) {
            Bytecode.textify(this.classNode, System.err);
         }

         for (MethodNode var3 : this.classNode.methods) {
            AnnotationNode var4 = Annotations.getVisible(var3, Debug.class);
            if (var4 != null && Boolean.TRUE.equals(Annotations.getValue(var4, "print"))) {
               Bytecode.textify(var3, System.err);
            }
         }
      }
   }

   void addSuppressed(InvalidMixinException var1) {
      this.suppressedExceptions.add(var1);
   }

   List<InvalidMixinException> getSuppressedExceptions() {
      return this.suppressedExceptions;
   }
}
