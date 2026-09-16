package com.llamalad7.mixinextras.expression.impl.flow.expansion;

import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.FlowPostProcessor;
import com.llamalad7.mixinextras.expression.impl.utils.ExpressionASMUtils;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;

public class UnaryComparisonExpander extends InsnExpander {
   @Override
   public void process(FlowValue var1, FlowPostProcessor.OutputSink var2) {
      AbstractInsnNode var3 = var1.getInsn();
      int var4 = this.getCstOpcode(var3);
      if (var4 != -1) {
         JumpInsnNode var5 = (JumpInsnNode)var3;
         int var6 = this.getExpandedJumpOpcode(var3);
         if (this.isComplexComparison(var1.getInput(0))) {
            var1.getInput(0).decorate("complexComparisonJump", var1);
            var2.markAsSynthetic(var1);
         } else {
            InsnNode var7 = new InsnNode(var4);
            FlowValue var8 = new FlowValue(ExpressionASMUtils.getNewType(var7), var7);
            this.registerComponent(var8, UnaryComparisonExpander.Component.CST, var5);
            var1.setInsn(new JumpInsnNode(var6, var5.label));
            var1.setParents(var1.getInput(0), var8);
            this.registerComponent(var1, UnaryComparisonExpander.Component.JUMP, var5);
            var2.registerFlow(var8);
         }
      }
   }

   @Override
   public void expand(Target var1, InjectionNodes.InjectionNode var2, InsnExpander.Expansion var3) {
      if (var2.isReplaced()) {
         AbstractInsnNode var8 = var2.getCurrentTarget().getNext();
         if (!(var8 instanceof JumpInsnNode)) {
            throw new IllegalStateException("Could not find jump for expanded @ModifyConstant comparison! Please inform LlamaLad7!");
         }

         JumpInsnNode var9 = (JumpInsnNode)var8;
         var3.registerInsn(UnaryComparisonExpander.Component.CST, var2.getCurrentTarget());
         var3.registerInsn(UnaryComparisonExpander.Component.JUMP, var9);
      } else {
         AbstractInsnNode var4 = var2.getCurrentTarget();
         int var5 = this.getCstOpcode(var4);
         if (var5 != -1) {
            JumpInsnNode var6 = (JumpInsnNode)var4;
            int var7 = this.getExpandedJumpOpcode(var4);
            var1.method.maxStack++;
            this.expandInsn(
               var1,
               var2,
               var3.registerInsn(UnaryComparisonExpander.Component.CST, new InsnNode(var5)),
               var3.registerInsn(UnaryComparisonExpander.Component.JUMP, new JumpInsnNode(var7, var6.label))
            );
         }
      }
   }

   private int getCstOpcode(AbstractInsnNode var1) {
      if (153 <= var1.getOpcode() && var1.getOpcode() <= 158) {
         return 3;
      } else {
         return var1.getOpcode() != 198 && var1.getOpcode() != 199 ? -1 : 1;
      }
   }

   private int getExpandedJumpOpcode(AbstractInsnNode var1) {
      if (153 <= var1.getOpcode() && var1.getOpcode() <= 158) {
         return var1.getOpcode() + 6;
      } else {
         return var1.getOpcode() != 198 && var1.getOpcode() != 199 ? -1 : var1.getOpcode() - 33;
      }
   }

   private boolean isComplexComparison(FlowValue var1) {
      if (var1.isComplex()) {
         return false;
      }

      AbstractInsnNode var2 = var1.getInsn();
      return 148 <= var2.getOpcode() && var2.getOpcode() <= 152;
   }

   private enum Component implements InsnExpander.InsnComponent {
      CST,
      JUMP;
   }
}
