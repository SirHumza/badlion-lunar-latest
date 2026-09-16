package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import com.llamalad7.mixinextras.expression.impl.utils.ExpressionASMUtils;
import org.objectweb.asm.Type;

public class DecimalLiteralExpression extends SimpleExpression {
   public final double value;

   public DecimalLiteralExpression(ExpressionSource var1, double var2) {
      super(var1);
      this.value = var2;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      if (!var1.typeMatches(Type.FLOAT_TYPE) && !var1.typeMatches(Type.DOUBLE_TYPE)) {
         return false;
      }

      Object var3 = ExpressionASMUtils.getConstant(var1.getInsn());
      return var3 == null ? false : (var3 instanceof Float || var3 instanceof Double) && String.valueOf(this.value).equals(var3.toString());
   }
}
