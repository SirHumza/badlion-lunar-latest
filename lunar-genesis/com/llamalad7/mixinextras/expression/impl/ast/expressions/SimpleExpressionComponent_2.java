package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.ast.identifiers.MemberIdentifier;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;

public class MemberAccessExpression extends SimpleExpression {
   public final Expression receiver;
   public final MemberIdentifier name;

   public MemberAccessExpression(ExpressionSource var1, Expression var2, MemberIdentifier var3) {
      super(var1);
      this.receiver = var2;
      this.name = var3;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      AbstractInsnNode var3 = var1.getInsn();
      switch (var3.getOpcode()) {
         case 180:
         case 190:
            return this.name.matches(var2.pool, var1) && this.inputsMatch(var1, var2, this.receiver);
         default:
            return false;
      }
   }

   @Override
   public void capture(FlowValue var1, ExpressionContext var2) {
      if (var1.getInsn().getOpcode() == 190) {
         var2.decorate(var1.getInsn(), "mixinextras_simpleOperationArgs", new Type[]{var1.getInput(0).getType()});
         var2.decorate(var1.getInsn(), "mixinextras_simpleOperationReturnType", Type.INT_TYPE);
         var2.decorate(var1.getInsn(), "mixinextras_simpleOperationParamNames", new String[]{"array", "index"});
      }

      super.capture(var1, var2);
   }
}
