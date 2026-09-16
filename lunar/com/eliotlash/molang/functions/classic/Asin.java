package com.eliotlash.molang.functions.classic;

import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.functions.Function;
import com.eliotlash.molang.variables.ExecutionContext;

public class Asin extends Function {
   public Asin(String var1) {
      super(var1);
   }

   @Override
   public int getRequiredArguments() {
      return 1;
   }

   @Override
   public double _evaluate(Expr[] var1, ExecutionContext var2) {
      double var3 = this.evaluateArgument(var1, var2, 0);
      return Math.abs(var3) > 1.0 ? 0.0 : Math.asin(var3);
   }
}
