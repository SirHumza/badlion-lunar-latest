package org.spongepowered.include.com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;

public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
   public static <E> ImmutableList<E> of() {
      return (ImmutableList<E>)RegularImmutableList.EMPTY;
   }

   public static <E> ImmutableList<E> of(E var0) {
      return new SingletonImmutableList<>((E)var0);
   }

   public static <E> ImmutableList<E> of(E var0, E var1) {
      return construct(var0, var1);
   }

   public static <E> ImmutableList<E> of(E var0, E var1, E var2) {
      return construct(var0, var1, var2);
   }

   public static <E> ImmutableList<E> of(E var0, E var1, E var2, E var3, E var4, E var5, E var6) {
      return construct(var0, var1, var2, var3, var4, var5, var6);
   }

   private static <E> ImmutableList<E> construct(Object... var0) {
      return asImmutableList(ObjectArrays.checkElementsNotNull(var0));
   }

   static <E> ImmutableList<E> asImmutableList(Object[] var0) {
      return asImmutableList(var0, var0.length);
   }

   static <E> ImmutableList<E> asImmutableList(Object[] var0, int var1) {
      switch (var1) {
         case 0:
            return of();
         case 1:
            return new SingletonImmutableList<>((E)var0[0]);
         default:
            if (var1 < var0.length) {
               var0 = Arrays.copyOf(var0, var1);
            }

            return new RegularImmutableList<>(var0);
      }
   }

   ImmutableList() {
   }

   @Override
   public UnmodifiableIterator<E> iterator() {
      return this.listIterator();
   }

   public UnmodifiableListIterator<E> listIterator() {
      return this.listIterator(0);
   }

   public UnmodifiableListIterator<E> listIterator(int var1) {
      return new AbstractIndexedListIterator<E>(this.size(), var1) {
         @Override
         protected E get(int var1) {
            return (E)ImmutableList.this.get(var1);
         }
      };
   }

   @Override
   public void forEach(Consumer<? super E> var1) {
      Preconditions.checkNotNull(var1);
      int var2 = this.size();

      for (int var3 = 0; var3 < var2; var3++) {
         var1.accept(this.get(var3));
      }
   }

   @Override
   public int indexOf(@Nullable Object var1) {
      return var1 == null ? -1 : Lists.indexOfImpl(this, var1);
   }

   @Override
   public int lastIndexOf(@Nullable Object var1) {
      return var1 == null ? -1 : Lists.lastIndexOfImpl(this, var1);
   }

   @Override
   public boolean contains(@Nullable Object var1) {
      return this.indexOf(var1) >= 0;
   }

   public ImmutableList<E> subList(int var1, int var2) {
      Preconditions.checkPositionIndexes(var1, var2, this.size());
      int var3 = var2 - var1;
      if (var3 == this.size()) {
         return this;
      }

      switch (var3) {
         case 0:
            return of();
         case 1:
            return of(this.get(var1));
         default:
            return this.subListUnchecked(var1, var2);
      }
   }

   ImmutableList<E> subListUnchecked(int var1, int var2) {
      return new ImmutableList.SubList(var1, var2 - var1);
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final boolean addAll(int var1, Collection<? extends E> var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final E set(int var1, E var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final void add(int var1, E var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final E remove(int var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final void replaceAll(UnaryOperator<E> var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final void sort(Comparator<? super E> var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public final ImmutableList<E> asList() {
      return this;
   }

   @Override
   public Spliterator<E> spliterator() {
      return CollectSpliterators.indexed(this.size(), 1296, this::get);
   }

   @Override
   int copyIntoArray(Object[] var1, int var2) {
      int var3 = this.size();

      for (int var4 = 0; var4 < var3; var4++) {
         var1[var2 + var4] = this.get(var4);
      }

      return var2 + var3;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      return Lists.equalsImpl(this, var1);
   }

   @Override
   public int hashCode() {
      int var1 = 1;
      int var2 = this.size();

      for (int var3 = 0; var3 < var2; var3++) {
         var1 = 31 * var1 + this.get(var3).hashCode();
         var1 = ~(~var1);
      }

      return var1;
   }

   public static <E> ImmutableList.Builder<E> builder() {
      return new ImmutableList.Builder<>();
   }

   public static final class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
      public Builder() {
         this(4);
      }

      Builder(int var1) {
         super(var1);
      }

      @CanIgnoreReturnValue
      public ImmutableList.Builder<E> add(E var1) {
         super.add((E)var1);
         return this;
      }

      @CanIgnoreReturnValue
      public ImmutableList.Builder<E> addAll(Iterable<? extends E> var1) {
         super.addAll(var1);
         return this;
      }

      @CanIgnoreReturnValue
      public ImmutableList.Builder<E> add(E... var1) {
         super.add((E[])var1);
         return this;
      }

      public ImmutableList<E> build() {
         return ImmutableList.asImmutableList(this.contents, this.size);
      }
   }

   class SubList extends ImmutableList<E> {
      final transient int offset;
      final transient int length;

      SubList(int var2, int var3) {
         this.offset = var2;
         this.length = var3;
      }

      @Override
      public int size() {
         return this.length;
      }

      @Override
      public E get(int var1) {
         Preconditions.checkElementIndex(var1, this.length);
         return ImmutableList.this.get(var1 + this.offset);
      }

      @Override
      public ImmutableList<E> subList(int var1, int var2) {
         Preconditions.checkPositionIndexes(var1, var2, this.length);
         return ImmutableList.this.subList(var1 + this.offset, var2 + this.offset);
      }
   }
}
