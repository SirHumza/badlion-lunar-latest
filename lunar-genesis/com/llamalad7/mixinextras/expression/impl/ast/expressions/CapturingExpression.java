package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;

public class CapturingExpression extends SimpleExpression {
   public final Expression expression;

   public CapturingExpression(ExpressionSource var1, Expression var2) {
      super(var1);
      this.expression = var2;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      boolean var3 = this.expression.matches(var1, var2);
      if (var3) {
         this.expression.capture(var1, var2);
      }

      return var3;
   }
}
