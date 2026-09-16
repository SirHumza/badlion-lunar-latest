package org.cadixdev.bombe.type.reference;

import java.util.Objects;
import java.util.StringJoiner;
import org.cadixdev.bombe.type.signature.MemberSignature;

public abstract class MemberReference<S extends MemberSignature> extends QualifiedReference {
   protected final ClassReference owningClass;
   protected final S signature;

   public MemberReference(QualifiedReference.Type var1, ClassReference var2, S var3) {
      super(var1);
      this.owningClass = var2;
      this.signature = (S)var3;
   }

   public ClassReference getOwningClass() {
      return this.owningClass;
   }

   public S getSignature() {
      return this.signature;
   }

   @Override
   public String toJvmsIdentifier() {
      return this.owningClass.toJvmsIdentifier() + '.' + this.signature.toJvmsIdentifier();
   }

   @Override
   protected StringJoiner buildToString() {
      return super.buildToString().add(";owningClass=" + this.owningClass.getClassType().getClassName()).add(";signature=" + this.signature.toJvmsIdentifier());
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof MemberReference)) {
         return false;
      }

      MemberReference var2 = (MemberReference)var1;
      return super.equals(var1) && Objects.equals(this.owningClass, var2.owningClass) && Objects.equals(this.signature, var2.signature);
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), this.owningClass, this.signature);
   }
}
