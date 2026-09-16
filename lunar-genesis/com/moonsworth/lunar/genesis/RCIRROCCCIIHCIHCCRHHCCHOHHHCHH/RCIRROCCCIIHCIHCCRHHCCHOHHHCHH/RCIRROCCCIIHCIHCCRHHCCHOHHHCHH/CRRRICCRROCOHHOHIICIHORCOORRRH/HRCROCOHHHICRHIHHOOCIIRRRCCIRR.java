package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
public final class HRCROCOHHHICRHIHHOOCIIRRRCCIRR {
   private HRCROCOHHHICRHIHHOOCIIRRRCCIRR() {
   }

   static <T> IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<T> HICCIROIRICHHOCICHCIOOROHHIOOR() {
      return HIRCRIHHIIORHRCROCHRRRCCRICORC();
   }

   static <T> RRRIRIOCCHRHRIRHIRIIHCOHRHHIIC<T> HIRCRIHHIIORHRCROCHRRRCCRICORC() {
      return (RRRIRIOCCHRHRIRHIRIIHCOHRHHIIC<T>)HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RHOCHHCOHOOORORCCROHIRHOIOOIOI;
   }

   static <T> Iterator<T> emptyModifiableIterator() {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.INSTANCE;
   }

   public static <T> IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<T> CIOHHCORHRCCRICCCORIHCRHCCCRRR(final Iterator<? extends T> var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      return var0 instanceof IRRCHIRICCIHCCIHOHRCHRHRHCRCOH ? (IRRCHIRICCIHCCIHOHRCHRHRHCRCOH)var0 : new IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<T>() {
         @Override
         public boolean hasNext() {
            return var0.hasNext();
         }

         @Override
         public T next() {
            return (T)var0.next();
         }
      };
   }

