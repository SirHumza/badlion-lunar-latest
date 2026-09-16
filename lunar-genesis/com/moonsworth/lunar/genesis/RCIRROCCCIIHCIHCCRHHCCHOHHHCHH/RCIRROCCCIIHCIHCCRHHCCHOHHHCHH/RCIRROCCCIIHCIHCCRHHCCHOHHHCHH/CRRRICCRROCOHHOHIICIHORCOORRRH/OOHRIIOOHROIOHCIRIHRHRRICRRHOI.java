package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.checkerframework.checker.nullness.qual.Nullable;

@DoNotMock("Use ImmutableMap.of or another implementation")
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true,
   emulated = true
)
public abstract class OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> implements Serializable, Map<K, V> {
   static final Entry<?, ?>[] COOIRRCORCOCCIIICCHCIIIHIHCOCI = new Entry[0];
   @LazyInit
   @RetainedWith
   private transient CICOIHIRIIHHCIOICHRHICRIRCIOHC<Entry<K, V>> CCRORCHHOOCOHIOORIIOCCOHHCCRHO;
   @LazyInit
   @RetainedWith
   private transient CICOIHIRIIHHCIOICHRHICRIRCIOHC<K> ROOCHICOCOCIRIOICOICIHOCRRICRI;
   @LazyInit
   @RetainedWith
   private transient OIICIRRCOOCIHRHOIOIOOROCRHCHIC<V> HHHRRIHOCIRROOCOOCIROOHCHORHII;
   @LazyInit
   private transient HCOIOHCCHIHRCHCCICCIRCIOHCRIHH<K, V> OOIROORROCOCRROORCICRIROOCIRCC;

   public static <T, K, V> Collector<T, ?, OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V>> toImmutableMap(
      Function<? super T, ? extends K> var0, Function<? super T, ? extends V> var1
   ) {
      return IHCRORHRORIICHRHRCHRRIRRHHOCOO.toImmutableMap(var0, var1);
   }

   public static <T, K, V> Collector<T, ?, OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V>> toImmutableMap(
      Function<? super T, ? extends K> var0, Function<? super T, ? extends V> var1, BinaryOperator<V> var2
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      return Collectors.collectingAndThen(
         Collectors.toMap(var0, var1, var2, LinkedHashMap::new), OOHRIIOOHROIOHCIRIHRHRRICRRHOI::RCCCROCHCICCROHCOCCRRROCIIHCCH
      );
   }

   public static <K, V> OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> RIOCOIOOIIRHOROHOCHHOORRCCOIHR() {
      return (OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V>)CIIRCHOCCHCHOOHIIICOCIIRCCCCOH.CCRRCCOOIRCCIHCCHIHHHHCCOICIIH;
   }

   public static <K, V> OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> HHRIICOIOORCHCOIICOOIHIRHHICRI(K var0, V var1) {
      return ICOHIIIRCIORCORHRRROOOOCOOROIC.RHOCHHIRRCHHHOHOIRROIROHHHIHIO((K)var0, (V)var1);
   }

   public static <K, V> OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> CRRRICCRROCOHHOHIICIHORCOORRRH(K var0, V var1, K var2, V var3) {
      return CIIRCHOCCHCHOOHIIICOCIIRCCCCOH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(entryOf(var0, var1), entryOf(var2, var3));
   }

   public static <K, V> OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> CRRRICCRROCOHHOHIICIHORCOORRRH(K var0, V var1, K var2, V var3, K var4, V var5) {
      return CIIRCHOCCHCHOOHIIICOCIIRCCCCOH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(entryOf(var0, var1), entryOf(var2, var3), entryOf(var4, var5));
   }

   public static <K, V> OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> CRRRICCRROCOHHOHIICIHORCOORRRH(K var0, V var1, K var2, V var3, K var4, V var5, K var6, V var7) {
      return CIIRCHOCCHCHOOHIIICOCIIRCCCCOH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(entryOf(var0, var1), entryOf(var2, var3), entryOf(var4, var5), entryOf(var6, var7));
   }

