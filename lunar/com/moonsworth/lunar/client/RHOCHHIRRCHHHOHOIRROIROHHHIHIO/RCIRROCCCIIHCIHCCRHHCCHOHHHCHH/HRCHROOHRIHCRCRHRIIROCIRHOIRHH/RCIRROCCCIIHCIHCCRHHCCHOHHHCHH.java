package com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.eliotlash.molang.ast.Accessible;
import com.eliotlash.molang.ast.Evaluator;
import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.ast.Stmt;
import com.eliotlash.molang.ast.StmtContext;
import com.eliotlash.molang.functions.Function;
import com.eliotlash.molang.functions.FunctionDefinition;
import com.eliotlash.molang.utils.MolangUtils;
import com.eliotlash.molang.variables.ExecutionContext;
import com.eliotlash.molang.variables.RuntimeVariable;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends Evaluator {
   private final ExecutionContext CRCHHRCHRCHIOIRRCRCRHRIRRROHHC;
   private int depth = 0;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ExecutionContext var1) {
      this.CRCHHRCHRCHIOIRRCRCRHRIRRROHHC = var1;
   }

   @Override
   public Void visitExpression(Stmt.Expression var1, StmtContext var2) {
      System.out.println("  ".repeat(this.depth) + "Expression");
      return super.visitExpression(var1, var2);
   }

   @Override
   public Void visitReturn(Stmt.Return var1, StmtContext var2) {
      System.out.println("  ".repeat(this.depth) + "Return");
      return super.visitReturn(var1, var2);
   }

   @Override
   public Void visitBreak(Stmt.Break var1, StmtContext var2) {
      System.out.println("  ".repeat(this.depth) + "Break");
      return super.visitBreak(var1, var2);
   }

   @Override
   public Void visitContinue(Stmt.Continue var1, StmtContext var2) {
      System.out.println("  ".repeat(this.depth) + "Continue");
      return super.visitContinue(var1, var2);
   }

   @Override
   public Void visitLoop(Stmt.Loop var1, StmtContext var2) {
      double var3 = this.evaluate(var1.count());
      System.out.println("  ".repeat(this.depth) + "Loop(" + var3 + ")");
      this.depth++;

      for (int var5 = 0; var5 < var3; var5++) {
         this.evaluate(var1.expr());
      }

      this.depth--;
      return null;
   }

   @Override
   public Double visitAssignment(Expr.Assignment var1) {
      this.depth++;
      double var2 = this.evaluate(var1.expression());
      this.depth--;
      if (var1.variable() instanceof Expr.Access var5) {
         Accessible var6 = var5.target();
         if (var6 instanceof Expr.Variable var7) {
            System.out.println("  ".repeat(this.depth) + "Assignment(" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7) + ", Variable)");
            System.out.println("  ".repeat(this.depth + 1) + "= " + var2);
            this.CRCHHRCHRCHIOIRRCRCRHRIRRROHHC.assignableMap.put(var5, var2);
            this.CRCHHRCHRCHIOIRRCRCRHRIRRROHHC.parseRuntimeVariable(var7.flavor(), var7.name(), var5);
         } else {
            if (!(var6 instanceof Expr.Struct var8)) {
               throw new RuntimeException("Unexpected assignment to non variable/struct.");
            }

            System.out.println("  ".repeat(this.depth) + "Assignment(" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8) + ", Struct)");
            System.out.println("  ".repeat(this.depth + 1) + "= " + var2);
            this.CRCHHRCHRCHIOIRRCRCRHRIRRROHHC.getStructMap().put(var8, var2);
         }

         return var2;
      } else {
         System.out.println("  ".repeat(this.depth) + "Assignment(" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1) + ")");
         System.out.println("  ".repeat(this.depth + 1) + "= 0");
         return 0.0;
      }
   }

   @Override
   public Void visitIf(Stmt.If var1, StmtContext var2) {
      boolean var3 = false;
      this.depth++;
      Double var4 = this.evaluate(var1.condition());
      this.depth--;
      if (MolangUtils.doubleToBoolean(var4)) {
         System.out.println("  ".repeat(this.depth) + "If(" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.condition()) + ")");
         this.depth++;
         this.evaluate(var1.body().statements(), var2);
         this.depth--;
         var3 = true;
      }

      for (Stmt.If var6 : var1.elifs()) {
         if (!var3) {
            this.depth++;
            Double var7 = this.evaluate(var6.condition());
            this.depth--;
            if (MolangUtils.doubleToBoolean(var7)) {
               System.out.println("  ".repeat(this.depth) + "Elif(" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6.condition()) + ")");
               this.depth++;
               this.evaluate(var6.body().statements(), var2);
               this.depth--;
               var3 = true;
            }
         }
      }

      if (!var3 && var1.elseBlock() != null) {
         System.out.println("  ".repeat(this.depth) + "Else");
         this.depth++;
         this.evaluate(var1.elseBlock().statements(), var2);
         this.depth--;
      }

      return null;
   }

   @Override
   public Double visitAccess(Expr.Access var1) {
      if (this.CRCHHRCHRCHIOIRRCRCRHRIRRROHHC.assignableMap.containsKey(var1)) {
         System.out.println("  ".repeat(this.depth) + "Access(" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1) + ", Assignable)");
         double var8 = this.CRCHHRCHRCHIOIRRCRCRHRIRRROHHC.assignableMap.getDouble(var1);
         System.out.println("  ".repeat(this.depth + 1) + "= " + var8);
         return var8;
      }

      if (this.CRCHHRCHRCHIOIRRCRCRHRIRRROHHC.functionScopedArguments.containsKey(var1)) {
         System.out.println("  ".repeat(this.depth) + "Access(" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1) + ", FunctionScopedArgument)");
         double var7 = this.CRCHHRCHRCHIOIRRCRCRHRIRRROHHC.functionScopedArguments.getDouble(var1);
         System.out.println("  ".repeat(this.depth + 1) + "= " + var7);
         return var7;
      }

      Accessible var2 = var1.target();
      if (var2 instanceof Expr.Variable var3) {
         RuntimeVariable var4 = this.CRCHHRCHRCHIOIRRCRCRHRIRRROHHC.getCachedVariable(var3.flavor(), var1.member());
         if (this.CRCHHRCHRCHIOIRRCRCRHRIRRROHHC.getVariableMap().containsKey(var4)) {
            System.out
               .println(
                  "  ".repeat(this.depth)
                     + "Access("
                     + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3)
                     + ", "
                     + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1)
                     + ", Variable)"
               );
            double var5 = this.CRCHHRCHRCHIOIRRCRCRHRIRRROHHC.getVariableMap().getDouble(var4);
            System.out.println("  ".repeat(this.depth + 1) + "= " + var5);
            return var5;
         }
      }

      if (var2 instanceof Expr.Struct var9 && this.CRCHHRCHRCHIOIRRCRCRHRIRRROHHC.getStructMap().containsKey(var9)) {
         System.out.println("  ".repeat(this.depth) + "Access(" + var1.member() + ", Struct)");
         double var10 = this.CRCHHRCHRCHIOIRRCRCRHRIRRROHHC.getStructMap().getDouble(var9);
         System.out.println("  ".repeat(this.depth + 1) + "= " + var10);
         return var10;
      } else {
         return null;
      }
   }

   @Override
   public Double visitBinOp(Expr.BinOp var1) {
      System.out.println("  ".repeat(this.depth) + "BinOp(" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1) + ")");
      if (var1.left() instanceof Expr.Str var3 && var1.right() instanceof Expr.Str var4) {
         double var11 = var1.operator().applyString(var3.val(), var4.val());
         System.out.println("  ".repeat(this.depth + 1) + "= " + var11);
         return var11;
      } else {
         this.depth++;
         System.out.println("  ".repeat(this.depth) + "Left");
         this.depth++;
         double var10 = this.evaluate(var1.left());
         this.depth--;
         System.out.println("  ".repeat(this.depth) + "Right");
         this.depth++;
         double var5 = this.evaluate(var1.right());
         this.depth--;
         double var7 = var1.operator().apply(() -> var10, () -> var5);
         System.out.println("  ".repeat(this.depth) + "= " + var7);
         this.depth--;
         return var7;
      }
   }

   @Override
   public Double visitCall(Expr.Call var1) {
      FunctionDefinition var2 = new FunctionDefinition(var1.target(), var1.member());
      System.out.println("  ".repeat(this.depth) + "Call(" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1) + ")");
      Function var3 = this.CRCHHRCHRCHIOIRRCRCRHRIRRROHHC.getFunction(var2);
      if (var3 == null) {
         System.out.println("  ".repeat(this.depth + 1) + "= 0  | Function not found");
         return 0.0;
      }

      try {
         this.depth++;
         double var4 = var3.evaluate(var1.arguments().toArray(Expr[]::new), this.CRCHHRCHRCHIOIRRCRCRHRIRRROHHC);
         System.out.println("  ".repeat(this.depth) + "= " + var4);
         this.depth--;
         return var4;
      } catch (Exception var6) {
         System.out.println("  ".repeat(this.depth + 1) + "= 0  | " + var6.getMessage());
         return 0.0;
      }
   }

   @Override
   public Double visitCoalesce(Expr.Coalesce var1) {
      System.out.println("  ".repeat(this.depth) + "Coalesce(" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1) + ")");
      this.depth++;
      Double var2 = this.evaluateNullable(var1.value());
      Double var3 = var2 == null ? this.evaluate(var1.fallback()) : var2;
      System.out.println("  ".repeat(this.depth) + "= " + var3);
      this.depth--;
      return var3;
   }

   @Override
   public Double visitConstant(Expr.Constant var1) {
      System.out.println("  ".repeat(this.depth) + "Constant(" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1) + ")");
      return var1.value();
   }

   @Override
   public Double visitNegate(Expr.Negate var1) {
      System.out.println("  ".repeat(this.depth) + "Negate(" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1) + ")");
      this.depth++;
      double var2 = -this.evaluate(var1.value());
      System.out.println("  ".repeat(this.depth) + "= " + var2);
      this.depth--;
      return var2;
   }

   @Override
   public Double visitNot(Expr.Not var1) {
      System.out.println("  ".repeat(this.depth) + "Not(" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1) + ")");
      this.depth++;
      Double var2 = this.evaluate(var1.value()) == 0.0 ? 1.0 : 0.0;
      System.out.println("  ".repeat(this.depth) + "= " + var2);
      this.depth--;
      return var2;
   }

   @Override
   public Double visitConditional(Expr.Conditional var1) {
      System.out.println("  ".repeat(this.depth) + "Conditional(" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1) + ")");
      this.depth++;
      double var2 = this.evaluate(var1.condition());
      double var4 = var2 == 0.0 ? 0.0 : this.evaluate(var1.ifTrue());
      System.out.println("  ".repeat(this.depth) + "= " + var4);
      this.depth--;
      return var4;
   }

   @Override
   public Double visitTernary(Expr.Ternary var1) {
      System.out.println("  ".repeat(this.depth) + "Ternary(" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1) + ")");
      this.depth++;
      Expr var2 = this.evaluate(var1.condition()) == 0.0 ? var1.ifFalse() : var1.ifTrue();
      Double var3 = this.evaluate(var2);
      System.out.println("  ".repeat(this.depth) + "= " + var3);
      this.depth--;
      return var3;
   }

   @Override
   public Double visitSwitchContext(Expr.SwitchContext var1) {
      System.out.println("  ".repeat(this.depth) + "Switch(" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1) + ")");
      this.depth++;
      this.CRCHHRCHRCHIOIRRCRCRHRIRRROHHC.contextStack.push(var1.left());
      Double var2 = this.evaluate(var1.right());
      this.CRCHHRCHRCHIOIRRCRCRHRIRRROHHC.contextStack.pop();
      System.out.println("  ".repeat(this.depth) + "= " + var2);
      this.depth--;
      return var2;
   }

   @Override
   public Double visitVariable(Expr.Variable var1) {
      System.out.println("  ".repeat(this.depth) + "Variable(" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1) + ")");
      this.depth++;
      RuntimeVariable var2 = this.CRCHHRCHRCHIOIRRCRCRHRIRRROHHC.getCachedVariable(var1.flavor(), var1.name());
      Double var3 = this.CRCHHRCHRCHIOIRRCRCRHRIRRROHHC.getVariableMap().getOrDefault(var2, 0.0);
      System.out.println("  ".repeat(this.depth) + "= " + var3);
      this.depth--;
      return var3;
   }

   @Override
   public String visitString(Expr.Str var1) {
      System.out.println("  ".repeat(this.depth) + "String(" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1) + ")");
      return var1.val();
   }

   @Override
   public String evaluateString(Expr var1) {
      System.out.println("  ".repeat(this.depth) + "String(" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1) + ")");
      this.depth++;
      String var2 = var1 instanceof Expr.Str ? ((Expr.Str)var1).val() : var1.accept(this).toString();
      System.out.println("  ".repeat(this.depth) + "= " + var2);
      this.depth--;
      return var2;
   }

   private String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Expr var1) {
      if (var1 instanceof Expr.Str var2) {
         return "\"" + var2.val() + "\"";
      } else if (var1 instanceof Expr.Access var3) {
         return var3.member();
      } else if (var1 instanceof Expr.Call var4) {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4.target()) + "." + var4.member() + "()";
      } else if (var1 instanceof Expr.Coalesce var5) {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5.value()) + " ?? " + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5.fallback());
      } else if (var1 instanceof Expr.Struct var6) {
         return var6.parent() == null
            ? this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6.target())
            : this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6.parent()) + "." + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6.target());
      } else if (var1 instanceof Expr.Assignment var7) {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7.variable()) + "." + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7.expression());
      } else if (var1 instanceof Expr.BinOp var8) {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8.left()) + " " + var8.operator() + " " + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8.right());
      } else if (var1 instanceof Expr.Block) {
         return "";
      } else if (var1 instanceof Expr.Ternary var9) {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9.condition())
            + " ? "
            + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9.ifTrue())
            + " : "
            + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9.ifFalse());
      } else if (var1 instanceof Expr.Conditional var10) {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10.condition()) + " ? " + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10.ifTrue());
      } else if (var1 instanceof Expr.Constant var11) {
         return var11.value() + "";
      } else if (var1 instanceof Expr.Group var12) {
         return "(" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12.value()) + ")";
      } else if (var1 instanceof Expr.Negate var13) {
         return "-" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var13.value());
      } else if (var1 instanceof Expr.Not var14) {
         return "!" + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var14.value());
      } else if (var1 instanceof Expr.SwitchContext var15) {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var15.left()) + " <> " + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var15.right());
      } else if (var1 instanceof Expr.Variable var16) {
         return var16.name() == null ? var16.flavor().name() : var16.flavor().name() + "." + var16.name();
      } else {
         return var1.toString();
      }
   }
}
