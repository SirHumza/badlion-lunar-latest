package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jctools.queues.MessagePassingQueue;
import org.jctools.util.Pow2;

public class SpscUnboundedAtomicArrayQueue<E> extends BaseSpscLinkedAtomicArrayQueue<E> {
   public SpscUnboundedAtomicArrayQueue(int var1) {
      int var2 = Math.max(Pow2.roundToPowerOfTwo(var1), 16);
      long var3 = var2 - 1;
      AtomicReferenceArray var5 = AtomicQueueUtil.allocateRefArray(var2 + 1);
      this.producerBuffer = var5;
      this.producerMask = var3;
      this.consumerBuffer = var5;
      this.consumerMask = var3;
      this.producerBufferLimit = var3 - 1L;
   }

   @Override
   final boolean offerColdPath(AtomicReferenceArray<E> var1, long var2, long var4, int var6, E var7, MessagePassingQueue.Supplier<? extends E> var8) {
      long var9 = (var2 + 1L) / 4L;
      long var11 = var4 + var9;
      if (null == AtomicQueueUtil.lvRefElement(var1, AtomicQueueUtil.calcCircularRefElementOffset(var11, var2))) {
         this.producerBufferLimit = var11 - 1L;
         this.writeToQueue(var1, (E)(var7 == null ? var8.get() : var7), var4, var6);
      } else if (null == AtomicQueueUtil.lvRefElement(var1, AtomicQueueUtil.calcCircularRefElementOffset(var4 + 1L, var2))) {
         this.writeToQueue(var1, (E)(var7 == null ? var8.get() : var7), var4, var6);
      } else {
         AtomicReferenceArray var13 = AtomicQueueUtil.allocateRefArray((int)(var2 + 2L));
         this.producerBuffer = var13;
         this.producerBufferLimit = var4 + var2 - 1L;
         this.linkOldToNew(var4, var1, var6, var13, var6, (E)(var7 == null ? var8.get() : var7));
      }

      return true;
   }

   @Override
   public int fill(MessagePassingQueue.Supplier<E> var1) {
      return this.fill(var1, (int)this.producerMask);
   }

   @Override
   public int capacity() {
      return -1;
   }
}
