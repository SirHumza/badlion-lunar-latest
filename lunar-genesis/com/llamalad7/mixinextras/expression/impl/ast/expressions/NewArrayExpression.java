package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.ast.identifiers.TypeIdentifier;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import com.llamalad7.mixinextras.expression.impl.utils.ExpressionASMUtils;
import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.MultiANewArrayInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;

public class NewArrayExpression extends SimpleExpression {
   public final TypeIdentifier innerType;
   public final List<Expression> dims;
   public final int blankDims;

   public NewArrayExpression(ExpressionSource var1, TypeIdentifier var2, List<Expression> var3, int var4) {
      super(var1);
      this.innerType = var2;
      this.dims = var3;
      this.blankDims = var4;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      if (var1.hasDecoration("mixinextras_persistent_arrayCreationInfo")) {
         return false;
      } else {
         Type var3 = this.getInnerType(var1.getInsn());
         if (var3 == null) {
            return false;
         } else {
            int var4 = this.getBlankDims(var1.getInsn());
            if (var4 + var1.inputCount() < this.blankDims + this.dims.size()) {
               return false;
            } else {
               return !this.innerType.matches(var2.pool, var3)
                  ? false
                  : this.inputsMatch(var1, var2, var2.allowIncompleteListInputs, this.dims.toArray(new Expression[0]));
            }
         }
      }
   }

   private Type getInnerType(AbstractInsnNode var1) {
      switch (var1.getOpcode()) {
         case 188:
            return ExpressionASMUtils.getNewArrayType((IntInsnNode)var1);
         case 189:
            Type var2 = Type.getObjectType(((TypeInsnNode)var1).desc);
            return var2.getSort() == 9 ? var2.getElementType() : var2;
         case 197:
            return Type.getType(((MultiANewArrayInsnNode)var1).desc).getElementType();
         default:
            return null;
      }
   }

   private int getBlankDims(AbstractInsnNode var1) {
      switch (var1.getOpcode()) {
         case 189:
            Type var2 = Type.getObjectType(((TypeInsnNode)var1).desc);
            return var2.getSort() == 9 ? var2.getDimensions() : 0;
         case 197:
            MultiANewArrayInsnNode var3 = (MultiANewArrayInsnNode)var1;
            return Type.getType(var3.desc).getDimensions() - var3.dims;
         default:
            return 0;
      }
   }
}
