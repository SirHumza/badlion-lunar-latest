package org.cadixdev.bombe.type;

import java.util.Arrays;

public enum BaseType implements FieldType, PrimitiveType {
   BYTE('B'),
   CHAR('C'),
   DOUBLE('D'),
   FLOAT('F'),
   INT('I'),
   LONG('J'),
   SHORT('S'),
   BOOLEAN('Z');

   private final char key;
   private final String descriptor;

   BaseType(char var3) {
      this.key = var3;
      this.descriptor = String.valueOf(var3);
   }

   @Override
   public char getKey() {
      return this.key;
   }

   @Override
   public String toString() {
      return this.descriptor;
   }

   public static boolean isValidBase(char var0) {
      return Arrays.stream(values()).anyMatch(var1 -> var1.key == var0);
   }

   public static BaseType getFromKey(char var0) {
      return Arrays.stream(values()).filter(var1 -> var1.key == var0).findFirst().orElse(null);
   }
}
