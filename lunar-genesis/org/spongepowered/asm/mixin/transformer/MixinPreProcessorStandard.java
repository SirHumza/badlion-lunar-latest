package org.spongepowered.asm.mixin.transformer;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.extensibility.IActivityContext;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.gen.throwables.InvalidAccessorException;
import org.spongepowered.asm.mixin.struct.MemberRef;
import org.spongepowered.asm.mixin.throwables.MixinException;
import org.spongepowered.asm.mixin.transformer.ext.Extensions;
import org.spongepowered.asm.mixin.transformer.meta.MixinRenamed;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.mixin.transformer.throwables.MixinPreProcessorException;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.perf.Profiler;
import org.spongepowered.asm.util.throwables.SyntheticBridgeException;
import org.spongepowered.include.com.google.common.base.Strings;

class MixinPreProcessorStandard {
   private static final ILogger logger = MixinService.getService().getLogger("mixin");
   protected final MixinInfo mixin;
   protected final MixinInfo.MixinClassNode classNode;
   protected final MixinEnvironment env;
   protected final Profiler profiler = Profiler.getProfiler("mixin");
   protected final ActivityStack activities = new ActivityStack();
   private final boolean verboseLogging;
   private final boolean strictUnique;
   private boolean prepared;
   private boolean attached;

   MixinPreProcessorStandard(MixinInfo var1, MixinInfo.MixinClassNode var2) {
      this.mixin = var1;
      this.classNode = var2;
      this.env = var1.getParent().getEnvironment();
      this.verboseLogging = this.env.getOption(MixinEnvironment.Option.DEBUG_VERBOSE);
      this.strictUnique = this.env.getOption(MixinEnvironment.Option.DEBUG_UNIQUE);
   }

   final MixinPreProcessorStandard prepare(Extensions var1) {
      if (this.prepared) {
         return this;
      }

      this.prepared = true;
      this.activities.clear();
      Profiler.Section var2 = this.profiler.begin("prepare");

      try {
         IActivityContext.IActivity var3 = this.activities.begin("Prepare inner classes");
         this.prepareInnerClasses(var1);
         var3.next("Prepare method");

         for (MixinInfo.MixinMethodNode var5 : this.classNode.mixinMethods) {
            ClassInfo.Method var6 = this.mixin.getClassInfo().findMethod(var5, var5.access | 262144);
            IActivityContext.IActivity var7 = this.activities.begin(var5.toString());
            this.prepareMethod(var5, var6);
            var7.end();
         }

         var3.next("Prepare field");

         for (FieldNode var11 : this.classNode.fields) {
            IActivityContext.IActivity var12 = this.activities.begin(String.format("%s:%s", var11.name, var11.desc));
            this.prepareField(var11);
            var12.end();
         }

         var3.end();
      } catch (MixinException var8) {
         throw var8;
      } catch (Exception var9) {
         throw new MixinPreProcessorException(String.format("Prepare error for %s during activity:", this.mixin), var9, this.activities);
      }

      var2.end();
      return this;
   }

   protected void prepareInnerClasses(Extensions var1) {
      InnerClassGenerator var2 = var1.getGenerator(InnerClassGenerator.class);

      for (String var4 : this.mixin.getDeclaredTargetClasses()) {
         ClassInfo var5 = ClassInfo.forName(var4);

         for (String var7 : this.mixin.getInnerClasses()) {
            var2.registerInnerClass(this.mixin, var5, var7);
         }
      }
   }

   protected void prepareMethod(MixinInfo.MixinMethodNode var1, ClassInfo.Method var2) {
      this.prepareShadow(var1, var2);
      this.prepareSoftImplements(var1, var2);
   }

   protected void prepareShadow(MixinInfo.MixinMethodNode var1, ClassInfo.Method var2) {
      AnnotationNode var3 = Annotations.getVisible(var1, Shadow.class);
      if (var3 != null) {
         if ("<init>".equals(var1.name)) {
            for (String var7 : new String[]{"prefix", "aliases"}) {
               if (Annotations.getValue(var3, var7) != null) {
                  throw new InvalidMixinException(
                     this.mixin, String.format("@Shadow constructor %s.%s declares %s. This is not allowed.", this.mixin, var1, var7)
                  );
               }
            }
         }

         String var8 = Annotations.getValue(var3, "prefix", Shadow.class);
         if (var1.name.startsWith(var8)) {
            Annotations.setVisible(var1, MixinRenamed.class, "originalName", var1.name);
            String var9 = var1.name.substring(var8.length());
            var1.name = var2.renameTo(var9);
         }
      }
   }

