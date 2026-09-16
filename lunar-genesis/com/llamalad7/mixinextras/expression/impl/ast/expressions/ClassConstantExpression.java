package com.llamalad7.mixinextras.expression.impl.ast.expressions;

import com.llamalad7.mixinextras.expression.impl.ExpressionSource;
import com.llamalad7.mixinextras.expression.impl.ast.identifiers.TypeIdentifier;
import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import com.llamalad7.mixinextras.expression.impl.point.ExpressionContext;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;

public class ClassConstantExpression extends SimpleExpression {
   public final TypeIdentifier type;

   public ClassConstantExpression(ExpressionSource var1, TypeIdentifier var2) {
      super(var1);
      this.type = var2;
   }

   @Override
   protected boolean matchesImpl(FlowValue var1, ExpressionContext var2) {
      Type var3 = this.getConstantType(var1.getInsn());
      return var3 != null && this.type.matches(var2.pool, var3);
   }

   private Type getConstantType(AbstractInsnNode var1) {
      if (var1 instanceof LdcInsnNode) {
         Object var5 = ((LdcInsnNode)var1).cst;
         return var5 instanceof Type ? (Type)var5 : null;
      }

      if (var1.getOpcode() != 178) {
         return null;
      }

      FieldInsnNode var2 = (FieldInsnNode)var1;
      if (var2.name.equals("TYPE") && var2.desc.equals(Type.getDescriptor(Class.class))) {
         switch (var2.owner) {
            case "java/lang/Boolean":
               return Type.BOOLEAN_TYPE;
            case "java/lang/Character":
               return Type.CHAR_TYPE;
            case "java/lang/Byte":
               return Type.BYTE_TYPE;
            case "java/lang/Short":
               return Type.SHORT_TYPE;
            case "java/lang/Integer":
               return Type.INT_TYPE;
            case "java/lang/Float":
               return Type.FLOAT_TYPE;
            case "java/lang/Long":
               return Type.LONG_TYPE;
            case "java/lang/Double":
               return Type.DOUBLE_TYPE;
            default:
               return null;
         }
      } else {
         return null;
      }
   }
}
