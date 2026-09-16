package com.lunarclient;

import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public class ImmutableCollection<T> implements Collection<T> {
   private final Collection<T> inner;

   public ImmutableCollection(Collection<T> var1) {
      this.inner = var1;
   }

   @Override
   public int size() {
      return this.inner.size();
   }

   @Override
   public boolean isEmpty() {
      return this.inner.isEmpty();
   }

   @Override
   public boolean contains(Object var1) {
      return this.inner.contains(var1);
   }

   @Override
   public Iterator<T> iterator() {
      return new ImmutableIterator<>(this.inner.iterator());
   }

   @Override
   public Object[] toArray() {
      return this.inner.toArray();
   }

   @Override
   public <T1> T1[] toArray(@NotNull T1[] var1) {
      return (T1[])this.inner.toArray(var1);
   }

   @Override
   public boolean add(T var1) {
      throw new UnsupportedOperationException("Collection is immutable!");
   }

   @Override
   public boolean remove(Object var1) {
      throw new UnsupportedOperationException("Collection is immutable!");
   }

   @Override
   public boolean containsAll(@NotNull Collection<?> var1) {
      return this.inner.containsAll(var1);
   }

   @Override
   public boolean addAll(@NotNull Collection<? extends T> var1) {
      throw new UnsupportedOperationException("Collection is immutable!");
   }

   @Override
   public boolean retainAll(@NotNull Collection<?> var1) {
      throw new UnsupportedOperationException("Collection is immutable!");
   }

   @Override
   public boolean removeAll(@NotNull Collection<?> var1) {
      throw new UnsupportedOperationException("Collection is immutable!");
   }

   @Override
   public void clear() {
      throw new UnsupportedOperationException("Collection is immutable!");
   }
}
