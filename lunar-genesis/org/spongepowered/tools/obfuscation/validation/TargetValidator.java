package org.spongepowered.tools.obfuscation.validation;

import java.util.Collection;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.util.asm.IAnnotationHandle;
import org.spongepowered.tools.obfuscation.MixinValidator;
import org.spongepowered.tools.obfuscation.interfaces.IMessagerEx;
import org.spongepowered.tools.obfuscation.interfaces.IMixinAnnotationProcessor;
import org.spongepowered.tools.obfuscation.interfaces.IMixinValidator;
import org.spongepowered.tools.obfuscation.mirror.AnnotationHandle;
import org.spongepowered.tools.obfuscation.mirror.TypeHandle;
import org.spongepowered.tools.obfuscation.mirror.TypeUtils;

public class TargetValidator extends MixinValidator {
   public TargetValidator(IMixinAnnotationProcessor var1) {
      super(var1, IMixinValidator.ValidationPass.LATE);
   }

   @Override
   public boolean validate(TypeElement var1, IAnnotationHandle var2, Collection<TypeHandle> var3) {
      if ("true".equalsIgnoreCase(this.options.getOption("disableTargetValidator"))) {
         return true;
      }

      if (var1.getKind() == ElementKind.INTERFACE) {
         this.validateInterfaceMixin(var1, var3);
      } else {
         this.validateClassMixin(var1, var3);
      }

      return true;
   }

   private void validateInterfaceMixin(TypeElement var1, Collection<TypeHandle> var2) {
      boolean var3 = false;

      for (Element var5 : var1.getEnclosedElements()) {
         if (var5.getKind() == ElementKind.METHOD) {
            boolean var6 = AnnotationHandle.of(var5, Accessor.class).exists();
            boolean var7 = AnnotationHandle.of(var5, Invoker.class).exists();
            var3 |= !var6 && !var7;
         }
      }

      if (var3) {
         for (TypeHandle var9 : var2) {
            if (var9 != null && var9.isNotInterface()) {
               this.messager.printMessage(IMessagerEx.MessageType.TARGET_VALIDATOR, "Targetted type '" + var9 + " of " + var1 + " is not an interface", var1);
            }
         }
      }
   }

   private void validateClassMixin(TypeElement var1, Collection<TypeHandle> var2) {
      TypeHandle var3 = this.typeHandleProvider.getTypeHandle(TypeUtils.getInternalName(var1)).getSuperclass();

      for (TypeHandle var5 : var2) {
         if (var5 != null && !this.validateSuperClass(var5, var3)) {
            this.messager
               .printMessage(
                  IMessagerEx.MessageType.TARGET_VALIDATOR,
                  "Superclass " + var3 + " of " + var1 + " was not found in the hierarchy of target class " + var5,
                  var1
               );
         }
      }
   }

   private boolean validateSuperClass(TypeHandle var1, TypeHandle var2) {
      return var1.isImaginary() || var1.isSimulated() || var2.isSuperTypeOf(var1) || this.checkMixinsFor(var1, var2);
   }

   private boolean checkMixinsFor(TypeHandle var1, TypeHandle var2) {
      IAnnotationHandle var3 = var2.getAnnotation(Mixin.class);

      for (Object var5 : var3.getList()) {
         if (this.typeHandleProvider.getTypeHandle(var5).isSuperTypeOf(var1)) {
            return true;
         }
      }

      for (String var7 : var3.getList("targets")) {
         if (this.typeHandleProvider.getTypeHandle(var7).isSuperTypeOf(var1)) {
            return true;
         }
      }

      return false;
   }
}
