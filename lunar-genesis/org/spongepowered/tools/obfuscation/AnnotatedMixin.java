package org.spongepowered.tools.obfuscation;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.injection.selectors.ISelectorContext;
import org.spongepowered.asm.mixin.injection.struct.SelectorAnnotationContext;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.mixin.refmap.ReferenceMapper;
import org.spongepowered.asm.mixin.transformer.ext.Extensions;
import org.spongepowered.asm.util.asm.IAnnotatedElement;
import org.spongepowered.asm.util.asm.IAnnotationHandle;
import org.spongepowered.include.com.google.common.base.Strings;
import org.spongepowered.tools.obfuscation.interfaces.IMessagerEx;
import org.spongepowered.tools.obfuscation.interfaces.IMessagerSuppressible;
import org.spongepowered.tools.obfuscation.interfaces.IMixinAnnotationProcessor;
import org.spongepowered.tools.obfuscation.interfaces.IMixinValidator;
import org.spongepowered.tools.obfuscation.interfaces.IObfuscationManager;
import org.spongepowered.tools.obfuscation.interfaces.ITypeHandleProvider;
import org.spongepowered.tools.obfuscation.mapping.IMappingConsumer;
import org.spongepowered.tools.obfuscation.mirror.AnnotationHandle;
import org.spongepowered.tools.obfuscation.mirror.MethodHandle;
import org.spongepowered.tools.obfuscation.mirror.TypeHandle;
import org.spongepowered.tools.obfuscation.mirror.TypeUtils;
import org.spongepowered.tools.obfuscation.struct.InjectorRemap;

class AnnotatedMixin implements IMixinContext, IAnnotatedElement {
   private final IAnnotationHandle annotation;
   private final IMessagerSuppressible messager;
   private final ITypeHandleProvider typeProvider;
   private final IObfuscationManager obf;
   private final IMappingConsumer mappings;
   private final TypeElement mixin;
   private final List<MethodHandle> methods;
   private final TypeHandle handle;
   private final List<TypeHandle> targets = new ArrayList<>();
   private final TypeHandle primaryTarget;
   private final String classRef;
   private final boolean remap;
   private final boolean virtual;
   private final AnnotatedMixinElementHandlerOverwrite overwrites;
   private final AnnotatedMixinElementHandlerShadow shadows;
   private final AnnotatedMixinElementHandlerInjector injectors;
   private final AnnotatedMixinElementHandlerAccessor accessors;
   private final AnnotatedMixinElementHandlerSoftImplements softImplements;
   private boolean validated = false;

   public AnnotatedMixin(IMixinAnnotationProcessor var1, TypeElement var2) {
      this.typeProvider = var1.getTypeProvider();
      this.obf = var1.getObfuscationManager();
      this.mappings = this.obf.createMappingConsumer();
      this.messager = var1;
      this.mixin = var2;
      this.handle = new TypeHandle(var2, var1.getTypeProvider());
      this.methods = new ArrayList<>(this.handle.getMethods());
      this.virtual = this.handle.getAnnotation(Pseudo.class).exists();
      this.annotation = this.handle.getAnnotation(Mixin.class);
      this.classRef = TypeUtils.getInternalName(var2);
      this.primaryTarget = this.initTargets(var1);
      this.remap = this.annotation.getBoolean("remap", true) && this.targets.size() > 0;
      this.overwrites = new AnnotatedMixinElementHandlerOverwrite(var1, this);
      this.shadows = new AnnotatedMixinElementHandlerShadow(var1, this);
      this.injectors = new AnnotatedMixinElementHandlerInjector(var1, this);
      this.accessors = new AnnotatedMixinElementHandlerAccessor(var1, this);
      this.softImplements = new AnnotatedMixinElementHandlerSoftImplements(var1, this);
   }

   AnnotatedMixin runValidators(IMixinValidator.ValidationPass var1, Collection<IMixinValidator> var2) {
      for (IMixinValidator var4 : var2) {
         if (!var4.validate(var1, this.mixin, this.annotation, this.targets)) {
            break;
         }
      }

      if (var1 == IMixinValidator.ValidationPass.FINAL && !this.validated) {
         this.validated = true;
         this.runFinalValidation();
      }

      return this;
   }

