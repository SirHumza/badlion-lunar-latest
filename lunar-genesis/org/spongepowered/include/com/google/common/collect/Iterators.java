package org.spongepowered.include.com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Function;
import org.spongepowered.include.com.google.common.base.Objects;
import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.common.base.Predicate;
import org.spongepowered.include.com.google.common.base.Predicates;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;

public final class Iterators {
   static final UnmodifiableListIterator<Object> EMPTY_LIST_ITERATOR = new UnmodifiableListIterator<Object>() {
      @Override
      public boolean hasNext() {
         return false;
      }

      @Override
      public Object next() {
         throw new NoSuchElementException();
      }

      @Override
      public boolean hasPrevious() {
         return false;
      }

      @Override
      public Object previous() {
         throw new NoSuchElementException();
      }

      @Override
      public int nextIndex() {
         return 0;
      }

      @Override
      public int previousIndex() {
         return -1;
      }
   };
   private static final Iterator<Object> EMPTY_MODIFIABLE_ITERATOR = new Iterator<Object>() {
      @Override
      public boolean hasNext() {
         return false;
      }

      @Override
      public Object next() {
         throw new NoSuchElementException();
      }

      @Override
      public void remove() {
         CollectPreconditions.checkRemove(false);
      }
   };

   static <T> UnmodifiableIterator<T> emptyIterator() {
      return emptyListIterator();
   }

   static <T> UnmodifiableListIterator<T> emptyListIterator() {
      return (UnmodifiableListIterator<T>)EMPTY_LIST_ITERATOR;
   }

   public static <T> UnmodifiableIterator<T> unmodifiableIterator(final Iterator<? extends T> var0) {
      Preconditions.checkNotNull(var0);
      return var0 instanceof UnmodifiableIterator ? (UnmodifiableIterator)var0 : new UnmodifiableIterator<T>() {
         @Override
         public boolean hasNext() {
            return var0.hasNext();
         }

         @Override
         public T next() {
            return (T)var0.next();
         }
      };
   }

   public static boolean contains(Iterator<?> var0, @Nullable Object var1) {
      return any(var0, Predicates.equalTo(var1));
   }

   @CanIgnoreReturnValue
   public static boolean removeAll(Iterator<?> var0, Collection<?> var1) {
      return removeIf(var0, Predicates.in(var1));
   }

   @CanIgnoreReturnValue
   public static <T> boolean removeIf(Iterator<T> var0, Predicate<? super T> var1) {
      Preconditions.checkNotNull(var1);
      boolean var2 = false;

      while (var0.hasNext()) {
         if (var1.apply(var0.next())) {
            var0.remove();
            var2 = true;
         }
      }

      return var2;
   }

   public static boolean elementsEqual(Iterator<?> var0, Iterator<?> var1) {
      while (var0.hasNext()) {
         if (!var1.hasNext()) {
            return false;
         }

         Object var2 = var0.next();
         Object var3 = var1.next();
         if (!Objects.equal(var2, var3)) {
            return false;
         }
      }

      return !var1.hasNext();
   }

   public static String toString(Iterator<?> var0) {
      return Collections2.STANDARD_JOINER.appendTo(new StringBuilder().append('['), var0).append(']').toString();
   }

   public static <T> Iterator<T> concat(Iterator<? extends Iterator<? extends T>> var0) {
      return new Iterators.ConcatenatedIterator<>(var0);
   }

   public static <T> UnmodifiableIterator<T> filter(final Iterator<T> var0, final Predicate<? super T> var1) {
      Preconditions.checkNotNull(var0);
      Preconditions.checkNotNull(var1);
      return new AbstractIterator<T>() {
         @Override
         protected T computeNext() {
            while (var0.hasNext()) {
               Object var1x = var0.next();
               if (var1.apply(var1x)) {
                  return (T)var1x;
               }
            }

            return (T)this.endOfData();
         }
      };
   }

   public static <T> boolean any(Iterator<T> var0, Predicate<? super T> var1) {
      return indexOf(var0, var1) != -1;
   }

   public static <T> int indexOf(Iterator<T> var0, Predicate<? super T> var1) {
      Preconditions.checkNotNull(var1, "predicate");

      for (int var2 = 0; var0.hasNext(); var2++) {
         Object var3 = var0.next();
         if (var1.apply(var3)) {
            return var2;
         }
      }

      return -1;
   }

   public static <F, T> Iterator<T> transform(Iterator<F> var0, final Function<? super F, ? extends T> var1) {
      Preconditions.checkNotNull(var1);
      return new TransformedIterator<F, T>(var0) {
         @Override
         T transform(F var1x) {
            return (T)var1.apply(var1x);
         }
      };
   }

   @Nullable
   public static <T> T getNext(Iterator<? extends T> var0, @Nullable T var1) {
      return (T)(var0.hasNext() ? var0.next() : var1);
   }

   @Nullable
   static <T> T pollNext(Iterator<T> var0) {
      if (var0.hasNext()) {
         Object var1 = var0.next();
         var0.remove();
         return (T)var1;
      } else {
         return null;
      }
   }

   static void clear(Iterator<?> var0) {
      Preconditions.checkNotNull(var0);

      while (var0.hasNext()) {
         var0.next();
         var0.remove();
      }
   }

   @SafeVarargs
   public static <T> UnmodifiableIterator<T> forArray(T... var0) {
      return forArray((T[])var0, 0, var0.length, 0);
   }

   static <T> UnmodifiableListIterator<T> forArray(final T[] var0, final int var1, int var2, int var3) {
      Preconditions.checkArgument(var2 >= 0);
      int var4 = var1 + var2;
      Preconditions.checkPositionIndexes(var1, var4, var0.length);
      Preconditions.checkPositionIndex(var3, var2);
      return var2 == 0 ? emptyListIterator() : new AbstractIndexedListIterator<T>(var2, var3) {
         @Override
         protected T get(int var1x) {
            return (T)var0[var1 + var1x];
         }
      };
   }

   public static <T> UnmodifiableIterator<T> singletonIterator(@Nullable final T var0) {
      return new UnmodifiableIterator<T>() {
         boolean done;

         @Override
         public boolean hasNext() {
            return !this.done;
         }

         @Override
         public T next() {
            if (this.done) {
               throw new NoSuchElementException();
            }

            this.done = true;
            return (T)var0;
         }
      };
   }

   static <T> ListIterator<T> cast(Iterator<T> var0) {
      return (ListIterator<T>)var0;
   }

   private static class ConcatenatedIterator<T> extends MultitransformedIterator<Iterator<? extends T>, T> {
      public ConcatenatedIterator(Iterator<? extends Iterator<? extends T>> var1) {
         super(getComponentIterators(var1));
      }

      Iterator<? extends T> transform(Iterator<? extends T> var1) {
         return var1;
      }

      private static <T> Iterator<Iterator<? extends T>> getComponentIterators(Iterator<? extends Iterator<? extends T>> var0) {
         return new MultitransformedIterator<Iterator<? extends T>, Iterator<? extends T>>(var0) {
            Iterator<? extends Iterator<? extends T>> transform(Iterator<? extends T> var1) {
               if (var1 instanceof Iterators.ConcatenatedIterator) {
                  Iterators.ConcatenatedIterator var2 = (Iterators.ConcatenatedIterator)var1;
                  return Iterators.ConcatenatedIterator.getComponentIterators(var2.backingIterator);
               } else {
                  return Iterators.singletonIterator(var1);
               }
            }
         };
      }
   }
}
