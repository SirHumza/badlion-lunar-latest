package com.llamalad7.mixinextras.lib.antlr.runtime.misc;

public final class ObjectEqualityComparator extends AbstractEqualityComparator<Object> {
   public static final ObjectEqualityComparator INSTANCE = new ObjectEqualityComparator();

   @Override
   public int hashCode(Object var1) {
      return var1 == null ? 0 : var1.hashCode();
   }

   @Override
   public boolean equals(Object var1, Object var2) {
      return var1 == null ? var2 == null : var1.equals(var2);
   }
}
