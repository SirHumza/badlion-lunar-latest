package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.Spliterator.OfDouble;
import java.util.Spliterator.OfInt;
import java.util.Spliterator.OfLong;
import java.util.Spliterators.AbstractSpliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class RHCHHROCORIHCIORRRIIOHIRHCRIOH {
   public static <T> Stream<T> stream(Iterable<T> var0) {
      return var0 instanceof Collection ? ((Collection)var0).stream() : StreamSupport.stream(var0.spliterator(), false);
   }

   @Deprecated
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <T> Stream<T> stream(Collection<T> var0) {
      return var0.stream();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <T> Stream<T> stream(Iterator<T> var0) {
      return StreamSupport.stream(Spliterators.spliteratorUnknownSize(var0, 0), false);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <T> Stream<T> HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR<T> var0
   ) {
      return var0.isPresent() ? Stream.of((T)var0.get()) : Stream.empty();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <T> Stream<T> stream(Optional<T> var0) {
      return var0.isPresent() ? Stream.of((T)var0.get()) : Stream.empty();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static IntStream stream(OptionalInt var0) {
      return var0.isPresent() ? IntStream.of(var0.getAsInt()) : IntStream.empty();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static LongStream stream(OptionalLong var0) {
      return var0.isPresent() ? LongStream.of(var0.getAsLong()) : LongStream.empty();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static DoubleStream stream(OptionalDouble var0) {
      return var0.isPresent() ? DoubleStream.of(var0.getAsDouble()) : DoubleStream.empty();
   }

   private static void closeAll(BaseStream<?, ?>[] var0) {
      for (BaseStream var4 : var0) {
         var4.close();
      }
   }

   @SafeVarargs
   public static <T> Stream<T> concat(Stream<? extends T>... var0) {
      boolean var1 = false;
      int var2 = 336;
      long var3 = 0L;
      COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = new COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.length);

      for (Stream var9 : var0) {
         var1 |= var9.isParallel();
         Spliterator var10 = var9.spliterator();
         var5.CCHHRHRHCRHIHIHRIOICROHCHIIIHI(var10);
         var2 &= var10.characteristics();
         var3 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.saturatedAdd(
            var3, var10.estimateSize()
         );
      }

      return StreamSupport.stream(
            IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.flatMap(var5.IORRHROIIRHIIOOHCOOIRHOIHRHRHI().spliterator(), var0x -> (Spliterator<T>)var0x, var2, var3), var1
         )
         .onClose(() -> closeAll(var0));
   }

   public static IntStream concat(IntStream... var0) {
      boolean var1 = false;
      int var2 = 336;
      long var3 = 0L;
      COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = new COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.length);

      for (IntStream var9 : var0) {
         var1 |= var9.isParallel();
         OfInt var10 = var9.spliterator();
         var5.CCHHRHRHCRHIHIHRIOICROHCHIIIHI(var10);
         var2 &= var10.characteristics();
         var3 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.saturatedAdd(
            var3, var10.estimateSize()
         );
      }

      return StreamSupport.intStream(
            IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.flatMapToInt(var5.IORRHROIIRHIIOOHCOOIRHOIHRHRHI().spliterator(), var0x -> var0x, var2, var3), var1
         )
         .onClose(() -> closeAll(var0));
   }

   public static LongStream concat(LongStream... var0) {
      boolean var1 = false;
      int var2 = 336;
      long var3 = 0L;
      COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = new COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.length);

      for (LongStream var9 : var0) {
         var1 |= var9.isParallel();
         OfLong var10 = var9.spliterator();
         var5.CCHHRHRHCRHIHIHRIOICROHCHIIIHI(var10);
         var2 &= var10.characteristics();
         var3 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.saturatedAdd(
            var3, var10.estimateSize()
         );
      }

      return StreamSupport.longStream(
            IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.flatMapToLong(var5.IORRHROIIRHIIOOHCOOIRHOIHRHRHI().spliterator(), var0x -> var0x, var2, var3), var1
         )
         .onClose(() -> closeAll(var0));
   }

   public static DoubleStream concat(DoubleStream... var0) {
      boolean var1 = false;
      int var2 = 336;
      long var3 = 0L;
      COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = new COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.length);

      for (DoubleStream var9 : var0) {
         var1 |= var9.isParallel();
         OfDouble var10 = var9.spliterator();
         var5.CCHHRHRHCRHIHIHRIOICROHCHIIIHI(var10);
         var2 &= var10.characteristics();
         var3 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.saturatedAdd(
            var3, var10.estimateSize()
         );
      }

      return StreamSupport.doubleStream(
            IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.flatMapToDouble(var5.IORRHROIIRHIIOOHCOOIRHOIHRHRHI().spliterator(), var0x -> var0x, var2, var3), var1
         )
         .onClose(() -> closeAll(var0));
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <A, B, R> Stream<R> zip(Stream<A> var0, Stream<B> var1, final BiFunction<? super A, ? super B, R> var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      boolean var3 = var0.isParallel() || var1.isParallel();
      Spliterator var4 = var0.spliterator();
      Spliterator var5 = var1.spliterator();
      int var6 = var4.characteristics() & var5.characteristics() & 80;
      final Iterator var7 = Spliterators.iterator(var4);
      final Iterator var8 = Spliterators.iterator(var5);
      return StreamSupport.stream(new AbstractSpliterator<R>(Math.min(var4.estimateSize(), var5.estimateSize()), var6) {
         @Override
         public boolean tryAdvance(Consumer<? super R> var1) {
            if (var7.hasNext() && var8.hasNext()) {
               var1.accept(var2.apply(var7.next(), var8.next()));
               return true;
            } else {
               return false;
            }
         }
      }, var3).onClose(var0::close).onClose(var1::close);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <A, B> void forEachPair(Stream<A> var0, Stream<B> var1, BiConsumer<? super A, ? super B> var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      if (!var0.isParallel() && !var1.isParallel()) {
         Iterator var3 = var0.iterator();
         Iterator var4 = var1.iterator();

         while (var3.hasNext() && var4.hasNext()) {
            var2.accept(var3.next(), var4.next());
         }
      } else {
         zip(var0, var1, RHCHHROCORIHCIORRRIIOHIRHCRIOH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI::new)
            .forEach(var1x -> var2.accept(var1x.IHRROHHOCHRRCCRHRICROHOHRRIORO, var1x.IRIRHOIOCCCCHOORRRICIORRIHIHIR));
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <T, R> Stream<R> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Stream<T> var0, final RHCHHROCORIHCIORRRIIOHIRHCRIOH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<? super T, ? extends R> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      boolean var2 = var0.isParallel();
      Spliterator var3 = var0.spliterator();

      class IRCIIHHICIHRCOCRROCOICRIHHCCHH
         extends RHCHHROCORIHCIORRRIIOHIRHCRIOH.CRICCOOHHHCHOORCICOCOHIHOIRHOO<Spliterator<T>, R, IRCIIHHICIHRCOCRROCOICRIHHCCHH>
         implements Consumer<T> {
         @Nullable Object holder;

         IRCIIHHICIHRCOCRROCOICRIHHCCHH(Spliterator<T> var1x, long var2) {
            super(var1x, var2);
         }

         @Override
         public void accept(@Nullable T var1x) {
            this.holder = var1x;
         }

         @Override
         public boolean tryAdvance(Consumer<? super R> var1x) {
            if (this.IHRROORRCRCHIOCHCHROORCHOCIHCC.tryAdvance(this)) {
               try {
                  var1x.accept(var1.apply(this.holder, this.index++));
                  return true;
               } finally {
                  this.holder = null;
               }
            } else {
               return false;
            }
         }

         IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Spliterator<T> var1x, long var2) {
            return new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1x, var2);
         }
      }

      if (!var3.hasCharacteristics(16384)) {
         final Iterator var4 = Spliterators.iterator(var3);
         return StreamSupport.stream(new AbstractSpliterator<R>(var3.estimateSize(), var3.characteristics() & 80) {
            long index = 0L;

            @Override
            public boolean tryAdvance(Consumer<? super R> var1x) {
               if (var4.hasNext()) {
                  var1x.accept(var1.apply(var4.next(), this.index++));
                  return true;
               } else {
                  return false;
               }
            }
         }, var2).onClose(var0::close);
      } else {
         return StreamSupport.stream(new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3, 0L), var2).onClose(var0::close);
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <R> Stream<R> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IntStream var0, final RHCHHROCORIHCIORRRIIOHIRHCRIOH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<R> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      boolean var2 = var0.isParallel();
      OfInt var3 = var0.spliterator();

      class HHCCIRHCCCIIRHCROHIORHIRHHIORH
         extends RHCHHROCORIHCIORRRIIOHIRHCRIOH.CRICCOOHHHCHOORCICOCOHIHOIRHOO<OfInt, R, HHCCIRHCCCIIRHCROHIORHIRHHIORH>
         implements Spliterator<R>,
         IntConsumer {
         int holder;

         HHCCIRHCCCIIRHCROHIORHIRHHIORH(OfInt var1x, long var2) {
            super(var1x, var2);
         }

         @Override
         public void accept(int var1x) {
            this.holder = var1x;
         }

         @Override
         public boolean tryAdvance(Consumer<? super R> var1x) {
            if (this.IHRROORRCRCHIOCHCHROORCHOCIHCC.tryAdvance(this)) {
               var1x.accept(var1.apply(this.holder, this.index++));
               return true;
            } else {
               return false;
            }
         }

         HHCCIRHCCCIIRHCROHIORHIRHHIORH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OfInt var1x, long var2) {
            return new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1x, var2);
         }
      }

      if (!var3.hasCharacteristics(16384)) {
         final java.util.PrimitiveIterator.OfInt var4 = Spliterators.iterator(var3);
         return StreamSupport.stream(new AbstractSpliterator<R>(var3.estimateSize(), var3.characteristics() & 80) {
            long index = 0L;

            @Override
            public boolean tryAdvance(Consumer<? super R> var1x) {
               if (var4.hasNext()) {
                  var1x.accept(var1.apply(var4.nextInt(), this.index++));
                  return true;
               } else {
                  return false;
               }
            }
         }, var2).onClose(var0::close);
      } else {
         return StreamSupport.stream(new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var3, 0L), var2).onClose(var0::close);
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <R> Stream<R> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(LongStream var0, final RHCHHROCORIHCIORRRIIOHIRHCRIOH.CORCOCICIRIOHROHROIIOOHICCHCRR<R> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      boolean var2 = var0.isParallel();
      OfLong var3 = var0.spliterator();

      class CRRRICCRROCOHHOHIICIHORCOORRRH
         extends RHCHHROCORIHCIORRRIIOHIRHCRIOH.CRICCOOHHHCHOORCICOCOHIHOIRHOO<OfLong, R, CRRRICCRROCOHHOHIICIHORCOORRRH>
         implements Spliterator<R>,
         LongConsumer {
         long holder;

         CRRRICCRROCOHHOHIICIHORCOORRRH(OfLong var1x, long var2) {
            super(var1x, var2);
         }

         @Override
         public void accept(long var1x) {
            this.holder = var1x;
         }

         @Override
         public boolean tryAdvance(Consumer<? super R> var1x) {
            if (this.IHRROORRCRCHIOCHCHROORCHOCIHCC.tryAdvance(this)) {
               var1x.accept(var1.apply(this.holder, this.index++));
               return true;
            } else {
               return false;
            }
         }

         CRRRICCRROCOHHOHIICIHORCOORRRH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OfLong var1x, long var2) {
            return new CRRRICCRROCOHHOHIICIHORCOORRRH(var1x, var2);
         }
      }

      if (!var3.hasCharacteristics(16384)) {
         final java.util.PrimitiveIterator.OfLong var4 = Spliterators.iterator(var3);
         return StreamSupport.stream(new AbstractSpliterator<R>(var3.estimateSize(), var3.characteristics() & 80) {
            long index = 0L;

            @Override
            public boolean tryAdvance(Consumer<? super R> var1x) {
               if (var4.hasNext()) {
                  var1x.accept(var1.apply(var4.nextLong(), this.index++));
                  return true;
               } else {
                  return false;
               }
            }
         }, var2).onClose(var0::close);
      } else {
         return StreamSupport.stream(new CRRRICCRROCOHHOHIICIHORCOORRRH(var3, 0L), var2).onClose(var0::close);
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <R> Stream<R> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DoubleStream var0, final RHCHHROCORIHCIORRRIIOHIRHCRIOH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<R> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      boolean var2 = var0.isParallel();
      OfDouble var3 = var0.spliterator();

      class RRCRRCORICCHOHHIRCHIROOHIIOHCO
         extends RHCHHROCORIHCIORRRIIOHIRHCRIOH.CRICCOOHHHCHOORCICOCOHIHOIRHOO<OfDouble, R, RRCRRCORICCHOHHIRCHIROOHIIOHCO>
         implements Spliterator<R>,
         DoubleConsumer {
         double holder;

         RRCRRCORICCHOHHIRCHIROOHIIOHCO(OfDouble var1x, long var2) {
            super(var1x, var2);
         }

         @Override
         public void accept(double var1x) {
            this.holder = var1x;
         }

         @Override
         public boolean tryAdvance(Consumer<? super R> var1x) {
            if (this.IHRROORRCRCHIOCHCHROORCHOCIHCC.tryAdvance(this)) {
               var1x.accept(var1.apply(this.holder, this.index++));
               return true;
            } else {
               return false;
            }
         }

         RRCRRCORICCHOHHIRCHIROOHIIOHCO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OfDouble var1x, long var2) {
            return new RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1x, var2);
         }
      }

      if (!var3.hasCharacteristics(16384)) {
         final java.util.PrimitiveIterator.OfDouble var4 = Spliterators.iterator(var3);
         return StreamSupport.stream(new AbstractSpliterator<R>(var3.estimateSize(), var3.characteristics() & 80) {
            long index = 0L;

            @Override
            public boolean tryAdvance(Consumer<? super R> var1x) {
               if (var4.hasNext()) {
                  var1x.accept(var1.apply(var4.nextDouble(), this.index++));
                  return true;
               } else {
                  return false;
               }
            }
         }, var2).onClose(var0::close);
      } else {
         return StreamSupport.stream(new RRCRRCORICCHOHHIRCHIROOHIIOHCO(var3, 0L), var2).onClose(var0::close);
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <T> Optional<T> findLast(Stream<T> var0) {
      class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
         boolean set = false;
         T value = (T)null;

         void set(@Nullable T var1) {
            this.set = true;
            this.value = (T)var1;
         }

         T get() {
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
               this.set
            );
            return this.value;
         }
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      ArrayDeque var2 = new ArrayDeque();
      var2.addLast(var0.spliterator());

      while (!var2.isEmpty()) {
         Spliterator var3 = (Spliterator)var2.removeLast();
         if (var3.getExactSizeIfKnown() != 0L) {
            if (var3.hasCharacteristics(16384)) {
               while (true) {
                  Spliterator var5 = var3.trySplit();
                  if (var5 == null || var5.getExactSizeIfKnown() == 0L) {
                     break;
                  }

                  if (var3.getExactSizeIfKnown() == 0L) {
                     var3 = var5;
                     break;
                  }
               }

               var3.forEachRemaining(var1::set);
               return Optional.of((T)var1.get());
            }

            Spliterator var4 = var3.trySplit();
            if (var4 != null && var4.getExactSizeIfKnown() != 0L) {
               var2.addLast(var4);
               var2.addLast(var3);
            } else {
               var3.forEachRemaining(var1::set);
               if (var1.set) {
                  return Optional.of((T)var1.get());
               }
            }
         }
      }

      return Optional.empty();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static OptionalInt findLast(IntStream var0) {
      Optional var1 = findLast(var0.boxed());
      return var1.isPresent() ? OptionalInt.of((Integer)var1.get()) : OptionalInt.empty();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static OptionalLong findLast(LongStream var0) {
      Optional var1 = findLast(var0.boxed());
      return var1.isPresent() ? OptionalLong.of((Long)var1.get()) : OptionalLong.empty();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static OptionalDouble findLast(DoubleStream var0) {
      Optional var1 = findLast(var0.boxed());
      return var1.isPresent() ? OptionalDouble.of((Double)var1.get()) : OptionalDouble.empty();
   }

   private RHCHHROCORIHCIORRRIIOHIRHCRIOH() {
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public interface CORCOCICIRIOHROHROIIOOHICCHCRR<R> {
      R apply(long var1, long var3);
   }

   private abstract static class CRICCOOHHHCHOORCICOCOHIHOIRHOO<F extends Spliterator<?>, R, S extends RHCHHROCORIHCIORRRIIOHIRHCRIOH.CRICCOOHHHCHOORCICOCOHIHOIRHOO<F, R, S>>
      implements Spliterator<R> {
      final F IHRROORRCRCHIOCHCHROORCHOCIHCC;
      long index;

      CRICCOOHHHCHOORCICOCOHIHOIRHOO(F var1, long var2) {
         this.IHRROORRCRCHIOCHCHROORCHOCIHCC = (F)var1;
         this.index = var2;
      }

      abstract S IRCIIHHICIHRCOCRROCOICRIHHCCHH(F var1, long var2);

      public S HCROCHCORRHRHRRIOROCCCIHOHCRHC() {
         Spliterator var1 = this.IHRROORRCRCHIOCHCHROORCHOCIHCC.trySplit();
         if (var1 == null) {
            return null;
         }

         RHCHHROCORIHCIORRRIIOHIRHCRIOH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH((F)var1, this.index);
         this.index = this.index + var1.getExactSizeIfKnown();
         return (S)var2;
      }

      @Override
      public long estimateSize() {
         return this.IHRROORRCRCHIOCHCHROORCHOCIHCC.estimateSize();
      }

      @Override
      public int characteristics() {
         return this.IHRROORRCRCHIOCHCHROORCHOCIHCC.characteristics() & 16464;
      }
   }

   private static class HICHRCOHCCRHOHCICOOCHOIHCCHIRI<A, B> {
      final A IHRROHHOCHRRCCRHRICROHOHRRIORO;
      final B IRIRHOIOCCCCHOORRRICIORRIHIHIR;

      HICHRCOHCCRHOHCICOOCHOIHCCHIRI(A var1, B var2) {
         this.IHRROHHOCHRRCCRHRICROHOHRRIORO = (A)var1;
         this.IRIRHOIOCCCCHOORRRICIORRIHIHIR = (B)var2;
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public interface HRCHROOHRIHCRCRHRIIROCIRHOIRHH<T, R> {
      R apply(T var1, long var2);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public interface OOROOCCIRCCRHOIOIORIHCHHOOCCOR<R> {
      R apply(int var1, long var2);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public interface RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<R> {
      R apply(double var1, long var3);
   }
}
