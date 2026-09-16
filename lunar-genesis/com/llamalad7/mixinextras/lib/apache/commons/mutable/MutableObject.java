package com.llamalad7.mixinextras.lib.apache.commons.mutable;

import java.io.Serializable;

public class MutableObject<T> implements Serializable {
   private T value;

   public T getValue() {
      return this.value;
   }

   public void setValue(T var1) {
      this.value = (T)var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (this == var1) {
         return true;
      } else if (this.getClass() == var1.getClass()) {
         MutableObject var2 = (MutableObject)var1;
         return this.value.equals(var2.value);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.value == null ? 0 : this.value.hashCode();
   }

   @Override
   public String toString() {
      return this.value == null ? "null" : this.value.toString();
   }
}
