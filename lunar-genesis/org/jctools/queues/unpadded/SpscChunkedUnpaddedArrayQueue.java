package org.jctools.queues.unpadded;

import org.jctools.queues.MessagePassingQueue;
import org.jctools.util.Pow2;
import org.jctools.util.RangeUtil;
import org.jctools.util.UnsafeRefArrayAccess;

public class SpscChunkedUnpaddedArrayQueue<E> extends BaseSpscLinkedUnpaddedArrayQueue<E> {
   private final int maxQueueCapacity;
   private long producerQueueLimit;

   public SpscChunkedUnpaddedArrayQueue(int var1) {
      this(Math.max(8, Pow2.roundToPowerOfTwo(var1 / 8)), var1);
   }

   public SpscChunkedUnpaddedArrayQueue(int var1, int var2) {
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
      this.producerQueueLimit = this.maxQueueCapacity;
   }

   @Override
   final boolean offerColdPath(E[] var1, long var2, long var4, long var6, E var8, MessagePassingQueue.Supplier<? extends E> var9) {
      long var10 = (var2 + 1L) / 4L;
      long var12 = var4 + var10;
      long var14 = this.producerQueueLimit;
      if (var4 >= var14) {
         long var16 = this.lvConsumerIndex();
         this.producerQueueLimit = var14 = var16 + this.maxQueueCapacity;
         if (var4 >= var14) {
            return false;
         }
      }

      if (var12 - var14 > 0L) {
         var12 = var14;
      }

      if (var12 > var4 + 1L && null == UnsafeRefArrayAccess.lvRefElement(var1, UnsafeRefArrayAccess.calcCircularRefElementOffset(var12, var2))) {
         this.producerBufferLimit = var12 - 1L;
         this.writeToQueue((E[])var1, (E)(var8 == null ? var9.get() : var8), var4, var6);
      } else if (null == UnsafeRefArrayAccess.lvRefElement(var1, UnsafeRefArrayAccess.calcCircularRefElementOffset(var4 + 1L, var2))) {
         this.writeToQueue((E[])var1, (E)(var8 == null ? var9.get() : var8), var4, var6);
      } else {
         Object[] var18 = UnsafeRefArrayAccess.allocateRefArray((int)(var2 + 2L));
         this.producerBuffer = (E[])var18;
         this.linkOldToNew(var4, (E[])var1, var6, (E[])var18, var6, (E)(var8 == null ? var9.get() : var8));
      }

      return true;
   }

   @Override
   public int capacity() {
      return this.maxQueueCapacity;
   }
}
