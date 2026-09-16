package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.ast.identifiers.MemberIdentifier;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.MethodCallType;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import java.util.List;

public class StaticMethodCallExpression extends SimpleExpression {
   public final MemberIdentifier name;
   public final List<Expression> arguments;

   public StaticMethodCallExpression(ExpressionSource var1, MemberIdentifier var2, List<Expression> var3) {
      super(var1);
      this.name = var2;
      this.arguments = var3;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      return MethodCallType.STATIC.matches(var1)
         && this.name.matches(var2.pool, var1)
         && this.inputsMatch(var1, var2, var2.allowIncompleteListInputs, this.arguments.toArray(new Expression[0]));
   }
}
