package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.Spliterator;
import java.util.TreeMap;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true,
   emulated = true
)
public final class RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> extends CIOORRCRICOIICROHRHRHHOHRCCRII<K, V> implements NavigableMap<K, V> {
   private static final Comparator<Comparable> RIRCHHHORCCCIICHRIOOIIIORIRCHI = IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC();
   private static final RCHHHORIRORROOHRRHHIIIOIROHHCC<Comparable, Object> HIHHOCORHOCRORCOHHIHCRHRCCICOO = new RCHHHORIRORROOHRRHHIIIOIROHHCC<>(
      HCCCCIHIOIHCHCCHOOHHCIHRCRRRHH.RIROICHCRROROHCCROOCCCCOCHCCRI(IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC()),
      COIRRRCIORROCHIROCHROCHICCICIC.HHOIROIHOHHRHIRRRHRIRHOOIRCIOH()
   );
   private final transient OHCIOCCCOHCCHHOCCHOIHRHOHCICOR<K> RRCIICIHRHRIIOOIHCCROORHRHHCCO;
   private final transient COIRRRCIORROCHIROCHROCHICCICIC<V> HRCHHOOCOOOHCHOHHCOCOCCCHCCORI;
   private transient RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> IOOOORHIHHRRHRHRCOORCRIOIOCRIR;
   private static final long HCRIIROIRORIOIRHOORCCCHIHOIOCH = 0L;

   public static <T, K, V> Collector<T, ?, RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V>> toImmutableSortedMap(
      Comparator<? super K> var0, Function<? super T, ? extends K> var1, Function<? super T, ? extends V> var2
   ) {
      return IHCRORHRORIICHRHRCHRRIRRHHOCOO.toImmutableSortedMap(var0, var1, var2);
   }

