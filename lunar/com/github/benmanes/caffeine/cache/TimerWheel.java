package com.github.benmanes.caffeine.cache;

import java.lang.ref.ReferenceQueue;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.qual.Nullable;

final class TimerWheel<K, V> implements Iterable<Node<K, V>> {
   static final int[] BUCKETS = new int[]{64, 64, 32, 4, 1};
   static final long[] SPANS = new long[]{
      Caffeine.ceilingPowerOfTwo(TimeUnit.SECONDS.toNanos(1L)),
      Caffeine.ceilingPowerOfTwo(TimeUnit.MINUTES.toNanos(1L)),
      Caffeine.ceilingPowerOfTwo(TimeUnit.HOURS.toNanos(1L)),
      Caffeine.ceilingPowerOfTwo(TimeUnit.DAYS.toNanos(1L)),
      BUCKETS[3] * Caffeine.ceilingPowerOfTwo(TimeUnit.DAYS.toNanos(1L)),
      BUCKETS[3] * Caffeine.ceilingPowerOfTwo(TimeUnit.DAYS.toNanos(1L))
   };
   static final long[] SHIFT = new long[]{
      Long.numberOfTrailingZeros(SPANS[0]),
      Long.numberOfTrailingZeros(SPANS[1]),
      Long.numberOfTrailingZeros(SPANS[2]),
      Long.numberOfTrailingZeros(SPANS[3]),
      Long.numberOfTrailingZeros(SPANS[4])
   };
   final Node<K, V>[][] wheel = new Node[BUCKETS.length][];
   long nanos;

   TimerWheel() {
      for (int var1 = 0; var1 < this.wheel.length; var1++) {
         this.wheel[var1] = new Node[BUCKETS[var1]];

         for (int var2 = 0; var2 < this.wheel[var1].length; var2++) {
            this.wheel[var1][var2] = new TimerWheel.Sentinel<>();
         }
      }
   }

   public void advance(BoundedLocalCache<K, V> var1, long var2) {
      long var4 = this.nanos;
      this.nanos = var2;
      if (var4 < 0L && var2 > 0L) {
         var4 += Long.MAX_VALUE;
         var2 += Long.MAX_VALUE;
      }

      try {
         for (int var6 = 0; var6 < SHIFT.length; var6++) {
            long var7 = var4 >>> (int)SHIFT[var6];
            long var9 = var2 >>> (int)SHIFT[var6];
            long var11 = var9 - var7;
            if (var11 <= 0L) {
               break;
            }

            this.expire(var1, var6, var7, var11);
         }
      } catch (Throwable var13) {
         this.nanos = var4;
         throw var13;
      }
   }

   void expire(BoundedLocalCache<K, V> var1, int var2, long var3, long var5) {
      Node[] var7 = this.wheel[var2];
      int var8 = var7.length - 1;
      int var9 = Math.min(1 + (int)var5, var7.length);
      int var10 = (int)(var3 & var8);
      int var11 = var10 + var9;

      for (int var12 = var10; var12 < var11; var12++) {
         Node var13 = var7[var12 & var8];
         Node var14 = var13.getPreviousInVariableOrder();
         Node var15 = var13.getNextInVariableOrder();
         var13.setPreviousInVariableOrder(var13);
         var13.setNextInVariableOrder(var13);

         while (var15 != var13) {
            Node var16 = var15.getNextInVariableOrder();
            var15.setPreviousInVariableOrder(null);
            var15.setNextInVariableOrder(null);

            try {
               if (var15.getVariableTime() - this.nanos > 0L || !var1.evictEntry(var15, RemovalCause.EXPIRED, this.nanos)) {
                  this.schedule(var15);
               }

               var15 = var16;
            } catch (Throwable var18) {
               var15.setPreviousInVariableOrder(var13.getPreviousInVariableOrder());
               var15.setNextInVariableOrder(var16);
               var13.getPreviousInVariableOrder().setNextInVariableOrder(var15);
               var13.setPreviousInVariableOrder(var14);
               throw var18;
            }
         }
      }
   }

   public void schedule(Node<K, V> var1) {
      Node var2 = this.findBucket(var1.getVariableTime());
      this.link(var2, var1);
   }

   public void reschedule(Node<K, V> var1) {
      if (var1.getNextInVariableOrder() != null) {
         this.unlink(var1);
         this.schedule(var1);
      }
   }

