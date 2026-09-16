package org.jctools.queues;

import java.util.Iterator;
import org.jctools.util.PortableJvmInfo;
import org.jctools.util.Pow2;
import org.jctools.util.UnsafeAccess;

abstract class MpUnboundedXaddArrayQueue<R extends MpUnboundedXaddChunk<R, E>, E>
   extends MpUnboundedXaddArrayQueuePad5<R, E>
   implements MessagePassingQueue<E>,
   QueueProgressIndicators {
   private static final long ROTATION = -2L;
   final int chunkMask;
   final int chunkShift;
   final int maxPooledChunks;
   final SpscArrayQueue<R> freeChunksPool;

   MpUnboundedXaddArrayQueue(int var1, int var2) {
      if (!UnsafeAccess.SUPPORTS_GET_AND_ADD_LONG) {
         throw new IllegalStateException("Unsafe::getAndAddLong support (JDK 8+) is required for this queue to work");
      }

      if (var2 < 0) {
         throw new IllegalArgumentException("Expecting a positive maxPooledChunks, but got:" + var2);
      }

      var1 = Pow2.roundToPowerOfTwo(var1);
      this.chunkMask = var1 - 1;
      this.chunkShift = Integer.numberOfTrailingZeros(var1);
      this.freeChunksPool = new SpscArrayQueue(var2);
      MpUnboundedXaddChunk var3 = this.newChunk(0L, null, var1, var2 > 0);
      this.soProducerChunk((R)var3);
      this.soProducerChunkIndex(0L);
      this.soConsumerChunk((R)var3);

      for (int var4 = 1; var4 < var2; var4++) {
         this.freeChunksPool.offer(this.newChunk(-1L, null, var1, true));
      }

      this.maxPooledChunks = var2;
   }

   public final int chunkSize() {
      return this.chunkMask + 1;
   }

   public final int maxPooledChunks() {
      return this.maxPooledChunks;
   }

   abstract R newChunk(long var1, R var3, int var4, boolean var5);

   @Override
   public long currentProducerIndex() {
      return this.lvProducerIndex();
   }

   @Override
   public long currentConsumerIndex() {
      return this.lvConsumerIndex();
   }

   final R producerChunkForIndex(R var1, long var2) {
      MpUnboundedXaddChunk var4 = var1;

      while (true) {
         if (var4 == null) {
            var4 = this.lvProducerChunk();
         }

         long var7 = var4.lvIndex();
         assert var7 != -1L;
         long var5 = var7 - var2;
         if (var5 >= 0L) {
            for (long var9 = 0L; var9 < var5; var9++) {
               var4 = (MpUnboundedXaddChunk)var4.lvPrev();
               assert var4 != null;
            }

            assert var4.lvIndex() == var2;
            return (R)var4;
         }

         if (this.lvProducerChunkIndex() == var7) {
            var4 = this.appendNextChunks((R)var4, var7, -var5);
         } else {
            var4 = null;
         }
      }
   }

   protected final R appendNextChunks(R var1, long var2, long var4) {
      assert var2 != -1L;
      if (!this.casProducerChunkIndex(var2, -2L)) {
         return null;
      }

      assert var2 == var1.lvIndex();

      for (long var6 = 1L; var6 <= var4; var6++) {
         MpUnboundedXaddChunk var8 = this.newOrPooledChunk((R)var1, var2 + var6);
         this.soProducerChunk((R)var8);
         var1.soNext(var8);
         var1 = var8;
      }

      this.soProducerChunkIndex(var2 + var4);
      return (R)var1;
   }

   private R newOrPooledChunk(R var1, long var2) {
      MpUnboundedXaddChunk var4 = this.freeChunksPool.poll();
      if (var4 != null) {
         assert var4.lvIndex() < var1.lvIndex();
         var4.soPrev(var1);
         var4.soIndex(var2);
      } else {
         var4 = this.newChunk(var2, (R)var1, this.chunkMask + 1, false);
      }

      return (R)var4;
   }

   final void moveToNextConsumerChunk(R var1, R var2) {
      var1.soNext(null);
      var2.soPrev(null);
      if (var1.isPooled()) {
         boolean var3 = this.freeChunksPool.offer((R)var1);
         assert var3;
      }

      this.soConsumerChunk((R)var2);
   }

   @Override
   public Iterator<E> iterator() {
      throw new UnsupportedOperationException();
   }

   @Override
   public int size() {
      return IndexedQueueSizeUtil.size(this, 1);
   }

   @Override
   public boolean isEmpty() {
      return IndexedQueueSizeUtil.isEmpty(this);
   }

   @Override
   public int capacity() {
      return -1;
   }

   @Override
   public boolean relaxedOffer(E var1) {
      return this.offer((E)var1);
   }

   @Override
   public int drain(MessagePassingQueue.Consumer<E> var1) {
      return MessagePassingQueueUtil.drain(this, var1);
   }

   @Override
   public int fill(MessagePassingQueue.Supplier<E> var1) {
      int var2 = this.chunkMask + 1;
      int var3 = Math.min(PortableJvmInfo.RECOMENDED_OFFER_BATCH, var2);
      return MessagePassingQueueUtil.fillInBatchesToLimit(this, var1, var3, var2);
   }

   @Override
   public int drain(MessagePassingQueue.Consumer<E> var1, int var2) {
      return MessagePassingQueueUtil.drain(this, var1, var2);
   }

   @Override
   public void drain(MessagePassingQueue.Consumer<E> var1, MessagePassingQueue.WaitStrategy var2, MessagePassingQueue.ExitCondition var3) {
      MessagePassingQueueUtil.drain(this, var1, var2, var3);
   }

   @Override
   public void fill(MessagePassingQueue.Supplier<E> var1, MessagePassingQueue.WaitStrategy var2, MessagePassingQueue.ExitCondition var3) {
      MessagePassingQueueUtil.fill(this, var1, var2, var3);
   }

   @Override
   public String toString() {
      return this.getClass().getName();
   }
}
