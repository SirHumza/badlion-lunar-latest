package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jctools.queues.MessagePassingQueue;
import org.jctools.queues.MessagePassingQueueUtil;
import org.jctools.util.RangeUtil;

public class MpmcAtomicArrayQueue<E> extends MpmcAtomicArrayQueueL3Pad<E> {
   public static final int MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.mpmc.max.lookahead.step", 4096);
   private final int lookAheadStep = Math.max(2, Math.min(this.capacity() / 4, MAX_LOOK_AHEAD_STEP));

   public MpmcAtomicArrayQueue(int var1) {
      super(RangeUtil.checkGreaterThanOrEqual(var1, 2, "capacity"));
   }

   @Override
   public boolean offer(E var1) {
      if (null == var1) {
         throw new NullPointerException();
      }

      int var2 = this.mask;
      long var3 = var2 + 1;
      AtomicLongArray var5 = this.sequenceBuffer;
      long var11 = Long.MIN_VALUE;

      long var6;
      int var8;
      long var9;
      do {
         var6 = this.lvProducerIndex();
         var8 = AtomicQueueUtil.calcCircularLongElementOffset(var6, var2);
         var9 = AtomicQueueUtil.lvLongElement(var5, var8);
         if (var9 < var6) {
            if (var6 - var3 >= var11 && var6 - var3 >= (var11 = this.lvConsumerIndex())) {
               return false;
            }

            var9 = var6 + 1L;
         }
      } while (var9 > var6 || !this.casProducerIndex(var6, var6 + 1L));

      AtomicQueueUtil.spRefElement(this.buffer, AtomicQueueUtil.calcCircularRefElementOffset(var6, var2), (E)var1);
      AtomicQueueUtil.soLongElement(var5, var8, var6 + 1L);
      return true;
   }

   @Override
   public E poll() {
      AtomicLongArray var1 = this.sequenceBuffer;
      int var2 = this.mask;
      long var10 = -1L;

      long var3;
      long var5;
      int var7;
      long var8;
      do {
         var3 = this.lvConsumerIndex();
         var7 = AtomicQueueUtil.calcCircularLongElementOffset(var3, var2);
         var5 = AtomicQueueUtil.lvLongElement(var1, var7);
         var8 = var3 + 1L;
         if (var5 < var8) {
            if (var3 >= var10 && var3 == (var10 = this.lvProducerIndex())) {
               return null;
            }

            var5 = var8 + 1L;
         }
      } while (var5 > var8 || !this.casConsumerIndex(var3, var3 + 1L));

      int var12 = AtomicQueueUtil.calcCircularRefElementOffset(var3, var2);
      Object var13 = AtomicQueueUtil.lpRefElement(this.buffer, var12);
      AtomicQueueUtil.spRefElement(this.buffer, var12, null);
      AtomicQueueUtil.soLongElement(var1, var7, var3 + var2 + 1L);
      return (E)var13;
   }

   @Override
   public E peek() {
      AtomicLongArray var1 = this.sequenceBuffer;
      int var2 = this.mask;
      long var10 = -1L;

      while (true) {
         long var3 = this.lvConsumerIndex();
         int var7 = AtomicQueueUtil.calcCircularLongElementOffset(var3, var2);
         long var5 = AtomicQueueUtil.lvLongElement(var1, var7);
         long var8 = var3 + 1L;
         if (var5 < var8) {
            if (var3 >= var10 && var3 == (var10 = this.lvProducerIndex())) {
               return null;
            }
         } else if (var5 == var8) {
            int var13 = AtomicQueueUtil.calcCircularRefElementOffset(var3, var2);
            Object var12 = AtomicQueueUtil.lvRefElement(this.buffer, var13);
            if (this.lvConsumerIndex() == var3) {
               return (E)var12;
            }
         }
      }
   }

   @Override
   public boolean relaxedOffer(E var1) {
      if (null == var1) {
         throw new NullPointerException();
      }

      int var2 = this.mask;
      AtomicLongArray var3 = this.sequenceBuffer;

      long var4;
      int var6;
      long var7;
      do {
         var4 = this.lvProducerIndex();
         var6 = AtomicQueueUtil.calcCircularLongElementOffset(var4, var2);
         var7 = AtomicQueueUtil.lvLongElement(var3, var6);
         if (var7 < var4) {
            return false;
         }
      } while (var7 > var4 || !this.casProducerIndex(var4, var4 + 1L));

      AtomicQueueUtil.spRefElement(this.buffer, AtomicQueueUtil.calcCircularRefElementOffset(var4, var2), (E)var1);
      AtomicQueueUtil.soLongElement(var3, var6, var4 + 1L);
      return true;
   }

