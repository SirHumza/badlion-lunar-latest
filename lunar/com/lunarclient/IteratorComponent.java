package com.lunarclient;

import java.util.Iterator;

public class ImmutableIterator<T> implements Iterator<T> {
   private final Iterator<T> inner;

   public ImmutableIterator(Iterator<T> var1) {
      this.inner = var1;
   }

   @Override
   public boolean hasNext() {
      return this.inner.hasNext();
   }

   @Override
   public T next() {
      return this.inner.next();
   }
}
