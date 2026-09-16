package org.spongepowered.include.com.google.common.collect;

import java.util.Collections;
import java.util.Spliterator;
import org.spongepowered.include.com.google.common.base.Preconditions;

final class SingletonImmutableList<E> extends ImmutableList<E> {
   final transient E element;

   SingletonImmutableList(E var1) {
      this.element = Preconditions.checkNotNull((E)var1);
   }

   @Override
   public E get(int var1) {
      Preconditions.checkElementIndex(var1, 1);
      return this.element;
   }

   @Override
   public UnmodifiableIterator<E> iterator() {
      return Iterators.singletonIterator(this.element);
   }

   @Override
   public Spliterator<E> spliterator() {
      return Collections.singleton(this.element).spliterator();
   }

   @Override
   public int size() {
      return 1;
   }

   @Override
   public ImmutableList<E> subList(int var1, int var2) {
      Preconditions.checkPositionIndexes(var1, var2, 1);
      return var1 == var2 ? ImmutableList.of() : this;
   }

   @Override
   public String toString() {
      return '[' + this.element.toString() + ']';
   }
}
