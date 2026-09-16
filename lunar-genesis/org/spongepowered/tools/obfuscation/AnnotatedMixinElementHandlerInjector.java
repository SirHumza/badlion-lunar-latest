package org.spongepowered.tools.obfuscation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.VariableElement;
import org.spongepowered.asm.mixin.injection.Coerce;
import org.spongepowered.asm.mixin.injection.selectors.ISelectorContext;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelector;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorByName;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorConstructor;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorRemappable;
import org.spongepowered.asm.mixin.injection.selectors.InvalidSelectorException;
import org.spongepowered.asm.mixin.injection.selectors.TargetSelector;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.asm.util.asm.IAnnotationHandle;
import org.spongepowered.tools.obfuscation.ext.SpecialPackages;
import org.spongepowered.tools.obfuscation.interfaces.IMessagerEx;
import org.spongepowered.tools.obfuscation.interfaces.IMixinAnnotationProcessor;
import org.spongepowered.tools.obfuscation.interfaces.IReferenceManager;
import org.spongepowered.tools.obfuscation.mirror.AnnotationHandle;
import org.spongepowered.tools.obfuscation.mirror.TypeHandle;
import org.spongepowered.tools.obfuscation.struct.InjectorRemap;

class AnnotatedMixinElementHandlerInjector extends AnnotatedMixinElementHandler {
   AnnotatedMixinElementHandlerInjector(IMixinAnnotationProcessor var1, AnnotatedMixin var2) {
      super(var1, var2);
   }

   public void registerInjector(AnnotatedMixinElementHandlerInjector.AnnotatedElementInjector var1) {
      for (String var3 : var1.getAnnotation().getList("method")) {
         this.registerInjectorTarget(var1, var3, TargetSelector.parse(var3, var1), var1 + ".method=\"" + var3 + "\"");
      }

      for (IAnnotationHandle var6 : var1.getAnnotation().getAnnotationList("target")) {
         String var4 = String.format("%s.target=@Desc(id = \"%s\")", var1, var6.getValue("id", ""));
         this.registerInjectorTarget(var1, null, TargetSelector.parse(var6, var1), var4);
      }
   }

   private void registerInjectorTarget(AnnotatedMixinElementHandlerInjector.AnnotatedElementInjector var1, String var2, ITargetSelector var3, String var4) {
      try {
         var3.validate();
      } catch (InvalidSelectorException var8) {
         var1.printMessage(this.ap, IMessagerEx.MessageType.TARGET_SELECTOR_VALIDATION, var8.getMessage());
      }

      if (var3 instanceof ITargetSelectorByName) {
         ITargetSelectorByName var5 = (ITargetSelectorByName)var3;
         if (var5.getName() != null) {
            if (var5.getDesc() != null) {
               this.validateReferencedTarget(var1, var2, var5, var4);
            }

            if (var3 instanceof ITargetSelectorRemappable && var1.shouldRemap()) {
               for (TypeHandle var7 : this.mixin.getTargets()) {
                  if (!this.registerInjector(var1, var2, (ITargetSelectorRemappable)var5, var7)) {
                     break;
                  }
               }
            }
         }
      }
   }

