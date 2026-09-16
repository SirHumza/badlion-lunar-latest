package com.github.benmanes.caffeine.cache;

import com.github.benmanes.caffeine.cache.stats.CacheStats;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

interface LocalAsyncCache<K, V> extends AsyncCache<K, V> {
   Logger logger = Logger.getLogger(LocalAsyncCache.class.getName());

   LocalCache<K, CompletableFuture<V>> cache();

   Policy<K, V> policy();

   @Override
   default @Nullable CompletableFuture<V> getIfPresent(@NonNull Object key) {
      return this.cache().getIfPresent(key, true);
   }

   @Override
   default CompletableFuture<V> get(@NonNull K key, @NonNull Function<? super K, ? extends V> mappingFunction) {
      return this.get(key, (k1, executor) -> CompletableFuture.supplyAsync(() -> (V)mappingFunction.apply(key), executor));
   }

   @Override
   default CompletableFuture<V> get(K key, BiFunction<? super K, Executor, CompletableFuture<V>> mappingFunction) {
      return this.get(key, mappingFunction, true);
   }

   default CompletableFuture<V> get(K key, BiFunction<? super K, Executor, CompletableFuture<V>> mappingFunction, boolean recordStats) {
      long startTime = this.cache().statsTicker().read();
      CompletableFuture<V>[] result = new CompletableFuture[1];
      CompletableFuture<V> future = this.cache().computeIfAbsent(key, k -> {
         result[0] = mappingFunction.apply(key, this.cache().executor());
         return Objects.requireNonNull(result[0]);
      }, recordStats, false);
      if (result[0] != null) {
         this.handleCompletion(key, result[0], startTime, false);
      }

      return future;
   }

   @Override
   default CompletableFuture<Map<K, V>> getAll(Iterable<? extends @NonNull K> keys, Function<Iterable<? extends K>, Map<K, V>> mappingFunction) {
      return this.getAll(keys, (keysToLoad, executor) -> CompletableFuture.supplyAsync(() -> mappingFunction.apply(keysToLoad), executor));
   }

   @Override
   default CompletableFuture<Map<K, V>> getAll(
      Iterable<? extends @NonNull K> keys, BiFunction<Iterable<? extends K>, Executor, CompletableFuture<Map<K, V>>> mappingFunction
   ) {
      Objects.requireNonNull(mappingFunction);
      Objects.requireNonNull(keys);
      Map<K, CompletableFuture<V>> futures = new LinkedHashMap<>();
      Map<K, CompletableFuture<V>> proxies = new HashMap<>();

      for (K key : keys) {
         if (!futures.containsKey(key)) {
            CompletableFuture<V> future = this.cache().getIfPresent(key, false);
            if (future == null) {
               CompletableFuture<V> proxy = new CompletableFuture<>();
               future = this.cache().putIfAbsent(key, proxy);
               if (future == null) {
                  future = proxy;
                  proxies.put(key, proxy);
               }
            }

            futures.put(key, future);
         }
      }

      this.cache().statsCounter().recordMisses(proxies.size());
      this.cache().statsCounter().recordHits(futures.size() - proxies.size());
      if (proxies.isEmpty()) {
         return this.composeResult(futures);
      }

      LocalAsyncCache.AsyncBulkCompleter<K, V> completer = new LocalAsyncCache.AsyncBulkCompleter<>(this.cache(), proxies);

      try {
         mappingFunction.apply(proxies.keySet(), this.cache().executor()).whenComplete(completer);
         return this.composeResult(futures);
      } catch (Throwable t) {
         completer.accept(null, t);
         throw t;
      }
   }

   default CompletableFuture<Map<K, V>> composeResult(Map<K, CompletableFuture<V>> futures) {
      if (futures.isEmpty()) {
         return CompletableFuture.completedFuture(Collections.emptyMap());
      }

      CompletableFuture<?>[] array = futures.values().toArray(new CompletableFuture[0]);
      return CompletableFuture.allOf(array).thenApply(ignored -> {
         Map<K, V> result = new LinkedHashMap<>(futures.size());
         futures.forEach((key, future) -> {
            V value = future.getNow(null);
            if (value != null) {
               result.put((K)key, value);
            }
         });
         return Collections.unmodifiableMap(result);
      });
   }

