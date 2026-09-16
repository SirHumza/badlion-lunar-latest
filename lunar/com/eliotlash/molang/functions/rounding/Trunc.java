package com.eliotlash.molang.functions.rounding;

import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.functions.Function;
import com.eliotlash.molang.variables.ExecutionContext;

public class Trunc extends Function {
   public Trunc(String var1) {
      super(var1);
   }

   @Override
   public int getRequiredArguments() {
      return 1;
   }

   @Override
   public double _evaluate(Expr[] var1, ExecutionContext var2) {
      double var3 = this.evaluateArgument(var1, var2, 0);
      return var3 < 0.0 ? Math.ceil(var3) : Math.floor(var3);
   }
}
