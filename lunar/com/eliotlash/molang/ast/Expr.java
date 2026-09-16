package com.eliotlash.molang.ast;

import com.eliotlash.molang.variables.VariableFlavor;
import java.util.List;

public interface Expr {
   <R> R accept(Expr.Visitor<R> var1);

   record Access() implements Assignable, Expr {
      private final Accessible target;
      private final String member;

      public Access(Accessible var1, String var2) {
         this.target = var1;
         this.member = var2;
      }

      @Override
      public <R> R accept(Expr.Visitor<R> var1) {
         return (R)var1.visitAccess(this);
      }
   }

   record Assignment() implements Expr {
      private final Assignable variable;
      private final Expr expression;

      public Assignment(Assignable var1, Expr var2) {
         this.variable = var1;
         this.expression = var2;
      }

      @Override
      public <R> R accept(Expr.Visitor<R> var1) {
         return (R)var1.visitAssignment(this);
      }
   }

   record BinOp() implements Expr {
      private final Operator operator;
      private final Expr left;
      private final Expr right;

      public BinOp(Operator var1, Expr var2, Expr var3) {
         this.operator = var1;
         this.left = var2;
         this.right = var3;
      }

      @Override
      public <R> R accept(Expr.Visitor<R> var1) {
         return (R)var1.visitBinOp(this);
      }
   }

   record Block() implements Expr {
      private final List<Stmt> statements;

      public Block(List<Stmt> var1) {
         this.statements = var1;
      }

      @Override
      public <R> R accept(Expr.Visitor<R> var1) {
         return (R)var1.visitBlock(this);
      }
   }

   record Call() implements Expr {
      private final Expr.Variable target;
      private final String member;
      private final List<Expr> arguments;

      public Call(Expr.Variable var1, String var2, List<Expr> var3) {
         this.target = var1;
         this.member = var2;
         this.arguments = var3;
      }

      @Override
      public <R> R accept(Expr.Visitor<R> var1) {
         return (R)var1.visitCall(this);
      }
   }

   record Coalesce() implements Expr {
      private final Expr value;
      private final Expr fallback;

      public Coalesce(Expr var1, Expr var2) {
         this.value = var1;
         this.fallback = var2;
      }

      @Override
      public <R> R accept(Expr.Visitor<R> var1) {
         return (R)var1.visitCoalesce(this);
      }
   }

   record Conditional() implements Expr {
      private final Expr condition;
      private final Expr ifTrue;

      public Conditional(Expr var1, Expr var2) {
         this.condition = var1;
         this.ifTrue = var2;
      }

      @Override
      public <R> R accept(Expr.Visitor<R> var1) {
         return (R)var1.visitConditional(this);
      }
   }

   record Constant() implements Expr {
      private final double value;

      public Constant(double var1) {
         this.value = var1;
      }

      @Override
      public <R> R accept(Expr.Visitor<R> var1) {
         return (R)var1.visitConstant(this);
      }
   }

   record Group() implements Expr {
      private final Expr value;

      public Group(Expr var1) {
         this.value = var1;
      }

      @Override
      public <R> R accept(Expr.Visitor<R> var1) {
         return (R)var1.visitGroup(this);
      }
   }

   record Negate() implements Expr {
      private final Expr value;

      public Negate(Expr var1) {
         this.value = var1;
      }

      @Override
      public <R> R accept(Expr.Visitor<R> var1) {
         return (R)var1.visitNegate(this);
      }
   }

   record Not() implements Expr {
      private final Expr value;

      public Not(Expr var1) {
         this.value = var1;
      }

      @Override
      public <R> R accept(Expr.Visitor<R> var1) {
         return (R)var1.visitNot(this);
      }
   }

   record Str() implements Expr {
      private final String val;

      public Str(String var1) {
         this.val = var1;
      }

      @Override
      public <R> R accept(Expr.Visitor<R> var1) {
         return null;
      }
   }

   record Struct() implements Accessible, Assignable, Expr {
      private final Expr.Variable target;
      private final Expr.Struct parent;
      private final List<Expr.Struct> children;

      public Struct(Expr.Variable var1, Expr.Struct var2, List<Expr.Struct> var3) {
         this.target = var1;
         this.parent = var2;
         this.children = var3;
      }

      @Override
      public <R> R accept(Expr.Visitor<R> var1) {
         throw new RuntimeException("Should not ever evalute a struct");
      }

      @Override
      public String toString() {
         return this.parent == null ? this.target.toString() : this.parent + "." + this.target.toString();
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         }

         if (var1 != null && this.getClass() == var1.getClass()) {
            Expr.Struct var2 = (Expr.Struct)var1;
            if (!this.target.equals(var2.target)) {
               return false;
            } else {
               return this.parent == null ? var2.parent == null : this.parent.equals(var2.parent);
            }
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         int var1 = this.target.hashCode();
         if (this.parent != null) {
            var1 = 31 * var1 + this.parent.hashCode();
         }

         return var1;
      }
   }

   record SwitchContext() implements Expr {
      private final Expr.Access left;
      private final Expr right;

      public SwitchContext(Expr.Access var1, Expr var2) {
         this.left = var1;
         this.right = var2;
      }

      @Override
      public <R> R accept(Expr.Visitor<R> var1) {
         return (R)var1.visitSwitchContext(this);
      }
   }

   record Ternary() implements Expr {
      private final Expr condition;
      private final Expr ifTrue;
      private final Expr ifFalse;

      public Ternary(Expr var1, Expr var2, Expr var3) {
         this.condition = var1;
         this.ifTrue = var2;
         this.ifFalse = var3;
      }

      @Override
      public <R> R accept(Expr.Visitor<R> var1) {
         return (R)var1.visitTernary(this);
      }
   }

   record Variable() implements Accessible, Expr {
      private final VariableFlavor flavor;
      private final String name;

      public Variable(VariableFlavor var1, String var2) {
         this.flavor = var1;
         this.name = var2;
      }

      @Override
      public <R> R accept(Expr.Visitor<R> var1) {
         return (R)var1.visitVariable(this);
      }
   }

   interface Visitor<R> {
      default R visit(Expr var1) {
         return var1.accept(this);
      }

      R visitAccess(Expr.Access var1);

      R visitAssignment(Expr.Assignment var1);

      R visitBinOp(Expr.BinOp var1);

      R visitBlock(Expr.Block var1);

      R visitCall(Expr.Call var1);

      R visitCoalesce(Expr.Coalesce var1);

      R visitConstant(Expr.Constant var1);

      R visitGroup(Expr.Group var1);

      R visitNegate(Expr.Negate var1);

      R visitNot(Expr.Not var1);

      R visitConditional(Expr.Conditional var1);

      R visitTernary(Expr.Ternary var1);

      R visitSwitchContext(Expr.SwitchContext var1);

      R visitVariable(Expr.Variable var1);

      String visitString(Expr.Str var1);
   }
}
