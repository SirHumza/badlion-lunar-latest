package org.spongepowered.tools.obfuscation;

import java.lang.annotation.Annotation;
import java.util.List;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.VariableElement;
import org.spongepowered.asm.mixin.injection.selectors.ISelectorContext;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelector;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorByName;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.obfuscation.mapping.IMapping;
import org.spongepowered.asm.obfuscation.mapping.common.MappingField;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.ConstraintParser;
import org.spongepowered.asm.util.asm.IAnnotatedElement;
import org.spongepowered.asm.util.asm.IAnnotationHandle;
import org.spongepowered.asm.util.throwables.ConstraintViolationException;
import org.spongepowered.asm.util.throwables.InvalidConstraintException;
import org.spongepowered.tools.obfuscation.interfaces.IMessagerEx;
import org.spongepowered.tools.obfuscation.interfaces.IMixinAnnotationProcessor;
import org.spongepowered.tools.obfuscation.interfaces.IObfuscationManager;
import org.spongepowered.tools.obfuscation.mapping.IMappingConsumer;
import org.spongepowered.tools.obfuscation.mirror.AnnotationHandle;
import org.spongepowered.tools.obfuscation.mirror.FieldHandle;
import org.spongepowered.tools.obfuscation.mirror.MethodHandle;
import org.spongepowered.tools.obfuscation.mirror.TypeHandle;
import org.spongepowered.tools.obfuscation.mirror.TypeUtils;

abstract class AnnotatedMixinElementHandler {
   protected final AnnotatedMixin mixin;
   protected final String classRef;
   protected final IMixinAnnotationProcessor ap;
   protected final IObfuscationManager obf;
   private IMappingConsumer mappings;

   AnnotatedMixinElementHandler(IMixinAnnotationProcessor var1, AnnotatedMixin var2) {
      this.ap = var1;
      this.mixin = var2;
      this.classRef = var2.getClassRef();
      this.obf = var1.getObfuscationManager();
   }

   private IMappingConsumer getMappings() {
      if (this.mappings == null) {
         IMappingConsumer var1 = this.mixin.getMappings();
         if (var1 instanceof Mappings) {
            this.mappings = ((Mappings)var1).asUnique();
         } else {
            this.mappings = var1;
         }
      }

      return this.mappings;
   }

   protected final void addFieldMapping(ObfuscationType var1, AnnotatedMixinElementHandler.ShadowElementName var2, String var3, String var4) {
      this.addFieldMapping(var1, var2.name(), var2.obfuscated(), var3, var4);
   }

   protected final void addFieldMapping(ObfuscationType var1, String var2, String var3, String var4, String var5) {
      MappingField var6 = new MappingField(this.classRef, var2, var4);
      MappingField var7 = new MappingField(this.classRef, var3, var5);
      this.getMappings().addFieldMapping(var1, var6, var7);
   }

   protected final void addMethodMappings(String var1, String var2, ObfuscationData<MappingMethod> var3) {
      for (ObfuscationType var5 : var3) {
         MappingMethod var6 = (MappingMethod)var3.get(var5);
         this.addMethodMapping(var5, var1, var6.getSimpleName(), var2, var6.getDesc());
      }
   }

   protected final void addMethodMapping(ObfuscationType var1, AnnotatedMixinElementHandler.ShadowElementName var2, String var3, String var4) {
      this.addMethodMapping(var1, var2.name(), var2.obfuscated(), var3, var4);
   }

   protected final void addMethodMapping(ObfuscationType var1, String var2, String var3, String var4, String var5) {
      MappingMethod var6 = new MappingMethod(this.classRef, var2, var4);
      MappingMethod var7 = new MappingMethod(this.classRef, var3, var5);
      this.getMappings().addMethodMapping(var1, var6, var7);
   }

   protected final void checkConstraints(ExecutableElement var1, AnnotationHandle var2) {
      try {
         ConstraintParser.Constraint var3 = ConstraintParser.parse(var2.getValue("constraints"));

         try {
            var3.check(this.ap.getTokenProvider());
         } catch (ConstraintViolationException var5) {
            this.ap.printMessage(IMessagerEx.MessageType.CONSTRAINT_VIOLATION, var5.getMessage(), var1, var2.asMirror());
         }
      } catch (InvalidConstraintException var6) {
         this.ap.printMessage(IMessagerEx.MessageType.INVALID_CONSTRAINT, var6.getMessage(), var1, var2.asMirror(), SuppressedBy.CONSTRAINTS);
      }
   }

   protected final void validateTarget(Element var1, AnnotationHandle var2, AnnotatedMixinElementHandler.AliasedElementName var3, String var4) {
      if (var1 instanceof ExecutableElement) {
         this.validateTargetMethod((ExecutableElement)var1, var2, var3, var4, false, false);
      } else if (var1 instanceof VariableElement) {
         this.validateTargetField((VariableElement)var1, var2, var3, var4);
      }
   }

