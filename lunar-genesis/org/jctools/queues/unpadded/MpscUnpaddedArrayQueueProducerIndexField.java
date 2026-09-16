package org.jctools.queues.unpadded;

import org.jctools.util.UnsafeAccess;

abstract class MpscUnpaddedArrayQueueProducerIndexField<E> extends MpscUnpaddedArrayQueueL1Pad<E> {
   private static final long P_INDEX_OFFSET = UnsafeAccess.fieldOffset(MpscUnpaddedArrayQueueProducerIndexField.class, "producerIndex");
   private volatile long producerIndex;

   MpscUnpaddedArrayQueueProducerIndexField(int var1) {
      super(var1);
   }

   @Override
   public final long lvProducerIndex() {
      return this.producerIndex;
   }

   final boolean casProducerIndex(long var1, long var3) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_INDEX_OFFSET, var1, var3);
   }
}
