package org.cadixdev.bombe.type.reference;

import org.cadixdev.bombe.type.signature.FieldSignature;

public class FieldReference extends MemberReference<FieldSignature> {
   public FieldReference(ClassReference var1, FieldSignature var2) {
      super(QualifiedReference.Type.FIELD, var1, var2);
   }
}
