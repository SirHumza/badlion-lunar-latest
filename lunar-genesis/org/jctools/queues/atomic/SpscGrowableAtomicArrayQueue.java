package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jctools.queues.MessagePassingQueue;
import org.jctools.util.Pow2;
import org.jctools.util.RangeUtil;
import org.jctools.util.SpscLookAheadUtil;

public class SpscGrowableAtomicArrayQueue<E> extends BaseSpscLinkedAtomicArrayQueue<E> {
   private final int maxQueueCapacity;
   private long lookAheadStep;

   public SpscGrowableAtomicArrayQueue(int var1) {
      this(Math.max(8, Pow2.roundToPowerOfTwo(var1 / 8)), var1);
   }

   public SpscGrowableAtomicArrayQueue(int var1, int var2) {
      RangeUtil.checkGreaterThanOrEqual(var2, 16, "capacity");
      RangeUtil.checkGreaterThanOrEqual(var1, 8, "chunkSize");
      this.maxQueueCapacity = Pow2.roundToPowerOfTwo(var2);
      int var3 = Pow2.roundToPowerOfTwo(var1);
      RangeUtil.checkLessThan(var3, this.maxQueueCapacity, "chunkCapacity");
      long var4 = var3 - 1;
      AtomicReferenceArray var6 = AtomicQueueUtil.allocateRefArray(var3 + 1);
      this.producerBuffer = var6;
      this.producerMask = var4;
      this.consumerBuffer = var6;
      this.consumerMask = var4;
      this.producerBufferLimit = var4 - 1L;
      this.adjustLookAheadStep(var3);
   }

   @Override
   final boolean offerColdPath(AtomicReferenceArray<E> var1, long var2, long var4, int var6, E var7, MessagePassingQueue.Supplier<? extends E> var8) {
      long var9 = this.lookAheadStep;
      if (var9 > 0L) {
         int var19 = AtomicQueueUtil.calcCircularRefElementOffset(var4 + var9, var2);
         if (null == AtomicQueueUtil.lvRefElement(var1, var19)) {
            this.producerBufferLimit = var4 + var9 - 1L;
            this.writeToQueue(var1, (E)(var7 == null ? var8.get() : var7), var4, var6);
            return true;
         }

         int var12 = this.maxQueueCapacity;
         if (var2 + 1L == var12) {
            if (null == AtomicQueueUtil.lvRefElement(var1, var6)) {
               this.writeToQueue(var1, (E)(var7 == null ? var8.get() : var7), var4, var6);
               return true;
            } else {
               return false;
            }
         } else {
            if (null == AtomicQueueUtil.lvRefElement(var1, AtomicQueueUtil.calcCircularRefElementOffset(var4 + 1L, var2))) {
               this.writeToQueue(var1, (E)(var7 == null ? var8.get() : var7), var4, var6);
            } else {
               AtomicReferenceArray var20 = AtomicQueueUtil.allocateRefArray((int)(2L * (var2 + 1L) + 1L));
               this.producerBuffer = var20;
               this.producerMask = AtomicQueueUtil.length(var20) - 2;
               int var14 = AtomicQueueUtil.calcCircularRefElementOffset(var4, this.producerMask);
               this.linkOldToNew(var4, var1, var6, var20, var14, (E)(var7 == null ? var8.get() : var7));
               int var21 = (int)(this.producerMask + 1L);
               if (var21 == var12) {
                  long var22 = this.lvConsumerIndex();
                  this.lookAheadStep = -(var4 - var22);
                  this.producerBufferLimit = var22 + var12;
               } else {
                  this.producerBufferLimit = var4 + this.producerMask - 1L;
                  this.adjustLookAheadStep(var21);
               }
            }

            return true;
         }
      } else {
         long var11 = -var9;
         long var13 = this.lvConsumerIndex();
         int var15 = (int)(var4 - var13);
         int var16 = (int)var2 + 1;
         if (var15 == var16) {
            return false;
         }

         long var17 = this.producerBufferLimit - var16 + var11;
         if (var13 >= var17) {
            this.adjustLookAheadStep(var16);
         } else {
            this.lookAheadStep = (int)(var13 - var17);
         }

         this.producerBufferLimit = var13 + var16;
         this.writeToQueue(var1, (E)(var7 == null ? var8.get() : var7), var4, var6);
         return true;
      }
   }

   private void adjustLookAheadStep(int var1) {
      this.lookAheadStep = SpscLookAheadUtil.computeLookAheadStep(var1);
   }

   @Override
   public int capacity() {
      return this.maxQueueCapacity;
   }
}