   public void deschedule(Node<K, V> var1) {
      this.unlink(var1);
      var1.setNextInVariableOrder(null);
      var1.setPreviousInVariableOrder(null);
   }

   Node<K, V> findBucket(long var1) {
      long var3 = var1 - this.nanos;
      int var5 = this.wheel.length - 1;

      for (int var6 = 0; var6 < var5; var6++) {
         if (var3 < SPANS[var6 + 1]) {
            long var7 = var1 >>> (int)SHIFT[var6];
            int var9 = (int)(var7 & this.wheel[var6].length - 1);
            return this.wheel[var6][var9];
         }
      }

      return this.wheel[var5][0];
   }

   void link(Node<K, V> var1, Node<K, V> var2) {
      var2.setPreviousInVariableOrder(var1.getPreviousInVariableOrder());
      var2.setNextInVariableOrder(var1);
      var1.getPreviousInVariableOrder().setNextInVariableOrder(var2);
      var1.setPreviousInVariableOrder(var2);
   }

   void unlink(Node<K, V> var1) {
      Node var2 = var1.getNextInVariableOrder();
      if (var2 != null) {
         Node var3 = var1.getPreviousInVariableOrder();
         var2.setPreviousInVariableOrder(var3);
         var3.setNextInVariableOrder(var2);
      }
   }

   public long getExpirationDelay() {
      for (int var1 = 0; var1 < SHIFT.length; var1++) {
         Node[] var2 = this.wheel[var1];
         long var3 = this.nanos >>> (int)SHIFT[var1];
         long var5 = SPANS[var1] - 1L;
         int var7 = (int)(var3 & var5);
         int var8 = var7 + var2.length;
         int var9 = var2.length - 1;

         for (int var10 = var7; var10 < var8; var10++) {
            Node var11 = var2[var10 & var9];
            Node var12 = var11.getNextInVariableOrder();
            if (var12 != var11) {
               long var13 = var10 - var7;
               long var15 = (var13 << (int)SHIFT[var1]) - (this.nanos & var5);
               var15 = var15 > 0L ? var15 : SPANS[var1];

               for (int var17 = var1 + 1; var17 < SHIFT.length; var17++) {
                  long var18 = this.peekAhead(var17);
                  var15 = Math.min(var15, var18);
               }

               return var15;
            }
         }
      }

      return Long.MAX_VALUE;
   }

   long peekAhead(int var1) {
      long var2 = this.nanos >>> (int)SHIFT[var1];
      Node[] var4 = this.wheel[var1];
      long var5 = SPANS[var1] - 1L;
      int var7 = var4.length - 1;
      int var8 = (int)(var2 + 1L & var7);
      Node var9 = var4[var8];
      Node var10 = var9.getNextInVariableOrder();
      return var10 == var9 ? Long.MAX_VALUE : SPANS[var1] - (this.nanos & var5);
   }

   @Override
   public Iterator<Node<K, V>> iterator() {
      return new TimerWheel.AscendingIterator();
   }

   public Iterator<Node<K, V>> descendingIterator() {
      return new TimerWheel.DescendingIterator();
   }

   final class AscendingIterator extends TimerWheel<K, V>.Traverser {
      int wheelIndex;
      int steps;

      @Override
      boolean isDone() {
         return this.wheelIndex == TimerWheel.this.wheel.length;
      }

      @Override
      Node<K, V> sentinel() {
         return TimerWheel.this.wheel[this.wheelIndex][this.bucketIndex()];
      }

      @Override
      Node<K, V> traverse(Node<K, V> var1) {
         return var1.getNextInVariableOrder();
      }

      @Override
      @Nullable Node<K, V> goToNextBucket() {
         return ++this.steps < TimerWheel.this.wheel[this.wheelIndex].length ? TimerWheel.this.wheel[this.wheelIndex][this.bucketIndex()] : null;
      }

      @Override
      @Nullable Node<K, V> goToNextWheel() {
         if (++this.wheelIndex == TimerWheel.this.wheel.length) {
            return null;
         }

         this.steps = 0;
         return TimerWheel.this.wheel[this.wheelIndex][this.bucketIndex()];
      }

