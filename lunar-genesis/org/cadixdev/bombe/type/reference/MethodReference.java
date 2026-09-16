package org.cadixdev.bombe.type.reference;

import org.cadixdev.bombe.type.signature.MethodSignature;

public class MethodReference extends MemberReference<MethodSignature> {
   public MethodReference(ClassReference var1, MethodSignature var2) {
      super(QualifiedReference.Type.METHOD, var1, var2);
   }

   public MethodParameterReference getParameter(int var1) {
      return new MethodParameterReference(this, var1);
   }
}
