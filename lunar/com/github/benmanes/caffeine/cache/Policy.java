package com.github.benmanes.caffeine.cache;

import java.time.Duration;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;
import org.checkerframework.checker.index.qual.NonNegative;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.checker.nullness.qual.PolyNull;

public interface Policy<K, V> {
   boolean isRecordingStats();

   @Nullable V getIfPresentQuietly(K var1);

   default Policy.@Nullable CacheEntry<K, V> getEntryIfPresentQuietly(K var1) {
      throw new UnsupportedOperationException();
   }

   Map<K, CompletableFuture<V>> refreshes();

   Optional<Policy.Eviction<K, V>> eviction();

   Optional<Policy.FixedExpiration<K, V>> expireAfterAccess();

   Optional<Policy.FixedExpiration<K, V>> expireAfterWrite();

   Optional<Policy.VarExpiration<K, V>> expireVariably();

   Optional<Policy.FixedRefresh<K, V>> refreshAfterWrite();

   interface CacheEntry<K, V> extends Entry<K, V> {
      int weight();

      long expiresAt();

      default Duration expiresAfter() {
         return Duration.ofNanos(this.expiresAt() - this.snapshotAt());
      }

      long refreshableAt();

      default Duration refreshableAfter() {
         return Duration.ofNanos(this.refreshableAt() - this.snapshotAt());
      }

      long snapshotAt();
   }

   interface Eviction<K, V> {
      boolean isWeighted();

      OptionalInt weightOf(K var1);

      OptionalLong weightedSize();

      @NonNegative long getMaximum();

      void setMaximum(@NonNegative long var1);

      Map<K, V> coldest(@NonNegative int var1);

      default Map<K, V> coldestWeighted(@NonNegative long var1) {
         throw new UnsupportedOperationException();
      }

      default <T> T coldest(Function<Stream<Policy.CacheEntry<K, V>>, T> var1) {
         throw new UnsupportedOperationException();
      }

      Map<K, V> hottest(@NonNegative int var1);

      default Map<K, V> hottestWeighted(@NonNegative long var1) {
         throw new UnsupportedOperationException();
      }

      default <T> T hottest(Function<Stream<Policy.CacheEntry<K, V>>, T> var1) {
         throw new UnsupportedOperationException();
      }
   }

   interface FixedExpiration<K, V> {
      OptionalLong ageOf(K var1, TimeUnit var2);

      default Optional<Duration> ageOf(K var1) {
         OptionalLong var2 = this.ageOf((K)var1, TimeUnit.NANOSECONDS);
         return var2.isPresent() ? Optional.of(Duration.ofNanos(var2.getAsLong())) : Optional.empty();
      }

      @NonNegative long getExpiresAfter(TimeUnit var1);

      default Duration getExpiresAfter() {
         return Duration.ofNanos(this.getExpiresAfter(TimeUnit.NANOSECONDS));
      }

      void setExpiresAfter(@NonNegative long var1, TimeUnit var3);

      default void setExpiresAfter(Duration var1) {
         this.setExpiresAfter(Caffeine.saturatedToNanos(var1), TimeUnit.NANOSECONDS);
      }

      Map<K, V> oldest(@NonNegative int var1);

      default <T> T oldest(Function<Stream<Policy.CacheEntry<K, V>>, T> var1) {
         throw new UnsupportedOperationException();
      }

      Map<K, V> youngest(@NonNegative int var1);

      default <T> T youngest(Function<Stream<Policy.CacheEntry<K, V>>, T> var1) {
         throw new UnsupportedOperationException();
      }
   }

   interface FixedRefresh<K, V> {
      OptionalLong ageOf(K var1, TimeUnit var2);

      default Optional<Duration> ageOf(K var1) {
         OptionalLong var2 = this.ageOf((K)var1, TimeUnit.NANOSECONDS);
         return var2.isPresent() ? Optional.of(Duration.ofNanos(var2.getAsLong())) : Optional.empty();
      }

      @NonNegative long getRefreshesAfter(TimeUnit var1);

      default Duration getRefreshesAfter() {
         return Duration.ofNanos(this.getRefreshesAfter(TimeUnit.NANOSECONDS));
      }

      void setRefreshesAfter(@NonNegative long var1, TimeUnit var3);

      default void setRefreshesAfter(Duration var1) {
         this.setRefreshesAfter(Caffeine.saturatedToNanos(var1), TimeUnit.NANOSECONDS);
      }
   }

   interface VarExpiration<K, V> {
      OptionalLong getExpiresAfter(K var1, TimeUnit var2);

      default Optional<Duration> getExpiresAfter(K var1) {
         OptionalLong var2 = this.getExpiresAfter((K)var1, TimeUnit.NANOSECONDS);
         return var2.isPresent() ? Optional.of(Duration.ofNanos(var2.getAsLong())) : Optional.empty();
      }

      void setExpiresAfter(K var1, @NonNegative long var2, TimeUnit var4);

      default void setExpiresAfter(K var1, Duration var2) {
         this.setExpiresAfter((K)var1, Caffeine.saturatedToNanos(var2), TimeUnit.NANOSECONDS);
      }

      @Nullable V putIfAbsent(K var1, V var2, @NonNegative long var3, TimeUnit var5);

      default @Nullable V putIfAbsent(K var1, V var2, Duration var3) {
         return this.putIfAbsent((K)var1, (V)var2, Caffeine.saturatedToNanos(var3), TimeUnit.NANOSECONDS);
      }

      @Nullable V put(K var1, V var2, @NonNegative long var3, TimeUnit var5);

      default @Nullable V put(K var1, V var2, Duration var3) {
         return this.put((K)var1, (V)var2, Caffeine.saturatedToNanos(var3), TimeUnit.NANOSECONDS);
      }

      default @PolyNull V compute(K var1, BiFunction<? super K, ? super V, ? extends @PolyNull V> var2, Duration var3) {
         throw new UnsupportedOperationException();
      }

      Map<K, V> oldest(@NonNegative int var1);

      default <T> T oldest(Function<Stream<Policy.CacheEntry<K, V>>, T> var1) {
         throw new UnsupportedOperationException();
      }

      Map<K, V> youngest(@NonNegative int var1);

      default <T> T youngest(Function<Stream<Policy.CacheEntry<K, V>>, T> var1) {
         throw new UnsupportedOperationException();
      }
   }
}
