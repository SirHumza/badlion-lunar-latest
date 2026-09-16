package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicLongArray;

abstract class SequencedAtomicReferenceArrayQueue<E> extends AtomicReferenceArrayQueue<E> {
   protected final AtomicLongArray sequenceBuffer;

   public SequencedAtomicReferenceArrayQueue(int var1) {
      super(var1);
      int var2 = this.mask + 1;
      this.sequenceBuffer = new AtomicLongArray(var2);

      for (int var3 = 0; var3 < var2; var3++) {
         this.soSequence(this.sequenceBuffer, var3, var3);
      }
   }

   protected final long calcSequenceOffset(long var1) {
      return calcSequenceOffset(var1, this.mask);
   }

   protected static int calcSequenceOffset(long var0, int var2) {
      return (int)var0 & var2;
   }

   protected final void soSequence(AtomicLongArray var1, int var2, long var3) {
      var1.lazySet(var2, var3);
   }

   protected final long lvSequence(AtomicLongArray var1, int var2) {
      return var1.get(var2);
   }
}