   protected void prepareSoftImplements(MixinInfo.MixinMethodNode var1, ClassInfo.Method var2) {
      for (InterfaceInfo var4 : this.mixin.getSoftImplements()) {
         if (var4.renameMethod(var1)) {
            var2.renameTo(var1.name);
         }
      }
   }

   protected void prepareField(FieldNode var1) {
   }

   final MixinPreProcessorStandard conform(TargetClassContext var1) {
      return this.conform(var1.getClassInfo());
   }

   final MixinPreProcessorStandard conform(ClassInfo var1) {
      this.activities.clear();
      Profiler.Section var2 = this.profiler.begin("conform");

      try {
         for (MixinInfo.MixinMethodNode var4 : this.classNode.mixinMethods) {
            if (var4.isInjector()) {
               ClassInfo.Method var5 = this.mixin.getClassInfo().findMethod(var4, 10);
               IActivityContext.IActivity var6 = this.activities.begin("Conform injector %s", var4);
               this.conformInjector(var1, var4, var5);
               var6.end();
            }
         }
      } catch (MixinException var7) {
         throw var7;
      } catch (Exception var8) {
         throw new MixinPreProcessorException(String.format("Conform error for %s during activity:", this.mixin), var8, this.activities);
      }

      var2.end();
      return this;
   }

   private void conformInjector(ClassInfo var1, MixinInfo.MixinMethodNode var2, ClassInfo.Method var3) {
      MethodMapper var4 = var1.getMethodMapper();
      var4.remapHandlerMethod(this.mixin, var2, var3);
   }

   MixinTargetContext createContextFor(TargetClassContext var1) {
      MixinTargetContext var2 = new MixinTargetContext(this.mixin, this.classNode, var1);
      this.conform(var1);
      this.attach(var2);
      return var2;
   }

   final MixinPreProcessorStandard attach(MixinTargetContext var1) {
      if (this.attached) {
         throw new IllegalStateException("Preprocessor was already attached");
      }

      this.attached = true;
      this.activities.clear();
      Profiler.Section var2 = this.profiler.begin("attach");

      try {
         Profiler.Section var3 = this.profiler.begin("methods");
         IActivityContext.IActivity var4 = this.activities.begin("Attach method");
         this.attachMethods(var1);
         var3 = var3.next("fields");
         var4.next("Attach field");
         this.attachFields(var1);
         var3 = var3.next("transform");
         var4.next("Transform");
         this.transform(var1);
         var4.end();
         var3.end();
      } catch (MixinException var5) {
         throw var5;
      } catch (Exception var6) {
         throw new MixinPreProcessorException(String.format("Attach error for %s during activity:", this.mixin), var6, this.activities);
      }

      var2.end();
      return this;
   }

   protected void attachMethods(MixinTargetContext var1) {
      IActivityContext.IActivity var2 = this.activities.begin("?");
      Iterator var3 = this.classNode.mixinMethods.iterator();

      while (var3.hasNext()) {
         MixinInfo.MixinMethodNode var4 = (MixinInfo.MixinMethodNode)var3.next();
         var2.next(var4.toString());
         if (!this.validateMethod(var1, var4)) {
            var3.remove();
         } else if (this.attachInjectorMethod(var1, var4)) {
            var1.addMixinMethod(var4);
         } else if (this.attachAccessorMethod(var1, var4)) {
            var3.remove();
         } else if (this.attachShadowMethod(var1, var4)) {
            var1.addShadowMethod(var4);
            var3.remove();
         } else if (this.attachOverwriteMethod(var1, var4)) {
            var1.addMixinMethod(var4);
         } else if (this.attachUniqueMethod(var1, var4)) {
            var3.remove();
         } else {
            this.attachMethod(var1, var4);
            var1.addMixinMethod(var4);
         }
      }

      var2.end();
   }

