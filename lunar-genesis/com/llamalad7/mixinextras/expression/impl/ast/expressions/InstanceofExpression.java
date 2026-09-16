package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.ast.identifiers.TypeIdentifier;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;

public class InstanceofExpression extends SimpleExpression {
   public final Expression expression;
   public final TypeIdentifier type;

   public InstanceofExpression(ExpressionSource var1, Expression var2, TypeIdentifier var3) {
      super(var1);
      this.expression = var2;
      this.type = var3;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      AbstractInsnNode var3 = var1.getInsn();
      if (var3.getOpcode() != 193) {
         return false;
      }

      Type var4 = Type.getObjectType(((TypeInsnNode)var3).desc);
      return this.type.matches(var2.pool, var4) && this.inputsMatch(var1, var2, this.expression);
   }
}
