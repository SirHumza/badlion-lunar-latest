package org.spongepowered.include.com.google.common.collect;

import java.util.Collections;
import java.util.Spliterator;
import org.spongepowered.include.com.google.common.primitives.Ints;

public final class Multisets {
   private static final Ordering<Multiset.Entry<?>> DECREASING_COUNT_ORDERING = new Ordering<Multiset.Entry<?>>() {
      public int compare(Multiset.Entry<?> var1, Multiset.Entry<?> var2) {
         return Ints.compare(var2.getCount(), var1.getCount());
      }
   };

   static <E> Spliterator<E> spliteratorImpl(Multiset<E> var0) {
      Spliterator var1 = var0.entrySet().spliterator();
      return CollectSpliterators.flatMap(
         var1,
         var0x -> (Spliterator<E>)Collections.nCopies(var0x.getCount(), var0x.getElement()).spliterator(),
         64 | var1.characteristics() & 1296,
         var0.size()
      );
   }
}
