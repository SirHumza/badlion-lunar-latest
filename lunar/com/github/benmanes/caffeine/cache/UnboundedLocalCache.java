package com.github.benmanes.caffeine.cache;

import com.github.benmanes.caffeine.cache.stats.StatsCounter;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Spliterator;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.checkerframework.checker.nullness.qual.Nullable;

final class UnboundedLocalCache<K, V> implements LocalCache<K, V> {
   static final Logger logger = System.getLogger(UnboundedLocalCache.class.getName());
   static final VarHandle REFRESHES;
   final @Nullable RemovalListener<K, V> removalListener;
   final ConcurrentHashMap<K, V> data;
   final StatsCounter statsCounter;
   final boolean isRecordingStats;
   final Executor executor;
   final boolean isAsync;
   final Ticker ticker;
   @Nullable Set<K> keySet;
   @Nullable Collection<V> values;
   @Nullable Set<Entry<K, V>> entrySet;
   volatile @Nullable ConcurrentMap<Object, CompletableFuture<?>> refreshes;

   UnboundedLocalCache(Caffeine<? super K, ? super V> var1, boolean var2) {
      this.data = new ConcurrentHashMap<>(var1.getInitialCapacity());
      this.statsCounter = var1.getStatsCounterSupplier().get();
      this.removalListener = var1.getRemovalListener(var2);
      this.isRecordingStats = var1.isRecordingStats();
      this.executor = var1.getExecutor();
      this.ticker = var1.getTicker();
      this.isAsync = var2;
   }

   @Override
   public boolean isAsync() {
      return this.isAsync;
   }

   @Override
   public Expiry<K, V> expiry() {
      return null;
   }

   @CanIgnoreReturnValue
   @Override
   public Object referenceKey(K var1) {
      return var1;
   }

   @Override
   public boolean isPendingEviction(K var1) {
      return false;
   }

   @Override
   public @Nullable V getIfPresent(Object var1, boolean var2) {
      Object var3 = this.data.get(var1);
      if (var2) {
         if (var3 == null) {
            this.statsCounter.recordMisses(1);
         } else {
            this.statsCounter.recordHits(1);
         }
      }

      return (V)var3;
   }

   @Override
   public @Nullable V getIfPresentQuietly(K var1) {
      return this.data.get(var1);
   }

   @Override
   public long estimatedSize() {
      return this.data.mappingCount();
   }

   @Override
   public Map<K, V> getAllPresent(Iterable<? extends K> var1) {
      LinkedHashMap var2 = new LinkedHashMap(Caffeine.calculateHashMapCapacity(var1));

      for (Object var4 : var1) {
         var2.put(var4, null);
      }

      int var7 = var2.size();
      Iterator var8 = var2.entrySet().iterator();

      while (var8.hasNext()) {
         Entry var5 = (Entry)var8.next();
         Object var6 = this.data.get(var5.getKey());
         if (var6 == null) {
            var8.remove();
         } else {
            var5.setValue(var6);
         }
      }

      this.statsCounter.recordHits(var2.size());
      this.statsCounter.recordMisses(var7 - var2.size());
      return Collections.unmodifiableMap(var2);
   }

   @Override
   public void cleanUp() {
   }

   @Override
   public StatsCounter statsCounter() {
      return this.statsCounter;
   }

   private boolean hasRemovalListener() {
      return this.removalListener != null;
   }

   @Override
   public void notifyRemoval(@Nullable K var1, @Nullable V var2, RemovalCause var3) {
      if (this.hasRemovalListener()) {
         Runnable var4 = () -> {
            try {
               this.removalListener.onRemoval((K)var1, (V)var2, var3);
            } catch (Throwable var5) {
               logger.log(Level.WARNING, "Exception thrown by removal listener", var5);
            }
         };

         try {
            this.executor.execute(var4);
         } catch (Throwable var6) {
            logger.log(Level.ERROR, "Exception thrown when submitting removal listener", var6);
            var4.run();
         }
      }
   }

   @Override
   public boolean isRecordingStats() {
      return this.isRecordingStats;
   }

