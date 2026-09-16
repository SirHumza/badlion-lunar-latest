package org.spongepowered.include.com.google.common.collect;

import java.util.Spliterator;
import java.util.Spliterators;

class RegularImmutableList<E> extends ImmutableList<E> {
   static final ImmutableList<Object> EMPTY = new RegularImmutableList<>(ObjectArrays.EMPTY_ARRAY);
   private final transient Object[] array;

   RegularImmutableList(Object[] var1) {
      this.array = var1;
   }

   @Override
   public int size() {
      return this.array.length;
   }

   @Override
   int copyIntoArray(Object[] var1, int var2) {
      System.arraycopy(this.array, 0, var1, var2, this.array.length);
      return var2 + this.array.length;
   }

   @Override
   public E get(int var1) {
      return (E)this.array[var1];
   }

   @Override
   public UnmodifiableListIterator<E> listIterator(int var1) {
      return Iterators.forArray((E[])this.array, 0, this.array.length, var1);
   }

   @Override
   public Spliterator<E> spliterator() {
      return Spliterators.spliterator(this.array, 1296);
   }
}
