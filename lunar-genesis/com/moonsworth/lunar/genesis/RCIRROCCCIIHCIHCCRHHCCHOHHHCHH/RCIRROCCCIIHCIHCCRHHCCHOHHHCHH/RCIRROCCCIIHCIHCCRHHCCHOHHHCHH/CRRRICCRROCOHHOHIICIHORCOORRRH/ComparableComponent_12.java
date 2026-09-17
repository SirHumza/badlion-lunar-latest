package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class IOIHHIORCICCHIIHOIOIOHHRICRHIO<T> implements Comparator<T> {
   static final int ICOCOOHHRORRIOOOIIHCOCIOHOHHCC = 1;
   static final int ICIOCCOOHHIOIORHCCCOHHCRCICOIC = -1;

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public static <C extends Comparable> IOIHHIORCICCHIIHOIOIOHHRICRHIO<C> OHOOIHRHCOIOIRHICHOOROHHIHOCRC() {
      return RRCRRIIRHHRCCICHOCOIHROROCICHC.CHCIICCROHORCCRIOOICROHCRCORRC;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public static <T> IOIHHIORCICCHIIHOIOIOHHRICRHIO<T> IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(Comparator<T> var0) {
      return var0 instanceof IOIHHIORCICCHIIHOIOIOHHRICRHIO ? (IOIHHIORCICCHIIHOIOIOHHRICRHIO)var0 : new OHIIIOHIRIRCCRRIOIICCHHIORRHOH<>(var0);
   }

   @Deprecated
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public static <T> IOIHHIORCICCHIIHOIOIOHHRICRHIO<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IOIHHIORCICCHIIHOIOIOHHRICRHIO<T> var0) {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public static <T> IOIHHIORCICCHIIHOIOIOHHRICRHIO<T> CCIHIROCOROHOHCHIOCOCRHCCIORCC(List<T> var0) {
      return new HHIRHRHHRHIHRHOHCHRHIORRHIIHOR<>(var0);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public static <T> IOIHHIORCICCHIIHOIOIOHHRICRHIO<T> CRICCOOHHHCHOORCICOCOHIHOIRHOO(T var0, T... var1) {
      return CCIHIROCOROHOHCHIOCOCRHCCIORCC(RCHOIICIHOCIRCIOORIOHRCRHOCRCR.asList((T)var0, (T[])var1));
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public static IOIHHIORCICCHIIHOIOIOHHRICRHIO<Object> CCRIIIICRHOHRHHIIHORCCORIHROHO() {
      return RHOCHHIRRCHHHOHOIRROIROHHHIHIO.ORCCOIOROIHHIIRICRHCCIOIOIIIOC;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public static IOIHHIORCICCHIIHOIOIOHHRICRHIO<Object> OIIROOHROOOORROIIICOCOHOIOICCC() {
      return HOCRHOROHIHRCRHCRIIIHCHRRHOIIC.COOHHICCCCRRHOCCCHCCIHICICRIOC;
   }

   public static IOIHHIORCICCHIIHOIOIOHHRICRHIO<Object> IHHROCRHIORHHORRHIHOIIICORRRCR() {
      return IOIHHIORCICCHIIHOIOIOHHRICRHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HOCCCRIRIOHRCRCCOICRIHOCCHIOOI;
   }

   protected IOIHHIORCICCHIIHOIOIOHHRICRHIO() {
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public <S extends T> IOIHHIORCICCHIIHOIOIOHHRICRHIO<S> HCHORRRCIORCRHCRIIHROIRRRHCCOR() {
      return new HOIRIRROOCICRHIRIHCIRCOHCIHHHO<>(this);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public <S extends T> IOIHHIORCICCHIIHOIOIOHHRICRHIO<S> ICIRICOORRRIHCOHHOHIHRHIRRCHII() {
      return new RHIHRRICIHORIHHIHHOIIOHHRCIIIH<>(this);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public <S extends T> IOIHHIORCICCHIIHOIOIOHHRICRHIO<S> OCRORRCHHHCHOIHHCIOHIIIIRCHHCI() {
      return new CHRHCRCCIICRORCOHCORHRROIHRCHO<>(this);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public <F> IOIHHIORCICCHIIHOIOIOHHRICRHIO<F> CRICCOOHHHCHOORCICOCOHIHOIRHOO(
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<F, ? extends T> var1
   ) {
      return new HHRIICOIOORCHCOIICOOIHIRHHICRI<>(var1, this);
   }

   <T2 extends T> IOIHHIORCICCHIIHOIOIOHHRICRHIO<Entry<T2, ?>> ROCHHHHORHHHRCROHROHRHIORORCIR() {
      return this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(ROCHRRCORRCOOOOOCOICOCROIIHIHH.HICIIHICHOHHIICRCHIOOOCRHHHIHR());
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public <U extends T> IOIHHIORCICCHIIHOIOIOHHRICRHIO<U> RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(Comparator<? super U> var1) {
      return new CCIHHRIOOOOCOHRCIHOHROOICIORCC<>(
         this,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         )
      );
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public static <T> IOIHHIORCICCHIIHOIOIOHHRICRHIO<T> IIOIROIHIHHCCRICRCOOCHIICHRCOI(Iterable<? extends Comparator<? super T>> var0) {
      return new CCIHHRIOOOOCOHRCIHOHROOICIORCC<>(var0);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public <S extends T> IOIHHIORCICCHIIHOIOIOHHRICRHIO<Iterable<S>> IIROCROIORHCIIROIICIRRIHCIORII() {
      return new IOROHHOIORHORCOHRHCCHCRHOCHCCI<>(this);
   }

   @CanIgnoreReturnValue
   @Override
   public abstract int compare(@Nullable T var1, @Nullable T var2);

   public <E extends T> E min(Iterator<E> var1) {
      Object var2 = var1.next();

      while (var1.hasNext()) {
         var2 = this.min(var2, var1.next());
      }

      return (E)var2;
   }

   public <E extends T> E min(Iterable<E> var1) {
      return this.min(var1.iterator());
   }

   public <E extends T> E min(@Nullable E var1, @Nullable E var2) {
      return (E)(this.compare((T)var1, (T)var2) <= 0 ? var1 : var2);
   }

   public <E extends T> E min(@Nullable E var1, @Nullable E var2, @Nullable E var3, E... var4) {
      Object var5 = this.min(this.min(var1, var2), var3);

      for (Object var9 : var4) {
         var5 = this.min(var5, var9);
      }

      return (E)var5;
   }

   public <E extends T> E max(Iterator<E> var1) {
      Object var2 = var1.next();

      while (var1.hasNext()) {
         var2 = this.max(var2, var1.next());
      }

      return (E)var2;
   }

   public <E extends T> E max(Iterable<E> var1) {
      return this.max(var1.iterator());
   }

   public <E extends T> E max(@Nullable E var1, @Nullable E var2) {
      return (E)(this.compare((T)var1, (T)var2) >= 0 ? var1 : var2);
   }

   public <E extends T> E max(@Nullable E var1, @Nullable E var2, @Nullable E var3, E... var4) {
      Object var5 = this.max(this.max(var1, var2), var3);

      for (Object var9 : var4) {
         var5 = this.max(var5, var9);
      }

      return (E)var5;
   }

   public <E extends T> List<E> leastOf(Iterable<E> var1, int var2) {
      if (var1 instanceof Collection) {
         Collection var3 = (Collection)var1;
         if (var3.size() <= 2L * var2) {
            Object[] var4 = var3.toArray();
            Arrays.sort(var4, this);
            if (var4.length > var2) {
               var4 = Arrays.copyOf(var4, var2);
            }

            return Collections.unmodifiableList(Arrays.asList((E[])var4));
         }
      }

      return this.leastOf(var1.iterator(), var2);
   }

   public <E extends T> List<E> leastOf(Iterator<E> var1, int var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var2, "k");
      if (var2 == 0 || !var1.hasNext()) {
         return Collections.emptyList();
      }

      if (var2 >= 1073741823) {
         ArrayList var4 = RCHOIICIHOCIRCIOORIOHRCRHOCRCR.newArrayList(var1);
         Collections.sort(var4, this);
         if (var4.size() > var2) {
            var4.subList(var2, var4.size()).clear();
         }

         var4.trimToSize();
         return Collections.unmodifiableList(var4);
      } else {
         HICRCHHRCHOIRCOHROCIHHORHIOOCH var3 = HICRCHHRCHOIRCOHROCIHHORHIOOCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, this);
         var3.offerAll(var1);
         return var3.topK();
      }
   }

   public <E extends T> List<E> greatestOf(Iterable<E> var1, int var2) {
      return this.HCHORRRCIORCRHCRIIHROIRRRHCCOR().leastOf(var1, var2);
   }

   public <E extends T> List<E> greatestOf(Iterator<E> var1, int var2) {
      return this.HCHORRRCIORCRHCRIIHROIRRRHCCOR().leastOf(var1, var2);
   }

   public <E extends T> List<E> sortedCopy(Iterable<E> var1) {
      Object[] var2 = IRIHOIRCHIRRCRIOORCOICORHHORHH.toArray(var1);
      Arrays.sort(var2, this);
      return RCHOIICIHOCIRCIOORIOHRCRHOCRCR.newArrayList(Arrays.asList((E[])var2));
   }

   public <E extends T> COIRRRCIORROCHIROCHROCHICCICIC<E> CORCOCICIRIOHROHROIIOOHICCHCRR(Iterable<E> var1) {
      return COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1);
   }

   public boolean isOrdered(Iterable<? extends T> var1) {
      Iterator var2 = var1.iterator();
      if (var2.hasNext()) {
         Object var3 = var2.next();

         while (var2.hasNext()) {
            Object var4 = var2.next();
            if (this.compare((T)var3, (T)var4) > 0) {
               return false;
            }

            var3 = var4;
         }
      }

      return true;
   }

   public boolean isStrictlyOrdered(Iterable<? extends T> var1) {
      Iterator var2 = var1.iterator();
      if (var2.hasNext()) {
         Object var3 = var2.next();

         while (var2.hasNext()) {
            Object var4 = var2.next();
            if (this.compare((T)var3, (T)var4) >= 0) {
               return false;
            }

            var3 = var4;
         }
      }

      return true;
   }

   @Deprecated
   public int binarySearch(List<? extends T> var1, @Nullable T var2) {
      return Collections.binarySearch(var1, var2, this);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends ClassCastException {
      final Object COHIRHRRHOCRHRHCRRCIHRIHIORRCC;
      private static final long IOCRCRRICIHOICOCHOROOICOIOOIOH = 0L;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(Object var1) {
         super("Cannot compare value: " + var1);
         this.COHIRHRRHOCRHRHCRRCIHRIHIORRCC = var1;
      }
   }

   private static class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      static final IOIHHIORCICCHIIHOIOIOHHRICRHIO<Object> HOCCCRIRIOHRCRCCOICRIHOCCHIOOI = new IOIHHIORCICCHIIHOIOIOHHRICRHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends IOIHHIORCICCHIIHOIOIOHHRICRHIO<Object> {
      private final AtomicInteger IRIOORRRCCORRHIOHORRIIOCIICHRH = new AtomicInteger(0);
      private final ConcurrentMap<Object, Integer> OCORIOHCIICCOHHOICIICOOROHHORI = IHHRRRRCOCHIIOIOHORHCIRRRCHCCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            new HCHOOCHIOICRRHHIHHHICIRCIOICRI()
         )
         .makeMap();

      private Integer getUid(Object var1) {
         Integer var2 = this.OCORIOHCIICCOHHOICIICOOROHHORI.get(var1);
         if (var2 == null) {
            var2 = this.IRIOORRRCCORRHIOHORRIIOCIICHRH.getAndIncrement();
            Integer var3 = this.OCORIOHCIICCOHHOICIICOOROHHORI.putIfAbsent(var1, var2);
            if (var3 != null) {
               var2 = var3;
            }
         }

         return var2;
      }

      @Override
      public int compare(Object var1, Object var2) {
         if (var1 == var2) {
            return 0;
         } else if (var1 == null) {
            return -1;
         } else if (var2 == null) {
            return 1;
         } else {
            int var3 = this.identityHashCode(var1);
            int var4 = this.identityHashCode(var2);
            if (var3 != var4) {
               return var3 < var4 ? -1 : 1;
            } else {
               int var5 = this.getUid(var1).compareTo(this.getUid(var2));
               if (var5 == 0) {
                  throw new AssertionError();
               } else {
                  return var5;
               }
            }
         }
      }

      @Override
      public String toString() {
         return "Ordering.arbitrary()";
      }

      int identityHashCode(Object var1) {
         return System.identityHashCode(var1);
      }
   }
}
