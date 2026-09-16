package com.github.benmanes.caffeine.cache;

import com.github.benmanes.caffeine.cache.stats.CacheStats;
import java.io.Serializable;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.checkerframework.checker.nullness.qual.Nullable;

interface LocalAsyncCache<K, V> extends AsyncCache<K, V> {
   Logger logger = System.getLogger(LocalAsyncCache.class.getName());

   LocalCache<K, CompletableFuture<V>> cache();

   Policy<K, V> policy();

   @Override
   default @Nullable CompletableFuture<V> getIfPresent(K var1) {
      return this.cache().getIfPresent((K)var1, true);
   }

   @Override
   default CompletableFuture<V> get(K var1, Function<? super K, ? extends V> var2) {
      return this.get((K)var1, (var2x, var3) -> CompletableFuture.supplyAsync(() -> (V)var2.apply(var1), var3));
   }

   @Override
   default CompletableFuture<V> get(K var1, BiFunction<? super K, ? super Executor, ? extends CompletableFuture<? extends V>> var2) {
      return this.get((K)var1, var2, true);
   }

   default CompletableFuture<V> get(K var1, BiFunction<? super K, ? super Executor, ? extends CompletableFuture<? extends V>> var2, boolean var3) {
      long var4 = this.cache().statsTicker().read();
      CompletableFuture[] var6 = new CompletableFuture[1];
      CompletableFuture var7 = this.cache().computeIfAbsent((K)var1, var4x -> {
         CompletableFuture var5 = (CompletableFuture)var2.apply(var1, this.cache().executor());
         var6[0] = var5;
         return Objects.requireNonNull(var5);
      }, var3, false);
      if (var6[0] != null) {
         this.handleCompletion((K)var1, var6[0], var4, false);
      }

      return var7;
   }

   @Override
   default CompletableFuture<Map<K, V>> getAll(Iterable<? extends K> var1, Function<? super Set<? extends K>, ? extends Map<? extends K, ? extends V>> var2) {
      return this.getAll(var1, (var1x, var2x) -> CompletableFuture.supplyAsync(() -> (Map<? extends K, ? extends V>)var2.apply(var1x), var2x));
   }

   @Override
   default CompletableFuture<Map<K, V>> getAll(
      Iterable<? extends K> var1,
      BiFunction<? super Set<? extends K>, ? super Executor, ? extends CompletableFuture<? extends Map<? extends K, ? extends V>>> var2
   ) {
      Objects.requireNonNull(var2);
      Objects.requireNonNull(var1);
      int var3 = Caffeine.calculateHashMapCapacity(var1);
      LinkedHashMap var4 = new LinkedHashMap(var3);
      HashMap var5 = new HashMap(var3);

      for (Object var7 : var1) {
         if (!var4.containsKey(var7)) {
            CompletableFuture var8 = this.cache().getIfPresent((K)var7, false);
            if (var8 == null) {
               CompletableFuture var9 = new CompletableFuture();
               var8 = this.cache().putIfAbsent((K)var7, var9);
               if (var8 == null) {
                  var8 = var9;
                  var5.put(var7, var9);
               }
            }

            var4.put(var7, var8);
         }
      }

      this.cache().statsCounter().recordMisses(var5.size());
      this.cache().statsCounter().recordHits(var4.size() - var5.size());
      if (var5.isEmpty()) {
         return composeResult(var4);
      }

      LocalAsyncCache.AsyncBulkCompleter var11 = new LocalAsyncCache.AsyncBulkCompleter<>(this.cache(), var5);

      try {
         CompletableFuture var12 = (CompletableFuture)var2.apply(Collections.unmodifiableSet(var5.keySet()), this.cache().executor());
         var12.whenComplete(var11);
         return composeResult(var4);
      } catch (Throwable var10) {
         var11.accept(null, var10);
         throw var10;
      }
   }

   static <K, V> CompletableFuture<Map<K, V>> composeResult(Map<K, CompletableFuture<V>> var0) {
      if (var0.isEmpty()) {
         Map var2 = Collections.unmodifiableMap(Collections.emptyMap());
         return CompletableFuture.completedFuture(var2);
      } else {
         CompletableFuture[] var1 = var0.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf(var1).thenApply(var1x -> {
            LinkedHashMap var2x = new LinkedHashMap(Caffeine.calculateHashMapCapacity(var0.size()));
            var0.forEach((var1xx, var2xx) -> {
               Object var3 = var2xx.getNow(null);
               if (var3 != null) {
                  var2x.put(var1xx, var3);
               }
            });
            return Collections.unmodifiableMap(var2x);
         });
      }
   }

