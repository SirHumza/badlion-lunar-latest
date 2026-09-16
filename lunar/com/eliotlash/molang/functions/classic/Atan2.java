package com.eliotlash.molang.functions.classic;

import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.functions.Function;
import com.eliotlash.molang.variables.ExecutionContext;

public class Atan2 extends Function {
   public Atan2(String var1) {
      super(var1);
   }

   @Override
   public int getRequiredArguments() {
      return 2;
   }

   @Override
   public double _evaluate(Expr[] var1, ExecutionContext var2) {
      return Math.atan2(this.evaluateArgument(var1, var2, 0), this.evaluateArgument(var1, var2, 1));
   }
}
