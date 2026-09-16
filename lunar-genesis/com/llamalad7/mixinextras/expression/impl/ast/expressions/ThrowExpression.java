package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;

public class ThrowExpression extends Expression {
   public final Expression value;

   public ThrowExpression(ExpressionSource var1, Expression var2) {
      super(var1);
      this.value = var2;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      return var1.getInsn().getOpcode() == 191 && this.inputsMatch(var1, var2, this.value);
   }
}
