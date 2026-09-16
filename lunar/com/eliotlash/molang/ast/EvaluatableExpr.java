package com.eliotlash.molang.ast;

import java.util.Objects;

public class EvaluatableExpr implements Evaluatable {
   private final Expr expr;
   private final boolean constant;

   public EvaluatableExpr(Expr var1) {
      this.expr = Objects.requireNonNull(var1);
      this.constant = var1 instanceof Expr.Constant;
   }

   @Override
   public double evaluate(Evaluator var1) {
      Double var2 = var1.evaluate(this.expr);
      return var2 == null ? 0.0 : var2;
   }

   @Override
   public boolean isConstant() {
      return this.constant;
   }

   @Override
   public double getConstant() {
      return !this.isConstant() ? 0.0 : Evaluator.getGlobalEvaluator().evaluate(this.expr);
   }
}
