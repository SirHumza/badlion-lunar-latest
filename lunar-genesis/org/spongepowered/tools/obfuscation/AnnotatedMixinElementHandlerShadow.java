package org.spongepowered.tools.obfuscation;

import java.util.Locale;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.VariableElement;
import org.spongepowered.asm.obfuscation.mapping.IMapping;
import org.spongepowered.asm.obfuscation.mapping.common.MappingField;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.tools.obfuscation.interfaces.IMessagerEx;
import org.spongepowered.tools.obfuscation.interfaces.IMixinAnnotationProcessor;
import org.spongepowered.tools.obfuscation.interfaces.IObfuscationDataProvider;
import org.spongepowered.tools.obfuscation.mirror.AnnotationHandle;
import org.spongepowered.tools.obfuscation.mirror.TypeHandle;

class AnnotatedMixinElementHandlerShadow extends AnnotatedMixinElementHandler {
   AnnotatedMixinElementHandlerShadow(IMixinAnnotationProcessor var1, AnnotatedMixin var2) {
      super(var1, var2);
   }

   public void registerShadow(AnnotatedMixinElementHandlerShadow.AnnotatedElementShadow<?, ?> var1) {
      this.validateTarget(var1.getElement(), var1.getAnnotation(), var1.getName(), "@Shadow");
      if (var1.shouldRemap()) {
         for (TypeHandle var3 : this.mixin.getTargets()) {
            this.registerShadowForTarget(var1, var3);
         }
      }
   }

   private void registerShadowForTarget(AnnotatedMixinElementHandlerShadow.AnnotatedElementShadow<?, ?> var1, TypeHandle var2) {
      ObfuscationData var3 = var1.getObfuscationData(this.obf.getDataProvider(), var2);
      if (var3.isEmpty()) {
         String var8 = this.mixin.isMultiTarget() ? " in target " + var2 : "";
         IMessagerEx.MessageType var9 = var2.isSimulated()
            ? IMessagerEx.MessageType.NO_OBFDATA_FOR_SIMULATED_SHADOW
            : IMessagerEx.MessageType.NO_OBFDATA_FOR_SHADOW;
         var1.printMessage(this.ap, var9, "Unable to locate obfuscation mapping" + var8 + " for @Shadow " + var1);
      } else {
         for (ObfuscationType var5 : var3) {
            try {
               var1.addMapping(var5, (IMapping<?>)var3.get(var5));
            } catch (Mappings.MappingConflictException var7) {
               var1.printMessage(
                  this.ap,
                  IMessagerEx.MessageType.SHADOW_MAPPING_CONFLICT,
                  "Mapping conflict for @Shadow "
                     + var1
                     + ": "
                     + var7.getNew().getSimpleName()
                     + " for target "
                     + var2
                     + " conflicts with existing mapping "
                     + var7.getOld().getSimpleName()
               );
            }
         }
      }
   }

   abstract static class AnnotatedElementShadow<E extends Element, M extends IMapping<M>> extends AnnotatedMixinElementHandler.AnnotatedElement<E> {
      private final boolean shouldRemap;
      private final AnnotatedMixinElementHandler.ShadowElementName name;
      private final IMapping.Type type;

      protected AnnotatedElementShadow(E var1, AnnotationHandle var2, boolean var3, IMapping.Type var4) {
         super((E)var1, var2);
         this.shouldRemap = var3;
         this.name = new AnnotatedMixinElementHandler.ShadowElementName(var1, var2);
         this.type = var4;
      }

      public boolean shouldRemap() {
         return this.shouldRemap;
      }

      public AnnotatedMixinElementHandler.ShadowElementName getName() {
         return this.name;
      }

      public IMapping.Type getElementType() {
         return this.type;
      }

      @Override
      public String toString() {
         return this.getElementType().name().toLowerCase(Locale.ROOT);
      }

      public AnnotatedMixinElementHandler.ShadowElementName setObfuscatedName(IMapping<?> var1) {
         return this.setObfuscatedName(var1.getSimpleName());
      }

      public AnnotatedMixinElementHandler.ShadowElementName setObfuscatedName(String var1) {
         return this.getName().setObfuscatedName(var1);
      }

      public ObfuscationData<M> getObfuscationData(IObfuscationDataProvider var1, TypeHandle var2) {
         return var1.getObfEntry(this.getMapping(var2, this.getName().toString(), this.getDesc()));
      }

      public abstract M getMapping(TypeHandle var1, String var2, String var3);

      public abstract void addMapping(ObfuscationType var1, IMapping<?> var2);
   }

   class AnnotatedElementShadowField extends AnnotatedMixinElementHandlerShadow.AnnotatedElementShadow<VariableElement, MappingField> {
      public AnnotatedElementShadowField(VariableElement var2, AnnotationHandle var3, boolean var4) {
         super(var2, var3, var4, IMapping.Type.FIELD);
      }

      public MappingField getMapping(TypeHandle var1, String var2, String var3) {
         return new MappingField(var1.getName(), var2, var3);
      }

      @Override
      public void addMapping(ObfuscationType var1, IMapping<?> var2) {
         AnnotatedMixinElementHandlerShadow.this.addFieldMapping(var1, this.setObfuscatedName(var2), this.getDesc(), var2.getDesc());
      }
   }

   class AnnotatedElementShadowMethod extends AnnotatedMixinElementHandlerShadow.AnnotatedElementShadow<ExecutableElement, MappingMethod> {
      public AnnotatedElementShadowMethod(ExecutableElement var2, AnnotationHandle var3, boolean var4) {
         super(var2, var3, var4, IMapping.Type.METHOD);
      }

      @Override
      public boolean shouldRemap() {
         return super.shouldRemap() && this.element.getKind() != ElementKind.CONSTRUCTOR;
      }

      public MappingMethod getMapping(TypeHandle var1, String var2, String var3) {
         return var1.getMappingMethod(var2, var3);
      }

      @Override
      public void addMapping(ObfuscationType var1, IMapping<?> var2) {
         AnnotatedMixinElementHandlerShadow.this.addMethodMapping(var1, this.setObfuscatedName(var2), this.getDesc(), var2.getDesc());
      }
   }
}
