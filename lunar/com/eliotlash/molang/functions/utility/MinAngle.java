package com.eliotlash.molang.functions.utility;

import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.functions.Function;
import com.eliotlash.molang.variables.ExecutionContext;

public class MinAngle extends Function {
   public MinAngle(String var1) {
      super(var1);
   }

   @Override
   public int getRequiredArguments() {
      return 3;
   }

   @Override
   public double _evaluate(Expr[] var1, ExecutionContext var2) {
      double var3 = this.evaluateArgument(var1, var2, 0);
      var3 = (var3 % 360.0 + 360.0) % 360.0;
      if (var3 > 179.0) {
         var3 -= 360.0;
      }

      return var3;
   }
}
