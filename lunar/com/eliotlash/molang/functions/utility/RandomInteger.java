package com.eliotlash.molang.functions.utility;

import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.functions.Function;
import com.eliotlash.molang.variables.ExecutionContext;

public class RandomInteger extends Function {
   public java.util.Random random = new java.util.Random();

   public RandomInteger(String var1) {
      super(var1);
   }

   @Override
   public boolean isConstant() {
      return false;
   }

   @Override
   public double _evaluate(Expr[] var1, ExecutionContext var2) {
      double var3 = 0.0;
      if (var1.length >= 3) {
         this.random.setSeed((long)this.evaluateArgument(var1, var2, 2));
         var3 = this.random.nextInt();
      } else {
         var3 = Math.round(Math.random());
      }

      if (var1.length >= 2) {
         double var5 = this.evaluateArgument(var1, var2, 0);
         double var7 = this.evaluateArgument(var1, var2, 1);
         double var9 = Math.min(var5, var7);
         double var11 = Math.max(var5, var7);
         var3 = var3 * (var11 - var9) + var9;
      } else if (var1.length >= 1) {
         var3 *= this.evaluateArgument(var1, var2, 0);
      }

      return var3;
   }
}
