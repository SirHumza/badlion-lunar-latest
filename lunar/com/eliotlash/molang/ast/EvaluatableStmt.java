package com.eliotlash.molang.ast;

import java.util.List;
import java.util.Objects;

public class EvaluatableStmt implements Evaluatable {
   private final List<Stmt> stmts;

   public EvaluatableStmt(List<Stmt> var1) {
      this.stmts = Objects.requireNonNull(var1);
   }

   @Override
   public double evaluate(Evaluator var1) {
      return var1.evaluate(this.stmts);
   }
}
