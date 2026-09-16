package com.eliotlash.molang.functions.utility;

import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.functions.Function;
import com.eliotlash.molang.variables.ExecutionContext;
import java.util.concurrent.ThreadLocalRandom;

public class DiceRoll extends Function {
   public DiceRoll(String var1) {
      super(var1);
   }

   @Override
   public boolean isConstant() {
      return false;
   }

   @Override
   public int getRequiredArguments() {
      return 3;
   }

   @Override
   public double _evaluate(Expr[] var1, ExecutionContext var2) {
      double var3 = 0.0;
      double var5 = this.evaluateArgument(var1, var2, 0);
      if (var5 > 0.0) {
         double var7 = this.evaluateArgument(var1, var2, 1);
         double var9 = this.evaluateArgument(var1, var2, 2);

         for (int var11 = 0; var11 < var5; var11++) {
            var3 += ThreadLocalRandom.current().nextDouble() * (var9 - var7) + var7;
         }
      }

      return var3;
   }
}
