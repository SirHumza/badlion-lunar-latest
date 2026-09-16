package org.spongepowered.tools.obfuscation;

import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import org.spongepowered.asm.mixin.gen.AccessorInfo;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorRemappable;
import org.spongepowered.asm.mixin.injection.struct.MemberInfo;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.include.com.google.common.base.Strings;
import org.spongepowered.tools.obfuscation.interfaces.IMessagerEx;
import org.spongepowered.tools.obfuscation.interfaces.IMixinAnnotationProcessor;
import org.spongepowered.tools.obfuscation.mirror.AnnotationHandle;
import org.spongepowered.tools.obfuscation.mirror.FieldHandle;
import org.spongepowered.tools.obfuscation.mirror.MethodHandle;
import org.spongepowered.tools.obfuscation.mirror.TypeHandle;
import org.spongepowered.tools.obfuscation.mirror.TypeUtils;

class AnnotatedMixinElementHandlerAccessor extends AnnotatedMixinElementHandler {
   public AnnotatedMixinElementHandlerAccessor(IMixinAnnotationProcessor var1, AnnotatedMixin var2) {
      super(var1, var2);
   }

   public void registerAccessor(AnnotatedMixinElementHandlerAccessor.AnnotatedElementAccessor var1) {
      if (var1.getAccessorType() == null) {
         var1.printMessage(this.ap, IMessagerEx.MessageType.ACCESSOR_TYPE_UNSUPPORTED, "Unsupported accessor type");
      } else {
         String var2 = this.getAccessorTargetName(var1);
         if (var2 == null) {
            var1.printMessage(this.ap, IMessagerEx.MessageType.ACCESSOR_NAME_UNRESOLVED, "Cannot inflect accessor target name");
         } else {
            var1.setTargetName(var2);

            for (TypeHandle var4 : this.mixin.getTargets()) {
               try {
                  var1.attach(var4);
               } catch (Exception var6) {
                  var1.printMessage(this.ap, IMessagerEx.MessageType.ACCESSOR_ATTACH_ERROR, var6.getMessage());
                  continue;
               }

               if (var1.getAccessorType() == AccessorInfo.AccessorType.OBJECT_FACTORY) {
                  this.registerFactoryForTarget((AnnotatedMixinElementHandlerAccessor.AnnotatedElementInvoker)var1, var4);
               } else if (var1.getAccessorType() == AccessorInfo.AccessorType.METHOD_PROXY) {
                  this.registerInvokerForTarget((AnnotatedMixinElementHandlerAccessor.AnnotatedElementInvoker)var1, var4);
               } else {
                  this.registerAccessorForTarget(var1, var4);
               }
            }
         }
      }
   }

   private void registerAccessorForTarget(AnnotatedMixinElementHandlerAccessor.AnnotatedElementAccessor var1, TypeHandle var2) {
      FieldHandle var3 = var2.findField(var1.getTargetName(), var1.getTargetTypeName(), false);
      if (var3 == null) {
         if (!var2.isImaginary()) {
            var1.printMessage(this.ap, IMessagerEx.MessageType.ACCESSOR_TARGET_NOT_FOUND, "Could not locate @Accessor target " + var1 + " in target " + var2);
            return;
         }

         var3 = new FieldHandle(var2.getName(), var1.getTargetName(), var1.getTargetDesc());
      }

      if (var1.shouldRemap()) {
         ObfuscationData var4 = this.obf.getDataProvider().getObfField(var3.asMapping(false).move(var2.getName()));
         if (var4.isEmpty()) {
            String var5 = this.mixin.isMultiTarget() ? " in target " + var2 : "";
            var1.printMessage(
               this.ap, IMessagerEx.MessageType.NO_OBFDATA_FOR_ACCESSOR, "Unable to locate obfuscation mapping" + var5 + " for @Accessor target " + var1
            );
         } else {
            var4 = AnnotatedMixinElementHandler.stripOwnerData(var4);

            try {
               this.obf.getReferenceManager().addFieldMapping(this.mixin.getClassRef(), var1.getTargetName(), var1.getContext(), var4);
            } catch (ReferenceManager.ReferenceConflictException var6) {
               var1.printMessage(
                  this.ap,
                  IMessagerEx.MessageType.ACCESSOR_MAPPING_CONFLICT,
                  "Mapping conflict for @Accessor target "
                     + var1
                     + ": "
                     + var6.getNew()
                     + " for target "
                     + var2
                     + " conflicts with existing mapping "
                     + var6.getOld()
               );
            }
         }
      }
   }

