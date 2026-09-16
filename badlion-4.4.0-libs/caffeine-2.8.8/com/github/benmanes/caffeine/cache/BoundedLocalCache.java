package com.github.benmanes.caffeine.cache;

import com.github.benmanes.caffeine.cache.stats.StatsCounter;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Set;
import java.util.Spliterator;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

abstract class BoundedLocalCache<K, V> extends BLCHeader.DrainStatusRef<K, V> implements LocalCache<K, V> {
   static final Logger logger = Logger.getLogger(BoundedLocalCache.class.getName());
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
   static final int QUEUE_TRANSFER_THRESHOLD = 1000;
   static final long EXPIRE_WRITE_TOLERANCE = TimeUnit.SECONDS.toNanos(1L);
   static final long MAXIMUM_EXPIRY = 4611686018427387903L;
   final ConcurrentHashMap<Object, Node<K, V>> data;
   final @Nullable CacheLoader<K, V> cacheLoader;
   final BoundedLocalCache.PerformCleanupTask drainBuffersTask;
   final Consumer<Node<K, V>> accessPolicy;
   final Buffer<Node<K, V>> readBuffer;
   final NodeFactory<K, V> nodeFactory;
   final ReentrantLock evictionLock;
   final CacheWriter<K, V> writer;
   final Weigher<K, V> weigher;
   final Executor executor;
   final boolean isAsync;
   transient @Nullable Set<K> keySet;
   transient @Nullable Collection<V> values;
   transient @Nullable Set<Entry<K, V>> entrySet;

   protected BoundedLocalCache(Caffeine<K, V> builder, @Nullable CacheLoader<K, V> cacheLoader, boolean isAsync) {
      this.isAsync = isAsync;
      this.cacheLoader = cacheLoader;
      this.executor = builder.getExecutor();
      this.writer = builder.getCacheWriter();
      this.evictionLock = new ReentrantLock();
      this.weigher = builder.getWeigher(isAsync);
      this.drainBuffersTask = new BoundedLocalCache.PerformCleanupTask(this);
      this.nodeFactory = NodeFactory.newFactory(builder, isAsync);
      this.data = new ConcurrentHashMap<>(builder.getInitialCapacity());
      this.readBuffer = !this.evicts() && !this.collectKeys() && !this.collectValues() && !this.expiresAfterAccess()
         ? Buffer.disabled()
         : new BoundedBuffer<>();
      this.accessPolicy = !this.evicts() && !this.expiresAfterAccess() ? e -> {} : this::onAccess;
      if (this.evicts()) {
         this.setMaximumSize(builder.getMaximum());
      }
   }

