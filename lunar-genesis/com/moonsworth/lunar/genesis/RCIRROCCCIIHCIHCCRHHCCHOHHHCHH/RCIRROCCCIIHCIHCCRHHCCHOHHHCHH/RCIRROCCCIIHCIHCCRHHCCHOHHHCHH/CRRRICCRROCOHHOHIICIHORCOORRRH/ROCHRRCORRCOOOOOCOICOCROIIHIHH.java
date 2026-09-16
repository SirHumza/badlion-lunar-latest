package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
public final class ROCHRRCORRCOOOOOCOICOCROIIHIHH {
   private ROCHRRCORRCOOOOOCOICOCROIIHIHH() {
   }

   static <K> com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<Entry<K, ?>, K> HICIIHICHOHHIICRCHIOOOCRHHHIHR() {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.KEY;
   }

   static <V> com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<Entry<?, V>, V> RICRROIIIHORIOCHCOORHRIIOHHIOH() {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.VALUE;
   }

   static <K, V> Iterator<K> keyIterator(Iterator<Entry<K, V>> var0) {
      return new HOIRRRIRHICOHCCORHIHCOHIIIHCCO<Entry<K, V>, K>(var0) {
         K transform(Entry<K, V> var1) {
            return (K)var1.getKey();
         }
      };
   }

   static <K, V> Iterator<V> valueIterator(Iterator<Entry<K, V>> var0) {
      return new HOIRRRIRHICOHCCORHIHCOHIIIHCCO<Entry<K, V>, V>(var0) {
         V transform(Entry<K, V> var1) {
            return (V)var1.getValue();
         }
      };
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public static <K extends Enum<K>, V> OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> IIOIROIHIHHCCRICRCOOCHIICHRCOI(Map<K, ? extends V> var0) {
      if (var0 instanceof HCHHOOOCRCRHHICHICORHOCHCCCHRH) {
         return (HCHHOOOCRCRHHICHICORHOCHCCCHRH)var0;
      }

      Iterator var1 = var0.entrySet().iterator();
      if (!var1.hasNext()) {
         return OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RIOCOIOOIIRHOROHOCHHOORRCCOIHR();
      }

      Entry var2 = (Entry)var1.next();
      Enum var3 = (Enum)var2.getKey();
      Object var4 = var2.getValue();
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkEntryNotNull(
         var3, var4
      );
      Class var5 = var3.getDeclaringClass();
      EnumMap var6 = new EnumMap(var5);
      var6.put((K)var3, var4);

      while (var1.hasNext()) {
         Entry var7 = (Entry)var1.next();
         Enum var8 = (Enum)var7.getKey();
         Object var9 = var7.getValue();
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkEntryNotNull(
            var8, var9
         );
         var6.put((K)var8, var9);
      }

      return HCHHOOOCRCRHHICHICORHOCHCCCHRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var6);
   }