   @Override
   default void put(K var1, CompletableFuture<? extends V> var2) {
      if (!var2.isCompletedExceptionally() && (!var2.isDone() || var2.join() != null)) {
         long var3 = this.cache().statsTicker().read();
         CompletableFuture var5 = var2;
         this.cache().put((K)var1, var5);
         this.handleCompletion((K)var1, var2, var3, false);
      } else {
         this.cache().statsCounter().recordLoadFailure(0L);
         this.cache().remove(var1);
      }
   }

   default void handleCompletion(K var1, CompletableFuture<? extends V> var2, long var3, boolean var5) {
      AtomicBoolean var6 = new AtomicBoolean();
      var2.whenComplete((var7, var8) -> {
         if (var6.compareAndSet(false, true)) {
            long var9 = this.cache().statsTicker().read() - var3;
            if (var7 == null) {
               if (var8 != null && !(var8 instanceof CancellationException) && !(var8 instanceof TimeoutException)) {
                  logger.log(Level.WARNING, "Exception thrown during asynchronous load", var8);
               }

               this.cache().statsCounter().recordLoadFailure(var9);
               this.cache().remove(var1, var2);
            } else {
               CompletableFuture var11 = var2;
               this.cache().statsCounter().recordLoadSuccess(var9);
               this.cache().replace((K)var1, var11, var11, false);
            }

            if (var5) {
               this.cache().statsCounter().recordMisses(1);
            }
         }
      });
   }

   abstract class AbstractCacheView<K, V> implements Cache<K, V>, Serializable {
      private static final long serialVersionUID = 1L;
      transient @Nullable ConcurrentMap<K, V> asMapView;

      abstract LocalAsyncCache<K, V> asyncCache();

      @Override
      public @Nullable V getIfPresent(K var1) {
         CompletableFuture var2 = this.asyncCache().cache().getIfPresent((K)var1, true);
         return Async.getIfReady(var2);
      }

      @Override
      public Map<K, V> getAllPresent(Iterable<? extends K> var1) {
         LinkedHashMap var2 = new LinkedHashMap(Caffeine.calculateHashMapCapacity(var1));

         for (Object var4 : var1) {
            var2.put(var4, null);
         }

         int var8 = var2.size();
         Iterator var9 = var2.entrySet().iterator();

         while (var9.hasNext()) {
            Entry var5 = (Entry)var9.next();
            CompletableFuture var6 = this.asyncCache().cache().get(var5.getKey());
            Object var7 = Async.getIfReady(var6);
            if (var7 == null) {
               var9.remove();
            } else {
               var5.setValue(var7);
            }
         }

         this.asyncCache().cache().statsCounter().recordHits(var2.size());
         this.asyncCache().cache().statsCounter().recordMisses(var8 - var2.size());
         return Collections.unmodifiableMap(var2);
      }

      @Override
      public V get(K var1, Function<? super K, ? extends V> var2) {
         return resolve(this.asyncCache().get((K)var1, var2));
      }

      @Override
      public Map<K, V> getAll(Iterable<? extends K> var1, Function<? super Set<? extends K>, ? extends Map<? extends K, ? extends V>> var2) {
         return resolve(this.asyncCache().getAll(var1, var2));
      }

      protected static <T> T resolve(CompletableFuture<T> var0) {
         try {
            return (T)var0.join();
         } catch (LocalAsyncCache.AsyncBulkCompleter.NullMapCompletionException var2) {
            throw new NullPointerException("null map");
         } catch (CompletionException var3) {
            if (var3.getCause() instanceof RuntimeException) {
               throw (RuntimeException)var3.getCause();
            } else if (var3.getCause() instanceof Error) {
               throw (Error)var3.getCause();
            } else {
               throw var3;
            }
         }
      }

      @Override
      public void put(K var1, V var2) {
         Objects.requireNonNull(var2);
         this.asyncCache().cache().put((K)var1, CompletableFuture.completedFuture((V)var2));
      }

      @Override
      public void putAll(Map<? extends K, ? extends V> var1) {
         var1.forEach(this::put);
      }

      @Override
      public void invalidate(K var1) {
         this.asyncCache().cache().remove(var1);
      }

      @Override
      public void invalidateAll(Iterable<? extends K> var1) {
         this.asyncCache().cache().invalidateAll(var1);
      }

