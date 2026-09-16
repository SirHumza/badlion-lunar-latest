package org.cadixdev.bombe.type;

import java.util.Arrays;
import java.util.Objects;

public class ArrayType implements FieldType {
   private final int dimCount;
   private final String arrayDims;
   private final FieldType component;
   private final String descriptor;

   public ArrayType(int var1, FieldType var2) {
      this.dimCount = var1;
      char[] var3 = new char[var1];
      Arrays.fill(var3, '[');
      this.arrayDims = new String(var3);
      this.component = var2;
      this.descriptor = this.arrayDims + var2.toString();
   }

   public int getDimCount() {
      return this.dimCount;
   }

   public String getDims() {
      return this.arrayDims;
   }

   public FieldType getComponent() {
      return this.component;
   }

   @Override
   public String toString() {
      return this.descriptor;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof ArrayType)) {
         return false;
      }

      ArrayType var2 = (ArrayType)var1;
      return Objects.equals(this.dimCount, var2.dimCount) && Objects.equals(this.component, var2.component);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.dimCount, this.component);
   }
}
