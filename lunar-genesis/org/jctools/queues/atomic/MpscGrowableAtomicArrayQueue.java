package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jctools.util.Pow2;
import org.jctools.util.RangeUtil;

public class MpscGrowableAtomicArrayQueue<E> extends MpscChunkedAtomicArrayQueue<E> {
   public MpscGrowableAtomicArrayQueue(int var1) {
      super(Math.max(2, Pow2.roundToPowerOfTwo(var1 / 8)), var1);
   }

   public MpscGrowableAtomicArrayQueue(int var1, int var2) {
      super(var1, var2);
   }

   @Override
   protected int getNextBufferSize(AtomicReferenceArray<E> var1) {
      long var2 = this.maxQueueCapacity / 2L;
      RangeUtil.checkLessThanOrEqual(AtomicQueueUtil.length(var1), var2, "buffer.length");
      int var4 = 2 * (AtomicQueueUtil.length(var1) - 1);
      return var4 + 1;
   }

   @Override
   protected long getCurrentBufferCapacity(long var1) {
      return var1 + 2L == this.maxQueueCapacity ? this.maxQueueCapacity : var1;
   }
}
