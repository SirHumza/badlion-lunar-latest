package org.jctools.queues.unpadded;

import org.jctools.queues.LinkedArrayQueueUtil;
import org.jctools.util.Pow2;

public class MpscChunkedUnpaddedArrayQueue<E> extends MpscChunkedUnpaddedArrayQueueColdProducerFields<E> {
   public MpscChunkedUnpaddedArrayQueue(int var1) {
      super(Math.max(2, Math.min(1024, Pow2.roundToPowerOfTwo(var1 / 8))), var1);
   }

   public MpscChunkedUnpaddedArrayQueue(int var1, int var2) {
      super(var1, var2);
   }

   @Override
   protected long availableInQueue(long var1, long var3) {
      return this.maxQueueCapacity - (var1 - var3);
   }

   @Override
   public int capacity() {
      return (int)(this.maxQueueCapacity / 2L);
   }

   @Override
   protected int getNextBufferSize(E[] var1) {
      return LinkedArrayQueueUtil.length(var1);
   }

   @Override
   protected long getCurrentBufferCapacity(long var1) {
      return var1;
   }
}
