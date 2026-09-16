package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;

public class UnaryExpression extends SimpleExpression {
   public final UnaryExpression.Operator operator;
   public final Expression expression;

   public UnaryExpression(ExpressionSource var1, UnaryExpression.Operator var2, Expression var3) {
      super(var1);
      this.operator = var2;
      this.expression = var3;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      switch (this.operator) {
         case MINUS:
            switch (var1.getInsn().getOpcode()) {
               case 116:
               case 117:
               case 118:
               case 119:
                  return this.inputsMatch(var1, var2, this.expression);
            }
         case BITWISE_NOT:
            return new BinaryExpression(this.src, this.expression, BinaryExpression.Operator.BITWISE_XOR, new IntLiteralExpression(null, -1L))
               .matchesImpl(var1, var2);
         default:
            return false;
      }
   }

   public enum Operator {
      MINUS,
      BITWISE_NOT;
   }
}
