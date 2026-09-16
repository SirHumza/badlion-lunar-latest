package org.spongepowered.asm.mixin.transformer;

import java.util.Map.Entry;
import java.util.function.Supplier;
import org.objectweb.asm.tree.FieldNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.mixin.transformer.struct.Clinit;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidInterfaceMixinException;
import org.spongepowered.asm.util.Annotations;

class MixinApplicatorInterface extends MixinApplicatorStandard {
   MixinApplicatorInterface(TargetClassContext var1) {
      super(var1);
   }

   @Override
   protected void applyInterfaces(MixinTargetContext var1) {
      for (String var3 : var1.getInterfaces()) {
         if (!this.targetClass.name.equals(var3) && !this.targetClass.interfaces.contains(var3)) {
            this.targetClass.interfaces.add(var3);
            var1.getTargetClassInfo().addInterface(var3);
         }
      }
   }

   @Override
   protected void mergeShadowFields(MixinTargetContext var1) {
      for (Entry var3 : var1.getShadowFields()) {
         FieldNode var4 = (FieldNode)var3.getKey();
         FieldNode var5 = this.findTargetField(var4);
         if (var5 != null) {
            Annotations.merge(var4, var5);
            if (((ClassInfo.Field)var3.getValue()).isDecoratedMutable()) {
               this.logger.error("Ignoring illegal @Mutable on {}:{} in {}", var4.name, var4.desc, var1);
            }

            if (var4.value != null) {
               this.logger.warn("@Shadow field {}:{} in {} has an inlinable value set, is this intended?", var4.name, var4.desc, var1);
            }
         } else {
            this.logger.warn("Unable to find target for @Shadow {}:{} in {}", var4.name, var4.desc, var1);
         }
      }
   }

   @Override
   protected void mergeNewFields(MixinTargetContext var1) {
   }

   @Override
   protected void applyClinitLegacy(MixinTargetContext var1) {
   }

   @Override
   protected void applyClinit(MixinTargetContext var1, Supplier<Clinit> var2) {
   }

   @Override
   protected void applyInitialisers(MixinTargetContext var1) {
   }

   @Override
   protected void prepareInjections(MixinTargetContext var1) {
      if (MixinEnvironment.Feature.INJECTORS_IN_INTERFACE_MIXINS.isEnabled()) {
         try {
            super.prepareInjections(var1);
         } catch (InvalidInjectionException var4) {
            String var3 = var4.getContext() != null ? var4.getContext().toString() : "Injection";
            throw new InvalidInterfaceMixinException(var1, var3 + " is not supported in interface mixin", var4);
         }
      } else {
         InjectionInfo var2 = var1.getFirstInjectionInfo();
         if (var2 != null) {
            throw new InvalidInterfaceMixinException(var1, var2 + " is not supported on interface mixin method " + var2.getMethodName());
         }
      }
   }

   @Override
   protected void applyPreInjections(MixinTargetContext var1) {
      if (MixinEnvironment.Feature.INJECTORS_IN_INTERFACE_MIXINS.isEnabled()) {
         super.applyPreInjections(var1);
      }
   }

   @Override
   protected void applyInjections(MixinTargetContext var1, int var2) {
      if (MixinEnvironment.Feature.INJECTORS_IN_INTERFACE_MIXINS.isEnabled()) {
         super.applyInjections(var1, var2);
      }
   }
}
