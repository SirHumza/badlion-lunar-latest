package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

abstract class SpscArrayQueueProducerIndexFields<E> extends SpscArrayQueueL1Pad<E> {
   private static final long P_INDEX_OFFSET = UnsafeAccess.fieldOffset(SpscArrayQueueProducerIndexFields.class, "producerIndex");
   private volatile long producerIndex;
   protected long producerLimit;

   SpscArrayQueueProducerIndexFields(int var1) {
      super(var1);
   }

   @Override
   public final long lvProducerIndex() {
      return this.producerIndex;
   }

   final long lpProducerIndex() {
      return UnsafeAccess.UNSAFE.getLong(this, P_INDEX_OFFSET);
   }

   final void soProducerIndex(long var1) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, var1);
   }
}
