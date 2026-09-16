package org.jctools.queues;

public class MpmcUnboundedXaddArrayQueue<E> extends MpUnboundedXaddArrayQueue<MpmcUnboundedXaddChunk<E>, E> {
   public MpmcUnboundedXaddArrayQueue(int var1, int var2) {
      super(var1, var2);
   }

   public MpmcUnboundedXaddArrayQueue(int var1) {
      this(var1, 2);
   }

   final MpmcUnboundedXaddChunk<E> newChunk(long var1, MpmcUnboundedXaddChunk<E> var3, int var4, boolean var5) {
      return new MpmcUnboundedXaddChunk<>(var1, var3, var4, var5);
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
      MpmcUnboundedXaddChunk var9 = this.lvProducerChunk();
      if (var9.lvIndex() != var7) {
         var9 = this.producerChunkForIndex(var9, var7);
      }

      boolean var10 = var9.isPooled();
      if (var10) {
         var9.spinForElement(var6, true);
      }

      var9.soElement(var6, var1);
      if (var10) {
         var9.soSequence(var6, var7);
      }

      return true;
   }

   @Override
   public E poll() {
      int var1 = this.chunkMask;
      int var2 = this.chunkShift;
      boolean var8 = false;
      Object var9 = null;
      MpmcUnboundedXaddChunk var10 = null;
      long var11 = -1L;

      MpmcUnboundedXaddChunk var5;
      int var6;
      boolean var7;
      long var13;
      while (true) {
         var7 = false;
         long var3 = this.lvConsumerIndex();
         var5 = this.lvConsumerChunk();
         var6 = (int)(var3 & var1);
         var13 = var3 >> var2;
         long var15 = var5.lvIndex();
         if (var6 == 0 && var3 != 0L) {
            if (var13 - var15 == 1L) {
               var7 = true;
               var10 = var5.lvNext();
               if (var10 == null && var3 >= var11 && var3 == (var11 = this.lvProducerIndex())) {
                  return null;
               }

               if (this.casConsumerIndex(var3, var3 + 1L)) {
                  break;
               }
            }
         } else if (var15 <= var13) {
            assert !var7 && var15 <= var13;
            var8 = var5.isPooled();
            if (var15 == var13) {
               if (var8) {
                  long var17 = var5.lvSequence(var6);
                  if (var17 == var13) {
                     if (!this.casConsumerIndex(var3, var3 + 1L)) {
                        continue;
                     }
                     break;
                  }

                  if (var17 > var13) {
                     continue;
                  }
               } else {
                  var9 = var5.lvElement(var6);
                  if (var9 != null) {
                     if (!this.casConsumerIndex(var3, var3 + 1L)) {
                        continue;
                     }
                     break;
                  }
               }
            }

            if (var3 >= var11 && var3 == (var11 = this.lvProducerIndex())) {
               return null;
            }
         }
      }

      if (var7) {
         var9 = this.switchToNextConsumerChunkAndPoll(var5, var10, var13);
      } else {
         if (var8) {
            var9 = var5.lvElement(var6);
         }

         assert !var5.isPooled() || var5.isPooled() && var5.lvSequence(var6) == var13;
         var5.soElement(var6, null);
      }

      return (E)var9;
   }

   private E switchToNextConsumerChunkAndPoll(MpmcUnboundedXaddChunk<E> var1, MpmcUnboundedXaddChunk<E> var2, long var3) {
      if (var2 == null) {
         long var5 = var3 - 1L;
         assert var1.lvIndex() == var5;
         if (this.lvProducerChunkIndex() == var5) {
            var2 = this.appendNextChunks(var1, var5, 1L);
         }
      }

      while (var2 == null) {
         var2 = var1.lvNext();
      }

      Object var7 = var2.spinForElement(0, false);
      boolean var6 = var2.isPooled();
      if (var6) {
         var2.spinForSequence(0, var3);
      }

      var2.soElement(0, null);
      this.moveToNextConsumerChunk(var1, var2);
      return (E)var7;
   }

