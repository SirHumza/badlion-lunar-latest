package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.ast.identifiers.TypeIdentifier;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.LMFInfo;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import org.objectweb.asm.Type;

public class ConstructorReferenceExpression extends SimpleExpression {
   public final TypeIdentifier type;

   public ConstructorReferenceExpression(ExpressionSource var1, TypeIdentifier var2) {
      super(var1);
      this.type = var2;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      LMFInfo var3 = var1.getDecoration("lmfInfo");
      return var3 != null && var3.type == LMFInfo.Type.INSTANTIATION ? this.type.matches(var2.pool, Type.getObjectType(var3.impl.getOwner())) : false;
   }
}
