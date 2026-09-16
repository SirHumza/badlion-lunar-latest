package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
public final class RCHOIICIHOCIRCIOORIOHRCRHOCRCR {
   private RCHOIICIHOCIRCIOORIOHRCRHOCRCR() {
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public static <E> ArrayList<E> newArrayList() {
      return new ArrayList<>();
   }

   @SafeVarargs
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public static <E> ArrayList<E> newArrayList(E... var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      int var1 = computeArrayListCapacity(var0.length);
      ArrayList var2 = new ArrayList(var1);
      Collections.addAll(var2, (E[])var0);
      return var2;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public static <E> ArrayList<E> newArrayList(Iterable<? extends E> var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      return var0 instanceof Collection ? new ArrayList<>(RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.cast(var0)) : newArrayList(var0.iterator());
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public static <E> ArrayList<E> newArrayList(Iterator<? extends E> var0) {
      ArrayList var1 = newArrayList();
      HRCROCOHHHICRHIHHOOCIIRRRCCIRR.addAll(var1, var0);
      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static int computeArrayListCapacity(int var0) {
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var0, "arraySize");
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.saturatedCast(
         5L + var0 + var0 / 10
      );
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public static <E> ArrayList<E> newArrayListWithCapacity(int var0) {
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var0, "initialArraySize");
      return new ArrayList<>(var0);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public static <E> ArrayList<E> newArrayListWithExpectedSize(int var0) {
      return new ArrayList<>(computeArrayListCapacity(var0));
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public static <E> LinkedList<E> newLinkedList() {
      return new LinkedList<>();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public static <E> LinkedList<E> newLinkedList(Iterable<? extends E> var0) {
      LinkedList var1 = newLinkedList();
      IRIHOIRCHIRRCRIOORCOICORHHORHH.addAll(var1, var0);
      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
      return new CopyOnWriteArrayList<>();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList(Iterable<? extends E> var0) {
      Collection var1 = var0 instanceof Collection ? RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.cast(var0) : newArrayList(var0);
      return new CopyOnWriteArrayList<>(var1);
   }

   public static <E> List<E> asList(@Nullable E var0, E[] var1) {
      return new RCHOIICIHOCIRCIOORIOHRCRHOCRCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH<>((E)var0, (E[])var1);
   }

   public static <E> List<E> asList(@Nullable E var0, @Nullable E var1, E[] var2) {
      return new RCHOIICIHOCIRCIOORIOHRCRHOCRCR.IIHRRHORCRCROCHHOHORCHCROCIHRO<>((E)var0, (E)var1, (E[])var2);
   }

   public static <B> List<List<B>> cartesianProduct(List<? extends List<? extends B>> var0) {
      return ORHIOICIOCRRHOOCOHRORIHICHRCRR.create(var0);
   }

   @SafeVarargs
   public static <B> List<List<B>> cartesianProduct(List<? extends B>... var0) {
      return cartesianProduct(Arrays.asList(var0));
   }

   public static <F, T> List<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      List<F> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super F, ? extends T> var1
   ) {
      return var0 instanceof RandomAccess
         ? new RCHOIICIHOCIRCIOORIOHRCRHOCRCR.CRICCOOHHHCHOORCICOCOHIHOIRHOO<>(var0, var1)
         : new RCHOIICIHOCIRCIOORIOHRCRHOCRCR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI<>(var0, var1);
   }

   public static <T> List<List<T>> partition(List<T> var0, int var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1 > 0
      );
      return var0 instanceof RandomAccess
         ? new RCHOIICIHOCIRCIOORIOHRCRHOCRCR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<>(var0, var1)
         : new RCHOIICIHOCIRCIOORIOHRCRHOCRCR.CRRRICCRROCOHHOHIICIHORCOORRRH<>(var0, var1);
   }

   public static COIRRRCIORROCHIROCHROCHICCICIC<Character> HROOHRRCICHIIOOHRCHRCHHHIRRCIH(String var0) {
      return new RCHOIICIHOCIRCIOORIOHRCRHOCRCR.CORCOCICIRIOHROHROIIOOHICCHCRR(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var0
         )
      );
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static List<Character> charactersOf(CharSequence var0) {
      return new RCHOIICIHOCIRCIOORIOHRCRHOCRCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var0
         )
      );
   }

   public static <T> List<T> reverse(List<T> var0) {
      if (var0 instanceof COIRRRCIORROCHIROCHROCHICCICIC) {
         return ((COIRRRCIORROCHIROCHROCHICCICIC)var0).RROORHRCHCRRRIHOOIHCRRRICORROO();
      } else if (var0 instanceof RCHOIICIHOCIRCIOORIOHRCRHOCRCR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR) {
         return ((RCHOIICIHOCIRCIOORIOHRCRHOCRCR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR)var0).getForwardList();
      } else {
         return var0 instanceof RandomAccess
            ? new RCHOIICIHOCIRCIOORIOHRCRHOCRCR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<>(var0)
            : new RCHOIICIHOCIRCIOORIOHRCRHOCRCR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<>(var0);
      }
   }

   static int hashCodeImpl(List<?> var0) {
      int var1 = 1;

      for (Object var3 : var0) {
         var1 = 31 * var1 + (var3 == null ? 0 : var3.hashCode());
         var1 = ~(~var1);
      }

      return var1;
   }

   static boolean equalsImpl(List<?> var0, @Nullable Object var1) {
      if (var1
         == com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var0
         )) {
         return true;
      }

      if (!(var1 instanceof List)) {
         return false;
      }

      List var2 = (List)var1;
      int var3 = var0.size();
      if (var3 != var2.size()) {
         return false;
      }

      if (var0 instanceof RandomAccess && var2 instanceof RandomAccess) {
         for (int var4 = 0; var4 < var3; var4++) {
            if (!com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
               var0.get(var4), var2.get(var4)
            )) {
               return false;
            }
         }

         return true;
      } else {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.elementsEqual(var0.iterator(), var2.iterator());
      }
   }

   static <E> boolean addAllImpl(List<E> var0, int var1, Iterable<? extends E> var2) {
      boolean var3 = false;
      ListIterator var4 = var0.listIterator(var1);

      for (Object var6 : var2) {
         var4.add(var6);
         var3 = true;
      }

      return var3;
   }

   static int indexOfImpl(List<?> var0, @Nullable Object var1) {
      if (var0 instanceof RandomAccess) {
         return indexOfRandomAccess(var0, var1);
      }

      ListIterator var2 = var0.listIterator();

      while (var2.hasNext()) {
         if (com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
            var1, var2.next()
         )) {
            return var2.previousIndex();
         }
      }

      return -1;
   }

