package com.eliotlash.molang.functions.limit;

import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.functions.Function;
import com.eliotlash.molang.utils.MathUtils;
import com.eliotlash.molang.variables.ExecutionContext;

public class Clamp extends Function {
   public Clamp(String var1) {
      super(var1);
   }

   @Override
   public int getRequiredArguments() {
      return 3;
   }

   @Override
   public double _evaluate(Expr[] var1, ExecutionContext var2) {
      return MathUtils.clamp(this.evaluateArgument(var1, var2, 0), this.evaluateArgument(var1, var2, 1), this.evaluateArgument(var1, var2, 2));
   }
}
