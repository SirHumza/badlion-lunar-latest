package org.jctools.queues;

import org.jctools.util.PortableJvmInfo;

public class MpscUnboundedXaddArrayQueue<E> extends MpUnboundedXaddArrayQueue<MpscUnboundedXaddChunk<E>, E> {
   public MpscUnboundedXaddArrayQueue(int var1, int var2) {
      super(var1, var2);
   }

   public MpscUnboundedXaddArrayQueue(int var1) {
      this(var1, 2);
   }

   final MpscUnboundedXaddChunk<E> newChunk(long var1, MpscUnboundedXaddChunk<E> var3, int var4, boolean var5) {
      return new MpscUnboundedXaddChunk<>(var1, var3, var4, var5);
   }

   @Override
   public boolean offer(E var1) {
      if (null == var1) {
         throw new NullPointerException();
      }

      int var2 = this.chunkMask;
      int var3 = this.chunkShift;
      long var4 = this.getAndIncrementProducerIndex();
      int var6 = (int)(var4 & var2);
      long var7 = var4 >> var3;
      MpscUnboundedXaddChunk var9 = this.lvProducerChunk();
      if (var9.lvIndex() != var7) {
         var9 = this.producerChunkForIndex(var9, var7);
      }

      var9.soElement(var6, var1);
      return true;
   }

   private MpscUnboundedXaddChunk<E> pollNextBuffer(MpscUnboundedXaddChunk<E> var1, long var2) {
      MpscUnboundedXaddChunk var4 = this.spinForNextIfNotEmpty(var1, var2);
      if (var4 == null) {
         return null;
      }

      this.moveToNextConsumerChunk(var1, var4);
      assert var4.lvIndex() == var2 >> this.chunkShift;
      return var4;
   }

   private MpscUnboundedXaddChunk<E> spinForNextIfNotEmpty(MpscUnboundedXaddChunk<E> var1, long var2) {
      MpscUnboundedXaddChunk var4 = var1.lvNext();
      if (var4 == null) {
         if (this.lvProducerIndex() == var2) {
            return null;
         }

         long var5 = var1.lvIndex();
         if (this.lvProducerChunkIndex() == var5) {
            var4 = this.appendNextChunks(var1, var5, 1L);
         }

         while (var4 == null) {
            var4 = var1.lvNext();
         }
      }

      return var4;
   }

   @Override
   public E poll() {
      int var1 = this.chunkMask;
      long var2 = this.lpConsumerIndex();
      int var4 = (int)(var2 & var1);
      MpscUnboundedXaddChunk var5 = this.lvConsumerChunk();
      if (var4 == 0 && var2 != 0L) {
         var5 = this.pollNextBuffer(var5, var2);
         if (var5 == null) {
            return null;
         }
      }

      Object var6 = var5.lvElement(var4);
      if (var6 == null) {
         if (this.lvProducerIndex() == var2) {
            return null;
         }

         var6 = var5.spinForElement(var4, false);
      }

      var5.soElement(var4, null);
      this.soConsumerIndex(var2 + 1L);
      return (E)var6;
   }

   @Override
   public E peek() {
      int var1 = this.chunkMask;
      long var2 = this.lpConsumerIndex();
      int var4 = (int)(var2 & var1);
      MpscUnboundedXaddChunk var5 = this.lpConsumerChunk();
      if (var4 == 0 && var2 != 0L) {
         var5 = this.spinForNextIfNotEmpty(var5, var2);
         if (var5 == null) {
            return null;
         }
      }

      Object var6 = var5.lvElement(var4);
      if (var6 == null) {
         if (this.lvProducerIndex() == var2) {
            return null;
         }

         var6 = var5.spinForElement(var4, false);
      }

      return (E)var6;
   }

   @Override
   public E relaxedPoll() {
      int var1 = this.chunkMask;
      long var2 = this.lpConsumerIndex();
      int var4 = (int)(var2 & var1);
      MpscUnboundedXaddChunk var5 = this.lpConsumerChunk();
      Object var6;
      if (var4 == 0 && var2 != 0L) {
         MpscUnboundedXaddChunk var7 = var5.lvNext();
         if (var7 == null) {
            return null;
         }

         var6 = var7.lvElement(0);
         if (var6 == null) {
            return null;
         }

         this.moveToNextConsumerChunk(var5, var7);
         var5 = var7;
      } else {
         var6 = var5.lvElement(var4);
         if (var6 == null) {
            return null;
         }
      }

      var5.soElement(var4, null);
      this.soConsumerIndex(var2 + 1L);
      return (E)var6;
   }

   @Override
   public E relaxedPeek() {
      int var1 = this.chunkMask;
      long var2 = this.lpConsumerIndex();
      int var4 = (int)(var2 & var1);
      MpscUnboundedXaddChunk var5 = this.lpConsumerChunk();
      if (var4 == 0 && var2 != 0L) {
         var5 = var5.lvNext();
         if (var5 == null) {
            return null;
         }
      }

      return var5.lvElement(var4);
   }

   @Override
   public int fill(MessagePassingQueue.Supplier<E> var1) {
      long var2 = 0L;
      int var4 = this.chunkMask + 1;
      int var5 = Math.min(PortableJvmInfo.RECOMENDED_OFFER_BATCH, var4);

      do {
         int var6 = this.fill(var1, var5);
         if (var6 == 0) {
            return (int)var2;
         }

         var2 += var6;
      } while (var2 <= var4);

      return (int)var2;
   }

   @Override
   public int drain(MessagePassingQueue.Consumer<E> var1, int var2) {
      if (null == var1) {
         throw new IllegalArgumentException("c is null");
      }

      if (var2 < 0) {
         throw new IllegalArgumentException("limit is negative: " + var2);
      }

      if (var2 == 0) {
         return 0;
      }

      int var3 = this.chunkMask;
      long var4 = this.lpConsumerIndex();
      MpscUnboundedXaddChunk var6 = this.lpConsumerChunk();

      for (int var7 = 0; var7 < var2; var7++) {
         int var8 = (int)(var4 & var3);
         Object var9;
         if (var8 == 0 && var4 != 0L) {
            MpscUnboundedXaddChunk var10 = var6.lvNext();
            if (var10 == null) {
               return var7;
            }

            var9 = var10.lvElement(0);
            if (var9 == null) {
               return var7;
            }

            this.moveToNextConsumerChunk(var6, var10);
            var6 = var10;
         } else {
            var9 = var6.lvElement(var8);
            if (var9 == null) {
               return var7;
            }
         }

         var6.soElement(var8, null);
         long var12 = var4 + 1L;
         this.soConsumerIndex(var12);
         var1.accept(var9);
         var4 = var12;
      }

      return var2;
   }

   @Override
   public int fill(MessagePassingQueue.Supplier<E> var1, int var2) {
      if (null == var1) {
         throw new IllegalArgumentException("supplier is null");
      }

      if (var2 < 0) {
         throw new IllegalArgumentException("limit is negative:" + var2);
      }

      if (var2 == 0) {
         return 0;
      }

      int var3 = this.chunkShift;
      int var4 = this.chunkMask;
      long var5 = this.getAndAddProducerIndex(var2);
      MpscUnboundedXaddChunk var7 = null;

      for (int var8 = 0; var8 < var2; var8++) {
         int var9 = (int)(var5 & var4);
         long var10 = var5 >> var3;
         if (var7 == null || var7.lvIndex() != var10) {
            var7 = this.producerChunkForIndex(var7, var10);
         }

         var7.soElement(var9, var1.get());
         var5++;
      }

      return var2;
   }
}
