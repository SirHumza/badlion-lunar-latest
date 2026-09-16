package org.spongepowered.include.com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Function;
import org.spongepowered.include.com.google.common.base.Objects;
import org.spongepowered.include.com.google.common.base.Preconditions;

public final class Lists {
   public static <E> ArrayList<E> newArrayList() {
      return new ArrayList<>();
   }

   public static <F, T> List<T> transform(List<F> var0, Function<? super F, ? extends T> var1) {
      return var0 instanceof RandomAccess ? new Lists.TransformingRandomAccessList<>(var0, var1) : new Lists.TransformingSequentialList<>(var0, var1);
   }

   static boolean equalsImpl(List<?> var0, @Nullable Object var1) {
      if (var1 == Preconditions.checkNotNull(var0)) {
         return true;
      }

      if (!(var1 instanceof List)) {
         return false;
      }

      List var2 = (List)var1;
      int var3 = var0.size();
      if (var3 != var2.size()) {
         return false;
      }

      if (var0 instanceof RandomAccess && var2 instanceof RandomAccess) {
         for (int var4 = 0; var4 < var3; var4++) {
            if (!Objects.equal(var0.get(var4), var2.get(var4))) {
               return false;
            }
         }

         return true;
      } else {
         return Iterators.elementsEqual(var0.iterator(), var2.iterator());
      }
   }

   static int indexOfImpl(List<?> var0, @Nullable Object var1) {
      if (var0 instanceof RandomAccess) {
         return indexOfRandomAccess(var0, var1);
      }

      ListIterator var2 = var0.listIterator();

      while (var2.hasNext()) {
         if (Objects.equal(var1, var2.next())) {
            return var2.previousIndex();
         }
      }

      return -1;
   }

   private static int indexOfRandomAccess(List<?> var0, @Nullable Object var1) {
      int var2 = var0.size();
      if (var1 == null) {
         for (int var3 = 0; var3 < var2; var3++) {
            if (var0.get(var3) == null) {
               return var3;
            }
         }
      } else {
         for (int var4 = 0; var4 < var2; var4++) {
            if (var1.equals(var0.get(var4))) {
               return var4;
            }
         }
      }

      return -1;
   }

   static int lastIndexOfImpl(List<?> var0, @Nullable Object var1) {
      if (var0 instanceof RandomAccess) {
         return lastIndexOfRandomAccess(var0, var1);
      }

      ListIterator var2 = var0.listIterator(var0.size());

      while (var2.hasPrevious()) {
         if (Objects.equal(var1, var2.previous())) {
            return var2.nextIndex();
         }
      }

      return -1;
   }

   private static int lastIndexOfRandomAccess(List<?> var0, @Nullable Object var1) {
      if (var1 == null) {
         for (int var2 = var0.size() - 1; var2 >= 0; var2--) {
            if (var0.get(var2) == null) {
               return var2;
            }
         }
      } else {
         for (int var3 = var0.size() - 1; var3 >= 0; var3--) {
            if (var1.equals(var0.get(var3))) {
               return var3;
            }
         }
      }

      return -1;
   }

   private static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements Serializable, RandomAccess {
      final List<F> fromList;
      final Function<? super F, ? extends T> function;

      TransformingRandomAccessList(List<F> var1, Function<? super F, ? extends T> var2) {
         this.fromList = Preconditions.checkNotNull(var1);
         this.function = Preconditions.checkNotNull(var2);
      }

      @Override
      public void clear() {
         this.fromList.clear();
      }

      @Override
      public T get(int var1) {
         return (T)this.function.apply(this.fromList.get(var1));
      }

      @Override
      public Iterator<T> iterator() {
         return this.listIterator();
      }

      @Override
      public ListIterator<T> listIterator(int var1) {
         return new TransformedListIterator<F, T>(this.fromList.listIterator(var1)) {
            @Override
            T transform(F var1) {
               return (T)TransformingRandomAccessList.this.function.apply((F)var1);
            }
         };
      }

      @Override
      public boolean isEmpty() {
         return this.fromList.isEmpty();
      }

      @Override
      public boolean removeIf(Predicate<? super T> var1) {
         Preconditions.checkNotNull(var1);
         return this.fromList.removeIf(var2 -> var1.test((T)this.function.apply(var2)));
      }

      @Override
      public T remove(int var1) {
         return (T)this.function.apply(this.fromList.remove(var1));
      }

      @Override
      public int size() {
         return this.fromList.size();
      }
   }

   private static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
      final List<F> fromList;
      final Function<? super F, ? extends T> function;

      TransformingSequentialList(List<F> var1, Function<? super F, ? extends T> var2) {
         this.fromList = Preconditions.checkNotNull(var1);
         this.function = Preconditions.checkNotNull(var2);
      }

      @Override
      public void clear() {
         this.fromList.clear();
      }

      @Override
      public int size() {
         return this.fromList.size();
      }

      @Override
      public ListIterator<T> listIterator(int var1) {
         return new TransformedListIterator<F, T>(this.fromList.listIterator(var1)) {
            @Override
            T transform(F var1) {
               return (T)TransformingSequentialList.this.function.apply((F)var1);
            }
         };
      }

      @Override
      public boolean removeIf(Predicate<? super T> var1) {
         Preconditions.checkNotNull(var1);
         return this.fromList.removeIf(var2 -> var1.test((T)this.function.apply(var2)));
      }
   }
}
