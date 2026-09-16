package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

abstract class SpscArrayQueueConsumerIndexField<E> extends SpscArrayQueueL2Pad<E> {
   private static final long C_INDEX_OFFSET = UnsafeAccess.fieldOffset(SpscArrayQueueConsumerIndexField.class, "consumerIndex");
   private volatile long consumerIndex;

   SpscArrayQueueConsumerIndexField(int var1) {
      super(var1);
   }

   @Override
   public final long lvConsumerIndex() {
      return UnsafeAccess.UNSAFE.getLongVolatile(this, C_INDEX_OFFSET);
   }

   final long lpConsumerIndex() {
      return UnsafeAccess.UNSAFE.getLong(this, C_INDEX_OFFSET);
   }

   final void soConsumerIndex(long var1) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, C_INDEX_OFFSET, var1);
   }
}
