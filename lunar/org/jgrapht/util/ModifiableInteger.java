package org.jgrapht.util;

public class ModifiableInteger extends Number implements Comparable<ModifiableInteger> {
   private static final long serialVersionUID = 3618698612851422261L;
   public int value;

   @Deprecated
   public ModifiableInteger() {
   }

   public ModifiableInteger(int var1) {
      this.value = var1;
   }

   public void setValue(int var1) {
      this.value = var1;
   }

   public int getValue() {
      return this.value;
   }

   public void increment() {
      this.value++;
   }

   public void decrement() {
      this.value--;
   }

   public int compareTo(ModifiableInteger var1) {
      int var2 = this.value;
      int var3 = var1.value;
      return Integer.compare(var2, var3);
   }

   @Override
   public double doubleValue() {
      return this.value;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof ModifiableInteger ? this.value == ((ModifiableInteger)var1).value : false;
   }

   @Override
   public float floatValue() {
      return this.value;
   }

   @Override
   public int hashCode() {
      return this.value;
   }

   @Override
   public int intValue() {
      return this.value;
   }

   @Override
   public long longValue() {
      return this.value;
   }

   public Integer toInteger() {
      return this.value;
   }

   @Override
   public String toString() {
      return String.valueOf(this.value);
   }
}
