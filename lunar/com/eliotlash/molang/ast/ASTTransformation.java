package com.eliotlash.molang.ast;

import com.eliotlash.molang.ConstantFunctions;

public class ASTTransformation implements Expr.Visitor<Expr>, Stmt.Visitor<Stmt> {
   public Stmt visitExpression(Stmt.Expression var1, StmtContext var2) {
      return new Stmt.Expression(this.visit(var1.expr()));
   }

   public Stmt visitReturn(Stmt.Return var1, StmtContext var2) {
      return new Stmt.Return(this.visit(var1.value()));
   }

   public Stmt visitBreak(Stmt.Break var1, StmtContext var2) {
      return var1;
   }

   public Stmt visitContinue(Stmt.Continue var1, StmtContext var2) {
      return var1;
   }

   public Stmt visitLoop(Stmt.Loop var1, StmtContext var2) {
      return new Stmt.Loop(this.visit(var1.count()), this.visit(var1.expr()));
   }

   public Stmt visitIf(Stmt.If var1, StmtContext var2) {
      return var1;
   }

   public Expr visitAccess(Expr.Access var1) {
      return new Expr.Access((Expr.Variable)this.visit(var1.target()), var1.member());
   }

   public Expr visitAssignment(Expr.Assignment var1) {
      return new Expr.Assignment((Assignable)this.visit(var1.variable()), this.visit(var1.expression()));
   }

   public Expr visitBinOp(Expr.BinOp var1) {
      return new Expr.BinOp(var1.operator(), this.visit(var1.left()), this.visit(var1.right()));
   }

   public Expr visitBlock(Expr.Block var1) {
      StmtContext var2 = new StmtContext();
      return new Expr.Block(var1.statements().stream().map(var2x -> this.visit(var2x, var2)).toList());
   }

   public Expr visitCall(Expr.Call var1) {
      Expr.Call var2 = new Expr.Call((Expr.Variable)this.visit(var1.target()), var1.member(), var1.arguments().stream().map(this::visit).toList());
      return ConstantFunctions.isConstant(var2) ? new Expr.Constant(Evaluator.getGlobalEvaluator().visitCall(var2)) : var2;
   }

   public Expr visitCoalesce(Expr.Coalesce var1) {
      return new Expr.Coalesce(this.visit(var1.value()), this.visit(var1.fallback()));
   }

   public Expr visitConstant(Expr.Constant var1) {
      return var1;
   }

   public Expr visitGroup(Expr.Group var1) {
      return new Expr.Group(this.visit(var1.value()));
   }

   public Expr visitNegate(Expr.Negate var1) {
      return new Expr.Negate(this.visit(var1.value()));
   }

   public Expr visitNot(Expr.Not var1) {
      return new Expr.Not(this.visit(var1.value()));
   }

   public Expr visitConditional(Expr.Conditional var1) {
      return new Expr.Conditional(this.visit(var1.condition()), this.visit(var1.ifTrue()));
   }

   public Expr visitTernary(Expr.Ternary var1) {
      return new Expr.Ternary(this.visit(var1.condition()), this.visit(var1.ifTrue()), this.visit(var1.ifFalse()));
   }

   public Expr visitVariable(Expr.Variable var1) {
      return var1;
   }

   @Override
   public String visitString(Expr.Str var1) {
      return var1.val();
   }

   public Expr visitSwitchContext(Expr.SwitchContext var1) {
      return new Expr.SwitchContext(var1.left(), this.visit(var1.right()));
   }
}
