package com.github.benmanes.caffeine.cache;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.checkerframework.checker.nullness.qual.Nullable;

abstract class LocalAsyncLoadingCache<K, V> implements AsyncLoadingCache<K, V>, LocalAsyncCache<K, V> {
   static final Logger logger = System.getLogger(LocalAsyncLoadingCache.class.getName());
   final @Nullable BiFunction<? super Set<? extends K>, ? super Executor, ? extends CompletableFuture<? extends Map<? extends K, ? extends V>>> bulkMappingFunction;
   final BiFunction<? super K, ? super Executor, ? extends CompletableFuture<? extends V>> mappingFunction;
   final AsyncCacheLoader<K, V> cacheLoader;
   LocalAsyncLoadingCache.@Nullable LoadingCacheView<K, V> cacheView;

   LocalAsyncLoadingCache(AsyncCacheLoader<? super K, V> var1) {
      this.bulkMappingFunction = this.newBulkMappingFunction(var1);
      this.cacheLoader = var1;
      this.mappingFunction = this.newMappingFunction(var1);
   }

   BiFunction<? super K, ? super Executor, ? extends CompletableFuture<? extends V>> newMappingFunction(AsyncCacheLoader<? super K, V> var1) {
      return (var1x, var2) -> {
         try {
            return var1.asyncLoad((K)var1x, var2);
         } catch (RuntimeException var4) {
            throw var4;
         } catch (InterruptedException var5) {
            Thread.currentThread().interrupt();
            throw new CompletionException(var5);
         } catch (Exception var6) {
            throw new CompletionException(var6);
         }
      };
   }

   @Nullable BiFunction<Set<? extends K>, Executor, CompletableFuture<Map<K, V>>> newBulkMappingFunction(AsyncCacheLoader<? super K, V> var1) {
      return !this.canBulkLoad(var1) ? null : (var1x, var2) -> {
         try {
            return (CompletableFuture<Map<K, V>>)var1.asyncLoadAll(var1x, var2);
         } catch (RuntimeException var4) {
            throw var4;
         } catch (InterruptedException var5) {
            Thread.currentThread().interrupt();
            throw new CompletionException(var5);
         } catch (Exception var6) {
            throw new CompletionException(var6);
         }
      };
   }

   boolean canBulkLoad(AsyncCacheLoader<?, ?> var1) {
      try {
         Class<AsyncCacheLoader> var2 = AsyncCacheLoader.class;
         if (var1 instanceof CacheLoader) {
            var2 = CacheLoader.class;
            Method var3 = var1.getClass().getMethod("loadAll", Set.class);
            Method var4 = CacheLoader.class.getMethod("loadAll", Set.class);
            if (!var3.equals(var4)) {
               return true;
            }
         }

         Method var6 = var1.getClass().getMethod("asyncLoadAll", Set.class, Executor.class);
         Method var7 = var2.getMethod("asyncLoadAll", Set.class, Executor.class);
         return !var6.equals(var7);
      } catch (NoSuchMethodException | SecurityException var5) {
         logger.log(Level.WARNING, "Cannot determine if CacheLoader can bulk load", var5);
         return false;
      }
   }

   @Override
   public CompletableFuture<V> get(K var1) {
      return this.get((K)var1, this.mappingFunction);
   }

   @Override
   public CompletableFuture<Map<K, V>> getAll(Iterable<? extends K> var1) {
      if (this.bulkMappingFunction != null) {
         return this.getAll(var1, this.bulkMappingFunction);
      }

      Function var2 = this::get;
      LinkedHashMap var3 = new LinkedHashMap(Caffeine.calculateHashMapCapacity(var1));

      for (Object var5 : var1) {
         CompletableFuture var6 = (CompletableFuture)var3.computeIfAbsent(var5, var2);
         Objects.requireNonNull(var6);
      }

      return LocalAsyncCache.composeResult(var3);
   }

   @Override
   public LoadingCache<K, V> synchronous() {
      return this.cacheView == null ? (this.cacheView = new LocalAsyncLoadingCache.LoadingCacheView<>(this)) : this.cacheView;
   }

   static final class LoadingCacheView<K, V> extends LocalAsyncCache.AbstractCacheView<K, V> implements LoadingCache<K, V> {
      private static final long serialVersionUID = 1L;
      final LocalAsyncLoadingCache<K, V> asyncCache;

      LoadingCacheView(LocalAsyncLoadingCache<K, V> var1) {
         this.asyncCache = Objects.requireNonNull(var1);
      }

      LocalAsyncLoadingCache<K, V> asyncCache() {
         return this.asyncCache;
      }

      @Override
      public V get(K var1) {
         return resolve(this.asyncCache.get((K)var1));
      }

      @Override
      public Map<K, V> getAll(Iterable<? extends K> var1) {
         return resolve(this.asyncCache.getAll(var1));
      }