      @Override
      public void invalidateAll() {
         this.asyncCache().cache().clear();
      }

      @Override
      public long estimatedSize() {
         return this.asyncCache().cache().estimatedSize();
      }

      @Override
      public CacheStats stats() {
         return this.asyncCache().cache().statsCounter().snapshot();
      }

      @Override
      public void cleanUp() {
         this.asyncCache().cache().cleanUp();
      }

      @Override
      public Policy<K, V> policy() {
         return this.asyncCache().policy();
      }

      @Override
      public ConcurrentMap<K, V> asMap() {
         return this.asMapView == null ? (this.asMapView = new LocalAsyncCache.AsMapView<>(this.asyncCache().cache())) : this.asMapView;
      }
   }

   final class AsMapView<K, V> implements ConcurrentMap<K, V> {
      final LocalCache<K, CompletableFuture<V>> delegate;
      @Nullable Collection<V> values;
      @Nullable Set<Entry<K, V>> entries;

      AsMapView(LocalCache<K, CompletableFuture<V>> var1) {
         this.delegate = var1;
      }

      @Override
      public boolean isEmpty() {
         return this.delegate.isEmpty();
      }

      @Override
      public int size() {
         return this.delegate.size();
      }

      @Override
      public void clear() {
         this.delegate.clear();
      }

      @Override
      public boolean containsKey(Object var1) {
         return this.delegate.containsKey(var1);
      }

      @Override
      public boolean containsValue(Object var1) {
         Objects.requireNonNull(var1);

         for (CompletableFuture var3 : this.delegate.values()) {
            if (var1.equals(Async.getIfReady(var3))) {
               return true;
            }
         }

         return false;
      }

      @Override
      public @Nullable V get(Object var1) {
         return Async.getIfReady(this.delegate.get(var1));
      }

      @Override
      public @Nullable V putIfAbsent(K var1, V var2) {
         CompletableFuture var3 = null;

         while (true) {
            var3 = var3 == null ? this.delegate.get(var1) : this.delegate.getIfPresentQuietly((K)var1);
            if (var3 != null) {
               if (!var3.isDone()) {
                  Async.getWhenSuccessful(var3);
                  continue;
               }

               Object var4 = Async.getWhenSuccessful(var3);
               if (var4 != null) {
                  return (V)var4;
               }
            }

            boolean[] var7 = new boolean[]{false};
            CompletableFuture var5 = this.delegate.compute((K)var1, (var2x, var3x) -> {
               var7[0] = var3x == null || var3x.isDone() && Async.<V>getIfReady((CompletableFuture<V>)var3x) == null;
               return var7[0] ? CompletableFuture.completedFuture((V)var2) : var3x;
            }, this.delegate.expiry(), false, false);
            if (var7[0]) {
               return null;
            }

            Object var6 = Async.getWhenSuccessful(var5);
            if (var6 != null) {
               return (V)var6;
            }
         }
      }

      @Override
      public void putAll(Map<? extends K, ? extends V> var1) {
         var1.forEach(this::put);
      }

      @Override
      public @Nullable V put(K var1, V var2) {
         Objects.requireNonNull(var2);
         CompletableFuture var3 = this.delegate.put((K)var1, CompletableFuture.completedFuture((V)var2));
         return Async.getWhenSuccessful(var3);
      }

      @Override
      public @Nullable V remove(Object var1) {
         CompletableFuture var2 = this.delegate.remove(var1);
         return Async.getWhenSuccessful(var2);
      }

      @Override
      public boolean remove(Object var1, Object var2) {
         Objects.requireNonNull(var1);
         if (var2 == null) {
            return false;
         }

         Object var3 = var1;
         boolean[] var4 = new boolean[]{false};
         boolean[] var5 = new boolean[]{false};
         CompletableFuture var6 = null;

         do {
            var6 = var6 == null ? this.delegate.get(var3) : this.delegate.getIfPresentQuietly((K)var3);
            if (var6 == null || var6.isCompletedExceptionally()) {
               return false;
            }

            Async.getWhenSuccessful(var6);
            this.delegate.compute((K)var3, (var3x, var4x) -> {
               if (var4x == null) {
                  var4[0] = true;
                  return null;
               }

               if (!var4x.isDone()) {
                  return var4x;
               }

               var4[0] = true;
               Object var5x = Async.getIfReady((CompletableFuture<V>)var4x);
               var5[0] = var2.equals(var5x);
               return var5x != null && !var5[0] ? var4x : null;
            }, this.delegate.expiry(), false, true);
         } while (!var4[0]);

         return var5[0];
      }

