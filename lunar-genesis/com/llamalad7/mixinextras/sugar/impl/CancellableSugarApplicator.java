package com.llamalad7.mixinextras.sugar.impl;

import com.llamalad7.mixinextras.injector.StackExtension;
import com.llamalad7.mixinextras.utils.ASMUtils;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;

class CancellableSugarApplicator extends SugarApplicator {
   CancellableSugarApplicator(InjectionInfo var1, SugarParameter var2) {
      super(var1, var2);
   }

   @Override
   void validate(Target var1, InjectionNodes.InjectionNode var2) {
   }

   @Override
   void prepare(Target var1, InjectionNodes.InjectionNode var2) {
   }

   @Override
   void inject(Target var1, InjectionNodes.InjectionNode var2, StackExtension var3) {
      Type var4 = Type.getObjectType(var1.getCallbackInfoClass());
      if (!var4.equals(this.paramType)) {
         throw new IllegalStateException(
            String.format("@Cancellable sugar has wrong type! Expected %s but got %s!", var4.getClassName(), this.paramType.getClassName())
         );
      }

      int var5 = this.getOrCreateCi(var1, var2, var3, var4);
      var3.extra(1);
      var1.insns.insertBefore(var2.getCurrentTarget(), new VarInsnNode(25, var5));
   }

   @Override
   int postProcessingPriority() {
      return -1000;
   }

   private int getOrCreateCi(Target var1, InjectionNodes.InjectionNode var2, StackExtension var3, Type var4) {
      if (var2.hasDecoration("mixinextras_cancellableCiIndex")) {
         return var2.<Integer>getDecoration("mixinextras_cancellableCiIndex");
      }

      int var5 = var1.allocateLocal();
      var1.addLocalVariable(var5, "callbackInfo" + var5, var4.getDescriptor());
      var2.decorate("mixinextras_cancellableCiIndex", var5);
      InsnList var6 = new InsnList();
      var6.add(new TypeInsnNode(187, var4.getInternalName()));
      var6.add(new InsnNode(89));
      var6.add(new LdcInsnNode(var1.method.name));
      var6.add(new InsnNode(4));
      var6.add(new MethodInsnNode(183, var4.getInternalName(), "<init>", "(Ljava/lang/String;Z)V", false));
      var6.add(new VarInsnNode(58, var5));
      var1.insertBefore(var2, var6);
      var3.extra(4);
      SugarPostProcessingExtension.enqueuePostProcessing(
         this,
         () -> {
            InsnList var4x = new InsnList();
            LabelNode var5x = new LabelNode();
            var4x.add(new VarInsnNode(25, var5));
            var4x.add(new MethodInsnNode(182, var4.getInternalName(), "isCancelled", "()Z", false));
            var4x.add(new JumpInsnNode(153, var5x));
            var4x.add(new VarInsnNode(25, var5));
            if (var1.returnType.equals(Type.VOID_TYPE)) {
               var4x.add(new InsnNode(177));
            } else if (ASMUtils.isPrimitive(var1.returnType)) {
               var4x.add(
                  new MethodInsnNode(
                     182, var4.getInternalName(), "getReturnValue" + var1.returnType.getDescriptor(), "()" + var1.returnType.getDescriptor(), false
                  )
               );
               var4x.add(new InsnNode(var1.returnType.getOpcode(172)));
            } else {
               var4x.add(new MethodInsnNode(182, var4.getInternalName(), "getReturnValue", "()Ljava/lang/Object;", false));
               var4x.add(new TypeInsnNode(192, var1.returnType.getInternalName()));
               var4x.add(new InsnNode(176));
            }

            var4x.add(var5x);
            var1.insns.insert(var2.getCurrentTarget(), var4x);
         }
      );
      return var5;
   }
}
