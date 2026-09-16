package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.ast.identifiers.MemberIdentifier;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.LMFInfo;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;

public class BoundMethodReferenceExpression extends SimpleExpression {
   public final Expression receiver;
   public final MemberIdentifier name;

   public BoundMethodReferenceExpression(ExpressionSource var1, Expression var2, MemberIdentifier var3) {
      super(var1);
      this.receiver = var2;
      this.name = var3;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      LMFInfo var3 = var1.getDecoration("lmfInfo");
      if (var3 != null && var3.type == LMFInfo.Type.BOUND_METHOD && this.name.matches(var2.pool, var1)) {
         var2.reportPartialMatch(var1, this);
         return this.receiver.matches(var1.getInput(0), var2);
      } else {
         return false;
      }
   }
}
