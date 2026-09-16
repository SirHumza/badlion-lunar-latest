package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import com.llamalad7.mixinextras.expression.impl.utils.ComparisonInfo;
import com.llamalad7.mixinextras.expression.impl.utils.ComplexComparisonInfo;
import com.llamalad7.mixinextras.expression.impl.utils.ExpressionASMUtils;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;

public class ComparisonExpression extends Expression {
   public final Expression left;
   public final ComparisonExpression.Operator operator;
   public final Expression right;

   public ComparisonExpression(ExpressionSource var1, Expression var2, ComparisonExpression.Operator var3, Expression var4) {
      super(var1);
      this.left = var2;
      this.operator = var3;
      this.right = var4;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      return this.operator.matches(var1, var2) && this.inputsMatch(var1, var2, this.left, this.right);
   }

   @Override
   public void capture(FlowValue var1, ExpressionContext var2) {
      var2.decorate(var1.getInsn(), "mixinextras_simpleExpressionType", Type.BOOLEAN_TYPE);
      super.capture(var1, var2);
   }

   public enum Operator implements Opcodes {
      EQ(165, 159, 166, 160, 149, 151, 150, 152),
      NE(166, 160, 165, 159, 149, 151, 150, 152),
      LT(0, 161, 0, 162, 150, 152),
      LE(0, 164, 0, 163, 150, 152),
      GT(0, 163, 0, 164, 149, 151),
      GE(0, 162, 0, 161, 149, 151);

      private static final int WITH_ZERO_OFFSET = 6;
      private final int directObject;
      private final int directInt;
      private final int invertedObject;
      private final int invertedInt;
      private final int fcmp1;
      private final int dcmp1;
      private final int fcmp2;
      private final int dcmp2;

      Operator(int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
         this.directObject = var3;
         this.directInt = var4;
         this.invertedObject = var5;
         this.invertedInt = var6;
         this.fcmp1 = var7;
         this.dcmp1 = var8;
         this.fcmp2 = var9;
         this.dcmp2 = var10;
      }

      Operator(int var3, int var4, int var5, int var6, int var7, int var8) {
         this(var3, var4, var5, var6, var7, var8, var7, var8);
      }

      public boolean matches(FlowValue var1, ExpressionContext var2) {
         AbstractInsnNode var3 = var1.getInsn();
         int var4 = var3.getOpcode();
         if (var1.inputCount() != 2) {
            return false;
         }

         boolean var6 = false;
         Type var5;
         if (var4 == this.directObject || var4 == this.invertedObject) {
            var5 = ExpressionASMUtils.OBJECT_TYPE;
         } else if (var4 == this.directInt || var4 == this.invertedInt) {
            var5 = ExpressionASMUtils.getCommonIntType(null, var1.getInput(0).getType(), var1.getInput(1).getType());
         } else if (var4 == 148) {
            var5 = Type.LONG_TYPE;
            var6 = true;
         } else if (var4 != this.fcmp1 && var4 != this.fcmp2) {
            if (var4 != this.dcmp1 && var4 != this.dcmp2) {
               return false;
            }

            var5 = Type.DOUBLE_TYPE;
            var6 = true;
         } else {
            var5 = Type.FLOAT_TYPE;
            var6 = true;
         }

         ComparisonInfo var7;
         if (var6) {
            int var8 = this.directInt - 6;
            int var9 = this.invertedInt - 6;
            FlowValue var10 = var1.getDecoration("complexComparisonJump");
            JumpInsnNode var11 = (JumpInsnNode)var10.getInsn();
            if (var11 == null || var11.getOpcode() != var8 && var11.getOpcode() != var9) {
               return false;
            }

            var7 = new ComplexComparisonInfo(var4, var1, var5, var10, var11.getOpcode() == var8);
         } else {
            var7 = new ComparisonInfo(var4, var1, var5, var4 == this.directObject || var4 == this.directInt);
         }

         var7.attach((var2x, var3x) -> var2.decorate(var3, var2x, var3x), (var2x, var3x) -> var2.decorateInjectorSpecific(var3, var2x, var3x));
         return true;
      }
   }
}
