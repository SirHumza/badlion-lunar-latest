package org.spongepowered.include.com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;

public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
   ImmutableCollection() {
   }

   public abstract UnmodifiableIterator<E> iterator();

   @Override
   public Spliterator<E> spliterator() {
      return Spliterators.spliterator(this, 1296);
   }

   @Override
   public final Object[] toArray() {
      int var1 = this.size();
      if (var1 == 0) {
         return ObjectArrays.EMPTY_ARRAY;
      }

      Object[] var2 = new Object[var1];
      this.copyIntoArray(var2, 0);
      return var2;
   }

   @CanIgnoreReturnValue
   @Override
   public final <T> T[] toArray(T[] var1) {
      Preconditions.checkNotNull(var1);
      int var2 = this.size();
      if (var1.length < var2) {
         var1 = ObjectArrays.newArray(var1, var2);
      } else if (var1.length > var2) {
         var1[var2] = null;
      }

      this.copyIntoArray(var1, 0);
      return (T[])var1;
   }

   @Override
   public abstract boolean contains(@Nullable Object var1);

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final boolean add(E var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final boolean remove(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final boolean addAll(Collection<? extends E> var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final boolean removeAll(Collection<?> var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final boolean removeIf(Predicate<? super E> var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final boolean retainAll(Collection<?> var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final void clear() {
      throw new UnsupportedOperationException();
   }

   public ImmutableList<E> asList() {
      switch (this.size()) {
         case 0:
            return ImmutableList.of();
         case 1:
            return ImmutableList.of(this.iterator().next());
         default:
            return new RegularImmutableAsList<>(this, this.toArray());
      }
   }

   @CanIgnoreReturnValue
   int copyIntoArray(Object[] var1, int var2) {
      for (Object var4 : this) {
         var1[var2++] = var4;
      }

      return var2;
   }

   abstract static class ArrayBasedBuilder<E> extends ImmutableCollection.Builder<E> {
      Object[] contents;
      int size;

      ArrayBasedBuilder(int var1) {
         CollectPreconditions.checkNonnegative(var1, "initialCapacity");
         this.contents = new Object[var1];
         this.size = 0;
      }

      private void ensureCapacity(int var1) {
         if (this.contents.length < var1) {
            this.contents = Arrays.copyOf(this.contents, expandedCapacity(this.contents.length, var1));
         }
      }

      @CanIgnoreReturnValue
      public ImmutableCollection.ArrayBasedBuilder<E> add(E var1) {
         Preconditions.checkNotNull(var1);
         this.ensureCapacity(this.size + 1);
         this.contents[this.size++] = var1;
         return this;
      }

      @CanIgnoreReturnValue
      @Override
      public ImmutableCollection.Builder<E> add(E... var1) {
         ObjectArrays.checkElementsNotNull(var1);
         this.ensureCapacity(this.size + var1.length);
         System.arraycopy(var1, 0, this.contents, this.size, var1.length);
         this.size += var1.length;
         return this;
      }

      @CanIgnoreReturnValue
      @Override
      public ImmutableCollection.Builder<E> addAll(Iterable<? extends E> var1) {
         if (var1 instanceof Collection) {
            Collection var2 = (Collection)var1;
            this.ensureCapacity(this.size + var2.size());
         }

         super.addAll(var1);
         return this;
      }
   }

   public abstract static class Builder<E> {
      static int expandedCapacity(int var0, int var1) {
         if (var1 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
         }

         int var2 = var0 + (var0 >> 1) + 1;
         if (var2 < var1) {
            var2 = Integer.highestOneBit(var1 - 1) << 1;
         }

         if (var2 < 0) {
            var2 = Integer.MAX_VALUE;
         }

         return var2;
      }

      Builder() {
      }

      @CanIgnoreReturnValue
      public abstract ImmutableCollection.Builder<E> add(E var1);

      @CanIgnoreReturnValue
      public ImmutableCollection.Builder<E> add(E... var1) {
         for (Object var5 : var1) {
            this.add((E)var5);
         }

         return this;
      }

      @CanIgnoreReturnValue
      public ImmutableCollection.Builder<E> addAll(Iterable<? extends E> var1) {
         for (Object var3 : var1) {
            this.add((E)var3);
         }

         return this;
      }
   }
}
