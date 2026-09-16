package org.jctools.queues;

import org.jctools.util.RangeUtil;
import org.jctools.util.UnsafeLongArrayAccess;
import org.jctools.util.UnsafeRefArrayAccess;

public class MpmcArrayQueue<E> extends MpmcArrayQueueL3Pad<E> {
   public static final int MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.mpmc.max.lookahead.step", 4096);
   private final int lookAheadStep = Math.max(2, Math.min(this.capacity() / 4, MAX_LOOK_AHEAD_STEP));

   public MpmcArrayQueue(int var1) {
      super(RangeUtil.checkGreaterThanOrEqual(var1, 2, "capacity"));
   }

   @Override
   public boolean offer(E var1) {
      if (null == var1) {
         throw new NullPointerException();
      }

      long var2 = this.mask;
      long var4 = var2 + 1L;
      long[] var6 = this.sequenceBuffer;
      long var13 = Long.MIN_VALUE;

      long var7;
      long var9;
      long var11;
      do {
         var7 = this.lvProducerIndex();
         var9 = UnsafeLongArrayAccess.calcCircularLongElementOffset(var7, var2);
         var11 = UnsafeLongArrayAccess.lvLongElement(var6, var9);
         if (var11 < var7) {
            if (var7 - var4 >= var13 && var7 - var4 >= (var13 = this.lvConsumerIndex())) {
               return false;
            }

            var11 = var7 + 1L;
         }
      } while (var11 > var7 || !this.casProducerIndex(var7, var7 + 1L));

      UnsafeRefArrayAccess.spRefElement(this.buffer, UnsafeRefArrayAccess.calcCircularRefElementOffset(var7, var2), var1);
      UnsafeLongArrayAccess.soLongElement(var6, var9, var7 + 1L);
      return true;
   }