   public static <T, K, V> Collector<T, ?, RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V>> toImmutableSortedMap(
      Comparator<? super K> var0, Function<? super T, ? extends K> var1, Function<? super T, ? extends V> var2, BinaryOperator<V> var3
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
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var3
      );
      return Collectors.collectingAndThen(
         Collectors.toMap(var1, var2, var3, () -> new TreeMap(var0)), RCHHHORIRORROOHRRHHIIIOIROHHCC::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      );
   }

   static <K, V> RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> IIRHCHHOICHRICOOCRORCCIOOIHOIR(Comparator<? super K> var0) {
      return IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC().equals(var0)
         ? IOOIHOHCROCHRCIOHICROHHCHCIOHI()
         : new RCHHHORIRORROOHRRHHIIIOIROHHCC<>(
            HCCCCIHIOIHCHCCHOOHHCIHRCRRRHH.RIROICHCRROROHCCROOCCCCOCHCCRI(var0), COIRRRCIORROCHIROCHROCHICCICIC.HHOIROIHOHHRHIRRRHRIRHOOIRCIOH()
         );
   }

   public static <K, V> RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> IOOIHOHCROCHRCIOHICROHHCHCIOHI() {
      return (RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V>)HIHHOCORHOCRORCOHHIHCRHRCCICOO;
   }

   public static <K extends Comparable<? super K>, V> RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(K var0, V var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC(), (K)var0, (V)var1);
   }

   private static <K, V> RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Comparator<? super K> var0, K var1, V var2) {
      return new RCHHHORIRORROOHRRHHIIIOIROHHCC<>(
         new OHCIOCCCOHCCHHOCCHOIHRHOHCICOR<>(
            COIRRRCIORROCHIROCHROCHICCICIC.HOIIRIHOHCRIHOOHRCRCRCRRHIHRCO((K)var1),
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var0
            )
         ),
         COIRRRCIORROCHIROCHROCHICCICIC.HOIIRIHOHCRIHOOHRCRCRCRRHIHRCO((V)var2)
      );
   }

   public static <K extends Comparable<? super K>, V> RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(K var0, V var1, K var2, V var3) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(entryOf(var0, var1), entryOf(var2, var3));
   }

   public static <K extends Comparable<? super K>, V> RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      K var0, V var1, K var2, V var3, K var4, V var5
   ) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(entryOf(var0, var1), entryOf(var2, var3), entryOf(var4, var5));
   }

   public static <K extends Comparable<? super K>, V> RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      K var0, V var1, K var2, V var3, K var4, V var5, K var6, V var7
   ) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(entryOf(var0, var1), entryOf(var2, var3), entryOf(var4, var5), entryOf(var6, var7));
   }

   public static <K extends Comparable<? super K>, V> RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      K var0, V var1, K var2, V var3, K var4, V var5, K var6, V var7, K var8, V var9
   ) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(entryOf(var0, var1), entryOf(var2, var3), entryOf(var4, var5), entryOf(var6, var7), entryOf(var8, var9));
   }

   private static <K extends Comparable<? super K>, V> RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Entry<K, V>... var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC(), false, var0, var0.length);
   }

   public static <K, V> RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(Map<? extends K, ? extends V> var0) {
      IOIHHIORCICCHIIHOIOIOHHRICRHIO var1 = (IOIHHIORCICCHIIHOIOIOHHRICRHIO)RIRCHHHORCCCIICHRIOOIIIORIRCHI;
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1);
   }

   public static <K, V> RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Map<? extends K, ? extends V> var0, Comparator<? super K> var1) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var0,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         )
      );
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <K, V> RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> IHICORCROOROHCIHIHCOIHRRHICICO(Iterable<? extends Entry<? extends K, ? extends V>> var0) {
      IOIHHIORCICCHIIHOIOIOHHRICRHIO var1 = (IOIHHIORCICCHIIHOIOIOHHRICRHIO)RIRCHHHORCCCIICHRIOOIIIORIRCHI;
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <K, V> RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Iterable<? extends Entry<? extends K, ? extends V>> var0, Comparator<? super K> var1
   ) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         ),
         false,
         var0
      );
   }

   public static <K, V> RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(SortedMap<K, ? extends V> var0) {
      Comparator var1 = var0.comparator();
      if (var1 == null) {
         var1 = RIRCHHHORCCCIICHRIOOIIIORIRCHI;
      }

      if (var0 instanceof RCHHHORIRORROOHRRHHIIIOIROHHCC) {
         RCHHHORIRORROOHRRHHIIIOIROHHCC var2 = (RCHHHORIRORROOHRRHHIIIOIROHHCC)var0;
         if (!var2.isPartialView()) {
            return var2;
         }
      }

      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, true, var0.entrySet());
   }

   private static <K, V> RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> IRCIIHHICIHRCOCRROCOICRIHHCCHH(Map<? extends K, ? extends V> var0, Comparator<? super K> var1) {
      boolean var2 = false;
      if (var0 instanceof SortedMap) {
         SortedMap var3 = (SortedMap)var0;
         Comparator var4 = var3.comparator();
         var2 = var4 == null ? var1 == RIRCHHHORCCCIICHRIOOIIIORIRCHI : var1.equals(var4);
      }

      if (var2 && var0 instanceof RCHHHORIRORROOHRRHHIIIOIROHHCC) {
         RCHHHORIRORROOHRRHHIIIOIROHHCC var5 = (RCHHHORIRORROOHRRHHIIIOIROHHCC)var0;
         if (!var5.isPartialView()) {
            return var5;
         }
      }

      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var0.entrySet());
   }

   private static <K, V> RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Comparator<? super K> var0, boolean var1, Iterable<? extends Entry<? extends K, ? extends V>> var2
   ) {
      Entry[] var3 = IRIHOIRCHIRRCRIOORCOICORHHORHH.toArray(var2, COOIRRCORCOCCIIICCHCIIIHIHCOCI);
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var3, var3.length);
   }

   private static <K, V> RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      final Comparator<? super K> var0, boolean var1, Entry<K, V>[] var2, int var3
   ) {
      switch (var3) {
         case 0:
            return IIRHCHHOICHRICOOCRORCCIOOIHOIR(var0);
         case 1:
            return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, (K)var2[0].getKey(), (V)var2[0].getValue());
         default:
            Object[] var4 = new Object[var3];
            Object[] var5 = new Object[var3];
            if (var1) {
               for (int var6 = 0; var6 < var3; var6++) {
                  Object var7 = var2[var6].getKey();
                  Object var8 = var2[var6].getValue();
                  ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkEntryNotNull(var7, var8);
                  var4[var6] = var7;
                  var5[var6] = var8;
               }
            } else {
               Arrays.sort(var2, 0, var3, new Comparator<Entry<K, V>>() {
                  public int compare(Entry<K, V> var1, Entry<K, V> var2x) {
                     return var0.compare(var1.getKey(), var2x.getKey());
                  }
               });
               Object var10 = var2[0].getKey();
               var4[0] = var10;
               var5[0] = var2[0].getValue();
               ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkEntryNotNull(var4[0], var5[0]);

               for (int var11 = 1; var11 < var3; var11++) {
                  Object var12 = var2[var11].getKey();
                  Object var9 = var2[var11].getValue();
                  ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkEntryNotNull(var12, var9);
                  var4[var11] = var12;
                  var5[var11] = var9;
                  checkNoConflict(var0.compare(var10, var12) != 0, "key", var2[var11 - 1], var2[var11]);
                  var10 = var12;
               }
            }

            return new RCHHHORIRORROOHRRHHIIIOIROHHCC<>(
               new OHCIOCCCOHCCHHOCCHOIHRHOHCICOR<>(new ORHIIROIHOHHHOROORIIROIOCRHHCR<>(var4), var0), new ORHIIROIHOHHHOROORIIROIOCRHHCR<>(var5)
            );
      }
   }

   public static <K extends Comparable<?>, V> RCHHHORIRORROOHRRHHIIIOIROHHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V> OOIIIHHROCIHCIICIORRHIICCCRCRR() {
      return new RCHHHORIRORROOHRRHHIIIOIROHHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC());
   }

   public static <K, V> RCHHHORIRORROOHRRHHIIIOIROHHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V> OHHRIOHROOIHOROCIRHCHORIHRRRRI(Comparator<K> var0) {
      return new RCHHHORIRORROOHRRHHIIIOIROHHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(var0);
   }

   public static <K extends Comparable<?>, V> RCHHHORIRORROOHRRHHIIIOIROHHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V> COORHHOIICIHRRORCRORRRIOCIICHH() {
      return new RCHHHORIRORROOHRRHHIIIOIROHHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(
         IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC().HCHORRRCIORCRHCRIIHROIRRRHCCOR()
      );
   }

   RCHHHORIRORROOHRRHHIIIOIROHHCC(OHCIOCCCOHCCHHOCCHOIHRHOHCICOR<K> var1, COIRRRCIORROCHIROCHROCHICCICIC<V> var2) {
      this(var1, var2, null);
   }

   RCHHHORIRORROOHRRHHIIIOIROHHCC(OHCIOCCCOHCCHHOCCHOIHRHOHCICOR<K> var1, COIRRRCIORROCHIROCHROCHICCICIC<V> var2, RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> var3) {
      this.RRCIICIHRHRIIOOIHCCROORHRHHCCO = var1;
      this.HRCHHOOCOOOHCHOHHCOCOCCCHCCORI = var2;
      this.IOOOORHIHHRRHRHRCOORCRIOIOCRIR = var3;
   }

   @Override
   public int size() {
      return this.HRCHHOOCOOOHCHOHHCOCOCCCHCCORI.size();
   }

   @Override
   public void forEach(BiConsumer<? super K, ? super V> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      COIRRRCIORROCHIROCHROCHICCICIC var2 = this.RRCIICIHRHRIIOOIHCCROORHRHHCCO.OHOOIHCOHHORHICHIOROIRIHCOOCRR();

      for (int var3 = 0; var3 < this.size(); var3++) {
         var1.accept(var2.get(var3), this.HRCHHOOCOOOHCHOHHCOCOCCCHCCORI.get(var3));
      }
   }

   @Override
   public V get(@Nullable Object var1) {
      int var2 = this.RRCIICIHRHRIIOOIHCCROORHRHHCCO.indexOf(var1);
      return var2 == -1 ? null : this.HRCHHOOCOOOHCHOHHCOCOCCCHCCORI.get(var2);
   }

   @Override
   boolean isPartialView() {
      return this.RRCIICIHRHRIIOOIHCCROORHRHHCCO.isPartialView() || this.HRCHHOOCOOOHCHOHHCOCOCCCHCCORI.isPartialView();
   }

   @Override
   public CICOIHIRIIHHCIOICHRHICRIRCIOHC<Entry<K, V>> RIICCCOHIOHOIIRHCIIOOCRCCHORCC() {
      return super.RIICCCOHIOHOIIRHCIIOOCRCCHORCC();
   }

   @Override
   CICOIHIRIIHHCIOICHRHICRIRCIOHC<Entry<K, V>> RRICCHOHRROROIOOHHIHHCCCRHOCCH() {
      class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends OCIOROHIHRROROOIRRHRRCCHHRRRHI<K, V> {
         @Override
         public IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<Entry<K, V>> IOHOCICRRIRHHCCCRICOCOHOIIOCRH() {
            return this.OHOOIHCOHHORHICHIOROIRIHCOOCRR().IOHOCICRRIRHHCCCRICOCOHOIIOCRH();
         }

         @Override
         public Spliterator<Entry<K, V>> spliterator() {
            return this.OHOOIHCOHHORHICHIOROIRIHCOOCRR().spliterator();
         }

         @Override
         public void forEach(Consumer<? super Entry<K, V>> var1) {
            this.OHOOIHCOHHORHICHIOROIRIHCOOCRR().forEach(var1);
         }

         @Override
         COIRRRCIORROCHIROCHROCHICCICIC<Entry<K, V>> RHRRCOIHRICOCRRIHRRRCHRHOCICCC() {
            return new ICCIIIRHHOOIHCCHIRRCRHICHIHRIH<Entry<K, V>>() {
               public Entry<K, V> get(int var1) {
                  return new SimpleImmutableEntry<>(
                     RCHHHORIRORROOHRRHHIIIOIROHHCC.this.RRCIICIHRHRIIOOIHCCROORHRHHCCO.OHOOIHCOHHORHICHIOROIRIHCOOCRR().get(var1),
                     RCHHHORIRORROOHRRHHIIIOIROHHCC.this.HRCHHOOCOOOHCHOHHCOCOCCCHCCORI.get(var1)
                  );
               }

               @Override
               public Spliterator<Entry<K, V>> spliterator() {
                  return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.indexed(this.size(), 1297, this::get);
               }

               @Override
               OIICIRRCOOCIHRHOIOIOOROCRHCHIC<Entry<K, V>> RRRCRHCROCCIHOOCCRORHIIIHHCOHO() {
                  return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this;
               }
            };
         }

         @Override
         OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> RRRICORCCRIOORIIRIHOICHIHCHROC() {
            return RCHHHORIRORROOHRRHHIIIOIROHHCC.this;
         }
      }

      return this.isEmpty() ? CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRROCHIORCOCORIRRHOICICCIIORHI() : new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   public HCCCCIHIOIHCHCCHOOHHCIHRCRRRHH<K> RRRRORHRHHHCCIHOIOROCCCRHHOOCO() {
      return this.RRCIICIHRHRIIOOIHCCROORHRHHCCO;
   }

   @Override
   CICOIHIRIIHHCIOICHRHICRIRCIOHC<K> OIROICOICCHRROOIOOCCCIOCOIIORO() {
      throw new AssertionError("should never be called");
   }

   @Override
   public OIICIRRCOOCIHRHOIOIOOROCRHCHIC<V> CHHRCOCOHHIROCIHROIOOCOICCCHRC() {
      return this.HRCHHOOCOOOHCHOHHCOCOCCCHCCORI;
   }

   @Override
   OIICIRRCOOCIHRHOIOIOOROCRHCHIC<V> ROIOIICCRHHHCHIHHIRIRRHHRHCROC() {
      throw new AssertionError("should never be called");
   }

   @Override
   public Comparator<? super K> comparator() {
      return this.RRRRORHRHHHCCIHOIOROCCCRHHOOCO().comparator();
   }

   @Override
   public K firstKey() {
      return this.RRRRORHRHHHCCIHOIOROCCCRHHOOCO().first();
   }

   @Override
   public K lastKey() {
      return this.RRRRORHRHHHCCIHOIOROCCCRHHOOCO().last();
   }

   private RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> IRIHOIRCHIRRCRIOORCOICORHHORHH(int var1, int var2) {
      if (var1 == 0 && var2 == this.size()) {
         return this;
      } else {
         return var1 == var2
            ? IIRHCHHOICHRICOOCRORCCIOOIHOIR(this.comparator())
            : new RCHHHORIRORROOHRRHHIIIOIROHHCC<>(
               this.RRCIICIHRHRIIOOIHCCROORHRHHCCO.OCCORIIORHORROHHROHHOORHIHRIOO(var1, var2),
               this.HRCHHOOCOOOHCHOHHCOCOCCCHCCORI.HIHCHCORCCRCOHCRROHOHOOCHOROCC(var1, var2)
            );
      }
   }

   public RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> HIHCHCORCCRCOHCRROHOHOOCHOROCC(K var1) {
      return this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI((K)var1, false);
   }

   public RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> HICHRCOHCCRHOHCICOOCHOIHCCHIRI(K var1, boolean var2) {
      return this.IRIHOIRCHIRRCRIOORCOICORHHORHH(
         0,
         this.RRCIICIHRHRIIOOIHCCROORHRHHCCO
            .headIndex(
               com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
                  (K)var1
               ),
               var2
            )
      );
   }

   public RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(K var1, K var2) {
      return this.HHCCIRHCCCIIRHCROHIORHIRHHIORH((K)var1, true, (K)var2, false);
   }

   public RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> HHCCIRHCCCIIRHCROHIORHIRHHIORH(K var1, boolean var2, K var3, boolean var4) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var3
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         this.comparator().compare((K)var1, (K)var3) <= 0, "expected fromKey <= toKey but %s > %s", var1, var3
      );
      return this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI((K)var3, var4).IIHRRHORCRCROCHHOHORCHCROCIHRO((K)var1, var2);
   }

   public RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> OCIHRICRHRRHIOHIIHIROCRIRHCCIR(K var1) {
      return this.IIHRRHORCRCROCHHOHORCHCROCIHRO((K)var1, true);
   }

   public RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> IIHRRHORCRCROCHHOHORCHCROCIHRO(K var1, boolean var2) {
      return this.IRIHOIRCHIRRCRIOORCOICORHHORHH(
         this.RRCIICIHRHRIIOOIHCCROORHRHHCCO
            .tailIndex(
               com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
                  (K)var1
               ),
               var2
            ),
         this.size()
      );
   }

   @Override
   public Entry<K, V> lowerEntry(K var1) {
      return this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI((K)var1, false).lastEntry();
   }

   @Override
   public K lowerKey(K var1) {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.keyOrNull(this.lowerEntry((K)var1));
   }

   @Override
   public Entry<K, V> floorEntry(K var1) {
      return this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI((K)var1, true).lastEntry();
   }

   @Override
   public K floorKey(K var1) {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.keyOrNull(this.floorEntry((K)var1));
   }

   @Override
   public Entry<K, V> ceilingEntry(K var1) {
      return this.IIHRRHORCRCROCHHOHORCHCROCIHRO((K)var1, true).firstEntry();
   }

   @Override
   public K ceilingKey(K var1) {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.keyOrNull(this.ceilingEntry((K)var1));
   }

   @Override
   public Entry<K, V> higherEntry(K var1) {
      return this.IIHRRHORCRCROCHHOHORCHCROCIHRO((K)var1, false).firstEntry();
   }

   @Override
   public K higherKey(K var1) {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.keyOrNull(this.higherEntry((K)var1));
   }

   @Override
   public Entry<K, V> firstEntry() {
      return this.isEmpty() ? null : this.RIICCCOHIOHOIIRHCIIOOCRCCHORCC().OHOOIHCOHHORHICHIOROIRIHCOOCRR().get(0);
   }

   @Override
   public Entry<K, V> lastEntry() {
      return this.isEmpty() ? null : this.RIICCCOHIOHOIIRHCIIOOCRCCHORCC().OHOOIHCOHHORHICHIOROIRIHCOOCRR().get(this.size() - 1);
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final Entry<K, V> pollFirstEntry() {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final Entry<K, V> pollLastEntry() {
      throw new UnsupportedOperationException();
   }

   public RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> HRRHCOCCCIRRRHHHCHHHRHCIIICHIO() {
      RCHHHORIRORROOHRRHHIIIOIROHHCC var1 = this.IOOOORHIHHRRHRHRCOORCRIOIOCRIR;
      if (var1 == null) {
         return this.isEmpty()
            ? IIRHCHHOICHRICOOCRORCCIOOIHOIR(IOIHHIORCICCHIIHOIOIOHHRICRHIO.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(this.comparator()).HCHORRRCIORCRHCRIIHROIRRRHCCOR())
            : new RCHHHORIRORROOHRRHHIIIOIROHHCC<>(
               (OHCIOCCCOHCCHHOCCHOIHRHOHCICOR<K>)this.RRCIICIHRHRIIOOIHCCROORHRHHCCO.CCCROROROOOCORRCRCORIIIHHOICHH(),
               this.HRCHHOOCOOOHCHOHHCOCOCCCHCCORI.RROORHRCHCRRRIHOOIHCRRRICORROO(),
               this
            );
      } else {
         return var1;
      }
   }

   public HCCCCIHIOIHCHCCHOOHHCIHRCRRRHH<K> ROHICCOHOROHOIHCHIHORRIRCCCIRR() {
      return this.RRCIICIHRHRIIOOIHCCROORHRHHCCO;
   }

   public HCCCCIHIOIHCHCCHOOHHCIHRCRRRHH<K> IRCHIRCCCHIHOHHCIICOOOCOHOIRHH() {
      return this.RRCIICIHRHRIIOOIHCCROORHRHHCCO.CCCROROROOOCORRCRCORIIIHHOICHH();
   }

   @Override
   Object writeReplace() {
      return new RCHHHORIRORROOHRRHHIIIOIROHHCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this);
   }

   private static class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends OOHRIIOOHROIOHCIRIHRHRRICRRHOI.CRRRICCRROCOHHOHIICIHORCOORRRH {
      private final Comparator<Object> CCHHHHCHOOHHICRROIIIRICIHOHORH;
      private static final long IHCIHHHCROROCRRRCCRCCOIHOHRRCC = 0L;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(RCHHHORIRORROOHRRHHIIIOIROHHCC<?, ?> var1) {
         super(var1);
         this.CCHHHHCHOOHHICRROIIIRICIHOHORH = var1.comparator();
      }

      @Override
      Object readResolve() {
         RCHHHORIRORROOHRRHHIIIOIROHHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = new RCHHHORIRORROOHRRHHIIIOIROHHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(
            this.CCHHHHCHOOHHICRROIIIRICIHOHORH
         );
         return this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      }
   }

   public static class IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V> extends OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> {
      private final Comparator<? super K> CCCOIHHHCRRRIRCRCHHRCOICHHICRI;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(Comparator<? super K> var1) {
         this.CCCOIHHHCRRRIRCRCHHRCOICHHICRI = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
      }

      @CanIgnoreReturnValue
      public RCHHHORIRORROOHRRHHIIIOIROHHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V> OIHCOHRCICCCRHRCROOCIOIRRHHHIH(K var1, V var2) {
         super.RICRIRRCOHRCOCRRHHCRHRROOIOHHR((K)var1, (V)var2);
         return this;
      }

      @CanIgnoreReturnValue
      public RCHHHORIRORROOHRRHHIIIOIROHHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V> IHCRORHRORIICHRHRCHRRIRRHHOCOO(Entry<? extends K, ? extends V> var1) {
         super.IOIICIRIICICIIOORHCIIIIRRIHRHI(var1);
         return this;
      }

      @CanIgnoreReturnValue
      public RCHHHORIRORROOHRRHHIIIOIROHHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V> RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(Map<? extends K, ? extends V> var1) {
         super.IOHHOIIOCRHCHHCRORICCOHOHROOIH(var1);
         return this;
      }

      @CanIgnoreReturnValue
      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      public RCHHHORIRORROOHRRHHIIIOIROHHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V> HCHRIROHHHCORIOCROOCHRCIOROOCI(
         Iterable<? extends Entry<? extends K, ? extends V>> var1
      ) {
         super.IRRCCOICORICIHCHRHIHIHROIRHOCR(var1);
         return this;
      }

      @Deprecated
      @CanIgnoreReturnValue
      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      public RCHHHORIRORROOHRRHHIIIOIROHHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V> RHOCHHIRRCHHHOHOIRROIROHHHIHIO(Comparator<? super V> var1) {
         throw new UnsupportedOperationException("Not available on ImmutableSortedMap.Builder");
      }

      RCHHHORIRORROOHRRHHIIIOIROHHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V> CRRRICCRROCOHHOHIICIHORCOORRRH(
         OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> var1
      ) {
         super.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
         return this;
      }

      public RCHHHORIRORROOHRRHHIIIOIROHHCC<K, V> CRIIRHCCOCROCRIRROOCHOOHCORCHO() {
         switch (this.size) {
            case 0:
               return RCHHHORIRORROOHRRHHIIIOIROHHCC.IIRHCHHOICHRICOOCRORCCIOOIHOIR(this.CCCOIHHHCRRRIRCRCHHRCOICHHICRI);
            case 1:
               return RCHHHORIRORROOHRRHHIIIOIROHHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  this.CCCOIHHHCRRRIRCRCHHRCOICHHICRI, this.entries[0].getKey(), this.entries[0].getValue()
               );
            default:
               return RCHHHORIRORROOHRRHHIIIOIROHHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CCCOIHHHCRRRIRCRCHHRCOICHHICRI, false, this.entries, this.size);
         }
      }
   }
}