   @Override
   default void put(K key, CompletableFuture<V> valueFuture) {
      if (!valueFuture.isCompletedExceptionally() && (!valueFuture.isDone() || valueFuture.join() != null)) {
         long startTime = this.cache().statsTicker().read();
         this.cache().put(key, valueFuture);
         this.handleCompletion(key, valueFuture, startTime, false);
      } else {
         this.cache().statsCounter().recordLoadFailure(0L);
         this.cache().remove(key);
      }
   }

   default void handleCompletion(K key, CompletableFuture<V> valueFuture, long startTime, boolean recordMiss) {
      AtomicBoolean completed = new AtomicBoolean();
      valueFuture.whenComplete((value, error) -> {
         if (completed.compareAndSet(false, true)) {
            long loadTime = this.cache().statsTicker().read() - startTime;
            if (value == null) {
               if (error != null) {
                  logger.log(Level.WARNING, "Exception thrown during asynchronous load", error);
               }

               this.cache().remove(key, valueFuture);
               this.cache().statsCounter().recordLoadFailure(loadTime);
               if (recordMiss) {
                  this.cache().statsCounter().recordMisses(1);
               }
            } else {
               this.cache().replace(key, valueFuture, valueFuture);
               this.cache().statsCounter().recordLoadSuccess(loadTime);
               if (recordMiss) {
                  this.cache().statsCounter().recordMisses(1);
               }
            }
         }
      });
   }

   abstract class AbstractCacheView<K, V> implements Cache<K, V>, Serializable {
      transient LocalAsyncCache.@Nullable AsMapView<K, V> asMapView;

      abstract LocalAsyncCache<K, V> asyncCache();

      @Override
      public @Nullable V getIfPresent(Object key) {
         CompletableFuture<V> future = this.asyncCache().cache().getIfPresent(key, true);
         return Async.getIfReady(future);
      }

      @Override
      public Map<K, V> getAllPresent(Iterable<?> keys) {
         Set<Object> uniqueKeys = new LinkedHashSet<>();

         for (Object key : keys) {
            uniqueKeys.add(key);
         }

         int misses = 0;
         Map<Object, Object> result = new LinkedHashMap<>();

         for (Object key : uniqueKeys) {
            CompletableFuture<V> future = this.asyncCache().cache().get(key);
            Object value = Async.getIfReady(future);
            if (value == null) {
               misses++;
            } else {
               result.put(key, value);
            }
         }

         this.asyncCache().cache().statsCounter().recordMisses(misses);
         this.asyncCache().cache().statsCounter().recordHits(result.size());
         Map<K, V> castedResult = (Map<K, V>)result;
         return Collections.unmodifiableMap(castedResult);
      }

      @Override
      public V get(K key, Function<? super K, ? extends V> mappingFunction) {
         return resolve(this.asyncCache().get(key, mappingFunction));
      }

      @Override
      public Map<K, V> getAll(Iterable<? extends K> keys, Function<Iterable<? extends K>, Map<K, V>> mappingFunction) {
         return resolve(this.asyncCache().getAll(keys, mappingFunction));
      }

      protected static <T> T resolve(CompletableFuture<T> future) throws Error {
         try {
            return future.get();
         } catch (ExecutionException e) {
            if (e.getCause() instanceof LocalAsyncCache.AsyncBulkCompleter.NullMapCompletionException) {
               throw new NullPointerException(e.getCause().getMessage());
            } else if (e.getCause() instanceof RuntimeException) {
               throw (RuntimeException)e.getCause();
            } else if (e.getCause() instanceof Error) {
               throw (Error)e.getCause();
            } else {
               throw new CompletionException(e.getCause());
            }
         } catch (InterruptedException e) {
            throw new CompletionException(e);
         }
      }

      @Override
      public void put(K key, V value) {
         Objects.requireNonNull(value);
         this.asyncCache().cache().put(key, CompletableFuture.completedFuture(value));
      }

      @Override
      public void putAll(Map<? extends K, ? extends V> map) {
         map.forEach(this::put);
      }

