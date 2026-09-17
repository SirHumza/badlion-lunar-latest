package com.llamalad7.mixinextras.expression.impl.utils;

import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.flow.utils.InsnReference;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.spongepowered.asm.mixin.injection.struct.Target;

public class ComplexComparisonInfo extends ComparisonInfo {
   private final InsnReference jumpInsn;
   private final int jumpOpcode;

   public ComplexComparisonInfo(int var1, FlowValue var2, Type var3, FlowValue var4, boolean var5) {
      super(var1, var2, var3, var5);
      this.jumpInsn = new InsnReference(var4);
      this.jumpOpcode = var4.getInsn().getOpcode();
   }

   @Override
   public int copyJump(InsnList var1) {
      var1.add(new InsnNode(this.comparison));
      return this.jumpOpcode;
   }

   @Override
   public JumpInsnNode getJumpInsn(Target var1) {
      return (JumpInsnNode)this.jumpInsn.getNode(var1).getCurrentTarget();
   }

   @Override
   public void cleanup(Target var1) {
      var1.replaceNode(this.getJumpInsn(var1), new InsnNode(0));
   }
}
