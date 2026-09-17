package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
public final class IRIHOIRCHIRRCRIOORCOICORHHORHH {
   private IRIHOIRCHIRRCRIOORCOICORHHORHH() {
   }

   public static <T> Iterable<T> unmodifiableIterable(Iterable<? extends T> var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      return !(var0 instanceof IRIHOIRCHIRRCRIOORCOICORHHORHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) && !(var0 instanceof OIICIRRCOOCIHRHOIOIOOROCRHCHIC)
         ? new IRIHOIRCHIRRCRIOORCOICORHHORHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var0)
         : var0;
   }

   @Deprecated
   public static <E> Iterable<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OIICIRRCOOCIHRHOIOIOOROCRHCHIC<E> var0) {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
   }

   public static int size(Iterable<?> var0) {
      return var0 instanceof Collection ? ((Collection)var0).size() : HRCROCOHHHICRHIHHOOCIIRRRCCIRR.size(var0.iterator());
   }

   public static boolean contains(Iterable<?> var0, @Nullable Object var1) {
      if (var0 instanceof Collection) {
         Collection var2 = (Collection)var0;
         return RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.safeContains(var2, var1);
      } else {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.contains(var0.iterator(), var1);
      }
   }

   @CanIgnoreReturnValue
   public static boolean removeAll(Iterable<?> var0, Collection<?> var1) {
      return var0 instanceof Collection
         ? ((Collection)var0)
            .removeAll(
               com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
                  var1
               )
            )
         : HRCROCOHHHICRHIHHOOCIIRRRCCIRR.removeAll(var0.iterator(), var1);
   }

   @CanIgnoreReturnValue
   public static boolean retainAll(Iterable<?> var0, Collection<?> var1) {
      return var0 instanceof Collection
         ? ((Collection)var0)
            .retainAll(
               com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
                  var1
               )
            )
         : HRCROCOHHHICRHIHHOOCIIRRRCCIRR.retainAll(var0.iterator(), var1);
   }

   @CanIgnoreReturnValue
   public static <T> boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Iterable<T> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super T> var1
   ) {
      return var0 instanceof Collection
         ? ((Collection)var0).removeIf(var1)
         : HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.iterator(), var1);
   }

   static <T> @Nullable T IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      Iterable<T> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super T> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      Iterator var2 = var0.iterator();

      while (var2.hasNext()) {
         Object var3 = var2.next();
         if (var1.apply(var3)) {
            var2.remove();
            return (T)var3;
         }
      }

      return null;
   }

   public static boolean elementsEqual(Iterable<?> var0, Iterable<?> var1) {
      if (var0 instanceof Collection && var1 instanceof Collection) {
         Collection var2 = (Collection)var0;
         Collection var3 = (Collection)var1;
         if (var2.size() != var3.size()) {
            return false;
         }
      }

      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.elementsEqual(var0.iterator(), var1.iterator());
   }

   public static String toString(Iterable<?> var0) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.toString(var0.iterator());
   }

   public static <T> T getOnlyElement(Iterable<T> var0) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.getOnlyElement(var0.iterator());
   }

   public static <T> @Nullable T getOnlyElement(Iterable<? extends T> var0, @Nullable T var1) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.getOnlyElement(var0.iterator(), (T)var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <T> T[] toArray(Iterable<? extends T> var0, Class<T> var1) {
      return (T[])toArray(var0, IOHCCIRCCICICHHHIOIOHCICICROIO.newArray(var1, 0));
   }

   static <T> T[] toArray(Iterable<? extends T> var0, T[] var1) {
      Collection var2 = castOrCopyToCollection(var0);
      return (T[])var2.toArray(var1);
   }

   static Object[] toArray(Iterable<?> var0) {
      return castOrCopyToCollection(var0).toArray();
   }

   private static <E> Collection<E> castOrCopyToCollection(Iterable<E> var0) {
      return var0 instanceof Collection ? (Collection)var0 : RCHOIICIHOCIRCIOORIOHRCRHOCRCR.newArrayList(var0.iterator());
   }

   @CanIgnoreReturnValue
   public static <T> boolean addAll(Collection<T> var0, Iterable<? extends T> var1) {
      if (var1 instanceof Collection) {
         Collection var2 = RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.cast(var1);
         return var0.addAll(var2);
      } else {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.addAll(
            var0,
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
                  var1
               )
               .iterator()
         );
      }
   }

   public static int frequency(Iterable<?> var0, @Nullable Object var1) {
      if (var0 instanceof CRIIOOIHIOHHRRRHIOROOCHCHHCCCI) {
         return ((CRIIOOIHIOHHRRRHIOROOCHCHHCCCI)var0).count(var1);
      } else if (var0 instanceof Set) {
         return ((Set)var0).contains(var1) ? 1 : 0;
      } else {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.frequency(var0.iterator(), var1);
      }
   }

   public static <T> Iterable<T> cycle(final Iterable<T> var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      return new RRHOOOORORHHOOIHRCCHIIHHIIIIOH<T>() {
         @Override
         public Iterator<T> iterator() {
            return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.cycle(var0);
         }

         @Override
         public Spliterator<T> spliterator() {
            return Stream.<Iterable>generate(() -> var0).flatMap(RHCHHROCORIHCIORRRIIOHIRHCRIOH::stream).spliterator();
         }

         @Override
         public String toString() {
            return var0.toString() + " (cycled)";
         }
      };
   }

   @SafeVarargs
   public static <T> Iterable<T> cycle(T... var0) {
      return cycle(RCHOIICIHOCIRCIOORIOHRCRHOCRCR.newArrayList((T[])var0));
   }

   public static <T> Iterable<T> concat(Iterable<? extends T> var0, Iterable<? extends T> var1) {
      return RRHOOOORORHHOOIHRCCHIIHHIIIIOH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var1);
   }

   public static <T> Iterable<T> concat(Iterable<? extends T> var0, Iterable<? extends T> var1, Iterable<? extends T> var2) {
      return RRHOOOORORHHOOIHRCCHIIHHIIIIOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2);
   }

   public static <T> Iterable<T> concat(Iterable<? extends T> var0, Iterable<? extends T> var1, Iterable<? extends T> var2, Iterable<? extends T> var3) {
      return RRHOOOORORHHOOIHRCCHIIHHIIIIOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2, var3);
   }

   @SafeVarargs
   public static <T> Iterable<T> concat(Iterable<? extends T>... var0) {
      return RRHOOOORORHHOOIHRCCHIIHHIIIIOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
   }

   public static <T> Iterable<T> concat(Iterable<? extends Iterable<? extends T>> var0) {
      return RRHOOOORORHHOOIHRCCHIIHHIIIIOH.OCOHORHCROHICRRIHCIHHRRCIHICRI(var0);
   }

   public static <T> Iterable<List<T>> partition(final Iterable<T> var0, final int var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1 > 0
      );
      return new RRHOOOORORHHOOIHRCCHIIHHIIIIOH<List<T>>() {
         @Override
         public Iterator<List<T>> iterator() {
            return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.iterator(), var1);
         }
      };
   }

   public static <T> Iterable<List<T>> paddedPartition(final Iterable<T> var0, final int var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1 > 0
      );
      return new RRHOOOORORHHOOIHRCCHIIHHIIIIOH<List<T>>() {
         @Override
         public Iterator<List<T>> iterator() {
            return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0.iterator(), var1);
         }
      };
   }

   public static <T> Iterable<T> HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      final Iterable<T> var0,
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super T> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return new RRHOOOORORHHOOIHRCCHIIHHIIIIOH<T>() {
         @Override
         public Iterator<T> iterator() {
            return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0.iterator(), var1);
         }

         @Override
         public void forEach(Consumer<? super T> var1x) {
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var1x
            );
            var0.forEach(var2 -> {
               if (var1.test(var2)) {
                  var1x.accept(var2);
               }
            });
         }

         @Override
         public Spliterator<T> spliterator() {
            return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.filter(var0.spliterator(), var1);
         }
      };
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <T> Iterable<T> filter(Iterable<?> var0, Class<T> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         var0,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RCCCROCHCICCROHCOCCRRROCIIHCCH(
            var1
         )
      );
   }

   public static <T> boolean CRRRICCRROCOHHOHIICIHORCOORRRH(
      Iterable<T> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super T> var1
   ) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0.iterator(), var1);
   }

   public static <T> boolean RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      Iterable<T> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super T> var1
   ) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.CRRRICCRROCOHHOHIICIHORCOORRRH(var0.iterator(), var1);
   }

   public static <T> T RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      Iterable<T> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super T> var1
   ) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0.iterator(), var1);
   }

   public static <T> @Nullable T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Iterable<? extends T> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super T> var1,
      @Nullable T var2
   ) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.iterator(), var1, (T)var2);
   }

   public static <T> com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR<T> HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      Iterable<T> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super T> var1
   ) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var0.iterator(), var1);
   }

   public static <T> int OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
      Iterable<T> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super T> var1
   ) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var0.iterator(), var1);
   }

   public static <F, T> Iterable<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      final Iterable<F> var0,
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super F, ? extends T> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return new RRHOOOORORHHOOIHRCCHIIHHIIIIOH<T>() {
         @Override
         public Iterator<T> iterator() {
            return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.iterator(), var1);
         }

         @Override
         public void forEach(Consumer<? super T> var1x) {
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var1x
            );
            var0.forEach(var2 -> var1x.accept(var1.apply(var2)));
         }

         @Override
         public Spliterator<T> spliterator() {
            return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.map(var0.spliterator(), var1);
         }
      };
   }

   public static <T> T get(Iterable<T> var0, int var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      return (T)(var0 instanceof List ? ((List)var0).get(var1) : HRCROCOHHHICRHIHHOOCIIRRRCCIRR.get(var0.iterator(), var1));
   }

   public static <T> @Nullable T get(Iterable<? extends T> var0, int var1, @Nullable T var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      HRCROCOHHHICRHIHHOOCIIRRRCCIRR.checkNonnegative(var1);
      if (var0 instanceof List) {
         List var4 = RCHOIICIHOCIRCIOORIOHRCRHOCRCR.cast(var0);
         return (T)(var1 < var4.size() ? var4.get(var1) : var2);
      } else {
         Iterator var3 = var0.iterator();
         HRCROCOHHHICRHIHHOOCIIRRRCCIRR.advance(var3, var1);
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.getNext(var3, (T)var2);
      }
   }

   public static <T> @Nullable T getFirst(Iterable<? extends T> var0, @Nullable T var1) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.getNext(var0.iterator(), (T)var1);
   }

   public static <T> T getLast(Iterable<T> var0) {
      if (var0 instanceof List) {
         List var1 = (List)var0;
         if (var1.isEmpty()) {
            throw new NoSuchElementException();
         } else {
            return getLastInNonemptyList(var1);
         }
      } else {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.getLast(var0.iterator());
      }
   }

   public static <T> @Nullable T getLast(Iterable<? extends T> var0, @Nullable T var1) {
      if (var0 instanceof Collection) {
         Collection var2 = RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.cast(var0);
         if (var2.isEmpty()) {
            return (T)var1;
         }

         if (var0 instanceof List) {
            return getLastInNonemptyList(RCHOIICIHOCIRCIOORIOHRCRHOCRCR.cast(var0));
         }
      }

      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.getLast(var0.iterator(), (T)var1);
   }

   private static <T> T getLastInNonemptyList(List<T> var0) {
      return (T)var0.get(var0.size() - 1);
   }

   public static <T> Iterable<T> skip(final Iterable<T> var0, final int var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1 >= 0, "number to skip cannot be negative"
      );
      return new RRHOOOORORHHOOIHRCCHIIHHIIIIOH<T>() {
         @Override
         public Iterator<T> iterator() {
            if (var0 instanceof List) {
               List var3 = (List)var0;
               int var2 = Math.min(var3.size(), var1);
               return var3.subList(var2, var3.size()).iterator();
            } else {
               final Iterator var1x = var0.iterator();
               HRCROCOHHHICRHIHHOOCIIRRRCCIRR.advance(var1x, var1);
               return new Iterator<T>() {
                  boolean atStart = true;

                  @Override
                  public boolean hasNext() {
                     return var1x.hasNext();
                  }

                  @Override
                  public T next() {
                     Object var1xx = var1x.next();
                     this.atStart = false;
                     return (T)var1xx;
                  }

                  @Override
                  public void remove() {
                     ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkRemove(!this.atStart);
                     var1x.remove();
                  }
               };
            }
         }

         @Override
         public Spliterator<T> spliterator() {
            if (var0 instanceof List) {
               List var1x = (List)var0;
               int var2 = Math.min(var1x.size(), var1);
               return var1x.subList(var2, var1x.size()).spliterator();
            } else {
               return RHCHHROCORIHCIORRRIIOHIRHCRIOH.<T>stream(var0).skip(var1).spliterator();
            }
         }
      };
   }

   public static <T> Iterable<T> limit(final Iterable<T> var0, final int var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1 >= 0, "limit is negative"
      );
      return new RRHOOOORORHHOOIHRCCHIIHHIIIIOH<T>() {
         @Override
         public Iterator<T> iterator() {
            return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.limit(var0.iterator(), var1);
         }

         @Override
         public Spliterator<T> spliterator() {
            return RHCHHROCORIHCIORRRIIOHIRHCRIOH.<T>stream(var0).limit(var1).spliterator();
         }
      };
   }

   public static <T> Iterable<T> consumingIterable(final Iterable<T> var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      return new RRHOOOORORHHOOIHRCCHIIHHIIIIOH<T>() {
         @Override
         public Iterator<T> iterator() {
            return var0 instanceof Queue
               ? new IOHHOIIOCRHCHHCRORICCOHOHROOIH<>((Queue<T>)var0)
               : HRCROCOHHHICRHIHHOOCIIRRRCCIRR.consumingIterator(var0.iterator());
         }

         @Override
         public String toString() {
            return "Iterables.consumingIterable(...)";
         }
      };
   }

   public static boolean isEmpty(Iterable<?> var0) {
      return var0 instanceof Collection ? ((Collection)var0).isEmpty() : !var0.iterator().hasNext();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <T> Iterable<T> mergeSorted(final Iterable<? extends Iterable<? extends T>> var0, final Comparator<? super T> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0, "iterables"
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1, "comparator"
      );
      RRHOOOORORHHOOIHRCCHIIHHIIIIOH var2 = new RRHOOOORORHHOOIHRCCHIIHHIIIIOH<T>() {
         @Override
         public Iterator<T> iterator() {
            return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               IRIHOIRCHIRRCRIOORCOICORHHORHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, IRIHOIRCHIRRCRIOORCOICORHHORHH.HRORRRCHCRRCIIRHCIHHOORHCIORHH()), var1
            );
         }
      };
      return new IRIHOIRCHIRRCRIOORCOICORHHORHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var2);
   }

   static <T> com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<Iterable<? extends T>, Iterator<? extends T>> HRORRRCHCRRCIIRHCIHHOORHCIORHH() {
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<Iterable<? extends T>, Iterator<? extends T>>() {
         public Iterator<? extends T> apply(Iterable<? extends T> var1) {
            return var1.iterator();
         }
      };
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> extends RRHOOOORORHHOOIHRCCHIIHHIIIIOH<T> {
      private final Iterable<? extends T> RHHIRCRHHHIIORRHRHIRRICCIIHCCO;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Iterable<? extends T> var1) {
         this.RHHIRCRHHHIIORRHRHIRRICCIIHCCO = var1;
      }

      @Override
      public Iterator<T> iterator() {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.CIOHHCORHRCCRICCCORIHCRHCCCRRR(this.RHHIRCRHHHIIORRHRHIRRICCIIHCCO.iterator());
      }

      @Override
      public void forEach(Consumer<? super T> var1) {
         this.RHHIRCRHHHIIORRHRHIRRICCIIHCCO.forEach(var1);
      }

      @Override
      public Spliterator<T> spliterator() {
         return (Spliterator<T>)this.RHHIRCRHHHIIORRHRHIRRICCIIHCCO.spliterator();
      }

      @Override
      public String toString() {
         return this.RHHIRCRHHHIIORRHRHIRRICCIIHCCO.toString();
      }
   }
}
