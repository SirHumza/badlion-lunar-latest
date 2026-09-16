package com.eliotlash.molang.functions.strings;

import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.functions.Function;
import com.eliotlash.molang.utils.MolangUtils;
import com.eliotlash.molang.variables.ExecutionContext;

public class StrEquals extends Function {
   public StrEquals(String var1) {
      super(var1);
   }

   @Override
   public double _evaluate(Expr[] var1, ExecutionContext var2) {
      String var3 = var2.getEvaluator().evaluateString(var1[0]);
      String var4 = var2.getEvaluator().evaluateString(var1[1]);
      return MolangUtils.booleanToFloat(var3.equals(var4));
   }

   @Override
   public int getRequiredArguments() {
      return 2;
   }
}
