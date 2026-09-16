package org.cadixdev.bombe.type;

import java.util.ArrayList;

public class MethodDescriptorReader extends TypeReader {
   public MethodDescriptorReader(String var1) {
      super(var1);
   }

   public MethodDescriptor readDescriptor() {
      ArrayList var1 = new ArrayList();
      if (this.peek() != '(') {
         throw new IllegalStateException("Invalid descriptor provided!");
      }

      this.advance();

      while (this.available() && this.peek() != ')') {
         var1.add(this.readFieldType());
      }

      if (this.peek() != ')') {
         throw new IllegalStateException("Invalid descriptor provided!");
      }

      this.advance();
      return new MethodDescriptor(var1, this.readType());
   }
}
