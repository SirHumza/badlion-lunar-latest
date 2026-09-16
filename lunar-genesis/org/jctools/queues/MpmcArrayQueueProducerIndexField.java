package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

abstract class MpmcArrayQueueProducerIndexField<E> extends MpmcArrayQueueL1Pad<E> {
   private static final long P_INDEX_OFFSET = UnsafeAccess.fieldOffset(MpmcArrayQueueProducerIndexField.class, "producerIndex");
   private volatile long producerIndex;

   MpmcArrayQueueProducerIndexField(int var1) {
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
