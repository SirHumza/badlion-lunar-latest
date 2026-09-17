package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
abstract class OOROOCCIRCCRHOIOIORIHCHHOOCCOR<K, V> implements CRIHRCICOICHCHCHIHRHROCCHCCCII<K, V> {
   private transient @Nullable Collection<Entry<K, V>> entries;
   private transient @Nullable Set<K> keySet;
   private transient @Nullable CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<K> HHOHIRORRCCCHCIOHCCRRICHOOOIOO;
   private transient @Nullable Collection<V> values;
   private transient @Nullable Map<K, Collection<V>> asMap;

   @Override
   public boolean isEmpty() {
      return this.size() == 0;
   }

   @Override
   public boolean containsValue(@Nullable Object var1) {
      for (Collection var3 : this.asMap().values()) {
         if (var3.contains(var1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean containsEntry(@Nullable Object var1, @Nullable Object var2) {
      Collection var3 = this.asMap().get(var1);
      return var3 != null && var3.contains(var2);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean remove(@Nullable Object var1, @Nullable Object var2) {
      Collection var3 = this.asMap().get(var1);
      return var3 != null && var3.remove(var2);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean put(@Nullable K var1, @Nullable V var2) {
      return this.get((K)var1).add((V)var2);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean putAll(@Nullable K var1, Iterable<? extends V> var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      if (var2 instanceof Collection) {
         Collection var4 = (Collection)var2;
         return !var4.isEmpty() && this.get((K)var1).addAll(var4);
      } else {
         Iterator var3 = var2.iterator();
         return var3.hasNext() && HRCROCOHHHICRHIHHOOCIIRRRCCIRR.addAll(this.get((K)var1), var3);
      }
   }

   @CanIgnoreReturnValue
   @Override
   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRIHRCICOICHCHCHIHRHROCCHCCCII<? extends K, ? extends V> var1) {
      boolean var2 = false;

      for (Entry var4 : var1.entries()) {
         var2 |= this.put((K)var4.getKey(), (V)var4.getValue());
      }

      return var2;
   }

   @CanIgnoreReturnValue
   @Override
   public Collection<V> replaceValues(@Nullable K var1, Iterable<? extends V> var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      Collection var3 = this.removeAll(var1);
      this.putAll((K)var1, var2);
      return var3;
   }

   @Override
   public Collection<Entry<K, V>> entries() {
      Collection var1 = this.entries;
      return var1 == null ? (this.entries = this.createEntries()) : var1;
   }

   abstract Collection<Entry<K, V>> createEntries();

   abstract Iterator<Entry<K, V>> entryIterator();

   Spliterator<Entry<K, V>> entrySpliterator() {
      return Spliterators.spliterator(this.entryIterator(), this.size(), this instanceof RCRCCORIIOICRIIRHCCIIOCICRHIOC ? 1 : 0);
   }

   @Override
   public Set<K> keySet() {
      Set var1 = this.keySet;
      return var1 == null ? (this.keySet = this.createKeySet()) : var1;
   }

   abstract Set<K> createKeySet();

   @Override
   public CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<K> IOOOCHROIROHCCROIOICROCIIOOIOO() {
      CRIIOOIHIOHHRRRHIOROOCHCHHCCCI var1 = this.HHOHIRORRCCCHCIOHCCRRICHOOOIOO;
      return var1 == null ? (this.HHOHIRORRCCCHCIOHCCRRICHOOOIOO = this.OHOHIROHHCIRICHIHRORHOHRIIHHRO()) : var1;
   }

   abstract CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<K> OHOHIROHHCIRICHIHRORHOHRIIHHRO();

   @Override
   public Collection<V> values() {
      Collection var1 = this.values;
      return var1 == null ? (this.values = this.createValues()) : var1;
   }

   abstract Collection<V> createValues();

   Iterator<V> valueIterator() {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.valueIterator(this.entries().iterator());
   }

   Spliterator<V> valueSpliterator() {
      return Spliterators.spliterator(this.valueIterator(), this.size(), 0);
   }

   @Override
   public Map<K, Collection<V>> asMap() {
      Map var1 = this.asMap;
      return var1 == null ? (this.asMap = this.createAsMap()) : var1;
   }

   abstract Map<K, Collection<V>> createAsMap();

   @Override
   public boolean equals(@Nullable Object var1) {
      return HORCRRHOCRRICHROCIOOIORIOHCIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1);
   }

   @Override
   public int hashCode() {
      return this.asMap().hashCode();
   }

   @Override
   public String toString() {
      return this.asMap().toString();
   }

   class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends AbstractCollection<V> {
      @Override
      public Iterator<V> iterator() {
         return OOROOCCIRCCRHOIOIORIHCHHOOCCOR.this.valueIterator();
      }

      @Override
      public Spliterator<V> spliterator() {
         return OOROOCCIRCCRHOIOIORIHCHHOOCCOR.this.valueSpliterator();
      }

      @Override
      public int size() {
         return OOROOCCIRCCRHOIOIORIHCHHOOCCOR.this.size();
      }

      @Override
      public boolean contains(@Nullable Object var1) {
         return OOROOCCIRCCRHOIOIORIHCHHOOCCOR.this.containsValue(var1);
      }

      @Override
      public void clear() {
         OOROOCCIRCCRHOIOIORIHCHHOOCCOR.this.clear();
      }
   }

   class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends OOROOCCIRCCRHOIOIORIHCHHOOCCOR<K, V>.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Set<Entry<K, V>> {
      @Override
      public int hashCode() {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.hashCodeImpl(this);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.equalsImpl(this, var1);
      }
   }

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends HORCRRHOCRRICHROCIOOIORIOHCIHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> {
      @Override
      CRIHRCICOICHCHCHIHRHROCCHCCCII<K, V> RIIHHOHHCORHRHOHRIIOIIIRHCIOOC() {
         return OOROOCCIRCCRHOIOIORIHCHHOOCCOR.this;
      }

      @Override
      public Iterator<Entry<K, V>> iterator() {
         return OOROOCCIRCCRHOIOIORIHCHHOOCCOR.this.entryIterator();
      }

      @Override
      public Spliterator<Entry<K, V>> spliterator() {
         return OOROOCCIRCCRHOIOIORIHCHHOOCCOR.this.entrySpliterator();
      }
   }
}