   protected boolean validateMethod(MixinTargetContext var1, MixinInfo.MixinMethodNode var2) {
      return true;
   }

   protected boolean attachInjectorMethod(MixinTargetContext var1, MixinInfo.MixinMethodNode var2) {
      return var2.isInjector();
   }

   protected boolean attachAccessorMethod(MixinTargetContext var1, MixinInfo.MixinMethodNode var2) {
      return this.attachAccessorMethod(var1, var2, MixinPreProcessorStandard.SpecialMethod.ACCESSOR)
         || this.attachAccessorMethod(var1, var2, MixinPreProcessorStandard.SpecialMethod.INVOKER);
   }

   protected boolean attachAccessorMethod(MixinTargetContext var1, MixinInfo.MixinMethodNode var2, MixinPreProcessorStandard.SpecialMethod var3) {
      AnnotationNode var4 = var2.getVisibleAnnotation(var3.annotation);
      if (var4 == null) {
         return false;
      }

      String var5 = var3 + " method " + var2.name;
      ClassInfo.Method var6 = this.getSpecialMethod(var2, var3);
      if (MixinEnvironment.getCompatibilityLevel().isAtLeast(MixinEnvironment.CompatibilityLevel.JAVA_8) && var6.isStatic()) {
         if (this.mixin.getTargets().size() > 1) {
            throw new InvalidAccessorException(var1, var5 + " in multi-target mixin is invalid. Mixin must have exactly 1 target.");
         }

         if (var6.isConformed()) {
            var2.name = var6.getName();
         } else {
            String var7 = var1.getUniqueName(var2, true);
            logger.log(
               this.mixin.getLoggingLevel(), "Renaming @{} method {}{} to {} in {}", Annotations.getSimpleName(var4), var2.name, var2.desc, var7, this.mixin
            );
            var2.name = var6.conform(var7);
         }
      } else {
         if (!var6.isAbstract()) {
            throw new InvalidAccessorException(var1, var5 + " is not abstract");
         }

         if (var6.isStatic()) {
            throw new InvalidAccessorException(var1, var5 + " cannot be static");
         }
      }

      var1.addAccessorMethod(var2, var3.annotation);
      return true;
   }

   protected boolean attachShadowMethod(MixinTargetContext var1, MixinInfo.MixinMethodNode var2) {
      return this.attachSpecialMethod(var1, var2, MixinPreProcessorStandard.SpecialMethod.SHADOW);
   }

   protected boolean attachOverwriteMethod(MixinTargetContext var1, MixinInfo.MixinMethodNode var2) {
      return this.attachSpecialMethod(var1, var2, MixinPreProcessorStandard.SpecialMethod.OVERWRITE);
   }

   protected boolean attachSpecialMethod(MixinTargetContext var1, MixinInfo.MixinMethodNode var2, MixinPreProcessorStandard.SpecialMethod var3) {
      AnnotationNode var4 = var2.getVisibleAnnotation(var3.annotation);
      if (var4 == null) {
         return false;
      }

      if (var3.isOverwrite) {
         this.checkMixinNotUnique(var2, var3);
      }

      ClassInfo.Method var5 = this.getSpecialMethod(var2, var3);
      MethodNode var6 = var1.findMethod(var2, var4);
      if (var6 == null) {
         var6 = var1.findRemappedMethod(var2);
         if (var6 == null) {
            throw new InvalidMixinException(
               this.mixin,
               String.format(
                  "%s method %s%s in %s was not located in the target class %s. %s%s",
                  var3,
                  var2.name,
                  var2.desc,
                  this.mixin,
                  var1.getTarget(),
                  var1.getReferenceMapper().getStatus(),
                  getDynamicInfo(var2)
               )
            );
         }

         var2.name = var5.renameTo(var6.name);
      }

      if ("<init>".equals(var6.name) && !"<init>".equals(var2.name)) {
         throw new InvalidMixinException(this.mixin, String.format("Nice try! %s in %s cannot alias a constructor", var2.name, this.mixin));
      }

      if (!Bytecode.compareFlags(var2, var6, 8)) {
         throw new InvalidMixinException(
            this.mixin, String.format("STATIC modifier of %s method %s in %s does not match the target", var3, var2.name, this.mixin)
         );
      }

      this.conformVisibility(var1, var2, var3, var6);
      if (!var6.name.equals(var2.name)) {
         if (var3.isOverwrite && (var6.access & 2) == 0) {
            throw new InvalidMixinException(this.mixin, "Non-private method cannot be aliased. Found " + var6.name);
         }

         var2.name = var5.renameTo(var6.name);
      }

      return true;
   }

