package org.spongepowered.include.com.google.common.collect;

import java.util.Iterator;
import org.spongepowered.include.com.google.common.base.Preconditions;

abstract class TransformedIterator<F, T> implements Iterator<T> {
   final Iterator<? extends F> backingIterator;

   TransformedIterator(Iterator<? extends F> var1) {
      this.backingIterator = Preconditions.checkNotNull(var1);
   }

   abstract T transform(F var1);

   @Override
   public final boolean hasNext() {
      return this.backingIterator.hasNext();
   }

   @Override
   public final T next() {
      return this.transform((F)this.backingIterator.next());
   }

   @Override
   public final void remove() {
      this.backingIterator.remove();
   }
}
