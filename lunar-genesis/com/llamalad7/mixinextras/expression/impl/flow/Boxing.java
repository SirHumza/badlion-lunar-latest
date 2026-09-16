package com.llamalad7.mixinextras.expression.impl.flow;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.MethodInsnNode;

public class Boxing {
   static boolean isBoxing(MethodInsnNode var0) {
      String var1 = getUnboxingMethod(var0.owner);
      if (var1 == null) {
         return false;
      }

      Type[] var2 = Type.getArgumentTypes(var0.desc);
      Type var3 = getUnboxedType(Type.getObjectType(var0.owner));
      return var0.name.equals(var1) || var0.name.equals("valueOf") && var2.length == 1 && var2[0].equals(var3);
   }

   public static Type getUnboxedType(Type var0) {
      if (var0.getSort() != 10) {
         return null;
      }

      switch (var0.getInternalName()) {
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
   }

   private static String getUnboxingMethod(String var0) {
      switch (var0) {
         case "java/lang/Boolean":
            return "booleanValue";
         case "java/lang/Character":
            return "charValue";
         case "java/lang/Byte":
            return "byteValue";
         case "java/lang/Short":
            return "shortValue";
         case "java/lang/Integer":
            return "intValue";
         case "java/lang/Float":
            return "floatValue";
         case "java/lang/Long":
            return "longValue";
         case "java/lang/Double":
            return "doubleValue";
         default:
            return null;
      }
   }
}
