package org.spongepowered.include.com.google.common.collect;

import java.util.ListIterator;

abstract class TransformedListIterator<F, T> extends TransformedIterator<F, T> implements ListIterator<T> {
   TransformedListIterator(ListIterator<? extends F> var1) {
      super(var1);
   }

   private ListIterator<? extends F> backingIterator() {
      return Iterators.cast(this.backingIterator);
   }

   @Override
   public final boolean hasPrevious() {
      return this.backingIterator().hasPrevious();
   }

   @Override
   public final T previous() {
      return this.transform((F)this.backingIterator().previous());
   }

   @Override
   public final int nextIndex() {
      return this.backingIterator().nextIndex();
   }

   @Override
   public final int previousIndex() {
      return this.backingIterator().previousIndex();
   }

   @Override
   public void set(T var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void add(T var1) {
      throw new UnsupportedOperationException();
   }
}