      @Override
      public void invalidate(Object key) {
         this.asyncCache().cache().remove(key);
      }

      @Override
      public void invalidateAll(Iterable<?> keys) {
         this.asyncCache().cache().invalidateAll(keys);
      }

      @Override
      public void invalidateAll() {
         this.asyncCache().cache().clear();
      }

      @Override
      public long estimatedSize() {
         return this.asyncCache().cache().size();
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

   final class AsMapView<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
      final LocalCache<K, CompletableFuture<V>> delegate;
      @Nullable Collection<V> values;
      @Nullable Set<Entry<K, V>> entries;

      AsMapView(LocalCache<K, CompletableFuture<V>> delegate) {
         this.delegate = delegate;
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
      public boolean containsKey(Object key) {
         return this.delegate.containsKey(key);
      }

      @Override
      public boolean containsValue(Object value) {
         Objects.requireNonNull(value);

         for (CompletableFuture<V> valueFuture : this.delegate.values()) {
            if (value.equals(Async.getIfReady(valueFuture))) {
               return true;
            }
         }

         return false;
      }

      @Override
      public @Nullable V get(Object key) {
         return Async.getIfReady(this.delegate.get(key));
      }

      @Override
      public @Nullable V putIfAbsent(K key, V value) {
         Objects.requireNonNull(value);

         while (true) {
            CompletableFuture<V> priorFuture = this.delegate.get(key);
            if (priorFuture != null) {
               if (!priorFuture.isDone()) {
                  Async.getWhenSuccessful(priorFuture);
                  continue;
               }

               V prior = Async.getWhenSuccessful(priorFuture);
               if (prior != null) {
                  return prior;
               }
            }

            boolean[] added = new boolean[]{false};
            CompletableFuture<V> computed = this.delegate.compute(key, (k, valueFuture) -> {
               added[0] = valueFuture == null || valueFuture.isDone() && Async.<V>getIfReady((CompletableFuture<V>)valueFuture) == null;
               return added[0] ? CompletableFuture.completedFuture(value) : valueFuture;
            }, false, false, false);
            if (added[0]) {
               return null;
            }

            V prior = Async.getWhenSuccessful(computed);
            if (prior != null) {
               return prior;
            }
         }
      }

      @Override
      public @Nullable V put(K key, V value) {
         Objects.requireNonNull(value);
         CompletableFuture<V> oldValueFuture = this.delegate.put(key, CompletableFuture.completedFuture(value));
         return Async.getWhenSuccessful(oldValueFuture);
      }

      @Override
      public @Nullable V remove(Object key) {
         CompletableFuture<V> oldValueFuture = this.delegate.remove(key);
         return Async.getWhenSuccessful(oldValueFuture);
      }

      @Override
      public boolean remove(Object key, Object value) {
         Objects.requireNonNull(key);
         if (value == null) {
            return false;
         }

         K castedKey = (K)key;
         boolean[] done = new boolean[]{false};
         boolean[] removed = new boolean[]{false};

         do {
            CompletableFuture<V> future = this.delegate.get(key);
            if (future == null || future.isCompletedExceptionally()) {
               return false;
            }

            Async.getWhenSuccessful(future);
            this.delegate.compute(castedKey, (k, oldValueFuture) -> {
               if (oldValueFuture == null) {
                  done[0] = true;
                  return null;
               }

               if (!oldValueFuture.isDone()) {
                  return oldValueFuture;
               }

               done[0] = true;
               V oldValue = Async.getIfReady((CompletableFuture<V>)oldValueFuture);
               removed[0] = value.equals(oldValue);
               return oldValue != null && !removed[0] ? oldValueFuture : null;
            }, false, false, true);
         } while (!done[0]);

         return removed[0];
      }

      @Override
      public @Nullable V replace(K key, V value) {
         V[] oldValue = (V[])(new Object[1]);
         boolean[] done = new boolean[]{false};

         do {
            CompletableFuture<V> future = this.delegate.get(key);
            if (future == null || future.isCompletedExceptionally()) {
               return null;
            }

            Async.getWhenSuccessful(future);
            this.delegate.compute(key, (k, oldValueFuture) -> {
               if (oldValueFuture == null) {
                  done[0] = true;
                  return null;
               }

               if (!oldValueFuture.isDone()) {
                  return oldValueFuture;
               }

               done[0] = true;
               oldValue[0] = Async.getIfReady((CompletableFuture<V>)oldValueFuture);
               return oldValue[0] == null ? null : CompletableFuture.completedFuture(value);
            }, false, false, false);
         } while (!done[0]);

         return oldValue[0];
      }

      @Override
      public boolean replace(K key, V oldValue, V newValue) {
         Objects.requireNonNull(oldValue);
         boolean[] done = new boolean[]{false};
         boolean[] replaced = new boolean[]{false};

         do {
            CompletableFuture<V> future = this.delegate.get(key);
            if (future == null || future.isCompletedExceptionally()) {
               return false;
            }

            Async.getWhenSuccessful(future);
            this.delegate.compute(key, (k, oldValueFuture) -> {
               if (oldValueFuture == null) {
                  done[0] = true;
                  return null;
               }

               if (!oldValueFuture.isDone()) {
                  return oldValueFuture;
               }

               done[0] = true;
               replaced[0] = oldValue.equals(Async.getIfReady((CompletableFuture<V>)oldValueFuture));
               return replaced[0] ? CompletableFuture.completedFuture(newValue) : oldValueFuture;
            }, false, false, false);
         } while (!done[0]);

         return replaced[0];
      }

      @Override
      public @Nullable V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
         Objects.requireNonNull(mappingFunction);

         while (true) {
            while (true) {
               CompletableFuture<V> priorFuture = this.delegate.get(key);
               if (priorFuture == null) {
                  break;
               }

               if (priorFuture.isDone()) {
                  V prior = Async.getWhenSuccessful(priorFuture);
                  if (prior != null) {
                     this.delegate.statsCounter().recordHits(1);
                     return prior;
                  }
                  break;
               }

               Async.getWhenSuccessful(priorFuture);
            }

            CompletableFuture<V>[] future = new CompletableFuture[1];
            CompletableFuture<V> computed = this.delegate.compute(key, (k, valueFuture) -> {
               if (valueFuture != null && valueFuture.isDone() && Async.<V>getIfReady((CompletableFuture<V>)valueFuture) != null) {
                  return valueFuture;
               }

               V newValue = (V)this.delegate.statsAware(mappingFunction, true).apply(key);
               if (newValue == null) {
                  return null;
               }

               future[0] = CompletableFuture.completedFuture(newValue);
               return future[0];
            }, false, false, false);
            V result = Async.getWhenSuccessful(computed);
            if (computed == future[0] || result != null) {
               return result;
            }
         }
      }

      @Override
      public @Nullable V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
         V[] newValue = (V[])(new Object[1]);

         CompletableFuture<V> valueFuture;
         do {
            Async.getWhenSuccessful(this.delegate.get(key));
            valueFuture = this.delegate.computeIfPresent(key, (k, oldValueFuture) -> {
               if (!oldValueFuture.isDone()) {
                  return oldValueFuture;
               }

               V oldValue = Async.getIfReady((CompletableFuture<V>)oldValueFuture);
               if (oldValue == null) {
                  return null;
               }

               newValue[0] = (V)remappingFunction.apply(key, oldValue);
               return newValue[0] == null ? null : CompletableFuture.completedFuture(newValue[0]);
            });
            if (newValue[0] != null) {
               return newValue[0];
            }
         } while (valueFuture != null);

         return null;
      }

