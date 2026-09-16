package org.spongepowered.include.com.google.common.collect;

import java.util.NoSuchElementException;
import org.spongepowered.include.com.google.common.base.Preconditions;

abstract class AbstractIndexedListIterator<E> extends UnmodifiableListIterator<E> {
   private final int size;
   private int position;

   protected abstract E get(int var1);

   protected AbstractIndexedListIterator(int var1, int var2) {
      Preconditions.checkPositionIndex(var2, var1);
      this.size = var1;
      this.position = var2;
   }

   @Override
   public final boolean hasNext() {
      return this.position < this.size;
   }

   @Override
   public final E next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      } else {
         return this.get(this.position++);
      }
   }

   @Override
   public final int nextIndex() {
      return this.position;
   }

   @Override
   public final boolean hasPrevious() {
      return this.position > 0;
   }

   @Override
   public final E previous() {
      if (!this.hasPrevious()) {
         throw new NoSuchElementException();
      } else {
         return this.get(--this.position);
      }
   }

   @Override
   public final int previousIndex() {
      return this.position - 1;
   }
}
