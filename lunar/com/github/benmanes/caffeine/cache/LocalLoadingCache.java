package com.github.benmanes.caffeine.cache;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.checkerframework.checker.nullness.qual.Nullable;

interface LocalLoadingCache<K, V> extends LoadingCache<K, V>, LocalManualCache<K, V> {
   Logger logger = System.getLogger(LocalLoadingCache.class.getName());

   AsyncCacheLoader<? super K, V> cacheLoader();

   Function<K, V> mappingFunction();

   @Nullable Function<Set<? extends K>, Map<K, V>> bulkMappingFunction();

   @Override
   default V get(K var1) {
      return this.cache().computeIfAbsent((K)var1, this.mappingFunction());
   }

   @Override
   default Map<K, V> getAll(Iterable<? extends K> var1) {
      Function var2 = this.bulkMappingFunction();
      return var2 == null ? this.loadSequentially(var1) : this.getAll(var1, var2);
   }

   default Map<K, V> loadSequentially(Iterable<? extends K> var1) {
      LinkedHashMap var2 = new LinkedHashMap(Caffeine.calculateHashMapCapacity(var1));

      for (Object var4 : var1) {
         var2.put(var4, null);
      }

      int var8 = 0;

      try {
         Iterator var9 = var2.entrySet().iterator();

         while (var9.hasNext()) {
            Entry var5 = (Entry)var9.next();
            var8++;
            Object var6 = this.get((K)var5.getKey());
            if (var6 == null) {
               var9.remove();
            } else {
               var5.setValue(var6);
            }
         }
      } catch (Throwable var7) {
         this.cache().statsCounter().recordMisses(var2.size() - var8);
         throw var7;
      }

      return Collections.unmodifiableMap(var2);
   }

   @Override
   default CompletableFuture<V> refresh(K var1) {
      long[] var2 = new long[1];
      Object[] var3 = new Object[1];
      CompletableFuture[] var4 = new CompletableFuture[1];
      Object var5 = this.cache().referenceKey((K)var1);
      CompletableFuture var6 = this.cache()
         .refreshes()
         .compute(
            var5,
            (var5x, var6x) -> {
               if (var6x != null && !Async.isReady((CompletableFuture<?>)var6x) && !this.cache().isPendingEviction((K)var1)) {
                  return var6x;
               }

               try {
                  var2[0] = this.cache().statsTicker().read();
                  var3[0] = this.cache().getIfPresentQuietly((K)var1);
                  CompletableFuture var7 = var3[0] == null
                     ? this.cacheLoader().asyncLoad((K)var1, this.cache().executor())
                     : this.cacheLoader().asyncReload((K)var1, (V)var3[0], this.cache().executor());
                  var4[0] = Objects.requireNonNull(var7, "Null future");
                  return var7;
               } catch (RuntimeException var8) {
                  throw var8;
               } catch (InterruptedException var9) {
                  Thread.currentThread().interrupt();
                  throw new CompletionException(var9);
               } catch (Exception var10) {
                  throw new CompletionException(var10);
               }
            }
         );
      if (var4[0] != null) {
         var4[0].whenComplete((var6x, var7) -> {
            long var8 = this.cache().statsTicker().read() - var2[0];
            if (var7 != null) {
               if (!(var7 instanceof CancellationException) && !(var7 instanceof TimeoutException)) {
                  logger.log(Level.WARNING, "Exception thrown during refresh", var7);
               }

               this.cache().refreshes().remove(var5, var4[0]);
               this.cache().statsCounter().recordLoadFailure(var8);
            } else {
               boolean[] var10 = new boolean[1];
               Object var11 = this.cache().compute((K)var1, (var6xx, var7x) -> {
                  boolean var8x = this.cache().refreshes().remove(var5, var4[0]);
                  if (var8x && var7x == var3[0]) {
                     return (V)(var7x == null && var6x == null ? null : var6x);
                  }

                  var10[0] = var7x != var6x;
                  return (V)var7x;
               }, this.cache().expiry(), false, true);
               if (var10[0] && var6x != null) {
                  RemovalCause var12 = var11 == null ? RemovalCause.EXPLICIT : RemovalCause.REPLACED;
                  this.cache().notifyRemoval((K)var1, (V)var6x, var12);
               }

               if (var6x == null) {
                  this.cache().statsCounter().recordLoadFailure(var8);
               } else {
                  this.cache().statsCounter().recordLoadSuccess(var8);
               }
            }
         });
      }

      return var6;
   }

   @Override
   default CompletableFuture<Map<K, V>> refreshAll(Iterable<? extends K> var1) {
      LinkedHashMap var2 = new LinkedHashMap(Caffeine.calculateHashMapCapacity(var1));

      for (Object var4 : var1) {
         var2.computeIfAbsent(var4, this::refresh);
      }

      return LocalAsyncCache.composeResult(var2);
   }

   static <K, V> Function<K, V> newMappingFunction(CacheLoader<? super K, V> var0) {
      return var1 -> {
         try {
            return (V)var0.load(var1);
         } catch (RuntimeException var3) {
            throw var3;
         } catch (InterruptedException var4) {
            Thread.currentThread().interrupt();
            throw new CompletionException(var4);
         } catch (Exception var5) {
            throw new CompletionException(var5);
         }
      };
   }

   static <K, V> @Nullable Function<Set<? extends K>, Map<K, V>> newBulkMappingFunction(CacheLoader<? super K, V> var0) {
      return !hasLoadAll(var0) ? null : var1 -> {
         try {
            return (Map<K, V>)var0.loadAll(var1);
         } catch (RuntimeException var3) {
            throw var3;
         } catch (InterruptedException var4) {
            Thread.currentThread().interrupt();
            throw new CompletionException(var4);
         } catch (Exception var5) {
            throw new CompletionException(var5);
         }
      };
   }

   static boolean hasLoadAll(CacheLoader<?, ?> var0) {
      try {
         Method var1 = var0.getClass().getMethod("loadAll", Set.class);
         Method var2 = CacheLoader.class.getMethod("loadAll", Set.class);
         return !var1.equals(var2);
      } catch (NoSuchMethodException | SecurityException var3) {
         logger.log(Level.WARNING, "Cannot determine if CacheLoader can bulk load", var3);
         return false;
      }
   }
}