   private TypeHandle initTargets(IMixinAnnotationProcessor var1) {
      TypeHandle var2 = null;

      try {
         for (Object var4 : this.annotation.getList()) {
            TypeHandle var5 = this.typeProvider.getTypeHandle(var4);
            if (var5 != null && !this.targets.contains(var5)) {
               this.addTarget(var5);
               if (var2 == null) {
                  var2 = var5;
               }
            }
         }
      } catch (Exception var9) {
         this.printMessage(IMessagerEx.MessageType.WARNING, "Error processing public targets: " + var9.getClass().getName() + ": " + var9.getMessage());
      }

      try {
         for (String var11 : this.annotation.getList("targets")) {
            TypeHandle var12 = this.typeProvider.getTypeHandle(var11);
            if (!this.targets.contains(var12)) {
               if (this.virtual) {
                  var12 = this.typeProvider.getSimulatedHandle(var11, this.mixin.asType());
               } else if (var12 == null) {
                  this.printMessage(IMessagerEx.MessageType.MIXIN_SOFT_TARGET_NOT_FOUND, "Mixin target " + var11 + " could not be found");
                  if (IMessagerEx.MessageType.MIXIN_SOFT_TARGET_NOT_FOUND.isError()) {
                     return null;
                  }

                  var12 = this.typeProvider.getSimulatedHandle(var11, this.mixin.asType());
               } else if (var12.isImaginary()) {
                  this.printMessage(
                     IMessagerEx.MessageType.MIXIN_SOFT_TARGET_NOT_RESOLVED,
                     "Mixin target " + var11 + " could not be fully resolved.",
                     SuppressedBy.UNRESOLVABLE_TARGET
                  );
                  if (IMessagerEx.MessageType.MIXIN_SOFT_TARGET_NOT_RESOLVED.isError()) {
                     return null;
                  }
               } else if (var12.isPublic()) {
                  SuppressedBy var6 = var12.getPackage().isUnnamed() ? SuppressedBy.DEFAULT_PACKAGE : SuppressedBy.PUBLIC_TARGET;
                  String var7 = IMessagerEx.MessageType.MIXIN_SOFT_TARGET_IS_PUBLIC.isError() ? "must" : "should";
                  this.printMessage(
                     IMessagerEx.MessageType.MIXIN_SOFT_TARGET_IS_PUBLIC, "Mixin target " + var11 + " is public and " + var7 + " be specified in value", var6
                  );
                  if (IMessagerEx.MessageType.MIXIN_SOFT_TARGET_IS_PUBLIC.isError()) {
                     return null;
                  }
               }

               this.addSoftTarget(var12, var11);
               if (var2 == null) {
                  var2 = var12;
               }
            }
         }
      } catch (Exception var8) {
         this.printMessage(IMessagerEx.MessageType.WARNING, "Error processing private targets: " + var8.getClass().getName() + ": " + var8.getMessage());
      }

      if (var2 == null) {
         this.printMessage(IMessagerEx.MessageType.MIXIN_NO_TARGETS, "Mixin has no targets");
      }

      return var2;
   }

   private void printMessage(IMessagerEx.MessageType var1, CharSequence var2) {
      this.messager.printMessage(var1, var2, this.mixin, AnnotationHandle.asMirror(this.annotation));
   }

   private void printMessage(IMessagerEx.MessageType var1, CharSequence var2, SuppressedBy var3) {
      this.messager.printMessage(var1, var2, this.mixin, AnnotationHandle.asMirror(this.annotation), var3);
   }

   private void addSoftTarget(TypeHandle var1, String var2) {
      ObfuscationData var3 = this.obf.getDataProvider().getObfClass(var1);
      if (!var3.isEmpty()) {
         this.obf.getReferenceManager().addClassMapping(this.classRef, var2, var3);
      }

      this.addTarget(var1);
   }

   private void addTarget(TypeHandle var1) {
      this.targets.add(var1);
   }

   @Override
   public String toString() {
      return this.mixin.getSimpleName().toString();
   }

   public TypeElement getMixinElement() {
      return this.mixin;
   }

   public TypeHandle getHandle() {
      return this.handle;
   }

   @Override
   public String getClassRef() {
      return this.classRef;
   }

   public List<TypeHandle> getTargets() {
      return this.targets;
   }

   public boolean isMultiTarget() {
      return this.targets.size() > 1;
   }

   public boolean remap() {
      return this.remap;
   }

   public IMappingConsumer getMappings() {
      return this.mappings;
   }

   private void runFinalValidation() {
      for (MethodHandle var2 : this.methods) {
         this.overwrites.registerMerge(var2);
      }
   }

   private void removeMethod(ExecutableElement var1) {
      MethodHandle var2 = null;

      for (MethodHandle var4 : this.methods) {
         if (var4.getElement() == var1) {
            var2 = var4;
         }
      }

      if (var2 != null) {
         this.methods.remove(var2);
      }
   }

