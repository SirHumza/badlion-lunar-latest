package com.llamalad7.mixinextras.injector;

import com.llamalad7.mixinextras.lib.apache.commons.ArrayUtils;
import com.llamalad7.mixinextras.utils.ASMUtils;
import com.llamalad7.mixinextras.utils.CompatibilityHelper;
import com.llamalad7.mixinextras.utils.InjectorUtils;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;

public class WrapWithConditionInjector extends Injector {
   public WrapWithConditionInjector(InjectionInfo var1) {
      super(var1, "@WrapWithCondition");
   }

   @Override
   protected void inject(Target var1, InjectionNodes.InjectionNode var2) {
      this.checkTargetIsLogicallyVoid(var1, var2);
      this.checkTargetModifiers(var1, false);
      this.wrapTargetWithCondition(var1, var2);
   }

   private void checkTargetIsLogicallyVoid(Target var1, InjectionNodes.InjectionNode var2) {
      if (!var2.hasDecoration("mixinextras_operationIsImmediatelyPopped")) {
         Type var3 = this.getReturnType(var2.getCurrentTarget());
         if (var3 == null) {
            throw CompatibilityHelper.makeInvalidInjectionException(
               this.info, String.format("%s annotation is targeting an invalid insn in %s in %s", this.annotationType, var1, this)
            );
         }

         if (var3 != Type.VOID_TYPE) {
            throw CompatibilityHelper.makeInvalidInjectionException(
               this.info, String.format("%s annotation is targeting an instruction with a non-void return type in %s in %s", this.annotationType, var1, this)
            );
         }
      }
   }

   private void wrapTargetWithCondition(Target var1, InjectionNodes.InjectionNode var2) {
      AbstractInsnNode var3 = var2.getCurrentTarget();
      Type var4 = this.getReturnType(var3);
      Type[] var5 = this.getEffectiveArgTypes(var2.getOriginalTarget());
      Type[] var6 = this.getEffectiveArgTypes(var3);
      InsnList var7 = new InsnList();
      InsnList var8 = new InsnList();
      boolean var9 = InjectorUtils.isVirtualRedirect(var2);
      this.invokeHandler(var1, var4, var5, var6, var9, var7, var8);
      var1.wrapNode(var3, var3, var7, var8);
   }

   private void invokeHandler(Target var1, Type var2, Type[] var3, Type[] var4, boolean var5, InsnList var6, InsnList var7) {
      Injector.InjectorData var8 = new Injector.InjectorData(var1, "condition wrapper");
      this.validateParams(var8, Type.BOOLEAN_TYPE, var3);
      StackExtension var9 = new StackExtension(var1);
      int[] var10 = this.storeArgs(var1, var4, var6, 0);
      int[] var11 = InjectorUtils.handlerArgMap(var1, var10, var3, var5);
      var9.receiver(this.isStatic);
      var9.capturedArgs(var1.arguments, var8.captureTargetArgs);
      var9.extra(1);
      this.invokeHandlerWithArgs(this.methodArgs, var6, var11);
      LabelNode var12 = new LabelNode();
      LabelNode var13 = new LabelNode();
      var6.add(new JumpInsnNode(153, var12));
      this.pushArgs(var4, var6, var10, 0, var10.length);
      var7.add(new JumpInsnNode(167, var13));
      var7.add(var12);
      if (var2 != Type.VOID_TYPE) {
         var7.add(new InsnNode(ASMUtils.getDummyOpcodeForType(var2)));
      }

      var7.add(var13);
   }

   private Type getReturnType(AbstractInsnNode var1) {
      if (var1 instanceof MethodInsnNode) {
         MethodInsnNode var3 = (MethodInsnNode)var1;
         return Type.getReturnType(var3.desc);
      } else if (var1 instanceof FieldInsnNode) {
         FieldInsnNode var2 = (FieldInsnNode)var1;
         return var2.getOpcode() != 180 && var2.getOpcode() != 178 ? Type.VOID_TYPE : Type.getType(var2.desc);
      } else {
         return null;
      }
   }

   private Type[] getEffectiveArgTypes(AbstractInsnNode var1) {
      if (var1 instanceof MethodInsnNode) {
         MethodInsnNode var3 = (MethodInsnNode)var1;
         return var1.getOpcode() == 184
            ? Type.getArgumentTypes(var3.desc)
            : ArrayUtils.addAll(new Type[]{Type.getObjectType(var3.owner)}, Type.getArgumentTypes(var3.desc));
      }

      if (var1 instanceof FieldInsnNode) {
         FieldInsnNode var2 = (FieldInsnNode)var1;
         if (var2.getOpcode() == 181) {
            return new Type[]{Type.getObjectType(var2.owner), Type.getType(var2.desc)};
         }

         if (var2.getOpcode() == 179) {
            return new Type[]{Type.getType(var2.desc)};
         }
      }

      throw new UnsupportedOperationException();
   }
}
