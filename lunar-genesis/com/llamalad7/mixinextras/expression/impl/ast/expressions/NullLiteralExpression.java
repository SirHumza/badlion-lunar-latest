package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;

public class NullLiteralExpression extends SimpleExpression {
   public NullLiteralExpression(ExpressionSource var1) {
      super(var1);
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      return var1.getInsn().getOpcode() == 1;
   }
}
