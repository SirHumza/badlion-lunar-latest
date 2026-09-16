package org.jctools.queues;

import java.util.Arrays;
import org.jctools.util.UnsafeLongArrayAccess;

public final class MpmcUnboundedXaddChunk<E> extends MpUnboundedXaddChunk<MpmcUnboundedXaddChunk<E>, E> {
   private final long[] sequence;

   public MpmcUnboundedXaddChunk(long var1, MpmcUnboundedXaddChunk<E> var3, int var4, boolean var5) {
      super(var1, var3, var4, var5);
      if (var5) {
         this.sequence = UnsafeLongArrayAccess.allocateLongArray(var4);
         Arrays.fill(this.sequence, -1L);
      } else {
         this.sequence = null;
      }
   }

   public void soSequence(int var1, long var2) {
      assert this.isPooled();
      UnsafeLongArrayAccess.soLongElement(this.sequence, UnsafeLongArrayAccess.calcLongElementOffset(var1), var2);
   }

   public long lvSequence(int var1) {
      assert this.isPooled();
      return UnsafeLongArrayAccess.lvLongElement(this.sequence, UnsafeLongArrayAccess.calcLongElementOffset(var1));
   }

   public void spinForSequence(int var1, long var2) {
      assert this.isPooled();
      long[] var4 = this.sequence;
      long var5 = UnsafeLongArrayAccess.calcLongElementOffset(var1);

      while (UnsafeLongArrayAccess.lvLongElement(var4, var5) != var2) {
      }
   }
}
