package org.cadixdev.bombe.type.reference;

import java.util.Objects;
import java.util.StringJoiner;

public class MethodParameterReference extends QualifiedReference {
   private final MethodReference parentMethod;
   private final int index;

   public MethodParameterReference(MethodReference var1, int var2) {
      super(QualifiedReference.Type.METHOD_PARAMETER);
      if (var2 >= var1.getSignature().getDescriptor().getParamTypes().size()) {
         throw new IllegalArgumentException("Cannot get out-of-bounds parameter index " + var2);
      }

      this.parentMethod = var1;
      this.index = var2;
   }

   public MethodReference getParentMethod() {
      return this.parentMethod;
   }

   public int getParameterIndex() {
      return this.index;
   }

   @Override
   public String toJvmsIdentifier() {
      return this.getParentMethod().toJvmsIdentifier() + '.' + this.index;
   }

   @Override
   public StringJoiner buildToString() {
      return super.buildToString().add(";parentMethod=" + this.parentMethod.toJvmsIdentifier()).add(";index=" + this.index);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof MethodParameterReference)) {
         return false;
      }

      MethodParameterReference var2 = (MethodParameterReference)var1;
      return super.equals(var1) && Objects.equals(this.parentMethod, var2.parentMethod) && Objects.equals(this.index, var2.index);
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), this.parentMethod, this.index);
   }
}