      @Override
      public @Nullable V replace(K var1, V var2) {
         Object[] var3 = new Object[1];
         boolean[] var4 = new boolean[]{false};

         do {
            CompletableFuture var5 = this.delegate.getIfPresentQuietly((K)var1);
            if (var5 == null || var5.isCompletedExceptionally()) {
               return null;
            }

            Async.getWhenSuccessful(var5);
            this.delegate.compute((K)var1, (var3x, var4x) -> {
               if (var4x == null) {
                  var4[0] = true;
                  return null;
               }

               if (!var4x.isDone()) {
                  return var4x;
               }

               var4[0] = true;
               var3[0] = Async.getIfReady((CompletableFuture<V>)var4x);
               return var3[0] == null ? null : CompletableFuture.completedFuture((V)var2);
            }, this.delegate.expiry(), false, false);
         } while (!var4[0]);

         return (V)var3[0];
      }

      @Override
      public boolean replace(K var1, V var2, V var3) {
         Objects.requireNonNull(var2);
         boolean[] var4 = new boolean[]{false};
         boolean[] var5 = new boolean[]{false};

         do {
            CompletableFuture var6 = this.delegate.getIfPresentQuietly((K)var1);
            if (var6 == null || var6.isCompletedExceptionally()) {
               return false;
            }

            Async.getWhenSuccessful(var6);
            this.delegate.compute((K)var1, (var4x, var5x) -> {
               if (var5x == null) {
                  var4[0] = true;
                  return null;
               }

               if (!var5x.isDone()) {
                  return var5x;
               }

               var4[0] = true;
               var5[0] = var2.equals(Async.getIfReady((CompletableFuture<V>)var5x));
               return var5[0] ? CompletableFuture.completedFuture((V)var3) : var5x;
            }, this.delegate.expiry(), false, false);
         } while (!var4[0]);

         return var5[0];
      }

      @Override
      public @Nullable V computeIfAbsent(K var1, Function<? super K, ? extends V> var2) {
         CompletableFuture var3 = null;

         while (true) {
            while (true) {
               var3 = var3 == null ? this.delegate.get(var1) : this.delegate.getIfPresentQuietly((K)var1);
               if (var3 == null) {
                  break;
               }

               if (var3.isDone()) {
                  Object var4 = Async.getWhenSuccessful(var3);
                  if (var4 != null) {
                     this.delegate.statsCounter().recordHits(1);
                     return (V)var4;
                  }
                  break;
               }

               Async.getWhenSuccessful(var3);
            }

            CompletableFuture[] var7 = new CompletableFuture[1];
            CompletableFuture var5 = this.delegate.compute((K)var1, (var4x, var5x) -> {
               if (var5x != null && var5x.isDone() && Async.<V>getIfReady((CompletableFuture<V>)var5x) != null) {
                  return var5x;
               }

               Object var6x = this.delegate.statsAware(var2, true).apply(var1);
               if (var6x == null) {
                  return null;
               }

               var7[0] = CompletableFuture.completedFuture(var6x);
               return var7[0];
            }, this.delegate.expiry(), false, false);
            Object var6 = Async.getWhenSuccessful(var5);
            if (var5 == var7[0] || var6 != null) {
               return (V)var6;
            }
         }
      }

      @Override
      public @Nullable V computeIfPresent(K var1, BiFunction<? super K, ? super V, ? extends V> var2) {
         Object[] var3 = new Object[1];

         CompletableFuture var4;
         do {
            Async.getWhenSuccessful(this.delegate.getIfPresentQuietly((K)var1));
            var4 = this.delegate.computeIfPresent((K)var1, (var3x, var4x) -> {
               if (!var4x.isDone()) {
                  return var4x;
               }

               Object var5 = Async.getIfReady((CompletableFuture<V>)var4x);
               if (var5 == null) {
                  return null;
               }

               var3[0] = var2.apply(var1, var5);
               return var3[0] == null ? null : CompletableFuture.completedFuture((V)var3[0]);
            });
            if (var3[0] != null) {
               return (V)var3[0];
            }
         } while (var4 != null);

         return null;
      }

