package org.spongepowered.include.com.google.common.collect;

import java.util.Iterator;
import org.spongepowered.include.com.google.common.base.Optional;
import org.spongepowered.include.com.google.common.base.Preconditions;

public abstract class FluentIterable<E> implements Iterable<E> {
   private final Optional<Iterable<E>> iterableDelegate = Optional.absent();

   protected FluentIterable() {
   }

   private Iterable<E> getDelegate() {
      return this.iterableDelegate.or(this);
   }

   public static <T> FluentIterable<T> concat(Iterable<? extends T> var0, Iterable<? extends T> var1) {
      return concat(ImmutableList.of(var0, var1));
   }

   public static <T> FluentIterable<T> concat(final Iterable<? extends Iterable<? extends T>> var0) {
      Preconditions.checkNotNull(var0);
      return new FluentIterable<T>() {
         @Override
         public Iterator<T> iterator() {
            return Iterators.concat(Iterables.transform(var0, Iterables.toIterator()).iterator());
         }
      };
   }

   @Override
   public String toString() {
      return Iterables.toString(this.getDelegate());
   }
}