   private void registerInvokerForTarget(AnnotatedMixinElementHandlerAccessor.AnnotatedElementInvoker var1, TypeHandle var2) {
      MethodHandle var3 = var2.findMethod(var1.getTargetName(), var1.getTargetTypeName(), false);
      if (var3 == null) {
         if (!var2.isImaginary()) {
            var1.printMessage(this.ap, IMessagerEx.MessageType.ACCESSOR_TARGET_NOT_FOUND, "Could not locate @Invoker target " + var1 + " in target " + var2);
            return;
         }

         var3 = new MethodHandle(var2, var1.getTargetName(), var1.getTargetDesc());
      }

      if (var1.shouldRemap()) {
         ObfuscationData var4 = this.obf.getDataProvider().getObfMethod(var3.asMapping(false).move(var2.getName()));
         if (var4.isEmpty()) {
            String var5 = this.mixin.isMultiTarget() ? " in target " + var2 : "";
            var1.printMessage(
               this.ap, IMessagerEx.MessageType.NO_OBFDATA_FOR_ACCESSOR, "Unable to locate obfuscation mapping" + var5 + " for @Accessor target " + var1
            );
         } else {
            var4 = AnnotatedMixinElementHandler.stripOwnerData(var4);

            try {
               this.obf.getReferenceManager().addMethodMapping(this.mixin.getClassRef(), var1.getTargetName(), var1.getContext(), var4);
            } catch (ReferenceManager.ReferenceConflictException var6) {
               var1.printMessage(
                  this.ap,
                  IMessagerEx.MessageType.ACCESSOR_MAPPING_CONFLICT,
                  "Mapping conflict for @Invoker target "
                     + var1
                     + ": "
                     + var6.getNew()
                     + " for target "
                     + var2
                     + " conflicts with existing mapping "
                     + var6.getOld()
               );
            }
         }
      }
   }

   private void registerFactoryForTarget(AnnotatedMixinElementHandlerAccessor.AnnotatedElementInvoker var1, TypeHandle var2) {
      String var3 = TypeUtils.getTypeName(var1.getReturnType());
      if (!var3.equals(var2.toString())) {
         var1.printMessage(
            this.ap, IMessagerEx.MessageType.FACTORY_INVOKER_RETURN_TYPE, "Invalid Factory @Invoker return type, expected " + var2 + " but found " + var3
         );
      } else if (!var1.isStatic()) {
         var1.printMessage(this.ap, IMessagerEx.MessageType.FACTORY_INVOKER_NONSTATIC, "Factory @Invoker must be static");
      } else if (var1.shouldRemap()) {
         ObfuscationData var4 = this.obf.getDataProvider().getObfClass(var1.getAnnotationValue().replace('.', '/'));
         this.obf.getReferenceManager().addClassMapping(this.mixin.getClassRef(), var1.getAnnotationValue(), var4);
      }
   }

   private String getAccessorTargetName(AnnotatedMixinElementHandlerAccessor.AnnotatedElementAccessor var1) {
      String var2 = var1.getAnnotationValue();
      return Strings.isNullOrEmpty(var2) ? this.inflectAccessorTarget(var1) : var2;
   }

   private String inflectAccessorTarget(AnnotatedMixinElementHandlerAccessor.AnnotatedElementAccessor var1) {
      return AccessorInfo.inflectTarget(var1.getSimpleName(), var1.getAccessorType(), "", var1, false);
   }

   static class AnnotatedElementAccessor extends AnnotatedMixinElementHandler.AnnotatedElementExecutable {
      protected final boolean shouldRemap;
      protected final TypeMirror returnType;
      protected String targetName;

