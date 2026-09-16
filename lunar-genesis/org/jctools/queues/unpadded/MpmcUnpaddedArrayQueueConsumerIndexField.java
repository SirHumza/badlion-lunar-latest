package org.jctools.queues.unpadded;

import org.jctools.util.UnsafeAccess;

abstract class MpmcUnpaddedArrayQueueConsumerIndexField<E> extends MpmcUnpaddedArrayQueueL2Pad<E> {
   private static final long C_INDEX_OFFSET = UnsafeAccess.fieldOffset(MpmcUnpaddedArrayQueueConsumerIndexField.class, "consumerIndex");
   private volatile long consumerIndex;

   MpmcUnpaddedArrayQueueConsumerIndexField(int var1) {
      super(var1);
   }

   @Override
   public final long lvConsumerIndex() {
      return this.consumerIndex;
   }

   final boolean casConsumerIndex(long var1, long var3) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, C_INDEX_OFFSET, var1, var3);
   }
}