   private boolean registerInjector(
      AnnotatedMixinElementHandlerInjector.AnnotatedElementInjector var1, String var2, ITargetSelectorRemappable var3, TypeHandle var4
   ) {
      String var5 = var4.findDescriptor(var3);
      if (var5 == null) {
         IMessagerEx.MessageType var17 = this.mixin.isMultiTarget()
            ? IMessagerEx.MessageType.MISSING_INJECTOR_DESC_MULTITARGET
            : IMessagerEx.MessageType.MISSING_INJECTOR_DESC_SINGLETARGET;
         if (var4.isSimulated()) {
            var1.printMessage(
               this.ap, IMessagerEx.MessageType.MISSING_INJECTOR_DESC_SIMULATED, var1 + " target '" + var2 + "' in @Pseudo mixin will not be obfuscated"
            );
         } else if (var4.isImaginary()) {
            var1.printMessage(this.ap, var17, var1 + " target requires method signature because enclosing type information for " + var4 + " is unavailable");
         } else if (!var3.isInitialiser()) {
            var1.printMessage(this.ap, var17, "Unable to determine descriptor for " + var1 + " target method");
         }

         return true;
      } else {
         String var6 = var1 + " target " + var3.getName();
         MappingMethod var7 = var4.getMappingMethod(var3.getName(), var5);
         ObfuscationData var8 = this.obf.getDataProvider().getObfMethod(var7);
         if (var8.isEmpty()) {
            if (!var4.isSimulated()) {
               if (var3.isClassInitialiser()) {
                  return true;
               }

               var1.addMessage(
                  var3.isConstructor() ? IMessagerEx.MessageType.NO_OBFDATA_FOR_CTOR : IMessagerEx.MessageType.NO_OBFDATA_FOR_TARGET,
                  "Unable to locate obfuscation mapping for " + var6,
                  var1.getElement(),
                  var1.getAnnotation()
               );
               return false;
            }

            var8 = this.obf.getDataProvider().getRemappedMethod(var7);
         }

         IReferenceManager var9 = this.obf.getReferenceManager();

         try {
            if (var3.getOwner() == null && this.mixin.isMultiTarget() || var4.isSimulated()) {
               var8 = AnnotatedMixinElementHandler.stripOwnerData(var8);
            }

            var9.addMethodMapping(this.classRef, var2, var8);
         } catch (ReferenceManager.ReferenceConflictException var16) {
            String var11 = this.mixin.isMultiTarget() ? "Multi-target" : "Target";
            if (var1.hasCoerceArgument() && var3.getOwner() == null && var3.getDesc() == null) {
               ITargetSelector var12 = TargetSelector.parse(var16.getOld(), var1);
               ITargetSelector var13 = TargetSelector.parse(var16.getNew(), var1);
               String var14 = var12 instanceof ITargetSelectorByName ? ((ITargetSelectorByName)var12).getName() : var12.toString();
               String var15 = var13 instanceof ITargetSelectorByName ? ((ITargetSelectorByName)var13).getName() : var13.toString();
               if (var14 != null && var14.equals(var15)) {
                  var8 = AnnotatedMixinElementHandler.stripDescriptors(var8);
                  var9.setAllowConflicts(true);
                  var9.addMethodMapping(this.classRef, var2, var8);
                  var9.setAllowConflicts(false);
                  var1.printMessage(
                     this.ap,
                     IMessagerEx.MessageType.BARE_REFERENCE,
                     "Coerced " + var11 + " reference has conflicting descriptors for " + var6 + ": Storing bare references " + var8.values() + " in refMap"
                  );
                  return true;
               }
            }

            var1.printMessage(
               this.ap,
               IMessagerEx.MessageType.INJECTOR_MAPPING_CONFLICT,
               var11 + " reference conflict for " + var6 + ": " + var2 + " -> " + var16.getNew() + " previously defined as " + var16.getOld()
            );
         }

         return true;
      }
   }

   public void registerInjectionPoint(AnnotatedMixinElementHandlerInjector.AnnotatedElementInjectionPoint var1, String var2) {
      ITargetSelector var3 = null;
      String var4 = var1.getAt().getValue("target");
      if (var4 != null) {
         var3 = TargetSelector.parse(var4, var1);

         try {
            var3.validate();
         } catch (InvalidSelectorException var10) {
            this.ap
               .printMessage(
                  IMessagerEx.MessageType.TARGET_SELECTOR_VALIDATION,
                  var10.getMessage(),
                  var1.getElement(),
                  var1.getAtErrorElement(this.ap.getCompilerEnvironment())
               );
         }
      }

      String var5 = InjectionPointData.parseType(var1.getAt().getValue("value", ""));
      ITargetSelector var6 = null;
      String var7 = var1.getAtArg("class");
      if ("NEW".equals(var5) && var7 != null) {
         var6 = TargetSelector.parse(var7, var1);

         try {
            var6.validate();
         } catch (InvalidSelectorException var9) {
            this.ap
               .printMessage(
                  IMessagerEx.MessageType.TARGET_SELECTOR_VALIDATION,
                  var9.getMessage(),
                  var1.getElement(),
                  var1.getAtErrorElement(this.ap.getCompilerEnvironment())
               );
         }
      }

      if (var1.shouldRemap()) {
         if ("NEW".equals(var5)) {
            this.remapNewTarget(String.format(var2, var5 + ".<target>"), var4, var3, var1);
            this.remapNewTarget(String.format(var2, var5 + ".args[class]"), var7, var6, var1);
         } else {
            this.remapReference(String.format(var2, var5 + ".<target>"), var4, var3, var1);
         }
      }
   }

