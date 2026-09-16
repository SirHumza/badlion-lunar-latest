package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

class SynchronizedCollection<E> implements Serializable, Collection<E> {
   private static final long serialVersionUID = 2412805092710877986L;
   private final Collection<E> collection;
   final Object lock;

   public static <T> SynchronizedCollection<T> synchronizedCollection(Collection<T> var0) {
      return new SynchronizedCollection(var0);
   }

   SynchronizedCollection(Collection<E> var1) {
      if (var1 == null) {
         throw new NullPointerException("Collection must not be null.");
      }

      this.collection = var1;
      this.lock = this;
   }

   SynchronizedCollection(Collection<E> var1, Object var2) {
      if (var1 == null) {
         throw new NullPointerException("Collection must not be null.");
      }

      if (var2 == null) {
         throw new NullPointerException("Lock must not be null.");
      }

      this.collection = var1;
      this.lock = var2;
   }

   protected Collection<E> decorated() {
      return this.collection;
   }

   @Override
   public boolean add(E var1) {
      synchronized (this.lock) {
         return this.decorated().add((E)var1);
      }
   }

   @Override
   public boolean addAll(Collection<? extends E> var1) {
      synchronized (this.lock) {
         return this.decorated().addAll(var1);
      }
   }

   @Override
   public void clear() {
      synchronized (this.lock) {
         this.decorated().clear();
      }
   }

   @Override
   public boolean contains(Object var1) {
      synchronized (this.lock) {
         return this.decorated().contains(var1);
      }
   }

   @Override
   public boolean containsAll(Collection<?> var1) {
      synchronized (this.lock) {
         return this.decorated().containsAll(var1);
      }
   }

   @Override
   public boolean isEmpty() {
      synchronized (this.lock) {
         return this.decorated().isEmpty();
      }
   }

   @Override
   public Iterator<E> iterator() {
      return this.decorated().iterator();
   }

   @Override
   public Object[] toArray() {
      synchronized (this.lock) {
         return this.decorated().toArray();
      }
   }

   @Override
   public <T> T[] toArray(T[] var1) {
      synchronized (this.lock) {
         return (T[])this.decorated().toArray(var1);
      }
   }

   @Override
   public boolean remove(Object var1) {
      synchronized (this.lock) {
         return this.decorated().remove(var1);
      }
   }

   @Override
   public boolean removeAll(Collection<?> var1) {
      synchronized (this.lock) {
         return this.decorated().removeAll(var1);
      }
   }

   @Override
   public boolean retainAll(Collection<?> var1) {
      synchronized (this.lock) {
         return this.decorated().retainAll(var1);
      }
   }

   @Override
   public int size() {
      synchronized (this.lock) {
         return this.decorated().size();
      }
   }

   @Override
   public boolean equals(Object var1) {
      synchronized (this.lock) {
         return var1 == this ? true : var1 == this || this.decorated().equals(var1);
      }
   }

   @Override
   public int hashCode() {
      synchronized (this.lock) {
         return this.decorated().hashCode();
      }
   }

   @Override
   public String toString() {
      synchronized (this.lock) {
         return this.decorated().toString();
      }
   }
}