      public AnnotatedElementAccessor(ExecutableElement var1, AnnotationHandle var2, IMixinContext var3, boolean var4) {
         super(var1, var2, var3, "value");
         this.shouldRemap = var4;
         this.returnType = this.getElement().getReturnType();
      }

      public void attach(TypeHandle var1) {
      }

      public boolean shouldRemap() {
         return this.shouldRemap;
      }

      public String getAnnotationValue() {
         return this.getAnnotation().getValue();
      }

      public TypeMirror getTargetType() {
         switch (this.getAccessorType()) {
            case FIELD_GETTER:
               return this.returnType;
            case FIELD_SETTER:
               return this.getElement().getParameters().get(0).asType();
            default:
               return null;
         }
      }

      public String getTargetTypeName() {
         return TypeUtils.getTypeName(this.getTargetType());
      }

      public String getTargetDesc() {
         return TypeUtils.getInternalName(this.getTargetType());
      }

      public ITargetSelectorRemappable getContext() {
         return new MemberInfo(this.getTargetName(), null, this.getTargetDesc());
      }

      public AccessorInfo.AccessorType getAccessorType() {
         return this.returnType.getKind() == TypeKind.VOID ? AccessorInfo.AccessorType.FIELD_SETTER : AccessorInfo.AccessorType.FIELD_GETTER;
      }

      public void setTargetName(String var1) {
         this.targetName = var1;
      }

      public String getTargetName() {
         return this.targetName;
      }

      public TypeMirror getReturnType() {
         return this.returnType;
      }

      public boolean isStatic() {
         return this.element.getModifiers().contains(Modifier.STATIC);
      }

      @Override
      public String toString() {
         return this.targetName != null ? this.targetName : "<invalid>";
      }
   }

   static class AnnotatedElementInvoker extends AnnotatedMixinElementHandlerAccessor.AnnotatedElementAccessor {
      private AccessorInfo.AccessorType type = AccessorInfo.AccessorType.METHOD_PROXY;

      public AnnotatedElementInvoker(ExecutableElement var1, AnnotationHandle var2, IMixinContext var3, boolean var4) {
         super(var1, var2, var3, var4);
      }

      @Override
      public void attach(TypeHandle var1) {
         this.type = AccessorInfo.AccessorType.METHOD_PROXY;
         if (this.returnType.getKind() == TypeKind.DECLARED) {
            String var2 = this.getAnnotationValue();
            if (var2 != null) {
               if ("<init>".equals(var2) || var1.getName().equals(var2.replace('.', '/'))) {
                  this.type = AccessorInfo.AccessorType.OBJECT_FACTORY;
               }
            } else {
               AccessorInfo.AccessorName var3 = AccessorInfo.AccessorName.of(this.getSimpleName(), false);
               if (var3 != null) {
                  for (String var5 : AccessorInfo.AccessorType.OBJECT_FACTORY.getExpectedPrefixes()) {
                     if (var5.equals(var3.prefix) && ("<init>".equals(var3.name) || var1.getSimpleName().equalsIgnoreCase(var3.name))) {
                        this.type = AccessorInfo.AccessorType.OBJECT_FACTORY;
                        return;
                     }
                  }
               }
            }
         }
      }

      @Override
      public String getAnnotationValue() {
         String var1 = super.getAnnotationValue();
         return this.type == AccessorInfo.AccessorType.OBJECT_FACTORY && var1 == null ? this.returnType.toString() : var1;
      }

      @Override
      public boolean shouldRemap() {
         return (
               this.type == AccessorInfo.AccessorType.OBJECT_FACTORY
                  || this.type == AccessorInfo.AccessorType.METHOD_PROXY
                  || this.getAnnotationValue() != null
            )
            && super.shouldRemap();
      }

      @Override
      public String getTargetDesc() {
         return this.getDesc();
      }

      @Override
      public AccessorInfo.AccessorType getAccessorType() {
         return this.type;
      }

      @Override
      public String getTargetTypeName() {
         return TypeUtils.getJavaSignature(this.getElement());
      }
   }
}
