package com.eliotlash.molang.functions;

import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.variables.ExecutionContext;

public abstract class Function {
   private final String name;

   public Function(String var1) {
      this.name = var1;
   }

   public String getName() {
      return this.name;
   }

   public boolean isConstant() {
      return true;
   }

   public int getRequiredArguments() {
      return 0;
   }

   public abstract double _evaluate(Expr[] var1, ExecutionContext var2);

   public double evaluate(Expr[] var1, ExecutionContext var2) {
      if (var1.length < this.getRequiredArguments()) {
         String var3 = String.format("Function '%s' requires at least %s arguments. %s are given!", this.name, this.getRequiredArguments(), var1.length);
         throw new Exception(var3);
      } else {
         return this._evaluate(var1, var2);
      }
   }

   protected double evaluateArgument(Expr[] var1, ExecutionContext var2, int var3) {
      return var3 >= 0 && var3 - 1 <= var1.length ? var2.getEvaluator().evaluate(var1[var3]) : 0.0;
   }
}
