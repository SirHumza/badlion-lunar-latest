package com.eliotlash.molang.ast;

public class Transformations {
   public static final ASTTransformation SIMPLIFY_CONSTANTS = new ASTTransformation() {
      @Override
      public Expr visitBinOp(Expr.BinOp var1) {
         Expr var2 = this.visit(var1.left());
         Expr var3 = this.visit(var1.right());
         Operator var4 = var1.operator();
         return var2 instanceof Expr.Constant var5 && var3 instanceof Expr.Constant var6
            ? new Expr.Constant(var4.apply(var5::value, var6::value))
            : new Expr.BinOp(var4, var2, var3);
      }

      @Override
      public Expr visitGroup(Expr.Group var1) {
         return this.visit(var1.value());
      }

      @Override
      public Expr visitCoalesce(Expr.Coalesce var1) {
         Expr var2 = this.visit(var1.value());
         Expr var3 = this.visit(var1.fallback());
         return var2 instanceof Expr.Constant ? var3 : new Expr.Coalesce(var2, var3);
      }

      @Override
      public Expr visitNegate(Expr.Negate var1) {
         Expr var2 = this.visit(var1.value());
         return var2 instanceof Expr.Constant var3 ? new Expr.Constant(-var3.value()) : new Expr.Negate(var2);
      }

      @Override
      public Expr visitNot(Expr.Not var1) {
         Expr var2 = this.visit(var1.value());
         return var2 instanceof Expr.Constant var3 ? new Expr.Constant(var3.value() == 0.0 ? 1.0 : 0.0) : new Expr.Not(var2);
      }

      @Override
      public Expr visitTernary(Expr.Ternary var1) {
         Expr var2 = this.visit(var1.condition());
         Expr var3 = this.visit(var1.ifTrue());
         Expr var4 = this.visit(var1.ifFalse());
         return var2 instanceof Expr.Constant var5 && var3 instanceof Expr.Constant var6 && var4 instanceof Expr.Constant var7
            ? new Expr.Constant(var5.value() == 0.0 ? var7.value() : var6.value())
            : new Expr.Ternary(var2, var3, var4);
      }
   };
   public static final ASTTransformation INLINE_PARENS = new ASTTransformation() {
      @Override
      public Expr visitGroup(Expr.Group var1) {
         return this.visit(var1.value());
      }
   };
}
