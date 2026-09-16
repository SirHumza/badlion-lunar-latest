package com.github.benmanes.caffeine.cache;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.qual.Nullable;

abstract class AbstractLinkedDeque<E> extends AbstractCollection<E> implements LinkedDeque<E> {
   @Nullable E first;
   @Nullable E last;
   int modCount;

   void linkFirst(E var1) {
      Object var2 = this.first;
      this.first = (E)var1;
      if (var2 == null) {
         this.last = (E)var1;
      } else {
         this.setPrevious((E)var2, (E)var1);
         this.setNext((E)var1, (E)var2);
      }

      this.modCount++;
   }

   void linkLast(E var1) {
      Object var2 = this.last;
      this.last = (E)var1;
      if (var2 == null) {
         this.first = (E)var1;
      } else {
         this.setNext((E)var2, (E)var1);
         this.setPrevious((E)var1, (E)var2);
      }

      this.modCount++;
   }

   E unlinkFirst() {
      Object var1 = this.first;
      Object var2 = this.getNext((E)var1);
      this.setNext((E)var1, null);
      this.first = (E)var2;
      if (var2 == null) {
         this.last = null;
      } else {
         this.setPrevious((E)var2, null);
      }

      this.modCount++;
      return (E)var1;
   }

   E unlinkLast() {
      Object var1 = this.last;
      Object var2 = this.getPrevious((E)var1);
      this.setPrevious((E)var1, null);
      this.last = (E)var2;
      if (var2 == null) {
         this.first = null;
      } else {
         this.setNext((E)var2, null);
      }

      this.modCount++;
      return (E)var1;
   }

   void unlink(E var1) {
      Object var2 = this.getPrevious((E)var1);
      Object var3 = this.getNext((E)var1);
      if (var2 == null) {
         this.first = (E)var3;
      } else {
         this.setNext((E)var2, (E)var3);
         this.setPrevious((E)var1, null);
      }

      if (var3 == null) {
         this.last = (E)var2;
      } else {
         this.setPrevious((E)var3, (E)var2);
         this.setNext((E)var1, null);
      }

      this.modCount++;
   }

   @Override
   public boolean isEmpty() {
      return this.first == null;
   }

   void checkNotEmpty() {
      if (this.isEmpty()) {
         throw new NoSuchElementException();
      }
   }

   @Override
   public int size() {
      int var1 = 0;

      for (Object var2 = this.first; var2 != null; var2 = this.getNext((E)var2)) {
         var1++;
      }

      return var1;
   }

   @Override
   public void clear() {
      Object var1 = this.first;

      while (var1 != null) {
         Object var2 = this.getNext((E)var1);
         this.setPrevious((E)var1, null);
         this.setNext((E)var1, null);
         var1 = var2;
      }

      this.first = this.last = null;
      this.modCount++;
   }

   @Override
   public abstract boolean contains(Object var1);

   @Override
   public boolean isFirst(E var1) {
      return var1 != null && var1 == this.first;
   }

   @Override
   public boolean isLast(E var1) {
      return var1 != null && var1 == this.last;
   }

   @Override
   public void moveToFront(E var1) {
      if (var1 != this.first) {
         this.unlink((E)var1);
         this.linkFirst((E)var1);
      }
   }

   @Override
   public void moveToBack(E var1) {
      if (var1 != this.last) {
         this.unlink((E)var1);
         this.linkLast((E)var1);
      }
   }

   @Override
   public @Nullable E peek() {
      return this.peekFirst();
   }

   @Override
   public @Nullable E peekFirst() {
      return this.first;
   }

   @Override
   public @Nullable E peekLast() {
      return this.last;
   }

   @Override
   public E getFirst() {
      this.checkNotEmpty();
      return this.peekFirst();
   }

   @Override
   public E getLast() {
      this.checkNotEmpty();
      return this.peekLast();
   }