   private void conformVisibility(MixinTargetContext var1, MixinInfo.MixinMethodNode var2, MixinPreProcessorStandard.SpecialMethod var3, MethodNode var4) {
      if (!"<init>".equals(var2.name)) {
         Bytecode.Visibility var5 = Bytecode.getVisibility(var4);
         Bytecode.Visibility var6 = Bytecode.getVisibility(var2);
         if (var6.ordinal() >= var5.ordinal()) {
            if (var5 == Bytecode.Visibility.PRIVATE && var6.ordinal() > Bytecode.Visibility.PRIVATE.ordinal()) {
               var1.getTarget().addUpgradedMethod(var4);
            }
         } else {
            String var7 = String.format("%s %s method %s in %s cannot reduce visibiliy of %s target method", var6, var3, var2.name, this.mixin, var5);
            if (var3.isOverwrite && !this.mixin.getParent().conformOverwriteVisibility()) {
               throw new InvalidMixinException(this.mixin, var7);
            }

            if (var6 == Bytecode.Visibility.PRIVATE) {
               if (var3.isOverwrite) {
                  logger.warn("Static binding violation: {}, visibility will be upgraded.", var7);
               }

               var1.addUpgradedMethod(var2);
               Bytecode.setVisibility(var2, var5);
            }
         }
      }
   }

   protected ClassInfo.Method getSpecialMethod(MixinInfo.MixinMethodNode var1, MixinPreProcessorStandard.SpecialMethod var2) {
      ClassInfo.Method var3 = this.mixin.getClassInfo().findMethod(var1, 262154);
      this.checkMethodNotUnique(var3, var2);
      return var3;
   }

   protected void checkMethodNotUnique(ClassInfo.Method var1, MixinPreProcessorStandard.SpecialMethod var2) {
      if (var1.isUnique()) {
         throw new InvalidMixinException(this.mixin, String.format("%s method %s in %s cannot be @Unique", var2, var1.getName(), this.mixin));
      }
   }

   protected void checkMixinNotUnique(MixinInfo.MixinMethodNode var1, MixinPreProcessorStandard.SpecialMethod var2) {
      if (this.mixin.isUnique()) {
         throw new InvalidMixinException(this.mixin, String.format("%s method %s found in a @Unique mixin %s", var2, var1.name, this.mixin));
      }
   }

   protected boolean attachUniqueMethod(MixinTargetContext var1, MixinInfo.MixinMethodNode var2) {
      ClassInfo.Method var3 = this.mixin.getClassInfo().findMethod(var2, 10);
      if (var3 != null && (var3.isUnique() || this.mixin.isUnique() || var3.isSynthetic())) {
         boolean var4 = var3.isSynthetic();
         if (var4) {
            var1.transformDescriptor(var2);
            var3.remapTo(var2.desc);
         }

         MethodNode var5 = var1.findMethod(var2, null);
         if (var5 == null && !var4) {
            return false;
         }

         String var6 = var4 ? "synthetic" : "@Unique";
         if (Bytecode.getVisibility(var2).ordinal() < Bytecode.Visibility.PUBLIC.ordinal()) {
            if (var3.isConformed()) {
               var2.name = var3.getName();
            } else {
               String var10 = var1.getUniqueName(var2, false);
               logger.log(this.mixin.getLoggingLevel(), "Renaming {} method {}{} to {} in {}", var6, var2.name, var2.desc, var10, this.mixin);
               var2.name = var3.conform(var10);
            }

            return false;
         } else {
            if (var5 == null) {
               return false;
            }

            if (this.strictUnique) {
               throw new InvalidMixinException(
                  this.mixin,
                  String.format(
                     "Method conflict, %s method %s in %s cannot overwrite %s%s in %s", var6, var2.name, this.mixin, var5.name, var5.desc, var1.getTarget()
                  )
               );
            }

            AnnotationNode var7 = Annotations.getVisible(var2, Unique.class);
            if (var7 != null && Annotations.getValue(var7, "silent", Boolean.FALSE)) {
               var1.addMixinMethod(var2);
               return true;
            }

            if (Bytecode.hasFlag(var2, 64)) {
               try {
                  Bytecode.compareBridgeMethods(var5, var2);
                  logger.debug(
                     "Discarding sythetic bridge method {} in {} because existing method in {} is compatible", var6, var2.name, this.mixin, var1.getTarget()
                  );
                  return true;
               } catch (SyntheticBridgeException var9) {
                  if (this.verboseLogging || this.env.getOption(MixinEnvironment.Option.DEBUG_VERIFY)) {
                     var9.printAnalysis(var1, var5, var2);
                  }

                  throw new InvalidMixinException(this.mixin, var9.getMessage());
               }
            } else {
               logger.warn("Discarding {} public method {} in {} because it already exists in {}", var6, var2.name, this.mixin, var1.getTarget());
               return true;
            }
         }
      } else {
         return false;
      }
   }

