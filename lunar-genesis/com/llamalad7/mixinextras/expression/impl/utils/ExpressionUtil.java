package com.llamalad7.mixinextras.expression.impl.utils;

import com.llamalad7.mixinextras.expression.impl.ast.expressions.CapturingExpression;
import com.llamalad7.mixinextras.expression.impl.ast.expressions.Expression;

public class ExpressionUtil {
   public static Expression skipCapturesDown(Expression var0) {
      while (var0 instanceof CapturingExpression) {
         var0 = ((CapturingExpression)var0).expression;
      }

      return var0;
   }
}
