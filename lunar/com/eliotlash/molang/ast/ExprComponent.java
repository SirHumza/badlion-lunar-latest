package com.eliotlash.molang.ast;

import com.eliotlash.molang.functions.Function;
import com.eliotlash.molang.functions.FunctionDefinition;
import com.eliotlash.molang.utils.MolangUtils;
import com.eliotlash.molang.variables.ExecutionContext;
import com.eliotlash.molang.variables.RuntimeVariable;
import java.util.List;

public class Evaluator implements Expr.Visitor<Double>, Stmt.Visitor<Void> {
   private static ExecutionContext globalContext = new ExecutionContext(Evaluator.globalEvaluator);
   private static Evaluator globalEvaluator = new Evaluator();
   private ExecutionContext context;

   public static Evaluator getGlobalEvaluator() {
      return globalEvaluator;
   }

   public static ExecutionContext getGlobalContext() {
      return globalContext;
   }

   public void setExecutionContext(ExecutionContext var1) {
      this.context = var1;
   }

   public Void visitExpression(Stmt.Expression var1, StmtContext var2) {
      var2.lastExprValue = this.evaluate(var1.expr());
      return null;
   }

   public Void visitReturn(Stmt.Return var1, StmtContext var2) {
      var2.returnValue = this.evaluate(var1.value());
      return null;
   }

   public Void visitBreak(Stmt.Break var1, StmtContext var2) {
      return null;
   }

   public Void visitContinue(Stmt.Continue var1, StmtContext var2) {
      return null;
   }

   public Void visitLoop(Stmt.Loop var1, StmtContext var2) {
      Double var3 = this.evaluate(var1.count());

      for (int var4 = 0; var4 < var3; var4++) {
         this.evaluate(var1.expr());
      }

      return null;
   }

   public Void visitIf(Stmt.If var1, StmtContext var2) {
      boolean var3 = false;
      if (MolangUtils.doubleToBoolean(this.evaluate(var1.condition()))) {
         this.evaluate(var1.body().statements(), var2);
         var3 = true;
      }

      for (Stmt.If var5 : var1.elifs()) {
         if (!var3 && MolangUtils.doubleToBoolean(this.evaluate(var5.condition()))) {
            this.evaluate(var5.body().statements(), var2);
            var3 = true;
         }
      }

      if (!var3 && var1.elseBlock() != null) {
         this.evaluate(var1.elseBlock().statements(), var2);
      }

      return null;
   }

   public Double visitAccess(Expr.Access var1) {
      if (this.context.assignableMap.containsKey(var1)) {
         return this.context.assignableMap.getDouble(var1);
      }

      if (this.context.functionScopedArguments.containsKey(var1)) {
         return this.context.functionScopedArguments.getDouble(var1);
      }

      if (var1.target() instanceof Expr.Variable var2) {
         RuntimeVariable var5 = this.context.getCachedVariable(var2.flavor(), var1.member());
         if (this.context.getVariableMap().containsKey(var5)) {
            return this.context.getVariableMap().getDouble(var5);
         }
      }

      return var1.target() instanceof Expr.Struct var4 && this.context.getStructMap().containsKey(var4) ? this.context.getStructMap().getDouble(var4) : null;
   }

   public Double visitAssignment(Expr.Assignment var1) {
      double var2 = this.evaluate(var1.expression());
      if (var1.variable() instanceof Expr.Access var4) {
         if (var4.target() instanceof Expr.Variable var6) {
            this.context.assignableMap.put(var4, var2);
            this.context.parseRuntimeVariable(var6.flavor(), var6.name(), var4);
         } else {
            if (!(var4.target() instanceof Expr.Struct var8)) {
               throw new RuntimeException("Unexpected assignment to non variable/struct.");
            }

            this.context.getStructMap().put(var8, var2);
         }

         return var2;
      } else {
         return 0.0;
      }
   }

   public Double visitBinOp(Expr.BinOp var1) {
      return var1.left() instanceof Expr.Str var2 && var1.right() instanceof Expr.Str var3
         ? var1.operator().applyString(var2.val(), var3.val())
         : var1.operator().apply(() -> this.evaluate(var1.left()), () -> this.evaluate(var1.right()));
   }

   public Double visitBlock(Expr.Block var1) {
      return this.evaluate(var1.statements());
   }

   public Double visitCall(Expr.Call var1) {
      FunctionDefinition var2 = new FunctionDefinition(var1.target(), var1.member());
      Function var3 = this.context.getFunction(var2);
      if (var3 == null) {
         return 0.0;
      }

      try {
         return var3.evaluate(var1.arguments().toArray(Expr[]::new), this.context);
      } catch (Exception var5) {
         return 0.0;
      }
   }

   public Double visitCoalesce(Expr.Coalesce var1) {
      Double var2 = this.evaluateNullable(var1.value());
      return var2 == null ? this.evaluate(var1.fallback()) : var2;
   }

   public Double visitConstant(Expr.Constant var1) {
      return var1.value();
   }

   public Double visitGroup(Expr.Group var1) {
      return this.evaluate(var1.value());
   }

   public Double visitNegate(Expr.Negate var1) {
      Double var2 = this.evaluate(var1.value());
      return -var2;
   }

   public Double visitNot(Expr.Not var1) {
      return this.evaluate(var1.value()) == 0.0 ? 1.0 : 0.0;
   }

   public Double visitConditional(Expr.Conditional var1) {
      double var2 = this.evaluate(var1.condition());
      return var2 == 0.0 ? 0.0 : this.evaluate(var1.ifTrue());
   }

   public Double visitTernary(Expr.Ternary var1) {
      Expr var2 = this.evaluate(var1.condition()) == 0.0 ? var1.ifFalse() : var1.ifTrue();
      return this.evaluate(var2);
   }

   public Double visitSwitchContext(Expr.SwitchContext var1) {
      this.context.contextStack.push(var1.left());
      Double var2 = this.evaluate(var1.right());
      this.context.contextStack.pop();
      return var2;
   }

   public Double visitVariable(Expr.Variable var1) {
      RuntimeVariable var2 = this.context.getCachedVariable(var1.flavor(), var1.name());
      return this.context.getVariableMap().getOrDefault(var2, 0.0);
   }

   @Override
   public String visitString(Expr.Str var1) {
      return var1.val();
   }

   public Double evaluate(Expr var1) {
      Double var2 = var1.accept(this);
      return var2 == null ? 0.0 : var2;
   }

   public String evaluateString(Expr var1) {
      return var1 instanceof Expr.Str ? ((Expr.Str)var1).val() : var1.accept(this).toString();
   }

   public Double evaluateNullable(Expr var1) {
      return var1.accept(this);
   }

   public double evaluate(List<Stmt> var1) {
      StmtContext var2 = new StmtContext();
      return this.evaluate(var1, var2);
   }

   public double evaluate(List<Stmt> var1, StmtContext var2) {
      for (Stmt var4 : var1) {
         if (var2.returnValue != null) {
            return var2.returnValue;
         }

         this.evaluate(var4, var2);
      }

      if (var2.returnValue != null) {
         return var2.returnValue;
      } else {
         return var2.lastExprValue != null ? var2.lastExprValue : 0.0;
      }
   }

   private void evaluate(Stmt var1, StmtContext var2) {
      var1.accept(this, var2);
   }

   public ExecutionContext getContext() {
      return this.context;
   }

   static {
      globalEvaluator.setExecutionContext(globalContext);
   }
}
