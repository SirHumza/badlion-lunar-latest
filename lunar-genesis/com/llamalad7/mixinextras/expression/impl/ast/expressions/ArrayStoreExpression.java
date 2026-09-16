package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import com.llamalad7.mixinextras.expression.impl.utils.ExpressionASMUtils;
import org.objectweb.asm.Type;

public class ArrayStoreExpression extends Expression {
   public final Expression arr;
   public final Expression index;
   public final Expression value;

   public ArrayStoreExpression(ExpressionSource var1, Expression var2, Expression var3, Expression var4) {
      super(var1);
      this.arr = var2;
      this.index = var3;
      this.value = var4;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      switch (var1.getInsn().getOpcode()) {
         case 79:
         case 80:
         case 81:
         case 82:
         case 83:
         case 84:
         case 85:
         case 86:
            return this.inputsMatch(var1, var2, this.arr, this.index, this.value);
         default:
            return false;
      }
   }

   @Override
   public void capture(FlowValue var1, ExpressionContext var2) {
      Type var3 = var1.getInput(0).getType();
      var2.decorate(var1.getInsn(), "mixinextras_simpleOperationArgs", new Type[]{var3, Type.INT_TYPE, ExpressionASMUtils.getInnerType(var3)});
      var2.decorate(var1.getInsn(), "mixinextras_simpleOperationReturnType", Type.VOID_TYPE);
      var2.decorate(var1.getInsn(), "mixinextras_simpleOperationParamNames", new String[]{"array", "index", "value"});
      super.capture(var1, var2);
   }
}
