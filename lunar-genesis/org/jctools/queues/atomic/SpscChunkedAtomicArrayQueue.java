package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jctools.queues.MessagePassingQueue;
import org.jctools.util.Pow2;
import org.jctools.util.RangeUtil;

public class SpscChunkedAtomicArrayQueue<E> extends BaseSpscLinkedAtomicArrayQueue<E> {
   private final int maxQueueCapacity;
   private long producerQueueLimit;

   public SpscChunkedAtomicArrayQueue(int var1) {
      this(Math.max(8, Pow2.roundToPowerOfTwo(var1 / 8)), var1);
   }

   public SpscChunkedAtomicArrayQueue(int var1, int var2) {
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
      this.producerQueueLimit = this.maxQueueCapacity;
   }

   @Override
   final boolean offerColdPath(AtomicReferenceArray<E> var1, long var2, long var4, int var6, E var7, MessagePassingQueue.Supplier<? extends E> var8) {
      long var9 = (var2 + 1L) / 4L;
      long var11 = var4 + var9;
      long var13 = this.producerQueueLimit;
      if (var4 >= var13) {
         long var15 = this.lvConsumerIndex();
         this.producerQueueLimit = var13 = var15 + this.maxQueueCapacity;
         if (var4 >= var13) {
            return false;
         }
      }

      if (var11 - var13 > 0L) {
         var11 = var13;
      }

      if (var11 > var4 + 1L && null == AtomicQueueUtil.lvRefElement(var1, AtomicQueueUtil.calcCircularRefElementOffset(var11, var2))) {
         this.producerBufferLimit = var11 - 1L;
         this.writeToQueue(var1, (E)(var7 == null ? var8.get() : var7), var4, var6);
      } else if (null == AtomicQueueUtil.lvRefElement(var1, AtomicQueueUtil.calcCircularRefElementOffset(var4 + 1L, var2))) {
         this.writeToQueue(var1, (E)(var7 == null ? var8.get() : var7), var4, var6);
      } else {
         AtomicReferenceArray var17 = AtomicQueueUtil.allocateRefArray((int)(var2 + 2L));
         this.producerBuffer = var17;
         this.linkOldToNew(var4, var1, var6, var17, var6, (E)(var7 == null ? var8.get() : var7));
      }

      return true;
   }

   @Override
   public int capacity() {
      return this.maxQueueCapacity;
   }
}
