package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.ast.identifiers.MemberIdentifier;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.MethodCallType;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import com.llamalad7.mixinextras.lib.apache.commons.ArrayUtils;
import java.util.List;

public class MethodCallExpression extends SimpleExpression {
   public final Expression receiver;
   public final MemberIdentifier name;
   public final List<Expression> arguments;

   public MethodCallExpression(ExpressionSource var1, Expression var2, MemberIdentifier var3, List<Expression> var4) {
      super(var1);
      this.receiver = var2;
      this.name = var3;
      this.arguments = var4;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      if (!MethodCallType.NORMAL.matches(var1)) {
         return false;
      }

      if (!this.name.matches(var2.pool, var1)) {
         return false;
      }

      Expression[] var3 = ArrayUtils.add(this.arguments.toArray(new Expression[0]), 0, this.receiver);
      return this.inputsMatch(var1, var2, var2.allowIncompleteListInputs, var3);
   }
}