   @Override
   public E relaxedPoll() {
      AtomicLongArray var1 = this.sequenceBuffer;
      int var2 = this.mask;

      long var3;
      int var5;
      long var6;
      long var8;
      do {
         var3 = this.lvConsumerIndex();
         var5 = AtomicQueueUtil.calcCircularLongElementOffset(var3, var2);
         var6 = AtomicQueueUtil.lvLongElement(var1, var5);
         var8 = var3 + 1L;
         if (var6 < var8) {
            return null;
         }
      } while (var6 > var8 || !this.casConsumerIndex(var3, var3 + 1L));

      int var10 = AtomicQueueUtil.calcCircularRefElementOffset(var3, var2);
      Object var11 = AtomicQueueUtil.lpRefElement(this.buffer, var10);
      AtomicQueueUtil.spRefElement(this.buffer, var10, null);
      AtomicQueueUtil.soLongElement(var1, var5, var3 + var2 + 1L);
      return (E)var11;
   }

   @Override
   public E relaxedPeek() {
      AtomicLongArray var1 = this.sequenceBuffer;
      int var2 = this.mask;

      while (true) {
         long var3 = this.lvConsumerIndex();
         int var7 = AtomicQueueUtil.calcCircularLongElementOffset(var3, var2);
         long var5 = AtomicQueueUtil.lvLongElement(var1, var7);
         long var8 = var3 + 1L;
         if (var5 < var8) {
            return null;
         }

         if (var5 == var8) {
            int var11 = AtomicQueueUtil.calcCircularRefElementOffset(var3, var2);
            Object var10 = AtomicQueueUtil.lvRefElement(this.buffer, var11);
            if (this.lvConsumerIndex() == var3) {
               return (E)var10;
            }
         }
      }
   }

   @Override
   public int drain(MessagePassingQueue.Consumer<E> var1, int var2) {
      if (null == var1) {
         throw new IllegalArgumentException("c is null");
      }

      if (var2 < 0) {
         throw new IllegalArgumentException("limit is negative: " + var2);
      }

      if (var2 == 0) {
         return 0;
      }

      AtomicLongArray var3 = this.sequenceBuffer;
      int var4 = this.mask;
      AtomicReferenceArray var5 = this.buffer;
      int var6 = Math.min(this.lookAheadStep, var2);
      int var7 = 0;

      while (var7 < var2) {
         int var8 = var2 - var7;
         int var9 = Math.min(var8, var6);
         long var10 = this.lvConsumerIndex();
         long var12 = var10 + var9 - 1L;
         int var14 = AtomicQueueUtil.calcCircularLongElementOffset(var12, var4);
         long var15 = AtomicQueueUtil.lvLongElement(var3, var14);
         long var17 = var12 + 1L;
         if (var15 != var17 || !this.casConsumerIndex(var10, var17)) {
            return var15 < var17 && this.notAvailable(var10, var4, var3, var10 + 1L) ? var7 : var7 + this.drainOneByOne(var1, var8);
         }

         for (int var19 = 0; var19 < var9; var19++) {
            long var20 = var10 + var19;
            int var22 = AtomicQueueUtil.calcCircularLongElementOffset(var20, var4);
            int var23 = AtomicQueueUtil.calcCircularRefElementOffset(var20, var4);
            long var24 = var20 + 1L;

            while (AtomicQueueUtil.lvLongElement(var3, var22) != var24) {
            }

            Object var26 = AtomicQueueUtil.lpRefElement(var5, var23);
            AtomicQueueUtil.spRefElement(var5, var23, null);
            AtomicQueueUtil.soLongElement(var3, var22, var20 + var4 + 1L);
            var1.accept(var26);
         }

         var7 += var9;
      }

      return var2;
   }

