package org.jctools.queues;

import org.jctools.util.UnsafeLongArrayAccess;

public abstract class ConcurrentSequencedCircularArrayQueue<E> extends ConcurrentCircularArrayQueue<E> {
   protected final long[] sequenceBuffer;

   public ConcurrentSequencedCircularArrayQueue(int var1) {
      super(var1);
      int var2 = (int)(this.mask + 1L);
      this.sequenceBuffer = UnsafeLongArrayAccess.allocateLongArray(var2);

      for (long var3 = 0L; var3 < var2; var3++) {
         UnsafeLongArrayAccess.soLongElement(this.sequenceBuffer, UnsafeLongArrayAccess.calcCircularLongElementOffset(var3, this.mask), var3);
      }
   }
}