   @Override
   public E element() {
      return this.getFirst();
   }

   @Override
   public boolean offer(E var1) {
      return this.offerLast((E)var1);
   }

   @Override
   public boolean offerFirst(E var1) {
      if (this.contains(var1)) {
         return false;
      }

      this.linkFirst((E)var1);
      return true;
   }

   @Override
   public boolean offerLast(E var1) {
      if (this.contains(var1)) {
         return false;
      }

      this.linkLast((E)var1);
      return true;
   }

   @Override
   public boolean add(E var1) {
      return this.offerLast((E)var1);
   }

   @Override
   public void addFirst(E var1) {
      if (!this.offerFirst((E)var1)) {
         throw new IllegalArgumentException();
      }
   }

   @Override
   public void addLast(E var1) {
      if (!this.offerLast((E)var1)) {
         throw new IllegalArgumentException();
      }
   }

   @Override
   public @Nullable E poll() {
      return this.pollFirst();
   }

   @Override
   public @Nullable E pollFirst() {
      return this.isEmpty() ? null : this.unlinkFirst();
   }

   @Override
   public @Nullable E pollLast() {
      return this.isEmpty() ? null : this.unlinkLast();
   }

   @Override
   public E remove() {
      return this.removeFirst();
   }

   @Override
   public E removeFirst() {
      this.checkNotEmpty();
      return this.pollFirst();
   }

   @Override
   public abstract boolean remove(Object var1);

   @Override
   public boolean removeFirstOccurrence(Object var1) {
      return this.remove(var1);
   }

   @Override
   public E removeLast() {
      this.checkNotEmpty();
      return this.pollLast();
   }

   @Override
   public boolean removeLastOccurrence(Object var1) {
      return this.remove(var1);
   }

   @Override
   public boolean removeAll(Collection<?> var1) {
      boolean var2 = false;

      for (Object var4 : var1) {
         var2 |= this.remove(var4);
      }

      return var2;
   }

   @Override
   public void push(E var1) {
      this.addFirst((E)var1);
   }

   @Override
   public E pop() {
      return this.removeFirst();
   }

   @Override
   public LinkedDeque.PeekingIterator<E> iterator() {
      return new AbstractLinkedDeque<E>.AbstractLinkedIterator(this.first) {
         @Override
         @Nullable E computeNext() {
            return (E)AbstractLinkedDeque.this.getNext(this.cursor);
         }
      };
   }

   @Override
   public LinkedDeque.PeekingIterator<E> descendingIterator() {
      return new AbstractLinkedDeque<E>.AbstractLinkedIterator(this.last) {
         @Override
         @Nullable E computeNext() {
            return (E)AbstractLinkedDeque.this.getPrevious(this.cursor);
         }
      };
   }

   abstract class AbstractLinkedIterator implements LinkedDeque.PeekingIterator<E> {
      @Nullable Object previous;
      @Nullable Object cursor;
      int expectedModCount = AbstractLinkedDeque.this.modCount;

      AbstractLinkedIterator(@Nullable E var2) {
         this.cursor = var2;
      }

      @Override
      public boolean hasNext() {
         this.checkForComodification();
         return this.cursor != null;
      }

      @Override
      public @Nullable E peek() {
         return (E)this.cursor;
      }

      @Override
      public E next() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         }

         this.previous = this.cursor;
         this.cursor = this.computeNext();
         return (E)this.previous;
      }

      abstract @Nullable E computeNext();

      @Override
      public void remove() {
         if (this.previous == null) {
            throw new IllegalStateException();
         }

         this.checkForComodification();
         AbstractLinkedDeque.this.remove(this.previous);
         this.expectedModCount = AbstractLinkedDeque.this.modCount;
         this.previous = null;
      }

      void checkForComodification() {
         if (AbstractLinkedDeque.this.modCount != this.expectedModCount) {
            throw new ConcurrentModificationException();
         }
      }
   }
}