   protected void attachMethod(MixinTargetContext var1, MixinInfo.MixinMethodNode var2) {
      ClassInfo.Method var3 = this.mixin.getClassInfo().findMethod(var2);
      if (var3 != null) {
         ClassInfo.Method var4 = this.mixin.getClassInfo().findMethodInHierarchy(var2, ClassInfo.SearchType.SUPER_CLASSES_ONLY);
         if (var4 != null && var4.isRenamed()) {
            var2.name = var3.renameTo(var4.getName());
         }

         MethodNode var5 = var1.findMethod(var2, null);
         if (var5 != null) {
            this.conformVisibility(var1, var2, MixinPreProcessorStandard.SpecialMethod.MERGE, var5);
         }
      }
   }

   protected void attachFields(MixinTargetContext var1) {
      IActivityContext.IActivity var2 = this.activities.begin("?");
      Iterator var3 = this.classNode.fields.iterator();

      while (var3.hasNext()) {
         FieldNode var4 = (FieldNode)var3.next();
         var2.next("%s:%s", var4.name, var4.desc);
         AnnotationNode var5 = Annotations.getVisible(var4, Shadow.class);
         boolean var6 = var5 != null;
         if (!this.validateField(var1, var4, var5)) {
            var3.remove();
         } else {
            ClassInfo.Field var7 = this.mixin.getClassInfo().findField(var4);
            var1.transformDescriptor(var4);
            var7.remapTo(var4.desc);
            if (var7.isUnique() && var6) {
               throw new InvalidMixinException(this.mixin, String.format("@Shadow field %s cannot be @Unique", var4.name));
            }

            FieldNode var8 = var1.findField(var4, var5);
            if (var8 == null) {
               if (var5 == null) {
                  var1.addMixinField(var4);
                  continue;
               }

               var8 = var1.findRemappedField(var4);
               if (var8 == null) {
                  throw new InvalidMixinException(
                     this.mixin,
                     String.format(
                        "@Shadow field %s was not located in the target class %s. %s%s",
                        var4.name,
                        var1.getTarget(),
                        var1.getReferenceMapper().getStatus(),
                        getDynamicInfo(var4)
                     )
                  );
               }

               var4.name = var7.renameTo(var8.name);
            }

            if (var7.isUnique()) {
               if (Bytecode.getVisibility(var4).isLessThan(Bytecode.Visibility.PUBLIC)) {
                  String var9 = var1.getUniqueName(var4);
                  logger.log(this.mixin.getLoggingLevel(), "Renaming @Unique field {}{} to {} in {}", var4.name, var4.desc, var9, this.mixin);
                  var4.name = var7.renameTo(var9);
                  var1.addMixinField(var4);
               } else {
                  if (this.strictUnique) {
                     throw new InvalidMixinException(
                        this.mixin,
                        String.format(
                           "Field conflict, @Unique field %s in %s cannot overwrite %s%s in %s", var4.name, this.mixin, var8.name, var8.desc, var1.getTarget()
                        )
                     );
                  }

                  logger.warn(
                     "Discarding @Unique public field {} in {} because it already exists in {}. Note that declared FIELD INITIALISERS will NOT be removed!",
                     var4.name,
                     this.mixin,
                     var1.getTarget()
                  );
                  var3.remove();
               }
            } else {
               if (!Bytecode.compareFlags(var4, var8, 8)) {
                  if (var6) {
                     throw new InvalidMixinException(
                        this.mixin, String.format("STATIC modifier of @Shadow field %s in %s does not match the target", var4.name, this.mixin)
                     );
                  }

                  throw new InvalidMixinException(
                     this.mixin,
                     String.format(
                        "Field %s in %s conflicts with %sstatic field in the target (%s)",
                        var4.name,
                        this.mixin,
                        Bytecode.isStatic(var8) ? "" : "non-",
                        var1.getTarget()
                     )
                  );
               }

               if (!Bytecode.compareFlags(var4, var8, 8)) {
                  throw new InvalidMixinException(
                     this.mixin, String.format("STATIC modifier of @Shadow field %s in %s does not match the target", var4.name, this.mixin)
                  );
               }

               if (!var8.desc.equals(var4.desc)) {
                  throw new InvalidMixinException(this.mixin, String.format("The field %s in the target class has a conflicting signature", var4.name));
               }

               if (!var8.name.equals(var4.name)) {
                  if ((var8.access & 2) == 0 && (var8.access & 4096) == 0) {
                     throw new InvalidMixinException(this.mixin, "Non-private field cannot be aliased. Found " + var8.name);
                  }

                  var4.name = var7.renameTo(var8.name);
               }

               if (var6) {
                  boolean var11 = var7.isDecoratedFinal();
                  if (this.verboseLogging && Bytecode.hasFlag(var8, 16) != var11) {
                     String var10 = var11
                        ? "@Shadow field {}::{} is decorated with @Final but target is not final"
                        : "@Shadow target {}::{} is final but shadow is not decorated with @Final";
                     logger.warn(var10, this.mixin, var4.name);
                  }

                  var3.remove();
                  var1.addShadowField(var4, var7);
               }
            }
         }
      }
   }