   protected final void remapNewTarget(String var1, String var2, ITargetSelector var3, AnnotatedMixinElementHandlerInjector.AnnotatedElementInjectionPoint var4) {
      if (var3 instanceof ITargetSelectorConstructor) {
         ITargetSelectorConstructor var5 = (ITargetSelectorConstructor)var3;
         String var6 = var5.toCtorType();
         if (var6 != null) {
            String var7 = var5.toCtorDesc();
            MappingMethod var8 = new MappingMethod(var6, ".", var7 != null ? var7 : "()V");
            ObfuscationData var9 = this.obf.getDataProvider().getRemappedMethod(var8);
            if (var9.isEmpty() && !SpecialPackages.isExcludedPackage(var5.toCtorType())) {
               this.ap
                  .printMessage(
                     IMessagerEx.MessageType.NO_OBFDATA_FOR_CLASS,
                     "Unable to locate class mapping for " + var1 + " '" + var6 + "'",
                     var4.getElement(),
                     var4.getAnnotation().asMirror(),
                     SuppressedBy.MAPPING
                  );
               return;
            }

            ObfuscationData var10 = new ObfuscationData();

            for (ObfuscationType var12 : var9) {
               MappingMethod var13 = (MappingMethod)var9.get(var12);
               if (var7 == null) {
                  var10.put(var12, var13.getOwner());
               } else {
                  var10.put(var12, var13.getDesc().replace(")V", ")L" + var13.getOwner() + ";"));
               }
            }

            this.obf.getReferenceManager().addClassMapping(this.classRef, var2, var10);
         }

         var4.notifyRemapped();
      }
   }

   protected final void remapReference(String var1, String var2, ITargetSelector var3, AnnotatedMixinElementHandlerInjector.AnnotatedElementInjectionPoint var4) {
      if (var3 instanceof ITargetSelectorRemappable) {
         ITargetSelectorRemappable var5 = (ITargetSelectorRemappable)var3;
         AnnotationMirror var6 = var4.getAtErrorElement(this.ap.getCompilerEnvironment());
         if (!var5.isFullyQualified()) {
            String var10 = var5.getOwner() == null ? (var5.getDesc() == null ? "owner and descriptor" : "owner") : "descriptor";
            this.ap
               .printMessage(
                  IMessagerEx.MessageType.INJECTOR_TARGET_NOT_FULLY_QUALIFIED, var1 + " is not fully qualified, missing " + var10, var4.getElement(), var6
               );
         } else {
            try {
               if (var5.isField()) {
                  ObfuscationData var7 = this.obf.getDataProvider().getObfFieldRecursive(var5);
                  if (var7.isEmpty()) {
                     if (var5.getOwner() == null || !SpecialPackages.isExcludedPackage(var5.getOwner())) {
                        this.ap
                           .printMessage(
                              IMessagerEx.MessageType.NO_OBFDATA_FOR_FIELD,
                              "Unable to locate field mapping for " + var1 + " '" + var2 + "'",
                              var4.getElement(),
                              var6,
                              SuppressedBy.MAPPING
                           );
                     }

                     return;
                  }

                  this.obf.getReferenceManager().addFieldMapping(this.classRef, var2, var5, var7);
               } else {
                  ObfuscationData var9 = this.obf.getDataProvider().getObfMethodRecursive(var5);
                  if (var9.isEmpty()) {
                     if (var5.getOwner() == null || !SpecialPackages.isExcludedPackage(var5.getOwner())) {
                        this.ap
                           .printMessage(
                              IMessagerEx.MessageType.NO_OBFDATA_FOR_METHOD,
                              "Unable to locate method mapping for " + var1 + " '" + var2 + "'",
                              var4.getElement(),
                              var6,
                              SuppressedBy.MAPPING
                           );
                     }

                     return;
                  }

                  this.obf.getReferenceManager().addMethodMapping(this.classRef, var2, var5, var9);
               }
            } catch (ReferenceManager.ReferenceConflictException var8) {
               this.ap
                  .printMessage(
                     IMessagerEx.MessageType.INJECTOR_MAPPING_CONFLICT,
                     "Unexpected reference conflict for " + var1 + ": " + var2 + " -> " + var8.getNew() + " previously defined as " + var8.getOld(),
                     var4.getElement(),
                     var6
                  );
               return;
            }

            var4.notifyRemapped();
         }
      }
   }

