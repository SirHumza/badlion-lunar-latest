package io.sentry;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class CircularFifoQueue<E> extends AbstractCollection<E> implements Serializable, Queue<E> {
   private static final long serialVersionUID = -8423413834657610406L;
   @NotNull
   private transient E[] elements;
   private transient int start = 0;
   private transient int end = 0;
   private transient boolean full = false;
   private final int maxElements;

   public CircularFifoQueue() {
      this(32);
   }

   CircularFifoQueue(int var1) {
      if (var1 <= 0) {
         throw new IllegalArgumentException("The size must be greater than 0");
      }

      this.elements = (E[])(new Object[var1]);
      this.maxElements = this.elements.length;
   }

   public CircularFifoQueue(@NotNull Collection<? extends E> var1) {
      this(var1.size());
      this.addAll(var1);
   }

   private void writeObject(@NotNull ObjectOutputStream var1) {
      var1.defaultWriteObject();
      var1.writeInt(this.size());

      for (Object var3 : this) {
         var1.writeObject(var3);
      }
   }

   private void readObject(@NotNull ObjectInputStream var1) {
      var1.defaultReadObject();
      this.elements = (E[])(new Object[this.maxElements]);
      int var2 = var1.readInt();

      for (int var3 = 0; var3 < var2; var3++) {
         this.elements[var3] = (E)var1.readObject();
      }

      this.start = 0;
      this.full = var2 == this.maxElements;
      if (this.full) {
         this.end = 0;
      } else {
         this.end = var2;
      }
   }

   @Override
   public int size() {
      int var1 = 0;
      if (this.end < this.start) {
         var1 = this.maxElements - this.start + this.end;
      } else if (this.end == this.start) {
         var1 = this.full ? this.maxElements : 0;
      } else {
         var1 = this.end - this.start;
      }

      return var1;
   }

   @Override
   public boolean isEmpty() {
      return this.size() == 0;
   }

   public boolean isFull() {
      return false;
   }

   public boolean isAtFullCapacity() {
      return this.size() == this.maxElements;
   }

   public int maxSize() {
      return this.maxElements;
   }

   @Override
   public void clear() {
      this.full = false;
      this.start = 0;
      this.end = 0;
      Arrays.fill(this.elements, null);
   }

   @Override
   public boolean add(@NotNull E var1) {
      if (null == var1) {
         throw new NullPointerException("Attempted to add null object to queue");
      }

      if (this.isAtFullCapacity()) {
         this.remove();
      }

      this.elements[this.end++] = (E)var1;
      if (this.end >= this.maxElements) {
         this.end = 0;
      }

      if (this.end == this.start) {
         this.full = true;
      }

      return true;
   }

   @NotNull
   public E get(int var1) {
      int var2 = this.size();
      if (var1 >= 0 && var1 < var2) {
         int var3 = (this.start + var1) % this.maxElements;
         return this.elements[var3];
      } else {
         throw new NoSuchElementException(String.format("The specified index (%1$d) is outside the available range [0, %2$d)", var1, var2));
      }
   }

   @Override
   public boolean offer(@NotNull E var1) {
      return this.add((E)var1);
   }

   @Nullable
   @Override
   public E poll() {
      return this.isEmpty() ? null : this.remove();
   }

   @Nullable
   @Override
   public E element() {
      if (this.isEmpty()) {
         throw new NoSuchElementException("queue is empty");
      } else {
         return this.peek();
      }
   }

   @Nullable
   @Override
   public E peek() {
      return this.isEmpty() ? null : this.elements[this.start];
   }

   @NotNull
   @Override
   public E remove() {
      if (this.isEmpty()) {
         throw new NoSuchElementException("queue is empty");
      }

      Object var1 = this.elements[this.start];
      if (null != var1) {
         this.elements[this.start++] = null;
         if (this.start >= this.maxElements) {
            this.start = 0;
         }

         this.full = false;
      }

      return (E)var1;
   }

   private int increment(int var1) {
      if (++var1 >= this.maxElements) {
         var1 = 0;
      }

      return var1;
   }

   private int decrement(int var1) {
      if (--var1 < 0) {
         var1 = this.maxElements - 1;
      }

      return var1;
   }

   @NotNull
   @Override
   public Iterator<E> iterator() {
      return new Iterator<E>() {
         private int index = CircularFifoQueue.this.start;
         private int lastReturnedIndex = -1;
         private boolean isFirst = CircularFifoQueue.this.full;

         @Override
         public boolean hasNext() {
            return this.isFirst || this.index != CircularFifoQueue.this.end;
         }

         @Override
         public E next() {
            if (!this.hasNext()) {
               throw new NoSuchElementException();
            }

            this.isFirst = false;
            this.lastReturnedIndex = this.index;
            this.index = CircularFifoQueue.this.increment(this.index);
            return CircularFifoQueue.this.elements[this.lastReturnedIndex];
         }

         @Override
         public void remove() {
            if (this.lastReturnedIndex == -1) {
               throw new IllegalStateException();
            }

            if (this.lastReturnedIndex == CircularFifoQueue.this.start) {
               CircularFifoQueue.this.remove();
               this.lastReturnedIndex = -1;
            } else {
               int var1 = this.lastReturnedIndex + 1;
               if (CircularFifoQueue.this.start < this.lastReturnedIndex && var1 < CircularFifoQueue.this.end) {
                  System.arraycopy(
                     CircularFifoQueue.this.elements, var1, CircularFifoQueue.this.elements, this.lastReturnedIndex, CircularFifoQueue.this.end - var1
                  );
               } else {
                  while (var1 != CircularFifoQueue.this.end) {
                     if (var1 >= CircularFifoQueue.this.maxElements) {
                        CircularFifoQueue.this.elements[var1 - 1] = CircularFifoQueue.this.elements[0];
                        var1 = 0;
                     } else {
                        CircularFifoQueue.this.elements[CircularFifoQueue.this.decrement(var1)] = CircularFifoQueue.this.elements[var1];
                        var1 = CircularFifoQueue.this.increment(var1);
                     }
                  }
               }

               this.lastReturnedIndex = -1;
               CircularFifoQueue.this.end = CircularFifoQueue.this.decrement(CircularFifoQueue.this.end);
               CircularFifoQueue.this.elements[CircularFifoQueue.this.end] = null;
               CircularFifoQueue.this.full = false;
               this.index = CircularFifoQueue.this.decrement(this.index);
            }
         }
      };
   }
}
