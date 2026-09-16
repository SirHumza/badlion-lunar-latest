package org.cadixdev.bombe.type;

public interface PrimitiveType extends Type {
   char getKey();

   static PrimitiveType getFromKey(char var0) {
      if (var0 == 'V') {
         return VoidType.INSTANCE;
      } else if (BaseType.isValidBase(var0)) {
         return BaseType.getFromKey(var0);
      } else {
         throw new IllegalStateException("Invalid primitive type: " + var0);
      }
   }
}
