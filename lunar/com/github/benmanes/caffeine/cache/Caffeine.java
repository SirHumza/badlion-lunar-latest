package com.github.benmanes.caffeine.cache;

import com.github.benmanes.caffeine.cache.stats.ConcurrentStatsCounter;
import com.github.benmanes.caffeine.cache.stats.StatsCounter;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.FormatMethod;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.time.Duration;
import java.util.Collection;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.checkerframework.checker.index.qual.NonNegative;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class Caffeine<K, V> {
   static final Supplier<StatsCounter> ENABLED_STATS_COUNTER_SUPPLIER = ConcurrentStatsCounter::new;
   static final Logger logger = System.getLogger(Caffeine.class.getName());
   static final double DEFAULT_LOAD_FACTOR = 0.75;
   static final int UNSET_INT = -1;
   static final int DEFAULT_INITIAL_CAPACITY = 16;
   static final int DEFAULT_EXPIRATION_NANOS = 0;
   static final int DEFAULT_REFRESH_NANOS = 0;
   boolean strictParsing = true;
   boolean interner;
   long maximumSize = -1L;
   long maximumWeight = -1L;
   int initialCapacity = -1;
   long expireAfterWriteNanos = -1L;
   long expireAfterAccessNanos = -1L;
   long refreshAfterWriteNanos = -1L;
   @Nullable RemovalListener<? super K, ? super V> evictionListener;
   @Nullable RemovalListener<? super K, ? super V> removalListener;
   @Nullable Supplier<StatsCounter> statsCounterSupplier;
   @Nullable Weigher<? super K, ? super V> weigher;
   @Nullable Expiry<? super K, ? super V> expiry;
   @Nullable Scheduler scheduler;
   @Nullable Executor executor;
   @Nullable Ticker ticker;
   Caffeine.@Nullable Strength keyStrength;
   Caffeine.@Nullable Strength valueStrength;

   private Caffeine() {
   }

   @FormatMethod
   static void requireArgument(boolean var0, String var1, @Nullable Object... var2) {
      if (!var0) {
         throw new IllegalArgumentException(String.format(Locale.US, var1, var2));
      }
   }

   static void requireArgument(boolean var0) {
      if (!var0) {
         throw new IllegalArgumentException();
      }
   }

   static void requireState(boolean var0) {
      if (!var0) {
         throw new IllegalStateException();
      }
   }

   @FormatMethod
   static void requireState(boolean var0, String var1, @Nullable Object... var2) {
      if (!var0) {
         throw new IllegalStateException(String.format(Locale.US, var1, var2));
      }
   }

   static int ceilingPowerOfTwo(int var0) {
      return 1 << -Integer.numberOfLeadingZeros(var0 - 1);
   }

   static long ceilingPowerOfTwo(long var0) {
      return 1L << -Long.numberOfLeadingZeros(var0 - 1L);
   }

   static int calculateHashMapCapacity(int var0) {
      return (int)Math.ceil(var0 / 0.75);
   }

   static int calculateHashMapCapacity(Iterable<?> var0) {
      return var0 instanceof Collection ? calculateHashMapCapacity(((Collection)var0).size()) : 16;
   }

   public static Caffeine<Object, Object> newBuilder() {
      return new Caffeine<>();
   }

   static <K> BoundedLocalCache<K, Boolean> newWeakInterner() {
      Caffeine var0 = new Caffeine().executor(Runnable::run).weakKeys();
      var0.interner = true;
      return LocalCacheFactory.newBoundedLocalCache(var0, null, false);
   }

   public static Caffeine<Object, Object> from(CaffeineSpec var0) {
      Caffeine var1 = var0.toBuilder();
      var1.strictParsing = false;
      return var1;
   }

   public static Caffeine<Object, Object> from(String var0) {
      return from(CaffeineSpec.parse(var0));
   }

   @CanIgnoreReturnValue
   public Caffeine<K, V> initialCapacity(@NonNegative int var1) {
      requireState(this.initialCapacity == -1, "initial capacity was already set to %s", this.initialCapacity);
      requireArgument(var1 >= 0);
      this.initialCapacity = var1;
      return this;
   }

   boolean hasInitialCapacity() {
      return this.initialCapacity != -1;
   }

   int getInitialCapacity() {
      return this.hasInitialCapacity() ? this.initialCapacity : 16;
   }

   @CanIgnoreReturnValue
   public Caffeine<K, V> executor(Executor var1) {
      requireState(this.executor == null, "executor was already set to %s", this.executor);
      this.executor = Objects.requireNonNull(var1);
      return this;
   }

   Executor getExecutor() {
      return this.executor == null ? ForkJoinPool.commonPool() : this.executor;
   }

   @CanIgnoreReturnValue
   public Caffeine<K, V> scheduler(Scheduler var1) {
      requireState(this.scheduler == null, "scheduler was already set to %s", this.scheduler);
      this.scheduler = Objects.requireNonNull(var1);
      return this;
   }

   Scheduler getScheduler() {
      if (this.scheduler == null || this.scheduler == Scheduler.disabledScheduler()) {
         return Scheduler.disabledScheduler();
      } else {
         return this.scheduler == Scheduler.systemScheduler() ? this.scheduler : Scheduler.guardedScheduler(this.scheduler);
      }
   }

   @CanIgnoreReturnValue
   public Caffeine<K, V> maximumSize(@NonNegative long var1) {
      requireState(this.maximumSize == -1L, "maximum size was already set to %s", this.maximumSize);
      requireState(this.maximumWeight == -1L, "maximum weight was already set to %s", this.maximumWeight);
      requireState(this.weigher == null, "maximum size can not be combined with weigher");
      requireArgument(var1 >= 0L, "maximum size must not be negative");
      this.maximumSize = var1;
      return this;
   }

   @CanIgnoreReturnValue
   public Caffeine<K, V> maximumWeight(@NonNegative long var1) {
      requireState(this.maximumWeight == -1L, "maximum weight was already set to %s", this.maximumWeight);
      requireState(this.maximumSize == -1L, "maximum size was already set to %s", this.maximumSize);
      requireArgument(var1 >= 0L, "maximum weight must not be negative");
      this.maximumWeight = var1;
      return this;
   }

   @CanIgnoreReturnValue
   public <K1 extends K, V1 extends V> Caffeine<K1, V1> weigher(Weigher<? super K1, ? super V1> var1) {
      Objects.requireNonNull(var1);
      requireState(this.weigher == null, "weigher was already set to %s", this.weigher);
      requireState(!this.strictParsing || this.maximumSize == -1L, "weigher can not be combined with maximum size");
      Caffeine var2 = this;
      var2.weigher = var1;
      return var2;
   }

   boolean evicts() {
      return this.getMaximum() != -1L;
   }

   boolean isWeighted() {
      return this.weigher != null;
   }

   long getMaximum() {
      return this.isWeighted() ? this.maximumWeight : this.maximumSize;
   }

   <K1 extends K, V1 extends V> Weigher<K1, V1> getWeigher(boolean var1) {
      Weigher var2 = this.weigher != null && this.weigher != Weigher.singletonWeigher() ? Weigher.boundedWeigher(this.weigher) : Weigher.singletonWeigher();
      return var1 ? new Async.AsyncWeigher<>(var2) : var2;
   }

   @CanIgnoreReturnValue
   public Caffeine<K, V> weakKeys() {
      requireState(this.keyStrength == null, "Key strength was already set to %s", this.keyStrength);
      this.keyStrength = Caffeine.Strength.WEAK;
      return this;
   }

   boolean isStrongKeys() {
      return this.keyStrength == null;
   }

   @CanIgnoreReturnValue
   public Caffeine<K, V> weakValues() {
      requireState(this.valueStrength == null, "Value strength was already set to %s", this.valueStrength);
      this.valueStrength = Caffeine.Strength.WEAK;
      return this;
   }

   boolean isStrongValues() {
      return this.valueStrength == null;
   }

   boolean isWeakValues() {
      return this.valueStrength == Caffeine.Strength.WEAK;
   }

   @CanIgnoreReturnValue
   public Caffeine<K, V> softValues() {
      requireState(this.valueStrength == null, "Value strength was already set to %s", this.valueStrength);
      this.valueStrength = Caffeine.Strength.SOFT;
      return this;
   }

   @CanIgnoreReturnValue
   public Caffeine<K, V> expireAfterWrite(Duration var1) {
      return this.expireAfterWrite(saturatedToNanos(var1), TimeUnit.NANOSECONDS);
   }

   @CanIgnoreReturnValue
   public Caffeine<K, V> expireAfterWrite(@NonNegative long var1, TimeUnit var3) {
      requireState(this.expireAfterWriteNanos == -1L, "expireAfterWrite was already set to %s ns", this.expireAfterWriteNanos);
      requireState(this.expiry == null, "expireAfterWrite may not be used with variable expiration");
      requireArgument(var1 >= 0L, "duration cannot be negative: %s %s", var1, var3);
      this.expireAfterWriteNanos = var3.toNanos(var1);
      return this;
   }

   long getExpiresAfterWriteNanos() {
      return this.expiresAfterWrite() ? this.expireAfterWriteNanos : 0L;
   }

   boolean expiresAfterWrite() {
      return this.expireAfterWriteNanos != -1L;
   }

   @CanIgnoreReturnValue
   public Caffeine<K, V> expireAfterAccess(Duration var1) {
      return this.expireAfterAccess(saturatedToNanos(var1), TimeUnit.NANOSECONDS);
   }

   @CanIgnoreReturnValue
   public Caffeine<K, V> expireAfterAccess(@NonNegative long var1, TimeUnit var3) {
      requireState(this.expireAfterAccessNanos == -1L, "expireAfterAccess was already set to %s ns", this.expireAfterAccessNanos);
      requireState(this.expiry == null, "expireAfterAccess may not be used with variable expiration");
      requireArgument(var1 >= 0L, "duration cannot be negative: %s %s", var1, var3);
      this.expireAfterAccessNanos = var3.toNanos(var1);
      return this;
   }

   long getExpiresAfterAccessNanos() {
      return this.expiresAfterAccess() ? this.expireAfterAccessNanos : 0L;
   }

   boolean expiresAfterAccess() {
      return this.expireAfterAccessNanos != -1L;
   }

   @CanIgnoreReturnValue
   public <K1 extends K, V1 extends V> Caffeine<K1, V1> expireAfter(Expiry<? super K1, ? super V1> var1) {
      Objects.requireNonNull(var1);
      requireState(this.expiry == null, "Expiry was already set to %s", this.expiry);
      requireState(this.expireAfterAccessNanos == -1L, "Expiry may not be used with expiresAfterAccess");
      requireState(this.expireAfterWriteNanos == -1L, "Expiry may not be used with expiresAfterWrite");
      Caffeine var2 = this;
      var2.expiry = var1;
      return var2;
   }

   boolean expiresVariable() {
      return this.expiry != null;
   }

   @Nullable Expiry<K, V> getExpiry(boolean var1) {
      return var1 && this.expiry != null ? new Async.AsyncExpiry<>(this.expiry) : this.expiry;
   }

   @CanIgnoreReturnValue
   public Caffeine<K, V> refreshAfterWrite(Duration var1) {
      return this.refreshAfterWrite(saturatedToNanos(var1), TimeUnit.NANOSECONDS);
   }

   @CanIgnoreReturnValue
   public Caffeine<K, V> refreshAfterWrite(@NonNegative long var1, TimeUnit var3) {
      Objects.requireNonNull(var3);
      requireState(this.refreshAfterWriteNanos == -1L, "refreshAfterWriteNanos was already set to %s ns", this.refreshAfterWriteNanos);
      requireArgument(var1 > 0L, "duration must be positive: %s %s", var1, var3);
      this.refreshAfterWriteNanos = var3.toNanos(var1);
      return this;
   }

   long getRefreshAfterWriteNanos() {
      return this.refreshAfterWrite() ? this.refreshAfterWriteNanos : 0L;
   }

   boolean refreshAfterWrite() {
      return this.refreshAfterWriteNanos != -1L;
   }

   @CanIgnoreReturnValue
   public Caffeine<K, V> ticker(Ticker var1) {
      requireState(this.ticker == null, "Ticker was already set to %s", this.ticker);
      this.ticker = Objects.requireNonNull(var1);
      return this;
   }

   Ticker getTicker() {
      boolean var1 = this.expiresVariable() || this.expiresAfterAccess() || this.expiresAfterWrite() || this.refreshAfterWrite() || this.isRecordingStats();
      return var1 ? (this.ticker == null ? Ticker.systemTicker() : this.ticker) : Ticker.disabledTicker();
   }

   @CanIgnoreReturnValue
   public <K1 extends K, V1 extends V> Caffeine<K1, V1> evictionListener(RemovalListener<? super K1, ? super V1> var1) {
      requireState(this.evictionListener == null, "eviction listener was already set to %s", this.evictionListener);
      Caffeine var2 = this;
      var2.evictionListener = Objects.requireNonNull(var1);
      return var2;
   }

   <K1 extends K, V1 extends V> @Nullable RemovalListener<K1, V1> getEvictionListener(boolean var1) {
      RemovalListener var2 = this.evictionListener;
      return var1 && var2 != null ? new Async.AsyncEvictionListener<>(var2) : var2;
   }

   @CanIgnoreReturnValue
   public <K1 extends K, V1 extends V> Caffeine<K1, V1> removalListener(RemovalListener<? super K1, ? super V1> var1) {
      requireState(this.removalListener == null, "removal listener was already set to %s", this.removalListener);
      Caffeine var2 = this;
      var2.removalListener = Objects.requireNonNull(var1);
      return var2;
   }

   <K1 extends K, V1 extends V> @Nullable RemovalListener<K1, V1> getRemovalListener(boolean var1) {
      RemovalListener var2 = this.removalListener;
      return var1 && var2 != null ? new Async.AsyncRemovalListener<>(var2, this.getExecutor()) : var2;
   }

   @CanIgnoreReturnValue
   public Caffeine<K, V> recordStats() {
      requireState(this.statsCounterSupplier == null, "Statistics recording was already set");
      this.statsCounterSupplier = ENABLED_STATS_COUNTER_SUPPLIER;
      return this;
   }

   @CanIgnoreReturnValue
   public Caffeine<K, V> recordStats(Supplier<? extends StatsCounter> var1) {
      requireState(this.statsCounterSupplier == null, "Statistics recording was already set");
      this.statsCounterSupplier = () -> StatsCounter.guardedStatsCounter((StatsCounter)var1.get());
      return this;
   }

   boolean isRecordingStats() {
      return this.statsCounterSupplier != null;
   }

   Supplier<StatsCounter> getStatsCounterSupplier() {
      return this.statsCounterSupplier == null ? StatsCounter::disabledStatsCounter : this.statsCounterSupplier;
   }

   boolean isBounded() {
      return this.maximumSize != -1L
         || this.maximumWeight != -1L
         || this.expireAfterAccessNanos != -1L
         || this.expireAfterWriteNanos != -1L
         || this.expiry != null
         || this.keyStrength != null
         || this.valueStrength != null;
   }

   public <K1 extends K, V1 extends V> Cache<K1, V1> build() {
      this.requireWeightWithWeigher();
      this.requireNonLoadingCache();
      Caffeine var1 = this;
      return this.isBounded() ? new BoundedLocalCache.BoundedLocalManualCache<>(var1) : new UnboundedLocalCache.UnboundedLocalManualCache<>(var1);
   }

   public <K1 extends K, V1 extends V> LoadingCache<K1, V1> build(CacheLoader<? super K1, V1> var1) {
      this.requireWeightWithWeigher();
      Caffeine var2 = this;
      return !this.isBounded() && !this.refreshAfterWrite()
         ? new UnboundedLocalCache.UnboundedLocalLoadingCache<>(var2, var1)
         : new BoundedLocalCache.BoundedLocalLoadingCache<>(var2, var1);
   }

   public <K1 extends K, V1 extends V> AsyncCache<K1, V1> buildAsync() {
      requireState(this.valueStrength == null, "Weak or soft values can not be combined with AsyncCache");
      requireState(this.isStrongKeys() || this.evictionListener == null, "Weak keys cannot be combined eviction listener and with AsyncLoadingCache");
      this.requireWeightWithWeigher();
      this.requireNonLoadingCache();
      Caffeine var1 = this;
      return this.isBounded() ? new BoundedLocalCache.BoundedLocalAsyncCache<>(var1) : new UnboundedLocalCache.UnboundedLocalAsyncCache<>(var1);
   }

   public <K1 extends K, V1 extends V> AsyncLoadingCache<K1, V1> buildAsync(CacheLoader<? super K1, V1> var1) {
      return this.buildAsync((AsyncCacheLoader<? super K1, V1>)var1);
   }

   public <K1 extends K, V1 extends V> AsyncLoadingCache<K1, V1> buildAsync(AsyncCacheLoader<? super K1, V1> var1) {
      requireState(this.valueStrength == null, "Weak or soft values can not be combined with AsyncLoadingCache");
      requireState(this.isStrongKeys() || this.evictionListener == null, "Weak keys cannot be combined eviction listener and with AsyncLoadingCache");
      this.requireWeightWithWeigher();
      Objects.requireNonNull(var1);
      Caffeine var2 = this;
      return !this.isBounded() && !this.refreshAfterWrite()
         ? new UnboundedLocalCache.UnboundedLocalAsyncLoadingCache<>(var2, var1)
         : new BoundedLocalCache.BoundedLocalAsyncLoadingCache<>(var2, var1);
   }

   void requireNonLoadingCache() {
      requireState(this.refreshAfterWriteNanos == -1L, "refreshAfterWrite requires a LoadingCache");
   }

   void requireWeightWithWeigher() {
      if (this.weigher == null) {
         requireState(this.maximumWeight == -1L, "maximumWeight requires weigher");
      } else if (this.strictParsing) {
         requireState(this.maximumWeight != -1L, "weigher requires maximumWeight");
      } else if (this.maximumWeight == -1L) {
         logger.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
      }
   }

   static long saturatedToNanos(Duration var0) {
      try {
         return var0.toNanos();
      } catch (ArithmeticException var2) {
         return var0.isNegative() ? Long.MIN_VALUE : Long.MAX_VALUE;
      }
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder(200);
      var1.append(this.getClass().getSimpleName()).append('{');
      int var2 = var1.length();
      if (this.initialCapacity != -1) {
         var1.append("initialCapacity=").append(this.initialCapacity).append(", ");
      }

      if (this.maximumSize != -1L) {
         var1.append("maximumSize=").append(this.maximumSize).append(", ");
      }

      if (this.maximumWeight != -1L) {
         var1.append("maximumWeight=").append(this.maximumWeight).append(", ");
      }

      if (this.expireAfterWriteNanos != -1L) {
         var1.append("expireAfterWrite=").append(this.expireAfterWriteNanos).append("ns, ");
      }

      if (this.expireAfterAccessNanos != -1L) {
         var1.append("expireAfterAccess=").append(this.expireAfterAccessNanos).append("ns, ");
      }

      if (this.expiry != null) {
         var1.append("expiry, ");
      }

      if (this.refreshAfterWriteNanos != -1L) {
         var1.append("refreshAfterWrite=").append(this.refreshAfterWriteNanos).append("ns, ");
      }

      if (this.keyStrength != null) {
         var1.append("keyStrength=").append(this.keyStrength.toString().toLowerCase(Locale.US)).append(", ");
      }

      if (this.valueStrength != null) {
         var1.append("valueStrength=").append(this.valueStrength.toString().toLowerCase(Locale.US)).append(", ");
      }

      if (this.evictionListener != null) {
         var1.append("evictionListener, ");
      }

      if (this.removalListener != null) {
         var1.append("removalListener, ");
      }

      if (var1.length() > var2) {
         var1.delete(var1.length() - 2, var1.length());
      }

      return var1.append('}').toString();
   }

   enum Strength {
      WEAK,
      SOFT;
   }
}
