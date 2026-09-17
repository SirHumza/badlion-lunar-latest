package com.github.benmanes.caffeine.cache;

class MpscGrowableArrayQueue<E> extends MpscChunkedArrayQueue<E> {
   MpscGrowableArrayQueue(int var1, int var2) {
      super(var1, var2);
   }

   @Override
   protected int getNextBufferSize(E[] var1) {
      long var2 = this.maxQueueCapacity / 2L;
      if (var1.length > var2) {
         throw new IllegalStateException();
      }

      int var4 = 2 * (var1.length - 1);
      return var4 + 1;
   }

   @Override
   protected long getCurrentBufferCapacity(long var1) {
      return var1 + 2L == this.maxQueueCapacity ? this.maxQueueCapacity : var1;
   }
}
