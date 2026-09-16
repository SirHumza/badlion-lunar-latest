package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

abstract class MpmcArrayQueueConsumerIndexField<E> extends MpmcArrayQueueL2Pad<E> {
   private static final long C_INDEX_OFFSET = UnsafeAccess.fieldOffset(MpmcArrayQueueConsumerIndexField.class, "consumerIndex");
   private volatile long consumerIndex;

   MpmcArrayQueueConsumerIndexField(int var1) {
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
