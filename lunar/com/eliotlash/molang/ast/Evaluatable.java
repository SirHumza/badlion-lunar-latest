package com.eliotlash.molang.ast;

import java.util.List;

public interface Evaluatable {
   double evaluate(Evaluator var1);

   default boolean isConstant() {
      return false;
   }

   default double getConstant() {
      return 0.0;
   }

   static Evaluatable of(Expr var0) {
      return new EvaluatableExpr(var0);
   }

   static Evaluatable of(List<Stmt> var0) {
      return new EvaluatableStmt(var0);
   }
}
