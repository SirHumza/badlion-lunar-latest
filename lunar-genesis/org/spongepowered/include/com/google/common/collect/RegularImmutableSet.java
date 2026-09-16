package org.spongepowered.include.com.google.common.collect;

import java.util.Spliterator;
import java.util.Spliterators;
import javax.annotation.Nullable;

final class RegularImmutableSet<E> extends ImmutableSet.Indexed<E> {
   static final RegularImmutableSet<Object> EMPTY = new RegularImmutableSet<>(ObjectArrays.EMPTY_ARRAY, 0, null, 0);
   private final transient Object[] elements;
   final transient Object[] table;
   private final transient int mask;
   private final transient int hashCode;

   RegularImmutableSet(Object[] var1, int var2, Object[] var3, int var4) {
      this.elements = var1;
      this.table = var3;
      this.mask = var4;
      this.hashCode = var2;
   }

   @Override
   public boolean contains(@Nullable Object var1) {
      Object[] var2 = this.table;
      if (var1 != null && var2 != null) {
         int var5 = Hashing.smearedHash(var1);

         while (true) {
            var5 &= this.mask;
            Object var4 = var2[var5];
            if (var4 == null) {
               return false;
            }

            if (var4.equals(var1)) {
               return true;
            }

            var5++;
         }
      } else {
         return false;
      }
   }

   @Override
   public int size() {
      return this.elements.length;
   }

   @Override
   E get(int var1) {
      return (E)this.elements[var1];
   }

   @Override
   public Spliterator<E> spliterator() {
      return Spliterators.spliterator(this.elements, 1297);
   }

   @Override
   int copyIntoArray(Object[] var1, int var2) {
      System.arraycopy(this.elements, 0, var1, var2, this.elements.length);
      return var2 + this.elements.length;
   }

   @Override
   ImmutableList<E> createAsList() {
      return this.table == null ? ImmutableList.of() : new RegularImmutableAsList<>(this, this.elements);
   }

   @Override
   public int hashCode() {
      return this.hashCode;
   }

   @Override
   boolean isHashCodeFast() {
      return true;
   }
}
