package com.github.benmanes.caffeine.cache;

import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.Nullable;

final class Async {
   static final long ASYNC_EXPIRY = 6917529027641081854L;

   private Async() {
   }

   static boolean isReady(@Nullable CompletableFuture<?> var0) {
      return var0 != null && var0.isDone() && !var0.isCompletedExceptionally() && var0.join() != null;
   }

   static <V> @Nullable V getIfReady(@Nullable CompletableFuture<V> var0) {
      return (V)(isReady(var0) ? var0.join() : null);
   }

   static <V> @Nullable V getWhenSuccessful(@Nullable CompletableFuture<V> var0) {
      try {
         return (V)(var0 == null ? null : var0.join());
      } catch (CancellationException | CompletionException var2) {
         return null;
      }
   }

   static final class AsyncEvictionListener<K, V> implements RemovalListener<K, CompletableFuture<V>>, Serializable {
      private static final long serialVersionUID = 1L;
      final RemovalListener<K, V> delegate;

      AsyncEvictionListener(RemovalListener<K, V> var1) {
         this.delegate = Objects.requireNonNull(var1);
      }

      public void onRemoval(@Nullable K var1, @Nullable CompletableFuture<V> var2, RemovalCause var3) {
         Object var4 = Async.getIfReady(var2);
         if (var4 != null) {
            this.delegate.onRemoval((K)var1, (V)var4, var3);
         }
      }

      Object writeReplace() {
         return this.delegate;
      }
   }

   static final class AsyncExpiry<K, V> implements Expiry<K, CompletableFuture<V>>, Serializable {
      private static final long serialVersionUID = 1L;
      final Expiry<? super K, ? super V> delegate;

      AsyncExpiry(Expiry<? super K, ? super V> var1) {
         this.delegate = Objects.requireNonNull(var1);
      }

      public long expireAfterCreate(K var1, CompletableFuture<V> var2, long var3) {
         if (Async.isReady(var2)) {
            long var5 = this.delegate.expireAfterCreate((K)var1, (V)var2.join(), var3);
            return Math.min(var5, 4611686018427387903L);
         } else {
            return 6917529027641081854L;
         }
      }

      public long expireAfterUpdate(K var1, CompletableFuture<V> var2, long var3, long var5) {
         if (Async.isReady(var2)) {
            long var7 = var5 > 4611686018427387903L
               ? this.delegate.expireAfterCreate((K)var1, (V)var2.join(), var3)
               : this.delegate.expireAfterUpdate((K)var1, (V)var2.join(), var3, var5);
            return Math.min(var7, 4611686018427387903L);
         } else {
            return 6917529027641081854L;
         }
      }

      public long expireAfterRead(K var1, CompletableFuture<V> var2, long var3, long var5) {
         if (Async.isReady(var2)) {
            long var7 = this.delegate.expireAfterRead((K)var1, (V)var2.join(), var3, var5);
            return Math.min(var7, 4611686018427387903L);
         } else {
            return 6917529027641081854L;
         }
      }

      Object writeReplace() {
         return this.delegate;
      }
   }

   static final class AsyncRemovalListener<K, V> implements RemovalListener<K, CompletableFuture<V>>, Serializable {
      private static final long serialVersionUID = 1L;
      final RemovalListener<K, V> delegate;
      final Executor executor;

      AsyncRemovalListener(RemovalListener<K, V> var1, Executor var2) {
         this.delegate = Objects.requireNonNull(var1);
         this.executor = Objects.requireNonNull(var2);
      }

      public void onRemoval(@Nullable K var1, @Nullable CompletableFuture<V> var2, RemovalCause var3) {
         if (var2 != null) {
            var2.thenAcceptAsync(var3x -> {
               if (var3x != null) {
                  this.delegate.onRemoval((K)var1, (V)var3x, var3);
               }
            }, this.executor);
         }
      }

      Object writeReplace() {
         return this.delegate;
      }
   }

   static final class AsyncWeigher<K, V> implements Weigher<K, CompletableFuture<V>>, Serializable {
      private static final long serialVersionUID = 1L;
      final Weigher<K, V> delegate;

      AsyncWeigher(Weigher<K, V> var1) {
         this.delegate = Objects.requireNonNull(var1);
      }

      public int weigh(K var1, CompletableFuture<V> var2) {
         return Async.isReady(var2) ? this.delegate.weigh((K)var1, (V)var2.join()) : 0;
      }

      Object writeReplace() {
         return this.delegate;
      }
   }
}
