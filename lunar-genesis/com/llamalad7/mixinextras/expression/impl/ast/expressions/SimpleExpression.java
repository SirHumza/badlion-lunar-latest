package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import com.llamalad7.mixinextras.expression.impl.utils.ExpressionASMUtils;
import org.objectweb.asm.Type;

public abstract class SimpleExpression extends Expression {
   public SimpleExpression(ExpressionSource var1) {
      super(var1);
   }

   @Override
   public void capture(FlowValue var1, ExpressionContext var2) {
      Type var3 = var1.getType();
      if (var3.equals(ExpressionASMUtils.BOTTOM_TYPE)) {
         var3 = ExpressionASMUtils.OBJECT_TYPE;
      }

      if (!var3.equals(Type.VOID_TYPE)) {
         var2.decorate(var1.getInsn(), "mixinextras_simpleExpressionType", var3);
      }

      super.capture(var1, var2);
   }
}
