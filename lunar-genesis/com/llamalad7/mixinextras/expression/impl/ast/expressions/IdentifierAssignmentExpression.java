package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.ast.identifiers.MemberIdentifier;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;

public class IdentifierAssignmentExpression extends Expression {
   public final MemberIdentifier identifier;
   public final Expression value;

   public IdentifierAssignmentExpression(ExpressionSource var1, MemberIdentifier var2, Expression var3) {
      super(var1);
      this.identifier = var2;
      this.value = var3;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      switch (var1.getInsn().getOpcode()) {
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 179:
            return this.identifier.matches(var2.pool, var1) && this.inputsMatch(var1, var2, this.value);
         default:
            return false;
      }
   }
}
