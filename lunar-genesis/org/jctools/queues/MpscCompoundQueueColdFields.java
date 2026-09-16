package org.jctools.queues;

import org.jctools.util.Pow2;
import org.jctools.util.RangeUtil;

abstract class MpscCompoundQueueColdFields<E> extends MpscCompoundQueueL0Pad<E> {
   protected final int parallelQueues;
   protected final int parallelQueuesMask;
   protected final MpscArrayQueue<E>[] queues;

   MpscCompoundQueueColdFields(int var1, int var2) {
      this.parallelQueues = Pow2.isPowerOfTwo(var2) ? var2 : Pow2.roundToPowerOfTwo(var2) / 2;
      this.parallelQueuesMask = this.parallelQueues - 1;
      this.queues = new MpscArrayQueue[this.parallelQueues];
      int var3 = Pow2.roundToPowerOfTwo(var1);
      RangeUtil.checkGreaterThanOrEqual(var3, this.parallelQueues, "fullCapacity");

      for (int var4 = 0; var4 < this.parallelQueues; var4++) {
         this.queues[var4] = new MpscArrayQueue<>(var3 / this.parallelQueues);
      }
   }
}
