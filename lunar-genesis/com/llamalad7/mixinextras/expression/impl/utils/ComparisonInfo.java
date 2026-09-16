package com.llamalad7.mixinextras.expression.impl.utils;

import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.flow.utils.InsnReference;
import java.util.function.BiConsumer;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.spongepowered.asm.mixin.injection.struct.Target;

public class ComparisonInfo {
   protected final int comparison;
   protected final InsnReference node;
   public final Type input;
   public final boolean jumpOnTrue;

   public ComparisonInfo(int var1, FlowValue var2, Type var3, boolean var4) {
      this.comparison = var1;
      this.node = new InsnReference(var2);
      this.input = var3;
      this.jumpOnTrue = var4;
   }

   public void attach(BiConsumer<String, Object> var1, BiConsumer<String, Object> var2) {
      var2.accept("mixinextras_comparisonInfo", this);
      var1.accept("mixinextras_simpleOperationArgs", new Type[]{this.input, this.input});
      var1.accept("mixinextras_simpleOperationReturnType", Type.BOOLEAN_TYPE);
      var1.accept("mixinextras_simpleOperationParamNames", new String[]{"left", "right"});
   }

   public int copyJump(InsnList var1) {
      return this.comparison;
   }

   public LabelNode getJumpTarget(Target var1) {
      return this.getJumpInsn(var1).label;
   }

   public JumpInsnNode getJumpInsn(Target var1) {
      return (JumpInsnNode)this.node.getNode(var1).getCurrentTarget();
   }

   public void cleanup(Target var1) {
   }
}
