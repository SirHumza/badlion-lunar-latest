package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

abstract class MpscBlockingConsumerArrayQueueColdProducerFields<E> extends MpscBlockingConsumerArrayQueuePad1<E> {
   private static final long P_LIMIT_OFFSET = UnsafeAccess.fieldOffset(MpscBlockingConsumerArrayQueueColdProducerFields.class, "producerLimit");
   private volatile long producerLimit;
   protected final long producerMask;
   protected final E[] producerBuffer;

   MpscBlockingConsumerArrayQueueColdProducerFields(long var1, E[] var3) {
      this.producerMask = var1;
      this.producerBuffer = (E[])var3;
   }

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
