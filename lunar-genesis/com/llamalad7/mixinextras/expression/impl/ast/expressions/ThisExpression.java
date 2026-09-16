package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import org.objectweb.asm.tree.VarInsnNode;

public class ThisExpression extends SimpleExpression {
   public ThisExpression(ExpressionSource var1) {
      super(var1);
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      return var2.isStatic ? false : var1.getInsn().getOpcode() == 25 && ((VarInsnNode)var1.getInsn()).var == 0;
   }
}
