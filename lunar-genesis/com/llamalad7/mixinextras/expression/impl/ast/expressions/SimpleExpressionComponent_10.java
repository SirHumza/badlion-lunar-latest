package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import org.objectweb.asm.Type;

public class ArrayAccessExpression extends SimpleExpression {
   public final Expression arr;
   public final Expression index;

   public ArrayAccessExpression(ExpressionSource var1, Expression var2, Expression var3) {
      super(var1);
      this.arr = var2;
      this.index = var3;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      switch (var1.getInsn().getOpcode()) {
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
            return this.inputsMatch(var1, var2, this.arr, this.index);
         default:
            return false;
      }
   }

   @Override
   public void capture(FlowValue var1, ExpressionContext var2) {
      var2.decorate(var1.getInsn(), "mixinextras_simpleOperationArgs", new Type[]{var1.getInput(0).getType(), Type.INT_TYPE});
      var2.decorate(var1.getInsn(), "mixinextras_simpleOperationReturnType", var1.getType());
      var2.decorate(var1.getInsn(), "mixinextras_simpleOperationParamNames", new String[]{"array", "index"});
      super.capture(var1, var2);
   }
}
