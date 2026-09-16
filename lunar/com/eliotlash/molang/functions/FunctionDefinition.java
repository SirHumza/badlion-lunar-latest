package com.eliotlash.molang.functions;

import com.eliotlash.molang.ast.Expr;

public record FunctionDefinition() {
   private final Expr.Variable target;
   private final String member;

   public FunctionDefinition(Expr.Variable var1, String var2) {
      this.target = var1;
      this.member = var2;
   }
}
