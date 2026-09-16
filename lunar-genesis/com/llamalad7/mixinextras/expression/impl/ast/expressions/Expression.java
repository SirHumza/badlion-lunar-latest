package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import org.objectweb.asm.tree.AbstractInsnNode;

public abstract class Expression {
   protected final ExpressionSource src;

   public Expression(ExpressionSource var1) {
      this.src = var1;
   }

   public ExpressionSource getSrc() {
      return this.src;
   }

   public final boolean matches(FlowValue var1, ExpressionContext var2) {
      boolean var3 = this.matchesImpl(var1, var2);
      var2.reportMatchStatus(var1, this, var3);
      return var3;
   }

   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      return false;
   }

   protected void capture(FlowValue var1, ExpressionContext var2) {
      var2.capture(var1, this);
   }

   protected boolean inputsMatch(FlowValue var1, ExpressionContext var2, Expression... var3) {
      return this.inputsMatch(var1, var2, false, var3);
   }

   protected boolean inputsMatch(FlowValue var1, ExpressionContext var2, boolean var3, Expression... var4) {
      return this.inputsMatch(0, var1, var2, var3, var4);
   }

   protected boolean inputsMatch(int var1, FlowValue var2, ExpressionContext var3, Expression... var4) {
      return this.inputsMatch(var1, var2, var3, false, var4);
   }

   protected boolean inputsMatch(int var1, FlowValue var2, ExpressionContext var3, boolean var4, Expression... var5) {
      var3.reportPartialMatch(var2, this);
      int var6 = var2.inputCount() - var1;
      if ((!var4 || var5.length >= var6) && var5.length != var6) {
         return false;
      }

      for (int var7 = 0; var7 < var5.length; var7++) {
         Expression var8 = var5[var7];
         if (!var8.matches(var2.getInput(var7 + var1), var3)) {
            return false;
         }
      }

      return true;
   }

   public interface OutputSink {
      void capture(FlowValue var1, Expression var2, ExpressionContext var3);

      void decorate(AbstractInsnNode var1, String var2, Object var3);

      void decorateInjectorSpecific(AbstractInsnNode var1, String var2, Object var3);

      default void reportMatchStatus(FlowValue var1, Expression var2, boolean var3) {
      }

      default void reportPartialMatch(FlowValue var1, Expression var2) {
      }
   }
}
