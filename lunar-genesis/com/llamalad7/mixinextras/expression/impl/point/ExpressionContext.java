package com.llamalad7.mixinextras.expression.impl.point;

import com.llamalad7.mixinextras.expression.impl.ast.expressions.Expression;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.pool.IdentifierPool;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

public class ExpressionContext {
   public final IdentifierPool pool;
   private final Expression.OutputSink sink;
   public final ClassNode classNode;
   public final MethodNode method;
   public final ExpressionContext.Type type;
   public final boolean isStatic;
   public final boolean allowIncompleteListInputs;

   public ExpressionContext(IdentifierPool var1, Expression.OutputSink var2, ClassNode var3, MethodNode var4, ExpressionContext.Type var5, boolean var6) {
      this.pool = var1;
      this.sink = var2;
      this.classNode = var3;
      this.method = var4;
      this.type = var5;
      this.isStatic = (var4.access & 8) != 0;
      this.allowIncompleteListInputs = var6;
   }

   public void capture(FlowValue var1, Expression var2) {
      this.sink.capture(var1, var2, this);
   }

   public void decorate(AbstractInsnNode var1, String var2, Object var3) {
      this.sink.decorate(var1, var2, var3);
   }

   public void decorateInjectorSpecific(AbstractInsnNode var1, String var2, Object var3) {
      this.sink.decorateInjectorSpecific(var1, var2, var3);
   }

   public void reportMatchStatus(FlowValue var1, Expression var2, boolean var3) {
      this.sink.reportMatchStatus(var1, var2, var3);
   }

   public void reportPartialMatch(FlowValue var1, Expression var2) {
      this.sink.reportPartialMatch(var1, var2);
   }

   public enum Type {
      CUSTOM,
      INJECT,
      MODIFY_ARG,
      MODIFY_ARGS,
      MODIFY_CONSTANT,
      MODIFY_EXPRESSION_VALUE,
      MODIFY_RECEIVER,
      MODIFY_RETURN_VALUE,
      MODIFY_VARIABLE,
      REDIRECT,
      SLICE,
      WRAP_OPERATION,
      WRAP_WITH_CONDITION;
   }
}
