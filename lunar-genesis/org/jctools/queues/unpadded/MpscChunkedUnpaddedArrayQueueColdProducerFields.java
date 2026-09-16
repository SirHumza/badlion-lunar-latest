package org.jctools.queues.unpadded;

import org.jctools.util.Pow2;
import org.jctools.util.RangeUtil;

abstract class MpscChunkedUnpaddedArrayQueueColdProducerFields<E> extends BaseMpscLinkedUnpaddedArrayQueue<E> {
   protected final long maxQueueCapacity;

   MpscChunkedUnpaddedArrayQueueColdProducerFields(int var1, int var2) {
      super(var1);
      RangeUtil.checkGreaterThanOrEqual(var2, 4, "maxCapacity");
      RangeUtil.checkLessThan(Pow2.roundToPowerOfTwo(var1), Pow2.roundToPowerOfTwo(var2), "initialCapacity");
      this.maxQueueCapacity = (long)Pow2.roundToPowerOfTwo(var2) << 1;
   }
}
