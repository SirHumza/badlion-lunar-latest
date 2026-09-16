package org.jctools.queues.unpadded;

import org.jctools.queues.MessagePassingQueue;
import org.jctools.util.Pow2;
import org.jctools.util.UnsafeRefArrayAccess;

public class SpscUnboundedUnpaddedArrayQueue<E> extends BaseSpscLinkedUnpaddedArrayQueue<E> {
   public SpscUnboundedUnpaddedArrayQueue(int var1) {
      int var2 = Math.max(Pow2.roundToPowerOfTwo(var1), 16);
      long var3 = var2 - 1;
      Object[] var5 = UnsafeRefArrayAccess.allocateRefArray(var2 + 1);
      this.producerBuffer = (E[])var5;
      this.producerMask = var3;
      this.consumerBuffer = (E[])var5;
      this.consumerMask = var3;
      this.producerBufferLimit = var3 - 1L;
   }

   @Override
   final boolean offerColdPath(E[] var1, long var2, long var4, long var6, E var8, MessagePassingQueue.Supplier<? extends E> var9) {
      long var10 = (var2 + 1L) / 4L;
      long var12 = var4 + var10;
      if (null == UnsafeRefArrayAccess.lvRefElement(var1, UnsafeRefArrayAccess.calcCircularRefElementOffset(var12, var2))) {
         this.producerBufferLimit = var12 - 1L;
         this.writeToQueue((E[])var1, (E)(var8 == null ? var9.get() : var8), var4, var6);
      } else if (null == UnsafeRefArrayAccess.lvRefElement(var1, UnsafeRefArrayAccess.calcCircularRefElementOffset(var4 + 1L, var2))) {
         this.writeToQueue((E[])var1, (E)(var8 == null ? var9.get() : var8), var4, var6);
      } else {
         Object[] var14 = UnsafeRefArrayAccess.allocateRefArray((int)(var2 + 2L));
         this.producerBuffer = (E[])var14;
         this.producerBufferLimit = var4 + var2 - 1L;
         this.linkOldToNew(var4, (E[])var1, var6, (E[])var14, var6, (E)(var8 == null ? var9.get() : var8));
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
