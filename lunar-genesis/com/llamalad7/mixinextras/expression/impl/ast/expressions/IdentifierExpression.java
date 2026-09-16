package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;

public class IdentifierExpression extends SimpleExpression {
   public final String identifier;

   public IdentifierExpression(ExpressionSource var1, String var2) {
      super(var1);
      this.identifier = var2;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      switch (var1.getInsn().getOpcode()) {
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 178:
            return var2.pool.matchesMember(this.identifier, var1);
         default:
            return false;
      }
   }
}
