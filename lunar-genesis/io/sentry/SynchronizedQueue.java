package io.sentry;

import java.util.Queue;

final class SynchronizedQueue<E> extends SynchronizedCollection<E> implements Queue<E> {
   private static final long serialVersionUID = 1L;

   static <E> SynchronizedQueue<E> synchronizedQueue(Queue<E> var0) {
      return new SynchronizedQueue<>(var0);
   }

   private SynchronizedQueue(Queue<E> var1) {
      super(var1);
   }

   protected SynchronizedQueue(Queue<E> var1, Object var2) {
      super(var1, var2);
   }

   protected Queue<E> decorated() {
      return (Queue<E>)super.decorated();
   }

   @Override
   public E element() {
      synchronized (this.lock) {
         return this.decorated().element();
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      synchronized (this.lock) {
         return this.decorated().equals(var1);
      }
   }

   @Override
   public int hashCode() {
      synchronized (this.lock) {
         return this.decorated().hashCode();
      }
   }

   @Override
   public boolean offer(E var1) {
      synchronized (this.lock) {
         return this.decorated().offer((E)var1);
      }
   }

   @Override
   public E peek() {
      synchronized (this.lock) {
         return this.decorated().peek();
      }
   }

   @Override
   public E poll() {
      synchronized (this.lock) {
         return this.decorated().poll();
      }
   }

   @Override
   public E remove() {
      synchronized (this.lock) {
         return this.decorated().remove();
      }
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
}
