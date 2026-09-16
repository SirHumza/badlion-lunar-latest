package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.ast.identifiers.TypeIdentifier;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import com.llamalad7.mixinextras.expression.impl.utils.ExpressionASMUtils;
import org.objectweb.asm.Type;

public class CastExpression extends SimpleExpression {
   public final TypeIdentifier type;
   public final Expression expression;

   public CastExpression(ExpressionSource var1, TypeIdentifier var2, Expression var3) {
      super(var1);
      this.type = var2;
      this.expression = var3;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      Type var3 = ExpressionASMUtils.getCastType(var1.getInsn());
      return var3 != null && this.type.matches(var2.pool, var3) && this.inputsMatch(var1, var2, this.expression);
   }

   @Override
   public void capture(FlowValue var1, ExpressionContext var2) {
      if (var1.getInsn().getOpcode() == 192) {
         var2.decorate(var1.getInsn(), "mixinextras_simpleOperationArgs", new Type[]{ExpressionASMUtils.OBJECT_TYPE});
         var2.decorate(var1.getInsn(), "mixinextras_simpleOperationReturnType", var1.getType());
         var2.decorate(var1.getInsn(), "mixinextras_simpleOperationParamNames", new String[]{"object"});
      }

      super.capture(var1, var2);
   }
}
