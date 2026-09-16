package org.jctools.queues.unpadded;

import org.jctools.util.UnsafeAccess;

abstract class MpscUnpaddedArrayQueueProducerLimitField<E> extends MpscUnpaddedArrayQueueMidPad<E> {
   private static final long P_LIMIT_OFFSET = UnsafeAccess.fieldOffset(MpscUnpaddedArrayQueueProducerLimitField.class, "producerLimit");
   private volatile long producerLimit;

   MpscUnpaddedArrayQueueProducerLimitField(int var1) {
      super(var1);
      this.producerLimit = var1;
   }

   final long lvProducerLimit() {
      return this.producerLimit;
   }

   final void soProducerLimit(long var1) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, P_LIMIT_OFFSET, var1);
   }
}