   @Override
   public E poll() {
      long[] var1 = this.sequenceBuffer;
      long var2 = this.mask;
      long var12 = -1L;

      long var4;
      long var6;
      long var8;
      long var10;
      do {
         var4 = this.lvConsumerIndex();
         var8 = UnsafeLongArrayAccess.calcCircularLongElementOffset(var4, var2);
         var6 = UnsafeLongArrayAccess.lvLongElement(var1, var8);
         var10 = var4 + 1L;
         if (var6 < var10) {
            if (var4 >= var12 && var4 == (var12 = this.lvProducerIndex())) {
               return null;
            }

            var6 = var10 + 1L;
         }
      } while (var6 > var10 || !this.casConsumerIndex(var4, var4 + 1L));

      long var14 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var4, var2);
      Object var16 = UnsafeRefArrayAccess.lpRefElement(this.buffer, var14);
      UnsafeRefArrayAccess.spRefElement(this.buffer, var14, null);
      UnsafeLongArrayAccess.soLongElement(var1, var8, var4 + var2 + 1L);
      return (E)var16;
   }

   @Override
   public E peek() {
      long[] var1 = this.sequenceBuffer;
      long var2 = this.mask;
      long var12 = -1L;

      while (true) {
         long var4 = this.lvConsumerIndex();
         long var8 = UnsafeLongArrayAccess.calcCircularLongElementOffset(var4, var2);
         long var6 = UnsafeLongArrayAccess.lvLongElement(var1, var8);
         long var10 = var4 + 1L;
         if (var6 < var10) {
            if (var4 >= var12 && var4 == (var12 = this.lvProducerIndex())) {
               return null;
            }
         } else if (var6 == var10) {
            long var15 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var4, var2);
            Object var14 = UnsafeRefArrayAccess.lvRefElement(this.buffer, var15);
            if (this.lvConsumerIndex() == var4) {
               return (E)var14;
            }
         }
      }
   }

   @Override
   public boolean relaxedOffer(E var1) {
      if (null == var1) {
         throw new NullPointerException();
      }

      long var2 = this.mask;
      long[] var4 = this.sequenceBuffer;

      long var5;
      long var7;
      long var9;
      do {
         var5 = this.lvProducerIndex();
         var7 = UnsafeLongArrayAccess.calcCircularLongElementOffset(var5, var2);
         var9 = UnsafeLongArrayAccess.lvLongElement(var4, var7);
         if (var9 < var5) {
            return false;
         }
      } while (var9 > var5 || !this.casProducerIndex(var5, var5 + 1L));

      UnsafeRefArrayAccess.spRefElement(this.buffer, UnsafeRefArrayAccess.calcCircularRefElementOffset(var5, var2), var1);
      UnsafeLongArrayAccess.soLongElement(var4, var7, var5 + 1L);
      return true;
   }

   @Override
   public E relaxedPoll() {
      long[] var1 = this.sequenceBuffer;
      long var2 = this.mask;

      long var4;
      long var6;
      long var8;
      long var10;
      do {
         var4 = this.lvConsumerIndex();
         var6 = UnsafeLongArrayAccess.calcCircularLongElementOffset(var4, var2);
         var8 = UnsafeLongArrayAccess.lvLongElement(var1, var6);
         var10 = var4 + 1L;
         if (var8 < var10) {
            return null;
         }
      } while (var8 > var10 || !this.casConsumerIndex(var4, var4 + 1L));

      long var12 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var4, var2);
      Object var14 = UnsafeRefArrayAccess.lpRefElement(this.buffer, var12);
      UnsafeRefArrayAccess.spRefElement(this.buffer, var12, null);
      UnsafeLongArrayAccess.soLongElement(var1, var6, var4 + var2 + 1L);
      return (E)var14;
   }

   @Override
   public E relaxedPeek() {
      long[] var1 = this.sequenceBuffer;
      long var2 = this.mask;

      while (true) {
         long var4 = this.lvConsumerIndex();
         long var8 = UnsafeLongArrayAccess.calcCircularLongElementOffset(var4, var2);
         long var6 = UnsafeLongArrayAccess.lvLongElement(var1, var8);
         long var10 = var4 + 1L;
         if (var6 < var10) {
            return null;
         }

         if (var6 == var10) {
            long var13 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var4, var2);
            Object var12 = UnsafeRefArrayAccess.lvRefElement(this.buffer, var13);
            if (this.lvConsumerIndex() == var4) {
               return (E)var12;
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

      long[] var3 = this.sequenceBuffer;
      long var4 = this.mask;
      Object[] var6 = this.buffer;
      int var7 = Math.min(this.lookAheadStep, var2);
      int var8 = 0;

      while (var8 < var2) {
         int var9 = var2 - var8;
         int var10 = Math.min(var9, var7);
         long var11 = this.lvConsumerIndex();
         long var13 = var11 + var10 - 1L;
         long var15 = UnsafeLongArrayAccess.calcCircularLongElementOffset(var13, var4);
         long var17 = UnsafeLongArrayAccess.lvLongElement(var3, var15);
         long var19 = var13 + 1L;
         if (var17 != var19 || !this.casConsumerIndex(var11, var19)) {
            return var17 < var19 && this.notAvailable(var11, var4, var3, var11 + 1L) ? var8 : var8 + this.drainOneByOne(var1, var9);
         }

         for (int var21 = 0; var21 < var10; var21++) {
            long var22 = var11 + var21;
            long var24 = UnsafeLongArrayAccess.calcCircularLongElementOffset(var22, var4);
            long var26 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var22, var4);
            long var28 = var22 + 1L;

            while (UnsafeLongArrayAccess.lvLongElement(var3, var24) != var28) {
            }

            Object var30 = UnsafeRefArrayAccess.lpRefElement(var6, var26);
            UnsafeRefArrayAccess.spRefElement(var6, var26, null);
            UnsafeLongArrayAccess.soLongElement(var3, var24, var22 + var4 + 1L);
            var1.accept(var30);
         }

         var8 += var10;
      }

      return var2;
   }

   private int drainOneByOne(MessagePassingQueue.Consumer<E> var1, int var2) {
      long[] var3 = this.sequenceBuffer;
      long var4 = this.mask;
      Object[] var6 = this.buffer;

      for (int var15 = 0; var15 < var2; var15++) {
         long var7;
         long var9;
         long var11;
         long var13;
         do {
            var7 = this.lvConsumerIndex();
            var9 = UnsafeLongArrayAccess.calcCircularLongElementOffset(var7, var4);
            var11 = UnsafeLongArrayAccess.lvLongElement(var3, var9);
            var13 = var7 + 1L;
            if (var11 < var13) {
               return var15;
            }
         } while (var11 > var13 || !this.casConsumerIndex(var7, var7 + 1L));

         long var16 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var7, var4);
         Object var18 = UnsafeRefArrayAccess.lpRefElement(var6, var16);
         UnsafeRefArrayAccess.spRefElement(var6, var16, null);
         UnsafeLongArrayAccess.soLongElement(var3, var9, var7 + var4 + 1L);
         var1.accept(var18);
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

      long[] var3 = this.sequenceBuffer;
      long var4 = this.mask;
      Object[] var6 = this.buffer;
      int var7 = Math.min(this.lookAheadStep, var2);
      int var8 = 0;

      while (var8 < var2) {
         int var9 = var2 - var8;
         int var10 = Math.min(var9, var7);
         long var11 = this.lvProducerIndex();
         long var13 = var11 + var10 - 1L;
         long var15 = UnsafeLongArrayAccess.calcCircularLongElementOffset(var13, var4);
         long var17 = UnsafeLongArrayAccess.lvLongElement(var3, var15);
         long var19 = var13;
         if (var17 != var19 || !this.casProducerIndex(var11, var19 + 1L)) {
            return var17 < var19 && this.notAvailable(var11, var4, var3, var11) ? var8 : var8 + this.fillOneByOne(var1, var9);
         }

         for (int var21 = 0; var21 < var10; var21++) {
            long var22 = var11 + var21;
            long var24 = UnsafeLongArrayAccess.calcCircularLongElementOffset(var22, var4);
            long var26 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var22, var4);

            while (UnsafeLongArrayAccess.lvLongElement(var3, var24) != var22) {
            }

            UnsafeRefArrayAccess.soRefElement(var6, var26, var1.get());
            UnsafeLongArrayAccess.soLongElement(var3, var24, var22 + 1L);
         }

         var8 += var10;
      }

      return var2;
   }

   private boolean notAvailable(long var1, long var3, long[] var5, long var6) {
      long var8 = UnsafeLongArrayAccess.calcCircularLongElementOffset(var1, var3);
      long var10 = UnsafeLongArrayAccess.lvLongElement(var5, var8);
      return var10 < var6;
   }

   private int fillOneByOne(MessagePassingQueue.Supplier<E> var1, int var2) {
      long[] var3 = this.sequenceBuffer;
      long var4 = this.mask;
      Object[] var6 = this.buffer;

      for (int var13 = 0; var13 < var2; var13++) {
         long var7;
         long var9;
         long var11;
         do {
            var7 = this.lvProducerIndex();
            var9 = UnsafeLongArrayAccess.calcCircularLongElementOffset(var7, var4);
            var11 = UnsafeLongArrayAccess.lvLongElement(var3, var9);
            if (var11 < var7) {
               return var13;
            }
         } while (var11 > var7 || !this.casProducerIndex(var7, var7 + 1L));

         UnsafeRefArrayAccess.soRefElement(var6, UnsafeRefArrayAccess.calcCircularRefElementOffset(var7, var4), var1.get());
         UnsafeLongArrayAccess.soLongElement(var3, var9, var7 + 1L);
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
