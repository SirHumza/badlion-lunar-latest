package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.StringConcatInfo;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import com.llamalad7.mixinextras.expression.impl.utils.ExpressionUtil;
import org.objectweb.asm.tree.AbstractInsnNode;

public class BinaryExpression extends SimpleExpression {
   public final Expression left;
   public final BinaryExpression.Operator operator;
   public final Expression right;

   public BinaryExpression(ExpressionSource var1, Expression var2, BinaryExpression.Operator var3, Expression var4) {
      super(var1);
      this.left = var2;
      this.operator = var3;
      this.right = var4;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      if (this.operator.matches(var1.getInsn()) && this.inputsMatch(var1, var2, this.left, this.right)) {
         return true;
      }

      StringConcatInfo var3 = var1.getDecoration("stringConcatInfo");
      if (this.operator == BinaryExpression.Operator.PLUS && var3 != null) {
         var2.reportPartialMatch(var1, this);
         if (var1 == var3.toStringCall) {
            var1 = var1.getInput(0);
         }

         if (!this.right.matches(var1.getInput(1), var2)) {
            return false;
         }

         if (var3.isFirstConcat) {
            return this.left.matches(var3.initialComponent, var2);
         }

         Expression var4 = ExpressionUtil.skipCapturesDown(this.left);
         if (var4 instanceof WildcardExpression) {
            if (this.left instanceof CapturingExpression) {
               this.checkSupportsStringConcat(var2.type);
               var2.decorateInjectorSpecific(var1.getInput(0).getInsn(), "mixinextras_isStringConcatExpression", true);
            }

            return this.left.matches(var1.getInput(0), var2);
         } else {
            return var4 instanceof BinaryExpression && ((BinaryExpression)var4).operator == BinaryExpression.Operator.PLUS
               ? this.left.matches(var1.getInput(0), var2)
               : false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void capture(FlowValue var1, ExpressionContext var2) {
      StringConcatInfo var3 = var1.getDecoration("stringConcatInfo");
      if (var3 == null) {
         super.capture(var1, var2);
      } else {
         this.checkSupportsStringConcat(var2.type);
         if (var3.isBuilder) {
            var2.decorateInjectorSpecific(var1.getInsn(), "mixinextras_isStringConcatExpression", true);
         }

         super.capture(var1, var2);
      }
   }

   private void checkSupportsStringConcat(ExpressionContext.Type var1) {
      switch (var1) {
         case SLICE:
         case INJECT:
         case MODIFY_VARIABLE:
            return;
         case MODIFY_EXPRESSION_VALUE:
            return;
         default:
            throw new UnsupportedOperationException(String.format("Expression context type %s does not support string concat!", var1));
      }
   }

   public enum Operator {
      MULT(104, 105, 106, 107),
      DIV(108, 109, 110, 111),
      MOD(112, 113, 114, 115),
      PLUS(96, 97, 98, 99),
      MINUS(100, 101, 102, 103),
      SHL(120, 121),
      SHR(122, 123),
      USHR(124, 125),
      BITWISE_AND(126, 127),
      BITWISE_XOR(130, 131),
      BITWISE_OR(128, 129);

      private final int[] opcodes;

      Operator(int... var3) {
         this.opcodes = var3;
      }

      public boolean matches(AbstractInsnNode var1) {
         for (int var5 : this.opcodes) {
            if (var5 == var1.getOpcode()) {
               return true;
            }
         }

         return false;
      }
   }
}