   @Override
   public E peek() {
      int var1 = this.chunkMask;
      int var2 = this.chunkShift;

      long var3;
      Object var5;
      do {
         var5 = null;
         var3 = this.lvConsumerIndex();
         MpmcUnboundedXaddChunk var6 = this.lvConsumerChunk();
         int var7 = (int)(var3 & var1);
         long var8 = var3 >> var2;
         boolean var10 = var7 == 0 && var3 != 0L;
         if (var10) {
            long var11 = var8 - 1L;
            if (var11 != var6.lvIndex()) {
               continue;
            }

            MpmcUnboundedXaddChunk var13 = var6.lvNext();
            if (var13 == null) {
               continue;
            }

            var6 = var13;
         }

         if (var6.isPooled() ? var6.lvSequence(var7) == var8 : var6.lvIndex() == var8) {
            var5 = var6.lvElement(var7);
         }
      } while (var5 == null && var3 != this.lvProducerIndex() || var5 != null && var3 != this.lvConsumerIndex());

      return (E)var5;
   }

   // $VF: Could not resugar all assert statements!
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public E relaxedPoll() {
      int var1 = this.chunkMask;
      int var2 = this.chunkShift;
      long var3 = this.lvConsumerIndex();
      MpmcUnboundedXaddChunk var5 = this.lvConsumerChunk();
      int var6 = (int)(var3 & var1);
      long var7 = var3 >> var2;
      boolean var9 = var6 == 0 && var3 != 0L;
      if (var9) {
         long var17 = var7 - 1L;
         long var13 = var5.lvIndex();
         MpmcUnboundedXaddChunk var19;
         if (var17 == var13 && (var19 = var5.lvNext()) != null) {
            Object var15 = null;
            boolean var16 = var19.isPooled();
            if (var16) {
               if (var19.lvSequence(0) != var7) {
                  return null;
               }
            } else {
               var15 = var19.lvElement(0);
               if (var15 == null) {
                  return null;
               }
            }

            if (!this.casConsumerIndex(var3, var3 + 1L)) {
               return null;
            }

            if (var16) {
               var15 = var19.lvElement(0);
            }

            assert var15 != null;
            var19.soElement(0, null);
            this.moveToNextConsumerChunk(var5, var19);
            return (E)var15;
         } else {
            return null;
         }
      } else {
         boolean var10 = var5.isPooled();
         Object var11 = null;
         if (var10) {
            long var12 = var5.lvSequence(var6);
            if (var12 != var7) {
               return null;
            }
         } else {
            long var18 = var5.lvIndex();
            if (var18 != var7 || (var11 = var5.lvElement(var6)) == null) {
               return null;
            }
         }

         if (!this.casConsumerIndex(var3, var3 + 1L)) {
            return null;
         }

         if (var10) {
            var11 = var5.lvElement(var6);
            assert var11 != null;
         }

         if ($assertionsDisabled || !var10 || var10 && var5.lvSequence(var6) == var7) {
            var5.soElement(var6, null);
            return (E)var11;
         } else {
            throw new AssertionError();
         }
      }
   }

   @Override
   public E relaxedPeek() {
      int var1 = this.chunkMask;
      int var2 = this.chunkShift;
      long var3 = this.lvConsumerIndex();
      int var5 = (int)(var3 & var1);
      long var6 = var3 >> var2;
      MpmcUnboundedXaddChunk var8 = this.lvConsumerChunk();
      int var9 = var1 + 1;
      boolean var10 = var5 == 0 && var3 >= var9;
      if (var10) {
         long var11 = var6 - 1L;
         if (var11 != var8.lvIndex()) {
            return null;
         }

         MpmcUnboundedXaddChunk var13 = var8.lvNext();
         if (var13 == null) {
            return null;
         }

         var8 = var13;
      }

      if (var8.isPooled()) {
         if (var8.lvSequence(var5) != var6) {
            return null;
         }
      } else if (var8.lvIndex() != var6) {
         return null;
      }

      Object var14 = var8.lvElement(var5);
      return (E)(var3 != this.lvConsumerIndex() ? null : var14);
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
      MpmcUnboundedXaddChunk var7 = null;

      for (int var8 = 0; var8 < var2; var8++) {
         int var9 = (int)(var5 & var4);
         long var10 = var5 >> var3;
         if (var7 == null || var7.lvIndex() != var10) {
            var7 = this.producerChunkForIndex(var7, var10);
            if (var7.isPooled()) {
               var10 = var7.lvIndex();
            }
         }

         if (var7.isPooled()) {
            while (var7.lvElement(var9) != null) {
            }
         }

         var7.soElement(var9, var1.get());
         if (var7.isPooled()) {
            var7.soSequence(var9, var10);
         }

         var5++;
      }

      return var2;
   }
}
