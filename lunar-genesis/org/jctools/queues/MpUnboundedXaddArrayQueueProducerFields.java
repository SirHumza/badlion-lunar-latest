package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

abstract class MpUnboundedXaddArrayQueueProducerFields<E> extends MpUnboundedXaddArrayQueuePad1<E> {
   private static final long P_INDEX_OFFSET = UnsafeAccess.fieldOffset(MpUnboundedXaddArrayQueueProducerFields.class, "producerIndex");
   private volatile long producerIndex;

   @Override
   public final long lvProducerIndex() {
      return this.producerIndex;
   }

   final long getAndIncrementProducerIndex() {
      return UnsafeAccess.UNSAFE.getAndAddLong(this, P_INDEX_OFFSET, 1L);
   }

   final long getAndAddProducerIndex(long var1) {
      return UnsafeAccess.UNSAFE.getAndAddLong(this, P_INDEX_OFFSET, var1);
   }
}
