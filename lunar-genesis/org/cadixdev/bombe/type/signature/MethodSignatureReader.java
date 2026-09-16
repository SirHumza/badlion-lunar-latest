package org.cadixdev.bombe.type.signature;

import org.cadixdev.bombe.type.MethodDescriptorReader;

public class MethodSignatureReader extends MethodDescriptorReader {
   public MethodSignatureReader(String var1) {
      super(var1);
   }

   public MethodSignature readSignature() {
      int var1 = this.index();

      while (this.peek() != '(') {
         this.advance();
      }

      String var2 = this.substring(var1, this.index());
      return new MethodSignature(var2, this.readDescriptor());
   }
}
