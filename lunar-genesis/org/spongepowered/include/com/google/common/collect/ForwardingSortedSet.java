package org.spongepowered.include.com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

public abstract class ForwardingSortedSet<E> extends ForwardingSet<E> implements SortedSet<E> {
   protected ForwardingSortedSet() {
   }

   protected abstract SortedSet<E> delegate();

   @Override
   public Comparator<? super E> comparator() {
      return this.delegate().comparator();
   }

   @Override
   public E first() {
      return this.delegate().first();
   }

   @Override
   public SortedSet<E> headSet(E var1) {
      return this.delegate().headSet((E)var1);
   }

   @Override
   public E last() {
      return this.delegate().last();
   }

   @Override
   public SortedSet<E> subSet(E var1, E var2) {
      return this.delegate().subSet((E)var1, (E)var2);
   }

   @Override
   public SortedSet<E> tailSet(E var1) {
      return this.delegate().tailSet((E)var1);
   }
}
