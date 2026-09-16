package org.jctools.queues;

public final class MpscUnboundedXaddChunk<E> extends MpUnboundedXaddChunk<MpscUnboundedXaddChunk<E>, E> {
   public MpscUnboundedXaddChunk(long var1, MpscUnboundedXaddChunk<E> var3, int var4, boolean var5) {
      super(var1, var3, var4, var5);
   }
}
