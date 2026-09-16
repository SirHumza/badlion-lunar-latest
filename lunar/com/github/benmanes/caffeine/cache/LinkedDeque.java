package com.github.benmanes.caffeine.cache;

import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.qual.Nullable;

interface LinkedDeque<E> extends Deque<E> {
   boolean isFirst(E var1);

   boolean isLast(E var1);

   void moveToFront(E var1);

   void moveToBack(E var1);

   @Nullable E getPrevious(E var1);

   void setPrevious(E var1, @Nullable E var2);

   @Nullable E getNext(E var1);

   void setNext(E var1, @Nullable E var2);

   LinkedDeque.PeekingIterator<E> iterator();

   LinkedDeque.PeekingIterator<E> descendingIterator();

   interface PeekingIterator<E> extends Iterator<E> {
      @Nullable E peek();

      static <E> LinkedDeque.PeekingIterator<E> concat(final LinkedDeque.PeekingIterator<E> var0, final LinkedDeque.PeekingIterator<E> var1) {
         return new LinkedDeque.PeekingIterator<E>() {
            @Override
            public boolean hasNext() {
               return var0.hasNext() || var1.hasNext();
            }

            @Override
            public E next() {
               if (var0.hasNext()) {
                  return (E)var0.next();
               } else if (var1.hasNext()) {
                  return (E)var1.next();
               } else {
                  throw new NoSuchElementException();
               }
            }

            @Override
            public @Nullable E peek() {
               return (E)(var0.hasNext() ? var0.peek() : var1.peek());
            }
         };
      }

      static <E> LinkedDeque.PeekingIterator<E> comparing(
         final LinkedDeque.PeekingIterator<E> var0, final LinkedDeque.PeekingIterator<E> var1, final Comparator<E> var2
      ) {
         return new LinkedDeque.PeekingIterator<E>() {
            @Override
            public boolean hasNext() {
               return var0.hasNext() || var1.hasNext();
            }

            @Override
            public E next() {
               if (!var0.hasNext()) {
                  return (E)var1.next();
               }

               if (!var1.hasNext()) {
                  return (E)var0.next();
               }

               Object var1x = var0.peek();
               Object var2x = var1.peek();
               boolean var3 = var2.compare(var1x, var2x) >= 0;
               return (E)(var3 ? var0.next() : var1.next());
            }

            @Override
            public @Nullable E peek() {
               if (!var0.hasNext()) {
                  return (E)var1.peek();
               }

               if (!var1.hasNext()) {
                  return (E)var0.peek();
               }

               Object var1x = var0.peek();
               Object var2x = var1.peek();
               boolean var3 = var2.compare(var1x, var2x) >= 0;
               return (E)(var3 ? var0.peek() : var1.peek());
            }
         };
      }
   }
}
