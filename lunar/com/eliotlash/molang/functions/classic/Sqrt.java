package com.eliotlash.molang.functions.classic;

import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.functions.Function;
import com.eliotlash.molang.variables.ExecutionContext;

public class Sqrt extends Function {
   public Sqrt(String var1) {
      super(var1);
   }

   @Override
   public int getRequiredArguments() {
      return 1;
   }

   @Override
   public double _evaluate(Expr[] var1, ExecutionContext var2) {
      return Math.sqrt(this.evaluateArgument(var1, var2, 0));
   }
}