      @Override
      public @Nullable V compute(K var1, BiFunction<? super K, ? super V, ? extends V> var2) {
         Object[] var3 = new Object[1];

         CompletableFuture var4;
         do {
            Async.getWhenSuccessful(this.delegate.getIfPresentQuietly((K)var1));
            var4 = this.delegate.compute((K)var1, (var4x, var5) -> {
               if (var5 != null && !var5.isDone()) {
                  return var5;
               }

               Object var6 = Async.getIfReady((CompletableFuture<V>)var5);
               BiFunction var7 = this.delegate.statsAware(var2, true, true);
               var3[0] = var7.apply(var1, var6);
               return var3[0] == null ? null : CompletableFuture.completedFuture((V)var3[0]);
            }, this.delegate.expiry(), false, false);
            if (var3[0] != null) {
               return (V)var3[0];
            }
         } while (var4 != null);

         return null;
      }

      @Override
      public @Nullable V merge(K var1, V var2, BiFunction<? super V, ? super V, ? extends V> var3) {
         Objects.requireNonNull(var2);
         Objects.requireNonNull(var3);
         CompletableFuture var4 = CompletableFuture.completedFuture(var2);
         boolean[] var5 = new boolean[]{false};

         CompletableFuture var6;
         do {
            Async.getWhenSuccessful(this.delegate.getIfPresentQuietly((K)var1));
            var6 = this.delegate.merge((K)var1, var4, (var3x, var4x) -> {
               if (var3x != null && !var3x.isDone()) {
                  return var3x;
               } else {
                  var5[0] = true;
                  Object var5x = Async.getIfReady((CompletableFuture<V>)var3x);
                  if (var5x == null) {
                     return var4x;
                  } else {
                     Object var6x = var3.apply(var5x, var2);
                     if (var6x == null) {
                        return null;
                     } else if (var6x == var5x) {
                        return var3x;
                     } else {
                        return var6x == var2 ? var4x : CompletableFuture.completedFuture((V)var6x);
                     }
                  }
               }
            });
         } while (!var5[0] && var6 != var4);

         return Async.getWhenSuccessful(var6);
      }

      @Override
      public Set<K> keySet() {
         return this.delegate.keySet();
      }

      @Override
      public Collection<V> values() {
         return this.values == null ? (this.values = new LocalAsyncCache.AsMapView.Values()) : this.values;
      }

      @Override
      public Set<Entry<K, V>> entrySet() {
         return this.entries == null ? (this.entries = new LocalAsyncCache.AsMapView.EntrySet()) : this.entries;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         }

         if (!(var1 instanceof Map)) {
            return false;
         }

         Map var2 = (Map)var1;
         int var3 = this.size();
         if (var2.size() != var3) {
            return false;
         }

         int var4 = 0;

         for (LocalAsyncCache.AsMapView.EntryIterator var5 = new LocalAsyncCache.AsMapView.EntryIterator(); var5.hasNext(); var4++) {
            Entry var6 = var5.next();
            Object var7 = var2.get(var6.getKey());
            if (var7 == null || var7 != var6.getValue() && !var7.equals(var6.getValue())) {
               return false;
            }
         }

         return var4 == var3;
      }

      @Override
      public int hashCode() {
         int var1 = 0;
         LocalAsyncCache.AsMapView.EntryIterator var2 = new LocalAsyncCache.AsMapView.EntryIterator();

         while (var2.hasNext()) {
            Entry var3 = var2.next();
            var1 += var3.hashCode();
         }

         return var1;
      }

      @Override
      public String toString() {
         StringBuilder var1 = new StringBuilder(50).append('{');
         LocalAsyncCache.AsMapView.EntryIterator var2 = new LocalAsyncCache.AsMapView.EntryIterator();

         while (var2.hasNext()) {
            Entry var3 = var2.next();
            var1.append(var3.getKey() == this ? "(this Map)" : var3.getKey()).append('=').append(var3.getValue() == this ? "(this Map)" : var3.getValue());
            if (var2.hasNext()) {
               var1.append(", ");
            }
         }

         return var1.append('}').toString();
      }

      private final class EntryIterator implements Iterator<Entry<K, V>> {
         final Iterator<Entry<K, CompletableFuture<V>>> iterator = AsMapView.this.delegate.entrySet().iterator();
         @Nullable Entry<K, V> cursor;
         @Nullable Object removalKey;

         EntryIterator() {
         }

         @Override
         public boolean hasNext() {
            while (this.cursor == null && this.iterator.hasNext()) {
               Entry var1 = this.iterator.next();
               Object var2 = Async.getIfReady((CompletableFuture<V>)var1.getValue());
               if (var2 != null) {
                  this.cursor = new WriteThroughEntry<>(AsMapView.this, (K)var1.getKey(), (V)var2);
               }
            }

            return this.cursor != null;
         }

