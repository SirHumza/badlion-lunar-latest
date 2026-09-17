package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.ast.identifiers.MemberIdentifier;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.LMFInfo;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;

public class FreeMethodReferenceExpression extends SimpleExpression {
   public final MemberIdentifier name;

   public FreeMethodReferenceExpression(ExpressionSource var1, MemberIdentifier var2) {
      super(var1);
      this.name = var2;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      LMFInfo var3 = var1.getDecoration("lmfInfo");
      return var3 != null && var3.type == LMFInfo.Type.FREE_METHOD ? this.name.matches(var2.pool, var1) : false;
   }
}
