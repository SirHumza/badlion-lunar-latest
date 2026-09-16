package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;

public class ReturnExpression extends Expression {
   public final Expression value;

   public ReturnExpression(ExpressionSource var1, Expression var2) {
      super(var1);
      this.value = var2;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      switch (var1.getInsn().getOpcode()) {
         case 172:
         case 173:
         case 174:
         case 175:
         case 176:
            return this.inputsMatch(var1, var2, this.value);
         default:
            return false;
      }
   }
}
