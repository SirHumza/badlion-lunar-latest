package com.lunarclient;

import java.util.ListIterator;

public class ImmutableListIterator<T> extends ImmutableIterator<T> implements ListIterator<T> {
   private final ListIterator<T> inner;

   public ImmutableListIterator(ListIterator<T> var1) {
      super(var1);
      this.inner = var1;
   }

   @Override
   public boolean hasPrevious() {
      return this.inner.hasPrevious();
   }

   @Override
   public T previous() {
      return this.inner.previous();
   }

   @Override
   public int nextIndex() {
      return this.inner.nextIndex();
   }

   @Override
   public int previousIndex() {
      return this.inner.previousIndex();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException("Iterator is immutable!");
   }

   @Override
   public void set(T var1) {
      throw new UnsupportedOperationException("Iterator is immutable!");
   }

   @Override
   public void add(T var1) {
      throw new UnsupportedOperationException("Iterator is immutable!");
   }
}