   final boolean isComputingAsync(Node<?, ?> node) {
      return this.isAsync && !Async.isReady((CompletableFuture<?>)node.getValue());
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

   protected boolean buffersWrites() {
      return false;
   }

   protected MpscGrowableArrayQueue<Runnable> writeBuffer() {
      throw new UnsupportedOperationException();
   }

   @Override
   public final Executor executor() {
      return this.executor;
   }

   protected boolean hasWriter() {
      return this.writer != CacheWriter.disabledWriter();
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

   @Override
   public RemovalListener<K, V> removalListener() {
      return null;
   }

   @Override
   public boolean hasRemovalListener() {
      return false;
   }

   @Override
   public void notifyRemoval(@Nullable K key, @Nullable V value, RemovalCause cause) {
      Caffeine.requireState(this.hasRemovalListener(), "Notification should be guarded with a check");
      Runnable task = () -> {
         try {
            this.removalListener().onRemoval(key, value, cause);
         } catch (Throwable t) {
            logger.log(Level.WARNING, "Exception thrown by removal listener", t);
         }
      };

      try {
         this.executor.execute(task);
      } catch (Throwable t) {
         logger.log(Level.SEVERE, "Exception thrown when submitting removal listener", t);
         task.run();
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

   protected void setExpiresAfterAccessNanos(long expireAfterAccessNanos) {
      throw new UnsupportedOperationException();
   }

   protected boolean expiresAfterWrite() {
      return false;
   }

   protected long expiresAfterWriteNanos() {
      throw new UnsupportedOperationException();
   }

   protected void setExpiresAfterWriteNanos(long expireAfterWriteNanos) {
      throw new UnsupportedOperationException();
   }

   protected boolean refreshAfterWrite() {
      return false;
   }

   protected long refreshAfterWriteNanos() {
      throw new UnsupportedOperationException();
   }

   protected void setRefreshAfterWriteNanos(long refreshAfterWriteNanos) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean hasWriteTime() {
      return this.expiresAfterWrite() || this.refreshAfterWrite();
   }

   protected Expiry<K, V> expiry() {
      return null;
   }

   @Override
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
   protected void setMaximum(long maximum) {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setWindowMaximum(long maximum) {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setMainProtectedMaximum(long maximum) {
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
   protected void setWeightedSize(long weightedSize) {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setWindowWeightedSize(long weightedSize) {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setMainProtectedWeightedSize(long weightedSize) {
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
   protected void setHitsInSample(int hitCount) {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setMissesInSample(int missCount) {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setSampleCount(int sampleCount) {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setStepSize(double stepSize) {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setPreviousSampleHitRate(double hitRate) {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   protected void setAdjustment(long amount) {
      throw new UnsupportedOperationException();
   }

   @GuardedBy("evictionLock")
   void setMaximumSize(long maximum) {
      Caffeine.requireArgument(maximum >= 0L, "maximum must not be negative");
      if (maximum != this.maximum()) {
         long max = Math.min(maximum, 9223372034707292160L);
         long window = max - (long)(0.99 * max);
         long mainProtected = (long)(0.8 * (max - window));
         this.setMaximum(max);
         this.setWindowMaximum(window);
         this.setMainProtectedMaximum(mainProtected);
         this.setHitsInSample(0);
         this.setMissesInSample(0);
         this.setStepSize(-0.0625 * max);
         if (this.frequencySketch() != null && !this.isWeighted() && this.weightedSize() >= max >>> 1) {
            this.frequencySketch().ensureCapacity(max);
         }
      }
   }

   @GuardedBy("evictionLock")
   void evictEntries() {
      if (this.evicts()) {
         int candidates = this.evictFromWindow();
         this.evictFromMain(candidates);
      }
   }

   @GuardedBy("evictionLock")
   int evictFromWindow() {
      int candidates = 0;
      Node<K, V> node = this.accessOrderWindowDeque().peek();

      while (this.windowWeightedSize() > this.windowMaximum() && node != null) {
         Node<K, V> next = node.getNextInAccessOrder();
         if (node.getPolicyWeight() != 0) {
            node.makeMainProbation();
            this.accessOrderWindowDeque().remove(node);
            this.accessOrderProbationDeque().add(node);
            candidates++;
            this.setWindowWeightedSize(this.windowWeightedSize() - node.getPolicyWeight());
         }

         node = next;
      }

      return candidates;
   }

   @GuardedBy("evictionLock")
   void evictFromMain(int candidates) {
      int victimQueue = 1;
      Node<K, V> victim = this.accessOrderProbationDeque().peekFirst();
      Node<K, V> candidate = this.accessOrderProbationDeque().peekLast();

      while (this.weightedSize() > this.maximum()) {
         if (candidates == 0) {
            candidate = null;
         }

         if (candidate == null && victim == null) {
            if (victimQueue == 1) {
               victim = this.accessOrderProtectedDeque().peekFirst();
               victimQueue = 2;
            } else {
               if (victimQueue != 2) {
                  break;
               }

               victim = this.accessOrderWindowDeque().peekFirst();
               victimQueue = 0;
            }
         } else if (victim != null && victim.getPolicyWeight() == 0) {
            victim = victim.getNextInAccessOrder();
         } else if (candidate != null && candidate.getPolicyWeight() == 0) {
            candidate = candidate.getPreviousInAccessOrder();
            candidates--;
         } else if (victim == null) {
            Node<K, V> previous = candidate.getPreviousInAccessOrder();
            Node<K, V> evict = candidate;
            candidate = previous;
            candidates--;
            this.evictEntry(evict, RemovalCause.SIZE, 0L);
         } else if (candidate == null) {
            Node<K, V> evict = victim;
            victim = victim.getNextInAccessOrder();
            this.evictEntry(evict, RemovalCause.SIZE, 0L);
         } else {
            K victimKey = victim.getKey();
            K candidateKey = candidate.getKey();
            if (victimKey == null) {
               Node<K, V> evict = victim;
               victim = victim.getNextInAccessOrder();
               this.evictEntry(evict, RemovalCause.COLLECTED, 0L);
            } else if (candidateKey == null) {
               candidates--;
               Node<K, V> evict = candidate;
               candidate = candidate.getPreviousInAccessOrder();
               this.evictEntry(evict, RemovalCause.COLLECTED, 0L);
            } else if (candidate.getPolicyWeight() > this.maximum()) {
               candidates--;
               Node<K, V> evict = candidate;
               candidate = candidate.getPreviousInAccessOrder();
               this.evictEntry(evict, RemovalCause.SIZE, 0L);
            } else {
               candidates--;
               if (this.admit(candidateKey, victimKey)) {
                  Node<K, V> evict = victim;
                  victim = victim.getNextInAccessOrder();
                  this.evictEntry(evict, RemovalCause.SIZE, 0L);
                  candidate = candidate.getPreviousInAccessOrder();
               } else {
                  Node<K, V> evict = candidate;
                  candidate = candidate.getPreviousInAccessOrder();
                  this.evictEntry(evict, RemovalCause.SIZE, 0L);
               }
            }
         }
      }
   }

   @GuardedBy("evictionLock")
   boolean admit(K candidateKey, K victimKey) {
      int victimFreq = this.frequencySketch().frequency(victimKey);
      int candidateFreq = this.frequencySketch().frequency(candidateKey);
      if (candidateFreq > victimFreq) {
         return true;
      }

      if (candidateFreq <= 5) {
         return false;
      }

      int random = ThreadLocalRandom.current().nextInt();
      return (random & 127) == 0;
   }

   @GuardedBy("evictionLock")
   void expireEntries() {
      long now = this.expirationTicker().read();
      this.expireAfterAccessEntries(now);
      this.expireAfterWriteEntries(now);
      this.expireVariableEntries(now);
      Pacer pacer = this.pacer();
      if (pacer != null) {
         long delay = this.getExpirationDelay(now);
         if (delay != Long.MAX_VALUE) {
            pacer.schedule(this.executor, this.drainBuffersTask, now, delay);
         }
      }
   }

   @GuardedBy("evictionLock")
   void expireAfterAccessEntries(long now) {
      if (this.expiresAfterAccess()) {
         this.expireAfterAccessEntries(this.accessOrderWindowDeque(), now);
         if (this.evicts()) {
            this.expireAfterAccessEntries(this.accessOrderProbationDeque(), now);
            this.expireAfterAccessEntries(this.accessOrderProtectedDeque(), now);
         }
      }
   }

   @GuardedBy("evictionLock")
   void expireAfterAccessEntries(AccessOrderDeque<Node<K, V>> accessOrderDeque, long now) {
      long duration = this.expiresAfterAccessNanos();

      while (true) {
         Node<K, V> node = accessOrderDeque.peekFirst();
         if (node == null || now - node.getAccessTime() < duration) {
            return;
         }

         this.evictEntry(node, RemovalCause.EXPIRED, now);
      }
   }

   @GuardedBy("evictionLock")
   void expireAfterWriteEntries(long now) {
      if (this.expiresAfterWrite()) {
         long duration = this.expiresAfterWriteNanos();

         while (true) {
            Node<K, V> node = this.writeOrderDeque().peekFirst();
            if (node == null || now - node.getWriteTime() < duration) {
               return;
            }

            this.evictEntry(node, RemovalCause.EXPIRED, now);
         }
      }
   }

   @GuardedBy("evictionLock")
   void expireVariableEntries(long now) {
      if (this.expiresVariable()) {
         this.timerWheel().advance(now);
      }
   }

   @GuardedBy("evictionLock")
   private long getExpirationDelay(long now) {
      long delay = Long.MAX_VALUE;
      if (this.expiresAfterAccess()) {
         Node<K, V> node = this.accessOrderWindowDeque().peekFirst();
         if (node != null) {
            delay = Math.min(delay, this.expiresAfterAccessNanos() - (now - node.getAccessTime()));
         }

         if (this.evicts()) {
            node = this.accessOrderProbationDeque().peekFirst();
            if (node != null) {
               delay = Math.min(delay, this.expiresAfterAccessNanos() - (now - node.getAccessTime()));
            }

            node = this.accessOrderProtectedDeque().peekFirst();
            if (node != null) {
               delay = Math.min(delay, this.expiresAfterAccessNanos() - (now - node.getAccessTime()));
            }
         }
      }

      if (this.expiresAfterWrite()) {
         Node<K, V> node = this.writeOrderDeque().peekFirst();
         if (node != null) {
            delay = Math.min(delay, this.expiresAfterWriteNanos() - (now - node.getWriteTime()));
         }
      }

      if (this.expiresVariable()) {
         delay = Math.min(delay, this.timerWheel().getExpirationDelay());
      }

      return delay;
   }

   boolean hasExpired(Node<K, V> node, long now) {
      return (this.expiresAfterAccess() && now - node.getAccessTime() >= this.expiresAfterAccessNanos())
         | (this.expiresAfterWrite() && now - node.getWriteTime() >= this.expiresAfterWriteNanos())
         | (this.expiresVariable() && now - node.getVariableTime() >= 0L);
   }

   @GuardedBy("evictionLock")
   boolean evictEntry(Node<K, V> node, RemovalCause cause, long now) {
      K key = node.getKey();
      V[] value = (V[])(new Object[1]);
      boolean[] removed = new boolean[1];
      boolean[] resurrect = new boolean[1];
      RemovalCause[] actualCause = new RemovalCause[1];
      this.data.computeIfPresent(node.getKeyReference(), (k, n) -> {
         if (n != node) {
            return n;
         }

         synchronized (n) {
            value[0] = n.getValue();
            actualCause[0] = key != null && value[0] != null ? cause : RemovalCause.COLLECTED;
            if (actualCause[0] == RemovalCause.EXPIRED) {
               boolean expired = false;
               if (this.expiresAfterAccess()) {
                  expired |= now - n.getAccessTime() >= this.expiresAfterAccessNanos();
               }

               if (this.expiresAfterWrite()) {
                  expired |= now - n.getWriteTime() >= this.expiresAfterWriteNanos();
               }

               if (this.expiresVariable()) {
                  expired |= n.getVariableTime() <= now;
               }

               if (!expired) {
                  resurrect[0] = true;
                  return n;
               }
            } else if (actualCause[0] == RemovalCause.SIZE) {
               int weight = node.getWeight();
               if (weight == 0) {
                  resurrect[0] = true;
                  return n;
               }
            }

            if (key != null) {
               this.writer.delete(key, value[0], actualCause[0]);
            }

            this.makeDead((Node<K, V>)n);
         }

         removed[0] = true;
         return null;
      });
      if (resurrect[0]) {
         return false;
      }

      if (!node.inWindow() || !this.evicts() && !this.expiresAfterAccess()) {
         if (this.evicts()) {
            if (node.inMainProbation()) {
               this.accessOrderProbationDeque().remove(node);
            } else {
               this.accessOrderProtectedDeque().remove(node);
            }
         }
      } else {
         this.accessOrderWindowDeque().remove(node);
      }

      if (this.expiresAfterWrite()) {
         this.writeOrderDeque().remove(node);
      } else if (this.expiresVariable()) {
         this.timerWheel().deschedule(node);
      }

      if (removed[0]) {
         this.statsCounter().recordEviction(node.getWeight(), actualCause[0]);
         if (this.hasRemovalListener()) {
            this.notifyRemoval(key, value[0], actualCause[0]);
         }
      } else {
         this.makeDead(node);
      }

      return true;
   }

   @GuardedBy("evictionLock")
   void climb() {
      if (this.evicts()) {
         this.determineAdjustment();
         this.demoteFromMainProtected();
         long amount = this.adjustment();
         if (amount != 0L) {
            if (amount > 0L) {
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
         int requestCount = this.hitsInSample() + this.missesInSample();
         if (requestCount >= this.frequencySketch().sampleSize) {
            double hitRate = (double)this.hitsInSample() / requestCount;
            double hitRateChange = hitRate - this.previousSampleHitRate();
            double amount = hitRateChange >= 0.0 ? this.stepSize() : -this.stepSize();
            double nextStepSize = Math.abs(hitRateChange) >= 0.05 ? 0.0625 * this.maximum() * (amount >= 0.0 ? 1 : -1) : 0.98 * amount;
            this.setPreviousSampleHitRate(hitRate);
            this.setAdjustment((long)amount);
            this.setStepSize(nextStepSize);
            this.setMissesInSample(0);
            this.setHitsInSample(0);
         }
      }
   }

   @GuardedBy("evictionLock")
   void increaseWindow() {
      if (this.mainProtectedMaximum() != 0L) {
         long quota = Math.min(this.adjustment(), this.mainProtectedMaximum());
         this.setMainProtectedMaximum(this.mainProtectedMaximum() - quota);
         this.setWindowMaximum(this.windowMaximum() + quota);
         this.demoteFromMainProtected();

         for (int i = 0; i < 1000; i++) {
            Node<K, V> candidate = this.accessOrderProbationDeque().peek();
            boolean probation = true;
            if (candidate == null || quota < candidate.getPolicyWeight()) {
               candidate = this.accessOrderProtectedDeque().peek();
               probation = false;
            }

            if (candidate == null) {
               break;
            }

            int weight = candidate.getPolicyWeight();
            if (quota < weight) {
               break;
            }

            quota -= weight;
            if (probation) {
               this.accessOrderProbationDeque().remove(candidate);
            } else {
               this.setMainProtectedWeightedSize(this.mainProtectedWeightedSize() - weight);
               this.accessOrderProtectedDeque().remove(candidate);
            }

            this.setWindowWeightedSize(this.windowWeightedSize() + weight);
            this.accessOrderWindowDeque().add(candidate);
            candidate.makeWindow();
         }

         this.setMainProtectedMaximum(this.mainProtectedMaximum() + quota);
         this.setWindowMaximum(this.windowMaximum() - quota);
         this.setAdjustment(quota);
      }
   }

   @GuardedBy("evictionLock")
   void decreaseWindow() {
      if (this.windowMaximum() > 1L) {
         long quota = Math.min(-this.adjustment(), Math.max(0L, this.windowMaximum() - 1L));
         this.setMainProtectedMaximum(this.mainProtectedMaximum() + quota);
         this.setWindowMaximum(this.windowMaximum() - quota);

         for (int i = 0; i < 1000; i++) {
            Node<K, V> candidate = this.accessOrderWindowDeque().peek();
            if (candidate == null) {
               break;
            }

            int weight = candidate.getPolicyWeight();
            if (quota < weight) {
               break;
            }

            quota -= weight;
            this.setMainProtectedWeightedSize(this.mainProtectedWeightedSize() + weight);
            this.setWindowWeightedSize(this.windowWeightedSize() - weight);
            this.accessOrderWindowDeque().remove(candidate);
            this.accessOrderProbationDeque().add(candidate);
            candidate.makeMainProbation();
         }

         this.setMainProtectedMaximum(this.mainProtectedMaximum() - quota);
         this.setWindowMaximum(this.windowMaximum() + quota);
         this.setAdjustment(-quota);
      }
   }

   @GuardedBy("evictionLock")
   void demoteFromMainProtected() {
      long mainProtectedMaximum = this.mainProtectedMaximum();
      long mainProtectedWeightedSize = this.mainProtectedWeightedSize();
      if (mainProtectedWeightedSize > mainProtectedMaximum) {
         for (int i = 0; i < 1000 && mainProtectedWeightedSize > mainProtectedMaximum; i++) {
            Node<K, V> demoted = this.accessOrderProtectedDeque().poll();
            if (demoted == null) {
               break;
            }

            demoted.makeMainProbation();
            this.accessOrderProbationDeque().add(demoted);
            mainProtectedWeightedSize -= demoted.getPolicyWeight();
         }

         this.setMainProtectedWeightedSize(mainProtectedWeightedSize);
      }
   }

   void afterRead(Node<K, V> node, long now, boolean recordHit) {
      if (recordHit) {
         this.statsCounter().recordHits(1);
      }

      boolean delayable = this.skipReadBuffer() || this.readBuffer.offer(node) != 1;
      if (this.shouldDrainBuffers(delayable)) {
         this.scheduleDrainBuffers();
      }

      this.refreshIfNeeded(node, now);
   }

   boolean skipReadBuffer() {
      return this.fastpath() && this.frequencySketch().isNotInitialized();
   }

   void refreshIfNeeded(Node<K, V> node, long now) {
      if (this.refreshAfterWrite()) {
         long oldWriteTime = node.getWriteTime();
         long refreshWriteTime = now + 6917529027641081854L;
         K key;
         V oldValue;
         if (now - oldWriteTime > this.refreshAfterWriteNanos()
            && (key = node.getKey()) != null
            && (oldValue = node.getValue()) != null
            && node.casWriteTime(oldWriteTime, refreshWriteTime)) {
            try {
               long startTime = this.statsTicker().read();
               CompletableFuture<V> refreshFuture;
               if (this.isAsync) {
                  CompletableFuture<V> future = (CompletableFuture<V>)oldValue;
                  if (!Async.isReady(future)) {
                     node.casWriteTime(refreshWriteTime, oldWriteTime);
                     return;
                  }

                  CompletableFuture<V> refresh = future.thenCompose(value -> this.cacheLoader.asyncReload(key, (V)value, this.executor));
                  refreshFuture = refresh;
               } else {
                  CompletableFuture<V> refresh = this.cacheLoader.asyncReload(key, oldValue, this.executor);
                  refreshFuture = refresh;
               }

               refreshFuture.whenComplete((newValue, error) -> {
                  long loadTime = this.statsTicker().read() - startTime;
                  if (error != null) {
                     logger.log(Level.WARNING, "Exception thrown during refresh", error);
                     node.casWriteTime(refreshWriteTime, oldWriteTime);
                     this.statsCounter().recordLoadFailure(loadTime);
                  } else {
                     V value = (V)(this.isAsync && newValue != null ? refreshFuture : newValue);
                     boolean[] discard = new boolean[1];
                     this.compute(key, (k, currentValue) -> {
                        if (currentValue == null) {
                           return value;
                        }

                        if (currentValue == oldValue && node.getWriteTime() == refreshWriteTime) {
                           return value;
                        }

                        discard[0] = true;
                        return (V)currentValue;
                     }, false, false, true);
                     if (discard[0] && this.hasRemovalListener()) {
                        this.notifyRemoval(key, value, RemovalCause.REPLACED);
                     }

                     if (newValue == null) {
                        this.statsCounter().recordLoadFailure(loadTime);
                     } else {
                        this.statsCounter().recordLoadSuccess(loadTime);
                     }
                  }
               });
            } catch (Throwable t) {
               node.casWriteTime(refreshWriteTime, oldWriteTime);
               logger.log(Level.SEVERE, "Exception thrown when submitting refresh task", t);
            }
         }
      }
   }

   long expireAfterCreate(@Nullable K key, @Nullable V value, Expiry<K, V> expiry, long now) {
      if (this.expiresVariable() && key != null && value != null) {
         long duration = expiry.expireAfterCreate(key, value, now);
         return this.isAsync ? now + duration : now + Math.min(duration, 4611686018427387903L);
      } else {
         return 0L;
      }
   }

   long expireAfterUpdate(Node<K, V> node, @Nullable K key, @Nullable V value, Expiry<K, V> expiry, long now) {
      if (this.expiresVariable() && key != null && value != null) {
         long currentDuration = Math.max(1L, node.getVariableTime() - now);
         long duration = expiry.expireAfterUpdate(key, value, now, currentDuration);
         return this.isAsync ? now + duration : now + Math.min(duration, 4611686018427387903L);
      } else {
         return 0L;
      }
   }

   long expireAfterRead(Node<K, V> node, @Nullable K key, @Nullable V value, Expiry<K, V> expiry, long now) {
      if (this.expiresVariable() && key != null && value != null) {
         long currentDuration = Math.max(1L, node.getVariableTime() - now);
         long duration = expiry.expireAfterRead(key, value, now, currentDuration);
         return this.isAsync ? now + duration : now + Math.min(duration, 4611686018427387903L);
      } else {
         return 0L;
      }
   }

   void tryExpireAfterRead(Node<K, V> node, @Nullable K key, @Nullable V value, Expiry<K, V> expiry, long now) {
      if (this.expiresVariable() && key != null && value != null) {
         long variableTime = node.getVariableTime();
         long currentDuration = Math.max(1L, variableTime - now);
         if (!this.isAsync || currentDuration <= 4611686018427387903L) {
            long duration = expiry.expireAfterRead(key, value, now, currentDuration);
            if (duration != currentDuration) {
               long expirationTime = this.isAsync ? now + duration : now + Math.min(duration, 4611686018427387903L);
               node.casVariableTime(variableTime, expirationTime);
            }
         }
      }
   }

   void setVariableTime(Node<K, V> node, long expirationTime) {
      if (this.expiresVariable()) {
         node.setVariableTime(expirationTime);
      }
   }

   void setWriteTime(Node<K, V> node, long now) {
      if (this.expiresAfterWrite() || this.refreshAfterWrite()) {
         node.setWriteTime(now);
      }
   }

   void setAccessTime(Node<K, V> node, long now) {
      if (this.expiresAfterAccess()) {
         node.setAccessTime(now);
      }
   }

   void afterWrite(Runnable task) {
      if (this.buffersWrites()) {
         for (int i = 0; i < 100; i++) {
            if (this.writeBuffer().offer(task)) {
               this.scheduleAfterWrite();
               return;
            }

            this.scheduleDrainBuffers();
         }

         try {
            this.performCleanUp(task);
         } catch (RuntimeException e) {
            logger.log(Level.SEVERE, "Exception thrown when performing the maintenance task", e);
         }
      } else {
         this.scheduleAfterWrite();
      }
   }

   void scheduleAfterWrite() {
      while (true) {
         switch (this.drainStatus()) {
            case 0:
               this.casDrainStatus(0, 1);
               this.scheduleDrainBuffers();
               return;
            case 1:
               this.scheduleDrainBuffers();
               return;
            case 2:
               if (!this.casDrainStatus(2, 3)) {
                  break;
               }

               return;
            case 3:
               return;
            default:
               throw new IllegalStateException();
         }
      }
   }

   void scheduleDrainBuffers() {
      if (this.drainStatus() < 2) {
         if (this.evictionLock.tryLock()) {
            try {
               int drainStatus = this.drainStatus();
               if (drainStatus < 2) {
                  this.lazySetDrainStatus(2);
                  this.executor.execute(this.drainBuffersTask);
                  return;
               }
            } catch (Throwable t) {
               logger.log(Level.WARNING, "Exception thrown when submitting maintenance task", t);
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
      } catch (RuntimeException e) {
         logger.log(Level.SEVERE, "Exception thrown when performing the maintenance task", e);
      }
   }

   void performCleanUp(@Nullable Runnable task) {
      this.evictionLock.lock();

      try {
         this.maintenance(task);
      } finally {
         this.evictionLock.unlock();
      }

      if (this.drainStatus() == 1 && this.executor == ForkJoinPool.commonPool()) {
         this.scheduleDrainBuffers();
      }
   }

   @GuardedBy("evictionLock")
   void maintenance(@Nullable Runnable task) {
      this.lazySetDrainStatus(2);

      try {
         this.drainReadBuffer();
         this.drainWriteBuffer();
         if (task != null) {
            task.run();
         }

         this.drainKeyReferences();
         this.drainValueReferences();
         this.expireEntries();
         this.evictEntries();
         this.climb();
      } finally {
         if (this.drainStatus() != 2 || !this.casDrainStatus(2, 0)) {
            this.lazySetDrainStatus(1);
         }
      }
   }

   @GuardedBy("evictionLock")
   void drainKeyReferences() {
      if (this.collectKeys()) {
         Reference<? extends K> keyRef;
         while ((keyRef = this.keyReferenceQueue().poll()) != null) {
            Node<K, V> node = this.data.get(keyRef);
            if (node != null) {
               this.evictEntry(node, RemovalCause.COLLECTED, 0L);
            }
         }
      }
   }

   @GuardedBy("evictionLock")
   void drainValueReferences() {
      if (this.collectValues()) {
         Reference<? extends V> valueRef;
         while ((valueRef = this.valueReferenceQueue().poll()) != null) {
            References.InternalReference<V> ref = (References.InternalReference<V>)valueRef;
            Node<K, V> node = this.data.get(ref.getKeyReference());
            if (node != null && valueRef == node.getValueReference()) {
               this.evictEntry(node, RemovalCause.COLLECTED, 0L);
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
   void onAccess(Node<K, V> node) {
      if (this.evicts()) {
         K key = node.getKey();
         if (key == null) {
            return;
         }

         this.frequencySketch().increment(key);
         if (node.inWindow()) {
            reorder(this.accessOrderWindowDeque(), node);
         } else if (node.inMainProbation()) {
            this.reorderProbation(node);
         } else {
            reorder(this.accessOrderProtectedDeque(), node);
         }

         this.setHitsInSample(this.hitsInSample() + 1);
      } else if (this.expiresAfterAccess()) {
         reorder(this.accessOrderWindowDeque(), node);
      }

      if (this.expiresVariable()) {
         this.timerWheel().reschedule(node);
      }
   }

   @GuardedBy("evictionLock")
   void reorderProbation(Node<K, V> node) {
      if (this.accessOrderProbationDeque().contains(node)) {
         if (node.getPolicyWeight() <= this.mainProtectedMaximum()) {
            this.setMainProtectedWeightedSize(this.mainProtectedWeightedSize() + node.getPolicyWeight());
            this.accessOrderProbationDeque().remove(node);
            this.accessOrderProtectedDeque().add(node);
            node.makeMainProtected();
         }
      }
   }

   static <K, V> void reorder(LinkedDeque<Node<K, V>> deque, Node<K, V> node) {
      if (deque.contains(node)) {
         deque.moveToBack(node);
      }
   }

   @GuardedBy("evictionLock")
   void drainWriteBuffer() {
      if (this.buffersWrites()) {
         for (int i = 0; i < WRITE_BUFFER_MAX; i++) {
            Runnable task = this.writeBuffer().poll();
            if (task == null) {
               return;
            }

            task.run();
         }

         this.lazySetDrainStatus(3);
      }
   }

   @GuardedBy("evictionLock")
   void makeDead(Node<K, V> node) {
      synchronized (node) {
         if (!node.isDead()) {
            if (this.evicts()) {
               if (node.inWindow()) {
                  this.setWindowWeightedSize(this.windowWeightedSize() - node.getWeight());
               } else if (node.inMainProtected()) {
                  this.setMainProtectedWeightedSize(this.mainProtectedWeightedSize() - node.getWeight());
               }

               this.setWeightedSize(this.weightedSize() - node.getWeight());
            }

            node.die();
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

      try {
         long now = this.expirationTicker().read();

         Runnable task;
         while (this.buffersWrites() && (task = this.writeBuffer().poll()) != null) {
            task.run();
         }

         for (Node<K, V> node : this.data.values()) {
            this.removeNode(node, now);
         }

         this.readBuffer.drainTo(e -> {});
      } finally {
         this.evictionLock.unlock();
      }
   }

   @GuardedBy("evictionLock")
   void removeNode(Node<K, V> node, long now) {
      K key = node.getKey();
      V[] value = (V[])(new Object[1]);
      RemovalCause[] cause = new RemovalCause[1];
      this.data.computeIfPresent(node.getKeyReference(), (k, n) -> {
         if (n != node) {
            return n;
         }

         synchronized (n) {
            value[0] = n.getValue();
            if (key == null || value[0] == null) {
               cause[0] = RemovalCause.COLLECTED;
            } else if (this.hasExpired((Node<K, V>)n, now)) {
               cause[0] = RemovalCause.EXPIRED;
            } else {
               cause[0] = RemovalCause.EXPLICIT;
            }

            if (key != null) {
               this.writer.delete(key, value[0], cause[0]);
            }

            this.makeDead((Node<K, V>)n);
            return null;
         }
      });
      if (!node.inWindow() || !this.evicts() && !this.expiresAfterAccess()) {
         if (this.evicts()) {
            if (node.inMainProbation()) {
               this.accessOrderProbationDeque().remove(node);
            } else {
               this.accessOrderProtectedDeque().remove(node);
            }
         }
      } else {
         this.accessOrderWindowDeque().remove(node);
      }

      if (this.expiresAfterWrite()) {
         this.writeOrderDeque().remove(node);
      } else if (this.expiresVariable()) {
         this.timerWheel().deschedule(node);
      }

      if (cause[0] != null && this.hasRemovalListener()) {
         this.notifyRemoval(key, value[0], cause[0]);
      }
   }

   @Override
   public boolean containsKey(Object key) {
      Node<K, V> node = this.data.get(this.nodeFactory.newLookupKey(key));
      return node != null && node.getValue() != null && !this.hasExpired(node, this.expirationTicker().read());
   }

   @Override
   public boolean containsValue(Object value) {
      Objects.requireNonNull(value);
      long now = this.expirationTicker().read();

      for (Node<K, V> node : this.data.values()) {
         if (node.containsValue(value) && !this.hasExpired(node, now) && node.getKey() != null) {
            return true;
         }
      }

      return false;
   }

   @Override
   public @Nullable V get(Object key) {
      return this.getIfPresent(key, false);
   }

   @Override
   public @Nullable V getIfPresent(Object key, boolean recordStats) {
      Node<K, V> node = this.data.get(this.nodeFactory.newLookupKey(key));
      if (node == null) {
         if (recordStats) {
            this.statsCounter().recordMisses(1);
         }

         if (this.drainStatus() == 1) {
            this.scheduleDrainBuffers();
         }

         return null;
      } else {
         V value = node.getValue();
         long now = this.expirationTicker().read();
         if (this.hasExpired(node, now) || this.collectValues() && value == null) {
            if (recordStats) {
               this.statsCounter().recordMisses(1);
            }

            this.scheduleDrainBuffers();
            return null;
         } else {
            if (!this.isComputingAsync(node)) {
               K castedKey = (K)key;
               this.setAccessTime(node, now);
               this.tryExpireAfterRead(node, castedKey, value, this.expiry(), now);
            }

            this.afterRead(node, now, recordStats);
            return value;
         }
      }
   }

   @Override
   public @Nullable V getIfPresentQuietly(Object key, long[] writeTime) {
      Node<K, V> node = this.data.get(this.nodeFactory.newLookupKey(key));
      V value;
      if (node != null && (value = node.getValue()) != null && !this.hasExpired(node, this.expirationTicker().read())) {
         writeTime[0] = node.getWriteTime();
         return value;
      } else {
         return null;
      }
   }

   @Override
   public Map<K, V> getAllPresent(Iterable<?> keys) {
      Set<Object> uniqueKeys = new LinkedHashSet<>();

      for (Object key : keys) {
         uniqueKeys.add(key);
      }

      int misses = 0;
      long now = this.expirationTicker().read();
      Map<Object, Object> result = new LinkedHashMap<>(uniqueKeys.size());

      for (Object key : uniqueKeys) {
         Node<K, V> node = this.data.get(this.nodeFactory.newLookupKey(key));
         V value;
         if (node != null && (value = node.getValue()) != null && !this.hasExpired(node, now)) {
            result.put(key, value);
            if (!this.isComputingAsync(node)) {
               K castedKey = (K)key;
               this.tryExpireAfterRead(node, castedKey, value, this.expiry(), now);
               this.setAccessTime(node, now);
            }

            this.afterRead(node, now, false);
         } else {
            misses++;
         }
      }

      this.statsCounter().recordMisses(misses);
      this.statsCounter().recordHits(result.size());
      Map<K, V> castedResult = (Map<K, V>)result;
      return Collections.unmodifiableMap(castedResult);
   }

   @Override
   public @Nullable V put(K key, V value) {
      return this.put(key, value, this.expiry(), true, false);
   }

   @Override
   public @Nullable V put(K key, V value, boolean notifyWriter) {
      return this.put(key, value, this.expiry(), notifyWriter, false);
   }

   @Override
   public @Nullable V putIfAbsent(K key, V value) {
      return this.put(key, value, this.expiry(), true, true);
   }

   @Nullable V put(K key, V value, Expiry<K, V> expiry, boolean notifyWriter, boolean onlyIfAbsent) {
      Objects.requireNonNull(key);
      Node<K, V> node = null;
      long now = this.expirationTicker().read();
      int newWeight = this.weigher.weigh(key, value);

      Node<K, V> prior;
      int oldWeight;
      boolean expired;
      boolean mayUpdate;
      boolean exceedsTolerance;
      V oldValue;
      while (true) {
         prior = this.data.get(this.nodeFactory.newLookupKey(key));
         if (prior == null) {
            if (node == null) {
               node = this.nodeFactory.newNode(key, this.keyReferenceQueue(), value, this.valueReferenceQueue(), newWeight, now);
               this.setVariableTime(node, this.expireAfterCreate(key, value, expiry, now));
            }

            if (notifyWriter && this.hasWriter()) {
               oldValue = (V)node;
               prior = (Node<K, V>)this.data.computeIfAbsent(node.getKeyReference(), k -> {
                  this.writer.write(key, value);
                  return oldValue;
               });
               if (prior == node) {
                  this.afterWrite(new BoundedLocalCache.AddTask(node, newWeight));
                  return null;
               }
            } else {
               prior = this.data.putIfAbsent(node.getKeyReference(), node);
               if (prior == null) {
                  this.afterWrite(new BoundedLocalCache.AddTask(node, newWeight));
                  return null;
               }
            }
         } else if (onlyIfAbsent) {
            oldValue = prior.getValue();
            if (oldValue != null && !this.hasExpired(prior, now)) {
               if (!this.isComputingAsync(prior)) {
                  this.tryExpireAfterRead(prior, key, oldValue, this.expiry(), now);
                  this.setAccessTime(prior, now);
               }

               this.afterRead(prior, now, false);
               return oldValue;
            }
         }

         expired = false;
         mayUpdate = true;
         exceedsTolerance = false;
         synchronized (prior) {
            if (prior.isAlive()) {
               oldValue = prior.getValue();
               oldWeight = prior.getWeight();
               long varTime;
               if (oldValue == null) {
                  varTime = this.expireAfterCreate(key, value, expiry, now);
                  this.writer.delete(key, null, RemovalCause.COLLECTED);
               } else if (this.hasExpired(prior, now)) {
                  expired = true;
                  varTime = this.expireAfterCreate(key, value, expiry, now);
                  this.writer.delete(key, oldValue, RemovalCause.EXPIRED);
               } else if (onlyIfAbsent) {
                  mayUpdate = false;
                  varTime = this.expireAfterRead(prior, key, value, expiry, now);
               } else {
                  varTime = this.expireAfterUpdate(prior, key, value, expiry, now);
               }

               if (notifyWriter && (expired || mayUpdate && value != oldValue)) {
                  this.writer.write(key, value);
               }

               if (mayUpdate) {
                  exceedsTolerance = this.expiresAfterWrite() && now - prior.getWriteTime() > EXPIRE_WRITE_TOLERANCE
                     || this.expiresVariable() && Math.abs(varTime - prior.getVariableTime()) > EXPIRE_WRITE_TOLERANCE;
                  this.setWriteTime(prior, now);
                  prior.setWeight(newWeight);
                  prior.setValue(value, this.valueReferenceQueue());
               }

               this.setVariableTime(prior, varTime);
               this.setAccessTime(prior, now);
               break;
            }
         }
      }

      if (this.hasRemovalListener()) {
         if (expired) {
            this.notifyRemoval(key, oldValue, RemovalCause.EXPIRED);
         } else if (oldValue == null) {
            this.notifyRemoval(key, null, RemovalCause.COLLECTED);
         } else if (mayUpdate && value != oldValue) {
            this.notifyRemoval(key, oldValue, RemovalCause.REPLACED);
         }
      }

      int weightedDifference = mayUpdate ? newWeight - oldWeight : 0;
      if (oldValue == null || weightedDifference != 0 || expired) {
         this.afterWrite(new BoundedLocalCache.UpdateTask(prior, weightedDifference));
      } else if (!onlyIfAbsent && exceedsTolerance) {
         this.afterWrite(new BoundedLocalCache.UpdateTask(prior, weightedDifference));
      } else {
         if (mayUpdate) {
            this.setWriteTime(prior, now);
         }

         this.afterRead(prior, now, false);
      }

      return expired ? null : oldValue;
   }

   @Override
   public @Nullable V remove(Object key) {
      K castKey = (K)key;
      Node<K, V>[] node = new Node[1];
      V[] oldValue = (V[])(new Object[1]);
      RemovalCause[] cause = new RemovalCause[1];
      this.data.computeIfPresent(this.nodeFactory.newLookupKey(key), (k, n) -> {
         synchronized (n) {
            oldValue[0] = n.getValue();
            if (oldValue[0] == null) {
               cause[0] = RemovalCause.COLLECTED;
            } else if (this.hasExpired((Node<K, V>)n, this.expirationTicker().read())) {
               cause[0] = RemovalCause.EXPIRED;
            } else {
               cause[0] = RemovalCause.EXPLICIT;
            }

            this.writer.delete(castKey, oldValue[0], cause[0]);
            n.retire();
         }

         node[0] = (Node<K, V>)n;
         return null;
      });
      if (cause[0] != null) {
         this.afterWrite(new BoundedLocalCache.RemovalTask(node[0]));
         if (this.hasRemovalListener()) {
            this.notifyRemoval(castKey, oldValue[0], cause[0]);
         }
      }

      return cause[0] == RemovalCause.EXPLICIT ? oldValue[0] : null;
   }

   @Override
   public boolean remove(Object key, Object value) {
      Objects.requireNonNull(key);
      if (value == null) {
         return false;
      }

      Node<K, V>[] removed = new Node[1];
      K[] oldKey = (K[])(new Object[1]);
      V[] oldValue = (V[])(new Object[1]);
      RemovalCause[] cause = new RemovalCause[1];
      this.data.computeIfPresent(this.nodeFactory.newLookupKey(key), (kR, node) -> {
         synchronized (node) {
            oldKey[0] = node.getKey();
            oldValue[0] = node.getValue();
            if (oldKey[0] == null) {
               cause[0] = RemovalCause.COLLECTED;
            } else if (this.hasExpired((Node<K, V>)node, this.expirationTicker().read())) {
               cause[0] = RemovalCause.EXPIRED;
            } else {
               if (!node.containsValue(value)) {
                  return node;
               }

               cause[0] = RemovalCause.EXPLICIT;
            }

            this.writer.delete(oldKey[0], oldValue[0], cause[0]);
            removed[0] = (Node<K, V>)node;
            node.retire();
            return null;
         }
      });
      if (removed[0] == null) {
         return false;
      }

      if (this.hasRemovalListener()) {
         this.notifyRemoval(oldKey[0], oldValue[0], cause[0]);
      }

      this.afterWrite(new BoundedLocalCache.RemovalTask(removed[0]));
      return cause[0] == RemovalCause.EXPLICIT;
   }

   @Override
   public @Nullable V replace(K key, V value) {
      Objects.requireNonNull(key);
      int[] oldWeight = new int[1];
      K[] nodeKey = (K[])(new Object[1]);
      V[] oldValue = (V[])(new Object[1]);
      long[] now = new long[1];
      int weight = this.weigher.weigh(key, value);
      Node<K, V> node = this.data.computeIfPresent(this.nodeFactory.newLookupKey(key), (k, n) -> {
         synchronized (n) {
            nodeKey[0] = n.getKey();
            oldValue[0] = n.getValue();
            oldWeight[0] = n.getWeight();
            if (nodeKey[0] != null && oldValue[0] != null && !this.hasExpired((Node<K, V>)n, now[0] = this.expirationTicker().read())) {
               long varTime = this.expireAfterUpdate((Node<K, V>)n, key, value, this.expiry(), now[0]);
               if (value != oldValue[0]) {
                  this.writer.write(nodeKey[0], value);
               }

               n.setValue(value, this.valueReferenceQueue());
               n.setWeight(weight);
               this.setVariableTime((Node<K, V>)n, varTime);
               this.setAccessTime((Node<K, V>)n, now[0]);
               this.setWriteTime((Node<K, V>)n, now[0]);
               return n;
            } else {
               oldValue[0] = null;
               return n;
            }
         }
      });
      if (oldValue[0] == null) {
         return null;
      }

      int weightedDifference = weight - oldWeight[0];
      if (!this.expiresAfterWrite() && weightedDifference == 0) {
         this.afterRead(node, now[0], false);
      } else {
         this.afterWrite(new BoundedLocalCache.UpdateTask(node, weightedDifference));
      }

      if (this.hasRemovalListener() && value != oldValue[0]) {
         this.notifyRemoval(nodeKey[0], oldValue[0], RemovalCause.REPLACED);
      }

      return oldValue[0];
   }

   @Override
   public boolean replace(K key, V oldValue, V newValue) {
      Objects.requireNonNull(key);
      Objects.requireNonNull(oldValue);
      Objects.requireNonNull(newValue);
      int weight = this.weigher.weigh(key, newValue);
      boolean[] replaced = new boolean[1];
      K[] nodeKey = (K[])(new Object[1]);
      V[] prevValue = (V[])(new Object[1]);
      int[] oldWeight = new int[1];
      long[] now = new long[1];
      Node<K, V> node = this.data
         .computeIfPresent(
            this.nodeFactory.newLookupKey(key),
            (k, n) -> {
               synchronized (n) {
                  nodeKey[0] = n.getKey();
                  prevValue[0] = n.getValue();
                  oldWeight[0] = n.getWeight();
                  if (nodeKey[0] != null
                     && prevValue[0] != null
                     && n.containsValue(oldValue)
                     && !this.hasExpired((Node<K, V>)n, now[0] = this.expirationTicker().read())) {
                     long varTime = this.expireAfterUpdate((Node<K, V>)n, key, newValue, this.expiry(), now[0]);
                     if (newValue != prevValue[0]) {
                        this.writer.write(key, newValue);
                     }

                     n.setValue(newValue, this.valueReferenceQueue());
                     n.setWeight(weight);
                     this.setVariableTime((Node<K, V>)n, varTime);
                     this.setAccessTime((Node<K, V>)n, now[0]);
                     this.setWriteTime((Node<K, V>)n, now[0]);
                     replaced[0] = true;
                     return n;
                  } else {
                     return n;
                  }
               }
            }
         );
      if (!replaced[0]) {
         return false;
      }

      int weightedDifference = weight - oldWeight[0];
      if (!this.expiresAfterWrite() && weightedDifference == 0) {
         this.afterRead(node, now[0], false);
      } else {
         this.afterWrite(new BoundedLocalCache.UpdateTask(node, weightedDifference));
      }

      if (this.hasRemovalListener() && oldValue != newValue) {
         this.notifyRemoval(nodeKey[0], prevValue[0], RemovalCause.REPLACED);
      }

      return true;
   }

   @Override
   public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
      Objects.requireNonNull(function);
      BiFunction<K, V, V> remappingFunction = (keyx, oldValue) -> {
         V newValue = Objects.requireNonNull((V)function.apply((K)keyx, oldValue));
         if (oldValue != newValue) {
            this.writer.write((K)keyx, newValue);
         }

         return newValue;
      };

      for (K key : this.keySet()) {
         long[] now = new long[]{this.expirationTicker().read()};
         Object lookupKey = this.nodeFactory.newLookupKey(key);
         this.remap(key, lookupKey, remappingFunction, now, false);
      }
   }

   @Override
   public @Nullable V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction, boolean recordStats, boolean recordLoad) {
      Objects.requireNonNull(key);
      Objects.requireNonNull(mappingFunction);
      long now = this.expirationTicker().read();
      Node<K, V> node = this.data.get(this.nodeFactory.newLookupKey(key));
      if (node != null) {
         V value = node.getValue();
         if (value != null && !this.hasExpired(node, now)) {
            if (!this.isComputingAsync(node)) {
               this.tryExpireAfterRead(node, key, value, this.expiry(), now);
               this.setAccessTime(node, now);
            }

            this.afterRead(node, now, recordStats);
            return value;
         }
      }

      if (recordStats) {
         mappingFunction = this.statsAware(mappingFunction, recordLoad);
      }

      Object keyRef = this.nodeFactory.newReferenceKey(key, this.keyReferenceQueue());
      return this.doComputeIfAbsent(key, keyRef, mappingFunction, new long[]{now}, recordStats);
   }

   @Nullable V doComputeIfAbsent(K key, Object keyRef, Function<? super K, ? extends V> mappingFunction, long[] now, boolean recordStats) {
      V[] oldValue = (V[])(new Object[1]);
      V[] newValue = (V[])(new Object[1]);
      K[] nodeKey = (K[])(new Object[1]);
      Node<K, V>[] removed = new Node[1];
      int[] weight = new int[2];
      RemovalCause[] cause = new RemovalCause[1];
      Node<K, V> node = this.data.compute(keyRef, (k, n) -> {
         if (n == null) {
            newValue[0] = (V)mappingFunction.apply(key);
            if (newValue[0] == null) {
               return null;
            }

            now[0] = this.expirationTicker().read();
            weight[1] = this.weigher.weigh(key, newValue[0]);
            n = this.nodeFactory.newNode(key, this.keyReferenceQueue(), newValue[0], this.valueReferenceQueue(), weight[1], now[0]);
            this.setVariableTime(n, this.expireAfterCreate(key, newValue[0], this.expiry(), now[0]));
            return n;
         } else {
            synchronized (n) {
               nodeKey[0] = n.getKey();
               weight[0] = n.getWeight();
               oldValue[0] = n.getValue();
               if (nodeKey[0] != null && oldValue[0] != null) {
                  if (!this.hasExpired((Node<K, V>)n, now[0])) {
                     return n;
                  }

                  cause[0] = RemovalCause.EXPIRED;
               } else {
                  cause[0] = RemovalCause.COLLECTED;
               }

               this.writer.delete(nodeKey[0], oldValue[0], cause[0]);
               newValue[0] = (V)mappingFunction.apply(key);
               if (newValue[0] == null) {
                  removed[0] = (Node<K, V>)n;
                  n.retire();
                  return null;
               } else {
                  weight[1] = this.weigher.weigh(key, newValue[0]);
                  n.setValue(newValue[0], this.valueReferenceQueue());
                  n.setWeight(weight[1]);
                  now[0] = this.expirationTicker().read();
                  this.setVariableTime((Node<K, V>)n, this.expireAfterCreate(key, newValue[0], this.expiry(), now[0]));
                  this.setAccessTime((Node<K, V>)n, now[0]);
                  this.setWriteTime((Node<K, V>)n, now[0]);
                  return n;
               }
            }
         }
      });
      if (node == null) {
         if (removed[0] != null) {
            this.afterWrite(new BoundedLocalCache.RemovalTask(removed[0]));
         }

         return null;
      } else {
         if (cause[0] != null) {
            if (this.hasRemovalListener()) {
               this.notifyRemoval(nodeKey[0], oldValue[0], cause[0]);
            }

            this.statsCounter().recordEviction(weight[0], cause[0]);
         }

         if (newValue[0] == null) {
            if (!this.isComputingAsync(node)) {
               this.tryExpireAfterRead(node, key, oldValue[0], this.expiry(), now[0]);
               this.setAccessTime(node, now[0]);
            }

            this.afterRead(node, now[0], recordStats);
            return oldValue[0];
         } else {
            if (oldValue[0] == null && cause[0] == null) {
               this.afterWrite(new BoundedLocalCache.AddTask(node, weight[1]));
            } else {
               int weightedDifference = weight[1] - weight[0];
               this.afterWrite(new BoundedLocalCache.UpdateTask(node, weightedDifference));
            }

            return newValue[0];
         }
      }
   }

   @Override
   public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
      Objects.requireNonNull(key);
      Objects.requireNonNull(remappingFunction);
      Object lookupKey = this.nodeFactory.newLookupKey(key);
      Node<K, V> node = this.data.get(lookupKey);
      if (node == null) {
         return null;
      } else {
         long now;
         if (node.getValue() != null && !this.hasExpired(node, now = this.expirationTicker().read())) {
            BiFunction<? super K, ? super V, ? extends V> statsAwareRemappingFunction = this.statsAware(remappingFunction, false, true, true);
            return this.remap(key, lookupKey, statsAwareRemappingFunction, new long[]{now}, false);
         } else {
            this.scheduleDrainBuffers();
            return null;
         }
      }
   }

   @Override
   public @Nullable V compute(
      K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction, boolean recordMiss, boolean recordLoad, boolean recordLoadFailure
   ) {
      Objects.requireNonNull(key);
      long[] now = new long[]{this.expirationTicker().read()};
      Object keyRef = this.nodeFactory.newReferenceKey(key, this.keyReferenceQueue());
      BiFunction<? super K, ? super V, ? extends V> statsAwareRemappingFunction = this.statsAware(remappingFunction, recordMiss, recordLoad, recordLoadFailure);
      return this.remap(key, keyRef, statsAwareRemappingFunction, now, true);
   }

   @Override
   public @Nullable V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
      Objects.requireNonNull(key);
      Objects.requireNonNull(value);
      long[] now = new long[]{this.expirationTicker().read()};
      Object keyRef = this.nodeFactory.newReferenceKey(key, this.keyReferenceQueue());
      BiFunction<? super K, ? super V, ? extends V> mergeFunction = (k, oldValue) -> oldValue == null
         ? value
         : this.statsAware(remappingFunction).apply(oldValue, value);
      return this.remap(key, keyRef, mergeFunction, now, true);
   }

   @Nullable V remap(K key, Object keyRef, BiFunction<? super K, ? super V, ? extends V> remappingFunction, long[] now, boolean computeIfAbsent) {
      K[] nodeKey = (K[])(new Object[1]);
      V[] oldValue = (V[])(new Object[1]);
      V[] newValue = (V[])(new Object[1]);
      Node<K, V>[] removed = new Node[1];
      int[] weight = new int[2];
      RemovalCause[] cause = new RemovalCause[1];
      Node<K, V> node = this.data.compute(keyRef, (kr, n) -> {
         if (n == null) {
            if (!computeIfAbsent) {
               return null;
            }

            newValue[0] = (V)remappingFunction.apply(key, null);
            if (newValue[0] == null) {
               return null;
            }

            now[0] = this.expirationTicker().read();
            weight[1] = this.weigher.weigh(key, newValue[0]);
            n = this.nodeFactory.newNode(keyRef, newValue[0], this.valueReferenceQueue(), weight[1], now[0]);
            this.setVariableTime(n, this.expireAfterCreate(key, newValue[0], this.expiry(), now[0]));
            return n;
         } else {
            synchronized (n) {
               nodeKey[0] = n.getKey();
               oldValue[0] = n.getValue();
               if (nodeKey[0] == null || oldValue[0] == null) {
                  cause[0] = RemovalCause.COLLECTED;
               } else if (this.hasExpired((Node<K, V>)n, now[0])) {
                  cause[0] = RemovalCause.EXPIRED;
               }

               if (cause[0] != null) {
                  this.writer.delete(nodeKey[0], oldValue[0], cause[0]);
                  if (!computeIfAbsent) {
                     removed[0] = (Node<K, V>)n;
                     n.retire();
                     return null;
                  }
               }

               newValue[0] = (V)remappingFunction.apply(nodeKey[0], cause[0] == null ? oldValue[0] : null);
               if (newValue[0] == null) {
                  if (cause[0] == null) {
                     cause[0] = RemovalCause.EXPLICIT;
                  }

                  removed[0] = (Node<K, V>)n;
                  n.retire();
                  return null;
               } else {
                  weight[0] = n.getWeight();
                  weight[1] = this.weigher.weigh(key, newValue[0]);
                  now[0] = this.expirationTicker().read();
                  if (cause[0] == null) {
                     if (newValue[0] != oldValue[0]) {
                        cause[0] = RemovalCause.REPLACED;
                     }

                     this.setVariableTime((Node<K, V>)n, this.expireAfterUpdate((Node<K, V>)n, key, newValue[0], this.expiry(), now[0]));
                  } else {
                     this.setVariableTime((Node<K, V>)n, this.expireAfterCreate(key, newValue[0], this.expiry(), now[0]));
                  }

                  n.setValue(newValue[0], this.valueReferenceQueue());
                  n.setWeight(weight[1]);
                  this.setAccessTime((Node<K, V>)n, now[0]);
                  this.setWriteTime((Node<K, V>)n, now[0]);
                  return n;
               }
            }
         }
      });
      if (cause[0] != null) {
         if (cause[0].wasEvicted()) {
            this.statsCounter().recordEviction(weight[0], cause[0]);
         }

         if (this.hasRemovalListener()) {
            this.notifyRemoval(nodeKey[0], oldValue[0], cause[0]);
         }
      }

      if (removed[0] != null) {
         this.afterWrite(new BoundedLocalCache.RemovalTask(removed[0]));
      } else if (node != null) {
         if (oldValue[0] == null && cause[0] == null) {
            this.afterWrite(new BoundedLocalCache.AddTask(node, weight[1]));
         } else {
            int weightedDifference = weight[1] - weight[0];
            if (!this.expiresAfterWrite() && weightedDifference == 0) {
               if (cause[0] == null) {
                  if (!this.isComputingAsync(node)) {
                     this.tryExpireAfterRead(node, key, newValue[0], this.expiry(), now[0]);
                     this.setAccessTime(node, now[0]);
                  }
               } else if (cause[0] == RemovalCause.COLLECTED) {
                  this.scheduleDrainBuffers();
               }

               this.afterRead(node, now[0], false);
            } else {
               this.afterWrite(new BoundedLocalCache.UpdateTask(node, weightedDifference));
            }
         }
      }

      return newValue[0];
   }

   @Override
   public Set<K> keySet() {
      Set<K> ks = this.keySet;
      return ks == null ? (this.keySet = new BoundedLocalCache.KeySetView<>(this)) : ks;
   }

   @Override
   public Collection<V> values() {
      Collection<V> vs = this.values;
      return vs == null ? (this.values = new BoundedLocalCache.ValuesView<>(this)) : vs;
   }

   @Override
   public Set<Entry<K, V>> entrySet() {
      Set<Entry<K, V>> es = this.entrySet;
      return es == null ? (this.entrySet = new BoundedLocalCache.EntrySetView<>(this)) : es;
   }

   Map<K, V> evictionOrder(int limit, Function<V, V> transformer, boolean hottest) {
      Supplier<Iterator<Node<K, V>>> iteratorSupplier = () -> {
         Comparator<Node<K, V>> comparator = Comparator.comparingInt(node -> {
            K key = node.getKey();
            return key == null ? 0 : this.frequencySketch().frequency(key);
         });
         if (hottest) {
            LinkedDeque.PeekingIterator<Node<K, V>> secondary = LinkedDeque.PeekingIterator.comparing(
               this.accessOrderProbationDeque().descendingIterator(), this.accessOrderWindowDeque().descendingIterator(), comparator
            );
            return LinkedDeque.PeekingIterator.concat(this.accessOrderProtectedDeque().descendingIterator(), secondary);
         } else {
            LinkedDeque.PeekingIterator<Node<K, V>> primary = LinkedDeque.PeekingIterator.comparing(
               this.accessOrderWindowDeque().iterator(), this.accessOrderProbationDeque().iterator(), comparator.reversed()
            );
            return LinkedDeque.PeekingIterator.concat(primary, this.accessOrderProtectedDeque().iterator());
         }
      };
      return this.fixedSnapshot(iteratorSupplier, limit, transformer);
   }

   Map<K, V> expireAfterAccessOrder(int limit, Function<V, V> transformer, boolean oldest) {
      if (!this.evicts()) {
         Supplier<Iterator<Node<K, V>>> iteratorSupplier = () -> oldest
            ? this.accessOrderWindowDeque().iterator()
            : this.accessOrderWindowDeque().descendingIterator();
         return this.fixedSnapshot(iteratorSupplier, limit, transformer);
      } else {
         Supplier<Iterator<Node<K, V>>> iteratorSupplier = () -> {
            Comparator<Node<K, V>> comparator = Comparator.comparingLong(Node::getAccessTime);
            LinkedDeque.PeekingIterator<Node<K, V>> first;
            LinkedDeque.PeekingIterator<Node<K, V>> second;
            LinkedDeque.PeekingIterator<Node<K, V>> third;
            if (oldest) {
               first = this.accessOrderWindowDeque().iterator();
               second = this.accessOrderProbationDeque().iterator();
               third = this.accessOrderProtectedDeque().iterator();
            } else {
               comparator = comparator.reversed();
               first = this.accessOrderWindowDeque().descendingIterator();
               second = this.accessOrderProbationDeque().descendingIterator();
               third = this.accessOrderProtectedDeque().descendingIterator();
            }

            return LinkedDeque.PeekingIterator.comparing(LinkedDeque.PeekingIterator.comparing(first, second, comparator), third, comparator);
         };
         return this.fixedSnapshot(iteratorSupplier, limit, transformer);
      }
   }

   Map<K, V> expireAfterWriteOrder(int limit, Function<V, V> transformer, boolean oldest) {
      Supplier<Iterator<Node<K, V>>> iteratorSupplier = () -> oldest ? this.writeOrderDeque().iterator() : this.writeOrderDeque().descendingIterator();
      return this.fixedSnapshot(iteratorSupplier, limit, transformer);
   }

   Map<K, V> fixedSnapshot(Supplier<Iterator<Node<K, V>>> iteratorSupplier, int limit, Function<V, V> transformer) {
      Caffeine.requireArgument(limit >= 0);
      this.evictionLock.lock();

      try {
         this.maintenance(null);
         int initialCapacity = Math.min(limit, this.size());
         Iterator<Node<K, V>> iterator = iteratorSupplier.get();
         Map<K, V> map = new LinkedHashMap<>(initialCapacity);

         while (map.size() < limit && iterator.hasNext()) {
            Node<K, V> node = iterator.next();
            K key = node.getKey();
            V value = transformer.apply(node.getValue());
            if (key != null && value != null && node.isAlive()) {
               map.put(key, value);
            }
         }

         return Collections.unmodifiableMap(map);
      } finally {
         this.evictionLock.unlock();
      }
   }

   Map<K, V> variableSnapshot(boolean ascending, int limit, Function<V, V> transformer) {
      this.evictionLock.lock();

      try {
         this.maintenance(null);
         return this.timerWheel().snapshot(ascending, limit, transformer);
      } finally {
         this.evictionLock.unlock();
      }
   }

   static <K, V> SerializationProxy<K, V> makeSerializationProxy(BoundedLocalCache<?, ?> cache, boolean isWeighted) {
      SerializationProxy<K, V> proxy = new SerializationProxy<>();
      proxy.weakKeys = cache.collectKeys();
      proxy.weakValues = cache.nodeFactory.weakValues();
      proxy.softValues = cache.nodeFactory.softValues();
      proxy.isRecordingStats = cache.isRecordingStats();
      proxy.removalListener = cache.removalListener();
      proxy.ticker = cache.expirationTicker();
      proxy.writer = cache.writer;
      if (cache.expiresAfterAccess()) {
         proxy.expiresAfterAccessNanos = cache.expiresAfterAccessNanos();
      }

      if (cache.expiresAfterWrite()) {
         proxy.expiresAfterWriteNanos = cache.expiresAfterWriteNanos();
      }

      if (cache.expiresVariable()) {
         proxy.expiry = cache.expiry();
      }

      if (cache.evicts()) {
         if (isWeighted) {
            proxy.weigher = cache.weigher;
            proxy.maximumWeight = cache.maximum();
         } else {
            proxy.maximumSize = cache.maximum();
         }
      }

      return proxy;
   }

   final class AddTask implements Runnable {
      final Node<K, V> node;
      final int weight;

      AddTask(Node<K, V> node, int weight) {
         this.weight = weight;
         this.node = node;
      }

      @GuardedBy("evictionLock")
      @Override
      public void run() {
         if (BoundedLocalCache.this.evicts()) {
            long weightedSize = BoundedLocalCache.this.weightedSize();
            BoundedLocalCache.this.setWeightedSize(weightedSize + this.weight);
            BoundedLocalCache.this.setWindowWeightedSize(BoundedLocalCache.this.windowWeightedSize() + this.weight);
            this.node.setPolicyWeight(this.node.getPolicyWeight() + this.weight);
            long maximum = BoundedLocalCache.this.maximum();
            if (weightedSize >= maximum >>> 1) {
               long capacity = BoundedLocalCache.this.isWeighted() ? BoundedLocalCache.this.data.mappingCount() : maximum;
               BoundedLocalCache.this.frequencySketch().ensureCapacity(capacity);
            }

            K key = this.node.getKey();
            if (key != null) {
               BoundedLocalCache.this.frequencySketch().increment(key);
            }

            BoundedLocalCache.this.setMissesInSample(BoundedLocalCache.this.missesInSample() + 1);
         }

         boolean isAlive;
         synchronized (this.node) {
            isAlive = this.node.isAlive();
         }

         if (isAlive) {
            if (BoundedLocalCache.this.expiresAfterWrite()) {
               BoundedLocalCache.this.writeOrderDeque().add(this.node);
            }

            if (BoundedLocalCache.this.evicts() || BoundedLocalCache.this.expiresAfterAccess()) {
               BoundedLocalCache.this.accessOrderWindowDeque().add(this.node);
            }

            if (BoundedLocalCache.this.expiresVariable()) {
               BoundedLocalCache.this.timerWheel().schedule(this.node);
            }
         }

         if (BoundedLocalCache.this.isComputingAsync(this.node)) {
            synchronized (this.node) {
               if (!Async.isReady((CompletableFuture<?>)this.node.getValue())) {
                  long expirationTime = BoundedLocalCache.this.expirationTicker().read() + 6917529027641081854L;
                  BoundedLocalCache.this.setVariableTime(this.node, expirationTime);
                  BoundedLocalCache.this.setAccessTime(this.node, expirationTime);
                  BoundedLocalCache.this.setWriteTime(this.node, expirationTime);
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

      BoundedLocalAsyncCache(Caffeine<K, V> builder) {
         this.cache = LocalCacheFactory.newBoundedLocalCache(builder, null, true);
         this.isWeighted = builder.isWeighted();
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
            BoundedLocalCache<K, V> castCache = this.cache;
            Function<CompletableFuture<V>, V> transformer = Async::getIfReady;
            Function<V, V> castTransformer = transformer;
            this.policy = new BoundedLocalCache.BoundedPolicy<>(castCache, castTransformer, this.isWeighted);
         }

         return this.policy;
      }

      private void readObject(ObjectInputStream stream) throws InvalidObjectException {
         throw new InvalidObjectException("Proxy required");
      }

      Object writeReplace() {
         SerializationProxy<K, V> proxy = BoundedLocalCache.makeSerializationProxy(this.cache, this.isWeighted);
         if (this.cache.refreshAfterWrite()) {
            proxy.refreshAfterWriteNanos = this.cache.refreshAfterWriteNanos();
         }

         proxy.async = true;
         return proxy;
      }
   }

   static final class BoundedLocalAsyncLoadingCache<K, V> extends LocalAsyncLoadingCache<K, V> implements Serializable {
      private static final long serialVersionUID = 1L;
      final BoundedLocalCache<K, CompletableFuture<V>> cache;
      final boolean isWeighted;
      @Nullable ConcurrentMap<K, CompletableFuture<V>> mapView;
      @Nullable Policy<K, V> policy;

      BoundedLocalAsyncLoadingCache(Caffeine<K, V> builder, AsyncCacheLoader<? super K, V> loader) {
         super(loader);
         this.isWeighted = builder.isWeighted();
         this.cache = LocalCacheFactory.newBoundedLocalCache(builder, new BoundedLocalCache.BoundedLocalAsyncLoadingCache.AsyncLoader<>(loader, builder), true);
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
            BoundedLocalCache<K, V> castCache = this.cache;
            Function<CompletableFuture<V>, V> transformer = Async::getIfReady;
            Function<V, V> castTransformer = transformer;
            this.policy = new BoundedLocalCache.BoundedPolicy<>(castCache, castTransformer, this.isWeighted);
         }

         return this.policy;
      }

      private void readObject(ObjectInputStream stream) throws InvalidObjectException {
         throw new InvalidObjectException("Proxy required");
      }

      Object writeReplace() {
         SerializationProxy<K, V> proxy = BoundedLocalCache.makeSerializationProxy(this.cache, this.isWeighted);
         if (this.cache.refreshAfterWrite()) {
            proxy.refreshAfterWriteNanos = this.cache.refreshAfterWriteNanos();
         }

         proxy.loader = this.loader;
         proxy.async = true;
         return proxy;
      }

      static final class AsyncLoader<K, V> implements CacheLoader<K, V> {
         final AsyncCacheLoader<? super K, V> loader;
         final Executor executor;

         AsyncLoader(AsyncCacheLoader<? super K, V> loader, Caffeine<?, ?> builder) {
            this.executor = Objects.requireNonNull(builder.getExecutor());
            this.loader = Objects.requireNonNull(loader);
         }

         @Override
         public V load(K key) {
            return (V)this.loader.asyncLoad(key, this.executor);
         }

         @Override
         public V reload(K key, V oldValue) {
            return (V)this.loader.asyncReload(key, oldValue, this.executor);
         }

         @Override
         public CompletableFuture<V> asyncReload(K key, V oldValue, Executor executor) {
            return this.loader.asyncReload(key, oldValue, executor);
         }
      }
   }

   static final class BoundedLocalLoadingCache<K, V> extends BoundedLocalCache.BoundedLocalManualCache<K, V> implements LocalLoadingCache<K, V> {
      private static final long serialVersionUID = 1L;
      final Function<K, V> mappingFunction;
      final @Nullable Function<Iterable<? extends K>, Map<K, V>> bulkMappingFunction;

      BoundedLocalLoadingCache(Caffeine<K, V> builder, CacheLoader<? super K, V> loader) {
         super(builder, loader);
         Objects.requireNonNull(loader);
         this.mappingFunction = LocalLoadingCache.newMappingFunction(loader);
         this.bulkMappingFunction = LocalLoadingCache.newBulkMappingFunction(loader);
      }

      @Override
      public CacheLoader<? super K, V> cacheLoader() {
         return this.cache.cacheLoader;
      }

      @Override
      public Function<K, V> mappingFunction() {
         return this.mappingFunction;
      }

      @Override
      public @Nullable Function<Iterable<? extends K>, Map<K, V>> bulkMappingFunction() {
         return this.bulkMappingFunction;
      }

      private void readObject(ObjectInputStream stream) throws InvalidObjectException {
         throw new InvalidObjectException("Proxy required");
      }

      @Override
      Object writeReplace() {
         SerializationProxy<K, V> proxy = (SerializationProxy<K, V>)super.writeReplace();
         if (this.cache.refreshAfterWrite()) {
            proxy.refreshAfterWriteNanos = this.cache.refreshAfterWriteNanos();
         }

         proxy.loader = this.cache.cacheLoader;
         return proxy;
      }
   }

   static class BoundedLocalManualCache<K, V> implements LocalManualCache<K, V>, Serializable {
      private static final long serialVersionUID = 1L;
      final BoundedLocalCache<K, V> cache;
      final boolean isWeighted;
      @Nullable Policy<K, V> policy;

      BoundedLocalManualCache(Caffeine<K, V> builder) {
         this(builder, null);
      }

      BoundedLocalManualCache(Caffeine<K, V> builder, @Nullable CacheLoader<? super K, V> loader) {
         this.cache = LocalCacheFactory.newBoundedLocalCache(builder, loader, false);
         this.isWeighted = builder.isWeighted();
      }

      public BoundedLocalCache<K, V> cache() {
         return this.cache;
      }

      @Override
      public Policy<K, V> policy() {
         return this.policy == null ? (this.policy = new BoundedLocalCache.BoundedPolicy<>(this.cache, Function.identity(), this.isWeighted)) : this.policy;
      }

      private void readObject(ObjectInputStream stream) throws InvalidObjectException {
         throw new InvalidObjectException("Proxy required");
      }

      Object writeReplace() {
         return BoundedLocalCache.makeSerializationProxy(this.cache, this.isWeighted);
      }
   }

   static final class BoundedPolicy<K, V> implements Policy<K, V> {
      final BoundedLocalCache<K, V> cache;
      final Function<V, V> transformer;
      final boolean isWeighted;
      @Nullable Optional<Policy.Eviction<K, V>> eviction;
      @Nullable Optional<Policy.Expiration<K, V>> refreshes;
      @Nullable Optional<Policy.Expiration<K, V>> afterWrite;
      @Nullable Optional<Policy.Expiration<K, V>> afterAccess;
      @Nullable Optional<Policy.VarExpiration<K, V>> variable;

      BoundedPolicy(BoundedLocalCache<K, V> cache, Function<V, V> transformer, boolean isWeighted) {
         this.transformer = transformer;
         this.isWeighted = isWeighted;
         this.cache = cache;
      }

      @Override
      public boolean isRecordingStats() {
         return this.cache.isRecordingStats();
      }

      @Override
      public @Nullable V getIfPresentQuietly(Object key) {
         Node<K, V> node = this.cache.data.get(this.cache.nodeFactory.newLookupKey(key));
         return node != null && !this.cache.hasExpired(node, this.cache.expirationTicker().read()) ? this.transformer.apply(node.getValue()) : null;
      }

      @Override
      public Optional<Policy.Eviction<K, V>> eviction() {
         return this.cache.evicts()
            ? (this.eviction == null ? (this.eviction = Optional.of(new BoundedLocalCache.BoundedPolicy.BoundedEviction())) : this.eviction)
            : Optional.empty();
      }

      @Override
      public Optional<Policy.Expiration<K, V>> expireAfterAccess() {
         if (!this.cache.expiresAfterAccess()) {
            return Optional.empty();
         } else {
            return this.afterAccess == null
               ? (this.afterAccess = Optional.of(new BoundedLocalCache.BoundedPolicy.BoundedExpireAfterAccess()))
               : this.afterAccess;
         }
      }

      @Override
      public Optional<Policy.Expiration<K, V>> expireAfterWrite() {
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
      public Optional<Policy.Expiration<K, V>> refreshAfterWrite() {
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
         public OptionalInt weightOf(@NonNull K key) {
            Objects.requireNonNull(key);
            if (!BoundedPolicy.this.isWeighted) {
               return OptionalInt.empty();
            }

            Node<K, V> node = BoundedPolicy.this.cache.data.get(BoundedPolicy.this.cache.nodeFactory.newLookupKey(key));
            if (node == null) {
               return OptionalInt.empty();
            }

            synchronized (node) {
               return OptionalInt.of(node.getWeight());
            }
         }

         @Override
         public OptionalLong weightedSize() {
            if (BoundedPolicy.this.cache.evicts() && this.isWeighted()) {
               BoundedPolicy.this.cache.evictionLock.lock();

               try {
                  return OptionalLong.of(Math.max(0L, BoundedPolicy.this.cache.weightedSize()));
               } finally {
                  BoundedPolicy.this.cache.evictionLock.unlock();
               }
            } else {
               return OptionalLong.empty();
            }
         }

         @Override
         public long getMaximum() {
            BoundedPolicy.this.cache.evictionLock.lock();

            try {
               return BoundedPolicy.this.cache.maximum();
            } finally {
               BoundedPolicy.this.cache.evictionLock.unlock();
            }
         }

         @Override
         public void setMaximum(long maximum) {
            BoundedPolicy.this.cache.evictionLock.lock();

            try {
               BoundedPolicy.this.cache.setMaximumSize(maximum);
               BoundedPolicy.this.cache.maintenance(null);
            } finally {
               BoundedPolicy.this.cache.evictionLock.unlock();
            }
         }

         @Override
         public Map<K, V> coldest(int limit) {
            return BoundedPolicy.this.cache.evictionOrder(limit, BoundedPolicy.this.transformer, false);
         }

         @Override
         public Map<K, V> hottest(int limit) {
            return BoundedPolicy.this.cache.evictionOrder(limit, BoundedPolicy.this.transformer, true);
         }
      }

      final class BoundedExpireAfterAccess implements Policy.Expiration<K, V> {
         @Override
         public OptionalLong ageOf(K key, TimeUnit unit) {
            Objects.requireNonNull(key);
            Objects.requireNonNull(unit);
            Object lookupKey = BoundedPolicy.this.cache.nodeFactory.newLookupKey(key);
            Node<?, ?> node = BoundedPolicy.this.cache.data.get(lookupKey);
            if (node == null) {
               return OptionalLong.empty();
            }

            long age = BoundedPolicy.this.cache.expirationTicker().read() - node.getAccessTime();
            return age > BoundedPolicy.this.cache.expiresAfterAccessNanos() ? OptionalLong.empty() : OptionalLong.of(unit.convert(age, TimeUnit.NANOSECONDS));
         }

         @Override
         public long getExpiresAfter(TimeUnit unit) {
            return unit.convert(BoundedPolicy.this.cache.expiresAfterAccessNanos(), TimeUnit.NANOSECONDS);
         }

         @Override
         public void setExpiresAfter(long duration, TimeUnit unit) {
            Caffeine.requireArgument(duration >= 0L);
            BoundedPolicy.this.cache.setExpiresAfterAccessNanos(unit.toNanos(duration));
            BoundedPolicy.this.cache.scheduleAfterWrite();
         }

         @Override
         public Map<K, V> oldest(int limit) {
            return BoundedPolicy.this.cache.expireAfterAccessOrder(limit, BoundedPolicy.this.transformer, true);
         }

         @Override
         public Map<K, V> youngest(int limit) {
            return BoundedPolicy.this.cache.expireAfterAccessOrder(limit, BoundedPolicy.this.transformer, false);
         }
      }

      final class BoundedExpireAfterWrite implements Policy.Expiration<K, V> {
         @Override
         public OptionalLong ageOf(K key, TimeUnit unit) {
            Objects.requireNonNull(key);
            Objects.requireNonNull(unit);
            Object lookupKey = BoundedPolicy.this.cache.nodeFactory.newLookupKey(key);
            Node<?, ?> node = BoundedPolicy.this.cache.data.get(lookupKey);
            if (node == null) {
               return OptionalLong.empty();
            }

            long age = BoundedPolicy.this.cache.expirationTicker().read() - node.getWriteTime();
            return age > BoundedPolicy.this.cache.expiresAfterWriteNanos() ? OptionalLong.empty() : OptionalLong.of(unit.convert(age, TimeUnit.NANOSECONDS));
         }

         @Override
         public long getExpiresAfter(TimeUnit unit) {
            return unit.convert(BoundedPolicy.this.cache.expiresAfterWriteNanos(), TimeUnit.NANOSECONDS);
         }

         @Override
         public void setExpiresAfter(long duration, TimeUnit unit) {
            Caffeine.requireArgument(duration >= 0L);
            BoundedPolicy.this.cache.setExpiresAfterWriteNanos(unit.toNanos(duration));
            BoundedPolicy.this.cache.scheduleAfterWrite();
         }

         @Override
         public Map<K, V> oldest(int limit) {
            return BoundedPolicy.this.cache.expireAfterWriteOrder(limit, BoundedPolicy.this.transformer, true);
         }

         @Override
         public Map<K, V> youngest(int limit) {
            return BoundedPolicy.this.cache.expireAfterWriteOrder(limit, BoundedPolicy.this.transformer, false);
         }
      }

      final class BoundedRefreshAfterWrite implements Policy.Expiration<K, V> {
         @Override
         public OptionalLong ageOf(K key, TimeUnit unit) {
            Objects.requireNonNull(key);
            Objects.requireNonNull(unit);
            Object lookupKey = BoundedPolicy.this.cache.nodeFactory.newLookupKey(key);
            Node<?, ?> node = BoundedPolicy.this.cache.data.get(lookupKey);
            if (node == null) {
               return OptionalLong.empty();
            }

            long age = BoundedPolicy.this.cache.expirationTicker().read() - node.getWriteTime();
            return age > BoundedPolicy.this.cache.refreshAfterWriteNanos() ? OptionalLong.empty() : OptionalLong.of(unit.convert(age, TimeUnit.NANOSECONDS));
         }

         @Override
         public long getExpiresAfter(TimeUnit unit) {
            return unit.convert(BoundedPolicy.this.cache.refreshAfterWriteNanos(), TimeUnit.NANOSECONDS);
         }

         @Override
         public void setExpiresAfter(long duration, TimeUnit unit) {
            Caffeine.requireArgument(duration >= 0L);
            BoundedPolicy.this.cache.setRefreshAfterWriteNanos(unit.toNanos(duration));
            BoundedPolicy.this.cache.scheduleAfterWrite();
         }

         @Override
         public Map<K, V> oldest(int limit) {
            return BoundedPolicy.this.cache.expiresAfterWrite()
               ? BoundedPolicy.this.expireAfterWrite().get().oldest(limit)
               : this.sortedByWriteTime(limit, true);
         }

         @Override
         public Map<K, V> youngest(int limit) {
            return BoundedPolicy.this.cache.expiresAfterWrite()
               ? BoundedPolicy.this.expireAfterWrite().get().youngest(limit)
               : this.sortedByWriteTime(limit, false);
         }

         Map<K, V> sortedByWriteTime(int limit, boolean ascending) {
            Comparator<Node<K, V>> comparator = Comparator.comparingLong(Node::getWriteTime);
            Iterator<Node<K, V>> iterator = BoundedPolicy.this.cache
               .data
               .values()
               .stream()
               .parallel()
               .sorted(ascending ? comparator : comparator.reversed())
               .limit(limit)
               .iterator();
            return BoundedPolicy.this.cache.fixedSnapshot(() -> iterator, limit, BoundedPolicy.this.transformer);
         }
      }

      final class BoundedVarExpiration implements Policy.VarExpiration<K, V> {
         @Override
         public OptionalLong getExpiresAfter(K key, TimeUnit unit) {
            Objects.requireNonNull(key);
            Objects.requireNonNull(unit);
            Object lookupKey = BoundedPolicy.this.cache.nodeFactory.newLookupKey(key);
            Node<?, ?> node = BoundedPolicy.this.cache.data.get(lookupKey);
            if (node == null) {
               return OptionalLong.empty();
            }

            long duration = node.getVariableTime() - BoundedPolicy.this.cache.expirationTicker().read();
            return duration <= 0L ? OptionalLong.empty() : OptionalLong.of(unit.convert(duration, TimeUnit.NANOSECONDS));
         }

         @Override
         public void setExpiresAfter(K key, long duration, TimeUnit unit) {
            Objects.requireNonNull(key);
            Objects.requireNonNull(unit);
            Caffeine.requireArgument(duration >= 0L);
            Object lookupKey = BoundedPolicy.this.cache.nodeFactory.newLookupKey(key);
            Node<K, V> node = BoundedPolicy.this.cache.data.get(lookupKey);
            if (node != null) {
               long durationNanos = TimeUnit.NANOSECONDS.convert(duration, unit);
               long now;
               synchronized (node) {
                  now = BoundedPolicy.this.cache.expirationTicker().read();
                  node.setVariableTime(now + Math.min(durationNanos, 4611686018427387903L));
               }

               BoundedPolicy.this.cache.afterRead(node, now, false);
            }
         }

         @Override
         public void put(K key, V value, long duration, TimeUnit unit) {
            this.put((V)key, (long)value, duration, unit, false);
         }

         @Override
         public boolean putIfAbsent(K key, V value, long duration, TimeUnit unit) {
            V previous = (V)this.put((V)key, (long)value, duration, unit, true);
            return previous == null;
         }

         @Nullable V put(K key, V value, final long duration, final TimeUnit unit, boolean onlyIfAbsent) {
            Objects.requireNonNull(unit);
            Objects.requireNonNull(value);
            Caffeine.requireArgument(duration >= 0L);
            Expiry<K, V> expiry = new Expiry<K, V>() {
               @Override
               public long expireAfterCreate(K key, V valuex, long currentTime) {
                  return unit.toNanos(duration);
               }

               @Override
               public long expireAfterUpdate(K key, V valuex, long currentTime, long currentDuration) {
                  return unit.toNanos(duration);
               }

               @Override
               public long expireAfterRead(K key, V valuex, long currentTime, long currentDuration) {
                  return currentDuration;
               }
            };
            if (BoundedPolicy.this.cache.isAsync) {
               Expiry<K, V> asyncExpiry = new Async.AsyncExpiry<>(expiry);
               expiry = asyncExpiry;
               V asyncValue = (V)CompletableFuture.<V>completedFuture(value);
               value = asyncValue;
            }

            return BoundedPolicy.this.cache.put(key, value, expiry, true, onlyIfAbsent);
         }

         @Override
         public Map<K, V> oldest(int limit) {
            return BoundedPolicy.this.cache.variableSnapshot(true, limit, BoundedPolicy.this.transformer);
         }

         @Override
         public Map<K, V> youngest(int limit) {
            return BoundedPolicy.this.cache.variableSnapshot(false, limit, BoundedPolicy.this.transformer);
         }
      }
   }

   static final class EntryIterator<K, V> implements Iterator<Entry<K, V>> {
      final BoundedLocalCache<K, V> cache;
      final Iterator<Node<K, V>> iterator;
      final long now;
      @Nullable K key;
      @Nullable V value;
      @Nullable K removalKey;
      @Nullable Node<K, V> next;

      EntryIterator(BoundedLocalCache<K, V> cache) {
         this.iterator = cache.data.values().iterator();
         this.now = cache.expirationTicker().read();
         this.cache = cache;
      }

      @Override
      public boolean hasNext() {
         if (this.next != null) {
            return true;
         }

         while (this.iterator.hasNext()) {
            this.next = this.iterator.next();
            this.value = this.next.getValue();
            this.key = this.next.getKey();
            if (!this.cache.hasExpired(this.next, this.now) && this.key != null && this.value != null && this.next.isAlive()) {
               return true;
            }

            this.value = null;
            this.next = null;
            this.key = null;
         }

         return false;
      }

      K nextKey() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         }

         this.removalKey = this.key;
         this.value = null;
         this.next = null;
         this.key = null;
         return this.removalKey;
      }

      V nextValue() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         }

         this.removalKey = this.key;
         V val = this.value;
         this.value = null;
         this.next = null;
         this.key = null;
         return val;
      }

      public Entry<K, V> next() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         }

         Entry<K, V> entry = new WriteThroughEntry<>(this.cache, this.key, this.value);
         this.removalKey = this.key;
         this.value = null;
         this.next = null;
         this.key = null;
         return entry;
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

      EntrySetView(BoundedLocalCache<K, V> cache) {
         this.cache = Objects.requireNonNull(cache);
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
      public boolean contains(Object obj) {
         if (!(obj instanceof Entry)) {
            return false;
         }

         Entry<?, ?> entry = (Entry<?, ?>)obj;
         Node<K, V> node = this.cache.data.get(this.cache.nodeFactory.newLookupKey(entry.getKey()));
         return node != null && Objects.equals(node.getValue(), entry.getValue());
      }

      @Override
      public boolean remove(Object obj) {
         if (!(obj instanceof Entry)) {
            return false;
         }

         Entry<?, ?> entry = (Entry<?, ?>)obj;
         return this.cache.remove(entry.getKey(), entry.getValue());
      }

      @Override
      public boolean removeIf(Predicate<? super Entry<K, V>> filter) {
         boolean removed = false;

         for (Entry<K, V> entry : this) {
            if (filter.test(entry)) {
               removed |= this.cache.remove(entry.getKey(), entry.getValue());
            }
         }

         return removed;
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

      EntrySpliterator(BoundedLocalCache<K, V> cache) {
         this(cache, cache.data.values().spliterator());
      }

      EntrySpliterator(BoundedLocalCache<K, V> cache, Spliterator<Node<K, V>> spliterator) {
         this.spliterator = Objects.requireNonNull(spliterator);
         this.cache = Objects.requireNonNull(cache);
      }

      @Override
      public void forEachRemaining(Consumer<? super Entry<K, V>> action) {
         Objects.requireNonNull(action);
         Consumer<Node<K, V>> consumer = node -> {
            K key = node.getKey();
            V value = node.getValue();
            long now = this.cache.expirationTicker().read();
            if (key != null && value != null && node.isAlive() && !this.cache.hasExpired(node, now)) {
               action.accept(new WriteThroughEntry<>(this.cache, key, value));
            }
         };
         this.spliterator.forEachRemaining(consumer);
      }

      @Override
      public boolean tryAdvance(Consumer<? super Entry<K, V>> action) {
         boolean[] advanced = new boolean[]{false};
         Consumer<Node<K, V>> consumer = node -> {
            K key = node.getKey();
            V value = node.getValue();
            long now = this.cache.expirationTicker().read();
            if (key != null && value != null && node.isAlive() && !this.cache.hasExpired(node, now)) {
               action.accept(new WriteThroughEntry<>(this.cache, key, value));
               advanced[0] = true;
            }
         };

         while (this.spliterator.tryAdvance(consumer)) {
            if (advanced[0]) {
               return true;
            }
         }

         return false;
      }

      @Override
      public @Nullable Spliterator<Entry<K, V>> trySplit() {
         Spliterator<Node<K, V>> split = this.spliterator.trySplit();
         return split == null ? null : new BoundedLocalCache.EntrySpliterator<>(this.cache, split);
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

      KeyIterator(BoundedLocalCache<K, V> cache) {
         this.iterator = new BoundedLocalCache.EntryIterator<>(cache);
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

      KeySetView(BoundedLocalCache<K, V> cache) {
         this.cache = Objects.requireNonNull(cache);
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
      public boolean contains(Object obj) {
         return this.cache.containsKey(obj);
      }

      @Override
      public boolean remove(Object obj) {
         return this.cache.remove(obj) != null;
      }

      @Override
      public Iterator<K> iterator() {
         return new BoundedLocalCache.KeyIterator<>(this.cache);
      }

      @Override
      public Spliterator<K> spliterator() {
         return new BoundedLocalCache.KeySpliterator<>(this.cache);
      }

      @Override
      public Object[] toArray() {
         List<Object> keys = new ArrayList<>(this.size());

         for (Object key : this) {
            keys.add(key);
         }

         return keys.toArray();
      }

      @Override
      public <T> T[] toArray(T[] array) {
         List<Object> keys = new ArrayList<>(this.size());

         for (Object key : this) {
            keys.add(key);
         }

         return (T[])keys.toArray(array);
      }
   }

   static final class KeySpliterator<K, V> implements Spliterator<K> {
      final Spliterator<Node<K, V>> spliterator;
      final BoundedLocalCache<K, V> cache;

      KeySpliterator(BoundedLocalCache<K, V> cache) {
         this(cache, cache.data.values().spliterator());
      }

      KeySpliterator(BoundedLocalCache<K, V> cache, Spliterator<Node<K, V>> spliterator) {
         this.spliterator = Objects.requireNonNull(spliterator);
         this.cache = Objects.requireNonNull(cache);
      }

      @Override
      public void forEachRemaining(Consumer<? super K> action) {
         Objects.requireNonNull(action);
         Consumer<Node<K, V>> consumer = node -> {
            K key = node.getKey();
            V value = node.getValue();
            long now = this.cache.expirationTicker().read();
            if (key != null && value != null && node.isAlive() && !this.cache.hasExpired(node, now)) {
               action.accept(key);
            }
         };
         this.spliterator.forEachRemaining(consumer);
      }

      @Override
      public boolean tryAdvance(Consumer<? super K> action) {
         boolean[] advanced = new boolean[]{false};
         Consumer<Node<K, V>> consumer = node -> {
            K key = node.getKey();
            V value = node.getValue();
            long now = this.cache.expirationTicker().read();
            if (key != null && value != null && node.isAlive() && !this.cache.hasExpired(node, now)) {
               action.accept(key);
               advanced[0] = true;
            }
         };

         while (this.spliterator.tryAdvance(consumer)) {
            if (advanced[0]) {
               return true;
            }
         }

         return false;
      }

      @Override
      public @Nullable Spliterator<K> trySplit() {
         Spliterator<Node<K, V>> split = this.spliterator.trySplit();
         return split == null ? null : new BoundedLocalCache.KeySpliterator<>(this.cache, split);
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

      PerformCleanupTask(BoundedLocalCache<?, ?> cache) {
         this.reference = new WeakReference<>(cache);
      }

      @Override
      public boolean exec() {
         try {
            this.run();
         } catch (Throwable t) {
            BoundedLocalCache.logger.log(Level.SEVERE, "Exception thrown when performing the maintenance task", t);
         }

         return false;
      }

      @Override
      public void run() {
         BoundedLocalCache<?, ?> cache = this.reference.get();
         if (cache != null) {
            cache.performCleanUp(null);
         }
      }

      public Void getRawResult() {
         return null;
      }

      public void setRawResult(Void v) {
      }

      public void complete(Void value) {
      }

      @Override
      public void completeExceptionally(Throwable ex) {
      }

      @Override
      public boolean cancel(boolean mayInterruptIfRunning) {
         return false;
      }
   }

   final class RemovalTask implements Runnable {
      final Node<K, V> node;

      RemovalTask(Node<K, V> node) {
         this.node = node;
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

   final class UpdateTask implements Runnable {
      final int weightDifference;
      final Node<K, V> node;

      public UpdateTask(Node<K, V> node, int weightDifference) {
         this.weightDifference = weightDifference;
         this.node = node;
      }

      @GuardedBy("evictionLock")
      @Override
      public void run() {
         if (BoundedLocalCache.this.evicts()) {
            if (this.node.inWindow()) {
               BoundedLocalCache.this.setWindowWeightedSize(BoundedLocalCache.this.windowWeightedSize() + this.weightDifference);
            } else if (this.node.inMainProtected()) {
               BoundedLocalCache.this.setMainProtectedWeightedSize(BoundedLocalCache.this.mainProtectedMaximum() + this.weightDifference);
            }

            BoundedLocalCache.this.setWeightedSize(BoundedLocalCache.this.weightedSize() + this.weightDifference);
            this.node.setPolicyWeight(this.node.getPolicyWeight() + this.weightDifference);
         }

         if (BoundedLocalCache.this.evicts() || BoundedLocalCache.this.expiresAfterAccess()) {
            BoundedLocalCache.this.onAccess(this.node);
         }

         if (BoundedLocalCache.this.expiresAfterWrite()) {
            BoundedLocalCache.reorder(BoundedLocalCache.this.writeOrderDeque(), this.node);
         } else if (BoundedLocalCache.this.expiresVariable()) {
            BoundedLocalCache.this.timerWheel().reschedule(this.node);
         }
      }
   }

   static final class ValueIterator<K, V> implements Iterator<V> {
      final BoundedLocalCache.EntryIterator<K, V> iterator;

      ValueIterator(BoundedLocalCache<K, V> cache) {
         this.iterator = new BoundedLocalCache.EntryIterator<>(cache);
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

      ValueSpliterator(BoundedLocalCache<K, V> cache) {
         this(cache, cache.data.values().spliterator());
      }

      ValueSpliterator(BoundedLocalCache<K, V> cache, Spliterator<Node<K, V>> spliterator) {
         this.spliterator = Objects.requireNonNull(spliterator);
         this.cache = Objects.requireNonNull(cache);
      }

      @Override
      public void forEachRemaining(Consumer<? super V> action) {
         Objects.requireNonNull(action);
         Consumer<Node<K, V>> consumer = node -> {
            K key = node.getKey();
            V value = node.getValue();
            long now = this.cache.expirationTicker().read();
            if (key != null && value != null && node.isAlive() && !this.cache.hasExpired(node, now)) {
               action.accept(value);
            }
         };
         this.spliterator.forEachRemaining(consumer);
      }

      @Override
      public boolean tryAdvance(Consumer<? super V> action) {
         boolean[] advanced = new boolean[]{false};
         long now = this.cache.expirationTicker().read();
         Consumer<Node<K, V>> consumer = node -> {
            K key = node.getKey();
            V value = node.getValue();
            if (key != null && value != null && !this.cache.hasExpired(node, now) && node.isAlive()) {
               action.accept(value);
               advanced[0] = true;
            }
         };

         while (this.spliterator.tryAdvance(consumer)) {
            if (advanced[0]) {
               return true;
            }
         }

         return false;
      }

      @Override
      public @Nullable Spliterator<V> trySplit() {
         Spliterator<Node<K, V>> split = this.spliterator.trySplit();
         return split == null ? null : new BoundedLocalCache.ValueSpliterator<>(this.cache, split);
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

      ValuesView(BoundedLocalCache<K, V> cache) {
         this.cache = Objects.requireNonNull(cache);
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
      public boolean contains(Object o) {
         return this.cache.containsValue(o);
      }

      @Override
      public boolean removeIf(Predicate<? super V> filter) {
         boolean removed = false;

         for (Entry<K, V> entry : this.cache.entrySet()) {
            if (filter.test(entry.getValue())) {
               removed |= this.cache.remove(entry.getKey(), entry.getValue());
            }
         }

         return removed;
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
}