   protected boolean validateField(MixinTargetContext var1, FieldNode var2, AnnotationNode var3) {
      if (Bytecode.isStatic(var2) && !Bytecode.hasFlag(var2, 2) && !Bytecode.hasFlag(var2, 4096) && var3 == null) {
         throw new InvalidMixinException(var1, String.format("Mixin %s contains non-private static field %s:%s", var1, var2.name, var2.desc));
      }

      String var4 = Annotations.getValue(var3, "prefix", Shadow.class);
      if (var2.name.startsWith(var4)) {
         throw new InvalidMixinException(var1, String.format("@Shadow field %s.%s has a shadow prefix. This is not allowed.", var1, var2.name));
      }

      if ("super$".equals(var2.name)) {
         if (var2.access != 2) {
            throw new InvalidMixinException(this.mixin, String.format("Imaginary super field %s.%s must be private and non-final", var1, var2.name));
         } else if (!var2.desc.equals("L" + this.mixin.getClassRef() + ";")) {
            throw new InvalidMixinException(
               this.mixin,
               String.format("Imaginary super field %s.%s must have the same type as the parent mixin (%s)", var1, var2.name, this.mixin.getClassName())
            );
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   protected void transform(MixinTargetContext var1) {
      IActivityContext.IActivity var2 = this.activities.begin("method");

      for (MethodNode var4 : this.classNode.methods) {
         var2.next("Method %s", var4);

         for (AbstractInsnNode var6 : var4.instructions) {
            IActivityContext.IActivity var7 = this.activities.begin(Bytecode.getOpcodeName(var6));
            if (var6 instanceof MethodInsnNode) {
               this.transformMethod((MethodInsnNode)var6);
            } else if (var6 instanceof FieldInsnNode) {
               this.transformField((FieldInsnNode)var6);
            } else if (var6 instanceof InvokeDynamicInsnNode) {
               this.transformInvokeDynamic((InvokeDynamicInsnNode)var6);
            }

            var7.end();
         }
      }

      var2.end();
   }

   protected void transformInvokeDynamic(InvokeDynamicInsnNode var1) {
      IActivityContext.IActivity var2 = this.activities.begin("%s%s", var1.name, var1.desc);
      Profiler.Section var3 = this.profiler.begin("meta");
      MemberRef.Handle var4 = new MemberRef.Handle(var1.bsm);
      this.transformMemberReference(var4);
      var1.bsm = var4.getMethodHandle();

      for (int var5 = 0; var5 < var1.bsmArgs.length; var5++) {
         if (var1.bsmArgs[var5] instanceof Handle) {
            var4 = new MemberRef.Handle((Handle)var1.bsmArgs[var5]);
            this.transformMemberReference(var4);
            var1.bsmArgs[var5] = var4.getMethodHandle();
         }
      }

      var3.end();
      var2.end();
   }

   protected void transformMethod(MethodInsnNode var1) {
      MemberRef.Method var2 = new MemberRef.Method(var1);
      this.transformMemberReference(var2);
   }

   protected void transformField(FieldInsnNode var1) {
      MemberRef.Field var2 = new MemberRef.Field(var1);
      this.transformMemberReference(var2);
   }

   protected void transformMemberReference(MemberRef var1) {
      if (ClassInfo.isMixin(var1.getOwner())) {
         IActivityContext.IActivity var2 = this.activities.begin("%s::%s:%s", var1.getOwner(), var1.getName(), var1.getDesc());
         Profiler.Section var3 = this.profiler.begin("meta");
         ClassInfo var4 = ClassInfo.forDescriptor(var1.getOwner(), ClassInfo.TypeLookup.DECLARED_TYPE);
         if (var4 == null) {
            throw new RuntimeException(new ClassNotFoundException(var1.getOwner().replace('/', '.')));
         }

         ClassInfo.Member var5;
         if (var1.isField()) {
            int var6 = var1.getOpcode() != 178 && var1.getOpcode() != 179 ? 0 : 8;
            var5 = var4.findFieldInHierarchy(var1.getName(), var1.getDesc(), ClassInfo.SearchType.ALL_CLASSES, 2 | var6);
         } else {
            int var8 = var1.getOpcode() == 184 ? 8 : 0;
            ClassInfo.Method var7 = var4.findMethodInHierarchy(var1.getName(), var1.getDesc(), ClassInfo.SearchType.ALL_CLASSES, 2 | var8);
            var5 = var7 != null && !var7.isAccessor() ? var7 : null;
         }

         var3.end();
         if (var5 != null && var5.isRenamed()) {
            var1.setName(var5.getName());
         }

         var2.end();
      }
   }

   protected static String getDynamicInfo(MethodNode var0) {
      return getDynamicInfo("Method", Annotations.getInvisible(var0, Dynamic.class));
   }

   protected static String getDynamicInfo(FieldNode var0) {
      return getDynamicInfo("Field", Annotations.getInvisible(var0, Dynamic.class));
   }

   private static String getDynamicInfo(String var0, AnnotationNode var1) {
      String var2 = Strings.nullToEmpty(Annotations.getValue(var1));
      Type var3 = Annotations.getValue(var1, "mixin");
      if (var3 != null) {
         var2 = String.format("{%s} %s", var3.getClassName(), var2).trim();
      }

      return var2.length() > 0 ? String.format(" %s is @Dynamic(%s)", var0, var2) : "";
   }

   enum SpecialMethod {
      MERGE(true),
      OVERWRITE(true, Overwrite.class),
      SHADOW(false, Shadow.class),
      ACCESSOR(false, Accessor.class),
      INVOKER(false, Invoker.class);

      final boolean isOverwrite;
      final Class<? extends Annotation> annotation;
      final String description;

      SpecialMethod(boolean var3, Class<? extends Annotation> var4) {
         this.isOverwrite = var3;
         this.annotation = var4;
         this.description = "@" + Annotations.getSimpleName(var4);
      }

      SpecialMethod(boolean var3) {
         this.isOverwrite = var3;
         this.annotation = null;
         this.description = "overwrite";
      }

      @Override
      public String toString() {
         return this.description;
      }
   }
}