   @Deprecated
   public static <T> IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<T> var0) {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
   }

   public static int size(Iterator<?> var0) {
      long var1;
      for (var1 = 0L; var0.hasNext(); var1++) {
         var0.next();
      }

      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.saturatedCast(
         var1
      );
   }

   public static boolean contains(Iterator<?> var0, @Nullable Object var1) {
      if (var1 == null) {
         while (var0.hasNext()) {
            if (var0.next() == null) {
               return true;
            }
         }
      } else {
         while (var0.hasNext()) {
            if (var1.equals(var0.next())) {
               return true;
            }
         }
      }

      return false;
   }

   @CanIgnoreReturnValue
   public static boolean removeAll(Iterator<?> var0, Collection<?> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      boolean var2 = false;

      while (var0.hasNext()) {
         if (var1.contains(var0.next())) {
            var0.remove();
            var2 = true;
         }
      }

      return var2;
   }

   @CanIgnoreReturnValue
   public static <T> boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Iterator<T> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super T> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      boolean var2 = false;

      while (var0.hasNext()) {
         if (var1.apply(var0.next())) {
            var0.remove();
            var2 = true;
         }
      }

      return var2;
   }

   @CanIgnoreReturnValue
   public static boolean retainAll(Iterator<?> var0, Collection<?> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      boolean var2 = false;

      while (var0.hasNext()) {
         if (!var1.contains(var0.next())) {
            var0.remove();
            var2 = true;
         }
      }

      return var2;
   }

   public static boolean elementsEqual(Iterator<?> var0, Iterator<?> var1) {
      while (var0.hasNext()) {
         if (!var1.hasNext()) {
            return false;
         }

         Object var2 = var0.next();
         Object var3 = var1.next();
         if (!com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
            var2, var3
         )) {
            return false;
         }
      }

      return !var1.hasNext();
   }

   public static String toString(Iterator<?> var0) {
      StringBuilder var1 = new StringBuilder().append('[');
      boolean var2 = true;

      while (var0.hasNext()) {
         if (!var2) {
            var1.append(", ");
         }

         var2 = false;
         var1.append(var0.next());
      }

      return var1.append(']').toString();
   }

   public static <T> T getOnlyElement(Iterator<T> var0) {
      Object var1 = var0.next();
      if (!var0.hasNext()) {
         return (T)var1;
      }

      StringBuilder var2 = new StringBuilder().append("expected one element but was: <").append(var1);

      for (int var3 = 0; var3 < 4 && var0.hasNext(); var3++) {
         var2.append(", ").append(var0.next());
      }

      if (var0.hasNext()) {
         var2.append(", ...");
      }

      var2.append('>');
      throw new IllegalArgumentException(var2.toString());
   }

   public static <T> @Nullable T getOnlyElement(Iterator<? extends T> var0, @Nullable T var1) {
      return (T)(var0.hasNext() ? getOnlyElement(var0) : var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <T> T[] toArray(Iterator<? extends T> var0, Class<T> var1) {
      ArrayList var2 = RCHOIICIHOCIRCIOORIOHRCRHOCRCR.newArrayList(var0);
      return (T[])IRIHOIRCHIRRCRIOORCOICORHHORHH.toArray(var2, var1);
   }

   @CanIgnoreReturnValue
   public static <T> boolean addAll(Collection<T> var0, Iterator<? extends T> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      boolean var2 = false;

      while (var1.hasNext()) {
         var2 |= var0.add(var1.next());
      }

      return var2;
   }

   public static int frequency(Iterator<?> var0, @Nullable Object var1) {
      int var2 = 0;

      while (contains(var0, var1)) {
         var2++;
      }

      return var2;
   }

   public static <T> Iterator<T> cycle(final Iterable<T> var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      return new Iterator<T>() {
         Iterator<T> iterator = HRCROCOHHHICRHIHHOOCIIRRRCCIRR.emptyModifiableIterator();

         @Override
         public boolean hasNext() {
            return this.iterator.hasNext() || var0.iterator().hasNext();
         }

         @Override
         public T next() {
            if (!this.iterator.hasNext()) {
               this.iterator = var0.iterator();
               if (!this.iterator.hasNext()) {
                  throw new NoSuchElementException();
               }
            }

            return this.iterator.next();
         }

         @Override
         public void remove() {
            this.iterator.remove();
         }
      };
   }

   @SafeVarargs
   public static <T> Iterator<T> cycle(T... var0) {
      return cycle(RCHOIICIHOCIRCIOORIOHRCRHOCRCR.newArrayList((T[])var0));
   }

   private static <T> Iterator<T> consumingForArray(final T... var0) {
      return new IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<T>() {
         int index = 0;

         @Override
         public boolean hasNext() {
            return this.index < var0.length;
         }

         @Override
         public T next() {
            if (!this.hasNext()) {
               throw new NoSuchElementException();
            }

            Object var1 = var0[this.index];
            var0[this.index] = null;
            this.index++;
            return (T)var1;
         }
      };
   }

   public static <T> Iterator<T> concat(Iterator<? extends T> var0, Iterator<? extends T> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return concat(consumingForArray(var0, var1));
   }

   public static <T> Iterator<T> concat(Iterator<? extends T> var0, Iterator<? extends T> var1, Iterator<? extends T> var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      return concat(consumingForArray(var0, var1, var2));
   }

   public static <T> Iterator<T> concat(Iterator<? extends T> var0, Iterator<? extends T> var1, Iterator<? extends T> var2, Iterator<? extends T> var3) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var3
      );
      return concat(consumingForArray(var0, var1, var2, var3));
   }

   public static <T> Iterator<T> concat(Iterator<? extends T>... var0) {
      return concatNoDefensiveCopy(Arrays.copyOf(var0, var0.length));
   }

   public static <T> Iterator<T> concat(Iterator<? extends Iterator<? extends T>> var0) {
      return new HRCROCOHHHICRHIHHOOCIIRRRCCIRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(var0);
   }

   static <T> Iterator<T> concatNoDefensiveCopy(Iterator<? extends T>... var0) {
      for (Iterator var4 : com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      )) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var4
         );
      }

      return concat(consumingForArray(var0));
   }

   public static <T> IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<List<T>> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Iterator<T> var0, int var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, false);
   }

   public static <T> IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<List<T>> IRCIIHHICIHRCOCRROCOICRIHHCCHH(Iterator<T> var0, int var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, true);
   }

   private static <T> IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<List<T>> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(final Iterator<T> var0, final int var1, final boolean var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1 > 0
      );
      return new IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<List<T>>() {
         @Override
         public boolean hasNext() {
            return var0.hasNext();
         }

         public List<T> next() {
            if (!this.hasNext()) {
               throw new NoSuchElementException();
            }

            Object[] var1x = new Object[var1];

            int var2x;
            for (var2x = 0; var2x < var1 && var0.hasNext(); var2x++) {
               var1x[var2x] = var0.next();
            }

            for (int var3 = var2x; var3 < var1; var3++) {
               var1x[var3] = null;
            }

            List var4 = Collections.unmodifiableList(Arrays.asList(var1x));
            return !var2 && var2x != var1 ? var4.subList(0, var2x) : var4;
         }
      };
   }

   public static <T> IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<T> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      final Iterator<T> var0,
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super T> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<T>(
         
      ) {
         @Override
         protected T computeNext() {
            while (var0.hasNext()) {
               Object var1x = var0.next();
               if (var1.apply(var1x)) {
                  return (T)var1x;
               }
            }

            return (T)this.ROCOROCOICRHOICORCIIRRRROCOHOC();
         }
      };
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <T> IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Iterator<?> var0, Class<T> var1) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var0,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RCCCROCHCICCROHCOCCRRROCIIHCCH(
            var1
         )
      );
   }

   public static <T> boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      Iterator<T> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super T> var1
   ) {
      return HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var0, var1) != -1;
   }

   public static <T> boolean CRRRICCRROCOHHOHIICIHORCOORRRH(
      Iterator<T> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super T> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );

      while (var0.hasNext()) {
         Object var2 = var0.next();
         if (!var1.apply(var2)) {
            return false;
         }
      }

      return true;
   }

   public static <T> T RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      Iterator<T> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super T> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );

      while (var0.hasNext()) {
         Object var2 = var0.next();
         if (var1.apply(var2)) {
            return (T)var2;
         }
      }

      throw new NoSuchElementException();
   }

   public static <T> @Nullable T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Iterator<? extends T> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super T> var1,
      @Nullable T var2
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );

      while (var0.hasNext()) {
         Object var3 = var0.next();
         if (var1.apply(var3)) {
            return (T)var3;
         }
      }

      return (T)var2;
   }

   public static <T> com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR<T> RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      Iterator<T> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super T> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );

      while (var0.hasNext()) {
         Object var2 = var0.next();
         if (var1.apply(var2)) {
            return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.COIRRRCIORROCHIROCHROCHICCICIC(
               (T)var2
            );
         }
      }

      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.IHIRCRORCOOROROHHRRIIOOOOCCHRH();
   }

   public static <T> int HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      Iterator<T> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super T> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1, "predicate"
      );

      for (int var2 = 0; var0.hasNext(); var2++) {
         Object var3 = var0.next();
         if (var1.apply(var3)) {
            return var2;
         }
      }

      return -1;
   }

   public static <F, T> Iterator<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Iterator<F> var0,
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super F, ? extends T> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return new HOIRRRIRHICOHCCORHIHCOHIIIHCCO<F, T>(var0) {
         @Override
         T transform(F var1x) {
            return (T)var1.apply(var1x);
         }
      };
   }

   public static <T> T get(Iterator<T> var0, int var1) {
      checkNonnegative(var1);
      int var2 = advance(var0, var1);
      if (!var0.hasNext()) {
         throw new IndexOutOfBoundsException("position (" + var1 + ") must be less than the number of elements that remained (" + var2 + ")");
      } else {
         return (T)var0.next();
      }
   }

   public static <T> @Nullable T get(Iterator<? extends T> var0, int var1, @Nullable T var2) {
      checkNonnegative(var1);
      advance(var0, var1);
      return getNext(var0, (T)var2);
   }

   static void checkNonnegative(int var0) {
      if (var0 < 0) {
         throw new IndexOutOfBoundsException("position (" + var0 + ") must not be negative");
      }
   }

   public static <T> @Nullable T getNext(Iterator<? extends T> var0, @Nullable T var1) {
      return (T)(var0.hasNext() ? var0.next() : var1);
   }

   public static <T> T getLast(Iterator<T> var0) {
      Object var1;
      do {
         var1 = var0.next();
      } while (var0.hasNext());

      return (T)var1;
   }

   public static <T> @Nullable T getLast(Iterator<? extends T> var0, @Nullable T var1) {
      return (T)(var0.hasNext() ? getLast(var0) : var1);
   }

   @CanIgnoreReturnValue
   public static int advance(Iterator<?> var0, int var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1 >= 0, "numberToAdvance must be nonnegative"
      );

      int var2;
      for (var2 = 0; var2 < var1 && var0.hasNext(); var2++) {
         var0.next();
      }

      return var2;
   }

   public static <T> Iterator<T> limit(final Iterator<T> var0, final int var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1 >= 0, "limit is negative"
      );
      return new Iterator<T>() {
         private int count;

         @Override
         public boolean hasNext() {
            return this.count < var1 && var0.hasNext();
         }

         @Override
         public T next() {
            if (!this.hasNext()) {
               throw new NoSuchElementException();
            }

            this.count++;
            return (T)var0.next();
         }

         @Override
         public void remove() {
            var0.remove();
         }
      };
   }

   public static <T> Iterator<T> consumingIterator(final Iterator<T> var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      return new IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<T>() {
         @Override
         public boolean hasNext() {
            return var0.hasNext();
         }

         @Override
         public T next() {
            Object var1 = var0.next();
            var0.remove();
            return (T)var1;
         }

         @Override
         public String toString() {
            return "Iterators.consumingIterator(...)";
         }
      };
   }

   static <T> @Nullable T pollNext(Iterator<T> var0) {
      if (var0.hasNext()) {
         Object var1 = var0.next();
         var0.remove();
         return (T)var1;
      } else {
         return null;
      }
   }

   static void clear(Iterator<?> var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );

      while (var0.hasNext()) {
         var0.next();
         var0.remove();
      }
   }

   @SafeVarargs
   public static <T> IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<T> OIHCOHRCICCCRHRCROOCIOIRRHHHIH(T... var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((T[])var0, 0, var0.length, 0);
   }

   static <T> RRRIRIOCCHRHRIRHIRIIHCOHRHHIIC<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(T[] var0, int var1, int var2, int var3) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var2 >= 0
      );
      int var4 = var1 + var2;
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(
         var1, var4, var0.length
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndex(
         var3, var2
      );
      return var2 == 0 ? HIRCRIHHIIORHRCROCHRRRCCRICORC() : new HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>((T[])var0, var1, var2, var3);
   }

   public static <T> IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<T> IOROHHOIORHORCOHRHCCHCRHOCHCCI(final @Nullable T var0) {
      return new IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<T>() {
         boolean done;

         @Override
         public boolean hasNext() {
            return !this.done;
         }

         @Override
         public T next() {
            if (this.done) {
               throw new NoSuchElementException();
            }

            this.done = true;
            return (T)var0;
         }
      };
   }

   public static <T> IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(final Enumeration<T> var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      return new IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<T>() {
         @Override
         public boolean hasNext() {
            return var0.hasMoreElements();
         }

         @Override
         public T next() {
            return (T)var0.nextElement();
         }
      };
   }

   public static <T> Enumeration<T> asEnumeration(final Iterator<T> var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      return new Enumeration<T>() {
         @Override
         public boolean hasMoreElements() {
            return var0.hasNext();
         }

         @Override
         public T nextElement() {
            return (T)var0.next();
         }
      };
   }

   public static <T> IRIRICIHHCOICHHCHCOCCHHOROOCHH<T> IHHCHHHCRIHOOCOIOOCRIIICIOROIR(Iterator<? extends T> var0) {
      return var0 instanceof HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO
         ? (HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var0
         : new HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO<>(var0);
   }

   @Deprecated
   public static <T> IRIRICIHHCOICHHCHCOCCHHOROOCHH<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRIRICIHHCOICHHCHCOCCHHOROOCHH<T> var0) {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <T> IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<T> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      Iterable<? extends Iterator<? extends T>> var0, Comparator<? super T> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0, "iterators"
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1, "comparator"
      );
      return new HRCROCOHHHICRHIHHOOCIIRRRCCIRR.CRRRICCRROCOHHOHIICIHORCOORRRH<>(var0, var1);
   }

   static <T> ListIterator<T> cast(Iterator<T> var0) {
      return (ListIterator<T>)var0;
   }

   private static class CRRRICCRROCOHHOHIICIHORCOORRRH<T> extends IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<T> {
      final Queue<IRIRICIHHCOICHHCHCOCCHHOROOCHH<T>> CCCHRICRRCCCHOCOOIHHICRRRCCHIR;

      public CRRRICCRROCOHHOHIICIHORCOORRRH(Iterable<? extends Iterator<? extends T>> var1, final Comparator<? super T> var2) {
         Comparator var3 = new Comparator<IRIRICIHHCOICHHCHCOCCHHOROOCHH<T>>() {
            public int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRIRICIHHCOICHHCHCOCCHHOROOCHH<T> var1, IRIRICIHHCOICHHCHCOCCHHOROOCHH<T> var2x) {
               return var2.compare(var1.peek(), var2x.peek());
            }
         };
         this.CCCHRICRRCCCHOCOOIHHICRRRCCHIR = new PriorityQueue<>(2, var3);

         for (Iterator var5 : var1) {
            if (var5.hasNext()) {
               this.CCCHRICRRCCCHOCOOIHHICRRRCCHIR.add(HRCROCOHHHICRHIHHOOCIIRRRCCIRR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var5));
            }
         }
      }

      @Override
      public boolean hasNext() {
         return !this.CCCHRICRRCCCHOCOOIHHICRRRCCHIR.isEmpty();
      }

      @Override
      public T next() {
         IRIRICIHHCOICHHCHCOCCHHOROOCHH var1 = this.CCCHRICRRCCCHOCOOIHHICRRRCCHIR.remove();
         Object var2 = var1.next();
         if (var1.hasNext()) {
            this.CCCHRICRRCCCHOCOOIHHICRRRCCHIR.add(var1);
         }

         return (T)var2;
      }
   }

   private enum HHCCIRHCCCIIRHCROHIORHIRHHIORH implements Iterator<Object> {
      INSTANCE;

      @Override
      public boolean hasNext() {
         return false;
      }

      @Override
      public Object next() {
         throw new NoSuchElementException();
      }

      @Override
      public void remove() {
         ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkRemove(false);
      }
   }

   private static class IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> implements Iterator<T> {
      private @Nullable Iterator<? extends T> toRemove;
      private Iterator<? extends T> iterator = HRCROCOHHHICRHIHHOOCIIRRRCCIRR.HICCIROIRICHHOCICHCIOOROHHIOOR();
      private Iterator<? extends Iterator<? extends T>> topMetaIterator;
      private @Nullable Deque<Iterator<? extends Iterator<? extends T>>> metaIterators;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(Iterator<? extends Iterator<? extends T>> var1) {
         this.topMetaIterator = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
      }

      private @Nullable Iterator<? extends Iterator<? extends T>> getTopMetaIterator() {
         while (this.topMetaIterator == null || !this.topMetaIterator.hasNext()) {
            if (this.metaIterators == null || this.metaIterators.isEmpty()) {
               return null;
            }

            this.topMetaIterator = this.metaIterators.removeFirst();
         }

         return this.topMetaIterator;
      }

      @Override
      public boolean hasNext() {
         while (
            !com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
                  this.iterator
               )
               .hasNext()
         ) {
            this.topMetaIterator = this.getTopMetaIterator();
            if (this.topMetaIterator == null) {
               return false;
            }

            this.iterator = (Iterator<? extends T>)this.topMetaIterator.next();
            if (this.iterator instanceof HRCROCOHHHICRHIHHOOCIIRRRCCIRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH) {
               HRCROCOHHHICRHIHHOOCIIRRRCCIRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = (HRCROCOHHHICRHIHHOOCIIRRRCCIRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.iterator;
               this.iterator = var1.iterator;
               if (this.metaIterators == null) {
                  this.metaIterators = new ArrayDeque<>();
               }

               this.metaIterators.addFirst(this.topMetaIterator);
               if (var1.metaIterators != null) {
                  while (!var1.metaIterators.isEmpty()) {
                     this.metaIterators.addFirst(var1.metaIterators.removeLast());
                  }
               }

               this.topMetaIterator = var1.topMetaIterator;
            }
         }

         return true;
      }

      @Override
      public T next() {
         if (this.hasNext()) {
            this.toRemove = this.iterator;
            return (T)this.iterator.next();
         } else {
            throw new NoSuchElementException();
         }
      }

      @Override
      public void remove() {
         ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkRemove(this.toRemove != null);
         this.toRemove.remove();
         this.toRemove = null;
      }
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T>
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> {
      static final RRRIRIOCCHRHRIRHIRIIHCOHRHHIIC<Object> RHOCHHCOHOOORORCCROHIRHOIOOIOI = new HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(
         new Object[0], 0, 0, 0
      );
      private final T[] RCOHOORHCIHRRHHIRHIOICCHCHOCHR;
      private final int HHROCIICOCOIOROHHCCCROCHHOOCIR;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(T[] var1, int var2, int var3, int var4) {
         super(var3, var4);
         this.RCOHOORHCIHRRHHIRHIOICCHCHOCHR = (T[])var1;
         this.HHROCIICOCOIOROHHCCCROCHHOOCIR = var2;
      }

      @Override
      protected T get(int var1) {
         return this.RCOHOORHCIHRRHHIRHIOICCHCHOCHR[this.HHROCIICOCOIOROHHCCCROCHHOOCIR + var1];
      }
   }

   private static class RRCRRCORICCHOHHIRCHIROOHIIOHCO<E> implements IRIRICIHHCOICHHCHCOCCHHOROOCHH<E> {
      private final Iterator<? extends E> HHOCCIOHRCHOIRHRRIHROOHRHORROI;
      private boolean hasPeeked;
      private @Nullable E peekedElement;

      public RRCRRCORICCHOHHIRCHIROOHIIOHCO(Iterator<? extends E> var1) {
         this.HHOCCIOHRCHOIRHRRIHROOHRHORROI = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
      }

      @Override
      public boolean hasNext() {
         return this.hasPeeked || this.HHOCCIOHRCHOIRHRRIHROOHRHORROI.hasNext();
      }

      @Override
      public E next() {
         if (!this.hasPeeked) {
            return (E)this.HHOCCIOHRCHOIRHRRIHROOHRHORROI.next();
         }

         Object var1 = this.peekedElement;
         this.hasPeeked = false;
         this.peekedElement = null;
         return (E)var1;
      }

      @Override
      public void remove() {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
            !this.hasPeeked, "Can't remove after you've peeked at next"
         );
         this.HHOCCIOHRCHOIRHRRIHROOHRHORROI.remove();
      }

      @Override
      public E peek() {
         if (!this.hasPeeked) {
            this.peekedElement = (E)this.HHOCCIOHRCHOIRHRRIHROOHRHORROI.next();
            this.hasPeeked = true;
         }

         return this.peekedElement;
      }
   }
}
