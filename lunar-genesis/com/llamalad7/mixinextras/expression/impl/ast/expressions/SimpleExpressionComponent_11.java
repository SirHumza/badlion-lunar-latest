package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import com.llamalad7.mixinextras.expression.impl.utils.ExpressionASMUtils;
import org.objectweb.asm.Type;

public class StringLiteralExpression extends SimpleExpression {
   public final String value;
   private final Integer charValue;

   public StringLiteralExpression(ExpressionSource var1, String var2) {
      super(var1);
      this.value = var2;
      if (var2.length() == 1) {
         this.charValue = Integer.valueOf(var2.charAt(0));
      } else {
         this.charValue = null;
      }
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      Object var3 = ExpressionASMUtils.getConstant(var1.getInsn());
      return var3 == null ? false : var3.equals(this.value) || var1.typeMatches(Type.CHAR_TYPE) && var3.equals(this.charValue);
   }
}
