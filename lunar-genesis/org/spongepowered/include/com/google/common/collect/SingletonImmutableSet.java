package org.spongepowered.include.com.google.common.collect;

import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.errorprone.annotations.concurrent.LazyInit;

final class SingletonImmutableSet<E> extends ImmutableSet<E> {
   final transient E element;
   @LazyInit
   private transient int cachedHashCode;

   SingletonImmutableSet(E var1) {
      this.element = Preconditions.checkNotNull((E)var1);
   }

   SingletonImmutableSet(E var1, int var2) {
      this.element = (E)var1;
      this.cachedHashCode = var2;
   }

   @Override
   public int size() {
      return 1;
   }

   @Override
   public boolean contains(Object var1) {
      return this.element.equals(var1);
   }

   @Override
   public UnmodifiableIterator<E> iterator() {
      return Iterators.singletonIterator(this.element);
   }

   @Override
   ImmutableList<E> createAsList() {
      return ImmutableList.of(this.element);
   }

   @Override
   int copyIntoArray(Object[] var1, int var2) {
      var1[var2] = this.element;
      return var2 + 1;
   }

   @Override
   public final int hashCode() {
      int var1 = this.cachedHashCode;
      if (var1 == 0) {
         this.cachedHashCode = var1 = this.element.hashCode();
      }

      return var1;
   }

   @Override
   boolean isHashCodeFast() {
      return this.cachedHashCode != 0;
   }

   @Override
   public String toString() {
      return '[' + this.element.toString() + ']';
   }
}
