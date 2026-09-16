package org.spongepowered.include.com.google.common.collect;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Function;
import org.spongepowered.include.com.google.common.base.Preconditions;

public final class Iterables {
   public static String toString(Iterable<?> var0) {
      return Iterators.toString(var0.iterator());
   }

   public static <T> Iterable<T> concat(Iterable<? extends T> var0, Iterable<? extends T> var1) {
      return FluentIterable.concat(var0, var1);
   }

   public static <F, T> Iterable<T> transform(final Iterable<F> var0, final Function<? super F, ? extends T> var1) {
      Preconditions.checkNotNull(var0);
      Preconditions.checkNotNull(var1);
      return new FluentIterable<T>() {
         @Override
         public Iterator<T> iterator() {
            return Iterators.transform(var0.iterator(), var1);
         }

         @Override
         public void forEach(Consumer<? super T> var1x) {
            Preconditions.checkNotNull(var1x);
            var0.forEach(var2 -> var1x.accept(var1.apply(var2)));
         }

         @Override
         public Spliterator<T> spliterator() {
            return CollectSpliterators.map(var0.spliterator(), var1);
         }
      };
   }

   @Nullable
   public static <T> T getFirst(Iterable<? extends T> var0, @Nullable T var1) {
      return Iterators.getNext(var0.iterator(), (T)var1);
   }

   static <T> Function<Iterable<? extends T>, Iterator<? extends T>> toIterator() {
      return new Function<Iterable<? extends T>, Iterator<? extends T>>() {
         public Iterator<? extends T> apply(Iterable<? extends T> var1) {
            return var1.iterator();
         }
      };
   }
}
