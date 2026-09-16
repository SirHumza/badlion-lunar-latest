package org.spongepowered.include.com.google.common.collect;

import javax.annotation.Nullable;

class DescendingImmutableSortedSet<E> extends ImmutableSortedSet<E> {
   private final ImmutableSortedSet<E> forward;

   DescendingImmutableSortedSet(ImmutableSortedSet<E> var1) {
      super(Ordering.from(var1.comparator()).reverse());
      this.forward = var1;
   }

   @Override
   public boolean contains(@Nullable Object var1) {
      return this.forward.contains(var1);
   }

   @Override
   public int size() {
      return this.forward.size();
   }

   @Override
   public UnmodifiableIterator<E> iterator() {
      return this.forward.descendingIterator();
   }

   @Override
   ImmutableSortedSet<E> headSetImpl(E var1, boolean var2) {
      return this.forward.tailSet((E)var1, var2).descendingSet();
   }

   @Override
   ImmutableSortedSet<E> subSetImpl(E var1, boolean var2, E var3, boolean var4) {
      return this.forward.subSet((E)var3, var4, (E)var1, var2).descendingSet();
   }

   @Override
   ImmutableSortedSet<E> tailSetImpl(E var1, boolean var2) {
      return this.forward.headSet((E)var1, var2).descendingSet();
   }

   @Override
   public ImmutableSortedSet<E> descendingSet() {
      return this.forward;
   }

   @Override
   public UnmodifiableIterator<E> descendingIterator() {
      return this.forward.iterator();
   }

   @Override
   ImmutableSortedSet<E> createDescendingSet() {
      throw new AssertionError("should never be called");
   }

   @Override
   public E lower(E var1) {
      return this.forward.higher((E)var1);
   }

   @Override
   public E floor(E var1) {
      return this.forward.ceiling((E)var1);
   }

   @Override
   public E ceiling(E var1) {
      return this.forward.floor((E)var1);
   }

   @Override
   public E higher(E var1) {
      return this.forward.lower((E)var1);
   }
}