      @Override
      public CompletableFuture<V> refresh(K var1) {
         Objects.requireNonNull(var1);
         Object var2 = this.asyncCache.cache().referenceKey((K)var1);

         CompletableFuture var3;
         do {
            var3 = this.tryOptimisticRefresh((K)var1, var2);
            if (var3 == null) {
               var3 = this.tryComputeRefresh((K)var1, var2);
            }
         } while (var3 == null);

         return var3;
      }

      @Override
      public CompletableFuture<Map<K, V>> refreshAll(Iterable<? extends K> var1) {
         LinkedHashMap var2 = new LinkedHashMap(Caffeine.calculateHashMapCapacity(var1));

         for (Object var4 : var1) {
            var2.computeIfAbsent(var4, this::refresh);
         }

         return LocalAsyncCache.composeResult(var2);
      }

      private @Nullable CompletableFuture<V> tryOptimisticRefresh(K var1, Object var2) {
         CompletableFuture var3 = this.asyncCache.cache().refreshes().get(var2);
         if (var3 != null) {
            if (!Async.isReady(var3) && !this.asyncCache.cache().isPendingEviction((K)var1)) {
               return var3;
            }

            this.asyncCache.cache().refreshes().remove(var2, var3);
         }

         CompletableFuture var4 = this.asyncCache.cache().getIfPresentQuietly((K)var1);
         if (var4 == null || var4.isDone() && var4.isCompletedExceptionally()) {
            if (var4 != null) {
               this.asyncCache.cache().remove(var1, var4);
            }

            CompletableFuture var5 = this.asyncCache.get((K)var1, this.asyncCache.mappingFunction, false);
            CompletableFuture var6 = this.asyncCache.cache().refreshes().putIfAbsent(var2, var5);
            CompletableFuture var7 = var6 == null ? var5 : var6;
            var7.whenComplete((var3x, var4x) -> this.asyncCache.cache().refreshes().remove(var2, var7));
            return var7;
         } else {
            return !var4.isDone() ? var4 : null;
         }
      }

      private @Nullable CompletableFuture<V> tryComputeRefresh(K var1, Object var2) {
         long[] var3 = new long[1];
         boolean[] var4 = new boolean[1];
         CompletableFuture[] var5 = new CompletableFuture[1];
         CompletableFuture var6 = this.asyncCache.cache().refreshes().computeIfAbsent(var2, var5x -> {
            var5[0] = this.asyncCache.cache().getIfPresentQuietly((K)var1);
            Object var6x = Async.getIfReady(var5[0]);
            if (var6x == null) {
               return null;
            }

            var4[0] = true;
            var3[0] = this.asyncCache.cache().statsTicker().read();

            try {
               CompletableFuture var7x = this.asyncCache.cacheLoader.asyncReload((K)var1, (V)var6x, this.asyncCache.cache().executor());
               return Objects.requireNonNull(var7x, "Null future");
            } catch (RuntimeException var8) {
               throw var8;
            } catch (InterruptedException var9) {
               Thread.currentThread().interrupt();
               throw new CompletionException(var9);
            } catch (Exception var10) {
               throw new CompletionException(var10);
            }
         });
         if (var6 == null) {
            return null;
         }

         CompletableFuture var7 = var6;
         if (var4[0]) {
            var7.whenComplete((var6x, var7x) -> {
               long var8 = this.asyncCache.cache().statsTicker().read() - var3[0];
               if (var7x != null) {
                  if (!(var7x instanceof CancellationException) && !(var7x instanceof TimeoutException)) {
                     LocalAsyncLoadingCache.logger.log(Level.WARNING, "Exception thrown during refresh", var7x);
                  }

                  this.asyncCache.cache().refreshes().remove(var2, var7);
                  this.asyncCache.cache().statsCounter().recordLoadFailure(var8);
               } else {
                  boolean[] var10 = new boolean[1];
                  CompletableFuture var11 = this.asyncCache.cache().compute((K)var1, (var6xx, var7xx) -> {
                     boolean var8x = this.asyncCache.cache().refreshes().remove(var2, var7);
                     if (!var8x || var7xx != var5[0]) {
                        var10[0] = true;
                        return var7xx;
                     } else if (var7xx == null) {
                        var10[0] = var6x != null;
                        return null;
                     } else if (var7xx == var6x || var7xx == var7) {
                        return var7xx;
                     } else if (var6x == Async.<V>getIfReady((CompletableFuture<V>)var7xx)) {
                        return var7xx;
                     } else {
                        return var6x == null ? null : var7;
                     }
                  }, this.asyncCache.cache().expiry(), false, true);
                  if (var10[0] && var6x != null) {
                     RemovalCause var12 = var11 == null ? RemovalCause.EXPLICIT : RemovalCause.REPLACED;
                     this.asyncCache.cache().notifyRemoval((K)var1, var7, var12);
                  }

                  if (var6x == null) {
                     this.asyncCache.cache().statsCounter().recordLoadFailure(var8);
                  } else {
                     this.asyncCache.cache().statsCounter().recordLoadSuccess(var8);
                  }
               }
            });
         }

         return var7;
      }
   }
}
