package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

abstract class MpscBlockingConsumerArrayQueueProducerFields<E> extends MpscBlockingConsumerArrayQueuePad2<E> {
   private static final long P_INDEX_OFFSET = UnsafeAccess.fieldOffset(MpscBlockingConsumerArrayQueueProducerFields.class, "producerIndex");
   private volatile long producerIndex;

   MpscBlockingConsumerArrayQueueProducerFields(long var1, E[] var3) {
      super(var1, (E[])var3);
   }

   @Override
   public final long lvProducerIndex() {
      return this.producerIndex;
   }

   final void soProducerIndex(long var1) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, var1);
   }

   final boolean casProducerIndex(long var1, long var3) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_INDEX_OFFSET, var1, var3);
   }
}
