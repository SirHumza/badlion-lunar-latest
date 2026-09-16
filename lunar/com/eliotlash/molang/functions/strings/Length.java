package com.eliotlash.molang.functions.strings;

import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.functions.Function;
import com.eliotlash.molang.variables.ExecutionContext;

public class Length extends Function {
   public Length(String var1) {
      super(var1);
   }

   @Override
   public double _evaluate(Expr[] var1, ExecutionContext var2) {
      return var2.getEvaluator().evaluateString(var1[0]).length();
   }

   @Override
   public int getRequiredArguments() {
      return 1;
   }
}
