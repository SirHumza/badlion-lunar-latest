package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.ast.identifiers.TypeIdentifier;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.InstantiationInfo;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import java.util.List;

public class InstantiationExpression extends Expression {
   public final TypeIdentifier type;
   public final List<Expression> arguments;

   public InstantiationExpression(ExpressionSource var1, TypeIdentifier var2, List<Expression> var3) {
      super(var1);
      this.type = var2;
      this.arguments = var3;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      InstantiationInfo var3 = var1.getDecoration("instantiationInfo");
      return var3 != null && this.type.matches(var2.pool, var3.type)
         ? this.inputsMatch(var1, var2, var2.allowIncompleteListInputs, this.arguments.toArray(new Expression[0]))
         : false;
   }

   @Override
   protected void capture(FlowValue var1, ExpressionContext var2) {
      if (var2.type == ExpressionContext.Type.REDIRECT) {
         throw new UnsupportedOperationException(
            "Factory redirects are not supported with expressions! Either switch to @WrapOperation or use the standard NEW injection point."
         );
      }

      if (var2.type == ExpressionContext.Type.MODIFY_ARG || var2.type == ExpressionContext.Type.MODIFY_ARGS) {
         InstantiationInfo var3 = var1.getDecoration("instantiationInfo");
         var1 = var3.initCall;
      }

      super.capture(var1, var2);
   }
}
