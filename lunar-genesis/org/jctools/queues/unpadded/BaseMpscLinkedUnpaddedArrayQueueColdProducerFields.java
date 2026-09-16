package org.jctools.queues.unpadded;

import org.jctools.util.UnsafeAccess;

abstract class BaseMpscLinkedUnpaddedArrayQueueColdProducerFields<E> extends BaseMpscLinkedUnpaddedArrayQueuePad3<E> {
   private static final long P_LIMIT_OFFSET = UnsafeAccess.fieldOffset(BaseMpscLinkedUnpaddedArrayQueueColdProducerFields.class, "producerLimit");
   private volatile long producerLimit;
   protected long producerMask;
   protected E[] producerBuffer;

   final long lvProducerLimit() {
      return this.producerLimit;
   }

   final boolean casProducerLimit(long var1, long var3) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_LIMIT_OFFSET, var1, var3);
   }

   final void soProducerLimit(long var1) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, P_LIMIT_OFFSET, var1);
   }
}