   @Override
   public Executor executor() {
      return this.executor;
   }

   @Override
   public ConcurrentMap<Object, CompletableFuture<?>> refreshes() {
      ConcurrentMap var1 = this.refreshes;
      if (var1 == null) {
         var1 = new ConcurrentHashMap();
         if (!REFRESHES.compareAndSet((UnboundedLocalCache)this, (Void)null, (ConcurrentMap)var1)) {
            var1 = this.refreshes;
         }
      }

      return var1;
   }

   void discardRefresh(Object var1) {
      ConcurrentMap var2 = this.refreshes;
      if (var2 != null) {
         var2.remove(var1);
      }
   }

   @Override
   public Ticker statsTicker() {
      return this.ticker;
   }

   @Override
   public void forEach(BiConsumer<? super K, ? super V> var1) {
      this.data.forEach(var1);
   }

   @Override
   public void replaceAll(BiFunction<? super K, ? super V, ? extends V> var1) {
      Object[] var2 = new Object[1];
      Object[] var3 = new Object[1];
      this.data.replaceAll((var4, var5) -> {
         if (var2[0] != null) {
            this.notifyRemoval((K)var2[0], (V)var3[0], RemovalCause.REPLACED);
            var3[0] = null;
            var2[0] = null;
         }

         Object var6 = Objects.requireNonNull(var1.apply(var4, var5));
         if (var6 != var5) {
            var2[0] = var4;
            var3[0] = var5;
         }

         return (V)var6;
      });
      if (var2[0] != null) {
         this.notifyRemoval((K)var2[0], (V)var3[0], RemovalCause.REPLACED);
      }
   }

   @Override
   public V computeIfAbsent(K var1, Function<? super K, ? extends V> var2, boolean var3, boolean var4) {
      Objects.requireNonNull(var2);
      Object var5 = this.data.get(var1);
      if (var5 != null) {
         if (var3) {
            this.statsCounter.recordHits(1);
         }

         return (V)var5;
      } else {
         boolean[] var6 = new boolean[1];
         var5 = this.data.computeIfAbsent((K)var1, var6x -> {
            var6[0] = true;
            return (V)(var3 ? this.statsAware(var2, var4).apply(var1) : var2.apply(var1));
         });
         if (!var6[0] && var3) {
            this.statsCounter.recordHits(1);
         }

         return (V)var5;
      }
   }

   @Override
   public @Nullable V computeIfPresent(K var1, BiFunction<? super K, ? super V, ? extends V> var2) {
      Objects.requireNonNull(var2);
      if (!this.data.containsKey(var1)) {
         return null;
      }

      Object[] var3 = new Object[1];
      boolean[] var4 = new boolean[1];
      Object var5 = this.data.computeIfPresent((K)var1, (var4x, var5x) -> {
         BiFunction var6 = this.statsAware(var2, true, true);
         Object var7 = var6.apply(var4x, var5x);
         var4[0] = var7 != null;
         if (var7 != var5x) {
            var3[0] = var5x;
         }

         this.discardRefresh(var4x);
         return (V)var7;
      });
      if (var4[0]) {
         this.notifyOnReplace((K)var1, (V)var3[0], (V)var5);
      } else if (var3[0] != null) {
         this.notifyRemoval((K)var1, (V)var3[0], RemovalCause.EXPLICIT);
      }

      return (V)var5;
   }

   @Override
   public V compute(K var1, BiFunction<? super K, ? super V, ? extends V> var2, @Nullable Expiry<? super K, ? super V> var3, boolean var4, boolean var5) {
      Objects.requireNonNull(var2);
      return this.remap((K)var1, this.statsAware(var2, var4, var5));
   }

   @Override
   public V merge(K var1, V var2, BiFunction<? super V, ? super V, ? extends V> var3) {
      Objects.requireNonNull(var3);
      Objects.requireNonNull(var2);
      return this.remap((K)var1, (var3x, var4) -> (V)(var4 == null ? var2 : this.statsAware(var3).apply(var4, var2)));
   }