   public static <T, K extends Enum<K>, V> Collector<T, ?, OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V>> toImmutableEnumMap(
      Function<? super T, ? extends K> var0, Function<? super T, ? extends V> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return Collector.of(
         () -> new ROCHRRCORRCOOOOOCOICOCROIIHIHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH((var0x, var1x) -> {
            throw new IllegalArgumentException("Multiple values for key: " + var0x + ", " + var1x);
         }),
         (var2, var3) -> {
            Enum var4 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               (Enum)var0.apply(var3), "Null key for input %s", var3
            );
            Object var5 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var1.apply(var3), "Null value for input %s", var3
            );
            var2.put((K)var4, var5);
         },
         ROCHRRCORRCOOOOOCOICOCROIIHIHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH,
         ROCHRRCORRCOOOOOCOICOCROIIHIHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH::CRCHOCCRIRRCRRRCCRCICRIRCORHIR,
         Characteristics.UNORDERED
      );
   }

   public static <T, K extends Enum<K>, V> Collector<T, ?, OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V>> toImmutableEnumMap(
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
      return Collector.of(
         () -> new ROCHRRCORRCOOOOOCOICOCROIIHIHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2),
         (var2x, var3) -> {
            Enum var4 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               (Enum)var0.apply(var3), "Null key for input %s", var3
            );
            Object var5 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var1.apply(var3), "Null value for input %s", var3
            );
            var2x.put((K)var4, var5);
         },
         ROCHRRCORRCOOOOOCOICOCROIIHIHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH,
         ROCHRRCORRCOOOOOCOICOCROIIHIHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH::CRCHOCCRIRRCRRRCCRCICRIRCORHIR
      );
   }

   public static <K, V> HashMap<K, V> newHashMap() {
      return new HashMap<>();
   }

   public static <K, V> HashMap<K, V> newHashMap(Map<? extends K, ? extends V> var0) {
      return new HashMap<>(var0);
   }

   public static <K, V> HashMap<K, V> newHashMapWithExpectedSize(int var0) {
      return new HashMap<>(capacity(var0));
   }

   static int capacity(int var0) {
      if (var0 < 3) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(
            var0, "expectedSize"
         );
         return var0 + 1;
      } else {
         return var0 < 1073741824 ? (int)(var0 / 0.75F + 1.0F) : Integer.MAX_VALUE;
      }
   }

   public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
      return new LinkedHashMap<>();
   }

   public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(Map<? extends K, ? extends V> var0) {
      return new LinkedHashMap<>(var0);
   }

   public static <K, V> LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int var0) {
      return new LinkedHashMap<>(capacity(var0));
   }

   public static <K, V> ConcurrentMap<K, V> newConcurrentMap() {
      return new ConcurrentHashMap<>();
   }

   public static <K extends Comparable, V> TreeMap<K, V> newTreeMap() {
      return new TreeMap<>();
   }

   public static <K, V> TreeMap<K, V> newTreeMap(SortedMap<K, ? extends V> var0) {
      return new TreeMap<>(var0);
   }

   public static <C, K extends C, V> TreeMap<K, V> newTreeMap(@Nullable Comparator<C> var0) {
      return new TreeMap<>(var0);
   }

   public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Class<K> var0) {
      return new EnumMap<>(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var0
         )
      );
   }

   public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Map<K, ? extends V> var0) {
      return new EnumMap<>(var0);
   }

   public static <K, V> IdentityHashMap<K, V> newIdentityHashMap() {
      return new IdentityHashMap<>();
   }

   public static <K, V> HCIOIIHCHIHRHOHRICRIOCIRHRICOR<K, V> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      Map<? extends K, ? extends V> var0, Map<? extends K, ? extends V> var1
   ) {
      if (var0 instanceof SortedMap) {
         SortedMap var2 = (SortedMap)var0;
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1);
      } else {
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var0,
            var1,
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO.CIROHOCCIIIOCHRRRCRRHIORRICIOR()
         );
      }
   }

   public static <K, V> HCIOIIHCHIHRHOHRICRIOCIRHRICOR<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Map<? extends K, ? extends V> var0,
      Map<? extends K, ? extends V> var1,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<? super V> var2
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      LinkedHashMap var3 = newLinkedHashMap();
      LinkedHashMap var4 = new LinkedHashMap(var1);
      LinkedHashMap var5 = newLinkedHashMap();
      LinkedHashMap var6 = newLinkedHashMap();
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2, var3, var4, var5, var6);
      return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI<>(var3, var4, var5, var6);
   }

   public static <K, V> IRRIHROCORIOOCHHCHCHOHCIOHHRRI<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(SortedMap<K, ? extends V> var0, Map<? extends K, ? extends V> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      Comparator var2 = orNaturalOrder(var0.comparator());
      TreeMap var3 = newTreeMap(var2);
      TreeMap var4 = newTreeMap(var2);
      var4.putAll(var1);
      TreeMap var5 = newTreeMap(var2);
      TreeMap var6 = newTreeMap(var2);
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0,
         var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO.CIROHOCCIIIOCHRRRCRRHIORRICIOR(),
         var3,
         var4,
         var5,
         var6
      );
      return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.RIROICHCRROROHCCROOCCCCOCHCCRI<>(var3, var4, var5, var6);
   }

   private static <K, V> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Map<? extends K, ? extends V> var0,
      Map<? extends K, ? extends V> var1,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<? super V> var2,
      Map<K, V> var3,
      Map<K, V> var4,
      Map<K, V> var5,
      Map<K, HCIOIIHCHIHRHOHRICRIOCIRHRICOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V>> var6
   ) {
      for (Entry var8 : var0.entrySet()) {
         Object var9 = var8.getKey();
         Object var10 = var8.getValue();
         if (var1.containsKey(var9)) {
            Object var11 = var4.remove(var9);
            if (var2.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var10, var11)) {
               var5.put(var9, var10);
            } else {
               var6.put(var9, ROCHRRCORRCOOOOOCOICOCROIIHIHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.OOCCRCRCOHIIORCCORCRCIRRROIOOR(var10, var11));
            }
         } else {
            var3.put(var9, var10);
         }
      }
   }

   private static <K, V> Map<K, V> unmodifiableMap(Map<K, ? extends V> var0) {
      return var0 instanceof SortedMap ? Collections.unmodifiableSortedMap((SortedMap<K, ? extends V>)var0) : Collections.unmodifiableMap(var0);
   }

   static <E> Comparator<? super E> orNaturalOrder(@Nullable Comparator<? super E> var0) {
      return var0 != null ? var0 : IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC();
   }

   public static <K, V> Map<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Set<K> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super K, V> var1
   ) {
      return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<>(var0, var1);
   }

   public static <K, V> SortedMap<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      SortedSet<K> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super K, V> var1
   ) {
      return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR<>(var0, var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <K, V> NavigableMap<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      NavigableSet<K> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super K, V> var1
   ) {
      return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO<>(var0, var1);
   }

   static <K, V> Iterator<Entry<K, V>> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      Set<K> var0,
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super K, V> var1
   ) {
      return new HOIRRRIRHICOHCCORHIHCOHIIIHCCO<K, Entry<K, V>>(var0.iterator()) {
         Entry<K, V> transform(K var1x) {
            return ROCHRRCORRCOOOOOCOICOCROIIHIHH.immutableEntry((K)var1x, (V)var1.apply(var1x));
         }
      };
   }

   private static <E> Set<E> removeOnlySet(final Set<E> var0) {
      return new HOHCCHOIOHOHHOROHOIIHOOHORRHRO<E>() {
         @Override
         protected Set<E> delegate() {
            return var0;
         }

         @Override
         public boolean add(E var1) {
            throw new UnsupportedOperationException();
         }

         @Override
         public boolean addAll(Collection<? extends E> var1) {
            throw new UnsupportedOperationException();
         }
      };
   }

   private static <E> SortedSet<E> removeOnlySortedSet(final SortedSet<E> var0) {
      return new IHROCRRIRIROCCCRCRRROCRRCRIIHH<E>() {
         @Override
         protected SortedSet<E> delegate() {
            return var0;
         }

         @Override
         public boolean add(E var1) {
            throw new UnsupportedOperationException();
         }

         @Override
         public boolean addAll(Collection<? extends E> var1) {
            throw new UnsupportedOperationException();
         }

         @Override
         public SortedSet<E> headSet(E var1) {
            return ROCHRRCORRCOOOOOCOICOCROIIHIHH.removeOnlySortedSet((SortedSet<E>)super.headSet(var1));
         }

         @Override
         public SortedSet<E> subSet(E var1, E var2) {
            return ROCHRRCORRCOOOOOCOICOCROIIHIHH.removeOnlySortedSet((SortedSet<E>)super.subSet(var1, var2));
         }

         @Override
         public SortedSet<E> tailSet(E var1) {
            return ROCHRRCORRCOOOOOCOICOCROIIHIHH.removeOnlySortedSet((SortedSet<E>)super.tailSet(var1));
         }
      };
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static <E> NavigableSet<E> removeOnlyNavigableSet(final NavigableSet<E> var0) {
      return new OCIIROIOORRIOIIIRHIRRCCIIRRROH<E>() {
         @Override
         protected NavigableSet<E> delegate() {
            return var0;
         }

         @Override
         public boolean add(E var1) {
            throw new UnsupportedOperationException();
         }

         @Override
         public boolean addAll(Collection<? extends E> var1) {
            throw new UnsupportedOperationException();
         }

         @Override
         public SortedSet<E> headSet(E var1) {
            return ROCHRRCORRCOOOOOCOICOCROIIHIHH.removeOnlySortedSet((SortedSet<E>)super.headSet(var1));
         }

         @Override
         public NavigableSet<E> headSet(E var1, boolean var2) {
            return ROCHRRCORRCOOOOOCOICOCROIIHIHH.removeOnlyNavigableSet((NavigableSet<E>)super.headSet(var1, var2));
         }

         @Override
         public SortedSet<E> subSet(E var1, E var2) {
            return ROCHRRCORRCOOOOOCOICOCROIIHIHH.removeOnlySortedSet((SortedSet<E>)super.subSet(var1, var2));
         }

         @Override
         public NavigableSet<E> subSet(E var1, boolean var2, E var3, boolean var4) {
            return ROCHRRCORRCOOOOOCOICOCROIIHIHH.removeOnlyNavigableSet((NavigableSet<E>)super.subSet(var1, var2, var3, var4));
         }

         @Override
         public SortedSet<E> tailSet(E var1) {
            return ROCHRRCORRCOOOOOCOICOCROIIHIHH.removeOnlySortedSet((SortedSet<E>)super.tailSet(var1));
         }

         @Override
         public NavigableSet<E> tailSet(E var1, boolean var2) {
            return ROCHRRCORRCOOOOOCOICOCROIIHIHH.removeOnlyNavigableSet((NavigableSet<E>)super.tailSet(var1, var2));
         }

         @Override
         public NavigableSet<E> descendingSet() {
            return ROCHRRCORRCOOOOOCOICOCROIIHIHH.removeOnlyNavigableSet(super.descendingSet());
         }
      };
   }

   public static <K, V> OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      Iterable<K> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super K, V> var1
   ) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0.iterator(), var1);
   }

   public static <K, V> OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      Iterator<K> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super K, V> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      LinkedHashMap var2 = newLinkedHashMap();

      while (var0.hasNext()) {
         Object var3 = var0.next();
         var2.put(var3, var1.apply(var3));
      }

      return OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCCCROCHCICCROHCOCCRRROCIIHCCH(var2);
   }

   @CanIgnoreReturnValue
   public static <K, V> OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      Iterable<V> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super V, K> var1
   ) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0.iterator(), var1);
   }

   @CanIgnoreReturnValue
   public static <K, V> OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      Iterator<V> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super V, K> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = OOHRIIOOHROIOHCIRIHRHRRICRRHOI.OIRCICCCRCRHORRRCHHORCHRCRRIOH();

      while (var0.hasNext()) {
         Object var3 = var0.next();
         var2.RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var1.apply(var3), var3);
      }

      try {
         return var2.CHRROORCHRCIIRRORRRIORRRRICIRI();
      } catch (IllegalArgumentException var4) {
         throw new IllegalArgumentException(var4.getMessage() + ". To index multiple values under a key, use Multimaps.index.");
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static OOHRIIOOHROIOHCIRIHRHRRICRRHOI<String, String> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Properties var0) {
      OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = OOHRIIOOHROIOHCIRIHRHRRICRRHOI.OIRCICCCRCRHORRRCHHORCHRCRRIOH();
      Enumeration var2 = var0.propertyNames();

      while (var2.hasMoreElements()) {
         String var3 = (String)var2.nextElement();
         var1.RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var3, var0.getProperty(var3));
      }

      return var1.CHRROORCHRCIIRRORRRIORRRRICIRI();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public static <K, V> Entry<K, V> immutableEntry(@Nullable K var0, @Nullable V var1) {
      return new COIOORHCRHCRCOROOHCHIRRIIOIOHR<>((K)var0, (V)var1);
   }

   static <K, V> Set<Entry<K, V>> unmodifiableEntrySet(Set<Entry<K, V>> var0) {
      return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.IHCRORHRORIICHRHRCHRRIRRHHOCOO<>(Collections.unmodifiableSet(var0));
   }

   static <K, V> Entry<K, V> unmodifiableEntry(final Entry<? extends K, ? extends V> var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<K, V>(
         
      ) {
         @Override
         public K getKey() {
            return (K)var0.getKey();
         }

         @Override
         public V getValue() {
            return (V)var0.getValue();
         }
      };
   }

   static <K, V> IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<Entry<K, V>> IIRHCHHOICHRICOOCRORCCIOOIHOIR(final Iterator<Entry<K, V>> var0) {
      return new IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<Entry<K, V>>() {
         @Override
         public boolean hasNext() {
            return var0.hasNext();
         }

         public Entry<K, V> next() {
            return ROCHRRCORRCOOOOOCOICOCROIIHIHH.unmodifiableEntry((Entry<? extends K, ? extends V>)var0.next());
         }
      };
   }

   public static <A, B> com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR<A, B> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<A, B> var0
   ) {
      return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.CRRRICCRROCOHHOHIICIHORCOORRRH<>(var0);
   }

   public static <K, V> com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<K, V> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<K, V> var0
   ) {
      return OOOOCHIHOOCHCCIHHRRICIRIOHOCRO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, null);
   }

   public static <K, V> com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<K, V> HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<? extends K, ? extends V> var0
   ) {
      return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR<>(var0, null);
   }

   public static <K, V1, V2> Map<K, V2> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Map<K, V1> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super V1, V2> var1
   ) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, CORCOCICIRIOHROHROIIOOHICCHCRR(var1));
   }

   public static <K, V1, V2> SortedMap<K, V2> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      SortedMap<K, V1> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super V1, V2> var1
   ) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, CORCOCICIRIOHROHROIIOOHICCHCRR(var1));
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <K, V1, V2> NavigableMap<K, V2> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      NavigableMap<K, V1> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super V1, V2> var1
   ) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, CORCOCICIRIOHROHROIIOOHICCHCRR(var1));
   }

   public static <K, V1, V2> Map<K, V2> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Map<K, V1> var0, ROCHRRCORRCOOOOOCOICOCROIIHIHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<? super K, ? super V1, V2> var1
   ) {
      return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.IHIRRIIORRHORHRORIHOROIRCORCOO<>(var0, var1);
   }

   public static <K, V1, V2> SortedMap<K, V2> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      SortedMap<K, V1> var0, ROCHRRCORRCOOOOOCOICOCROIIHIHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<? super K, ? super V1, V2> var1
   ) {
      return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.HHRIICOIOORCHCOIICOOIHIRHHICRI<>(var0, var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <K, V1, V2> NavigableMap<K, V2> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      NavigableMap<K, V1> var0, ROCHRRCORRCOOOOOCOICOCROIIHIHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<? super K, ? super V1, V2> var1
   ) {
      return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.IOIICIRIICICIIOORHCIIIIRRIHRHI<>(var0, var1);
   }

   static <K, V1, V2> ROCHRRCORRCOOOOOCOICOCROIIHIHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<K, V1, V2> CORCOCICIRIOHROHROIIOOHICCHCRR(
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super V1, V2> var0
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<K, V1, V2>() {
         @Override
         public V2 transformEntry(K var1, V1 var2) {
            return (V2)var0.apply(var2);
         }
      };
   }

   static <K, V1, V2> com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<V1, V2> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      final ROCHRRCORRCOOOOOCOICOCROIIHIHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<? super K, V1, V2> var0, final K var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<V1, V2>(
         
      ) {
         @Override
         public V2 apply(@Nullable V1 var1x) {
            return (V2)var0.transformEntry(var1, var1x);
         }
      };
   }

   static <K, V1, V2> com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<Entry<K, V1>, V2> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      final ROCHRRCORRCOOOOOCOICOCROIIHIHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<? super K, ? super V1, V2> var0
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<Entry<K, V1>, V2>(
         
      ) {
         public V2 apply(Entry<K, V1> var1) {
            return (V2)var0.transformEntry(var1.getKey(), var1.getValue());
         }
      };
   }

   static <V2, K, V1> Entry<K, V2> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      final ROCHRRCORRCOOOOOCOICOCROIIHIHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<? super K, ? super V1, V2> var0, final Entry<K, V1> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<K, V2>(
         
      ) {
         @Override
         public K getKey() {
            return (K)var1.getKey();
         }

         @Override
         public V2 getValue() {
            return (V2)var0.transformEntry(var1.getKey(), var1.getValue());
         }
      };
   }

   static <K, V1, V2> com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<Entry<K, V1>, Entry<K, V2>> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      final ROCHRRCORRCOOOOOCOICOCROIIHIHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<? super K, ? super V1, V2> var0
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<Entry<K, V1>, Entry<K, V2>>(
         
      ) {
         public Entry<K, V2> apply(Entry<K, V1> var1) {
            return ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1);
         }
      };
   }

   static <K> com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<Entry<K, ?>> CRICCOOHHHCHOORCICOCOHIHOIRHOO(
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super K> var0
   ) {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0, HICIIHICHOHHIICRCHIOOOCRHHHIHR()
      );
   }

   static <V> com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<Entry<?, V>> HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super V> var0
   ) {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0, RICRROIIIHORIOCHCOORHRIIOHHIOH()
      );
   }

   public static <K, V> Map<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Map<K, V> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super K> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var2 = CRICCOOHHHCHOORCICOCOHIHOIRHOO(
         var1
      );
      return var0 instanceof ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
         ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V>)var0, var2)
         : new ROCHRRCORRCOOOOOCOICOCROIIHIHH.OCOHORHCROHICRRIHCIHHRRCIHICRI<>(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var0
            ),
            var1,
            var2
         );
   }

   public static <K, V> SortedMap<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      SortedMap<K, V> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super K> var1
   ) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1));
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <K, V> NavigableMap<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      NavigableMap<K, V> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super K> var1
   ) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1));
   }

   public static <K, V> com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<K, V> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super K> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1));
   }

   public static <K, V> Map<K, V> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      Map<K, V> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super V> var1
   ) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1));
   }

   public static <K, V> SortedMap<K, V> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      SortedMap<K, V> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super V> var1
   ) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1));
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <K, V> NavigableMap<K, V> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      NavigableMap<K, V> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super V> var1
   ) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1));
   }

   public static <K, V> com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<K, V> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<K, V> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super V> var1
   ) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1));
   }

   public static <K, V> Map<K, V> HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      Map<K, V> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return var0 instanceof ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
         ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V>)var0, var1)
         : new ROCHRRCORRCOOOOOCOICOCROIIHIHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO<>(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var0
            ),
            var1
         );
   }

   public static <K, V> SortedMap<K, V> HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      SortedMap<K, V> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return var0 instanceof ROCHRRCORRCOOOOOCOICOCROIIHIHH.IIHRRHORCRCROCHHOHORCHCROCIHRO
         ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((ROCHRRCORRCOOOOOCOICOCROIIHIHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<K, V>)var0, var1)
         : new ROCHRRCORRCOOOOOCOICOCROIIHIHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<>(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var0
            ),
            var1
         );
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <K, V> NavigableMap<K, V> HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      NavigableMap<K, V> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return var0 instanceof ROCHRRCORRCOOOOOCOICOCROIIHIHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI
         ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((ROCHRRCORRCOOOOOCOICOCROIIHIHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI<K, V>)var0, var1)
         : new ROCHRRCORRCOOOOOCOICOCROIIHIHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI<>(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var0
            ),
            var1
         );
   }

   public static <K, V> com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<K, V> HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<K, V> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return var0 instanceof ROCHRRCORRCOOOOOCOICOCROIIHIHH.CORCOCICIRIOHROHROIIOOHICCHCRR
         ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((ROCHRRCORRCOOOOOCOICOCROIIHIHH.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V>)var0, var1)
         : new ROCHRRCORRCOOOOOCOICOCROIIHIHH.CORCOCICIRIOHROHROIIOOHICCHCRR<>(var0, var1);
   }

   private static <K, V> Map<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> var1
   ) {
      return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO<>(
         var0.OCOCOIICHHIHIRCOICIHCRCOHIHCCH,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var0.RHCRRHOICOIORHIHCOCRORROOHOIOC, var1
         )
      );
   }

   private static <K, V> SortedMap<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      ROCHRRCORRCOOOOOCOICOCROIIHIHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<K, V> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var2 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0.RHCRRHOICOIORHIHCOCRORROOHOIOC, var1
      );
      return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<>(var0.sortedMap(), var2);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static <K, V> NavigableMap<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      ROCHRRCORRCOOOOOCOICOCROIIHIHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI<K, V> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var2 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0.HCOOOHIOROROOIHRHHRHRCIOHCCCRI, var1
      );
      return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI<>(var0.IHHIRIORHRRIOHRCOHROHCOIRCHIII, var2);
   }

   private static <K, V> com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      ROCHRRCORRCOOOOOCOICOCROIIHIHH.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var2 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0.RHCRRHOICOIORHIHCOCRORROOHOIOC, var1
      );
      return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.CORCOCICIRIOHROHROIIOOHICCHCRR<>(var0.OHIROOCOIROOHROOOIRIHHHRCRIHCI(), var2);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <K, V> NavigableMap<K, V> unmodifiableNavigableMap(NavigableMap<K, ? extends V> var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      return var0 instanceof ROCHRRCORRCOOOOOCOICOCROIIHIHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR
         ? var0
         : new ROCHRRCORRCOOOOOCOICOCROIIHIHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<>(var0);
   }

   private static <K, V> @Nullable Entry<K, V> unmodifiableOrNull(@Nullable Entry<K, ? extends V> var0) {
      return var0 == null ? null : unmodifiableEntry(var0);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <K, V> NavigableMap<K, V> synchronizedNavigableMap(NavigableMap<K, V> var0) {
      return OOOOCHIHOOCHCCIHHRRICIRIOHOCRO.navigableMap(var0);
   }

   static <V> V safeGet(Map<?, V> var0, @Nullable Object var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );

      try {
         return (V)var0.get(var1);
      } catch (ClassCastException | NullPointerException var3) {
         return null;
      }
   }

   static boolean safeContainsKey(Map<?, ?> var0, Object var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );

      try {
         return var0.containsKey(var1);
      } catch (ClassCastException | NullPointerException var3) {
         return false;
      }
   }

   static <V> V safeRemove(Map<?, V> var0, Object var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );

      try {
         return (V)var0.remove(var1);
      } catch (ClassCastException | NullPointerException var3) {
         return null;
      }
   }

   static boolean containsKeyImpl(Map<?, ?> var0, @Nullable Object var1) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.contains(keyIterator(var0.entrySet().iterator()), var1);
   }

   static boolean containsValueImpl(Map<?, ?> var0, @Nullable Object var1) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.contains(valueIterator(var0.entrySet().iterator()), var1);
   }

   static <K, V> boolean containsEntryImpl(Collection<Entry<K, V>> var0, Object var1) {
      return !(var1 instanceof Entry) ? false : var0.contains(unmodifiableEntry((Entry<? extends K, ? extends V>)var1));
   }

   static <K, V> boolean removeEntryImpl(Collection<Entry<K, V>> var0, Object var1) {
      return !(var1 instanceof Entry) ? false : var0.remove(unmodifiableEntry((Entry<? extends K, ? extends V>)var1));
   }

   static boolean equalsImpl(Map<?, ?> var0, Object var1) {
      if (var0 == var1) {
         return true;
      } else if (var1 instanceof Map) {
         Map var2 = (Map)var1;
         return var0.entrySet().equals(var2.entrySet());
      } else {
         return false;
      }
   }

   static String toStringImpl(Map<?, ?> var0) {
      StringBuilder var1 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.newStringBuilderForCollection(
            var0.size()
         )
         .append('{');
      boolean var2 = true;

      for (Entry var4 : var0.entrySet()) {
         if (!var2) {
            var1.append(", ");
         }

         var2 = false;
         var1.append(var4.getKey()).append('=').append(var4.getValue());
      }

      return var1.append('}').toString();
   }

   static <K, V> void putAllImpl(Map<K, V> var0, Map<? extends K, ? extends V> var1) {
      for (Entry var3 : var1.entrySet()) {
         var0.put(var3.getKey(), var3.getValue());
      }
   }

   static <K> @Nullable K keyOrNull(@Nullable Entry<K, ?> var0) {
      return (K)(var0 == null ? null : var0.getKey());
   }

   static <V> @Nullable V valueOrNull(@Nullable Entry<?, V> var0) {
      return (V)(var0 == null ? null : var0.getValue());
   }

   static <E> OOHRIIOOHROIOHCIRIHRHRRICRRHOI<E, Integer> RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(Collection<E> var0) {
      OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = new OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.size());
      int var2 = 0;

      for (Object var4 : var0) {
         var1.RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var4, var2++);
      }

      return var1.CHRROORCHRCIIRRORRRIORRRRICIRI();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static <K extends Comparable<? super K>, V> NavigableMap<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      NavigableMap<K, V> var0, IIHROHOIOHICCRRHRICHCIHRCROOIO<K> var1
   ) {
      if (var0.comparator() != null
         && var0.comparator() != IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC()
         && var1.hasLowerBound()
         && var1.hasUpperBound()) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            var0.comparator().compare(var1.lowerEndpoint(), var1.upperEndpoint()) <= 0,
            "map is using a custom comparator which is inconsistent with the natural ordering."
         );
      }

      if (var1.hasLowerBound() && var1.hasUpperBound()) {
         return (NavigableMap<K, V>)var0.subMap(
            var1.lowerEndpoint(),
            var1.HHRHCHOCIRCHOIOIRCICHOCOIIOOHR()
               == com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IOIICIRIICICIIOORHCIIIIRRIHRHI.CLOSED,
            var1.upperEndpoint(),
            var1.CCCORHHHOCOICHHCIHOIRHHCOROROO()
               == com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IOIICIRIICICIIOORHCIIIIRRIHRHI.CLOSED
         );
      } else if (var1.hasLowerBound()) {
         return (NavigableMap<K, V>)var0.tailMap(
            var1.lowerEndpoint(),
            var1.HHRHCHOCIRCHOIOIRCICHOCOIIOOHR()
               == com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IOIICIRIICICIIOORHCIIIIRRIHRHI.CLOSED
         );
      } else {
         return (NavigableMap<K, V>)(var1.hasUpperBound()
            ? var0.headMap(
               var1.upperEndpoint(),
               var1.CCCORHHHOCOICHHCIHOIRHHCOROROO()
                  == com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IOIICIRIICICIIOORHCIIIIRRIHRHI.CLOSED
            )
            : com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var0
            ));
      }
   }

   private static final class CIOHHCORHRCCRICCCORIHCRHCCCRRR<K, V> extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<K, V> {
      final Map<K, V> OIIOHRHOROHHRHCIRROHIRIRRRCHRH;
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> CHCHIRHICRIROOIRRIIICIORIRCROR;

      CIOHHCORHRCCRICCCORIHCRHCCCRRR(
         Map<K, V> var1,
         Map<K, V> var2,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> var3
      ) {
         super(var1);
         this.OIIOHRHOROHHRHCIRROHIRIRRRCHRH = var2;
         this.CHCHIRHICRIROOIRRIIICIORIRCROR = var3;
      }

      @Override
      public boolean remove(Object var1) {
         Iterator var2 = this.OIIOHRHOROHHRHCIRROHIRIRRRCHRH.entrySet().iterator();

         while (var2.hasNext()) {
            Entry var3 = (Entry)var2.next();
            if (this.CHCHIRHICRIROOIRRIIICIORIRCROR.apply(var3)
               && com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
                  var3.getValue(), var1
               )) {
               var2.remove();
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean removeAll(Collection<?> var1) {
         Iterator var2 = this.OIIOHRHOROHHRHCIRROHIRIRRRCHRH.entrySet().iterator();
         boolean var3 = false;

         while (var2.hasNext()) {
            Entry var4 = (Entry)var2.next();
            if (this.CHCHIRHICRIROOIRRIIICIORIRCROR.apply(var4) && var1.contains(var4.getValue())) {
               var2.remove();
               var3 = true;
            }
         }

         return var3;
      }

      @Override
      public boolean retainAll(Collection<?> var1) {
         Iterator var2 = this.OIIOHRHOROHHRHCIRROHIRIRRRCHRH.entrySet().iterator();
         boolean var3 = false;

         while (var2.hasNext()) {
            Entry var4 = (Entry)var2.next();
            if (this.CHCHIRHICRIROOIRRIIICIORIRCROR.apply(var4) && !var1.contains(var4.getValue())) {
               var2.remove();
               var3 = true;
            }
         }

         return var3;
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

   static final class CORCOCICIRIOHROHROIIOOHICCHCRR<K, V>
      extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO<K, V>
      implements com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<K, V> {
      @RetainedWith
      private final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<V, K> HICOCICIORHOHHIHRRIIHHIHIOCHRH;

      private static <K, V> com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<Entry<V, K>> IIHRRHORCRCROCHHOHORCHCROCIHRO(
         final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> var0
      ) {
         return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<Entry<V, K>>(
            
         ) {
            public boolean apply(Entry<V, K> var1) {
               return var0.apply(ROCHRRCORRCOOOOOCOICOCROIIHIHH.immutableEntry(var1.getValue(), var1.getKey()));
            }
         };
      }

      CORCOCICIRIOHROHROIIOOHICCHCRR(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<K, V> var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> var2
      ) {
         super(var1, var2);
         this.HICOCICIORHOHHIHRRIIHHIHIOCHRH = new ROCHRRCORRCOOOOOCOICOCROIIHIHH.CORCOCICIRIOHROHROIIOOHICCHCRR<>(
            var1.HOCCROIICHRHHCOCIICIROCCIHRCOR(), IIHRRHORCRCROCHHOHORCHCROCIHRO(var2), this
         );
      }

      private CORCOCICIRIOHROHROIIOOHICCHCRR(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<K, V> var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> var2,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<V, K> var3
      ) {
         super(var1, var2);
         this.HICOCICIORHOHHIHRRIIHHIHIOCHRH = var3;
      }

      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<K, V> OHIROOCOIROOHROOOIRIHHHRCRIHCI() {
         return (com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<K, V>)this.OCOCOIICHHIHIRCOICIHCRCOHIHCCH;
      }

      @Override
      public V forcePut(@Nullable K var1, @Nullable V var2) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            this.apply(var1, (V)var2)
         );
         return this.OHIROOCOIROOHROOOIRIHHHRCRIHCI().forcePut((K)var1, (V)var2);
      }

      @Override
      public void replaceAll(BiFunction<? super K, ? super V, ? extends V> var1) {
         this.OHIROOCOIROOHROOOIRIHHHRCRIHCI()
            .replaceAll(
               (var2, var3) -> (V)(this.RHCRRHOICOIORHIHCOCRORROOHOIOC.apply(ROCHRRCORRCOOOOOCOICOCROIIHIHH.immutableEntry((K)var2, (V)var3))
                  ? var1.apply(var2, var3)
                  : var3)
            );
      }

      @Override
      public com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<V, K> HOCCROIICHRHHCOCIICIROCCIHRCOR() {
         return this.HICOCICIORHOHHIHRRIIHHIHIOCHRH;
      }

      @Override
      public Set<V> values() {
         return this.HICOCICIORHOHHIHRRIIHHIHIOCHRH.keySet();
      }
   }

   static class CRICCOOHHHCHOORCICOCOHIHOIRHOO<K, V> extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> {
      final Set<Entry<K, V>> OOOCHHHRIOHOOHRHCOCCORRROHOIOH;

      CRICCOOHHHCHOORCICOCOHIHOIRHOO(
         Map<K, V> var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> var2
      ) {
         super(var1, var2);
         this.OOOCHHHRIOHOOHRHCOCCORRROHOIOH = ICRHCCCCOIICOCHHCRCOOIHICROIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1.entrySet(), this.RHCRRHOICOIORHIHCOCRORROOHOIOC
         );
      }

      @Override
      protected Set<Entry<K, V>> createEntrySet() {
         return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      }

      @Override
      Set<K> createKeySet() {
         return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      }

      static <K, V> boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         Map<K, V> var0,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> var1,
         Collection<?> var2
      ) {
         Iterator var3 = var0.entrySet().iterator();
         boolean var4 = false;

         while (var3.hasNext()) {
            Entry var5 = (Entry)var3.next();
            if (var1.apply(var5) && var2.contains(var5.getKey())) {
               var3.remove();
               var4 = true;
            }
         }

         return var4;
      }

      static <K, V> boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         Map<K, V> var0,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> var1,
         Collection<?> var2
      ) {
         Iterator var3 = var0.entrySet().iterator();
         boolean var4 = false;

         while (var3.hasNext()) {
            Entry var5 = (Entry)var3.next();
            if (var1.apply(var5) && !var2.contains(var5.getKey())) {
               var3.remove();
               var4 = true;
            }
         }

         return var4;
      }

      class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR<K, V> {
         IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
            super(CRICCOOHHHCHOORCICOCOHIHOIRHOO.this);
         }

         @Override
         public boolean remove(Object var1) {
            if (CRICCOOHHHCHOORCICOCOHIHOIRHOO.this.containsKey(var1)) {
               CRICCOOHHHCHOORCICOCOHIHOIRHOO.this.OCOCOIICHHIHIRCOICIHCRCOHIHCCH.remove(var1);
               return true;
            } else {
               return false;
            }
         }

         @Override
         public boolean removeAll(Collection<?> var1) {
            return ROCHRRCORRCOOOOOCOICOCROIIHIHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               CRICCOOHHHCHOORCICOCOHIHOIRHOO.this.OCOCOIICHHIHIRCOICIHCRCOHIHCCH, CRICCOOHHHCHOORCICOCOHIHOIRHOO.this.RHCRRHOICOIORHIHCOCRORROOHOIOC, var1
            );
         }

         @Override
         public boolean retainAll(Collection<?> var1) {
            return ROCHRRCORRCOOOOOCOICOCROIIHIHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               CRICCOOHHHCHOORCICOCOHIHOIRHOO.this.OCOCOIICHHIHIRCOICIHCRCOHIHCCH, CRICCOOHHHCHOORCICOCOHIHOIRHOO.this.RHCRRHOICOIORHIHCOCRORROOHOIOC, var1
            );
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

      private class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends HOHCCHOIOHOHHOROHOIIHOOHORRHRO<Entry<K, V>> {
         private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         }

         @Override
         protected Set<Entry<K, V>> delegate() {
            return CRICCOOHHHCHOORCICOCOHIHOIRHOO.this.OOOCHHHRIOHOOHRHCOCCORRROHOIOH;
         }

         @Override
         public Iterator<Entry<K, V>> iterator() {
            return new HOIRRRIRHICOHCCORHIHCOHIIIHCCO<Entry<K, V>, Entry<K, V>>(CRICCOOHHHCHOORCICOCOHIHOIRHOO.this.OOOCHHHRIOHOOHRHCOCCORRROHOIOH.iterator()) {
               Entry<K, V> transform(final Entry<K, V> var1) {
                  return new OCOROCROIRCHIHIHHOOIRIIIRRCRHI<K, V>() {
                     @Override
                     protected Entry<K, V> delegate() {
                        return var1;
                     }

                     @Override
                     public V setValue(V var1x) {
                        com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
                           CRICCOOHHHCHOORCICOCOHIHOIRHOO.this.apply(this.getKey(), (V)var1x)
                        );
                        return (V)super.setValue(var1x);
                     }
                  };
               }
            };
         }
      }
   }

   private static final class CRRRICCRROCOHHOHIICIHORCOORRRH<A, B>
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR<A, B>
      implements Serializable {
      private final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<A, B> HOCCCOHORHHCCHRRHRHCOHIOHHIIOC;
      private static final long HOOHORIROIICCOOHOORCORHIHHCIHO = 0L;

      CRRRICCRROCOHHOHIICIHORCOORRRH(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<A, B> var1
      ) {
         this.HOCCCOHORHHCCHRRHRHCOHIOHHIIOC = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
      }

      @Override
      protected B doForward(A var1) {
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HOCCCOHORHHCCHRRHRHCOHIOHHIIOC, (A)var1);
      }

      @Override
      protected A doBackward(B var1) {
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HOCCCOHORHHCCHRRHRHCOHIOHHIIOC.HOCCROIICHRHHCOCIICIROCCIHRCOR(), (B)var1);
      }

      private static <X, Y> Y RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<X, Y> var0,
         X var1
      ) {
         Object var2 = var0.get(var1);
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            var2 != null, "No non-null mapping present for input: %s", var1
         );
         return (Y)var2;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 instanceof ROCHRRCORRCOOOOOCOICOCROIIHIHH.CRRRICCRROCOHHOHIICIHORCOORRRH) {
            ROCHRRCORRCOOOOOCOICOCROIIHIHH.CRRRICCRROCOHHOHIICIHORCOORRRH var2 = (ROCHRRCORRCOOOOOCOICOCROIIHIHH.CRRRICCRROCOHHOHIICIHORCOORRRH)var1;
            return this.HOCCCOHORHHCCHRRHRHCOHIOHHIIOC.equals(var2.HOCCCOHORHHCCHRRHRHCOHIOHHIIOC);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return this.HOCCCOHORHHCCHRRHRHCOHIOHHIIOC.hashCode();
      }

      @Override
      public String toString() {
         return "Maps.asConverter(" + this.HOCCCOHORHHCCHRRHRHCOHIOHHIIOC + ")";
      }
   }

   private static class HHCCIRHCCCIIRHCROHIORHIRHHIORH<K, V> extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH<K, V> {
      private final Set<K> CHRHICHICICROIHOCROCHOROCOHCOI;
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super K, V> RCIOCCHRCIIIOHRCOOOOIIIHCOCCHR;

      Set<K> backingSet() {
         return this.CHRHICHICICROIHOCROCHOROCOHCOI;
      }

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         Set<K> var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super K, V> var2
      ) {
         this.CHRHICHICICROIHOCROCHOROCOHCOI = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.RCIOCCHRCIIIOHRCOOOOIIIHCOCCHR = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var2
         );
      }

      @Override
      public Set<K> createKeySet() {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.removeOnlySet(this.backingSet());
      }

      @Override
      Collection<V> createValues() {
         return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.CHRHICHICICROIHOCROCHOROCOHCOI, this.RCIOCCHRCIIIOHRCOOOOIIIHCOCCHR
         );
      }

      @Override
      public int size() {
         return this.backingSet().size();
      }

      @Override
      public boolean containsKey(@Nullable Object var1) {
         return this.backingSet().contains(var1);
      }

      @Override
      public V get(@Nullable Object var1) {
         return this.getOrDefault(var1, null);
      }

      @Override
      public V getOrDefault(@Nullable Object var1, @Nullable V var2) {
         if (com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.safeContains(
            this.backingSet(), var1
         )) {
            Object var3 = var1;
            return this.RCIOCCHRCIIIOHRCOOOOIIIHCOCCHR.apply((K)var3);
         } else {
            return (V)var2;
         }
      }

      @Override
      public V remove(@Nullable Object var1) {
         if (this.backingSet().remove(var1)) {
            Object var2 = var1;
            return this.RCIOCCHRCIIIOHRCOOOOIIIHCOCCHR.apply((K)var2);
         } else {
            return null;
         }
      }

      @Override
      public void clear() {
         this.backingSet().clear();
      }

      @Override
      protected Set<Entry<K, V>> createEntrySet() {
         class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<K, V> {
            @Override
            Map<K, V> map() {
               return HHCCIRHCCCIIRHCROHIORHIRHHIORH.this;
            }

            @Override
            public Iterator<Entry<K, V>> iterator() {
               return ROCHRRCORRCOOOOOCOICOCROIIHIHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  HHCCIRHCCCIIRHCROHIORHIRHHIORH.this.backingSet(), HHCCIRHCCCIIRHCROHIORHIRHHIORH.this.RCIOCCHRCIIIOHRCOOOOIIIHCOCCHR
               );
            }
         }

         return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      }

      @Override
      public void forEach(BiConsumer<? super K, ? super V> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.backingSet().forEach(var2 -> var1.accept(var2, this.RCIOCCHRCIIIOHRCOOOOIIIHCOCCHR.apply(var2)));
      }
   }

   static class HHRIICOIOORCHCOIICOOIHIRHHICRI<K, V1, V2>
      extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.IHIRRIIORRHORHRORIHOROIRCORCOO<K, V1, V2>
      implements SortedMap<K, V2> {
      protected SortedMap<K, V1> fromMap() {
         return (SortedMap<K, V1>)this.IOROHIIROOCHHOHCRCIRCHCICRRIRI;
      }

      HHRIICOIOORCHCOIICOOIHIRHHICRI(SortedMap<K, V1> var1, ROCHRRCORRCOOOOOCOICOCROIIHIHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<? super K, ? super V1, V2> var2) {
         super(var1, var2);
      }

      @Override
      public Comparator<? super K> comparator() {
         return this.fromMap().comparator();
      }

      @Override
      public K firstKey() {
         return this.fromMap().firstKey();
      }

      @Override
      public SortedMap<K, V2> headMap(K var1) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.fromMap().headMap((K)var1), this.OICHIORCRRRHHCCCHRRIIIHOIOHRRO);
      }

      @Override
      public K lastKey() {
         return this.fromMap().lastKey();
      }

      @Override
      public SortedMap<K, V2> subMap(K var1, K var2) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.fromMap().subMap((K)var1, (K)var2), this.OICHIORCRRRHHCCCHRRIIIHOIOHRRO);
      }

      @Override
      public SortedMap<K, V2> tailMap(K var1) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.fromMap().tailMap((K)var1), this.OICHIORCRRRHHCCCHRRIIIHOIOHRRO);
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static class HICHRCOHCCRHOHCICOOCHOIHCCHIRI<K, V>
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO<K, V> {
      private final NavigableMap<K, V> IHHIRIORHRRIOHRCOHROHCOIRCHIII;
      private final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> HCOOOHIOROROOIHRHHRHRCIOHCCCRI;
      private final Map<K, V> RCIROHIOCOCHHCIIOHRICCRCHRORRC;

      HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
         NavigableMap<K, V> var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> var2
      ) {
         this.IHHIRIORHRRIOHRCOHROHCOIRCHIII = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.HCOOOHIOROROOIHRHHRHRCIOHCCCRI = var2;
         this.RCIROHIOCOCHHCIIOHRICCRCHRORRC = new ROCHRRCORRCOOOOOCOICOCROIIHIHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO<>(var1, var2);
      }

      @Override
      public Comparator<? super K> comparator() {
         return this.IHHIRIORHRRIOHRCOHROHCOIRCHIII.comparator();
      }

      @Override
      public NavigableSet<K> navigableKeySet() {
         return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V>(this) {
            @Override
            public boolean removeAll(Collection<?> var1) {
               return ROCHRRCORRCOOOOOCOICOCROIIHIHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  HICHRCOHCCRHOHCICOOCHOIHCCHIRI.this.IHHIRIORHRRIOHRCOHROHCOIRCHIII, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.this.HCOOOHIOROROOIHRHHRHRCIOHCCCRI, var1
               );
            }

            @Override
            public boolean retainAll(Collection<?> var1) {
               return ROCHRRCORRCOOOOOCOICOCROIIHIHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  HICHRCOHCCRHOHCICOOCHOIHCCHIRI.this.IHHIRIORHRRIOHRCOHROHCOIRCHIII, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.this.HCOOOHIOROROOIHRHHRHRCIOHCCCRI, var1
               );
            }
         };
      }

      @Override
      public Collection<V> values() {
         return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<>(
            this, this.IHHIRIORHRRIOHRCOHROHCOIRCHIII, this.HCOOOHIOROROOIHRHHRHRCIOHCCCRI
         );
      }

      @Override
      Iterator<Entry<K, V>> entryIterator() {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            this.IHHIRIORHRRIOHRCOHROHCOIRCHIII.entrySet().iterator(), this.HCOOOHIOROROOIHRHHRHRCIOHCCCRI
         );
      }

      @Override
      Iterator<Entry<K, V>> descendingEntryIterator() {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            this.IHHIRIORHRRIOHRCOHROHCOIRCHIII.descendingMap().entrySet().iterator(), this.HCOOOHIOROROOIHRHHRHRCIOHCCCRI
         );
      }

      @Override
      public int size() {
         return this.RCIROHIOCOCHHCIIOHRICCRCHRORRC.size();
      }

      @Override
      public boolean isEmpty() {
         return !IRIHOIRCHIRRCRIOORCOICORHHORHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            this.IHHIRIORHRRIOHRCOHROHCOIRCHIII.entrySet(), this.HCOOOHIOROROOIHRHHRHRCIOHCCCRI
         );
      }

      @Override
      public @Nullable V get(@Nullable Object var1) {
         return this.RCIROHIOCOCHHCIIOHRICCRCHRORRC.get(var1);
      }

      @Override
      public boolean containsKey(@Nullable Object var1) {
         return this.RCIROHIOCOCHHCIIOHRICCRCHRORRC.containsKey(var1);
      }

      @Override
      public V put(K var1, V var2) {
         return this.RCIROHIOCOCHHCIIOHRICCRCHRORRC.put((K)var1, (V)var2);
      }

      @Override
      public V remove(@Nullable Object var1) {
         return this.RCIROHIOCOCHHCIIOHRICCRCHRORRC.remove(var1);
      }

      @Override
      public void putAll(Map<? extends K, ? extends V> var1) {
         this.RCIROHIOCOCHHCIIOHRICCRCHRORRC.putAll(var1);
      }

      @Override
      public void clear() {
         this.RCIROHIOCOCHHCIIOHRICCRCHRORRC.clear();
      }

      @Override
      public Set<Entry<K, V>> entrySet() {
         return this.RCIROHIOCOCHHCIIOHRICCRCHRORRC.entrySet();
      }

      @Override
      public Entry<K, V> pollFirstEntry() {
         return IRIHOIRCHIRRCRIOORCOICORHHORHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            this.IHHIRIORHRRIOHRCOHROHCOIRCHIII.entrySet(), this.HCOOOHIOROROOIHRHHRHRCIOHCCCRI
         );
      }

      @Override
      public Entry<K, V> pollLastEntry() {
         return IRIHOIRCHIRRCRIOORCOICORHHORHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            this.IHHIRIORHRRIOHRCOHROHCOIRCHIII.descendingMap().entrySet(), this.HCOOOHIOROROOIHRHHRHRCIOHCCCRI
         );
      }

      @Override
      public NavigableMap<K, V> descendingMap() {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            this.IHHIRIORHRRIOHRCOHROHCOIRCHIII.descendingMap(), this.HCOOOHIOROROOIHRHHRHRCIOHCCCRI
         );
      }

      @Override
      public NavigableMap<K, V> subMap(K var1, boolean var2, K var3, boolean var4) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            this.IHHIRIORHRRIOHRCOHROHCOIRCHIII.subMap((K)var1, var2, (K)var3, var4), this.HCOOOHIOROROOIHRHHRHRCIOHCCCRI
         );
      }

      @Override
      public NavigableMap<K, V> headMap(K var1, boolean var2) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            this.IHHIRIORHRRIOHRCOHROHCOIRCHIII.headMap((K)var1, var2), this.HCOOOHIOROROOIHRHHRHRCIOHCCCRI
         );
      }

      @Override
      public NavigableMap<K, V> tailMap(K var1, boolean var2) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            this.IHHIRIORHRRIOHRCOHROHCOIRCHIII.tailMap((K)var1, var2), this.HCOOOHIOROROOIHRHHRHRCIOHCCCRI
         );
      }
   }

   static class HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V> extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR<K, V> implements SortedSet<K> {
      HICRRICCHCCROOHHCHOCOCCHOIHHOC(SortedMap<K, V> var1) {
         super(var1);
      }

      SortedMap<K, V> map() {
         return (SortedMap<K, V>)super.map();
      }

      @Override
      public Comparator<? super K> comparator() {
         return this.map().comparator();
      }

      @Override
      public SortedSet<K> subSet(K var1, K var2) {
         return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC<>(this.map().subMap((K)var1, (K)var2));
      }

      @Override
      public SortedSet<K> headSet(K var1) {
         return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC<>(this.map().headMap((K)var1));
      }

      @Override
      public SortedSet<K> tailSet(K var1) {
         return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC<>(this.map().tailMap((K)var1));
      }

      @Override
      public K first() {
         return this.map().firstKey();
      }

      @Override
      public K last() {
         return this.map().lastKey();
      }
   }

   abstract static class HRCHROOHRIHCRCRHRIIROCIRHOIRHH<K, V> extends ICRHCCCCOIICOCHHCRCOOIHICROIHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<Entry<K, V>> {
      abstract Map<K, V> map();

      @Override
      public int size() {
         return this.map().size();
      }

      @Override
      public void clear() {
         this.map().clear();
      }

      @Override
      public boolean contains(Object var1) {
         if (!(var1 instanceof Entry)) {
            return false;
         }

         Entry var2 = (Entry)var1;
         Object var3 = var2.getKey();
         Object var4 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeGet(this.map(), var3);
         return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
               var4, var2.getValue()
            )
            && (var4 != null || this.map().containsKey(var3));
      }

      @Override
      public boolean isEmpty() {
         return this.map().isEmpty();
      }

      @Override
      public boolean remove(Object var1) {
         if (this.contains(var1)) {
            Entry var2 = (Entry)var1;
            return this.map().keySet().remove(var2.getKey());
         } else {
            return false;
         }
      }

      @Override
      public boolean removeAll(Collection<?> var1) {
         try {
            return super.removeAll(
               com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
                  var1
               )
            );
         } catch (UnsupportedOperationException var3) {
            return ICRHCCCCOIICOCHHCRCOOIHICROIHI.removeAllImpl(this, var1.iterator());
         }
      }

      @Override
      public boolean retainAll(Collection<?> var1) {
         try {
            return super.retainAll(
               com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
                  var1
               )
            );
         } catch (UnsupportedOperationException var7) {
            HashSet var3 = ICRHCCCCOIICOCHHCRCOOIHICROIHI.newHashSetWithExpectedSize(var1.size());

            for (Object var5 : var1) {
               if (this.contains(var5)) {
                  Entry var6 = (Entry)var5;
                  var3.add(var6.getKey());
               }
            }

            return this.map().keySet().retainAll(var3);
         }
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   static class ICICIOCHHHIHOCHCOHORIHRCOHHOCR<K, V> extends IROCHOHCORHCOCCCOCHORCICRORIIC<K, V> implements Serializable, NavigableMap<K, V> {
      private final NavigableMap<K, ? extends V> RRHHHOHOROIOROCHHRRCCOOOCCCCIC;
      private transient ROCHRRCORRCOOOOOCOICOCROIIHIHH.@Nullable ICICIOCHHHIHOCHCOHORIHRCOHHOCR<K, V> HRCHRHHHOOCHCIOOCCHROCCRIHCOOO;

      ICICIOCHHHIHOCHCOHORIHRCOHHOCR(NavigableMap<K, ? extends V> var1) {
         this.RRHHHOHOROIOROCHHRRCCOOOCCCCIC = var1;
      }

      ICICIOCHHHIHOCHCOHORIHRCOHHOCR(NavigableMap<K, ? extends V> var1, ROCHRRCORRCOOOOOCOICOCROIIHIHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<K, V> var2) {
         this.RRHHHOHOROIOROCHHRRCCOOOCCCCIC = var1;
         this.HRCHRHHHOOCHCIOOCCHROCCRIHCOOO = var2;
      }

      @Override
      protected SortedMap<K, V> delegate() {
         return Collections.unmodifiableSortedMap(this.RRHHHOHOROIOROCHHRRCCOOOCCCCIC);
      }

      @Override
      public Entry<K, V> lowerEntry(K var1) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.unmodifiableOrNull(this.RRHHHOHOROIOROCHHRRCCOOOCCCCIC.lowerEntry((K)var1));
      }

      @Override
      public K lowerKey(K var1) {
         return this.RRHHHOHOROIOROCHHRRCCOOOCCCCIC.lowerKey((K)var1);
      }

      @Override
      public Entry<K, V> floorEntry(K var1) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.unmodifiableOrNull(this.RRHHHOHOROIOROCHHRRCCOOOCCCCIC.floorEntry((K)var1));
      }

      @Override
      public K floorKey(K var1) {
         return this.RRHHHOHOROIOROCHHRRCCOOOCCCCIC.floorKey((K)var1);
      }

      @Override
      public Entry<K, V> ceilingEntry(K var1) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.unmodifiableOrNull(this.RRHHHOHOROIOROCHHRRCCOOOCCCCIC.ceilingEntry((K)var1));
      }

      @Override
      public K ceilingKey(K var1) {
         return this.RRHHHOHOROIOROCHHRRCCOOOCCCCIC.ceilingKey((K)var1);
      }

      @Override
      public Entry<K, V> higherEntry(K var1) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.unmodifiableOrNull(this.RRHHHOHOROIOROCHHRRCCOOOCCCCIC.higherEntry((K)var1));
      }

      @Override
      public K higherKey(K var1) {
         return this.RRHHHOHOROIOROCHHRRCCOOOCCCCIC.higherKey((K)var1);
      }

      @Override
      public Entry<K, V> firstEntry() {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.unmodifiableOrNull(this.RRHHHOHOROIOROCHHRRCCOOOCCCCIC.firstEntry());
      }

      @Override
      public Entry<K, V> lastEntry() {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.unmodifiableOrNull(this.RRHHHOHOROIOROCHHRRCCOOOCCCCIC.lastEntry());
      }

      @Override
      public final Entry<K, V> pollFirstEntry() {
         throw new UnsupportedOperationException();
      }

      @Override
      public final Entry<K, V> pollLastEntry() {
         throw new UnsupportedOperationException();
      }

      @Override
      public NavigableMap<K, V> descendingMap() {
         ROCHRRCORRCOOOOOCOICOCROIIHIHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR var1 = this.HRCHRHHHOOCHCIOOCCHROCCRIHCOOO;
         return var1 == null
            ? (
               this.HRCHRHHHOOCHCIOOCCHROCCRIHCOOO = new ROCHRRCORRCOOOOOCOICOCROIIHIHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<>(
                  this.RRHHHOHOROIOROCHHRRCCOOOCCCCIC.descendingMap(), this
               )
            )
            : var1;
      }

      @Override
      public Set<K> keySet() {
         return this.navigableKeySet();
      }

      @Override
      public NavigableSet<K> navigableKeySet() {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.unmodifiableNavigableSet(this.RRHHHOHOROIOROCHHRRCCOOOCCCCIC.navigableKeySet());
      }

      @Override
      public NavigableSet<K> descendingKeySet() {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.unmodifiableNavigableSet(this.RRHHHOHOROIOROCHHRRCCOOOCCCCIC.descendingKeySet());
      }

      @Override
      public SortedMap<K, V> subMap(K var1, K var2) {
         return this.subMap((K)var1, true, (K)var2, false);
      }

      @Override
      public NavigableMap<K, V> subMap(K var1, boolean var2, K var3, boolean var4) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.unmodifiableNavigableMap(this.RRHHHOHOROIOROCHHRRCCOOOCCCCIC.subMap((K)var1, var2, (K)var3, var4));
      }

      @Override
      public SortedMap<K, V> headMap(K var1) {
         return this.headMap((K)var1, false);
      }

      @Override
      public NavigableMap<K, V> headMap(K var1, boolean var2) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.unmodifiableNavigableMap(this.RRHHHOHOROIOROCHHRRCCOOOCCCCIC.headMap((K)var1, var2));
      }

      @Override
      public SortedMap<K, V> tailMap(K var1) {
         return this.tailMap((K)var1, true);
      }

      @Override
      public NavigableMap<K, V> tailMap(K var1, boolean var2) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.unmodifiableNavigableMap(this.RRHHHOHOROIOROCHHRRCCOOOCCCCIC.tailMap((K)var1, var2));
      }
   }

   static class IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V> extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO<K, V> implements Set<Entry<K, V>> {
      IHCRORHRORIICHRHRCHRRIRRHHOCOO(Set<Entry<K, V>> var1) {
         super(var1);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.equalsImpl(this, var1);
      }

      @Override
      public int hashCode() {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.hashCodeImpl(this);
      }
   }

   abstract static class IHHCHHHCRIHOOCOIOOCRIIICIOROIR<K, V> extends AbstractMap<K, V> {
      @Override
      public abstract int size();

      abstract Iterator<Entry<K, V>> entryIterator();

      Spliterator<Entry<K, V>> entrySpliterator() {
         return Spliterators.spliterator(this.entryIterator(), this.size(), 65);
      }

      @Override
      public Set<Entry<K, V>> entrySet() {
         return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<K, V>() {
            @Override
            Map<K, V> map() {
               return IHHCHHHCRIHOOCOIOOCRIIICIOROIR.this;
            }

            @Override
            public Iterator<Entry<K, V>> iterator() {
               return IHHCHHHCRIHOOCOIOOCRIIICIOROIR.this.entryIterator();
            }

            @Override
            public Spliterator<Entry<K, V>> spliterator() {
               return IHHCHHHCRIHOOCOIOOCRIIICIOROIR.this.entrySpliterator();
            }

            @Override
            public void forEach(Consumer<? super Entry<K, V>> var1) {
               IHHCHHHCRIHOOCOIOOCRIIICIOROIR.this.forEachEntry(var1);
            }
         };
      }

      void forEachEntry(Consumer<? super Entry<K, V>> var1) {
         this.entryIterator().forEachRemaining(var1);
      }

      @Override
      public void clear() {
         HRCROCOHHHICRHIHHOOCIIRRRCCIRR.clear(this.entryIterator());
      }
   }

   static class IHIRRIIORRHORHRORIHOROIRCORCOO<K, V1, V2> extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR<K, V2> {
      final Map<K, V1> IOROHIIROOCHHOHCRCIRCHCICRRIRI;
      final ROCHRRCORRCOOOOOCOICOCROIIHIHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<? super K, ? super V1, V2> OICHIORCRRRHHCCCHRRIIIHOIOHRRO;

      IHIRRIIORRHORHRORIHOROIRCORCOO(Map<K, V1> var1, ROCHRRCORRCOOOOOCOICOCROIIHIHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<? super K, ? super V1, V2> var2) {
         this.IOROHIIROOCHHOHCRCIRCHCICRRIRI = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.OICHIORCRRRHHCCCHRRIIIHOIOHRRO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var2
         );
      }

      @Override
      public int size() {
         return this.IOROHIIROOCHHOHCRCIRCHCICRRIRI.size();
      }

      @Override
      public boolean containsKey(Object var1) {
         return this.IOROHIIROOCHHOHCRCIRCHCICRRIRI.containsKey(var1);
      }

      @Override
      public @Nullable V2 get(@Nullable Object var1) {
         return this.getOrDefault(var1, null);
      }

      @Override
      public @Nullable V2 getOrDefault(@Nullable Object var1, @Nullable V2 var2) {
         Object var3 = this.IOROHIIROOCHHOHCRCIRCHCICRRIRI.get(var1);
         return (V2)(var3 == null && !this.IOROHIIROOCHHOHCRCIRCHCICRRIRI.containsKey(var1)
            ? var2
            : this.OICHIORCRRRHHCCCHRRIIIHOIOHRRO.transformEntry((K)var1, (V1)var3));
      }

      @Override
      public V2 remove(Object var1) {
         return this.IOROHIIROOCHHOHCRCIRCHCICRRIRI.containsKey(var1)
            ? this.OICHIORCRRRHHCCCHRRIIIHOIOHRRO.transformEntry((K)var1, this.IOROHIIROOCHHOHCRCIRCHCICRRIRI.remove(var1))
            : null;
      }

      @Override
      public void clear() {
         this.IOROHIIROOCHHOHCRCIRCHCICRRIRI.clear();
      }

      @Override
      public Set<K> keySet() {
         return this.IOROHIIROOCHHOHCRCIRCHCICRRIRI.keySet();
      }

      @Override
      Iterator<Entry<K, V2>> entryIterator() {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.IOROHIIROOCHHOHCRCIRCHCICRRIRI.entrySet().iterator(),
            ROCHRRCORRCOOOOOCOICOCROIIHIHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.OICHIORCRRRHHCCCHRRIIIHOIOHRRO)
         );
      }

      @Override
      Spliterator<Entry<K, V2>> entrySpliterator() {
         return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.map(
            this.IOROHIIROOCHHOHCRCIRCHCICRRIRI.entrySet().spliterator(),
            ROCHRRCORRCOOOOOCOICOCROIIHIHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.OICHIORCRRRHHCCCHRRIIIHOIOHRRO)
         );
      }

      @Override
      public void forEach(BiConsumer<? super K, ? super V2> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.IOROHIIROOCHHOHCRCIRCHCICRRIRI.forEach((var2, var3) -> var1.accept(var2, this.OICHIORCRRRHHCCCHRRIIIHOIOHRRO.transformEntry(var2, var3)));
      }

      @Override
      public Collection<V2> values() {
         return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<>(this);
      }
   }

   private static class IIHRRHORCRCROCHHOHORCHCROCIHRO<K, V>
      extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO<K, V>
      implements SortedMap<K, V> {
      IIHRRHORCRCROCHHOHORCHCROCIHRO(
         SortedMap<K, V> var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> var2
      ) {
         super(var1, var2);
      }

      SortedMap<K, V> sortedMap() {
         return (SortedMap<K, V>)this.OCOCOIICHHIHIRCOICIHCRCOHIHCCH;
      }

      public SortedSet<K> keySet() {
         return (SortedSet<K>)super.keySet();
      }

      SortedSet<K> createKeySet() {
         return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      }

      @Override
      public Comparator<? super K> comparator() {
         return this.sortedMap().comparator();
      }

      @Override
      public K firstKey() {
         return this.keySet().iterator().next();
      }

      @Override
      public K lastKey() {
         SortedMap var1 = this.sortedMap();

         while (true) {
            Object var2 = var1.lastKey();
            if (this.apply(var2, this.OCOCOIICHHIHIRCOICIHCRCOHIHCCH.get(var2))) {
               return (K)var2;
            }

            var1 = this.sortedMap().headMap((K)var2);
         }
      }

      @Override
      public SortedMap<K, V> headMap(K var1) {
         return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<>(this.sortedMap().headMap((K)var1), this.RHCRRHOICOIORHIHCOCRORROOHOIOC);
      }

      @Override
      public SortedMap<K, V> subMap(K var1, K var2) {
         return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<>(
            this.sortedMap().subMap((K)var1, (K)var2), this.RHCRRHOICOIORHIHCOCRORROOHOIOC
         );
      }

      @Override
      public SortedMap<K, V> tailMap(K var1) {
         return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<>(this.sortedMap().tailMap((K)var1), this.RHCRRHOICOIORHIHCOCRORROOHOIOC);
      }

      class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
         extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO<K, V>.IRCIIHHICIHRCOCRROCOICRIHHCCHH
         implements SortedSet<K> {
         @Override
         public Comparator<? super K> comparator() {
            return IIHRRHORCRCROCHHOHORCHCROCIHRO.this.sortedMap().comparator();
         }

         @Override
         public SortedSet<K> subSet(K var1, K var2) {
            return (SortedSet<K>)IIHRRHORCRCROCHHOHORCHCROCIHRO.this.subMap((K)var1, (K)var2).keySet();
         }

         @Override
         public SortedSet<K> headSet(K var1) {
            return (SortedSet<K>)IIHRRHORCRCROCHHOHORCHCROCIHRO.this.headMap((K)var1).keySet();
         }

         @Override
         public SortedSet<K> tailSet(K var1) {
            return (SortedSet<K>)IIHRRHORCRCROCHHOHORCHCROCIHRO.this.tailMap((K)var1).keySet();
         }

         @Override
         public K first() {
            return IIHRRHORCRCROCHHOHORCHCROCIHRO.this.firstKey();
         }

         @Override
         public K last() {
            return IIHRRHORCRCROCHHOHORCHCROCIHRO.this.lastKey();
         }
      }
   }

   static class IIRHCHHOICHRICOOCRORCCIOOIHOIR<K, V> extends ICRHCCCCOIICOCHHCRCOOIHICROIHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<K> {
      @Weak
      final Map<K, V> CICIOIRRHHCHIRROCOCOCCOCROIORH;

      IIRHCHHOICHRICOOCRORCCIOOIHOIR(Map<K, V> var1) {
         this.CICIOIRRHHCHIRROCOCOCCOCROIORH = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
      }

      Map<K, V> map() {
         return this.CICIOIRRHHCHIRROCOCOCCOCROIORH;
      }

      @Override
      public Iterator<K> iterator() {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.keyIterator(this.map().entrySet().iterator());
      }

      @Override
      public void forEach(Consumer<? super K> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.CICIOIRRHHCHIRROCOCOCCOCROIORH.forEach((var1x, var2) -> var1.accept(var1x));
      }

      @Override
      public int size() {
         return this.map().size();
      }

      @Override
      public boolean isEmpty() {
         return this.map().isEmpty();
      }

      @Override
      public boolean contains(Object var1) {
         return this.map().containsKey(var1);
      }

      @Override
      public boolean remove(Object var1) {
         if (this.contains(var1)) {
            this.map().remove(var1);
            return true;
         } else {
            return false;
         }
      }

      @Override
      public void clear() {
         this.map().clear();
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static class IOIICIRIICICIIOORHCIIIIRRIHRHI<K, V1, V2>
      extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.HHRIICOIOORCHCOIICOOIHIRHHICRI<K, V1, V2>
      implements NavigableMap<K, V2> {
      IOIICIRIICICIIOORHCIIIIRRIHRHI(NavigableMap<K, V1> var1, ROCHRRCORRCOOOOOCOICOCROIIHIHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<? super K, ? super V1, V2> var2) {
         super(var1, var2);
      }

      @Override
      public Entry<K, V2> ceilingEntry(K var1) {
         return this.transformEntry(this.fromMap().ceilingEntry((K)var1));
      }

      @Override
      public K ceilingKey(K var1) {
         return this.fromMap().ceilingKey((K)var1);
      }

      @Override
      public NavigableSet<K> descendingKeySet() {
         return this.fromMap().descendingKeySet();
      }

      @Override
      public NavigableMap<K, V2> descendingMap() {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.fromMap().descendingMap(), this.OICHIORCRRRHHCCCHRRIIIHOIOHRRO);
      }

      @Override
      public Entry<K, V2> firstEntry() {
         return this.transformEntry(this.fromMap().firstEntry());
      }

      @Override
      public Entry<K, V2> floorEntry(K var1) {
         return this.transformEntry(this.fromMap().floorEntry((K)var1));
      }

      @Override
      public K floorKey(K var1) {
         return this.fromMap().floorKey((K)var1);
      }

      public NavigableMap<K, V2> headMap(K var1) {
         return this.headMap((K)var1, false);
      }

      @Override
      public NavigableMap<K, V2> headMap(K var1, boolean var2) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.fromMap().headMap((K)var1, var2), this.OICHIORCRRRHHCCCHRRIIIHOIOHRRO);
      }

      @Override
      public Entry<K, V2> higherEntry(K var1) {
         return this.transformEntry(this.fromMap().higherEntry((K)var1));
      }

      @Override
      public K higherKey(K var1) {
         return this.fromMap().higherKey((K)var1);
      }

      @Override
      public Entry<K, V2> lastEntry() {
         return this.transformEntry(this.fromMap().lastEntry());
      }

      @Override
      public Entry<K, V2> lowerEntry(K var1) {
         return this.transformEntry(this.fromMap().lowerEntry((K)var1));
      }

      @Override
      public K lowerKey(K var1) {
         return this.fromMap().lowerKey((K)var1);
      }

      @Override
      public NavigableSet<K> navigableKeySet() {
         return this.fromMap().navigableKeySet();
      }

      @Override
      public Entry<K, V2> pollFirstEntry() {
         return this.transformEntry(this.fromMap().pollFirstEntry());
      }

      @Override
      public Entry<K, V2> pollLastEntry() {
         return this.transformEntry(this.fromMap().pollLastEntry());
      }

      @Override
      public NavigableMap<K, V2> subMap(K var1, boolean var2, K var3, boolean var4) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.fromMap().subMap((K)var1, var2, (K)var3, var4), this.OICHIORCRRRHHCCCHRRIIIHOIOHRRO
         );
      }

      public NavigableMap<K, V2> subMap(K var1, K var2) {
         return this.subMap((K)var1, true, (K)var2, false);
      }

      public NavigableMap<K, V2> tailMap(K var1) {
         return this.tailMap((K)var1, true);
      }

      @Override
      public NavigableMap<K, V2> tailMap(K var1, boolean var2) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.fromMap().tailMap((K)var1, var2), this.OICHIORCRRRHHCCCHRRIIIHOIOHRRO);
      }

      private @Nullable Entry<K, V2> transformEntry(@Nullable Entry<K, V1> var1) {
         return var1 == null ? null : ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.OICHIORCRRRHHCCCHRRIIIHOIOHRRO, var1);
      }

      protected NavigableMap<K, V1> fromMap() {
         return (NavigableMap<K, V1>)super.fromMap();
      }
   }

   private static class IRCIIHHICIHRCOCRROCOICRIHHCCHH<K extends Enum<K>, V> {
      private final BinaryOperator<V> OIIROHOHRIHCCHOCIHHOHOOCOHRICI;
      private EnumMap<K, V> map = null;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(BinaryOperator<V> var1) {
         this.OIIROHOHRIHCCHOCIHHOHOOCOHRICI = var1;
      }

      void put(K var1, V var2) {
         if (this.map == null) {
            this.map = new EnumMap<>(var1.getDeclaringClass());
         }

         this.map.merge((K)var1, (V)var2, this.OIIROHOHRIHCCHOCIHHOHOOCOHRICI);
      }

      ROCHRRCORRCOOOOOCOICOCROIIHIHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         ROCHRRCORRCOOOOOCOICOCROIIHIHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V> var1
      ) {
         if (this.map == null) {
            return var1;
         }

         if (var1.map == null) {
            return this;
         }

         var1.map.forEach(this::put);
         return this;
      }

      OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> CRCHOCCRIRRCRRRCCRCICRIRCORHIR() {
         return this.map == null
            ? OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RIOCOIOOIIRHOROHOCHHOORRCCOIHR()
            : HCHHOOOCRCRHHICHICORHOCHCCCHRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this.map);
      }
   }

   static class IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<V> implements HCIOIIHCHIHRHOHRICRIOCIRHRICOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V> {
      private final @Nullable V IOCOIRRCOOOOCRHHOOIIIRORRHHRII;
      private final @Nullable V RRCRHOCIIIICIHHIOCOHORHIRCOORR;

      static <V> HCIOIIHCHIHRHOHRICRIOCIRHRICOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V> OOCCRCRCOHIIORCCORCRCIRRROIOOR(@Nullable V var0, @Nullable V var1) {
         return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<>((V)var0, (V)var1);
      }

      private IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(@Nullable V var1, @Nullable V var2) {
         this.IOCOIRRCOOOOCRHHOOIIIRORRHHRII = (V)var1;
         this.RRCRHOCIIIICIHHIOCOHORHIRCOORR = (V)var2;
      }

      @Override
      public V leftValue() {
         return this.IOCOIRRCOOOOCRHHOOIIIRORRHHRII;
      }

      @Override
      public V rightValue() {
         return this.RRCRHOCIIIICIHHIOCOHORHIRCOORR;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (!(var1 instanceof HCIOIIHCHIHRHOHRICRIOCIRHRICOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)) {
            return false;
         }

         HCIOIIHCHIHRHOHRICRIOCIRHRICOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (HCIOIIHCHIHRHOHRICRIOCIRHRICOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
         return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
               this.IOCOIRRCOOOOCRHHOOIIIRORRHHRII, var2.leftValue()
            )
            && com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
               this.RRCRHOCIIIICIHHIOCOHORHIRCOORR, var2.rightValue()
            );
      }

      @Override
      public int hashCode() {
         return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.hashCode(
            this.IOCOIRRCOOOOCRHHOOIIIRORRHHRII, this.RRCRHOCIIIICIHHIOCOHORHIRCOORR
         );
      }

      @Override
      public String toString() {
         return "(" + this.IOCOIRRCOOOOCRHHOOIIIRORRHHRII + ", " + this.RRCRHOCIIIICIHHIOCOHORHIRCOORR + ")";
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   static class IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V> extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V> implements NavigableSet<K> {
      IRRCCOICORICIHCHRHIHIHROIRHOCR(NavigableMap<K, V> var1) {
         super(var1);
      }

      NavigableMap<K, V> map() {
         return (NavigableMap<K, V>)this.CICIOIRRHHCHIRROCOCOCCOCROIORH;
      }

      @Override
      public K lower(K var1) {
         return this.map().lowerKey((K)var1);
      }

      @Override
      public K floor(K var1) {
         return this.map().floorKey((K)var1);
      }

      @Override
      public K ceiling(K var1) {
         return this.map().ceilingKey((K)var1);
      }

      @Override
      public K higher(K var1) {
         return this.map().higherKey((K)var1);
      }

      @Override
      public K pollFirst() {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.keyOrNull(this.map().pollFirstEntry());
      }

      @Override
      public K pollLast() {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.keyOrNull(this.map().pollLastEntry());
      }

      @Override
      public NavigableSet<K> descendingSet() {
         return this.map().descendingKeySet();
      }

      @Override
      public Iterator<K> descendingIterator() {
         return this.descendingSet().iterator();
      }

      @Override
      public NavigableSet<K> subSet(K var1, boolean var2, K var3, boolean var4) {
         return this.map().subMap((K)var1, var2, (K)var3, var4).navigableKeySet();
      }

      @Override
      public SortedSet<K> subSet(K var1, K var2) {
         return this.subSet((K)var1, true, (K)var2, false);
      }

      @Override
      public NavigableSet<K> headSet(K var1, boolean var2) {
         return this.map().headMap((K)var1, var2).navigableKeySet();
      }

      @Override
      public SortedSet<K> headSet(K var1) {
         return this.headSet((K)var1, false);
      }

      @Override
      public NavigableSet<K> tailSet(K var1, boolean var2) {
         return this.map().tailMap((K)var1, var2).navigableKeySet();
      }

      @Override
      public SortedSet<K> tailSet(K var1) {
         return this.tailSet((K)var1, true);
      }
   }

   private static class OCOHORHCROHICRRIHCIHHRRCIHICRI<K, V> extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> {
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super K> HRIORICRHROHRCIRRCORICHOIRHIHI;

      OCOHORHCROHICRRIHCIHHRRCIHICRI(
         Map<K, V> var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super K> var2,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> var3
      ) {
         super(var1, var3);
         this.HRIORICRHROHRCIRRCORICHOIRHIHI = var2;
      }

      @Override
      protected Set<Entry<K, V>> createEntrySet() {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.OCOCOIICHHIHIRCOICIHCRCOHIHCCH.entrySet(), this.RHCRRHOICOIORHIHCOCRORROOHOIOC
         );
      }

      @Override
      Set<K> createKeySet() {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.OCOCOIICHHIHIRCOICIHCRCOHIHCCH.keySet(), this.HRIORICRHROHRCIRRCORICHOIRHIHI);
      }

      @Override
      public boolean containsKey(Object var1) {
         return this.OCOCOIICHHIHIRCOICIHCRCOHIHCCH.containsKey(var1) && this.HRIORICRHROHRCIRRCORICHOIRHIHI.apply((K)var1);
      }
   }

   static class OHHRIOHROOIHOROCIRHCHORIHRRRRI<K, V> implements HCIOIIHCHIHRHOHRICRIOCIRHRICOR<K, V> {
      final Map<K, V> HIRIOOOHHIOOIIIHRRIOROHIRIOOCH;
      final Map<K, V> IRHRIORIRCIHIOHORIORHHIRCOHRCR;
      final Map<K, V> OHOHOORHIRCCCHROCOIOCOHCHHCRRH;
      final Map<K, HCIOIIHCHIHRHOHRICRIOCIRHRICOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V>> CRIORICHIRRHHCRIHICIIHHOOCICCI;

      OHHRIOHROOIHOROCIRHCHORIHRRRRI(
         Map<K, V> var1, Map<K, V> var2, Map<K, V> var3, Map<K, HCIOIIHCHIHRHOHRICRIOCIRHRICOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V>> var4
      ) {
         this.HIRIOOOHHIOOIIIHRRIOROHIRIOOCH = ROCHRRCORRCOOOOOCOICOCROIIHIHH.unmodifiableMap(var1);
         this.IRHRIORIRCIHIOHORIORHHIRCOHRCR = ROCHRRCORRCOOOOOCOICOCROIIHIHH.unmodifiableMap(var2);
         this.OHOHOORHIRCCCHROCOIOCOHCHHCRRH = ROCHRRCORRCOOOOOCOICOCROIIHIHH.unmodifiableMap(var3);
         this.CRIORICHIRRHHCRIHICIIHHOOCICCI = ROCHRRCORRCOOOOOCOICOCROIIHIHH.unmodifiableMap(var4);
      }

      @Override
      public boolean areEqual() {
         return this.HIRIOOOHHIOOIIIHRRIOROHIRIOOCH.isEmpty() && this.IRHRIORIRCIHIOHORIORHHIRCOHRCR.isEmpty() && this.CRIORICHIRRHHCRIHICIIHHOOCICCI.isEmpty();
      }

      @Override
      public Map<K, V> entriesOnlyOnLeft() {
         return this.HIRIOOOHHIOOIIIHRRIOROHIRIOOCH;
      }

      @Override
      public Map<K, V> entriesOnlyOnRight() {
         return this.IRHRIORIRCIHIOHORIORHHIRCOHRCR;
      }

      @Override
      public Map<K, V> entriesInCommon() {
         return this.OHOHOORHIRCCCHROCOIOCOHCHHCRRH;
      }

      @Override
      public Map<K, HCIOIIHCHIHRHOHRICRIOCIRHRICOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V>> entriesDiffering() {
         return this.CRIORICHIRRHHCRIHICIIHHOOCICCI;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         }

         if (!(var1 instanceof HCIOIIHCHIHRHOHRICRIOCIRHRICOR)) {
            return false;
         }

         HCIOIIHCHIHRHOHRICRIOCIRHRICOR var2 = (HCIOIIHCHIHRHOHRICRIOCIRHRICOR)var1;
         return this.entriesOnlyOnLeft().equals(var2.entriesOnlyOnLeft())
            && this.entriesOnlyOnRight().equals(var2.entriesOnlyOnRight())
            && this.entriesInCommon().equals(var2.entriesInCommon())
            && this.entriesDiffering().equals(var2.entriesDiffering());
      }

      @Override
      public int hashCode() {
         return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.hashCode(
            this.entriesOnlyOnLeft(), this.entriesOnlyOnRight(), this.entriesInCommon(), this.entriesDiffering()
         );
      }

      @Override
      public String toString() {
         if (this.areEqual()) {
            return "equal";
         }

         StringBuilder var1 = new StringBuilder("not equal");
         if (!this.HIRIOOOHHIOOIIIHRRIOROHIRIOOCH.isEmpty()) {
            var1.append(": only on left=").append(this.HIRIOOOHHIOOIIIHRRIOROHIRIOOCH);
         }

         if (!this.IRHRIORIRCIHIOHORIORHHIRCOHRCR.isEmpty()) {
            var1.append(": only on right=").append(this.IRHRIORIRCIHIOHORIORHHIRCOHRCR);
         }

         if (!this.CRIORICHIRRHHCRIHICIIHHOOCICCI.isEmpty()) {
            var1.append(": value differences=").append(this.CRIORICHIRRHHCRIHICIIHHOOCICCI);
         }

         return var1.toString();
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
   abstract static class OIHCOHRCICCCRHRCROOCIOIRRHHHIH<K, V> extends AbstractMap<K, V> {
      private transient @Nullable Set<Entry<K, V>> entrySet;
      private transient @Nullable Set<K> keySet;
      private transient @Nullable Collection<V> values;

      abstract Set<Entry<K, V>> createEntrySet();

      @Override
      public Set<Entry<K, V>> entrySet() {
         Set var1 = this.entrySet;
         return var1 == null ? (this.entrySet = this.createEntrySet()) : var1;
      }

      @Override
      public Set<K> keySet() {
         Set var1 = this.keySet;
         return var1 == null ? (this.keySet = this.createKeySet()) : var1;
      }

      Set<K> createKeySet() {
         return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR<>(this);
      }

      @Override
      public Collection<V> values() {
         Collection var1 = this.values;
         return var1 == null ? (this.values = this.createValues()) : var1;
      }

      Collection<V> createValues() {
         return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<>(this);
      }
   }

   @FunctionalInterface
   public interface OOROOCCIRCCRHOIOIORIHCHHOOCCOR<K, V1, V2> {
      V2 transformEntry(@Nullable K var1, @Nullable V1 var2);
   }

   private static class ORHIOICIOCRRHOOCOHRORIHICHRCRR<K, V>
      extends HRHIHIRHRCHHRORRRCORHOCIRHRIOR<K, V>
      implements com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<K, V>,
      Serializable {
      final Map<K, V> HIHHIIICCHRHHOCOCRIRRCIIIOROCC;
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<? extends K, ? extends V> HHCOHRCHIRCOHRRHIRROOORIIRRHOO;
      @RetainedWith
      @Nullable IHIRRIIORRHORHRORIHOROIRCORCOO<V, K> RHIHORRCCIRRHOCRCHRHCOIOOIHRRC;
      transient @Nullable Set<V> values;
      private static final long HIHICCHIOCOCHRHOHORHICHCICIHIC = 0L;

      ORHIOICIOCRRHOOCOHRORIHICHRCRR(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<? extends K, ? extends V> var1,
         @Nullable IHIRRIIORRHORHRORIHOROIRCORCOO<V, K> var2
      ) {
         this.HIHHIIICCHRHHOCOCRIRRCIIIOROCC = Collections.unmodifiableMap(var1);
         this.HHCOHRCHIRCOHRRHIRROOORIIRRHOO = var1;
         this.RHIHORRCCIRRHOCRCHRHCOIOOIHRRC = var2;
      }

      @Override
      protected Map<K, V> delegate() {
         return this.HIHHIIICCHRHHOCOCRIRRCIIIOROCC;
      }

      @Override
      public V forcePut(K var1, V var2) {
         throw new UnsupportedOperationException();
      }

      @Override
      public com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO<V, K> HOCCROIICHRHHCOCIICIROCCIHRCOR() {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IHIRRIIORRHORHRORIHOROIRCORCOO var1 = this.RHIHORRCCIRRHOCRCHRHCOIOOIHRRC;
         return var1 == null
            ? (
               this.RHIHORRCCIRRHOCRCHRHCOIOOIHRRC = new ROCHRRCORRCOOOOOCOICOCROIIHIHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR<>(
                  this.HHCOHRCHIRCOHRRHIRROOORIIRRHOO.HOCCROIICHRHHCOCIICIROCCIHRCOR(), this
               )
            )
            : var1;
      }

      @Override
      public Set<V> values() {
         Set var1 = this.values;
         return var1 == null ? (this.values = Collections.unmodifiableSet(this.HHCOHRCHIRCOHRRHIRROOORIIRRHOO.values())) : var1;
      }
   }

   private abstract static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH<K, V> {
      final Map<K, V> OCOCOIICHHIHIRCOICIHCRCOHIHCCH;
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> RHCRRHOICOIORHIHCOCRORROOHOIOC;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         Map<K, V> var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> var2
      ) {
         this.OCOCOIICHHIHIRCOICIHCRCOHIHCCH = var1;
         this.RHCRRHOICOIORHIHCOCRORROOHOIOC = var2;
      }

      boolean apply(@Nullable Object var1, @Nullable V var2) {
         Object var3 = var1;
         return this.RHCRRHOICOIORHIHCOCRORROOHOIOC.apply(ROCHRRCORRCOOOOOCOICOCROIIHIHH.immutableEntry((K)var3, (V)var2));
      }

      @Override
      public V put(K var1, V var2) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            this.apply(var1, (V)var2)
         );
         return this.OCOCOIICHHIHIRCOICIHCRCOHIHCCH.put((K)var1, (V)var2);
      }

      @Override
      public void putAll(Map<? extends K, ? extends V> var1) {
         for (Entry var3 : var1.entrySet()) {
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
               this.apply(var3.getKey(), (V)var3.getValue())
            );
         }

         this.OCOCOIICHHIHIRCOICIHCRCOHIHCCH.putAll(var1);
      }

      @Override
      public boolean containsKey(Object var1) {
         return this.OCOCOIICHHIHIRCOICIHCRCOHIHCCH.containsKey(var1) && this.apply(var1, this.OCOCOIICHHIHIRCOICIHCRCOHIHCCH.get(var1));
      }

      @Override
      public V get(Object var1) {
         Object var2 = this.OCOCOIICHHIHIRCOICIHCRCOHIHCCH.get(var1);
         return (V)(var2 != null && this.apply(var1, (V)var2) ? var2 : null);
      }

      @Override
      public boolean isEmpty() {
         return this.entrySet().isEmpty();
      }

      @Override
      public V remove(Object var1) {
         return this.containsKey(var1) ? this.OCOCOIICHHIHIRCOICIHCRCOHIHCCH.remove(var1) : null;
      }

      @Override
      Collection<V> createValues() {
         return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<>(
            this, this.OCOCOIICHHIHIRCOICIHCRCOHIHCCH, this.RHCRRHOICOIORHIHCOCRORROOHOIOC
         );
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static final class RHOCHHIRRCHHHOHOIRROIROHHHIHIO<K, V>
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO<K, V> {
      private final NavigableSet<K> CHOOCRCROHCIHOCROHHICIHIHIHCOH;
      private final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super K, V> OCIORHRRHOCCCRRHRCRRHIIORHHIOH;

      RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
         NavigableSet<K> var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super K, V> var2
      ) {
         this.CHOOCRCROHCIHOCROHHICIHIHIHCOH = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.OCIORHRRHOCCCRRHRCRRHIIORHHIOH = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var2
         );
      }

      @Override
      public NavigableMap<K, V> subMap(K var1, boolean var2, K var3, boolean var4) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.CHOOCRCROHCIHOCROHHICIHIHIHCOH.subSet((K)var1, var2, (K)var3, var4), this.OCIORHRRHOCCCRRHRCRRHIIORHHIOH
         );
      }

      @Override
      public NavigableMap<K, V> headMap(K var1, boolean var2) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.CHOOCRCROHCIHOCROHHICIHIHIHCOH.headSet((K)var1, var2), this.OCIORHRRHOCCCRRHRCRRHIIORHHIOH
         );
      }

      @Override
      public NavigableMap<K, V> tailMap(K var1, boolean var2) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.CHOOCRCROHCIHOCROHHICIHIHIHCOH.tailSet((K)var1, var2), this.OCIORHRRHOCCCRRHRCRRHIIORHHIOH
         );
      }

      @Override
      public Comparator<? super K> comparator() {
         return this.CHOOCRCROHCIHOCROHHICIHIHIHCOH.comparator();
      }

      @Override
      public @Nullable V get(@Nullable Object var1) {
         return this.getOrDefault(var1, null);
      }

      @Override
      public @Nullable V getOrDefault(@Nullable Object var1, @Nullable V var2) {
         if (com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.safeContains(
            this.CHOOCRCROHCIHOCROHHICIHIHIHCOH, var1
         )) {
            Object var3 = var1;
            return this.OCIORHRRHOCCCRRHRCRRHIIORHHIOH.apply((K)var3);
         } else {
            return (V)var2;
         }
      }

      @Override
      public void clear() {
         this.CHOOCRCROHCIHOCROHHICIHIHIHCOH.clear();
      }

      @Override
      Iterator<Entry<K, V>> entryIterator() {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.CHOOCRCROHCIHOCROHHICIHIHIHCOH, this.OCIORHRRHOCCCRRHRCRRHIIORHHIOH);
      }

      @Override
      Spliterator<Entry<K, V>> entrySpliterator() {
         return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.map(
            this.CHOOCRCROHCIHOCROHHICIHIHIHCOH.spliterator(),
            var1 -> ROCHRRCORRCOOOOOCOICOCROIIHIHH.immutableEntry((K)var1, this.OCIORHRRHOCCCRRHRCRRHIIORHHIOH.apply(var1))
         );
      }

      @Override
      public void forEach(BiConsumer<? super K, ? super V> var1) {
         this.CHOOCRCROHCIHOCROHHICIHIHIHCOH.forEach(var2 -> var1.accept(var2, this.OCIORHRRHOCCCRRHRCRRHIIORHHIOH.apply(var2)));
      }

      @Override
      Iterator<Entry<K, V>> descendingEntryIterator() {
         return this.descendingMap().entrySet().iterator();
      }

      @Override
      public NavigableSet<K> navigableKeySet() {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.removeOnlyNavigableSet(this.CHOOCRCROHCIHOCROHHICIHIHIHCOH);
      }

      @Override
      public int size() {
         return this.CHOOCRCROHCIHOCROHHICIHIHIHCOH.size();
      }

      @Override
      public NavigableMap<K, V> descendingMap() {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.CHOOCRCROHCIHOCROHHICIHIHIHCOH.descendingSet(), this.OCIORHRRHOCCCRRHRCRRHIIORHHIOH
         );
      }
   }

   private static class RICRIRRCOHRCOCRRHHCRHRROOIOHHR<K, V>
      extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<K, V>
      implements SortedMap<K, V> {
      RICRIRRCOHRCOCRRHHCRHRROOIOHHR(
         SortedSet<K> var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<? super K, V> var2
      ) {
         super(var1, var2);
      }

      SortedSet<K> backingSet() {
         return (SortedSet<K>)super.backingSet();
      }

      @Override
      public Comparator<? super K> comparator() {
         return this.backingSet().comparator();
      }

      @Override
      public Set<K> keySet() {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.removeOnlySortedSet(this.backingSet());
      }

      @Override
      public SortedMap<K, V> subMap(K var1, K var2) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.backingSet().subSet((K)var1, (K)var2), this.RCIOCCHRCIIIOHRCOOOOIIIHCOCCHR);
      }

      @Override
      public SortedMap<K, V> headMap(K var1) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.backingSet().headSet((K)var1), this.RCIOCCHRCIIIOHRCOOOOIIIHCOCCHR);
      }

      @Override
      public SortedMap<K, V> tailMap(K var1) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.backingSet().tailSet((K)var1), this.RCIOCCHRCIIIOHRCOOOOIIIHCOCCHR);
      }

      @Override
      public K firstKey() {
         return this.backingSet().first();
      }

      @Override
      public K lastKey() {
         return this.backingSet().last();
      }
   }

   private enum RIOOCHICIHRHOHCCCCCHOCCCOHCRHI
      implements com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<Entry<?, ?>, Object> {
      KEY {
         public @Nullable Object apply(Entry<?, ?> var1) {
            return var1.getKey();
         }
      },
      VALUE {
         public @Nullable Object apply(Entry<?, ?> var1) {
            return var1.getValue();
         }
      };

      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI() {
      }
   }

   static class RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<K, V> extends AbstractCollection<V> {
      @Weak
      final Map<K, V> IICRIIRIIRHHIOIICHIRIHOCRROIRR;

      RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(Map<K, V> var1) {
         this.IICRIIRIIRHHIOIICHIRIHOCRROIRR = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
      }

      final Map<K, V> HCCOOIHCICOCIRRRRRRCHIRIRHIIOR() {
         return this.IICRIIRIIRHHIOIICHIRIHOCRROIRR;
      }

      @Override
      public Iterator<V> iterator() {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.valueIterator(this.HCCOOIHCICOCIRRRRRRCHIRIRHIIOR().entrySet().iterator());
      }

      @Override
      public void forEach(Consumer<? super V> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.IICRIIRIIRHHIOIICHIRIHOCRROIRR.forEach((var1x, var2) -> var1.accept(var2));
      }

      @Override
      public boolean remove(Object var1) {
         try {
            return super.remove(var1);
         } catch (UnsupportedOperationException var5) {
            for (Entry var4 : this.HCCOOIHCICOCIRRRRRRCHIRIRHIIOR().entrySet()) {
               if (com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
                  var1, var4.getValue()
               )) {
                  this.HCCOOIHCICOCIRRRRRRCHIRIRHIIOR().remove(var4.getKey());
                  return true;
               }
            }

            return false;
         }
      }

      @Override
      public boolean removeAll(Collection<?> var1) {
         try {
            return super.removeAll(
               com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
                  var1
               )
            );
         } catch (UnsupportedOperationException var6) {
            HashSet var3 = ICRHCCCCOIICOCHHCRCOOIHICROIHI.newHashSet();

            for (Entry var5 : this.HCCOOIHCICOCIRRRRRRCHIRIRHIIOR().entrySet()) {
               if (var1.contains(var5.getValue())) {
                  var3.add(var5.getKey());
               }
            }

            return this.HCCOOIHCICOCIRRRRRRCHIRIRHIIOR().keySet().removeAll(var3);
         }
      }

      @Override
      public boolean retainAll(Collection<?> var1) {
         try {
            return super.retainAll(
               com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
                  var1
               )
            );
         } catch (UnsupportedOperationException var6) {
            HashSet var3 = ICRHCCCCOIICOCHHCRCOOIHICROIHI.newHashSet();

            for (Entry var5 : this.HCCOOIHCICOCIRRRRRRCHIRIRHIIOR().entrySet()) {
               if (var1.contains(var5.getValue())) {
                  var3.add(var5.getKey());
               }
            }

            return this.HCCOOIHCICOCIRRRRRRCHIRIRHIIOR().keySet().retainAll(var3);
         }
      }

      @Override
      public int size() {
         return this.HCCOOIHCICOCIRRRRRRCHIRIRHIIOR().size();
      }

      @Override
      public boolean isEmpty() {
         return this.HCCOOIHCICOCIRRRRRRCHIRIRHIIOR().isEmpty();
      }

      @Override
      public boolean contains(@Nullable Object var1) {
         return this.HCCOOIHCICOCIRRRRRRCHIRIRHIIOR().containsValue(var1);
      }

      @Override
      public void clear() {
         this.HCCOOIHCICOCIRRRRRRCHIRIRHIIOR().clear();
      }
   }

   static class RIROICHCRROROHCCROOCCCCOCHCCRI<K, V>
      extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI<K, V>
      implements IRRIHROCORIOOCHHCHCHOHCIOHHRRI<K, V> {
      RIROICHCRROROHCCROOCCCCOCHCCRI(
         SortedMap<K, V> var1, SortedMap<K, V> var2, SortedMap<K, V> var3, SortedMap<K, HCIOIIHCHIHRHOHRICRIOCIRHRICOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V>> var4
      ) {
         super(var1, var2, var3, var4);
      }

      @Override
      public SortedMap<K, HCIOIIHCHIHRHOHRICRIOCIRHRICOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V>> entriesDiffering() {
         return (SortedMap<K, HCIOIIHCHIHRHOHRICRIOCIRHRICOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V>>)super.entriesDiffering();
      }

      @Override
      public SortedMap<K, V> entriesInCommon() {
         return (SortedMap<K, V>)super.entriesInCommon();
      }

      @Override
      public SortedMap<K, V> entriesOnlyOnLeft() {
         return (SortedMap<K, V>)super.entriesOnlyOnLeft();
      }

      @Override
      public SortedMap<K, V> entriesOnlyOnRight() {
         return (SortedMap<K, V>)super.entriesOnlyOnRight();
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   abstract static class RRCRRCORICCHOHHIRCHIROOHIIOHCO<K, V> extends HRHIHIRHRCHHRORRRCORHOCIRHRIOR<K, V> implements NavigableMap<K, V> {
      private transient @Nullable Comparator<? super K> comparator;
      private transient @Nullable Set<Entry<K, V>> entrySet;
      private transient @Nullable NavigableSet<K> navigableKeySet;

      abstract NavigableMap<K, V> forward();

      @Override
      protected final Map<K, V> delegate() {
         return this.forward();
      }

      @Override
      public Comparator<? super K> comparator() {
         Comparator var1 = this.comparator;
         if (var1 == null) {
            Comparator var2 = this.forward().comparator();
            if (var2 == null) {
               var2 = IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC();
            }

            var1 = this.comparator = ORHIOICIOCRRHOOCOHRORIHICHRCRR(var2);
         }

         return var1;
      }

      private static <T> IOIHHIORCICCHIIHOIOIOHHRICRHIO<T> ORHIOICIOCRRHOOCOHRORIHICHRCRR(Comparator<T> var0) {
         return IOIHHIORCICCHIIHOIOIOHHRICRHIO.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(var0).HCHORRRCIORCRHCRIIHROIRRRHCCOR();
      }

      @Override
      public K firstKey() {
         return this.forward().lastKey();
      }

      @Override
      public K lastKey() {
         return this.forward().firstKey();
      }

      @Override
      public Entry<K, V> lowerEntry(K var1) {
         return this.forward().higherEntry((K)var1);
      }

      @Override
      public K lowerKey(K var1) {
         return this.forward().higherKey((K)var1);
      }

      @Override
      public Entry<K, V> floorEntry(K var1) {
         return this.forward().ceilingEntry((K)var1);
      }

      @Override
      public K floorKey(K var1) {
         return this.forward().ceilingKey((K)var1);
      }

      @Override
      public Entry<K, V> ceilingEntry(K var1) {
         return this.forward().floorEntry((K)var1);
      }

      @Override
      public K ceilingKey(K var1) {
         return this.forward().floorKey((K)var1);
      }

      @Override
      public Entry<K, V> higherEntry(K var1) {
         return this.forward().lowerEntry((K)var1);
      }

      @Override
      public K higherKey(K var1) {
         return this.forward().lowerKey((K)var1);
      }

      @Override
      public Entry<K, V> firstEntry() {
         return this.forward().lastEntry();
      }

      @Override
      public Entry<K, V> lastEntry() {
         return this.forward().firstEntry();
      }

      @Override
      public Entry<K, V> pollFirstEntry() {
         return this.forward().pollLastEntry();
      }

      @Override
      public Entry<K, V> pollLastEntry() {
         return this.forward().pollFirstEntry();
      }

      @Override
      public NavigableMap<K, V> descendingMap() {
         return this.forward();
      }

      @Override
      public Set<Entry<K, V>> entrySet() {
         Set var1 = this.entrySet;
         return var1 == null ? (this.entrySet = this.createEntrySet()) : var1;
      }

      abstract Iterator<Entry<K, V>> entryIterator();

      Set<Entry<K, V>> createEntrySet() {
         class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<K, V> {
            @Override
            Map<K, V> map() {
               return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this;
            }

            @Override
            public Iterator<Entry<K, V>> iterator() {
               return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.entryIterator();
            }
         }

         return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      }

      @Override
      public Set<K> keySet() {
         return this.navigableKeySet();
      }

      @Override
      public NavigableSet<K> navigableKeySet() {
         NavigableSet var1 = this.navigableKeySet;
         return var1 == null ? (this.navigableKeySet = new ROCHRRCORRCOOOOOCOICOCROIIHIHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<>(this)) : var1;
      }

      @Override
      public NavigableSet<K> descendingKeySet() {
         return this.forward().navigableKeySet();
      }

      @Override
      public NavigableMap<K, V> subMap(K var1, boolean var2, K var3, boolean var4) {
         return this.forward().subMap((K)var3, var4, (K)var1, var2).descendingMap();
      }

      @Override
      public SortedMap<K, V> subMap(K var1, K var2) {
         return this.subMap((K)var1, true, (K)var2, false);
      }

      @Override
      public NavigableMap<K, V> headMap(K var1, boolean var2) {
         return this.forward().tailMap((K)var1, var2).descendingMap();
      }

      @Override
      public SortedMap<K, V> headMap(K var1) {
         return this.headMap((K)var1, false);
      }

      @Override
      public NavigableMap<K, V> tailMap(K var1, boolean var2) {
         return this.forward().headMap((K)var1, var2).descendingMap();
      }

      @Override
      public SortedMap<K, V> tailMap(K var1) {
         return this.tailMap((K)var1, true);
      }

      @Override
      public Collection<V> values() {
         return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<>(this);
      }

      @Override
      public String toString() {
         return this.standardToString();
      }
   }

   static class RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO<K, V> extends OOCHRIIIRIHRRCRIORHCROIIHCRRIC<Entry<K, V>> {
      private final Collection<Entry<K, V>> ROROHOCOCHRCHHHICOORRCIHOCORCR;

      RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(Collection<Entry<K, V>> var1) {
         this.ROROHOCOCHRCHHHICOORRCIHOCORCR = var1;
      }

      @Override
      protected Collection<Entry<K, V>> delegate() {
         return this.ROROHOCOCHRCHHHICOORRCIHOCORCR;
      }

      @Override
      public Iterator<Entry<K, V>> iterator() {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR(this.ROROHOCOCHRCHHHICOORRCIHOCORCR.iterator());
      }

      @Override
      public Object[] toArray() {
         return this.standardToArray();
      }

      @Override
      public <T> T[] toArray(T[] var1) {
         return (T[])this.standardToArray(var1);
      }
   }
}
