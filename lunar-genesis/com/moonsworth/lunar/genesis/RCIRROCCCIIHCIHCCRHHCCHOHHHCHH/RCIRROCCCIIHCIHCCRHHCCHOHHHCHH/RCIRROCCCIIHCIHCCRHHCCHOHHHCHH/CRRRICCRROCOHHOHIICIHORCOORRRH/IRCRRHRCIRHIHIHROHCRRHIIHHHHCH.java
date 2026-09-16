package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.j2objc.annotations.Weak;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.Spliterator.OfDouble;
import java.util.Spliterator.OfInt;
import java.util.Spliterator.OfLong;
import java.util.Spliterator.OfPrimitive;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
final class IRCRRHRCIRHIHIHROHCRRHIIHHHHCH {
   private IRCRRHRCIRHIHIHROHCRRHIIHHHHCH() {
   }

   static <T> Spliterator<T> indexed(int var0, int var1, IntFunction<T> var2) {
      return indexed(var0, var1, var2, null);
   }

   static <T> Spliterator<T> indexed(int var0, final int var1, final IntFunction<T> var2, final Comparator<? super T> var3) {
      if (var3 != null) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            (var1 & 4) != 0
         );
      }

      class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements Spliterator<T> {
         private final OfInt IIIOOCOCIRHHCIRCCHCCCHCOCIHOHC;

         IRCIIHHICIHRCOCRROCOICRIHHCCHH(OfInt var1x) {
            this.IIIOOCOCIRHHCIRCCHCCCHCOCIHOHC = var1x;
         }

         @Override
         public boolean tryAdvance(Consumer<? super T> var1x) {
            return this.IIIOOCOCIRHHCIRCCHCCCHCOCIHOHC.tryAdvance(var2xx -> var1x.accept(var2.apply(var2xx)));
         }

         @Override
         public void forEachRemaining(Consumer<? super T> var1x) {
            this.IIIOOCOCIRHHCIRCCHCCCHCOCIHOHC.forEachRemaining(var2xx -> var1x.accept(var2.apply(var2xx)));
         }

         @Override
         public @Nullable Spliterator<T> trySplit() {
            OfInt var1x = this.IIIOOCOCIRHHCIRCCHCCCHCOCIHOHC.trySplit();
            return var1x == null ? null : new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1x);
         }

         @Override
         public long estimateSize() {
            return this.IIIOOCOCIRHHCIRCCHCCCHCOCIHOHC.estimateSize();
         }

         @Override
         public int characteristics() {
            return 16464 | var1;
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

      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH(IntStream.range(0, var0).spliterator());
   }

   static <InElementT, OutElementT> Spliterator<OutElementT> map(
      final Spliterator<InElementT> var0, final Function<? super InElementT, ? extends OutElementT> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return new Spliterator<OutElementT>() {
         @Override
         public boolean tryAdvance(Consumer<? super OutElementT> var1x) {
            return var0.tryAdvance(var2 -> var1x.accept(var1.apply(var2)));
         }

         @Override
         public void forEachRemaining(Consumer<? super OutElementT> var1x) {
            var0.forEachRemaining(var2 -> var1x.accept(var1.apply(var2)));
         }

         @Override
         public Spliterator<OutElementT> trySplit() {
            Spliterator var1x = var0.trySplit();
            return var1x != null ? IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.map(var1x, var1) : null;
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

   static <T> Spliterator<T> filter(final Spliterator<T> var0, final Predicate<? super T> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );

      class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Spliterator<T>, Consumer<T> {
         Object holder = null;

         @Override
         public void accept(T var1x) {
            this.holder = var1x;
         }

         @Override
         public boolean tryAdvance(Consumer<? super T> var1x) {
            while (var0.tryAdvance(this)) {
               try {
                  if (var1.test(this.holder)) {
                     var1x.accept(this.holder);
                     return true;
                  }
               } finally {
                  this.holder = null;
               }
            }

            return false;
         }

         @Override
         public Spliterator<T> trySplit() {
            Spliterator var1x = var0.trySplit();
            return var1x == null ? null : IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.filter(var1x, var1);
         }

         @Override
         public long estimateSize() {
            return var0.estimateSize() / 2L;
         }

         @Override
         public Comparator<? super T> getComparator() {
            return var0.getComparator();
         }

         @Override
         public int characteristics() {
            return var0.characteristics() & 277;
         }
      }

      return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   static <InElementT, OutElementT> Spliterator<OutElementT> flatMap(
      Spliterator<InElementT> var0, Function<? super InElementT, Spliterator<OutElementT>> var1, int var2, long var3
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         (var2 & 16384) == 0, "flatMap does not support SUBSIZED characteristic"
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         (var2 & 4) == 0, "flatMap does not support SORTED characteristic"
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return new IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<>(null, var0, var1, var2, var3);
   }

   static <InElementT> OfInt flatMapToInt(Spliterator<InElementT> var0, Function<? super InElementT, OfInt> var1, int var2, long var3) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         (var2 & 16384) == 0, "flatMap does not support SUBSIZED characteristic"
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         (var2 & 4) == 0, "flatMap does not support SORTED characteristic"
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return new IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(null, var0, var1, var2, var3);
   }

   static <InElementT> OfLong flatMapToLong(Spliterator<InElementT> var0, Function<? super InElementT, OfLong> var1, int var2, long var3) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         (var2 & 16384) == 0, "flatMap does not support SUBSIZED characteristic"
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         (var2 & 4) == 0, "flatMap does not support SORTED characteristic"
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return new IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(null, var0, var1, var2, var3);
   }

   static <InElementT> OfDouble flatMapToDouble(Spliterator<InElementT> var0, Function<? super InElementT, OfDouble> var1, int var2, long var3) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         (var2 & 16384) == 0, "flatMap does not support SUBSIZED characteristic"
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         (var2 & 4) == 0, "flatMap does not support SORTED characteristic"
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return new IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRRRICCRROCOHHOHIICIHORCOORRRH(null, var0, var1, var2, var3);
   }

   static final class CRRRICCRROCOHHOHIICIHORCOORRRH<InElementT>
      extends IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<InElementT, Double, DoubleConsumer, OfDouble>
      implements OfDouble {
      CRRRICCRROCOHHOHIICIHORCOORRRH(OfDouble var1, Spliterator<InElementT> var2, Function<? super InElementT, OfDouble> var3, int var4, long var5) {
         super(var1, var2, var3, IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRRRICCRROCOHHOHIICIHORCOORRRH::new, var4, var5);
      }
   }

   abstract static class HHCCIRHCCCIIRHCROHIORHIRHHIORH<InElementT, OutElementT, OutSpliteratorT extends Spliterator<OutElementT>>
      implements Spliterator<OutElementT> {
      @Weak
      @Nullable OutSpliteratorT prefix;
      final Spliterator<InElementT> HCRHIHCCRIICCIHHRHHHHRIOOCHCHH;
      final Function<? super InElementT, OutSpliteratorT> OIHIIIRCCROHORIRORHRCOICCHRCCR;
      final IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<InElementT, OutSpliteratorT> RHIHRCOORRRCRRHCRCOHORHROROIRR;
      int characteristics;
      long estimatedSize;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         OutSpliteratorT var1,
         Spliterator<InElementT> var2,
         Function<? super InElementT, OutSpliteratorT> var3,
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<InElementT, OutSpliteratorT> var4,
         int var5,
         long var6
      ) {
         this.prefix = (OutSpliteratorT)var1;
         this.HCRHIHCCRIICCIHHRHHHHRIOOCHCHH = var2;
         this.OIHIIIRCCROHORIRORHRCOICCHRCCR = var3;
         this.RHIHRCOORRRCRRHCRCOHORHROROIRR = var4;
         this.characteristics = var5;
         this.estimatedSize = var6;
      }

      @Override
      public final boolean tryAdvance(Consumer<? super OutElementT> var1) {
         while (this.prefix == null || !this.prefix.tryAdvance(var1)) {
            this.prefix = null;
            if (!this.HCRHIHCCRIICCIHHRHHHHRIOOCHCHH.tryAdvance(var1x -> this.prefix = this.OIHIIIRCCROHORIRORHRCOICCHRCCR.apply(var1x))) {
               return false;
            }
         }

         if (this.estimatedSize != Long.MAX_VALUE) {
            this.estimatedSize--;
         }

         return true;
      }

      @Override
      public final void forEachRemaining(Consumer<? super OutElementT> var1) {
         if (this.prefix != null) {
            this.prefix.forEachRemaining(var1);
            this.prefix = null;
         }

         this.HCRHIHCCRIICCIHHRHHHHRIOOCHCHH.forEachRemaining(var2 -> {
            Spliterator var3 = this.OIHIIIRCCROHORIRORHRCOICCHRCCR.apply(var2);
            if (var3 != null) {
               var3.forEachRemaining(var1);
            }
         });
         this.estimatedSize = 0L;
      }

      @Override
      public final OutSpliteratorT trySplit() {
         Spliterator var1 = this.HCRHIHCCRIICCIHHRHHHHRIOOCHCHH.trySplit();
         if (var1 != null) {
            int var6 = this.characteristics & -65;
            long var3 = this.estimateSize();
            if (var3 < Long.MAX_VALUE) {
               var3 /= 2L;
               this.estimatedSize -= var3;
               this.characteristics = var6;
            }

            Spliterator var5 = this.RHIHRCOORRRCRRHCRCOHORHROROIRR.newFlatMapSpliterator(this.prefix, var1, this.OIHIIIRCCROHORIRORHRCOICCHRCCR, var6, var3);
            this.prefix = null;
            return (OutSpliteratorT)var5;
         } else if (this.prefix != null) {
            Spliterator var2 = this.prefix;
            this.prefix = null;
            return (OutSpliteratorT)var2;
         } else {
            return null;
         }
      }

      @Override
      public final long estimateSize() {
         if (this.prefix != null) {
            this.estimatedSize = Math.max(this.estimatedSize, this.prefix.estimateSize());
         }

         return Math.max(this.estimatedSize, 0L);
      }

      @Override
      public final int characteristics() {
         return this.characteristics;
      }

      @FunctionalInterface
      interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<InElementT, OutSpliteratorT extends Spliterator<?>> {
         OutSpliteratorT newFlatMapSpliterator(
            OutSpliteratorT var1, Spliterator<InElementT> var2, Function<? super InElementT, OutSpliteratorT> var3, int var4, long var5
         );
      }
   }

   static final class HRCHROOHRIHCRCRHRIIROCIRHOIRHH<InElementT, OutElementT>
      extends IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<InElementT, OutElementT, Spliterator<OutElementT>> {
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
         Spliterator<OutElementT> var1, Spliterator<InElementT> var2, Function<? super InElementT, Spliterator<OutElementT>> var3, int var4, long var5
      ) {
         super(var1, var2, var3, IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH::new, var4, var5);
      }
   }

   abstract static class OOROOCCIRCCRHOIOIORIHCHHOOCCOR<InElementT, OutElementT, OutConsumerT, OutSpliteratorT extends OfPrimitive<OutElementT, OutConsumerT, OutSpliteratorT>>
      extends IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<InElementT, OutElementT, OutSpliteratorT>
      implements OfPrimitive<OutElementT, OutConsumerT, OutSpliteratorT> {
      OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
         OutSpliteratorT var1,
         Spliterator<InElementT> var2,
         Function<? super InElementT, OutSpliteratorT> var3,
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<InElementT, OutSpliteratorT> var4,
         int var5,
         long var6
      ) {
         super((OutSpliteratorT)var1, var2, var3, var4, var5, var6);
      }

      @Override
      public final boolean tryAdvance(OutConsumerT var1) {
         while (this.prefix == null || !this.prefix.tryAdvance((OutConsumerT)var1)) {
            this.prefix = null;
            if (!this.HCRHIHCCRIICCIHHRHHHHRIOOCHCHH.tryAdvance(var1x -> {
               Spliterator var10002 = this.OIHIIIRCCROHORIRORHRCOICCHRCCR.apply(var1x);
            })) {
               return false;
            }
         }

         if (this.estimatedSize != Long.MAX_VALUE) {
            this.estimatedSize--;
         }

         return true;
      }

      @Override
      public final void forEachRemaining(OutConsumerT var1) {
         if (this.prefix != null) {
            this.prefix.forEachRemaining((OutConsumerT)var1);
            this.prefix = null;
         }

         this.HCRHIHCCRIICCIHHRHHHHRIOOCHCHH.forEachRemaining(var2 -> {
            OfPrimitive var3 = this.OIHIIIRCCROHORIRORHRCOICCHRCCR.apply(var2);
            if (var3 != null) {
               var3.forEachRemaining(var1);
            }
         });
         this.estimatedSize = 0L;
      }
   }

   static final class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<InElementT>
      extends IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<InElementT, Long, LongConsumer, OfLong>
      implements OfLong {
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(OfLong var1, Spliterator<InElementT> var2, Function<? super InElementT, OfLong> var3, int var4, long var5) {
         super(var1, var2, var3, IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI::new, var4, var5);
      }
   }

   static final class RRCRRCORICCHOHHIRCHIROOHIIOHCO<InElementT>
      extends IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<InElementT, Integer, IntConsumer, OfInt>
      implements OfInt {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO(OfInt var1, Spliterator<InElementT> var2, Function<? super InElementT, OfInt> var3, int var4, long var5) {
         super(var1, var2, var3, IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO::new, var4, var5);
      }
   }
}
