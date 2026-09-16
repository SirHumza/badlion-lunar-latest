package com.eliotlash.molang.ast;

import java.util.List;

public interface Stmt {
   <R> R accept(Stmt.Visitor<R> var1, StmtContext var2);

   record Break() implements Stmt {
      @Override
      public <R> R accept(Stmt.Visitor<R> var1, StmtContext var2) {
         return (R)var1.visitBreak(this, var2);
      }
   }

   record Continue() implements Stmt {
      @Override
      public <R> R accept(Stmt.Visitor<R> var1, StmtContext var2) {
         return (R)var1.visitContinue(this, var2);
      }
   }

   record Expression() implements Stmt {
      private final Expr expr;

      public Expression(Expr var1) {
         this.expr = var1;
      }

      @Override
      public <R> R accept(Stmt.Visitor<R> var1, StmtContext var2) {
         return (R)var1.visitExpression(this, var2);
      }
   }

   record If() implements Stmt {
      private final Expr condition;
      private final Expr.Block body;
      private final List<Stmt.If> elifs;
      private final Expr.Block elseBlock;

      public If(Expr var1, Expr.Block var2, List<Stmt.If> var3, Expr.Block var4) {
         this.condition = var1;
         this.body = var2;
         this.elifs = var3;
         this.elseBlock = var4;
      }

      @Override
      public <R> R accept(Stmt.Visitor<R> var1, StmtContext var2) {
         return (R)var1.visitIf(this, var2);
      }
   }

   record Loop() implements Stmt {
      private final Expr count;
      private final Expr expr;

      public Loop(Expr var1, Expr var2) {
         this.count = var1;
         this.expr = var2;
      }

      @Override
      public <R> R accept(Stmt.Visitor<R> var1, StmtContext var2) {
         return (R)var1.visitLoop(this, var2);
      }
   }

   record Return() implements Stmt {
      private final Expr value;

      public Return(Expr var1) {
         this.value = var1;
      }

      @Override
      public <R> R accept(Stmt.Visitor<R> var1, StmtContext var2) {
         return (R)var1.visitReturn(this, var2);
      }
   }

   interface Visitor<R> {
      default R visit(Stmt var1, StmtContext var2) {
         return var1.accept(this, var2);
      }

      R visitExpression(Stmt.Expression var1, StmtContext var2);

      R visitReturn(Stmt.Return var1, StmtContext var2);

      R visitBreak(Stmt.Break var1, StmtContext var2);

      R visitContinue(Stmt.Continue var1, StmtContext var2);

      R visitLoop(Stmt.Loop var1, StmtContext var2);

      R visitIf(Stmt.If var1, StmtContext var2);
   }
}