   static class AnnotatedElementInjectionPoint extends AnnotatedMixinElementHandler.AnnotatedElementExecutable {
      private final AnnotationHandle at;
      private Map<String, String> args;
      private final InjectorRemap state;

      public AnnotatedElementInjectionPoint(
         ExecutableElement var1, AnnotationHandle var2, IMixinContext var3, String var4, AnnotationHandle var5, InjectorRemap var6
      ) {
         super(var1, var2, var3, var4);
         this.at = var5;
         this.state = var6;
      }

      public boolean shouldRemap() {
         return this.at.getBoolean("remap", this.state.shouldRemap());
      }

      public AnnotationHandle getAt() {
         return this.at;
      }

      public AnnotationMirror getAtErrorElement(IMixinAnnotationProcessor.CompilerEnvironment var1) {
         return (var1.isDevelopmentEnvironment() ? this.getAt() : this.getAnnotation()).asMirror();
      }

      @Override
      public IAnnotationHandle getSelectorAnnotation() {
         return this.getAt();
      }

      public String getAtArg(String var1) {
         if (this.args == null) {
            this.args = new HashMap<>();

            for (String var3 : this.at.getList("args")) {
               if (var3 != null) {
                  int var4 = var3.indexOf(61);
                  if (var4 > -1) {
                     this.args.put(var3.substring(0, var4), var3.substring(var4 + 1));
                  } else {
                     this.args.put(var3, "");
                  }
               }
            }
         }

         return this.args.get(var1);
      }

      public void notifyRemapped() {
         this.state.notifyRemapped();
      }
   }

   static class AnnotatedElementInjector extends AnnotatedMixinElementHandler.AnnotatedElementExecutable {
      private final InjectorRemap state;

      public AnnotatedElementInjector(ExecutableElement var1, AnnotationHandle var2, IMixinContext var3, InjectorRemap var4) {
         super(var1, var2, var3, "method");
         this.state = var4;
      }

      public boolean shouldRemap() {
         return this.state.shouldRemap();
      }

      public boolean hasCoerceArgument() {
         if (!this.annotation.toString().equals("@Inject")) {
            return false;
         } else {
            Iterator var1 = this.element.getParameters().iterator();
            if (var1.hasNext()) {
               VariableElement var2 = (VariableElement)var1.next();
               return AnnotationHandle.of(var2, Coerce.class).exists();
            } else {
               return false;
            }
         }
      }

      public void addMessage(IMessagerEx.MessageType var1, CharSequence var2, Element var3, AnnotationHandle var4) {
         this.state.addMessage(var1, var2, var3, var4);
      }

      @Override
      public String toString() {
         return this.getAnnotation().toString();
      }
   }

   static class AnnotatedElementSliceInjectionPoint extends AnnotatedMixinElementHandlerInjector.AnnotatedElementInjectionPoint {
      private final ISelectorContext parentContext;

      public AnnotatedElementSliceInjectionPoint(
         ExecutableElement var1, AnnotationHandle var2, IMixinContext var3, String var4, AnnotationHandle var5, InjectorRemap var6, ISelectorContext var7
      ) {
         super(var1, var2, var3, var4, var5, var6);
         this.parentContext = var7;
      }

      @Override
      public ISelectorContext getParent() {
         return this.parentContext;
      }
   }
}