         public Entry<K, V> next() {
            if (!this.hasNext()) {
               throw new NoSuchElementException();
            }

            Object var1 = this.cursor.getKey();
            Entry var2 = this.cursor;
            this.removalKey = var1;
            this.cursor = null;
            return var2;
         }

         @Override
         public void remove() {
            Caffeine.requireState(this.removalKey != null);
            AsMapView.this.delegate.remove(this.removalKey);
            this.removalKey = null;
         }
      }

      private final class EntrySet extends AbstractSet<Entry<K, V>> {
         @Override
         public boolean isEmpty() {
            return AsMapView.this.isEmpty();
         }

         @Override
         public int size() {
            return AsMapView.this.size();
         }

         @Override
         public void clear() {
            AsMapView.this.clear();
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
                  Object var5 = AsMapView.this.get(var3);
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
            return var3 != null && AsMapView.this.remove(var3, var2.getValue());
         }

         @Override
         public boolean removeIf(Predicate<? super Entry<K, V>> var1) {
            boolean var2 = false;

            for (Entry var4 : this) {
               if (var1.test(var4)) {
                  var2 |= AsMapView.this.remove(var4.getKey(), var4.getValue());
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
            return AsMapView.this.new EntryIterator();
         }
      }

      private final class Values extends AbstractCollection<V> {
         @Override
         public boolean isEmpty() {
            return AsMapView.this.isEmpty();
         }

         @Override
         public int size() {
            return AsMapView.this.size();
         }

         @Override
         public void clear() {
            AsMapView.this.clear();
         }

         @Override
         public boolean contains(Object var1) {
            return AsMapView.this.containsValue(var1);
         }

         @Override
         public boolean removeAll(Collection<?> var1) {
            boolean var2 = false;

            for (Entry var4 : AsMapView.this.delegate.entrySet()) {
               Object var5 = Async.getIfReady((CompletableFuture<V>)var4.getValue());
               if (var5 != null && var1.contains(var5) && AsMapView.this.remove(var4.getKey(), var5)) {
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

            for (Entry var3 : AsMapView.this.delegate.entrySet()) {
               Object var4 = Async.getIfReady((CompletableFuture<V>)var3.getValue());
               if (var4 != null && var4.equals(var1) && AsMapView.this.remove(var3.getKey(), var4)) {
                  return true;
               }
            }

            return false;
         }

         @Override
         public boolean removeIf(Predicate<? super V> var1) {
            return AsMapView.this.delegate.values().removeIf(var1x -> {
               Object var2 = Async.getIfReady((CompletableFuture<V>)var1x);
               return var2 != null && var1.test(var2);
            });
         }

         @Override
         public boolean retainAll(Collection<?> var1) {
            boolean var2 = false;

            for (Entry var4 : AsMapView.this.delegate.entrySet()) {
               Object var5 = Async.getIfReady((CompletableFuture<V>)var4.getValue());
               if (var5 != null && !var1.contains(var5) && AsMapView.this.remove(var4.getKey(), var5)) {
                  var2 = true;
               }
            }

            return var2;
         }

         @Override
         public void forEach(Consumer<? super V> var1) {
            AsMapView.this.delegate.values().forEach(var1x -> {
               Object var2 = Async.getIfReady((CompletableFuture<V>)var1x);
               if (var2 != null) {
                  var1.accept(var2);
               }
            });
         }

         @Override
         public Iterator<V> iterator() {
            return new Iterator<V>() {
               final Iterator<Entry<K, V>> iterator = AsMapView.this.entrySet().iterator();

               @Override
               public boolean hasNext() {
                  return this.iterator.hasNext();
               }

               @Override
               public V next() {
                  return this.iterator.next().getValue();
               }

               @Override
               public void remove() {
                  this.iterator.remove();
               }
            };
         }
      }
   }

   final class AsyncAsMapView<K, V> implements ConcurrentMap<K, CompletableFuture<V>> {
      final LocalAsyncCache<K, V> asyncCache;

      AsyncAsMapView(LocalAsyncCache<K, V> var1) {
         this.asyncCache = Objects.requireNonNull(var1);
      }

      @Override
      public boolean isEmpty() {
         return this.asyncCache.cache().isEmpty();
      }

      @Override
      public int size() {
         return this.asyncCache.cache().size();
      }

      @Override
      public void clear() {
         this.asyncCache.cache().clear();
      }

      @Override
      public boolean containsKey(Object var1) {
         return this.asyncCache.cache().containsKey(var1);
      }

      @Override
      public boolean containsValue(Object var1) {
         return this.asyncCache.cache().containsValue(var1);
      }

      public @Nullable CompletableFuture<V> get(Object var1) {
         return this.asyncCache.cache().get(var1);
      }

      public CompletableFuture<V> putIfAbsent(K var1, CompletableFuture<V> var2) {
         CompletableFuture var3 = this.asyncCache.cache().putIfAbsent((K)var1, var2);
         long var4 = this.asyncCache.cache().statsTicker().read();
         if (var3 == null) {
            this.asyncCache.handleCompletion((K)var1, var2, var4, false);
         }

         return var3;
      }

      public CompletableFuture<V> put(K var1, CompletableFuture<V> var2) {
         CompletableFuture var3 = this.asyncCache.cache().put((K)var1, var2);
         long var4 = this.asyncCache.cache().statsTicker().read();
         this.asyncCache.handleCompletion((K)var1, var2, var4, false);
         return var3;
      }

      @Override
      public void putAll(Map<? extends K, ? extends CompletableFuture<V>> var1) {
         var1.forEach(this::put);
      }

      public CompletableFuture<V> replace(K var1, CompletableFuture<V> var2) {
         CompletableFuture var3 = this.asyncCache.cache().replace((K)var1, var2);
         long var4 = this.asyncCache.cache().statsTicker().read();
         if (var3 != null) {
            this.asyncCache.handleCompletion((K)var1, var2, var4, false);
         }

         return var3;
      }

      public boolean replace(K var1, CompletableFuture<V> var2, CompletableFuture<V> var3) {
         boolean var4 = this.asyncCache.cache().replace((K)var1, var2, var3);
         long var5 = this.asyncCache.cache().statsTicker().read();
         if (var4) {
            this.asyncCache.handleCompletion((K)var1, var3, var5, false);
         }

         return var4;
      }

      public CompletableFuture<V> remove(Object var1) {
         return this.asyncCache.cache().remove(var1);
      }

      @Override
      public boolean remove(Object var1, Object var2) {
         return this.asyncCache.cache().remove(var1, var2);
      }

      public @Nullable CompletableFuture<V> computeIfAbsent(K var1, Function<? super K, ? extends CompletableFuture<V>> var2) {
         CompletableFuture[] var3 = new CompletableFuture[1];
         long var4 = this.asyncCache.cache().statsTicker().read();
         CompletableFuture var6 = this.asyncCache.cache().computeIfAbsent((K)var1, var2x -> {
            var3[0] = (CompletableFuture)var2.apply(var2x);
            return var3[0];
         }, false, false);
         if (var3[0] == null) {
            if (var6 != null && this.asyncCache.cache().isRecordingStats()) {
               var6.whenComplete((var1x, var2x) -> {
                  if (var1x != null || var2x == null) {
                     this.asyncCache.cache().statsCounter().recordHits(1);
                  }
               });
            }
         } else {
            this.asyncCache.handleCompletion((K)var1, var3[0], var4, true);
         }

         return var6;
      }

      public CompletableFuture<V> computeIfPresent(K var1, BiFunction<? super K, ? super CompletableFuture<V>, ? extends CompletableFuture<V>> var2) {
         CompletableFuture[] var3 = new CompletableFuture[1];
         long var4 = this.asyncCache.cache().statsTicker().read();
         this.asyncCache.cache().compute((K)var1, (var2x, var3x) -> {
            var3[0] = var3x == null ? null : (CompletableFuture)var2.apply(var2x, var3x);
            return var3[0];
         }, this.asyncCache.cache().expiry(), false, false);
         if (var3[0] != null) {
            this.asyncCache.handleCompletion((K)var1, var3[0], var4, false);
         }

         return var3[0];
      }

      public CompletableFuture<V> compute(K var1, BiFunction<? super K, ? super CompletableFuture<V>, ? extends CompletableFuture<V>> var2) {
         CompletableFuture[] var3 = new CompletableFuture[1];
         long var4 = this.asyncCache.cache().statsTicker().read();
         this.asyncCache.cache().compute((K)var1, (var2x, var3x) -> {
            var3[0] = (CompletableFuture)var2.apply(var2x, var3x);
            return var3[0];
         }, this.asyncCache.cache().expiry(), false, false);
         if (var3[0] != null) {
            this.asyncCache.handleCompletion((K)var1, var3[0], var4, false);
         }

         return var3[0];
      }

      public CompletableFuture<V> merge(
         K var1, CompletableFuture<V> var2, BiFunction<? super CompletableFuture<V>, ? super CompletableFuture<V>, ? extends CompletableFuture<V>> var3
      ) {
         Objects.requireNonNull(var2);
         CompletableFuture[] var4 = new CompletableFuture[1];
         long var5 = this.asyncCache.cache().statsTicker().read();
         this.asyncCache.cache().compute((K)var1, (var3x, var4x) -> {
            var4[0] = var4x == null ? var2 : (CompletableFuture)var3.apply(var4x, var2);
            return var4[0];
         }, this.asyncCache.cache().expiry(), false, false);
         if (var4[0] != null) {
            this.asyncCache.handleCompletion((K)var1, var4[0], var5, false);
         }

         return var4[0];
      }

      @Override
      public void forEach(BiConsumer<? super K, ? super CompletableFuture<V>> var1) {
         this.asyncCache.cache().forEach(var1);
      }

      @Override
      public Set<K> keySet() {
         return this.asyncCache.cache().keySet();
      }

      @Override
      public Collection<CompletableFuture<V>> values() {
         return this.asyncCache.cache().values();
      }

      @Override
      public Set<Entry<K, CompletableFuture<V>>> entrySet() {
         return this.asyncCache.cache().entrySet();
      }

      @Override
      public boolean equals(Object var1) {
         return this.asyncCache.cache().equals(var1);
      }

      @Override
      public int hashCode() {
         return this.asyncCache.cache().hashCode();
      }

      @Override
      public String toString() {
         return this.asyncCache.cache().toString();
      }
   }

   final class AsyncBulkCompleter<K, V> implements BiConsumer<Map<? extends K, ? extends V>, Throwable> {
      private final LocalCache<K, CompletableFuture<V>> cache;
      private final Map<K, CompletableFuture<V>> proxies;
      private final long startTime;

      AsyncBulkCompleter(LocalCache<K, CompletableFuture<V>> var1, Map<K, CompletableFuture<V>> var2) {
         this.startTime = var1.statsTicker().read();
         this.proxies = var2;
         this.cache = var1;
      }

      public void accept(@Nullable Map<? extends K, ? extends V> var1, @Nullable Throwable var2) {
         long var3 = this.cache.statsTicker().read() - this.startTime;
         if (var1 == null) {
            if (var2 == null) {
               var2 = new LocalAsyncCache.AsyncBulkCompleter.NullMapCompletionException();
            }

            for (Entry var6 : this.proxies.entrySet()) {
               this.cache.remove(var6.getKey(), var6.getValue());
               ((CompletableFuture)var6.getValue()).obtrudeException(var2);
            }

            this.cache.statsCounter().recordLoadFailure(var3);
            if (!(var2 instanceof CancellationException) && !(var2 instanceof TimeoutException)) {
               LocalAsyncCache.logger.log(Level.WARNING, "Exception thrown during asynchronous load", var2);
            }
         } else {
            this.fillProxies(var1);
            this.addNewEntries(var1);
            this.cache.statsCounter().recordLoadSuccess(var3);
         }
      }

      private void fillProxies(Map<? extends K, ? extends V> var1) {
         this.proxies.forEach((var2, var3) -> {
            Object var4 = var1.get(var2);
            var3.obtrudeValue((V)var4);
            if (var4 == null) {
               this.cache.remove(var2, var3);
            } else {
               this.cache.replace((K)var2, (CompletableFuture<V>)var3, (CompletableFuture<V>)var3);
            }
         });
      }

      private void addNewEntries(Map<? extends K, ? extends V> var1) {
         var1.forEach((var1x, var2) -> {
            if (!this.proxies.containsKey(var1x)) {
               this.cache.put((K)var1x, CompletableFuture.completedFuture((V)var2));
            }
         });
      }

      static final class NullMapCompletionException extends CompletionException {
         private static final long serialVersionUID = 1L;
      }
   }

   final class CacheView<K, V> extends LocalAsyncCache.AbstractCacheView<K, V> {
      private static final long serialVersionUID = 1L;
      final LocalAsyncCache<K, V> asyncCache;

      CacheView(LocalAsyncCache<K, V> var1) {
         this.asyncCache = Objects.requireNonNull(var1);
      }

      @Override
      LocalAsyncCache<K, V> asyncCache() {
         return this.asyncCache;
      }
   }
}
