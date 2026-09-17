package com.llamalad7.mixinextras.injector;

import com.llamalad7.mixinextras.utils.CompatibilityHelper;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;

public class ModifyReturnValueInjector extends Injector {
   public ModifyReturnValueInjector(InjectionInfo var1) {
      super(var1, "@ModifyReturnValue");
   }

   @Override
   protected void inject(Target var1, InjectionNodes.InjectionNode var2) {
      int var3 = var2.getCurrentTarget().getOpcode();
      if (var3 >= 172 && var3 < 177) {
         this.checkTargetModifiers(var1, false);
         this.injectReturnValueModifier(var1, var2);
      } else {
         throw CompatibilityHelper.makeInvalidInjectionException(
            this.info, String.format("%s annotation is targeting an invalid insn in %s in %s", this.annotationType, var1, this)
         );
      }
   }

   private void injectReturnValueModifier(Target var1, InjectionNodes.InjectionNode var2) {
      Injector.InjectorData var3 = new Injector.InjectorData(var1, "return value modifier");
      StackExtension var4 = new StackExtension(var1);
      InsnList var5 = new InsnList();
      this.validateParams(var3, var1.returnType, var1.returnType);
      if (!this.isStatic) {
         var5.add(new VarInsnNode(25, 0));
         if (var1.returnType.getSize() == 2) {
            var4.extra(1);
            var5.add(new InsnNode(91));
            var5.add(new InsnNode(87));
         } else {
            var5.add(new InsnNode(95));
         }
      }

      if (var3.captureTargetArgs > 0) {
         this.pushArgs(var1.arguments, var5, var1.getArgIndices(), 0, var3.captureTargetArgs);
      }

      var4.receiver(this.isStatic);
      var4.capturedArgs(var1.arguments, var3.captureTargetArgs);
      this.invokeHandler(var5);
      var1.insertBefore(var2, var5);
   }
}
