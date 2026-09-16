package org.objectweb.asm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class Type {
   public static final int VOID = 0;
   public static final int BOOLEAN = 1;
   public static final int CHAR = 2;
   public static final int BYTE = 3;
   public static final int SHORT = 4;
   public static final int INT = 5;
   public static final int FLOAT = 6;
   public static final int LONG = 7;
   public static final int DOUBLE = 8;
   public static final int ARRAY = 9;
   public static final int OBJECT = 10;
   public static final int METHOD = 11;
   private static final int INTERNAL = 12;
   private static final String PRIMITIVE_DESCRIPTORS = "VZCBSIFJD";
   public static final Type VOID_TYPE = new Type(0, "VZCBSIFJD", 0, 1);
   public static final Type BOOLEAN_TYPE = new Type(1, "VZCBSIFJD", 1, 2);
   public static final Type CHAR_TYPE = new Type(2, "VZCBSIFJD", 2, 3);
   public static final Type BYTE_TYPE = new Type(3, "VZCBSIFJD", 3, 4);
   public static final Type SHORT_TYPE = new Type(4, "VZCBSIFJD", 4, 5);
   public static final Type INT_TYPE = new Type(5, "VZCBSIFJD", 5, 6);
   public static final Type FLOAT_TYPE = new Type(6, "VZCBSIFJD", 6, 7);
   public static final Type LONG_TYPE = new Type(7, "VZCBSIFJD", 7, 8);
   public static final Type DOUBLE_TYPE = new Type(8, "VZCBSIFJD", 8, 9);
   private final int sort;
   private final String valueBuffer;
   private final int valueBegin;
   private final int valueEnd;

   private Type(int var1, String var2, int var3, int var4) {
      this.sort = var1;
      this.valueBuffer = var2;
      this.valueBegin = var3;
      this.valueEnd = var4;
   }

   public static Type getType(String var0) {
      return getTypeInternal(var0, 0, var0.length());
   }

   public static Type getType(Class<?> var0) {
      if (var0.isPrimitive()) {
         if (var0 == int.class) {
            return INT_TYPE;
         } else if (var0 == void.class) {
            return VOID_TYPE;
         } else if (var0 == boolean.class) {
            return BOOLEAN_TYPE;
         } else if (var0 == byte.class) {
            return BYTE_TYPE;
         } else if (var0 == char.class) {
            return CHAR_TYPE;
         } else if (var0 == short.class) {
            return SHORT_TYPE;
         } else if (var0 == double.class) {
            return DOUBLE_TYPE;
         } else if (var0 == float.class) {
            return FLOAT_TYPE;
         } else if (var0 == long.class) {
            return LONG_TYPE;
         } else {
            throw new AssertionError();
         }
      } else {
         return getType(getDescriptor(var0));
      }
   }

   public static Type getType(Constructor<?> var0) {
      return getType(getConstructorDescriptor(var0));
   }

   public static Type getType(Method var0) {
      return getType(getMethodDescriptor(var0));
   }

   public Type getElementType() {
      int var1 = this.getDimensions();
      return getTypeInternal(this.valueBuffer, this.valueBegin + var1, this.valueEnd);
   }

   public static Type getObjectType(String var0) {
      return new Type(var0.charAt(0) == '[' ? 9 : 12, var0, 0, var0.length());
   }

   public static Type getMethodType(String var0) {
      return new Type(11, var0, 0, var0.length());
   }

   public static Type getMethodType(Type var0, Type... var1) {
      return getType(getMethodDescriptor(var0, var1));
   }

   public Type[] getArgumentTypes() {
      return getArgumentTypes(this.getDescriptor());
   }

   public static Type[] getArgumentTypes(String var0) {
      int var1 = getArgumentCount(var0);
      Type[] var2 = new Type[var1];
      int var3 = 1;
      int var4 = 0;

      while (var0.charAt(var3) != ')') {
         int var5 = var3;

         while (var0.charAt(var3) == '[') {
            var3++;
         }

         if (var0.charAt(var3++) == 'L') {
            int var6 = var0.indexOf(59, var3);
            var3 = Math.max(var3, var6 + 1);
         }

         var2[var4++] = getTypeInternal(var0, var5, var3);
      }

      return var2;
   }

   public static Type[] getArgumentTypes(Method var0) {
      Class[] var1 = var0.getParameterTypes();
      Type[] var2 = new Type[var1.length];

      for (int var3 = var1.length - 1; var3 >= 0; var3--) {
         var2[var3] = getType(var1[var3]);
      }

      return var2;
   }

   public Type getReturnType() {
      return getReturnType(this.getDescriptor());
   }

   public static Type getReturnType(String var0) {
      return getTypeInternal(var0, getReturnTypeOffset(var0), var0.length());
   }

   public static Type getReturnType(Method var0) {
      return getType(var0.getReturnType());
   }

   static int getReturnTypeOffset(String var0) {
      int var1 = 1;

      while (var0.charAt(var1) != ')') {
         while (var0.charAt(var1) == '[') {
            var1++;
         }

         if (var0.charAt(var1++) == 'L') {
            int var2 = var0.indexOf(59, var1);
            var1 = Math.max(var1, var2 + 1);
         }
      }

      return var1 + 1;
   }

   private static Type getTypeInternal(String var0, int var1, int var2) {
      switch (var0.charAt(var1)) {
         case '(':
            return new Type(11, var0, var1, var2);
         case 'B':
            return BYTE_TYPE;
         case 'C':
            return CHAR_TYPE;
         case 'D':
            return DOUBLE_TYPE;
         case 'F':
            return FLOAT_TYPE;
         case 'I':
            return INT_TYPE;
         case 'J':
            return LONG_TYPE;
         case 'L':
            return new Type(10, var0, var1 + 1, var2 - 1);
         case 'S':
            return SHORT_TYPE;
         case 'V':
            return VOID_TYPE;
         case 'Z':
            return BOOLEAN_TYPE;
         case '[':
            return new Type(9, var0, var1, var2);
         default:
            throw new IllegalArgumentException(stringConcat$0(var0));
      }
   }

   public String getClassName() {
      switch (this.sort) {
         case 0:
            return "void";
         case 1:
            return "boolean";
         case 2:
            return "char";
         case 3:
            return "byte";
         case 4:
            return "short";
         case 5:
            return "int";
         case 6:
            return "float";
         case 7:
            return "long";
         case 8:
            return "double";
         case 9:
            StringBuilder var1 = new StringBuilder(this.getElementType().getClassName());

            for (int var2 = this.getDimensions(); var2 > 0; var2--) {
               var1.append("[]");
            }

            return var1.toString();
         case 10:
         case 12:
            return this.valueBuffer.substring(this.valueBegin, this.valueEnd).replace('/', '.');
         case 11:
         default:
            throw new AssertionError();
      }
   }

   public String getInternalName() {
      return this.valueBuffer.substring(this.valueBegin, this.valueEnd);
   }

   public static String getInternalName(Class<?> var0) {
      return var0.getName().replace('.', '/');
   }

   public String getDescriptor() {
      if (this.sort == 10) {
         return this.valueBuffer.substring(this.valueBegin - 1, this.valueEnd + 1);
      } else {
         return this.sort == 12
            ? stringConcat$1(this.valueBuffer.substring(this.valueBegin, this.valueEnd))
            : this.valueBuffer.substring(this.valueBegin, this.valueEnd);
      }
   }

   public static String getDescriptor(Class<?> var0) {
      StringBuilder var1 = new StringBuilder();
      appendDescriptor(var0, var1);
      return var1.toString();
   }

   public static String getConstructorDescriptor(Constructor<?> var0) {
      StringBuilder var1 = new StringBuilder();
      var1.append('(');
      Class[] var2 = var0.getParameterTypes();

      for (Class var6 : var2) {
         appendDescriptor(var6, var1);
      }

      return var1.append(")V").toString();
   }

   public static String getMethodDescriptor(Type var0, Type... var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append('(');

      for (Type var6 : var1) {
         var6.appendDescriptor(var2);
      }

      var2.append(')');
      var0.appendDescriptor(var2);
      return var2.toString();
   }

   public static String getMethodDescriptor(Method var0) {
      StringBuilder var1 = new StringBuilder();
      var1.append('(');
      Class[] var2 = var0.getParameterTypes();

      for (Class var6 : var2) {
         appendDescriptor(var6, var1);
      }

      var1.append(')');
      appendDescriptor(var0.getReturnType(), var1);
      return var1.toString();
   }

   private void appendDescriptor(StringBuilder var1) {
      if (this.sort == 10) {
         var1.append(this.valueBuffer, this.valueBegin - 1, this.valueEnd + 1);
      } else if (this.sort == 12) {
         var1.append('L').append(this.valueBuffer, this.valueBegin, this.valueEnd).append(';');
      } else {
         var1.append(this.valueBuffer, this.valueBegin, this.valueEnd);
      }
   }

   private static void appendDescriptor(Class<?> var0, StringBuilder var1) {
      Class var2;
      for (var2 = var0; var2.isArray(); var2 = var2.getComponentType()) {
         var1.append('[');
      }

      if (var2.isPrimitive()) {
         char var3;
         if (var2 == int.class) {
            var3 = 'I';
         } else if (var2 == void.class) {
            var3 = 'V';
         } else if (var2 == boolean.class) {
            var3 = 'Z';
         } else if (var2 == byte.class) {
            var3 = 'B';
         } else if (var2 == char.class) {
            var3 = 'C';
         } else if (var2 == short.class) {
            var3 = 'S';
         } else if (var2 == double.class) {
            var3 = 'D';
         } else if (var2 == float.class) {
            var3 = 'F';
         } else {
            if (var2 != long.class) {
               throw new AssertionError();
            }

            var3 = 'J';
         }

         var1.append(var3);
      } else {
         var1.append('L').append(getInternalName(var2)).append(';');
      }
   }

   public int getSort() {
      return this.sort == 12 ? 10 : this.sort;
   }

   public int getDimensions() {
      int var1 = 1;

      while (this.valueBuffer.charAt(this.valueBegin + var1) == '[') {
         var1++;
      }

      return var1;
   }

   public int getSize() {
      switch (this.sort) {
         case 0:
            return 0;
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 9:
         case 10:
         case 12:
            return 1;
         case 7:
         case 8:
            return 2;
         case 11:
         default:
            throw new AssertionError();
      }
   }

   public int getArgumentCount() {
      return getArgumentCount(this.getDescriptor());
   }

   public static int getArgumentCount(String var0) {
      int var1 = 0;

      for (int var2 = 1; var0.charAt(var2) != ')'; var1++) {
         while (var0.charAt(var2) == '[') {
            var2++;
         }

         if (var0.charAt(var2++) == 'L') {
            int var3 = var0.indexOf(59, var2);
            var2 = Math.max(var2, var3 + 1);
         }
      }

      return var1;
   }

   public int getArgumentsAndReturnSizes() {
      return getArgumentsAndReturnSizes(this.getDescriptor());
   }

   public static int getArgumentsAndReturnSizes(String var0) {
      int var1 = 1;
      int var2 = 1;

      for (char var3 = var0.charAt(var2); var3 != ')'; var3 = var0.charAt(var2)) {
         if (var3 != 'J' && var3 != 'D') {
            while (var0.charAt(var2) == '[') {
               var2++;
            }

            if (var0.charAt(var2++) == 'L') {
               int var4 = var0.indexOf(59, var2);
               var2 = Math.max(var2, var4 + 1);
            }

            var1++;
         } else {
            var2++;
            var1 += 2;
         }
      }

      char var5 = var0.charAt(var2 + 1);
      if (var5 == 'V') {
         return var1 << 2;
      }

      int var6 = var5 != 'J' && var5 != 'D' ? 1 : 2;
      return var1 << 2 | var6;
   }

   public int getOpcode(int var1) {
      if (var1 != 46 && var1 != 79) {
         switch (this.sort) {
            case 0:
               if (var1 != 172) {
                  throw new UnsupportedOperationException();
               }

               return 177;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
               return var1;
            case 6:
               return var1 + 2;
            case 7:
               return var1 + 1;
            case 8:
               return var1 + 3;
            case 9:
            case 10:
            case 12:
               if (var1 != 21 && var1 != 54 && var1 != 172) {
                  throw new UnsupportedOperationException();
               }

               return var1 + 4;
            case 11:
               throw new UnsupportedOperationException();
            default:
               throw new AssertionError();
         }
      } else {
         switch (this.sort) {
            case 0:
            case 11:
               throw new UnsupportedOperationException();
            case 1:
            case 3:
               return var1 + 5;
            case 2:
               return var1 + 6;
            case 4:
               return var1 + 7;
            case 5:
               return var1;
            case 6:
               return var1 + 2;
            case 7:
               return var1 + 1;
            case 8:
               return var1 + 3;
            case 9:
            case 10:
            case 12:
               return var1 + 4;
            default:
               throw new AssertionError();
         }
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof Type)) {
         return false;
      }

      Type var2 = (Type)var1;
      if ((this.sort == 12 ? 10 : this.sort) != (var2.sort == 12 ? 10 : var2.sort)) {
         return false;
      }

      int var3 = this.valueBegin;
      int var4 = this.valueEnd;
      int var5 = var2.valueBegin;
      int var6 = var2.valueEnd;
      if (var4 - var3 != var6 - var5) {
         return false;
      }

      int var7 = var3;

      for (int var8 = var5; var7 < var4; var8++) {
         if (this.valueBuffer.charAt(var7) != var2.valueBuffer.charAt(var8)) {
            return false;
         }

         var7++;
      }

      return true;
   }

   @Override
   public int hashCode() {
      int var1 = 13 * (this.sort == 12 ? 10 : this.sort);
      if (this.sort >= 9) {
         int var2 = this.valueBegin;

         for (int var3 = this.valueEnd; var2 < var3; var2++) {
            var1 = 17 * (var1 + this.valueBuffer.charAt(var2));
         }
      }

      return var1;
   }

   @Override
   public String toString() {
      return this.getDescriptor();
   }
}
