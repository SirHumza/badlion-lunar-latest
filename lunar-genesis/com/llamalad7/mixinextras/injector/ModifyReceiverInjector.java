package com.llamalad7.mixinextras.injector;

import com.llamalad7.mixinextras.lib.apache.commons.ArrayUtils;
import com.llamalad7.mixinextras.utils.CompatibilityHelper;
import com.llamalad7.mixinextras.utils.InjectorUtils;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;

public class ModifyReceiverInjector extends Injector {
   public ModifyReceiverInjector(InjectionInfo var1) {
      super(var1, "@ModifyReceiver");
   }

   @Override
   protected void inject(Target var1, InjectionNodes.InjectionNode var2) {
      this.checkTargetIsValid(var1, var2);
      this.checkTargetModifiers(var1, false);
      this.modifyReceiverOfTarget(var1, var2);
   }

   private void checkTargetIsValid(Target var1, InjectionNodes.InjectionNode var2) {
      AbstractInsnNode var3 = var2.getOriginalTarget();
      switch (var3.getOpcode()) {
         case 180:
         case 181:
         case 182:
         case 183:
         case 185:
            return;
         case 184:
         default:
            throw CompatibilityHelper.makeInvalidInjectionException(
               this.info, String.format("%s annotation is targeting an invalid insn in %s in %s", this.annotationType, var1, this)
            );
      }
   }

   private void modifyReceiverOfTarget(Target var1, InjectionNodes.InjectionNode var2) {
      AbstractInsnNode var3 = var2.getCurrentTarget();
      Type[] var4 = this.getEffectiveArgTypes(var2.getOriginalTarget());
      Type[] var5 = this.getEffectiveArgTypes(var3);
      InsnList var6 = new InsnList();
      boolean var7 = InjectorUtils.isVirtualRedirect(var2);
      this.injectReceiverModifier(var1, var4, var5, var7, var6);
      var1.insertBefore(var2, var6);
   }

   private void injectReceiverModifier(Target var1, Type[] var2, Type[] var3, boolean var4, InsnList var5) {
      Injector.InjectorData var6 = new Injector.InjectorData(var1, "receiver modifier");
      this.validateParams(var6, var2[0], var2);
      StackExtension var7 = new StackExtension(var1);
      int[] var8 = this.storeArgs(var1, var3, var5, 0);
      int[] var9 = InjectorUtils.handlerArgMap(var1, var8, var2, var4);
      var7.receiver(this.isStatic);
      var7.capturedArgs(var1.arguments, var6.captureTargetArgs);
      if (var4) {
         var5.add(new VarInsnNode(25, 0));
      }

      this.invokeHandlerWithArgs(this.methodArgs, var5, var9);
      InjectorUtils.coerceReturnType(var6, var5, var2[0]);
      this.pushArgs(var3, var5, var8, var4 ? 2 : 1, var8.length);
   }

   private Type[] getEffectiveArgTypes(AbstractInsnNode var1) {
      switch (var1.getOpcode()) {
         case 180:
            FieldInsnNode var5 = (FieldInsnNode)var1;
            return new Type[]{Type.getObjectType(var5.owner)};
         case 181:
            FieldInsnNode var4 = (FieldInsnNode)var1;
            return new Type[]{Type.getObjectType(var4.owner), Type.getType(var4.desc)};
         case 182:
         case 185:
            MethodInsnNode var3 = (MethodInsnNode)var1;
            return ArrayUtils.addAll(new Type[]{Type.getObjectType(var3.owner)}, Type.getArgumentTypes(var3.desc));
         case 183:
            MethodInsnNode var2 = (MethodInsnNode)var1;
            return ArrayUtils.addAll(new Type[]{Type.getObjectType(this.classNode.name)}, Type.getArgumentTypes(var2.desc));
         case 184:
            return Type.getArgumentTypes(((MethodInsnNode)var1).desc);
         default:
            throw new UnsupportedOperationException();
      }
   }
}