   V remap(K var1, BiFunction<? super K, ? super V, ? extends V> var2) {
      Object[] var3 = new Object[1];
      boolean[] var4 = new boolean[1];
      Object var5 = this.data.compute((K)var1, (var4x, var5x) -> {
         Object var6 = var2.apply(var4x, var5x);
         if (var5x == null && var6 == null) {
            return null;
         }

         var4[0] = var6 != null;
         if (var5x != null && var6 != var5x) {
            var3[0] = var5x;
         }

         this.discardRefresh(var4x);
         return (V)var6;
      });
      if (var4[0]) {
         this.notifyOnReplace((K)var1, (V)var3[0], (V)var5);
      } else if (var3[0] != null) {
         this.notifyRemoval((K)var1, (V)var3[0], RemovalCause.EXPLICIT);
      }

      return (V)var5;
   }

   @Override
   public boolean isEmpty() {
      return this.data.isEmpty();
   }

   @Override
   public int size() {
      return this.data.size();
   }

   @Override
   public void clear() {
      if (this.hasRemovalListener() || this.refreshes != null && !this.refreshes.isEmpty()) {
         for (Object var2 : List.copyOf(this.data.keySet())) {
            this.remove(var2);
         }
      } else {
         this.data.clear();
      }
   }

   @Override
   public boolean containsKey(Object var1) {
      return this.data.containsKey(var1);
   }

   @Override
   public boolean containsValue(Object var1) {
      return this.data.containsValue(var1);
   }

   @Override
   public @Nullable V get(Object var1) {
      return this.getIfPresent(var1, false);
   }

   @Override
   public @Nullable V put(K var1, V var2) {
      Object var3 = this.data.put((K)var1, (V)var2);
      this.notifyOnReplace((K)var1, (V)var3, (V)var2);
      return (V)var3;
   }

   @Override
   public @Nullable V putIfAbsent(K var1, V var2) {
      return this.data.putIfAbsent((K)var1, (V)var2);
   }

   @Override
   public void putAll(Map<? extends K, ? extends V> var1) {
      if (this.hasRemovalListener()) {
         var1.forEach(this::put);
      } else {
         this.data.putAll(var1);
      }
   }

   @Override
   public @Nullable V remove(Object var1) {
      Object var2 = var1;
      Object[] var3 = new Object[1];
      this.data.computeIfPresent((K)var2, (var2x, var3x) -> {
         this.discardRefresh(var2x);
         var3[0] = var3x;
         return null;
      });
      if (var3[0] != null) {
         this.notifyRemoval((K)var2, (V)var3[0], RemovalCause.EXPLICIT);
      }

      return (V)var3[0];
   }

