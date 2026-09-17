package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.ast.identifiers.MemberIdentifier;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import org.objectweb.asm.tree.AbstractInsnNode;

public class MemberAssignmentExpression extends Expression {
   public final Expression receiver;
   public final MemberIdentifier name;
   public final Expression value;

   public MemberAssignmentExpression(ExpressionSource var1, Expression var2, MemberIdentifier var3, Expression var4) {
      super(var1);
      this.receiver = var2;
      this.name = var3;
      this.value = var4;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      AbstractInsnNode var3 = var1.getInsn();
      return var3.getOpcode() == 181 && this.name.matches(var2.pool, var1) && this.inputsMatch(var1, var2, this.receiver, this.value);
   }
}
