package org.cadixdev.bombe.type;

public class VoidType implements PrimitiveType {
   public static final VoidType INSTANCE = new VoidType();
   private static final char KEY = 'V';
   private static final String DESCRIPTOR = "V";

   private VoidType() {
   }

   @Override
   public char getKey() {
      return 'V';
   }

   @Override
   public String toString() {
      return "V";
   }
}