   @Override
   public boolean remove(Object var1, Object var2) {
      if (var2 == null) {
         return false;
      } else {
         Object var3 = var1;
         Object[] var4 = new Object[1];
         this.data.computeIfPresent((K)var3, (var3x, var4x) -> {
            if (var4x.equals(var2)) {
               this.discardRefresh(var3x);
               var4[0] = var4x;
               return null;
            } else {
               return (V)var4x;
            }
         });
         if (var4[0] != null) {
            this.notifyRemoval((K)var3, (V)var4[0], RemovalCause.EXPLICIT);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public @Nullable V replace(K var1, V var2) {
      Object[] var3 = new Object[1];
      this.data.computeIfPresent((K)var1, (var3x, var4) -> {
         this.discardRefresh(var3x);
         var3[0] = var4;
         return (V)var2;
      });
      if (var3[0] != null && var3[0] != var2) {
         this.notifyRemoval((K)var1, (V)var3[0], RemovalCause.REPLACED);
      }

      return (V)var3[0];
   }

   @Override
   public boolean replace(K var1, V var2, V var3) {
      return this.replace((K)var1, (V)var2, (V)var3, true);
   }

   @Override
   public boolean replace(K var1, V var2, V var3, boolean var4) {
      Objects.requireNonNull(var2);
      Object[] var5 = new Object[1];
      this.data.computeIfPresent((K)var1, (var5x, var6x) -> {
         if (var6x.equals(var2)) {
            if (var4) {
               this.discardRefresh(var5x);
            }

            var5[0] = var6x;
            return (V)var3;
         } else {
            return (V)var6x;
         }
      });
      boolean var6 = var5[0] != null;
      if (var6 && var5[0] != var3) {
         this.notifyRemoval((K)var1, (V)var5[0], RemovalCause.REPLACED);
      }

      return var6;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 == this || this.data.equals(var1);
   }

   @Override
   public int hashCode() {
      return this.data.hashCode();
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder(50).append('{');
      this.data.forEach((var2, var3) -> {
         if (var1.length() != 1) {
            var1.append(", ");
         }

         var1.append(var2 == this ? "(this Map)" : var2).append('=').append(var3 == this ? "(this Map)" : var3);
      });
      return var1.append('}').toString();
   }

   @Override
   public Set<K> keySet() {
      Set var1 = this.keySet;
      return var1 == null ? (this.keySet = new UnboundedLocalCache.KeySetView<>(this)) : var1;
   }

   @Override
   public Collection<V> values() {
      Collection var1 = this.values;
      return var1 == null ? (this.values = new UnboundedLocalCache.ValuesView<>(this)) : var1;
   }

   @Override
   public Set<Entry<K, V>> entrySet() {
      Set var1 = this.entrySet;
      return var1 == null ? (this.entrySet = new UnboundedLocalCache.EntrySetView<>(this)) : var1;
   }

   static {
      try {
         REFRESHES = MethodHandles.lookup().findVarHandle(UnboundedLocalCache.class, "refreshes", ConcurrentMap.class);
      } catch (ReflectiveOperationException var1) {
         throw new ExceptionInInitializerError(var1);
      }
   }

   static final class EntryIterator<K, V> implements Iterator<Entry<K, V>> {
      final UnboundedLocalCache<K, V> cache;
      final Iterator<Entry<K, V>> iterator;
      @Nullable Entry<K, V> entry;

      EntryIterator(UnboundedLocalCache<K, V> var1) {
         this.iterator = var1.data.entrySet().iterator();
         this.cache = var1;
      }

      @Override
      public boolean hasNext() {
         return this.iterator.hasNext();
      }

      public Entry<K, V> next() {
         this.entry = this.iterator.next();
         return new WriteThroughEntry<>(this.cache, this.entry.getKey(), this.entry.getValue());
      }

      @Override
      public void remove() {
         if (this.entry == null) {
            throw new IllegalStateException();
         }

         this.cache.remove(this.entry.getKey());
         this.entry = null;
      }
   }

   static final class EntrySetView<K, V> extends AbstractSet<Entry<K, V>> {
      final UnboundedLocalCache<K, V> cache;

      EntrySetView(UnboundedLocalCache<K, V> var1) {
         this.cache = Objects.requireNonNull(var1);
      }

      @Override
      public boolean isEmpty() {
         return this.cache.isEmpty();
      }

      @Override
      public int size() {
         return this.cache.size();
      }

      @Override
      public void clear() {
         this.cache.clear();
      }

      @Override
      public boolean contains(Object var1) {
         if (!(var1 instanceof Entry)) {
            return false;
         } else {
            Entry var2 = (Entry)var1;
            Object var3 = var2.getKey();
            Object var4 = var2.getValue();
            if (var3 != null && var4 != null) {
               Object var5 = this.cache.get(var3);
               return var5 != null && var5.equals(var4);
            } else {
               return false;
            }
         }
      }

      @Override
      public boolean removeAll(Collection<?> var1) {
         boolean var2 = false;
         if (var1 instanceof Set && var1.size() > this.size()) {
            for (Entry var6 : this) {
               if (var1.contains(var6)) {
                  var2 |= this.remove(var6);
               }
            }
         } else {
            for (Object var4 : var1) {
               var2 |= this.remove(var4);
            }
         }

         return var2;
      }

      @Override
      public boolean remove(Object var1) {
         if (!(var1 instanceof Entry)) {
            return false;
         }

         Entry var2 = (Entry)var1;
         Object var3 = var2.getKey();
         return var3 != null && this.cache.remove(var3, var2.getValue());
      }

      @Override
      public boolean removeIf(Predicate<? super Entry<K, V>> var1) {
         boolean var2 = false;

         for (Entry var4 : this.cache.data.entrySet()) {
            if (var1.test(var4)) {
               var2 |= this.cache.remove(var4.getKey(), var4.getValue());
            }
         }

         return var2;
      }

      @Override
      public boolean retainAll(Collection<?> var1) {
         boolean var2 = false;

         for (Entry var4 : this) {
            if (!var1.contains(var4) && this.remove(var4)) {
               var2 = true;
            }
         }

         return var2;
      }

      @Override
      public Iterator<Entry<K, V>> iterator() {
         return new UnboundedLocalCache.EntryIterator<>(this.cache);
      }

      @Override
      public Spliterator<Entry<K, V>> spliterator() {
         return new UnboundedLocalCache.EntrySpliterator<>(this.cache);
      }
   }

   static final class EntrySpliterator<K, V> implements Spliterator<Entry<K, V>> {
      final Spliterator<Entry<K, V>> spliterator;
      final UnboundedLocalCache<K, V> cache;

      EntrySpliterator(UnboundedLocalCache<K, V> var1) {
         this(var1, var1.data.entrySet().spliterator());
      }

      EntrySpliterator(UnboundedLocalCache<K, V> var1, Spliterator<Entry<K, V>> var2) {
         this.spliterator = Objects.requireNonNull(var2);
         this.cache = Objects.requireNonNull(var1);
      }

      @Override
      public void forEachRemaining(Consumer<? super Entry<K, V>> var1) {
         Objects.requireNonNull(var1);
         this.spliterator.forEachRemaining(var2 -> {
            WriteThroughEntry var3 = new WriteThroughEntry<>(this.cache, var2.getKey(), var2.getValue());
            var1.accept(var3);
         });
      }

      @Override
      public boolean tryAdvance(Consumer<? super Entry<K, V>> var1) {
         Objects.requireNonNull(var1);
         return this.spliterator.tryAdvance(var2 -> {
            WriteThroughEntry var3 = new WriteThroughEntry<>(this.cache, var2.getKey(), var2.getValue());
            var1.accept(var3);
         });
      }

      public UnboundedLocalCache.@Nullable EntrySpliterator<K, V> trySplit() {
         Spliterator var1 = this.spliterator.trySplit();
         return var1 == null ? null : new UnboundedLocalCache.EntrySpliterator<>(this.cache, var1);
      }

      @Override
      public long estimateSize() {
         return this.spliterator.estimateSize();
      }

      @Override
      public int characteristics() {
         return this.spliterator.characteristics();
      }
   }

   static final class KeyIterator<K> implements Iterator<K> {
      final UnboundedLocalCache<K, ?> cache;
      final Iterator<K> iterator;
      @Nullable K current;

      KeyIterator(UnboundedLocalCache<K, ?> var1) {
         this.iterator = var1.data.keySet().iterator();
         this.cache = var1;
      }

      @Override
      public boolean hasNext() {
         return this.iterator.hasNext();
      }

      @Override
      public K next() {
         this.current = this.iterator.next();
         return this.current;
      }

      @Override
      public void remove() {
         if (this.current == null) {
            throw new IllegalStateException();
         }

         this.cache.remove(this.current);
         this.current = null;
      }
   }

   static final class KeySetView<K> extends AbstractSet<K> {
      final UnboundedLocalCache<K, ?> cache;

      KeySetView(UnboundedLocalCache<K, ?> var1) {
         this.cache = Objects.requireNonNull(var1);
      }

      @Override
      public boolean isEmpty() {
         return this.cache.isEmpty();
      }

      @Override
      public int size() {
         return this.cache.size();
      }

      @Override
      public void clear() {
         this.cache.clear();
      }

      @Override
      public boolean contains(Object var1) {
         return this.cache.containsKey(var1);
      }

      @Override
      public boolean removeAll(Collection<?> var1) {
         boolean var2 = false;
         if (var1 instanceof Set && var1.size() > this.size()) {
            for (Object var6 : this) {
               if (var1.contains(var6)) {
                  var2 |= this.remove(var6);
               }
            }
         } else {
            for (Object var4 : var1) {
               var2 |= var4 != null && this.remove(var4);
            }
         }

         return var2;
      }

      @Override
      public boolean remove(Object var1) {
         return this.cache.remove(var1) != null;
      }

      @Override
      public boolean removeIf(Predicate<? super K> var1) {
         boolean var2 = false;

         for (Object var4 : this) {
            if (var1.test(var4) && this.remove(var4)) {
               var2 = true;
            }
         }

         return var2;
      }

      @Override
      public boolean retainAll(Collection<?> var1) {
         boolean var2 = false;

         for (Object var4 : this) {
            if (!var1.contains(var4) && this.remove(var4)) {
               var2 = true;
            }
         }

         return var2;
      }

      @Override
      public void forEach(Consumer<? super K> var1) {
         this.cache.data.keySet().forEach(var1);
      }

      @Override
      public Iterator<K> iterator() {
         return new UnboundedLocalCache.KeyIterator<>(this.cache);
      }

      @Override
      public Spliterator<K> spliterator() {
         return this.cache.data.keySet().spliterator();
      }
   }

   static final class UnboundedLocalAsyncCache<K, V> implements LocalAsyncCache<K, V>, Serializable {
      private static final long serialVersionUID = 1L;
      final UnboundedLocalCache<K, CompletableFuture<V>> cache;
      @Nullable ConcurrentMap<K, CompletableFuture<V>> mapView;
      LocalAsyncCache.@Nullable CacheView<K, V> cacheView;
      @Nullable Policy<K, V> policy;

      UnboundedLocalAsyncCache(Caffeine<K, V> var1) {
         this.cache = new UnboundedLocalCache<>(var1, true);
      }

      public UnboundedLocalCache<K, CompletableFuture<V>> cache() {
         return this.cache;
      }

      @Override
      public ConcurrentMap<K, CompletableFuture<V>> asMap() {
         return this.mapView == null ? (this.mapView = new LocalAsyncCache.AsyncAsMapView<>(this)) : this.mapView;
      }

      @Override
      public Cache<K, V> synchronous() {
         return this.cacheView == null ? (this.cacheView = new LocalAsyncCache.CacheView<>(this)) : this.cacheView;
      }

      @Override
      public Policy<K, V> policy() {
         UnboundedLocalCache var1 = this.cache;
         Function var2 = Async::getIfReady;
         Function var3 = var2;
         return this.policy == null ? (this.policy = new UnboundedLocalCache.UnboundedPolicy<>(var1, var3)) : this.policy;
      }

      private void readObject(ObjectInputStream var1) {
         throw new InvalidObjectException("Proxy required");
      }

      Object writeReplace() {
         SerializationProxy var1 = new SerializationProxy();
         var1.isRecordingStats = this.cache.isRecordingStats;
         var1.removalListener = this.cache.removalListener;
         var1.ticker = this.cache.ticker;
         var1.async = true;
         return var1;
      }
   }

   static final class UnboundedLocalAsyncLoadingCache<K, V> extends LocalAsyncLoadingCache<K, V> implements Serializable {
      private static final long serialVersionUID = 1L;
      final UnboundedLocalCache<K, CompletableFuture<V>> cache;
      @Nullable ConcurrentMap<K, CompletableFuture<V>> mapView;
      @Nullable Policy<K, V> policy;

      UnboundedLocalAsyncLoadingCache(Caffeine<K, V> var1, AsyncCacheLoader<? super K, V> var2) {
         super(var2);
         this.cache = new UnboundedLocalCache<>(var1, true);
      }

      @Override
      public LocalCache<K, CompletableFuture<V>> cache() {
         return this.cache;
      }

      @Override
      public ConcurrentMap<K, CompletableFuture<V>> asMap() {
         return this.mapView == null ? (this.mapView = new LocalAsyncCache.AsyncAsMapView<>(this)) : this.mapView;
      }

      @Override
      public Policy<K, V> policy() {
         UnboundedLocalCache var1 = this.cache;
         Function var2 = Async::getIfReady;
         Function var3 = var2;
         return this.policy == null ? (this.policy = new UnboundedLocalCache.UnboundedPolicy<>(var1, var3)) : this.policy;
      }

      private void readObject(ObjectInputStream var1) {
         throw new InvalidObjectException("Proxy required");
      }

      Object writeReplace() {
         SerializationProxy var1 = new SerializationProxy();
         var1.isRecordingStats = this.cache.isRecordingStats();
         var1.removalListener = this.cache.removalListener;
         var1.cacheLoader = this.cacheLoader;
         var1.ticker = this.cache.ticker;
         var1.async = true;
         return var1;
      }
   }

   static final class UnboundedLocalLoadingCache<K, V> extends UnboundedLocalCache.UnboundedLocalManualCache<K, V> implements LocalLoadingCache<K, V> {
      private static final long serialVersionUID = 1L;
      final Function<K, V> mappingFunction;
      final CacheLoader<? super K, V> cacheLoader;
      final @Nullable Function<Set<? extends K>, Map<K, V>> bulkMappingFunction;

      UnboundedLocalLoadingCache(Caffeine<K, V> var1, CacheLoader<? super K, V> var2) {
         super(var1);
         this.cacheLoader = var2;
         this.mappingFunction = LocalLoadingCache.newMappingFunction(var2);
         this.bulkMappingFunction = LocalLoadingCache.newBulkMappingFunction(var2);
      }

      @Override
      public AsyncCacheLoader<? super K, V> cacheLoader() {
         return this.cacheLoader;
      }

      @Override
      public Function<K, V> mappingFunction() {
         return this.mappingFunction;
      }

      @Override
      public @Nullable Function<Set<? extends K>, Map<K, V>> bulkMappingFunction() {
         return this.bulkMappingFunction;
      }

      @Override
      Object writeReplace() {
         SerializationProxy var1 = (SerializationProxy)super.writeReplace();
         var1.cacheLoader = this.cacheLoader;
         return var1;
      }

      private void readObject(ObjectInputStream var1) {
         throw new InvalidObjectException("Proxy required");
      }
   }

   static class UnboundedLocalManualCache<K, V> implements LocalManualCache<K, V>, Serializable {
      private static final long serialVersionUID = 1L;
      final UnboundedLocalCache<K, V> cache;
      @Nullable Policy<K, V> policy;

      UnboundedLocalManualCache(Caffeine<K, V> var1) {
         this.cache = new UnboundedLocalCache<>(var1, false);
      }

      public UnboundedLocalCache<K, V> cache() {
         return this.cache;
      }

      @Override
      public Policy<K, V> policy() {
         return this.policy == null ? (this.policy = new UnboundedLocalCache.UnboundedPolicy<>(this.cache, Function.identity())) : this.policy;
      }

      private void readObject(ObjectInputStream var1) {
         throw new InvalidObjectException("Proxy required");
      }

      Object writeReplace() {
         SerializationProxy var1 = new SerializationProxy();
         var1.isRecordingStats = this.cache.isRecordingStats;
         var1.removalListener = this.cache.removalListener;
         var1.ticker = this.cache.ticker;
         return var1;
      }
   }

   static final class UnboundedPolicy<K, V> implements Policy<K, V> {
      final UnboundedLocalCache<K, V> cache;
      final Function<V, V> transformer;

      UnboundedPolicy(UnboundedLocalCache<K, V> var1, Function<V, V> var2) {
         this.transformer = var2;
         this.cache = var1;
      }

      @Override
      public boolean isRecordingStats() {
         return this.cache.isRecordingStats;
      }

      @Override
      public @Nullable V getIfPresentQuietly(K var1) {
         return this.transformer.apply(this.cache.data.get(var1));
      }

      @Override
      public Policy.@Nullable CacheEntry<K, V> getEntryIfPresentQuietly(K var1) {
         Object var2 = this.transformer.apply(this.cache.data.get(var1));
         return var2 == null ? null : SnapshotEntry.forEntry((K)var1, (V)var2);
      }

      @Override
      public Map<K, CompletableFuture<V>> refreshes() {
         ConcurrentMap var1 = this.cache.refreshes;
         if (var1 != null && !var1.isEmpty()) {
            Map var2 = var1;
            return Collections.unmodifiableMap(new HashMap<>(var2));
         } else {
            return Collections.unmodifiableMap(Collections.emptyMap());
         }
      }

      @Override
      public Optional<Policy.Eviction<K, V>> eviction() {
         return Optional.empty();
      }

      @Override
      public Optional<Policy.FixedExpiration<K, V>> expireAfterAccess() {
         return Optional.empty();
      }

      @Override
      public Optional<Policy.FixedExpiration<K, V>> expireAfterWrite() {
         return Optional.empty();
      }

      @Override
      public Optional<Policy.VarExpiration<K, V>> expireVariably() {
         return Optional.empty();
      }

      @Override
      public Optional<Policy.FixedRefresh<K, V>> refreshAfterWrite() {
         return Optional.empty();
      }
   }

   static final class ValuesIterator<K, V> implements Iterator<V> {
      final UnboundedLocalCache<K, V> cache;
      final Iterator<Entry<K, V>> iterator;
      @Nullable Entry<K, V> entry;

      ValuesIterator(UnboundedLocalCache<K, V> var1) {
         this.iterator = var1.data.entrySet().iterator();
         this.cache = var1;
      }

      @Override
      public boolean hasNext() {
         return this.iterator.hasNext();
      }

      @Override
      public V next() {
         this.entry = this.iterator.next();
         return this.entry.getValue();
      }

      @Override
      public void remove() {
         if (this.entry == null) {
            throw new IllegalStateException();
         }

         this.cache.remove(this.entry.getKey());
         this.entry = null;
      }
   }

   static final class ValuesView<K, V> extends AbstractCollection<V> {
      final UnboundedLocalCache<K, V> cache;

      ValuesView(UnboundedLocalCache<K, V> var1) {
         this.cache = Objects.requireNonNull(var1);
      }

      @Override
      public boolean isEmpty() {
         return this.cache.isEmpty();
      }

      @Override
      public int size() {
         return this.cache.size();
      }

      @Override
      public void clear() {
         this.cache.clear();
      }

      @Override
      public boolean contains(Object var1) {
         return this.cache.containsValue(var1);
      }

      @Override
      public boolean removeAll(Collection<?> var1) {
         boolean var2 = false;

         for (Entry var4 : this.cache.data.entrySet()) {
            if (var1.contains(var4.getValue()) && this.cache.remove(var4.getKey(), var4.getValue())) {
               var2 = true;
            }
         }

         return var2;
      }

      @Override
      public boolean remove(Object var1) {
         if (var1 == null) {
            return false;
         }

         for (Entry var3 : this.cache.data.entrySet()) {
            if (var1.equals(var3.getValue()) && this.cache.remove(var3.getKey(), var3.getValue())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean removeIf(Predicate<? super V> var1) {
         boolean var2 = false;

         for (Entry var4 : this.cache.data.entrySet()) {
            if (var1.test(var4.getValue())) {
               var2 |= this.cache.remove(var4.getKey(), var4.getValue());
            }
         }

         return var2;
      }

      @Override
      public boolean retainAll(Collection<?> var1) {
         boolean var2 = false;

         for (Entry var4 : this.cache.data.entrySet()) {
            if (!var1.contains(var4.getValue()) && this.cache.remove(var4.getKey(), var4.getValue())) {
               var2 = true;
            }
         }

         return var2;
      }

      @Override
      public void forEach(Consumer<? super V> var1) {
         this.cache.data.values().forEach(var1);
      }

      @Override
      public Iterator<V> iterator() {
         return new UnboundedLocalCache.ValuesIterator<>(this.cache);
      }

      @Override
      public Spliterator<V> spliterator() {
         return this.cache.data.values().spliterator();
      }
   }
}