      @Override
      public @Nullable V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
         V[] newValue = (V[])(new Object[1]);

         CompletableFuture<V> valueFuture;
         do {
            Async.getWhenSuccessful(this.delegate.get(key));
            valueFuture = this.delegate.compute(key, (k, oldValueFuture) -> {
               if (oldValueFuture != null && !oldValueFuture.isDone()) {
                  return oldValueFuture;
               }

               V oldValue = Async.getIfReady((CompletableFuture<V>)oldValueFuture);
               BiFunction<? super K, ? super V, ? extends V> function = this.delegate.statsAware(remappingFunction, false, true, true);
               newValue[0] = (V)function.apply(key, oldValue);
               return newValue[0] == null ? null : CompletableFuture.completedFuture(newValue[0]);
            }, false, false, false);
            if (newValue[0] != null) {
               return newValue[0];
            }
         } while (valueFuture != null);

         return null;
      }

      @Override
      public @Nullable V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
         Objects.requireNonNull(value);
         Objects.requireNonNull(remappingFunction);
         CompletableFuture<V> newValueFuture = CompletableFuture.completedFuture(value);
         boolean[] merged = new boolean[]{false};

         CompletableFuture<V> mergedValueFuture;
         do {
            Async.getWhenSuccessful(this.delegate.get(key));
            mergedValueFuture = this.delegate.merge(key, newValueFuture, (oldValueFuture, valueFuture) -> {
               if (oldValueFuture != null && !oldValueFuture.isDone()) {
                  return oldValueFuture;
               } else {
                  merged[0] = true;
                  V oldValue = Async.getIfReady((CompletableFuture<V>)oldValueFuture);
                  if (oldValue == null) {
                     return valueFuture;
                  } else {
                     V mergedValue = (V)remappingFunction.apply(oldValue, value);
                     if (mergedValue == null) {
                        return null;
                     } else if (mergedValue == oldValue) {
                        return oldValueFuture;
                     } else {
                        return mergedValue == value ? valueFuture : CompletableFuture.completedFuture(mergedValue);
                     }
                  }
               }
            });
         } while (!merged[0] && mergedValueFuture != newValueFuture);

