package com.github.benmanes.caffeine.cache;

import com.github.benmanes.caffeine.cache.stats.StatsCounter;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.Map.Entry;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.checkerframework.checker.nullness.qual.Nullable;

abstract class BoundedLocalCache<K, V> extends BLCHeader.DrainStatusRef implements LocalCache<K, V> {
   static final Logger logger = System.getLogger(BoundedLocalCache.class.getName());
   static final int NCPU = Runtime.getRuntime().availableProcessors();
   static final int WRITE_BUFFER_MIN = 4;
   static final int WRITE_BUFFER_MAX = 128 * Caffeine.ceilingPowerOfTwo(NCPU);
   static final int WRITE_BUFFER_RETRIES = 100;
   static final long MAXIMUM_CAPACITY = 9223372034707292160L;
   static final double PERCENT_MAIN = 0.99;
   static final double PERCENT_MAIN_PROTECTED = 0.8;
   static final double HILL_CLIMBER_RESTART_THRESHOLD = 0.05;
   static final double HILL_CLIMBER_STEP_PERCENT = 0.0625;
   static final double HILL_CLIMBER_STEP_DECAY_RATE = 0.98;
   static final int ADMIT_HASHDOS_THRESHOLD = 6;
   static final int QUEUE_TRANSFER_THRESHOLD = 1000;
   static final long EXPIRE_WRITE_TOLERANCE = TimeUnit.SECONDS.toNanos(1L);
   static final long MAXIMUM_EXPIRY = 4611686018427387903L;
   static final long WARN_AFTER_LOCK_WAIT_NANOS = TimeUnit.SECONDS.toNanos(30L);
   static final int MAX_PUT_SPIN_WAIT_ATTEMPTS = 1023;
   static final VarHandle REFRESHES;
   final @Nullable RemovalListener<K, V> evictionListener;
   final @Nullable AsyncCacheLoader<K, V> cacheLoader;
   final MpscGrowableArrayQueue<Runnable> writeBuffer;
   final ConcurrentHashMap<Object, Node<K, V>> data;
   final BoundedLocalCache.PerformCleanupTask drainBuffersTask;
   final Consumer<Node<K, V>> accessPolicy;
   final Buffer<Node<K, V>> readBuffer;
   final NodeFactory<K, V> nodeFactory;
   final ReentrantLock evictionLock;
   final Weigher<K, V> weigher;
   final Executor executor;
   final boolean isWeighted;
   final boolean isAsync;
   @Nullable Set<K> keySet;
   @Nullable Collection<V> values;
   @Nullable Set<Entry<K, V>> entrySet;
   volatile @Nullable ConcurrentMap<Object, CompletableFuture<?>> refreshes;

   protected BoundedLocalCache(Caffeine<K, V> var1, @Nullable AsyncCacheLoader<K, V> var2, boolean var3) {
      this.isAsync = var3;
      this.cacheLoader = var2;
      this.executor = var1.getExecutor();
      this.isWeighted = var1.isWeighted();
      this.evictionLock = new ReentrantLock();
      this.weigher = var1.getWeigher(var3);
      this.drainBuffersTask = new BoundedLocalCache.PerformCleanupTask(this);
      this.nodeFactory = NodeFactory.newFactory(var1, var3);
      this.evictionListener = var1.getEvictionListener(var3);
      this.data = new ConcurrentHashMap<>(var1.getInitialCapacity());
      this.readBuffer = !this.evicts() && !this.collectKeys() && !this.collectValues() && !this.expiresAfterAccess()
         ? Buffer.disabled()
         : new BoundedBuffer<>();
      this.accessPolicy = !this.evicts() && !this.expiresAfterAccess() ? var0 -> {} : this::onAccess;
      this.writeBuffer = new MpscGrowableArrayQueue<>(4, WRITE_BUFFER_MAX);
      if (this.evicts()) {
         this.setMaximumSize(var1.getMaximum());
      }
   }

   void requireIsAlive(Object var1, Node<?, ?> var2) {
      if (!var2.isAlive()) {
         throw new IllegalStateException(this.brokenEqualityMessage(var1, var2));
      }
   }

   void logIfAlive(Node<?, ?> var1) {
      if (var1.isAlive()) {
         String var2 = this.brokenEqualityMessage(var1.getKeyReference(), var1);
         logger.log(Level.ERROR, var2, new IllegalStateException());
      }
   }

   String brokenEqualityMessage(Object var1, Node<?, ?> var2) {
      return String.format(
         Locale.US,
         "An invalid state was detected, occurring when the key's equals or hashCode was modified while residing in the cache. This violation of the Map contract can lead to non-deterministic behavior (key: %s, key type: %s, node type: %s, cache type: %s).",
         var1,
         var1.getClass().getName(),
         var2.getClass().getSimpleName(),
         this.getClass().getSimpleName()
      );
   }

   @Override
   public boolean isAsync() {
      return this.isAsync;
   }

   final boolean isComputingAsync(Node<?, ?> var1) {
      return this.isAsync && !Async.isReady((CompletableFuture<?>)var1.getValue());
   }