   protected final void validateTargetMethod(
      ExecutableElement var1, AnnotationHandle var2, AnnotatedMixinElementHandler.AliasedElementName var3, String var4, boolean var5, boolean var6
   ) {
      String var7 = TypeUtils.getJavaSignature(var1);

      for (TypeHandle var9 : this.mixin.getTargets()) {
         if (!var9.isImaginary()) {
            MethodHandle var10 = var9.findMethod(var1);
            if (var10 == null && var3.hasPrefix()) {
               var10 = var9.findMethod(var3.baseName(), var7);
            }

            if (var10 == null && var3.hasAliases()) {
               for (String var12 : var3.getAliases()) {
                  if ((var10 = var9.findMethod(var12, var7)) != null) {
                     break;
                  }
               }
            }

            if (var10 != null) {
               if (var5) {
                  this.validateMethodVisibility(var1, var2, var4, var9, var10);
               }
            } else if (!var6) {
               this.printMessage(
                  IMessagerEx.MessageType.TARGET_ELEMENT_NOT_FOUND, "Cannot find target for " + var4 + " method in " + var9, var1, var2, SuppressedBy.TARGET
               );
            }
         }
      }
   }

   private void validateMethodVisibility(ExecutableElement var1, AnnotationHandle var2, String var3, TypeHandle var4, MethodHandle var5) {
      Bytecode.Visibility var6 = var5.getVisibility();
      if (var6 != null) {
         Bytecode.Visibility var7 = TypeUtils.getVisibility(var1);
         String var8 = "visibility of " + var6 + " method in " + var4;
         if (var6.ordinal() > var7.ordinal()) {
            this.printMessage(
               IMessagerEx.MessageType.METHOD_VISIBILITY, var7 + " " + var3 + " method cannot reduce " + var8, var1, var2, SuppressedBy.VISIBILITY
            );
         } else if (var6 == Bytecode.Visibility.PRIVATE && var7.ordinal() > var6.ordinal()) {
            this.printMessage(
               IMessagerEx.MessageType.METHOD_VISIBILITY, var7 + " " + var3 + " method will upgrade " + var8, var1, var2, SuppressedBy.VISIBILITY
            );
         }
      }
   }

   protected final void validateTargetField(VariableElement var1, AnnotationHandle var2, AnnotatedMixinElementHandler.AliasedElementName var3, String var4) {
      String var5 = var1.asType().toString();

      for (TypeHandle var7 : this.mixin.getTargets()) {
         if (!var7.isImaginary()) {
            FieldHandle var8 = var7.findField(var1);
            if (var8 == null) {
               for (String var11 : var3.getAliases()) {
                  if ((var8 = var7.findField(var11, var5)) != null) {
                     break;
                  }
               }

               if (var8 == null) {
                  this.ap
                     .printMessage(
                        IMessagerEx.MessageType.TARGET_ELEMENT_NOT_FOUND,
                        "Cannot find target for " + var4 + " field in " + var7,
                        var1,
                        var2.asMirror(),
                        SuppressedBy.TARGET
                     );
               }
            }
         }
      }
   }

   protected final void validateReferencedTarget(AnnotatedMixinElementHandler.AnnotatedElementExecutable var1, String var2, ITargetSelector var3, String var4) {
      if (var3 instanceof ITargetSelectorByName) {
         ITargetSelectorByName var5 = (ITargetSelectorByName)var3;
         String var6 = var5.toDescriptor();

         for (TypeHandle var8 : this.mixin.getTargets()) {
            if (!var8.isImaginary()) {
               MethodHandle var9 = var8.findMethod(var5.getName(), var6);
               if (var9 == null) {
                  this.ap
                     .printMessage(
                        IMessagerEx.MessageType.TARGET_ELEMENT_NOT_FOUND,
                        "Cannot find target method \"" + var5.getName() + var5.getDesc() + "\" for " + var4 + " in " + var8,
                        var1.getElement(),
                        var1.getAnnotation().asMirror(),
                        SuppressedBy.TARGET
                     );
               }
            }
         }
      }
   }

   private void printMessage(IMessagerEx.MessageType var1, String var2, Element var3, AnnotationHandle var4, SuppressedBy var5) {
      if (var4 == null) {
         this.ap.printMessage(var1, var2, var3, var5);
      } else {
         this.ap.printMessage(var1, var2, var3, var4.asMirror(), var5);
      }
   }

   protected static <T extends IMapping<T>> ObfuscationData<T> stripOwnerData(ObfuscationData<T> var0) {
      ObfuscationData var1 = new ObfuscationData();

      for (ObfuscationType var3 : var0) {
         IMapping var4 = (IMapping)var0.get(var3);
         var1.put(var3, (IMapping)var4.move(null));
      }

      return var1;
   }

