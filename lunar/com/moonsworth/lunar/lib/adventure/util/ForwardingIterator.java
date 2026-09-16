package com.moonsworth.lunar.lib.adventure.util;

import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;

public final class ForwardingIterator<T> implements Iterable<T> {
   private final Supplier<Iterator<T>> iterator;
   private final Supplier<Spliterator<T>> spliterator;

   public ForwardingIterator(@NotNull Supplier<Iterator<T>> var1, @NotNull Supplier<Spliterator<T>> var2) {
      this.iterator = Objects.requireNonNull(var1, "iterator");
      this.spliterator = Objects.requireNonNull(var2, "spliterator");
   }

   @NotNull
   @Override
   public Iterator<T> iterator() {
      return this.iterator.get();
   }

   @NotNull
   @Override
   public Spliterator<T> spliterator() {
      return this.spliterator.get();
   }
}
