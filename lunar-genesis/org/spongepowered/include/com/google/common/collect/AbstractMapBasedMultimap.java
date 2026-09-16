package org.spongepowered.include.com.google.common.collect;

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
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Preconditions;

abstract class AbstractMapBasedMultimap<K, V> extends AbstractMultimap<K, V> implements Serializable {
   private transient Map<K, Collection<V>> map;
   private transient int totalSize;

   protected AbstractMapBasedMultimap(Map<K, Collection<V>> var1) {
      Preconditions.checkArgument(var1.isEmpty());
      this.map = var1;
   }

   Collection<V> createUnmodifiableEmptyCollection() {
      return unmodifiableCollectionSubclass(this.createCollection());
   }

   abstract Collection<V> createCollection();

   Collection<V> createCollection(@Nullable K var1) {
      return this.createCollection();
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
      return unmodifiableCollectionSubclass(var3);
   }

   static <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> var0) {
      if (var0 instanceof NavigableSet) {
         return Sets.unmodifiableNavigableSet((NavigableSet<E>)var0);
      } else if (var0 instanceof SortedSet) {
         return Collections.unmodifiableSortedSet((SortedSet<E>)var0);
      } else if (var0 instanceof Set) {
         return Collections.unmodifiableSet((Set<? extends E>)var0);
      } else {
         return var0 instanceof List ? Collections.unmodifiableList((List<? extends E>)var0) : Collections.unmodifiableCollection(var0);
      }
   }

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
      if (var2 instanceof NavigableSet) {
         return new AbstractMapBasedMultimap.WrappedNavigableSet(var1, (NavigableSet<V>)var2, null);
      } else if (var2 instanceof SortedSet) {
         return new AbstractMapBasedMultimap.WrappedSortedSet(var1, (SortedSet<V>)var2, null);
      } else if (var2 instanceof Set) {
         return new AbstractMapBasedMultimap.WrappedSet(var1, (Set<V>)var2);
      } else {
         return var2 instanceof List ? this.wrapList((K)var1, (List<V>)var2, null) : new AbstractMapBasedMultimap.WrappedCollection(var1, var2, null);
      }
   }

   private List<V> wrapList(@Nullable K var1, List<V> var2, @Nullable AbstractMapBasedMultimap<K, V>.WrappedCollection var3) {
      return var2 instanceof RandomAccess
         ? new AbstractMapBasedMultimap.RandomAccessWrappedList(var1, var2, var3)
         : new AbstractMapBasedMultimap.WrappedList(var1, var2, var3);
   }

   private static <E> Iterator<E> iteratorOrListIterator(Collection<E> var0) {
      return var0 instanceof List ? ((List)var0).listIterator() : var0.iterator();
   }

   @Override
   Set<K> createKeySet() {
      if (this.map instanceof NavigableMap) {
         return new AbstractMapBasedMultimap.NavigableKeySet((NavigableMap<K, Collection<V>>)this.map);
      } else {
         return this.map instanceof SortedMap
            ? new AbstractMapBasedMultimap.SortedKeySet((SortedMap<K, Collection<V>>)this.map)
            : new AbstractMapBasedMultimap.KeySet(this.map);
      }
   }

   private void removeValuesForKey(Object var1) {
      Collection var2 = Maps.safeRemove(this.map, var1);
      if (var2 != null) {
         int var3 = var2.size();
         var2.clear();
         this.totalSize -= var3;
      }
   }

   @Override
   Map<K, Collection<V>> createAsMap() {
      if (this.map instanceof NavigableMap) {
         return new AbstractMapBasedMultimap.NavigableAsMap((NavigableMap<K, Collection<V>>)this.map);
      } else {
         return this.map instanceof SortedMap
            ? new AbstractMapBasedMultimap.SortedAsMap((SortedMap<K, Collection<V>>)this.map)
            : new AbstractMapBasedMultimap.AsMap(this.map);
      }
   }

   private class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {
      final transient Map<K, Collection<V>> submap;

      AsMap(Map<K, Collection<V>> var2) {
         this.submap = var2;
      }

      @Override
      protected Set<Entry<K, Collection<V>>> createEntrySet() {
         return new AbstractMapBasedMultimap.AsMap.AsMapEntries();
      }

      @Override
      public boolean containsKey(Object var1) {
         return Maps.safeContainsKey(this.submap, var1);
      }

      public Collection<V> get(Object var1) {
         Collection var2 = Maps.safeGet(this.submap, var1);
         if (var2 == null) {
            return null;
         }

         Object var3 = var1;
         return AbstractMapBasedMultimap.this.wrapCollection((K)var3, var2);
      }

      @Override
      public Set<K> keySet() {
         return AbstractMapBasedMultimap.this.keySet();
      }

      @Override
      public int size() {
         return this.submap.size();
      }

      public Collection<V> remove(Object var1) {
         Collection var2 = this.submap.remove(var1);
         if (var2 == null) {
            return null;
         }

         Collection var3 = AbstractMapBasedMultimap.this.createCollection();
         var3.addAll(var2);
         AbstractMapBasedMultimap.this.totalSize = AbstractMapBasedMultimap.this.totalSize - var2.size();
         var2.clear();
         return var3;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         return this == var1 || this.submap.equals(var1);
      }

      @Override
      public int hashCode() {
         return this.submap.hashCode();
      }

      @Override
      public String toString() {
         return this.submap.toString();
      }

      @Override
      public void clear() {
         if (this.submap == AbstractMapBasedMultimap.this.map) {
            AbstractMapBasedMultimap.this.clear();
         } else {
            Iterators.clear(new AbstractMapBasedMultimap.AsMap.AsMapIterator());
         }
      }

      Entry<K, Collection<V>> wrapEntry(Entry<K, Collection<V>> var1) {
         Object var2 = var1.getKey();
         return Maps.immutableEntry((K)var2, AbstractMapBasedMultimap.this.wrapCollection((K)var2, (Collection<V>)var1.getValue()));
      }

      class AsMapEntries extends Maps.EntrySet<K, Collection<V>> {
         @Override
         Map<K, Collection<V>> map() {
            return AsMap.this;
         }

         @Override
         public Iterator<Entry<K, Collection<V>>> iterator() {
            return AsMap.this.new AsMapIterator();
         }

         @Override
         public Spliterator<Entry<K, Collection<V>>> spliterator() {
            return CollectSpliterators.map(AsMap.this.submap.entrySet().spliterator(), AsMap.this::wrapEntry);
         }

         @Override
         public boolean contains(Object var1) {
            return Collections2.safeContains(AsMap.this.submap.entrySet(), var1);
         }

         @Override
         public boolean remove(Object var1) {
            if (!this.contains(var1)) {
               return false;
            }

            Entry var2 = (Entry)var1;
            AbstractMapBasedMultimap.this.removeValuesForKey(var2.getKey());
            return true;
         }
      }

      class AsMapIterator implements Iterator<Entry<K, Collection<V>>> {
         final Iterator<Entry<K, Collection<V>>> delegateIterator = AsMap.this.submap.entrySet().iterator();
         Collection<V> collection;

         @Override
         public boolean hasNext() {
            return this.delegateIterator.hasNext();
         }

         public Entry<K, Collection<V>> next() {
            Entry var1 = this.delegateIterator.next();
            this.collection = (Collection<V>)var1.getValue();
            return AsMap.this.wrapEntry(var1);
         }

         @Override
         public void remove() {
            this.delegateIterator.remove();
            AbstractMapBasedMultimap.this.totalSize = AbstractMapBasedMultimap.this.totalSize - this.collection.size();
            this.collection.clear();
         }
      }
   }

   private class KeySet extends Maps.KeySet<K, Collection<V>> {
      KeySet(Map<K, Collection<V>> var2) {
         super(var2);
      }

      @Override
      public Iterator<K> iterator() {
         final Iterator var1 = this.map().entrySet().iterator();
         return new Iterator<K>() {
            Entry<K, Collection<V>> entry;

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
               CollectPreconditions.checkRemove(this.entry != null);
               Collection var1x = this.entry.getValue();
               var1.remove();
               AbstractMapBasedMultimap.this.totalSize = AbstractMapBasedMultimap.this.totalSize - var1x.size();
               var1x.clear();
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
            AbstractMapBasedMultimap.this.totalSize = AbstractMapBasedMultimap.this.totalSize - var2;
         }

         return var2 > 0;
      }

      @Override
      public void clear() {
         Iterators.clear(this.iterator());
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

   class NavigableAsMap extends AbstractMapBasedMultimap.SortedAsMap implements NavigableMap {
      NavigableAsMap(NavigableMap<K, Collection<V>> var2) {
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
         Collection var3 = AbstractMapBasedMultimap.this.createCollection();
         var3.addAll((Collection)var2.getValue());
         var1.remove();
         return Maps.immutableEntry((K)var2.getKey(), AbstractMapBasedMultimap.unmodifiableCollectionSubclass(var3));
      }

      @Override
      public NavigableMap<K, Collection<V>> descendingMap() {
         return AbstractMapBasedMultimap.this.new NavigableAsMap(this.sortedMap().descendingMap());
      }

      public NavigableSet<K> keySet() {
         return (NavigableSet<K>)super.keySet();
      }

      NavigableSet<K> createKeySet() {
         return AbstractMapBasedMultimap.this.new NavigableKeySet(this.sortedMap());
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
         return AbstractMapBasedMultimap.this.new NavigableAsMap(this.sortedMap().subMap(var1, var2, var3, var4));
      }

      public NavigableMap<K, Collection<V>> headMap(K var1) {
         return (NavigableMap<K, Collection<V>>)this.headMap((boolean)var1, false);
      }

      @Override
      public NavigableMap<K, Collection<V>> headMap(K var1, boolean var2) {
         return AbstractMapBasedMultimap.this.new NavigableAsMap(this.sortedMap().headMap(var1, var2));
      }

      public NavigableMap<K, Collection<V>> tailMap(K var1) {
         return (NavigableMap<K, Collection<V>>)this.tailMap((boolean)var1, true);
      }

      @Override
      public NavigableMap<K, Collection<V>> tailMap(K var1, boolean var2) {
         return AbstractMapBasedMultimap.this.new NavigableAsMap(this.sortedMap().tailMap(var1, var2));
      }
   }

   class NavigableKeySet extends AbstractMapBasedMultimap.SortedKeySet implements NavigableSet {
      NavigableKeySet(NavigableMap<K, Collection<V>> var2) {
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
         return Iterators.pollNext(this.iterator());
      }

      @Override
      public K pollLast() {
         return Iterators.pollNext(this.descendingIterator());
      }

      @Override
      public NavigableSet<K> descendingSet() {
         return AbstractMapBasedMultimap.this.new NavigableKeySet(this.sortedMap().descendingMap());
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
         return AbstractMapBasedMultimap.this.new NavigableKeySet(this.sortedMap().headMap(var1, var2));
      }

      public NavigableSet<K> subSet(K var1, K var2) {
         return (NavigableSet<K>)this.subSet((boolean)var1, true, (boolean)var2, false);
      }

      @Override
      public NavigableSet<K> subSet(K var1, boolean var2, K var3, boolean var4) {
         return AbstractMapBasedMultimap.this.new NavigableKeySet(this.sortedMap().subMap(var1, var2, var3, var4));
      }

      public NavigableSet<K> tailSet(K var1) {
         return (NavigableSet<K>)this.tailSet((boolean)var1, true);
      }

      @Override
      public NavigableSet<K> tailSet(K var1, boolean var2) {
         return AbstractMapBasedMultimap.this.new NavigableKeySet(this.sortedMap().tailMap(var1, var2));
      }
   }

   private class RandomAccessWrappedList extends AbstractMapBasedMultimap.WrappedList implements RandomAccess {
      RandomAccessWrappedList(@Nullable K var2, List<V> var3, @Nullable AbstractMapBasedMultimap<K, V>.WrappedCollection var4) {
         super(var2, var3, var4);
      }
   }

   private class SortedAsMap extends AbstractMapBasedMultimap.AsMap implements SortedMap {
      SortedSet<K> sortedKeySet;

      SortedAsMap(SortedMap<K, Collection<V>> var2) {
         super(var2);
      }

      SortedMap<K, Collection<V>> sortedMap() {
         return (SortedMap<K, Collection<V>>)this.submap;
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
         return AbstractMapBasedMultimap.this.new SortedAsMap(this.sortedMap().headMap(var1));
      }

      @Override
      public SortedMap<K, Collection<V>> subMap(K var1, K var2) {
         return AbstractMapBasedMultimap.this.new SortedAsMap(this.sortedMap().subMap(var1, var2));
      }

      @Override
      public SortedMap<K, Collection<V>> tailMap(K var1) {
         return AbstractMapBasedMultimap.this.new SortedAsMap(this.sortedMap().tailMap(var1));
      }

      public SortedSet<K> keySet() {
         SortedSet var1 = this.sortedKeySet;
         return var1 == null ? (this.sortedKeySet = this.createKeySet()) : var1;
      }

      SortedSet<K> createKeySet() {
         return AbstractMapBasedMultimap.this.new SortedKeySet(this.sortedMap());
      }
   }

   private class SortedKeySet extends AbstractMapBasedMultimap.KeySet implements SortedSet {
      SortedKeySet(SortedMap<K, Collection<V>> var2) {
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
         return AbstractMapBasedMultimap.this.new SortedKeySet(this.sortedMap().headMap(var1));
      }

      @Override
      public K last() {
         return (K)this.sortedMap().lastKey();
      }

      @Override
      public SortedSet<K> subSet(K var1, K var2) {
         return AbstractMapBasedMultimap.this.new SortedKeySet(this.sortedMap().subMap(var1, var2));
      }

      @Override
      public SortedSet<K> tailSet(K var1) {
         return AbstractMapBasedMultimap.this.new SortedKeySet(this.sortedMap().tailMap(var1));
      }
   }

   private class WrappedCollection extends AbstractCollection<V> {
      final Object key;
      Collection<V> delegate;
      final AbstractMapBasedMultimap<K, V>.WrappedCollection ancestor;
      final Collection<V> ancestorDelegate;

      WrappedCollection(@Nullable K var2, Collection<V> var3, @Nullable AbstractMapBasedMultimap<K, V>.WrappedCollection var4) {
         this.key = var2;
         this.delegate = var3;
         this.ancestor = var4;
         this.ancestorDelegate = var4 == null ? null : var4.getDelegate();
      }

      void refreshIfEmpty() {
         if (this.ancestor != null) {
            this.ancestor.refreshIfEmpty();
            if (this.ancestor.getDelegate() != this.ancestorDelegate) {
               throw new ConcurrentModificationException();
            }
         } else if (this.delegate.isEmpty()) {
            Collection var1 = AbstractMapBasedMultimap.this.map.get(this.key);
            if (var1 != null) {
               this.delegate = var1;
            }
         }
      }

      void removeIfEmpty() {
         if (this.ancestor != null) {
            this.ancestor.removeIfEmpty();
         } else if (this.delegate.isEmpty()) {
            AbstractMapBasedMultimap.this.map.remove(this.key);
         }
      }

      K getKey() {
         return (K)this.key;
      }

      void addToMap() {
         if (this.ancestor != null) {
            this.ancestor.addToMap();
         } else {
            AbstractMapBasedMultimap.this.map.put((K)this.key, this.delegate);
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
         return new AbstractMapBasedMultimap.WrappedCollection.WrappedIterator();
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
            AbstractMapBasedMultimap.this.totalSize++;
            if (var2) {
               this.addToMap();
            }
         }

         return var3;
      }

      AbstractMapBasedMultimap<K, V>.WrappedCollection getAncestor() {
         return this.ancestor;
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
            AbstractMapBasedMultimap.this.totalSize = AbstractMapBasedMultimap.this.totalSize + (var4 - var2);
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
            AbstractMapBasedMultimap.this.totalSize = AbstractMapBasedMultimap.this.totalSize - var1;
            this.removeIfEmpty();
         }
      }

      @Override
      public boolean remove(Object var1) {
         this.refreshIfEmpty();
         boolean var2 = this.delegate.remove(var1);
         if (var2) {
            AbstractMapBasedMultimap.this.totalSize--;
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
            AbstractMapBasedMultimap.this.totalSize = AbstractMapBasedMultimap.this.totalSize + (var4 - var2);
            this.removeIfEmpty();
         }

         return var3;
      }

      @Override
      public boolean retainAll(Collection<?> var1) {
         Preconditions.checkNotNull(var1);
         int var2 = this.size();
         boolean var3 = this.delegate.retainAll(var1);
         if (var3) {
            int var4 = this.delegate.size();
            AbstractMapBasedMultimap.this.totalSize = AbstractMapBasedMultimap.this.totalSize + (var4 - var2);
            this.removeIfEmpty();
         }

         return var3;
      }

      class WrappedIterator implements Iterator<V> {
         final Iterator<V> delegateIterator;
         final Collection<V> originalDelegate;

         WrappedIterator() {
            this.originalDelegate = WrappedCollection.this.delegate;
            this.delegateIterator = AbstractMapBasedMultimap.iteratorOrListIterator(WrappedCollection.this.delegate);
         }

         WrappedIterator(Iterator<V> var2) {
            this.originalDelegate = WrappedCollection.this.delegate;
            this.delegateIterator = var2;
         }

         void validateIterator() {
            WrappedCollection.this.refreshIfEmpty();
            if (WrappedCollection.this.delegate != this.originalDelegate) {
               throw new ConcurrentModificationException();
            }
         }

         @Override
         public boolean hasNext() {
            this.validateIterator();
            return this.delegateIterator.hasNext();
         }

         @Override
         public V next() {
            this.validateIterator();
            return this.delegateIterator.next();
         }

         @Override
         public void remove() {
            this.delegateIterator.remove();
            AbstractMapBasedMultimap.this.totalSize--;
            WrappedCollection.this.removeIfEmpty();
         }

         Iterator<V> getDelegateIterator() {
            this.validateIterator();
            return this.delegateIterator;
         }
      }
   }

   private class WrappedList extends AbstractMapBasedMultimap.WrappedCollection implements List {
      WrappedList(@Nullable K var2, List<V> var3, @Nullable AbstractMapBasedMultimap<K, V>.WrappedCollection var4) {
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
            AbstractMapBasedMultimap.this.totalSize = AbstractMapBasedMultimap.this.totalSize + (var5 - var3);
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
         AbstractMapBasedMultimap.this.totalSize++;
         if (var3) {
            this.addToMap();
         }
      }

      @Override
      public V remove(int var1) {
         this.refreshIfEmpty();
         Object var2 = this.getListDelegate().remove(var1);
         AbstractMapBasedMultimap.this.totalSize--;
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
         return new AbstractMapBasedMultimap.WrappedList.WrappedListIterator();
      }

      @Override
      public ListIterator<V> listIterator(int var1) {
         this.refreshIfEmpty();
         return new AbstractMapBasedMultimap.WrappedList.WrappedListIterator(var1);
      }

      @Override
      public List<V> subList(int var1, int var2) {
         this.refreshIfEmpty();
         return AbstractMapBasedMultimap.this.wrapList(
            (K)this.getKey(), this.getListDelegate().subList(var1, var2), this.getAncestor() == null ? this : this.getAncestor()
         );
      }

      private class WrappedListIterator extends AbstractMapBasedMultimap.WrappedCollection.WrappedIterator implements ListIterator {
         WrappedListIterator() {
         }

         public WrappedListIterator(int var2) {
            super(WrappedList.this.getListDelegate().listIterator(var2));
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
            boolean var2 = WrappedList.this.isEmpty();
            this.getDelegateListIterator().add(var1);
            AbstractMapBasedMultimap.this.totalSize++;
            if (var2) {
               WrappedList.this.addToMap();
            }
         }
      }
   }

   class WrappedNavigableSet extends AbstractMapBasedMultimap.WrappedSortedSet implements NavigableSet {
      WrappedNavigableSet(@Nullable K var2, NavigableSet<V> var3, @Nullable AbstractMapBasedMultimap<K, V>.WrappedCollection var4) {
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
         return Iterators.pollNext(this.iterator());
      }

      @Override
      public V pollLast() {
         return Iterators.pollNext(this.descendingIterator());
      }

      private NavigableSet<V> wrap(NavigableSet<V> var1) {
         return AbstractMapBasedMultimap.this.new WrappedNavigableSet(this.key, var1, this.getAncestor() == null ? this : this.getAncestor());
      }

      @Override
      public NavigableSet<V> descendingSet() {
         return this.wrap(this.getSortedSetDelegate().descendingSet());
      }

      @Override
      public Iterator<V> descendingIterator() {
         return new AbstractMapBasedMultimap.WrappedCollection.WrappedIterator(this.getSortedSetDelegate().descendingIterator());
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

   private class WrappedSet extends AbstractMapBasedMultimap.WrappedCollection implements Set {
      WrappedSet(@Nullable K var2, Set<V> var3) {
         super(var2, var3, null);
      }

      @Override
      public boolean removeAll(Collection<?> var1) {
         if (var1.isEmpty()) {
            return false;
         }

         int var2 = this.size();
         boolean var3 = Sets.removeAllImpl((Set<?>)this.delegate, var1);
         if (var3) {
            int var4 = this.delegate.size();
            AbstractMapBasedMultimap.this.totalSize = AbstractMapBasedMultimap.this.totalSize + (var4 - var2);
            this.removeIfEmpty();
         }

         return var3;
      }
   }

   private class WrappedSortedSet extends AbstractMapBasedMultimap.WrappedCollection implements SortedSet {
      WrappedSortedSet(@Nullable K var2, SortedSet<V> var3, @Nullable AbstractMapBasedMultimap<K, V>.WrappedCollection var4) {
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
         return AbstractMapBasedMultimap.this.new WrappedSortedSet(
            this.getKey(), this.getSortedSetDelegate().headSet(var1), this.getAncestor() == null ? this : this.getAncestor()
         );
      }

      @Override
      public SortedSet<V> subSet(V var1, V var2) {
         this.refreshIfEmpty();
         return AbstractMapBasedMultimap.this.new WrappedSortedSet(
            this.getKey(), this.getSortedSetDelegate().subSet(var1, var2), this.getAncestor() == null ? this : this.getAncestor()
         );
      }

      @Override
      public SortedSet<V> tailSet(V var1) {
         this.refreshIfEmpty();
         return AbstractMapBasedMultimap.this.new WrappedSortedSet(
            this.getKey(), this.getSortedSetDelegate().tailSet(var1), this.getAncestor() == null ? this : this.getAncestor()
         );
      }
   }
}