   protected static <T extends IMapping<T>> ObfuscationData<T> stripDescriptors(ObfuscationData<T> var0) {
      ObfuscationData var1 = new ObfuscationData();

      for (ObfuscationType var3 : var0) {
         IMapping var4 = (IMapping)var0.get(var3);
         var1.put(var3, (IMapping)var4.transform(null));
      }

      return var1;
   }

   static class AliasedElementName {
      protected final String originalName;
      private final List<String> aliases;

      public AliasedElementName(Element var1, AnnotationHandle var2) {
         this.originalName = var1.getSimpleName().toString();
         this.aliases = var2.getList("aliases");
      }

      public AliasedElementName(MethodHandle var1, AnnotationHandle var2) {
         this.originalName = var1.getName();
         this.aliases = var2.getList("aliases");
      }

      public boolean hasAliases() {
         return this.aliases.size() > 0;
      }

      public List<String> getAliases() {
         return this.aliases;
      }

      public String baseName() {
         return this.originalName;
      }

      public boolean hasPrefix() {
         return false;
      }
   }

   abstract static class AnnotatedElement<E extends Element> implements IAnnotatedElement {
      protected final E element;
      protected final AnnotationHandle annotation;
      private final String desc;

      public AnnotatedElement(E var1, AnnotationHandle var2) {
         this.element = (E)var1;
         this.annotation = var2;
         this.desc = TypeUtils.getDescriptor(var1);
      }

      public E getElement() {
         return this.element;
      }

      public AnnotationHandle getAnnotation() {
         return this.annotation;
      }

      public String getSimpleName() {
         return this.getElement().getSimpleName().toString();
      }

      public String getDesc() {
         return this.desc;
      }

      public final void printMessage(IMessagerEx var1, IMessagerEx.MessageType var2, CharSequence var3) {
         var1.printMessage(var2, var3, this.element, this.annotation.asMirror());
      }

      @Override
      public IAnnotationHandle getAnnotation(Class<? extends Annotation> var1) {
         return AnnotationHandle.of(this.element, var1);
      }
   }

   abstract static class AnnotatedElementExecutable extends AnnotatedMixinElementHandler.AnnotatedElement<ExecutableElement> implements ISelectorContext {
      private final IMixinContext context;
      private final String selectorCoordinate;

      public AnnotatedElementExecutable(ExecutableElement var1, AnnotationHandle var2, IMixinContext var3, String var4) {
         super(var1, var2);
         this.context = var3;
         this.selectorCoordinate = var4;
      }

      @Override
      public ISelectorContext getParent() {
         return null;
      }

      @Override
      public IMixinContext getMixin() {
         return this.context;
      }

      @Override
      public Object getMethod() {
         return new IAnnotatedElement() {
            @Override
            public IAnnotationHandle getAnnotation(Class<? extends Annotation> var1) {
               return AnnotationHandle.of(AnnotatedElementExecutable.this.getElement(), var1);
            }

            @Override
            public String toString() {
               return AnnotatedElementExecutable.this.getElement().getSimpleName().toString();
            }
         };
      }

      @Override
      public IAnnotationHandle getSelectorAnnotation() {
         return this.getAnnotation();
      }

      @Override
      public String getSelectorCoordinate(boolean var1) {
         return var1 ? this.selectorCoordinate : TypeUtils.getName(this.element);
      }

      @Override
      public String remap(String var1) {
         return var1;
      }

      @Override
      public String getElementDescription() {
         return String.format("%s annotation on %s", this.getAnnotation(), this);
      }

      @Override
      public String toString() {
         return TypeUtils.getName(this.element);
      }
   }

   static class ShadowElementName extends AnnotatedMixinElementHandler.AliasedElementName {
      private final boolean hasPrefix;
      private final String prefix;
      private final String baseName;
      private String obfuscated;

      ShadowElementName(Element var1, AnnotationHandle var2) {
         super(var1, var2);
         this.prefix = var2.getValue("prefix", "shadow$");
         boolean var3 = false;
         String var4 = this.originalName;
         if (var4.startsWith(this.prefix)) {
            var3 = true;
            var4 = var4.substring(this.prefix.length());
         }

         this.hasPrefix = var3;
         this.obfuscated = this.baseName = var4;
      }

      @Override
      public String toString() {
         return this.baseName;
      }

      @Override
      public String baseName() {
         return this.baseName;
      }

      public AnnotatedMixinElementHandler.ShadowElementName setObfuscatedName(String var1) {
         this.obfuscated = var1;
         return this;
      }

      @Override
      public boolean hasPrefix() {
         return this.hasPrefix;
      }

      public String name() {
         return this.prefix(this.baseName);
      }

      public String obfuscated() {
         return this.prefix(this.obfuscated);
      }

      public String prefix(String var1) {
         return this.hasPrefix ? this.prefix + var1 : var1;
      }
   }
}
