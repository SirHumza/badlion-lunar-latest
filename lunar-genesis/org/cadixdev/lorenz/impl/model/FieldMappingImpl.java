package org.cadixdev.lorenz.impl.model;

import java.util.Objects;
import org.cadixdev.bombe.type.signature.FieldSignature;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.FieldMapping;

public class FieldMappingImpl extends AbstractMemberMappingImpl<FieldMapping, ClassMapping> implements FieldMapping {
   private final FieldSignature signature;

   public FieldMappingImpl(ClassMapping var1, FieldSignature var2, String var3) {
      super(var1, var2.getName(), var3);
      this.signature = var2;
   }

   @Override
   public FieldSignature getSignature() {
      return this.signature;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (super.equals(var1) && var1 instanceof FieldMapping) {
         FieldMapping var2 = (FieldMapping)var1;
         return Objects.equals(this.signature, var2.getSignature());
      } else {
         return false;
      }
   }
}
