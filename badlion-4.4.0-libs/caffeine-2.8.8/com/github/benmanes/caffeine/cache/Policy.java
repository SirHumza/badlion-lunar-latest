package com.github.benmanes.caffeine.cache;

import com.google.errorprone.annotations.CompatibleWith;
import java.time.Duration;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.index.qual.NonNegative;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface Policy<K, V> {
   boolean isRecordingStats();

   default @Nullable V getIfPresentQuietly(@CompatibleWith("K") @NonNull Object key) {
      throw new UnsupportedOperationException();
   }

   @NonNull Optional<Policy.Eviction<K, V>> eviction();

   @NonNull Optional<Policy.Expiration<K, V>> expireAfterAccess();

   @NonNull Optional<Policy.Expiration<K, V>> expireAfterWrite();

   default @NonNull Optional<Policy.VarExpiration<K, V>> expireVariably() {
      return Optional.empty();
   }

   @NonNull Optional<Policy.Expiration<K, V>> refreshAfterWrite();

   interface Eviction<K, V> {
      boolean isWeighted();

      default @NonNull OptionalInt weightOf(@NonNull K key) {
         return OptionalInt.empty();
      }

      @NonNull OptionalLong weightedSize();

      @NonNegative long getMaximum();

      void setMaximum(@NonNegative long var1);

      @NonNull Map<@NonNull K, @NonNull V> coldest(@NonNegative int var1);

      @NonNull Map<@NonNull K, @NonNull V> hottest(@NonNegative int var1);
   }

   interface Expiration<K, V> {
      @NonNull OptionalLong ageOf(@NonNull K var1, @NonNull TimeUnit var2);

      default @NonNull Optional<Duration> ageOf(@NonNull K key) {
         OptionalLong duration = this.ageOf(key, TimeUnit.NANOSECONDS);
         return duration.isPresent() ? Optional.of(Duration.ofNanos(duration.getAsLong())) : Optional.empty();
      }

      @NonNegative long getExpiresAfter(@NonNull TimeUnit var1);

      default @NonNull Duration getExpiresAfter() {
         return Duration.ofNanos(this.getExpiresAfter(TimeUnit.NANOSECONDS));
      }

      void setExpiresAfter(@NonNegative long var1, @NonNull TimeUnit var3);

      default void setExpiresAfter(@NonNull Duration duration) {
         this.setExpiresAfter(duration.toNanos(), TimeUnit.NANOSECONDS);
      }

      @NonNull Map<@NonNull K, @NonNull V> oldest(@NonNegative int var1);

      @NonNull Map<@NonNull K, @NonNull V> youngest(@NonNegative int var1);
   }

   interface VarExpiration<K, V> {
      @NonNull OptionalLong getExpiresAfter(@NonNull K var1, @NonNull TimeUnit var2);

      default @NonNull Optional<Duration> getExpiresAfter(@NonNull K key) {
         OptionalLong duration = this.getExpiresAfter(key, TimeUnit.NANOSECONDS);
         return duration.isPresent() ? Optional.of(Duration.ofNanos(duration.getAsLong())) : Optional.empty();
      }

      void setExpiresAfter(@NonNull K var1, @NonNegative long var2, @NonNull TimeUnit var4);

      default void setExpiresAfter(@NonNull K key, @NonNull Duration duration) {
         this.setExpiresAfter(key, duration.toNanos(), TimeUnit.NANOSECONDS);
      }

      default boolean putIfAbsent(@NonNull K key, @NonNull V value, @NonNegative long duration, @NonNull TimeUnit unit) {
         throw new UnsupportedOperationException();
      }

      default boolean putIfAbsent(@NonNull K key, @NonNull V value, @NonNull Duration duration) {
         return this.putIfAbsent(key, value, duration.toNanos(), TimeUnit.NANOSECONDS);
      }

      default void put(@NonNull K key, @NonNull V value, @NonNegative long duration, @NonNull TimeUnit unit) {
         throw new UnsupportedOperationException();
      }

      default void put(@NonNull K key, @NonNull V value, @NonNull Duration duration) {
         this.put(key, value, duration.toNanos(), TimeUnit.NANOSECONDS);
      }

      @NonNull Map<@NonNull K, @NonNull V> oldest(@NonNegative int var1);

      @NonNull Map<@NonNull K, @NonNull V> youngest(@NonNegative int var1);
   }
}