      int bucketIndex() {
         int var1 = (int)(TimerWheel.this.nanos >>> (int)TimerWheel.SHIFT[this.wheelIndex]);
         int var2 = TimerWheel.this.wheel[this.wheelIndex].length - 1;
         int var3 = (var1 & var2) + 1;
         return var3 + this.steps & var2;
      }
   }

   final class DescendingIterator extends TimerWheel<K, V>.Traverser {
      int wheelIndex = TimerWheel.this.wheel.length - 1;
      int steps;

      @Override
      boolean isDone() {
         return this.wheelIndex == -1;
      }

      @Override
      Node<K, V> sentinel() {
         return TimerWheel.this.wheel[this.wheelIndex][this.bucketIndex()];
      }

      @Override
      @Nullable Node<K, V> goToNextBucket() {
         return ++this.steps < TimerWheel.this.wheel[this.wheelIndex].length ? TimerWheel.this.wheel[this.wheelIndex][this.bucketIndex()] : null;
      }

      @Override
      @Nullable Node<K, V> goToNextWheel() {
         if (--this.wheelIndex < 0) {
            return null;
         }

         this.steps = 0;
         return TimerWheel.this.wheel[this.wheelIndex][this.bucketIndex()];
      }

      @Override
      Node<K, V> traverse(Node<K, V> var1) {
         return var1.getPreviousInVariableOrder();
      }

      int bucketIndex() {
         int var1 = (int)(TimerWheel.this.nanos >>> (int)TimerWheel.SHIFT[this.wheelIndex]);
         int var2 = TimerWheel.this.wheel[this.wheelIndex].length - 1;
         int var3 = var1 & var2;
         return var3 - this.steps & var2;
      }
   }

   static final class Sentinel<K, V> extends Node<K, V> {
      Node<K, V> prev;
      Node<K, V> next;

      Sentinel() {
         this.prev = this.next = this;
      }

      @Override
      public Node<K, V> getPreviousInVariableOrder() {
         return this.prev;
      }

      @Override
      public void setPreviousInVariableOrder(@Nullable Node<K, V> var1) {
         this.prev = var1;
      }

      @Override
      public Node<K, V> getNextInVariableOrder() {
         return this.next;
      }

      @Override
      public void setNextInVariableOrder(@Nullable Node<K, V> var1) {
         this.next = var1;
      }

      @Override
      public @Nullable K getKey() {
         return null;
      }

      @Override
      public Object getKeyReference() {
         throw new UnsupportedOperationException();
      }

      @Override
      public @Nullable V getValue() {
         return null;
      }

      @Override
      public Object getValueReference() {
         throw new UnsupportedOperationException();
      }

      @Override
      public void setValue(V var1, @Nullable ReferenceQueue<V> var2) {
      }

      @Override
      public boolean containsValue(Object var1) {
         return false;
      }

      @Override
      public boolean isAlive() {
         return false;
      }

      @Override
      public boolean isRetired() {
         return false;
      }

      @Override
      public boolean isDead() {
         return false;
      }

      @Override
      public void retire() {
      }

      @Override
      public void die() {
      }
   }

   abstract class Traverser implements Iterator<Node<K, V>> {
      final long expectedNanos = TimerWheel.this.nanos;
      @Nullable Node<K, V> current;
      @Nullable Node<K, V> next;

      @Override
      public boolean hasNext() {
         if (TimerWheel.this.nanos != this.expectedNanos) {
            throw new ConcurrentModificationException();
         }

         if (this.next != null) {
            return true;
         }

         if (this.isDone()) {
            return false;
         }

         this.next = this.computeNext();
         return this.next != null;
      }

      public Node<K, V> next() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         }

         this.current = this.next;
         this.next = null;
         return this.current;
      }

      @Nullable Node<K, V> computeNext() {
         Node var1 = this.current == null ? this.sentinel() : this.current;

         do {
            var1 = this.traverse(var1);
            if (var1 != this.sentinel()) {
               return var1;
            }
         } while ((var1 = this.goToNextBucket()) != null || (var1 = this.goToNextWheel()) != null);

         return null;
      }

      abstract boolean isDone();

      abstract Node<K, V> sentinel();

      abstract Node<K, V> traverse(Node<K, V> var1);

      abstract @Nullable Node<K, V> goToNextBucket();

      abstract @Nullable Node<K, V> goToNextWheel();
   }
}