   public static <K, V> OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> CRRRICCRROCOHHOHIICIHORCOORRRH(
      K var0, V var1, K var2, V var3, K var4, V var5, K var6, V var7, K var8, V var9
   ) {
      return CIIRCHOCCHCHOOHIIICOCIIRCCCCOH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         entryOf(var0, var1), entryOf(var2, var3), entryOf(var4, var5), entryOf(var6, var7), entryOf(var8, var9)
      );
   }

   static <K, V> Entry<K, V> entryOf(K var0, V var1) {
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkEntryNotNull(var0, var1);
      return new SimpleImmutableEntry<>((K)var0, (V)var1);
   }

   public static <K, V> OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> OIRCICCCRCRHORRRCHHORCHRCRRIOH() {
      return new OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <K, V> OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> IROHOHRHROICICIHRCIHCOCRIHOHHC(int var0) {
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var0, "expectedSize");
      return new OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var0);
   }

   static void checkNoConflict(boolean var0, String var1, Entry<?, ?> var2, Entry<?, ?> var3) {
      if (!var0) {
         throw conflictException(var1, var2, var3);
      }
   }

   static IllegalArgumentException conflictException(String var0, Object var1, Object var2) {
      return new IllegalArgumentException("Multiple entries with same " + var0 + ": " + var1 + " and " + var2);
   }

   public static <K, V> OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> RCCCROCHCICCROHCOCCRRROCIIHCCH(Map<? extends K, ? extends V> var0) {
      if (var0 instanceof OOHRIIOOHROIOHCIRIHRHRRICRRHOI && !(var0 instanceof SortedMap)) {
         OOHRIIOOHROIOHCIRIHRHRRICRRHOI var1 = (OOHRIIOOHROIOHCIRIHRHRRICRRHOI)var0;
         if (!var1.isPartialView()) {
            return var1;
         }
      } else if (var0 instanceof EnumMap) {
         return CRRRICCRROCOHHOHIICIHORCOORRRH((EnumMap<K, ? extends V>)var0);
      }

      return RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var0.entrySet());
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <K, V> OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(Iterable<? extends Entry<? extends K, ? extends V>> var0) {
      Entry[] var1 = IRIHOIRCHIRRCRIOORCOICORHHORHH.toArray(var0, COOIRRCORCOCCIIICCHCIIIHIHCOCI);
      switch (var1.length) {
         case 0:
            return RIOCOIOOIIRHOROHOCHHOORRCCOIHR();
         case 1:
            Entry var2 = var1[0];
            return HHRIICOIOORCHCOIICOOIHIRHHICRI((K)var2.getKey(), (V)var2.getValue());
         default:
            return CIIRCHOCCHCHOOHIIICOCIIRCCCCOH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      }
   }

   private static <K extends Enum<K>, V> OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> CRRRICCRROCOHHOHIICIHORCOORRRH(EnumMap<K, ? extends V> var0) {
      EnumMap var1 = new EnumMap(var0);

      for (Entry var3 : var1.entrySet()) {
         ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkEntryNotNull(var3.getKey(), var3.getValue());
      }

      return HCHHOOOCRCRHHICHICORHOCHCCCHRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
   }

   OOHRIIOOHROIOHCIRIHRHRRICRRHOI() {
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final V put(K var1, V var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final V putIfAbsent(K var1, V var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final boolean replace(K var1, V var2, V var3) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final V replace(K var1, V var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final V computeIfAbsent(K var1, Function<? super K, ? extends V> var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final V computeIfPresent(K var1, BiFunction<? super K, ? super V, ? extends V> var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final V compute(K var1, BiFunction<? super K, ? super V, ? extends V> var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final V merge(K var1, V var2, BiFunction<? super V, ? super V, ? extends V> var3) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final void putAll(Map<? extends K, ? extends V> var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final void replaceAll(BiFunction<? super K, ? super V, ? extends V> var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final V remove(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final boolean remove(Object var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final void clear() {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean isEmpty() {
      return this.size() == 0;
   }

   @Override
   public boolean containsKey(@Nullable Object var1) {
      return this.get(var1) != null;
   }

   @Override
   public boolean containsValue(@Nullable Object var1) {
      return this.CHHRCOCOHHIROCIHROIOOCOICCCHRC().contains(var1);
   }

   @Override
   public abstract V get(@Nullable Object var1);

   @Override
   public final V getOrDefault(@Nullable Object var1, @Nullable V var2) {
      Object var3 = this.get(var1);
      return (V)(var3 != null ? var3 : var2);
   }

   public CICOIHIRIIHHCIOICHRHICRIRCIOHC<Entry<K, V>> RIICCCOHIOHOIIRHCIIOOCRCCHORCC() {
      CICOIHIRIIHHCIOICHRHICRIRCIOHC var1 = this.CCRORCHHOOCOHIOORIIOCCOHHCCRHO;
      return var1 == null ? (this.CCRORCHHOOCOHIOORIIOCCOHHCCRHO = this.RRICCHOHRROROIOOHHIHHCCCRHOCCH()) : var1;
   }

   abstract CICOIHIRIIHHCIOICHRHICRIRCIOHC<Entry<K, V>> RRICCHOHRROROIOOHHIHHCCCRHOCCH();

   public CICOIHIRIIHHCIOICHRHICRIRCIOHC<K> RORCHHOHICRHCCIRRORIHCCOCRHOCO() {
      CICOIHIRIIHHCIOICHRHICRIRCIOHC var1 = this.ROOCHICOCOCIRIOICOICIHOCRRICRI;
      return var1 == null ? (this.ROOCHICOCOCIRIOICOICIHOCRRICRI = this.OIROICOICCHRROOIOOCCCIOCOIIORO()) : var1;
   }

   abstract CICOIHIRIIHHCIOICHRHICRIRCIOHC<K> OIROICOICCHRROOIOOCCCIOCOIIORO();

   IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<K> IIRICOHOOCCCRRORCOHIROCRCHIHHO() {
      final IRRCHIRICCIHCCIHOHRCHRHRHCRCOH var1 = this.RIICCCOHIOHOIIRHCIIOOCRCCHORCC().IOHOCICRRIRHHCCCRICOCOHOIIOCRH();
      return new IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<K>() {
         @Override
         public boolean hasNext() {
            return var1.hasNext();
         }

         @Override
         public K next() {
            return (K)((Entry)var1.next()).getKey();
         }
      };
   }

   Spliterator<K> keySpliterator() {
      return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.map(this.RIICCCOHIOHOIIRHCIIOOCRCCHORCC().spliterator(), Entry::getKey);
   }

   public OIICIRRCOOCIHRHOIOIOOROCRHCHIC<V> CHHRCOCOHHIROCIHROIOOCOICCCHRC() {
      OIICIRRCOOCIHRHOIOIOOROCRHCHIC var1 = this.HHHRRIHOCIRROOCOOCIROOHCHORHII;
      return var1 == null ? (this.HHHRRIHOCIRROOCOOCIROOHCHORHII = this.ROIOIICCRHHHCHIHHIRIRRHHRHCROC()) : var1;
   }

   abstract OIICIRRCOOCIHRHOIOIOOROCRHCHIC<V> ROIOIICCRHHHCHIHHIRIRRHHRHCROC();

   public HCOIOHCCHIHRCHCCICCIRCIOHCRIHH<K, V> ICICCOOIICOOOCOOHCICICCCORCOCO() {
      if (this.isEmpty()) {
         return HCOIOHCCHIHRCHCCICCIRCIOHCRIHH.HROHHRRRCIRHIOIOIRORRHOOCCRRRH();
      }

      HCOIOHCCHIHRCHCCICCIRCIOHCRIHH var1 = this.OOIROORROCOCRROORCICRIROOCIRCC;
      return var1 == null
         ? (
            this.OOIROORROCOCRROORCICRIROOCIRCC = new HCOIOHCCHIHRCHCCICCIRCIOHCRIHH<>(
               new OOHRIIOOHROIOHCIRIHRHRRICRRHOI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(), this.size(), null
            )
         )
         : var1;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.equalsImpl(this, var1);
   }

   abstract boolean isPartialView();

   @Override
   public int hashCode() {
      return ICRHCCCCOIICOCHHCRCOOIHICROIHI.hashCodeImpl(this.RIICCCOHIOHOIIRHCIIOOCRCCHORCC());
   }

   boolean isHashCodeFast() {
      return false;
   }

   @Override
   public String toString() {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.toStringImpl(this);
   }

   Object writeReplace() {
      return new OOHRIIOOHROIOHCIRIHRHRRICRRHOI.CRRRICCRROCOHHOHIICIHORCOORRRH(this);
   }

   static class CRRRICCRROCOHHOHIICIHORCOORRRH implements Serializable {
      private final Object[] HOHOOOCORIIIIHCRCRIHRHOICIROCH;
      private final Object[] HRORCIOROCHRIRRCHHICIICIIORCRR;
      private static final long IROCOOROIRIRHHCCHCIORHCOHCICCC = 0L;

      CRRRICCRROCOHHOHIICIHORCOORRRH(OOHRIIOOHROIOHCIRIHRHRRICRRHOI<?, ?> var1) {
         this.HOHOOOCORIIIIHCRCRIHRHOICIROCH = new Object[var1.size()];
         this.HRORCIOROCHRIRRCHHICIICIIORCRR = new Object[var1.size()];
         int var2 = 0;

         for (IRRCHIRICCIHCCIHOHRCHRHRHCRCOH var3 = var1.RIICCCOHIOHOIIRHCIIOOCRCCHORCC().IOHOCICRRIRHHCCCRICOCOHOIIOCRH(); var3.hasNext(); var2++) {
            Entry var4 = (Entry)var3.next();
            this.HOHOOOCORIIIIHCRCRIHRHOICIROCH[var2] = var4.getKey();
            this.HRORCIOROCHRIRRCHHICIICIIORCRR[var2] = var4.getValue();
         }
      }

      Object readResolve() {
         OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = new OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.HOHOOOCORIIIIHCRCRIHRHOICIROCH.length
         );
         return this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      }

      Object HHCCIRHCCCIIRHCROHIORHIRHHIORH(OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Object, Object> var1) {
         for (int var2 = 0; var2 < this.HOHOOOCORIIIIHCRCRIHRHOICIROCH.length; var2++) {
            var1.RICRIRRCOHRCOCRRHHCRHRROOIOHHR(this.HOHOOOCORIIIIHCRCRIHRHOICIROCH[var2], this.HRORCIOROCHRIRRCHHICIICIIORCRR[var2]);
         }

         return var1.CHRROORCHRCIIRRORRRIORRRRICIRI();
      }
   }

   private final class HHCCIRHCCCIIRHCROHIORHIRHHIORH
      extends OOHRIIOOHROIOHCIRIHRHRRICRRHOI.IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, CICOIHIRIIHHCIOICHRHICRIRCIOHC<V>> {
      private HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      }

      @Override
      public int size() {
         return OOHRIIOOHROIOHCIRIHRHRRICRRHOI.this.size();
      }

      @Override
      CICOIHIRIIHHCIOICHRHICRIRCIOHC<K> OIROICOICCHRROOIOOCCCIOCOIIORO() {
         return OOHRIIOOHROIOHCIRIHRHRRICRRHOI.this.RORCHHOHICRHCCIRRORIHCCOCRHOCO();
      }

      @Override
      public boolean containsKey(@Nullable Object var1) {
         return OOHRIIOOHROIOHCIRIHRHRRICRRHOI.this.containsKey(var1);
      }

      public CICOIHIRIIHHCIOICHRHICRIRCIOHC<V> RCHHHORIRORROOHRRHHIIIOIROHHCC(@Nullable Object var1) {
         Object var2 = OOHRIIOOHROIOHCIRIHRHRRICRRHOI.this.get(var1);
         return var2 == null ? null : CICOIHIRIIHHCIOICHRHICRIRCIOHC.RROIIRROOOOHIORHRICHOCHIHCRRCH((V)var2);
      }

      @Override
      boolean isPartialView() {
         return OOHRIIOOHROIOHCIRIHRHRRICRRHOI.this.isPartialView();
      }

      @Override
      public int hashCode() {
         return OOHRIIOOHROIOHCIRIHRHRRICRRHOI.this.hashCode();
      }

      @Override
      boolean isHashCodeFast() {
         return OOHRIIOOHROIOHCIRIHRHRRICRRHOI.this.isHashCodeFast();
      }

      @Override
      IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<Entry<K, CICOIHIRIIHHCIOICHRHICRIRCIOHC<V>>> HCRRIORCRRIORHRCIOHHCIHORRCHII() {
         final IRRCHIRICCIHCCIHOHRCHRHRHCRCOH var1 = OOHRIIOOHROIOHCIRIHRHRRICRRHOI.this.RIICCCOHIOHOIIRHCIIOOCRCCHORCC().IOHOCICRRIRHHCCCRICOCOHOIIOCRH();
         return new IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<Entry<K, CICOIHIRIIHHCIOICHRHICRIRCIOHC<V>>>() {
            @Override
            public boolean hasNext() {
               return var1.hasNext();
            }

            public Entry<K, CICOIHIRIIHHCIOICHRHICRIRCIOHC<V>> next() {
               final Entry var1x = (Entry)var1.next();
               return new HRCHROOHRIHCRCRHRIIROCIRHOIRHH<K, CICOIHIRIIHHCIOICHRHICRIRCIOHC<V>>() {
                  @Override
                  public K getKey() {
                     return (K)var1x.getKey();
                  }

                  public CICOIHIRIIHHCIOICHRHICRIRCIOHC<V> HRHIRRCOCHRHIIHIHOOHCHHIRHICIR() {
                     return CICOIHIRIIHHCIOICHRHICRIRCIOHC.RROIIRROOOOHIORHRICHOCHIHCRRCH((V)var1x.getValue());
                  }
               };
            }
         };
      }
   }

   abstract static class IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V> extends OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> {
      abstract IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<Entry<K, V>> HCRRIORCRRIORHRCIOHHCIHORRCHII();

      Spliterator<Entry<K, V>> entrySpliterator() {
         return Spliterators.spliterator(this.HCRRIORCRRIORHRCIOHHCIHORRCHII(), this.size(), 1297);
      }

      @Override
      CICOIHIRIIHHCIOICHRHICRIRCIOHC<K> OIROICOICCHRROOIOOCCCIOCOIIORO() {
         return new RHRCRCIOIOICRHRCCROIICCRRCOOOI<>(this);
      }

      @Override
      CICOIHIRIIHHCIOICHRHICRIRCIOHC<Entry<K, V>> RRICCHOHRROROIOOHHIHHCCCRHOCCH() {
         class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends OCIOROHIHRROROOIRRHRRCCHHRRRHI<K, V> {
            @Override
            OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> RRRICORCCRIOORIIRIHOICHIHCHROC() {
               return IRCIIHHICIHRCOCRROCOICRIHHCCHH.this;
            }

            @Override
            public IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<Entry<K, V>> IOHOCICRRIRHHCCCRICOCOHOIIOCRH() {
               return IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.HCRRIORCRRIORHRCIOHHCIHORRCHII();
            }
         }

         return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      }

      @Override
      OIICIRRCOOCIHRHOIOIOOROCRHCHIC<V> ROIOIICCRHHHCHIHHIRIRRHHRHCROC() {
         return new HORHCHIIOCRROHOHRCORCCICCRCCHO<>(this);
      }
   }

   @DoNotMock
   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> {
      @Nullable Comparator<? super V> valueComparator;
      Entry<K, V>[] entries;
      int size;
      boolean entriesUsed;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         this(4);
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1) {
         this.entries = new Entry[var1];
         this.size = 0;
         this.entriesUsed = false;
      }

      private void ensureCapacity(int var1) {
         if (var1 > this.entries.length) {
            this.entries = Arrays.copyOf(
               this.entries, OIICIRRCOOCIHRHOIOIOOROCRHCHIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.expandedCapacity(this.entries.length, var1)
            );
            this.entriesUsed = false;
         }
      }

      @CanIgnoreReturnValue
      public OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> RICRIRRCOHRCOCRRHHCRHRROOIOHHR(K var1, V var2) {
         this.ensureCapacity(this.size + 1);
         Entry var3 = OOHRIIOOHROIOHCIRIHRHRRICRRHOI.entryOf(var1, var2);
         this.entries[this.size++] = var3;
         return this;
      }

      @CanIgnoreReturnValue
      public OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> IOIICIRIICICIIOORHCIIIIRRIHRHI(Entry<? extends K, ? extends V> var1) {
         return this.RICRIRRCOHRCOCRRHHCRHRROOIOHHR((K)var1.getKey(), (V)var1.getValue());
      }

      @CanIgnoreReturnValue
      public OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> IOHHOIIOCRHCHHCRORICCOHOHROOIH(Map<? extends K, ? extends V> var1) {
         return this.IRRCCOICORICIHCHRHIHIHROIRHOCR(var1.entrySet());
      }

      @CanIgnoreReturnValue
      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      public OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> IRRCCOICORICIHCHRHIHIHROIRHOCR(
         Iterable<? extends Entry<? extends K, ? extends V>> var1
      ) {
         if (var1 instanceof Collection) {
            this.ensureCapacity(this.size + ((Collection)var1).size());
         }

         for (Entry var3 : var1) {
            this.IOIICIRIICICIIOORHCIIIIRRIHRHI(var3);
         }

         return this;
      }

      @CanIgnoreReturnValue
      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      public OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> HRCHROOHRIHCRCRHRIIROCIRHOIRHH(Comparator<? super V> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
            this.valueComparator == null, "valueComparator was already set"
         );
         this.valueComparator = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1, "valueComparator"
         );
         return this;
      }

      @CanIgnoreReturnValue
      OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> var1
      ) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.ensureCapacity(this.size + var1.size);
         System.arraycopy(var1.entries, 0, this.entries, this.size, var1.size);
         this.size = this.size + var1.size;
         return this;
      }

      public OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> CHRROORCHRCIIRRORRRIORRRRICIRI() {
         if (this.valueComparator != null) {
            if (this.entriesUsed) {
               this.entries = Arrays.copyOf(this.entries, this.size);
            }

            Arrays.sort(
               this.entries,
               0,
               this.size,
               IOIHHIORCICCHIIHOIOIOHHRICRHIO.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(this.valueComparator)
                  .CRICCOOHHHCHOORCICOCOHIHOIRHOO(ROCHRRCORRCOOOOOCOICOCROIIHIHH.RICRROIIIHORIOCHCOORHRIIOHHIOH())
            );
         }

         switch (this.size) {
            case 0:
               return OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RIOCOIOOIIRHOROHOCHHOORRCCOIHR();
            case 1:
               return OOHRIIOOHROIOHCIRIHRHRRICRRHOI.HHRIICOIOORCHCOIICOOIHIRHHICRI(this.entries[0].getKey(), this.entries[0].getValue());
            default:
               this.entriesUsed = true;
               return CIIRCHOCCHCHOOHIIICOCIIRCCCCOH.CRRRICCRROCOHHOHIICIHORCOORRRH(this.size, this.entries);
         }
      }

      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
      OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> OROCHRRRRCRRHRHRRRHRRIORICRCIR() {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
            this.valueComparator == null, "buildJdkBacked is only for testing; can't use valueComparator"
         );
         switch (this.size) {
            case 0:
               return OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RIOCOIOOIIRHOROHOCHHOORRCCOIHR();
            case 1:
               return OOHRIIOOHROIOHCIRIHRHRRICRRHOI.HHRIICOIOORCHCOIICOOIHIRHHICRI(this.entries[0].getKey(), this.entries[0].getValue());
            default:
               this.entriesUsed = true;
               return IIIRHHOCRRRCOHCHCRIHRCOOIRRHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.size, this.entries);
         }
      }
   }
}
