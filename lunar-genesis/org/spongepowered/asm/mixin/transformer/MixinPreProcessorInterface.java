package org.spongepowered.asm.mixin.transformer;

import java.lang.reflect.Modifier;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.FieldNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidInterfaceMixinException;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;

class MixinPreProcessorInterface extends MixinPreProcessorStandard {
   MixinPreProcessorInterface(MixinInfo var1, MixinInfo.MixinClassNode var2) {
      super(var1, var2);
   }

   @Override
   protected void prepareMethod(MixinInfo.MixinMethodNode var1, ClassInfo.Method var2) {
      boolean var3 = Bytecode.hasFlag(var1, 1);
      MixinEnvironment.Feature var4 = MixinEnvironment.Feature.INJECTORS_IN_INTERFACE_MIXINS;
      MixinEnvironment.CompatibilityLevel var5 = MixinEnvironment.getCompatibilityLevel();
      MixinEnvironment.CompatibilityLevel var6 = MixinEnvironment.CompatibilityLevel.requiredFor(2);
      if (!var3 && var1.isSynthetic() && var1.isSynthetic()) {
         if (var5.isLessThan(var6)) {
            throw new InvalidInterfaceMixinException(
               this.mixin,
               String.format(
                  "Interface mixin contains a synthetic private method but compatibility level %s is required! Found %s in %s", var6, var2, this.mixin
               )
            );
         }
      } else {
         if (!var3) {
            if ("<clinit>".equals(var1.name) && "()V".equals(var1.desc)) {
               return;
            }

            MixinEnvironment.CompatibilityLevel var7 = MixinEnvironment.CompatibilityLevel.requiredFor(4);
            if (var5.isLessThan(var7)) {
               throw new InvalidInterfaceMixinException(
                  this.mixin,
                  String.format("Interface mixin contains a private method but compatibility level %s is required! Found %s in %s", var7, var2, this.mixin)
               );
            }
         }

         AnnotationNode var9 = InjectionInfo.getInjectorAnnotation(this.mixin, var1);
         if (var9 == null) {
            super.prepareMethod(var1, var2);
         } else {
            if (var4.isAvailable() && !var4.isEnabled()) {
               throw new InvalidInterfaceMixinException(
                  this.mixin,
                  String.format("Interface mixin contains an injector but Feature.INJECTORS_IN_INTERFACE_MIXINS is disabled! Found %s in %s", var2, this.mixin)
               );
            }

            MixinEnvironment.CompatibilityLevel var8 = MixinEnvironment.CompatibilityLevel.forClassVersion(this.mixin.getClassVersion());
            if (var3 && !var8.supports(4) && var8.supports(2)) {
               Bytecode.setVisibility(var1, Bytecode.Visibility.PRIVATE);
               var1.access |= 4096;
            }
         }
      }
   }

   @Override
   protected boolean validateField(MixinTargetContext var1, FieldNode var2, AnnotationNode var3) {
      if (!Bytecode.isStatic(var2) || !Bytecode.hasFlag(var2, 1) || !Bytecode.hasFlag(var2, 16)) {
         throw new InvalidInterfaceMixinException(
            this.mixin, String.format("Interface mixin contains an illegal field! Found %s %s in %s", Modifier.toString(var2.access), var2.name, this.mixin)
         );
      } else if (var3 == null) {
         throw new InvalidInterfaceMixinException(this.mixin, String.format("Interface mixin %s contains a non-shadow field: %s", this.mixin, var2.name));
      } else if (Annotations.getVisible(var2, Mutable.class) != null) {
         throw new InvalidInterfaceMixinException(
            this.mixin, String.format("@Shadow field %s.%s is marked as mutable. This is not allowed.", this.mixin, var2.name)
         );
      } else {
         String var4 = Annotations.getValue(var3, "prefix", Shadow.class);
         if (var2.name.startsWith(var4)) {
            throw new InvalidMixinException(var1, String.format("@Shadow field %s.%s has a shadow prefix. This is not allowed.", var1, var2.name));
         } else if ("super$".equals(var2.name)) {
            throw new InvalidInterfaceMixinException(
               this.mixin, String.format("Interface mixin %s contains an imaginary super. This is not allowed", this.mixin)
            );
         } else {
            return true;
         }
      }
   }
}
