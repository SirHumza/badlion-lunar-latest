package org.jctools.queues.atomic;

import org.jctools.util.SpscLookAheadUtil;

abstract class SpscAtomicArrayQueueColdField<E> extends AtomicReferenceArrayQueue<E> {
   final int lookAheadStep;

   SpscAtomicArrayQueueColdField(int var1) {
      super(var1);
      int var2 = this.capacity();
      this.lookAheadStep = SpscLookAheadUtil.computeLookAheadStep(var2);
   }
}
