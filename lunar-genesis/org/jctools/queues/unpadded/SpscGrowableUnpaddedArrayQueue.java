package org.jctools.queues.unpadded;

import org.jctools.queues.LinkedArrayQueueUtil;
import org.jctools.queues.MessagePassingQueue;
import org.jctools.util.Pow2;
import org.jctools.util.RangeUtil;
import org.jctools.util.SpscLookAheadUtil;
import org.jctools.util.UnsafeRefArrayAccess;

public class SpscGrowableUnpaddedArrayQueue<E> extends BaseSpscLinkedUnpaddedArrayQueue<E> {
   private final int maxQueueCapacity;
   private long lookAheadStep;

   public SpscGrowableUnpaddedArrayQueue(int var1) {
      this(Math.max(8, Pow2.roundToPowerOfTwo(var1 / 8)), var1);
   }

   public SpscGrowableUnpaddedArrayQueue(int var1, int var2) {
      RangeUtil.checkGreaterThanOrEqual(var2, 16, "capacity");
      RangeUtil.checkGreaterThanOrEqual(var1, 8, "chunkSize");
      this.maxQueueCapacity = Pow2.roundToPowerOfTwo(var2);
      int var3 = Pow2.roundToPowerOfTwo(var1);
      RangeUtil.checkLessThan(var3, this.maxQueueCapacity, "chunkCapacity");
      long var4 = var3 - 1;
      Object[] var6 = UnsafeRefArrayAccess.allocateRefArray(var3 + 1);
      this.producerBuffer = (E[])var6;
      this.producerMask = var4;
      this.consumerBuffer = (E[])var6;
      this.consumerMask = var4;
      this.producerBufferLimit = var4 - 1L;
      this.adjustLookAheadStep(var3);
   }

   @Override
   final boolean offerColdPath(E[] var1, long var2, long var4, long var6, E var8, MessagePassingQueue.Supplier<? extends E> var9) {
      long var10 = this.lookAheadStep;
      if (var10 > 0L) {
         long var21 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var4 + var10, var2);
         if (null == UnsafeRefArrayAccess.lvRefElement(var1, var21)) {
            this.producerBufferLimit = var4 + var10 - 1L;
            this.writeToQueue((E[])var1, (E)(var8 == null ? var9.get() : var8), var4, var6);
            return true;
         }

         int var22 = this.maxQueueCapacity;
         if (var2 + 1L == var22) {
            if (null == UnsafeRefArrayAccess.lvRefElement(var1, var6)) {
               this.writeToQueue((E[])var1, (E)(var8 == null ? var9.get() : var8), var4, var6);
               return true;
            } else {
               return false;
            }
         } else {
            if (null == UnsafeRefArrayAccess.lvRefElement(var1, UnsafeRefArrayAccess.calcCircularRefElementOffset(var4 + 1L, var2))) {
               this.writeToQueue((E[])var1, (E)(var8 == null ? var9.get() : var8), var4, var6);
            } else {
               Object[] var15 = UnsafeRefArrayAccess.allocateRefArray((int)(2L * (var2 + 1L) + 1L));
               this.producerBuffer = (E[])var15;
               this.producerMask = LinkedArrayQueueUtil.length(var15) - 2;
               long var23 = UnsafeRefArrayAccess.calcCircularRefElementOffset(var4, this.producerMask);
               this.linkOldToNew(var4, (E[])var1, var6, (E[])var15, var23, (E)(var8 == null ? var9.get() : var8));
               int var24 = (int)(this.producerMask + 1L);
               if (var24 == var22) {
                  long var19 = this.lvConsumerIndex();
                  this.lookAheadStep = -(var4 - var19);
                  this.producerBufferLimit = var19 + var22;
               } else {
                  this.producerBufferLimit = var4 + this.producerMask - 1L;
                  this.adjustLookAheadStep(var24);
               }
            }

            return true;
         }
      } else {
         long var12 = -var10;
         long var14 = this.lvConsumerIndex();
         int var16 = (int)(var4 - var14);
         int var17 = (int)var2 + 1;
         if (var16 == var17) {
            return false;
         }

         long var18 = this.producerBufferLimit - var17 + var12;
         if (var14 >= var18) {
            this.adjustLookAheadStep(var17);
         } else {
            this.lookAheadStep = (int)(var14 - var18);
         }

         this.producerBufferLimit = var14 + var17;
         this.writeToQueue((E[])var1, (E)(var8 == null ? var9.get() : var8), var4, var6);
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
