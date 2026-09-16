package org.jctools.queues.unpadded;

import org.jctools.util.UnsafeLongArrayAccess;

public abstract class ConcurrentSequencedCircularUnpaddedArrayQueue<E> extends ConcurrentCircularUnpaddedArrayQueue<E> {
   protected final long[] sequenceBuffer;

   public ConcurrentSequencedCircularUnpaddedArrayQueue(int var1) {
      super(var1);
      int var2 = (int)(this.mask + 1L);
      this.sequenceBuffer = UnsafeLongArrayAccess.allocateLongArray(var2);

      for (long var3 = 0L; var3 < var2; var3++) {
         UnsafeLongArrayAccess.soLongElement(this.sequenceBuffer, UnsafeLongArrayAccess.calcCircularLongElementOffset(var3, this.mask), var3);
      }
   }
}
