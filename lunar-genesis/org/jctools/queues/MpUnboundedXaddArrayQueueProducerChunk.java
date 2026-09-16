package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

abstract class MpUnboundedXaddArrayQueueProducerChunk<R extends MpUnboundedXaddChunk<R, E>, E> extends MpUnboundedXaddArrayQueuePad2<E> {
   private static final long P_CHUNK_OFFSET = UnsafeAccess.fieldOffset(MpUnboundedXaddArrayQueueProducerChunk.class, "producerChunk");
   private static final long P_CHUNK_INDEX_OFFSET = UnsafeAccess.fieldOffset(MpUnboundedXaddArrayQueueProducerChunk.class, "producerChunkIndex");
   private volatile R producerChunk;
   private volatile long producerChunkIndex;

   final long lvProducerChunkIndex() {
      return this.producerChunkIndex;
   }

   final boolean casProducerChunkIndex(long var1, long var3) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_CHUNK_INDEX_OFFSET, var1, var3);
   }

   final void soProducerChunkIndex(long var1) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, P_CHUNK_INDEX_OFFSET, var1);
   }

   final R lvProducerChunk() {
      return this.producerChunk;
   }

   final void soProducerChunk(R var1) {
      UnsafeAccess.UNSAFE.putOrderedObject(this, P_CHUNK_OFFSET, var1);
   }
}
