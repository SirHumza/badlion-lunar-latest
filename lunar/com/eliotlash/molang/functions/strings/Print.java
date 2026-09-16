package com.eliotlash.molang.functions.strings;

import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.functions.Function;
import com.eliotlash.molang.variables.ExecutionContext;

public class Print extends Function {
   public Print(String var1) {
      super(var1);
   }

   @Override
   public double _evaluate(Expr[] var1, ExecutionContext var2) {
      if (var1[0] instanceof Expr.Str) {
         System.out.println(var2.getEvaluator().evaluateString(var1[0]));
      } else {
         System.out.println(this.evaluateArgument(var1, var2, 0));
      }

      return 1.0;
   }

   @Override
   public int getRequiredArguments() {
      return 1;
   }
}
