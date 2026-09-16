package com.github.benmanes.caffeine.cache;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import java.util.function.Function;
import org.checkerframework.checker.nullness.qual.Nullable;

@FunctionalInterface
public interface CacheLoader<K, V> extends AsyncCacheLoader<K, V> {
   @Nullable V load(K var1);

   default Map<? extends K, ? extends V> loadAll(Set<? extends K> var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   default CompletableFuture<? extends V> asyncLoad(K var1, Executor var2) {
      Objects.requireNonNull(var1);
      Objects.requireNonNull(var2);
      return CompletableFuture.supplyAsync(() -> {
         try {
            return this.load((K)var1);
         } catch (RuntimeException var3) {
            throw var3;
         } catch (Exception var4) {
            throw new CompletionException(var4);
         }
      }, var2);
   }

   @Override
   default CompletableFuture<? extends Map<? extends K, ? extends V>> asyncLoadAll(Set<? extends K> var1, Executor var2) {
      Objects.requireNonNull(var1);
      Objects.requireNonNull(var2);
      return CompletableFuture.supplyAsync(() -> {
         try {
            return this.loadAll(var1);
         } catch (RuntimeException var3) {
            throw var3;
         } catch (Exception var4) {
            throw new CompletionException(var4);
         }
      }, var2);
   }

   default @Nullable V reload(K var1, V var2) {
      return this.load((K)var1);
   }

   @Override
   default CompletableFuture<? extends V> asyncReload(K var1, V var2, Executor var3) {
      Objects.requireNonNull(var1);
      Objects.requireNonNull(var3);
      return CompletableFuture.supplyAsync(() -> {
         try {
            return this.reload((K)var1, (V)var2);
         } catch (RuntimeException var4) {
            throw var4;
         } catch (Exception var5) {
            throw new CompletionException(var5);
         }
      }, var3);
   }

   static <K, V> CacheLoader<K, V> bulk(final Function<? super Set<? extends K>, ? extends Map<? extends K, ? extends V>> var0) {
      return new CacheLoader<K, V>() {
         @Override
         public @Nullable V load(K var1) {
            return (V)this.loadAll(Set.of((K)var1)).get(var1);
         }

         @Override
         public Map<? extends K, ? extends V> loadAll(Set<? extends K> var1) {
            return (Map<? extends K, ? extends V>)var0.apply(var1);
         }
      };
   }
}
