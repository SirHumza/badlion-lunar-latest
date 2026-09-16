package org.spongepowered.include.com.google.common.collect;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Preconditions;

final class CollectSpliterators {
   static <T> Spliterator<T> indexed(int var0, int var1, IntFunction<T> var2) {
      return indexed(var0, var1, var2, null);
   }

   static <T> Spliterator<T> indexed(int var0, final int var1, IntFunction<T> var2, final Comparator<? super T> var3) {
      if (var3 != null) {
         Preconditions.checkArgument((var1 & 4) != 0);
      }

      class 1WithCharacteristics implements Spliterator<T> {
         private final Spliterator<T> delegate;

         _WithCharacteristics/* $VF was: 1WithCharacteristics */(Spliterator<T> var1x) {
            this.delegate = var1x;
         }

         @Override
         public boolean tryAdvance(Consumer<? super T> var1x) {
            return this.delegate.tryAdvance(var1x);
         }

         @Override
         public void forEachRemaining(Consumer<? super T> var1x) {
            this.delegate.forEachRemaining(var1x);
         }

         @Nullable
         @Override
         public Spliterator<T> trySplit() {
            Spliterator var1x = this.delegate.trySplit();
            return var1x == null ? null : new 1WithCharacteristics(var1x);
         }

         @Override
         public long estimateSize() {
            return this.delegate.estimateSize();
         }

         @Override
         public int characteristics() {
            return this.delegate.characteristics() | var1;
         }

         @Override
         public Comparator<? super T> getComparator() {
            if (this.hasCharacteristics(4)) {
               return var3;
            } else {
               throw new IllegalStateException();
            }
         }
      }

      return new 1WithCharacteristics(IntStream.range(0, var0).<T>mapToObj(var2).spliterator());
   }

   static <F, T> Spliterator<T> map(final Spliterator<F> var0, final Function<? super F, ? extends T> var1) {
      Preconditions.checkNotNull(var0);
      Preconditions.checkNotNull(var1);
      return new Spliterator<T>() {
         @Override
         public boolean tryAdvance(Consumer<? super T> var1x) {
            return var0.tryAdvance(var2 -> var1x.accept(var1.apply(var2)));
         }

         @Override
         public void forEachRemaining(Consumer<? super T> var1x) {
            var0.forEachRemaining(var2 -> var1x.accept(var1.apply(var2)));
         }

         @Override
         public Spliterator<T> trySplit() {
            Spliterator var1x = var0.trySplit();
            return var1x != null ? CollectSpliterators.map(var1x, var1) : null;
         }

         @Override
         public long estimateSize() {
            return var0.estimateSize();
         }

         @Override
         public int characteristics() {
            return var0.characteristics() & -262;
         }
      };
   }

   static <F, T> Spliterator<T> flatMap(Spliterator<F> var0, final Function<? super F, Spliterator<T>> var1, int var2, long var3) {
      Preconditions.checkArgument((var2 & 16384) == 0, "flatMap does not support SUBSIZED characteristic");
      Preconditions.checkArgument((var2 & 4) == 0, "flatMap does not support SORTED characteristic");
      Preconditions.checkNotNull(var0);
      Preconditions.checkNotNull(var1);

      class 1FlatMapSpliterator implements Spliterator<T> {
         @Nullable
         Spliterator<T> prefix;
         final Spliterator<F> from;
         final int characteristics;
         long estimatedSize;

         _FlatMapSpliterator/* $VF was: 1FlatMapSpliterator */(Spliterator<T> var1x, Spliterator<F> var2, int var3, long var4) {
            this.prefix = var1x;
            this.from = var2;
            this.characteristics = var3;
            this.estimatedSize = var4;
         }

         @Override
         public boolean tryAdvance(Consumer<? super T> var1x) {
            while (this.prefix == null || !this.prefix.tryAdvance(var1x)) {
               this.prefix = null;
               if (!this.from.tryAdvance(var2 -> this.prefix = (Spliterator<T>)var1.apply(var2))) {
                  return false;
               }
            }

            if (this.estimatedSize != Long.MAX_VALUE) {
               this.estimatedSize--;
            }

            return true;
         }

         @Override
         public void forEachRemaining(Consumer<? super T> var1x) {
            if (this.prefix != null) {
               this.prefix.forEachRemaining(var1x);
               this.prefix = null;
            }

            this.from.forEachRemaining(var2 -> ((Spliterator)var1.apply(var2)).forEachRemaining(var1x));
            this.estimatedSize = 0L;
         }

         @Override
         public Spliterator<T> trySplit() {
            Spliterator var1x = this.from.trySplit();
            if (var1x != null) {
               int var6 = this.characteristics & -65;
               long var3 = this.estimateSize();
               if (var3 < Long.MAX_VALUE) {
                  var3 /= 2L;
                  this.estimatedSize -= var3;
               }

               1FlatMapSpliterator var5 = new 1FlatMapSpliterator(this.prefix, var1x, var6, var3);
               this.prefix = null;
               return var5;
            } else if (this.prefix != null) {
               Spliterator var2 = this.prefix;
               this.prefix = null;
               return var2;
            } else {
               return null;
            }
         }

         @Override
         public long estimateSize() {
            if (this.prefix != null) {
               this.estimatedSize = Math.max(this.estimatedSize, this.prefix.estimateSize());
            }

            return Math.max(this.estimatedSize, 0L);
         }

         @Override
         public int characteristics() {
            return this.characteristics;
         }
      }

      return new 1FlatMapSpliterator(null, var0, var2, var3);
   }
}
