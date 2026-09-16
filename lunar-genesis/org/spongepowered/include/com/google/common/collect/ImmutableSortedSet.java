package org.spongepowered.include.com.google.common.collect;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Spliterator;
import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;
import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.spongepowered.include.com.google.errorprone.annotations.concurrent.LazyInit;

public abstract class ImmutableSortedSet<E> extends ImmutableSortedSetFauxverideShim<E> implements NavigableSet<E>, SortedIterable<E> {
   final transient Comparator<? super E> comparator;
   @LazyInit
   transient ImmutableSortedSet<E> descendingSet;

   ImmutableSortedSet(Comparator<? super E> var1) {
      this.comparator = var1;
   }

   @Override
   public Comparator<? super E> comparator() {
      return this.comparator;
   }

   @Override
   public abstract UnmodifiableIterator<E> iterator();

   public ImmutableSortedSet<E> headSet(E var1) {
      return this.headSet((E)var1, false);
   }

   public ImmutableSortedSet<E> headSet(E var1, boolean var2) {
      return this.headSetImpl(Preconditions.checkNotNull((E)var1), var2);
   }

   public ImmutableSortedSet<E> subSet(E var1, E var2) {
      return this.subSet((E)var1, true, (E)var2, false);
   }

   public ImmutableSortedSet<E> subSet(E var1, boolean var2, E var3, boolean var4) {
      Preconditions.checkNotNull(var1);
      Preconditions.checkNotNull(var3);
      Preconditions.checkArgument(this.comparator.compare((E)var1, (E)var3) <= 0);
      return this.subSetImpl((E)var1, var2, (E)var3, var4);
   }

   public ImmutableSortedSet<E> tailSet(E var1) {
      return this.tailSet((E)var1, true);
   }

   public ImmutableSortedSet<E> tailSet(E var1, boolean var2) {
      return this.tailSetImpl(Preconditions.checkNotNull((E)var1), var2);
   }

   abstract ImmutableSortedSet<E> headSetImpl(E var1, boolean var2);

   abstract ImmutableSortedSet<E> subSetImpl(E var1, boolean var2, E var3, boolean var4);

   abstract ImmutableSortedSet<E> tailSetImpl(E var1, boolean var2);

   @Override
   public E lower(E var1) {
      return Iterators.getNext(this.headSet((E)var1, false).descendingIterator(), null);
   }

   @Override
   public E floor(E var1) {
      return Iterators.getNext(this.headSet((E)var1, true).descendingIterator(), null);
   }

   @Override
   public E ceiling(E var1) {
      return Iterables.getFirst(this.tailSet((E)var1, true), null);
   }

   @Override
   public E higher(E var1) {
      return Iterables.getFirst(this.tailSet((E)var1, false), null);
   }

   @Override
   public E first() {
      return this.iterator().next();
   }

   @Override
   public E last() {
      return this.descendingIterator().next();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final E pollFirst() {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final E pollLast() {
      throw new UnsupportedOperationException();
   }

   public ImmutableSortedSet<E> descendingSet() {
      ImmutableSortedSet var1 = this.descendingSet;
      if (var1 == null) {
         var1 = this.descendingSet = this.createDescendingSet();
         var1.descendingSet = this;
      }

      return var1;
   }

   ImmutableSortedSet<E> createDescendingSet() {
      return new DescendingImmutableSortedSet<>(this);
   }

   @Override
   public Spliterator<E> spliterator() {
      return new AbstractSpliterator<E>(this.size(), 1365) {
         final UnmodifiableIterator<E> iterator = ImmutableSortedSet.this.iterator();

         @Override
         public boolean tryAdvance(Consumer<? super E> var1) {
            if (this.iterator.hasNext()) {
               var1.accept(this.iterator.next());
               return true;
            } else {
               return false;
            }
         }

         @Override
         public Comparator<? super E> getComparator() {
            return ImmutableSortedSet.this.comparator;
         }
      };
   }

   public abstract UnmodifiableIterator<E> descendingIterator();
}