   private static int indexOfRandomAccess(List<?> var0, @Nullable Object var1) {
      int var2 = var0.size();
      if (var1 == null) {
         for (int var3 = 0; var3 < var2; var3++) {
            if (var0.get(var3) == null) {
               return var3;
            }
         }
      } else {
         for (int var4 = 0; var4 < var2; var4++) {
            if (var1.equals(var0.get(var4))) {
               return var4;
            }
         }
      }

      return -1;
   }

   static int lastIndexOfImpl(List<?> var0, @Nullable Object var1) {
      if (var0 instanceof RandomAccess) {
         return lastIndexOfRandomAccess(var0, var1);
      }

      ListIterator var2 = var0.listIterator(var0.size());

      while (var2.hasPrevious()) {
         if (com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
            var1, var2.previous()
         )) {
            return var2.nextIndex();
         }
      }

      return -1;
   }

   private static int lastIndexOfRandomAccess(List<?> var0, @Nullable Object var1) {
      if (var1 == null) {
         for (int var2 = var0.size() - 1; var2 >= 0; var2--) {
            if (var0.get(var2) == null) {
               return var2;
            }
         }
      } else {
         for (int var3 = var0.size() - 1; var3 >= 0; var3--) {
            if (var1.equals(var0.get(var3))) {
               return var3;
            }
         }
      }

      return -1;
   }

   static <E> ListIterator<E> listIteratorImpl(List<E> var0, int var1) {
      return new RCHOIICIHOCIRCIOORIOHRCRHOCRCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>(var0).listIterator(var1);
   }

   static <E> List<E> subListImpl(List<E> var0, int var1, int var2) {
      RCHOIICIHOCIRCIOORIOHRCRHOCRCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3;
      if (var0 instanceof RandomAccess) {
         var3 = new RCHOIICIHOCIRCIOORIOHRCRHOCRCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO<E>(var0) {
            private static final long ROIIRORICCHOIIICIOIICHICOHCRRO = 0L;

            @Override
            public ListIterator<E> listIterator(int var1) {
               return this.CHICOOCHHOCHOIHIHHHIIRCROOORIO.listIterator(var1);
            }
         };
      } else {
         var3 = new RCHOIICIHOCIRCIOORIOHRCRHOCRCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>(var0) {
            private static final long RCHRROCRHHOHRHCCOOOIIRIHHCHOIH = 0L;

            @Override
            public ListIterator<E> listIterator(int var1) {
               return this.CHICOOCHHOCHOIHIHHHIIRCROOORIO.listIterator(var1);
            }
         };
      }

      return var3.subList(var1, var2);
   }

   static <T> List<T> cast(Iterable<T> var0) {
      return (List<T>)var0;
   }

   private static final class CORCOCICIRIOHROHROIIOOHICCHCRR extends COIRRRCIORROCHIROCHROCHICCICIC<Character> {
      private final String CIIIOHCHCIIOHHCIHROIRIOORCRRCO;

      CORCOCICIRIOHROHROIIOOHICCHCRR(String var1) {
         this.CIIIOHCHCIIOHHCIHROIRIOORCRRCO = var1;
      }

      @Override
      public int indexOf(@Nullable Object var1) {
         return var1 instanceof Character ? this.CIIIOHCHCIIOHHCIHROIRIOORCRRCO.indexOf((Character)var1) : -1;
      }

      @Override
      public int lastIndexOf(@Nullable Object var1) {
         return var1 instanceof Character ? this.CIIIOHCHCIIOHHCIHROIRIOORCRRCO.lastIndexOf((Character)var1) : -1;
      }

      @Override
      public COIRRRCIORROCHIROCHROCHICCICIC<Character> HIHCHCORCCRCOHCRROHOHOOCHOROCC(int var1, int var2) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(
            var1, var2, this.size()
         );
         return RCHOIICIHOCIRCIOORIOHRCRHOCRCR.HROOHRRCICHIIOOHRCHRCHHHIRRCIH(this.CIIIOHCHCIIOHHCIHROIRIOORCRRCO.substring(var1, var2));
      }

      @Override
      boolean isPartialView() {
         return false;
      }

      public Character get(int var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(
            var1, this.size()
         );
         return this.CIIIOHCHCIIOHHCIHROIRIOORCRRCO.charAt(var1);
      }

      @Override
      public int size() {
         return this.CIIIOHCHCIIOHHCIHROIRIOORCRRCO.length();
      }
   }

   private static class CRICCOOHHHCHOORCICOCOHIHOIRHOO<F, T> extends AbstractList<T> implements Serializable, RandomAccess {
      final List<F> HCCICROCIHHOCCOHIOIHOOCOIRIIIC;
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super F, ? extends T> ICRCIIOHICRHICICCIHHROICRCHHIH;
      private static final long OICROCHCHOCOOHOCRCOOROHCCICCIC = 0L;

      CRICCOOHHHCHOORCICOCOHIHOIRHOO(
         List<F> var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super F, ? extends T> var2
      ) {
         this.HCCICROCIHHOCCOHIOIHOOCOIRIIIC = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.ICRCIIOHICRHICICCIHHROICRCHHIH = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var2
         );
      }

      @Override
      public void clear() {
         this.HCCICROCIHHOCCOHIOIHOOCOIRIIIC.clear();
      }

      @Override
      public T get(int var1) {
         return (T)this.ICRCIIOHICRHICICCIHHROICRCHHIH.apply(this.HCCICROCIHHOCCOHIOIHOOCOIRIIIC.get(var1));
      }

      @Override
      public Iterator<T> iterator() {
         return this.listIterator();
      }

      @Override
      public ListIterator<T> listIterator(int var1) {
         return new CCHCOROOHHCIHOHOCHIHRHOHOCROII<F, T>(this.HCCICROCIHHOCCOHIOIHOOCOIRIIIC.listIterator(var1)) {
            @Override
            T transform(F var1) {
               return (T)CRICCOOHHHCHOORCICOCOHIHOIRHOO.this.ICRCIIOHICRHICICCIHHROICRCHHIH.apply((F)var1);
            }
         };
      }

      @Override
      public boolean isEmpty() {
         return this.HCCICROCIHHOCCOHIOIHOOCOIRIIIC.isEmpty();
      }

      @Override
      public boolean removeIf(Predicate<? super T> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         return this.HCCICROCIHHOCCOHIOIHOOCOIRIIIC.removeIf(var2 -> var1.test((T)this.ICRCIIOHICRHICICCIHHROICRCHHIH.apply(var2)));
      }

      @Override
      public T remove(int var1) {
         return (T)this.ICRCIIOHICRHICICCIHHROICRCHHIH.apply(this.HCCICROCIHHOCCOHIOIHOOCOIRIIIC.remove(var1));
      }

      @Override
      public int size() {
         return this.HCCICROCIHHOCCOHIOIHOOCOIRIIIC.size();
      }
   }

   private static class CRRRICCRROCOHHOHIICIHORCOORRRH<T> extends AbstractList<List<T>> {
      final List<T> CRCCHOIOHCCOHHIIICCOORCCOHOIHI;
      final int IHICRHIIORCOORRHRRRCRROCCHIHCH;

      CRRRICCRROCOHHOHIICIHORCOORRRH(List<T> var1, int var2) {
         this.CRCCHOIOHCCOHHIIICCOORCCOHOIHI = var1;
         this.IHICRHIIORCOORRHRRRCRROCCHIHCH = var2;
      }

      public List<T> get(int var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(
            var1, this.size()
         );
         int var2 = var1 * this.IHICRHIIORCOORRHRRRCRROCCHIHCH;
         int var3 = Math.min(var2 + this.IHICRHIIORCOORRHRRRCRROCCHIHCH, this.CRCCHOIOHCCOHHIIICCOORCCOHOIHI.size());
         return this.CRCCHOIOHCCOHHIIICCOORCCOHOIHI.subList(var2, var3);
      }

      @Override
      public int size() {
         return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.divide(
            this.CRCCHOIOHCCOHHIIICCOORCCOHOIHI.size(), this.IHICRHIIORCOORRHRRRCRROCCHIHCH, RoundingMode.CEILING
         );
      }

      @Override
      public boolean isEmpty() {
         return this.CRCCHOIOHCCOHHIIICCOORCCOHOIHI.isEmpty();
      }
   }

   private static class HHCCIRHCCCIIRHCROHIORHIRHHIORH<E> extends AbstractList<E> implements Serializable, RandomAccess {
      final @Nullable E RHRIRCRIHOCOCIHOOIRHOOCHIRIHOC;
      final E[] CCIICRRRRRHCIHRCHHICHCHCHCCROC;
      private static final long ICCIICIHRICRCCHIHHIOCORHRRORHO = 0L;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(@Nullable E var1, E[] var2) {
         this.RHRIRCRIHOCOCIHOOIRHOOCHIRIHOC = (E)var1;
         this.CCIICRRRRRHCIHRCHHICHCHCHCCROC = (E[])com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var2
         );
      }

      @Override
      public int size() {
         return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.saturatedAdd(
            this.CCIICRRRRRHCIHRCHHICHCHCHCCROC.length, 1
         );
      }

      @Override
      public E get(int var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(
            var1, this.size()
         );
         return var1 == 0 ? this.RHRIRCRIHOCOCIHOOIRHOOCHIRIHOC : this.CCIICRRRRRHCIHRCHHICHCHCHCCROC[var1 - 1];
      }
   }

   private static class HICHRCOHCCRHOHCICOOCHOIHCCHIRI<F, T> extends AbstractSequentialList<T> implements Serializable {
      final List<F> COHCRIOHOCIORROOIIROCHRRHOIRHC;
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super F, ? extends T> IHHHOHHOHRCIRIHIHHIIIRHROHHIHI;
      private static final long CRORHHRHHCROHIRIIHRCCRHCORRRCH = 0L;

      HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
         List<F> var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super F, ? extends T> var2
      ) {
         this.COHCRIOHOCIORROOIIROCHRRHOIRHC = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.IHHHOHHOHRCIRIHIHHIIIRHROHHIHI = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var2
         );
      }

      @Override
      public void clear() {
         this.COHCRIOHOCIORROOIIROCHRRHOIRHC.clear();
      }

      @Override
      public int size() {
         return this.COHCRIOHOCIORROOIIROCHRRHOIRHC.size();
      }

      @Override
      public ListIterator<T> listIterator(int var1) {
         return new CCHCOROOHHCIHOHOCHIHRHOHOCROII<F, T>(this.COHCRIOHOCIORROOIIROCHRRHOIRHC.listIterator(var1)) {
            @Override
            T transform(F var1) {
               return (T)HICHRCOHCCRHOHCICOOCHOIHCCHIRI.this.IHHHOHHOHRCIRIHIHHIIIRHROHHIHI.apply((F)var1);
            }
         };
      }

      @Override
      public boolean removeIf(Predicate<? super T> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         return this.COHCRIOHOCIORROOIIROCHRRHOIRHC.removeIf(var2 -> var1.test((T)this.IHHHOHHOHRCIRIHIHHIIIRHROHHIHI.apply(var2)));
      }
   }

   private static class HRCHROOHRIHCRCRHRIIROCIRHOIRHH<T> extends RCHOIICIHOCIRCIOORIOHRCRHOCRCR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<T> implements RandomAccess {
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH(List<T> var1) {
         super(var1);
      }
   }

   private static class IIHRRHORCRCROCHHOHORCHCROCIHRO<E> extends AbstractList<E> implements Serializable, RandomAccess {
      final @Nullable E IRRCOOIRHIHCCIICRCHCHIHIHOHRHC;
      final @Nullable E HOCCORRIOOHIOIHOHICCIRIROHIOHI;
      final E[] HIRRORCCHIOCCOROOHOIRIHIICHOHC;
      private static final long RRICRROCHOOIRCRICOICHCRHHRHOCR = 0L;

      IIHRRHORCRCROCHHOHORCHCROCIHRO(@Nullable E var1, @Nullable E var2, E[] var3) {
         this.IRRCOOIRHIHCCIICRCHCHIHIHOHRHC = (E)var1;
         this.HOCCORRIOOHIOIHOHICCIRIROHIOHI = (E)var2;
         this.HIRRORCCHIOCCOROOHOIRIHIICHOHC = (E[])com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var3
         );
      }

      @Override
      public int size() {
         return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.saturatedAdd(
            this.HIRRORCCHIOCCOROOHOIRIHIICHOHC.length, 2
         );
      }

      @Override
      public E get(int var1) {
         switch (var1) {
            case 0:
               return this.IRRCOOIRHIHCCIICRCHCHIHIHOHRHC;
            case 1:
               return this.HOCCORRIOOHIOIHOHICCIRIROHIOHI;
            default:
               com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(
                  var1, this.size()
               );
               return this.HIRRORCCHIOCCOROOHOIRIHIICHOHC[var1 - 2];
         }
      }
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends AbstractList<Character> {
      private final CharSequence CHOCIROICOIHOOIHROIHCHOIHRCCIH;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(CharSequence var1) {
         this.CHOCIROICOIHOOIHROIHCHOIHRCCIH = var1;
      }

      public Character get(int var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(
            var1, this.size()
         );
         return this.CHOCIROICOIHOOIHROIHCHOIHRCCIH.charAt(var1);
      }

      @Override
      public int size() {
         return this.CHOCIROICOIHOOIHROIHCHOIHRCCIH.length();
      }
   }

   private static class OOROOCCIRCCRHOIOIORIHCHHOOCCOR<T> extends AbstractList<T> {
      private final List<T> CRCRHOHIOOIIOIRCCCIIOIHOIRCCCH;

      OOROOCCIRCCRHOIOIORIHCHHOOCCOR(List<T> var1) {
         this.CRCRHOHIOOIIOIRCCCIIOIHOIRCCCH = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
      }

      List<T> getForwardList() {
         return this.CRCRHOHIOOIIOIRCCCIIOIHOIRCCCH;
      }

      private int reverseIndex(int var1) {
         int var2 = this.size();
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(
            var1, var2
         );
         return var2 - 1 - var1;
      }

      private int reversePosition(int var1) {
         int var2 = this.size();
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndex(
            var1, var2
         );
         return var2 - var1;
      }

      @Override
      public void add(int var1, @Nullable T var2) {
         this.CRCRHOHIOOIIOIRCCCIIOIHOIRCCCH.add(this.reversePosition(var1), (T)var2);
      }

      @Override
      public void clear() {
         this.CRCRHOHIOOIIOIRCCCIIOIHOIRCCCH.clear();
      }

      @Override
      public T remove(int var1) {
         return this.CRCRHOHIOOIIOIRCCCIIOIHOIRCCCH.remove(this.reverseIndex(var1));
      }

      @Override
      protected void removeRange(int var1, int var2) {
         this.subList(var1, var2).clear();
      }

      @Override
      public T set(int var1, @Nullable T var2) {
         return this.CRCRHOHIOOIIOIRCCCIIOIHOIRCCCH.set(this.reverseIndex(var1), (T)var2);
      }

      @Override
      public T get(int var1) {
         return this.CRCRHOHIOOIIOIRCCCIIOIHOIRCCCH.get(this.reverseIndex(var1));
      }

      @Override
      public int size() {
         return this.CRCRHOHIOOIIOIRCCCIIOIHOIRCCCH.size();
      }

      @Override
      public List<T> subList(int var1, int var2) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(
            var1, var2, this.size()
         );
         return RCHOIICIHOCIRCIOORIOHRCRHOCRCR.reverse(this.CRCRHOHIOOIIOIRCCCIIOIHOIRCCCH.subList(this.reversePosition(var2), this.reversePosition(var1)));
      }

      @Override
      public Iterator<T> iterator() {
         return this.listIterator();
      }

      @Override
      public ListIterator<T> listIterator(int var1) {
         int var2 = this.reversePosition(var1);
         final ListIterator var3 = this.CRCRHOHIOOIIOIRCCCIIOIHOIRCCCH.listIterator(var2);
         return new ListIterator<T>() {
            boolean canRemoveOrSet;

            @Override
            public void add(T var1) {
               var3.add(var1);
               var3.previous();
               this.canRemoveOrSet = false;
            }

            @Override
            public boolean hasNext() {
               return var3.hasPrevious();
            }

            @Override
            public boolean hasPrevious() {
               return var3.hasNext();
            }

            @Override
            public T next() {
               if (!this.hasNext()) {
                  throw new NoSuchElementException();
               }

               this.canRemoveOrSet = true;
               return (T)var3.previous();
            }

            @Override
            public int nextIndex() {
               return OOROOCCIRCCRHOIOIORIHCHHOOCCOR.this.reversePosition(var3.nextIndex());
            }

            @Override
            public T previous() {
               if (!this.hasPrevious()) {
                  throw new NoSuchElementException();
               }

               this.canRemoveOrSet = true;
               return (T)var3.next();
            }

            @Override
            public int previousIndex() {
               return this.nextIndex() - 1;
            }

            @Override
            public void remove() {
               ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkRemove(this.canRemoveOrSet);
               var3.remove();
               this.canRemoveOrSet = false;
            }

            @Override
            public void set(T var1) {
               com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
                  this.canRemoveOrSet
               );
               var3.set(var1);
            }
         };
      }
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> extends AbstractList<E> {
      final List<E> CHICOOCHHOCHOIHIHHHIIRCROOORIO;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(List<E> var1) {
         this.CHICOOCHHOCHOIHIHHHIIRCROOORIO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
      }

      @Override
      public void add(int var1, E var2) {
         this.CHICOOCHHOCHOIHIHHHIIRCROOORIO.add(var1, (E)var2);
      }

      @Override
      public boolean addAll(int var1, Collection<? extends E> var2) {
         return this.CHICOOCHHOCHOIHIHHHIIRCROOORIO.addAll(var1, var2);
      }

      @Override
      public E get(int var1) {
         return this.CHICOOCHHOCHOIHIHHHIIRCROOORIO.get(var1);
      }

      @Override
      public E remove(int var1) {
         return this.CHICOOCHHOCHOIHIHHHIIRCROOORIO.remove(var1);
      }

      @Override
      public E set(int var1, E var2) {
         return this.CHICOOCHHOCHOIHIHHHIIRCROOORIO.set(var1, (E)var2);
      }

      @Override
      public boolean contains(Object var1) {
         return this.CHICOOCHHOCHOIHIHHHIIRCROOORIO.contains(var1);
      }

      @Override
      public int size() {
         return this.CHICOOCHHOCHOIHIHHHIIRCROOORIO.size();
      }
   }

   private static class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<T> extends RCHOIICIHOCIRCIOORIOHRCRHOCRCR.CRRRICCRROCOHHOHIICIHORCOORRRH<T> implements RandomAccess {
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(List<T> var1, int var2) {
         super(var1, var2);
      }
   }

   private static class RRCRRCORICCHOHHIRCHIROOHIIOHCO<E> extends RCHOIICIHOCIRCIOORIOHRCRHOCRCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> implements RandomAccess {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO(List<E> var1) {
         super(var1);
      }
   }
}
