package org.jctools.queues;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import org.jctools.util.Pow2;
import org.jctools.util.RangeUtil;
import org.jctools.util.UnsafeRefArrayAccess;

public class MpscBlockingConsumerArrayQueue<E>
   extends MpscBlockingConsumerArrayQueueConsumerFields<E>
   implements BlockingQueue<E>,
   MessagePassingQueue<E>,
   QueueProgressIndicators {
   byte b000;
   byte b001;
   byte b002;
   byte b003;
   byte b004;
   byte b005;
   byte b006;
   byte b007;
   byte b010;
   byte b011;
   byte b012;
   byte b013;
   byte b014;
   byte b015;
   byte b016;
   byte b017;
   byte b020;
   byte b021;
   byte b022;
   byte b023;
   byte b024;
   byte b025;
   byte b026;
   byte b027;
   byte b030;
   byte b031;
   byte b032;
   byte b033;
   byte b034;
   byte b035;
   byte b036;
   byte b037;
   byte b040;
   byte b041;
   byte b042;
   byte b043;
   byte b044;
   byte b045;
   byte b046;
   byte b047;
   byte b050;
   byte b051;
   byte b052;
   byte b053;
   byte b054;
   byte b055;
   byte b056;
   byte b057;
   byte b060;
   byte b061;
   byte b062;
   byte b063;
   byte b064;
   byte b065;
   byte b066;
   byte b067;
   byte b070;
   byte b071;
   byte b072;
   byte b073;
   byte b074;
   byte b075;
   byte b076;
   byte b077;
   byte b100;
   byte b101;
   byte b102;
   byte b103;
   byte b104;
   byte b105;
   byte b106;
   byte b107;
   byte b110;
   byte b111;
   byte b112;
   byte b113;
   byte b114;
   byte b115;
   byte b116;
   byte b117;
   byte b120;
   byte b121;
   byte b122;
   byte b123;
   byte b124;
   byte b125;
   byte b126;
   byte b127;
   byte b130;
   byte b131;
   byte b132;
   byte b133;
   byte b134;
   byte b135;
   byte b136;
   byte b137;
   byte b140;
   byte b141;
   byte b142;
   byte b143;
   byte b144;
   byte b145;
   byte b146;
   byte b147;
   byte b150;
   byte b151;
   byte b152;
   byte b153;
   byte b154;
   byte b155;
   byte b156;
   byte b157;
   byte b160;
   byte b161;
   byte b162;
   byte b163;
   byte b164;
   byte b165;
   byte b166;
   byte b167;
   byte b170;
   byte b171;
   byte b172;
   byte b173;
   byte b174;
   byte b175;
   byte b176;
   byte b177;

   public MpscBlockingConsumerArrayQueue(int var1) {
      super(Pow2.roundToPowerOfTwo(var1) - 1 << 1, (E[])UnsafeRefArrayAccess.allocateRefArray(Pow2.roundToPowerOfTwo(var1)));
      RangeUtil.checkGreaterThanOrEqual(var1, 1, "capacity");
      this.soProducerLimit(Pow2.roundToPowerOfTwo(var1) - 1 << 1);
   }

   @Override
   public final Iterator<E> iterator() {
      throw new UnsupportedOperationException();
   }

   @Override
   public final int size() {
      return IndexedQueueSizeUtil.size(this, 2);
   }

   @Override
   public final boolean isEmpty() {
      return this.lvConsumerIndex() / 2L == this.lvProducerIndex() / 2L;
   }

   @Override
   public String toString() {
      return this.getClass().getName();
   }

   public boolean offerIfBelowThreshold(E var1, int var2) {
      if (null == var1) {
         throw new NullPointerException();
      }

      long var3 = this.producerMask;
      long var5 = var3 + 2L;
      var2 <<= 1;
      Object[] var7 = this.producerBuffer;

      while (true) {
         long var8 = this.lvProducerIndex();
         if ((var8 & 1L) == 1L) {
            if (this.offerAndWakeup((E[])var7, var3, var8, (E)var1)) {
               return true;
            }
         } else {
            long var10 = this.lvProducerLimit();
            long var12 = var10 - var8;
            long var14 = var5 - var12;
            if ((var14 >= var2 || var10 <= var8) && !this.recalculateProducerLimit(var8, var10, this.lvConsumerIndex(), var5, var2)) {
               return false;
            }

            if (this.casProducerIndex(var8, var8 + 2L)) {
               var10 = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(var8, var3);
               UnsafeRefArrayAccess.soRefElement(var7, var10, var1);
               return true;
            }
         }
      }
   }

   @Override
   public boolean offer(E var1) {
      if (null == var1) {
         throw new NullPointerException();
      }

      long var2 = this.producerMask;
      Object[] var4 = this.producerBuffer;

      while (true) {
         long var5 = this.lvProducerIndex();
         if ((var5 & 1L) == 1L) {
            if (this.offerAndWakeup((E[])var4, var2, var5, (E)var1)) {
               return true;
            }
         } else {
            long var7 = this.lvProducerLimit();
            if (var7 <= var5 && !this.recalculateProducerLimit(var2, var5, var7)) {
               return false;
            }

            if (this.casProducerIndex(var5, var5 + 2L)) {
               var7 = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(var5, var2);
               UnsafeRefArrayAccess.soRefElement(var4, var7, var1);
               return true;
            }
         }
      }
   }

   @Override
   public void put(E var1) {
      if (!this.offer((E)var1)) {
         throw new UnsupportedOperationException();
      }
   }

   @Override
   public boolean offer(E var1, long var2, TimeUnit var4) {
      if (this.offer((E)var1)) {
         return true;
      } else {
         throw new UnsupportedOperationException();
      }
   }

   private boolean offerAndWakeup(E[] var1, long var2, long var4, E var6) {
      long var7 = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(var4, var2);
      Thread var9 = this.lvBlocked();
      if (var9 == null) {
         return false;
      }

      if (!this.casProducerIndex(var4, var4 + 1L)) {
         return false;
      }

      UnsafeRefArrayAccess.soRefElement(var1, var7, var6);
      LockSupport.unpark(var9);
      return true;
   }

   private boolean recalculateProducerLimit(long var1, long var3, long var5) {
      return this.recalculateProducerLimit(var3, var5, this.lvConsumerIndex(), var1 + 2L, var1 + 2L);
   }

   private boolean recalculateProducerLimit(long var1, long var3, long var5, long var7, long var9) {
      if (var5 + var7 > var1) {
         this.casProducerLimit(var3, var5 + var7);
      }

      long var11 = var1 - var5;
      return var11 < var9 && var11 < var7;
   }

   @Override
   public E take() {
      Object[] var1 = this.consumerBuffer;
      long var2 = this.consumerMask;
      long var4 = this.lpConsumerIndex();
      long var6 = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(var4, var2);
      Object var8 = UnsafeRefArrayAccess.lvRefElement(var1, var6);
      if (var8 == null) {
         return this.parkUntilNext((E[])var1, var4, var6, Long.MAX_VALUE);
      }

      UnsafeRefArrayAccess.soRefElement(var1, var6, null);
      this.soConsumerIndex(var4 + 2L);
      return (E)var8;
   }

   @Override
   public E poll(long var1, TimeUnit var3) {
      Object[] var4 = this.consumerBuffer;
      long var5 = this.consumerMask;
      long var7 = this.lpConsumerIndex();
      long var9 = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(var7, var5);
      Object var11 = UnsafeRefArrayAccess.lvRefElement(var4, var9);
      if (var11 == null) {
         long var12 = var3.toNanos(var1);
         return var12 <= 0L ? null : this.parkUntilNext((E[])var4, var7, var9, var12);
      } else {
         UnsafeRefArrayAccess.soRefElement(var4, var9, null);
         this.soConsumerIndex(var7 + 2L);
         return (E)var11;
      }
   }

   private E parkUntilNext(E[] var1, long var2, long var4, long var6) {
      long var9 = this.lvProducerIndex();
      if (var2 == var9 && this.casProducerIndex(var9, var9 + 1L)) {
         this.soBlocked(Thread.currentThread());
         long var11 = var6 == Long.MAX_VALUE ? 0L : System.nanoTime() + var6;

         try {
            while (true) {
               LockSupport.parkNanos(this, var6);
               if (Thread.interrupted()) {
                  this.casProducerIndex(var9 + 1L, var9);
                  throw new InterruptedException();
               }

               if ((this.lvProducerIndex() & 1L) == 0L) {
                  break;
               }

               var6 = var6 == Long.MAX_VALUE ? Long.MAX_VALUE : var11 - System.nanoTime();
               if (var6 <= 0L) {
                  if (this.casProducerIndex(var9 + 1L, var9)) {
                     return null;
                  }
                  break;
               }
            }
         } finally {
            this.soBlocked(null);
         }
      }

      Object var8 = spinWaitForElement(var1, var4);
      UnsafeRefArrayAccess.soRefElement(var1, var4, null);
      this.soConsumerIndex(var2 + 2L);
      return (E)var8;
   }

   @Override
   public int remainingCapacity() {
      return this.capacity() - this.size();
   }

   @Override
   public int drainTo(Collection<? super E> var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public int drainTo(Collection<? super E> var1, int var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public E poll() {
      Object[] var1 = this.consumerBuffer;
      long var2 = this.consumerMask;
      long var4 = this.lpConsumerIndex();
      long var6 = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(var4, var2);
      Object var8 = UnsafeRefArrayAccess.lvRefElement(var1, var6);
      if (var8 == null) {
         if (var4 == this.lvProducerIndex()) {
            return null;
         }

         var8 = spinWaitForElement(var1, var6);
      }

      UnsafeRefArrayAccess.soRefElement(var1, var6, null);
      this.soConsumerIndex(var4 + 2L);
      return (E)var8;
   }

   private static <E> E spinWaitForElement(E[] var0, long var1) {
      Object var3;
      do {
         var3 = UnsafeRefArrayAccess.lvRefElement(var0, var1);
      } while (var3 == null);

      return (E)var3;
   }

   @Override
   public E peek() {
      Object[] var1 = this.consumerBuffer;
      long var2 = this.consumerMask;
      long var4 = this.lpConsumerIndex();
      long var6 = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(var4, var2);
      Object var8 = UnsafeRefArrayAccess.lvRefElement(var1, var6);
      if (var8 == null && var4 != this.lvProducerIndex()) {
         var8 = spinWaitForElement(var1, var6);
      }

      return (E)var8;
   }

   @Override
   public long currentProducerIndex() {
      return this.lvProducerIndex() / 2L;
   }

   @Override
   public long currentConsumerIndex() {
      return this.lvConsumerIndex() / 2L;
   }

   @Override
   public int capacity() {
      return (int)(this.consumerMask + 2L >> 1);
   }

   @Override
   public boolean relaxedOffer(E var1) {
      return this.offer((E)var1);
   }

   @Override
   public E relaxedPoll() {
      Object[] var1 = this.consumerBuffer;
      long var2 = this.lpConsumerIndex();
      long var4 = this.consumerMask;
      long var6 = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(var2, var4);
      Object var8 = UnsafeRefArrayAccess.lvRefElement(var1, var6);
      if (var8 == null) {
         return null;
      }

      UnsafeRefArrayAccess.soRefElement(var1, var6, null);
      this.soConsumerIndex(var2 + 2L);
      return (E)var8;
   }

   @Override
   public E relaxedPeek() {
      Object[] var1 = this.consumerBuffer;
      long var2 = this.lpConsumerIndex();
      long var4 = this.consumerMask;
      long var6 = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(var2, var4);
      return UnsafeRefArrayAccess.lvRefElement((E[])var1, var6);
   }

   @Override
   public int fill(MessagePassingQueue.Supplier<E> var1, int var2) {
      if (null == var1) {
         throw new IllegalArgumentException("supplier is null");
      }

      if (var2 < 0) {
         throw new IllegalArgumentException("limit is negative:" + var2);
      }

      if (var2 == 0) {
         return 0;
      }

      long var3 = this.producerMask;
      Thread var8 = null;
      long var9 = 0L;
      long var11 = 2L * var2;

      long var5;
      while (true) {
         var5 = this.lvProducerIndex();
         long var13 = this.lvProducerLimit();
         if ((var5 & 1L) == 1L) {
            var8 = this.lvBlocked();
            if (var8 != null) {
               if (this.casProducerIndex(var5, var5 + 1L)) {
                  var9 = var5 + 1L;
                  var5--;
                  break;
               }

               var8 = null;
            }
         } else {
            var9 = Math.min(var13, var5 + var11);
            if (var5 >= var13) {
               if (!this.recalculateProducerLimit(var3, var5, var13)) {
                  return 0;
               }

               var9 = Math.min(this.lvProducerLimit(), var5 + var11);
            }

            if (this.casProducerIndex(var5, var9)) {
               break;
            }
         }
      }

      int var7 = (int)((var9 - var5) / 2L);
      Object[] var18 = this.producerBuffer;

      for (int var14 = 0; var14 < var7; var14++) {
         long var15 = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(var5 + 2L * var14, var3);
         UnsafeRefArrayAccess.soRefElement(var18, var15, var1.get());
      }

      if (var8 != null && this.lvBlocked() == var8) {
         LockSupport.unpark(var8);
      }

      return var7;
   }

   public int drain(MessagePassingQueue.Consumer<E> var1, int var2, long var3, TimeUnit var5) {
      if (var2 == 0) {
         return 0;
      }

      int var6 = this.drain(var1, var2);
      if (var6 != 0) {
         return var6;
      }

      Object var7 = this.poll(var3, var5);
      if (var7 == null) {
         return 0;
      }

      var1.accept(var7);
      return 1 + this.drain(var1, var2 - 1);
   }

   @Override
   public int fill(MessagePassingQueue.Supplier<E> var1) {
      return MessagePassingQueueUtil.fillBounded(this, var1);
   }

   @Override
   public void fill(MessagePassingQueue.Supplier<E> var1, MessagePassingQueue.WaitStrategy var2, MessagePassingQueue.ExitCondition var3) {
      MessagePassingQueueUtil.fill(this, var1, var2, var3);
   }

   @Override
   public int drain(MessagePassingQueue.Consumer<E> var1) {
      return this.drain(var1, this.capacity());
   }

   @Override
   public int drain(MessagePassingQueue.Consumer<E> var1, int var2) {
      return MessagePassingQueueUtil.drain(this, var1, var2);
   }

   @Override
   public void drain(MessagePassingQueue.Consumer<E> var1, MessagePassingQueue.WaitStrategy var2, MessagePassingQueue.ExitCondition var3) {
      MessagePassingQueueUtil.drain(this, var1, var2, var3);
   }
}
