package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

abstract class MpUnboundedXaddArrayQueueConsumerFields<R extends MpUnboundedXaddChunk<R, E>, E> extends MpUnboundedXaddArrayQueuePad3<R, E> {
   private static final long C_INDEX_OFFSET = UnsafeAccess.fieldOffset(MpUnboundedXaddArrayQueueConsumerFields.class, "consumerIndex");
   private static final long C_CHUNK_OFFSET = UnsafeAccess.fieldOffset(MpUnboundedXaddArrayQueueConsumerFields.class, "consumerChunk");
   private volatile long consumerIndex;
   private volatile R consumerChunk;

   @Override
   public final long lvConsumerIndex() {
      return this.consumerIndex;
   }

   final boolean casConsumerIndex(long var1, long var3) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, C_INDEX_OFFSET, var1, var3);
   }

   final R lpConsumerChunk() {
      return (R)UnsafeAccess.UNSAFE.getObject(this, C_CHUNK_OFFSET);
   }

   final R lvConsumerChunk() {
      return this.consumerChunk;
   }

   final void soConsumerChunk(R var1) {
      UnsafeAccess.UNSAFE.putOrderedObject(this, C_CHUNK_OFFSET, var1);
   }

   final long lpConsumerIndex() {
      return UnsafeAccess.UNSAFE.getLong(this, C_INDEX_OFFSET);
   }

   final void soConsumerIndex(long var1) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, C_INDEX_OFFSET, var1);
   }
}
