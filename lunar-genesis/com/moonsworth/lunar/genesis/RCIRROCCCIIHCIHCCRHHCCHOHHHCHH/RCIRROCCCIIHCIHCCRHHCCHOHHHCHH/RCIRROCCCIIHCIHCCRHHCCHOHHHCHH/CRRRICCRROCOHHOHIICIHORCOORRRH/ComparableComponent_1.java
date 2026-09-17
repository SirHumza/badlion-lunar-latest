package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class RIRHOCHIORCCIIOIIRHOCCCRHHCHHH {
   private RIRHOCHIORCCIIOIIRHOCCCRHHCHHH() {
   }

   public static <E> Collection<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Collection<E> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super E> var1
   ) {
      return var0 instanceof RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
         ? ((RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var0).CRRRICCRROCOHHOHIICIHORCOORRRH(var1)
         : new RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var0
            ),
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var1
            )
         );
   }

   static boolean safeContains(Collection<?> var0, @Nullable Object var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );

      try {
         return var0.contains(var1);
      } catch (ClassCastException | NullPointerException var3) {
         return false;
      }
   }

   static boolean safeRemove(Collection<?> var0, @Nullable Object var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );

      try {
         return var0.remove(var1);
      } catch (ClassCastException | NullPointerException var3) {
         return false;
      }
   }

   public static <F, T> Collection<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Collection<F> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super F, T> var1
   ) {
      return new RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<>(var0, var1);
   }

   static boolean containsAllImpl(Collection<?> var0, Collection<?> var1) {
      for (Object var3 : var1) {
         if (!var0.contains(var3)) {
            return false;
         }
      }

      return true;
   }

   static String toStringImpl(Collection<?> var0) {
      StringBuilder var1 = newStringBuilderForCollection(var0.size()).append('[');
      boolean var2 = true;

      for (Object var4 : var0) {
         if (!var2) {
            var1.append(", ");
         }

         var2 = false;
         if (var4 == var0) {
            var1.append("(this Collection)");
         } else {
            var1.append(var4);
         }
      }

      return var1.append(']').toString();
   }

   static StringBuilder newStringBuilderForCollection(int var0) {
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var0, "size");
      return new StringBuilder((int)Math.min(var0 * 8L, 1073741824L));
   }

   static <T> Collection<T> cast(Iterable<T> var0) {
      return (Collection<T>)var0;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <E extends Comparable<? super E>> Collection<List<E>> orderedPermutations(Iterable<E> var0) {
      return orderedPermutations(var0, IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC());
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <E> Collection<List<E>> orderedPermutations(Iterable<E> var0, Comparator<? super E> var1) {
      return new RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(var0, var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <E> Collection<List<E>> permutations(Collection<E> var0) {
      return new RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.CRRRICCRROCOHHOHIICIHORCOORRRH<>(COIRRRCIORROCHIROCHROCHICCICIC.RIROICHCRROROHCCROOCCCCOCHCCRI(var0));
   }

   private static boolean isPermutation(List<?> var0, List<?> var1) {
      if (var0.size() != var1.size()) {
         return false;
      }

      OCRCHRHOCCHCHRCORHIHRRRRHCHHCH var2 = OCRCHRHOCCHCHRCORHIHRRRRHCHHCH.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var0);
      OCRCHRHOCCHCHRCORHIHRRRRHCHHCH var3 = OCRCHRHOCCHCHRCORHIHRRRRHCHHCH.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var1);
      return var2.equals(var3);
   }

   private static final class CRRRICCRROCOHHOHIICIHORCOORRRH<E> extends AbstractCollection<List<E>> {
      final COIRRRCIORROCHIROCHROCHICCICIC<E> CHCCHCHOICRRIROOICCIORRHHOIIOH;

      CRRRICCRROCOHHOHIICIHORCOORRRH(COIRRRCIORROCHIROCHROCHICCICIC<E> var1) {
         this.CHCCHCHOICRRIROOICCIORRHHOIIOH = var1;
      }

      @Override
      public int size() {
         return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.factorial(
            this.CHCCHCHOICRRIROOICCIORRHHOIIOH.size()
         );
      }

      @Override
      public boolean isEmpty() {
         return false;
      }

      @Override
      public Iterator<List<E>> iterator() {
         return new RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO<>(this.CHCCHCHOICRRIROOICCIORRHHOIIOH);
      }

      @Override
      public boolean contains(@Nullable Object var1) {
         if (var1 instanceof List) {
            List var2 = (List)var1;
            return RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.isPermutation(this.CHCCHCHOICRRIROOICCIORRHHOIIOH, var2);
         } else {
            return false;
         }
      }

      @Override
      public String toString() {
         return "permutations(" + this.CHCCHCHOICRRIROOICCIORRHHOIIOH + ")";
      }
   }

   private static final class HHCCIRHCCCIIRHCROHIORHIRHHIORH<E>
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<List<E>> {
      @Nullable List<E> nextPermutation;
      final Comparator<? super E> OIHOCCHORIIORIIRRIHCRHHIIRICRH;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(List<E> var1, Comparator<? super E> var2) {
         this.nextPermutation = RCHOIICIHOCIRCIOORIOHRCRHOCRCR.newArrayList(var1);
         this.OIHOCCHORIIORIIRRIHCRHHIIRICRH = var2;
      }

      protected List<E> computeNext() {
         if (this.nextPermutation == null) {
            return this.ROCOROCOICRHOICORCIIRRRROCOHOC();
         }

         COIRRRCIORROCHIROCHROCHICCICIC var1 = COIRRRCIORROCHIROCHROCHICCICIC.RIROICHCRROROHCCROOCCCCOCHCCRI(this.nextPermutation);
         this.calculateNextPermutation();
         return var1;
      }

      void calculateNextPermutation() {
         int var1 = this.findNextJ();
         if (var1 == -1) {
            this.nextPermutation = null;
         } else {
            int var2 = this.findNextL(var1);
            Collections.swap(this.nextPermutation, var1, var2);
            int var3 = this.nextPermutation.size();
            Collections.reverse(this.nextPermutation.subList(var1 + 1, var3));
         }
      }

      int findNextJ() {
         for (int var1 = this.nextPermutation.size() - 2; var1 >= 0; var1--) {
            if (this.OIHOCCHORIIORIIRRIHCRHHIIRICRH.compare(this.nextPermutation.get(var1), this.nextPermutation.get(var1 + 1)) < 0) {
               return var1;
            }
         }

         return -1;
      }

      int findNextL(int var1) {
         Object var2 = this.nextPermutation.get(var1);

         for (int var3 = this.nextPermutation.size() - 1; var3 > var1; var3--) {
            if (this.OIHOCCHORIIORIIRRIHCRHHIIRICRH.compare((E)var2, this.nextPermutation.get(var3)) < 0) {
               return var3;
            }
         }

         throw new AssertionError("this statement should be unreachable");
      }
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> extends AbstractCollection<List<E>> {
      final COIRRRCIORROCHIROCHROCHICCICIC<E> CORHCCOHIRHRROCROOCOIOICOIOOOH;
      final Comparator<? super E> ORIHHRROCIHOHRHCCHCCORROCROCII;
      final int HOHIRRHIRCRHHCHRIRRIIHCOIOHCRI;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(Iterable<E> var1, Comparator<? super E> var2) {
         this.CORHCCOHIRHRROCROOCOIOICOIOOOH = COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1);
         this.ORIHHRROCIHOHRHCCHCCORROCROCII = var2;
         this.HOHIRRHIRCRHHCHRIRRIIHCOIOHCRI = calculateSize(this.CORHCCOHIRHRROCROOCOIOICOIOOOH, var2);
      }

      private static <E> int calculateSize(List<E> var0, Comparator<? super E> var1) {
         int var2 = 1;
         int var3 = 1;

         int var4;
         for (var4 = 1; var3 < var0.size(); var4++) {
            int var5 = var1.compare(var0.get(var3 - 1), var0.get(var3));
            if (var5 < 0) {
               var2 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.saturatedMultiply(
                  var2,
                  com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.binomial(
                     var3, var4
                  )
               );
               var4 = 0;
               if (var2 == Integer.MAX_VALUE) {
                  return Integer.MAX_VALUE;
               }
            }

            var3++;
         }

         return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.saturatedMultiply(
            var2,
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.binomial(
               var3, var4
            )
         );
      }

      @Override
      public int size() {
         return this.HOHIRRHIRCRHHCHRIRRIIHCOIOHCRI;
      }

      @Override
      public boolean isEmpty() {
         return false;
      }

      @Override
      public Iterator<List<E>> iterator() {
         return new RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<>(this.CORHCCOHIRHRROCROOCOIOICOIOOOH, this.ORIHHRROCIHOHRHCCHCCORROCROCII);
      }

      @Override
      public boolean contains(@Nullable Object var1) {
         if (var1 instanceof List) {
            List var2 = (List)var1;
            return RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.isPermutation(this.CORHCCOHIRHRROCROOCOIOICOIOOOH, var2);
         } else {
            return false;
         }
      }

      @Override
      public String toString() {
         return "orderedPermutationCollection(" + this.CORHCCOHIRHRROCROOCOIOICOIOOOH + ")";
      }
   }

   static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> extends AbstractCollection<E> {
      final Collection<E> ICRCRCIHHIHCRIRCIRRIORORCHOIHR;
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super E> IRCIHIHHROCHORIOICOHOCHRCCHICR;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         Collection<E> var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super E> var2
      ) {
         this.ICRCRCIHHIHCRIRCIRRIORORCHOIHR = var1;
         this.IRCIHIHHROCHORIOICOHOCHRCCHICR = var2;
      }

      RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> CRRRICCRROCOHHOHIICIHORCOORRRH(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super E> var1
      ) {
         return new RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(
            this.ICRCRCIHHIHCRIRCIRRIORORCHOIHR,
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this.IRCIHIHHROCHORIOICOHOCHRCCHICR, var1
            )
         );
      }

      @Override
      public boolean add(E var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            this.IRCIHIHHROCHORIOICOHOCHRCCHICR.apply((E)var1)
         );
         return this.ICRCRCIHHIHCRIRCIRRIORORCHOIHR.add((E)var1);
      }

      @Override
      public boolean addAll(Collection<? extends E> var1) {
         for (Object var3 : var1) {
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
               this.IRCIHIHHROCHORIOICOHOCHRCCHICR.apply((E)var3)
            );
         }

         return this.ICRCRCIHHIHCRIRCIRRIORORCHOIHR.addAll(var1);
      }

      @Override
      public void clear() {
         IRIHOIRCHIRRCRIOORCOICORHHORHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.ICRCRCIHHIHCRIRCIRRIORORCHOIHR, this.IRCIHIHHROCHORIOICOHOCHRCCHICR);
      }

      @Override
      public boolean contains(@Nullable Object var1) {
         if (RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.safeContains(this.ICRCRCIHHIHCRIRCIRRIORORCHOIHR, var1)) {
            Object var2 = var1;
            return this.IRCIHIHHROCHORIOICOHOCHRCCHICR.apply((E)var2);
         } else {
            return false;
         }
      }

      @Override
      public boolean containsAll(Collection<?> var1) {
         return RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.containsAllImpl(this, var1);
      }

      @Override
      public boolean isEmpty() {
         return !IRIHOIRCHIRRCRIOORCOICORHHORHH.CRRRICCRROCOHHOHIICIHORCOORRRH(this.ICRCRCIHHIHCRIRCIRRIORORCHOIHR, this.IRCIHIHHROCHORIOICOHOCHRCCHICR);
      }

      @Override
      public Iterator<E> iterator() {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            this.ICRCRCIHHIHCRIRCIRRIORORCHOIHR.iterator(), this.IRCIHIHHROCHORIOICOHOCHRCCHICR
         );
      }

      @Override
      public Spliterator<E> spliterator() {
         return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.filter(this.ICRCRCIHHIHCRIRCIRRIORORCHOIHR.spliterator(), this.IRCIHIHHROCHORIOICOHOCHRCCHICR);
      }

      @Override
      public void forEach(Consumer<? super E> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.ICRCRCIHHIHCRIRCIRRIORORCHOIHR.forEach(var2 -> {
            if (this.IRCIHIHHROCHORIOICOHOCHRCCHICR.test(var2)) {
               var1.accept(var2);
            }
         });
      }

      @Override
      public boolean remove(Object var1) {
         return this.contains(var1) && this.ICRCRCIHHIHCRIRCIRRIORORCHOIHR.remove(var1);
      }

      @Override
      public boolean removeAll(Collection<?> var1) {
         return this.removeIf(var1::contains);
      }

      @Override
      public boolean retainAll(Collection<?> var1) {
         return this.removeIf(var1x -> !var1.contains(var1x));
      }

      @Override
      public boolean removeIf(Predicate<? super E> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         return this.ICRCRCIHHIHCRIRCIRRIORORCHOIHR.removeIf(var2 -> this.IRCIHIHHROCHORIOICOHOCHRCCHICR.apply(var2) && var1.test(var2));
      }

      @Override
      public int size() {
         int var1 = 0;

         for (Object var3 : this.ICRCRCIHHIHCRIRCIRRIORORCHOIHR) {
            if (this.IRCIHIHHROCHORIOICOHOCHRCCHICR.apply((E)var3)) {
               var1++;
            }
         }

         return var1;
      }

      @Override
      public Object[] toArray() {
         return RCHOIICIHOCIRCIOORIOHRCRHOCRCR.newArrayList(this.iterator()).toArray();
      }

      @Override
      public <T> T[] toArray(T[] var1) {
         return (T[])RCHOIICIHOCIRCIOORIOHRCRHOCRCR.newArrayList(this.iterator()).toArray(var1);
      }
   }

   static class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<F, T> extends AbstractCollection<T> {
      final Collection<F> RRROICHOCIOIRCHICHOCCIIRORRRCO;
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super F, ? extends T> RIRHCRIOIOICOICRRORICHIOROHHCO;

      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         Collection<F> var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super F, ? extends T> var2
      ) {
         this.RRROICHOCIOIRCHICHOCCIIRORRRCO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.RIRHCRIOIOICOICRRORICHIOROHHCO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var2
         );
      }

      @Override
      public void clear() {
         this.RRROICHOCIOIRCHICHOCCIIRORRRCO.clear();
      }

      @Override
      public boolean isEmpty() {
         return this.RRROICHOCIOIRCHICHOCCIIRORRRCO.isEmpty();
      }

      @Override
      public Iterator<T> iterator() {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.RRROICHOCIOIRCHICHOCCIIRORRRCO.iterator(), this.RIRHCRIOIOICOICRRORICHIOROHHCO
         );
      }

      @Override
      public Spliterator<T> spliterator() {
         return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.map(this.RRROICHOCIOIRCHICHOCCIIRORRRCO.spliterator(), this.RIRHCRIOIOICOICRRORICHIOROHHCO);
      }

      @Override
      public void forEach(Consumer<? super T> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.RRROICHOCIOIRCHICHOCCIIRORRRCO.forEach(var2 -> var1.accept((T)this.RIRHCRIOIOICOICRRORICHIOROHHCO.apply(var2)));
      }

      @Override
      public boolean removeIf(Predicate<? super T> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         return this.RRROICHOCIOIRCHICHOCCIIRORRRCO.removeIf(var2 -> var1.test((T)this.RIRHCRIOIOICOICRRORICHIOROHHCO.apply(var2)));
      }

      @Override
      public int size() {
         return this.RRROICHOCIOIRCHICHOCCIIRORRRCO.size();
      }
   }

   private static class RRCRRCORICCHOHHIRCHIROOHIIOHCO<E>
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<List<E>> {
      final List<E> HROOCHRCICRHHOROICRIIHRRCCIOHH;
      final int[] RIRIRIRIICRICHCRRIHOOOCIOHHHRO;
      final int[] IOOORIOCIHIIOIICHIOOCROICOHOCH;
      int j;

      RRCRRCORICCHOHHIRCHIROOHIIOHCO(List<E> var1) {
         this.HROOCHRCICRHHOROICRIIHRRCCIOHH = new ArrayList<>(var1);
         int var2 = var1.size();
         this.RIRIRIRIICRICHCRRIHOOOCIOHHHRO = new int[var2];
         this.IOOORIOCIHIIOIICHIOOCROICOHOCH = new int[var2];
         Arrays.fill(this.RIRIRIRIICRICHCRRIHOOOCIOHHHRO, 0);
         Arrays.fill(this.IOOORIOCIHIIOIICHIOOCROICOHOCH, 1);
         this.j = Integer.MAX_VALUE;
      }

      protected List<E> computeNext() {
         if (this.j <= 0) {
            return this.ROCOROCOICRHOICORCIIRRRROCOHOC();
         }

         COIRRRCIORROCHIROCHROCHICCICIC var1 = COIRRRCIORROCHIROCHROCHICCICIC.RIROICHCRROROHCCROOCCCCOCHCCRI(this.HROOCHRCICRHHOROICRIIHRRCCIOHH);
         this.calculateNextPermutation();
         return var1;
      }

      void calculateNextPermutation() {
         this.j = this.HROOCHRCICRHHOROICRIIHRRCCIOHH.size() - 1;
         int var1 = 0;
         if (this.j != -1) {
            while (true) {
               int var2 = this.RIRIRIRIICRICHCRRIHOOOCIOHHHRO[this.j] + this.IOOORIOCIHIIOIICHIOOCROICOHOCH[this.j];
               if (var2 >= 0) {
                  if (var2 != this.j + 1) {
                     Collections.swap(this.HROOCHRCICRHHOROICRIIHRRCCIOHH, this.j - this.RIRIRIRIICRICHCRRIHOOOCIOHHHRO[this.j] + var1, this.j - var2 + var1);
                     this.RIRIRIRIICRICHCRRIHOOOCIOHHHRO[this.j] = var2;
                     break;
                  }

                  if (this.j == 0) {
                     break;
                  }

                  var1++;
                  this.switchDirection();
               } else {
                  this.switchDirection();
               }
            }
         }
      }

      void switchDirection() {
         this.IOOORIOCIHIIOIICHIOOCROICOHOCH[this.j] = -this.IOOORIOCIHIIOIICHIOOCROICOHOCH[this.j];
         this.j--;
      }
   }
}
