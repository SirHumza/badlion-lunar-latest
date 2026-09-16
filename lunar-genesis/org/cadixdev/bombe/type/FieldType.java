package org.cadixdev.bombe.type;

public interface FieldType extends Type {
   static FieldType of(String var0) {
      return new TypeReader(var0).readFieldType();
   }

   static FieldType of(Class<?> var0) {
      if (var0.isPrimitive()) {
         if (var0 == boolean.class) {
            return BaseType.BOOLEAN;
         } else if (var0 == char.class) {
            return BaseType.CHAR;
         } else if (var0 == byte.class) {
            return BaseType.BYTE;
         } else if (var0 == short.class) {
            return BaseType.SHORT;
         } else if (var0 == int.class) {
            return BaseType.INT;
         } else if (var0 == long.class) {
            return BaseType.LONG;
         } else if (var0 == float.class) {
            return BaseType.FLOAT;
         } else if (var0 == double.class) {
            return BaseType.DOUBLE;
         } else {
            throw new RuntimeException("Invalid base type: " + var0.getName());
         }
      } else {
         if (!var0.isArray()) {
            return new ObjectType(var0.getName());
         }

         int var1 = 0;
         Class var2 = var0;

         do {
            var2 = var2.getComponentType();
            var1++;
         } while (var2.isArray());

         return new ArrayType(var1, of(var2));
      }
   }
}
