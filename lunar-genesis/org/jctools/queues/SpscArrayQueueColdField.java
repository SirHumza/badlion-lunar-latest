package org.jctools.queues;

import org.jctools.util.SpscLookAheadUtil;

abstract class SpscArrayQueueColdField<E> extends ConcurrentCircularArrayQueue<E> {
   final int lookAheadStep;

   SpscArrayQueueColdField(int var1) {
      super(var1);
      int var2 = this.capacity();
      this.lookAheadStep = SpscLookAheadUtil.computeLookAheadStep(var2);
   }
}
