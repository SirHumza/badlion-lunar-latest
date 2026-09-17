package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.ast.identifiers.TypeIdentifier;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.flow.postprocessing.ArrayCreationInfo;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import com.llamalad7.mixinextras.expression.impl.utils.ExpressionASMUtils;
import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;

public class ArrayLiteralExpression extends SimpleExpression {
   public final TypeIdentifier elementType;
   public final List<Expression> values;

   public ArrayLiteralExpression(ExpressionSource var1, TypeIdentifier var2, List<Expression> var3) {
      super(var1);
      this.elementType = var2;
      this.values = var3;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      ArrayCreationInfo var3 = var1.getDecoration("mixinextras_persistent_arrayCreationInfo");
      if (var3 == null) {
         return false;
      }

      Type var4 = this.getElementType(var1.getInsn());
      return var4 != null && this.elementType.matches(var2.pool, var4)
         ? this.inputsMatch(var1, var2, var2.allowIncompleteListInputs, this.values.toArray(new Expression[0]))
         : false;
   }

   private Type getElementType(AbstractInsnNode var1) {
      switch (var1.getOpcode()) {
         case 188:
            return ExpressionASMUtils.getNewArrayType((IntInsnNode)var1);
         case 189:
            return Type.getObjectType(((TypeInsnNode)var1).desc);
         default:
            return null;
      }
   }
}
