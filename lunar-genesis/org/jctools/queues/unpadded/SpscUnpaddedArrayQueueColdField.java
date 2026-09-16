package org.jctools.queues.unpadded;

import org.jctools.util.SpscLookAheadUtil;

abstract class SpscUnpaddedArrayQueueColdField<E> extends ConcurrentCircularUnpaddedArrayQueue<E> {
   final int lookAheadStep;

   SpscUnpaddedArrayQueueColdField(int var1) {
      super(var1);
      int var2 = this.capacity();
      this.lookAheadStep = SpscLookAheadUtil.computeLookAheadStep(var2);
   }
}