   private int drainOneByOne(MessagePassingQueue.Consumer<E> var1, int var2) {
      AtomicLongArray var3 = this.sequenceBuffer;
      int var4 = this.mask;
      AtomicReferenceArray var5 = this.buffer;

      for (int var13 = 0; var13 < var2; var13++) {
         long var6;
         int var8;
         long var9;
         long var11;
         do {
            var6 = this.lvConsumerIndex();
            var8 = AtomicQueueUtil.calcCircularLongElementOffset(var6, var4);
            var9 = AtomicQueueUtil.lvLongElement(var3, var8);
            var11 = var6 + 1L;
            if (var9 < var11) {
               return var13;
            }
         } while (var9 > var11 || !this.casConsumerIndex(var6, var6 + 1L));

         int var14 = AtomicQueueUtil.calcCircularRefElementOffset(var6, var4);
         Object var15 = AtomicQueueUtil.lpRefElement(var5, var14);
         AtomicQueueUtil.spRefElement(var5, var14, null);
         AtomicQueueUtil.soLongElement(var3, var8, var6 + var4 + 1L);
         var1.accept(var15);
      }

      return var2;
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

      AtomicLongArray var3 = this.sequenceBuffer;
      int var4 = this.mask;
      AtomicReferenceArray var5 = this.buffer;
      int var6 = Math.min(this.lookAheadStep, var2);
      int var7 = 0;

      while (var7 < var2) {
         int var8 = var2 - var7;
         int var9 = Math.min(var8, var6);
         long var10 = this.lvProducerIndex();
         long var12 = var10 + var9 - 1L;
         int var14 = AtomicQueueUtil.calcCircularLongElementOffset(var12, var4);
         long var15 = AtomicQueueUtil.lvLongElement(var3, var14);
         long var17 = var12;
         if (var15 != var17 || !this.casProducerIndex(var10, var17 + 1L)) {
            return var15 < var17 && this.notAvailable(var10, var4, var3, var10) ? var7 : var7 + this.fillOneByOne(var1, var8);
         }

         for (int var19 = 0; var19 < var9; var19++) {
            long var20 = var10 + var19;
            int var22 = AtomicQueueUtil.calcCircularLongElementOffset(var20, var4);
            int var23 = AtomicQueueUtil.calcCircularRefElementOffset(var20, var4);

            while (AtomicQueueUtil.lvLongElement(var3, var22) != var20) {
            }

            AtomicQueueUtil.soRefElement(var5, var23, var1.get());
            AtomicQueueUtil.soLongElement(var3, var22, var20 + 1L);
         }

         var7 += var9;
      }

      return var2;
   }

   private boolean notAvailable(long var1, int var3, AtomicLongArray var4, long var5) {
      int var7 = AtomicQueueUtil.calcCircularLongElementOffset(var1, var3);
      long var8 = AtomicQueueUtil.lvLongElement(var4, var7);
      return var8 < var5;
   }

   private int fillOneByOne(MessagePassingQueue.Supplier<E> var1, int var2) {
      AtomicLongArray var3 = this.sequenceBuffer;
      int var4 = this.mask;
      AtomicReferenceArray var5 = this.buffer;

      for (int var11 = 0; var11 < var2; var11++) {
         long var6;
         int var8;
         long var9;
         do {
            var6 = this.lvProducerIndex();
            var8 = AtomicQueueUtil.calcCircularLongElementOffset(var6, var4);
            var9 = AtomicQueueUtil.lvLongElement(var3, var8);
            if (var9 < var6) {
               return var11;
            }
         } while (var9 > var6 || !this.casProducerIndex(var6, var6 + 1L));

         AtomicQueueUtil.soRefElement(var5, AtomicQueueUtil.calcCircularRefElementOffset(var6, var4), var1.get());
         AtomicQueueUtil.soLongElement(var3, var8, var6 + 1L);
      }

      return var2;
   }

   @Override
   public int drain(MessagePassingQueue.Consumer<E> var1) {
      return MessagePassingQueueUtil.drain(this, var1);
   }

   @Override
   public int fill(MessagePassingQueue.Supplier<E> var1) {
      return MessagePassingQueueUtil.fillBounded(this, var1);
   }

   @Override
   public void drain(MessagePassingQueue.Consumer<E> var1, MessagePassingQueue.WaitStrategy var2, MessagePassingQueue.ExitCondition var3) {
      MessagePassingQueueUtil.drain(this, var1, var2, var3);
   }

   @Override
   public void fill(MessagePassingQueue.Supplier<E> var1, MessagePassingQueue.WaitStrategy var2, MessagePassingQueue.ExitCondition var3) {
      MessagePassingQueueUtil.fill(this, var1, var2, var3);
   }
}