         return Async.getWhenSuccessful(mergedValueFuture);
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

      private final class EntrySet extends AbstractSet<Entry<K, V>> {
         private EntrySet() {
         }

         @Override
         public boolean isEmpty() {
            return AsMapView.this.isEmpty();
         }

         @Override
         public int size() {
            return AsMapView.this.size();
         }

         @Override
         public boolean contains(Object o) {
            if (!(o instanceof Entry)) {
               return false;
            }

            Entry<?, ?> entry = (Entry<?, ?>)o;
            V value = AsMapView.this.get(entry.getKey());
            return value != null && value.equals(entry.getValue());
         }

         @Override
         public boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
               return false;
            }

            Entry<?, ?> entry = (Entry<?, ?>)obj;
            return AsMapView.this.remove(entry.getKey(), entry.getValue());
         }

         @Override
         public void clear() {
            AsMapView.this.clear();
         }

         @Override
         public Iterator<Entry<K, V>> iterator() {
            return new Iterator<Entry<K, V>>() {
               Iterator<Entry<K, CompletableFuture<V>>> iterator = AsMapView.this.delegate.entrySet().iterator();
               @Nullable Entry<K, V> cursor;
               @Nullable Object removalKey;

               @Override
               public boolean hasNext() {
                  while (this.cursor == null && this.iterator.hasNext()) {
                     Entry<K, CompletableFuture<V>> entry = this.iterator.next();
                     V value = Async.getIfReady(entry.getValue());
                     if (value != null) {
                        this.cursor = new WriteThroughEntry<>(AsMapView.this, entry.getKey(), value);
                     }
                  }

                  return this.cursor != null;
               }

               public Entry<K, V> next() {
                  if (!this.hasNext()) {
                     throw new NoSuchElementException();
                  }

                  K key = this.cursor.getKey();
                  Entry<K, V> entry = this.cursor;
                  this.removalKey = key;
                  this.cursor = null;
                  return entry;
               }

               @Override
               public void remove() {
                  Caffeine.requireState(this.removalKey != null);
                  AsMapView.this.delegate.remove(this.removalKey);
                  this.removalKey = null;
               }
            };
         }
      }

      private final class Values extends AbstractCollection<V> {
         private Values() {
         }

         @Override
         public boolean isEmpty() {
            return AsMapView.this.isEmpty();
         }

         @Override
         public int size() {
            return AsMapView.this.size();
         }

         @Override
         public boolean contains(Object o) {
            return AsMapView.this.containsValue(o);
         }

         @Override
         public void clear() {
            AsMapView.this.clear();
         }

         @Override
         public Iterator<V> iterator() {
            return new Iterator<V>() {
               Iterator<Entry<K, V>> iterator = AsMapView.this.entrySet().iterator();

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

      AsyncAsMapView(LocalAsyncCache<K, V> asyncCache) {
         this.asyncCache = Objects.requireNonNull(asyncCache);
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
      public boolean containsKey(Object key) {
         return this.asyncCache.cache().containsKey(key);
      }

      @Override
      public boolean containsValue(Object value) {
         return this.asyncCache.cache().containsValue(value);
      }

      public @Nullable CompletableFuture<V> get(Object key) {
         return this.asyncCache.cache().get(key);
      }

      public CompletableFuture<V> putIfAbsent(K key, CompletableFuture<V> value) {
         CompletableFuture<V> prior = this.asyncCache.cache().putIfAbsent(key, value);
         long startTime = this.asyncCache.cache().statsTicker().read();
         if (prior == null) {
            this.asyncCache.handleCompletion(key, value, startTime, false);
         }

         return prior;
      }

      public CompletableFuture<V> put(K key, CompletableFuture<V> value) {
         CompletableFuture<V> prior = this.asyncCache.cache().put(key, value);
         long startTime = this.asyncCache.cache().statsTicker().read();
         this.asyncCache.handleCompletion(key, value, startTime, false);
         return prior;
      }

      @Override
      public void putAll(Map<? extends K, ? extends CompletableFuture<V>> map) {
         map.forEach(this::put);
      }

      public CompletableFuture<V> replace(K key, CompletableFuture<V> value) {
         CompletableFuture<V> prior = this.asyncCache.cache().replace(key, value);
         long startTime = this.asyncCache.cache().statsTicker().read();
         if (prior != null) {
            this.asyncCache.handleCompletion(key, value, startTime, false);
         }

         return prior;
      }

      public boolean replace(K key, CompletableFuture<V> oldValue, CompletableFuture<V> newValue) {
         boolean replaced = this.asyncCache.cache().replace(key, oldValue, newValue);
         long startTime = this.asyncCache.cache().statsTicker().read();
         if (replaced) {
            this.asyncCache.handleCompletion(key, newValue, startTime, false);
         }

         return replaced;
      }

      public CompletableFuture<V> remove(Object key) {
         return this.asyncCache.cache().remove(key);
      }

      @Override
      public boolean remove(Object key, Object value) {
         return this.asyncCache.cache().remove(key, value);
      }

      public @Nullable CompletableFuture<V> computeIfAbsent(K key, Function<? super K, ? extends CompletableFuture<V>> mappingFunction) {
         CompletableFuture<V>[] result = new CompletableFuture[1];
         long startTime = this.asyncCache.cache().statsTicker().read();
         CompletableFuture<V> future = this.asyncCache.cache().computeIfAbsent(key, k -> {
            result[0] = (CompletableFuture<V>)mappingFunction.apply(k);
            return result[0];
         }, false, false);
         if (result[0] == null) {
            if (future != null && this.asyncCache.cache().isRecordingStats()) {
               future.whenComplete((r, e) -> {
                  if (r != null || e == null) {
                     this.asyncCache.cache().statsCounter().recordHits(1);
                  }
               });
            }
         } else {
            this.asyncCache.handleCompletion(key, result[0], startTime, true);
         }

         return future;
      }

      public CompletableFuture<V> computeIfPresent(K key, BiFunction<? super K, ? super CompletableFuture<V>, ? extends CompletableFuture<V>> remappingFunction) {
         CompletableFuture<V>[] result = new CompletableFuture[1];
         long startTime = this.asyncCache.cache().statsTicker().read();
         this.asyncCache.cache().compute(key, (k, oldValue) -> {
            result[0] = (CompletableFuture<V>)(oldValue == null ? null : remappingFunction.apply(k, oldValue));
            return result[0];
         }, false, false, false);
         if (result[0] != null) {
            this.asyncCache.handleCompletion(key, result[0], startTime, false);
         }

         return result[0];
      }

      public CompletableFuture<V> compute(K key, BiFunction<? super K, ? super CompletableFuture<V>, ? extends CompletableFuture<V>> remappingFunction) {
         CompletableFuture<V>[] result = new CompletableFuture[1];
         long startTime = this.asyncCache.cache().statsTicker().read();
         this.asyncCache.cache().compute(key, (k, oldValue) -> {
            result[0] = (CompletableFuture<V>)remappingFunction.apply(k, oldValue);
            return result[0];
         }, false, false, false);
         if (result[0] != null) {
            this.asyncCache.handleCompletion(key, result[0], startTime, false);
         }

         return result[0];
      }

      public CompletableFuture<V> merge(
         K key,
         CompletableFuture<V> value,
         BiFunction<? super CompletableFuture<V>, ? super CompletableFuture<V>, ? extends CompletableFuture<V>> remappingFunction
      ) {
         Objects.requireNonNull(value);
         CompletableFuture<V>[] result = new CompletableFuture[1];
         long startTime = this.asyncCache.cache().statsTicker().read();
         this.asyncCache.cache().compute(key, (k, oldValue) -> {
            result[0] = oldValue == null ? value : remappingFunction.apply(oldValue, value);
            return result[0];
         }, false, false, false);
         if (result[0] != null) {
            this.asyncCache.handleCompletion(key, result[0], startTime, false);
         }

         return result[0];
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
      public boolean equals(Object o) {
         return this.asyncCache.cache().equals(o);
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

   final class AsyncBulkCompleter<K, V> implements BiConsumer<Map<K, V>, Throwable> {
      private final LocalCache<K, CompletableFuture<V>> cache;
      private final Map<K, CompletableFuture<V>> proxies;
      private final long startTime;

      AsyncBulkCompleter(LocalCache<K, CompletableFuture<V>> cache, Map<K, CompletableFuture<V>> proxies) {
         this.startTime = cache.statsTicker().read();
         this.proxies = proxies;
         this.cache = cache;
      }

      public void accept(@Nullable Map<K, V> result, @Nullable Throwable error) {
         long loadTime = this.cache.statsTicker().read() - this.startTime;
         if (result == null) {
            if (error == null) {
               error = new LocalAsyncCache.AsyncBulkCompleter.NullMapCompletionException();
            }

            for (Entry<K, CompletableFuture<V>> entry : this.proxies.entrySet()) {
               this.cache.remove(entry.getKey(), entry.getValue());
               entry.getValue().obtrudeException(error);
            }

            this.cache.statsCounter().recordLoadFailure(loadTime);
            LocalAsyncCache.logger.log(Level.WARNING, "Exception thrown during asynchronous load", error);
         } else {
            this.fillProxies(result);
            this.addNewEntries(result);
            this.cache.statsCounter().recordLoadSuccess(loadTime);
         }
      }

      private void fillProxies(Map<K, V> result) {
         this.proxies.forEach((key, future) -> {
            V value = result.get(key);
            future.obtrudeValue(value);
            if (value == null) {
               this.cache.remove(key, future);
            } else {
               this.cache.replace((K)key, (CompletableFuture<V>)future, (CompletableFuture<V>)future);
            }
         });
      }

      private void addNewEntries(Map<K, V> result) {
         if (this.proxies.size() != result.size()) {
            result.forEach((key, value) -> {
               if (!this.proxies.containsKey(key)) {
                  this.cache.put((K)key, CompletableFuture.completedFuture((V)value));
               }
            });
         }
      }

      static final class NullMapCompletionException extends CompletionException {
         private static final long serialVersionUID = 1L;

         public NullMapCompletionException() {
            super("null map", null);
         }
      }
   }

   final class CacheView<K, V> extends LocalAsyncCache.AbstractCacheView<K, V> {
      private static final long serialVersionUID = 1L;
      final LocalAsyncCache<K, V> asyncCache;

      CacheView(LocalAsyncCache<K, V> asyncCache) {
         this.asyncCache = Objects.requireNonNull(asyncCache);
      }

      @Override
      LocalAsyncCache<K, V> asyncCache() {
         return this.asyncCache;
      }
   }
}
