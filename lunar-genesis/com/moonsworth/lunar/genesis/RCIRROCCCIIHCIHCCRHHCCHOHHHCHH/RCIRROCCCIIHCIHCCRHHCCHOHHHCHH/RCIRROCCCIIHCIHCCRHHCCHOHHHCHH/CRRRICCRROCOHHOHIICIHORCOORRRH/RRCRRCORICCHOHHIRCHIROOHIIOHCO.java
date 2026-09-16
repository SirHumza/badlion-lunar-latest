package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
abstract class RRCRRCORICCHOHHIRCHIROOHIIOHCO<K, V>
   extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<K, V>
   implements Serializable {
   private transient Map<K, Collection<V>> map;
   private transient int totalSize;
   private static final long OIIIOROOIRRCCRIROIRIRIHHRCHHII = 2447537837011683357L;

   protected RRCRRCORICCHOHHIRCHIROOHIIOHCO(Map<K, Collection<V>> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1.isEmpty()
      );
      this.map = var1;
   }

   final void OHIIIOHIRIRCCRRIOIICCHHIORRHOH(Map<K, Collection<V>> var1) {
      this.map = var1;
      this.totalSize = 0;

      for (Collection var3 : var1.values()) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            !var3.isEmpty()
         );
         this.totalSize = this.totalSize + var3.size();
      }
   }

   Collection<V> createUnmodifiableEmptyCollection() {
      return this.unmodifiableCollectionSubclass(this.createCollection());
   }

   abstract Collection<V> createCollection();

   Collection<V> createCollection(@Nullable K var1) {
      return this.createCollection();
   }

   Map<K, Collection<V>> backingMap() {
      return this.map;
   }

   @Override
   public int size() {
      return this.totalSize;
   }

   @Override
   public boolean containsKey(@Nullable Object var1) {
      return this.map.containsKey(var1);
   }

   @Override
   public boolean put(@Nullable K var1, @Nullable V var2) {
      Collection var3 = this.map.get(var1);
      if (var3 == null) {
         var3 = this.createCollection((K)var1);
         if (var3.add(var2)) {
            this.totalSize++;
            this.map.put((K)var1, var3);
            return true;
         } else {
            throw new AssertionError("New Collection violated the Collection spec");
         }
      } else if (var3.add(var2)) {
         this.totalSize++;
         return true;
      } else {
         return false;
      }
   }

   private Collection<V> getOrCreateCollection(@Nullable K var1) {
      Collection var2 = this.map.get(var1);
      if (var2 == null) {
         var2 = this.createCollection((K)var1);
         this.map.put((K)var1, var2);
      }

      return var2;
   }

   @Override
   public Collection<V> replaceValues(@Nullable K var1, Iterable<? extends V> var2) {
      Iterator var3 = var2.iterator();
      if (!var3.hasNext()) {
         return this.removeAll(var1);
      }

      Collection var4 = this.getOrCreateCollection((K)var1);
      Collection var5 = this.createCollection();
      var5.addAll(var4);
      this.totalSize = this.totalSize - var4.size();
      var4.clear();

      while (var3.hasNext()) {
         if (var4.add(var3.next())) {
            this.totalSize++;
         }
      }

      return this.unmodifiableCollectionSubclass(var5);
   }

   @Override
   public Collection<V> removeAll(@Nullable Object var1) {
      Collection var2 = this.map.remove(var1);
      if (var2 == null) {
         return this.createUnmodifiableEmptyCollection();
      }

      Collection var3 = this.createCollection();
      var3.addAll(var2);
      this.totalSize = this.totalSize - var2.size();
      var2.clear();
      return this.unmodifiableCollectionSubclass(var3);
   }

   <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> var1) {
      return Collections.unmodifiableCollection(var1);
   }

   @Override
   public void clear() {
      for (Collection var2 : this.map.values()) {
         var2.clear();
      }

      this.map.clear();
      this.totalSize = 0;
   }

   @Override
   public Collection<V> get(@Nullable K var1) {
      Collection var2 = this.map.get(var1);
      if (var2 == null) {
         var2 = this.createCollection((K)var1);
      }

      return this.wrapCollection((K)var1, var2);
   }

   Collection<V> wrapCollection(@Nullable K var1, Collection<V> var2) {
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR(
         var1, var2, null
      );
   }

   final List<V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable K var1, List<V> var2, RRCRRCORICCHOHHIRCHIROOHIIOHCO.@Nullable CORCOCICIRIOHROHROIIOOHICCHCRR var3) {
      return var2 instanceof RandomAccess
         ? new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            var1, var2, var3
         )
         : new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO(
            var1, var2, var3
         );
   }

   private static <E> Iterator<E> iteratorOrListIterator(Collection<E> var0) {
      return var0 instanceof List ? ((List)var0).listIterator() : var0.iterator();
   }

   @Override
   Set<K> createKeySet() {
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         this.map
      );
   }

   final Set<K> IICOOOOCROHRHRIOICOOCOCHIIOIOI() {
      if (this.map instanceof NavigableMap) {
         return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
            (NavigableMap<K, Collection<V>>)this.map
         );
      } else {
         return this.map instanceof SortedMap
            ? new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
               (SortedMap<K, Collection<V>>)this.map
            )
            : new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               this.map
            );
      }
   }

   private void removeValuesForKey(Object var1) {
      Collection var2 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeRemove(this.map, var1);
      if (var2 != null) {
         int var3 = var2.size();
         var2.clear();
         this.totalSize -= var3;
      }
   }

   @Override
   public Collection<V> values() {
      return super.values();
   }

   @Override
   Collection<V> createValues() {
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         
      );
   }

   @Override
   Iterator<V> valueIterator() {
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO<K, V>.IRCIIHHICIHRCOCRROCOICRIHHCCHH<V>(
         
      ) {
         @Override
         V output(K var1, V var2) {
            return (V)var2;
         }
      };
   }

   @Override
   Spliterator<V> valueSpliterator() {
      return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.flatMap(this.map.values().spliterator(), Collection::spliterator, 64, this.size());
   }

   @Override
   CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<K> OHOHIROHHCIRICHIHRORHOHRIIHHRO() {
      return new HORCRRHOCRRICHROCIOOIORIOHCIHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<>(this);
   }

   @Override
   public Collection<Entry<K, V>> entries() {
      return super.entries();
   }

   @Override
   Collection<Entry<K, V>> createEntries() {
      return this instanceof RCRCCORIIOICRIIRHCCIIOCICRHIOC
         ? new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            
         )
         : new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            
         );
   }

   @Override
   Iterator<Entry<K, V>> entryIterator() {
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO<K, V>.IRCIIHHICIHRCOCRROCOICRIHHCCHH<Entry<K, V>>(
         
      ) {
         Entry<K, V> output(K var1, V var2) {
            return ROCHRRCORRCOOOOOCOICOCROIIHIHH.immutableEntry((K)var1, (V)var2);
         }
      };
   }

   @Override
   Spliterator<Entry<K, V>> entrySpliterator() {
      return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.flatMap(this.map.entrySet().spliterator(), var0 -> {
         Object var1 = var0.getKey();
         Collection var2 = var0.getValue();
         return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.map(var2.spliterator(), var1x -> ROCHRRCORRCOOOOOCOICOCROIIHIHH.immutableEntry((K)var1, (V)var1x));
      }, 64, this.size());
   }

   @Override
   public void forEach(BiConsumer<? super K, ? super V> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      this.map.forEach((var1x, var2) -> var2.forEach(var2x -> var1.accept(var1x, var2x)));
   }

   @Override
   Map<K, Collection<V>> createAsMap() {
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.map
      );
   }

   final Map<K, Collection<V>> RRCHHCHRCRHOHRCHIIOCOIOORCCICC() {
      if (this.map instanceof NavigableMap) {
         return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH(
            (NavigableMap<K, Collection<V>>)this.map
         );
      } else {
         return this.map instanceof SortedMap
            ? new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
               (SortedMap<K, Collection<V>>)this.map
            )
            : new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this.map
            );
      }
   }

   class CORCOCICIRIOHROHROIIOOHICCHCRR extends AbstractCollection<V> {
      final @Nullable Object RHHCCHHOHOIRCHCIHOOHOOIRCHRICI;
      Collection<V> delegate;
      final RRCRRCORICCHOHHIRCHIROOHIIOHCO.@Nullable CORCOCICIRIOHROHROIIOOHICCHCRR OOHRRRRIIOHOICCROIHORIHHOIIRIC;
      final @Nullable Collection<V> IIOICOOHOOIHRRCOHHHOOCRCORHCOO;

      CORCOCICIRIOHROHROIIOOHICCHCRR(@Nullable K var2, Collection<V> var3, RRCRRCORICCHOHHIRCHIROOHIIOHCO.@Nullable CORCOCICIRIOHROHROIIOOHICCHCRR var4) {
         this.RHHCCHHOHOIRCHCIHOOHOOIRCHRICI = var2;
         this.delegate = var3;
         this.OOHRRRRIIOHOICCROIHORIHHOIIRIC = var4;
         this.IIOICOOHOOIHRRCOHHHOOCRCORHCOO = var4 == null ? null : var4.getDelegate();
      }

      void refreshIfEmpty() {
         if (this.OOHRRRRIIOHOICCROIHORIHHOIIRIC != null) {
            this.OOHRRRRIIOHOICCROIHORIHHOIIRIC.refreshIfEmpty();
            if (this.OOHRRRRIIOHOICCROIHORIHHOIIRIC.getDelegate() != this.IIOICOOHOOIHRRCOHHHOOCRCORHCOO) {
               throw new ConcurrentModificationException();
            }
         } else if (this.delegate.isEmpty()) {
            Collection var1 = RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.map.get(this.RHHCCHHOHOIRCHCIHOOHOOIRCHRICI);
            if (var1 != null) {
               this.delegate = var1;
            }
         }
      }

      void removeIfEmpty() {
         if (this.OOHRRRRIIOHOICCROIHORIHHOIIRIC != null) {
            this.OOHRRRRIIOHOICCROIHORIHHOIIRIC.removeIfEmpty();
         } else if (this.delegate.isEmpty()) {
            RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.map.remove(this.RHHCCHHOHOIRCHCIHOOHOOIRCHRICI);
         }
      }

      K getKey() {
         return (K)this.RHHCCHHOHOIRCHCIHOOHOOIRCHRICI;
      }

      void addToMap() {
         if (this.OOHRRRRIIOHOICCROIHORIHHOIIRIC != null) {
            this.OOHRRRRIIOHOICCROIHORIHHOIIRIC.addToMap();
         } else {
            RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.map.put((K)this.RHHCCHHOHOIRCHCIHOOHOOIRCHRICI, this.delegate);
         }
      }

      @Override
      public int size() {
         this.refreshIfEmpty();
         return this.delegate.size();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 == this) {
            return true;
         }

         this.refreshIfEmpty();
         return this.delegate.equals(var1);
      }

      @Override
      public int hashCode() {
         this.refreshIfEmpty();
         return this.delegate.hashCode();
      }

      @Override
      public String toString() {
         this.refreshIfEmpty();
         return this.delegate.toString();
      }

      Collection<V> getDelegate() {
         return this.delegate;
      }

      @Override
      public Iterator<V> iterator() {
         this.refreshIfEmpty();
         return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            
         );
      }

      @Override
      public Spliterator<V> spliterator() {
         this.refreshIfEmpty();
         return this.delegate.spliterator();
      }

      @Override
      public boolean add(V var1) {
         this.refreshIfEmpty();
         boolean var2 = this.delegate.isEmpty();
         boolean var3 = this.delegate.add((V)var1);
         if (var3) {
            RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize++;
            if (var2) {
               this.addToMap();
            }
         }

         return var3;
      }

      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO<K, V>.CORCOCICIRIOHROHROIIOOHICCHCRR CCRCRCIOOORHOCCORIHCRRCIOORHIO() {
         return this.OOHRRRRIIOHOICCROIHORIHHOIIRIC;
      }

      @Override
      public boolean addAll(Collection<? extends V> var1) {
         if (var1.isEmpty()) {
            return false;
         }

         int var2 = this.size();
         boolean var3 = this.delegate.addAll(var1);
         if (var3) {
            int var4 = this.delegate.size();
            RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize = RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize + (var4 - var2);
            if (var2 == 0) {
               this.addToMap();
            }
         }

         return var3;
      }

      @Override
      public boolean contains(Object var1) {
         this.refreshIfEmpty();
         return this.delegate.contains(var1);
      }

      @Override
      public boolean containsAll(Collection<?> var1) {
         this.refreshIfEmpty();
         return this.delegate.containsAll(var1);
      }

      @Override
      public void clear() {
         int var1 = this.size();
         if (var1 != 0) {
            this.delegate.clear();
            RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize = RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize - var1;
            this.removeIfEmpty();
         }
      }

      @Override
      public boolean remove(Object var1) {
         this.refreshIfEmpty();
         boolean var2 = this.delegate.remove(var1);
         if (var2) {
            RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize--;
            this.removeIfEmpty();
         }

         return var2;
      }

      @Override
      public boolean removeAll(Collection<?> var1) {
         if (var1.isEmpty()) {
            return false;
         }

         int var2 = this.size();
         boolean var3 = this.delegate.removeAll(var1);
         if (var3) {
            int var4 = this.delegate.size();
            RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize = RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize + (var4 - var2);
            this.removeIfEmpty();
         }

         return var3;
      }

      @Override
      public boolean retainAll(Collection<?> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         int var2 = this.size();
         boolean var3 = this.delegate.retainAll(var1);
         if (var3) {
            int var4 = this.delegate.size();
            RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize = RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize + (var4 - var2);
            this.removeIfEmpty();
         }

         return var3;
      }

      class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Iterator<V> {
         final Iterator<V> CCCOROOOHIHIICHRCOICROIHCIIICC;
         final Collection<V> ROIRCIIHRHHHIICOHRIHOROCIIIRIH;

         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
            this.ROIRCIIHRHHHIICOHRIHOROCIIIRIH = CORCOCICIRIOHROHROIIOOHICCHCRR.this.delegate;
            this.CCCOROOOHIHIICHRCOICROIHCIIICC = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.iteratorOrListIterator(
               CORCOCICIRIOHROHROIIOOHICCHCRR.this.delegate
            );
         }

         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Iterator<V> var2) {
            this.ROIRCIIHRHHHIICOHRIHOROCIIIRIH = CORCOCICIRIOHROHROIIOOHICCHCRR.this.delegate;
            this.CCCOROOOHIHIICHRCOICROIHCIIICC = var2;
         }

         void validateIterator() {
            CORCOCICIRIOHROHROIIOOHICCHCRR.this.refreshIfEmpty();
            if (CORCOCICIRIOHROHROIIOOHICCHCRR.this.delegate != this.ROIRCIIHRHHHIICOHRIHOROCIIIRIH) {
               throw new ConcurrentModificationException();
            }
         }

         @Override
         public boolean hasNext() {
            this.validateIterator();
            return this.CCCOROOOHIHIICHRCOICROIHCIIICC.hasNext();
         }

         @Override
         public V next() {
            this.validateIterator();
            return this.CCCOROOOHIHIICHRCOICROIHCIIICC.next();
         }

         @Override
         public void remove() {
            this.CCCOROOOHIHIICHRCOICROIHCIIICC.remove();
            RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize--;
            CORCOCICIRIOHROHROIIOOHICCHCRR.this.removeIfEmpty();
         }

         Iterator<V> getDelegateIterator() {
            this.validateIterator();
            return this.CCCOROOOHIHIICHRCOICROIHCIIICC;
         }
      }
   }

   class CRICCOOHHHCHOORCICOCOHIHOIRHOO
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO<K, V>.CORCOCICIRIOHROHROIIOOHICCHCRR
      implements List<V> {
      CRICCOOHHHCHOORCICOCOHIHOIRHOO(@Nullable K var2, List<V> var3, RRCRRCORICCHOHHIRCHIROOHIIOHCO.@Nullable CORCOCICIRIOHROHROIIOOHICCHCRR var4) {
         super(var2, var3, var4);
      }

      List<V> getListDelegate() {
         return (List<V>)this.getDelegate();
      }

      @Override
      public boolean addAll(int var1, Collection<? extends V> var2) {
         if (var2.isEmpty()) {
            return false;
         }

         int var3 = this.size();
         boolean var4 = this.getListDelegate().addAll(var1, var2);
         if (var4) {
            int var5 = this.getDelegate().size();
            RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize = RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize + (var5 - var3);
            if (var3 == 0) {
               this.addToMap();
            }
         }

         return var4;
      }

      @Override
      public V get(int var1) {
         this.refreshIfEmpty();
         return (V)this.getListDelegate().get(var1);
      }

      @Override
      public V set(int var1, V var2) {
         this.refreshIfEmpty();
         return (V)this.getListDelegate().set(var1, var2);
      }

      @Override
      public void add(int var1, V var2) {
         this.refreshIfEmpty();
         boolean var3 = this.getDelegate().isEmpty();
         this.getListDelegate().add(var1, var2);
         RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize++;
         if (var3) {
            this.addToMap();
         }
      }

      @Override
      public V remove(int var1) {
         this.refreshIfEmpty();
         Object var2 = this.getListDelegate().remove(var1);
         RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize--;
         this.removeIfEmpty();
         return (V)var2;
      }

      @Override
      public int indexOf(Object var1) {
         this.refreshIfEmpty();
         return this.getListDelegate().indexOf(var1);
      }

      @Override
      public int lastIndexOf(Object var1) {
         this.refreshIfEmpty();
         return this.getListDelegate().lastIndexOf(var1);
      }

      @Override
      public ListIterator<V> listIterator() {
         this.refreshIfEmpty();
         return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            
         );
      }

      @Override
      public ListIterator<V> listIterator(int var1) {
         this.refreshIfEmpty();
         return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1
         );
      }

      @Override
      public List<V> subList(int var1, int var2) {
         this.refreshIfEmpty();
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            (K)this.getKey(),
            this.getListDelegate().subList(var1, var2),
            this.CCRCRCIOOORHOCCORIHCRRCIOORHIO() == null ? this : this.CCRCRCIOOORHOCCORIHCRRCIOORHIO()
         );
      }

      private class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
         extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO<K, V>.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
         implements ListIterator<V> {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         }

         public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var2) {
            super(CRICCOOHHHCHOORCICOCOHIHOIRHOO.this.getListDelegate().listIterator(var2));
         }

         private ListIterator<V> getDelegateListIterator() {
            return (ListIterator<V>)this.getDelegateIterator();
         }

         @Override
         public boolean hasPrevious() {
            return this.getDelegateListIterator().hasPrevious();
         }

         @Override
         public V previous() {
            return (V)this.getDelegateListIterator().previous();
         }

         @Override
         public int nextIndex() {
            return this.getDelegateListIterator().nextIndex();
         }

         @Override
         public int previousIndex() {
            return this.getDelegateListIterator().previousIndex();
         }

         @Override
         public void set(V var1) {
            this.getDelegateListIterator().set(var1);
         }

         @Override
         public void add(V var1) {
            boolean var2 = CRICCOOHHHCHOORCICOCOHIHOIRHOO.this.isEmpty();
            this.getDelegateListIterator().add(var1);
            RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize++;
            if (var2) {
               CRICCOOHHHCHOORCICOCOHIHOIRHOO.this.addToMap();
            }
         }
      }
   }

   class CRRRICCRROCOHHOHIICIHORCOORRRH
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO<K, V>.HRCHROOHRIHCRCRHRIIROCIRHOIRHH
      implements NavigableMap<K, Collection<V>> {
      CRRRICCRROCOHHOHIICIHORCOORRRH(NavigableMap<K, Collection<V>> var2) {
         super(var2);
      }

      NavigableMap<K, Collection<V>> sortedMap() {
         return (NavigableMap<K, Collection<V>>)super.sortedMap();
      }

      @Override
      public Entry<K, Collection<V>> lowerEntry(K var1) {
         Entry var2 = this.sortedMap().lowerEntry(var1);
         return var2 == null ? null : this.wrapEntry(var2);
      }

      @Override
      public K lowerKey(K var1) {
         return (K)this.sortedMap().lowerKey(var1);
      }

      @Override
      public Entry<K, Collection<V>> floorEntry(K var1) {
         Entry var2 = this.sortedMap().floorEntry(var1);
         return var2 == null ? null : this.wrapEntry(var2);
      }

      @Override
      public K floorKey(K var1) {
         return (K)this.sortedMap().floorKey(var1);
      }

      @Override
      public Entry<K, Collection<V>> ceilingEntry(K var1) {
         Entry var2 = this.sortedMap().ceilingEntry(var1);
         return var2 == null ? null : this.wrapEntry(var2);
      }

      @Override
      public K ceilingKey(K var1) {
         return (K)this.sortedMap().ceilingKey(var1);
      }

      @Override
      public Entry<K, Collection<V>> higherEntry(K var1) {
         Entry var2 = this.sortedMap().higherEntry(var1);
         return var2 == null ? null : this.wrapEntry(var2);
      }

      @Override
      public K higherKey(K var1) {
         return (K)this.sortedMap().higherKey(var1);
      }

      @Override
      public Entry<K, Collection<V>> firstEntry() {
         Entry var1 = this.sortedMap().firstEntry();
         return var1 == null ? null : this.wrapEntry(var1);
      }

      @Override
      public Entry<K, Collection<V>> lastEntry() {
         Entry var1 = this.sortedMap().lastEntry();
         return var1 == null ? null : this.wrapEntry(var1);
      }

      @Override
      public Entry<K, Collection<V>> pollFirstEntry() {
         return this.pollAsMapEntry(this.entrySet().iterator());
      }

      @Override
      public Entry<K, Collection<V>> pollLastEntry() {
         return this.pollAsMapEntry(this.descendingMap().entrySet().iterator());
      }

      Entry<K, Collection<V>> pollAsMapEntry(Iterator<Entry<K, Collection<V>>> var1) {
         if (!var1.hasNext()) {
            return null;
         }

         Entry var2 = (Entry)var1.next();
         Collection var3 = RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.createCollection();
         var3.addAll((Collection)var2.getValue());
         var1.remove();
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.immutableEntry((K)var2.getKey(), RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.unmodifiableCollectionSubclass(var3));
      }

      @Override
      public NavigableMap<K, Collection<V>> descendingMap() {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.new CRRRICCRROCOHHOHIICIHORCOORRRH(this.sortedMap().descendingMap());
      }

      public NavigableSet<K> keySet() {
         return (NavigableSet<K>)super.keySet();
      }

      NavigableSet<K> createKeySet() {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.new RRCRRCORICCHOHHIRCHIROOHIIOHCO(this.sortedMap());
      }

      @Override
      public NavigableSet<K> navigableKeySet() {
         return this.keySet();
      }

      @Override
      public NavigableSet<K> descendingKeySet() {
         return this.descendingMap().navigableKeySet();
      }

      public NavigableMap<K, Collection<V>> subMap(K var1, K var2) {
         return (NavigableMap<K, Collection<V>>)this.subMap((boolean)var1, true, (boolean)var2, false);
      }

      @Override
      public NavigableMap<K, Collection<V>> subMap(K var1, boolean var2, K var3, boolean var4) {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.new CRRRICCRROCOHHOHIICIHORCOORRRH(this.sortedMap().subMap(var1, var2, var3, var4));
      }

      public NavigableMap<K, Collection<V>> headMap(K var1) {
         return (NavigableMap<K, Collection<V>>)this.headMap((boolean)var1, false);
      }

      @Override
      public NavigableMap<K, Collection<V>> headMap(K var1, boolean var2) {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.new CRRRICCRROCOHHOHIICIHORCOORRRH(this.sortedMap().headMap(var1, var2));
      }

      public NavigableMap<K, Collection<V>> tailMap(K var1) {
         return (NavigableMap<K, Collection<V>>)this.tailMap((boolean)var1, true);
      }

      @Override
      public NavigableMap<K, Collection<V>> tailMap(K var1, boolean var2) {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.new CRRRICCRROCOHHOHIICIHORCOORRRH(this.sortedMap().tailMap(var1, var2));
      }
   }

   private class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR<K, Collection<V>> {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH(Map<K, Collection<V>> var2) {
         super(var2);
      }

      @Override
      public Iterator<K> iterator() {
         final Iterator var1 = this.map().entrySet().iterator();
         return new Iterator<K>() {
            @Nullable Entry<K, Collection<V>> entry;

            @Override
            public boolean hasNext() {
               return var1.hasNext();
            }

            @Override
            public K next() {
               this.entry = (Entry<K, Collection<V>>)var1.next();
               return this.entry.getKey();
            }

            @Override
            public void remove() {
               ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkRemove(this.entry != null);
               Collection var1x = this.entry.getValue();
               var1.remove();
               RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize = RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize - var1x.size();
               var1x.clear();
               this.entry = null;
            }
         };
      }

      @Override
      public Spliterator<K> spliterator() {
         return this.map().keySet().spliterator();
      }

      @Override
      public boolean remove(Object var1) {
         int var2 = 0;
         Collection var3 = (Collection)this.map().remove(var1);
         if (var3 != null) {
            var2 = var3.size();
            var3.clear();
            RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize = RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize - var2;
         }

         return var2 > 0;
      }

      @Override
      public void clear() {
         HRCROCOHHHICRHIHHOOCIIRRRCCIRR.clear(this.iterator());
      }

      @Override
      public boolean containsAll(Collection<?> var1) {
         return this.map().keySet().containsAll(var1);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         return this == var1 || this.map().keySet().equals(var1);
      }

      @Override
      public int hashCode() {
         return this.map().keySet().hashCode();
      }
   }

   class HICHRCOHCCRHOHCICOOCHOIHCCHIRI
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO<K, V>.OCOHORHCROHICRRIHCIHHRRCIHICRI
      implements NavigableSet<V> {
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI(@Nullable K var2, NavigableSet<V> var3, RRCRRCORICCHOHHIRCHIROOHIIOHCO.@Nullable CORCOCICIRIOHROHROIIOOHICCHCRR var4) {
         super(var2, var3, var4);
      }

      NavigableSet<V> getSortedSetDelegate() {
         return (NavigableSet<V>)super.getSortedSetDelegate();
      }

      @Override
      public V lower(V var1) {
         return (V)this.getSortedSetDelegate().lower(var1);
      }

      @Override
      public V floor(V var1) {
         return (V)this.getSortedSetDelegate().floor(var1);
      }

      @Override
      public V ceiling(V var1) {
         return (V)this.getSortedSetDelegate().ceiling(var1);
      }

      @Override
      public V higher(V var1) {
         return (V)this.getSortedSetDelegate().higher(var1);
      }

      @Override
      public V pollFirst() {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.pollNext(this.iterator());
      }

      @Override
      public V pollLast() {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.pollNext(this.descendingIterator());
      }

      private NavigableSet<V> wrap(NavigableSet<V> var1) {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
            this.RHHCCHHOHOIRCHCIHOOHOOIRCHRICI, var1, this.CCRCRCIOOORHOCCORIHCRRCIOORHIO() == null ? this : this.CCRCRCIOOORHOCCORIHCRRCIOORHIO()
         );
      }

      @Override
      public NavigableSet<V> descendingSet() {
         return this.wrap(this.getSortedSetDelegate().descendingSet());
      }

      @Override
      public Iterator<V> descendingIterator() {
         return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.getSortedSetDelegate().descendingIterator()
         );
      }

      @Override
      public NavigableSet<V> subSet(V var1, boolean var2, V var3, boolean var4) {
         return this.wrap((NavigableSet<V>)this.getSortedSetDelegate().subSet(var1, var2, var3, var4));
      }

      @Override
      public NavigableSet<V> headSet(V var1, boolean var2) {
         return this.wrap((NavigableSet<V>)this.getSortedSetDelegate().headSet(var1, var2));
      }

      @Override
      public NavigableSet<V> tailSet(V var1, boolean var2) {
         return this.wrap((NavigableSet<V>)this.getSortedSetDelegate().tailSet(var1, var2));
      }
   }

   private class HRCHROOHRIHCRCRHRIIROCIRHOIRHH
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO<K, V>.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      implements SortedMap<K, Collection<V>> {
      @Nullable SortedSet<K> sortedKeySet;

      HRCHROOHRIHCRCRHRIIROCIRHOIRHH(SortedMap<K, Collection<V>> var2) {
         super(var2);
      }

      SortedMap<K, Collection<V>> sortedMap() {
         return (SortedMap<K, Collection<V>>)this.IHIICOIHIHOCHRIOORHOIIIHOOIIOO;
      }

      @Override
      public Comparator<? super K> comparator() {
         return this.sortedMap().comparator();
      }

      @Override
      public K firstKey() {
         return (K)this.sortedMap().firstKey();
      }

      @Override
      public K lastKey() {
         return (K)this.sortedMap().lastKey();
      }

      @Override
      public SortedMap<K, Collection<V>> headMap(K var1) {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(this.sortedMap().headMap(var1));
      }

      @Override
      public SortedMap<K, Collection<V>> subMap(K var1, K var2) {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(this.sortedMap().subMap(var1, var2));
      }

      @Override
      public SortedMap<K, Collection<V>> tailMap(K var1) {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(this.sortedMap().tailMap(var1));
      }

      public SortedSet<K> keySet() {
         SortedSet var1 = this.sortedKeySet;
         return var1 == null ? (this.sortedKeySet = this.createKeySet()) : var1;
      }

      SortedSet<K> createKeySet() {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(this.sortedMap());
      }
   }

   class IIHRRHORCRCROCHHOHORCHCROCIHRO
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO<K, V>.CORCOCICIRIOHROHROIIOOHICCHCRR
      implements Set<V> {
      IIHRRHORCRCROCHHOHORCHCROCIHRO(@Nullable K var2, Set<V> var3) {
         super(var2, var3, null);
      }

      @Override
      public boolean removeAll(Collection<?> var1) {
         if (var1.isEmpty()) {
            return false;
         }

         int var2 = this.size();
         boolean var3 = ICRHCCCCOIICOCHHCRCOOIHICROIHI.removeAllImpl((Set<?>)this.delegate, var1);
         if (var3) {
            int var4 = this.delegate.size();
            RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize = RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize + (var4 - var2);
            this.removeIfEmpty();
         }

         return var3;
      }
   }

   private abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> implements Iterator<T> {
      final Iterator<Entry<K, Collection<V>>> RIIIOOOHOROIRCICCCHRRCCHOCOICH = RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.map.entrySet().iterator();
      @Nullable Object key = null;
      @Nullable Collection<V> collection = null;
      Iterator<V> valueIterator = HRCROCOHHHICRHIHHOOCIIRRRCCIRR.emptyModifiableIterator();

      IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      }

      abstract T output(K var1, V var2);

      @Override
      public boolean hasNext() {
         return this.RIIIOOOHOROIRCICCCHRRCCHOCOICH.hasNext() || this.valueIterator.hasNext();
      }

      @Override
      public T next() {
         if (!this.valueIterator.hasNext()) {
            Entry var1 = this.RIIIOOOHOROIRCICCCHRRCCHOCOICH.next();
            this.key = var1.getKey();
            this.collection = (Collection<V>)var1.getValue();
            this.valueIterator = this.collection.iterator();
         }

         return this.output((V)this.key, this.valueIterator.next());
      }

      @Override
      public void remove() {
         this.valueIterator.remove();
         if (this.collection.isEmpty()) {
            this.RIIIOOOHOROIRCICCCHRRCCHOCOICH.remove();
         }

         RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize--;
      }
   }

   class OCOHORHCROHICRRIHCIHHRRCIHICRI
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO<K, V>.CORCOCICIRIOHROHROIIOOHICCHCRR
      implements SortedSet<V> {
      OCOHORHCROHICRRIHCIHHRRCIHICRI(@Nullable K var2, SortedSet<V> var3, RRCRRCORICCHOHHIRCHIROOHIIOHCO.@Nullable CORCOCICIRIOHROHROIIOOHICCHCRR var4) {
         super(var2, var3, var4);
      }

      SortedSet<V> getSortedSetDelegate() {
         return (SortedSet<V>)this.getDelegate();
      }

      @Override
      public Comparator<? super V> comparator() {
         return this.getSortedSetDelegate().comparator();
      }

      @Override
      public V first() {
         this.refreshIfEmpty();
         return (V)this.getSortedSetDelegate().first();
      }

      @Override
      public V last() {
         this.refreshIfEmpty();
         return (V)this.getSortedSetDelegate().last();
      }

      @Override
      public SortedSet<V> headSet(V var1) {
         this.refreshIfEmpty();
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.new OCOHORHCROHICRRIHCIHHRRCIHICRI(
            this.getKey(),
            this.getSortedSetDelegate().headSet(var1),
            this.CCRCRCIOOORHOCCORIHCRRCIOORHIO() == null ? this : this.CCRCRCIOOORHOCCORIHCRRCIOORHIO()
         );
      }

      @Override
      public SortedSet<V> subSet(V var1, V var2) {
         this.refreshIfEmpty();
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.new OCOHORHCROHICRRIHCIHHRRCIHICRI(
            this.getKey(),
            this.getSortedSetDelegate().subSet(var1, var2),
            this.CCRCRCIOOORHOCCORIHCRRCIOORHIO() == null ? this : this.CCRCRCIOOORHOCCORIHCRRCIOORHIO()
         );
      }

      @Override
      public SortedSet<V> tailSet(V var1) {
         this.refreshIfEmpty();
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.new OCOHORHCROHICRRIHCIHHRRCIHICRI(
            this.getKey(),
            this.getSortedSetDelegate().tailSet(var1),
            this.CCRCRCIOOORHOCCORIHCRRCIOORHIO() == null ? this : this.CCRCRCIOOORHOCCORIHCRRCIOORHIO()
         );
      }
   }

   private class OOROOCCIRCCRHOIOIORIHCHHOOCCOR
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO<K, V>.HHCCIRHCCCIIRHCROHIORHIRHHIORH
      implements SortedSet<K> {
      OOROOCCIRCCRHOIOIORIHCHHOOCCOR(SortedMap<K, Collection<V>> var2) {
         super(var2);
      }

      SortedMap<K, Collection<V>> sortedMap() {
         return (SortedMap<K, Collection<V>>)super.map();
      }

      @Override
      public Comparator<? super K> comparator() {
         return this.sortedMap().comparator();
      }

      @Override
      public K first() {
         return (K)this.sortedMap().firstKey();
      }

      @Override
      public SortedSet<K> headSet(K var1) {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(this.sortedMap().headMap(var1));
      }

      @Override
      public K last() {
         return (K)this.sortedMap().lastKey();
      }

      @Override
      public SortedSet<K> subSet(K var1, K var2) {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(this.sortedMap().subMap(var1, var2));
      }

      @Override
      public SortedSet<K> tailSet(K var1) {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(this.sortedMap().tailMap(var1));
      }
   }

   private class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH<K, Collection<V>> {
      final transient Map<K, Collection<V>> IHIICOIHIHOCHRIOORHOIIIHOOIIOO;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Map<K, Collection<V>> var2) {
         this.IHIICOIHIHOCHRIOORHOIIIHOOIIOO = var2;
      }

      @Override
      protected Set<Entry<K, Collection<V>>> createEntrySet() {
         return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            
         );
      }

      @Override
      public boolean containsKey(Object var1) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeContainsKey(this.IHIICOIHIHOCHRIOORHOIIIHOOIIOO, var1);
      }

      public Collection<V> get(Object var1) {
         Collection var2 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeGet(this.IHIICOIHIHOCHRIOORHOIIIHOOIIOO, var1);
         if (var2 == null) {
            return null;
         }

         Object var3 = var1;
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.wrapCollection((K)var3, var2);
      }

      @Override
      public Set<K> keySet() {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.keySet();
      }

      @Override
      public int size() {
         return this.IHIICOIHIHOCHRIOORHOIIIHOOIIOO.size();
      }

      public Collection<V> remove(Object var1) {
         Collection var2 = this.IHIICOIHIHOCHRIOORHOIIIHOOIIOO.remove(var1);
         if (var2 == null) {
            return null;
         }

         Collection var3 = RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.createCollection();
         var3.addAll(var2);
         RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize = RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize - var2.size();
         var2.clear();
         return var3;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         return this == var1 || this.IHIICOIHIHOCHRIOORHOIIIHOOIIOO.equals(var1);
      }

      @Override
      public int hashCode() {
         return this.IHIICOIHIHOCHRIOORHOIIIHOOIIOO.hashCode();
      }

      @Override
      public String toString() {
         return this.IHIICOIHIHOCHRIOORHOIIIHOOIIOO.toString();
      }

      @Override
      public void clear() {
         if (this.IHIICOIHIHOCHRIOORHOIIIHOOIIOO == RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.map) {
            RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.clear();
         } else {
            HRCROCOHHHICRHIHHOOCIIRRRCCIRR.clear(
               new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  
               )
            );
         }
      }

      Entry<K, Collection<V>> wrapEntry(Entry<K, Collection<V>> var1) {
         Object var2 = var1.getKey();
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.immutableEntry(
            (K)var2, RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.wrapCollection((K)var2, (Collection<V>)var1.getValue())
         );
      }

      class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements Iterator<Entry<K, Collection<V>>> {
         final Iterator<Entry<K, Collection<V>>> RRROHHIHRORHRCRCICCCOOHIHHOIIR = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.IHIICOIHIHOCHRIOORHOIIIHOOIIOO
            .entrySet()
            .iterator();
         @Nullable Collection<V> collection;

         @Override
         public boolean hasNext() {
            return this.RRROHHIHRORHRCRCICCCOOHIHHOIIR.hasNext();
         }

         public Entry<K, Collection<V>> next() {
            Entry var1 = this.RRROHHIHRORHRCRCICCCOOHIHHOIIR.next();
            this.collection = (Collection<V>)var1.getValue();
            return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.wrapEntry(var1);
         }

         @Override
         public void remove() {
            ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkRemove(this.collection != null);
            this.RRROHHIHRORHRCRCICCCOOHIHHOIIR.remove();
            RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize = RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.totalSize - this.collection.size();
            this.collection.clear();
            this.collection = null;
         }
      }

      class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<K, Collection<V>> {
         @Override
         Map<K, Collection<V>> map() {
            return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this;
         }

         @Override
         public Iterator<Entry<K, Collection<V>>> iterator() {
            return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.new IRCIIHHICIHRCOCRROCOICRIHHCCHH();
         }

         @Override
         public Spliterator<Entry<K, Collection<V>>> spliterator() {
            return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.map(
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.IHIICOIHIHOCHRIOORHOIIIHOOIIOO.entrySet().spliterator(), RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this::wrapEntry
            );
         }

         @Override
         public boolean contains(Object var1) {
            return RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.safeContains(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.IHIICOIHIHOCHRIOORHOIIIHOOIIOO.entrySet(), var1);
         }

         @Override
         public boolean remove(Object var1) {
            if (!this.contains(var1)) {
               return false;
            }

            Entry var2 = (Entry)var1;
            RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.removeValuesForKey(var2.getKey());
            return true;
         }
      }
   }

   private class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO<K, V>.CRICCOOHHHCHOORCICOCOHIHOIRHOO
      implements RandomAccess {
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(@Nullable K var2, List<V> var3, RRCRRCORICCHOHHIRCHIROOHIIOHCO.@Nullable CORCOCICIRIOHROHROIIOOHICCHCRR var4) {
         super(var2, var3, var4);
      }
   }

   class RRCRRCORICCHOHHIRCHIROOHIIOHCO
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO<K, V>.OOROOCCIRCCRHOIOIORIHCHHOOCCOR
      implements NavigableSet<K> {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO(NavigableMap<K, Collection<V>> var2) {
         super(var2);
      }

      NavigableMap<K, Collection<V>> sortedMap() {
         return (NavigableMap<K, Collection<V>>)super.sortedMap();
      }

      @Override
      public K lower(K var1) {
         return (K)this.sortedMap().lowerKey(var1);
      }

      @Override
      public K floor(K var1) {
         return (K)this.sortedMap().floorKey(var1);
      }

      @Override
      public K ceiling(K var1) {
         return (K)this.sortedMap().ceilingKey(var1);
      }

      @Override
      public K higher(K var1) {
         return (K)this.sortedMap().higherKey(var1);
      }

      @Override
      public K pollFirst() {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.pollNext(this.iterator());
      }

      @Override
      public K pollLast() {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.pollNext(this.descendingIterator());
      }

      @Override
      public NavigableSet<K> descendingSet() {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.new RRCRRCORICCHOHHIRCHIROOHIIOHCO(this.sortedMap().descendingMap());
      }

      @Override
      public Iterator<K> descendingIterator() {
         return this.descendingSet().iterator();
      }

      public NavigableSet<K> headSet(K var1) {
         return (NavigableSet<K>)this.headSet((boolean)var1, false);
      }

      @Override
      public NavigableSet<K> headSet(K var1, boolean var2) {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.new RRCRRCORICCHOHHIRCHIROOHIIOHCO(this.sortedMap().headMap(var1, var2));
      }

      public NavigableSet<K> subSet(K var1, K var2) {
         return (NavigableSet<K>)this.subSet((boolean)var1, true, (boolean)var2, false);
      }

      @Override
      public NavigableSet<K> subSet(K var1, boolean var2, K var3, boolean var4) {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.new RRCRRCORICCHOHHIRCHIROOHIIOHCO(this.sortedMap().subMap(var1, var2, var3, var4));
      }

      public NavigableSet<K> tailSet(K var1) {
         return (NavigableSet<K>)this.tailSet((boolean)var1, true);
      }

      @Override
      public NavigableSet<K> tailSet(K var1, boolean var2) {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.new RRCRRCORICCHOHHIRCHIROOHIIOHCO(this.sortedMap().tailMap(var1, var2));
      }
   }
}