   @GuardedBy("evictionLock")
   protected AccessOrderDeque<Node<K, V>> accessOrderWindowDeque() {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected AccessOrderDeque<Node<K, V>> accessOrderProbationDeque() {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected AccessOrderDeque<Node<K, V>> accessOrderProtectedDeque() {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected WriteOrderDeque<Node<K, V>> writeOrderDeque() {
      throw new UnsupportedOperationException();
   }

   @Override
   public final Executor executor() {
      return this.executor;
   }

   @Override
   public ConcurrentMap<Object, CompletableFuture<?>> refreshes() {
      ConcurrentMap var1 = this.refreshes;
      if (var1 == null) {
         var1 = new ConcurrentHashMap();
         if (!REFRESHES.compareAndSet((BoundedLocalCache)this, (Void)null, (ConcurrentMap)var1)) {
            var1 = this.refreshes;
         }
      }

      return var1;
   }

   void discardRefresh(Object var1) {
      ConcurrentMap var2 = this.refreshes;
      if (var2 != null && var2.containsKey(var1)) {
         var2.remove(var1);
      }
   }

   @Override
   public Object referenceKey(K var1) {
      return this.nodeFactory.newLookupKey(var1);
   }

   @Override
   public boolean isPendingEviction(K var1) {
      Node var2 = this.data.get(this.nodeFactory.newLookupKey(var1));
      return var2 != null && (var2.getValue() == null || this.hasExpired(var2, this.expirationTicker().read()));
   }

   @Override
   public boolean isRecordingStats() {
      return false;
   }

   @Override
   public StatsCounter statsCounter() {
      return StatsCounter.disabledStatsCounter();
   }

   @Override
   public Ticker statsTicker() {
      return Ticker.disabledTicker();
   }

   protected RemovalListener<K, V> removalListener() {
      return null;
   }

   protected boolean hasRemovalListener() {
      return false;
   }

   @Override
   public void notifyRemoval(@Nullable K var1, @Nullable V var2, RemovalCause var3) {
      if (this.hasRemovalListener()) {
         Runnable var4 = () -> {
            try {
               this.removalListener().onRemoval((K)var1, (V)var2, var3);
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

   void notifyEviction(@Nullable K var1, @Nullable V var2, RemovalCause var3) {
      if (this.evictionListener != null) {
         try {
            this.evictionListener.onRemoval((K)var1, (V)var2, var3);
         } catch (Throwable var5) {
            logger.log(Level.WARNING, "Exception thrown by eviction listener", var5);
         }
      }
   }

   protected boolean collectKeys() {
      return false;
   }

   protected boolean collectValues() {
      return false;
   }

   protected ReferenceQueue<K> keyReferenceQueue() {
      return null;
   }

   protected ReferenceQueue<V> valueReferenceQueue() {
      return null;
   }

   protected @Nullable Pacer pacer() {
      return null;
   }

   protected boolean expiresVariable() {
      return false;
   }

   protected boolean expiresAfterAccess() {
      return false;
   }

   protected long expiresAfterAccessNanos() {
      throw new UnsupportedOperationException();
   }

   protected void setExpiresAfterAccessNanos(long var1) {
      throw new UnsupportedOperationException();
   }

   protected boolean expiresAfterWrite() {
      return false;
   }

   protected long expiresAfterWriteNanos() {
      throw new UnsupportedOperationException();
   }

   protected void setExpiresAfterWriteNanos(long var1) {
      throw new UnsupportedOperationException();
   }

   protected boolean refreshAfterWrite() {
      return false;
   }

   protected long refreshAfterWriteNanos() {
      throw new UnsupportedOperationException();
   }

   protected void setRefreshAfterWriteNanos(long var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public Expiry<K, V> expiry() {
      return null;
   }

   public Ticker expirationTicker() {
      return Ticker.disabledTicker();
   }

   protected TimerWheel<K, V> timerWheel() {
      throw new UnsupportedOperationException();
   }

   protected boolean evicts() {
      return false;
   }

   protected boolean isWeighted() {
      return this.weigher != Weigher.singletonWeigher();
   }

   protected FrequencySketch<K> frequencySketch() {
      throw new UnsupportedOperationException();
   }

   protected boolean fastpath() {
      return false;
   }

   protected long maximum() {
      throw new UnsupportedOperationException();
   }

   protected long windowMaximum() {
      throw new UnsupportedOperationException();
   }

   protected long mainProtectedMaximum() {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setMaximum(long var1) {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setWindowMaximum(long var1) {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setMainProtectedMaximum(long var1) {
      throw new UnsupportedOperationException();
   }

   protected long weightedSize() {
      throw new UnsupportedOperationException();
   }

   protected long windowWeightedSize() {
      throw new UnsupportedOperationException();
   }

   protected long mainProtectedWeightedSize() {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setWeightedSize(long var1) {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setWindowWeightedSize(long var1) {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setMainProtectedWeightedSize(long var1) {
      throw new UnsupportedOperationException();
   }

   protected int hitsInSample() {
      throw new UnsupportedOperationException();
   }

   protected int missesInSample() {
      throw new UnsupportedOperationException();
   }

   protected int sampleCount() {
      throw new UnsupportedOperationException();
   }

   protected double stepSize() {
      throw new UnsupportedOperationException();
   }

   protected double previousSampleHitRate() {
      throw new UnsupportedOperationException();
   }

   protected long adjustment() {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setHitsInSample(int var1) {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setMissesInSample(int var1) {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setSampleCount(int var1) {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setStepSize(double var1) {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setPreviousSampleHitRate(double var1) {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setAdjustment(long var1) {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   void setMaximumSize(long var1) {
      Caffeine.requireArgument(var1 >= 0L, "maximum must not be negative");
      if (var1 != this.maximum()) {
         long var3 = Math.min(var1, 9223372034707292160L);
         long var5 = var3 - (long)(0.99 * var3);
         long var7 = (long)(0.8 * (var3 - var5));
         this.setMaximum(var3);
         this.setWindowMaximum(var5);
         this.setMainProtectedMaximum(var7);
         this.setHitsInSample(0);
         this.setMissesInSample(0);
         this.setStepSize(-0.0625 * var3);
         if (this.frequencySketch() != null && !this.isWeighted() && this.weightedSize() >= var3 >>> 1) {
            this.frequencySketch().ensureCapacity(var3);
         }
      }
   }

   @GuardedBy("evictionLock")
   void evictEntries() {
      if (this.evicts()) {
         Node var1 = this.evictFromWindow();
         this.evictFromMain(var1);
      }
   }

   @GuardedBy("evictionLock")
   @Nullable Node<K, V> evictFromWindow() {
      Node var1 = null;
      Node var2 = this.accessOrderWindowDeque().peekFirst();

      while (this.windowWeightedSize() > this.windowMaximum() && var2 != null) {
         Node var3 = var2.getNextInAccessOrder();
         if (var2.getPolicyWeight() != 0) {
            var2.makeMainProbation();
            this.accessOrderWindowDeque().remove(var2);
            this.accessOrderProbationDeque().offerLast(var2);
            if (var1 == null) {
               var1 = var2;
            }

            this.setWindowWeightedSize(this.windowWeightedSize() - var2.getPolicyWeight());
         }

         var2 = var3;
      }

      return var1;
   }

   @GuardedBy("evictionLock")
   void evictFromMain(@Nullable Node<K, V> var1) {
      byte var2 = 1;
      boolean var3 = true;
      Node var4 = this.accessOrderProbationDeque().peekFirst();

      while (this.weightedSize() > this.maximum()) {
         if (var1 == null && var3) {
            var1 = this.accessOrderWindowDeque().peekFirst();
            var3 = false;
         }

         if (var1 == null && var4 == null) {
            if (var2 == 1) {
               var4 = this.accessOrderProtectedDeque().peekFirst();
               var2 = 2;
            } else {
               if (var2 != 2) {
                  break;
               }

               var4 = this.accessOrderWindowDeque().peekFirst();
               var2 = 0;
            }
         } else if (var4 != null && var4.getPolicyWeight() == 0) {
            var4 = var4.getNextInAccessOrder();
         } else if (var1 != null && var1.getPolicyWeight() == 0) {
            var1 = var1.getNextInAccessOrder();
         } else if (var4 == null) {
            Node var5 = var1.getNextInAccessOrder();
            Node var6 = var1;
            var1 = var5;
            this.evictEntry(var6, RemovalCause.SIZE, 0L);
         } else if (var1 == null) {
            Node var8 = var4;
            var4 = var4.getNextInAccessOrder();
            this.evictEntry(var8, RemovalCause.SIZE, 0L);
         } else if (var1 == var4) {
            var4 = var4.getNextInAccessOrder();
            this.evictEntry(var1, RemovalCause.SIZE, 0L);
            var1 = null;
         } else {
            Object var9 = var4.getKey();
            Object var10 = var1.getKey();
            if (var9 == null) {
               Node var7 = var4;
               var4 = var4.getNextInAccessOrder();
               this.evictEntry(var7, RemovalCause.COLLECTED, 0L);
            } else if (var10 == null) {
               Node var11 = var1;
               var1 = var1.getNextInAccessOrder();
               this.evictEntry(var11, RemovalCause.COLLECTED, 0L);
            } else if (!var4.isAlive()) {
               Node var12 = var4;
               var4 = var4.getNextInAccessOrder();
               this.evictEntry(var12, RemovalCause.SIZE, 0L);
            } else if (!var1.isAlive()) {
               Node var13 = var1;
               var1 = var1.getNextInAccessOrder();
               this.evictEntry(var13, RemovalCause.SIZE, 0L);
            } else if (var1.getPolicyWeight() > this.maximum()) {
               Node var14 = var1;
               var1 = var1.getNextInAccessOrder();
               this.evictEntry(var14, RemovalCause.SIZE, 0L);
            } else if (this.admit((K)var10, (K)var9)) {
               Node var15 = var4;
               var4 = var4.getNextInAccessOrder();
               this.evictEntry(var15, RemovalCause.SIZE, 0L);
               var1 = var1.getNextInAccessOrder();
            } else {
               Node var16 = var1;
               var1 = var1.getNextInAccessOrder();
               this.evictEntry(var16, RemovalCause.SIZE, 0L);
            }
         }
      }
   }

   @GuardedBy("evictionLock")
   boolean admit(K var1, K var2) {
      int var3 = this.frequencySketch().frequency((K)var2);
      int var4 = this.frequencySketch().frequency((K)var1);
      if (var4 > var3) {
         return true;
      } else if (var4 >= 6) {
         int var5 = ThreadLocalRandom.current().nextInt();
         return (var5 & 127) == 0;
      } else {
         return false;
      }
   }

   @GuardedBy("evictionLock")
   void expireEntries() {
      long var1 = this.expirationTicker().read();
      this.expireAfterAccessEntries(var1);
      this.expireAfterWriteEntries(var1);
      this.expireVariableEntries(var1);
      Pacer var3 = this.pacer();
      if (var3 != null) {
         long var4 = this.getExpirationDelay(var1);
         if (var4 == Long.MAX_VALUE) {
            var3.cancel();
         } else {
            var3.schedule(this.executor, this.drainBuffersTask, var1, var4);
         }
      }
   }

   @GuardedBy("evictionLock")
   void expireAfterAccessEntries(long var1) {
      if (this.expiresAfterAccess()) {
         this.expireAfterAccessEntries(this.accessOrderWindowDeque(), var1);
         if (this.evicts()) {
            this.expireAfterAccessEntries(this.accessOrderProbationDeque(), var1);
            this.expireAfterAccessEntries(this.accessOrderProtectedDeque(), var1);
         }
      }
   }

   @GuardedBy("evictionLock")
   void expireAfterAccessEntries(AccessOrderDeque<Node<K, V>> var1, long var2) {
      long var4 = this.expiresAfterAccessNanos();

      Node var6;
      do {
         var6 = (Node)var1.peekFirst();
      } while (var6 != null && var2 - var6.getAccessTime() >= var4 && this.evictEntry(var6, RemovalCause.EXPIRED, var2));
   }

   @GuardedBy("evictionLock")
   void expireAfterWriteEntries(long var1) {
      if (this.expiresAfterWrite()) {
         long var3 = this.expiresAfterWriteNanos();

         Node var5;
         do {
            var5 = this.writeOrderDeque().peekFirst();
         } while (var5 != null && var1 - var5.getWriteTime() >= var3 && this.evictEntry(var5, RemovalCause.EXPIRED, var1));
      }
   }

   @GuardedBy("evictionLock")
   void expireVariableEntries(long var1) {
      if (this.expiresVariable()) {
         this.timerWheel().advance(this, var1);
      }
   }

   @GuardedBy("evictionLock")
   long getExpirationDelay(long var1) {
      long var3 = Long.MAX_VALUE;
      if (this.expiresAfterAccess()) {
         Node var5 = this.accessOrderWindowDeque().peekFirst();
         if (var5 != null) {
            var3 = Math.min(var3, this.expiresAfterAccessNanos() - (var1 - var5.getAccessTime()));
         }

         if (this.evicts()) {
            var5 = this.accessOrderProbationDeque().peekFirst();
            if (var5 != null) {
               var3 = Math.min(var3, this.expiresAfterAccessNanos() - (var1 - var5.getAccessTime()));
            }

            var5 = this.accessOrderProtectedDeque().peekFirst();
            if (var5 != null) {
               var3 = Math.min(var3, this.expiresAfterAccessNanos() - (var1 - var5.getAccessTime()));
            }
         }
      }

      if (this.expiresAfterWrite()) {
         Node var8 = this.writeOrderDeque().peekFirst();
         if (var8 != null) {
            var3 = Math.min(var3, this.expiresAfterWriteNanos() - (var1 - var8.getWriteTime()));
         }
      }

      if (this.expiresVariable()) {
         var3 = Math.min(var3, this.timerWheel().getExpirationDelay());
      }

      return var3;
   }

   boolean hasExpired(Node<K, V> var1, long var2) {
      return this.isComputingAsync(var1)
         ? false
         : (this.expiresAfterAccess() && var2 - var1.getAccessTime() >= this.expiresAfterAccessNanos())
            | (this.expiresAfterWrite() && var2 - var1.getWriteTime() >= this.expiresAfterWriteNanos())
            | (this.expiresVariable() && var2 - var1.getVariableTime() >= 0L);
   }

   @GuardedBy("evictionLock")
   boolean evictEntry(Node<K, V> var1, RemovalCause var2, long var3) {
      Object var5 = var1.getKey();
      Object[] var6 = new Object[1];
      boolean[] var7 = new boolean[1];
      boolean[] var8 = new boolean[1];
      Object var9 = var1.getKeyReference();
      RemovalCause[] var10 = new RemovalCause[1];
      this.data.computeIfPresent(var9, (var11, var12) -> {
         if (var12 != var1) {
            return var12;
         }

         synchronized (var12) {
            var6[0] = var12.getValue();
            if (var5 != null && var6[0] != null) {
               if (var2 == RemovalCause.COLLECTED) {
                  var8[0] = true;
                  return var12;
               }

               var10[0] = var2;
            } else {
               var10[0] = RemovalCause.COLLECTED;
            }

            if (var10[0] == RemovalCause.EXPIRED) {
               boolean var14 = false;
               if (this.expiresAfterAccess()) {
                  var14 |= var3 - var12.getAccessTime() >= this.expiresAfterAccessNanos();
               }

               if (this.expiresAfterWrite()) {
                  var14 |= var3 - var12.getWriteTime() >= this.expiresAfterWriteNanos();
               }

               if (this.expiresVariable()) {
                  var14 |= var12.getVariableTime() <= var3;
               }

               if (!var14) {
                  var8[0] = true;
                  return var12;
               }
            } else if (var10[0] == RemovalCause.SIZE) {
               int var17 = var1.getWeight();
               if (var17 == 0) {
                  var8[0] = true;
                  return var12;
               }
            }

            this.notifyEviction((K)var5, (V)var6[0], var10[0]);
            this.discardRefresh(var9);
            var7[0] = true;
            var1.retire();
            return null;
         }
      });
      if (var8[0]) {
         return false;
      }

      if (!var1.inWindow() || !this.evicts() && !this.expiresAfterAccess()) {
         if (this.evicts()) {
            if (var1.inMainProbation()) {
               this.accessOrderProbationDeque().remove(var1);
            } else {
               this.accessOrderProtectedDeque().remove(var1);
            }
         }
      } else {
         this.accessOrderWindowDeque().remove(var1);
      }

      if (this.expiresAfterWrite()) {
         this.writeOrderDeque().remove(var1);
      } else if (this.expiresVariable()) {
         this.timerWheel().deschedule(var1);
      }

      synchronized (var1) {
         this.logIfAlive(var1);
         this.makeDead(var1);
      }

      if (var7[0]) {
         this.statsCounter().recordEviction(var1.getWeight(), var10[0]);
         this.notifyRemoval((K)var5, (V)var6[0], var10[0]);
      }

      return true;
   }

   @GuardedBy("evictionLock")
   void climb() {
      if (this.evicts()) {
         this.determineAdjustment();
         this.demoteFromMainProtected();
         long var1 = this.adjustment();
         if (var1 != 0L) {
            if (var1 > 0L) {
               this.increaseWindow();
            } else {
               this.decreaseWindow();
            }
         }
      }
   }

   @GuardedBy("evictionLock")
   void determineAdjustment() {
      if (this.frequencySketch().isNotInitialized()) {
         this.setPreviousSampleHitRate(0.0);
         this.setMissesInSample(0);
         this.setHitsInSample(0);
      } else {
         int var1 = this.hitsInSample() + this.missesInSample();
         if (var1 >= this.frequencySketch().sampleSize) {
            double var2 = (double)this.hitsInSample() / var1;
            double var4 = var2 - this.previousSampleHitRate();
            double var6 = var4 >= 0.0 ? this.stepSize() : -this.stepSize();
            double var8 = Math.abs(var4) >= 0.05 ? 0.0625 * this.maximum() * (var6 >= 0.0 ? 1 : -1) : 0.98 * var6;
            this.setPreviousSampleHitRate(var2);
            this.setAdjustment((long)var6);
            this.setStepSize(var8);
            this.setMissesInSample(0);
            this.setHitsInSample(0);
         }
      }
   }

   @GuardedBy("evictionLock")
   void increaseWindow() {
      if (this.mainProtectedMaximum() != 0L) {
         long var1 = Math.min(this.adjustment(), this.mainProtectedMaximum());
         this.setMainProtectedMaximum(this.mainProtectedMaximum() - var1);
         this.setWindowMaximum(this.windowMaximum() + var1);
         this.demoteFromMainProtected();

         for (int var3 = 0; var3 < 1000; var3++) {
            Node var4 = this.accessOrderProbationDeque().peekFirst();
            boolean var5 = true;
            if (var4 == null || var1 < var4.getPolicyWeight()) {
               var4 = this.accessOrderProtectedDeque().peekFirst();
               var5 = false;
            }

            if (var4 == null) {
               break;
            }

            int var6 = var4.getPolicyWeight();
            if (var1 < var6) {
               break;
            }

            var1 -= var6;
            if (var5) {
               this.accessOrderProbationDeque().remove(var4);
            } else {
               this.setMainProtectedWeightedSize(this.mainProtectedWeightedSize() - var6);
               this.accessOrderProtectedDeque().remove(var4);
            }

            this.setWindowWeightedSize(this.windowWeightedSize() + var6);
            this.accessOrderWindowDeque().offerLast(var4);
            var4.makeWindow();
         }

         this.setMainProtectedMaximum(this.mainProtectedMaximum() + var1);
         this.setWindowMaximum(this.windowMaximum() - var1);
         this.setAdjustment(var1);
      }
   }

   @GuardedBy("evictionLock")
   void decreaseWindow() {
      if (this.windowMaximum() > 1L) {
         long var1 = Math.min(-this.adjustment(), Math.max(0L, this.windowMaximum() - 1L));
         this.setMainProtectedMaximum(this.mainProtectedMaximum() + var1);
         this.setWindowMaximum(this.windowMaximum() - var1);

         for (int var3 = 0; var3 < 1000; var3++) {
            Node var4 = this.accessOrderWindowDeque().peekFirst();
            if (var4 == null) {
               break;
            }

            int var5 = var4.getPolicyWeight();
            if (var1 < var5) {
               break;
            }

            var1 -= var5;
            this.setWindowWeightedSize(this.windowWeightedSize() - var5);
            this.accessOrderWindowDeque().remove(var4);
            this.accessOrderProbationDeque().offerLast(var4);
            var4.makeMainProbation();
         }

         this.setMainProtectedMaximum(this.mainProtectedMaximum() - var1);
         this.setWindowMaximum(this.windowMaximum() + var1);
         this.setAdjustment(-var1);
      }
   }

   @GuardedBy("evictionLock")
   void demoteFromMainProtected() {
      long var1 = this.mainProtectedMaximum();
      long var3 = this.mainProtectedWeightedSize();
      if (var3 > var1) {
         for (int var5 = 0; var5 < 1000 && var3 > var1; var5++) {
            Node var6 = this.accessOrderProtectedDeque().poll();
            if (var6 == null) {
               break;
            }

            var6.makeMainProbation();
            this.accessOrderProbationDeque().offerLast(var6);
            var3 -= var6.getPolicyWeight();
         }

         this.setMainProtectedWeightedSize(var3);
      }
   }

   @Nullable V afterRead(Node<K, V> var1, long var2, boolean var4) {
      if (var4) {
         this.statsCounter().recordHits(1);
      }

      boolean var5 = this.skipReadBuffer() || this.readBuffer.offer(var1) != 1;
      if (this.shouldDrainBuffers(var5)) {
         this.scheduleDrainBuffers();
      }

      return this.refreshIfNeeded(var1, var2);
   }

   boolean skipReadBuffer() {
      return this.fastpath() && this.frequencySketch().isNotInitialized();
   }

   @Nullable V refreshIfNeeded(Node<K, V> var1, long var2) {
      if (!this.refreshAfterWrite()) {
         return null;
      }

      long var6 = var1.getWriteTime();
      long var8 = var6 | 1L;
      Object var10 = var1.getKeyReference();
      Object var4;
      Object var5;
      ConcurrentMap var11;
      if (var2 - var6 > this.refreshAfterWriteNanos()
         && var10 != null
         && (var4 = var1.getKey()) != null
         && (var5 = var1.getValue()) != null
         && (var6 & 1L) == 0L
         && !(var11 = this.refreshes()).containsKey(var10)
         && var1.isAlive()
         && var1.casWriteTime(var6, var8)) {
         long[] var12 = new long[1];
         CompletableFuture[] var13 = new CompletableFuture[1];

         try {
            var11.computeIfAbsent(var10, var5x -> {
               try {
                  var12[0] = this.statsTicker().read();
                  if (this.isAsync) {
                     CompletableFuture var6x = (CompletableFuture)var5;
                     if (!Async.isReady(var6x)) {
                        return var6x;
                     }

                     CompletableFuture var7 = this.cacheLoader.asyncReload((K)var4, (V)var6x.join(), this.executor);
                     var13[0] = Objects.requireNonNull(var7, "Null future");
                  } else {
                     CompletableFuture var10x = this.cacheLoader.asyncReload((K)var4, (V)var5, this.executor);
                     var13[0] = Objects.requireNonNull(var10x, "Null future");
                  }

                  return var13[0];
               } catch (InterruptedException var8x) {
                  Thread.currentThread().interrupt();
                  logger.log(Level.WARNING, "Exception thrown when submitting refresh task", var8x);
                  return null;
               } catch (Throwable var9) {
                  logger.log(Level.WARNING, "Exception thrown when submitting refresh task", var9);
                  return null;
               }
            });
         } finally {
            var1.casWriteTime(var8, var6);
         }

         if (var13[0] == null) {
            return null;
         }

         CompletableFuture var14 = var13[0].handle((var10x, var11x) -> {
            long var12x = this.statsTicker().read() - var12[0];
            if (var11x != null) {
               if (!(var11x instanceof CancellationException) && !(var11x instanceof TimeoutException)) {
                  logger.log(Level.WARNING, "Exception thrown during refresh", var11x);
               }

               var11.remove(var10, var13[0]);
               this.statsCounter().recordLoadFailure(var12x);
               return null;
            } else {
               Object var14x = this.isAsync && var10x != null ? var13[0] : var10x;
               RemovalCause[] var15 = new RemovalCause[1];
               Object var16x = this.compute((K)var4, (var8xx, var9) -> {
                  if (var9 == null) {
                     if (var14x != null) {
                        var15[0] = RemovalCause.EXPLICIT;
                     }

                     return null;
                  } else {
                     if (var9 == var14x) {
                        return (V)var9;
                     }

                     if (this.isAsync && var10x == Async.getIfReady((CompletableFuture<V>)var9)) {
                        return (V)var9;
                     }

                     if (var9 == var5 && var1.getWriteTime() == var6) {
                        return (V)var14x;
                     }

                     var15[0] = RemovalCause.REPLACED;
                     return (V)var9;
                  }
               }, this.expiry(), false, true);
               if (var15[0] != null) {
                  this.notifyRemoval((K)var4, (V)var14x, var15[0]);
               }

               if (var10x == null) {
                  this.statsCounter().recordLoadFailure(var12x);
               } else {
                  this.statsCounter().recordLoadSuccess(var12x);
               }

               var11.remove(var10, var13[0]);
               return var16x;
            }
         });
         return Async.getIfReady(var14);
      } else {
         return null;
      }
   }

   long expireAfterCreate(@Nullable K var1, @Nullable V var2, Expiry<? super K, ? super V> var3, long var4) {
      if (this.expiresVariable() && var1 != null && var2 != null) {
         long var6 = var3.expireAfterCreate(var1, var2, var4);
         return this.isAsync ? var4 + var6 : var4 + Math.min(var6, 4611686018427387903L);
      } else {
         return 0L;
      }
   }

   long expireAfterUpdate(Node<K, V> var1, @Nullable K var2, @Nullable V var3, Expiry<? super K, ? super V> var4, long var5) {
      if (this.expiresVariable() && var2 != null && var3 != null) {
         long var7 = Math.max(1L, var1.getVariableTime() - var5);
         long var9 = var4.expireAfterUpdate(var2, var3, var5, var7);
         return this.isAsync ? var5 + var9 : var5 + Math.min(var9, 4611686018427387903L);
      } else {
         return 0L;
      }
   }

   long expireAfterRead(Node<K, V> var1, @Nullable K var2, @Nullable V var3, Expiry<K, V> var4, long var5) {
      if (this.expiresVariable() && var2 != null && var3 != null) {
         long var7 = Math.max(1L, var1.getVariableTime() - var5);
         long var9 = var4.expireAfterRead(var2, var3, var5, var7);
         return this.isAsync ? var5 + var9 : var5 + Math.min(var9, 4611686018427387903L);
      } else {
         return 0L;
      }
   }

   void tryExpireAfterRead(Node<K, V> var1, @Nullable K var2, @Nullable V var3, Expiry<K, V> var4, long var5) {
      if (this.expiresVariable() && var2 != null && var3 != null) {
         long var7 = var1.getVariableTime();
         long var9 = Math.max(1L, var7 - var5);
         if (!this.isAsync || var9 <= 4611686018427387903L) {
            long var11 = var4.expireAfterRead(var2, var3, var5, var9);
            if (var11 != var9) {
               long var13 = this.isAsync ? var5 + var11 : var5 + Math.min(var11, 4611686018427387903L);
               var1.casVariableTime(var7, var13);
            }
         }
      }
   }

   void setVariableTime(Node<K, V> var1, long var2) {
      if (this.expiresVariable()) {
         var1.setVariableTime(var2);
      }
   }

   void setWriteTime(Node<K, V> var1, long var2) {
      if (this.expiresAfterWrite() || this.refreshAfterWrite()) {
         var1.setWriteTime(var2 & -2L);
      }
   }

   void setAccessTime(Node<K, V> var1, long var2) {
      if (this.expiresAfterAccess()) {
         var1.setAccessTime(var2);
      }
   }

   void afterWrite(Runnable var1) {
      for (int var2 = 0; var2 < 100; var2++) {
         if (this.writeBuffer.offer(var1)) {
            this.scheduleAfterWrite();
            return;
         }

         this.scheduleDrainBuffers();
         Thread.onSpinWait();
      }

      this.lock();

      try {
         this.maintenance(var1);
      } catch (RuntimeException var6) {
         logger.log(Level.ERROR, "Exception thrown when performing the maintenance task", var6);
      } finally {
         this.evictionLock.unlock();
      }

      this.rescheduleCleanUpIfIncomplete();
   }

   void lock() {
      long var1 = WARN_AFTER_LOCK_WAIT_NANOS;
      long var3 = System.nanoTime() + var1;
      boolean var5 = false;

      while (true) {
         try {
            if (!this.evictionLock.tryLock(var1, TimeUnit.NANOSECONDS)) {
               logger.log(
                  Level.WARNING,
                  "The cache is experiencing excessive wait times for acquiring the eviction lock. This may indicate that a long-running computation has halted eviction when trying to remove the victim entry. Consider using AsyncCache to decouple the computation from the map operation.",
                  new TimeoutException()
               );
               this.evictionLock.lock();
               return;
            }
         } catch (InterruptedException var10) {
            var1 = var3 - System.nanoTime();
            var5 = true;
            continue;
         } finally {
            if (var5) {
               Thread.currentThread().interrupt();
            }
         }

         return;
      }
   }

   void scheduleAfterWrite() {
      int var1 = this.drainStatusOpaque();

      while (true) {
         switch (var1) {
            case 0:
               this.casDrainStatus(0, 1);
               this.scheduleDrainBuffers();
               return;
            case 1:
               this.scheduleDrainBuffers();
               return;
            case 2:
               if (this.casDrainStatus(2, 3)) {
                  return;
               }

               var1 = this.drainStatusAcquire();
               break;
            case 3:
               return;
            default:
               throw new IllegalStateException("Invalid drain status: " + var1);
         }
      }
   }

   void scheduleDrainBuffers() {
      if (this.drainStatusOpaque() < 2) {
         if (this.evictionLock.tryLock()) {
            try {
               int var1 = this.drainStatusOpaque();
               if (var1 < 2) {
                  this.setDrainStatusRelease(2);
                  this.executor.execute(this.drainBuffersTask);
                  return;
               }
            } catch (Throwable var5) {
               logger.log(Level.WARNING, "Exception thrown when submitting maintenance task", var5);
               this.maintenance(null);
               return;
            } finally {
               this.evictionLock.unlock();
            }
         }
      }
   }

   @Override
   public void cleanUp() {
      try {
         this.performCleanUp(null);
      } catch (RuntimeException var2) {
         logger.log(Level.ERROR, "Exception thrown when performing the maintenance task", var2);
      }
   }

   void performCleanUp(@Nullable Runnable var1) {
      this.evictionLock.lock();

      try {
         this.maintenance(var1);
      } finally {
         this.evictionLock.unlock();
      }

      this.rescheduleCleanUpIfIncomplete();
   }

   void rescheduleCleanUpIfIncomplete() {
      if (this.drainStatusOpaque() == 1) {
         if (this.executor == ForkJoinPool.commonPool()) {
            this.scheduleDrainBuffers();
         } else {
            Pacer var1 = this.pacer();
            if (var1 != null && !var1.isScheduled() && this.evictionLock.tryLock()) {
               try {
                  if (this.drainStatusOpaque() == 1 && !var1.isScheduled()) {
                     var1.schedule(this.executor, this.drainBuffersTask, this.expirationTicker().read(), Pacer.TOLERANCE);
                  }
               } finally {
                  this.evictionLock.unlock();
               }
            }
         }
      }
   }

   @GuardedBy("evictionLock")
   void maintenance(@Nullable Runnable var1) {
      this.setDrainStatusRelease(2);

      try {
         this.drainReadBuffer();
         this.drainWriteBuffer();
         if (var1 != null) {
            var1.run();
         }

         this.drainKeyReferences();
         this.drainValueReferences();
         this.expireEntries();
         this.evictEntries();
         this.climb();
      } finally {
         if (this.drainStatusOpaque() != 2 || !this.casDrainStatus(2, 0)) {
            this.setDrainStatusOpaque(1);
         }
      }
   }

   @GuardedBy("evictionLock")
   void drainKeyReferences() {
      if (this.collectKeys()) {
         Reference var1;
         while ((var1 = this.keyReferenceQueue().poll()) != null) {
            Node var2 = this.data.get(var1);
            if (var2 != null) {
               this.evictEntry(var2, RemovalCause.COLLECTED, 0L);
            }
         }
      }
   }

   @GuardedBy("evictionLock")
   void drainValueReferences() {
      if (this.collectValues()) {
         Reference var1;
         while ((var1 = this.valueReferenceQueue().poll()) != null) {
            References.InternalReference var2 = (References.InternalReference)var1;
            Node var3 = this.data.get(var2.getKeyReference());
            if (var3 != null && var1 == var3.getValueReference()) {
               this.evictEntry(var3, RemovalCause.COLLECTED, 0L);
            }
         }
      }
   }

   @GuardedBy("evictionLock")
   void drainReadBuffer() {
      if (!this.skipReadBuffer()) {
         this.readBuffer.drainTo(this.accessPolicy);
      }
   }

   @GuardedBy("evictionLock")
   void onAccess(Node<K, V> var1) {
      if (this.evicts()) {
         Object var2 = var1.getKey();
         if (var2 == null) {
            return;
         }

         this.frequencySketch().increment((K)var2);
         if (var1.inWindow()) {
            reorder(this.accessOrderWindowDeque(), var1);
         } else if (var1.inMainProbation()) {
            this.reorderProbation(var1);
         } else {
            reorder(this.accessOrderProtectedDeque(), var1);
         }

         this.setHitsInSample(this.hitsInSample() + 1);
      } else if (this.expiresAfterAccess()) {
         reorder(this.accessOrderWindowDeque(), var1);
      }

      if (this.expiresVariable()) {
         this.timerWheel().reschedule(var1);
      }
   }

   @GuardedBy("evictionLock")
   void reorderProbation(Node<K, V> var1) {
      if (this.accessOrderProbationDeque().contains(var1)) {
         if (var1.getPolicyWeight() > this.mainProtectedMaximum()) {
            reorder(this.accessOrderProbationDeque(), var1);
         } else {
            this.setMainProtectedWeightedSize(this.mainProtectedWeightedSize() + var1.getPolicyWeight());
            this.accessOrderProbationDeque().remove(var1);
            this.accessOrderProtectedDeque().offerLast(var1);
            var1.makeMainProtected();
         }
      }
   }

   static <K, V> void reorder(LinkedDeque<Node<K, V>> var0, Node<K, V> var1) {
      if (var0.contains(var1)) {
         var0.moveToBack(var1);
      }
   }

   @GuardedBy("evictionLock")
   void drainWriteBuffer() {
      for (int var1 = 0; var1 <= WRITE_BUFFER_MAX; var1++) {
         Runnable var2 = this.writeBuffer.poll();
         if (var2 == null) {
            return;
         }

         var2.run();
      }

      this.setDrainStatusOpaque(3);
   }

   @GuardedBy("evictionLock")
   void makeDead(Node<K, V> var1) {
      synchronized (var1) {
         if (!var1.isDead()) {
            if (this.evicts()) {
               if (var1.inWindow()) {
                  this.setWindowWeightedSize(this.windowWeightedSize() - var1.getWeight());
               } else if (var1.inMainProtected()) {
                  this.setMainProtectedWeightedSize(this.mainProtectedWeightedSize() - var1.getWeight());
               }

               this.setWeightedSize(this.weightedSize() - var1.getWeight());
            }

            var1.die();
         }
      }
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
   public long estimatedSize() {
      return this.data.mappingCount();
   }

   @Override
   public void clear() {
      this.evictionLock.lock();

      ArrayDeque var1;
      try {
         this.readBuffer.drainTo(var0 -> {});

         Runnable var2;
         while ((var2 = this.writeBuffer.poll()) != null) {
            var2.run();
         }

         Pacer var3 = this.pacer();
         if (var3 != null) {
            var3.cancel();
         }

         long var4 = this.expirationTicker().read();
         int var6 = WRITE_BUFFER_MAX / 2;
         var1 = new ArrayDeque<>(this.data.values());

         while (!var1.isEmpty() && this.writeBuffer.size() < var6) {
            this.removeNode((Node<K, V>)var1.poll(), var4);
         }
      } finally {
         this.evictionLock.unlock();
      }

      boolean var10 = false;

      for (Node var12 : var1) {
         Object var5 = var12.getKey();
         if (var5 == null) {
            var10 = true;
         } else {
            this.remove(var5);
         }
      }

      if (this.collectKeys() && var10) {
         this.cleanUp();
      }
   }

   @GuardedBy("evictionLock")
   void removeNode(Node<K, V> var1, long var2) {
      Object var4 = var1.getKey();
      Object[] var5 = new Object[1];
      RemovalCause[] var6 = new RemovalCause[1];
      Object var7 = var1.getKeyReference();
      this.data.computeIfPresent(var7, (var7x, var8) -> {
         if (var8 != var1) {
            return var8;
         }

         synchronized (var8) {
            var5[0] = var8.getValue();
            if (var4 == null || var5[0] == null) {
               var6[0] = RemovalCause.COLLECTED;
            } else if (this.hasExpired((Node<K, V>)var8, var2)) {
               var6[0] = RemovalCause.EXPIRED;
            } else {
               var6[0] = RemovalCause.EXPLICIT;
            }

            if (var6[0].wasEvicted()) {
               this.notifyEviction((K)var4, (V)var5[0], var6[0]);
            }

            this.discardRefresh(var1.getKeyReference());
            var1.retire();
            return null;
         }
      });
      if (!var1.inWindow() || !this.evicts() && !this.expiresAfterAccess()) {
         if (this.evicts()) {
            if (var1.inMainProbation()) {
               this.accessOrderProbationDeque().remove(var1);
            } else {
               this.accessOrderProtectedDeque().remove(var1);
            }
         }
      } else {
         this.accessOrderWindowDeque().remove(var1);
      }

      if (this.expiresAfterWrite()) {
         this.writeOrderDeque().remove(var1);
      } else if (this.expiresVariable()) {
         this.timerWheel().deschedule(var1);
      }

      synchronized (var1) {
         this.logIfAlive(var1);
         this.makeDead(var1);
      }

      if (var6[0] != null) {
         this.notifyRemoval((K)var4, (V)var5[0], var6[0]);
      }
   }

   @Override
   public boolean containsKey(Object var1) {
      Node var2 = this.data.get(this.nodeFactory.newLookupKey(var1));
      return var2 != null && var2.getValue() != null && !this.hasExpired(var2, this.expirationTicker().read());
   }

   @Override
   public boolean containsValue(Object var1) {
      Objects.requireNonNull(var1);
      long var2 = this.expirationTicker().read();

      for (Node var5 : this.data.values()) {
         if (var5.containsValue(var1) && !this.hasExpired(var5, var2) && var5.getKey() != null) {
            return true;
         }
      }

      return false;
   }

   @Override
   public @Nullable V get(Object var1) {
      return this.getIfPresent(var1, false);
   }

   @Override
   public @Nullable V getIfPresent(Object var1, boolean var2) {
      Node var3 = this.data.get(this.nodeFactory.newLookupKey(var1));
      if (var3 == null) {
         if (var2) {
            this.statsCounter().recordMisses(1);
         }

         if (this.drainStatusOpaque() == 1) {
            this.scheduleDrainBuffers();
         }

         return null;
      } else {
         Object var4 = var3.getValue();
         long var5 = this.expirationTicker().read();
         if (this.hasExpired(var3, var5) || this.collectValues() && var4 == null) {
            if (var2) {
               this.statsCounter().recordMisses(1);
            }

            this.scheduleDrainBuffers();
            return null;
         } else {
            if (!this.isComputingAsync(var3)) {
               Object var7 = var1;
               this.setAccessTime(var3, var5);
               this.tryExpireAfterRead(var3, (K)var7, (V)var4, this.expiry(), var5);
            }

            Object var8 = this.afterRead(var3, var5, var2);
            return (V)(var8 == null ? var4 : var8);
         }
      }
   }

   @Override
   public @Nullable V getIfPresentQuietly(K var1) {
      Node var3 = this.data.get(this.nodeFactory.newLookupKey(var1));
      Object var2;
      return (V)(var3 != null && (var2 = var3.getValue()) != null && !this.hasExpired(var3, this.expirationTicker().read()) ? var2 : null);
   }

   public @Nullable K getKey(K var1) {
      Node var2 = this.data.get(this.nodeFactory.newLookupKey(var1));
      if (var2 == null) {
         if (this.drainStatusOpaque() == 1) {
            this.scheduleDrainBuffers();
         }

         return null;
      } else {
         this.afterRead(var2, 0L, false);
         return (K)var2.getKey();
      }
   }

   @Override
   public Map<K, V> getAllPresent(Iterable<? extends K> var1) {
      LinkedHashMap var2 = new LinkedHashMap(Caffeine.calculateHashMapCapacity(var1));

      for (Object var4 : var1) {
         var2.put(var4, null);
      }

      int var11 = var2.size();
      long var12 = this.expirationTicker().read();
      Iterator var6 = var2.entrySet().iterator();

      while (var6.hasNext()) {
         Entry var8 = (Entry)var6.next();
         Node var9 = this.data.get(this.nodeFactory.newLookupKey(var8.getKey()));
         Object var7;
         if (var9 != null && (var7 = var9.getValue()) != null && !this.hasExpired(var9, var12)) {
            if (!this.isComputingAsync(var9)) {
               this.tryExpireAfterRead(var9, (K)var8.getKey(), (V)var7, this.expiry(), var12);
               this.setAccessTime(var9, var12);
            }

            Object var10 = this.afterRead(var9, var12, false);
            var8.setValue(var10 == null ? var7 : var10);
         } else {
            var6.remove();
         }
      }

      this.statsCounter().recordHits(var2.size());
      this.statsCounter().recordMisses(var11 - var2.size());
      return Collections.unmodifiableMap(var2);
   }

   @Override
   public void putAll(Map<? extends K, ? extends V> var1) {
      var1.forEach(this::put);
   }

   @Override
   public @Nullable V put(K var1, V var2) {
      return this.put((K)var1, (V)var2, this.expiry(), false);
   }

   @Override
   public @Nullable V putIfAbsent(K var1, V var2) {
      return this.put((K)var1, (V)var2, this.expiry(), true);
   }

   @Nullable V put(K var1, V var2, Expiry<K, V> var3, boolean var4) {
      Objects.requireNonNull(var1);
      Node var5 = null;
      long var6 = this.expirationTicker().read();
      int var8 = this.weigher.weigh((K)var1, (V)var2);
      Object var9 = this.nodeFactory.newLookupKey(var1);
      int var10 = 1;

      Node var11;
      int var15;
      boolean var16;
      boolean var17;
      boolean var18;
      Object var23;
      while (true) {
         var11 = this.data.get(var9);
         if (var11 == null) {
            if (var5 == null) {
               var5 = this.nodeFactory.newNode((K)var1, this.keyReferenceQueue(), (V)var2, this.valueReferenceQueue(), var8, var6);
               this.setVariableTime(var5, this.expireAfterCreate((K)var1, (V)var2, var3, var6));
            }

            var11 = this.data.putIfAbsent(var5.getKeyReference(), var5);
            if (var11 == null) {
               this.afterWrite(new BoundedLocalCache.AddTask(var5, var8));
               return null;
            }

            if (var4) {
               var23 = var11.getValue();
               if (var23 != null && !this.hasExpired(var11, var6)) {
                  if (!this.isComputingAsync(var11)) {
                     this.tryExpireAfterRead(var11, (K)var1, (V)var23, this.expiry(), var6);
                     this.setAccessTime(var11, var6);
                  }

                  this.afterRead(var11, var6, false);
                  return (V)var23;
               }
            }
         } else if (var4) {
            var23 = var11.getValue();
            if (var23 != null && !this.hasExpired(var11, var6)) {
               if (!this.isComputingAsync(var11)) {
                  this.tryExpireAfterRead(var11, (K)var1, (V)var23, this.expiry(), var6);
                  this.setAccessTime(var11, var6);
               }

               this.afterRead(var11, var6, false);
               return (V)var23;
            }
         }

         if (!var11.isAlive()) {
            if ((var10 & 1023) != 0) {
               Thread.onSpinWait();
            } else {
               this.data.computeIfPresent(var9, (var2x, var3x) -> {
                  this.requireIsAlive(var1, (Node<?, ?>)var3x);
                  return var3x;
               });
            }
         } else {
            var16 = false;
            var17 = true;
            var18 = false;
            synchronized (var11) {
               if (var11.isAlive()) {
                  var23 = var11.getValue();
                  var15 = var11.getWeight();
                  long var13;
                  if (var23 == null) {
                     var13 = this.expireAfterCreate((K)var1, (V)var2, var3, var6);
                     this.notifyEviction((K)var1, null, RemovalCause.COLLECTED);
                  } else if (this.hasExpired(var11, var6)) {
                     var16 = true;
                     var13 = this.expireAfterCreate((K)var1, (V)var2, var3, var6);
                     this.notifyEviction((K)var1, (V)var23, RemovalCause.EXPIRED);
                  } else if (var4) {
                     var17 = false;
                     var13 = this.expireAfterRead(var11, (K)var1, (V)var2, var3, var6);
                  } else {
                     var13 = this.expireAfterUpdate(var11, (K)var1, (V)var2, var3, var6);
                  }

                  if (var17) {
                     var18 = this.expiresAfterWrite() && var6 - var11.getWriteTime() > EXPIRE_WRITE_TOLERANCE
                        || this.expiresVariable() && Math.abs(var13 - var11.getVariableTime()) > EXPIRE_WRITE_TOLERANCE;
                     var11.setValue(var2, this.valueReferenceQueue());
                     var11.setWeight(var8);
                     this.setWriteTime(var11, var6);
                     this.discardRefresh(var11.getKeyReference());
                  }

                  this.setVariableTime(var11, var13);
                  this.setAccessTime(var11, var6);
                  break;
               }
            }
         }

         var10++;
      }

      if (var16) {
         this.notifyRemoval((K)var1, (V)var23, RemovalCause.EXPIRED);
      } else if (var23 == null) {
         this.notifyRemoval((K)var1, null, RemovalCause.COLLECTED);
      } else if (var17) {
         this.notifyOnReplace((K)var1, (V)var23, (V)var2);
      }

      int var19 = var17 ? var8 - var15 : 0;
      if (var23 == null || var19 != 0 || var16) {
         this.afterWrite(new BoundedLocalCache.UpdateTask(var11, var19));
      } else if (!var4 && var18) {
         this.afterWrite(new BoundedLocalCache.UpdateTask(var11, var19));
      } else {
         if (var17) {
            this.setWriteTime(var11, var6);
         }

         this.afterRead(var11, var6, false);
      }

      return (V)(var16 ? null : var23);
   }

   @Override
   public @Nullable V remove(Object var1) {
      Object var2 = var1;
      Node[] var3 = new Node[1];
      Object[] var4 = new Object[1];
      RemovalCause[] var5 = new RemovalCause[1];
      Object var6 = this.nodeFactory.newLookupKey(var1);
      this.data.computeIfPresent(var6, (var7, var8) -> {
         synchronized (var8) {
            this.requireIsAlive(var1, (Node<?, ?>)var8);
            var4[0] = var8.getValue();
            if (var4[0] == null) {
               var5[0] = RemovalCause.COLLECTED;
            } else if (this.hasExpired((Node<K, V>)var8, this.expirationTicker().read())) {
               var5[0] = RemovalCause.EXPIRED;
            } else {
               var5[0] = RemovalCause.EXPLICIT;
            }

            if (var5[0].wasEvicted()) {
               this.notifyEviction((K)var2, (V)var4[0], var5[0]);
            }

            this.discardRefresh(var6);
            var3[0] = var8;
            var8.retire();
            return null;
         }
      });
      if (var5[0] != null) {
         this.afterWrite(new BoundedLocalCache.RemovalTask(var3[0]));
         this.notifyRemoval((K)var2, (V)var4[0], var5[0]);
      }

      return (V)(var5[0] == RemovalCause.EXPLICIT ? var4[0] : null);
   }

   @Override
   public boolean remove(Object var1, Object var2) {
      Objects.requireNonNull(var1);
      if (var2 == null) {
         return false;
      }

      Node[] var3 = new Node[1];
      Object[] var4 = new Object[1];
      Object[] var5 = new Object[1];
      RemovalCause[] var6 = new RemovalCause[1];
      Object var7 = this.nodeFactory.newLookupKey(var1);
      this.data.computeIfPresent(var7, (var8, var9) -> {
         synchronized (var9) {
            this.requireIsAlive(var1, (Node<?, ?>)var9);
            var4[0] = var9.getKey();
            var5[0] = var9.getValue();
            if (var4[0] == null || var5[0] == null) {
               var6[0] = RemovalCause.COLLECTED;
            } else if (this.hasExpired((Node<K, V>)var9, this.expirationTicker().read())) {
               var6[0] = RemovalCause.EXPIRED;
            } else {
               if (!var9.containsValue(var2)) {
                  return var9;
               }

               var6[0] = RemovalCause.EXPLICIT;
            }

            if (var6[0].wasEvicted()) {
               this.notifyEviction((K)var4[0], (V)var5[0], var6[0]);
            }

            this.discardRefresh(var7);
            var3[0] = var9;
            var9.retire();
            return null;
         }
      });
      if (var3[0] == null) {
         return false;
      }

      this.afterWrite(new BoundedLocalCache.RemovalTask(var3[0]));
      this.notifyRemoval((K)var4[0], (V)var5[0], var6[0]);
      return var6[0] == RemovalCause.EXPLICIT;
   }

   @Override
   public @Nullable V replace(K var1, V var2) {
      Objects.requireNonNull(var1);
      int[] var3 = new int[1];
      Object[] var4 = new Object[1];
      Object[] var5 = new Object[1];
      long[] var6 = new long[1];
      int var7 = this.weigher.weigh((K)var1, (V)var2);
      Node var8 = this.data.computeIfPresent(this.nodeFactory.newLookupKey(var1), (var8x, var9x) -> {
         synchronized (var9x) {
            this.requireIsAlive(var1, (Node<?, ?>)var9x);
            var4[0] = var9x.getKey();
            var5[0] = var9x.getValue();
            var3[0] = var9x.getWeight();
            if (var4[0] != null && var5[0] != null && !this.hasExpired((Node<K, V>)var9x, var6[0] = this.expirationTicker().read())) {
               long var11 = this.expireAfterUpdate((Node<K, V>)var9x, (K)var1, (V)var2, this.expiry(), var6[0]);
               var9x.setValue((V)var2, this.valueReferenceQueue());
               var9x.setWeight(var7);
               this.setVariableTime((Node<K, V>)var9x, var11);
               this.setAccessTime((Node<K, V>)var9x, var6[0]);
               this.setWriteTime((Node<K, V>)var9x, var6[0]);
               this.discardRefresh(var8x);
               return var9x;
            } else {
               var5[0] = null;
               return var9x;
            }
         }
      });
      if (var5[0] == null) {
         return null;
      }

      int var9 = var7 - var3[0];
      if (!this.expiresAfterWrite() && var9 == 0) {
         this.afterRead(var8, var6[0], false);
      } else {
         this.afterWrite(new BoundedLocalCache.UpdateTask(var8, var9));
      }

      this.notifyOnReplace((K)var4[0], (V)var5[0], (V)var2);
      return (V)var5[0];
   }

   @Override
   public boolean replace(K var1, V var2, V var3) {
      return this.replace((K)var1, (V)var2, (V)var3, true);
   }

   @Override
   public boolean replace(K var1, V var2, V var3, boolean var4) {
      Objects.requireNonNull(var1);
      Objects.requireNonNull(var2);
      Objects.requireNonNull(var3);
      int var5 = this.weigher.weigh((K)var1, (V)var3);
      boolean[] var6 = new boolean[1];
      Object[] var7 = new Object[1];
      Object[] var8 = new Object[1];
      int[] var9 = new int[1];
      long[] var10 = new long[1];
      Node var11 = this.data
         .computeIfPresent(
            this.nodeFactory.newLookupKey(var1),
            (var11x, var12x) -> {
               synchronized (var12x) {
                  this.requireIsAlive(var1, (Node<?, ?>)var12x);
                  var7[0] = var12x.getKey();
                  var8[0] = var12x.getValue();
                  var9[0] = var12x.getWeight();
                  if (var7[0] != null
                     && var8[0] != null
                     && var12x.containsValue(var2)
                     && !this.hasExpired((Node<K, V>)var12x, var10[0] = this.expirationTicker().read())) {
                     long var14 = this.expireAfterUpdate((Node<K, V>)var12x, (K)var1, (V)var3, this.expiry(), var10[0]);
                     var12x.setValue((V)var3, this.valueReferenceQueue());
                     var12x.setWeight(var5);
                     this.setVariableTime((Node<K, V>)var12x, var14);
                     this.setAccessTime((Node<K, V>)var12x, var10[0]);
                     this.setWriteTime((Node<K, V>)var12x, var10[0]);
                     var6[0] = true;
                     if (var4) {
                        this.discardRefresh(var11x);
                     }

                     return var12x;
                  } else {
                     return var12x;
                  }
               }
            }
         );
      if (!var6[0]) {
         return false;
      }

      int var12 = var5 - var9[0];
      if (!this.expiresAfterWrite() && var12 == 0) {
         this.afterRead(var11, var10[0], false);
      } else {
         this.afterWrite(new BoundedLocalCache.UpdateTask(var11, var12));
      }

      this.notifyOnReplace((K)var7[0], (V)var8[0], (V)var3);
      return true;
   }

   @Override
   public void replaceAll(BiFunction<? super K, ? super V, ? extends V> var1) {
      BiFunction var2 = (var1x, var2x) -> Objects.requireNonNull(var1.apply(var1x, var2x));

      for (Object var4 : this.keySet()) {
         long[] var5 = new long[]{this.expirationTicker().read()};
         Object var6 = this.nodeFactory.newLookupKey(var4);
         this.remap((K)var4, var6, var2, this.expiry(), var5, false);
      }
   }

   @Override
   public @Nullable V computeIfAbsent(K var1, Function<? super K, ? extends V> var2, boolean var3, boolean var4) {
      Objects.requireNonNull(var1);
      Objects.requireNonNull(var2);
      long var5 = this.expirationTicker().read();
      Node var7 = this.data.get(this.nodeFactory.newLookupKey(var1));
      if (var7 != null) {
         Object var8 = var7.getValue();
         if (var8 != null && !this.hasExpired(var7, var5)) {
            if (!this.isComputingAsync(var7)) {
               this.tryExpireAfterRead(var7, (K)var1, (V)var8, this.expiry(), var5);
               this.setAccessTime(var7, var5);
            }

            Object var9 = this.afterRead(var7, var5, var3);
            return (V)(var9 == null ? var8 : var9);
         }
      }

      if (var3) {
         var2 = this.statsAware(var2, var4);
      }

      Object var10 = this.nodeFactory.newReferenceKey((K)var1, this.keyReferenceQueue());
      return this.doComputeIfAbsent((K)var1, var10, var2, new long[]{var5}, var3);
   }

   @Nullable V doComputeIfAbsent(K var1, Object var2, Function<? super K, ? extends V> var3, long[] var4, boolean var5) {
      Object[] var6 = new Object[1];
      Object[] var7 = new Object[1];
      Object[] var8 = new Object[1];
      Node[] var9 = new Node[1];
      int[] var10 = new int[2];
      RemovalCause[] var11 = new RemovalCause[1];
      Node var12 = this.data.compute(var2, (var10x, var11x) -> {
         if (var11x == null) {
            var7[0] = var3.apply(var1);
            if (var7[0] == null) {
               return null;
            }

            var4[0] = this.expirationTicker().read();
            var10[1] = this.weigher.weigh((K)var1, (V)var7[0]);
            var11x = this.nodeFactory.newNode((K)var1, this.keyReferenceQueue(), (V)var7[0], this.valueReferenceQueue(), var10[1], var4[0]);
            this.setVariableTime(var11x, this.expireAfterCreate((K)var1, (V)var7[0], this.expiry(), var4[0]));
            return var11x;
         } else {
            synchronized (var11x) {
               this.requireIsAlive(var1, (Node<?, ?>)var11x);
               var8[0] = var11x.getKey();
               var10[0] = var11x.getWeight();
               var6[0] = var11x.getValue();
               if (var8[0] != null && var6[0] != null) {
                  if (!this.hasExpired((Node<K, V>)var11x, var4[0])) {
                     return var11x;
                  }

                  var11[0] = RemovalCause.EXPIRED;
               } else {
                  var11[0] = RemovalCause.COLLECTED;
               }

               if (var11[0].wasEvicted()) {
                  this.notifyEviction((K)var8[0], (V)var6[0], var11[0]);
               }

               var7[0] = var3.apply(var1);
               if (var7[0] == null) {
                  var9[0] = var11x;
                  var11x.retire();
                  return null;
               } else {
                  var4[0] = this.expirationTicker().read();
                  var10[1] = this.weigher.weigh((K)var1, (V)var7[0]);
                  long var13x = this.expireAfterCreate((K)var1, (V)var7[0], this.expiry(), var4[0]);
                  var11x.setValue((V)var7[0], this.valueReferenceQueue());
                  var11x.setWeight(var10[1]);
                  this.setVariableTime((Node<K, V>)var11x, var13x);
                  this.setAccessTime((Node<K, V>)var11x, var4[0]);
                  this.setWriteTime((Node<K, V>)var11x, var4[0]);
                  this.discardRefresh(var10x);
                  return var11x;
               }
            }
         }
      });
      if (var11[0] != null) {
         if (var11[0].wasEvicted()) {
            this.statsCounter().recordEviction(var10[0], var11[0]);
         }

         this.notifyRemoval((K)var8[0], (V)var6[0], var11[0]);
      }

      if (var12 == null) {
         if (var9[0] != null) {
            this.afterWrite(new BoundedLocalCache.RemovalTask(var9[0]));
         }

         return null;
      } else if (var7[0] == null) {
         if (!this.isComputingAsync(var12)) {
            this.tryExpireAfterRead(var12, (K)var1, (V)var6[0], this.expiry(), var4[0]);
            this.setAccessTime(var12, var4[0]);
         }

         this.afterRead(var12, var4[0], var5);
         return (V)var6[0];
      } else {
         if (var6[0] == null && var11[0] == null) {
            this.afterWrite(new BoundedLocalCache.AddTask(var12, var10[1]));
         } else {
            int var13 = var10[1] - var10[0];
            this.afterWrite(new BoundedLocalCache.UpdateTask(var12, var13));
         }

         return (V)var7[0];
      }
   }

   @Override
   public V computeIfPresent(K var1, BiFunction<? super K, ? super V, ? extends V> var2) {
      Objects.requireNonNull(var1);
      Objects.requireNonNull(var2);
      Object var3 = this.nodeFactory.newLookupKey(var1);
      Node var4 = this.data.get(var3);
      if (var4 == null) {
         return null;
      } else {
         long var5;
         if (var4.getValue() != null && !this.hasExpired(var4, var5 = this.expirationTicker().read())) {
            BiFunction var7 = this.statsAware(var2, true, true);
            return this.remap((K)var1, var3, var7, this.expiry(), new long[]{var5}, false);
         } else {
            this.scheduleDrainBuffers();
            return null;
         }
      }
   }

   @Override
   public @Nullable V compute(
      K var1, BiFunction<? super K, ? super V, ? extends V> var2, @Nullable Expiry<? super K, ? super V> var3, boolean var4, boolean var5
   ) {
      Objects.requireNonNull(var1);
      long[] var6 = new long[]{this.expirationTicker().read()};
      Object var7 = this.nodeFactory.newReferenceKey((K)var1, this.keyReferenceQueue());
      BiFunction var8 = this.statsAware(var2, var4, var5);
      return this.remap((K)var1, var7, var8, var3, var6, true);
   }

   @Override
   public @Nullable V merge(K var1, V var2, BiFunction<? super V, ? super V, ? extends V> var3) {
      Objects.requireNonNull(var1);
      Objects.requireNonNull(var2);
      long[] var4 = new long[]{this.expirationTicker().read()};
      Object var5 = this.nodeFactory.newReferenceKey((K)var1, this.keyReferenceQueue());
      BiFunction var6 = (var3x, var4x) -> var4x == null ? var2 : this.statsAware(var3).apply(var4x, var2);
      return this.remap((K)var1, var5, var6, this.expiry(), var4, true);
   }

   @Nullable V remap(K var1, Object var2, BiFunction<? super K, ? super V, ? extends V> var3, Expiry<? super K, ? super V> var4, long[] var5, boolean var6) {
      Object[] var7 = new Object[1];
      Object[] var8 = new Object[1];
      Object[] var9 = new Object[1];
      Node[] var10 = new Node[1];
      int[] var11 = new int[2];
      RemovalCause[] var12 = new RemovalCause[1];
      Node var13 = this.data.compute(var2, (var13x, var14x) -> {
         if (var14x == null) {
            if (!var6) {
               return null;
            }

            var9[0] = var3.apply(var1, null);
            if (var9[0] == null) {
               return null;
            }

            var5[0] = this.expirationTicker().read();
            var11[1] = this.weigher.weigh((K)var1, (V)var9[0]);
            long var15 = this.expireAfterCreate((K)var1, (V)var9[0], var4, var5[0]);
            var14x = this.nodeFactory.newNode(var2, (V)var9[0], this.valueReferenceQueue(), var11[1], var5[0]);
            this.setVariableTime(var14x, var15);
            this.setAccessTime(var14x, var5[0]);
            this.setWriteTime(var14x, var5[0]);
            this.discardRefresh(var1);
            return var14x;
         } else {
            synchronized (var14x) {
               this.requireIsAlive(var1, (Node<?, ?>)var14x);
               var7[0] = var14x.getKey();
               var8[0] = var14x.getValue();
               if (var7[0] == null || var8[0] == null) {
                  var12[0] = RemovalCause.COLLECTED;
               } else if (this.hasExpired((Node<K, V>)var14x, this.expirationTicker().read())) {
                  var12[0] = RemovalCause.EXPIRED;
               }

               if (var12[0] != null) {
                  this.notifyEviction((K)var7[0], (V)var8[0], var12[0]);
                  if (!var6) {
                     var10[0] = var14x;
                     var14x.retire();
                     return null;
                  }
               }

               var9[0] = var3.apply(var7[0], var12[0] == null ? var8[0] : null);
               if (var9[0] == null) {
                  if (var12[0] == null) {
                     var12[0] = RemovalCause.EXPLICIT;
                     this.discardRefresh(var13x);
                  }

                  var10[0] = var14x;
                  var14x.retire();
                  return null;
               } else {
                  var11[0] = var14x.getWeight();
                  var11[1] = this.weigher.weigh((K)var1, (V)var9[0]);
                  var5[0] = this.expirationTicker().read();
                  long var16;
                  if (var12[0] == null) {
                     if (var9[0] != var8[0]) {
                        var12[0] = RemovalCause.REPLACED;
                     }

                     var16 = this.expireAfterUpdate((Node<K, V>)var14x, (K)var1, (V)var9[0], var4, var5[0]);
                  } else {
                     var16 = this.expireAfterCreate((K)var1, (V)var9[0], var4, var5[0]);
                  }

                  var14x.setValue((V)var9[0], this.valueReferenceQueue());
                  var14x.setWeight(var11[1]);
                  this.setVariableTime((Node<K, V>)var14x, var16);
                  this.setAccessTime((Node<K, V>)var14x, var5[0]);
                  this.setWriteTime((Node<K, V>)var14x, var5[0]);
                  this.discardRefresh(var13x);
                  return var14x;
               }
            }
         }
      });
      if (var12[0] != null) {
         if (var12[0] == RemovalCause.REPLACED) {
            this.notifyOnReplace((K)var1, (V)var8[0], (V)var9[0]);
         } else {
            if (var12[0].wasEvicted()) {
               this.statsCounter().recordEviction(var11[0], var12[0]);
            }

            this.notifyRemoval((K)var7[0], (V)var8[0], var12[0]);
         }
      }

      if (var10[0] != null) {
         this.afterWrite(new BoundedLocalCache.RemovalTask(var10[0]));
      } else if (var13 != null) {
         if (var8[0] == null && var12[0] == null) {
            this.afterWrite(new BoundedLocalCache.AddTask(var13, var11[1]));
         } else {
            int var14 = var11[1] - var11[0];
            if (!this.expiresAfterWrite() && var14 == 0) {
               this.afterRead(var13, var5[0], false);
               if (var12[0] != null && var12[0].wasEvicted()) {
                  this.scheduleDrainBuffers();
               }
            } else {
               this.afterWrite(new BoundedLocalCache.UpdateTask(var13, var14));
            }
         }
      }

      return (V)var9[0];
   }

   @Override
   public void forEach(BiConsumer<? super K, ? super V> var1) {
      BoundedLocalCache.EntryIterator var2 = new BoundedLocalCache.EntryIterator<>(this);

      while (var2.hasNext()) {
         var1.accept(var2.key, var2.value);
         var2.advance();
      }
   }

   @Override
   public Set<K> keySet() {
      Set var1 = this.keySet;
      return var1 == null ? (this.keySet = new BoundedLocalCache.KeySetView<>(this)) : var1;
   }

   @Override
   public Collection<V> values() {
      Collection var1 = this.values;
      return var1 == null ? (this.values = new BoundedLocalCache.ValuesView<>(this)) : var1;
   }

   @Override
   public Set<Entry<K, V>> entrySet() {
      Set var1 = this.entrySet;
      return var1 == null ? (this.entrySet = new BoundedLocalCache.EntrySetView<>(this)) : var1;
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
      if (this.size() != var2.size()) {
         return false;
      }

      long var3 = this.expirationTicker().read();

      for (Node var6 : this.data.values()) {
         Object var7 = var6.getKey();
         Object var8 = var6.getValue();
         if (var7 != null && var8 != null && var6.isAlive() && !this.hasExpired(var6, var3)) {
            Object var9 = var2.get(var7);
            if (var9 != null && (var9 == var8 || var9.equals(var8))) {
               continue;
            }

            return false;
         }

         this.scheduleDrainBuffers();
         return false;
      }

      return true;
   }

   @Override
   public int hashCode() {
      int var1 = 0;
      long var2 = this.expirationTicker().read();

      for (Node var5 : this.data.values()) {
         Object var6 = var5.getKey();
         Object var7 = var5.getValue();
         if (var6 != null && var7 != null && var5.isAlive() && !this.hasExpired(var5, var2)) {
            var1 += var6.hashCode() ^ var7.hashCode();
         } else {
            this.scheduleDrainBuffers();
         }
      }

      return var1;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder().append('{');
      long var2 = this.expirationTicker().read();

      for (Node var5 : this.data.values()) {
         Object var6 = var5.getKey();
         Object var7 = var5.getValue();
         if (var6 != null && var7 != null && var5.isAlive() && !this.hasExpired(var5, var2)) {
            if (var1.length() != 1) {
               var1.append(',').append(' ');
            }

            var1.append(var6 == this ? "(this Map)" : var6);
            var1.append('=');
            var1.append(var7 == this ? "(this Map)" : var7);
         } else {
            this.scheduleDrainBuffers();
         }
      }

      return var1.append('}').toString();
   }

   <T> T evictionOrder(boolean var1, Function<V, V> var2, Function<Stream<Policy.CacheEntry<K, V>>, T> var3) {
      Comparator var4 = Comparator.comparingInt(var1x -> {
         Object var2x = var1x.getKey();
         return var2x == null ? 0 : this.frequencySketch().frequency((K)var2x);
      });
      Iterable var5;
      if (var1) {
         var5 = () -> {
            LinkedDeque.PeekingIterator var2x = LinkedDeque.PeekingIterator.comparing(
               this.accessOrderProbationDeque().descendingIterator(), this.accessOrderWindowDeque().descendingIterator(), var4
            );
            return LinkedDeque.PeekingIterator.concat(this.accessOrderProtectedDeque().descendingIterator(), var2x);
         };
      } else {
         var5 = () -> {
            LinkedDeque.PeekingIterator var2x = LinkedDeque.PeekingIterator.comparing(
               this.accessOrderWindowDeque().iterator(), this.accessOrderProbationDeque().iterator(), var4.reversed()
            );
            return LinkedDeque.PeekingIterator.concat(var2x, this.accessOrderProtectedDeque().iterator());
         };
      }

      return this.snapshot(var5, var2, var3);
   }

   <T> T expireAfterAccessOrder(boolean var1, Function<V, V> var2, Function<Stream<Policy.CacheEntry<K, V>>, T> var3) {
      Iterable var4;
      if (this.evicts()) {
         var4 = () -> {
            Comparator var2x = Comparator.comparingLong(Node::getAccessTime);
            LinkedDeque.PeekingIterator var3x;
            LinkedDeque.PeekingIterator var4x;
            LinkedDeque.PeekingIterator var5;
            if (var1) {
               var3x = this.accessOrderWindowDeque().iterator();
               var4x = this.accessOrderProbationDeque().iterator();
               var5 = this.accessOrderProtectedDeque().iterator();
            } else {
               var2x = var2x.reversed();
               var3x = this.accessOrderWindowDeque().descendingIterator();
               var4x = this.accessOrderProbationDeque().descendingIterator();
               var5 = this.accessOrderProtectedDeque().descendingIterator();
            }

            return LinkedDeque.PeekingIterator.comparing(LinkedDeque.PeekingIterator.comparing(var3x, var4x, var2x), var5, var2x);
         };
      } else {
         var4 = var1 ? this.accessOrderWindowDeque() : this.accessOrderWindowDeque()::descendingIterator;
      }

      return this.snapshot(var4, var2, var3);
   }

   <T> T snapshot(Iterable<Node<K, V>> var1, Function<V, V> var2, Function<Stream<Policy.CacheEntry<K, V>>, T> var3) {
      Objects.requireNonNull(var3);
      Objects.requireNonNull(var2);
      Objects.requireNonNull(var1);
      this.evictionLock.lock();

      try {
         this.maintenance(null);

         try (Stream var4 = StreamSupport.stream(Spliterators.spliteratorUnknownSize(var1.iterator(), 1297), false)) {
            return (T)var3.apply(var4.<Policy.CacheEntry<K, V>>map(var2x -> this.nodeToCacheEntry((Node<K, V>)var2x, var2)).filter(Objects::nonNull));
         }
      } finally {
         this.evictionLock.unlock();
         this.rescheduleCleanUpIfIncomplete();
      }
   }

   Policy.@Nullable CacheEntry<K, V> nodeToCacheEntry(Node<K, V> var1, Function<V, V> var2) {
      Object var3 = var2.apply(var1.getValue());
      Object var4 = var1.getKey();
      long var5;
      if (var4 != null && var3 != null && var1.isAlive() && !this.hasExpired(var1, var5 = this.expirationTicker().read())) {
         long var7 = Long.MAX_VALUE;
         if (this.expiresAfterAccess()) {
            var7 = Math.min(var7, var5 - var1.getAccessTime() + this.expiresAfterAccessNanos());
         }

         if (this.expiresAfterWrite()) {
            var7 = Math.min(var7, (var5 & -2L) - (var1.getWriteTime() & -2L) + this.expiresAfterWriteNanos());
         }

         if (this.expiresVariable()) {
            var7 = var1.getVariableTime() - var5;
         }

         long var9 = this.refreshAfterWrite() ? var1.getWriteTime() + this.refreshAfterWriteNanos() : var5 + Long.MAX_VALUE;
         int var11 = var1.getPolicyWeight();
         return SnapshotEntry.forEntry((K)var4, (V)var3, var5, var11, var5 + var7, var9);
      } else {
         return null;
      }
   }

   static <K, V> SerializationProxy<K, V> makeSerializationProxy(BoundedLocalCache<?, ?> var0) {
      SerializationProxy var1 = new SerializationProxy();
      var1.weakKeys = var0.collectKeys();
      var1.weakValues = var0.nodeFactory.weakValues();
      var1.softValues = var0.nodeFactory.softValues();
      var1.isRecordingStats = var0.isRecordingStats();
      var1.evictionListener = var0.evictionListener;
      var1.removalListener = var0.removalListener();
      var1.ticker = var0.expirationTicker();
      if (var0.expiresAfterAccess()) {
         var1.expiresAfterAccessNanos = var0.expiresAfterAccessNanos();
      }

      if (var0.expiresAfterWrite()) {
         var1.expiresAfterWriteNanos = var0.expiresAfterWriteNanos();
      }

      if (var0.expiresVariable()) {
         var1.expiry = var0.expiry();
      }

      if (var0.refreshAfterWrite()) {
         var1.refreshAfterWriteNanos = var0.refreshAfterWriteNanos();
      }

      if (var0.evicts()) {
         if (var0.isWeighted) {
            var1.weigher = var0.weigher;
            var1.maximumWeight = var0.maximum();
         } else {
            var1.maximumSize = var0.maximum();
         }
      }

      var1.cacheLoader = var0.cacheLoader;
      var1.async = var0.isAsync;
      return var1;
   }

   static {
      try {
         REFRESHES = MethodHandles.lookup().findVarHandle(BoundedLocalCache.class, "refreshes", ConcurrentMap.class);
      } catch (ReflectiveOperationException var1) {
         throw new ExceptionInInitializerError(var1);
      }
   }

   final class AddTask implements Runnable {
      final Node<K, V> node;
      final int weight;

      AddTask(Node<K, V> var2, int var3) {
         this.weight = var3;
         this.node = var2;
      }

      @GuardedBy("evictionLock")
      @Override
      public void run() {
         if (BoundedLocalCache.this.evicts()) {
            BoundedLocalCache.this.setWeightedSize(BoundedLocalCache.this.weightedSize() + this.weight);
            BoundedLocalCache.this.setWindowWeightedSize(BoundedLocalCache.this.windowWeightedSize() + this.weight);
            this.node.setPolicyWeight(this.node.getPolicyWeight() + this.weight);
            long var1 = BoundedLocalCache.this.maximum();
            if (BoundedLocalCache.this.weightedSize() >= var1 >>> 1) {
               if (BoundedLocalCache.this.weightedSize() > 9223372034707292160L) {
                  BoundedLocalCache.this.evictEntries();
               } else {
                  long var3 = BoundedLocalCache.this.isWeighted() ? BoundedLocalCache.this.data.mappingCount() : var1;
                  BoundedLocalCache.this.frequencySketch().ensureCapacity(var3);
               }
            }

            Object var11 = this.node.getKey();
            if (var11 != null) {
               BoundedLocalCache.this.frequencySketch().increment((K)var11);
            }

            BoundedLocalCache.this.setMissesInSample(BoundedLocalCache.this.missesInSample() + 1);
         }

         boolean var9;
         synchronized (this.node) {
            var9 = this.node.isAlive();
         }

         if (var9) {
            if (BoundedLocalCache.this.expiresAfterWrite()) {
               BoundedLocalCache.this.writeOrderDeque().offerLast(this.node);
            }

            if (BoundedLocalCache.this.expiresVariable()) {
               BoundedLocalCache.this.timerWheel().schedule(this.node);
            }

            if (BoundedLocalCache.this.evicts()) {
               if (this.weight > BoundedLocalCache.this.maximum()) {
                  BoundedLocalCache.this.evictEntry(this.node, RemovalCause.SIZE, BoundedLocalCache.this.expirationTicker().read());
               } else if (this.weight > BoundedLocalCache.this.windowMaximum()) {
                  BoundedLocalCache.this.accessOrderWindowDeque().offerFirst(this.node);
               } else {
                  BoundedLocalCache.this.accessOrderWindowDeque().offerLast(this.node);
               }
            } else if (BoundedLocalCache.this.expiresAfterAccess()) {
               BoundedLocalCache.this.accessOrderWindowDeque().offerLast(this.node);
            }
         }

         if (BoundedLocalCache.this.isComputingAsync(this.node)) {
            synchronized (this.node) {
               if (!Async.isReady((CompletableFuture<?>)this.node.getValue())) {
                  long var12 = BoundedLocalCache.this.expirationTicker().read() + 6917529027641081854L;
                  BoundedLocalCache.this.setVariableTime(this.node, var12);
                  BoundedLocalCache.this.setAccessTime(this.node, var12);
                  BoundedLocalCache.this.setWriteTime(this.node, var12);
               }
            }
         }
      }
   }

   static final class BoundedLocalAsyncCache<K, V> implements LocalAsyncCache<K, V>, Serializable {
      private static final long serialVersionUID = 1L;
      final BoundedLocalCache<K, CompletableFuture<V>> cache;
      final boolean isWeighted;
      @Nullable ConcurrentMap<K, CompletableFuture<V>> mapView;
      LocalAsyncCache.@Nullable CacheView<K, V> cacheView;
      @Nullable Policy<K, V> policy;

      BoundedLocalAsyncCache(Caffeine<K, V> var1) {
         this.cache = LocalCacheFactory.newBoundedLocalCache(var1, null, true);
         this.isWeighted = var1.isWeighted();
      }

      public BoundedLocalCache<K, CompletableFuture<V>> cache() {
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
         if (this.policy == null) {
            BoundedLocalCache var1 = this.cache;
            Function var2 = Async::getIfReady;
            Function var3 = var2;
            this.policy = new BoundedLocalCache.BoundedPolicy<>(var1, var3, this.isWeighted);
         }

         return this.policy;
      }

      private void readObject(ObjectInputStream var1) {
         throw new InvalidObjectException("Proxy required");
      }

      private Object writeReplace() {
         return BoundedLocalCache.makeSerializationProxy(this.cache);
      }
   }

   static final class BoundedLocalAsyncLoadingCache<K, V> extends LocalAsyncLoadingCache<K, V> implements Serializable {
      private static final long serialVersionUID = 1L;
      final BoundedLocalCache<K, CompletableFuture<V>> cache;
      final boolean isWeighted;
      @Nullable ConcurrentMap<K, CompletableFuture<V>> mapView;
      @Nullable Policy<K, V> policy;

      BoundedLocalAsyncLoadingCache(Caffeine<K, V> var1, AsyncCacheLoader<? super K, V> var2) {
         super(var2);
         this.isWeighted = var1.isWeighted();
         this.cache = LocalCacheFactory.newBoundedLocalCache(var1, var2, true);
      }

      public BoundedLocalCache<K, CompletableFuture<V>> cache() {
         return this.cache;
      }

      @Override
      public ConcurrentMap<K, CompletableFuture<V>> asMap() {
         return this.mapView == null ? (this.mapView = new LocalAsyncCache.AsyncAsMapView<>(this)) : this.mapView;
      }

      @Override
      public Policy<K, V> policy() {
         if (this.policy == null) {
            BoundedLocalCache var1 = this.cache;
            Function var2 = Async::getIfReady;
            Function var3 = var2;
            this.policy = new BoundedLocalCache.BoundedPolicy<>(var1, var3, this.isWeighted);
         }

         return this.policy;
      }

      private void readObject(ObjectInputStream var1) {
         throw new InvalidObjectException("Proxy required");
      }

      private Object writeReplace() {
         return BoundedLocalCache.makeSerializationProxy(this.cache);
      }
   }

   static final class BoundedLocalLoadingCache<K, V> extends BoundedLocalCache.BoundedLocalManualCache<K, V> implements LocalLoadingCache<K, V> {
      private static final long serialVersionUID = 1L;
      final Function<K, V> mappingFunction;
      final @Nullable Function<Set<? extends K>, Map<K, V>> bulkMappingFunction;

      BoundedLocalLoadingCache(Caffeine<K, V> var1, CacheLoader<? super K, V> var2) {
         super(var1, var2);
         Objects.requireNonNull(var2);
         this.mappingFunction = LocalLoadingCache.newMappingFunction(var2);
         this.bulkMappingFunction = LocalLoadingCache.newBulkMappingFunction(var2);
      }

      @Override
      public AsyncCacheLoader<? super K, V> cacheLoader() {
         return this.cache.cacheLoader;
      }

      @Override
      public Function<K, V> mappingFunction() {
         return this.mappingFunction;
      }

      @Override
      public @Nullable Function<Set<? extends K>, Map<K, V>> bulkMappingFunction() {
         return this.bulkMappingFunction;
      }

      private void readObject(ObjectInputStream var1) {
         throw new InvalidObjectException("Proxy required");
      }

      private Object writeReplace() {
         return BoundedLocalCache.makeSerializationProxy(this.cache);
      }
   }

   static class BoundedLocalManualCache<K, V> implements LocalManualCache<K, V>, Serializable {
      private static final long serialVersionUID = 1L;
      final BoundedLocalCache<K, V> cache;
      @Nullable Policy<K, V> policy;

      BoundedLocalManualCache(Caffeine<K, V> var1) {
         this(var1, null);
      }

      BoundedLocalManualCache(Caffeine<K, V> var1, @Nullable CacheLoader<? super K, V> var2) {
         this.cache = LocalCacheFactory.newBoundedLocalCache(var1, var2, false);
      }

      public BoundedLocalCache<K, V> cache() {
         return this.cache;
      }

      @Override
      public Policy<K, V> policy() {
         Policy var1 = this.policy;
         return var1 == null ? (this.policy = new BoundedLocalCache.BoundedPolicy<>(this.cache, Function.identity(), this.cache.isWeighted)) : var1;
      }

      private void readObject(ObjectInputStream var1) {
         throw new InvalidObjectException("Proxy required");
      }

      private Object writeReplace() {
         return BoundedLocalCache.makeSerializationProxy(this.cache);
      }
   }

   static final class BoundedPolicy<K, V> implements Policy<K, V> {
      final BoundedLocalCache<K, V> cache;
      final Function<V, V> transformer;
      final boolean isWeighted;
      @Nullable Optional<Policy.Eviction<K, V>> eviction;
      @Nullable Optional<Policy.FixedRefresh<K, V>> refreshes;
      @Nullable Optional<Policy.FixedExpiration<K, V>> afterWrite;
      @Nullable Optional<Policy.FixedExpiration<K, V>> afterAccess;
      @Nullable Optional<Policy.VarExpiration<K, V>> variable;

      BoundedPolicy(BoundedLocalCache<K, V> var1, Function<V, V> var2, boolean var3) {
         this.transformer = var2;
         this.isWeighted = var3;
         this.cache = var1;
      }

      @Override
      public boolean isRecordingStats() {
         return this.cache.isRecordingStats();
      }

      @Override
      public @Nullable V getIfPresentQuietly(K var1) {
         return this.transformer.apply(this.cache.getIfPresentQuietly((K)var1));
      }

      @Override
      public Policy.@Nullable CacheEntry<K, V> getEntryIfPresentQuietly(K var1) {
         Node var2 = this.cache.data.get(this.cache.nodeFactory.newLookupKey(var1));
         return var2 == null ? null : this.cache.nodeToCacheEntry(var2, this.transformer);
      }

      @Override
      public Map<K, CompletableFuture<V>> refreshes() {
         ConcurrentMap var1 = this.cache.refreshes;
         if (var1 != null && !var1.isEmpty()) {
            if (this.cache.collectKeys()) {
               IdentityHashMap var7 = new IdentityHashMap(var1.size());

               for (Entry var4 : var1.entrySet()) {
                  Object var5 = ((References.InternalReference)var4.getKey()).get();
                  CompletableFuture var6 = (CompletableFuture)var4.getValue();
                  if (var5 != null) {
                     var7.put(var5, var6);
                  }
               }

               return Collections.unmodifiableMap(var7);
            } else {
               Map var2 = var1;
               return Collections.unmodifiableMap(new HashMap<>(var2));
            }
         } else {
            return Collections.unmodifiableMap(Collections.emptyMap());
         }
      }

      @Override
      public Optional<Policy.Eviction<K, V>> eviction() {
         return this.cache.evicts()
            ? (this.eviction == null ? (this.eviction = Optional.of(new BoundedLocalCache.BoundedPolicy.BoundedEviction())) : this.eviction)
            : Optional.empty();
      }

      @Override
      public Optional<Policy.FixedExpiration<K, V>> expireAfterAccess() {
         if (!this.cache.expiresAfterAccess()) {
            return Optional.empty();
         } else {
            return this.afterAccess == null
               ? (this.afterAccess = Optional.of(new BoundedLocalCache.BoundedPolicy.BoundedExpireAfterAccess()))
               : this.afterAccess;
         }
      }

      @Override
      public Optional<Policy.FixedExpiration<K, V>> expireAfterWrite() {
         if (!this.cache.expiresAfterWrite()) {
            return Optional.empty();
         } else {
            return this.afterWrite == null ? (this.afterWrite = Optional.of(new BoundedLocalCache.BoundedPolicy.BoundedExpireAfterWrite())) : this.afterWrite;
         }
      }

      @Override
      public Optional<Policy.VarExpiration<K, V>> expireVariably() {
         if (!this.cache.expiresVariable()) {
            return Optional.empty();
         } else {
            return this.variable == null ? (this.variable = Optional.of(new BoundedLocalCache.BoundedPolicy.BoundedVarExpiration())) : this.variable;
         }
      }

      @Override
      public Optional<Policy.FixedRefresh<K, V>> refreshAfterWrite() {
         if (!this.cache.refreshAfterWrite()) {
            return Optional.empty();
         } else {
            return this.refreshes == null ? (this.refreshes = Optional.of(new BoundedLocalCache.BoundedPolicy.BoundedRefreshAfterWrite())) : this.refreshes;
         }
      }

      final class BoundedEviction implements Policy.Eviction<K, V> {
         @Override
         public boolean isWeighted() {
            return BoundedPolicy.this.isWeighted;
         }

         @Override
         public OptionalInt weightOf(K var1) {
            Objects.requireNonNull(var1);
            if (!BoundedPolicy.this.isWeighted) {
               return OptionalInt.empty();
            }

            Node var2 = BoundedPolicy.this.cache.data.get(BoundedPolicy.this.cache.nodeFactory.newLookupKey(var1));
            if (var2 != null && !BoundedPolicy.this.cache.hasExpired(var2, BoundedPolicy.this.cache.expirationTicker().read())) {
               synchronized (var2) {
                  return OptionalInt.of(var2.getWeight());
               }
            } else {
               return OptionalInt.empty();
            }
         }

         @Override
         public OptionalLong weightedSize() {
            if (BoundedPolicy.this.cache.evicts() && this.isWeighted()) {
               BoundedPolicy.this.cache.evictionLock.lock();

               try {
                  if (BoundedPolicy.this.cache.drainStatusOpaque() == 1) {
                     BoundedPolicy.this.cache.maintenance(null);
                  }

                  return OptionalLong.of(Math.max(0L, BoundedPolicy.this.cache.weightedSize()));
               } finally {
                  BoundedPolicy.this.cache.evictionLock.unlock();
                  BoundedPolicy.this.cache.rescheduleCleanUpIfIncomplete();
               }
            } else {
               return OptionalLong.empty();
            }
         }

         @Override
         public long getMaximum() {
            BoundedPolicy.this.cache.evictionLock.lock();

            try {
               if (BoundedPolicy.this.cache.drainStatusOpaque() == 1) {
                  BoundedPolicy.this.cache.maintenance(null);
               }

               return BoundedPolicy.this.cache.maximum();
            } finally {
               BoundedPolicy.this.cache.evictionLock.unlock();
               BoundedPolicy.this.cache.rescheduleCleanUpIfIncomplete();
            }
         }

         @Override
         public void setMaximum(long var1) {
            BoundedPolicy.this.cache.evictionLock.lock();

            try {
               BoundedPolicy.this.cache.setMaximumSize(var1);
               BoundedPolicy.this.cache.maintenance(null);
            } finally {
               BoundedPolicy.this.cache.evictionLock.unlock();
               BoundedPolicy.this.cache.rescheduleCleanUpIfIncomplete();
            }
         }

         @Override
         public Map<K, V> coldest(int var1) {
            int var2 = Math.min(var1, BoundedPolicy.this.cache.size());
            BoundedLocalCache.SizeLimiter var3 = new BoundedLocalCache.SizeLimiter(var2, var1);
            return BoundedPolicy.this.cache.evictionOrder(false, BoundedPolicy.this.transformer, var3);
         }

         @Override
         public Map<K, V> coldestWeighted(long var1) {
            Function var3 = this.isWeighted()
               ? new BoundedLocalCache.WeightLimiter(var1)
               : new BoundedLocalCache.SizeLimiter((int)Math.min(var1, BoundedPolicy.this.cache.size()), var1);
            return BoundedPolicy.this.cache.evictionOrder(false, BoundedPolicy.this.transformer, var3);
         }

         @Override
         public <T> T coldest(Function<Stream<Policy.CacheEntry<K, V>>, T> var1) {
            Objects.requireNonNull(var1);
            return BoundedPolicy.this.cache.evictionOrder(false, BoundedPolicy.this.transformer, var1);
         }

         @Override
         public Map<K, V> hottest(int var1) {
            int var2 = Math.min(var1, BoundedPolicy.this.cache.size());
            BoundedLocalCache.SizeLimiter var3 = new BoundedLocalCache.SizeLimiter(var2, var1);
            return BoundedPolicy.this.cache.evictionOrder(true, BoundedPolicy.this.transformer, var3);
         }

         @Override
         public Map<K, V> hottestWeighted(long var1) {
            Function var3 = this.isWeighted()
               ? new BoundedLocalCache.WeightLimiter(var1)
               : new BoundedLocalCache.SizeLimiter((int)Math.min(var1, BoundedPolicy.this.cache.size()), var1);
            return BoundedPolicy.this.cache.evictionOrder(true, BoundedPolicy.this.transformer, var3);
         }

         @Override
         public <T> T hottest(Function<Stream<Policy.CacheEntry<K, V>>, T> var1) {
            Objects.requireNonNull(var1);
            return BoundedPolicy.this.cache.evictionOrder(true, BoundedPolicy.this.transformer, var1);
         }
      }

      final class BoundedExpireAfterAccess implements Policy.FixedExpiration<K, V> {
         @Override
         public OptionalLong ageOf(K var1, TimeUnit var2) {
            Objects.requireNonNull(var1);
            Objects.requireNonNull(var2);
            Object var3 = BoundedPolicy.this.cache.nodeFactory.newLookupKey(var1);
            Node var4 = BoundedPolicy.this.cache.data.get(var3);
            if (var4 == null) {
               return OptionalLong.empty();
            }

            long var5 = BoundedPolicy.this.cache.expirationTicker().read();
            return BoundedPolicy.this.cache.hasExpired(var4, var5)
               ? OptionalLong.empty()
               : OptionalLong.of(var2.convert(var5 - var4.getAccessTime(), TimeUnit.NANOSECONDS));
         }

         @Override
         public long getExpiresAfter(TimeUnit var1) {
            return var1.convert(BoundedPolicy.this.cache.expiresAfterAccessNanos(), TimeUnit.NANOSECONDS);
         }

         @Override
         public void setExpiresAfter(long var1, TimeUnit var3) {
            Caffeine.requireArgument(var1 >= 0L);
            BoundedPolicy.this.cache.setExpiresAfterAccessNanos(var3.toNanos(var1));
            BoundedPolicy.this.cache.scheduleAfterWrite();
         }

         @Override
         public Map<K, V> oldest(int var1) {
            return this.oldest(new BoundedLocalCache.SizeLimiter<>(Math.min(var1, BoundedPolicy.this.cache.size()), var1));
         }

         @Override
         public <T> T oldest(Function<Stream<Policy.CacheEntry<K, V>>, T> var1) {
            return BoundedPolicy.this.cache.expireAfterAccessOrder(true, BoundedPolicy.this.transformer, var1);
         }

         @Override
         public Map<K, V> youngest(int var1) {
            return this.youngest(new BoundedLocalCache.SizeLimiter<>(Math.min(var1, BoundedPolicy.this.cache.size()), var1));
         }

         @Override
         public <T> T youngest(Function<Stream<Policy.CacheEntry<K, V>>, T> var1) {
            return BoundedPolicy.this.cache.expireAfterAccessOrder(false, BoundedPolicy.this.transformer, var1);
         }
      }

      final class BoundedExpireAfterWrite implements Policy.FixedExpiration<K, V> {
         @Override
         public OptionalLong ageOf(K var1, TimeUnit var2) {
            Objects.requireNonNull(var1);
            Objects.requireNonNull(var2);
            Object var3 = BoundedPolicy.this.cache.nodeFactory.newLookupKey(var1);
            Node var4 = BoundedPolicy.this.cache.data.get(var3);
            if (var4 == null) {
               return OptionalLong.empty();
            }

            long var5 = BoundedPolicy.this.cache.expirationTicker().read();
            return BoundedPolicy.this.cache.hasExpired(var4, var5)
               ? OptionalLong.empty()
               : OptionalLong.of(var2.convert(var5 - var4.getWriteTime(), TimeUnit.NANOSECONDS));
         }

         @Override
         public long getExpiresAfter(TimeUnit var1) {
            return var1.convert(BoundedPolicy.this.cache.expiresAfterWriteNanos(), TimeUnit.NANOSECONDS);
         }

         @Override
         public void setExpiresAfter(long var1, TimeUnit var3) {
            Caffeine.requireArgument(var1 >= 0L);
            BoundedPolicy.this.cache.setExpiresAfterWriteNanos(var3.toNanos(var1));
            BoundedPolicy.this.cache.scheduleAfterWrite();
         }

         @Override
         public Map<K, V> oldest(int var1) {
            return this.oldest(new BoundedLocalCache.SizeLimiter<>(Math.min(var1, BoundedPolicy.this.cache.size()), var1));
         }

         @Override
         public <T> T oldest(Function<Stream<Policy.CacheEntry<K, V>>, T> var1) {
            return BoundedPolicy.this.cache.snapshot(BoundedPolicy.this.cache.writeOrderDeque(), BoundedPolicy.this.transformer, var1);
         }

         @Override
         public Map<K, V> youngest(int var1) {
            return this.youngest(new BoundedLocalCache.SizeLimiter<>(Math.min(var1, BoundedPolicy.this.cache.size()), var1));
         }

         @Override
         public <T> T youngest(Function<Stream<Policy.CacheEntry<K, V>>, T> var1) {
            return BoundedPolicy.this.cache.snapshot(BoundedPolicy.this.cache.writeOrderDeque()::descendingIterator, BoundedPolicy.this.transformer, var1);
         }
      }

      final class BoundedRefreshAfterWrite implements Policy.FixedRefresh<K, V> {
         @Override
         public OptionalLong ageOf(K var1, TimeUnit var2) {
            Objects.requireNonNull(var1);
            Objects.requireNonNull(var2);
            Object var3 = BoundedPolicy.this.cache.nodeFactory.newLookupKey(var1);
            Node var4 = BoundedPolicy.this.cache.data.get(var3);
            if (var4 == null) {
               return OptionalLong.empty();
            }

            long var5 = BoundedPolicy.this.cache.expirationTicker().read();
            return BoundedPolicy.this.cache.hasExpired(var4, var5)
               ? OptionalLong.empty()
               : OptionalLong.of(var2.convert(var5 - var4.getWriteTime(), TimeUnit.NANOSECONDS));
         }

         @Override
         public long getRefreshesAfter(TimeUnit var1) {
            return var1.convert(BoundedPolicy.this.cache.refreshAfterWriteNanos(), TimeUnit.NANOSECONDS);
         }

         @Override
         public void setRefreshesAfter(long var1, TimeUnit var3) {
            Caffeine.requireArgument(var1 >= 0L);
            BoundedPolicy.this.cache.setRefreshAfterWriteNanos(var3.toNanos(var1));
            BoundedPolicy.this.cache.scheduleAfterWrite();
         }
      }

      final class BoundedVarExpiration implements Policy.VarExpiration<K, V> {
         @Override
         public OptionalLong getExpiresAfter(K var1, TimeUnit var2) {
            Objects.requireNonNull(var1);
            Objects.requireNonNull(var2);
            Object var3 = BoundedPolicy.this.cache.nodeFactory.newLookupKey(var1);
            Node var4 = BoundedPolicy.this.cache.data.get(var3);
            if (var4 == null) {
               return OptionalLong.empty();
            }

            long var5 = BoundedPolicy.this.cache.expirationTicker().read();
            return BoundedPolicy.this.cache.hasExpired(var4, var5)
               ? OptionalLong.empty()
               : OptionalLong.of(var2.convert(var4.getVariableTime() - var5, TimeUnit.NANOSECONDS));
         }

         @Override
         public void setExpiresAfter(K var1, long var2, TimeUnit var4) {
            Objects.requireNonNull(var1);
            Objects.requireNonNull(var4);
            Caffeine.requireArgument(var2 >= 0L);
            Object var5 = BoundedPolicy.this.cache.nodeFactory.newLookupKey(var1);
            Node var6 = BoundedPolicy.this.cache.data.get(var5);
            if (var6 != null) {
               long var9 = TimeUnit.NANOSECONDS.convert(var2, var4);
               long var7;
               synchronized (var6) {
                  var7 = BoundedPolicy.this.cache.expirationTicker().read();
                  if (BoundedPolicy.this.cache.hasExpired(var6, var7)) {
                     return;
                  }

                  var6.setVariableTime(var7 + Math.min(var9, 4611686018427387903L));
               }

               BoundedPolicy.this.cache.afterRead(var6, var7, false);
            }
         }

         @Override
         public @Nullable V put(K var1, V var2, long var3, TimeUnit var5) {
            Objects.requireNonNull(var5);
            Objects.requireNonNull(var2);
            Caffeine.requireArgument(var3 >= 0L);
            return (V)(BoundedPolicy.this.cache.isAsync ? this.putAsync(var1, (long)var2, var3, var5) : this.putSync(var1, (long)var2, var3, var5, false));
         }

         @Override
         public @Nullable V putIfAbsent(K var1, V var2, long var3, TimeUnit var5) {
            Objects.requireNonNull(var5);
            Objects.requireNonNull(var2);
            Caffeine.requireArgument(var3 >= 0L);
            return (V)(BoundedPolicy.this.cache.isAsync
               ? this.putIfAbsentAsync(var1, (long)var2, var3, var5)
               : this.putSync(var1, (long)var2, var3, var5, true));
         }

         @Nullable V putSync(K var1, V var2, long var3, TimeUnit var5, boolean var6) {
            BoundedLocalCache.BoundedPolicy.FixedExpireAfterWrite var7 = new BoundedLocalCache.BoundedPolicy.FixedExpireAfterWrite(var3, var5);
            return BoundedPolicy.this.cache.put((K)var1, (V)var2, var7, var6);
         }

         @Nullable V putIfAbsentAsync(K var1, V var2, long var3, TimeUnit var5) {
            Async.AsyncExpiry var6 = new Async.AsyncExpiry<>(new BoundedLocalCache.BoundedPolicy.FixedExpireAfterWrite<>(var3, var5));
            CompletableFuture var7 = CompletableFuture.completedFuture(var2);

            while (true) {
               CompletableFuture var8 = (CompletableFuture)BoundedPolicy.this.cache.getIfPresent(var1, false);
               if (var8 != null) {
                  if (!var8.isDone()) {
                     Async.getWhenSuccessful(var8);
                     continue;
                  }

                  Object var9 = Async.getWhenSuccessful(var8);
                  if (var9 != null) {
                     return (V)var9;
                  }
               }

               boolean[] var12 = new boolean[]{false};
               CompletableFuture var10 = (CompletableFuture)BoundedPolicy.this.cache.compute((K)var1, (var2x, var3x) -> {
                  CompletableFuture var4 = (CompletableFuture)var3x;
                  var12[0] = var4 == null || var4.isDone() && Async.getIfReady(var4) == null;
                  return (V)(var12[0] ? var7 : var3x);
               }, var6, false, false);
               if (var12[0]) {
                  return null;
               }

               Object var11 = Async.getWhenSuccessful(var10);
               if (var11 != null) {
                  return (V)var11;
               }
            }
         }

         @Nullable V putAsync(K var1, V var2, long var3, TimeUnit var5) {
            Async.AsyncExpiry var6 = new Async.AsyncExpiry<>(new BoundedLocalCache.BoundedPolicy.FixedExpireAfterWrite<>(var3, var5));
            CompletableFuture var7 = CompletableFuture.completedFuture(var2);
            CompletableFuture var8 = (CompletableFuture)BoundedPolicy.this.cache.put((K)var1, (V)var7, var6, false);
            return Async.getWhenSuccessful(var8);
         }

         @Override
         public V compute(K var1, BiFunction<? super K, ? super V, ? extends V> var2, Duration var3) {
            Objects.requireNonNull(var1);
            Objects.requireNonNull(var3);
            Objects.requireNonNull(var2);
            Caffeine.requireArgument(!var3.isNegative(), "duration cannot be negative: %s", var3);
            BoundedLocalCache.BoundedPolicy.FixedExpireAfterWrite var4 = new BoundedLocalCache.BoundedPolicy.FixedExpireAfterWrite(
               Caffeine.saturatedToNanos(var3), TimeUnit.NANOSECONDS
            );
            return (V)(BoundedPolicy.this.cache.isAsync
               ? this.computeAsync((BiFunction)var1, var2, var4)
               : BoundedPolicy.this.cache.compute((K)var1, var2, var4, true, true));
         }

         @Nullable V computeAsync(K var1, BiFunction<? super K, ? super V, ? extends V> var2, Expiry<? super K, ? super V> var3) {
            BoundedLocalCache var4 = BoundedPolicy.this.cache;
            Object[] var5 = new Object[1];

            CompletableFuture var6;
            do {
               Async.getWhenSuccessful((CompletableFuture<V>)var4.getIfPresentQuietly(var1));
               var6 = var4.compute(var1, (var4x, var5x) -> {
                  if (var5x != null && !var5x.isDone()) {
                     return (CompletableFuture)var5x;
                  }

                  Object var6x = Async.getIfReady((CompletableFuture<V>)var5x);
                  BiFunction var7 = var4.statsAware(var2, true, true);
                  var5[0] = var7.apply(var1, var6x);
                  return var5[0] == null ? null : CompletableFuture.completedFuture(var5[0]);
               }, new Async.AsyncExpiry<>(var3), false, false);
               if (var5[0] != null) {
                  return (V)var5[0];
               }
            } while (var6 != null);

            return null;
         }

         @Override
         public Map<K, V> oldest(int var1) {
            return this.oldest(new BoundedLocalCache.SizeLimiter<>(Math.min(var1, BoundedPolicy.this.cache.size()), var1));
         }

         @Override
         public <T> T oldest(Function<Stream<Policy.CacheEntry<K, V>>, T> var1) {
            return BoundedPolicy.this.cache.snapshot(BoundedPolicy.this.cache.timerWheel(), BoundedPolicy.this.transformer, var1);
         }

         @Override
         public Map<K, V> youngest(int var1) {
            return this.youngest(new BoundedLocalCache.SizeLimiter<>(Math.min(var1, BoundedPolicy.this.cache.size()), var1));
         }

         @Override
         public <T> T youngest(Function<Stream<Policy.CacheEntry<K, V>>, T> var1) {
            return BoundedPolicy.this.cache.snapshot(BoundedPolicy.this.cache.timerWheel()::descendingIterator, BoundedPolicy.this.transformer, var1);
         }
      }

      static final class FixedExpireAfterWrite<K, V> implements Expiry<K, V> {
         final long duration;
         final TimeUnit unit;

         FixedExpireAfterWrite(long var1, TimeUnit var3) {
            this.duration = var1;
            this.unit = var3;
         }

         @Override
         public long expireAfterCreate(K var1, V var2, long var3) {
            return this.unit.toNanos(this.duration);
         }

         @Override
         public long expireAfterUpdate(K var1, V var2, long var3, long var5) {
            return this.unit.toNanos(this.duration);
         }

         @CanIgnoreReturnValue
         @Override
         public long expireAfterRead(K var1, V var2, long var3, long var5) {
            return var5;
         }
      }
   }

   static final class EntryIterator<K, V> implements Iterator<Entry<K, V>> {
      final BoundedLocalCache<K, V> cache;
      final Iterator<Node<K, V>> iterator;
      @Nullable K key;
      @Nullable V value;
      @Nullable K removalKey;
      @Nullable Node<K, V> next;

      EntryIterator(BoundedLocalCache<K, V> var1) {
         this.iterator = var1.data.values().iterator();
         this.cache = var1;
      }

      @Override
      public boolean hasNext() {
         if (this.next != null) {
            return true;
         }

         long var1 = this.cache.expirationTicker().read();

         while (this.iterator.hasNext()) {
            this.next = this.iterator.next();
            this.value = this.next.getValue();
            this.key = this.next.getKey();
            boolean var3 = this.key == null || this.value == null || this.cache.hasExpired(this.next, var1);
            if (!var3 && this.next.isAlive()) {
               return true;
            }

            if (var3) {
               this.cache.scheduleDrainBuffers();
            }

            this.advance();
         }

         return false;
      }

      void advance() {
         this.value = null;
         this.next = null;
         this.key = null;
      }

      K nextKey() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         }

         this.removalKey = this.key;
         this.advance();
         return this.removalKey;
      }

      V nextValue() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         }

         this.removalKey = this.key;
         Object var1 = this.value;
         this.advance();
         return (V)var1;
      }

      public Entry<K, V> next() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         }

         WriteThroughEntry var1 = new WriteThroughEntry<>(this.cache, this.key, this.value);
         this.removalKey = this.key;
         this.advance();
         return var1;
      }

      @Override
      public void remove() {
         if (this.removalKey == null) {
            throw new IllegalStateException();
         }

         this.cache.remove(this.removalKey);
         this.removalKey = null;
      }
   }

   static final class EntrySetView<K, V> extends AbstractSet<Entry<K, V>> {
      final BoundedLocalCache<K, V> cache;

      EntrySetView(BoundedLocalCache<K, V> var1) {
         this.cache = Objects.requireNonNull(var1);
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
               Node var5 = this.cache.data.get(this.cache.nodeFactory.newLookupKey(var3));
               return var5 != null && var5.containsValue(var4);
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
               var2 |= var4 != null && this.remove(var4);
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

         for (Entry var4 : this) {
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
         return new BoundedLocalCache.EntryIterator<>(this.cache);
      }

      @Override
      public Spliterator<Entry<K, V>> spliterator() {
         return new BoundedLocalCache.EntrySpliterator<>(this.cache);
      }
   }

   static final class EntrySpliterator<K, V> implements Spliterator<Entry<K, V>> {
      final Spliterator<Node<K, V>> spliterator;
      final BoundedLocalCache<K, V> cache;

      EntrySpliterator(BoundedLocalCache<K, V> var1) {
         this(var1, var1.data.values().spliterator());
      }

      EntrySpliterator(BoundedLocalCache<K, V> var1, Spliterator<Node<K, V>> var2) {
         this.spliterator = Objects.requireNonNull(var2);
         this.cache = Objects.requireNonNull(var1);
      }

      @Override
      public void forEachRemaining(Consumer<? super Entry<K, V>> var1) {
         Objects.requireNonNull(var1);
         Consumer var2 = var2x -> {
            Object var3 = var2x.getKey();
            Object var4 = var2x.getValue();
            long var5 = this.cache.expirationTicker().read();
            if (var3 != null && var4 != null && var2x.isAlive() && !this.cache.hasExpired(var2x, var5)) {
               var1.accept(new WriteThroughEntry<>(this.cache, (K)var3, (V)var4));
            }
         };
         this.spliterator.forEachRemaining(var2);
      }

      @Override
      public boolean tryAdvance(Consumer<? super Entry<K, V>> var1) {
         boolean[] var2 = new boolean[]{false};
         Consumer var3 = var3x -> {
            Object var4 = var3x.getKey();
            Object var5 = var3x.getValue();
            long var6 = this.cache.expirationTicker().read();
            if (var4 != null && var5 != null && var3x.isAlive() && !this.cache.hasExpired(var3x, var6)) {
               var1.accept(new WriteThroughEntry<>(this.cache, (K)var4, (V)var5));
               var2[0] = true;
            }
         };

         while (this.spliterator.tryAdvance(var3)) {
            if (var2[0]) {
               return true;
            }
         }

         return false;
      }

      @Override
      public @Nullable Spliterator<Entry<K, V>> trySplit() {
         Spliterator var1 = this.spliterator.trySplit();
         return var1 == null ? null : new BoundedLocalCache.EntrySpliterator<>(this.cache, var1);
      }

      @Override
      public long estimateSize() {
         return this.spliterator.estimateSize();
      }

      @Override
      public int characteristics() {
         return 4353;
      }
   }

   static final class KeyIterator<K, V> implements Iterator<K> {
      final BoundedLocalCache.EntryIterator<K, V> iterator;

      KeyIterator(BoundedLocalCache<K, V> var1) {
         this.iterator = new BoundedLocalCache.EntryIterator<>(var1);
      }

      @Override
      public boolean hasNext() {
         return this.iterator.hasNext();
      }

      @Override
      public K next() {
         return this.iterator.nextKey();
      }

      @Override
      public void remove() {
         this.iterator.remove();
      }
   }

   static final class KeySetView<K, V> extends AbstractSet<K> {
      final BoundedLocalCache<K, V> cache;

      KeySetView(BoundedLocalCache<K, V> var1) {
         this.cache = Objects.requireNonNull(var1);
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
      public Iterator<K> iterator() {
         return new BoundedLocalCache.KeyIterator<>(this.cache);
      }

      @Override
      public Spliterator<K> spliterator() {
         return new BoundedLocalCache.KeySpliterator<>(this.cache);
      }
   }

   static final class KeySpliterator<K, V> implements Spliterator<K> {
      final Spliterator<Node<K, V>> spliterator;
      final BoundedLocalCache<K, V> cache;

      KeySpliterator(BoundedLocalCache<K, V> var1) {
         this(var1, var1.data.values().spliterator());
      }

      KeySpliterator(BoundedLocalCache<K, V> var1, Spliterator<Node<K, V>> var2) {
         this.spliterator = Objects.requireNonNull(var2);
         this.cache = Objects.requireNonNull(var1);
      }

      @Override
      public void forEachRemaining(Consumer<? super K> var1) {
         Objects.requireNonNull(var1);
         Consumer var2 = var2x -> {
            Object var3 = var2x.getKey();
            Object var4 = var2x.getValue();
            long var5 = this.cache.expirationTicker().read();
            if (var3 != null && var4 != null && var2x.isAlive() && !this.cache.hasExpired(var2x, var5)) {
               var1.accept(var3);
            }
         };
         this.spliterator.forEachRemaining(var2);
      }

      @Override
      public boolean tryAdvance(Consumer<? super K> var1) {
         boolean[] var2 = new boolean[]{false};
         Consumer var3 = var3x -> {
            Object var4 = var3x.getKey();
            Object var5 = var3x.getValue();
            long var6 = this.cache.expirationTicker().read();
            if (var4 != null && var5 != null && var3x.isAlive() && !this.cache.hasExpired(var3x, var6)) {
               var1.accept(var4);
               var2[0] = true;
            }
         };

         while (this.spliterator.tryAdvance(var3)) {
            if (var2[0]) {
               return true;
            }
         }

         return false;
      }

      @Override
      public @Nullable Spliterator<K> trySplit() {
         Spliterator var1 = this.spliterator.trySplit();
         return var1 == null ? null : new BoundedLocalCache.KeySpliterator<>(this.cache, var1);
      }

      @Override
      public long estimateSize() {
         return this.spliterator.estimateSize();
      }

      @Override
      public int characteristics() {
         return 4353;
      }
   }

   static final class PerformCleanupTask extends ForkJoinTask<Void> implements Runnable {
      private static final long serialVersionUID = 1L;
      final WeakReference<BoundedLocalCache<?, ?>> reference;

      PerformCleanupTask(BoundedLocalCache<?, ?> var1) {
         this.reference = new WeakReference<>(var1);
      }

      @Override
      public boolean exec() {
         try {
            this.run();
         } catch (Throwable var2) {
            BoundedLocalCache.logger.log(Level.ERROR, "Exception thrown when performing the maintenance task", var2);
         }

         return false;
      }

      @Override
      public void run() {
         BoundedLocalCache var1 = this.reference.get();
         if (var1 != null) {
            var1.performCleanUp(null);
         }
      }

      public Void getRawResult() {
         return null;
      }

      public void setRawResult(Void var1) {
      }

      public void complete(Void var1) {
      }

      @Override
      public void completeExceptionally(Throwable var1) {
      }

      @Override
      public boolean cancel(boolean var1) {
         return false;
      }
   }

   final class RemovalTask implements Runnable {
      final Node<K, V> node;

      RemovalTask(Node<K, V> var2) {
         this.node = var2;
      }

      @GuardedBy("evictionLock")
      @Override
      public void run() {
         if (!this.node.inWindow() || !BoundedLocalCache.this.evicts() && !BoundedLocalCache.this.expiresAfterAccess()) {
            if (BoundedLocalCache.this.evicts()) {
               if (this.node.inMainProbation()) {
                  BoundedLocalCache.this.accessOrderProbationDeque().remove(this.node);
               } else {
                  BoundedLocalCache.this.accessOrderProtectedDeque().remove(this.node);
               }
            }
         } else {
            BoundedLocalCache.this.accessOrderWindowDeque().remove(this.node);
         }

         if (BoundedLocalCache.this.expiresAfterWrite()) {
            BoundedLocalCache.this.writeOrderDeque().remove(this.node);
         } else if (BoundedLocalCache.this.expiresVariable()) {
            BoundedLocalCache.this.timerWheel().deschedule(this.node);
         }

         BoundedLocalCache.this.makeDead(this.node);
      }
   }

   static final class SizeLimiter<K, V> implements Function<Stream<Policy.CacheEntry<K, V>>, Map<K, V>> {
      private final int expectedSize;
      private final long limit;

      SizeLimiter(int var1, long var2) {
         Caffeine.requireArgument(var2 >= 0L);
         this.expectedSize = var1;
         this.limit = var2;
      }

      public Map<K, V> apply(Stream<Policy.CacheEntry<K, V>> var1) {
         LinkedHashMap var2 = new LinkedHashMap(Caffeine.calculateHashMapCapacity(this.expectedSize));
         var1.limit(this.limit).forEach(var1x -> var2.put(var1x.getKey(), var1x.getValue()));
         return Collections.unmodifiableMap(var2);
      }
   }

   final class UpdateTask implements Runnable {
      final int weightDifference;
      final Node<K, V> node;

      public UpdateTask(Node<K, V> var2, int var3) {
         this.weightDifference = var3;
         this.node = var2;
      }

      @GuardedBy("evictionLock")
      @Override
      public void run() {
         if (BoundedLocalCache.this.expiresAfterWrite()) {
            BoundedLocalCache.reorder(BoundedLocalCache.this.writeOrderDeque(), this.node);
         } else if (BoundedLocalCache.this.expiresVariable()) {
            BoundedLocalCache.this.timerWheel().reschedule(this.node);
         }

         if (BoundedLocalCache.this.evicts()) {
            int var1 = this.node.getPolicyWeight();
            this.node.setPolicyWeight(var1 + this.weightDifference);
            if (this.node.inWindow()) {
               BoundedLocalCache.this.setWindowWeightedSize(BoundedLocalCache.this.windowWeightedSize() + this.weightDifference);
               if (this.node.getPolicyWeight() > BoundedLocalCache.this.maximum()) {
                  BoundedLocalCache.this.evictEntry(this.node, RemovalCause.SIZE, BoundedLocalCache.this.expirationTicker().read());
               } else if (this.node.getPolicyWeight() <= BoundedLocalCache.this.windowMaximum()) {
                  BoundedLocalCache.this.onAccess(this.node);
               } else if (BoundedLocalCache.this.accessOrderWindowDeque().contains(this.node)) {
                  BoundedLocalCache.this.accessOrderWindowDeque().moveToFront(this.node);
               }
            } else if (this.node.inMainProbation()) {
               if (this.node.getPolicyWeight() <= BoundedLocalCache.this.maximum()) {
                  BoundedLocalCache.this.onAccess(this.node);
               } else {
                  BoundedLocalCache.this.evictEntry(this.node, RemovalCause.SIZE, BoundedLocalCache.this.expirationTicker().read());
               }
            } else if (this.node.inMainProtected()) {
               BoundedLocalCache.this.setMainProtectedWeightedSize(BoundedLocalCache.this.mainProtectedWeightedSize() + this.weightDifference);
               if (this.node.getPolicyWeight() <= BoundedLocalCache.this.maximum()) {
                  BoundedLocalCache.this.onAccess(this.node);
               } else {
                  BoundedLocalCache.this.evictEntry(this.node, RemovalCause.SIZE, BoundedLocalCache.this.expirationTicker().read());
               }
            }

            BoundedLocalCache.this.setWeightedSize(BoundedLocalCache.this.weightedSize() + this.weightDifference);
            if (BoundedLocalCache.this.weightedSize() > 9223372034707292160L) {
               BoundedLocalCache.this.evictEntries();
            }
         } else if (BoundedLocalCache.this.expiresAfterAccess()) {
            BoundedLocalCache.this.onAccess(this.node);
         }
      }
   }

   static final class ValueIterator<K, V> implements Iterator<V> {
      final BoundedLocalCache.EntryIterator<K, V> iterator;

      ValueIterator(BoundedLocalCache<K, V> var1) {
         this.iterator = new BoundedLocalCache.EntryIterator<>(var1);
      }

      @Override
      public boolean hasNext() {
         return this.iterator.hasNext();
      }

      @Override
      public V next() {
         return this.iterator.nextValue();
      }

      @Override
      public void remove() {
         this.iterator.remove();
      }
   }

   static final class ValueSpliterator<K, V> implements Spliterator<V> {
      final Spliterator<Node<K, V>> spliterator;
      final BoundedLocalCache<K, V> cache;

      ValueSpliterator(BoundedLocalCache<K, V> var1) {
         this(var1, var1.data.values().spliterator());
      }

      ValueSpliterator(BoundedLocalCache<K, V> var1, Spliterator<Node<K, V>> var2) {
         this.spliterator = Objects.requireNonNull(var2);
         this.cache = Objects.requireNonNull(var1);
      }

      @Override
      public void forEachRemaining(Consumer<? super V> var1) {
         Objects.requireNonNull(var1);
         Consumer var2 = var2x -> {
            Object var3 = var2x.getKey();
            Object var4 = var2x.getValue();
            long var5 = this.cache.expirationTicker().read();
            if (var3 != null && var4 != null && var2x.isAlive() && !this.cache.hasExpired(var2x, var5)) {
               var1.accept(var4);
            }
         };
         this.spliterator.forEachRemaining(var2);
      }

      @Override
      public boolean tryAdvance(Consumer<? super V> var1) {
         boolean[] var2 = new boolean[]{false};
         long var3 = this.cache.expirationTicker().read();
         Consumer var5 = var5x -> {
            Object var6 = var5x.getKey();
            Object var7 = var5x.getValue();
            if (var6 != null && var7 != null && !this.cache.hasExpired(var5x, var3) && var5x.isAlive()) {
               var1.accept(var7);
               var2[0] = true;
            }
         };

         while (this.spliterator.tryAdvance(var5)) {
            if (var2[0]) {
               return true;
            }
         }

         return false;
      }

      @Override
      public @Nullable Spliterator<V> trySplit() {
         Spliterator var1 = this.spliterator.trySplit();
         return var1 == null ? null : new BoundedLocalCache.ValueSpliterator<>(this.cache, var1);
      }

      @Override
      public long estimateSize() {
         return this.spliterator.estimateSize();
      }

      @Override
      public int characteristics() {
         return 4352;
      }
   }

   static final class ValuesView<K, V> extends AbstractCollection<V> {
      final BoundedLocalCache<K, V> cache;

      ValuesView(BoundedLocalCache<K, V> var1) {
         this.cache = Objects.requireNonNull(var1);
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

         for (BoundedLocalCache.EntryIterator var3 = new BoundedLocalCache.EntryIterator<>(this.cache); var3.hasNext(); var3.advance()) {
            if (var1.contains(var3.value) && this.cache.remove(var3.key, var3.value)) {
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

         BoundedLocalCache.EntryIterator var2 = new BoundedLocalCache.EntryIterator<>(this.cache);

         while (var2.hasNext()) {
            if (var1.equals(var2.value) && this.cache.remove(var2.key, var2.value)) {
               return true;
            }

            var2.advance();
         }

         return false;
      }

      @Override
      public boolean removeIf(Predicate<? super V> var1) {
         boolean var2 = false;

         for (BoundedLocalCache.EntryIterator var3 = new BoundedLocalCache.EntryIterator<>(this.cache); var3.hasNext(); var3.advance()) {
            if (var1.test(var3.value)) {
               var2 |= this.cache.remove(var3.key, var3.value);
            }
         }

         return var2;
      }

      @Override
      public boolean retainAll(Collection<?> var1) {
         boolean var2 = false;

         for (BoundedLocalCache.EntryIterator var3 = new BoundedLocalCache.EntryIterator<>(this.cache); var3.hasNext(); var3.advance()) {
            if (!var1.contains(var3.value) && this.cache.remove(var3.key, var3.value)) {
               var2 = true;
            }
         }

         return var2;
      }

      @Override
      public Iterator<V> iterator() {
         return new BoundedLocalCache.ValueIterator<>(this.cache);
      }

      @Override
      public Spliterator<V> spliterator() {
         return new BoundedLocalCache.ValueSpliterator<>(this.cache);
      }
   }

   static final class WeightLimiter<K, V> implements Function<Stream<Policy.CacheEntry<K, V>>, Map<K, V>> {
      private final long weightLimit;
      private long weightedSize;

      WeightLimiter(long var1) {
         Caffeine.requireArgument(var1 >= 0L);
         this.weightLimit = var1;
      }

      public Map<K, V> apply(Stream<Policy.CacheEntry<K, V>> var1) {
         LinkedHashMap var2 = new LinkedHashMap();
         var1.takeWhile(var1x -> {
            this.weightedSize = Math.addExact(this.weightedSize, var1x.weight());
            return this.weightedSize <= this.weightLimit;
         }).forEach(var1x -> var2.put(var1x.getKey(), var1x.getValue()));
         return Collections.unmodifiableMap(var2);
      }
   }
}