   public void registerOverwrite(ExecutableElement var1, AnnotationHandle var2, boolean var3) {
      this.removeMethod(var1);
      this.overwrites.registerOverwrite(new AnnotatedMixinElementHandlerOverwrite.AnnotatedElementOverwrite(var1, var2, var3));
   }

   public void registerShadow(VariableElement var1, AnnotationHandle var2, boolean var3) {
      this.shadows.registerShadow(this.shadows.new AnnotatedElementShadowField(var1, var2, var3));
   }

   public void registerShadow(ExecutableElement var1, AnnotationHandle var2, boolean var3) {
      this.removeMethod(var1);
      this.shadows.registerShadow(this.shadows.new AnnotatedElementShadowMethod(var1, var2, var3));
   }

   public void registerInjector(ExecutableElement var1, AnnotationHandle var2, InjectorRemap var3) {
      this.removeMethod(var1);
      AnnotatedMixinElementHandlerInjector.AnnotatedElementInjector var4 = new AnnotatedMixinElementHandlerInjector.AnnotatedElementInjector(
         var1, var2, this, var3
      );
      this.injectors.registerInjector(var4);

      for (IAnnotationHandle var7 : var2.getAnnotationList("at")) {
         this.registerInjectionPoint(var1, var2, "at", (AnnotationHandle)var7, var3, "@At(%s)");
      }

      for (IAnnotationHandle var8 : var2.getAnnotationList("slice")) {
         String var9 = var8.getValue("id", "");
         String var10 = "slice";
         if (!Strings.isNullOrEmpty(var9)) {
            var10 = var10 + "." + var9;
         }

         SelectorAnnotationContext var11 = new SelectorAnnotationContext(var4, var8, var10);
         IAnnotationHandle var12 = var8.getAnnotation("from");
         if (var12 != null) {
            this.registerSliceInjectionPoint(var1, var2, "from", (AnnotationHandle)var12, var3, "@Slice[" + var9 + "](from=@At(%s))", var11);
         }

         IAnnotationHandle var13 = var8.getAnnotation("to");
         if (var13 != null) {
            this.registerSliceInjectionPoint(var1, var2, "to", (AnnotationHandle)var13, var3, "@Slice[" + var9 + "](to=@At(%s))", var11);
         }
      }
   }

   public void registerInjectionPoint(ExecutableElement var1, AnnotationHandle var2, String var3, AnnotationHandle var4, InjectorRemap var5, String var6) {
      this.injectors.registerInjectionPoint(new AnnotatedMixinElementHandlerInjector.AnnotatedElementInjectionPoint(var1, var2, this, var3, var4, var5), var6);
   }

   public void registerSliceInjectionPoint(
      ExecutableElement var1, AnnotationHandle var2, String var3, AnnotationHandle var4, InjectorRemap var5, String var6, ISelectorContext var7
   ) {
      this.injectors
         .registerInjectionPoint(new AnnotatedMixinElementHandlerInjector.AnnotatedElementSliceInjectionPoint(var1, var2, this, var3, var4, var5, var7), var6);
   }

   public void registerAccessor(ExecutableElement var1, AnnotationHandle var2, boolean var3) {
      this.removeMethod(var1);
      this.accessors.registerAccessor(new AnnotatedMixinElementHandlerAccessor.AnnotatedElementAccessor(var1, var2, this, var3));
   }

   public void registerInvoker(ExecutableElement var1, AnnotationHandle var2, boolean var3) {
      this.removeMethod(var1);
      this.accessors.registerAccessor(new AnnotatedMixinElementHandlerAccessor.AnnotatedElementInvoker(var1, var2, this, var3));
   }

   public void registerSoftImplements(AnnotationHandle var1) {
      this.softImplements.process(var1);
   }

   public ReferenceMapper getReferenceMapper() {
      return null;
   }

   @Override
   public String getClassName() {
      return this.getClassRef().replace('/', '.');
   }

   @Override
   public String getTargetClassName() {
      return this.primaryTarget.toString();
   }

   @Override
   public String getTargetClassRef() {
      return this.primaryTarget.getName();
   }

   @Override
   public IMixinInfo getMixin() {
      throw new UnsupportedOperationException("MixinInfo not available at compile time");
   }

   @Override
   public Extensions getExtensions() {
      throw new UnsupportedOperationException("Mixin Extensions not available at compile time");
   }

   @Override
   public boolean getOption(MixinEnvironment.Option var1) {
      throw new UnsupportedOperationException("Options not available at compile time");
   }

   @Override
   public int getPriority() {
      throw new UnsupportedOperationException("Priority not available at compile time");
   }

   @Override
   public IAnnotationHandle getAnnotation(Class<? extends Annotation> var1) {
      return AnnotationHandle.of(this.mixin, var1);
   }
}
