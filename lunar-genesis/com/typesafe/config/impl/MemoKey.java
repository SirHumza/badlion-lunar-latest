package com.typesafe.config.impl;

final class MemoKey {
   private final AbstractConfigValue value;
   private final Path restrictToChildOrNull;

   MemoKey(AbstractConfigValue var1, Path var2) {
      this.value = var1;
      this.restrictToChildOrNull = var2;
   }

   @Override
   public final int hashCode() {
      int var1 = System.identityHashCode(this.value);
      return this.restrictToChildOrNull != null ? var1 + 41 * (41 + this.restrictToChildOrNull.hashCode()) : var1;
   }

   @Override
   public final boolean equals(Object var1) {
      if (var1 instanceof MemoKey) {
         MemoKey var2 = (MemoKey)var1;
         if (var2.value != this.value) {
            return false;
         } else if (var2.restrictToChildOrNull == this.restrictToChildOrNull) {
            return true;
         } else {
            return var2.restrictToChildOrNull != null && this.restrictToChildOrNull != null
               ? var2.restrictToChildOrNull.equals(this.restrictToChildOrNull)
               : false;
         }
      } else {
         return false;
      }
   }

   @Override
   public final String toString() {
      return "MemoKey(" + this.value + "@" + System.identityHashCode(this.value) + "," + this.restrictToChildOrNull + ")";
   }
}
